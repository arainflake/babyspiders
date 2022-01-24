package ca.naln1.rainflake.babyspiders.entities;

// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class BabySpidersModel extends EntityModel<BabySpiderEntity> {
	private final ModelRenderer right_legs;
	private final ModelRenderer leg5;
	private final ModelRenderer distal_r1;
	private final ModelRenderer proximal_r1;
	private final ModelRenderer leg6;
	private final ModelRenderer distal_r2;
	private final ModelRenderer leg7;
	private final ModelRenderer distal_r3;
	private final ModelRenderer leg8;
	private final ModelRenderer distal_r4;
	private final ModelRenderer left_legs;
	private final ModelRenderer leg1;
	private final ModelRenderer distal_r5;
	private final ModelRenderer proximal_r2;
	private final ModelRenderer leg2;
	private final ModelRenderer distal_r6;
	private final ModelRenderer leg3;
	private final ModelRenderer distal_r7;
	private final ModelRenderer leg4;
	private final ModelRenderer distal_r8;
	private final ModelRenderer bb_main;
	private final ModelRenderer abdomen_r1;
	private final ModelRenderer thorax_r1;

	public BabySpidersModel() {
		texWidth = 64;
		texHeight = 16;

		right_legs = new ModelRenderer(this);
		right_legs.setPos(0.0F, 24.0F, 0.0F);
		setRotationAngle(right_legs, 0.0F, -1.5708F, 0.0F);


		leg5 = new ModelRenderer(this);
		leg5.setPos(-5.0F, -1.0F, 2.0F);
		right_legs.addChild(leg5);
		setRotationAngle(leg5, 0.6109F, -0.6981F, 0.0F);


		distal_r1 = new ModelRenderer(this);
		distal_r1.setPos(0.0F, 0.0F, 4.0F);
		leg5.addChild(distal_r1);
		setRotationAngle(distal_r1, -1.1781F, 0.0F, 0.0F);
		distal_r1.texOffs(33, 1).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);

		proximal_r1 = new ModelRenderer(this);
		proximal_r1.setPos(0.0F, 0.0F, 0.0F);
		leg5.addChild(proximal_r1);
		setRotationAngle(proximal_r1, 0.0F, 0.0F, -0.1745F);
		proximal_r1.texOffs(43, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		leg6 = new ModelRenderer(this);
		leg6.setPos(-3.0F, -1.0F, 2.0F);
		right_legs.addChild(leg6);
		setRotationAngle(leg6, 0.6109F, -0.2182F, 0.1309F);
		leg6.texOffs(43, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		distal_r2 = new ModelRenderer(this);
		distal_r2.setPos(0.0F, 0.0F, 4.0F);
		leg6.addChild(distal_r2);
		setRotationAngle(distal_r2, -1.1781F, 0.0F, 0.0F);
		distal_r2.texOffs(33, 1).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);

		leg7 = new ModelRenderer(this);
		leg7.setPos(-1.0F, -1.0F, 2.0F);
		right_legs.addChild(leg7);
		setRotationAngle(leg7, 0.6545F, 0.1745F, -0.2182F);
		leg7.texOffs(43, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		distal_r3 = new ModelRenderer(this);
		distal_r3.setPos(0.0F, 0.0F, 4.0F);
		leg7.addChild(distal_r3);
		setRotationAngle(distal_r3, -1.2654F, 0.0F, 0.0F);
		distal_r3.texOffs(33, 1).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);

		leg8 = new ModelRenderer(this);
		leg8.setPos(0.0F, -1.0F, 2.0F);
		right_legs.addChild(leg8);
		setRotationAngle(leg8, 0.6545F, 0.5672F, 0.0F);
		leg8.texOffs(43, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		distal_r4 = new ModelRenderer(this);
		distal_r4.setPos(0.0F, 0.0F, 4.0F);
		leg8.addChild(distal_r4);
		setRotationAngle(distal_r4, -1.1781F, 0.0F, 0.0F);
		distal_r4.texOffs(33, 1).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);

		left_legs = new ModelRenderer(this);
		left_legs.setPos(0.0F, 24.0F, 0.0F);
		setRotationAngle(left_legs, 0.0F, 1.5708F, 0.0F);


		leg1 = new ModelRenderer(this);
		leg1.setPos(5.0F, -1.0F, 2.0F);
		left_legs.addChild(leg1);
		setRotationAngle(leg1, 0.6109F, 0.6981F, 0.0F);


		distal_r5 = new ModelRenderer(this);
		distal_r5.setPos(0.0F, 0.0F, 4.0F);
		leg1.addChild(distal_r5);
		setRotationAngle(distal_r5, -1.1781F, 0.0F, 0.0F);
		distal_r5.texOffs(33, 1).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 6.0F, 0.0F, true);

		proximal_r2 = new ModelRenderer(this);
		proximal_r2.setPos(0.0F, 0.0F, 0.0F);
		leg1.addChild(proximal_r2);
		setRotationAngle(proximal_r2, 0.0F, 0.0F, 0.1745F);
		proximal_r2.texOffs(43, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 5.0F, 0.0F, true);

		leg2 = new ModelRenderer(this);
		leg2.setPos(3.0F, -1.0F, 2.0F);
		left_legs.addChild(leg2);
		setRotationAngle(leg2, 0.6109F, 0.2182F, -0.1309F);
		leg2.texOffs(43, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 5.0F, 0.0F, true);

		distal_r6 = new ModelRenderer(this);
		distal_r6.setPos(0.0F, 0.0F, 4.0F);
		leg2.addChild(distal_r6);
		setRotationAngle(distal_r6, -1.1781F, 0.0F, 0.0F);
		distal_r6.texOffs(33, 1).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 6.0F, 0.0F, true);

		leg3 = new ModelRenderer(this);
		leg3.setPos(1.0F, -1.0F, 2.0F);
		left_legs.addChild(leg3);
		setRotationAngle(leg3, 0.6545F, -0.1745F, 0.2182F);
		leg3.texOffs(43, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 5.0F, 0.0F, true);

		distal_r7 = new ModelRenderer(this);
		distal_r7.setPos(0.0F, 0.0F, 4.0F);
		leg3.addChild(distal_r7);
		setRotationAngle(distal_r7, -1.2654F, 0.0F, 0.0F);
		distal_r7.texOffs(33, 1).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 6.0F, 0.0F, true);

		leg4 = new ModelRenderer(this);
		leg4.setPos(0.0F, -1.0F, 2.0F);
		left_legs.addChild(leg4);
		setRotationAngle(leg4, 0.6545F, -0.5672F, 0.0F);
		leg4.texOffs(43, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 5.0F, 0.0F, true);

		distal_r8 = new ModelRenderer(this);
		distal_r8.setPos(0.0F, 0.0F, 4.0F);
		leg4.addChild(distal_r8);
		setRotationAngle(distal_r8, -1.1781F, 0.0F, 0.0F);
		distal_r8.texOffs(33, 1).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 6.0F, 0.0F, true);

		bb_main = new ModelRenderer(this);
		bb_main.setPos(0.0F, 24.0F, 0.0F);


		abdomen_r1 = new ModelRenderer(this);
		abdomen_r1.setPos(0.0F, 0.0F, 0.0F);
		bb_main.addChild(abdomen_r1);
		setRotationAngle(abdomen_r1, 0.0F, -1.5708F, 0.0F);
		abdomen_r1.texOffs(0, 0).addBox(0.0F, -4.0F, -3.5F, 7.0F, 4.0F, 7.0F, 0.0F, false);

		thorax_r1 = new ModelRenderer(this);
		thorax_r1.setPos(0.0F, 0.0F, 0.0F);
		bb_main.addChild(thorax_r1);
		setRotationAngle(thorax_r1, 0.0F, -1.5708F, 0.0F);
		thorax_r1.texOffs(21, 0).addBox(-5.0F, -3.0F, -2.0F, 5.0F, 3.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(BabySpiderEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//swing = 0...inf
		//swing amount = 0..1
		//temp = 0...1  radians? 1rad=57deg

        //rotation values in radians
		float yRot = (float) (Math.cos(limbSwing * 0.666f * 2.0f) * limbSwingAmount);
		float xRot = Math.abs(yRot/2f);

		//left legs
		leg1.yRot = yRot;
		leg2.yRot = -yRot;
		leg3.yRot = yRot;
		leg4.yRot = -yRot;

		//right legs
		leg5.yRot = -yRot;
		leg6.yRot = yRot;
		leg7.yRot = -yRot;
		leg8.yRot = yRot;

		leg1.xRot = xRot;
		leg2.xRot = xRot;
		leg3.xRot = xRot;
		leg4.xRot = xRot;
		leg5.xRot = xRot;
		leg6.xRot = xRot;
		leg7.xRot = xRot;
		leg8.xRot = xRot;


		//resting positions
		//left_legs.xRot = 3.14F + 0.61F;
		//right_legs.xRot = 0.61f;

		xRot = 0.61F;
		leg1.xRot += xRot;
		leg2.xRot += xRot;
		leg3.xRot += xRot;
		leg4.xRot += xRot;

		leg5.xRot += xRot;
		leg6.xRot += xRot;
		leg7.xRot += xRot;
		leg8.xRot += xRot;

		//left legs
		leg1.yRot += 0.6981F;
		leg2.yRot += 0.2182F;
		leg3.yRot += -0.1745F;
		leg4.yRot += -0.5672F;

		//right legs
		leg5.yRot += -0.6981F;
		leg6.yRot += -0.2182F;
		leg7.yRot += 0.1745F;
		leg8.yRot += 0.5672F;
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		float scale = 0.5f;
		matrixStack.scale(scale, scale, scale);
		matrixStack.translate(0, 1.5f, 0);

		right_legs.render(matrixStack, buffer, packedLight, packedOverlay);
		left_legs.render(matrixStack, buffer, packedLight, packedOverlay);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}