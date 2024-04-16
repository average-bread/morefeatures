package cursedbread.morefeatures.mixin;

import cursedbread.morefeatures.FeaturesMain;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.*;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = ItemHandCannonUnloaded.class, remap = false)
public class ItemCannonMixin {

	@Inject(method = "onItemRightClick", at=@At("HEAD"), cancellable = true)
	public void onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer, CallbackInfoReturnable<ItemStack> cir) {
		ItemStack quiverSlot = entityplayer.inventory.armorItemInSlot(2);
		if (quiverSlot != null && quiverSlot.getItem().equals(FeaturesMain.bombBag) && quiverSlot.getMetadata() < quiverSlot.getMaxDamage()) {
			entityplayer.inventory.armorItemInSlot(2).damageItem(1, entityplayer);
			itemstack.damageItem(1, entityplayer);
			if (entityplayer.inventory.consumeInventoryItem(Item.ammoChargeExplosive.id)) {
				entityplayer.setCurrentItem(Item.handcannonLoaded.id);
			}
			cir.setReturnValue(itemstack);
		} else if (quiverSlot != null && quiverSlot.getItem().equals(FeaturesMain.bombBagGold) && quiverSlot.getMetadata() < quiverSlot.getMaxDamage()) {
			if (entityplayer.inventory.consumeInventoryItem(Item.ammoChargeExplosive.id)) {
				entityplayer.setCurrentItem(Item.handcannonLoaded.id);
			}
			cir.setReturnValue(itemstack);
		}
	}
}
