package cursedbread.morefeatures.mixin;

import cursedbread.morefeatures.FeaturesMain;
import cursedbread.morefeatures.blocks.FeaturesBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.world.World;
import net.minecraft.core.world.generate.feature.WorldFeatureGlowstoneA;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Random;

@Mixin(value = WorldFeatureGlowstoneA.class, remap = false)
public class ColoredGlowstoneAMixin {

	@Inject(method = "generate(Lnet/minecraft/core/world/World;Ljava/util/Random;III)Z", at = @At("HEAD"), cancellable = true)
	public void generate(World world, Random random, int x, int y, int z, CallbackInfoReturnable<Boolean> cir) {
		if (FeaturesBlocks.glowstoneEnabled == 1) {
			int g = random.nextInt(3);
			if (g == 1) {
				if (!world.isAirBlock(x, y, z)) {
					cir.setReturnValue(false);
				} else if (world.getBlockId(x, y + 1, z) != Block.netherrack.id) {
					cir.setReturnValue(false);
				} else {
					int r = random.nextInt(16);
					world.setBlockAndMetadataWithNotify(x, y, z, FeaturesBlocks.vanillaColoredGlowstone.id, r);

					for(int l = 0; l < 1500; ++l) {
						int i1 = x + random.nextInt(8) - random.nextInt(8);
						int j1 = y - random.nextInt(12);
						int k1 = z + random.nextInt(8) - random.nextInt(8);
						if (world.getBlockId(i1, j1, k1) == 0) {
							int l1 = 0;

							for(int i2 = 0; i2 < 6; ++i2) {
								int j2 = 0;
								if (i2 == 0) {
									j2 = world.getBlockId(i1 - 1, j1, k1);
								}

								if (i2 == 1) {
									j2 = world.getBlockId(i1 + 1, j1, k1);
								}

								if (i2 == 2) {
									j2 = world.getBlockId(i1, j1 - 1, k1);
								}

								if (i2 == 3) {
									j2 = world.getBlockId(i1, j1 + 1, k1);
								}

								if (i2 == 4) {
									j2 = world.getBlockId(i1, j1, k1 - 1);
								}

								if (i2 == 5) {
									j2 = world.getBlockId(i1, j1, k1 + 1);
								}

								if (j2 == FeaturesBlocks.vanillaColoredGlowstone.id) {
									++l1;
								}
							}
							if (l1 == 1) {
								world.setBlockAndMetadataWithNotify(i1, j1, k1, FeaturesBlocks.vanillaColoredGlowstone.id, r);
							}
						}
					}
					cir.setReturnValue(true);
				}
			}
			if (FeaturesMain.nonamedyesOn) {
				if (g == 2){
					if (!world.isAirBlock(x, y, z)) {
						cir.setReturnValue(false);
					} else if (world.getBlockId(x, y + 1, z) != Block.netherrack.id) {
						cir.setReturnValue(false);
					} else {
						int r = random.nextInt(13 );
						world.setBlockAndMetadataWithNotify(x, y, z, FeaturesBlocks.nonameColoredGlowstone.id, r);

						for(int l = 0; l < 1500; ++l) {
							int i1 = x + random.nextInt(8) - random.nextInt(8);
							int j1 = y - random.nextInt(12);
							int k1 = z + random.nextInt(8) - random.nextInt(8);
							if (world.getBlockId(i1, j1, k1) == 0) {
								int l1 = 0;

								for(int i2 = 0; i2 < 6; ++i2) {
									int j2 = 0;
									if (i2 == 0) {
										j2 = world.getBlockId(i1 - 1, j1, k1);
									}

									if (i2 == 1) {
										j2 = world.getBlockId(i1 + 1, j1, k1);
									}

									if (i2 == 2) {
										j2 = world.getBlockId(i1, j1 - 1, k1);
									}

									if (i2 == 3) {
										j2 = world.getBlockId(i1, j1 + 1, k1);
									}

									if (i2 == 4) {
										j2 = world.getBlockId(i1, j1, k1 - 1);
									}

									if (i2 == 5) {
										j2 = world.getBlockId(i1, j1, k1 + 1);
									}

									if (j2 == FeaturesBlocks.nonameColoredGlowstone.id) {
										++l1;
									}
								}
								if (l1 == 1) {
									world.setBlockAndMetadataWithNotify(i1, j1, k1, FeaturesBlocks.nonameColoredGlowstone.id, r);
								}
							}
						}
						cir.setReturnValue(true);
					}
				}
			}
		}
	}
}
