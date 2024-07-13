package cursedbread.morefeatures.mixin;

import cursedbread.morefeatures.item.FeaturesItems;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockMobSpawner;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;
import net.minecraft.core.util.helper.Side;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = BlockMobSpawner.class, remap = false)
public abstract class SpawnerSurvival extends Block {
	public SpawnerSurvival(String key, int id) {
		super(key, id, Material.stone);
	}

	@Inject(method = "onBlockRightClicked", at = @At(value = "HEAD"), cancellable = true)
	public void survivalActivated(World world, int x, int y, int z, EntityPlayer player, Side side, double xPlaced, double yPlaced, CallbackInfoReturnable<Boolean> cir) {
		ItemStack check = new ItemStack(FeaturesItems.mobSoul);
		ItemStack stack = player.getHeldItem();
		if (player.getHeldItem() != null && player.getHeldItem().isItemEqual(check)){
			player.displayGUIMobSpawnerPicker(x, y, z);
			stack.consumeItem(player);
			cir.setReturnValue(true);
		}
	}
}

