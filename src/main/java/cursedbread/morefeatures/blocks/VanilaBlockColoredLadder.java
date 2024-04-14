package cursedbread.morefeatures.blocks;

import net.minecraft.core.block.BlockLadder;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemDye;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import turniplabs.halplibe.helper.TextureHelper;

import static cursedbread.morefeatures.FeaturesMain.MOD_ID;

public class VanilaBlockColoredLadder
	extends BlockLadder {
	public VanilaBlockColoredLadder(String key, int id) {
		super(key, id);
	}

	@Override
	public int getRenderBlockPass() {
		return 1;
	}


	private static final int[] textures = new int[] {
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "ladder/white_ladder.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "ladder/orange_ladder.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "ladder/magenta_ladder.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "ladder/lightBlue_ladder.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "ladder/yellow_ladder.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "ladder/lime_ladder.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "ladder/pink_ladder.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "ladder/gray_ladder.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "ladder/silver_ladder.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "ladder/cyan_ladder.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "ladder/purple_ladder.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "ladder/blue_ladder.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "ladder/brown_ladder.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "ladder/green_ladder.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "ladder/red_ladder.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "ladder/black_ladder.png"),
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
