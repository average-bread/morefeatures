package cursedbread.morefeatures.mixin.generationmixins.overworld;

import cursedbread.morefeatures.FeaturesMain;
import cursedbread.morefeatures.item.FeaturesItems;
import net.minecraft.core.WeightedRandomBag;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
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
	@Shadow
	public ItemStack treasureItem;
	@Shadow
	public WeightedRandomBag<String> spawnerMonsters;

	@Unique
	private boolean isHot;
	@Unique
	private boolean isSwamp;
	@Unique
	private boolean isBrick;

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
				this.isBrick = true;
			}
		}
	}

	@Inject(method = "place", at = @At(value = "INVOKE", target = "Lnet/minecraft/core/world/generate/feature/WorldFeatureLabyrinth;canReplace(Lnet/minecraft/core/world/World;III)Z"))
	public void generateTreasure(World world, Random random, int x, int y, int z, CallbackInfoReturnable<Boolean> cir) {
		if (this.isHot) {
			this.spawnerMonsters.addEntry("Scorpion", 1.0);
			this.spawnerMonsters.addEntry("ArmouredZombie", 1.0);
			this.treasureItem = FeaturesItems.cat_Helmet.getDefaultStack();
		}
		if (this.isBrick) {
			this.spawnerMonsters.addEntry("ArmouredZombie", 1.0);
			this.treasureItem = FeaturesItems.bomb_Bag_Gold.getDefaultStack();
		}
		if (this.isSwamp) {
			this.spawnerMonsters.addEntry("Creeper", 1.0);
			this.spawnerMonsters.addEntry("ArmouredZombie", 1.0);
		}
	}

	@Inject(method = "pickCheckLootItem", at = @At("HEAD"), cancellable = true)
	private void pickCheckLootItem(Random random, CallbackInfoReturnable<ItemStack> cir) {
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
