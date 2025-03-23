package cursedbread.morefeatures.mixin.itemsmixins;

import cursedbread.morefeatures.item.FeaturesItems;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.Mob;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.player.inventory.container.ContainerInventory;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

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
				assert world != null;
				if (is != -1) {
					for (double x1 = -0.4; x1 <= 1.4; x1+=0.1){
						for (double z1 = -0.4; z1 <= 1.4; z1+=0.1){
							for (double y1 = 1; y1 <= 2; y1+=0.1){
								if (
									(world.getBlockMaterial((int) (x+x1), (int) (y-y1), (int) (z+z1)) == Material.stone) ||
										(world.getBlockMaterial((int) (x+x1), (int) (y-y1), (int) (z+z1)) == Material.basalt) ||
										(world.getBlockMaterial((int) (x+x1), (int) (y-y1), (int) (z+z1)) == Material.granite) ||
										(world.getBlockMaterial((int) (x+x1), (int) (y-y1), (int) (z+z1)) == Material.ice) ||
										(world.getBlockMaterial((int) (x+x1), (int) (y-y1), (int) (z+z1)) == Material.limestone) ||
										(world.getBlockMaterial((int) (x+x1), (int) (y-y1), (int) (z+z1)) == Material.marble) ||
										(world.getBlockMaterial((int) (x+x1), (int) (y-y1), (int) (z+z1)) == Material.moss) ||
										(world.getBlockMaterial((int) (x+x1), (int) (y-y1), (int) (z+z1)) == Material.netherrack) ||
										(world.getBlockMaterial((int) (x+x1), (int) (y-y1), (int) (z+z1)) == Material.permafrost) ||
										(world.getBlockMaterial((int) (x+x1), (int) (y-y1), (int) (z+z1)) == Material.slate)
								) {
									cir.setReturnValue(true);
								}
							}
						}
					}
				}
			}
		}
	}
}
