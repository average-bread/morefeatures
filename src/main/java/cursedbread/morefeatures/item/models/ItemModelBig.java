package cursedbread.morefeatures.item.models;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.ItemRenderer;
import net.minecraft.client.render.LightmapHelper;
import net.minecraft.client.render.item.model.ItemModelStandard;
import net.minecraft.client.render.tessellator.Tessellator;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.opengl.GL11;

@Environment(EnvType.CLIENT)
public class ItemModelBig extends ItemModelStandard {

	public ItemModelBig(Item item, String namespace) {
		super(item, namespace);
	}

	public void renderItem(Tessellator tessellator, ItemRenderer renderer, ItemStack itemstack, @Nullable Entity entity, float brightness, boolean handheldTransform) {
		if (this.itemfullBright || LightmapHelper.isLightmapEnabled()) {
			brightness = 1.0F;
		}

		if (handheldTransform) {
			GL11.glTranslatef(-0.0F, -0.3F, 0.0F);
			float handheldScale = 1.5F;
			GL11.glScalef(2F, 2F, 2F);
			GL11.glRotatef(50.0F, 0.0F, 1.0F, 0.0F);
			GL11.glRotatef(335.0F, 0.0F, 0.0F, 1.0F);
			GL11.glTranslatef(-0.9375F, -0.0625F, 0.0F);
		}

		this.renderItemInWorld(tessellator, entity, itemstack, brightness, 1.0F, false);
	}
}
