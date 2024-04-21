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

public class NonameBlockColoredGlowstone
	extends Block {
	public NonameBlockColoredGlowstone(String key, int id, Material material) {
		super(key, id, material);
	}

	@Override
	public int getRenderBlockPass() {
		return 0;
	}


	private static final int[] textures = new int[] {
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glowstone/crimson_glowstone.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glowstone/maroon_glowstone.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glowstone/ash_gray_glowstone.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glowstone/olive_glowstone.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glowstone/ochre_glowstone.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glowstone/buff_glowstone.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glowstone/verdigris_glowstone.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glowstone/light_yellow_glowstone.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glowstone/indigo_glowstone.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glowstone/xanthic_glowstone.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glowstone/cinnamon_glowstone.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glowstone/navy_blue_glowstone.png"),
		TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glowstone/royal_purple_glowstone.png")
	};

	@Override
	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
		switch (dropCause) {
			case SILK_TOUCH:
			case PICK_BLOCK: {
				return new ItemStack[]{new ItemStack(this, 1, meta)};
			}
		}
		int dust = world.rand.nextInt(4);
		return new ItemStack[]{new ItemStack(Item.dustGlowstone, dust+1)};
	}

	@Override
	public int getBlockTextureFromSideAndMetadata(Side side, int data) {
		return textures[data];
	}
}
