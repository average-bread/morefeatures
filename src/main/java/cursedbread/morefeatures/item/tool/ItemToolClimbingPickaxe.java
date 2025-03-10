package cursedbread.morefeatures.item.tool;

import net.minecraft.core.block.Blocks;
import net.minecraft.core.block.entity.TileEntityActivator;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tool.ItemToolPickaxe;
import net.minecraft.core.util.helper.Direction;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

import java.util.Random;

public class ItemToolClimbingPickaxe extends ItemToolPickaxe {
	public ItemToolClimbingPickaxe(String name, String namespaceId, int id, ToolMaterial enumtoolmaterial) {
		super(name, namespaceId, id, enumtoolmaterial);
	}

	public void onUseByActivator(ItemStack itemStack, TileEntityActivator activatorBlock, World world, Random random, int blockX, int blockY, int blockZ, double offX, double offY, double offZ, Direction direction) {
		int id = world.getBlockId(blockX, blockY, blockZ);
		int meta = world.getBlockMetadata(blockX, blockY, blockZ);
		world.setBlock(blockX, blockY, blockZ, 0);
		world.setBlockAndMetadataWithNotify(blockX, blockY+1, blockZ, id, meta);
	}
}
