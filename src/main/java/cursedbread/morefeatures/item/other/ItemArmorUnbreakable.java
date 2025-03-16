package cursedbread.morefeatures.item.other;

import net.minecraft.core.item.ItemArmor;
import net.minecraft.core.item.material.ArmorMaterial;

public class ItemArmorUnbreakable extends ItemArmor {
	public ItemArmorUnbreakable(String name, String namespaceId, int id, ArmorMaterial material, int armorPiece) {
		super(name, namespaceId, id, material, armorPiece);
		this.setMaxDamage(0);
	}
}
