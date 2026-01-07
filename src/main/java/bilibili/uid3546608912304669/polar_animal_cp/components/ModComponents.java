package bilibili.uid3546608912304669.polar_animal_cp.components;

import net.minecraft.component.type.FoodComponent;

public class ModComponents {
	public static final FoodComponent
			FOX = new FoodComponent.Builder().nutrition(2).saturationModifier(0.2f).build(),
			COOKED_FOX = new FoodComponent.Builder().nutrition(6).saturationModifier(0.8f).build();
}
