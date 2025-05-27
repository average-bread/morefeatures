package cursedbread.morefeatures.blocks.colored.workbench;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.block.model.BlockModelStandard;
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
public class BlockModelColoredWorkbench <T extends BlockLogic> extends BlockModelStandard<T> {
	public boolean nnd = false;
	public static final IconCoordinate[] topTextures = new IconCoordinate[16];
	public static final IconCoordinate[] sideTextures = new IconCoordinate[16];
	public static final IconCoordinate[] bottomTextures = new IconCoordinate[16];
	public static final IconCoordinate[] frontTextures = new IconCoordinate[16];

	public BlockModelColoredWorkbench(Block<T> block, boolean nnd) {
		super(block);
		this.nnd = nnd;
	}

	public IconCoordinate getBlockTextureFromSideAndMetadata(Side side, int data) {
		if (side == Side.BOTTOM){
			return bottomTextures[data & 15];
		}
		if (side == Side.TOP){
			return topTextures[data & 15];
		}
		if (side == Side.EAST || side == Side.WEST){
			return sideTextures[data & 15];
		}
		if (side == Side.NORTH || side == Side.SOUTH){
			return frontTextures[data & 15];
		}
		return null;
	}

	static {
		for(DyeColor c : DyeColor.blockOrderedColors()) {
			topTextures[c.blockMeta] = TextureRegistry.getTexture("morefeatures:block/workbench/" + c.colorID + "/top");
			sideTextures[c.blockMeta] = TextureRegistry.getTexture("morefeatures:block/workbench/" + c.colorID + "/side");
			bottomTextures[c.blockMeta] = TextureRegistry.getTexture("morefeatures:block/workbench/" + c.colorID + "/bottom");
			frontTextures[c.blockMeta] = TextureRegistry.getTexture("morefeatures:block/workbench/" + c.colorID + "/front");
		}
	}
}
