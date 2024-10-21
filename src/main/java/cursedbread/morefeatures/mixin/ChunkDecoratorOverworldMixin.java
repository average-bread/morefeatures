package cursedbread.morefeatures.mixin;

import cursedbread.morefeatures.blocks.FeaturesBlocks;
import net.minecraft.core.block.BlockSand;
import net.minecraft.core.world.World;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.chunk.Chunk;
import net.minecraft.core.world.generate.chunk.perlin.overworld.ChunkDecoratorOverworld;
import net.minecraft.core.world.generate.feature.WorldFeatureFlowers;
import net.minecraft.core.world.generate.feature.WorldFeatureOre;
import net.minecraft.core.world.noise.PerlinNoise;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

import static org.apache.log4j.builders.appender.SocketAppenderBuilder.LOGGER;

@Debug(export=true)
@Mixin(value = ChunkDecoratorOverworld.class, remap = false)
public class ChunkDecoratorOverworldMixin {

    @Shadow @Final private PerlinNoise treeDensityNoise;
    @Final private World world;


    @Inject(method = "decorate", at=@At("TAIL"))
    public void decorate(Chunk chunk, CallbackInfo info) {
		if (FeaturesBlocks.rainbowflowerEnabled == 1) {
			int chunkX = chunk.xPosition;
			int chunkZ = chunk.zPosition;
			int minY = world.getWorldType().getMinY();
			int maxY = world.getWorldType().getMaxY();
			int rangeY = maxY + 1 - minY;
			BlockSand.fallInstantly = true;
			int x = chunkX << 4;
			int z = chunkZ << 4;
			int y = world.getHeightValue(x + 16, z + 16);
			Biome biome = world.getBlockBiome(x + 16, y, z + 16);
			Random rand = new Random(this.world.getRandomSeed());
			long l1 = rand.nextLong() / 2L * 2L + 1L;
			long l2 = rand.nextLong() / 2L * 2L + 1L;
			rand.setSeed((long) chunkX * l1 + (long) chunkZ * l2 ^ this.world.getRandomSeed());
			int blockX, blockY, blockZ;

			if ((rand.nextInt(2) == 0)) {
				blockX = x + rand.nextInt(16) + 8;
				blockY = minY + rand.nextInt(rangeY);
				blockZ = z + rand.nextInt(16) + 8;
				new WorldFeatureFlowers(FeaturesBlocks.rainbowFlower.id).generate(world, rand, blockX, blockY, blockZ);
			}
		}

		/*if (FeaturesBlocks.superoresEnabled == 1) {
			int minY = this.world.getWorldType().getMinY();
			int maxY = this.world.getWorldType().getMaxY();
			int rangeY = maxY + 1 - minY;
			int k4;
			float oreHeightModifier = (float) rangeY / 128.0F;
			int treeDensity;
			int chunkX = chunk.xPosition;
			int x = chunkX << 4;
			Random rand = new Random(this.world.getRandomSeed());
			int i11;
			int chunkZ = chunk.zPosition;
			int z = chunkZ << 4;
			for (k4 = 0; (float) k4 < 20.0F * oreHeightModifier; ++k4) {
				treeDensity = x + rand.nextInt(16);
				i11 = minY + rand.nextInt(rangeY);
				i11 = z + rand.nextInt(16);
				(new WorldFeatureOre(FeaturesBlocks.superCoalStoneOre.id, 16, true)).generate(this.world, rand, treeDensity, i11, i11);
			}

			for (k4 = 0; (float) k4 < 20.0F * oreHeightModifier; ++k4) {
				treeDensity = x + rand.nextInt(16);
				i11 = minY + rand.nextInt(rangeY / 2);
				i11 = z + rand.nextInt(16);
				(new WorldFeatureOre(FeaturesBlocks.superIronStoneOre.id, 8, true)).generate(this.world, rand, treeDensity, i11, i11);
			}

			for (k4 = 0; (float) k4 < 2.0F * oreHeightModifier; ++k4) {
				treeDensity = x + rand.nextInt(16);
				i11 = minY + rand.nextInt(rangeY / 4);
				i11 = z + rand.nextInt(16);
				(new WorldFeatureOre(FeaturesBlocks.superGoldStoneOre.id, 8, true)).generate(this.world, rand, treeDensity, i11, i11);
			}

			for (k4 = 0; (float) k4 < oreHeightModifier; ++k4) {
				treeDensity = x + rand.nextInt(16);
				i11 = minY + rand.nextInt(rangeY / 8) + rand.nextInt(rangeY / 8);
				i11 = z + rand.nextInt(16);
				(new WorldFeatureOre(FeaturesBlocks.superLapisStoneOre.id, 6, true)).generate(this.world, rand, treeDensity, i11, i11);
			}

			for (k4 = 0; (float) k4 < 8.0F * oreHeightModifier; ++k4) {
				treeDensity = x + rand.nextInt(16);
				i11 = minY + rand.nextInt(rangeY / 8);
				i11 = z + rand.nextInt(16);
				(new WorldFeatureOre(FeaturesBlocks.superRedstoneStoneOre.id, 7, true)).generate(this.world, rand, treeDensity, i11, i11);
			}

			for (k4 = 0; (float) k4 < oreHeightModifier; ++k4) {
				treeDensity = x + rand.nextInt(16);
				i11 = minY + rand.nextInt(rangeY / 8);
				i11 = z + rand.nextInt(16);
				(new WorldFeatureOre(FeaturesBlocks.superDiamondStoneOre.id, 7, true)).generate(this.world, rand, treeDensity, i11, i11);
			}
		}*/
	}
}

