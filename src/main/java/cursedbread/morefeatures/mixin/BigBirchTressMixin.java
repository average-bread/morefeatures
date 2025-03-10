package cursedbread.morefeatures.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicSaplingBirch;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.world.World;
import net.minecraft.core.world.generate.feature.WorldFeature;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTree;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTreeFancy;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

@Mixin(value= BlockLogicSaplingBirch.class, remap = false)
public class BigBirchTressMixin {

	@Inject(method = "growTree", at = @At(value = "HEAD", target = "growTree(Lnet/minecraft/core/world/World;IIILjava/util/Random;)V"), cancellable = true)

	public void growTree(World world, int i, int j, int k, Random random, CallbackInfo ci) {
		WorldFeature treeBig = new WorldFeatureTreeFancy(Blocks.LEAVES_BIRCH.id(), Blocks.LOG_BIRCH.id());
		WorldFeature treeSmall = new WorldFeatureTree(Blocks.LEAVES_BIRCH.id(), Blocks.LOG_BIRCH.id(), 5);
		world.setBlock(i, j, k, 0);
		if (!treeSmall.place(world, random, i, j, k) && !treeBig.place(world, random, i, j, k)) {
			world.setBlock(i, j, k, Blocks.SAPLING_BIRCH.id());
		}
		ci.cancel();
	}
}
