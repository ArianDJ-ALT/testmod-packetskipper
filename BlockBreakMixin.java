package net.yourname.packetblocker.mixin;

import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ClientPlayerInteractionManager.class)
public class BlockBreakMixin {

    @Inject(method = "tryBreakBlock", at = @At("HEAD"), cancellable = true)
    public void allowBlockBreak(BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
        // Allows breaking blocks, ignoring the restrictions
        cir.setReturnValue(true);
    }
}
