package net.yourname.packetblocker.mixin;

import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public class HealthLossMixin {

    @Inject(method = "damage", at = @At("HEAD"), cancellable = true)
    public void preventHealthLoss(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir) {
        // Blocks damage
        cir.setReturnValue(false);
    }
}
