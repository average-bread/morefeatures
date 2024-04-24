package cursedbread.morefeatures.blocks.paperwall;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import turniplabs.halplibe.helper.TextureHelper;

import static cursedbread.morefeatures.FeaturesMain.MOD_ID;

public class NonameBlockPaintedPaperwall
	extends Block {
	public NonameBlockPaintedPaperwall(String key, int id, Material material) {
		super(key, id, material);
	}

	@Override
	public int getRenderBlockPass() {
		return 0;
	}


	private static final int[] textures = new int[] {
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/painted/crimson_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/painted/maroon_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/painted/ash_gray_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/painted/olive_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/painted/ochre_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/painted/buff_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/painted/verdigris_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/painted/light_yellow_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/painted/indigo_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/painted/xanthic_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/painted/cinnamon_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/painted/navy_blue_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/painted/royal_purple_paperwall.png")
	};

	@Override
	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
		return new ItemStack[]{new ItemStack(this, 1, meta)};
	}

	@Override
	public int getBlockTextureFromSideAndMetadata(Side side, int data) {
		return textures[data];
	}
}
