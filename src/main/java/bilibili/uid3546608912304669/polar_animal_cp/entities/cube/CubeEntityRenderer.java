package bilibili.uid3546608912304669.polar_animal_cp.entities.cube;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

import static bilibili.uid3546608912304669.polar_animal_cp.PolarAnimalCP.MODID;

public class CubeEntityRenderer extends MobEntityRenderer<CubeEntity, CubeEntityModel<CubeEntity>> {
	public CubeEntityRenderer(EntityRendererFactory.Context context) {
		super(context, new CubeEntityModel<>(context.getPart(CubeEntityModel.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public Identifier getTexture(CubeEntity entity) {
		return Identifier.of(MODID, "textures/entity/texture.png");
	}
}
