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

public class NonameBlockColoredGlass
	extends BlockGlass {
	public NonameBlockColoredGlass(String key, int id, Material material) {
		super(key, id, material, false);
	}

	@Override
	public int getRenderBlockPass() {
		return 1;
	}


	private static final int[] textures = new int[] {
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/crimson_glass.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/maroon_glass.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/ash_gray_glass.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/olive_glass.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/ochre_glass.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/buff_glass.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/verdigris_glass.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/light_yellow_glass.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/indigo_glass.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/xanthic_glass.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/cinnamon_glass.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/navy_blue_glass.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/royal_purple_glass.png")
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
