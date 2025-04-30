package cursedbread.morefeatures.mixin.generationmixins;

import cursedbread.morefeatures.FeaturesMain;
import cursedbread.morefeatures.item.FeaturesItems;
import net.minecraft.core.block.Blocks;
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

	@Inject(method = "place", at = @At("HEAD"))
	public void generate(World world, Random random, int x, int y, int z, CallbackInfoReturnable<Boolean> cir) {
		Biome biome = world.getBlockBiome(x, y, z);
		if (FeaturesMain.newDungeonsEnabled == 1) {
			if (biome == Biomes.OVERWORLD_DESERT || biome == Biomes.OVERWORLD_OUTBACK) {
				this.isHot = true;
			}
			if (biome == Biomes.OVERWORLD_SWAMPLAND || biome == Biomes.OVERWORLD_SWAMPLAND_MUDDY) {
				this.wallBlockA = Blocks.MUD_BAKED.id();
				this.wallBlockB = Blocks.MUD_BAKED.id();
				this.brickBlockA = Blocks.LOG_OAK_MOSSY.id();
				this.brickBlockB = Blocks.LOG_OAK_MOSSY.id();
				this.slabBlock = Blocks.SLAB_PLANKS_OAK.id();
				this.isSwamp = true;
			}
			if (world.getBlockId(x, y, z) == Blocks.LIMESTONE.id()) {
				this.wallBlockA = Blocks.COBBLE_LIMESTONE.id();
				this.wallBlockB = Blocks.COBBLE_LIMESTONE.id();
				this.brickBlockA = Blocks.BRICK_LIMESTONE.id();
				this.brickBlockB = Blocks.BRICK_LIMESTONE.id();
				this.slabBlock = Blocks.SLAB_BRICK_LIMESTONE.id();
			}
			if (world.getBlockId(x, y, z) == Blocks.BASALT.id()) {
				this.wallBlockA = Blocks.COBBLE_BASALT.id();
				this.wallBlockB = Blocks.COBBLE_BASALT.id();
				this.brickBlockA = Blocks.BRICK_BASALT.id();
				this.brickBlockB = Blocks.BRICK_BASALT.id();
				this.slabBlock = Blocks.SLAB_BRICK_BASALT.id();
			}
			if (world.getBlockId(x, y, z) == Blocks.GRANITE.id()) {
				this.wallBlockA = Blocks.COBBLE_GRANITE.id();
				this.wallBlockB = Blocks.COBBLE_GRANITE.id();
				this.brickBlockA = Blocks.BRICK_GRANITE.id();
				this.brickBlockB = Blocks.BRICK_GRANITE.id();
				this.slabBlock = Blocks.SLAB_BRICK_GRANITE.id();
			}
			int i = random.nextInt(2);
			if (i == 1) {
				this.wallBlockA = Blocks.BRICK_CLAY.id();
				this.wallBlockB = Blocks.BRICK_CLAY.id();
				this.brickBlockA = Blocks.BRICK_LAPIS.id();
				this.brickBlockB = Blocks.BRICK_LAPIS.id();
				this.slabBlock = Blocks.SLAB_BRICK_CLAY.id();
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

	@Inject(method = "pickCheckLootItem", at = @At("HEAD"), cancellable = true)
	private void pickCheckLootItem(Random random, CallbackInfoReturnable<ItemStack> cir) {
		if (FeaturesItems.bombBagEnabled == 1) {
			int i = random.nextInt(68);
			if (i == 16) {
				if (this.isHot && FeaturesItems.cathelmetEnabled == 1) {
					cir.setReturnValue( new ItemStack(FeaturesItems.cat_Helmet));
				} else  {
					cir.setReturnValue( new ItemStack(FeaturesItems.bomb_Bag_Gold));
				}
			}
		}
		if (FeaturesItems.plateArmorEnabled == 1) {
			int j = random.nextInt(32);
			if (j == 1) {
				cir.setReturnValue( new ItemStack(FeaturesItems.plate_Helmet, 1, FeaturesItems.plate_Helmet.getMaxDamage() - random.nextInt(FeaturesItems.plate_Helmet.getMaxDamage())));
			} else if (j == 2) {
				cir.setReturnValue( new ItemStack(FeaturesItems.plate_Chestplate, 1, FeaturesItems.plate_Chestplate.getMaxDamage() - random.nextInt(FeaturesItems.plate_Chestplate.getMaxDamage())));
			}
			if (FeaturesItems.normalCrownsEnabled == 1 && j == 3){
				cir.setReturnValue( new ItemStack(FeaturesItems.plate_Crown, 1, FeaturesItems.plate_Crown.getMaxDamage() - random.nextInt(FeaturesItems.plate_Crown.getMaxDamage())));
			}
		}
		if (FeaturesItems.normalCrownsEnabled == 1) {
			int a = random.nextInt(16);
			if (a == 1) {
				cir.setReturnValue( new ItemStack(FeaturesItems.chain_Crown, 1, FeaturesItems.chain_Crown.getMaxDamage() - random.nextInt(FeaturesItems.chain_Crown.getMaxDamage() / 2)));
			}
		}
	}
}
