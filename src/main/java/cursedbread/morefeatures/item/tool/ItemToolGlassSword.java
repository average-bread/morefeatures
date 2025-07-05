package cursedbread.morefeatures.item.tool;

import net.minecraft.core.entity.Mob;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tool.ItemTool;
import net.minecraft.core.item.tool.ItemToolSword;
import net.minecraft.core.sound.SoundCategory;
import net.minecraft.core.world.World;

public class ItemToolGlassSword extends ItemToolSword {
	public ItemToolGlassSword(String name, String namespaceId, int id, ToolMaterial enumtoolmaterial) {
		super(name, namespaceId, id, enumtoolmaterial);
	}

	public boolean hitEntity(ItemStack itemstack, Mob target, Mob attacker) {
		itemstack.damageItem(2, attacker);
		World world = attacker.world;
		assert world != null;
		world.playSoundEffect(attacker, SoundCategory.WORLD_SOUNDS, attacker.x, attacker.y, attacker.z, "random.glass", 5F, 0.5F + (world.rand.nextFloat() - world.rand.nextFloat()) * 0.8F);
		return true;
	}
}
