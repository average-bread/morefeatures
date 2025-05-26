package cursedbread.morefeatures.blocks.colored.ladder;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicLadder;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.block.IPainted;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.DyeColor;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class BlockLogicColoredLadder extends BlockLogicLadder implements IPainted {
	public static final int MASK_COLOR = 240;

	public BlockLogicColoredLadder(Block<?> block) {
		super(block);
	}

	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int meta, TileEntity tileEntity) {
		return new ItemStack[]{new ItemStack(this.block, 1, meta & 240)};
	}

	public boolean canBePainted() {
		return true;
	}

	public int getPlacedBlockMetadata(@Nullable Player player, ItemStack stack, World world, int x, int y, int z, Side side, double xPlaced, double yPlaced) {
		return stack.getMetadata() & 240;
	}

	@Override
	public DyeColor fromMetadata(int i) {
		return DyeColor.colorFromBlockMeta(i >> 4);
	}

	@Override
	public int toMetadata(DyeColor dyeColor) {
		return dyeColor.blockMeta << 4;
	}

	@Override
	public int stripColorFromMetadata(int i) {
		return i & -241;
	}

	@Override
	public void removeDye(World world, int i, int j, int k) {
		world.setBlockMetadataWithNotify(i, j, k, Blocks.LADDER_OAK.id());
	}

	public void setColor(World world, int x, int y, int z, DyeColor color) {
		int meta = world.getBlockMetadata(x, y, z);
		world.setBlockMetadataWithNotify(x, y, z, this.stripColorFromMetadata(meta) | this.toMetadata(color));
	}

	@Override
	public Side getSideFromMeta(int meta) {
		if (meta == 2) {
			return Side.NORTH;
		} else if (meta == 3) {
			return Side.SOUTH;
		} else if (meta == 4) {
			return Side.WEST;
		} else {
			return meta == 5 ? Side.EAST : Side.NONE;
		}
	}

	@Override
	public int getMetaForSide(Side side) {
		if (side == Side.NORTH) {
			return 2;
		} else if (side == Side.SOUTH) {
			return 3;
		} else if (side == Side.WEST) {
			return 4;
		} else {
			return side == Side.EAST ? 5 : 0;
		}
	}
}
