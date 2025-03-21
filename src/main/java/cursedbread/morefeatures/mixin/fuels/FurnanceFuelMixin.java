package cursedbread.morefeatures.mixin.fuels;

import cursedbread.morefeatures.blocks.FeaturesBlocks;
import cursedbread.morefeatures.item.FeaturesItems;
import net.minecraft.core.crafting.LookupFuelFurnace;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = LookupFuelFurnace.class, remap = false)

public abstract class FurnanceFuelMixin {
	@Shadow
	public abstract void addFuelEntry(int id, int fuelYield);

	@Inject(method = "register()V", at = @At("TAIL"))
	protected void register(CallbackInfo ci) {
		this.addFuelEntry(FeaturesBlocks.burnedLog.id(), 1600);
		this.addFuelEntry(FeaturesItems.workbenchOnStick.id, 500);
		this.addFuelEntry(FeaturesItems.paxelWood.id, 500);
		this.addFuelEntry(FeaturesItems.climbPickaxeWood.id, 500);
		this.addFuelEntry(FeaturesItems.miningHammerWood.id, 500);
	}
}
