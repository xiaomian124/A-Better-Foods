package com.xiaomian124.abf.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModItem {

    // 基础食物
    public static final Item apple_pie = new Item(new Item.Settings()
            .food(new FoodComponent.Builder()
                    .hunger(8) // 恢复8点饥饿值（4个鸡腿）
                    .saturationModifier(3.6f) // 饱和度
                    .build()));

    // 效果食物
    public static final Item gold_apple_pie = new Item(new Item.Settings()
            .food(new FoodComponent.Builder()
                    .hunger(8) // 恢复8点饥饿值（4个鸡腿）
                    .saturationModifier(3.6f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1200, 2), 1.0f) // D:时间，C:100%几率获得伤害吸收
                    .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 3000, 1), 1.0f) // 100%几率获得速度
                    .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 2000, 2), 1.0f) // 100%几率获得生命恢复
                    .alwaysEdible() // 即使满饥饿值也可以吃
                    .build()));

    // 附魔光效食物 - 使用匿名内部类覆盖 hasGlint 方法
    public static final Item enchantment_apple_pie = new Item(new Item.Settings()
            .food(new FoodComponent.Builder()
                    .hunger(8) // 恢复8点饥饿值（4个鸡腿）
                    .saturationModifier(3.6f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 4000, 1), 1.0f) // 100%几率获得速度
                    .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2000, 3), 1.0f) // 伤害吸收 IV
                    .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 2000, 1), 1.0f) // 生命恢复 II
                    .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 6000, 0), 1.0f) // 防火
                    .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 6000, 0), 1.0f) // 抗性提升
                    .alwaysEdible() // 即使满饥饿值也可以吃
                    .build())
            .rarity(Rarity.EPIC)){ // 添加史诗级稀有度（粉色名称）

        // 覆盖方法添加附魔光效
        @Override
        public boolean hasGlint(ItemStack stack) {
            return true; // 始终显示附魔光效
        }
    };

    // 注册所有食物
    public static void registerFoods() {
        registerFood("apple_pie", apple_pie);
        registerFood("gold_apple_pie", gold_apple_pie);
        registerFood("enchantment_apple_pie", enchantment_apple_pie);
    }

    private static void registerFood(String name, Item item) {
        Registry.register(Registries.ITEM, new Identifier("a-better-foods", name), item);
    }
}