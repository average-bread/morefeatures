package cursedbread.morefeatures.mixin.superores;

import cursedbread.morefeatures.FeaturesMain;
import cursedbread.morefeatures.blocks.FeaturesBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockOreDiamond;
import net.minecraft.core.block.BlockOreLapis;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = BlockOreDiamond.class, remap = false)

public class OreToSuperoreDiamond {


	public void onBlockAdded(World world, int x, int y, int z) {
		int g = world.rand.nextInt(100);
		int ore = world.getBlockId(x, y, z);
		if (g <= FeaturesMain.superoreChance - 1){
			if (ore == Block.oreDiamondStone.id){
				world.setBlock(x, y, z, FeaturesBlocks.superDiamondStoneOre.id);
			} else if (ore == Block.oreDiamondLimestone.id){
				world.setBlock(x, y, z, FeaturesBlocks.superDiamondLimestoneOre.id);
			} else if (ore == Block.oreDiamondGranite.id){
				world.setBlock(x, y, z, FeaturesBlocks.superDiamondGraniteOre.id);
			} else if (ore == Block.oreDiamondBasalt.id){
				world.setBlock(x, y, z, FeaturesBlocks.superDiamondBasaltOre.id);
			}
		}
	}
}
