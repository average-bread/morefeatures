package cursedbread.morefeatures.mixin;

import cursedbread.morefeatures.blocks.FeaturesBlocks;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicGrass;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.world.World;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.biome.Biomes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import java.util.Random;

@Mixin(value= BlockLogicGrass.class,remap=false)
public abstract class BlockGrassMixin {
    @ModifyVariable(method="updateTick",at=@At(value="LOAD"),name="idToSpawn")
    private int updateId(int id, World world, int x, int y, int z, Random rand) {
        if (FeaturesBlocks.plantEnabled == 1){
			if (id == Blocks.FLOWER_RED.id() && rand.nextInt(100) <= FeaturesBlocks.rainbowFlowerChance - 1)
				return FeaturesBlocks.rainbowFlower.id();
		}
		return id;
	}
}
