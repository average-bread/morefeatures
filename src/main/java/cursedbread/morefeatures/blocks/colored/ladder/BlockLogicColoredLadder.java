package cursedbread.morefeatures.blocks.colored.ladder;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicLadder;
import net.minecraft.core.block.IPainted;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.DyeColor;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import org.jetbrains.annotations.Nullable;

public class BlockLogicColoredLadder extends BlockLogicLadder implements IPainted {
	public BlockLogicColoredLadder(Block<?> block) {
		super(block);
	}

	public int getPlacedBlockMetadata(@Nullable Player player, ItemStack stack, World world, int x, int y, int z, Side side, double xPlaced, double yPlaced) {
		return stack.getMetadata() & 15;
	}

	@Override
	public DyeColor fromMetadata(int i) {
		return DyeColor.colorFromBlockMeta(i);
	}

	@Override
	public int toMetadata(DyeColor dyeColor) {
		return dyeColor.blockMeta;
	}

	@Override
	public int stripColorFromMetadata(int i) {
		return 0;
	}

	@Override
	public void removeDye(World world, int i, int j, int k) {
		world.setBlockMetadataWithNotify(i, j, k, 0);
	}
}
