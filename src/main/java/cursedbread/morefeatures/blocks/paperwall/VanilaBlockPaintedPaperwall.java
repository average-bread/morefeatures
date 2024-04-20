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

public class VanilaBlockPaintedPaperwall
	extends Block {
	public VanilaBlockPaintedPaperwall(String key, int id, Material material) {
		super(key, id, material);
	}

	@Override
	public int getRenderBlockPass() {
		return 0;
	}


	private static final int[] textures = new int[] {
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/painted/white_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/painted/orange_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/painted/magenta_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/painted/lightblue_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/painted/yellow_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/painted/lime_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/painted/pink_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/painted/gray_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/painted/silver_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/painted/cyan_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/painted/purple_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/painted/blue_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/painted/brown_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/painted/green_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/painted/red_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/painted/black_paperwall.png"),
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
