package cursedbread.morefeatures.item.tool;

import cursedbread.morefeatures.item.FeaturesItems;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.entity.Mob;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tool.ItemToolPickaxe;
import net.minecraft.core.util.helper.Direction;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public class ItemToolMiningHammer extends ItemToolPickaxe {
	public ItemToolMiningHammer(String name, String namespaceId, int id, ToolMaterial enumtoolmaterial) {
		super(name, namespaceId, id, enumtoolmaterial);
	}

	List<Integer> BlockHammersBlacklist = Arrays.asList(
		Blocks.BEDROCK.id(),
		Blocks.FLUID_LAVA_FLOWING.id(),
		Blocks.FLUID_LAVA_STILL.id(),
		Blocks.FLUID_WATER_FLOWING.id(),
		Blocks.FLUID_WATER_STILL.id()
	);

	private static boolean isBlockMatchToBlacklist(int BlockId, List<Integer> list) {
		boolean BlockMatchToBlacklist;
		BlockMatchToBlacklist = list.contains(BlockId);
		return BlockMatchToBlacklist;
	}

	protected void MineBlock(int x, int y, int z, World world, Mob mob) {
		Item GoldItem = FeaturesItems.mining_Hammer_Gold;
		Item heldItem = Objects.requireNonNull(mob.getHeldItem()).getItem();
		if (!world.isClientSide) {
			if (world.getBlock(x, y, z) != null && !isBlockMatchToBlacklist(world.getBlock(x, y, z).id(), BlockHammersBlacklist)){
				if (world.getBlock(x, y, z) != null)
					if (!heldItem.equals(GoldItem)) {
						ItemStack[] itemToDrop = Objects.requireNonNull(world.getBlock(x, y, z)).getBreakResult(world, EnumDropCause.PROPER_TOOL, x, y, z, world.getBlockMetadata(x, y, z), world.getTileEntity(x, y, z));
						world.setBlockWithNotify(x, y, z, 0);
						if (itemToDrop != null) {
							Arrays.stream(itemToDrop).filter(Objects::nonNull).forEach(expDrop -> world.dropItem(x, y, z, expDrop));
						}
					} else {
						ItemStack[] itemToDrop = Objects.requireNonNull(world.getBlock(x, y, z)).getBreakResult(world, EnumDropCause.SILK_TOUCH, x, y, z, world.getBlockMetadata(x, y, z), world.getTileEntity(x, y, z));
						world.setBlockWithNotify(x, y, z, 0);
						if (itemToDrop != null) {
							Arrays.stream(itemToDrop).filter(Objects::nonNull).forEach(expDrop -> world.dropItem(x, y, z, expDrop));
						}
					}
			}
		}
	}

	public boolean onBlockDestroyed(World world, ItemStack itemstack, int i, int j, int k, int l, Side side, Mob mob) {
		super.onBlockDestroyed(world, itemstack, i, j, k, l, side, mob);
		int Off1, Off2;
		switch(Direction.getDirection(mob)){
			case SOUTH:
			case NORTH:
				for (Off1 = -1; Off1 <= 1; Off1++) {
					for (Off2 = -1; Off2 <= 1; Off2++) {
						this.MineBlock(j + Off1, k + Off2, l, world, mob);
					}
				}
				break;
			case EAST:
			case WEST:
				for (Off1 = -1; Off1 <= 1; Off1++) {
					for (Off2 = -1; Off2 <= 1; Off2++) {
						this.MineBlock(j  , k + Off2, l + Off1, world,mob);
					}
				}
				break;
			case DOWN:
			case UP:
				for (Off1 = -1; Off1 <= 1; Off1++) {
					for (Off2 = -1; Off2 <= 1; Off2++) {
						this.MineBlock(j + Off1, k  , l+ Off2, world,mob);
					}
				}
				break;
		}
		return true;
	}
}
