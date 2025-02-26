package cursedbread.morefeatures.item;

import net.minecraft.core.entity.player.Player;
import net.minecraft.core.item.*;
import net.minecraft.core.item.material.ArmorMaterial;
import net.minecraft.core.player.inventory.slot.Slot;

import static cursedbread.morefeatures.FeaturesMain.MOD_ID;

public class ItemBombQuiver extends ItemQuiver {
	public ItemBombQuiver(String name, String namespaceId, int id) {
		super(name, namespaceId, id);
		this.setMaxStackSize(1);
		this.setMaxDamage(48);
	}

    @Override
	public boolean hasInventoryInteraction() {
		return true;
	}

    @Override
	public ItemStack onInventoryInteract(Player player, Slot slot, ItemStack stackInSlot, boolean isItemGrabbed) {
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
					ItemStack bombStack = new ItemStack(Items.AMMO_CHARGE_EXPLOSIVE, amount, 0);
					if (slot.mayPlace(bombStack)) {
						this.setbombCount(bagItem, bombCount - amount);
						stackInSlot = bombStack;
					}
				}
			} else if (stackInSlot != null && stackInSlot.itemID == Items.AMMO_CHARGE_EXPLOSIVE.id) {
				amount = Math.min(freeSpace, stackInSlot.stackSize);
				if (amount > 0) {
					this.setbombCount(bagItem, bombCount + amount);
					stackInSlot.stackSize -= amount;
				}
			}
		} else {
			ItemStack grabbedItem = player.inventory.getHeldItemStack();
			int amount;
			if (grabbedItem != null && grabbedItem.itemID == Items.AMMO_CHARGE_EXPLOSIVE.id) {
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
					player.inventory.setHeldItemStack(new ItemStack(Items.AMMO_CHARGE_EXPLOSIVE, amount, 0));
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

    @Override
	public boolean showFullDurability() {
		return true;
	}
}

