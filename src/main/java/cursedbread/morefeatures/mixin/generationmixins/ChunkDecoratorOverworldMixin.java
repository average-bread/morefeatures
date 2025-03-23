package cursedbread.morefeatures.mixin.generationmixins;

import cursedbread.morefeatures.FeaturesMain;
import cursedbread.morefeatures.blocks.FeaturesBlocks;
import net.minecraft.core.block.BlockLogicSand;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.world.World;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.biome.Biomes;
import net.minecraft.core.world.chunk.Chunk;
import net.minecraft.core.world.generate.chunk.perlin.overworld.ChunkDecoratorOverworld;
import net.minecraft.core.world.generate.feature.WorldFeatureDungeon;
import net.minecraft.core.world.generate.feature.WorldFeatureFlowers;
import net.minecraft.core.world.noise.PerlinNoise;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

@Mixin(value = ChunkDecoratorOverworld.class, remap = false)
public class ChunkDecoratorOverworldMixin {

    @Shadow @Final private PerlinNoise treeDensityNoise;
    @Final private World world;

	@Unique
	private boolean isHot;

	@Unique
	private boolean isSwamp;

	@Unique
	private boolean isCold;


    @Inject(method = "decorate", at=@At("TAIL"))
    public void decorate(Chunk chunk, CallbackInfo info) {
		int chunkX = chunk.xPosition;
		int chunkZ = chunk.zPosition;
		int minY = world.getWorldType().getMinY();
		int maxY = world.getWorldType().getMaxY();
		int rangeY = maxY + 1 - minY;
		BlockLogicSand.fallInstantly = true;
		int x = chunkX << 4;
		int z = chunkZ << 4;
		int y = world.getHeightValue(x + 16, z + 16);
		Random rand = new Random(this.world.getRandomSeed());
		long l1 = rand.nextLong() / 2L * 2L + 1L;
		long l2 = rand.nextLong() / 2L * 2L + 1L;
		rand.setSeed((long) chunkX * l1 + (long) chunkZ * l2 ^ this.world.getRandomSeed());
		int blockX, blockY, blockZ;
		int j4;
		int k7;
		int k4;
		float oreHeightModifier = (float)rangeY / 128.0F;
		int treeDensity;

		if (FeaturesBlocks.plantEnabled == 1) {
			if ((rand.nextInt(2) == 0)) {
				blockX = x + rand.nextInt(16) + 8;
				blockY = minY + rand.nextInt(rangeY);
				blockZ = z + rand.nextInt(16) + 8;
				new WorldFeatureFlowers(FeaturesBlocks.rainbowFlower.id(), 1, false).place(world, rand, blockX, blockY, blockZ);
			}
		}

		if (FeaturesMain.newDungeonsEnabled == 1){
			for(j4 = 0; (float)j4 < 8.0F * oreHeightModifier; ++j4) {
				k7 = x + rand.nextInt(16) + 8;
				k4 = minY + rand.nextInt(rangeY);
				treeDensity = z + rand.nextInt(16) + 8;

				Biome biome = world.getBlockBiome(x + 16, y, z + 16);
				if (biome == Biomes.OVERWORLD_DESERT || biome == Biomes.OVERWORLD_OUTBACK) {
					this.isHot = true;
				} else if (biome == Biomes.OVERWORLD_SWAMPLAND || biome == Biomes.OVERWORLD_SWAMPLAND_MUDDY) {
					this.isSwamp = true;
				} else if (biome == Biomes.OVERWORLD_TAIGA || biome == Biomes.OVERWORLD_TUNDRA || biome == Biomes.OVERWORLD_GLACIER) {
					this.isCold = true;
				} else {
					this.isHot = false;
					this.isSwamp = false;
					this.isCold = false;
				}

				if (world.getBlockId(x, y, z) == Blocks.GRANITE.id()) {
					(new WorldFeatureDungeon(Blocks.COBBLE_GRANITE.id(), Blocks.COBBLE_GRANITE.id(), (String)null)).place(this.world, rand, k7, k4, treeDensity);
				}
				if (world.getBlockId(x, y, z) == Blocks.BASALT.id()) {
					(new WorldFeatureDungeon(Blocks.COBBLE_BASALT.id(), Blocks.COBBLE_BASALT.id(), (String)null)).place(this.world, rand, k7, k4, treeDensity);
				}
				if (world.getBlockId(x, y, z) == Blocks.LIMESTONE.id()) {
					(new WorldFeatureDungeon(Blocks.COBBLE_LIMESTONE.id(), Blocks.COBBLE_LIMESTONE.id(), (String)null)).place(this.world, rand, k7, k4, treeDensity);
				}
				if (isHot) {
					(new WorldFeatureDungeon(Blocks.SANDSTONE.id(), Blocks.SANDSTONE.id(), (String)null)).place(this.world, rand, k7, k4, treeDensity);
				}
				if (isCold) {
					(new WorldFeatureDungeon(Blocks.COBBLE_PERMAFROST.id(), Blocks.COBBLE_PERMAFROST.id(), (String)null)).place(this.world, rand, k7, k4, treeDensity);
				}
				if (isSwamp) {
					(new WorldFeatureDungeon(Blocks.MUD_BAKED.id(), Blocks.MUD_BAKED.id(), (String)null)).place(this.world, rand, k7, k4, treeDensity);
				}
			}
		}
	}
}

