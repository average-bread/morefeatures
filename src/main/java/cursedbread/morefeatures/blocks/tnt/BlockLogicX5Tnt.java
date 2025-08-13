package cursedbread.morefeatures.blocks.tnt;

import cursedbread.morefeatures.entities.tnt.EntityX5PrimedTnt;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicTNT;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.item.ItemFireStriker;
import net.minecraft.core.world.World;

public class BlockLogicX5Tnt extends BlockLogicTNT {
	public BlockLogicX5Tnt(Block<?> block) {
		super(block);
	}

	public void onBlockDestroyedByExplosion(World world, int x, int y, int z) {
		EntityX5PrimedTnt entity = new EntityX5PrimedTnt(world, (double)((float)x + 0.5F), (double)((float)y + 0.5F), (double)((float)z + 0.5F));
		entity.fuse = world.rand.nextInt(entity.fuse / 4) + entity.fuse / 8;
		world.entityJoinedWorld(entity);
	}

	public void ignite(World world, int x, int y, int z, Player player, boolean sound) {
		if (world.isClientSide) {
			if (player != null && player.inventory.getCurrentItem() != null && player.inventory.getCurrentItem().getItem() instanceof ItemFireStriker) {
				player.inventory.getCurrentItem().damageItem(1, player);
			}

		} else {
			world.setBlockWithNotify(x, y, z, 0);
			EntityX5PrimedTnt e = new EntityX5PrimedTnt(world, (double)((float)x + 0.5F), (double)((float)y + 0.5F), (double)((float)z + 0.5F));
			world.entityJoinedWorld(e);
			world.playSoundAtEntity((Entity)null, e, "tile.tnt.fuse", 1.0F, 1.0F);
			if (player != null && player.inventory.getCurrentItem() != null && player.inventory.getCurrentItem().getItem() instanceof ItemFireStriker) {
				player.inventory.getCurrentItem().damageItem(1, player);
			}

		}
	}
}
