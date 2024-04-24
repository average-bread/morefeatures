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

	@Unique
	private boolean isHot;

	@Unique
	private boolean isSwamp;

	@Inject(method = "generate", at = @At("HEAD"))
	public void generate(World world, Random random, int x, int y, int z, CallbackInfoReturnable<Boolean> cir) {
		Biome biome = world.getBlockBiome(x, y, z);
		if (FeaturesMain.newDungeonsEnabled == 1) {
			if (biome == Biomes.OVERWORLD_DESERT || biome == Biomes.OVERWORLD_OUTBACK) {
				this.isHot = true;
			}
			if (biome == Biomes.OVERWORLD_SWAMPLAND || biome == Biomes.OVERWORLD_SWAMPLAND_MUDDY) {
				this.wallBlockA = Block.mudBaked.id;
				this.wallBlockB = Block.mudBaked.id;
				this.brickBlockA = Block.logOakMossy.id;
				this.brickBlockB = Block.logOakMossy.id;
				this.slabBlock = Block.slabPlanksOak.id;
				this.isSwamp = true;
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
			int i = random.nextInt(2);
			if (i == 1) {
				this.wallBlockA = Block.brickClay.id;
				this.wallBlockB = Block.brickClay.id;
				this.brickBlockA = Block.brickLapis.id;
				this.brickBlockB = Block.brickLapis.id;
				this.slabBlock = Block.slabBrickClay.id;
			}
		}
	}


	@Inject(method = "pickMobSpawner(Ljava/util/Random;)Ljava/lang/String;", at = @At("HEAD"), cancellable = true)
	private void pickMobSpawner(Random random, CallbackInfoReturnable<String> cir) {
		if (FeaturesMain.newDungeonsEnabled == 1) {
			int i = random.nextInt(4);
			if (i == 0) {
				cir.setReturnValue("Skeleton");
			} else if (i == 1) {
				cir.setReturnValue("Zombie");
			} else{
				cir.setReturnValue(isSwamp && i == 2 ? "Creeper" : "ArmouredZombie");
				cir.setReturnValue(isHot && i == 2 ? "Scorpion" : "ArmouredZombie");
			}
		}
	}
}
