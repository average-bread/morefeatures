package cursedbread.morefeatures.mixin.itemsmixins.fuels;

import cursedbread.morefeatures.item.FeaturesItems;
import net.minecraft.core.crafting.LookupFuelFurnace;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = LookupFuelFurnace.class, remap = false)

public abstract class FurnanceBlastFuelMixin {
	@Shadow
	public abstract void addFuelEntry(int id, int fuelYield);

	@Inject(method = "register()V", at = @At("TAIL"))
	protected void register(CallbackInfo ci) {
		this.addFuelEntry(FeaturesItems.olivineHelmet.id, 8000);
		this.addFuelEntry(FeaturesItems.olivineChestplate.id, 12800);
		this.addFuelEntry(FeaturesItems.olivineLeggings.id, 11200);
		this.addFuelEntry(FeaturesItems.olivineBoots.id, 6400);
		this.addFuelEntry(FeaturesItems.olivineCrown.id, 8000);
	}
}
