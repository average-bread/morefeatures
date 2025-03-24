package cursedbread.morefeatures.mixin.blockmixins.superores;

import cursedbread.morefeatures.FeaturesMain;
import cursedbread.morefeatures.blocks.FeaturesBlocks;
import net.minecraft.core.block.*;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = BlockLogicOreIron.class, remap = false)

public class OreToSuperoreIron {


	public void onBlockPlacedByWorld(World world, int x, int y, int z) {
		int g = world.rand.nextInt(100);
		int ore = world.getBlockId(x, y, z);
		if (FeaturesBlocks.superoresEnabled == 1) {
			if (g <= FeaturesMain.superoreChance - 1){
				if (ore == Blocks.ORE_IRON_STONE.id()){
					world.setBlock(x, y, z, FeaturesBlocks.super_Iron_Stone_Ore.id());
				} else if (ore == Blocks.ORE_IRON_LIMESTONE.id()){
					world.setBlock(x, y, z, FeaturesBlocks.super_Iron_Limestone_Ore.id());
				} else if (ore == Blocks.ORE_IRON_GRANITE.id()){
					world.setBlock(x, y, z, FeaturesBlocks.super_Iron_Granite_Ore.id());
				} else if (ore == Blocks.ORE_IRON_BASALT.id()){
					world.setBlock(x, y, z, FeaturesBlocks.super_Iron_Basalt_Ore.id());
				} else if (ore == Blocks.ORE_IRON_PERMAFROST.id()){
					world.setBlock(x, y, z, FeaturesBlocks.super_Iron_Permafrost_Ore.id());
				}
			}
		}

	}
}
