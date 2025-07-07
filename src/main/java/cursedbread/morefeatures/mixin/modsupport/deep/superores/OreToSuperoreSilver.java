package cursedbread.morefeatures.mixin.modsupport.deep.superores;

import cursedbread.morefeatures.FeaturesMain;
import cursedbread.morefeatures.blocks.FeaturesBlocks;
import net.minecraft.core.block.BlockLogicOreCoal;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import silveon22.deep.block.DEEPBlocks;
import silveon22.deep.block.ore.BlockLogicSilverOre;

@Mixin(value = BlockLogicSilverOre.class, remap = false)

public class OreToSuperoreSilver {


	public void onBlockPlacedByWorld(World world, int x, int y, int z) {
		int g = world.rand.nextInt(100);
		int ore = world.getBlockId(x, y, z);
		if (FeaturesMain.deepOn){
			if (FeaturesBlocks.superoresEnabled == 1) {
				if (g <= FeaturesMain.superoreChance - 1){
					if (ore == DEEPBlocks.stoneSilverOre.id()){
						world.setBlock(x, y, z, FeaturesBlocks.super_Silver_Stone_Ore.id());
					} else if (ore == DEEPBlocks.limestoneSilverOre.id()){
						world.setBlock(x, y, z, FeaturesBlocks.super_Silver_Limestone_Ore.id());
					} else if (ore == DEEPBlocks.graniteSilverOre.id()){
						world.setBlock(x, y, z, FeaturesBlocks.super_Silver_Granite_Ore.id());
					} else if (ore == DEEPBlocks.basaltSilverOre.id()){
						world.setBlock(x, y, z, FeaturesBlocks.super_Silver_Basalt_Ore.id());
					} else if (ore == DEEPBlocks.permafrostSilverOre.id()){
						world.setBlock(x, y, z, FeaturesBlocks.super_Silver_Permafrost_Ore.id());
					} else if (ore == DEEPBlocks.netherrackSilverOre.id()){
						world.setBlock(x, y, z, FeaturesBlocks.super_Silver_Netherrack_Ore.id());
					}
				}
			}
		}
	}
}
