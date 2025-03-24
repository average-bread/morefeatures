package cursedbread.morefeatures.blocks.flux;

import cursedbread.morefeatures.item.FeaturesItems;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.block.*;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.*;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;
import java.util.Random;

public class BlockLogicCropsFlux extends BlockLogicFlower implements IBonemealable {
	public static final int MASK_GROWTH = 7;
	public static final int MAX_GROWTH_STATE = 7;

	public BlockLogicCropsFlux(Block<?> block) {
		super(block);
		block.setTicking(true);
		float f = 0.5F;
		this.setBlockBounds((double)(0.5F - f), 0.0, (double)(0.5F - f), (double)(0.5F + f), 0.25, (double)(0.5F + f));
	}

	public boolean mayPlaceOn(int blockId) {
		return blockId == Blocks.FARMLAND_DIRT.id();
	}

	public void updateTick(World world, int x, int y, int z, Random rand) {
		super.updateTick(world, x, y, z, rand);
		if (world.getBlockLightValue(x, y + 1, z) >= 9) {
			int l = world.getBlockMetadata(x, y, z);
			if (l < 7) {
				float f = this.getGrowthRate(world, x, y, z);
				if (rand.nextInt((int)(100.0F / f)) == 0) {
					++l;
					world.setBlockMetadataWithNotify(x, y, z, l);
				}
			}
		}

	}

	public void fertilize(World world, int x, int y, int z) {
		world.setBlockMetadataWithNotify(x, y, z, 7);
	}

	private float getGrowthRate(World world, int x, int y, int z) {
		float growthRate = 1.0F;
		int idNegZ = world.getBlockId(x, y, z - 1);
		int idPosZ = world.getBlockId(x, y, z + 1);
		int idNegX = world.getBlockId(x - 1, y, z);
		int idPosX = world.getBlockId(x + 1, y, z);
		int idNegXNegZ = world.getBlockId(x - 1, y, z - 1);
		int idPosXNegZ = world.getBlockId(x + 1, y, z - 1);
		int idPosXPosZ = world.getBlockId(x + 1, y, z + 1);
		int idNegXPosZ = world.getBlockId(x - 1, y, z + 1);
		boolean xNeighbor = idNegX == this.block.id() || idPosX == this.block.id();
		boolean zNeighbor = idNegZ == this.block.id() || idPosZ == this.block.id();
		boolean diagNeighbor = idNegXNegZ == this.block.id() || idPosXNegZ == this.block.id() || idPosXPosZ == this.block.id() || idNegXPosZ == this.block.id();

		for(int dx = x - 1; dx <= x + 1; ++dx) {
			for(int dz = z - 1; dz <= z + 1; ++dz) {
				int id = world.getBlockId(dx, y - 1, dz);
				float growthRateMod = 0.0F;
				if (id == Blocks.FARMLAND_DIRT.id()) {
					growthRateMod = 1.0F;
					if (world.getBlockMetadata(dx, y - 1, dz) > 0) {
						growthRateMod = 3.0F;
					}
				}

				if (dx != x || dz != z) {
					growthRateMod /= 4.0F;
				}

				growthRate += growthRateMod;
			}
		}

		if (diagNeighbor || xNeighbor && zNeighbor) {
			growthRate /= 2.0F;
		}

		boolean isFertilized = BlockLogicFarmland.isFertilized(world.getBlockMetadata(x, y - 1, z));
		if (!isFertilized) {
			if (world.getSeasonManager().getCurrentSeason() != null) {
				growthRate *= world.getSeasonManager().getCurrentSeason().cropGrowthFactor;
			}
		} else {
			growthRate *= 1.5F;
		}

		return growthRate;
	}

	public void onBlockDestroyedByPlayer(World world, int x, int y, int z, Side side, int meta, Player player, Item item) {
		boolean isFertilized = BlockLogicFarmland.isFertilized(world.getBlockMetadata(x, y - 1, z));
		if (isFertilized && !world.isClientSide) {
			boolean shouldDefertilize = world.rand.nextInt(3) == 2;
			if (shouldDefertilize) {
				world.setBlockMetadata(x, y - 1, z, BlockLogicFarmland.setFertilized(world.getBlockMetadata(x, y - 1, z), false));
			}
		}

	}

	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int meta, TileEntity tileEntity) {
		return meta != 7 ? new ItemStack[]{new ItemStack(FeaturesItems.flux_Seed)} : new ItemStack[]{new ItemStack(FeaturesItems.flux_Seed, world.rand.nextInt(3) + 1), new ItemStack(Items.STRING)};
	}

	public boolean onBonemealUsed(ItemStack itemstack, @Nullable Player player, World world, int blockX, int blockY, int blockZ, Side side, double xPlaced, double yPlaced) {
		if (world.getBlockMetadata(blockX, blockY, blockZ) >= 7) {
			return false;
		} else {
			if (!world.isClientSide) {
				this.fertilize(world, blockX, blockY, blockZ);
				if (player.getGamemode().consumeBlocks()) {
					--itemstack.stackSize;
				}
			}
			return true;
		}
	}
}
