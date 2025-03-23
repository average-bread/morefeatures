package cursedbread.morefeatures.mixin.itemsmixins;

import net.minecraft.core.entity.player.Player;
import net.minecraft.core.player.inventory.menu.MenuCrafting;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value= MenuCrafting.class,remap=false)
public class WorkbenchFix {

	@Inject(method = "stillValid", at = @At(value = "HEAD"), cancellable = true)
	private void injectMethod(Player player, CallbackInfoReturnable<Boolean> cir){
		cir.setReturnValue(true);
	}
}
