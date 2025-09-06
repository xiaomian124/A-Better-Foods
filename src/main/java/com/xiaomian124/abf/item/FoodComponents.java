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
    public static final FoodComponent WHITE_CUT_CHICKEN_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent STEAMED_VERMICELLI_ROLL_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent STEAMED_BUN_WITH_STUFFING_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent CHICKEN_CLAW_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent SHRIMP_DUMPLING_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent ROASTED_PIGEON_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent ROASTED_GOOSE_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent ROAST_GOOSE_RICE_NOODLES_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent MILK_CUSTARD_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent CRISPY_GRASS_CARP_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent Oyster_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent MEIGAN_CAI_COOKED_WITH_PORK_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent ANCIENT_WELL_ROAST_GOOSE_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent LONGJIANG_PIG_TROTTER_RICE_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent GRINDING_TEA_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent RICE_NOODLE_ROLL_WITH_BEAN_SPROUTS_AND_CHOW_FUN_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent BRAISED_DUCK_WITH_PICKLED_BAMBOO_SHOOTS_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent QINGYUAN_CHICKEN_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent PICKLED_NOODLES_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent RICE_NOODLES_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent WINNOWING_PAN_COOKING_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent RED_RICE_SAUSAGE_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent SATAY_RICE_TEA_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent WRAPPED_STEAMED_ZONGZI_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent CHAR_SIU_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent CHAR_SIU_BUNS_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent CRISPY_PORK_BELLY_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent DRY_PARBOILING_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent BEAN_FLOUR_CAKE_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent BEIJING_ROAST_DUCK_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent CREAM_FRIED_CAKE_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent TWISTED_DOUGH_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent STIR_FRIED_LIVER_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent COOKED_TRIPE_OF_SHEEP_OR_SWINE_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent BEIJING_BEAN_JUICE_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent COKE_RING_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent NOODLES_WITH_SOYBEAN_PASTE_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent SHREDDED_PORK_IN_BEAN_SAUCE_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent LAMB_SCORPION_HOT_POT_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent FRIED_SAUSAGE_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent BRAISED_FIRE_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent GRILLED_MEAT_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent SEASONED_MILLET_MUSH_COMPONENT = createFoodComponent(5, 0.12f, false);
    public static final FoodComponent CHINESE_STYLE_BAKED_ROLL_COMPONENT = createFoodComponent(5, 0.12f, false);

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
