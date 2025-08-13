package cursedbread.morefeatures.entities.tnt;

import cursedbread.morefeatures.blocks.FeaturesBlocks;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.RenderBlocks;
import net.minecraft.client.render.block.model.BlockModel;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.client.render.entity.EntityRendererTNT;
import net.minecraft.client.render.tessellator.Tessellator;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.Global;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.entity.EntityPrimedTNT;
import org.lwjgl.opengl.GL11;

@Environment(EnvType.CLIENT)
public class EntityRenderX5Tnt extends EntityRendererTNT {
	private final RenderBlocks blockRenderer = new RenderBlocks();

	public void render(Tessellator tessellator, EntityPrimedTNT tnt, double x, double y, double z, float yaw, float partialTick) {
		GL11.glPushMatrix();
		GL11.glTranslatef((float)x, (float)y, (float)z);
		float f3;
		float f4;
		if ((float)tnt.fuse - partialTick + 1.0F < 10.0F) {
			f3 = 1.0F - ((float)tnt.fuse - partialTick + 1.0F) / 10.0F;
			if (f3 < 0.0F) {
				f3 = 0.0F;
			}

			if (f3 > 1.0F) {
				f3 = 1.0F;
			}

			f3 *= f3;
			f3 *= f3;
			f4 = 1.0F + f3 * 0.3F;
			GL11.glScalef(f4, f4, f4);
		}

		f3 = (1.0F - ((float)tnt.fuse - partialTick + 1.0F) / 100.0F) * 0.8F;
		TextureRegistry.blockAtlas.bind();
		f4 = tnt.getBrightness(partialTick);
		if (Global.accessor.isFullbrightEnabled()) {
			f4 = 1.0F;
		}

		BlockModel.setRenderBlocks(this.blockRenderer);
		BlockModel<?> model = (BlockModel) BlockModelDispatcher.getInstance().getDispatch(FeaturesBlocks.x5_Tnt);
		model.renderBlockOnInventory(tessellator, 0, f4, (Integer)null);
		if (tnt.fuse / 5 % 2 == 0) {
			GL11.glDisable(3553);
			GL11.glDisable(2896);
			GL11.glEnable(3042);
			GL11.glBlendFunc(770, 772);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, f3);
			model.renderBlockOnInventory(tessellator, 0, 1.0F, (Integer)null);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			GL11.glDisable(3042);
			GL11.glEnable(2896);
			GL11.glEnable(3553);
		}

		GL11.glPopMatrix();
	}
}
