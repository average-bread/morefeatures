package cursedbread.morefeatures.item;

import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemArmor;
import net.minecraft.core.item.ItemQuiver;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.material.ArmorMaterial;
import net.minecraft.core.player.inventory.slot.Slot;
import turniplabs.halplibe.helper.TextureHelper;

import static cursedbread.morefeatures.FeaturesMain.MOD_ID;

public class ItemBombQuiver extends ItemQuiver {
	public ItemBombQuiver(String name, int id) {
		super(name, id);
		this.setMaxStackSize(1);
		this.setMaxDamage(48);
	}

	public int getIconFromDamage(int id) {
		return id >= this.getMaxDamage() ? TextureHelper.getOrCreateItemTextureIndex(MOD_ID, "extra/bomb_bag_empty.png") : TextureHelper.getOrCreateItemTextureIndex(MOD_ID, "extra/bomb_bag_full.png");
	}

	public boolean hasInventoryInteraction() {
		return true;
	}

	public ItemStack onInventoryInteract(EntityPlayer player, Slot slot, ItemStack stackInSlot, boolean isItemGrabbed) {
		ItemStack bagItem;
		if (isItemGrabbed) {
			bagItem = player.inventory.getHeldItemStack();
		} else {
			bagItem = stackInSlot;
		}

		int totalSpace = this.getMaxDamage();
		int bombCount = this.getbombCount(bagItem);
		int freeSpace = totalSpace - bombCount;
		if (isItemGrabbed) {
			int amount;
			if (stackInSlot == null) {
				amount = Math.min(16, bombCount);
				if (amount > 0) {
					ItemStack bombStack = new ItemStack(Item.ammoChargeExplosive, amount, 0);
					if (slot.canPutStackInSlot(bombStack)) {
						this.setbombCount(bagItem, bombCount - amount);
						stackInSlot = bombStack;
					}
				}
			} else if (stackInSlot != null && stackInSlot.itemID == Item.ammoChargeExplosive.id) {
				amount = Math.min(freeSpace, stackInSlot.stackSize);
				if (amount > 0) {
					this.setbombCount(bagItem, bombCount + amount);
					stackInSlot.stackSize -= amount;
				}
			}
		} else {
			ItemStack grabbedItem = player.inventory.getHeldItemStack();
			int amount;
			if (grabbedItem != null && grabbedItem.itemID == Item.ammoChargeExplosive.id) {
				amount = Math.min(grabbedItem.stackSize, freeSpace);
				if (amount > 0) {
					grabbedItem.stackSize -= amount;
					this.setbombCount(bagItem, bombCount + amount);
					if (grabbedItem.stackSize <= 0) {
						player.inventory.setHeldItemStack((ItemStack)null);
					}
				}
			} else if (grabbedItem == null) {
				amount = Math.min(16, bombCount);
				if (amount > 0) {
					this.setbombCount(bagItem, bombCount - amount);
					player.inventory.setHeldItemStack(new ItemStack(Item.ammoChargeExplosive, amount, 0));
				}
			}
		}

		return stackInSlot;
	}

	private int getbombCount(ItemStack stack) {
		return stack.getMaxDamage() - stack.getMetadata();
	}

	private void setbombCount(ItemStack stack, int count) {
		stack.setMetadata(stack.getMaxDamage() - count);
	}

	public boolean showFullDurability() {
		return true;
	}
}

