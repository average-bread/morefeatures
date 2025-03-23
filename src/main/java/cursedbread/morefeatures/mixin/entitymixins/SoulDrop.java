package cursedbread.morefeatures.mixin.entitymixins;

import cursedbread.morefeatures.item.FeaturesItems;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.Mob;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = Mob.class, remap = false)
public abstract class SoulDrop extends Entity {
	public SoulDrop(World world) {
		super(world);
	}


	@Inject(method = "onDeath", at = @At(value = "INVOKE", target = "Lnet/minecraft/core/entity/Mob;dropDeathItems()V"))
	private void soulDrop(Entity entity, CallbackInfo ci){
		if (FeaturesItems.miscItemsEnabled > 0 && entity instanceof Player){
			ItemStack heldStack = ((Player) entity).getHeldItem();
			ItemStack drop = new ItemStack(FeaturesItems.mobSoul);
			if (heldStack != null && heldStack.getItem().equals(Items.TOOL_SWORD_GOLD)){
				int i = (int) (Math.random() * 64);
				if (i == 0) {
					assert world != null;
					world.dropItem((int) x, (int) y, (int) z, drop);
				}
			}
		}
	}
}

