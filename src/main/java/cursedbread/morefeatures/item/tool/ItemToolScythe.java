package cursedbread.morefeatures.item.tool;

import cursedbread.morefeatures.blocks.FeaturesBlocks;
import cursedbread.morefeatures.item.FeaturesItems;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.entity.TileEntityActivator;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.entity.Mob;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.enums.EnumBlockSoundEffectType;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tool.ItemTool;
import net.minecraft.core.item.tool.ItemToolHoe;
import net.minecraft.core.util.helper.Direction;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class ItemToolScythe extends ItemTool {
	boolean tilled;
	public ItemToolScythe(String name, String namespaceId, int id, ToolMaterial enumtoolmaterial) {
		super(name, namespaceId, id,4 + enumtoolmaterial.getDamage() * 2, enumtoolmaterial, BlockTags.MINEABLE_BY_HOE);
	}

	public boolean canHarvestBlock(Mob mob, ItemStack itemStack, Block<?> block) {
		return block.hasTag(BlockTags.MINEABLE_BY_HOE);
	}

	public boolean onUseItemOnBlock(ItemStack itemstack, Player player, World world, int blockX, int blockY, int blockZ, Side side, double xPlaced, double yPlaced) {
		return this.till(itemstack, player, world, blockX, blockY, blockZ, side);
	}

	public boolean till(ItemStack itemstack, @Nullable Player player, World world, int blockX, int blockY, int blockZ, Side side) {
		for (int addx = -1; addx < 2; addx++){
			for (int addz = -1; addz < 2; addz++){
				int id2 = world.getBlockId(blockX + addx, blockY, blockZ + addz);
				int j1 = world.getBlockId(blockX + addx, blockY+1, blockZ + addz);
				tilled = false;
				if (side != Side.BOTTOM || j1 == 0) {
					if ((id2 == Blocks.GRASS.id() ||
						id2 == Blocks.DIRT.id() ||
						id2 == Blocks.PATH_DIRT.id() ||
						id2 == Blocks.GRASS_RETRO.id())) {
						int meta = 0;
						if (id2 == Blocks.MUD.id()){
							meta = 1;
						}
						world.playBlockSoundEffect(player, (double)((float)blockX + 0.5F), (double)((float)blockY + 0.5F), (double)((float)blockZ + 0.5F), Blocks.DIRT, EnumBlockSoundEffectType.MINE);
						if (!world.isClientSide && (id2 == Blocks.GRASS.id() ||
							id2 == Blocks.GRASS_RETRO.id() ||
							id2 == Blocks.GRASS_SCORCHED.id()) && world.rand.nextInt(5) == 0) {
							world.dropItem(blockX + addx, blockY+1, blockZ + addz, new ItemStack(Items.SEEDS_WHEAT));
						}
						world.setBlockAndMetadataWithNotify(blockX + addx, blockY, blockZ + addz, Blocks.FARMLAND_DIRT.id(), meta);
						tilled = true;
					}
				} else {
					tilled = false;
					return false;
				}
			}
		}
		if (tilled){
			itemstack.damageItem(1, player);
		}
		return true;
	}

	public void onUseByActivator(ItemStack itemStack, TileEntityActivator activatorBlock, World world, Random random, int blockX, int blockY, int blockZ, double offX, double offY, double offZ, Direction direction) {
		this.till(itemStack, (Player)null, world, blockX + direction.getOffsetX(), blockY + direction.getOffsetY(), blockZ + direction.getOffsetZ(), direction.getSide());
	}

	public boolean onBlockDestroyed(World world, ItemStack itemstack, int id, int x, int y, int z, Side side, Mob mob) {
		for (int addx = -1; addx < 2; addx++){
			for (int addz = -1; addz < 2; addz++){
				if (mob != null && !mob.world.isClientSide && (world.getBlockId(x + addx, y, z + addz) == Blocks.TALLGRASS.id() ||
					world.getBlockId(x + addx, y, z + addz) == Blocks.TALLGRASS_FERN.id())) {
					if (this.material.isSilkTouch()) {
						mob.world.dropItem(x + addx, y, z + addz, new ItemStack(Item.itemsList[id]));
					} else if (mob.world.rand.nextInt(4) == 0) {
						mob.world.dropItem(x + addx, y, z + addz, new ItemStack(Items.SEEDS_WHEAT));
					}
					world.setBlock(x+ addx, y, z + addz, 0);
				}
				if (mob != null && !mob.world.isClientSide && world.getBlockMetadata(x + addx, y, z + addz) == 7 && (world.getBlockId(x + addx, y, z + addz) == Blocks.CROPS_WHEAT.id() ||
					world.getBlockId(x + addx, y, z + addz) == FeaturesBlocks.flux_Cropws.id())) {
					ItemStack[] itemToDrop = Objects.requireNonNull(world.getBlock(x + addx, y, z + addz)).getBreakResult(world, EnumDropCause.PROPER_TOOL, x + addx, y, z + addz, world.getBlockMetadata(x + addx, y, z + addz), world.getTileEntity(x + addx, y, z + addz));
					Arrays.stream(itemToDrop).filter(Objects::nonNull).forEach(expDrop -> world.dropItem(x, y, z, expDrop));
					world.setBlock(x+ addx, y, z + addz, 0);
				}
			}
		}
		itemstack.damageItem(1, mob);
		return super.onBlockDestroyed(world, itemstack, id, x, y, z, side, mob);
	}
}
