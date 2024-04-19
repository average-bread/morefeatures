package cursedbread.morefeatures.blocks;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import turniplabs.halplibe.helper.TextureHelper;

import static cursedbread.morefeatures.FeaturesMain.MOD_ID;

public class VanilaBlockColoredPaperwall
	extends Block {
	public VanilaBlockColoredPaperwall(String key, int id, Material material) {
		super(key, id, material);
	}

	@Override
	public int getRenderBlockPass() {
		return 0;
	}


	private static final int[] textures = new int[] {
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/main/white_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/main/orange_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/main/magenta_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/main/lightblue_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/main/yellow_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/main/lime_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/main/pink_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/main/gray_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/main/silver_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/main/cyan_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/main/purple_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/main/blue_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/main/brown_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/main/green_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/main/red_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/main/black_paperwall.png"),
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
