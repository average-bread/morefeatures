package cursedbread.morefeatures.blocks.glass;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockGlass;
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

public class BlockModelColoredGlass<T extends Block> extends BlockModelStandard<T> {
    public boolean nnd = false;

    public BlockModelColoredGlass(Block block, boolean nnd) {
        super(block);
        this.nnd = nnd;
    }

	private static final IconCoordinate[] textures_nnd = new IconCoordinate[] {
		TextureRegistry.getTexture("morefeatures:block/glass_crimson_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass_maroon_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass_ash_gray_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass_olive_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass_ochre_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass_buff_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass_verdigris_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass_light_yellow_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass_indigo_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass_xanthic_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass_cinnamon_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass_navy_blue_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass_royal_purple_glass")
	};

	private static final IconCoordinate[] textures_v = new IconCoordinate[] {
		TextureRegistry.getTexture("morefeatures:block/glass_white_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass_orange_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass_magenta_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass_lightblue_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass_yellow_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass_lime_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass_pink_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass_gray_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass_silver_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass_cyan_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass_purple_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass_blue_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass_brown_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass_green_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass_red_glass"),
		TextureRegistry.getTexture("morefeatures:block/glass_black_glass"),
	};

	@Override
    public IconCoordinate getBlockTextureFromSideAndMetadata(Side side, int data) {
        if (nnd) return textures_nnd[data];
		return textures_v[data];
	}
}
