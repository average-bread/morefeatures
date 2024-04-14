package cursedbread.morefeatures.blocks;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockGlowStone;
import net.minecraft.core.block.BlockLadder;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import turniplabs.halplibe.helper.TextureHelper;

import static cursedbread.morefeatures.FeaturesMain.MOD_ID;

public class VanilaBlockColoredGlowstone
	extends Block {
	public VanilaBlockColoredGlowstone(String key, int id, Material material) {
		super(key, id, material);
	}

	@Override
	public int getRenderBlockPass() {
		return 1;
	}


	private static final int[] textures = new int[] {
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glowstone/white_glowstone.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glowstone/orange_glowstone.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glowstone/magenta_glowstone.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glowstone/lightblue_glowstone.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glowstone/yellow_glowstone.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glowstone/lime_glowstone.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glowstone/pink_glowstone.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glowstone/gray_glowstone.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glowstone/silver_glowstone.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glowstone/cyan_glowstone.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glowstone/purple_glowstone.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glowstone/blue_glowstone.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glowstone/brown_glowstone.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glowstone/green_glowstone.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glowstone/red_glowstone.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glowstone/black_glowstone.png"),
	};

	@Override
	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
		switch (dropCause) {
			case SILK_TOUCH:
			case PICK_BLOCK: {
				return new ItemStack[]{new ItemStack(this, 1, meta)};
			}
		}
		return new ItemStack[]{new ItemStack(Item.dustGlowstone, world.rand.nextInt(1, 4))};
	}

	@Override
	public int getBlockTextureFromSideAndMetadata(Side side, int data) {
		return textures[data];
	}
}
