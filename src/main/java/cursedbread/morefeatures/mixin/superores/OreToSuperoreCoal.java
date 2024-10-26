package cursedbread.morefeatures.mixin.superores;

import cursedbread.morefeatures.FeaturesMain;
import cursedbread.morefeatures.blocks.FeaturesBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockOreCoal;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = BlockOreCoal.class, remap = false)

public class OreToSuperoreCoal {


	public void onBlockAdded(World world, int x, int y, int z) {
		int g = world.rand.nextInt(100);
		int ore = world.getBlockId(x, y, z);
		if (g <= FeaturesMain.superoreChance - 1){
			if (ore == Block.oreCoalStone.id){
				world.setBlock(x, y, z, FeaturesBlocks.superCoalStoneOre.id);
			} else if (ore == Block.oreCoalLimestone.id){
				world.setBlock(x, y, z, FeaturesBlocks.superCoalLimestoneOre.id);
			} else if (ore == Block.oreCoalGranite.id){
				world.setBlock(x, y, z, FeaturesBlocks.superCoalGraniteOre.id);
			} else if (ore == Block.oreCoalBasalt.id){
				world.setBlock(x, y, z, FeaturesBlocks.superCoalBasaltOre.id);
			}
		}
	}
}
