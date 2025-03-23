package cursedbread.morefeatures.mixin.generationmixins;

import cursedbread.morefeatures.blocks.FeaturesBlocks;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.world.World;
import net.minecraft.core.world.generate.feature.WorldFeatureGlowstoneB;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Random;

@Mixin(value = WorldFeatureGlowstoneB.class, remap = false)
public class ColoredGlowstoneBMixin {

	public void glowstonegeneration(World world, Random random, int x, int y, int z, CallbackInfoReturnable<Boolean> cir){
		if (FeaturesBlocks.coloredBlocksEnabled == 1) {
			int g = random.nextInt(3);
			if (g == 1) {
				if (!world.isAirBlock(x, y, z)) {
					cir.setReturnValue(false);
				} else if (world.getBlockId(x, y + 1, z) != Blocks.COBBLE_NETHERRACK.id()) {
					cir.setReturnValue(false);
				} else {
					int p = random.nextInt(5);
					int r;
					if (p == 0) {
						r = 0;
					} else if (p == 1) {
						r = 1;
					} else if (p == 2) {
						r = 4;
					} else if (p == 3) {
						r = 12;
					} else {
						r = 14;
					}
					world.setBlockAndMetadataWithNotify(x, y, z, FeaturesBlocks.vanillaColoredGlowstone.id(), r);

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

								if (j2 == FeaturesBlocks.vanillaColoredGlowstone.id()) {
									++l1;
								}
							}
							if (l1 == 1) {
								world.setBlockAndMetadataWithNotify(i1, j1, k1, FeaturesBlocks.vanillaColoredGlowstone.id(), r);
							}
						}
					}
					cir.setReturnValue(true);
				}
			}
			if (/*FeaturesMain.nonamedyesOn*/ false) {
				if (g == 2){
					if (!world.isAirBlock(x, y, z)) {
						cir.setReturnValue(false);
					} else if (world.getBlockId(x, y + 1, z) != Blocks.COBBLE_NETHERRACK.id()) {
						cir.setReturnValue(false);
					} else {
						int p = random.nextInt(3);
						int r;
						if (p == 0) {
							r = 0;
						} else if (p == 1){
							r = 1;
						} else {
							r = 9;
						}
						world.setBlockAndMetadataWithNotify(x, y, z, FeaturesBlocks.nonameColoredGlowstone.id(), r);

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

									if (j2 == FeaturesBlocks.nonameColoredGlowstone.id()) {
										++l1;
									}
								}
								if (l1 == 1) {
									world.setBlockAndMetadataWithNotify(i1, j1, k1, FeaturesBlocks.nonameColoredGlowstone.id(), r);
								}
							}
						}
						cir.setReturnValue(true);
					}
				}
			}
		}
	}

	@Inject(method = "place", at = @At("HEAD"), cancellable = true)
	public void generate(World world, Random random, int x, int y, int z, CallbackInfoReturnable<Boolean> cir) {
		glowstonegeneration(world, random, x, y, z, cir);
	}
}
