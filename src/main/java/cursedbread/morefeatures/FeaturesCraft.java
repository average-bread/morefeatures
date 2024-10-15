package cursedbread.morefeatures;

import cursedbread.morefeatures.blocks.FeaturesBlocks;
import cursedbread.morefeatures.item.FeaturesItems;
import net.minecraft.core.block.Block;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.data.registry.recipe.RecipeGroup;
import net.minecraft.core.data.registry.recipe.RecipeSymbol;
import net.minecraft.core.data.registry.recipe.entry.RecipeEntryCrafting;
import net.minecraft.core.data.registry.recipe.entry.RecipeEntryRepairable;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.util.RecipeEntrypoint;
import goocraft4evr.nonamedyes.item.ModItems;


public class FeaturesCraft implements RecipeEntrypoint {

	public static final String MOD_ID = "morefeatures";
	public static  final RecipeGroup<RecipeEntryCrafting<?, ?>> workbenchGroup = ((RecipeGroup<RecipeEntryCrafting<?, ?>>) RecipeBuilder.getRecipeGroup(MOD_ID, "workbench", new RecipeSymbol(Block.workbench.getDefaultStack())));

	public static int[] flowerMaterial = {
		Block.flowerYellow.id,
		Block.flowerRed.id,
		Block.leavesCherryFlowering.id,
		Block.deadbush.id,
		Block.flowerPink.id,
		Block.flowerPurple.id,
		Block.flowerLightBlue.id,
		Block.flowerOrange.id
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
		Item.leather.id,
		Item.ingotIron.id,
		Item.ingotGold.id,
		Item.diamond.id,
		Item.ingotSteel.id
	};

	public static Item[] regularcrownResult = {
		FeaturesItems.leatherCrown,
		FeaturesItems.ironCrown,
		FeaturesItems.goldCrown,
		FeaturesItems.diamondCrown,
		FeaturesItems.steelCrown
	};

	public static int[] smallsquireMaterial = {
		Item.foodPorkchopRaw.id,
		Item.foodPorkchopCooked.id
	};

	public static Block[] smallsquireResult = {
		FeaturesBlocks.ham,
		FeaturesBlocks.cookedham
	};

	public static int[] paxelCraftAxeMaterial = {
		Item.toolAxeWood.id,
		Item.toolAxeStone.id,
		Item.toolAxeIron.id,
		Item.toolAxeGold.id,
		Item.toolAxeDiamond.id,
		Item.toolAxeSteel.id
	};
	public static int[] paxelCraftPickaxeMaterial = {
		Item.toolPickaxeWood.id,
		Item.toolPickaxeStone.id,
		Item.toolPickaxeIron.id,
		Item.toolPickaxeGold.id,
		Item.toolPickaxeDiamond.id,
		Item.toolPickaxeSteel.id
	};
	public static int[] paxelCraftShovelMaterial = {
		Item.toolShovelWood.id,
		Item.toolShovelStone.id,
		Item.toolShovelIron.id,
		Item.toolShovelGold.id,
		Item.toolShovelDiamond.id,
		Item.toolShovelSteel.id
	};
	public static int[] paxelCraftSwordMaterial = {
		Item.toolSwordWood.id,
		Item.toolSwordStone.id,
		Item.toolSwordIron.id,
		Item.toolSwordGold.id,
		Item.toolSwordDiamond.id,
		Item.toolSwordSteel.id
	};

	public static Item[] paxelCraftResult = {
		FeaturesItems.paxelWood,
		FeaturesItems.paxelStone,
		FeaturesItems.paxelIron,
		FeaturesItems.paxelGold,
		FeaturesItems.paxelDiamond,
		FeaturesItems.paxelSteel
	};

	@Override
	public void initNamespaces() {
		RecipeBuilder.initNameSpace(FeaturesMain.MOD_ID);
		RecipeBuilder.getRecipeNamespace(FeaturesMain.MOD_ID);
		if (FeaturesMain.nonamedyesOn) {
			if (FeaturesBlocks.glassEnabled == 1) {
				Registries.ITEM_GROUPS.register("morefeatures:glowstones", Registries.stackListOf(
					Block.glowstone,
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

			if (FeaturesBlocks.paperwallEnabled == 1){
				Registries.ITEM_GROUPS.register("morefeatures:paperwall", Registries.stackListOf(Block.paperWall, new ItemStack(FeaturesBlocks.vanillaColoredPaperwall, 1, 0),
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

			if (FeaturesBlocks.glassEnabled == 1){
				Registries.ITEM_GROUPS.register("morefeatures:glasses", Registries.stackListOf(
					Block.glass,
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
			if (FeaturesBlocks.glowstoneEnabled == 1){
				Registries.ITEM_GROUPS.register("morefeatures:glowstones", Registries.stackListOf(
					Block.glowstone,
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

			if (FeaturesBlocks.paperwallEnabled == 1){
				Registries.ITEM_GROUPS.register("morefeatures:paperwall", Registries.stackListOf(Block.paperWall, new ItemStack(FeaturesBlocks.vanillaColoredPaperwall, 1, 0),
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

			if (FeaturesBlocks.glassEnabled == 1){
				Registries.ITEM_GROUPS.register("morefeatures:glasses", Registries.stackListOf(
					Block.glass,
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
			}
		}
	}
	@Override
	public void onRecipesReady() {
		//colored glowstone crafting
		if (FeaturesBlocks.glowstoneEnabled == 1) {
			for (int i = 0; i <=15; i++) {
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("GGG", "GDG", "GGG")
					.addInput('D', Item.dye, i)
					.addInput('G', "morefeatures:glowstones")
					.create("itemGroupExample", new ItemStack(FeaturesBlocks.vanillaColoredGlowstone, 8, 15 - i));
			}

			RecipeBuilder.Shaped(MOD_ID)
				.setShape("GGG", "GDG", "GGG")
				.addInput('D', Item.bucketWater)
				.addInput('G', "morefeatures:glowstones")
				.create("itemGroupExample", new ItemStack(Block.glowstone, 8));
			if (FeaturesMain.nonamedyesOn) {
				for (int i = 0; i <=13; i++) {
					RecipeBuilder.Shaped(MOD_ID)
						.setShape("GGG", "GDG", "GGG")
						.addInput('D', ModItems.dye, i)
						.addInput('G', "morefeatures:glowstones")
						.create("itemGroupExample", new ItemStack(FeaturesBlocks.nonameColoredGlowstone, 8, i));
				}
			}
		}
		//colored paper walls crafting
		if (FeaturesBlocks.paperwallEnabled == 1) {
			for (int i = 0; i <=15; i++){
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("GGG", "GDG", "GGG")
					.addInput('D', Item.dye, i)
					.addInput('G', "morefeatures:paperwall")
					.create("itemGroupExample", new ItemStack(FeaturesBlocks.vanillaColoredPaperwall, 8, 15-i));
			}

			if (FeaturesMain.nonamedyesOn) {
				for (int i = 0; i <=13; i++) {
					RecipeBuilder.Shaped(MOD_ID)
						.setShape("GGG", "GDG", "GGG")
						.addInput('D', ModItems.dye, i)
						.addInput('G', "morefeatures:paperwall")
						.create("itemGroupExample", new ItemStack(FeaturesBlocks.nonameColoredPaperwall, 8, i));
				}
			}

			RecipeBuilder.Shaped(MOD_ID)
				.setShape("GGG", "GDG", "GGG")
				.addInput('D', Item.bucketWater)
				.addInput('G', "morefeatures:paperwall")
				.create("itemGroupExample", new ItemStack(Block.paperWall, 8));
		}
		//colored glass crafting
		if (FeaturesBlocks.glassEnabled == 1) {
			for (int i = 0; i <=15; i++) {
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("GGG", "GDG", "GGG")
					.addInput('D', Item.dye, i)
					.addInput('G', "morefeatures:glasses")
					.create("itemGroupExample", new ItemStack(FeaturesBlocks.vanillaColoredGlass, 8, 15 - i));
			}

			RecipeBuilder.Shaped(MOD_ID)
				.setShape("GGG", "GDG", "GGG")
				.addInput('D', Item.bucketWater)
				.addInput('G', "morefeatures:glasses")
				.create("itemGroupExample", new ItemStack(Block.glowstone, 8));
			if (FeaturesMain.nonamedyesOn) {
				for (int i = 0; i <=13; i++) {
					RecipeBuilder.Shaped(MOD_ID)
						.setShape("GGG", "GDG", "GGG")
						.addInput('D', ModItems.dye, i)
						.addInput('G', "morefeatures:glasses")
						.create("itemGroupExample", new ItemStack(FeaturesBlocks.nonameColoredGlass, 8, i));
				}
			}
		}
		//gilding block crafting
		if (FeaturesBlocks.gildingtableEnabled == 1) {
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("HHH", "DDD", "EEE")
				.addInput('H', Block.blockGold)
				.addInput('D', Block.slate)
				.addInput('E', Block.slatePolished)
				.create("gilderCraft", new ItemStack(FeaturesBlocks.gildingTable, 1));
		}

		//flower crowns crafting
		if (FeaturesItems.flowerCrownEnabled == 1) {
			for (int j = 0; j < flowerMaterial.length; j++) {
				Item material = Item.itemsList[flowerMaterial[j]];
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("HHH", "H H", "HHH")
					.addInput('H', material)
					.create("rown", new ItemStack(flowercrownResult[j], 1));
			}
		}
		//regular crown crafting
		if (FeaturesItems.regularCrownEnabled == 1) {
			for (int j = 0; j < regularMaterial.length; j++) {
				Item material = Item.itemsList[regularMaterial[j]];
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("HCH", "HHH")
					.addInput('H', material)
					.addInput('C', Item.cloth)
					.create("crown", new ItemStack(regularcrownResult[j], 1));
			}
			workbenchGroup.register("chainCrownReapir", new RecipeEntryRepairable(FeaturesItems.chainCrown, Item.chainlink));
			RecipeBuilder.getRecipeGroup(MOD_ID, "workbench", new RecipeSymbol(Block.workbench.getDefaultStack()));
			if (FeaturesItems.stoneArmorEnabled == 1) {
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("HCH", "HHH")
					.addInput('H', "minecraft:stones")
					.addInput('C', Item.cloth)
					.create("crown", new ItemStack(FeaturesItems.stoneCrown, 1));
			}
			if (FeaturesItems.olivineArmorEnabled == 1) {
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("HCH", "HHH")
					.addInput('H', Item.olivine)
					.addInput('C', Item.cloth)
					.create("crown", new ItemStack(FeaturesItems.olivineCrown, 1));
			}
			if (FeaturesItems.bedrockArmorEnabled == 1) {
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("HCH", "HHH")
					.addInput('H', Block.bedrock)
					.addInput('C', Item.cloth)
					.create("crown", new ItemStack(FeaturesItems.bedrockCrown, 1));
			}
			if (FeaturesItems.plateArmorEnabled == 1) {
				workbenchGroup.register("plateCrownReapir", new RecipeEntryRepairable(FeaturesItems.plateCrown, Item.ingotIron));
				RecipeBuilder.getRecipeGroup(MOD_ID, "workbench", new RecipeSymbol(Block.workbench.getDefaultStack()));
			}
			if (FeaturesItems.leatherchainArmorEnabled == 1) {
				RecipeBuilder.Shapeless(MOD_ID)
					.addInput(FeaturesItems.leatherCrown)
					.addInput(FeaturesItems.chainCrown)
					.create("leather-chaincrown", new ItemStack(FeaturesItems.leatherChainCrown, 1));
				workbenchGroup.register("leather-chainCrownReapir", new RecipeEntryRepairable(FeaturesItems.leatherChainCrown, Item.chainlink));
				RecipeBuilder.getRecipeGroup(MOD_ID, "workbench", new RecipeSymbol(Block.workbench.getDefaultStack()));
			}
		}
		//bedrock armor crafting
		if (FeaturesItems.bedrockArmorEnabled == 1) {
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("HHH", "H H")
				.addInput('H', Block.bedrock)
				.create("helmets", new ItemStack(FeaturesItems.bedrockHelmet, 1));
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("H H", "HHH", "HHH")
				.addInput('H', Block.bedrock)
				.create("chectplates", new ItemStack(FeaturesItems.bedrockChestplate, 1));
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("HHH", "H H", "H H")
				.addInput('H', Block.bedrock)
				.create("leggings", new ItemStack(FeaturesItems.bedrockLeggings, 1));
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("H H", "H H")
				.addInput('H', Block.bedrock)
				.create("boots", new ItemStack(FeaturesItems.bedrockBoots, 1));
		}
		//stone armor crafting
		if (FeaturesItems.stoneArmorEnabled == 1) {
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
		if (FeaturesItems.olivineArmorEnabled == 1) {
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("HHH", "H H")
				.addInput('H', Item.olivine)
				.create("helmets", new ItemStack(FeaturesItems.olivineHelmet, 1));
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("H H", "HHH", "HHH")
				.addInput('H', Item.olivine)
				.create("chectplates", new ItemStack(FeaturesItems.olivineChestplate, 1));
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("HHH", "H H", "H H")
				.addInput('H', Item.olivine)
				.create("leggings", new ItemStack(FeaturesItems.olivineLeggings, 1));
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("H H", "H H")
				.addInput('H', Item.olivine)
				.create("boots", new ItemStack(FeaturesItems.olivineBoots, 1));
		}
		//leather-chain armor crafting and repairing
		if (FeaturesItems.leatherchainArmorEnabled == 1) {
			RecipeBuilder.Shapeless(MOD_ID)
				.addInput(Item.armorHelmetLeather)
				.addInput(Item.armorHelmetChainmail)
				.create("leather-chainHelmet", new ItemStack(FeaturesItems.leatherChainHelmet, 1));
			RecipeBuilder.Shapeless(MOD_ID)
				.addInput(Item.armorChestplateLeather)
				.addInput(Item.armorChestplateChainmail)
				.create("leather-chainChestplate", new ItemStack(FeaturesItems.leatherChainChestplate, 1));
			RecipeBuilder.Shapeless(MOD_ID)
				.addInput(Item.armorLeggingsLeather)
				.addInput(Item.armorLeggingsChainmail)
				.create("leather-chainLeggings", new ItemStack(FeaturesItems.leatherChainLeggings, 1));
			RecipeBuilder.Shapeless(MOD_ID)
				.addInput(Item.armorBootsLeather)
				.addInput(Item.armorBootsChainmail)
				.create("leather-chainBoots", new ItemStack(FeaturesItems.leatherChainBoots, 1));

			workbenchGroup.register("leather-chainHelmetReapir", new RecipeEntryRepairable(FeaturesItems.leatherChainHelmet, Item.chainlink));
			RecipeBuilder.getRecipeGroup(MOD_ID, "workbench", new RecipeSymbol(Block.workbench.getDefaultStack()));
			workbenchGroup.register("leather-chainHelmetReapir", new RecipeEntryRepairable(FeaturesItems.leatherChainChestplate, Item.chainlink));
			RecipeBuilder.getRecipeGroup(MOD_ID, "workbench", new RecipeSymbol(Block.workbench.getDefaultStack()));
			workbenchGroup.register("leather-chainChestplateReapir", new RecipeEntryRepairable(FeaturesItems.leatherChainLeggings, Item.chainlink));
			RecipeBuilder.getRecipeGroup(MOD_ID, "workbench", new RecipeSymbol(Block.workbench.getDefaultStack()));
			workbenchGroup.register("leather-chainLeggingsReapir", new RecipeEntryRepairable(FeaturesItems.leatherChainBoots, Item.chainlink));
			RecipeBuilder.getRecipeGroup(MOD_ID, "workbench", new RecipeSymbol(Block.workbench.getDefaultStack()));
			workbenchGroup.register("leather-chainBootsReapir", new RecipeEntryRepairable(FeaturesItems.leatherChainBoots, Item.chainlink));
			RecipeBuilder.getRecipeGroup(MOD_ID, "workbench", new RecipeSymbol(Block.workbench.getDefaultStack()));
		}
		//workbench on a stick crafting
		if (FeaturesItems.workbenchonstickEnabled == 1) {
			RecipeBuilder.Shaped(MOD_ID)
				.setShape(" W", "S ")
				.addInput('S', Item.stick)
				.addInput('W', Block.workbench)
				.create("craftingOnAStick", new ItemStack(FeaturesItems.workbenchOnStick, 1));
		}
		//bomb quiver crafting
		if (FeaturesItems.bombQuibersEnabled == 1) {
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("S S", "CCC", "LLL")
				.addInput('S', Item.string)
				.addInput('L', Item.leather)
				.addInput('C', Item.cloth)
				.create("bomBagCraft", new ItemStack(FeaturesItems.bombBag, 1, 48));
		}
		//plate armor repairing
		if (FeaturesItems.plateArmorEnabled == 1) {
			workbenchGroup.register("plateHelmetReapir", new RecipeEntryRepairable(FeaturesItems.plateHelmet, Item.ingotIron));
			RecipeBuilder.getRecipeGroup(MOD_ID, "workbench", new RecipeSymbol(Block.workbench.getDefaultStack()));
			workbenchGroup.register("plateChestplateReapir", new RecipeEntryRepairable(FeaturesItems.plateChestplate, Item.ingotIron));
			RecipeBuilder.getRecipeGroup(MOD_ID, "workbench", new RecipeSymbol(Block.workbench.getDefaultStack()));
		}
		//rainbow flower stuff
		if (FeaturesBlocks.rainbowflowerEnabled == 1){
			for (int i = 0; i <= 15; i++) {
				RecipeBuilder.Shapeless(MOD_ID)
					.addInput(FeaturesBlocks.rainbowFlower)
					.addInput(Item.dye, i)
					.create("dye-cloning", new ItemStack(Item.dye, 3, i));
			}
			if (FeaturesMain.nonamedyesOn) {
				for (int i = 0; i <= 12; i++) {
					RecipeBuilder.Shapeless(MOD_ID)
						.addInput(FeaturesBlocks.rainbowFlower)
						.addInput(ModItems.dye, i)
						.create("dye-cloning", new ItemStack(ModItems.dye, 3, i));
				}
			}
		}

		if (FeaturesBlocks.hamEnabled == 1) {
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

		if (FeaturesItems.paxelsEnabled == 1){
			for (int i = 0; i < 6; i++){
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("APH", " W ", " S ")
					.addInput('S', Item.stick)
					.addInput('A', Item.itemsList[paxelCraftAxeMaterial[i]])
					.addInput('P', Item.itemsList[paxelCraftPickaxeMaterial[i]])
					.addInput('H', Item.itemsList[paxelCraftShovelMaterial[i]])
					.addInput('W', Item.itemsList[paxelCraftSwordMaterial[i]])
					.create("paxelcraft", new ItemStack(paxelCraftResult[i]));
			}
		}
	}
}
