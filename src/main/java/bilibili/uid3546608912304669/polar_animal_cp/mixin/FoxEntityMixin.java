package bilibili.uid3546608912304669.polar_animal_cp.mixin;

import bilibili.uid3546608912304669.polar_animal_cp.items.ModItems;
import net.minecraft.entity.passive.FoxEntity;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(FoxEntity.class)
public class FoxEntityMixin {
	@Inject(
			method = "canEat",
			at = @At("RETURN"),
			cancellable = true
	) private void newCanEat(ItemStack stack, CallbackInfoReturnable<Boolean> info) {
		if (
				stack.isOf(ModItems.FOX) ||
				stack.isOf(ModItems.COOKED_FOX) ||
				stack.isOf(ModItems.BI_YUE_HU_MEAT) ||
				stack.isOf(ModItems.COOKED_BI_YUE_HU_MEAT)
		) {
			info.setReturnValue(false);
		}
	}
}
