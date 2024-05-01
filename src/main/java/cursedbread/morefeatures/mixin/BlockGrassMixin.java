package cursedbread.morefeatures.mixin;

import cursedbread.morefeatures.blocks.FeaturesBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockGrass;
import net.minecraft.core.world.World;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.biome.Biomes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import java.util.Random;

@Mixin(value= BlockGrass.class,remap=false)
public abstract class BlockGrassMixin {
    @ModifyVariable(method="updateTick",at=@At(value="LOAD"),name="idToSpawn")
    private int updateId(int id, World world, int x, int y, int z, Random rand) {
        if (!(id == Block.flowerRed.id && rand.nextInt(2) == 0)) return id;
		return FeaturesBlocks.rainbowFlower.id;
    }
}
