package cursedbread.morefeatures.mixin.generationmixins;

import cursedbread.morefeatures.blocks.FeaturesBlocks;
import net.minecraft.core.block.*;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.sound.SoundCategory;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

@Mixin(value = BlockLogicLog.class, remap = false)

public class BurningLogMixin extends BlockLogic  {
	public BurningLogMixin(Block<?> block, Material material) {
		super(block, material);
	}

	@Inject(method= "<init>(Lnet/minecraft/core/block/Block;)V", at=@At("TAIL"))
	public void BlockLogicLog(Block block, CallbackInfo ci) {
		block.setTicking(true);
	}

	@Unique
	public int tickDelay() {
		return 20;
	}

	@Unique
	public void onNeighborBlockChange(World world, int x, int y, int z, int blockId) {
		world.scheduleBlockUpdate(x, y, z, this.block.id(), this.tickDelay() + world.rand.nextInt(5) - world.rand.nextInt(5));
	}

	@Unique
	public void onBlockPlacedByWorld(World world, int x, int y, int z) {
		world.scheduleBlockUpdate(x, y, z, this.block.id(), this.tickDelay() + world.rand.nextInt(5) - world.rand.nextInt(5));
	}

	@Unique
	public boolean canMelt(World world, int x, int y, int z) {
		boolean canMelt = false;
		Side[] var6 = Side.sides;
		int var7 = var6.length;

		for(int var8 = 0; var8 < var7; ++var8) {
			Side side = var6[var8];
			Block<?> block = world.getBlock(x + side.getOffsetX(), y + side.getOffsetY(), z + side.getOffsetZ());
			Material adjacentMaterial = block == null ? Material.air : block.getMaterial();
			if (adjacentMaterial == Material.water || FeaturesBlocks.miscBlocksEnabled != 1) {
				return false;
			}
			canMelt |= adjacentMaterial == Material.lava;
		}
		return canMelt;
	}

	@Unique
	public void updateTick(World world, int x, int y, int z, Random rand) {
		if (this.canMelt(world, x, y, z) && world.getBlockId(x, y, z) != FeaturesBlocks.burned_Log.id()) {
			int meta = world.getBlockMetadata(x, y, z);
			if (world.getBlockId(x, y+1, z) == 0){
				world.setBlockWithNotify(x, y+1, z, Blocks.FIRE.id());
			}
			world.setBlockAndMetadataWithNotify(x, y, z, FeaturesBlocks.burned_Log.id(), meta);
			world.playSoundEffect(null, SoundCategory.WORLD_SOUNDS, (double)x + 0.5, (double)y + 0.5, (double)z + 0.5, "random.fizz", 0.5F, 2.6F + (world.rand.nextFloat() - world.rand.nextFloat()) * 0.8F);
		}
	}
}
