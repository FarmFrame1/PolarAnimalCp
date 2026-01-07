package bilibili.uid3546608912304669.polar_animal_cp.entities.penguin;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

import static bilibili.uid3546608912304669.polar_animal_cp.PolarAnimalCP.MODID;

public class PenguinEntityRenderer extends MobEntityRenderer<PenguinEntity, PenguinEntityModel<PenguinEntity>> {
	public PenguinEntityRenderer(EntityRendererFactory.Context ctx) {
		super(ctx, new PenguinEntityModel<>(ctx.getPart(PenguinEntityModel.LAYER_LOCATION)), .5f);
	}

	@Override
	public Identifier getTexture(PenguinEntity entity) {
		return Identifier.of(MODID, "textures/entity/penguin.png");
	}
}
