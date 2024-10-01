package cursedbread.morefeatures.mixin;

import cursedbread.morefeatures.item.FeaturesItems;
import net.minecraft.client.Minecraft;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = EntityPlayer.class, remap = false)
public abstract class EntityPlayerMixin extends Entity {
	@Shadow
	protected float baseSpeed;

	public EntityPlayerMixin(World world) {
		super(world);
	}

	@Inject(method = "onLivingUpdate()V", at = @At("TAIL"))
	private void armor_effects(CallbackInfo ci) {
		if (FeaturesItems.olivineArmorEnabled == 1 && !world.isClientSide){
			ItemStack helmet_item = Minecraft.getMinecraft(this).thePlayer.inventory.armorItemInSlot(3);
			ItemStack chest_item = Minecraft.getMinecraft(this).thePlayer.inventory.armorItemInSlot(2);
			ItemStack leggings_item = Minecraft.getMinecraft(this).thePlayer.inventory.armorItemInSlot(1);
			ItemStack boots_item = Minecraft.getMinecraft(this).thePlayer.inventory.armorItemInSlot(0);
			float olivineboost = 0;
			if (chest_item != null && chest_item.getItem().equals(FeaturesItems.olivineChestplate)) {
				olivineboost = this.speed + 0.5f;
			} else if (leggings_item != null && leggings_item.getItem().equals(FeaturesItems.olivineLeggings)) {
				olivineboost = this.speed + 0.3f;
			} else if ((helmet_item != null && helmet_item.getItem().equals(FeaturesItems.olivineHelmet)) || (helmet_item != null && FeaturesItems.regularCrownEnabled == 1 && helmet_item.getItem().equals(FeaturesItems.olivineCrown))) {
				olivineboost = this.speed + 0.1f;
			} else  if (boots_item != null && boots_item.getItem().equals(FeaturesItems.olivineBoots)) {
				olivineboost = this.speed + 0.1f;
			}
			if (olivineboost > 0){
				this.speed = (float)((double)this.speed + (double)this.baseSpeed * olivineboost);
			} else {
				this.speed = this.baseSpeed;
			}
		}
	}
}
