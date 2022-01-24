package ca.naln1.rainflake.babyspiders.entities;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

import ca.naln1.rainflake.babyspiders.BabySpiders;

public class BabySpiderRenderer extends MobRenderer<BabySpiderEntity, BabySpidersModel> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(BabySpiders.MOD_ID, "textures/entity/baby_spider.png");
    private static final float shadowRadius = 0.25f;

    public BabySpiderRenderer(EntityRendererManager manager) {
        super(manager, new BabySpidersModel(), shadowRadius);
    }

    @Override
    public ResourceLocation getTextureLocation(BabySpiderEntity p_110775_1_) {
        return TEXTURE;
    }
}
