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

public class VanilaBlockAltPaperwall
	extends Block {
	public VanilaBlockAltPaperwall(String key, int id, Material material) {
		super(key, id, material);
	}

	@Override
	public int getRenderBlockPass() {
		return 0;
	}


	private static final int[] textures = new int[] {
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/alt/white_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/alt/orange_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/alt/magenta_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/alt/lightblue_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/alt/yellow_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/alt/lime_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/alt/pink_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/alt/gray_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/alt/silver_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/alt/cyan_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/alt/purple_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/alt/blue_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/alt/brown_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/alt/green_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/alt/red_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/alt/black_paperwall.png"),
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
