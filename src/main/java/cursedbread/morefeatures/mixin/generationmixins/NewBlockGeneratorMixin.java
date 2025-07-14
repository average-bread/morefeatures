package cursedbread.morefeatures.mixin.generationmixins;

import cursedbread.morefeatures.FeaturesMain;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.BlockLogicFluid;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.sound.SoundCategory;
import net.minecraft.core.world.World;
import net.minecraft.core.world.biome.BiomeNether;
import net.minecraft.core.world.biome.Biomes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = BlockLogicFluid.class, remap = false)

public class NewBlockGeneratorMixin extends BlockLogic {

	public NewBlockGeneratorMixin(Block<?> block, Material material) {
		super(block, material);
	}

	@Unique
	protected void fizz(World world, int x, int y, int z) {
		world.playSoundEffect((Entity)null, SoundCategory.WORLD_SOUNDS, (double)((float)x + 0.5F), (double)((float)y + 0.5F), (double)((float)z + 0.5F), "random.fizz", 0.5F, 2.6F + (world.rand.nextFloat() - world.rand.nextFloat()) * 0.8F);

		for(int i = 0; i < 8; ++i) {
			world.spawnParticle("largesmoke", (double)x + Math.random(), (double)y + 1.2, (double)z + Math.random(), 0.0, 0.0, 0.0, 0);
		}

	}


	@Inject(method = "checkForHarden", at = @At("HEAD"), cancellable = true)
	private void checkForHarden(World world, int x, int y, int z, CallbackInfo ci) {
		if (FeaturesMain.newGenerators == 1){
			int data = world.getBlockMetadata(x, y, z) & 15;
			boolean permaiceId = (
				world.getBlockId(x, y-1, z) == Blocks.PERMAICE.id() ||
				world.getBlockId(x, y+1, z) == Blocks.PERMAICE.id() ||
				world.getBlockId(x+1, y, z) == Blocks.PERMAICE.id() ||
				world.getBlockId(x-1, y, z) == Blocks.PERMAICE.id() ||
				world.getBlockId(x, y, z+1) == Blocks.PERMAICE.id() ||
				world.getBlockId(x, y, z-1) == Blocks.PERMAICE.id()
			);

			boolean nethercoalId = (
				world.getBlockId(x, y-1, z) == Blocks.BLOCK_NETHER_COAL.id() ||
				world.getBlockId(x, y+1, z) == Blocks.BLOCK_NETHER_COAL.id() ||
				world.getBlockId(x+1, y, z) == Blocks.BLOCK_NETHER_COAL.id() ||
				world.getBlockId(x-1, y, z) == Blocks.BLOCK_NETHER_COAL.id() ||
				world.getBlockId(x, y, z+1) == Blocks.BLOCK_NETHER_COAL.id() ||
				world.getBlockId(x, y, z-1) == Blocks.BLOCK_NETHER_COAL.id()
			);

			if (this.material == Material.lava &&
				(world.getBlockMaterial(x, y, z - 1) == Material.water ||
					world.getBlockMaterial(x, y, z + 1) == Material.water ||
					world.getBlockMaterial(x - 1, y, z) == Material.water ||
					world.getBlockMaterial(x + 1, y, z) == Material.water ||
					world.getBlockMaterial(x, y + 1, z) == Material.water)) {
				if (data != 0 && permaiceId) {
					if (nethercoalId) {
						world.setBlockWithNotify(x, y, z, Blocks.PERMAFROST.id());
					} else {
					world.setBlockWithNotify(x, y, z, Blocks.COBBLE_PERMAFROST.id());
					}
				} else if (data != 0 && world.getBlockBiome(x, y, z) == Biomes.NETHER_NETHER) {
					if (nethercoalId) {
						world.setBlockWithNotify(x, y, z, Blocks.NETHERRACK.id());
					} else {
						world.setBlockWithNotify(x, y, z, Blocks.COBBLE_NETHERRACK.id());
					}
				} else if (data <= 2 && nethercoalId) {
					world.setBlockWithNotify(x, y, z, Blocks.GRANITE.id());
				} else if (data <= 4 && nethercoalId) {
					world.setBlockWithNotify(x, y, z, Blocks.STONE.id());
				} else if (nethercoalId){
					world.setBlockWithNotify(x, y, z, Blocks.BASALT.id());
				}

				this.fizz(world, x, y, z);
			}
			if (this.material == Material.water &&
				(world.getBlockMaterial(x, y, z - 1) == Material.lava ||
					world.getBlockMaterial(x, y, z + 1) == Material.lava ||
					world.getBlockMaterial(x - 1, y, z) == Material.lava ||
					world.getBlockMaterial(x + 1, y, z) == Material.lava ||
					world.getBlockMaterial(x, y + 1, z) == Material.lava)) {
				if (data == 0 && nethercoalId) {
					world.setBlockWithNotify(x, y, z, Blocks.LIMESTONE.id());
					this.fizz(world, x, y, z);
				}
			}
		}
	}
}
