package cursedbread.morefeatures.mixin.superores;

import cursedbread.morefeatures.FeaturesMain;
import cursedbread.morefeatures.blocks.FeaturesBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockOreGold;
import net.minecraft.core.block.BlockOreLapis;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = BlockOreLapis.class, remap = false)

public class OreToSuperoreLapis {


	public void onBlockAdded(World world, int x, int y, int z) {
		int g = world.rand.nextInt(100);
		int ore = world.getBlockId(x, y, z);
		if (FeaturesBlocks.superoresEnabled == 1) {
			if (g <= FeaturesMain.superoreChance - 1){
				if (ore == Block.oreLapisStone.id){
					world.setBlock(x, y, z, FeaturesBlocks.superLapisStoneOre.id);
				} else if (ore == Block.oreLapisLimestone.id){
					world.setBlock(x, y, z, FeaturesBlocks.superLapisLimestoneOre.id);
				} else if (ore == Block.oreLapisGranite.id){
					world.setBlock(x, y, z, FeaturesBlocks.superLapisGraniteOre.id);
				} else if (ore == Block.oreLapisBasalt.id){
					world.setBlock(x, y, z, FeaturesBlocks.superLapisBasaltOre.id);
				}
			}
		}

	}
}
