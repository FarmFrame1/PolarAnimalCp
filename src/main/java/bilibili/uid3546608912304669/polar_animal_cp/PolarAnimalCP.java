package bilibili.uid3546608912304669.polar_animal_cp;

import bilibili.uid3546608912304669.polar_animal_cp.entities.ModEntities;
import bilibili.uid3546608912304669.polar_animal_cp.items.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PolarAnimalCP implements ModInitializer {
	public static final String MODID = "polar-animal-cp",
			BI_YUE_HU = "bi_yue_hu",
			MUCHUANBEI = "Muchuanbei";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItems.init();
		ModEntities.init();
		LOGGER.info("Mod Init Successful");
	}
}
