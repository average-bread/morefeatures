package cursedbread.morefeatures.blocks.glowstone;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.IPainted;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import net.minecraft.core.util.helper.DyeColor;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import org.jetbrains.annotations.Nullable;

public class BlockLogicColoredGlowstone extends BlockLogic implements IPainted {
	public BlockLogicColoredGlowstone(Block block, Material material) {
		super(block, material);
	}

	public int getPlacedBlockMetadata(@Nullable Player player, ItemStack stack, World world, int x, int y, int z, Side side, double xPlaced, double yPlaced) {
		return stack.getMetadata() & 15;
	}

	@Override
	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
		switch (dropCause) {
			case SILK_TOUCH:
			case PICK_BLOCK: {
				return new ItemStack[]{new ItemStack(this, 1, meta)};
			}
		}
		int dust = world.rand.nextInt(4);
		return new ItemStack[]{new ItemStack(Items.DUST_GLOWSTONE, dust+1)};
	}

	@Override
	public DyeColor fromMetadata(int meta) {
		return DyeColor.colorFromBlockMeta(meta);
	}

	@Override
	public int toMetadata(DyeColor color) {
		return color.blockMeta;
	}

	@Override
	public int stripColorFromMetadata(int i) {
		return 0;
	}

	@Override
	public void removeDye(World world, int x, int y, int z) {
		world.setBlockMetadataWithNotify(x, y, z, 0);
	}
}
