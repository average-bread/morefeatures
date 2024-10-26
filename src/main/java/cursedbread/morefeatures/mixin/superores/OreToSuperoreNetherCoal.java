package cursedbread.morefeatures.mixin.superores;

import cursedbread.morefeatures.FeaturesMain;
import cursedbread.morefeatures.blocks.FeaturesBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockOreNetherCoal;
import net.minecraft.core.block.BlockOreRedstone;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = BlockOreNetherCoal.class, remap = false)

public class OreToSuperoreNetherCoal {


	public void onBlockAdded(World world, int x, int y, int z) {
		int g = world.rand.nextInt(100);
		int ore = world.getBlockId(x, y, z);
		if (g <= FeaturesMain.superoreChance - 1){
			if (ore == Block.oreNethercoalNetherrack.id){
				world.setBlock(x, y, z, FeaturesBlocks.superNetherCoalOre.id);
			}
		}
	}
}
