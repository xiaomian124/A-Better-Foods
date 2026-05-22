package com.xiaomian124.abf.item;

import net.minecraft.world.food.FoodProperties;

public final class FoodComponents {

/**
* 食物属性
* @param nutrition 恢复饥饿值（鸡腿数×2）
* @param saturationModifier 饱和度（通常0.3~1.2）
* @param alwaysEdible 是否在任何时候都能食用
* @return FoodProperties
*/
    public static FoodProperties createBaseProperties(int nutrition, float saturationModifier, boolean alwaysEdible) {
        FoodProperties.Builder builder = new FoodProperties.Builder()
                .nutrition(nutrition)
                .saturationModifier(saturationModifier);
        if (alwaysEdible) {
            builder.alwaysEdible();
        }
        return builder.build();
    }

    private FoodComponents() {}
}