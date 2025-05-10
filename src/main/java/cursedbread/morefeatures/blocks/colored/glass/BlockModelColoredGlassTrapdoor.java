package cursedbread.morefeatures.blocks.colored.glass;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.block.model.BlockModelTrapDoor;
import net.minecraft.client.render.texture.stitcher.IconCoordinate;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.BlockLogicTrapDoor;
import net.minecraft.core.util.helper.Axis;
import net.minecraft.core.util.helper.DyeColor;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.util.helper.Sides;

@Environment(EnvType.CLIENT)
public class BlockModelColoredGlassTrapdoor<T extends BlockLogic> extends BlockModelTrapDoor<T> {
	public static final IconCoordinate[] topTextures = new IconCoordinate[16];
	public static final IconCoordinate[] sideTextures = new IconCoordinate[16];
	public boolean nnd = false;
	public BlockModelColoredGlassTrapdoor(Block block, boolean nnd) {
		super(block);
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

//	public IconCoordinate getBlockTextureFromSideAndMetadata(Side side, int data) {
//		if (nnd) return textures_nnd[data];
//		return textures_v[data];
//	}

	public IconCoordinate getBlockTextureFromSideAndMetadata(Side side, int data) {
		int color = data >> 4 & 15;
		int orientation = data & 3;
		if (BlockLogicTrapDoor.isTrapdoorOpen(data)) {
			int index = Sides.orientationLookUpTrapdoorOpen[6 * orientation + side.getId()];
			return index < 2 ? topTextures[color] : sideTextures[color];
		} else {
			return side.getAxis() == Axis.Y ? topTextures[color] : sideTextures[color];
		}
	}

	static {
		for(DyeColor c : DyeColor.blockOrderedColors()) {
			topTextures[c.blockMeta] = TextureRegistry.getTexture("morefeatures:block/glass/glass_" + c.colorID + "_glass");
			sideTextures[c.blockMeta] = TextureRegistry.getTexture("morefeatures:block/glass/glass_" + c.colorID + "_glass");
		}
	}
}
