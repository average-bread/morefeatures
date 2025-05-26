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

import java.util.Iterator;

@Environment(EnvType.CLIENT)
public class BlockModelColoredLadder <T extends BlockLogic> extends BlockModelLadder {
	public static final IconCoordinate[] textures = new IconCoordinate[240];
	public boolean nnd = false;
	public BlockModelColoredLadder(Block block, boolean nnd) {
		super(block);
		this.nnd = nnd;

		DyeColor c;
		for(Iterator var2 = DyeColor.blockOrderedColors().iterator();
			var2.hasNext();
			textures[c.blockMeta] = TextureRegistry.getTexture("morefeatures:block/ladders/" + c.colorID)) {
			c = (DyeColor)var2.next();
		}
	}

	public IconCoordinate getBlockTextureFromSideAndMetadata(Side side, int data) {
		int color = data >> 4 & 15;
		return textures[color];
	}
}
