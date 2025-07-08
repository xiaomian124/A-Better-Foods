package com.xiaomian124.abf.item;

import com.google.common.collect.Lists;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.List;

public class ModItem {
    // 物品记录表
    public static final List<Item> ITEMS = Lists.newArrayList();

    // 基础食物
    public static final Item APPLE_PIE = new Item(new Item.Settings().food(FoodComponents.APPLE_PIE_COMPONENT));

    // 效果食物
    public static final Item GOLDEN_APPLE_PIE = new Item(new Item.Settings()
            .food(FoodComponents.GOLDEN_APPLE_PIE_COMPONENT)
            .rarity(Rarity.RARE)); // 添加稀有级稀有度（蓝色名称）

    // 附魔效果食物
    public static final Item ENCHANTMENT_GOLDEN_APPLE_PIE = new Item(new Item.Settings()
            .food(FoodComponents.ENCHANTMENT_GOLDEN_APPLE_PIE_COMPONENT)
            .rarity(Rarity.EPIC)) { // 添加史诗级稀有度（紫色名称）

        // 覆盖方法添加附魔光效
        @Override
        public boolean hasGlint(ItemStack stack) {
            return true; // 始终显示附魔光效
        }
    };

    // 注册所有食物
    public static void registerFoods() {
        registerFood("apple_pie", APPLE_PIE);
        registerFood("gold_apple_pie", GOLDEN_APPLE_PIE);
        registerFood("enchantment_apple_pie", ENCHANTMENT_GOLDEN_APPLE_PIE);
    }

    private static void registerFood(final String name, final Item item) {
        // 向 Minecraft 注册物品
        Registry.register(Registries.ITEM, new Identifier("a-better-foods", name), item);

        // 然后提交到模组物品记录表
        ITEMS.add(item);
    }
}
