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
		if (FeaturesItems.olivineArmorEnabled == 1 && world.isClientSide){
			ItemStack helmet_item = Minecraft.getMinecraft(this).thePlayer.inventory.armorItemInSlot(3);
			ItemStack chest_item = Minecraft.getMinecraft(this).thePlayer.inventory.armorItemInSlot(2);
			ItemStack leggings_item = Minecraft.getMinecraft(this).thePlayer.inventory.armorItemInSlot(1);
			ItemStack boots_item = Minecraft.getMinecraft(this).thePlayer.inventory.armorItemInSlot(0);
			if (chest_item != null && chest_item.getItem().equals(FeaturesItems.olivineChestplate)) {
				this.baseSpeed = 0.2f;
			} else if (leggings_item != null && leggings_item.getItem().equals(FeaturesItems.olivineLeggings)) {
				this.baseSpeed = 0.17f;
			} else if (helmet_item != null && FeaturesItems.regularCrownEnabled == 1 && helmet_item.getItem().equals(FeaturesItems.olivineCrown)) {
				this.baseSpeed = 0.15f;
			} else if (helmet_item != null && helmet_item.getItem().equals(FeaturesItems.olivineHelmet)) {
				this.baseSpeed = 0.15f;
			} else  if (boots_item != null && boots_item.getItem().equals(FeaturesItems.olivineBoots)) {
				this.baseSpeed = 0.13f;
			} else {
				this.baseSpeed = 0.1f;
			}
		}
	}
}
