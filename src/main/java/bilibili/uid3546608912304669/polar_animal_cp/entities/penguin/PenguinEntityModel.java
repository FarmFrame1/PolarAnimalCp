package bilibili.uid3546608912304669.polar_animal_cp.entities.penguin;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.AnimalModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.Identifier;

import java.util.List;

import static bilibili.uid3546608912304669.polar_animal_cp.PolarAnimalCP.MODID;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class PenguinEntityModel<T extends Entity> extends AnimalModel<T> {
	private final ModelPart feet;
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart bb_main;

	public static final EntityModelLayer LAYER_LOCATION = new EntityModelLayer(
			Identifier.of(MODID, "penguin"),
			"main"
	);

	public PenguinEntityModel(ModelPart root) {
		this.feet = root.getChild("feet");
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.bb_main = root.getChild("bb_main");
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData feet = modelPartData.addChild("feet", ModelPartBuilder.create().uv(0, 16).cuboid(-4.0F, -1.0F, -1.0F, 4.0F, 1.0F, 8.0F, new Dilation(0.0F))
				.uv(0, 16).cuboid(-8.0F, -1.0F, -1.0F, 4.0F, 1.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, 24.0F, -4.0F));

		ModelPartData head = modelPartData.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-3.5F, -4.8F, 1.5F, 7.0F, 5.0F, 7.0F, new Dilation(0.0F))
				.uv(0, 13).cuboid(-1.0F, -2.0F, 0.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 13.0F, -5.0F));

		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create().uv(32, 0).cuboid(-4.0F, -15.0F, -4.0F, 8.0F, 10.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 28.0F, 0.0F));

		ModelPartData bb_main = modelPartData.addChild("bb_main", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData arm_left_r1 = bb_main.addChild("arm_left_r1", ModelPartBuilder.create().uv(24, 18).mirrored().cuboid(-1.0F, -8.0F, -1.0F, 6.0F, 8.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.0F, -3.0F, 3.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData arm_right_r1 = bb_main.addChild("arm_right_r1", ModelPartBuilder.create().uv(24, 18).cuboid(-5.0F, -8.0F, -1.0F, 6.0F, 8.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, -3.0F, 3.0F, 0.0F, -1.5708F, 0.0F));
		return TexturedModelData.of(modelData, 64, 32);
	}

	@Override
	public void setAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
		feet.render(matrices, vertexConsumer, light, overlay, color);
		head.render(matrices, vertexConsumer, light, overlay, color);
		body.render(matrices, vertexConsumer, light, overlay, color);
		bb_main.render(matrices, vertexConsumer, light, overlay, color);
	}

	@Override
	protected Iterable<ModelPart> getHeadParts() {
		return List.of(head);
	}

	@Override
	protected Iterable<ModelPart> getBodyParts() {
		return List.of(body);
	}
}
