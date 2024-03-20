package me.megsy.crusher.mixin;

import net.minecraft.block.AnvilBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
@Mixin(AnvilBlock.class)
public class CrushingMixin {
	@Inject(at = @At("TAIL"), method = "onLanding")
	private void init(CallbackInfo info) {

	}
}