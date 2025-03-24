package cursedbread.morefeatures.mixin.blockmixins;

import cursedbread.morefeatures.FeaturesMain;
import cursedbread.morefeatures.blocks.FeaturesBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.BlockLogicCobble;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.IItemConvertible;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.function.Supplier;

@Mixin(value = BlockLogicCobble.class, remap = false)

public class NetherrackCrushingMixin extends BlockLogic {
	@Shadow
	private final @Nullable Supplier<? extends IItemConvertible> crushDrop;

	public NetherrackCrushingMixin(Block<?> block, Material material, @Nullable Supplier<? extends IItemConvertible> crushResult) {
		super(block, material);
		this.crushDrop = crushResult;
	}

	@Inject(method = "getBreakResult(Lnet/minecraft/core/world/World;Lnet/minecraft/core/enums/EnumDropCause;ILnet/minecraft/core/block/entity/TileEntity;)[Lnet/minecraft/core/item/ItemStack;", at=@At("HEAD"), cancellable = true)
	public void getBreakResult(World world, EnumDropCause dropCause, int meta, TileEntity tileEntity, CallbackInfoReturnable<ItemStack[]> cir) {
		if (FeaturesMain.netherUpdate == 1 && dropCause == EnumDropCause.PISTON_CRUSH && block == Blocks.COBBLE_NETHERRACK){
			cir.setReturnValue(new ItemStack[]{new ItemStack((IItemConvertible)FeaturesBlocks.netherrack_Gravel)});
		}
	}
}
