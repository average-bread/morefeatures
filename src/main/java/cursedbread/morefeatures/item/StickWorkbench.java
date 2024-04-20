package cursedbread.morefeatures.item;

import net.minecraft.core.block.Block;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemArmor;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

public class StickWorkbench extends Item {
	public StickWorkbench(String item, int i) {
		super(item, i);
	}

	@Override
	public boolean onItemUse(ItemStack itemstack, EntityPlayer entityplayer, World world, int x, int y, int z, Side side, double xPlaced, double yPlaced) {
		entityplayer.displayGUIWorkbench(x, y, z);
		return false;
	}

	public boolean isFull3D() {
		return true;
	}
}
