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
    public static final FoodComponent CREAM_MUSHROOM_SOUP_COMPONENT = createFoodComponent(6, 0.22f, false,
            new StatusEffectInstance(StatusEffects.SPEED, 600, 1));
    public static final FoodComponent CREAM_COMPONENT = createFoodComponent(2, 0.4f, false);
    public static final FoodComponent COD_SOUP_COMPONENT = createFoodComponent(5, 0.6f, false);
    public static final FoodComponent SALMON_SOUP_COMPONENT = createFoodComponent(5, 0.6f, false);
    public static final FoodComponent VEGETABLE_SALAD_COMPONENT = createFoodComponent(5, 0.7f, false);
    public static final FoodComponent CEREAL_COMPONENT = createFoodComponent(3, 0.4f, false);
    public static final FoodComponent GOLDEN_CEREAL_COMPONENT = createFoodComponent(3, 0.4f, true,
            new StatusEffectInstance(StatusEffects.ABSORPTION, 1300, 2),
            new StatusEffectInstance(StatusEffects.SPEED, 3000, 1),
            new StatusEffectInstance(StatusEffects.HASTE, 2000, 1),
            new StatusEffectInstance(StatusEffects.REGENERATION, 2100, 2));
    public static final FoodComponent ENCHANTMENT_GOLDEN_CEREAL_COMPONENT = createFoodComponent(3, 0.4f, true,
            new StatusEffectInstance(StatusEffects.SPEED, 4000, 2),
            new StatusEffectInstance(StatusEffects.HASTE, 2400, 2),
            new StatusEffectInstance(StatusEffects.NIGHT_VISION, 1000, 1),
            new StatusEffectInstance(StatusEffects.ABSORPTION, 2200, 3),
            new StatusEffectInstance(StatusEffects.REGENERATION, 2500, 1),
            new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 6100, 0),
            new StatusEffectInstance(StatusEffects.RESISTANCE, 6100, 0));
    public static final FoodComponent POTATO_CEREAL_COMPONENT = createFoodComponent(7, 0.24f, false);
    public static final FoodComponent CARROT_CEREAL_COMPONENT = createFoodComponent(7, 0.24f, false);
    public static final FoodComponent APPLE_CEREAL_COMPONENT = createFoodComponent(7, 0.24f, false);
    public static final FoodComponent WATERMELON_CEREAL_COMPONENT = createFoodComponent(7, 0.24f, false);
    public static final FoodComponent BEETROOT_CEREAL_COMPONENT = createFoodComponent(7, 0.24f, false);
    public static final FoodComponent CHORUS_FRUIT_CEREAL_COMPONENT = createFoodComponent(7, 0.24f, false);
    public static final FoodComponent MAGIC_POTION_COMPONENT = createFoodComponent(0, 0f, true,
            new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 400, 1),
            new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 400, 1),
            new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 400, 1),
            new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 400, 1),
            new StatusEffectInstance(StatusEffects.SLOW_FALLING, 400, 1),
            new StatusEffectInstance(StatusEffects.HASTE, 400, 1),
            new StatusEffectInstance(StatusEffects.RESISTANCE, 400, 1),
            new StatusEffectInstance(StatusEffects.STRENGTH, 400, 1),
            new StatusEffectInstance(StatusEffects.ABSORPTION, 400, 1),
            new StatusEffectInstance(StatusEffects.REGENERATION, 400, 1),
            new StatusEffectInstance(StatusEffects.WATER_BREATHING, 400, 1),
            new StatusEffectInstance(StatusEffects.SPEED, 400, 1),
            new StatusEffectInstance(StatusEffects.JUMP_BOOST, 400, 1),
            new StatusEffectInstance(StatusEffects.NIGHT_VISION, 400, 1),
            new StatusEffectInstance(StatusEffects.INVISIBILITY, 400, 1),
            new StatusEffectInstance(StatusEffects.BAD_OMEN, 400, 1),
            new StatusEffectInstance(StatusEffects.GLOWING, 400, 1),
            new StatusEffectInstance(StatusEffects.DARKNESS, 400, 1),
            new StatusEffectInstance(StatusEffects.WITHER, 400, 1),
            new StatusEffectInstance(StatusEffects.NAUSEA, 400, 1),
            new StatusEffectInstance(StatusEffects.SLOWNESS, 400, 1),
            new StatusEffectInstance(StatusEffects.HUNGER, 400, 1),
            new StatusEffectInstance(StatusEffects.LEVITATION, 400, 1),
            new StatusEffectInstance(StatusEffects.BLINDNESS, 400, 1),
            new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 400, 1),
            new StatusEffectInstance(StatusEffects.WEAKNESS, 400, 1),
            new StatusEffectInstance(StatusEffects.POISON, 400, 1));

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
