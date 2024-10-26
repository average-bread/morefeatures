package cursedbread.morefeatures.blocks;

import cursedbread.morefeatures.FeaturesMain;
import cursedbread.morefeatures.blocks.glass.*;
import cursedbread.morefeatures.blocks.glowstone.*;
import cursedbread.morefeatures.blocks.ores.*;
import cursedbread.morefeatures.blocks.other.BlockGilder;
import cursedbread.morefeatures.blocks.other.BlockHam;
import cursedbread.morefeatures.blocks.paperwall.*;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockFlower;
import net.minecraft.core.block.BlockOreCoal;
import net.minecraft.core.block.BlockOreRedstone;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.block.ItemBlockPainted;
import net.minecraft.core.sound.BlockSound;
import net.minecraft.core.sound.BlockSounds;
import net.minecraft.client.render.block.model.*;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.helper.CreativeHelper;

import static cursedbread.morefeatures.FeaturesMain.MOD_ID;

public class FeaturesBlocks {

	public static BlockBuilder fullBlock = new BlockBuilder(MOD_ID);

	public static BlockBuilder crossedBlock = new BlockBuilder(MOD_ID)
		.setBlockModel(block -> new BlockModelCrossedSquares(block));

	public static final BlockBuilder coloredglass = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "random.glass", 1.0f, 1.0f))
		.setHardness(0.3F)
		.setResistance(0.3F)
		.setVisualUpdateOnMetadata()
		.setUseInternalLight();
	public static final BlockBuilder coloredglasstrapdoors = new BlockBuilder(MOD_ID)
	    .setBlockModel(block -> new BlockModelTrapDoor(block))
		.setBlockSound(new BlockSound("step.stone", "random.glass", 1.0f, 1.0f))
		.setHardness(0.3F)
		.setResistance(0.3F)
		.setVisualUpdateOnMetadata()
		.setUseInternalLight();
	public static BlockBuilder glowstoneBlock = new BlockBuilder(MOD_ID)
		.setLuminance(15)
		.setBlockSound(new BlockSound("step.stone", "random.glass", 1.0f, 1.0f))
		.setHardness(0.5f);

	public static BlockBuilder paperwallBlock = new BlockBuilder(MOD_ID)
		.setBlockSound(BlockSounds.CLOTH)
		.setHardness(0.5f);

	public static int blockId;

	public static Block vanillaColoredGlowstone;
	public static Block nonameColoredGlowstone;
	public static int glowstoneEnabled;
	public static Block vanillaColoredPaperwall;
	public static Block nonameColoredPaperwall;

	public static int paperwallEnabled;

	public static Block gildingTable;

	public static int gildingtableEnabled;

	public static Block vanillaColoredGlass;
	public static Block vanillaColoredGlassTrapdoor;
	public static Block nonameColoredGlass;
	public static Block nonameColoredGlassTrapdoor;
	public static int glassEnabled;

	public static Block rainbowFlower;
	public static int rainbowflowerEnabled;
	public static int rainbowFlowerChance;

	public static Block ham;
	public static Block cookedham;
	public static int hamEnabled;

	public static int superoresEnabled;
	public static Block superCoalStoneOre;
	public static Block superCoalBasaltOre;
	public static Block superCoalLimestoneOre;
	public static Block superCoalGraniteOre;

	public static Block superIronStoneOre;
	public static Block superIronBasaltOre;
	public static Block superIronLimestoneOre;
	public static Block superIronGraniteOre;

	public static Block superGoldStoneOre;
	public static Block superGoldBasaltOre;
	public static Block superGoldLimestoneOre;
	public static Block superGoldGraniteOre;

	public static Block superLapisStoneOre;
	public static Block superLapisBasaltOre;
	public static Block superLapisLimestoneOre;
	public static Block superLapisGraniteOre;

	public static Block superRedstoneStoneOre;
	public static Block superRedstoneBasaltOre;
	public static Block superRedstoneLimestoneOre;
	public static Block superRedstoneGraniteOre;

	public static Block superRedstoneGlowingStoneOre;
	public static Block superRedstoneGlowingBasaltOre;
	public static Block superRedstoneGlowingLimestoneOre;
	public static Block superRedstoneGlowingGraniteOre;

	public static Block superDiamondStoneOre;
	public static Block superDiamondBasaltOre;
	public static Block superDiamondLimestoneOre;
	public static Block superDiamondGraniteOre;

	public static Block superNetherCoalOre;

	public static Block redFire;
	public static int redFireEnabled;

	private void initializeBlockDetails() {
		if (glowstoneEnabled == 1) {
			Item.itemsList[vanillaColoredGlowstone.id] = new ItemBlockPainted(vanillaColoredGlowstone, false);
			for (int color = 2; color < 17; color++) {
				CreativeHelper.setParent(vanillaColoredGlowstone, color - 1, vanillaColoredGlowstone, color);
			}
			if (FeaturesMain.nonamedyesOn == true) {
				Item.itemsList[nonameColoredGlowstone.id] = new ItemBlockPainted(nonameColoredGlowstone, false);
				for (int color = 2; color < 15; color++) {
					CreativeHelper.setParent(nonameColoredGlowstone, color - 1, nonameColoredGlowstone, color);
				}
			}
		}
		if (paperwallEnabled == 1) {
			Item.itemsList[vanillaColoredPaperwall.id] = new ItemBlockPainted(vanillaColoredPaperwall, false);
			for (int color = 2; color < 17; color++) {
				CreativeHelper.setParent(vanillaColoredPaperwall, color - 1, vanillaColoredPaperwall, 0);
			}
			if (FeaturesMain.nonamedyesOn == true) {
				Item.itemsList[nonameColoredPaperwall.id] = new ItemBlockPainted(nonameColoredPaperwall, false);
				for (int color = 2; color < 15; color++) {
					CreativeHelper.setParent(nonameColoredPaperwall, color - 1, nonameColoredPaperwall, color);
				}
			}
		}
		if (glassEnabled == 1) {
			Item.itemsList[vanillaColoredGlass.id] = new ItemBlockPainted(vanillaColoredGlass, false);
			for (int color = 2; color < 17; color++) {
				CreativeHelper.setParent(vanillaColoredGlass, color - 1, vanillaColoredGlass, color);
			}
			if (FeaturesMain.nonamedyesOn == true) {
				Item.itemsList[nonameColoredGlass.id] = new ItemBlockPainted(nonameColoredGlass, false);
				for (int color = 2; color < 15; color++) {
					CreativeHelper.setParent(nonameColoredGlass, color - 1, nonameColoredGlass, color);
				}
			}
			/*Item.itemsList[vanillaColoredGlassTrapdoor.id] = new ItemBlockPainted(vanillaColoredGlassTrapdoor, false);
			for (int color = 2; color < 17; color++) {
				CreativeHelper.setParent(vanillaColoredGlassTrapdoor, color - 1, vanillaColoredGlassTrapdoor, color);
			}
			if (FeaturesMain.nonamedyesOn) {
				Item.itemsList[nonameColoredGlassTrapdoor.id] = new ItemBlockPainted(nonameColoredGlassTrapdoor, false);
				for (int color = 2; color < 14; color++) {
					CreativeHelper.setParent(nonameColoredGlassTrapdoor, color - 1, nonameColoredGlassTrapdoor, color);
				}
			}*/
		}
	}

	public void initilizeBlocks() {
		if (glowstoneEnabled == 1) {
			vanillaColoredGlowstone = glowstoneBlock
				.setItemBlock(block -> new ItemBlockPainted(block, false))
				.setBlockModel(block -> new BlockModelColoredGlowstone(block, false))
				.build(new BlockColoredGlowstone("vanilla.colored.glowstone", blockId++, Material.glass));
			if (FeaturesMain.nonamedyesOn == true) {
				nonameColoredGlowstone = glowstoneBlock
					.setItemBlock(block -> new ItemBlockPainted(block, false))
 				    .setBlockModel(block -> new BlockModelColoredGlowstone(block, true))
					.build(new BlockColoredGlowstone("noname.colored.glowstone", blockId++, Material.glass));
			}
		}
		if (paperwallEnabled == 1) {
		    vanillaColoredPaperwall = paperwallBlock
		        .setItemBlock(block -> new ItemBlockPainted(block, false))
		        .setBlockModel(block -> new BlockModelPaperwall(block, FeaturesMain.paperWallAlt, false))
		        .build(new BlockPaperwall("vanilla.paperwall", blockId++, Material.wood));
			if (FeaturesMain.nonamedyesOn) {
    		    nonameColoredPaperwall = paperwallBlock
    		        .setItemBlock(block -> new ItemBlockPainted(block, false))
    		        .setBlockModel(block -> new BlockModelPaperwall(block, FeaturesMain.paperWallAlt, true))
    		        .build(new BlockPaperwall("noname.paperwall", blockId++, Material.wood));
			}
		}
		if (glassEnabled == 1) {
			vanillaColoredGlass = coloredglass
				.setItemBlock(block -> new ItemBlockPainted(block, false))
				.setBlockModel(block -> new BlockModelColoredGlass(block, false))
				.build(new BlockColoredGlass("vanilla.colored.glass", blockId++, Material.glass));
			if (FeaturesMain.nonamedyesOn == true) {
				nonameColoredGlass = coloredglass
					.setItemBlock(block -> new ItemBlockPainted(block, false))
    				.setBlockModel(block -> new BlockModelColoredGlass(block, true))
					.build(new BlockColoredGlass("noname.colored.glass", blockId++, Material.glass));
			}
			/*vanillaColoredGlassTrapdoor = coloredglasstrapdoors
				.setItemBlock(block -> new ItemBlockPainted(block, false))
				.build(new VanilaBlockColoredGlassTrapdoor("vanilla.colored.glass", blockId++, Material.glass));
			if (FeaturesMain.nonamedyesOn) {
				nonameColoredGlassTrapdoor = coloredglasstrapdoors
					.setItemBlock(block -> new ItemBlockPainted(block, false))
					.build(new NonameBlockColoredGlassTrapdoor("noname.colored.glasstrapdoor", blockId++, Material.glass));
			}*/
		}

		if (gildingtableEnabled == 1) {
			gildingTable = fullBlock
			    .setBlockModel(
    		        block -> new BlockModelStandard(block)
           				.withTextures("minecraft:block/block_gold_top", "minecraft:block/block_gold_bottom", "morefeatures:block/extra_block_gilding_table")
			    )
				.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT)
				.setHardness(5f)
				.build(new BlockGilder("gilder", blockId++));
		}

		if (rainbowflowerEnabled == 1) {
			rainbowFlower = crossedBlock
				.setTextures("morefeatures:block/extra_block_rainbow_flower")
				.setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
				.build(new BlockFlower("flower.rainbow", blockId++));
		}

		if (hamEnabled == 1) {
			ham = fullBlock
				.setBlockModel(block -> new BlockModelStandard(block)
					.withTextures("morefeatures:block/extra_block_ham_block")
				)
				.setTags(BlockTags.FENCES_CONNECT, BlockTags.MINEABLE_BY_SWORD)
				.setHardness(0.1f)
				.build(new BlockHam("ham", blockId++, Material.stone));

			cookedham = fullBlock
				.setBlockModel(block -> new BlockModelStandard(block)
					.withTextures("morefeatures:block/extra_block_ham_cooked_block")
				)
				.setTags(BlockTags.FENCES_CONNECT, BlockTags.MINEABLE_BY_SWORD)
				.setHardness(0.1f)
				.build(new Block("cookedham", blockId++, Material.stone));
		}

		if (superoresEnabled == 1) {
			superCoalStoneOre = fullBlock
				.setBlockModel(block -> new BlockModelStandard(block).withTextures("morefeatures:block/ores/superore_coal_stone"))
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build(new BlockSuperOreCoal("superore.coal.stone", blockId++)).withBlastResistance(5.0F);
			superCoalBasaltOre = fullBlock
				.setBlockModel(block -> new BlockModelStandard(block).withTextures("morefeatures:block/ores/superore_coal_basalt"))
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build(new BlockSuperOreCoal("superore.coal.basalt", blockId++)).withBlastResistance(5.0F);
			superCoalLimestoneOre = fullBlock
				.setBlockModel(block -> new BlockModelStandard(block).withTextures("morefeatures:block/ores/superore_coal_limestone"))
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build(new BlockSuperOreCoal("superore.coal.limestone", blockId++)).withBlastResistance(5.0F);
			superCoalGraniteOre = fullBlock
				.setBlockModel(block -> new BlockModelStandard(block).withTextures("morefeatures:block/ores/superore_coal_granite"))
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build(new BlockSuperOreCoal("superore.coal.granite", blockId++)).withBlastResistance(5.0F);

			superIronStoneOre = fullBlock
				.setBlockModel(block -> new BlockModelStandard(block).withTextures("morefeatures:block/ores/superore_iron_stone"))
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build(new BlockSuperOreIron("superore.iron.stone", blockId++)).withBlastResistance(5.0F);
			superIronBasaltOre = fullBlock
				.setBlockModel(block -> new BlockModelStandard(block).withTextures("morefeatures:block/ores/superore_iron_basalt"))
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build(new BlockSuperOreIron("superore.iron.basalt", blockId++)).withBlastResistance(5.0F);
			superIronLimestoneOre = fullBlock
				.setBlockModel(block -> new BlockModelStandard(block).withTextures("morefeatures:block/ores/superore_iron_limestone"))
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build(new BlockSuperOreIron("superore.iron.limestone", blockId++)).withBlastResistance(5.0F);
			superIronGraniteOre = fullBlock
				.setBlockModel(block -> new BlockModelStandard(block).withTextures("morefeatures:block/ores/superore_iron_granite"))
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build(new BlockSuperOreIron("superore.iron.granite", blockId++)).withBlastResistance(5.0F);

			superGoldStoneOre = fullBlock
				.setBlockModel(block -> new BlockModelStandard(block).withTextures("morefeatures:block/ores/superore_gold_stone"))
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build(new BlockSuperOreGold("superore.gold.stone", blockId++)).withBlastResistance(5.0F);
			superGoldBasaltOre = fullBlock
				.setBlockModel(block -> new BlockModelStandard(block).withTextures("morefeatures:block/ores/superore_gold_basalt"))
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build(new BlockSuperOreGold("superore.gold.basalt", blockId++)).withBlastResistance(5.0F);
			superGoldLimestoneOre = fullBlock
				.setBlockModel(block -> new BlockModelStandard(block).withTextures("morefeatures:block/ores/superore_gold_limestone"))
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build(new BlockSuperOreGold("superore.gold.limestone", blockId++)).withBlastResistance(5.0F);
			superGoldGraniteOre = fullBlock
				.setBlockModel(block -> new BlockModelStandard(block).withTextures("morefeatures:block/ores/superore_gold_granite"))
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build(new BlockSuperOreGold("superore.gold.granite", blockId++)).withBlastResistance(5.0F);

			superLapisStoneOre = fullBlock
				.setBlockModel(block -> new BlockModelStandard(block).withTextures("morefeatures:block/ores/superore_lapis_stone"))
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build(new BlockSuperOreLapis("superore.lapis.stone", blockId++)).withBlastResistance(5.0F);
			superLapisBasaltOre = fullBlock
				.setBlockModel(block -> new BlockModelStandard(block).withTextures("morefeatures:block/ores/superore_lapis_basalt"))
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build(new BlockSuperOreLapis("superore.lapis.basalt", blockId++)).withBlastResistance(5.0F);
			superLapisLimestoneOre = fullBlock
				.setBlockModel(block -> new BlockModelStandard(block).withTextures("morefeatures:block/ores/superore_lapis_limestone"))
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build(new BlockSuperOreLapis("superore.lapis.limestone", blockId++)).withBlastResistance(5.0F);
			superLapisGraniteOre = fullBlock
				.setBlockModel(block -> new BlockModelStandard(block).withTextures("morefeatures:block/ores/superore_lapis_granite"))
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build(new BlockSuperOreLapis("superore.lapis.granite", blockId++)).withBlastResistance(5.0F);

			superRedstoneStoneOre = fullBlock
				.setBlockModel(block -> new BlockModelStandard(block).withTextures("morefeatures:block/ores/superore_redstone_stone"))
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build(new BlockSuperOreRedstone("superore.redstone.stone", blockId++, false, "superore.redstone.stone", "superore.redstone.glowing.stone")).withBlastResistance(2.0F);
			superRedstoneBasaltOre = fullBlock
				.setBlockModel(block -> new BlockModelStandard(block).withTextures("morefeatures:block/ores/superore_redstone_basalt"))
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build(new BlockSuperOreRedstone("superore.redstone.basalt", blockId++, false, "superore.redstone.basalt", "superore.redstone.glowing.basalt")).withBlastResistance(2.0F);
			superRedstoneLimestoneOre = fullBlock
				.setBlockModel(block -> new BlockModelStandard(block).withTextures("morefeatures:block/ores/superore_redstone_limestone"))
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build(new BlockSuperOreRedstone("superore.redstone.limestone", blockId++, false, "superore.redstone.limestone", "superore.redstone.glowing.limestone")).withBlastResistance(2.0F);
			superRedstoneGraniteOre = fullBlock
				.setBlockModel(block -> new BlockModelStandard(block).withTextures("morefeatures:block/ores/superore_redstone_granite"))
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build(new BlockSuperOreRedstone("superore.redstone.granite", blockId++, false, "superore.redstone.granite", "superore.redstone.glowing.granite")).withBlastResistance(2.0F);

			superRedstoneGlowingStoneOre = fullBlock
				.setBlockModel(block -> new BlockModelStandard(block).withTextures("morefeatures:block/ores/superore_redstone_glowing_stone"))
				.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
				.setHardness(3f)
				.build(new BlockSuperOreRedstone("superore.redstone.glowing.stone", blockId++, true, "superore.redstone.stone", "superore.redstone.glowing.stone")).withBlastResistance(2.0F).withLightEmission(0.4F).withDisabledNeighborNotifyOnMetadataChange();
			superRedstoneGlowingBasaltOre = fullBlock
				.setBlockModel(block -> new BlockModelStandard(block).withTextures("morefeatures:block/ores/superore_redstone_glowing_basalt"))
				.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
				.setHardness(3f)
				.build(new BlockSuperOreRedstone("superore.redstone.glowing.basalt", blockId++, true, "superore.redstone.basalt", "superore.redstone.glowing.basalt")).withBlastResistance(2.0F).withLightEmission(0.4F).withDisabledNeighborNotifyOnMetadataChange();
			superRedstoneGlowingLimestoneOre = fullBlock
				.setBlockModel(block -> new BlockModelStandard(block).withTextures("morefeatures:block/ores/superore_redstone_glowing_limestone"))
				.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
				.setHardness(3f)
				.build(new BlockSuperOreRedstone("superore.redstone.glowing.limestone", blockId++, true, "superore.redstone.limestone", "superore.redstone.glowing.limestone")).withBlastResistance(2.0F).withLightEmission(0.4F).withDisabledNeighborNotifyOnMetadataChange();
			superRedstoneGlowingGraniteOre = fullBlock
				.setBlockModel(block -> new BlockModelStandard(block).withTextures("morefeatures:block/ores/superore_redstone_glowing_granite"))
				.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
				.setHardness(3f)
				.build(new BlockSuperOreRedstone("superore.redstone.glowing.granite", blockId++, true, "superore.redstone.granite", "superore.redstone.glowing.granite")).withBlastResistance(2.0F).withLightEmission(0.4F).withDisabledNeighborNotifyOnMetadataChange();

			superDiamondStoneOre = fullBlock
				.setBlockModel(block -> new BlockModelStandard(block).withTextures("morefeatures:block/ores/superore_diamond_stone"))
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build(new BlockSuperOreDiamond("superore.diamond.stone", blockId++)).withBlastResistance(5.0F);
			superDiamondBasaltOre = fullBlock
				.setBlockModel(block -> new BlockModelStandard(block).withTextures("morefeatures:block/ores/superore_diamond_basalt"))
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build(new BlockSuperOreDiamond("superore.diamond.basalt", blockId++)).withBlastResistance(5.0F);
			superDiamondLimestoneOre = fullBlock
				.setBlockModel(block -> new BlockModelStandard(block).withTextures("morefeatures:block/ores/superore_diamond_limestone"))
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build(new BlockSuperOreDiamond("superore.diamond.limestone", blockId++)).withBlastResistance(5.0F);
			superDiamondGraniteOre = fullBlock
				.setBlockModel(block -> new BlockModelStandard(block).withTextures("morefeatures:block/ores/superore_diamond_granite"))
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build(new BlockSuperOreDiamond("superore.diamond.granite", blockId++)).withBlastResistance(5.0F);

			superNetherCoalOre = fullBlock
				.setBlockModel(block -> new BlockModelStandard(block).withTextures("morefeatures:block/ores/superore_nethercoal_netherrack"))
				.setTags(BlockTags.MINEABLE_BY_PICKAXE)
				.setHardness(3f)
				.build(new BlockSuperOreNetherCoal("superore.nether.coal.netherrack", blockId++)).withBlastResistance(5.0F).withLightEmission(1.0F);
		}

		initializeBlockDetails();
	}
}
