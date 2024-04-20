package cursedbread.morefeatures.mixin;

import cursedbread.morefeatures.item.FeaturesItems;
import net.minecraft.core.block.Block;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemHandCannonUnloaded;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.generate.feature.WorldFeatureLabyrinth;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Random;

@Mixin(value = WorldFeatureLabyrinth.class, remap = false)
public class DungeonLootMixin {
	@Shadow
	private boolean treasureGenerated;
	@Shadow
	private int dungeonSize;

	@Inject(method = "pickCheckLootItem", at = @At("HEAD"), cancellable = true)
	private void pickCheckLootItem(Random random, CallbackInfoReturnable<ItemStack> cir) {
		int i = random.nextInt(68);
		if (i == 16) {
			cir.setReturnValue( new ItemStack(FeaturesItems.bombBagGold));
		}
		int j = random.nextInt(32);
		if (j == 1) {
			cir.setReturnValue( new ItemStack(FeaturesItems.plateHelmet));
		} else if (j == 2) {
			cir.setReturnValue( new ItemStack(FeaturesItems.plateChestplate));
		}
	}
}
