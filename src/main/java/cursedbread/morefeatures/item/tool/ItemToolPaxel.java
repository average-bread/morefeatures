package cursedbread.morefeatures.item.tool;

import cursedbread.morefeatures.item.FeaturesItems;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicLog;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.data.gamerule.GameRules;
import net.minecraft.core.data.gamerule.TreecapitatorHelper;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.Mob;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.enums.EnumBlockSoundEffectType;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;

public class ItemToolPaxel extends Item {
	private int weaponDamage;
	private ToolMaterial material;

	public static Map<Block, Integer> miningLevels = new HashMap();

	public ItemToolPaxel(String name, String namespaceID, int id, ToolMaterial enumtoolmaterial) {
		super(name, namespaceID, id);
		this.maxStackSize = 1;
		this.setMaxDamage(enumtoolmaterial.getDurability());
		this.weaponDamage = 4 + enumtoolmaterial.getDamage() * 2;
		this.material = enumtoolmaterial;
	}

	public boolean canHarvestBlock(Mob entityLiving, ItemStack itemStack, Block block) {
		Integer miningLevel = (Integer)miningLevels.get(block);
		if (miningLevel != null) {
			return this.material.getMiningLevel() >= miningLevel;
		} else {
			return block.hasTag(BlockTags.MINEABLE_BY_SWORD) || block.hasTag(BlockTags.MINEABLE_BY_AXE) || block.hasTag(BlockTags.MINEABLE_BY_PICKAXE) || block.hasTag(BlockTags.MINEABLE_BY_SHOVEL) || block.hasTag(BlockTags.MINEABLE_BY_HOE);
		}
	}

	//sword
	public float getStrVsBlock(ItemStack itemstack, Block block) {
		return block.hasTag(BlockTags.MINEABLE_BY_SWORD) || block.hasTag(BlockTags.MINEABLE_BY_AXE) || block.hasTag(BlockTags.MINEABLE_BY_PICKAXE) || block.hasTag(BlockTags.MINEABLE_BY_SHOVEL) || block.hasTag(BlockTags.MINEABLE_BY_HOE) ? this.material.getEfficiency(false) : 1.0F;
	}

	public boolean hitEntity(ItemStack itemstack, Mob entityliving, Mob entityliving1) {
		itemstack.damageItem(1, entityliving1);
		return true;
	}

	public boolean onBlockDestroyed(World world, ItemStack itemstack, int i, int j, int k, int l, Side side, Mob entityliving) {
		Block block = Blocks.blocksList[i];
		if (block != null && (block.getHardness() > 0.0F || this.isSilkTouch())) {
			itemstack.damageItem(1, entityliving);
		}
		return true;
	}

	public int getDamageVsEntity(Entity entity, ItemStack is) {
		return this.weaponDamage;
	}

	public boolean isSilkTouch() {
		return this.material.isSilkTouch();
	}

	//axe
	public boolean beforeDestroyBlock(World world, ItemStack itemStack, int blockId, int x, int y, int z, Side side, Player player) {
		if (!world.isClientSide && (Boolean)world.getGameRuleValue(GameRules.TREECAPITATOR) && !player.isSneaking()) {
			int id = world.getBlockId(x, y, z);
			if (Block.hasLogicClass(Blocks.getBlock(id), BlockLogicLog.class)) {
				return !(new TreecapitatorHelper(world, x, y, z, player)).chopTree();
			}
		}
		return true;
	}

	//pickaxe
	static {
		miningLevels.put(Blocks.OBSIDIAN, 3);
		miningLevels.put(Blocks.BLOCK_DIAMOND, 2);
		miningLevels.put(Blocks.ORE_DIAMOND_STONE, 2);
		miningLevels.put(Blocks.ORE_DIAMOND_BASALT, 2);
		miningLevels.put(Blocks.ORE_DIAMOND_GRANITE, 2);
		miningLevels.put(Blocks.ORE_DIAMOND_LIMESTONE, 2);
		miningLevels.put(Blocks.BLOCK_GOLD, 2);
		miningLevels.put(Blocks.ORE_GOLD_STONE, 2);
		miningLevels.put(Blocks.ORE_GOLD_BASALT, 2);
		miningLevels.put(Blocks.ORE_GOLD_GRANITE, 2);
		miningLevels.put(Blocks.ORE_GOLD_LIMESTONE, 2);
		miningLevels.put(Blocks.BLOCK_IRON, 1);
		miningLevels.put(Blocks.ORE_IRON_STONE, 1);
		miningLevels.put(Blocks.ORE_IRON_BASALT, 1);
		miningLevels.put(Blocks.ORE_IRON_GRANITE, 1);
		miningLevels.put(Blocks.ORE_IRON_LIMESTONE, 1);
		miningLevels.put(Blocks.BLOCK_STEEL, 2);
		miningLevels.put(Blocks.ORE_NETHERCOAL_NETHERRACK, 2);
		miningLevels.put(Blocks.BLOCK_LAPIS, 1);
		miningLevels.put(Blocks.ORE_LAPIS_STONE, 1);
		miningLevels.put(Blocks.ORE_LAPIS_BASALT, 1);
		miningLevels.put(Blocks.ORE_LAPIS_GRANITE, 1);
		miningLevels.put(Blocks.ORE_LAPIS_LIMESTONE, 1);
		miningLevels.put(Blocks.BLOCK_REDSTONE, 2);
		miningLevels.put(Blocks.ORE_REDSTONE_STONE, 2);
		miningLevels.put(Blocks.ORE_REDSTONE_BASALT, 2);
		miningLevels.put(Blocks.ORE_REDSTONE_GRANITE, 2);
		miningLevels.put(Blocks.ORE_REDSTONE_LIMESTONE, 2);
		miningLevels.put(Blocks.ORE_REDSTONE_GLOWING_STONE, 2);
		miningLevels.put(Blocks.ORE_REDSTONE_GLOWING_BASALT, 2);
		miningLevels.put(Blocks.ORE_REDSTONE_GLOWING_GRANITE, 2);
		miningLevels.put(Blocks.ORE_REDSTONE_GLOWING_LIMESTONE, 2);
	}

	//shovel and hoe
	public boolean onUseItemOnBlock(ItemStack itemstack, Player entityplayer, World world, int blockX, int blockY, int blockZ, Side side, double xPlaced, double yPlaced) {
		int i1 = world.getBlockId(blockX, blockY, blockZ);
		int j1 = world.getBlockId(blockX, blockY + 1, blockZ);
		if (side != Side.BOTTOM && j1 == 0 && (i1 == Blocks.GRASS.id() || i1 == Blocks.DIRT.id() || i1 == Blocks.GRASS_RETRO.id() || i1 == Blocks.PATH_DIRT.id() || i1 == Blocks.MUD.id())) {
			if (entityplayer.isSneaking()){
				this.till(itemstack, entityplayer, world, blockX, blockY, blockZ, side);
			} else if (side != Side.BOTTOM && j1 == 0 && (i1 == Blocks.GRASS.id() || i1 == Blocks.DIRT.id() || i1 == Blocks.GRASS_RETRO.id() || i1 == Blocks.FARMLAND_DIRT.id())) {
				Block block = Blocks.PATH_DIRT;
				world.playBlockSoundEffect(entityplayer, (double)((float)blockX + 0.5F), (double)((float)blockY + 0.5F), (double)((float)blockZ + 0.5F), Blocks.blocksList[i1], EnumBlockSoundEffectType.PLACE);
				if (!world.isClientSide) {
					world.setBlockWithNotify(blockX, blockY, blockZ, block.id());
					itemstack.damageItem(1, entityplayer);
				}
			}
			return true;
		} else {
			return false;
		}
	}

	public boolean till(ItemStack itemstack, @Nullable Player player, World world, int blockX, int blockY, int blockZ, Side side) {
		int id = world.getBlockId(blockX, blockY, blockZ);
		int j1 = world.getBlockId(blockX, blockY + 1, blockZ);
		if (side == Side.BOTTOM || j1 != 0 || id != Blocks.GRASS.id() && id != Blocks.DIRT.id() && id != Blocks.PATH_DIRT.id() && id != Blocks.GRASS_RETRO.id() && id != Blocks.MUD.id()) {
			return false;
		} else {
			int meta = 0;
			if (id == Blocks.MUD.id()) {
				meta = 1;
			}

			world.playBlockSoundEffect(player, (double)((float)blockX + 0.5F), (double)((float)blockY + 0.5F), (double)((float)blockZ + 0.5F), Blocks.DIRT, EnumBlockSoundEffectType.MINE);
			if (!world.isClientSide && (id == Blocks.GRASS.id() || id == Blocks.GRASS_RETRO.id() || id == Blocks.GRASS_SCORCHED.id()) && world.rand.nextInt(5) == 0) {
				world.dropItem(blockX, blockY + 1, blockZ, new ItemStack(FeaturesItems.fluxSeed));
			}

			if (world.isClientSide) {
				return true;
			} else {
				world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, Blocks.FARMLAND_DIRT.id(), meta);
				itemstack.damageItem(1, player);
				return true;
			}
		}
	}
}
