package cursedbread.morefeatures.item.other;

import cursedbread.morefeatures.item.artifacts.ItemModelBombQuiver;
import net.minecraft.client.render.item.model.ItemModelStandard;
import net.minecraft.client.render.texture.stitcher.IconCoordinate;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;

public class ItemModelFertilizerBag extends ItemModelStandard {
	IconCoordinate fertilizerBagFull = TextureRegistry.getTexture("morefeatures:item/other/fertilizer_bag/fertilizer_bag_full");
	IconCoordinate fertilizerBagEmpty = TextureRegistry.getTexture("morefeatures:item/other/fertilizer_bag/fertilizer_bag_empty");

	public ItemModelFertilizerBag(Item item, String namespace) {
		super(item, namespace);
	}

	@Override
	public IconCoordinate getIcon(Entity entity, ItemStack itemStack) {
		if (itemStack.getMetadata() >= itemStack.getItem().getMaxDamage()) return fertilizerBagEmpty;
		return fertilizerBagFull;
	}
}
