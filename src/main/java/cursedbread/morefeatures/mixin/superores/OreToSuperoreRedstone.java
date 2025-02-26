package cursedbread.morefeatures.mixin.superores;

import cursedbread.morefeatures.FeaturesMain;
import cursedbread.morefeatures.blocks.FeaturesBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicOreRedstone;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = BlockLogicOreRedstone.class, remap = false)

public class OreToSuperoreRedstone {


	public void onBlockPlacedByWorld(World world, int x, int y, int z) {
		int g = world.rand.nextInt(100);
		int ore = world.getBlockId(x, y, z);
		if (FeaturesBlocks.superoresEnabled == 1) {
			if (g <= FeaturesMain.superoreChance - 1){
				if (ore == Blocks.ORE_REDSTONE_STONE.id()){
					world.setBlock(x, y, z, FeaturesBlocks.superRedstoneStoneOre.id());
				} else if (ore == Blocks.ORE_REDSTONE_LIMESTONE.id()){
					world.setBlock(x, y, z, FeaturesBlocks.superRedstoneLimestoneOre.id());
				} else if (ore == Blocks.ORE_REDSTONE_GRANITE.id()){
					world.setBlock(x, y, z, FeaturesBlocks.superRedstoneGraniteOre.id());
				} else if (ore == Blocks.ORE_REDSTONE_BASALT.id()){
					world.setBlock(x, y, z, FeaturesBlocks.superRedstoneBasaltOre.id());
				} else if (ore == Blocks.ORE_REDSTONE_PERMAFROST.id()){
					world.setBlock(x, y, z, FeaturesBlocks.superRedstonePermafrostOre.id());
				}
			}
		}

	}
}
