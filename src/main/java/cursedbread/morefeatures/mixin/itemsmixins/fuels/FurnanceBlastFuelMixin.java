package cursedbread.morefeatures.mixin.itemsmixins.fuels;

import cursedbread.morefeatures.item.FeaturesItems;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.crafting.LookupFuelFurnace;
import net.minecraft.core.crafting.LookupFuelFurnaceBlast;
import net.minecraft.core.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = LookupFuelFurnaceBlast.class, remap = false)

public abstract class FurnanceBlastFuelMixin extends LookupFuelFurnace {

	@Inject(method = "register()V", at = @At("TAIL"))
	protected void register(CallbackInfo ci) {
		if (FeaturesItems.olivineArmorEnabled == 1){
			this.addFuelEntry(FeaturesItems.olivine_Helmet.id, 8000);
			this.addFuelEntry(FeaturesItems.olivine_Chestplate.id, 12800);
			this.addFuelEntry(FeaturesItems.olivine_Leggings.id, 11200);
			this.addFuelEntry(FeaturesItems.olivine_Boots.id, 6400);
			if (FeaturesItems.normalCrownsEnabled == 1){
				this.addFuelEntry(FeaturesItems.olivine_Crown.id, 8000);
			}
		}
		if (FeaturesItems.coalChunksEnabled == 1){
			this.addFuelEntry(FeaturesItems.nethercoal_chunk.id, 200);
		}
	}
}
