package cursedbread.morefeatures.mixin;

import cursedbread.morefeatures.item.artifacts.ItemBombQuiver;
import cursedbread.morefeatures.item.artifacts.ItemBombQuiverEndless;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.render.EntityRenderDispatcher;
import net.minecraft.client.render.TextureManager;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.core.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
@Mixin(value = EntityRenderer.class, remap = false)
public class EntityBagRender{
	@Shadow
	public EntityRenderDispatcher renderDispatcher;
	@Unique
	String quiver_texture_path = "/assets/minecraft/textures/armor/quiver.png";

	@Unique
	String gold_quiver_texture_path = "/assets/minecraft/textures/armor/quiver_golden.png";

	@Unique
	String bomb_quiver_texture_path = "/assets/morefeatures/textures/armor/other/bag_bag_normal_1.png";

	@Unique
	String bomb_golden_quiver_texture_path = "/assets/morefeatures/textures/armor/other/bag_bag_gold_1.png";

	@Inject(method = "bindTexture", at = @At("HEAD"), cancellable = true)
	@Environment(EnvType.CLIENT)
	protected void bindTexture(String texturePath, CallbackInfo ci) {
		if (texturePath.equals(quiver_texture_path)) {
			ItemStack chest_item = Minecraft.getMinecraft().thePlayer.inventory.armorItemInSlot(2);
			if (chest_item != null && chest_item.getItem() instanceof ItemBombQuiver) {
				TextureManager textureManager = this.renderDispatcher.textureManager;
				textureManager.bindTexture(textureManager.loadTexture(bomb_quiver_texture_path));
				ci.cancel();
			}
		}

		if (texturePath.equals(gold_quiver_texture_path)) {
			ItemStack chest_item = Minecraft.getMinecraft().thePlayer.inventory.armorItemInSlot(2);
			if (chest_item != null && chest_item.getItem() instanceof ItemBombQuiverEndless) {
				TextureManager textureManager = this.renderDispatcher.textureManager;
				textureManager.bindTexture(textureManager.loadTexture(bomb_golden_quiver_texture_path));
				ci.cancel();
			}
		}
	}
}
