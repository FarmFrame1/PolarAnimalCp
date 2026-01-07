package bilibili.uid3546608912304669.polar_animal_cp.entities;

import bilibili.uid3546608912304669.polar_animal_cp.entities.cube.CubeEntity;
import bilibili.uid3546608912304669.polar_animal_cp.entities.penguin.PenguinEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static bilibili.uid3546608912304669.polar_animal_cp.PolarAnimalCP.MODID;

public class ModEntities {
	public static void register(String name, EntityType<?> entity) {
		Registry.register(
				Registries.ENTITY_TYPE,
				Identifier.of(MODID, name),
				entity
		);
	}

	public static final EntityType<CubeEntity> CUBE =
			EntityType.Builder.create(CubeEntity::new, SpawnGroup.CREATURE)
					.dimensions(.75f, .75f)
					.build();
	public static final EntityType<PenguinEntity> PENGUIN =
			EntityType.Builder.create(PenguinEntity::new, SpawnGroup.CREATURE)
					.dimensions(.5f, .9f)
					.build();

	public static void init() {
		register("cube", CUBE);
		FabricDefaultAttributeRegistry.register(
				CUBE,
				CubeEntity.createMobAttributes()
		);
		register("penguin", PENGUIN);
		FabricDefaultAttributeRegistry.register(
				PENGUIN,
				CubeEntity.createMobAttributes()
						.add(EntityAttributes.GENERIC_MAX_HEALTH, 10d)
						.add(EntityAttributes.GENERIC_MOVEMENT_SPEED, .25)
		);
	}
}
