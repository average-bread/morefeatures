package cursedbread.morefeatures.mixin.superores;

import cursedbread.morefeatures.FeaturesMain;
import cursedbread.morefeatures.blocks.FeaturesBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockOreGold;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = BlockOreGold.class, remap = false)

public class OreToSuperoreGold {


	public void onBlockAdded(World world, int x, int y, int z) {
		int g = world.rand.nextInt(100);
		int ore = world.getBlockId(x, y, z);
		if (FeaturesBlocks.superoresEnabled == 1) {
			if (g <= FeaturesMain.superoreChance - 1){
				if (ore == Block.oreGoldStone.id){
					world.setBlock(x, y, z, FeaturesBlocks.superGoldStoneOre.id);
				} else if (ore == Block.oreGoldLimestone.id){
					world.setBlock(x, y, z, FeaturesBlocks.superGoldLimestoneOre.id);
				} else if (ore == Block.oreGoldGranite.id){
					world.setBlock(x, y, z, FeaturesBlocks.superGoldGraniteOre.id);
				} else if (ore == Block.oreGoldBasalt.id){
					world.setBlock(x, y, z, FeaturesBlocks.superGoldBasaltOre.id);
				}
			}
		}

	}
}
