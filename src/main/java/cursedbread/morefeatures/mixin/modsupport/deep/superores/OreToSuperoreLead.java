package cursedbread.morefeatures.mixin.modsupport.deep.superores;

import cursedbread.morefeatures.FeaturesMain;
import cursedbread.morefeatures.blocks.FeaturesBlocks;
import net.minecraft.core.block.BlockLogicOreCoal;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import silveon22.deep.block.DEEPBlocks;
import silveon22.deep.block.ore.BlockLogicLeadOre;

@Mixin(value = BlockLogicLeadOre.class, remap = false)

public class OreToSuperoreLead {


	public void onBlockPlacedByWorld(World world, int x, int y, int z) {
		int g = world.rand.nextInt(100);
		int ore = world.getBlockId(x, y, z);
		if (FeaturesMain.deepOn){
			if (FeaturesBlocks.superoresEnabled == 1) {
				if (g <= FeaturesMain.superoreChance - 1){
					if (ore == DEEPBlocks.stoneLeadOre.id()){
						world.setBlock(x, y, z, FeaturesBlocks.super_Lead_Stone_Ore.id());
					} else if (ore == DEEPBlocks.limestoneLeadOre.id()){
						world.setBlock(x, y, z, FeaturesBlocks.super_Lead_Limestone_Ore.id());
					} else if (ore == DEEPBlocks.graniteLeadOre.id()){
						world.setBlock(x, y, z, FeaturesBlocks.super_Lead_Granite_Ore.id());
					} else if (ore == DEEPBlocks.basaltLeadOre.id()){
						world.setBlock(x, y, z, FeaturesBlocks.super_Lead_Basalt_Ore.id());
					} else if (ore == DEEPBlocks.permafrostLeadOre.id()){
						world.setBlock(x, y, z, FeaturesBlocks.super_Lead_Permafrost_Ore.id());
					}
				}
			}
		}
	}
}
