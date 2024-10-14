package cursedbread.morefeatures.blocks.other;

import cursedbread.morefeatures.blocks.FeaturesBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.sound.SoundCategory;
import net.minecraft.core.world.Dimension;
import net.minecraft.core.world.World;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.biome.Biomes;

import java.util.Random;

import static cursedbread.morefeatures.FeaturesMain.LOGGER;

public class BlockHam extends Block {
	public BlockHam(String key, int id, Material material) {
		super(key, id, material);
		this.setTicking(true);
	}

	public void onBlockAdded(World world, int x, int y, int z) {
		world.scheduleBlockUpdate(x, y, z, this.id, this.tickRate());
		Biome biome = world.getBlockBiome(x,y,z);
		if (biome == Biomes.NETHER_NETHER) {
			world.setBlock(x, y, z, FeaturesBlocks.cookedham.id);
			for (int i = 0; i < 10; i++){
				world.spawnParticle("largesmoke", (double)x + Math.random(), (double)y + 1.5, (double)z + Math.random(), 0.0, 0.0, 0.0, 0);
				world.playSoundEffect(null, SoundCategory.WORLD_SOUNDS, (double)x + 0.5, (double)y + 0.5, (double)z + 0.5, "random.fizz", 0.5F, 2.6F + (world.rand.nextFloat() - world.rand.nextFloat()) * 0.8F);
			}
		}
	}
}
