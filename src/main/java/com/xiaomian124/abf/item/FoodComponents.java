package com.xiaomian124.abf.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

/**
 * FoodComponents 负责记录全部食物属性。
 */
public class FoodComponents {
    public static final FoodComponent APPLE_PIE_COMPONENT = createFoodComponent(8, 0.36f, false);
    public static final FoodComponent GOLDEN_APPLE_PIE_COMPONENT = createFoodComponent(8, 0.36f, true,
           new StatusEffectInstance(StatusEffects.ABSORPTION, 1200, 2),
           new StatusEffectInstance(StatusEffects.SPEED, 3000, 1),
           new StatusEffectInstance(StatusEffects.REGENERATION, 2000, 2));
    public static final FoodComponent ENCHANTMENT_GOLDEN_APPLE_PIE_COMPONENT = createFoodComponent(8, 0.36f, true,
            new StatusEffectInstance(StatusEffects.SPEED, 4000, 1),
            new StatusEffectInstance(StatusEffects.ABSORPTION, 2000, 3),
            new StatusEffectInstance(StatusEffects.REGENERATION, 2000, 1),
            new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 6000, 0),
            new StatusEffectInstance(StatusEffects.RESISTANCE, 6000, 0));

    /**
     * 创建一个食物构造器。
     * @param hunger 饥饿值，每两点为一个鸡腿。
     * @param saturation 饱和度，最大值为 2.0，每 0.2 为一个鸡腿。
     * @param alwaysEat 总是可以食用。
     * @param effects 效果组。
     * @return 完成构建的食物数据类。
     */
    private static FoodComponent createFoodComponent(final int hunger, final float saturation, boolean alwaysEat, final StatusEffectInstance... effects) {
        final var builder = new net.minecraft.item.FoodComponent.Builder();
        builder.hunger(hunger);
        builder.saturationModifier(saturation);
        if (alwaysEat) builder.alwaysEdible();
        for (final var effectInstance : effects) {
            builder.statusEffect(effectInstance, 1.0f);
        }
        return builder.build();
    }
}
