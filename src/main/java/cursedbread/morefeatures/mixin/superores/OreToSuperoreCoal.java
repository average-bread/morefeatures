package cursedbread.morefeatures.mixin.superores;

import cursedbread.morefeatures.FeaturesMain;
import cursedbread.morefeatures.blocks.FeaturesBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicOreCoal;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = BlockLogicOreCoal.class, remap = false)

public class OreToSuperoreCoal {


	public void onBlockPlacedByWorld(World world, int x, int y, int z) {
		int g = world.rand.nextInt(100);
		int ore = world.getBlockId(x, y, z);
		if (FeaturesBlocks.superoresEnabled == 1) {
			if (g <= FeaturesMain.superoreChance - 1){
				if (ore == Blocks.ORE_COAL_STONE.id()){
					world.setBlock(x, y, z, FeaturesBlocks.superCoalStoneOre.id());
				} else if (ore == Blocks.ORE_COAL_LIMESTONE.id()){
					world.setBlock(x, y, z, FeaturesBlocks.superCoalLimestoneOre.id());
				} else if (ore == Blocks.ORE_COAL_GRANITE.id()){
					world.setBlock(x, y, z, FeaturesBlocks.superCoalGraniteOre.id());
				} else if (ore == Blocks.ORE_COAL_BASALT.id()){
					world.setBlock(x, y, z, FeaturesBlocks.superCoalBasaltOre.id());
				} else if (ore == Blocks.ORE_COAL_PERMAFROST.id()){
					world.setBlock(x, y, z, FeaturesBlocks.superCoalPermafrostOre.id());
				}
			}
		}

	}
}
