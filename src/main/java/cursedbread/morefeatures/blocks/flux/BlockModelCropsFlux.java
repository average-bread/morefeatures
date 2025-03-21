package cursedbread.morefeatures.blocks.flux;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.LightmapHelper;
import net.minecraft.client.render.block.model.BlockModelStandard;
import net.minecraft.client.render.tessellator.Tessellator;
import net.minecraft.client.render.texture.stitcher.IconCoordinate;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.util.helper.MathHelper;
import net.minecraft.core.util.helper.Side;

@Environment(EnvType.CLIENT)
public class BlockModelCropsFlux <T extends BlockLogic> extends BlockModelStandard<T> {
	public final IconCoordinate[] growthStageTextures = new IconCoordinate[]{
		TextureRegistry.getTexture("morefeatures:block/crops_flux/stage0"),
		TextureRegistry.getTexture("morefeatures:block/crops_flux/stage1"),
		TextureRegistry.getTexture("morefeatures:block/crops_flux/stage2"),
		TextureRegistry.getTexture("morefeatures:block/crops_flux/stage3"),
		TextureRegistry.getTexture("morefeatures:block/crops_flux/stage4"),
		TextureRegistry.getTexture("morefeatures:block/crops_flux/stage5"),
		TextureRegistry.getTexture("morefeatures:block/crops_flux/stage6"),
		TextureRegistry.getTexture("morefeatures:block/crops_flux/stage7")
	};

	public BlockModelCropsFlux(Block<T> block) {
		super(block);

		assert this.growthStageTextures.length == 8 : "There must be a texture for each wheat growth stage!";

	}

	public boolean render(Tessellator tessellator, int x, int y, int z) {
		float brightness = 1.0F;
		if (LightmapHelper.isLightmapEnabled()) {
			tessellator.setLightmapCoord(this.block.getLightmapCoord(renderBlocks.blockAccess, x, y, z));
		} else {
			brightness = this.getBlockBrightness(renderBlocks.blockAccess, x, y, z);
		}

		tessellator.setColorOpaque_F(brightness, brightness, brightness);
		IconCoordinate texture = this.getBlockTextureFromSideAndMetadata(Side.BOTTOM, renderBlocks.blockAccess.getBlockMetadata(x, y, z));
		if (renderBlocks.overrideBlockTexture != null) {
			texture = renderBlocks.overrideBlockTexture;
		}

		double uMin = texture.getIconUMin();
		double uMax = texture.getIconUMax();
		double vMin = texture.getIconVMin();
		double vMax = texture.getIconVMax();
		double xMin = (double)x + 0.5 - 0.25;
		double xMax = (double)x + 0.5 + 0.25;
		double zMin = (double)z + 0.5 - 0.5;
		double zMax = (double)z + 0.5 + 0.5;
		double yd = (double)((float)y - 0.0625F);
		tessellator.addVertexWithUV(xMin, yd + 1.0, zMin, uMin, vMin);
		tessellator.addVertexWithUV(xMin, yd + 0.0, zMin, uMin, vMax);
		tessellator.addVertexWithUV(xMin, yd + 0.0, zMax, uMax, vMax);
		tessellator.addVertexWithUV(xMin, yd + 1.0, zMax, uMax, vMin);
		tessellator.addVertexWithUV(xMin, yd + 1.0, zMax, uMin, vMin);
		tessellator.addVertexWithUV(xMin, yd + 0.0, zMax, uMin, vMax);
		tessellator.addVertexWithUV(xMin, yd + 0.0, zMin, uMax, vMax);
		tessellator.addVertexWithUV(xMin, yd + 1.0, zMin, uMax, vMin);
		tessellator.addVertexWithUV(xMax, yd + 1.0, zMax, uMin, vMin);
		tessellator.addVertexWithUV(xMax, yd + 0.0, zMax, uMin, vMax);
		tessellator.addVertexWithUV(xMax, yd + 0.0, zMin, uMax, vMax);
		tessellator.addVertexWithUV(xMax, yd + 1.0, zMin, uMax, vMin);
		tessellator.addVertexWithUV(xMax, yd + 1.0, zMin, uMin, vMin);
		tessellator.addVertexWithUV(xMax, yd + 0.0, zMin, uMin, vMax);
		tessellator.addVertexWithUV(xMax, yd + 0.0, zMax, uMax, vMax);
		tessellator.addVertexWithUV(xMax, yd + 1.0, zMax, uMax, vMin);
		xMin = (double)x + 0.5 - 0.5;
		xMax = (double)x + 0.5 + 0.5;
		zMin = (double)z + 0.5 - 0.25;
		zMax = (double)z + 0.5 + 0.25;
		tessellator.addVertexWithUV(xMin, yd + 1.0, zMin, uMin, vMin);
		tessellator.addVertexWithUV(xMin, yd + 0.0, zMin, uMin, vMax);
		tessellator.addVertexWithUV(xMax, yd + 0.0, zMin, uMax, vMax);
		tessellator.addVertexWithUV(xMax, yd + 1.0, zMin, uMax, vMin);
		tessellator.addVertexWithUV(xMax, yd + 1.0, zMin, uMin, vMin);
		tessellator.addVertexWithUV(xMax, yd + 0.0, zMin, uMin, vMax);
		tessellator.addVertexWithUV(xMin, yd + 0.0, zMin, uMax, vMax);
		tessellator.addVertexWithUV(xMin, yd + 1.0, zMin, uMax, vMin);
		tessellator.addVertexWithUV(xMax, yd + 1.0, zMax, uMin, vMin);
		tessellator.addVertexWithUV(xMax, yd + 0.0, zMax, uMin, vMax);
		tessellator.addVertexWithUV(xMin, yd + 0.0, zMax, uMax, vMax);
		tessellator.addVertexWithUV(xMin, yd + 1.0, zMax, uMax, vMin);
		tessellator.addVertexWithUV(xMin, yd + 1.0, zMax, uMin, vMin);
		tessellator.addVertexWithUV(xMin, yd + 0.0, zMax, uMin, vMax);
		tessellator.addVertexWithUV(xMax, yd + 0.0, zMax, uMax, vMax);
		tessellator.addVertexWithUV(xMax, yd + 1.0, zMax, uMax, vMin);
		return true;
	}

	public boolean shouldItemRender3d() {
		return false;
	}

	public IconCoordinate getBlockTextureFromSideAndMetadata(Side side, int data) {
		return this.growthStageTextures[MathHelper.clamp(data, 0, 7)];
	}
}
