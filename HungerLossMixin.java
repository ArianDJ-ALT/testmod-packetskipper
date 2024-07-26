package net.yourname.packetblocker.mixin;

import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public class HungerLossMixin {

    @Inject(method = "addExhaustion", at = @At("HEAD"), cancellable = true)
    public void preventHungerLoss(float exhaustion, CallbackInfo ci) {
        // Blocks Hunger Loss
        ci.cancel();
    }
}
