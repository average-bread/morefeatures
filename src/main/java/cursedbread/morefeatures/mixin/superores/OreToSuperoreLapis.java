package cursedbread.morefeatures.mixin.superores;

import cursedbread.morefeatures.FeaturesMain;
import cursedbread.morefeatures.blocks.FeaturesBlocks;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicOreLapis;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = BlockLogicOreLapis.class, remap = false)

public class OreToSuperoreLapis {


	public void onBlockPlacedByWorld(World world, int x, int y, int z) {
		int g = world.rand.nextInt(100);
		int ore = world.getBlockId(x, y, z);
		if (FeaturesBlocks.superoresEnabled == 1) {
			if (g <= FeaturesMain.superoreChance - 1){
				if (ore == Blocks.ORE_LAPIS_STONE.id()){
					world.setBlock(x, y, z, FeaturesBlocks.superLapisStoneOre.id());
				} else if (ore == Blocks.ORE_LAPIS_LIMESTONE.id()){
					world.setBlock(x, y, z, FeaturesBlocks.superLapisLimestoneOre.id());
				} else if (ore == Blocks.ORE_LAPIS_GRANITE.id()){
					world.setBlock(x, y, z, FeaturesBlocks.superLapisGraniteOre.id());
				} else if (ore == Blocks.ORE_LAPIS_BASALT.id()){
					world.setBlock(x, y, z, FeaturesBlocks.superLapisBasaltOre.id());
				} else if (ore == Blocks.ORE_LAPIS_PERMAFROST.id()){
					world.setBlock(x, y, z, FeaturesBlocks.superLapisPermafrostOre.id());
				}
			}
		}

	}
}
