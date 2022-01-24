package ca.naln1.rainflake.babyspiders.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.monster.SpiderEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

import ca.naln1.rainflake.babyspiders.BabySpiders;

public class BabySpiderEntity extends SpiderEntity {
    public BabySpiderEntity(EntityType<? extends SpiderEntity> type, World world) {
        super(type, world);
    }

    public static AttributeModifierMap.MutableAttribute prepareAttributes() {
        return LivingEntity.createLivingAttributes()
                .add(Attributes.MOVEMENT_SPEED, 0.4F)
                .add(Attributes.ATTACK_KNOCKBACK, 0.5D)
                .add(Attributes.ATTACK_DAMAGE, 1.0D)
                .add(Attributes.MAX_HEALTH, 4.0D)
                .add(Attributes.FOLLOW_RANGE, 40.0D);
    }

    @Override
    public ItemStack getPickedResult(RayTraceResult target) {
        //if (!(target.getType() == this.getClass())) return null;

        //both work
        return new ItemStack(BabySpiders.BSSE.get());
        //return BabySpiders.BSSE.get().getDefaultInstance();
    }
}
