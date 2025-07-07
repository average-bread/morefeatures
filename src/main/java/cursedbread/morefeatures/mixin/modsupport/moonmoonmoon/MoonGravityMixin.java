package cursedbread.morefeatures.mixin.modsupport.moonmoonmoon;

import com.bawnorton.mixinsquared.TargetHandler;
import cursedbread.morefeatures.FeaturesMain;
import cursedbread.morefeatures.item.FeaturesItems;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import useless.moonsteel.MoonSteelItems;

@Mixin(value = Player.class, remap = false, priority = 1500)

public class MoonGravityMixin {
	@TargetHandler(mixin = "useless.moonsteel.mixin.entity.PlayerMixin", name = "moonsteel$getGravScalar")
	@Redirect(method = "@MixinSquared:Handler", at = @At(value = "INVOKE", target = "Lnet/minecraft/core/item/ItemStack;getItem()Lnet/minecraft/core/item/Item;", ordinal = 0))
	private Item addCrown(ItemStack itemstack) {
		if (FeaturesMain.moonmoonmoonOn){
			if (itemstack.getItem() == FeaturesItems.moonsteel_Crown) {
				return MoonSteelItems.ARMOR_HELMET_MOONSTEEL;
			}
			return itemstack.getItem();
		}
		return null;
	}
}
