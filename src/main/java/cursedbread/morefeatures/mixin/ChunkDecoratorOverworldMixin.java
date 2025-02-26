package cursedbread.morefeatures.mixin;

import cursedbread.morefeatures.blocks.FeaturesBlocks;
import net.minecraft.core.block.BlockLogicSand;
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
			BlockLogicSand.fallInstantly = true;
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
				new WorldFeatureFlowers(FeaturesBlocks.rainbowFlower.id(), 1, false).place(world, rand, blockX, blockY, blockZ);
			}
		}
	}
}

