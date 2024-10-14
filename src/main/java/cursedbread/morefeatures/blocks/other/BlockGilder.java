package cursedbread.morefeatures.blocks.other;

import cursedbread.morefeatures.item.FeaturesItems;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.Item;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

import java.util.HashMap;

public class BlockGilder extends Block {
    static public HashMap<Integer, ItemStack> item_map = new HashMap<>();
    static boolean init = false;
	public BlockGilder(String key, int id) {
		super(key, id, Material.metal);
		init = false;
	}

    @Override
	public boolean onBlockRightClicked(World world, int x, int y, int z, EntityPlayer player, Side side, double xPlaced, double yPlaced) {
        // Init the hash map, done now due to init order
        if (!init) {
            item_map.put(Item.armorQuiver.id, new ItemStack(Item.armorQuiverGold));
            if (FeaturesItems.bombQuibersEnabled == 1) {
                item_map.put(FeaturesItems.bombBag.id, new ItemStack(FeaturesItems.bombBagGold));
            }
            init = true;
        }

	    // Check core
		if (world.getBlockId(x, y - 1, z) != Block.slate.id) {
		    player.sendMessage("Check if core slate was placed");
		    return false;
		}
		// Check item
		ItemStack stack = player.getHeldItem();
		if (stack == null) {
		    player.sendMessage("Check if you are holding an item");
            return false;
        }
        ItemStack is = item_map.get(stack.getItem().id);
        if (is == null) {
            player.sendMessage("Check if you are holding an item that can be gilded");
            return false;
        }
        // Check gold base
		for (int i = -1; i <= 1; i++) {
			for (int j = -1; j <= 1; j++) {
			    if (j == 0 && i == 0) continue;
				if (world.getBlockId(x + i, y - 1, z + j) != Block.blockGold.id) {
    				player.sendMessage("Check if golden ring was build correctly");
    				return false;
			     }
		     }
		}

		// Break the structure
		for (int i = -1; i <= 1; i++) {
			for (int j = -1; j <= 1; j++) {
				world.setBlock(x + i, y - 1, z + j, 0);
			}
		}
		world.setBlock(x, y, z, Block.gravel.id);

		// Give the item
		stack.consumeItem(player);
		player.inventory.insertItem(is, true);
		return true;
	}
}
