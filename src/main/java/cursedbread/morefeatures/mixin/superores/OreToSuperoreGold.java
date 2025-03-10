package cursedbread.morefeatures.mixin.superores;

import cursedbread.morefeatures.FeaturesMain;
import cursedbread.morefeatures.blocks.FeaturesBlocks;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.BlockLogicOreGold;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = BlockLogicOreGold.class, remap = false)

public class OreToSuperoreGold {


	public void onBlockPlacedByWorld(World world, int x, int y, int z) {
		int g = world.rand.nextInt(100);
		int ore = world.getBlockId(x, y, z);
		if (FeaturesBlocks.superoresEnabled == 1) {
			if (g <= FeaturesMain.superoreChance - 1){
				if (ore == Blocks.ORE_GOLD_STONE.id()){
					world.setBlock(x, y, z, FeaturesBlocks.superGoldStoneOre.id());
				} else if (ore == Blocks.ORE_GOLD_LIMESTONE.id()){
					world.setBlock(x, y, z, FeaturesBlocks.superGoldLimestoneOre.id());
				} else if (ore == Blocks.ORE_GOLD_GRANITE.id()){
					world.setBlock(x, y, z, FeaturesBlocks.superGoldGraniteOre.id());
				} else if (ore == Blocks.ORE_GOLD_BASALT.id()){
					world.setBlock(x, y, z, FeaturesBlocks.superGoldBasaltOre.id());
				} else if (ore == Blocks.ORE_GOLD_PERMAFROST.id()){
					world.setBlock(x, y, z, FeaturesBlocks.superGoldPermafrostOre.id());
				}
			}
		}

	}
}
