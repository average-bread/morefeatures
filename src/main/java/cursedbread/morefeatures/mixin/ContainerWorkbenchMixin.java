package cursedbread.morefeatures.mixin;

import cursedbread.morefeatures.item.FeaturesItems;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.player.inventory.menu.MenuCrafting;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = MenuCrafting.class, remap = false)
public abstract class ContainerWorkbenchMixin {
    @Inject(method = "stillValid", at = @At(value = "RETURN"), cancellable = true)
    public void stillValid(Player player, CallbackInfoReturnable<Boolean> cir) {
        if (FeaturesItems.workbenchonstickEnabled == 1 && player.getHeldItem() != null && player.getHeldItem().itemID == FeaturesItems.workbenchOnStick.id) {
            cir.setReturnValue(true);
        }
    }
}
