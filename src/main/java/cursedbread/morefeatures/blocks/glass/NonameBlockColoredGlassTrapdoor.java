package cursedbread.morefeatures.blocks.glass;

import net.minecraft.core.block.BlockTrapDoor;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import turniplabs.halplibe.helper.TextureHelper;

import static cursedbread.morefeatures.FeaturesMain.MOD_ID;

public class NonameBlockColoredGlassTrapdoor
	extends BlockTrapDoor {
	public NonameBlockColoredGlassTrapdoor(String key, int id, Material material) {
		super(key, id, material, false);
	}

	@Override
	public int getRenderBlockPass() {
		return 1;
	}
	public boolean isSolidRender() {
		return false;
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
	public void setBlockBoundsForItemRender() {
		float offset = 0.1875F;
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, offset, 1.0F);
	}
	@Override
	public void setBlockBoundsForBlockRender(int i) {
		float f = 0.1875F;
		if (isTrapdoorOpen(i)) {
			if ((i & 3) == 0) {
				this.setBlockBounds(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
			}

			if ((i & 3) == 1) {
				this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
			}

			if ((i & 3) == 2) {
				this.setBlockBounds(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
			}

			if ((i & 3) == 3) {
				this.setBlockBounds(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
			}
		} else if (isUpperHalf(i)) {
			this.setBlockBounds(0.0F, 1.0F - f, 0.0F, 1.0F, 1.0F, 1.0F);
		} else {
			this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, f, 1.0F);
		}
	}

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
