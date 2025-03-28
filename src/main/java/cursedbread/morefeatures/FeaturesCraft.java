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
import net.minecraft.core.data.registry.recipe.entry.RecipeEntryScrap;
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
		FeaturesItems.dandelion_Crown,
		FeaturesItems.rose_Crown,
		FeaturesItems.cherry_Crown,
		FeaturesItems.deadbush_Crown,
		FeaturesItems.orchid_Crown,
		FeaturesItems.heather_Crown,
		FeaturesItems.bluebell_Crown,
		FeaturesItems.marigold_Crown
	};

	public static int[] regularMaterial = {
		Items.LEATHER.id,
		Items.INGOT_IRON.id,
		Items.INGOT_GOLD.id,
		Items.DIAMOND.id,
		Items.INGOT_STEEL.id
	};

	public static Item[] regularcrownResult = {
		FeaturesItems.leather_Crown,
		FeaturesItems.iron_Crown,
		FeaturesItems.gold_Crown,
		FeaturesItems.diamond_Crown,
		FeaturesItems.steel_Crown
	};

	public static int[] smallsquireMaterial = {
		Items.FOOD_PORKCHOP_RAW.id,
		Items.FOOD_PORKCHOP_COOKED.id
	};

	public static Block[] smallsquireResult = {
		FeaturesBlocks.ham,
		FeaturesBlocks.ham_Cooked
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
		FeaturesItems.paxel_Wood,
		FeaturesItems.paxel_Stone,
		FeaturesItems.paxel_Iron,
		FeaturesItems.paxel_Gold,
		FeaturesItems.paxel_Diamond,
		FeaturesItems.paxel_Steel
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
		FeaturesItems.climb_Pickaxe_Iron,
		FeaturesItems.climb_Pickaxe_Gold,
		FeaturesItems.climb_Pickaxe_Diamond,
		FeaturesItems.climb_Pickaxe_Steel
	};

	public static Item[] hammerResult = {
		FeaturesItems.mining_Hammer_Iron,
		FeaturesItems.mining_Hammer_Gold,
		FeaturesItems.mining_Hammer_Diamond,
		FeaturesItems.mining_Hammer_Steel
	};

	@Override
	public void initNamespaces() {
		RecipeBuilder.initNameSpace(FeaturesMain.MOD_ID);
		RecipeBuilder.getRecipeNamespace(FeaturesMain.MOD_ID);
		if (/*FeaturesMain.nonamedyesOn*/ false) {
			if (FeaturesBlocks.coloredBlocksEnabled == 1) {
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

			if (FeaturesBlocks.coloredBlocksEnabled == 1){
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

			if (FeaturesBlocks.coloredBlocksEnabled == 1){
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
			}
		} else {
			if (FeaturesBlocks.coloredBlocksEnabled == 1){
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

			if (FeaturesBlocks.coloredBlocksEnabled == 1){
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

			if (FeaturesBlocks.coloredBlocksEnabled == 1){
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
					.create("itemGroupExample", new ItemStack(FeaturesBlocks.vanilla_Colored_Glowstone, 8, 15 - i));
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
//						.create("itemGroupExample", new ItemStack(FeaturesBlocks.noname_Colored_Glowstone, 8, i));
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
					.create("itemGroupExample", new ItemStack(FeaturesBlocks.vanilla_Colored_Paperwall, 8, 15-i));
			}

//			if (FeaturesMain.nonamedyesOn) {
//				for (int i = 0; i <=13; i++) {
//					RecipeBuilder.Shaped(MOD_ID)
//						.setShape("GGG", "GDG", "GGG")
//						.addInput('D', ModItems.dye, i)
//						.addInput('G', "morefeatures:paperwall")
//						.create("itemGroupExample", new ItemStack(FeaturesBlocks.noname_Colored_Paperwall, 8, i));
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
					.create("itemGroupExample", new ItemStack(FeaturesBlocks.vanilla_Colored_Glass, 8, 15 - i));

				RecipeBuilder.Shaped(MOD_ID)
					.setShape("GGG", "GGG")
					.addInput('G', FeaturesBlocks.vanilla_Colored_Glass, 15 - i)
					.create("itemGroupExample", new ItemStack(FeaturesBlocks.vanilla_Colored_Glass_Trapdoor, 6, (15 - i)*16));

				RecipeBuilder.Shapeless(MOD_ID)
					.addInput("morefeatures:glassetrapdoors")
					.addInput(Items.DYE, i)
					.create("itemGroupExample", new ItemStack(FeaturesBlocks.vanilla_Colored_Glass_Trapdoor, 1, (15 - i)*16));
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
//						.create("itemGroupExample", new ItemStack(FeaturesBlocks.noname_Colored_Glass, 8, i));
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
				.create("gilderCraft", new ItemStack(FeaturesBlocks.gilding_Table, 1));
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
			workbenchGroup.register("chainCrownReapir", new RecipeEntryRepairable(new ItemStack(FeaturesItems.chain_Crown), new RecipeSymbol(Items.CHAINLINK.getDefaultStack())));
			RecipeBuilder.getRecipeGroup(MOD_ID, "workbench", new RecipeSymbol(Blocks.WORKBENCH.getDefaultStack()));
			workbenchGroup.register("chaincrownScrap", new RecipeEntryScrap(FeaturesItems.chain_Crown, Items.CHAINLINK, 4));
			if (FeaturesItems.blockArmorEnabled == 1) {
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("HCH", "HHH")
					.addInput('H', "minecraft:stones")
					.addInput('C', Items.CLOTH)
					.create("crown", new ItemStack(FeaturesItems.stone_Crown, 1));
			}
			if (FeaturesItems.miscArmorEnabled == 1) {
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("HCH", "HHH")
					.addInput('H', Blocks.BLOCK_OLIVINE)
					.addInput('C', Items.CLOTH)
					.create("crown", new ItemStack(FeaturesItems.olivine_Crown, 1));
			}
			if (FeaturesItems.blockArmorEnabled == 1) {
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("HCH", "HHH")
					.addInput('H', Blocks.BEDROCK)
					.addInput('C', Items.CLOTH)
					.create("crown", new ItemStack(FeaturesItems.bedrock_Crown, 1));
			}
			if (FeaturesItems.oldArmorEnabled == 1) {
				workbenchGroup.register("plateCrownReapir", new RecipeEntryRepairable(new ItemStack(FeaturesItems.plate_Crown), new RecipeSymbol (Items.INGOT_IRON.getDefaultStack())));
				RecipeBuilder.getRecipeGroup(MOD_ID, "workbench", new RecipeSymbol(Blocks.WORKBENCH.getDefaultStack()));
			}
			if (FeaturesItems.oldArmorEnabled == 1) {
				RecipeBuilder.Shapeless(MOD_ID)
					.addInput(FeaturesItems.leather_Crown)
					.addInput(FeaturesItems.chain_Crown)
					.create("leather-chaincrown", new ItemStack(FeaturesItems.leather_Chain_Crown, 1));
				workbenchGroup.register("leather-chainCrownReapir", new RecipeEntryRepairable (new ItemStack(FeaturesItems.leather_Chain_Crown), new RecipeSymbol(Items.CHAINLINK.getDefaultStack())));
				RecipeBuilder.getRecipeGroup(MOD_ID, "workbench", new RecipeSymbol(Blocks.WORKBENCH.getDefaultStack()));
			}
		}
		//bedrock armor crafting
		if (FeaturesItems.blockArmorEnabled == 1) {
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
		if (FeaturesItems.blockArmorEnabled == 1) {
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
		if (FeaturesItems.miscArmorEnabled == 1) {
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
		if (FeaturesItems.oldArmorEnabled == 1) {
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
		if (FeaturesItems.newToolsEnabled == 1) {
			RecipeBuilder.Shaped(MOD_ID)
				.setShape(" W", "S ")
				.addInput('S', Items.STICK)
				.addInput('W', Blocks.WORKBENCH)
				.create("craftingOnAStick", new ItemStack(FeaturesItems.workbench_On_Stick, 1));
		}
		//bomb quiver crafting
		if (FeaturesItems.treasureEnabled == 1) {
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("S S", "CCC", "LLL")
				.addInput('S', Items.STRING)
				.addInput('L', Items.LEATHER)
				.addInput('C', Items.CLOTH)
				.create("bomBagCraft", new ItemStack(FeaturesItems.bomb_Bag, 1, 48));
		}
		//plate armor repairing
		if (FeaturesItems.oldArmorEnabled == 1) {
			workbenchGroup.register("plateHelmetReapir", new RecipeEntryRepairable(new ItemStack(FeaturesItems.plate_Helmet), new RecipeSymbol (Items.INGOT_IRON.getDefaultStack())));
			RecipeBuilder.getRecipeGroup(MOD_ID, "workbench", new RecipeSymbol(Blocks.WORKBENCH.getDefaultStack()));
			workbenchGroup.register("plateChestplateReapir", new RecipeEntryRepairable(new ItemStack(FeaturesItems.plate_Helmet), new RecipeSymbol (Items.INGOT_IRON.getDefaultStack())));
			RecipeBuilder.getRecipeGroup(MOD_ID, "workbench", new RecipeSymbol(Blocks.WORKBENCH.getDefaultStack()));
		}
		//rainbow flower stuff
		if (FeaturesBlocks.plantEnabled == 1){
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
				.create("cookingham", new ItemStack(FeaturesBlocks.ham_Cooked));

			RecipeBuilder.BlastFurnace(MOD_ID)
				.setInput(FeaturesBlocks.ham)
				.create("cookingham", new ItemStack(FeaturesBlocks.ham_Cooked));
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
				.create("climbpickcraft", new ItemStack(FeaturesItems.climb_Pickaxe_Wood));
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("MM ", "MSH", " S ")
				.addInput('S', Items.STICK)
				.addInput('M', "minecraft:cobblestones")
				.addInput('H', "minecraft:stones")
				.create("climbpickcraft", new ItemStack(FeaturesItems.climb_Pickaxe_Stone));
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
				.create("hammercraft", new ItemStack(FeaturesItems.mining_Hammer_Wood));
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("HMH", "MSM", " S ")
				.addInput('S', Items.STICK)
				.addInput('M', "minecraft:cobblestones")
				.addInput('H', "minecraft:stones")
				.create("hammercraft", new ItemStack(FeaturesItems.mining_Hammer_Stone));
			for (int i = 0; i < 4; i++){
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("HMH", "MSM", " S ")
					.addInput('S', Items.STICK)
					.addInput('M', Item.itemsList[toolMaterial[i]])
					.addInput('H', Item.itemsList[toolHeavyMaterial[i]])
					.create("hammercraft", new ItemStack(hammerResult[i]));
			}
		}

		if (FeaturesBlocks.miscBlocksEnabled == 1){
			RecipeBuilder.Shapeless(MOD_ID)
				.addInput(FeaturesBlocks.burned_Log)
				.create("burnedlogsintoplanks", new ItemStack(Blocks.PLANKS_OAK_PAINTED, 4, 15));
		}

		if (FeaturesItems.miscItemsEnabled == 1){
			RecipeBuilder.Shaped(MOD_ID)
				.setShape(" S ", "LCL", " L ")
				.addInput('S', Items.STRING)
				.addInput('L', Items.LEATHER)
				.addInput('C', Items.CLOTH)
				.create("bomBagCraft", new ItemStack(FeaturesItems.fertilizer_Bag, 1, 192));
		}
	}
}
