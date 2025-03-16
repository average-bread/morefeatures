package cursedbread.morefeatures.mixin;

import cursedbread.morefeatures.FeaturesMain;
import cursedbread.morefeatures.item.FeaturesItems;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.core.Global;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.Mob;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.ICarriable;
import net.minecraft.core.world.World;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Objects;

@Mixin(value = Player.class, remap = false)
public abstract class EntityPlayerMixin extends Mob {
	@Shadow
	protected float baseSpeed;

	public EntityPlayerMixin(World world) {
		super(world);
	}

	@Unique
	public void bedrockProtection(){
		if (FeaturesItems.blockArmorEnabled == 1){
			ItemStack helmet_item = Minecraft.getMinecraft().thePlayer.inventory.armorItemInSlot(3);
			ItemStack chest_item = Minecraft.getMinecraft().thePlayer.inventory.armorItemInSlot(2);
			ItemStack leggings_item = Minecraft.getMinecraft().thePlayer.inventory.armorItemInSlot(1);
			ItemStack boots_item = Minecraft.getMinecraft().thePlayer.inventory.armorItemInSlot(0);
			if (
				(helmet_item != null && helmet_item.getItem().equals(FeaturesItems.bedrockHelmet)) ||
				(helmet_item != null && helmet_item.getItem().equals(FeaturesItems.bedrockCrown)) ||
				(chest_item != null && chest_item.getItem().equals(FeaturesItems.bedrockChestplate)) ||
				(leggings_item != null && leggings_item.getItem().equals(FeaturesItems.bedrockLeggings)) ||
				(boots_item != null && boots_item.getItem().equals(FeaturesItems.bedrockBoots))
			){
				this.heal(100);
			}
		}
	}

	@Unique
	public void speedOlivine(){
		if (FeaturesItems.miscArmorEnabled == 1){
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
			if ((helmet_item != null && helmet_item.getItem().equals(FeaturesItems.olivineHelmet)) || (helmet_item != null && FeaturesItems.crownsEnabled == 1 && helmet_item.getItem().equals(FeaturesItems.olivineCrown))) {
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

	@Unique
	private Boolean gameFullBright = null;
	@Unique
	private boolean toggledFullBright = false;

	@Unique
	public void CatVision(){
		if (FeaturesItems.treasureEnabled == 1){
			Minecraft mc = Minecraft.getMinecraft();
			ItemStack helmet_item = Minecraft.getMinecraft().thePlayer.inventory.armorItemInSlot(3);
			if (gameFullBright == null){
				gameFullBright = mc.fullbright;
			}
			if (helmet_item != null && helmet_item.getItem().equals(FeaturesItems.catHelmet)){
				if (!toggledFullBright && mc.fullbright)
					gameFullBright = true;

				if (!toggledFullBright) {
					if (!mc.fullbright) {
						mc.fullbright = true;
						mc.renderGlobal.loadRenderers();
					}
					toggledFullBright = true;
				}

				if (!mc.fullbright) {
					gameFullBright = !gameFullBright;
					mc.fullbright = true;
					mc.renderGlobal.loadRenderers();
				}
			} else {
				if (toggledFullBright) {
					mc.fullbright = gameFullBright;
					toggledFullBright = false;
					mc.renderGlobal.loadRenderers();
				}
			}
		}
	}

	@Inject(method = "onLivingUpdate()V", at = @At("TAIL"))
	private void armor_effects(CallbackInfo ci) {
		if (FeaturesItems.blockArmorEnabled == 1){
			bedrockProtection();
		}

		if (FeaturesItems.miscArmorEnabled == 1 && !Global.isServer){
			speedOlivine();
		}

		if (FeaturesItems.treasureEnabled == 1 && !Global.isServer){
			CatVision();
		}
	}
}
