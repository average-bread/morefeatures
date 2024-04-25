package cursedbread.morefeatures.mixin;

import cursedbread.morefeatures.item.FeaturesItems;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.generate.feature.WorldFeatureLabyrinth;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Random;

@Mixin(value = WorldFeatureLabyrinth.class, remap = false)
public class LabyrinthLootMixin {

	@Inject(method = "pickCheckLootItem", at = @At("HEAD"), cancellable = true)
	private void pickCheckLootItem(Random random, CallbackInfoReturnable<ItemStack> cir) {
		if (FeaturesItems.bombQuibersEnabled == 1) {
			int i = random.nextInt(68);
			if (i == 16) {
				cir.setReturnValue( new ItemStack(FeaturesItems.bombBagGold));
			}
		}
		if (FeaturesItems.plateArmorEnabled == 1) {
			int j = random.nextInt(32);
			if (j == 1) {
				cir.setReturnValue( new ItemStack(FeaturesItems.plateHelmet, 1, FeaturesItems.plateHelmet.getMaxDamage() - random.nextInt(FeaturesItems.plateHelmet.getMaxDamage())));
			} else if (j == 2) {
				cir.setReturnValue( new ItemStack(FeaturesItems.plateChestplate, 1, FeaturesItems.plateChestplate.getMaxDamage() - random.nextInt(FeaturesItems.plateChestplate.getMaxDamage())));
			}
			if (FeaturesItems.regularCrownEnabled == 1 && j == 3){
				cir.setReturnValue( new ItemStack(FeaturesItems.plateCrown, 1, FeaturesItems.plateCrown.getMaxDamage() - random.nextInt(FeaturesItems.plateCrown.getMaxDamage())));
			}
		}
		if (FeaturesItems.regularCrownEnabled == 1) {
			int a = random.nextInt(16);
			if (a == 1) {
				cir.setReturnValue( new ItemStack(FeaturesItems.chainCrown, 1, FeaturesItems.plateHelmet.getMaxDamage() - random.nextInt(FeaturesItems.plateHelmet.getMaxDamage() / 2)));
			}
		}
	}
}
