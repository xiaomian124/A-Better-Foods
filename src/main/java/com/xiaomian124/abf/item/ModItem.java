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

    // 基础食物 - 苹果派
    public static final Item APPLE_PIE = new Item(new Item.Settings().food(FoodComponents.APPLE_PIE_COMPONENT));

    // 效果食物 - 金苹果派
    public static final Item GOLDEN_APPLE_PIE = new Item(new Item.Settings()
            .food(FoodComponents.GOLDEN_APPLE_PIE_COMPONENT)
            .rarity(Rarity.RARE)); // 添加稀有级稀有度（蓝色名称）

    // 附魔效果食物 - 附魔金苹果派
    public static final Item ENCHANTMENT_GOLDEN_APPLE_PIE = new Item(new Item.Settings()
            .food(FoodComponents.ENCHANTMENT_GOLDEN_APPLE_PIE_COMPONENT)
            .rarity(Rarity.EPIC)) { // 添加史诗级稀有度（紫色名称）

        // 覆盖方法添加附魔光效
        @Override
        public boolean hasGlint(ItemStack stack) {
            return true; // 始终显示附魔光效
        }
    };

    // 奶油蘑菇汤
    public static final Item CREAM_MUSHROOM_SOUP = new Item(new Item.Settings().food(FoodComponents.CREAM_MUSHROOM_SOUP_COMPONENT));

    // 奶油
    public static final Item CREAM = new Item(new Item.Settings().food(FoodComponents.CREAM_COMPONENT));

    // 鳕鱼汤
    public static final Item COD_SOUP = new Item(new Item.Settings().food(FoodComponents.COD_SOUP_COMPONENT));

    // 鲑鱼汤
    public static final Item SALMON_SOUP = new Item(new Item.Settings().food(FoodComponents.SALMON_SOUP_COMPONENT));

    // 蔬菜沙拉
    public static final Item VEGETABLE_SALAD = new Item(new Item.Settings().food(FoodComponents.VEGETABLE_SALAD_COMPONENT));

    // 麦片
    public static final Item CEREAL = new Item(new Item.Settings().food(FoodComponents.CEREAL_COMPONENT));

    // 金麦片
    public static final Item GOLDEN_CEREAL = new Item(new Item.Settings()
            .food(FoodComponents.GOLDEN_CEREAL_COMPONENT)
            .rarity(Rarity.RARE));

    // 附魔金麦片
    public static final Item ENCHANTMENT_GOLDEN_CEREAL = new Item(new Item.Settings()
            .food(FoodComponents.ENCHANTMENT_GOLDEN_CEREAL_COMPONENT)
            .rarity(Rarity.EPIC)) {

        @Override
        public boolean hasGlint(ItemStack stack) {
            return true;
        }
    };

    // 马铃薯麦片
    public static final Item POTATO_CEREAL = new Item(new Item.Settings().food(FoodComponents.POTATO_CEREAL_COMPONENT));

    // 胡萝卜麦片
    public static final Item CARROT_CEREAL = new Item(new Item.Settings().food(FoodComponents.CARROT_CEREAL_COMPONENT));

    // 苹果麦片
    public static final Item APPLE_CEREAL = new Item(new Item.Settings().food(FoodComponents.APPLE_CEREAL_COMPONENT));

    // 西瓜麦片
    public static final Item WATERMELON_CEREAL = new Item(new Item.Settings().food(FoodComponents.WATERMELON_CEREAL_COMPONENT));

    // 甜菜根麦片
    public static final Item BEETROOT_CEREAL = new Item(new Item.Settings().food(FoodComponents.BEETROOT_CEREAL_COMPONENT));

    // 紫颂果麦片
    public static final Item CHORUS_FRUIT_CEREAL = new Item(new Item.Settings().food(FoodComponents.CHORUS_FRUIT_CEREAL_COMPONENT));

    // 神奇药水
    public static final Item MAGIC_POTION = new Item(new Item.Settings()
            .food(FoodComponents.MAGIC_POTION_COMPONENT)
            .rarity(Rarity.EPIC)) {

        @Override
        public boolean hasGlint(ItemStack stack) {
            return true;
        }
    };

    // 注册所有食物
    public static void registerFoods() {
        registerFood("apple_pie", APPLE_PIE);
        registerFood("gold_apple_pie", GOLDEN_APPLE_PIE);
        registerFood("enchantment_apple_pie", ENCHANTMENT_GOLDEN_APPLE_PIE);
        registerFood("cream_mushroom_soup", CREAM_MUSHROOM_SOUP);
        registerFood("cream", CREAM);
        registerFood("cod_soup", COD_SOUP);
        registerFood("salmon_soup", SALMON_SOUP);
        registerFood("vegetable_salad", VEGETABLE_SALAD);
        registerFood("cereal", CEREAL);
        registerFood("gold_cereal", GOLDEN_CEREAL);
        registerFood("enchantment_cereal", ENCHANTMENT_GOLDEN_CEREAL);
        registerFood("potato_cereal", POTATO_CEREAL);
        registerFood("carrot_cereal", CARROT_CEREAL);
        registerFood("apple_cereal", APPLE_CEREAL);
        registerFood("watermelon_cereal", WATERMELON_CEREAL);
        registerFood("beetroot_cereal", BEETROOT_CEREAL);
        registerFood("chorus_fruit_cereal", CHORUS_FRUIT_CEREAL);
        registerFood("magic_potion", MAGIC_POTION);
    }

    private static void registerFood(final String name, final Item item) {
        // 向 Minecraft 注册物品
        Registry.register(Registries.ITEM, new Identifier("a-better-foods", name), item);

        // 然后提交到模组物品记录表
        ITEMS.add(item);
    }
}
