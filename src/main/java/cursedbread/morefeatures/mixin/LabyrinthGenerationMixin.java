package cursedbread.morefeatures.mixin;

import cursedbread.morefeatures.FeaturesMain;
import net.minecraft.core.block.Block;
import net.minecraft.core.world.World;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.biome.Biomes;
import net.minecraft.core.world.generate.feature.WorldFeatureLabyrinth;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Random;

@Mixin(value = WorldFeatureLabyrinth.class, remap = false)
public class LabyrinthGenerationMixin {

	@Shadow
	int wallBlockA;
	@Shadow
	int wallBlockB;
	@Shadow
	int brickBlockA;
	@Shadow
	int brickBlockB;
	@Shadow
	int slabBlock;

	@Inject(method = "generate", at = @At("HEAD"))
	public void generate(World world, Random random, int x, int y, int z, CallbackInfoReturnable<Boolean> cir) {
		Biome biome = world.getBlockBiome(x, y, z);
		if (FeaturesMain.newDUngeonsEnabled == 1) {
			if (biome == Biomes.OVERWORLD_SWAMPLAND || biome == Biomes.OVERWORLD_SWAMPLAND_MUDDY) {
				this.wallBlockA = Block.mudBaked.id;
				this.wallBlockB = Block.mudBaked.id;
				this.brickBlockA = Block.logOakMossy.id;
				this.brickBlockB = Block.logOakMossy.id;
				this.slabBlock = Block.slabPlanksOak.id;
			}
			if (world.getBlockId(x, y, z) == Block.limestone.id) {
				this.wallBlockA = Block.cobbleLimestone.id;
				this.wallBlockB = Block.cobbleLimestone.id;
				this.brickBlockA = Block.brickLimestone.id;
				this.brickBlockB = Block.brickLimestone.id;
				this.slabBlock = Block.slabBrickLimestone.id;
			}
			if (world.getBlockId(x, y, z) == Block.basalt.id) {
				this.wallBlockA = Block.cobbleBasalt.id;
				this.wallBlockB = Block.cobbleBasalt.id;
				this.brickBlockA = Block.brickBasalt.id;
				this.brickBlockB = Block.brickBasalt.id;
				this.slabBlock = Block.slabBrickBasalt.id;
			}
			if (world.getBlockId(x, y, z) == Block.granite.id) {
				this.wallBlockA = Block.cobbleGranite.id;
				this.wallBlockB = Block.cobbleGranite.id;
				this.brickBlockA = Block.brickGranite.id;
				this.brickBlockB = Block.brickGranite.id;
				this.slabBlock = Block.slabBrickGranite.id;
			}
		}
	}
}
