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
import turniplabs.halplibe.helper.TextureHelper;

import static cursedbread.morefeatures.FeaturesMain.MOD_ID;

public class VanilaBlockColoredGlass
	extends BlockGlass {
	public VanilaBlockColoredGlass(String key, int id, Material material) {
		super(key, id, material, false);
	}

	@Override
	public int getRenderBlockPass() {
		return 1;
	}

	private static final int[] textures = new int[] {
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/white_glass.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/orange_glass.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/magenta_glass.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/lightblue_glass.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/yellow_glass.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/lime_glass.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/pink_glass.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/gray_glass.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/silver_glass.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/cyan_glass.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/purple_glass.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/blue_glass.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/brown_glass.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/green_glass.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/red_glass.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/black_glass.png"),
	};

	@Override
	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
		switch (dropCause) {
			case SILK_TOUCH:
			case PICK_BLOCK: {
				return new ItemStack[]{new ItemStack(this, 1, meta)};
			}
		}
		return null;
	}

	@Override
	public int getBlockTextureFromSideAndMetadata(Side side, int data) {
		return textures[data];
	}
}
