package cursedbread.morefeatures.mixin.itemsmixins;

import cursedbread.morefeatures.item.FeaturesItems;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.player.inventory.slot.SlotArmor;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = SlotArmor.class, remap = false)
public class BagArmor {

	@Shadow
	@Final
	int armorType;

	@Inject(method = "mayPlace", at = @At("HEAD"), cancellable = true)
	public void canPutStackInSlot(ItemStack itemstack, CallbackInfoReturnable<Boolean> cir) {
		if ((itemstack != null && itemstack.getItem().equals(FeaturesItems.bombBag)) || itemstack != null && itemstack.getItem().equals(FeaturesItems.bombBagGold)) {
			cir.setReturnValue(this.armorType == 2);
		}
	}
}
