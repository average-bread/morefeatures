package cursedbread.morefeatures.mixin.modsupport;

import cursedbread.morefeatures.blocks.ores.*;
import net.minecraft.core.block.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import useless.moonsteel.MoonSteelBlocks;

@Mixin(value = MoonSteelBlocks.class, remap = false)

public class MoonMoonMoonCanBeFortunedMixin {
	@Inject(method = "canBeFortuned(Lnet/minecraft/core/block/Block;)Z", at = @At("HEAD"), cancellable = true)
	private static void canBeFortuned(Block block, CallbackInfoReturnable<Boolean> cir){
		if (Block.hasLogicClass(block, BlockLogicSuperOreCoal.class)) cir.setReturnValue(true);
		if (Block.hasLogicClass(block, BlockLogicSuperOreDiamond.class)) cir.setReturnValue(true);
		if (Block.hasLogicClass(block, BlockLogicSuperOreGold.class)) cir.setReturnValue(true);
		if (Block.hasLogicClass(block, BlockLogicSuperOreIron.class)) cir.setReturnValue(true);
		if (Block.hasLogicClass(block, BlockLogicSuperOreLapis.class)) cir.setReturnValue(true);
		if (Block.hasLogicClass(block, BlockLogicSuperOreNetherCoal.class)) cir.setReturnValue(true);
		if (Block.hasLogicClass(block, BlockLogicSuperOreRedstone.class)) cir.setReturnValue(true);
	}
}
