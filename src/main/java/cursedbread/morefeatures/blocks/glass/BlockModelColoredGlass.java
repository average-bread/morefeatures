package cursedbread.morefeatures.blocks.glass;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.block.model.BlockModelTransparent;
import net.minecraft.client.render.texture.stitcher.IconCoordinate;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.util.helper.Side;

@Environment(EnvType.CLIENT)
public class BlockModelColoredGlass<T extends BlockLogic> extends BlockModelTransparent<T> {
	public boolean nnd;

    public BlockModelColoredGlass(Block block, boolean renderInside, boolean nnd) {
        super(block, renderInside);
		this.nnd = nnd;
    }

	private static final IconCoordinate[] textures_nnd = new IconCoordinate[] {
		TextureRegistry.getTexture("morefeatures:block/glass/glass_crimson_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass/glass_maroon_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass/glass_ash_gray_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass/glass_olive_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass/glass_ochre_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass/glass_buff_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass/glass_verdigris_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass/glass_light_yellow_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass/glass_indigo_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass/glass_xanthic_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass/glass_cinnamon_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass/glass_navy_blue_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass/glass_royal_purple_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass/glass_viridian_glass")
	};

	private static final IconCoordinate[] textures_v = new IconCoordinate[] {
		TextureRegistry.getTexture("morefeatures:block/glass/glass_white_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass/glass_orange_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass/glass_magenta_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass/glass_lightblue_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass/glass_yellow_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass/glass_lime_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass/glass_pink_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass/glass_gray_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass/glass_silver_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass/glass_cyan_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass/glass_purple_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass/glass_blue_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass/glass_brown_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass/glass_green_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass/glass_red_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass/glass_black_glass"),
	};

	@Override
    public IconCoordinate getBlockTextureFromSideAndMetadata(Side side, int data) {
        if (nnd) return textures_nnd[data];
		return textures_v[data];
	}
}
