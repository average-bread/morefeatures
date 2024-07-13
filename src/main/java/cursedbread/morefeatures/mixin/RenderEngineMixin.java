package cursedbread.morefeatures.mixin;

import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.render.RenderEngine;
import net.minecraft.client.render.dynamictexture.DynamicTexture;
import net.minecraft.client.render.dynamictexture.DynamicTextureCustom;
import net.minecraft.client.render.texturepack.TexturePack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(value = RenderEngine.class, remap = false)
public abstract class RenderEngineMixin {
    @Shadow private List<DynamicTexture> dynamicTextures;
    @Shadow @Final public Minecraft mc;

    @Inject(method = "initDynamicTextures", at = @At(value = "TAIL"))
    public void initDynamicTextures(CallbackInfo ci) {
        String texture = "/assets/morefeatures/rainbow_flower.png";
        TexturePack texturePack = mc.texturePackList.getHighestPriorityTexturePackWithFile(texture);
        dynamicTextures.add(new DynamicTextureCustom(mc, texturePack, texture, "morefeatures:block/extra_block_rainbow_flower", false));
    }
}
