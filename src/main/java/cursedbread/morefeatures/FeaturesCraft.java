package cursedbread.morefeatures;

import net.minecraft.core.block.Block;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.util.RecipeEntrypoint;

public class FeaturesCraft implements RecipeEntrypoint {

	public static final String MOD_ID = "morefeatures";

	@Override
	public void initNamespaces() {

	}
	@Override
	public void onRecipesReady() {
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "H H")
			.addInput('H', Block.flowerYellow)
			.create("dandelionCrown", new ItemStack(FeaturesMain.dandelionCrown, 1));
	}
}
