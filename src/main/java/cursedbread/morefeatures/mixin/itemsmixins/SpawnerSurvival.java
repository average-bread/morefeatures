package cursedbread.morefeatures.mixin.itemsmixins;

import cursedbread.morefeatures.item.FeaturesItems;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.BlockLogicMobSpawner;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;
import net.minecraft.core.util.helper.Side;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = BlockLogicMobSpawner.class, remap = false)
public abstract class SpawnerSurvival extends BlockLogic {
	public SpawnerSurvival(Block<?> block) {
		super(block, Material.stone);
	}

	@Inject(method = "onBlockRightClicked", at = @At(value = "HEAD"), cancellable = true)
	public void survivalActivated(World world, int x, int y, int z, Player player, Side side, double xPlaced, double yPlaced, CallbackInfoReturnable<Boolean> cir) {
		ItemStack check = new ItemStack(FeaturesItems.mob_Soul);
		ItemStack stack = player.getHeldItem();
		if (player.getHeldItem() != null && player.getHeldItem().isItemEqual(check)){
			player.displayMobPickerScreen(x, y, z);
			stack.consumeItem(player);
			cir.setReturnValue(true);
		}
	}
}

