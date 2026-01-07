package bilibili.uid3546608912304669.polar_animal_cp.mixin;

import bilibili.uid3546608912304669.polar_animal_cp.items.ModItems;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static bilibili.uid3546608912304669.polar_animal_cp.PolarAnimalCP.BI_YUE_HU;

@Mixin(PlayerEntity.class)
public abstract class PlayerMixin {
	@Shadow
	public abstract Text getName();

	@Shadow
	public abstract @Nullable ItemEntity dropItem(ItemStack stack, boolean throwRandomly, boolean retainOwnership);

	@Inject(
			method = "dropInventory",
			at = @At("RETURN")
	)
	private void newDropInventory(CallbackInfo info) {
		String playerName = getName().getString();
		if (playerName.equals(BI_YUE_HU)) {
			ClientWorld world = MinecraftClient.getInstance().world;
			if (world == null) return;
			for (PlayerEntity player: world.getPlayers()) {
				if (player.getName().getString().equals(BI_YUE_HU)) {
					Item item = ModItems.BI_YUE_HU_MEAT;
					if (player.getFireTicks() > 0) {
						item = ModItems.COOKED_BI_YUE_HU_MEAT;
					}
					dropItem(
							new ItemStack(item, 1),
							true, false
					);
					break;
				}
			}
		}
	}
}
