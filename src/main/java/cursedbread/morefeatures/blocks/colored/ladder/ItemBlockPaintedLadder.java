package cursedbread.morefeatures.blocks.colored.ladder;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.BlockLogicLadder;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.enums.EnumBlockSoundEffectType;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.block.ItemBlock;
import net.minecraft.core.util.helper.DyeColor;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ItemBlockPaintedLadder <T extends BlockLogic> extends ItemBlock<T> {
	private final boolean upperMetadata;

	public ItemBlockPaintedLadder(Block<T> block, boolean upperMetadata) {
		super(block);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		this.upperMetadata = upperMetadata;
	}

	@Override
	public String getLanguageKey(ItemStack itemstack) {
		return this.upperMetadata
			? super.getKey() + "." + DyeColor.colorFromBlockMeta((itemstack.getMetadata() & 240) >> 4).colorID
			: super.getKey() + "." + DyeColor.colorFromBlockMeta(itemstack.getMetadata() & 15).colorID;
	}

	@Override
	public boolean onUseItemOnBlock(ItemStack stack, @Nullable Player player, World world, int x, int y, int z, Side side, double xPlaced, double yPlaced) {
		Block<?> clickedBlock = world.getBlock(x, y, z);
		BlockLogicColoredLadder ladder = (BlockLogicColoredLadder) this.block.getLogic();
		if (clickedBlock == this.block && player != null && !player.isSneaking()) {
			Side clickedLadderSide = ladder.getSideFromMeta(world.getBlockMetadata(x, y, z));

			while (world.getBlock(x, y, z) == this.block && ladder.getSideFromMeta(world.getBlockMetadata(x, y, z)) == clickedLadderSide) {
				y--;
			}

			int meta = ladder.getMetaForSide(clickedLadderSide);
			return ladder.canExistAt(world, x, y, z, meta) ? this.placeBlock(world, x, y, z, meta, player, stack, clickedLadderSide, 0.5, 0.5) : false;
		} else {
			if (!world.canPlaceInsideBlock(x, y, z)) {
				x += side.getOffsetX();
				y += side.getOffsetY();
				z += side.getOffsetZ();
			}

			Side sideForPlacement = ladder.getSideForPlacement(world, x, y, z, side);
			if (sideForPlacement == null) {
				return false;
			} else {
				int meta = ladder.getMetaForSide(sideForPlacement);
				return ladder.canExistAt(world, x, y, z, meta) ? this.placeBlock(world, x, y, z, meta, player, stack, sideForPlacement, xPlaced, yPlaced) : false;
			}
		}
	}

	public boolean placeBlock(World world, int x, int y, int z, int meta, @Nullable Player player, ItemStack stack, Side side, double xPlaced, double yPlaced) {
		if (world.canPlaceInsideBlock(x, y, z)
			&& world.canBlockBePlacedAt(this.block.id(), x, y, z, false, side)
			&& stack.consumeItem(player)
			&& world.setBlockAndMetadataWithNotify(x, y, z, this.block.id(), meta)) {
			this.block.onBlockPlacedByMob(world, x, y, z, side, player, xPlaced, yPlaced);
			world.playBlockSoundEffect(
				player, (double)((float)x + 0.5F), (double)((float)y + 0.5F), (double)((float)z + 0.5F), this.block, EnumBlockSoundEffectType.PLACE
			);
			return true;
		} else {
			return false;
		}
	}
}
