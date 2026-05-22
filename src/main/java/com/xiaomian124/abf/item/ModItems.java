package com.xiaomian124.abf.item;

import com.xiaomian124.abf.ABetterFoods;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

// 弃用类 由ModFoodEvents管理效果
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ABetterFoods.MODID);

    public static final Map<String, DeferredItem<Item>> ALL_FOODS = new HashMap<>();

    // 附魔光效
    private static final Set<String> GLINT_ITEMS = Set.of(
            "enchantment_golden_cereal",
            "enchantment_golden_apple_pie",
            "magic_potion"
    );

    // RARE
    private static final Set<String> RARE_ITEMS = Set.of(
            "enchantment_golden_cereal",
            "enchantment_golden_apple_pie"
    );

    // EPIC
    private static final Set<String> EPIC_ITEMS = Set.of(
            "magic_potion"
    );

// 食物属性 - 苹果派示例
// "apple_pie" 物品
// "8" 营养值
// "0.36f" 饱和度
// "false/true" 是否总是可食用
// ”null/new MobEffectInstance[]{}“ 效果（new MobEffectInstance[]{} 弃用）

    private static final Object[][] FOOD_DATA = {
            // 暂无效果的食物
            {"magic_potion", 0, 0f, true, null},
            {"apple_pie", 8, 0.36f, false, null},
            {"golden_apple_pie", 8, 0.36f, true, null},
            {"enchantment_golden_apple_pie", 8, 0.36f, true, null},
            {"cream", 2, 0.4f, false, null},
            {"cod_soup", 5, 0.6f, false, null},
            {"salmon_soup", 5, 0.6f, false, null},
            {"cream_mushroom_soup", 6, 0.22f, false, null},
            {"vegetable_salad", 5, 0.7f, false, null},
            {"cereal", 3, 0.4f, false, null},
            {"potato_cereal", 7, 0.24f, false, null},
            {"carrot_cereal", 7, 0.24f, false, null},
            {"apple_cereal", 7, 0.24f, false, null},
            {"watermelon_cereal", 7, 0.24f, false, null},
            {"beetroot_cereal", 7, 0.24f, false, null},
            {"chorus_fruit_cereal", 7, 0.24f, false, null},
            {"golden_cereal", 3, 0.4f, true, null},
            {"enchantment_golden_cereal", 3, 0.4f, true, null},
            {"cn-gd-bqj", 5, 0.12f, false, null},
            {"cn-gd-cf", 5, 0.12f, false, null},
            {"cn-gd-zb", 5, 0.12f, false, null},
            {"cn-gd-fz", 5, 0.12f, false, null},
            {"cn-gd-xj", 5, 0.12f, false, null},
            {"cn-gd-rg", 5, 0.12f, false, null},
            {"cn-gd-se", 5, 0.12f, false, null},
            {"cn-gd-lf", 5, 0.12f, false, null},
            {"cn-gd-spn", 5, 0.12f, false, null},
            {"cn-gd-crw", 5, 0.12f, false, null},
            {"cn-gd-hqh", 5, 0.12f, false, null},
            {"cn-gd-mckr", 5, 0.12f, false, null},
            {"cn-gd-gjse", 5, 0.12f, false, null},
            {"cn-gd-ljzjf", 5, 0.12f, false, null},
            {"cn-gd-lc", 5, 0.12f, false, null},
            {"cn-gd-zcl", 5, 0.12f, false, null},
            {"cn-gd-ssmy", 5, 0.12f, false, null},
            {"cn-gd-qyj", 5, 0.12f, false, null},
            {"cn-gd-ym", 5, 0.12f, false, null},
            {"cn-gd-mf", 5, 0.12f, false, null},
            {"cn-gd-bjc", 5, 0.12f, false, null},
            {"cn-gd-hmc", 5, 0.12f, false, null},
            {"cn-gd-scg", 5, 0.12f, false, null},
            {"cn-gd-gzz", 5, 0.12f, false, null},
            {"cn-gd-cs", 5, 0.12f, false, null},
            {"cn-gd-csb", 5, 0.12f, false, null},
            {"cn-gd-cpwhr", 5, 0.12f, false, null},
            {"cn-gd-gz", 5, 0.12f, false, null},
            {"cn-bj-ldg", 5, 0.12f, false, null},
            {"cn-bj-bjky", 5, 0.12f, false, null},
            {"cn-bj-nyzg", 5, 0.12f, false, null},
            {"cn-bj-mmh", 5, 0.12f, false, null},
            {"cn-bj-cg", 5, 0.12f, false, null},
            {"cn-bj-bd", 5, 0.12f, false, null},
            {"cn-bj-bjdz", 5, 0.12f, false, null},
            {"cn-bj-jq", 5, 0.12f, false, null},
            {"cn-bj-lbjzjm", 5, 0.12f, false, null},
            {"cn-bj-jjrs", 5, 0.12f, false, null},
            {"cn-bj-yxzhg", 5, 0.12f, false, null},
            {"cn-bj-zgc", 5, 0.12f, false, null},
            {"cn-bj-lzhs", 5, 0.12f, false, null},
            {"cn-bj-zzkr", 5, 0.12f, false, null},
            {"cn-bj-mc", 5, 0.12f, false, null},
            {"cn-bj-sb", 5, 0.12f, false, null}
    };

    static {
        for (Object[] data : FOOD_DATA) {
            String name = (String) data[0];
            int nutrition = (int) data[1];
            float saturation = (float) data[2];
            boolean alwaysEdible = (boolean) data[3];

            final boolean needGlint = GLINT_ITEMS.contains(name);
            final Rarity rarity = RARE_ITEMS.contains(name) ? Rarity.RARE
                    : EPIC_ITEMS.contains(name) ? Rarity.EPIC : null;

            DeferredItem<Item> item = ITEMS.registerItem(name, props -> {
                var builder = props.food(FoodComponents.createBaseProperties(nutrition, saturation, alwaysEdible));
                if (rarity != null) {
                    builder = builder.rarity(rarity);
                }
                if (needGlint) {
                    return new Item(builder) {
                        @Override
                        public boolean isFoil(ItemStack stack) {
                            return true;
                        }
                    };
                } else {
                    return new Item(builder);
                }
            });
            ALL_FOODS.put(name, item);
        }
    }

    public static DeferredItem<Item> getFood(String name) {
        return ALL_FOODS.get(name);
    }
}