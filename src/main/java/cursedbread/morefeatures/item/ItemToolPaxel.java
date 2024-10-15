package cursedbread.morefeatures.item;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLog;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.data.gamerule.GameRules;
import net.minecraft.core.data.gamerule.TreecapitatorHelper;
import net.minecraft.core.data.tag.Tag;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.EntityLiving;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.enums.EnumBlockSoundEffectType;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tool.ItemToolSword;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

import java.util.HashMap;
import java.util.Map;

public class ItemToolPaxel extends Item {
	private int weaponDamage;
	private ToolMaterial material;

	public static Map<Block, Integer> miningLevels = new HashMap();

	public ItemToolPaxel(String name, int id, ToolMaterial enumtoolmaterial) {
		super(name, id);
		this.maxStackSize = 1;
		this.setMaxDamage(enumtoolmaterial.getDurability());
		this.weaponDamage = 4 + enumtoolmaterial.getDamage() * 2;
		this.material = enumtoolmaterial;
	}

	public boolean canHarvestBlock(EntityLiving entityLiving, ItemStack itemStack, Block block) {
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

	public boolean hitEntity(ItemStack itemstack, EntityLiving entityliving, EntityLiving entityliving1) {
		itemstack.damageItem(1, entityliving1);
		return true;
	}

	public boolean onBlockDestroyed(World world, ItemStack itemstack, int i, int j, int k, int l, EntityLiving entityliving) {
		Block block = Block.blocksList[i];
		if (block != null && (block.getHardness() > 0.0F || this.isSilkTouch())) {
			itemstack.damageItem(2, entityliving);
		}

		return true;
	}

	public int getDamageVsEntity(Entity entity) {
		return this.weaponDamage;
	}

	public boolean isSilkTouch() {
		return this.material.isSilkTouch();
	}

	//axe
	public boolean beforeDestroyBlock(World world, ItemStack itemStack, int x, int y, int z, EntityPlayer player) {
		if (!world.isClientSide && (Boolean)world.getGameRuleValue(GameRules.TREECAPITATOR) && !player.isSneaking()) {
			int id = world.getBlockId(x, y, z);
			if (Block.getBlock(id) instanceof BlockLog) {
				return !(new TreecapitatorHelper(world, x, y, z, player)).chopTree();
			}
		}

		return true;
	}

	//pickaxe
	static {
		miningLevels.put(Block.obsidian, 3);
		miningLevels.put(Block.blockDiamond, 2);
		miningLevels.put(Block.oreDiamondStone, 2);
		miningLevels.put(Block.oreDiamondBasalt, 2);
		miningLevels.put(Block.oreDiamondGranite, 2);
		miningLevels.put(Block.oreDiamondLimestone, 2);
		miningLevels.put(Block.blockGold, 2);
		miningLevels.put(Block.oreGoldStone, 2);
		miningLevels.put(Block.oreGoldBasalt, 2);
		miningLevels.put(Block.oreGoldGranite, 2);
		miningLevels.put(Block.oreGoldLimestone, 2);
		miningLevels.put(Block.blockIron, 1);
		miningLevels.put(Block.oreIronStone, 1);
		miningLevels.put(Block.oreIronBasalt, 1);
		miningLevels.put(Block.oreIronGranite, 1);
		miningLevels.put(Block.oreIronLimestone, 1);
		miningLevels.put(Block.blockSteel, 2);
		miningLevels.put(Block.oreNethercoalNetherrack, 2);
		miningLevels.put(Block.blockLapis, 1);
		miningLevels.put(Block.oreLapisStone, 1);
		miningLevels.put(Block.oreLapisBasalt, 1);
		miningLevels.put(Block.oreLapisGranite, 1);
		miningLevels.put(Block.oreLapisLimestone, 1);
		miningLevels.put(Block.blockRedstone, 2);
		miningLevels.put(Block.oreRedstoneStone, 2);
		miningLevels.put(Block.oreRedstoneBasalt, 2);
		miningLevels.put(Block.oreRedstoneGranite, 2);
		miningLevels.put(Block.oreRedstoneLimestone, 2);
		miningLevels.put(Block.oreRedstoneGlowingStone, 2);
		miningLevels.put(Block.oreRedstoneGlowingBasalt, 2);
		miningLevels.put(Block.oreRedstoneGlowingGranite, 2);
		miningLevels.put(Block.oreRedstoneGlowingLimestone, 2);
	}

	//shovel
	public boolean onUseItemOnBlock(ItemStack itemstack, EntityPlayer entityplayer, World world, int blockX, int blockY, int blockZ, Side side, double xPlaced, double yPlaced) {
		int i1 = world.getBlockId(blockX, blockY, blockZ);
		int j1 = world.getBlockId(blockX, blockY + 1, blockZ);
		if (side != Side.BOTTOM && j1 == 0 && (i1 == Block.grass.id || i1 == Block.dirt.id || i1 == Block.grassRetro.id || i1 == Block.farmlandDirt.id)) {
			Block block = Block.pathDirt;
			world.playBlockSoundEffect(entityplayer, (double)((float)blockX + 0.5F), (double)((float)blockY + 0.5F), (double)((float)blockZ + 0.5F), Block.blocksList[i1], EnumBlockSoundEffectType.PLACE);
			if (!world.isClientSide) {
				world.setBlockWithNotify(blockX, blockY, blockZ, block.id);
				itemstack.damageItem(1, entityplayer);
			}

			return true;
		} else {
			return false;
		}
	}

	//hoe

}
