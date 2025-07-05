package cursedbread.morefeatures.mixin.generationmixins;

import cursedbread.morefeatures.blocks.FeaturesBlocks;
import net.minecraft.core.block.BlockLogicGrass;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import java.util.Random;

@Mixin(value= BlockLogicGrass.class,remap=false)
public abstract class BlockGrassMixin {
    @ModifyVariable(method="updateTick",at=@At(value="LOAD"),name="idToSpawn")
    private int updateId(int id, World world, int x, int y, int z, Random rand) {
        if (FeaturesBlocks.rainbowFlowerEnabled == 1){
			if (id == Blocks.FLOWER_RED.id() && rand.nextInt(100) <= FeaturesBlocks.rainbowFlowerChance - 1)
				return FeaturesBlocks.rainbow_Flower.id();
		}
		if (FeaturesBlocks.newFlowersEnabled == 1){
			int random = rand.nextInt(100);
			if (id == Blocks.FLOWER_YELLOW.id() && random > 0 &&random <= 10)
				return FeaturesBlocks.white_Flower.id();
			if (id == Blocks.FLOWER_YELLOW.id() && random > 10 && random <= 20)
				return FeaturesBlocks.magenta_Flower.id();
			if (id == Blocks.FLOWER_YELLOW.id() && random > 20 && random <= 30)
				return FeaturesBlocks.lime_Flower.id();
			if (id == Blocks.FLOWER_YELLOW.id() && random > 30 && random <= 40)
				return FeaturesBlocks.gray_Flower.id();
			if (id == Blocks.FLOWER_YELLOW.id() && random > 40 && random <= 50)
				return FeaturesBlocks.silver_Flower.id();
			if (id == Blocks.FLOWER_YELLOW.id() && random > 50 && random <= 60)
				return FeaturesBlocks.cyan_Flower.id();
			if (id == Blocks.FLOWER_YELLOW.id() && random > 60 && random <= 70)
				return FeaturesBlocks.blue_Flower.id();
			if (id == Blocks.FLOWER_YELLOW.id() && random > 70 && random <= 80)
				return FeaturesBlocks.brown_Flower.id();
			if (id == Blocks.FLOWER_YELLOW.id() && random > 80 && random <= 90)
				return FeaturesBlocks.green_Flower.id();
			if (id == Blocks.FLOWER_YELLOW.id() && random > 90)
				return FeaturesBlocks.black_Flower.id();
		}
		return id;
	}
}
