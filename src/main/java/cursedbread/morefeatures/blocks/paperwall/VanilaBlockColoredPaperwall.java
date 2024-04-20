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
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/colored/white_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/colored/orange_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/colored/magenta_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/colored/lightblue_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/colored/yellow_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/colored/lime_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/colored/pink_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/colored/gray_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/colored/silver_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/colored/cyan_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/colored/purple_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/colored/blue_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/colored/brown_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/colored/green_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/colored/red_paperwall.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "paperwall/colored/black_paperwall.png"),
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
