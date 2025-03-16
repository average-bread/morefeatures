package cursedbread.morefeatures.blocks.other;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicLog;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import net.minecraft.core.world.World;

import java.util.Objects;

public class BlockLogicBurnedLog extends BlockLogicLog {
	public BlockLogicBurnedLog(Block<?> block) {
		super(block);
	}

	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int meta, TileEntity tileEntity) {
		if (Objects.requireNonNull(dropCause) == EnumDropCause.PISTON_CRUSH) {
			return new ItemStack[]{new ItemStack((Items.COAL), 1 + world.rand.nextInt(4), 1)};
		}
		return new ItemStack[]{new ItemStack(this)};
	}
}
