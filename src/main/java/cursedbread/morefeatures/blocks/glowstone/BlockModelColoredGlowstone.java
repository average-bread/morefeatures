package cursedbread.morefeatures.blocks.glowstone;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import net.minecraft.client.render.block.model.BlockModelStandard;
import net.minecraft.client.render.stitcher.IconCoordinate;
import net.minecraft.client.render.stitcher.TextureRegistry;

import static cursedbread.morefeatures.FeaturesMain.MOD_ID;

public class BlockModelColoredGlowstone<T extends Block> extends BlockModelStandard<T> {
    public boolean nnd = false;

    public BlockModelColoredGlowstone(Block block, boolean nnd) {
        super(block);
        this.nnd = nnd;
    }

	private static final IconCoordinate[] textures_v = new IconCoordinate[] {
		TextureRegistry.getTexture("morefeatures:block/glowstone_white_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone_orange_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone_magenta_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone_lightblue_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone_yellow_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone_lime_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone_pink_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone_gray_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone_silver_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone_cyan_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone_purple_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone_blue_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone_brown_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone_green_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone_red_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone_black_glowstone"),
	};
	private static final IconCoordinate[] textures_nnd = new IconCoordinate[] {
		TextureRegistry.getTexture("morefeatures:block/glowstone_crimson_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone_maroon_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone_ash_gray_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone_olive_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone_ochre_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone_buff_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone_verdigris_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone_light_yellow_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone_indigo_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone_xanthic_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone_cinnamon_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone_navy_blue_glowstone"),
		TextureRegistry.getTexture("morefeatures:block/glowstone_royal_purple_glowstone")
	};

	@Override
	public IconCoordinate getBlockTextureFromSideAndMetadata(Side side, int data) {
	    if (nnd) return textures_nnd[data];
	    return textures_v[data];
	}
}
