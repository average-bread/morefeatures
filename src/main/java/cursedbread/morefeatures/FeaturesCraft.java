package cursedbread.morefeatures;

import cursedbread.morefeatures.blocks.FeaturesBlocks;
import cursedbread.morefeatures.item.FeaturesItems;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.data.registry.recipe.RecipeGroup;
import net.minecraft.core.data.registry.recipe.RecipeSymbol;
import net.minecraft.core.data.registry.recipe.entry.RecipeEntryCrafting;
import net.minecraft.core.data.registry.recipe.entry.RecipeEntryRepairable;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.util.RecipeEntrypoint;
//import goocraft4evr.nonamedyes.item.ModItems;


public class FeaturesCraft implements RecipeEntrypoint {

	public static final String MOD_ID = "morefeatures";
	public static  final RecipeGroup<RecipeEntryCrafting<?, ?>> workbenchGroup = ((RecipeGroup<RecipeEntryCrafting<?, ?>>) RecipeBuilder.getRecipeGroup(MOD_ID, "workbench", new RecipeSymbol(Blocks.WORKBENCH.getDefaultStack())));

	public static int[] flowerMaterial = {
		Blocks.FLOWER_YELLOW.id(),
		Blocks.FLOWER_RED.id(),
		Blocks.LEAVES_CHERRY_FLOWERING.id(),
		Blocks.DEADBUSH.id(),
		Blocks.FLOWER_PINK.id(),
		Blocks.FLOWER_PURPLE.id(),
		Blocks.FLOWER_LIGHT_BLUE.id(),
		Blocks.FLOWER_ORANGE.id()
	};

	public static Item[] flowercrownResult = {
		FeaturesItems.dandelionCrown,
		FeaturesItems.roseCrown,
		FeaturesItems.cherryCrown,
		FeaturesItems.deadbushCrown,
		FeaturesItems.orchidCrown,
		FeaturesItems.heatherCrown,
		FeaturesItems.bluebellCrown,
		FeaturesItems.marigoldCrown
	};

	public static int[] regularMaterial = {
		Items.LEATHER.id,
		Items.INGOT_IRON.id,
		Items.INGOT_GOLD.id,
		Items.DIAMOND.id,
		Items.INGOT_STEEL.id
	};

	public static Item[] regularcrownResult = {
		FeaturesItems.leatherCrown,
		FeaturesItems.ironCrown,
		FeaturesItems.goldCrown,
		FeaturesItems.diamondCrown,
		FeaturesItems.steelCrown
	};

	public static int[] smallsquireMaterial = {
		Items.FOOD_PORKCHOP_RAW.id,
		Items.FOOD_PORKCHOP_COOKED.id
	};

	public static Block[] smallsquireResult = {
		FeaturesBlocks.ham,
		FeaturesBlocks.cookedham
	};

	public static int[] paxelCraftAxeMaterial = {
		Items.TOOL_AXE_WOOD.id,
		Items.TOOL_AXE_STONE.id,
		Items.TOOL_AXE_IRON.id,
		Items.TOOL_AXE_GOLD.id,
		Items.TOOL_AXE_DIAMOND.id,
		Items.TOOL_AXE_STEEL.id
	};
	public static int[] paxelCraftPickaxeMaterial = {
		Items.TOOL_PICKAXE_WOOD.id,
		Items.TOOL_PICKAXE_STONE.id,
		Items.TOOL_PICKAXE_IRON.id,
		Items.TOOL_PICKAXE_GOLD.id,
		Items.TOOL_PICKAXE_DIAMOND.id,
		Items.TOOL_PICKAXE_STEEL.id
	};
	public static int[] paxelCraftShovelMaterial = {
		Items.TOOL_SHOVEL_WOOD.id,
		Items.TOOL_SHOVEL_STONE.id,
		Items.TOOL_SHOVEL_IRON.id,
		Items.TOOL_SHOVEL_GOLD.id,
		Items.TOOL_SHOVEL_DIAMOND.id,
		Items.TOOL_SHOVEL_STEEL.id
	};
	public static int[] paxelCraftSwordMaterial = {
		Items.TOOL_SWORD_WOOD.id,
		Items.TOOL_SWORD_STONE.id,
		Items.TOOL_SWORD_IRON.id,
		Items.TOOL_SWORD_GOLD.id,
		Items.TOOL_SWORD_DIAMOND.id,
		Items.TOOL_SWORD_STEEL.id
	};

	public static Item[] paxelCraftResult = {
		FeaturesItems.paxelWood,
		FeaturesItems.paxelStone,
		FeaturesItems.paxelIron,
		FeaturesItems.paxelGold,
		FeaturesItems.paxelDiamond,
		FeaturesItems.paxelSteel
	};

	public static int[] toolMaterial = {
		Items.INGOT_IRON.id,
		Items.INGOT_GOLD.id,
		Items.DIAMOND.id,
		Items.INGOT_STEEL.id
	};
	public static int[] toolHeavyMaterial = {
		Blocks.BLOCK_IRON.id(),
		Blocks.BLOCK_GOLD.id(),
		Blocks.BLOCK_DIAMOND.id(),
		Blocks.BLOCK_STEEL.id()
	};

	public static Item[] climbPickResult = {
		FeaturesItems.climbPickaxeIron,
		FeaturesItems.climbPickaxeGold,
		FeaturesItems.climbPickaxeDiamond,
		FeaturesItems.climbPickaxeSteel
	};

	public static Item[] hammerResult = {
		FeaturesItems.miningHammerIron,
		FeaturesItems.miningHammerGold,
		FeaturesItems.miningHammerDiamond,
		FeaturesItems.miningHammerSteel
	};

	@Override
	public void initNamespaces() {
		RecipeBuilder.initNameSpace(FeaturesMain.MOD_ID);
		RecipeBuilder.getRecipeNamespace(FeaturesMain.MOD_ID);
		if (/*FeaturesMain.nonamedyesOn*/ false) {
			if (FeaturesBlocks.coloredBlocksEnabled == 1) {
				Registries.ITEM_GROUPS.register("morefeatures:glowstones", Registries.stackListOf(
					Blocks.GLOWSTONE,
					new ItemStack(FeaturesBlocks.vanillaColoredGlowstone, 1, 0),
					new ItemStack(FeaturesBlocks.vanillaColoredGlowstone, 1, 1),
					new ItemStack(FeaturesBlocks.vanillaColoredGlowstone, 1, 2),
					new ItemStack(FeaturesBlocks.vanillaColoredGlowstone, 1, 3),
					new ItemStack(FeaturesBlocks.vanillaColoredGlowstone, 1, 4),
					new ItemStack(FeaturesBlocks.vanillaColoredGlowstone, 1, 5),
					new ItemStack(FeaturesBlocks.vanillaColoredGlowstone, 1, 6),
					new ItemStack(FeaturesBlocks.vanillaColoredGlowstone, 1, 7),
					new ItemStack(FeaturesBlocks.vanillaColoredGlowstone, 1, 8),
					new ItemStack(FeaturesBlocks.vanillaColoredGlowstone, 1, 9),
					new ItemStack(FeaturesBlocks.vanillaColoredGlowstone, 1, 10),
					new ItemStack(FeaturesBlocks.vanillaColoredGlowstone, 1, 11),
					new ItemStack(FeaturesBlocks.vanillaColoredGlowstone, 1, 12),
					new ItemStack(FeaturesBlocks.vanillaColoredGlowstone, 1, 13),
					new ItemStack(FeaturesBlocks.vanillaColoredGlowstone, 1, 14),
					new ItemStack(FeaturesBlocks.vanillaColoredGlowstone, 1, 15),
					new ItemStack(FeaturesBlocks.nonameColoredGlowstone, 1, 0),
					new ItemStack(FeaturesBlocks.nonameColoredGlowstone, 1, 1),
					new ItemStack(FeaturesBlocks.nonameColoredGlowstone, 1, 2),
					new ItemStack(FeaturesBlocks.nonameColoredGlowstone, 1, 3),
					new ItemStack(FeaturesBlocks.nonameColoredGlowstone, 1, 4),
					new ItemStack(FeaturesBlocks.nonameColoredGlowstone, 1, 5),
					new ItemStack(FeaturesBlocks.nonameColoredGlowstone, 1, 6),
					new ItemStack(FeaturesBlocks.nonameColoredGlowstone, 1, 7),
					new ItemStack(FeaturesBlocks.nonameColoredGlowstone, 1, 8),
					new ItemStack(FeaturesBlocks.nonameColoredGlowstone, 1, 9),
					new ItemStack(FeaturesBlocks.nonameColoredGlowstone, 1, 10),
					new ItemStack(FeaturesBlocks.nonameColoredGlowstone, 1, 11),
					new ItemStack(FeaturesBlocks.nonameColoredGlowstone, 1, 12),
					new ItemStack(FeaturesBlocks.nonameColoredGlowstone, 1, 13)));
			}

			if (FeaturesBlocks.coloredBlocksEnabled == 1){
				Registries.ITEM_GROUPS.register("morefeatures:paperwall", Registries.stackListOf(Blocks.PAPER_WALL, new ItemStack(FeaturesBlocks.vanillaColoredPaperwall, 1, 0),
					new ItemStack(FeaturesBlocks.vanillaColoredPaperwall, 1, 1),
					new ItemStack(FeaturesBlocks.vanillaColoredPaperwall, 1, 2),
					new ItemStack(FeaturesBlocks.vanillaColoredPaperwall, 1, 3),
					new ItemStack(FeaturesBlocks.vanillaColoredPaperwall, 1, 4),
					new ItemStack(FeaturesBlocks.vanillaColoredPaperwall, 1, 5),
					new ItemStack(FeaturesBlocks.vanillaColoredPaperwall, 1, 6),
					new ItemStack(FeaturesBlocks.vanillaColoredPaperwall, 1, 7),
					new ItemStack(FeaturesBlocks.vanillaColoredPaperwall, 1, 8),
					new ItemStack(FeaturesBlocks.vanillaColoredPaperwall, 1, 9),
					new ItemStack(FeaturesBlocks.vanillaColoredPaperwall, 1, 10),
					new ItemStack(FeaturesBlocks.vanillaColoredPaperwall, 1, 11),
					new ItemStack(FeaturesBlocks.vanillaColoredPaperwall, 1, 12),
					new ItemStack(FeaturesBlocks.vanillaColoredPaperwall, 1, 13),
					new ItemStack(FeaturesBlocks.vanillaColoredPaperwall, 1, 14),
					new ItemStack(FeaturesBlocks.vanillaColoredPaperwall, 1, 15),
					new ItemStack(FeaturesBlocks.nonameColoredPaperwall, 1, 0),
					new ItemStack(FeaturesBlocks.nonameColoredPaperwall, 1, 1),
					new ItemStack(FeaturesBlocks.nonameColoredPaperwall, 1, 2),
					new ItemStack(FeaturesBlocks.nonameColoredPaperwall, 1, 3),
					new ItemStack(FeaturesBlocks.nonameColoredPaperwall, 1, 4),
					new ItemStack(FeaturesBlocks.nonameColoredPaperwall, 1, 5),
					new ItemStack(FeaturesBlocks.nonameColoredPaperwall, 1, 6),
					new ItemStack(FeaturesBlocks.nonameColoredPaperwall, 1, 7),
					new ItemStack(FeaturesBlocks.nonameColoredPaperwall, 1, 8),
					new ItemStack(FeaturesBlocks.nonameColoredPaperwall, 1, 9),
					new ItemStack(FeaturesBlocks.nonameColoredPaperwall, 1, 10),
					new ItemStack(FeaturesBlocks.nonameColoredPaperwall, 1, 11),
					new ItemStack(FeaturesBlocks.nonameColoredPaperwall, 1, 12),
					new ItemStack(FeaturesBlocks.nonameColoredPaperwall, 1, 13)));
			}

			if (FeaturesBlocks.coloredBlocksEnabled == 1){
				Registries.ITEM_GROUPS.register("morefeatures:glasses", Registries.stackListOf(
					Blocks.GLASS,
					new ItemStack(FeaturesBlocks.vanillaColoredGlass, 1, 0),
					new ItemStack(FeaturesBlocks.vanillaColoredGlass, 1, 1),
					new ItemStack(FeaturesBlocks.vanillaColoredGlass, 1, 2),
					new ItemStack(FeaturesBlocks.vanillaColoredGlass, 1, 3),
					new ItemStack(FeaturesBlocks.vanillaColoredGlass, 1, 4),
					new ItemStack(FeaturesBlocks.vanillaColoredGlass, 1, 5),
					new ItemStack(FeaturesBlocks.vanillaColoredGlass, 1, 6),
					new ItemStack(FeaturesBlocks.vanillaColoredGlass, 1, 7),
					new ItemStack(FeaturesBlocks.vanillaColoredGlass, 1, 8),
					new ItemStack(FeaturesBlocks.vanillaColoredGlass, 1, 9),
					new ItemStack(FeaturesBlocks.vanillaColoredGlass, 1, 10),
					new ItemStack(FeaturesBlocks.vanillaColoredGlass, 1, 11),
					new ItemStack(FeaturesBlocks.vanillaColoredGlass, 1, 12),
					new ItemStack(FeaturesBlocks.vanillaColoredGlass, 1, 13),
					new ItemStack(FeaturesBlocks.vanillaColoredGlass, 1, 14),
					new ItemStack(FeaturesBlocks.vanillaColoredGlass, 1, 15),
					new ItemStack(FeaturesBlocks.nonameColoredGlass, 1, 0),
					new ItemStack(FeaturesBlocks.nonameColoredGlass, 1, 1),
					new ItemStack(FeaturesBlocks.nonameColoredGlass, 1, 2),
					new ItemStack(FeaturesBlocks.nonameColoredGlass, 1, 3),
					new ItemStack(FeaturesBlocks.nonameColoredGlass, 1, 4),
					new ItemStack(FeaturesBlocks.nonameColoredGlass, 1, 5),
					new ItemStack(FeaturesBlocks.nonameColoredGlass, 1, 6),
					new ItemStack(FeaturesBlocks.nonameColoredGlass, 1, 7),
					new ItemStack(FeaturesBlocks.nonameColoredGlass, 1, 8),
					new ItemStack(FeaturesBlocks.nonameColoredGlass, 1, 9),
					new ItemStack(FeaturesBlocks.nonameColoredGlass, 1, 10),
					new ItemStack(FeaturesBlocks.nonameColoredGlass, 1, 11),
					new ItemStack(FeaturesBlocks.nonameColoredGlass, 1, 12),
					new ItemStack(FeaturesBlocks.nonameColoredGlass, 1, 13)));
			}
		} else {
			if (FeaturesBlocks.coloredBlocksEnabled == 1){
				Registries.ITEM_GROUPS.register("morefeatures:glowstones", Registries.stackListOf(
					Blocks.GLOWSTONE,
					new ItemStack(FeaturesBlocks.vanillaColoredGlowstone, 1, 0),
					new ItemStack(FeaturesBlocks.vanillaColoredGlowstone, 1, 1),
					new ItemStack(FeaturesBlocks.vanillaColoredGlowstone, 1, 2),
					new ItemStack(FeaturesBlocks.vanillaColoredGlowstone, 1, 3),
					new ItemStack(FeaturesBlocks.vanillaColoredGlowstone, 1, 4),
					new ItemStack(FeaturesBlocks.vanillaColoredGlowstone, 1, 5),
					new ItemStack(FeaturesBlocks.vanillaColoredGlowstone, 1, 6),
					new ItemStack(FeaturesBlocks.vanillaColoredGlowstone, 1, 7),
					new ItemStack(FeaturesBlocks.vanillaColoredGlowstone, 1, 8),
					new ItemStack(FeaturesBlocks.vanillaColoredGlowstone, 1, 9),
					new ItemStack(FeaturesBlocks.vanillaColoredGlowstone, 1, 10),
					new ItemStack(FeaturesBlocks.vanillaColoredGlowstone, 1, 11),
					new ItemStack(FeaturesBlocks.vanillaColoredGlowstone, 1, 12),
					new ItemStack(FeaturesBlocks.vanillaColoredGlowstone, 1, 13),
					new ItemStack(FeaturesBlocks.vanillaColoredGlowstone, 1, 14),
					new ItemStack(FeaturesBlocks.vanillaColoredGlowstone, 1, 15)));
			}

			if (FeaturesBlocks.coloredBlocksEnabled == 1){
				Registries.ITEM_GROUPS.register("morefeatures:paperwall", Registries.stackListOf(Blocks.PAPER_WALL, new ItemStack(FeaturesBlocks.vanillaColoredPaperwall, 1, 0),
					new ItemStack(FeaturesBlocks.vanillaColoredPaperwall, 1, 1),
					new ItemStack(FeaturesBlocks.vanillaColoredPaperwall, 1, 2),
					new ItemStack(FeaturesBlocks.vanillaColoredPaperwall, 1, 3),
					new ItemStack(FeaturesBlocks.vanillaColoredPaperwall, 1, 4),
					new ItemStack(FeaturesBlocks.vanillaColoredPaperwall, 1, 5),
					new ItemStack(FeaturesBlocks.vanillaColoredPaperwall, 1, 6),
					new ItemStack(FeaturesBlocks.vanillaColoredPaperwall, 1, 7),
					new ItemStack(FeaturesBlocks.vanillaColoredPaperwall, 1, 8),
					new ItemStack(FeaturesBlocks.vanillaColoredPaperwall, 1, 9),
					new ItemStack(FeaturesBlocks.vanillaColoredPaperwall, 1, 10),
					new ItemStack(FeaturesBlocks.vanillaColoredPaperwall, 1, 11),
					new ItemStack(FeaturesBlocks.vanillaColoredPaperwall, 1, 12),
					new ItemStack(FeaturesBlocks.vanillaColoredPaperwall, 1, 13),
					new ItemStack(FeaturesBlocks.vanillaColoredPaperwall, 1, 14),
					new ItemStack(FeaturesBlocks.vanillaColoredPaperwall, 1, 15)));
			}

			if (FeaturesBlocks.coloredBlocksEnabled == 1){
				Registries.ITEM_GROUPS.register("morefeatures:glasses", Registries.stackListOf(
					Blocks.GLASS,
					new ItemStack(FeaturesBlocks.vanillaColoredGlass, 1, 0),
					new ItemStack(FeaturesBlocks.vanillaColoredGlass, 1, 1),
					new ItemStack(FeaturesBlocks.vanillaColoredGlass, 1, 2),
					new ItemStack(FeaturesBlocks.vanillaColoredGlass, 1, 3),
					new ItemStack(FeaturesBlocks.vanillaColoredGlass, 1, 4),
					new ItemStack(FeaturesBlocks.vanillaColoredGlass, 1, 5),
					new ItemStack(FeaturesBlocks.vanillaColoredGlass, 1, 6),
					new ItemStack(FeaturesBlocks.vanillaColoredGlass, 1, 7),
					new ItemStack(FeaturesBlocks.vanillaColoredGlass, 1, 8),
					new ItemStack(FeaturesBlocks.vanillaColoredGlass, 1, 9),
					new ItemStack(FeaturesBlocks.vanillaColoredGlass, 1, 10),
					new ItemStack(FeaturesBlocks.vanillaColoredGlass, 1, 11),
					new ItemStack(FeaturesBlocks.vanillaColoredGlass, 1, 12),
					new ItemStack(FeaturesBlocks.vanillaColoredGlass, 1, 13),
					new ItemStack(FeaturesBlocks.vanillaColoredGlass, 1, 14),
					new ItemStack(FeaturesBlocks.vanillaColoredGlass, 1, 15)));

				Registries.ITEM_GROUPS.register("morefeatures:glassetrapdoors", Registries.stackListOf(
					Blocks.TRAPDOOR_GLASS,
					new ItemStack(FeaturesBlocks.vanillaColoredGlassTrapdoor, 1, 0),
					new ItemStack(FeaturesBlocks.vanillaColoredGlassTrapdoor, 1, 16),
					new ItemStack(FeaturesBlocks.vanillaColoredGlassTrapdoor, 1, 32),
					new ItemStack(FeaturesBlocks.vanillaColoredGlassTrapdoor, 1, 48),
					new ItemStack(FeaturesBlocks.vanillaColoredGlassTrapdoor, 1, 64),
					new ItemStack(FeaturesBlocks.vanillaColoredGlassTrapdoor, 1, 80),
					new ItemStack(FeaturesBlocks.vanillaColoredGlassTrapdoor, 1, 96),
					new ItemStack(FeaturesBlocks.vanillaColoredGlassTrapdoor, 1, 112),
					new ItemStack(FeaturesBlocks.vanillaColoredGlassTrapdoor, 1, 128),
					new ItemStack(FeaturesBlocks.vanillaColoredGlassTrapdoor, 1, 144),
					new ItemStack(FeaturesBlocks.vanillaColoredGlassTrapdoor, 1, 160),
					new ItemStack(FeaturesBlocks.vanillaColoredGlassTrapdoor, 1, 176),
					new ItemStack(FeaturesBlocks.vanillaColoredGlassTrapdoor, 1, 192),
					new ItemStack(FeaturesBlocks.vanillaColoredGlassTrapdoor, 1, 208),
					new ItemStack(FeaturesBlocks.vanillaColoredGlassTrapdoor, 1, 224),
					new ItemStack(FeaturesBlocks.vanillaColoredGlassTrapdoor, 1, 240)));
			}
		}
	}
	@Override
	public void onRecipesReady() {
		//colored glowstone crafting
		if (FeaturesBlocks.coloredBlocksEnabled == 1) {
			for (int i = 0; i <=15; i++) {
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("GGG", "GDG", "GGG")
					.addInput('D', Items.DYE, i)
					.addInput('G', "morefeatures:glowstones")
					.create("itemGroupExample", new ItemStack(FeaturesBlocks.vanillaColoredGlowstone, 8, 15 - i));
			}

			RecipeBuilder.Shaped(MOD_ID)
				.setShape("GGG", "GDG", "GGG")
				.addInput('D', Blocks.SPONGE_WET)
				.addInput('G', "morefeatures:glowstones")
				.create("itemGroupExample", new ItemStack(Blocks.GLOWSTONE, 8));
//			if (FeaturesMain.nonamedyesOn) {
//				for (int i = 0; i <=13; i++) {
//					RecipeBuilder.Shaped(MOD_ID)
//						.setShape("GGG", "GDG", "GGG")
//						.addInput('D', ModItems.dye, i)
//						.addInput('G', "morefeatures:glowstones")
//						.create("itemGroupExample", new ItemStack(FeaturesBlocks.nonameColoredGlowstone, 8, i));
//				}
//			}
		}
		//colored paper walls crafting
		if (FeaturesBlocks.coloredBlocksEnabled == 1) {
			for (int i = 0; i <=15; i++){
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("GGG", "GDG", "GGG")
					.addInput('D', Items.DYE, i)
					.addInput('G', "morefeatures:paperwall")
					.create("itemGroupExample", new ItemStack(FeaturesBlocks.vanillaColoredPaperwall, 8, 15-i));
			}

//			if (FeaturesMain.nonamedyesOn) {
//				for (int i = 0; i <=13; i++) {
//					RecipeBuilder.Shaped(MOD_ID)
//						.setShape("GGG", "GDG", "GGG")
//						.addInput('D', ModItems.dye, i)
//						.addInput('G', "morefeatures:paperwall")
//						.create("itemGroupExample", new ItemStack(FeaturesBlocks.nonameColoredPaperwall, 8, i));
//				}
//			}

			RecipeBuilder.Shaped(MOD_ID)
				.setShape("GGG", "GDG", "GGG")
				.addInput('D', Blocks.SPONGE_WET)
				.addInput('G', "morefeatures:paperwall")
				.create("itemGroupExample", new ItemStack(Blocks.PAPER_WALL, 8));
		}
		//colored glass crafting
		if (FeaturesBlocks.coloredBlocksEnabled == 1) {
			for (int i = 0; i <=15; i++) {
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("GGG", "GDG", "GGG")
					.addInput('D', Items.DYE, i)
					.addInput('G', "morefeatures:glasses")
					.create("itemGroupExample", new ItemStack(FeaturesBlocks.vanillaColoredGlass, 8, 15 - i));

				RecipeBuilder.Shaped(MOD_ID)
					.setShape("GGG", "GGG")
					.addInput('G', FeaturesBlocks.vanillaColoredGlass, 15 - i)
					.create("itemGroupExample", new ItemStack(FeaturesBlocks.vanillaColoredGlassTrapdoor, 6, (15 - i)*16));

				RecipeBuilder.Shapeless(MOD_ID)
					.addInput("morefeatures:glassetrapdoors")
					.addInput(Items.DYE, i)
					.create("itemGroupExample", new ItemStack(FeaturesBlocks.vanillaColoredGlassTrapdoor, 1, (15 - i)*16));
			}

			RecipeBuilder.Shaped(MOD_ID)
				.setShape("GGG", "GDG", "GGG")
				.addInput('D', Blocks.SPONGE_WET)
				.addInput('G', "morefeatures:glasses")
				.create("itemGroupExample", new ItemStack(Blocks.GLASS, 8));

			RecipeBuilder.Shaped(MOD_ID)
				.setShape("GGG", "GDG", "GGG")
				.addInput('D', Blocks.SPONGE_WET)
				.addInput('G', "morefeatures:glassetrapdoors")
				.create("itemGroupExample", new ItemStack(Blocks.TRAPDOOR_GLASS, 8));
//			if (FeaturesMain.nonamedyesOn) {
//				for (int i = 0; i <=13; i++) {
//					RecipeBuilder.Shaped(MOD_ID)
//						.setShape("GGG", "GDG", "GGG")
//						.addInput('D', ModItems.dye, i)
//						.addInput('G', "morefeatures:glasses")
//						.create("itemGroupExample", new ItemStack(FeaturesBlocks.nonameColoredGlass, 8, i));
//				}
//			}
		}
		//gilding block crafting
		if (FeaturesBlocks.miscBlocksEnabled == 1) {
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("HHH", "DDD", "EEE")
				.addInput('H', Blocks.BLOCK_GOLD)
				.addInput('D', Blocks.SLATE)
				.addInput('E', Blocks.SLATE_POLISHED)
				.create("gilderCraft", new ItemStack(FeaturesBlocks.gildingTable, 1));
		}

		//flower crowns crafting
		if (FeaturesItems.crownsEnabled == 1) {
			for (int j = 0; j < flowerMaterial.length; j++) {
				Item material = Item.itemsList[flowerMaterial[j]];
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("HHH", "H H", "HHH")
					.addInput('H', material)
					.create("rown", new ItemStack(flowercrownResult[j], 1));
			}
		}
		//regular crown crafting
		if (FeaturesItems.crownsEnabled == 1) {
			for (int j = 0; j < regularMaterial.length; j++) {
				Item material = Item.itemsList[regularMaterial[j]];
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("HCH", "HHH")
					.addInput('H', material)
					.addInput('C', Items.CLOTH)
					.create("crown", new ItemStack(regularcrownResult[j], 1));
			}
			workbenchGroup.register("chainCrownReapir", new RecipeEntryRepairable(new ItemStack(FeaturesItems.chainCrown), new RecipeSymbol(Items.CHAINLINK.getDefaultStack())));
			RecipeBuilder.getRecipeGroup(MOD_ID, "workbench", new RecipeSymbol(Blocks.WORKBENCH.getDefaultStack()));
			if (FeaturesItems.blockArmorEnabled == 1) {
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("HCH", "HHH")
					.addInput('H', "minecraft:stones")
					.addInput('C', Items.CLOTH)
					.create("crown", new ItemStack(FeaturesItems.stoneCrown, 1));
			}
			if (FeaturesItems.miscArmorEnabled == 1) {
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("HCH", "HHH")
					.addInput('H', Blocks.BLOCK_OLIVINE)
					.addInput('C', Items.CLOTH)
					.create("crown", new ItemStack(FeaturesItems.olivineCrown, 1));
			}
			if (FeaturesItems.blockArmorEnabled == 1) {
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("HCH", "HHH")
					.addInput('H', Blocks.BEDROCK)
					.addInput('C', Items.CLOTH)
					.create("crown", new ItemStack(FeaturesItems.bedrockCrown, 1));
			}
			if (FeaturesItems.oldArmorEnabled == 1) {
				workbenchGroup.register("plateCrownReapir", new RecipeEntryRepairable(new ItemStack(FeaturesItems.plateCrown), new RecipeSymbol (Items.INGOT_IRON.getDefaultStack())));
				RecipeBuilder.getRecipeGroup(MOD_ID, "workbench", new RecipeSymbol(Blocks.WORKBENCH.getDefaultStack()));
			}
			if (FeaturesItems.oldArmorEnabled == 1) {
				RecipeBuilder.Shapeless(MOD_ID)
					.addInput(FeaturesItems.leatherCrown)
					.addInput(FeaturesItems.chainCrown)
					.create("leather-chaincrown", new ItemStack(FeaturesItems.leatherChainCrown, 1));
				workbenchGroup.register("leather-chainCrownReapir", new RecipeEntryRepairable (new ItemStack(FeaturesItems.leatherChainCrown), new RecipeSymbol(Items.CHAINLINK.getDefaultStack())));
				RecipeBuilder.getRecipeGroup(MOD_ID, "workbench", new RecipeSymbol(Blocks.WORKBENCH.getDefaultStack()));
			}
		}
		//bedrock armor crafting
		if (FeaturesItems.blockArmorEnabled == 1) {
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("HHH", "H H")
				.addInput('H', Blocks.BEDROCK)
				.create("helmets", new ItemStack(FeaturesItems.bedrockHelmet, 1));
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("H H", "HHH", "HHH")
				.addInput('H', Blocks.BEDROCK)
				.create("chectplates", new ItemStack(FeaturesItems.bedrockChestplate, 1));
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("HHH", "H H", "H H")
				.addInput('H', Blocks.BEDROCK)
				.create("leggings", new ItemStack(FeaturesItems.bedrockLeggings, 1));
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("H H", "H H")
				.addInput('H', Blocks.BEDROCK)
				.create("boots", new ItemStack(FeaturesItems.bedrockBoots, 1));
		}
		//stone armor crafting
		if (FeaturesItems.blockArmorEnabled == 1) {
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("HHH", "H H")
				.addInput('H', "minecraft:stones")
				.create("helmets", new ItemStack(FeaturesItems.stoneHelmet, 1));
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("H H", "HHH", "HHH")
				.addInput('H', "minecraft:stones")
				.create("chectplates", new ItemStack(FeaturesItems.stoneChestplate, 1));
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("HHH", "H H", "H H")
				.addInput('H', "minecraft:stones")
				.create("leggings", new ItemStack(FeaturesItems.stoneLeggings, 1));
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("H H", "H H")
				.addInput('H', "minecraft:stones")
				.create("boots", new ItemStack(FeaturesItems.stoneBoots, 1));
		}
		//olivine armor crafting
		if (FeaturesItems.miscArmorEnabled == 1) {
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("HHH", "H H")
				.addInput('H', Blocks.BLOCK_OLIVINE)
				.create("helmets", new ItemStack(FeaturesItems.olivineHelmet, 1));
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("H H", "HHH", "HHH")
				.addInput('H', Blocks.BLOCK_OLIVINE)
				.create("chectplates", new ItemStack(FeaturesItems.olivineChestplate, 1));
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("HHH", "H H", "H H")
				.addInput('H', Blocks.BLOCK_OLIVINE)
				.create("leggings", new ItemStack(FeaturesItems.olivineLeggings, 1));
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("H H", "H H")
				.addInput('H', Blocks.BLOCK_OLIVINE)
				.create("boots", new ItemStack(FeaturesItems.olivineBoots, 1));
		}
		//leather-chain armor crafting and repairing
		if (FeaturesItems.oldArmorEnabled == 1) {
			RecipeBuilder.Shapeless(MOD_ID)
				.addInput(Items.ARMOR_HELMET_LEATHER)
				.addInput(Items.ARMOR_HELMET_CHAINMAIL)
				.create("leather-chainHelmet", new ItemStack(FeaturesItems.leatherChainHelmet, 1));
			RecipeBuilder.Shapeless(MOD_ID)
				.addInput(Items.ARMOR_CHESTPLATE_LEATHER)
				.addInput(Items.ARMOR_CHESTPLATE_CHAINMAIL)
				.create("leather-chainChestplate", new ItemStack(FeaturesItems.leatherChainChestplate, 1));
			RecipeBuilder.Shapeless(MOD_ID)
				.addInput(Items.ARMOR_LEGGINGS_LEATHER)
				.addInput(Items.ARMOR_LEGGINGS_CHAINMAIL)
				.create("leather-chainLeggings", new ItemStack(FeaturesItems.leatherChainLeggings, 1));
			RecipeBuilder.Shapeless(MOD_ID)
				.addInput(Items.ARMOR_BOOTS_LEATHER)
				.addInput(Items.ARMOR_BOOTS_CHAINMAIL)
				.create("leather-chainBoots", new ItemStack(FeaturesItems.leatherChainBoots, 1));

			workbenchGroup.register("leather-chainHelmetReapir", new RecipeEntryRepairable(new ItemStack(FeaturesItems.leatherChainHelmet), new RecipeSymbol(Items.CHAINLINK.getDefaultStack())));
			RecipeBuilder.getRecipeGroup(MOD_ID, "workbench", new RecipeSymbol(Blocks.WORKBENCH.getDefaultStack()));
			workbenchGroup.register("leather-chainHelmetReapir", new RecipeEntryRepairable(new ItemStack(FeaturesItems.leatherChainChestplate), new RecipeSymbol(Items.CHAINLINK.getDefaultStack())));
			RecipeBuilder.getRecipeGroup(MOD_ID, "workbench", new RecipeSymbol(Blocks.WORKBENCH.getDefaultStack()));
			workbenchGroup.register("leather-chainChestplateReapir", new RecipeEntryRepairable(new ItemStack (FeaturesItems.leatherChainLeggings), new RecipeSymbol(Items.CHAINLINK.getDefaultStack())));
			RecipeBuilder.getRecipeGroup(MOD_ID, "workbench", new RecipeSymbol(Blocks.WORKBENCH.getDefaultStack()));
			workbenchGroup.register("leather-chainLeggingsReapir", new RecipeEntryRepairable(new ItemStack (FeaturesItems.leatherChainBoots), new RecipeSymbol(Items.CHAINLINK.getDefaultStack())));
			RecipeBuilder.getRecipeGroup(MOD_ID, "workbench", new RecipeSymbol(Blocks.WORKBENCH.getDefaultStack()));
		}
		//workbench on a stick crafting
		if (FeaturesItems.newToolsEnabled == 1) {
			RecipeBuilder.Shaped(MOD_ID)
				.setShape(" W", "S ")
				.addInput('S', Items.STICK)
				.addInput('W', Blocks.WORKBENCH)
				.create("craftingOnAStick", new ItemStack(FeaturesItems.workbenchOnStick, 1));
		}
		//bomb quiver crafting
		if (FeaturesItems.bombQuibersEnabled == 1) {
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("S S", "CCC", "LLL")
				.addInput('S', Items.STRING)
				.addInput('L', Items.LEATHER)
				.addInput('C', Items.CLOTH)
				.create("bomBagCraft", new ItemStack(FeaturesItems.bombBag, 1, 48));
		}
		//plate armor repairing
		if (FeaturesItems.oldArmorEnabled == 1) {
			workbenchGroup.register("plateHelmetReapir", new RecipeEntryRepairable(new ItemStack(FeaturesItems.plateHelmet), new RecipeSymbol (Items.INGOT_IRON.getDefaultStack())));
			RecipeBuilder.getRecipeGroup(MOD_ID, "workbench", new RecipeSymbol(Blocks.WORKBENCH.getDefaultStack()));
			workbenchGroup.register("plateChestplateReapir", new RecipeEntryRepairable(new ItemStack(FeaturesItems.plateHelmet), new RecipeSymbol (Items.INGOT_IRON.getDefaultStack())));
			RecipeBuilder.getRecipeGroup(MOD_ID, "workbench", new RecipeSymbol(Blocks.WORKBENCH.getDefaultStack()));
		}
		//rainbow flower stuff
		if (FeaturesBlocks.plantEnabled == 1){
			for (int i = 0; i <= 15; i++) {
				RecipeBuilder.Shapeless(MOD_ID)
					.addInput(FeaturesBlocks.rainbowFlower)
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

		if (FeaturesBlocks.miscBlocksEnabled == 1) {
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
				.create("cookingham", new ItemStack(FeaturesBlocks.cookedham));

			RecipeBuilder.BlastFurnace(MOD_ID)
				.setInput(FeaturesBlocks.ham)
				.create("cookingham", new ItemStack(FeaturesBlocks.cookedham));
		}

		if (FeaturesItems.newToolsEnabled == 1){
			for (int i = 0; i < 6; i++){
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("APH", " W ", " S ")
					.addInput('S', Items.STICK)
					.addInput('A', Item.itemsList[paxelCraftAxeMaterial[i]])
					.addInput('P', Item.itemsList[paxelCraftPickaxeMaterial[i]])
					.addInput('H', Item.itemsList[paxelCraftShovelMaterial[i]])
					.addInput('W', Item.itemsList[paxelCraftSwordMaterial[i]])
					.create("paxelcraft", new ItemStack(paxelCraftResult[i]));
			}

			RecipeBuilder.Shaped(MOD_ID)
				.setShape("MM ", "MSH", " S ")
				.addInput('S', Items.STICK)
				.addInput('M', "minecraft:planks")
				.addInput('H', "minecraft:logs")
				.create("climbpickcraft", new ItemStack(FeaturesItems.climbPickaxeWood));
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("MM ", "MSH", " S ")
				.addInput('S', Items.STICK)
				.addInput('M', "minecraft:cobblestones")
				.addInput('H', "minecraft:stones")
				.create("climbpickcraft", new ItemStack(FeaturesItems.climbPickaxeStone));
			for (int i = 0; i < 4; i++){
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("MM ", "MSH", " S ")
					.addInput('S', Items.STICK)
					.addInput('M', Item.itemsList[toolMaterial[i]])
					.addInput('H', Item.itemsList[toolHeavyMaterial[i]])
					.create("climbpickcraft", new ItemStack(climbPickResult[i]));
			}

			RecipeBuilder.Shaped(MOD_ID)
				.setShape("HMH", "MSM", " S ")
				.addInput('S', Items.STICK)
				.addInput('M', "minecraft:planks")
				.addInput('H', "minecraft:logs")
				.create("hammercraft", new ItemStack(FeaturesItems.miningHammerWood));
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("HMH", "MSM", " S ")
				.addInput('S', Items.STICK)
				.addInput('M', "minecraft:cobblestones")
				.addInput('H', "minecraft:stones")
				.create("hammercraft", new ItemStack(FeaturesItems.miningHammerStone));
			for (int i = 0; i < 4; i++){
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("HMH", "MSM", " S ")
					.addInput('S', Items.STICK)
					.addInput('M', Item.itemsList[toolMaterial[i]])
					.addInput('H', Item.itemsList[toolHeavyMaterial[i]])
					.create("hammercraft", new ItemStack(hammerResult[i]));
			}
		}
	}
}
