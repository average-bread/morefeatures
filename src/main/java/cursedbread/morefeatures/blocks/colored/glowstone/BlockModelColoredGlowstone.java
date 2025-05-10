package cursedbread.morefeatures.blocks.colored.glowstone;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.texture.stitcher.IconCoordinate;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.util.helper.Side;
import net.minecraft.client.render.block.model.BlockModelStandard;

@Environment(EnvType.CLIENT)
public class BlockModelColoredGlowstone<T extends BlockLogic> extends BlockModelStandard<T> {
    public boolean nnd = false;

    public BlockModelColoredGlowstone(Block block, boolean nnd) {
        super(block);
        this.nnd = nnd;
    }

	private static final IconCoordinate[] textures_v = new IconCoordinate[] {
		TextureRegistry.getTexture("morefeatures:block/glowstone/glowstone_white_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone/glowstone_orange_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone/glowstone_magenta_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone/glowstone_lightblue_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone/glowstone_yellow_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone/glowstone_lime_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone/glowstone_pink_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone/glowstone_gray_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone/glowstone_silver_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone/glowstone_cyan_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone/glowstone_purple_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone/glowstone_blue_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone/glowstone_brown_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone/glowstone_green_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone/glowstone_red_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone/glowstone_black_glowstone"),
	};
	private static final IconCoordinate[] textures_nnd = new IconCoordinate[] {
		TextureRegistry.getTexture("morefeatures:block/glowstone/glowstone_crimson_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone/glowstone_maroon_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone/glowstone_ash_gray_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone/glowstone_olive_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone/glowstone_ochre_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone/glowstone_buff_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone/glowstone_verdigris_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone/glowstone_light_yellow_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone/glowstone_indigo_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone/glowstone_xanthic_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone/glowstone_cinnamon_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone/glowstone_navy_blue_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone/glowstone_royal_purple_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone/glowstone_viridian_glowstone")
	};

	@Override
	public IconCoordinate getBlockTextureFromSideAndMetadata(Side side, int data) {
	    if (nnd) return textures_nnd[data];
	    return textures_v[data];
	}
}
