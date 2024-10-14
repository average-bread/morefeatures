package cursedbread.morefeatures.blocks;

import cursedbread.morefeatures.FeaturesMain;
import cursedbread.morefeatures.blocks.glass.*;
import cursedbread.morefeatures.blocks.glowstone.*;
import cursedbread.morefeatures.blocks.other.BlockGilder;
import cursedbread.morefeatures.blocks.other.BlockHam;
import cursedbread.morefeatures.blocks.paperwall.*;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockFlower;
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

		initializeBlockDetails();
	}
}
