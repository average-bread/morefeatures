package cursedbread.morefeatures;

import cursedbread.morefeatures.blocks.FeaturesBlocks;
import cursedbread.morefeatures.item.FeaturesItems;
import net.minecraft.core.WeightedRandomLootObject;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.data.registry.recipe.RecipeGroup;
import net.minecraft.core.data.registry.recipe.RecipeSymbol;
import net.minecraft.core.data.registry.recipe.entry.*;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import silveon22.deep.block.DEEPBlocks;
import silveon22.deep.item.DEEPItems;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.util.RecipeEntrypoint;
import useless.moonsteel.MoonSteelBlocks;
import useless.moonsteel.MoonSteelItems;


public class FeaturesCraft implements RecipeEntrypoint {

	public static final String MOD_ID = "morefeatures";
	public static  final RecipeGroup<RecipeEntryCrafting<?, ?>> workbenchGroup = ((RecipeGroup<RecipeEntryCrafting<?, ?>>) RecipeBuilder.getRecipeGroup(MOD_ID, "workbench", new RecipeSymbol(Blocks.WORKBENCH.getDefaultStack())));

	@Override
	public void initNamespaces() {
		RecipeBuilder.initNameSpace(FeaturesMain.MOD_ID);
		RecipeBuilder.getRecipeNamespace(FeaturesMain.MOD_ID);
		if (/*FeaturesMain.nonamedyesOn*/ false) {
			if (FeaturesBlocks.coloredGlowstoneEnabled == 1) {
				Registries.ITEM_GROUPS.register("morefeatures:glowstones", Registries.stackListOf(
					Blocks.GLOWSTONE,
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glowstone, 1, 0),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glowstone, 1, 1),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glowstone, 1, 2),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glowstone, 1, 3),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glowstone, 1, 4),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glowstone, 1, 5),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glowstone, 1, 6),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glowstone, 1, 7),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glowstone, 1, 8),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glowstone, 1, 9),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glowstone, 1, 10),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glowstone, 1, 11),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glowstone, 1, 12),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glowstone, 1, 13),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glowstone, 1, 14),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glowstone, 1, 15),
					new ItemStack(FeaturesBlocks.noname_Colored_Glowstone, 1, 0),
					new ItemStack(FeaturesBlocks.noname_Colored_Glowstone, 1, 1),
					new ItemStack(FeaturesBlocks.noname_Colored_Glowstone, 1, 2),
					new ItemStack(FeaturesBlocks.noname_Colored_Glowstone, 1, 3),
					new ItemStack(FeaturesBlocks.noname_Colored_Glowstone, 1, 4),
					new ItemStack(FeaturesBlocks.noname_Colored_Glowstone, 1, 5),
					new ItemStack(FeaturesBlocks.noname_Colored_Glowstone, 1, 6),
					new ItemStack(FeaturesBlocks.noname_Colored_Glowstone, 1, 7),
					new ItemStack(FeaturesBlocks.noname_Colored_Glowstone, 1, 8),
					new ItemStack(FeaturesBlocks.noname_Colored_Glowstone, 1, 9),
					new ItemStack(FeaturesBlocks.noname_Colored_Glowstone, 1, 10),
					new ItemStack(FeaturesBlocks.noname_Colored_Glowstone, 1, 11),
					new ItemStack(FeaturesBlocks.noname_Colored_Glowstone, 1, 12),
					new ItemStack(FeaturesBlocks.noname_Colored_Glowstone, 1, 13)));
			}

			if (FeaturesBlocks.coloredPaperwallEnabled == 1){
				Registries.ITEM_GROUPS.register("morefeatures:paperwall", Registries.stackListOf(Blocks.PAPER_WALL, new ItemStack(FeaturesBlocks.vanilla_Colored_Paperwall, 1, 0),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Paperwall, 1, 1),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Paperwall, 1, 2),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Paperwall, 1, 3),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Paperwall, 1, 4),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Paperwall, 1, 5),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Paperwall, 1, 6),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Paperwall, 1, 7),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Paperwall, 1, 8),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Paperwall, 1, 9),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Paperwall, 1, 10),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Paperwall, 1, 11),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Paperwall, 1, 12),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Paperwall, 1, 13),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Paperwall, 1, 14),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Paperwall, 1, 15),
					new ItemStack(FeaturesBlocks.noname_Colored_Paperwall, 1, 0),
					new ItemStack(FeaturesBlocks.noname_Colored_Paperwall, 1, 1),
					new ItemStack(FeaturesBlocks.noname_Colored_Paperwall, 1, 2),
					new ItemStack(FeaturesBlocks.noname_Colored_Paperwall, 1, 3),
					new ItemStack(FeaturesBlocks.noname_Colored_Paperwall, 1, 4),
					new ItemStack(FeaturesBlocks.noname_Colored_Paperwall, 1, 5),
					new ItemStack(FeaturesBlocks.noname_Colored_Paperwall, 1, 6),
					new ItemStack(FeaturesBlocks.noname_Colored_Paperwall, 1, 7),
					new ItemStack(FeaturesBlocks.noname_Colored_Paperwall, 1, 8),
					new ItemStack(FeaturesBlocks.noname_Colored_Paperwall, 1, 9),
					new ItemStack(FeaturesBlocks.noname_Colored_Paperwall, 1, 10),
					new ItemStack(FeaturesBlocks.noname_Colored_Paperwall, 1, 11),
					new ItemStack(FeaturesBlocks.noname_Colored_Paperwall, 1, 12),
					new ItemStack(FeaturesBlocks.noname_Colored_Paperwall, 1, 13)));
			}

			if (FeaturesBlocks.coloredGlassEnabled == 1){
				Registries.ITEM_GROUPS.register("morefeatures:glasses", Registries.stackListOf(
					Blocks.GLASS,
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass, 1, 0),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass, 1, 1),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass, 1, 2),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass, 1, 3),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass, 1, 4),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass, 1, 5),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass, 1, 6),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass, 1, 7),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass, 1, 8),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass, 1, 9),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass, 1, 10),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass, 1, 11),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass, 1, 12),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass, 1, 13),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass, 1, 14),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass, 1, 15),
					new ItemStack(FeaturesBlocks.noname_Colored_Glass, 1, 0),
					new ItemStack(FeaturesBlocks.noname_Colored_Glass, 1, 1),
					new ItemStack(FeaturesBlocks.noname_Colored_Glass, 1, 2),
					new ItemStack(FeaturesBlocks.noname_Colored_Glass, 1, 3),
					new ItemStack(FeaturesBlocks.noname_Colored_Glass, 1, 4),
					new ItemStack(FeaturesBlocks.noname_Colored_Glass, 1, 5),
					new ItemStack(FeaturesBlocks.noname_Colored_Glass, 1, 6),
					new ItemStack(FeaturesBlocks.noname_Colored_Glass, 1, 7),
					new ItemStack(FeaturesBlocks.noname_Colored_Glass, 1, 8),
					new ItemStack(FeaturesBlocks.noname_Colored_Glass, 1, 9),
					new ItemStack(FeaturesBlocks.noname_Colored_Glass, 1, 10),
					new ItemStack(FeaturesBlocks.noname_Colored_Glass, 1, 11),
					new ItemStack(FeaturesBlocks.noname_Colored_Glass, 1, 12),
					new ItemStack(FeaturesBlocks.noname_Colored_Glass, 1, 13)));

				Registries.ITEM_GROUPS.register("morefeatures:glassetrapdoors", Registries.stackListOf(
					Blocks.TRAPDOOR_GLASS,
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass_Trapdoor, 1, 0),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass_Trapdoor, 1, 16),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass_Trapdoor, 1, 32),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass_Trapdoor, 1, 48),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass_Trapdoor, 1, 64),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass_Trapdoor, 1, 80),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass_Trapdoor, 1, 96),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass_Trapdoor, 1, 112),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass_Trapdoor, 1, 128),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass_Trapdoor, 1, 144),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass_Trapdoor, 1, 160),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass_Trapdoor, 1, 176),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass_Trapdoor, 1, 192),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass_Trapdoor, 1, 208),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass_Trapdoor, 1, 224),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass_Trapdoor, 1, 240)));
			}

			if (FeaturesBlocks.coloredWorkbenchEnabled == 1){
				Registries.ITEM_GROUPS.register("morefeatures:workbenches", Registries.stackListOf(
					Blocks.WORKBENCH,
					new ItemStack(FeaturesBlocks.vanilla_Colored_Workbench, 1, 0),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Workbench, 1, 1),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Workbench, 1, 2),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Workbench, 1, 3),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Workbench, 1, 4),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Workbench, 1, 5),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Workbench, 1, 6),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Workbench, 1, 7),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Workbench, 1, 8),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Workbench, 1, 9),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Workbench, 1, 10),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Workbench, 1, 11),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Workbench, 1, 12),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Workbench, 1, 13),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Workbench, 1, 14),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Workbench, 1, 15)));
			}

			if (FeaturesBlocks.coloredLadderEnabled == 1){
				Registries.ITEM_GROUPS.register("morefeatures:ladders", Registries.stackListOf(
					Blocks.LADDER_OAK,
					new ItemStack(FeaturesBlocks.vanilla_Colored_Ladder, 1, 0),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Ladder, 1, 16),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Ladder, 1, 32),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Ladder, 1, 48),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Ladder, 1, 64),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Ladder, 1, 80),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Ladder, 1, 96),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Ladder, 1, 112),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Ladder, 1, 128),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Ladder, 1, 144),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Ladder, 1, 160),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Ladder, 1, 176),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Ladder, 1, 192),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Ladder, 1, 208),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Ladder, 1, 224),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Ladder, 1, 240)));
			}
		} else {
			if (FeaturesBlocks.coloredGlowstoneEnabled == 1){
				Registries.ITEM_GROUPS.register("morefeatures:glowstones", Registries.stackListOf(
					Blocks.GLOWSTONE,
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glowstone, 1, 0),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glowstone, 1, 1),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glowstone, 1, 2),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glowstone, 1, 3),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glowstone, 1, 4),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glowstone, 1, 5),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glowstone, 1, 6),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glowstone, 1, 7),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glowstone, 1, 8),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glowstone, 1, 9),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glowstone, 1, 10),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glowstone, 1, 11),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glowstone, 1, 12),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glowstone, 1, 13),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glowstone, 1, 14),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glowstone, 1, 15)));
			}

			if (FeaturesBlocks.coloredPaperwallEnabled == 1){
				Registries.ITEM_GROUPS.register("morefeatures:paperwall", Registries.stackListOf(Blocks.PAPER_WALL, new ItemStack(FeaturesBlocks.vanilla_Colored_Paperwall, 1, 0),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Paperwall, 1, 1),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Paperwall, 1, 2),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Paperwall, 1, 3),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Paperwall, 1, 4),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Paperwall, 1, 5),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Paperwall, 1, 6),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Paperwall, 1, 7),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Paperwall, 1, 8),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Paperwall, 1, 9),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Paperwall, 1, 10),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Paperwall, 1, 11),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Paperwall, 1, 12),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Paperwall, 1, 13),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Paperwall, 1, 14),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Paperwall, 1, 15)));
			}

			if (FeaturesBlocks.coloredGlassEnabled == 1){
				Registries.ITEM_GROUPS.register("morefeatures:glasses", Registries.stackListOf(
					Blocks.GLASS,
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass, 1, 0),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass, 1, 1),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass, 1, 2),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass, 1, 3),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass, 1, 4),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass, 1, 5),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass, 1, 6),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass, 1, 7),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass, 1, 8),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass, 1, 9),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass, 1, 10),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass, 1, 11),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass, 1, 12),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass, 1, 13),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass, 1, 14),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass, 1, 15)));

				Registries.ITEM_GROUPS.register("morefeatures:glassetrapdoors", Registries.stackListOf(
					Blocks.TRAPDOOR_GLASS,
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass_Trapdoor, 1, 0),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass_Trapdoor, 1, 16),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass_Trapdoor, 1, 32),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass_Trapdoor, 1, 48),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass_Trapdoor, 1, 64),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass_Trapdoor, 1, 80),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass_Trapdoor, 1, 96),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass_Trapdoor, 1, 112),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass_Trapdoor, 1, 128),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass_Trapdoor, 1, 144),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass_Trapdoor, 1, 160),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass_Trapdoor, 1, 176),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass_Trapdoor, 1, 192),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass_Trapdoor, 1, 208),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass_Trapdoor, 1, 224),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Glass_Trapdoor, 1, 240)));
			}

			if (FeaturesBlocks.coloredWorkbenchEnabled == 1){
				Registries.ITEM_GROUPS.register("morefeatures:workbenches", Registries.stackListOf(
					Blocks.WORKBENCH,
					new ItemStack(FeaturesBlocks.vanilla_Colored_Workbench, 1, 0),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Workbench, 1, 1),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Workbench, 1, 2),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Workbench, 1, 3),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Workbench, 1, 4),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Workbench, 1, 5),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Workbench, 1, 6),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Workbench, 1, 7),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Workbench, 1, 8),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Workbench, 1, 9),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Workbench, 1, 10),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Workbench, 1, 11),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Workbench, 1, 12),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Workbench, 1, 13),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Workbench, 1, 14),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Workbench, 1, 15)));
			}

			if (FeaturesBlocks.coloredLadderEnabled == 1){
				Registries.ITEM_GROUPS.register("morefeatures:ladders", Registries.stackListOf(
					Blocks.LADDER_OAK,
					new ItemStack(FeaturesBlocks.vanilla_Colored_Ladder, 1, 0),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Ladder, 1, 16),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Ladder, 1, 32),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Ladder, 1, 48),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Ladder, 1, 64),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Ladder, 1, 80),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Ladder, 1, 96),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Ladder, 1, 112),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Ladder, 1, 128),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Ladder, 1, 144),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Ladder, 1, 160),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Ladder, 1, 176),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Ladder, 1, 192),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Ladder, 1, 208),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Ladder, 1, 224),
					new ItemStack(FeaturesBlocks.vanilla_Colored_Ladder, 1, 240)));
			}
		}
	}
	@Override
	public void onRecipesReady() {
		//colored glowstone crafting
		if (FeaturesBlocks.coloredGlowstoneEnabled == 1) {
			workbenchGroup.register("glowstonedyeing", new RecipeEntryDyeing(new RecipeSymbol("morefeatures:glowstones") , new ItemStack(FeaturesBlocks.vanilla_Colored_Glowstone), false, false));
			workbenchGroup.register("glowstoneundyeing", new RecipeEntryUndyeing(new RecipeSymbol("morefeatures:glowstones") , new ItemStack(Blocks.GLOWSTONE)));
//			if (FeaturesMain.nonamedyesOn) {
//				for (int i = 0; i <=13; i++) {
//					RecipeBuilder.Shaped(MOD_ID)
//						.setShape("GGG", "GDG", "GGG")
//						.addInput('D', ModItems.dye, i)
//						.addInput('G', "morefeatures:glowstones")
//						.create("itemGroupExample", new ItemStack(FeaturesBlocks.noname_Colored_Glowstone, 8, i));
//				}
//			}
		}
		//colored paper walls crafting
		if (FeaturesBlocks.coloredPaperwallEnabled == 1) {


//			if (FeaturesMain.nonamedyesOn) {
//				for (int i = 0; i <=13; i++) {
//					RecipeBuilder.Shaped(MOD_ID)
//						.setShape("GGG", "GDG", "GGG")
//						.addInput('D', ModItems.dye, i)
//						.addInput('G', "morefeatures:paperwall")
//						.create("itemGroupExample", new ItemStack(FeaturesBlocks.noname_Colored_Paperwall, 8, i));
//				}
//			}
			workbenchGroup.register("paperwalldyeing", new RecipeEntryDyeing(new RecipeSymbol("morefeatures:paperwall") , new ItemStack(FeaturesBlocks.vanilla_Colored_Paperwall), false, false));
			workbenchGroup.register("paperwallundyeing", new RecipeEntryUndyeing(new RecipeSymbol("morefeatures:paperwall") , new ItemStack(Blocks.PAPER_WALL)));
		}
		//colored glass crafting
		if (FeaturesBlocks.coloredGlassEnabled == 1) {
			for (int i = 0; i <=15; i++) {
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("GGG", "GGG")
					.addInput('G', FeaturesBlocks.vanilla_Colored_Glass, 15 - i)
					.create("itemGroupExample", new ItemStack(FeaturesBlocks.vanilla_Colored_Glass_Trapdoor, 6, (15 - i)*16));
			}

			workbenchGroup.register("glassdyeing", new RecipeEntryDyeing(new RecipeSymbol("morefeatures:glasses") , new ItemStack(FeaturesBlocks.vanilla_Colored_Glass), false, false));
			workbenchGroup.register("glassundyeing", new RecipeEntryUndyeing(new RecipeSymbol("morefeatures:glasses") , new ItemStack(Blocks.GLASS)));
			workbenchGroup.register("glasstrapdoordyeing", new RecipeEntryDyeing(new RecipeSymbol("morefeatures:glassetrapdoors") , new ItemStack(FeaturesBlocks.vanilla_Colored_Glass_Trapdoor), true, false));
			workbenchGroup.register("glasstrapdoorundyeing", new RecipeEntryUndyeing(new RecipeSymbol("morefeatures:glassetrapdoors") , new ItemStack(Blocks.TRAPDOOR_GLASS)));
//			if (FeaturesMain.nonamedyesOn) {
//				for (int i = 0; i <=13; i++) {
//					RecipeBuilder.Shaped(MOD_ID)
//						.setShape("GGG", "GDG", "GGG")
//						.addInput('D', ModItems.dye, i)
//						.addInput('G', "morefeatures:glasses")
//						.create("itemGroupExample", new ItemStack(FeaturesBlocks.noname_Colored_Glass, 8, i));
//				}
//			}
		}
		//gilding block crafting
		if (FeaturesBlocks.gildingTableEnabled == 1) {
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("HHH", "DDD", "EEE")
				.addInput('H', Blocks.BLOCK_GOLD)
				.addInput('D', Blocks.SLATE)
				.addInput('E', Blocks.SLATE_POLISHED)
				.create("gilderCraft", new ItemStack(FeaturesBlocks.gilding_Table, 1));
		}

		//flower crowns crafting
		if (FeaturesItems.flowercrownsEnabled == 1) {
			int[] flowerMaterial = {
				Blocks.FLOWER_YELLOW.id(),
				Blocks.FLOWER_RED.id(),
				Blocks.LEAVES_CHERRY_FLOWERING.id(),
				Blocks.DEADBUSH.id(),
				Blocks.FLOWER_PINK.id(),
				Blocks.FLOWER_PURPLE.id(),
				Blocks.FLOWER_LIGHT_BLUE.id(),
				Blocks.FLOWER_ORANGE.id()
			};

			Item[] flowercrownResult = {
				FeaturesItems.dandelion_Crown,
				FeaturesItems.rose_Crown,
				FeaturesItems.cherry_Crown,
				FeaturesItems.deadbush_Crown,
				FeaturesItems.orchid_Crown,
				FeaturesItems.heather_Crown,
				FeaturesItems.bluebell_Crown,
				FeaturesItems.marigold_Crown
			};


			for (int j = 0; j < flowerMaterial.length; j++) {
				Item material = Item.itemsList[flowerMaterial[j]];
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("HHH", "H H", "HHH")
					.addInput('H', material)
					.create("rown", new ItemStack(flowercrownResult[j], 1));
			}

			if (FeaturesBlocks.newFlowersEnabled == 1){
				int[] flowerMaterial2 = {
					FeaturesBlocks.white_Flower.id(),
					FeaturesBlocks.magenta_Flower.id(),
					FeaturesBlocks.lime_Flower.id(),
					FeaturesBlocks.gray_Flower.id(),
					FeaturesBlocks.silver_Flower.id(),
					FeaturesBlocks.cyan_Flower.id(),
					FeaturesBlocks.blue_Flower.id(),
					FeaturesBlocks.brown_Flower.id(),
					FeaturesBlocks.green_Flower.id(),
					FeaturesBlocks.black_Flower.id()
				};

				Item[] flowercrownResult2 = {
					FeaturesItems.daisy_Crown,
					FeaturesItems.delphiniums_Crown,
					FeaturesItems.angelica_Crown,
					FeaturesItems.allium_Crown,
					FeaturesItems.dustymiller_Crown,
					FeaturesItems.cyanrose_Crown,
					FeaturesItems.bluepoppy_Crown,
					FeaturesItems.dahlia_Crown,
					FeaturesItems.barrelcactus_Crown,
					FeaturesItems.blacktulip_Crown
				};

				for (int j = 0; j < flowerMaterial2.length; j++) {
					Item material = Item.itemsList[flowerMaterial2[j]];
					RecipeBuilder.Shaped(MOD_ID)
						.setShape("HHH", "H H", "HHH")
						.addInput('H', material)
						.create("rown", new ItemStack(flowercrownResult2[j], 1));
				}
			}
		}
		//regular crown crafting
		if (FeaturesItems.normalCrownsEnabled == 1) {
			int[] regularMaterial = {
				Items.LEATHER.id,
				Items.INGOT_IRON.id,
				Items.INGOT_GOLD.id,
				Items.DIAMOND.id,
				Items.INGOT_STEEL.id
			};

			Item[] regularcrownResult = {
				FeaturesItems.leather_Crown,
				FeaturesItems.iron_Crown,
				FeaturesItems.gold_Crown,
				FeaturesItems.diamond_Crown,
				FeaturesItems.steel_Crown
			};

			for (int j = 0; j < regularMaterial.length; j++) {
				Item material = Item.itemsList[regularMaterial[j]];
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("HCH", "HHH")
					.addInput('H', material)
					.addInput('C', Items.CLOTH)
					.create("crown", new ItemStack(regularcrownResult[j], 1));
			}
			workbenchGroup.register("chainCrownReapir", new RecipeEntryRepairable(new ItemStack(FeaturesItems.chain_Crown), new RecipeSymbol(Items.CHAINLINK.getDefaultStack())));
			RecipeBuilder.getRecipeGroup(MOD_ID, "workbench", new RecipeSymbol(Blocks.WORKBENCH.getDefaultStack()));
			workbenchGroup.register("chaincrownScrap", new RecipeEntryScrap(FeaturesItems.chain_Crown, Items.CHAINLINK, 4));
			if (FeaturesItems.stoneArmorEnabled == 1) {
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("HCH", "HHH")
					.addInput('H', "minecraft:stones")
					.addInput('C', Items.CLOTH)
					.create("crown", new ItemStack(FeaturesItems.stone_Crown, 1));
			}
			if (FeaturesItems.olivineArmorEnabled == 1) {
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("HCH", "HHH")
					.addInput('H', Blocks.BLOCK_OLIVINE)
					.addInput('C', Items.CLOTH)
					.create("crown", new ItemStack(FeaturesItems.olivine_Crown, 1));
			}
			if (FeaturesItems.bedrockArmorEnabled == 1) {
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("HCH", "HHH")
					.addInput('H', Blocks.BEDROCK)
					.addInput('C', Items.CLOTH)
					.create("crown", new ItemStack(FeaturesItems.bedrock_Crown, 1));
			}
			if (FeaturesItems.plateArmorEnabled == 1) {
				workbenchGroup.register("plateCrownReapir", new RecipeEntryRepairable(new ItemStack(FeaturesItems.plate_Crown), new RecipeSymbol (Items.INGOT_IRON.getDefaultStack())));
				RecipeBuilder.getRecipeGroup(MOD_ID, "workbench", new RecipeSymbol(Blocks.WORKBENCH.getDefaultStack()));
			}
			if (FeaturesItems.studdedArmorEnabled == 1) {
				RecipeBuilder.Shapeless(MOD_ID)
					.addInput(FeaturesItems.leather_Crown)
					.addInput(FeaturesItems.chain_Crown)
					.create("leather-chaincrown", new ItemStack(FeaturesItems.leather_Chain_Crown, 1));
				workbenchGroup.register("leather-chainCrownReapir", new RecipeEntryRepairable (new ItemStack(FeaturesItems.leather_Chain_Crown), new RecipeSymbol(Items.CHAINLINK.getDefaultStack())));
				RecipeBuilder.getRecipeGroup(MOD_ID, "workbench", new RecipeSymbol(Blocks.WORKBENCH.getDefaultStack()));
			}
		}
		//bedrock armor crafting
		if (FeaturesItems.bedrockArmorEnabled == 1) {
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("HHH", "H H")
				.addInput('H', Blocks.BEDROCK)
				.create("helmets", new ItemStack(FeaturesItems.bedrock_Helmet, 1));
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("H H", "HHH", "HHH")
				.addInput('H', Blocks.BEDROCK)
				.create("chectplates", new ItemStack(FeaturesItems.bedrock_Chestplate, 1));
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("HHH", "H H", "H H")
				.addInput('H', Blocks.BEDROCK)
				.create("leggings", new ItemStack(FeaturesItems.bedrock_Leggings, 1));
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("H H", "H H")
				.addInput('H', Blocks.BEDROCK)
				.create("boots", new ItemStack(FeaturesItems.bedrock_Boots, 1));
		}
		//stone armor crafting
		if (FeaturesItems.stoneArmorEnabled == 1) {
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("HHH", "H H")
				.addInput('H', "minecraft:stones")
				.create("helmets", new ItemStack(FeaturesItems.stone_Helmet, 1));
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("H H", "HHH", "HHH")
				.addInput('H', "minecraft:stones")
				.create("chectplates", new ItemStack(FeaturesItems.stone_Chestplate, 1));
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("HHH", "H H", "H H")
				.addInput('H', "minecraft:stones")
				.create("leggings", new ItemStack(FeaturesItems.stone_Leggings, 1));
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("H H", "H H")
				.addInput('H', "minecraft:stones")
				.create("boots", new ItemStack(FeaturesItems.stone_Boots, 1));
		}
		//olivine armor crafting
		if (FeaturesItems.olivineArmorEnabled == 1) {
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("HHH", "H H")
				.addInput('H', Blocks.BLOCK_OLIVINE)
				.create("helmets", new ItemStack(FeaturesItems.olivine_Helmet, 1));
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("H H", "HHH", "HHH")
				.addInput('H', Blocks.BLOCK_OLIVINE)
				.create("chectplates", new ItemStack(FeaturesItems.olivine_Chestplate, 1));
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("HHH", "H H", "H H")
				.addInput('H', Blocks.BLOCK_OLIVINE)
				.create("leggings", new ItemStack(FeaturesItems.olivine_Leggings, 1));
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("H H", "H H")
				.addInput('H', Blocks.BLOCK_OLIVINE)
				.create("boots", new ItemStack(FeaturesItems.olivine_Boots, 1));
		}
		//leather-chain armor crafting and repairing
		if (FeaturesItems.studdedArmorEnabled == 1) {
			RecipeBuilder.Shapeless(MOD_ID)
				.addInput(Items.ARMOR_HELMET_LEATHER)
				.addInput(Items.ARMOR_HELMET_CHAINMAIL)
				.create("leather-chainHelmet", new ItemStack(FeaturesItems.leather_Chain_Helmet, 1));
			RecipeBuilder.Shapeless(MOD_ID)
				.addInput(Items.ARMOR_CHESTPLATE_LEATHER)
				.addInput(Items.ARMOR_CHESTPLATE_CHAINMAIL)
				.create("leather-chainChestplate", new ItemStack(FeaturesItems.leather_Chain_Chestplate, 1));
			RecipeBuilder.Shapeless(MOD_ID)
				.addInput(Items.ARMOR_LEGGINGS_LEATHER)
				.addInput(Items.ARMOR_LEGGINGS_CHAINMAIL)
				.create("leather-chainLeggings", new ItemStack(FeaturesItems.leather_Chain_Leggings, 1));
			RecipeBuilder.Shapeless(MOD_ID)
				.addInput(Items.ARMOR_BOOTS_LEATHER)
				.addInput(Items.ARMOR_BOOTS_CHAINMAIL)
				.create("leather-chainBoots", new ItemStack(FeaturesItems.leather_Chain_Boots, 1));

			workbenchGroup.register("leather-chainHelmetReapir", new RecipeEntryRepairable(new ItemStack(FeaturesItems.leather_Chain_Helmet), new RecipeSymbol(Items.CHAINLINK.getDefaultStack())));
			RecipeBuilder.getRecipeGroup(MOD_ID, "workbench", new RecipeSymbol(Blocks.WORKBENCH.getDefaultStack()));
			workbenchGroup.register("leather-chainHelmetReapir", new RecipeEntryRepairable(new ItemStack(FeaturesItems.leather_Chain_Chestplate), new RecipeSymbol(Items.CHAINLINK.getDefaultStack())));
			RecipeBuilder.getRecipeGroup(MOD_ID, "workbench", new RecipeSymbol(Blocks.WORKBENCH.getDefaultStack()));
			workbenchGroup.register("leather-chainChestplateReapir", new RecipeEntryRepairable(new ItemStack (FeaturesItems.leather_Chain_Leggings), new RecipeSymbol(Items.CHAINLINK.getDefaultStack())));
			RecipeBuilder.getRecipeGroup(MOD_ID, "workbench", new RecipeSymbol(Blocks.WORKBENCH.getDefaultStack()));
			workbenchGroup.register("leather-chainLeggingsReapir", new RecipeEntryRepairable(new ItemStack (FeaturesItems.leather_Chain_Boots), new RecipeSymbol(Items.CHAINLINK.getDefaultStack())));
			RecipeBuilder.getRecipeGroup(MOD_ID, "workbench", new RecipeSymbol(Blocks.WORKBENCH.getDefaultStack()));
		}
		//workbench on a stick crafting
		if (FeaturesItems.workbenchOnStickEnabled == 1) {
			if (FeaturesBlocks.coloredWorkbenchEnabled == 1){
				RecipeBuilder.Shaped(MOD_ID)
					.setShape(" W", "S ")
					.addInput('S', Items.STICK)
					.addInput('W', "morefeatures:workbenches")
					.create("craftingOnAStick", new ItemStack(FeaturesItems.workbench_On_Stick, 1));
			} else {
				RecipeBuilder.Shaped(MOD_ID)
					.setShape(" W", "S ")
					.addInput('S', Items.STICK)
					.addInput('W', Blocks.WORKBENCH)
					.create("craftingOnAStick", new ItemStack(FeaturesItems.workbench_On_Stick, 1));
			}
		}
		//bomb quiver crafting
		if (FeaturesItems.bombBagEnabled == 1) {
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("S S", "CCC", "LLL")
				.addInput('S', Items.STRING)
				.addInput('L', Items.LEATHER)
				.addInput('C', Items.CLOTH)
				.create("bomBagCraft", new ItemStack(FeaturesItems.bomb_Bag, 1, 48));
		}
		//plate armor repairing
		if (FeaturesItems.plateArmorEnabled == 1) {
			workbenchGroup.register("plateHelmetReapir", new RecipeEntryRepairable(new ItemStack(FeaturesItems.plate_Helmet), new RecipeSymbol (Items.INGOT_IRON.getDefaultStack())));
			RecipeBuilder.getRecipeGroup(MOD_ID, "workbench", new RecipeSymbol(Blocks.WORKBENCH.getDefaultStack()));
			workbenchGroup.register("plateChestplateReapir", new RecipeEntryRepairable(new ItemStack(FeaturesItems.plate_Chestplate), new RecipeSymbol (Items.INGOT_IRON.getDefaultStack())));
			RecipeBuilder.getRecipeGroup(MOD_ID, "workbench", new RecipeSymbol(Blocks.WORKBENCH.getDefaultStack()));
		}
		//rainbow flower stuff
		if (FeaturesBlocks.rainbowFlowerEnabled == 1){
			for (int i = 0; i <= 15; i++) {
				RecipeBuilder.Shapeless(MOD_ID)
					.addInput(FeaturesBlocks.rainbow_Flower)
					.addInput(Items.DYE, i)
					.create("dye-cloning", new ItemStack(Items.DYE, 3, i));
			}
//			if (FeaturesMain.nonamedyesOn) {
//				for (int i = 0; i <= 12; i++) {
//					RecipeBuilder.Shapeless(MOD_ID)
//						.addInput(FeaturesBlocks.rainbowFlower)
//						.addInput(ModItems.dye, i)
//						.create("dye-cloning", new ItemStack(ModItems.dye, 3, i));
//				}
//			}
		}

		if (FeaturesBlocks.hamEnabled == 1) {
			int[] smallsquireMaterial = {
				Items.FOOD_PORKCHOP_RAW.id,
				Items.FOOD_PORKCHOP_COOKED.id
			};

			Block[] smallsquireResult = {
				FeaturesBlocks.ham,
				FeaturesBlocks.ham_Cooked
			};

			for (int j = 0; j < smallsquireMaterial.length; j++) {
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("HH", "HH")
					.addInput('H', Item.itemsList[smallsquireMaterial[j]])
					.create("hamblockcrafting", new ItemStack(smallsquireResult[j]));
				RecipeBuilder.Shapeless(MOD_ID)
					.addInput(smallsquireResult[j])
					.create("hamblockuncrafting", new ItemStack(Item.itemsList[smallsquireMaterial[j]], 4));
			}

			RecipeBuilder.Furnace(MOD_ID)
				.setInput(FeaturesBlocks.ham)
				.create("cookingham", new ItemStack(FeaturesBlocks.ham_Cooked));

			RecipeBuilder.BlastFurnace(MOD_ID)
				.setInput(FeaturesBlocks.ham)
				.create("cookingham", new ItemStack(FeaturesBlocks.ham_Cooked));
		}

		if (FeaturesItems.paxelsEnabled == 1){

			int[] paxelCraftAxeMaterial = {
				Items.TOOL_AXE_WOOD.id,
				Items.TOOL_AXE_STONE.id,
				Items.TOOL_AXE_IRON.id,
				Items.TOOL_AXE_GOLD.id,
				Items.TOOL_AXE_DIAMOND.id,
				Items.TOOL_AXE_STEEL.id
			};
			int[] paxelCraftPickaxeMaterial = {
				Items.TOOL_PICKAXE_WOOD.id,
				Items.TOOL_PICKAXE_STONE.id,
				Items.TOOL_PICKAXE_IRON.id,
				Items.TOOL_PICKAXE_GOLD.id,
				Items.TOOL_PICKAXE_DIAMOND.id,
				Items.TOOL_PICKAXE_STEEL.id
			};
			int[] paxelCraftShovelMaterial = {
				Items.TOOL_SHOVEL_WOOD.id,
				Items.TOOL_SHOVEL_STONE.id,
				Items.TOOL_SHOVEL_IRON.id,
				Items.TOOL_SHOVEL_GOLD.id,
				Items.TOOL_SHOVEL_DIAMOND.id,
				Items.TOOL_SHOVEL_STEEL.id
			};
			int[] paxelCraftSwordMaterial = {
				Items.TOOL_SWORD_WOOD.id,
				Items.TOOL_SWORD_STONE.id,
				Items.TOOL_SWORD_IRON.id,
				Items.TOOL_SWORD_GOLD.id,
				Items.TOOL_SWORD_DIAMOND.id,
				Items.TOOL_SWORD_STEEL.id
			};

			Item[] paxelCraftResult = {
				FeaturesItems.paxel_Wood,
				FeaturesItems.paxel_Stone,
				FeaturesItems.paxel_Iron,
				FeaturesItems.paxel_Gold,
				FeaturesItems.paxel_Diamond,
				FeaturesItems.paxel_Steel
			};

			String[] paxelNames = {
				"wood",
				"stone",
				"iron",
				"gold",
				"diamond",
				"steel"
			};

			for (int i = 0; i < 6; i++){
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("APH", " W ", " S ")
					.addInput('S', Items.STICK)
					.addInput('A', Item.itemsList[paxelCraftAxeMaterial[i]])
					.addInput('P', Item.itemsList[paxelCraftPickaxeMaterial[i]])
					.addInput('H', Item.itemsList[paxelCraftShovelMaterial[i]])
					.addInput('W', Item.itemsList[paxelCraftSwordMaterial[i]])
					.create("paxelcraft" + paxelNames[i], new ItemStack(paxelCraftResult[i]));
			}
		}

		if (FeaturesItems.climbPickaxesEnabled == 1) {
			int[] toolMaterial = {
				Items.INGOT_IRON.id,
				Items.INGOT_GOLD.id,
				Items.DIAMOND.id,
				Items.INGOT_STEEL.id
			};
			int[] toolHeavyMaterial = {
				Blocks.BLOCK_IRON.id(),
				Blocks.BLOCK_GOLD.id(),
				Blocks.BLOCK_DIAMOND.id(),
				Blocks.BLOCK_STEEL.id()
			};
			Item[] climbPickResult = {
				FeaturesItems.climb_Pickaxe_Iron,
				FeaturesItems.climb_Pickaxe_Gold,
				FeaturesItems.climb_Pickaxe_Diamond,
				FeaturesItems.climb_Pickaxe_Steel
			};

			String[] climbPickaxeNames = {
				"iron",
				"gold",
				"diamond",
				"steel"
			};

			RecipeBuilder.Shaped(MOD_ID)
				.setShape("MM ", "MSH", " S ")
				.addInput('S', Items.STICK)
				.addInput('M', "minecraft:planks")
				.addInput('H', "minecraft:logs")
				.create("climbpickcraftwood", new ItemStack(FeaturesItems.climb_Pickaxe_Wood));
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("MM ", "MSH", " S ")
				.addInput('S', Items.STICK)
				.addInput('M', "minecraft:cobblestones")
				.addInput('H', "minecraft:stones")
				.create("climbpickcraftstone", new ItemStack(FeaturesItems.climb_Pickaxe_Stone));
			for (int i = 0; i < 4; i++){
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("MM ", "MSH", " S ")
					.addInput('S', Items.STICK)
					.addInput('M', Item.itemsList[toolMaterial[i]])
					.addInput('H', Item.itemsList[toolHeavyMaterial[i]])
					.create("climbpickcraft" + climbPickaxeNames[i], new ItemStack(climbPickResult[i]));
			}
		}

		if (FeaturesItems.miningHammersEnabled == 1){
			int[] toolMaterial = {
				Items.INGOT_IRON.id,
				Items.INGOT_GOLD.id,
				Items.DIAMOND.id,
				Items.INGOT_STEEL.id
			};
			int[] toolHeavyMaterial = {
				Blocks.BLOCK_IRON.id(),
				Blocks.BLOCK_GOLD.id(),
				Blocks.BLOCK_DIAMOND.id(),
				Blocks.BLOCK_STEEL.id()
			};
			Item[] hammerResult = {
				FeaturesItems.mining_Hammer_Iron,
				FeaturesItems.mining_Hammer_Gold,
				FeaturesItems.mining_Hammer_Diamond,
				FeaturesItems.mining_Hammer_Steel
			};

			String[] hammerNames = {
				"iron",
				"gold",
				"diamond",
				"steel"
			};

			RecipeBuilder.Shaped(MOD_ID)
				.setShape("HMH", "MSM", " S ")
				.addInput('S', Items.STICK)
				.addInput('M', "minecraft:planks")
				.addInput('H', "minecraft:logs")
				.create("hammercraftwood", new ItemStack(FeaturesItems.mining_Hammer_Wood));
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("HMH", "MSM", " S ")
				.addInput('S', Items.STICK)
				.addInput('M', "minecraft:cobblestones")
				.addInput('H', "minecraft:stones")
				.create("hammercraftstone", new ItemStack(FeaturesItems.mining_Hammer_Stone));
			for (int i = 0; i < 4; i++){
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("HMH", "MSM", " S ")
					.addInput('S', Items.STICK)
					.addInput('M', Item.itemsList[toolMaterial[i]])
					.addInput('H', Item.itemsList[toolHeavyMaterial[i]])
					.create("hammercraft" + hammerNames[i], new ItemStack(hammerResult[i]));
			}
		}

		if (FeaturesBlocks.burnedLogEnabled == 1){
			RecipeBuilder.Shapeless(MOD_ID)
				.addInput(FeaturesBlocks.burned_Log)
				.create("burnedlogsintoplanks", new ItemStack(Blocks.PLANKS_OAK_PAINTED, 4, 15));
		}

		if (FeaturesItems.ferlilizerBagEnabled == 1){
			RecipeBuilder.Shaped(MOD_ID)
				.setShape(" S ", "LCL", " L ")
				.addInput('S', Items.STRING)
				.addInput('L', Items.LEATHER)
				.addInput('C', Items.CLOTH)
				.create("bomBagCraft", new ItemStack(FeaturesItems.fertilizer_Bag, 1, 192));
		}

		if (FeaturesBlocks.netherGravelEnabled == 1){
			RecipeBuilder.Trommel(MOD_ID)
				.setInput(FeaturesBlocks.netherrack_Gravel)
				.addEntry(new WeightedRandomLootObject(Items.AMMO_PEBBLE.getDefaultStack(), 1, 6), 25)
				.addEntry(new WeightedRandomLootObject(Items.DUST_REDSTONE.getDefaultStack(), 2, 6), 5)
				.addEntry(new WeightedRandomLootObject(new ItemStack(Items.DYE, 1, 1), 2, 6), 5)
				.addEntry(new WeightedRandomLootObject(new ItemStack(Items.FLINT, 1), 1, 2), 25)
				.addEntry(new WeightedRandomLootObject(new ItemStack(Items.OLIVINE, 1), 1, 3), 30)
				.addEntry(new WeightedRandomLootObject(new ItemStack(Items.ORE_RAW_GOLD, 1), 1, 2), 10)
				.addEntry(new WeightedRandomLootObject(new ItemStack(Items.QUARTZ, 1), 1), 0.5)
				.create("nethergraveltrommel");

			RecipeBuilder.Shaped(MOD_ID)
				.setShape("XY", "YX")
				.addInput('X', Items.AMMO_PEBBLE)
				.addInput('Y', Items.DUST_REDSTONE)
				.create("netherrrackcraft", new ItemStack(Blocks.COBBLE_NETHERRACK));
		}

		if (FeaturesBlocks.coloredWorkbenchEnabled == 1){
			RecipeBuilder.ModifyWorkbench("minecraft").removeRecipe("workbench");

			RecipeBuilder.Shaped(MOD_ID)
				.setShape("WW", "WW")
				.addInput('W', "minecraft:planks")
				.create("craftingnormalworkbench", new ItemStack(Blocks.WORKBENCH));

			for (int i = 0; i <=15; i++) {
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("WW", "WW")
					.addInput('W', Blocks.PLANKS_OAK_PAINTED, i)
					.create("craftingcoloredworkbench", new ItemStack(FeaturesBlocks.vanilla_Colored_Workbench, 1, i));
			}

			workbenchGroup.register("workbenchdyeing", new RecipeEntryDyeing(new RecipeSymbol("morefeatures:workbenches") , new ItemStack(FeaturesBlocks.vanilla_Colored_Workbench), false, false));
			workbenchGroup.register("workbenchundyeing", new RecipeEntryUndyeing(new RecipeSymbol("morefeatures:workbenches") , new ItemStack(Blocks.WORKBENCH)));
		}

		if (FeaturesBlocks.coloredLadderEnabled == 1){
			workbenchGroup.register("ladderdyeing", new RecipeEntryDyeing(new RecipeSymbol("morefeatures:ladders") , new ItemStack(FeaturesBlocks.vanilla_Colored_Ladder), true, false));
			workbenchGroup.register("ladderundyeing", new RecipeEntryUndyeing(new RecipeSymbol("morefeatures:ladders") , new ItemStack(Blocks.LADDER_OAK)));
		}

		if (FeaturesItems.glassSwordEnabled == 1){
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("G", "G", "S")
				.addInput('S', Items.STICK)
				.addInput('G', Blocks.GLASS)
				.create("glasssword", new ItemStack(FeaturesItems.glass_Sword));
		}

		if (FeaturesItems.boomStickEnabled == 1) {
			RecipeBuilder.Shaped(MOD_ID)
				.setShape(" E", "S ")
				.addInput('S', Items.STICK)
				.addInput('E', Items.AMMO_CHARGE_EXPLOSIVE)
				.create("boomstick", new ItemStack(FeaturesItems.boom_stick));
		}

		if (FeaturesBlocks.newFlowersEnabled == 1){
			RecipeBuilder.Shapeless(MOD_ID)
				.addInput(FeaturesBlocks.white_Flower)
				.create("whiteflowertodye", new ItemStack(Items.DYE, 2, 15));

			RecipeBuilder.Shapeless(MOD_ID)
				.addInput(FeaturesBlocks.magenta_Flower)
				.create("magentaflowertodye", new ItemStack(Items.DYE, 2, 13));

			RecipeBuilder.Shapeless(MOD_ID)
				.addInput(FeaturesBlocks.lime_Flower)
				.create("limeflowertodye", new ItemStack(Items.DYE, 2, 10));

			RecipeBuilder.Shapeless(MOD_ID)
				.addInput(FeaturesBlocks.gray_Flower)
				.create("grayflowertodye", new ItemStack(Items.DYE, 2, 8));

			RecipeBuilder.Shapeless(MOD_ID)
				.addInput(FeaturesBlocks.silver_Flower)
				.create("silverflowertodye", new ItemStack(Items.DYE, 2, 7));

			RecipeBuilder.Shapeless(MOD_ID)
				.addInput(FeaturesBlocks.cyan_Flower)
				.create("cyanflowertodye", new ItemStack(Items.DYE, 2, 6));

			RecipeBuilder.Shapeless(MOD_ID)
				.addInput(FeaturesBlocks.blue_Flower)
				.create("blueflowertodye", new ItemStack(Items.DYE, 2, 4));

			RecipeBuilder.Shapeless(MOD_ID)
				.addInput(FeaturesBlocks.brown_Flower)
				.create("brownflowertodye", new ItemStack(Items.DYE, 2, 3));

			RecipeBuilder.Shapeless(MOD_ID)
				.addInput(FeaturesBlocks.green_Flower)
				.create("greenflowertodye", new ItemStack(Items.DYE, 2, 2));

			RecipeBuilder.Shapeless(MOD_ID)
				.addInput(FeaturesBlocks.black_Flower)
				.create("blackflowertodye", new ItemStack(Items.DYE, 2, 0));
		}

		if (FeaturesBlocks.woodMeshEnabled == 1) {
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("SSS", "S S", "SSS")
				.addInput('S', Items.STICK)
				.create("woodmesh", new ItemStack(FeaturesBlocks.wood_Mesh));
		}

		if (FeaturesItems.scytheEnabled == 1){
			int[] toolMaterial = {
				Items.INGOT_IRON.id,
				Items.INGOT_GOLD.id,
				Items.DIAMOND.id,
				Items.INGOT_STEEL.id
			};
			int[] toolHeavyMaterial = {
				Blocks.BLOCK_IRON.id(),
				Blocks.BLOCK_GOLD.id(),
				Blocks.BLOCK_DIAMOND.id(),
				Blocks.BLOCK_STEEL.id()
			};
			Item[] scytheResult = {
				FeaturesItems.scythe_Iron,
				FeaturesItems.scythe_Gold,
				FeaturesItems.scythe_Diamond,
				FeaturesItems.scythe_Steel
			};

			String[] scytheNames = {
				"iron",
				"gold",
				"diamond",
				"steel"
			};

			RecipeBuilder.Shaped(MOD_ID)
				.setShape(" MH", "M S", "  S")
				.addInput('S', Items.STICK)
				.addInput('H', "minecraft:logs")
				.addInput('M', "minecraft:planks")
				.create("scythecraftwood", new ItemStack(FeaturesItems.scythe_Wood));
			RecipeBuilder.Shaped(MOD_ID)
				.setShape(" MH", "M S", "  S")
				.addInput('S', Items.STICK)
				.addInput('H', "minecraft:stones")
				.addInput('M', "minecraft:cobblestones")
				.create("scythecraftstone", new ItemStack(FeaturesItems.scythe_Stone));
			for (int i = 0; i < 4; i++){
				RecipeBuilder.Shaped(MOD_ID)
					.setShape(" MH", "M S", "  S")
					.addInput('S', Items.STICK)
					.addInput('H', Item.itemsList[toolHeavyMaterial[i]])
					.addInput('M', Item.itemsList[toolMaterial[i]])
					.create("scythecraft" + scytheNames[i], new ItemStack(scytheResult[i]));
			}
		}

		if (FeaturesItems.coalChunksEnabled == 1){
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("XXX", "X X", "XXX")
				.addInput('X', FeaturesItems.coal_chunk)
				.create("coalcraft", new ItemStack(Items.COAL));
			RecipeBuilder.Shapeless(MOD_ID)
				.addInput(Items.COAL)
				.create("coalchunkcraft", new ItemStack(FeaturesItems.coal_chunk, 8));

			RecipeBuilder.Shaped(MOD_ID)
				.setShape("XXX", "X X", "XXX")
				.addInput('X', FeaturesItems.charcoal_chunk)
				.create("coalcraft", new ItemStack(Items.COAL, 1, 1));
			RecipeBuilder.Shapeless(MOD_ID)
				.addInput(Items.COAL, 1)
				.create("coalchunkcraft", new ItemStack(FeaturesItems.charcoal_chunk, 8));

			RecipeBuilder.Shaped(MOD_ID)
				.setShape("XXX", "X X", "XXX")
				.addInput('X', FeaturesItems.nethercoal_chunk)
				.create("coalcraft", new ItemStack(Items.NETHERCOAL));
			RecipeBuilder.Shapeless(MOD_ID)
				.addInput(Items.NETHERCOAL)
				.create("coalchunkcraft", new ItemStack(FeaturesItems.nethercoal_chunk, 8));

			RecipeBuilder.Shaped(MOD_ID)
				.setShape("XX", " S")
				.addInput('X', FeaturesItems.coal_chunk)
				.addInput('S', Items.STICK)
				.create("torchfromcoalchunk", new ItemStack(Blocks.TORCH_COAL));
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("XX", " S")
				.addInput('X', FeaturesItems.charcoal_chunk)
				.addInput('S', Items.STICK)
				.create("torchfromcharcoalcoalchunk", new ItemStack(Blocks.TORCH_COAL));
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("X", "S")
				.addInput('X', FeaturesItems.nethercoal_chunk)
				.addInput('S', Items.STICK)
				.create("torchfromnethercoalchunk", new ItemStack(Blocks.TORCH_COAL));
		}

		if (FeaturesMain.moonmoonmoonOn){
			if (FeaturesItems.paxelsEnabled == 1) {
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("APH", " W ", " S ")
					.addInput('S', Items.STICK)
					.addInput('A', MoonSteelItems.TOOL_AXE_MOONSTEEL)
					.addInput('P', MoonSteelItems.TOOL_PICKAXE_MOONSTEEL)
					.addInput('H', MoonSteelItems.TOOL_SHOVEL_MOONSTEEL)
					.addInput('W', MoonSteelItems.TOOL_SWORD_MOONSTEEL)
					.create("paxelcraftmoonsteel", new ItemStack(FeaturesItems.paxel_Moonsteel));
			}

			if (FeaturesItems.climbPickaxesEnabled == 1) {
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("MM ", "MSH", " S ")
					.addInput('S', Items.STICK)
					.addInput('M', MoonSteelItems.INGOT_MOONSTEEL)
					.addInput('H', MoonSteelBlocks.BLOCK_MOONSTEEL)
					.create("climbpickcraftmoonsteel", new ItemStack(FeaturesItems.climb_pickaxe_Monnsteel));
			}

			if (FeaturesItems.miningHammersEnabled == 1) {
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("HMH", "MSM", " S ")
					.addInput('S', Items.STICK)
					.addInput('M', MoonSteelItems.INGOT_MOONSTEEL)
					.addInput('H', MoonSteelBlocks.BLOCK_MOONSTEEL)
					.create("hammercraftmoonsteel", new ItemStack(FeaturesItems.mining_hammer_MoonSteel));
			}

			if (FeaturesItems.normalCrownsEnabled == 1) {
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("HCH", "HHH")
					.addInput('H', MoonSteelItems.INGOT_MOONSTEEL)
					.addInput('C', Items.CLOTH)
					.create("crownmoonsteel", new ItemStack(FeaturesItems.moonsteel_Crown, 1));
			}

			if (FeaturesItems.scytheEnabled == 1){
				RecipeBuilder.Shaped(MOD_ID)
					.setShape(" MH", "M S", "  S")
					.addInput('S', Items.STICK)
					.addInput('H', MoonSteelBlocks.BLOCK_MOONSTEEL)
					.addInput('M', MoonSteelItems.INGOT_MOONSTEEL)
					.create("scythecraftmoonsteel", new ItemStack(FeaturesItems.scythe_MoonSteel));
			}
		}

		if (FeaturesMain.deepOn){
			if (FeaturesItems.paxelsEnabled == 1) {
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("APH", " W ", " S ")
					.addInput('S', Items.STICK)
					.addInput('A', DEEPItems.amethystAxe)
					.addInput('P', DEEPItems.amethystPickaxe)
					.addInput('H', DEEPItems.amethystShovel)
					.addInput('W', DEEPItems.amethystSword)
					.create("paxelcraftamethyst", new ItemStack(FeaturesItems.paxel_Amethyst));
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("APH", " W ", " S ")
					.addInput('S', Items.STICK)
					.addInput('A', DEEPItems.silverAxe)
					.addInput('P', DEEPItems.silverPickaxe)
					.addInput('H', DEEPItems.silverShovel)
					.addInput('W', DEEPItems.silverSword)
					.create("paxelcraftsilver", new ItemStack(FeaturesItems.paxel_Silver));
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("APH", " W ", " S ")
					.addInput('S', Items.STICK)
					.addInput('A', DEEPItems.leadAxe)
					.addInput('P', DEEPItems.leadPickaxe)
					.addInput('H', DEEPItems.leadShovel)
					.addInput('W', DEEPItems.leadSword)
					.create("paxelcraftlead", new ItemStack(FeaturesItems.paxel_Lead));
			}

			if (FeaturesItems.climbPickaxesEnabled == 1) {
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("MM ", "MSH", " S ")
					.addInput('S', Items.STICK)
					.addInput('M', DEEPItems.amethyst)
					.addInput('H', DEEPBlocks.amethystBlock)
					.create("climbpickcraftamethyst", new ItemStack(FeaturesItems.climb_pickaxe_Amethyst));
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("MM ", "MSH", " S ")
					.addInput('S', Items.STICK)
					.addInput('M', DEEPItems.ingotSilver)
					.addInput('H', DEEPBlocks.silverBlock)
					.create("climbpickcraftsilver", new ItemStack(FeaturesItems.climb_pickaxe_Silver));
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("MM ", "MSH", " S ")
					.addInput('S', Items.STICK)
					.addInput('M', DEEPItems.ingotLead)
					.addInput('H', DEEPBlocks.leadBlock)
					.create("climbpickcraftlead", new ItemStack(FeaturesItems.climb_pickaxe_Lead));
			}

			if (FeaturesItems.miningHammersEnabled == 1) {
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("HMH", "MSM", " S ")
					.addInput('S', Items.STICK)
					.addInput('M', DEEPItems.amethyst)
					.addInput('H', DEEPBlocks.amethystBlock)
					.create("hammercraftamethyst", new ItemStack(FeaturesItems.mining_hammer_Amethyst));
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("HMH", "MSM", " S ")
					.addInput('S', Items.STICK)
					.addInput('M', DEEPItems.ingotSilver)
					.addInput('H', DEEPBlocks.silverBlock)
					.create("hammercraftsilver", new ItemStack(FeaturesItems.mining_hammer_Silver));
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("HMH", "MSM", " S ")
					.addInput('S', Items.STICK)
					.addInput('M', DEEPItems.ingotLead)
					.addInput('H', DEEPBlocks.leadBlock)
					.create("hammercraftlead", new ItemStack(FeaturesItems.mining_hammer_Lead));
			}

			if (FeaturesItems.normalCrownsEnabled == 1){
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("HCH", "HHH")
					.addInput('H', DEEPItems.amethyst)
					.addInput('C', Items.CLOTH)
					.create("crownamethyst", new ItemStack(FeaturesItems.amethyst_Crown, 1));
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("HCH", "HHH")
					.addInput('H', DEEPItems.ingotSilver)
					.addInput('C', Items.CLOTH)
					.create("crownsilver", new ItemStack(FeaturesItems.silver_Crown, 1));
			}

			if (FeaturesItems.scytheEnabled == 1){
				RecipeBuilder.Shaped(MOD_ID)
					.setShape(" MH", "M S", "  S")
					.addInput('S', Items.STICK)
					.addInput('H', DEEPBlocks.amethystBlock)
					.addInput('M', DEEPItems.amethyst)
					.create("scythecraftamethyst", new ItemStack(FeaturesItems.scythe_Amethyst));
				RecipeBuilder.Shaped(MOD_ID)
					.setShape(" MH", "M S", "  S")
					.addInput('S', Items.STICK)
					.addInput('M', DEEPItems.ingotLead)
					.addInput('H', DEEPBlocks.leadBlock)
					.create("scythecraftlead", new ItemStack(FeaturesItems.scythe_Lead));
				RecipeBuilder.Shaped(MOD_ID)
					.setShape(" MH", "M S", "  S")
					.addInput('S', Items.STICK)
					.addInput('M', DEEPItems.ingotSilver)
					.addInput('H', DEEPBlocks.silverBlock)
					.create("scythecraftsilver", new ItemStack(FeaturesItems.scythe_Silver));
			}
		}
	}
}
