package cursedbread.morefeatures.item.bomb_bag;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.item.model.ItemModelStandard;
import net.minecraft.client.render.texture.stitcher.IconCoordinate;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;

@Environment(EnvType.CLIENT)
public class ItemModelBombQuiver extends ItemModelStandard {
    IconCoordinate bombQuiverFull = TextureRegistry.getTexture("morefeatures:item/armor/bomb_bag/bomb_bag_full");
    IconCoordinate bombQuiverEmpty = TextureRegistry.getTexture("morefeatures:item/armor/bomb_bag/bomb_bag_empty");

    public ItemModelBombQuiver(Item item, String namespace) {
        super(item, namespace);
    }

    @Override
    public IconCoordinate getIcon(Entity entity, ItemStack itemStack) {
        if (itemStack.getMetadata() >= itemStack.getItem().getMaxDamage()) return bombQuiverEmpty;
        return bombQuiverFull;
    }
}
