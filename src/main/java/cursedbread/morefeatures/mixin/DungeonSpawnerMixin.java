package cursedbread.morefeatures.mixin;

import cursedbread.morefeatures.item.FeaturesItems;
import net.minecraft.core.block.Block;
import net.minecraft.core.item.ItemStack;
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

import java.util.Queue;
import java.util.Random;

@Mixin(value = WorldFeatureLabyrinth.class, remap = false)
public class DungeonSpawnerMixin {


	@Shadow
	private boolean isCold;



	@Inject(method = "pickMobSpawner", at = @At("HEAD"), cancellable = true)
	private void pickMobSpawner(Random random, CallbackInfoReturnable<String> cir) {
		int i = random.nextInt(4);
		if (i == 0) {
			cir.setReturnValue("Skeleton");
		} else if (i == 1) {
			cir.setReturnValue("Zombie");
		} else {
			cir.setReturnValue(!isCold && i == 2 ? "Scorpion" : "ArmouredZombie");
		}
	}
}
