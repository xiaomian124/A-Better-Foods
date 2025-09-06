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

    // cn-gd-白切鸡
    public static final Item WHITE_CUT_CHICKEN = new Item(new Item.Settings().food(FoodComponents.WHITE_CUT_CHICKEN_COMPONENT));

    // cn-gd-肠粉
    public static final Item STEAMED_VERMICELLI_ROLL = new Item(new Item.Settings().food(FoodComponents.STEAMED_VERMICELLI_ROLL_COMPONENT));

    // cn-gd-蒸包
    public static final Item STEAMED_BUN_WITH_STUFFING = new Item(new Item.Settings().food(FoodComponents.STEAMED_BUN_WITH_STUFFING_COMPONENT));

    // cn-gd-凤爪
    public static final Item CHICKEN_CLAW = new Item(new Item.Settings().food(FoodComponents.CHICKEN_CLAW_COMPONENT));

    // cn-gd-虾饺
    public static final Item SHRIMP_DUMPLING = new Item(new Item.Settings().food(FoodComponents.SHRIMP_DUMPLING_COMPONENT));

    // cn-gd-乳鸽
    public static final Item ROASTED_PIGEON = new Item(new Item.Settings().food(FoodComponents.ROASTED_PIGEON_COMPONENT));

    // cn-gd-烧鹅
    public static final Item ROASTED_GOOSE = new Item(new Item.Settings().food(FoodComponents.ROASTED_GOOSE_COMPONENT));

    // cn-gd-濑粉
    public static final Item ROAST_GOOSE_RICE_NOODLES = new Item(new Item.Settings().food(FoodComponents.ROAST_GOOSE_RICE_NOODLES_COMPONENT));

    // cn-gd-双皮奶
    public static final Item MILK_CUSTARD = new Item(new Item.Settings().food(FoodComponents.MILK_CUSTARD_COMPONENT));

    // cn-gd-脆肉鲩
    public static final Item CRISPY_GRASS_CARP = new Item(new Item.Settings().food(FoodComponents.CRISPY_GRASS_CARP_COMPONENT));

    // cn-gd-横琴蚝
    public static final Item Oyster = new Item(new Item.Settings().food(FoodComponents.Oyster_COMPONENT));

    // cn-gd-梅菜扣肉
    public static final Item MEIGAN_CAI_COOKED_WITH_PORK = new Item(new Item.Settings().food(FoodComponents.MEIGAN_CAI_COOKED_WITH_PORK_COMPONENT));

    // cn-gd-古井烧鹅
    public static final Item ANCIENT_WELL_ROAST_GOOSE = new Item(new Item.Settings().food(FoodComponents.ANCIENT_WELL_ROAST_GOOSE_COMPONENT));

    // cn-gd-隆江猪脚饭
    public static final Item LONGJIANG_PIG_TROTTER_RICE = new Item(new Item.Settings().food(FoodComponents.LONGJIANG_PIG_TROTTER_RICE_COMPONENT));

    // cn-gd-擂茶
    public static final Item GRINDING_TEA = new Item(new Item.Settings().food(FoodComponents.GRINDING_TEA_COMPONENT));

    // cn-gd-猪肠碌
    public static final Item RICE_NOODLE_ROLL_WITH_BEAN_SPROUTS_AND_CHOW_FUN = new Item(new Item.Settings().food(FoodComponents.RICE_NOODLE_ROLL_WITH_BEAN_SPROUTS_AND_CHOW_FUN_COMPONENT));

    // cn-gd-酸笋焖鸭
    public static final Item BRAISED_DUCK_WITH_PICKLED_BAMBOO_SHOOTS = new Item(new Item.Settings().food(FoodComponents.BRAISED_DUCK_WITH_PICKLED_BAMBOO_SHOOTS_COMPONENT));

    // cn-gd-清远鸡
    public static final Item QINGYUAN_CHICKEN = new Item(new Item.Settings().food(FoodComponents.QINGYUAN_CHICKEN_COMPONENT));

    // cn-gd-腌面
    public static final Item PICKLED_NOODLES = new Item(new Item.Settings().food(FoodComponents.PICKLED_NOODLES_COMPONENT));

    // cn-gd-米粉
    public static final Item RICE_NOODLES = new Item(new Item.Settings().food(FoodComponents.RICE_NOODLES_COMPONENT));

    // cn-gd-簸箕炊
    public static final Item WINNOWING_PAN_COOKING = new Item(new Item.Settings().food(FoodComponents.WINNOWING_PAN_COOKING_COMPONENT));

    // cn-gd-红米肠
    public static final Item RED_RICE_SAUSAGE = new Item(new Item.Settings().food(FoodComponents.RED_RICE_SAUSAGE_COMPONENT));

    // cn-gd-沙茶粿
    public static final Item SATAY_RICE_TEA = new Item(new Item.Settings().food(FoodComponents.SATAY_RICE_TEA_COMPONENT));

    // cn-gd-裹蒸粽
    public static final Item WRAPPED_STEAMED_ZONGZI = new Item(new Item.Settings().food(FoodComponents.WRAPPED_STEAMED_ZONGZI_COMPONENT));

    // cn-gd-叉烧
    public static final Item CHAR_SIU = new Item(new Item.Settings().food(FoodComponents.CHAR_SIU_COMPONENT));

    // cn-gd-叉烧包
    public static final Item CHAR_SIU_BUNS = new Item(new Item.Settings().food(FoodComponents.CHAR_SIU_BUNS_COMPONENT));

    // cn-gd-脆皮五花肉
    public static final Item CRISPY_PORK_BELLY = new Item(new Item.Settings().food(FoodComponents.CRISPY_PORK_BELLY_COMPONENT));

    // cn-gd-干蒸
    public static final Item DRY_PARBOILING = new Item(new Item.Settings().food(FoodComponents.DRY_PARBOILING_COMPONENT));

    // cn-bj-驴打滚
    public static final Item BEAN_FLOUR_CAKE = new Item(new Item.Settings().food(FoodComponents.BEAN_FLOUR_CAKE_COMPONENT));

    // cn-bj-北京烤鸭
    public static final Item BEIJING_ROAST_DUCK = new Item(new Item.Settings().food(FoodComponents.BEIJING_ROAST_DUCK_COMPONENT));

    // cn-bj-奶油炸糕
    public static final Item CREAM_FRIED_CAKE = new Item(new Item.Settings().food(FoodComponents.CREAM_FRIED_CAKE_COMPONENT));

    // cn-bj-蜜麻花
    public static final Item TWISTED_DOUGH = new Item(new Item.Settings().food(FoodComponents.TWISTED_DOUGH_COMPONENT));

    // cn-bj-炒肝
    public static final Item STIR_FRIED_LIVER = new Item(new Item.Settings().food(FoodComponents.STIR_FRIED_LIVER_COMPONENT));

    // cn-bj-爆肚
    public static final Item COOKED_TRIPE_OF_SHEEP_OR_SWINE = new Item(new Item.Settings().food(FoodComponents.COOKED_TRIPE_OF_SHEEP_OR_SWINE_COMPONENT));

    // cn-bj-北京豆汁
    public static final Item BEIJING_BEAN_JUICE = new Item(new Item.Settings().food(FoodComponents.BEIJING_BEAN_JUICE_COMPONENT));

    // cn-bj-焦圈
    public static final Item COKE_RING = new Item(new Item.Settings().food(FoodComponents.COKE_RING_COMPONENT));

    // cn-bj-老北京炸酱面
    public static final Item NOODLES_WITH_SOYBEAN_PASTE = new Item(new Item.Settings().food(FoodComponents.NOODLES_WITH_SOYBEAN_PASTE_COMPONENT));

    // cn-bj-京酱肉丝
    public static final Item SHREDDED_PORK_IN_BEAN_SAUCE = new Item(new Item.Settings().food(FoodComponents.SHREDDED_PORK_IN_BEAN_SAUCE_COMPONENT));

    // cn-bj-羊蝎子火锅
    public static final Item LAMB_SCORPION_HOT_POT = new Item(new Item.Settings().food(FoodComponents.LAMB_SCORPION_HOT_POT_COMPONENT));

    // cn-bj-炸灌肠
    public static final Item FRIED_SAUSAGE = new Item(new Item.Settings().food(FoodComponents.FRIED_SAUSAGE_COMPONENT));

    // cn-bj-卤煮火烧
    public static final Item BRAISED_FIRE = new Item(new Item.Settings().food(FoodComponents.BRAISED_FIRE_COMPONENT));

    // cn-bj-炙子烤肉
    public static final Item GRILLED_MEAT = new Item(new Item.Settings().food(FoodComponents.GRILLED_MEAT_COMPONENT));

    // cn-bj-面茶
    public static final Item SEASONED_MILLET_MUSH = new Item(new Item.Settings().food(FoodComponents.SEASONED_MILLET_MUSH_COMPONENT));

    // cn-bj-烧饼
    public static final Item CHINESE_STYLE_BAKED_ROLL = new Item(new Item.Settings().food(FoodComponents.CHINESE_STYLE_BAKED_ROLL_COMPONENT));

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
        registerFood("cn-gd-bqj", WHITE_CUT_CHICKEN);
        registerFood("cn-gd-cf", STEAMED_VERMICELLI_ROLL);
        registerFood("cn-gd-zb", STEAMED_BUN_WITH_STUFFING);
        registerFood("cn-gd-fz", CHICKEN_CLAW);
        registerFood("cn-gd-xj", SHRIMP_DUMPLING);
        registerFood("cn-gd-rg", ROASTED_PIGEON);
        registerFood("cn-gd-se", ROASTED_GOOSE);
        registerFood("cn-gd-lf", ROAST_GOOSE_RICE_NOODLES);
        registerFood("cn-gd-spn", MILK_CUSTARD);
        registerFood("cn-gd-crw", CRISPY_GRASS_CARP);
        registerFood("cn-gd-hqh", Oyster);
        registerFood("cn-gd-mckr", MEIGAN_CAI_COOKED_WITH_PORK);
        registerFood("cn-gd-gjse", ANCIENT_WELL_ROAST_GOOSE);
        registerFood("cn-gd-ljzjf", LONGJIANG_PIG_TROTTER_RICE);
        registerFood("cn-gd-lc", GRINDING_TEA);
        registerFood("cn-gd-zcl", RICE_NOODLE_ROLL_WITH_BEAN_SPROUTS_AND_CHOW_FUN);
        registerFood("cn-gd-ssmy", BRAISED_DUCK_WITH_PICKLED_BAMBOO_SHOOTS);
        registerFood("cn-gd-qyj", QINGYUAN_CHICKEN);
        registerFood("cn-gd-ym", PICKLED_NOODLES);
        registerFood("cn-gd-mf", RICE_NOODLES);
        registerFood("cn-gd-bjc", WINNOWING_PAN_COOKING);
        registerFood("cn-gd-hmc", RED_RICE_SAUSAGE);
        registerFood("cn-gd-scg", SATAY_RICE_TEA);
        registerFood("cn-gd-gzz", WRAPPED_STEAMED_ZONGZI);
        registerFood("cn-gd-cs", CHAR_SIU);
        registerFood("cn-gd-csb", CHAR_SIU_BUNS);
        registerFood("cn-gd-cpwhr", CRISPY_PORK_BELLY);
        registerFood("cn-gd-gz", DRY_PARBOILING);
        registerFood("cn-bj-ldg", BEAN_FLOUR_CAKE);
        registerFood("cn-bj-bjky", BEIJING_ROAST_DUCK);
        registerFood("cn-bj-nyzg", CREAM_FRIED_CAKE);
        registerFood("cn-bj-mmh", TWISTED_DOUGH);
        registerFood("cn-bj-cg", STIR_FRIED_LIVER);
        registerFood("cn-bj-bd", COOKED_TRIPE_OF_SHEEP_OR_SWINE);
        registerFood("cn-bj-bjdz", BEIJING_BEAN_JUICE);
        registerFood("cn-bj-jq", COKE_RING);
        registerFood("cn-bj-lbjzjm", NOODLES_WITH_SOYBEAN_PASTE);
        registerFood("cn-bj-jjrs", SHREDDED_PORK_IN_BEAN_SAUCE);
        registerFood("cn-bj-yxzhg", LAMB_SCORPION_HOT_POT);
        registerFood("cn-bj-zgc", FRIED_SAUSAGE);
        registerFood("cn-bj-lzhs", BRAISED_FIRE);
        registerFood("cn-gd-zzkr", GRILLED_MEAT);
        registerFood("cn-gd-mc", SEASONED_MILLET_MUSH);
        registerFood("cn-gd-sb", CHINESE_STYLE_BAKED_ROLL);
    }

    private static void registerFood(final String name, final Item item) {
        // 向 Minecraft 注册物品
        Registry.register(Registries.ITEM, new Identifier("a-better-foods", name), item);

        // 然后提交到模组物品记录表
        ITEMS.add(item);
    }
}
