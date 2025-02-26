package cursedbread.morefeatures.item;

import net.minecraft.client.render.item.model.ItemModelStandard;
import net.minecraft.client.render.texture.stitcher.IconCoordinate;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;

public class ItemModelBombQuiver extends ItemModelStandard {
    IconCoordinate bombQuiverFull = TextureRegistry.getTexture("morefeatures:item/extra_item_bomb_bag_full");
    IconCoordinate bombQuiverEmpty = TextureRegistry.getTexture("morefeatures:item/extra_item_bomb_bag_empty");

    public ItemModelBombQuiver(Item item, String namespace) {
        super(item, namespace);
    }

    @Override
    public IconCoordinate getIcon(Entity entity, ItemStack itemStack) {
        if (itemStack.getMetadata() >= itemStack.getItem().getMaxDamage()) return bombQuiverEmpty;
        return bombQuiverFull;
    }
}
