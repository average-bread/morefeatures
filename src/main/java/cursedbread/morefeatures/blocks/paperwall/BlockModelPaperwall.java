package cursedbread.morefeatures.blocks.paperwall;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.block.model.BlockModelStandard;
import net.minecraft.client.render.texture.stitcher.IconCoordinate;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

import static cursedbread.morefeatures.FeaturesMain.MOD_ID;

@Environment(EnvType.CLIENT)
public class BlockModelPaperwall<T extends BlockLogic> extends BlockModelStandard<T> {
    public boolean nnd;
    public int alt;

    public BlockModelPaperwall(Block block, int alt, boolean nnd) {
        super(block);
        this.nnd = nnd;
        this.alt = alt;
    }

	private static final IconCoordinate[] textures_alt_nnd = new IconCoordinate[] {
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_alt_crimson_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_alt_maroon_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_alt_ash_gray_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_alt_olive_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_alt_ochre_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_alt_buff_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_alt_verdigris_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_alt_light_yellow_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_alt_indigo_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_alt_xanthic_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_alt_cinnamon_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_alt_navy_blue_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_alt_royal_purple_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_alt_viridian_paperwall")
	};
	private static final IconCoordinate[] textures_colored_nnd = new IconCoordinate[] {
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_colored_crimson_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_colored_maroon_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_colored_ash_gray_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_colored_olive_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_colored_ochre_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_colored_buff_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_colored_verdigris_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_colored_light_yellow_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_colored_indigo_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_colored_xanthic_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_colored_cinnamon_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_colored_navy_blue_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_colored_royal_purple_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_colored_viridian_paperwall")
	};
	private static final IconCoordinate[] textures_painted_nnd = new IconCoordinate[] {
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_painted_crimson_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_painted_maroon_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_painted_ash_gray_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_painted_olive_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_painted_ochre_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_painted_buff_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_painted_verdigris_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_painted_light_yellow_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_painted_indigo_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_painted_xanthic_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_painted_cinnamon_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_painted_navy_blue_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_painted_royal_purple_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_painted_viridian_paperwall")
	};
    private static final IconCoordinate[][] textures_nnd = new IconCoordinate[][] {
        textures_painted_nnd, textures_alt_nnd, textures_colored_nnd
    };

	private static final IconCoordinate[] textures_alt_v = new IconCoordinate[] {
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_alt_white_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_alt_orange_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_alt_magenta_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_alt_lightblue_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_alt_yellow_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_alt_lime_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_alt_pink_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_alt_gray_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_alt_silver_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_alt_cyan_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_alt_purple_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_alt_blue_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_alt_brown_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_alt_green_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_alt_red_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_alt_black_paperwall"),
	};
	private static final IconCoordinate[] textures_colored_v = new IconCoordinate[] {
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_colored_white_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_colored_orange_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_colored_magenta_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_colored_lightblue_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_colored_yellow_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_colored_lime_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_colored_pink_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_colored_gray_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_colored_silver_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_colored_cyan_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_colored_purple_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_colored_blue_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_colored_brown_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_colored_green_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_colored_red_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_colored_black_paperwall"),
	};
	private static final IconCoordinate[] textures_painted_v = new IconCoordinate[] {
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_painted_white_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_painted_orange_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_painted_magenta_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_painted_lightblue_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_painted_yellow_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_painted_lime_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_painted_pink_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_painted_gray_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_painted_silver_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_painted_cyan_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_painted_purple_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_painted_blue_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_painted_brown_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_painted_green_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_painted_red_paperwall"),
		TextureRegistry.getTexture("morefeatures:block/paperwall/paperwall_painted_black_paperwall"),
	};
    private static final IconCoordinate[][] textures_v = new IconCoordinate[][] {
        textures_painted_v, textures_alt_v, textures_colored_v
    };


	@Override
	public IconCoordinate getBlockTextureFromSideAndMetadata(Side side, int data) {
	    if (nnd) return textures_nnd[alt][data];
	    return textures_v[alt][data];
	}
}
