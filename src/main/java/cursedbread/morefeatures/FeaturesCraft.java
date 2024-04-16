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
		for (int j = 0; j < crownMaterial.length; j++) {
			Item material = Item.itemsList[crownMaterial[j]];
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("H H", "HHH")
				.addInput('H', material)
				.create("dandelionCrown", new ItemStack(crownResult[j], 1));
		}


		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "H H")
			.addInput('H', Block.bedrock)
			.create("cherryCrown", new ItemStack(FeaturesMain.bedrockHelmet, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("H H", "HHH", "HHH")
			.addInput('H', Block.bedrock)
			.create("cherryCrown", new ItemStack(FeaturesMain.bedrockChestplate, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "H H", "H H")
			.addInput('H', Block.bedrock)
			.create("cherryCrown", new ItemStack(FeaturesMain.bedrockLeggings, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("H H", "H H")
			.addInput('H', Block.bedrock)
			.create("cherryCrown", new ItemStack(FeaturesMain.bedrockBoots, 1));

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(" W", "S ")
			.addInput('S', Item.stick)
			.addInput('W', Block.workbench)
			.create("cherryCrown", new ItemStack(FeaturesMain.workbenchOnStick, 1));
	}
}
