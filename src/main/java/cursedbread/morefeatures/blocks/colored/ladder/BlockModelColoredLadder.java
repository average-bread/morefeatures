package cursedbread.morefeatures.blocks.colored.ladder;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.block.model.BlockModelLadder;
import net.minecraft.client.render.texture.stitcher.IconCoordinate;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.util.helper.DyeColor;
import net.minecraft.core.util.helper.Side;

@Environment(EnvType.CLIENT)
public class BlockModelColoredLadder <T extends BlockLogic> extends BlockModelLadder {
	public static final IconCoordinate[] textures = new IconCoordinate[16];
	public boolean nnd = false;
	public BlockModelColoredLadder(Block block, boolean nnd) {
		super(block);
		this.nnd = nnd;
	}

	public IconCoordinate getBlockTextureFromSideAndMetadata(Side side, int data) {
		int color = data >> 4 & 15;
		int orientation = data & 3;
		return textures[color];
	}

	static {
		for(DyeColor c : DyeColor.blockOrderedColors()) {
			textures[c.blockMeta] = TextureRegistry.getTexture("morefeatures:block/ladders/" + c.colorID);
		}
	}
}
