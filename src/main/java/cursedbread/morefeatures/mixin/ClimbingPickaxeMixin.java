package cursedbread.morefeatures.mixin;

import com.mojang.nbt.tags.CompoundTag;
import cursedbread.morefeatures.item.FeaturesItems;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.Mob;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.player.inventory.container.ContainerInventory;
import net.minecraft.core.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Objects;

@Mixin(value = Mob.class, remap = false)

public abstract class ClimbingPickaxeMixin extends Entity {
	public ClimbingPickaxeMixin(World world) {
		super(world);
	}

	@Unique
	private boolean isClimbingItem(ItemStack is) {
		return is != null && (is.getItem().equals(FeaturesItems.climbPickaxeWood) ||
							  is.getItem().equals(FeaturesItems.climbPickaxeStone) ||
							  is.getItem().equals(FeaturesItems.climbPickaxeIron) ||
							  is.getItem().equals(FeaturesItems.climbPickaxeGold) ||
							  is.getItem().equals(FeaturesItems.climbPickaxeDiamond) ||
							  is.getItem().equals(FeaturesItems.climbPickaxeSteel));
	}

	@Unique private int ValidClimbingItemSlot(Player p) {
		for(int i = 0; i < ContainerInventory.playerMainInventorySize(); ++i) {
			ItemStack is = p.getHeldItem();
			if (is == null) continue;

			if (isClimbingItem(is) && is.getMetadata() < is.getItem().getMaxDamage()) {
				return i;
			}
		}
		return -1;
	}

	@Unique int time;

	@Inject(method="canClimb", at = @At("HEAD"), cancellable = true)
	public void canClimb(CallbackInfoReturnable<Boolean> cir) {
		Mob t = (Mob) (Object) this;
		if (t instanceof Player) {
			Player p = (Player) (Object) t;
			int is = ValidClimbingItemSlot(p);
			if (p.horizontalCollision) {
				if (is != -1) {
					//p.getHeldItem().damageItem(1,p);
					cir.setReturnValue(true);
				}
			}
		}
	}
}
