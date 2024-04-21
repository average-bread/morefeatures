package cursedbread.morefeatures.blocks;

import cursedbread.morefeatures.FeaturesMain;
import cursedbread.morefeatures.blocks.paperwall.VanilaBlockAltPaperwall;
import cursedbread.morefeatures.blocks.paperwall.VanilaBlockColoredPaperwall;
import cursedbread.morefeatures.blocks.paperwall.VanilaBlockPaintedPaperwall;
import net.minecraft.client.render.block.model.BlockModelRenderBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.block.ItemBlockPainted;
import net.minecraft.core.sound.BlockSound;
import net.minecraft.core.sound.BlockSounds;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.helper.CreativeHelper;

import static cursedbread.morefeatures.FeaturesMain.MOD_ID;

public class FeaturesBlocks {
	public static BlockBuilder glowstoneBlock = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelRenderBlocks(0))
		.setLuminance(15)
		.setBlockSound(new BlockSound("step.stone", "random.glass", 1.0f, 1.0f))
		.setHardness(0.5f);

	public static BlockBuilder paperwallBlock = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelRenderBlocks(0))
		.setBlockSound(BlockSounds.CLOTH)
		.setHardness(0.5f);

	public static BlockBuilder fireBlock = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelRenderBlocks(3))
		.setLuminance(15)
		.setHardness(0.1f);

	public static int blockId;

	public static Block vanillaColoredGlowstone;
	public static Block nonameColoredGlowstone;
	public static int glowstaniEnabled;
	public static Block vanillaColoredPaperwall;

	public static int paperwallEnabled;

	private void initializeBlockDetails() {
		if (glowstaniEnabled == 1) {
			Item.itemsList[vanillaColoredGlowstone.id] = new ItemBlockPainted(vanillaColoredGlowstone, false);
			for (int color = 2; color < 17; color++) {
				CreativeHelper.setParent(vanillaColoredGlowstone, color - 1, vanillaColoredGlowstone, color);
			}
			Item.itemsList[nonameColoredGlowstone.id] = new ItemBlockPainted(nonameColoredGlowstone, false);
			for (int color = 2; color < 14; color++) {
				CreativeHelper.setParent(nonameColoredGlowstone, color - 1, nonameColoredGlowstone, color);
			}
		}
		if (paperwallEnabled == 1) {
			Item.itemsList[vanillaColoredPaperwall.id] = new ItemBlockPainted(vanillaColoredPaperwall, false);
			for (int color = 2; color < 17; color++) {
				CreativeHelper.setParent(vanillaColoredPaperwall, color - 1, vanillaColoredPaperwall, 0);
			}
		}
	}

	public void initilizeBlocks() {
		if (glowstaniEnabled == 1) {
			vanillaColoredGlowstone = glowstoneBlock
				.setTextures("glowstone/black_glowstone.png").setTextures("glowstone/red_glowstone.png").setTextures("glowstone/green_glowstone.png").setTextures("glowstone/brown_glowstone.png").setTextures("glowstone/blue_glowstone.png").setTextures("glowstone/purple_glowstone.png").setTextures("glowstone/cyan_glowstone.png").setTextures("glowstone/silver_glowstone.png")
				.setTextures("glowstone/gray_glowstone.png").setTextures("glowstone/pink_glowstone.png").setTextures("glowstone/lime_glowstone.png").setTextures("glowstone/yellow_glowstone.png").setTextures("glowstone/lightblue_glowstone.png").setTextures("glowstone/magenta_glowstone.png").setTextures("glowstone/orange_glowstone.png").setTextures("glowstone/white_glowstone.png")
				.setItemBlock(block -> new ItemBlockPainted(block, false))
				.build(new VanilaBlockColoredGlowstone("vanilla.colored.glowstone", blockId++, Material.glass));

			if (FeaturesMain.nonamedyesOn == true) {
				nonameColoredGlowstone = glowstoneBlock
					.setTextures("glowstone/crimson_glowstone.png").setTextures("glowstone/maroon_glowstone.png").setTextures("glowstone/ash_gray_glowstone.png").setTextures("glowstone/olive_glowstone.png").setTextures("glowstone/ochre_glowstone.png").setTextures("glowstone/buff_glowstone.png").setTextures("glowstone/verdigris_glowstone.png").setTextures("glowstone/light_yellow_glowstone.png")
					.setTextures("glowstone/indigo_glowstone.png").setTextures("glowstone/xanthic_glowstone.png").setTextures("glowstone/cinnamon_glowstone.png").setTextures("glowstone/navy_blue_glowstone.png").setTextures("glowstone/royal_purple_glowstone.png")
					.setItemBlock(block -> new ItemBlockPainted(block, false))
					.build(new NonameBlockColoredGlowstone("noname.colored.glowstone", blockId++, Material.glass));
			}
		}
		if (paperwallEnabled == 1) {
			if (FeaturesMain.paperWallAlt == 0) {
				vanillaColoredPaperwall = paperwallBlock
					.setTextures("paperwall/painted/black_paperwall.png").setTextures("paperwall/painted/red_paperwall.png").setTextures("paperwall/painted/green_paperwall.png").setTextures("paperwall/painted/brown_paperwall.png").setTextures("paperwall/painted/blue_paperwall.png").setTextures("paperwall/painted/purple_paperwall.png").setTextures("paperwall/painted/cyan_paperwall.png").setTextures("paperwall/painted/silver_paperwall.png")
					.setTextures("paperwall/painted/gray_paperwall.png").setTextures("paperwall/painted/pink_paperwall.png").setTextures("paperwall/painted/lime_paperwall.png").setTextures("paperwall/painted/yellow_paperwall.png").setTextures("paperwall/painted/lightblue_paperwall.png").setTextures("paperwall/painted/magenta_paperwall.png").setTextures("paperwall/painted/orange_paperwall.png").setTextures("paperwall/painted/white_paperwall.png")
					.setItemBlock(block -> new ItemBlockPainted(block, false))
					.build(new VanilaBlockPaintedPaperwall("vanilla.colored.paperwall", blockId++, Material.wood));
			} else if (FeaturesMain.paperWallAlt == 1) {
				vanillaColoredPaperwall = paperwallBlock
					.setTextures("paperwall/alt/black_paperwall.png").setTextures("paperwall/alt/red_paperwall.png").setTextures("paperwall/alt/green_paperwall.png").setTextures("paperwall/alt/brown_paperwall.png").setTextures("paperwall/alt/blue_paperwall.png").setTextures("paperwall/alt/purple_paperwall.png").setTextures("paperwall/alt/cyan_paperwall.png").setTextures("paperwall/alt/silver_paperwall.png")
					.setTextures("paperwall/alt/gray_paperwall.png").setTextures("paperwall/alt/pink_paperwall.png").setTextures("paperwall/alt/lime_paperwall.png").setTextures("paperwall/alt/yellow_paperwall.png").setTextures("paperwall/alt/lightblue_paperwall.png").setTextures("paperwall/alt/magenta_paperwall.png").setTextures("paperwall/alt/orange_paperwall.png").setTextures("paperwall/alt/white_paperwall.png")
					.setItemBlock(block -> new ItemBlockPainted(block, false))
					.build(new VanilaBlockAltPaperwall("vanilla.colored.paperwall", blockId++, Material.wood));
			} else {
				vanillaColoredPaperwall = paperwallBlock
					.setTextures("paperwall/colored/black_paperwall.png").setTextures("paperwall/colored/red_paperwall.png").setTextures("paperwall/colored/green_paperwall.png").setTextures("paperwall/colored/brown_paperwall.png").setTextures("paperwall/colored/blue_paperwall.png").setTextures("paperwall/colored/purple_paperwall.png").setTextures("paperwall/colored/cyan_paperwall.png").setTextures("paperwall/colored/silver_paperwall.png")
					.setTextures("paperwall/colored/gray_paperwall.png").setTextures("paperwall/colored/pink_paperwall.png").setTextures("paperwall/colored/lime_paperwall.png").setTextures("paperwall/colored/yellow_paperwall.png").setTextures("paperwall/colored/lightblue_paperwall.png").setTextures("paperwall/colored/magenta_paperwall.png").setTextures("paperwall/colored/orange_paperwall.png").setTextures("paperwall/colored/white_paperwall.png")
					.setItemBlock(block -> new ItemBlockPainted(block, false))
					.build(new VanilaBlockColoredPaperwall("vanilla.colored.paperwall", blockId++, Material.wood));
			}
		}
		initializeBlockDetails();
	}
}
