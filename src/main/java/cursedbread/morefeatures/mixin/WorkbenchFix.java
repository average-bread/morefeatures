package cursedbread.morefeatures.mixin;

import net.minecraft.core.block.Block;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.player.inventory.ContainerWorkbench;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value= ContainerWorkbench.class,remap=false)
public class WorkbenchFix {

	@Inject(method = "Lnet/minecraft/core/player/inventory/ContainerWorkbench;isUsableByPlayer(Lnet/minecraft/core/entity/player/EntityPlayer;)Z", at = @At(value = "HEAD"), cancellable = true)
	private void injectMethod(EntityPlayer player, CallbackInfoReturnable<Boolean> cir){
		cir.setReturnValue(true);
	}
}
