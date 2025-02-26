package cursedbread.morefeatures.blocks.glass;

import cursedbread.morefeatures.blocks.FeaturesBlocks;
import net.minecraft.core.block.*;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.DyeColor;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import org.jetbrains.annotations.Nullable;

public class BlockLogicColoredGlassTrapdoor extends BlockLogicTrapDoorPainted implements IPainted {
	public BlockLogicColoredGlassTrapdoor(Block block, Material material) {
		super(block, material);
	}


	public int getPlacedBlockMetadata(@Nullable Player player, ItemStack stack, World world, int x, int y, int z, Side side, double xPlaced, double yPlaced) {
		return stack.getMetadata() | super.getPlacedBlockMetadata(player, stack, world, x, y, z, side, xPlaced, yPlaced);
	}

	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
		switch (dropCause) {
			case SILK_TOUCH:
			case PICK_BLOCK: {
				return new ItemStack[]{new ItemStack(FeaturesBlocks.vanillaColoredGlassTrapdoor, 1, (meta >> 4 & 15) << 4)};
			}
		}
		return null;
	}

	@Override
	public boolean canBePainted() {
		return this.material == Material.glass;
	}

	public void removeDye(World world, int x, int y, int z) {
		int meta = world.getBlockMetadata(x, y, z);
		world.setBlockAndMetadataWithNotify(x, y, z, FeaturesBlocks.vanillaColoredGlassTrapdoor.id(), meta & 15);
	}
}
