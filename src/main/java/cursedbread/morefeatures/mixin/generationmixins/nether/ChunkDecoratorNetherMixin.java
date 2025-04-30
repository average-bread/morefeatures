package cursedbread.morefeatures.mixin.generationmixins.nether;

import cursedbread.morefeatures.FeaturesMain;
import cursedbread.morefeatures.blocks.FeaturesBlocks;
import net.minecraft.core.block.BlockLogicGlass;
import net.minecraft.core.block.BlockLogicGravel;
import net.minecraft.core.block.BlockLogicSand;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.world.World;
import net.minecraft.core.world.chunk.Chunk;
import net.minecraft.core.world.generate.chunk.ChunkDecorator;
import net.minecraft.core.world.generate.chunk.perlin.nether.ChunkDecoratorNether;
import net.minecraft.core.world.generate.feature.WorldFeatureOre;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

@Mixin(value = ChunkDecoratorNether.class, remap = false)

public class ChunkDecoratorNetherMixin {
	@Shadow
	private final World world;

	public ChunkDecoratorNetherMixin(World world) {
		this.world = world;
	}

	@Inject(method = "decorate(Lnet/minecraft/core/world/chunk/Chunk;)V", at=@At("TAIL"))
	public void decorate(Chunk chunk, CallbackInfo ci) {
		int chunkX = chunk.xPosition;
		int chunkZ = chunk.zPosition;
		int minY = this.world.getWorldType().getMinY();
		int maxY = this.world.getWorldType().getMaxY();
		int rangeY = maxY + 1 - minY;
		Random rand = new Random((long)chunkX * 341873128712L + (long)chunkZ * 132897987541L);
		int x = chunkX * 16;
		int z = chunkZ * 16;
		int max;
		int i;
		int xf;
		int yf;
		int j4;
		int k7;
		int k4;
		int treeDensity;
		float oreHeightModifier = (float)rangeY / 128.0F;

		if (FeaturesBlocks.netherGravelEnabled == 1){
			for(j4 = 0; (float)j4 < oreHeightModifier; ++j4) {
				k7 = x + rand.nextInt(16);
				k4 = minY + rand.nextInt(rangeY);
				treeDensity = z + rand.nextInt(16);
				(new WorldFeatureOre(FeaturesBlocks.netherrack_Gravel.id(), 32)).place(this.world, rand, k7, k4, treeDensity);
			}
		}
	}
}
