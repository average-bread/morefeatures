package cursedbread.morefeatures.mixin.blockmixins.superores;

import cursedbread.morefeatures.FeaturesMain;
import cursedbread.morefeatures.blocks.FeaturesBlocks;
import net.minecraft.core.block.BlockLogicOreDiamond;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = BlockLogicOreDiamond.class, remap = false)

public class OreToSuperoreDiamond {


	public void onBlockPlacedByWorld(World world, int x, int y, int z) {
		int g = world.rand.nextInt(100);
		int ore = world.getBlockId(x, y, z);
		if (FeaturesBlocks.superoresEnabled == 1) {
			if (g <= FeaturesMain.superoreChance - 1){
				if (ore == Blocks.ORE_DIAMOND_STONE.id()){
					world.setBlock(x, y, z, FeaturesBlocks.super_Diamond_Stone_Ore.id());
				} else if (ore == Blocks.ORE_DIAMOND_LIMESTONE.id()){
					world.setBlock(x, y, z, FeaturesBlocks.super_Diamond_Limestone_Ore.id());
				} else if (ore == Blocks.ORE_DIAMOND_GRANITE.id()){
					world.setBlock(x, y, z, FeaturesBlocks.super_Diamond_Granite_Ore.id());
				} else if (ore == Blocks.ORE_DIAMOND_BASALT.id()){
					world.setBlock(x, y, z, FeaturesBlocks.super_Diamond_Basalt_Ore.id());
				} else if (ore == Blocks.ORE_DIAMOND_PERMAFROST.id()){
					world.setBlock(x, y, z, FeaturesBlocks.super_Diamond_Permafrost_Ore.id());
				}
			}
		}

	}
}
