package cursedbread.morefeatures.mixin.itemsmixins;

import cursedbread.morefeatures.item.FeaturesItems;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.item.*;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = ItemHandCannonUnloaded.class, remap = false)
public class ItemCannonMixin {

	@Inject(method = "onUseItem", at=@At("HEAD"), cancellable = true)
	public void onUseItem(ItemStack itemstack, World world, Player entityplayer, CallbackInfoReturnable<ItemStack> cir) {
		ItemStack quiverSlot = entityplayer.inventory.armorItemInSlot(2);
		if (quiverSlot != null && quiverSlot.getItem().equals(FeaturesItems.bomb_Bag) && quiverSlot.getMetadata() < quiverSlot.getMaxDamage()) {
			entityplayer.inventory.armorItemInSlot(2).damageItem(1, entityplayer);
			itemstack.damageItem(1, entityplayer);
			world.playSoundAtEntity(entityplayer, entityplayer, "random.click", 1.0F, 1.9F);
			cir.setReturnValue(new ItemStack(Items.HANDCANNON_LOADED, 1, itemstack.getMetadata(), itemstack.getData()));
		} else if (quiverSlot != null && quiverSlot.getItem().equals(FeaturesItems.bomb_Bag_Gold)) {
			world.playSoundAtEntity(entityplayer, entityplayer, "random.click", 1.0F, 1.9F);
			cir.setReturnValue(new ItemStack(Items.HANDCANNON_LOADED, 1, itemstack.getMetadata(), itemstack.getData()));
		}
	}
}
