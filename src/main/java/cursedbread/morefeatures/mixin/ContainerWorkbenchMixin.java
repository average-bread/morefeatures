package cursedbread.morefeatures.mixin;

import cursedbread.morefeatures.item.FeaturesItems;
import net.minecraft.core.block.Block;
import net.minecraft.core.player.inventory.ContainerWorkbench;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;
import net.minecraft.core.util.helper.Side;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = ContainerWorkbench.class, remap = false)
public abstract class ContainerWorkbenchMixin {
    @Inject(method = "isUsableByPlayer", at = @At(value = "RETURN"), cancellable = true)
    public void isUsableByPlayer(EntityPlayer player, CallbackInfoReturnable<Boolean> cir) {
        if (FeaturesItems.workbenchonstickEnabled == 1 && player.getHeldItem() != null && player.getHeldItem().itemID == FeaturesItems.workbenchOnStick.id) {
            cir.setReturnValue(true);
        }
    }
}