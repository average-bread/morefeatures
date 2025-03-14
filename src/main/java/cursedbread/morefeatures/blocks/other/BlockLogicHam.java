package cursedbread.morefeatures.blocks.other;

import cursedbread.morefeatures.blocks.FeaturesBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.Mob;
import net.minecraft.core.sound.SoundCategory;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.biome.Biomes;
import org.jetbrains.annotations.NotNull;

public class BlockLogicHam extends BlockLogic {
	public BlockLogicHam(Block block, Material material) {
		super(block, material);
		block.setTicking(true);
	}

	public void onBlockPlacedByMob(World world, int x, int y, int z, @NotNull Side side, Mob mob, double xPlaced, double yPlaced) {
		world.scheduleBlockUpdate(x, y, z, id(), block.tickDelay());
		Biome biome = world.getBlockBiome(x,y,z);
		if (biome == Biomes.NETHER_NETHER) {
			world.setBlock(x, y, z, FeaturesBlocks.cookedham.id());
			for (int i = 0; i < 10; i++){
				world.spawnParticle("largesmoke", (double)x + Math.random(), (double)y + 1.5, (double)z + Math.random(), 0.0, 0.0, 0.0, 0);
				world.playSoundEffect(null, SoundCategory.WORLD_SOUNDS, (double)x + 0.5, (double)y + 0.5, (double)z + 0.5, "random.fizz", 0.5F, 2.6F + (world.rand.nextFloat() - world.rand.nextFloat()) * 0.8F);
			}
		}
	}
}
