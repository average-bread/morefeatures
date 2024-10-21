package cursedbread.morefeatures.blocks.ores;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

public class BlockSuperOreGold extends Block {
	public BlockSuperOreGold(String key, int id) {
		super(key, id, Material.stone);
	}

	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
		switch (dropCause) {
			case SILK_TOUCH:
			case PICK_BLOCK:
				return new ItemStack[]{new ItemStack(this)};
			case EXPLOSION:
			case PROPER_TOOL:
				return new ItemStack[]{new ItemStack((Item.oreRawGold), 2 + world.rand.nextInt(3))};
			default:
				return null;
		}
	}
}
