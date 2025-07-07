package cursedbread.morefeatures.mixin.modsupport.deep.superores;

import cursedbread.morefeatures.FeaturesMain;
import cursedbread.morefeatures.blocks.FeaturesBlocks;
import net.minecraft.core.block.BlockLogicOreCoal;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import silveon22.deep.block.DEEPBlocks;
import silveon22.deep.block.ore.BlockLogicUraniumOre;

@Mixin(value = BlockLogicUraniumOre.class, remap = false)

public class OreToSuperoreUranium {


	public void onBlockPlacedByWorld(World world, int x, int y, int z) {
		int g = world.rand.nextInt(100);
		int ore = world.getBlockId(x, y, z);
		if (FeaturesMain.deepOn){
			if (FeaturesBlocks.superoresEnabled == 1) {
				if (g <= FeaturesMain.superoreChance - 1){
					if (ore == DEEPBlocks.stoneUraniumOre.id()){
						world.setBlock(x, y, z, FeaturesBlocks.super_Uranium_Stone_Ore.id());
					} else if (ore == DEEPBlocks.limestoneUraniumOre.id()){
						world.setBlock(x, y, z, FeaturesBlocks.super_Uranium_Limestone_Ore.id());
					} else if (ore == DEEPBlocks.graniteUraniumOre.id()){
						world.setBlock(x, y, z, FeaturesBlocks.super_Uranium_Granite_Ore.id());
					} else if (ore == DEEPBlocks.basaltUraniumOre.id()){
						world.setBlock(x, y, z, FeaturesBlocks.super_Uranium_Basalt_Ore.id());
					} else if (ore == DEEPBlocks.permafrostUraniumOre.id()){
						world.setBlock(x, y, z, FeaturesBlocks.super_Uranium_Permafrost_Ore.id());
					}
				}
			}
		}
	}
}
