package bilibili.uid3546608912304669.polar_animal_cp.items;

import bilibili.uid3546608912304669.polar_animal_cp.components.ModComponents;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import static bilibili.uid3546608912304669.polar_animal_cp.PolarAnimalCP.MODID;

public class ModItems {
	public static final Item
			FOX = new Item(new Item.Settings().food(ModComponents.FOX)),
			COOKED_FOX = new Item(new Item.Settings().food(ModComponents.COOKED_FOX)),
			BI_YUE_HU_MEAT = new Item(new Item.Settings().food(ModComponents.FOX).rarity(Rarity.UNCOMMON)),
			COOKED_BI_YUE_HU_MEAT = new Item(new Item.Settings().food(ModComponents.COOKED_FOX).rarity(Rarity.UNCOMMON))
					;

	public static void add_to_food(Item item) {
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(
				fabricItemGroupEntries -> fabricItemGroupEntries.add(item)
		);
	}

	public static void init() {
		Registry.register(Registries.ITEM, Identifier.of(MODID, "fox"), FOX);
		Registry.register(Registries.ITEM, Identifier.of(MODID, "cooked_fox"), COOKED_FOX);
		Registry.register(Registries.ITEM, Identifier.of(MODID, "bi_yue_hu_meat"), BI_YUE_HU_MEAT);
		Registry.register(Registries.ITEM, Identifier.of(MODID, "cooked_bi_yue_hu_meat"), COOKED_BI_YUE_HU_MEAT);
		add_to_food(FOX);
		add_to_food(COOKED_FOX);
	}
}
