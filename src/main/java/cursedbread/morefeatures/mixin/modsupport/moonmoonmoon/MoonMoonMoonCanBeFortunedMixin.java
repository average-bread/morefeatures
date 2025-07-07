package cursedbread.morefeatures.mixin.modsupport.moonmoonmoon;

import cursedbread.morefeatures.FeaturesMain;
import cursedbread.morefeatures.blocks.ores.*;
import cursedbread.morefeatures.blocks.ores.deep.*;
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

		if (FeaturesMain.deepOn){
			if (Block.hasLogicClass(block, BlockLogicSuperOreRhodonite.class)) cir.setReturnValue(true);
			if (Block.hasLogicClass(block, BlockLogicSuperOreAmethyst.class)) cir.setReturnValue(true);
			if (Block.hasLogicClass(block, BlockLogicSuperOreSilver.class)) cir.setReturnValue(true);
			if (Block.hasLogicClass(block, BlockLogicSuperOreUranium.class)) cir.setReturnValue(true);
			if (Block.hasLogicClass(block, BlockLogicSuperOreLead.class)) cir.setReturnValue(true);
			if (Block.hasLogicClass(block, BlockLogicSuperOreTopaz.class)) cir.setReturnValue(true);
		}
	}
}
