package cursedbread.morefeatures.mixin.superores;

import cursedbread.morefeatures.FeaturesMain;
import cursedbread.morefeatures.blocks.FeaturesBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockOreIron;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = BlockOreIron.class, remap = false)

public class OreToSuperoreIron {


	public void onBlockAdded(World world, int x, int y, int z) {
		int g = world.rand.nextInt(100);
		int ore = world.getBlockId(x, y, z);
		if (FeaturesBlocks.superoresEnabled == 1) {
			if (g <= FeaturesMain.superoreChance - 1){
				if (ore == Block.oreIronStone.id){
					world.setBlock(x, y, z, FeaturesBlocks.superIronStoneOre.id);
				} else if (ore == Block.oreIronLimestone.id){
					world.setBlock(x, y, z, FeaturesBlocks.superIronLimestoneOre.id);
				} else if (ore == Block.oreIronGranite.id){
					world.setBlock(x, y, z, FeaturesBlocks.superIronGraniteOre.id);
				} else if (ore == Block.oreIronBasalt.id){
					world.setBlock(x, y, z, FeaturesBlocks.superIronBasaltOre.id);
				}
			}
		}

	}
}
