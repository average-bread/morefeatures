package cursedbread.morefeatures.blocks.ores;

import net.minecraft.client.util.helper.Colors;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import net.minecraft.core.util.helper.Color;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import net.minecraft.core.world.WorldSource;

import java.util.Random;

public class BlockLogicSuperOreRedstone extends BlockLogic {
	private boolean illuminated;
	private Block<?> keyNormal;
	private Block<?> keyIlluminated;

	public BlockLogicSuperOreRedstone(Block<?> block, Block<?> parentBlock, Material material, boolean illuminated, Block<?> normalBlock, Block<?> illuminatedBlock) {
		super(block, Material.stone);
		if (illuminated) {
			block.setTicking(true);
		}

		this.illuminated = illuminated;
		this.keyNormal = normalBlock;
		this.keyIlluminated = illuminatedBlock;
	}

	public boolean isSignalSource() {
		return true;
	}

	public boolean getSignal(WorldSource worldSource, int x, int y, int z, Side side) {
		return true;
	}

	public boolean getDirectSignal(World world, int x, int y, int z, Side side) {
		return this.getSignal(world, x, y, z, side);
	}

	public void onBlockPlacedByWorld(World world, int x, int y, int z) {
		Side[] var5 = Side.sides;
		int var6 = var5.length;

		for(int var7 = 0; var7 < var6; ++var7) {
			Side s = var5[var7];
			world.notifyBlocksOfNeighborChange(x + s.getOffsetX(), y + s.getOffsetY(), z + s.getOffsetZ(), this.id());
		}

	}

	public void onBlockRemoved(World world, int x, int y, int z, int data) {
		Side[] var6 = Side.sides;
		int var7 = var6.length;

		for(int var8 = 0; var8 < var7; ++var8) {
			Side s = var6[var8];
			world.notifyBlocksOfNeighborChange(x + s.getOffsetX(), y + s.getOffsetY(), z + s.getOffsetZ(), this.id());
		}

	}

	public void onBlockLeftClicked(World world, int x, int y, int z, Player player, Side side, double xHit, double yHit) {
		this.lightRedstone(world, x, y, z);
		super.onBlockLeftClicked(world, x, y, z, player, side, xHit, yHit);
	}

	public void onEntityWalking(World world, int x, int y, int z, Entity entity) {
		this.lightRedstone(world, x, y, z);
		super.onEntityWalking(world, x, y, z, entity);
	}

	private void lightRedstone(World world, int i, int j, int k) {
		this.spawnParticles(world, i, j, k);
		if (!this.illuminated) {
			world.setBlockWithNotify(i, j, k, world.getBlockId(i, j, k) + 5);
		}

	}

	public void updateTick(World world, int x, int y, int z, Random rand) {
		if (this.illuminated) {
			world.setBlockWithNotify(x, y, z, world.getBlockId(x, y, z) - 5);
		}

	}

	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
		switch (dropCause) {
			case SILK_TOUCH:
			case PICK_BLOCK:
				return new ItemStack[]{new ItemStack(this)};
			case EXPLOSION:
			case PROPER_TOOL:
				return new ItemStack[]{new ItemStack(Items.DUST_REDSTONE, (4 + world.rand.nextInt(2)) * (2 + world.rand.nextInt(3)))};
			default:
				return null;
		}
	}

	public void animationTick(World world, int x, int y, int z, Random rand) {
		this.spawnParticles(world, x, y, z);
	}

	private void spawnParticles(World world, int x, int y, int z) {
		Random random = world.rand;
		int redstoneBrightness = 10;
		double d = 0.0625;

		for (int i = 0; i < 6; i++) {
			double px = (double)x + (double)random.nextFloat();
			double py = (double)y + (double)random.nextFloat();
			double pz = (double)z + (double)random.nextFloat();
			if (i == 0 && !world.isBlockOpaqueCube(x, y + 1, z)) {
				py = (double)(y + 1) + d;
			}

			if (i == 1 && !world.isBlockOpaqueCube(x, y - 1, z)) {
				py = (double)y - d;
			}

			if (i == 2 && !world.isBlockOpaqueCube(x, y, z + 1)) {
				pz = (double)(z + 1) + d;
			}

			if (i == 3 && !world.isBlockOpaqueCube(x, y, z - 1)) {
				pz = (double)z - d;
			}

			if (i == 4 && !world.isBlockOpaqueCube(x + 1, y, z)) {
				px = (double)(x + 1) + d;
			}

			if (i == 5 && !world.isBlockOpaqueCube(x - 1, y, z)) {
				px = (double)x - d;
			}

			if (px < (double)x || px > (double)(x + 1) || py < 0.0 || py > (double)(y + 1) || pz < (double)z || pz > (double)(z + 1)) {
				world.spawnParticle("reddust", px, py, pz, 0.0, 0.0, 0.0, 10);
			}
		}
	}
}
