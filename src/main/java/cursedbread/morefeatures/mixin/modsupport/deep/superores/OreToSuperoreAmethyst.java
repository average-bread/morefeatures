package cursedbread.morefeatures.mixin.modsupport.deep.superores;

import cursedbread.morefeatures.FeaturesMain;
import cursedbread.morefeatures.blocks.FeaturesBlocks;
import net.minecraft.core.block.BlockLogicOreCoal;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import silveon22.deep.block.DEEPBlocks;
import silveon22.deep.block.ore.BlockLogicAmethystOre;

@Mixin(value = BlockLogicAmethystOre.class, remap = false)

public class OreToSuperoreAmethyst {


	public void onBlockPlacedByWorld(World world, int x, int y, int z) {
		int g = world.rand.nextInt(100);
		int ore = world.getBlockId(x, y, z);
		if (FeaturesMain.deepOn){
			if (FeaturesBlocks.superoresEnabled == 1) {
				if (g <= FeaturesMain.superoreChance - 1){
					if (ore == DEEPBlocks.stoneAmethystOre.id()){
						world.setBlock(x, y, z, FeaturesBlocks.super_Amethyst_Stone_Ore.id());
					} else if (ore == DEEPBlocks.limestoneAmethystOre.id()){
						world.setBlock(x, y, z, FeaturesBlocks.super_Amethyst_Limestone_Ore.id());
					} else if (ore == DEEPBlocks.graniteAmethystOre.id()){
						world.setBlock(x, y, z, FeaturesBlocks.super_Amethyst_Granite_Ore.id());
					} else if (ore == DEEPBlocks.basaltAmethystOre.id()){
						world.setBlock(x, y, z, FeaturesBlocks.super_Amethyst_Basalt_Ore.id());
					} else if (ore == DEEPBlocks.permafrostAmethystOre.id()){
						world.setBlock(x, y, z, FeaturesBlocks.super_Amethyst_Permafrost_Ore.id());
					}
				}
			}
		}
	}
}
