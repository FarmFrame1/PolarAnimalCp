package bilibili.uid3546608912304669.polar_animal_cp;

import bilibili.uid3546608912304669.polar_animal_cp.entities.ModEntities;
import bilibili.uid3546608912304669.polar_animal_cp.entities.cube.CubeEntityModel;
import bilibili.uid3546608912304669.polar_animal_cp.entities.cube.CubeEntityRenderer;
import bilibili.uid3546608912304669.polar_animal_cp.entities.penguin.PenguinEntityModel;
import bilibili.uid3546608912304669.polar_animal_cp.entities.penguin.PenguinEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class PolarAnimalCPClient implements ClientModInitializer {
//	public static void register(EntityModelLayer layer, ) {
//	}

	@Override
	public void onInitializeClient() {
		EntityModelLayerRegistry.registerModelLayer(
				CubeEntityModel.LAYER_LOCATION,
				CubeEntityModel::getTexturedModelData
		);
		EntityRendererRegistry.register(ModEntities.CUBE, CubeEntityRenderer::new);
		EntityModelLayerRegistry.registerModelLayer(
				PenguinEntityModel.LAYER_LOCATION,
				PenguinEntityModel::getTexturedModelData
		);
		EntityRendererRegistry.register(ModEntities.PENGUIN, PenguinEntityRenderer::new);
	}
}
