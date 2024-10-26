package cursedbread.morefeatures.mixin.superores;

import cursedbread.morefeatures.FeaturesMain;
import cursedbread.morefeatures.blocks.FeaturesBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockOreDiamond;
import net.minecraft.core.block.BlockOreRedstone;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = BlockOreRedstone.class, remap = false)

public class OreToSuperoreRedstone {


	public void onBlockAdded(World world, int x, int y, int z) {
		int g = world.rand.nextInt(100);
		int ore = world.getBlockId(x, y, z);
		if (g <= FeaturesMain.superoreChance - 1){
			if (ore == Block.oreRedstoneStone.id){
				world.setBlock(x, y, z, FeaturesBlocks.superRedstoneStoneOre.id);
			} else if (ore == Block.oreRedstoneLimestone.id){
				world.setBlock(x, y, z, FeaturesBlocks.superRedstoneLimestoneOre.id);
			} else if (ore == Block.oreRedstoneGranite.id){
				world.setBlock(x, y, z, FeaturesBlocks.superRedstoneGraniteOre.id);
			} else if (ore == Block.oreRedstoneBasalt.id){
				world.setBlock(x, y, z, FeaturesBlocks.superRedstoneBasaltOre.id);
			}
		}
	}
}
