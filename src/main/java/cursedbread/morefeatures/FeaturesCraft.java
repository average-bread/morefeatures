package cursedbread.morefeatures;

import net.minecraft.core.block.Block;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.util.RecipeEntrypoint;

public class FeaturesCraft implements RecipeEntrypoint {

	public static final String MOD_ID = "morefeatures";

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
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "H H")
			.addInput('H', Block.flowerYellow)
			.create("dandelionCrown", new ItemStack(FeaturesMain.dandelionCrown, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "H H")
			.addInput('H', Block.flowerRed)
			.create("roseCrown", new ItemStack(FeaturesMain.roseCrown, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "H H")
			.addInput('H', Block.leavesCherryFlowering)
			.create("cherryCrown", new ItemStack(FeaturesMain.cherryCrown, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "H H")
			.addInput('H', Block.deadbush)
			.create("cherryCrown", new ItemStack(FeaturesMain.deadbushCrown, 1));

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
