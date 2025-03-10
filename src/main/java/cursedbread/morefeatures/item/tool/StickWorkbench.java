package cursedbread.morefeatures.item.tool;

import net.minecraft.core.entity.player.Player;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

public class StickWorkbench extends Item {
	public StickWorkbench(String item, String namespaceId, int i) {
		super(item, namespaceId, i);
	}

	@Override
	public boolean onUseItemOnBlock(ItemStack itemstack, Player entityplayer, World world, int x, int y, int z, Side side, double xPlaced, double yPlaced) {
		entityplayer.displayWorkbenchScreen(x, y, z);
		return false;
	}

    @Override
	public ItemStack onUseItem(ItemStack stack, World world, Player player) {
	    player.displayWorkbenchScreen((int) player.x, (int) player.y, (int) player.z);
	    return stack;
	}
}
