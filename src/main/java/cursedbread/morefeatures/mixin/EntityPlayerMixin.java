package cursedbread.morefeatures.mixin;

import cursedbread.morefeatures.FeaturesMain;
import cursedbread.morefeatures.item.FeaturesItems;
import net.minecraft.client.Minecraft;
import net.minecraft.core.Global;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = Player.class, remap = false)
public abstract class EntityPlayerMixin extends Entity {
	@Shadow
	protected float baseSpeed;

	public EntityPlayerMixin(World world) {
		super(world);
	}

	public void SpeedOlivine(){
		if (FeaturesItems.olivineArmorEnabled == 1){
			ItemStack helmet_item = Minecraft.getMinecraft().thePlayer.inventory.armorItemInSlot(3);
			ItemStack chest_item = Minecraft.getMinecraft().thePlayer.inventory.armorItemInSlot(2);
			ItemStack leggings_item = Minecraft.getMinecraft().thePlayer.inventory.armorItemInSlot(1);
			ItemStack boots_item = Minecraft.getMinecraft().thePlayer.inventory.armorItemInSlot(0);
			float olivineheadboost = 0;
			float olivinetorsoboost = 0;
			float olivinelegsboost = 0;
			float olivinebootsboost = 0;
			if (chest_item != null && chest_item.getItem().equals(FeaturesItems.olivineChestplate)) {
				olivinetorsoboost = this.speed + 0.05F;
			}
			if (leggings_item != null && leggings_item.getItem().equals(FeaturesItems.olivineLeggings)) {
				olivinelegsboost = this.speed + 0.03F;
			}
			if ((helmet_item != null && helmet_item.getItem().equals(FeaturesItems.olivineHelmet)) || (helmet_item != null && FeaturesItems.regularCrownEnabled == 1 && helmet_item.getItem().equals(FeaturesItems.olivineCrown))) {
				olivineheadboost = this.speed + 0.01F;
			}
			if (boots_item != null && boots_item.getItem().equals(FeaturesItems.olivineBoots)) {
				olivinebootsboost = this.speed + 0.01F;
			}
			float olivineboost = olivineheadboost + olivinetorsoboost + olivinelegsboost + olivinebootsboost;
			if (olivineboost > 0){
				this.speed = (float)((double)this.speed + (double)this.baseSpeed * olivineboost);
			} else if (!this.isSprinting()) {
				this.speed = this.baseSpeed;
			}
		}
	}

	@Inject(method = "onLivingUpdate()V", at = @At("TAIL"))
	private void armor_effects(CallbackInfo ci) {
		if (FeaturesItems.olivineArmorEnabled == 1 && !Global.isServer){
			SpeedOlivine();
		}
	}
}
