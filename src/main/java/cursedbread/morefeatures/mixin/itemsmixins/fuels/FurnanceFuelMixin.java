package cursedbread.morefeatures.mixin.itemsmixins.fuels;

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
		if (FeaturesBlocks.burnedLogEnabled == 1){
			this.addFuelEntry(FeaturesBlocks.burned_Log.id(), 1600);
		}
		if (FeaturesItems.workbenchOnStickEnabled == 1){
			this.addFuelEntry(FeaturesItems.workbench_On_Stick.id, 500);
		}
		if (FeaturesItems.paxelsEnabled == 1){
			this.addFuelEntry(FeaturesItems.paxel_Wood.id, 500);
		}
		if (FeaturesItems.climbPickaxesEnabled == 1){
			this.addFuelEntry(FeaturesItems.climb_Pickaxe_Wood.id, 500);
		}
		if (FeaturesItems.miningHammersEnabled == 1){
			this.addFuelEntry(FeaturesItems.mining_Hammer_Wood.id, 500);
		}
	}
}
