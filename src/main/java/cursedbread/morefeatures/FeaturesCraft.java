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

public class FeaturesCraft implements RecipeEntrypoint {

	public static final String MOD_ID = "morefeatures";

	public static int[] flowerMaterial = {
		Block.flowerYellow.id,
		Block.flowerRed.id,
		Block.leavesCherryFlowering.id,
		Block.deadbush.id
	};

	public static int[] regularMaterial = {
		Item.leather.id,
		Item.ingotIron.id,
		Item.ingotGold.id,
		Item.diamond.id,
		Item.ingotSteel.id
	};
	public static Item[] flowercrownResult = {
		FeaturesItems.dandelionCrown,
		FeaturesItems.roseCrown,
		FeaturesItems.cherryCrown,
		FeaturesItems.deadbushCrown
	};

	public static Item[] regularcrownResult = {
		FeaturesItems.leatherCrown,
		FeaturesItems.ironCrown,
		FeaturesItems.goldCrown,
		FeaturesItems.diamondCrown,
		FeaturesItems.steelCrown
	};

	@Override
	public void initNamespaces() {
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
	@Override
	public void onRecipesReady() {
		RecipeGroup<RecipeEntryCrafting<?, ?>> workbenchGroup = ((RecipeGroup<RecipeEntryCrafting<?, ?>>) RecipeBuilder.getRecipeGroup(MOD_ID, "workbench", new RecipeSymbol(Block.workbench.getDefaultStack())));
		if (FeaturesBlocks.glowstaniEnabled == 1) {
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
		}

		if (FeaturesBlocks.paperwallEnabled == 1) {
			for (int i = 0; i <=15; i++){
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("GGG", "GDG", "GGG")
					.addInput('D', Item.dye, i)
					.addInput('G', "morefeatures:paperwall")
					.create("itemGroupExample", new ItemStack(FeaturesBlocks.vanillaColoredPaperwall, 8, 15-i));
			}

			RecipeBuilder.Shaped(MOD_ID)
				.setShape("GGG", "GDG", "GGG")
				.addInput('D', Item.bucketWater)
				.addInput('G', "morefeatures:paperwall")
				.create("itemGroupExample", new ItemStack(Block.paperWall, 8));
		}


		if (FeaturesItems.flowerCrownEnabled == 1) {
			for (int j = 0; j < flowerMaterial.length; j++) {
				Item material = Item.itemsList[flowerMaterial[j]];
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("H H", "HHH")
					.addInput('H', material)
					.create("rown", new ItemStack(flowercrownResult[j], 1));
			}
		}

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
		}

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

		if (FeaturesItems.workbenchonstickEnabled == 1) {
			RecipeBuilder.Shaped(MOD_ID)
				.setShape(" W", "S ")
				.addInput('S', Item.stick)
				.addInput('W', Block.workbench)
				.create("craftingOnAStick", new ItemStack(FeaturesItems.workbenchOnStick, 1));
		}

		if (FeaturesItems.bombQuibersEnabled == 1) {
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("S S", "CCC", "LLL")
				.addInput('S', Item.string)
				.addInput('L', Item.leather)
				.addInput('C', Item.cloth)
				.create("bomBagCraft", new ItemStack(FeaturesItems.bombBag, 1, 48));
		}

		if (FeaturesItems.plateArmorEnabled == 1) {
			workbenchGroup.register("plateHelmetReapir", new RecipeEntryRepairable(FeaturesItems.plateHelmet, Item.ingotIron));
			RecipeBuilder.getRecipeGroup(MOD_ID, "workbench", new RecipeSymbol(Block.workbench.getDefaultStack()));
			workbenchGroup.register("plateChestplateReapir", new RecipeEntryRepairable(FeaturesItems.plateChestplate, Item.ingotIron));
		}
	}
}
