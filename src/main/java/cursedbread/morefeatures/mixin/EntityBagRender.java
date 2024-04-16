package cursedbread.morefeatures.mixin;

import cursedbread.morefeatures.item.ItemBombQuiver;
import net.minecraft.client.Minecraft;
import net.minecraft.client.render.EntityRenderDispatcher;
import net.minecraft.client.render.RenderEngine;
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
	@Unique
	String quiver_texture_path = "/armor/quiver.png";

	@Unique
	String bomb_bag_texture_path = "/armor/bagnormal_1.png";

	@Inject(method = "loadTexture", at = @At("HEAD"), cancellable = true)
	protected void loadTexture(String texturePath, CallbackInfo ci) {
		if (texturePath.equals(quiver_texture_path)) {
			ItemStack chest_item = Minecraft.getMinecraft(this).thePlayer.inventory.armorItemInSlot(2);
			if (chest_item != null && chest_item.getItem() instanceof ItemBombQuiver) {
				EntityRenderer<?> thisAs = (EntityRenderer<?>) (Object) this;
				RenderEngine renderEngine = thisAs.renderDispatcher.renderEngine;
				renderEngine.bindTexture(renderEngine.getTexture(bomb_bag_texture_path));
				ci.cancel();
			}
		}
	}
}
