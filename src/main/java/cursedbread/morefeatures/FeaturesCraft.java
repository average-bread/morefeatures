package cursedbread.morefeatures;

import net.minecraft.core.block.Block;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.util.RecipeEntrypoint;

public class FeaturesCraft implements RecipeEntrypoint {

	public static final String MOD_ID = "morefeatures";

	public static int[] crownMaterial = {
		Block.flowerYellow.id,
		Block.flowerRed.id,
		Block.leavesCherryFlowering.id,
		Block.deadbush.id,
		Item.leather.id,
		Item.chainlink.id,
		Item.ingotIron.id,
		Item.ingotGold.id,
		Item.diamond.id,
		Item.ingotSteel.id
	};
	public static Item[] crownResult = {
		FeaturesMain.dandelionCrown,
		FeaturesMain.roseCrown,
		FeaturesMain.cherryCrown,
		FeaturesMain.deadbushCrown,
		FeaturesMain.leatherCrown,
		FeaturesMain.chainCrown,
		FeaturesMain.ironCrown,
		FeaturesMain.goldCrown,
		FeaturesMain.diamondCrown,
		FeaturesMain.steelCrown
	};

	public static int[] armorMaterial = {
		Block.bedrock.id,
		Block.blockClay.id
	};
	public static Item[] armorHelmetResult = {
		FeaturesMain.bedrockHelmet,
		FeaturesMain.plateHelmet
	};
	public static Item[] armorChestplateResult = {
		FeaturesMain.bedrockChestplate,
		FeaturesMain.plateChestplate
	};
	public static Item[] armorLeggingsResult = {
		FeaturesMain.bedrockLeggings
	};
	public static Item[] armorBootsResult = {
		FeaturesMain.bedrockBoots
	};

	@Override
	public void initNamespaces() {
		Registries.ITEM_GROUPS.register("morefeatures:glowstones", Registries.stackListOf(Block.glowstone, new ItemStack(FeaturesMain.vanillaColoredGlowstone, 1, 0),
			new ItemStack(FeaturesMain.vanillaColoredGlowstone, 1, 1),
			new ItemStack(FeaturesMain.vanillaColoredGlowstone, 1, 2),
			new ItemStack(FeaturesMain.vanillaColoredGlowstone, 1, 3),
			new ItemStack(FeaturesMain.vanillaColoredGlowstone, 1, 4),
			new ItemStack(FeaturesMain.vanillaColoredGlowstone, 1, 5),
			new ItemStack(FeaturesMain.vanillaColoredGlowstone, 1, 6),
			new ItemStack(FeaturesMain.vanillaColoredGlowstone, 1, 7),
			new ItemStack(FeaturesMain.vanillaColoredGlowstone, 1, 8),
			new ItemStack(FeaturesMain.vanillaColoredGlowstone, 1, 9),
			new ItemStack(FeaturesMain.vanillaColoredGlowstone, 1, 10),
			new ItemStack(FeaturesMain.vanillaColoredGlowstone, 1, 11),
			new ItemStack(FeaturesMain.vanillaColoredGlowstone, 1, 12),
			new ItemStack(FeaturesMain.vanillaColoredGlowstone, 1, 13),
			new ItemStack(FeaturesMain.vanillaColoredGlowstone, 1, 14),
			new ItemStack(FeaturesMain.vanillaColoredGlowstone, 1, 15)));

		Registries.ITEM_GROUPS.register("morefeatures:paperwall", Registries.stackListOf(Block.paperWall, new ItemStack(FeaturesMain.vanillaColoredPaperwall, 1, 0),
			new ItemStack(FeaturesMain.vanillaColoredPaperwall, 1, 1),
			new ItemStack(FeaturesMain.vanillaColoredPaperwall, 1, 2),
			new ItemStack(FeaturesMain.vanillaColoredPaperwall, 1, 3),
			new ItemStack(FeaturesMain.vanillaColoredPaperwall, 1, 4),
			new ItemStack(FeaturesMain.vanillaColoredPaperwall, 1, 5),
			new ItemStack(FeaturesMain.vanillaColoredPaperwall, 1, 6),
			new ItemStack(FeaturesMain.vanillaColoredPaperwall, 1, 7),
			new ItemStack(FeaturesMain.vanillaColoredPaperwall, 1, 8),
			new ItemStack(FeaturesMain.vanillaColoredPaperwall, 1, 9),
			new ItemStack(FeaturesMain.vanillaColoredPaperwall, 1, 10),
			new ItemStack(FeaturesMain.vanillaColoredPaperwall, 1, 11),
			new ItemStack(FeaturesMain.vanillaColoredPaperwall, 1, 12),
			new ItemStack(FeaturesMain.vanillaColoredPaperwall, 1, 13),
			new ItemStack(FeaturesMain.vanillaColoredPaperwall, 1, 14),
			new ItemStack(FeaturesMain.vanillaColoredPaperwall, 1, 15)));
	}
	@Override
	public void onRecipesReady() {
		for (int i = 0; i <=15; i++){
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("GGG", "GDG", "GGG")
				.addInput('D', Item.dye, i)
				.addInput('G', "morefeatures:glowstones")
				.create("itemGroupExample", new ItemStack(FeaturesMain.vanillaColoredGlowstone, 8, 15-i));
		}

		for (int i = 0; i <=15; i++){
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("GGG", "GDG", "GGG")
				.addInput('D', Item.dye, i)
				.addInput('G', "morefeatures:paperwall")
				.create("itemGroupExample", new ItemStack(FeaturesMain.vanillaColoredPaperwall, 8, 15-i));
		}
		for (int j = 0; j < crownMaterial.length; j++) {
			Item material = Item.itemsList[crownMaterial[j]];
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("H H", "HHH")
				.addInput('H', material)
				.create("dandelionCrown", new ItemStack(crownResult[j], 1));
		}


		for (int i = 0; i < armorHelmetResult.length; i++) {
			Item material = Item.itemsList[armorMaterial[i]];
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("HHH", "H H")
				.addInput('H', material)
				.create("helmets", new ItemStack(armorHelmetResult[i], 1));
		}
		for (int i = 0; i < armorChestplateResult.length; i++) {
			Item material = Item.itemsList[armorMaterial[i]];
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("H H", "HHH", "HHH")
				.addInput('H', material)
				.create("chectplates", new ItemStack(armorChestplateResult[i], 1));
		}
		for (int i = 0; i < armorLeggingsResult.length; i++) {
			Item material = Item.itemsList[armorMaterial[i]];
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("HHH", "H H", "H H")
				.addInput('H', material)
				.create("leggings", new ItemStack(armorLeggingsResult[i], 1));
		}
		for (int i = 0; i < armorBootsResult.length; i++) {
			Item material = Item.itemsList[armorMaterial[i]];
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("H H", "H H")
				.addInput('H', material)
				.create("boots", new ItemStack(armorBootsResult[i], 1));
		}

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(" W", "S ")
			.addInput('S', Item.stick)
			.addInput('W', Block.workbench)
			.create("cherryCrown", new ItemStack(FeaturesMain.workbenchOnStick, 1));

		RecipeBuilder.Shaped(MOD_ID)
		.setShape("S S", "CCC", "LLL")
			.addInput('S', Item.string)
			.addInput('L', Item.leather)
			.addInput('C', Item.cloth)
			.create("cherryCrown", new ItemStack(FeaturesMain.bombBag, 1, 48));
	}
}
