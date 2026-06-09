package com.xiaomian124.abf.item;

import com.xiaomian124.abf.ABetterFoods;
import com.xiaomian124.abf.init.ModCreativeTab;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = ABetterFoods.MODID)
public class ModItems {
    public static ItemFood APPLE_PIE;
    public static ItemFood GOLDEN_APPLE_PIE;
    public static ItemFood ENCHANTMENT_GOLDEN_APPLE_PIE;
    public static ItemFood CREAM_MUSHROOM_SOUP;
    public static ItemFood CREAM;
    public static ItemFood COD_SOUP;
    public static ItemFood SALMON_SOUP;
    public static ItemFood VEGETABLE_SALAD;
    public static ItemFood CEREAL;
    public static ItemFood GOLDEN_CEREAL;
    public static ItemFood ENCHANTMENT_GOLDEN_CEREAL;
    public static ItemFood POTATO_CEREAL;
    public static ItemFood CARROT_CEREAL;
    public static ItemFood APPLE_CEREAL;
    public static ItemFood WATERMELON_CEREAL;
    public static ItemFood BEETROOT_CEREAL;
    public static ItemFood CHORUS_FRUIT_CEREAL;
    public static ItemFood MAGIC_POTION;
    public static ItemFood WHITE_CUT_CHICKEN;
    public static ItemFood STEAMED_VERMICELLI_ROLL;
    public static ItemFood STEAMED_BUN_WITH_STUFFING;
    public static ItemFood CHICKEN_CLAW;
    public static ItemFood SHRIMP_DUMPLING;
    public static ItemFood ROASTED_PIGEON;
    public static ItemFood ROASTED_GOOSE;
    public static ItemFood ROAST_GOOSE_RICE_NOODLES;
    public static ItemFood MILK_CUSTARD;
    public static ItemFood CRISPY_GRASS_CARP;
    public static ItemFood OYSTER;
    public static ItemFood MEIGAN_CAI_COOKED_WITH_PORK;
    public static ItemFood ANCIENT_WELL_ROAST_GOOSE;
    public static ItemFood LONGJIANG_PIG_TROTTER_RICE;
    public static ItemFood GRINDING_TEA;
    public static ItemFood RICE_NOODLE_ROLL_WITH_BEAN_SPROUTS_AND_CHOW_FUN;
    public static ItemFood BRAISED_DUCK_WITH_PICKLED_BAMBOO_SHOOTS;
    public static ItemFood QINGYUAN_CHICKEN;
    public static ItemFood PICKLED_NOODLES;
    public static ItemFood RICE_NOODLES;
    public static ItemFood WINNOWING_PAN_COOKING;
    public static ItemFood RED_RICE_SAUSAGE;
    public static ItemFood SATAY_RICE_TEA;
    public static ItemFood WRAPPED_STEAMED_ZONGZI;
    public static ItemFood CHAR_SIU;
    public static ItemFood CHAR_SIU_BUNS;
    public static ItemFood CRISPY_PORK_BELLY;
    public static ItemFood DRY_PARBOILING;
    public static ItemFood BEAN_FLOUR_CAKE;
    public static ItemFood BEIJING_ROAST_DUCK;
    public static ItemFood CREAM_FRIED_CAKE;
    public static ItemFood TWISTED_DOUGH;
    public static ItemFood STIR_FRIED_LIVER;
    public static ItemFood COOKED_TRIPE_OF_SHEEP_OR_SWINE;
    public static ItemFood BEIJING_BEAN_JUICE;
    public static ItemFood COKE_RING;
    public static ItemFood NOODLES_WITH_SOYBEAN_PASTE;
    public static ItemFood SHREDDED_PORK_IN_BEAN_SAUCE;
    public static ItemFood LAMB_SCORPION_HOT_POT;
    public static ItemFood FRIED_SAUSAGE;
    public static ItemFood BRAISED_FIRE;
    public static ItemFood GRILLED_MEAT;
    public static ItemFood SEASONED_MILLET_MUSH;
    public static ItemFood CHINESE_STYLE_BAKED_ROLL;

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {

        APPLE_PIE = new ItemFood(FoodComponents.APPLE_PIE_HUNGER, FoodComponents.APPLE_PIE_SATURATION, FoodComponents.APPLE_PIE_IS_WOLF_FOOD) {};
        APPLE_PIE.setRegistryName("apple_pie");
        APPLE_PIE.setTranslationKey("apple_pie");
        APPLE_PIE.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(APPLE_PIE);

        GOLDEN_APPLE_PIE = new ItemFood(FoodComponents.GOLDEN_APPLE_PIE_HUNGER, FoodComponents.GOLDEN_APPLE_PIE_SATURATION, FoodComponents.GOLDEN_APPLE_PIE_IS_WOLF_FOOD) {
            {
                setPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 1200, 2), 1.0f);
                setPotionEffect(new PotionEffect(MobEffects.SPEED, 3000, 1), 1.0f);
                setPotionEffect(new PotionEffect(MobEffects.REGENERATION, 2000, 2), 1.0f);
                setAlwaysEdible();
            }
            @Override
            public EnumRarity getRarity(ItemStack stack) {
                return EnumRarity.RARE;
            }
        };
        GOLDEN_APPLE_PIE.setRegistryName("golden_apple_pie");
        GOLDEN_APPLE_PIE.setTranslationKey("golden_apple_pie");
        GOLDEN_APPLE_PIE.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(GOLDEN_APPLE_PIE);

        ENCHANTMENT_GOLDEN_APPLE_PIE = new ItemFood(FoodComponents.ENCHANTMENT_GOLDEN_APPLE_PIE_HUNGER, FoodComponents.ENCHANTMENT_GOLDEN_APPLE_PIE_SATURATION, FoodComponents.ENCHANTMENT_GOLDEN_APPLE_PIE_IS_WOLF_FOOD) {
            {
                setPotionEffect(new PotionEffect(MobEffects.SPEED, 4000, 1), 1.0f);
                setPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 2000, 3), 1.0f);
                setPotionEffect(new PotionEffect(MobEffects.REGENERATION, 2000, 1), 1.0f);
                setPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 6000, 0), 1.0f);
                setPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 6000, 0), 1.0f);
                setAlwaysEdible();
            }
            @Override
            public boolean hasEffect(ItemStack stack) {
                return true;
            }
            @Override
            public EnumRarity getRarity(ItemStack stack) {
                return EnumRarity.EPIC;
            }
        };
        ENCHANTMENT_GOLDEN_APPLE_PIE.setRegistryName("enchantment_golden_apple_pie");
        ENCHANTMENT_GOLDEN_APPLE_PIE.setTranslationKey("enchantment_golden_apple_pie");
        ENCHANTMENT_GOLDEN_APPLE_PIE.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(ENCHANTMENT_GOLDEN_APPLE_PIE);

        CREAM_MUSHROOM_SOUP = new ItemFood(FoodComponents.CREAM_MUSHROOM_SOUP_HUNGER, FoodComponents.CREAM_MUSHROOM_SOUP_SATURATION, FoodComponents.CREAM_MUSHROOM_SOUP_IS_WOLF_FOOD) {
            {
                setPotionEffect(new PotionEffect(MobEffects.SPEED, 600, 1), 1.0f);
            }
        };
        CREAM_MUSHROOM_SOUP.setRegistryName("cream_mushroom_soup");
        CREAM_MUSHROOM_SOUP.setTranslationKey("cream_mushroom_soup");
        CREAM_MUSHROOM_SOUP.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(CREAM_MUSHROOM_SOUP);

        CREAM = new ItemFood(FoodComponents.CREAM_HUNGER, FoodComponents.CREAM_SATURATION, FoodComponents.CREAM_IS_WOLF_FOOD) {};
        CREAM.setRegistryName("cream");
        CREAM.setTranslationKey("cream");
        CREAM.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(CREAM);

        COD_SOUP = new ItemFood(FoodComponents.COD_SOUP_HUNGER, FoodComponents.COD_SOUP_SATURATION, FoodComponents.COD_SOUP_IS_WOLF_FOOD) {};
        COD_SOUP.setRegistryName("cod_soup");
        COD_SOUP.setTranslationKey("cod_soup");
        COD_SOUP.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(COD_SOUP);

        SALMON_SOUP = new ItemFood(FoodComponents.SALMON_SOUP_HUNGER, FoodComponents.SALMON_SOUP_SATURATION, FoodComponents.SALMON_SOUP_IS_WOLF_FOOD) {};
        SALMON_SOUP.setRegistryName("salmon_soup");
        SALMON_SOUP.setTranslationKey("salmon_soup");
        SALMON_SOUP.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(SALMON_SOUP);

        VEGETABLE_SALAD = new ItemFood(FoodComponents.VEGETABLE_SALAD_HUNGER, FoodComponents.VEGETABLE_SALAD_SATURATION, FoodComponents.VEGETABLE_SALAD_IS_WOLF_FOOD) {};
        VEGETABLE_SALAD.setRegistryName("vegetable_salad");
        VEGETABLE_SALAD.setTranslationKey("vegetable_salad");
        VEGETABLE_SALAD.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(VEGETABLE_SALAD);

        CEREAL = new ItemFood(FoodComponents.CEREAL_HUNGER, FoodComponents.CEREAL_SATURATION, FoodComponents.CEREAL_IS_WOLF_FOOD) {};
        CEREAL.setRegistryName("cereal");
        CEREAL.setTranslationKey("cereal");
        CEREAL.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(CEREAL);

        GOLDEN_CEREAL = new ItemFood(FoodComponents.GOLDEN_CEREAL_HUNGER, FoodComponents.GOLDEN_CEREAL_SATURATION, FoodComponents.GOLDEN_CEREAL_IS_WOLF_FOOD) {
            {
                setPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 1300, 2), 1.0f);
                setPotionEffect(new PotionEffect(MobEffects.SPEED, 3000, 1), 1.0f);
                setPotionEffect(new PotionEffect(MobEffects.HASTE, 2000, 1), 1.0f);
                setPotionEffect(new PotionEffect(MobEffects.REGENERATION, 2100, 2), 1.0f);
                setAlwaysEdible();
            }
            @Override
            public EnumRarity getRarity(ItemStack stack) {
                return EnumRarity.RARE;
            }
        };
        GOLDEN_CEREAL.setRegistryName("golden_cereal");
        GOLDEN_CEREAL.setTranslationKey("golden_cereal");
        GOLDEN_CEREAL.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(GOLDEN_CEREAL);

        ENCHANTMENT_GOLDEN_CEREAL = new ItemFood(FoodComponents.ENCHANTMENT_GOLDEN_CEREAL_HUNGER, FoodComponents.ENCHANTMENT_GOLDEN_CEREAL_SATURATION, FoodComponents.ENCHANTMENT_GOLDEN_CEREAL_IS_WOLF_FOOD) {
            {
                setPotionEffect(new PotionEffect(MobEffects.SPEED, 4000, 2), 1.0f);
                setPotionEffect(new PotionEffect(MobEffects.HASTE, 2400, 2), 1.0f);
                setPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 1000, 1), 1.0f);
                setPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 2200, 3), 1.0f);
                setPotionEffect(new PotionEffect(MobEffects.REGENERATION, 2500, 1), 1.0f);
                setPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 6100, 0), 1.0f);
                setPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 6100, 0), 1.0f);
                setAlwaysEdible();
            }
            @Override
            public boolean hasEffect(ItemStack stack) {
                return true;
            }
            @Override
            public EnumRarity getRarity(ItemStack stack) {
                return EnumRarity.EPIC;
            }
        };
        ENCHANTMENT_GOLDEN_CEREAL.setRegistryName("enchantment_golden_cereal");
        ENCHANTMENT_GOLDEN_CEREAL.setTranslationKey("enchantment_golden_cereal");
        ENCHANTMENT_GOLDEN_CEREAL.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(ENCHANTMENT_GOLDEN_CEREAL);

        POTATO_CEREAL = new ItemFood(FoodComponents.POTATO_CEREAL_HUNGER, FoodComponents.POTATO_CEREAL_SATURATION, FoodComponents.POTATO_CEREAL_IS_WOLF_FOOD) {};
        POTATO_CEREAL.setRegistryName("potato_cereal");
        POTATO_CEREAL.setTranslationKey("potato_cereal");
        POTATO_CEREAL.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(POTATO_CEREAL);

        CARROT_CEREAL = new ItemFood(FoodComponents.CARROT_CEREAL_HUNGER, FoodComponents.CARROT_CEREAL_SATURATION, FoodComponents.CARROT_CEREAL_IS_WOLF_FOOD) {};
        CARROT_CEREAL.setRegistryName("carrot_cereal");
        CARROT_CEREAL.setTranslationKey("carrot_cereal");
        CARROT_CEREAL.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(CARROT_CEREAL);

        APPLE_CEREAL = new ItemFood(FoodComponents.APPLE_CEREAL_HUNGER, FoodComponents.APPLE_CEREAL_SATURATION, FoodComponents.APPLE_CEREAL_IS_WOLF_FOOD) {};
        APPLE_CEREAL.setRegistryName("apple_cereal");
        APPLE_CEREAL.setTranslationKey("apple_cereal");
        APPLE_CEREAL.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(APPLE_CEREAL);

        WATERMELON_CEREAL = new ItemFood(FoodComponents.WATERMELON_CEREAL_HUNGER, FoodComponents.WATERMELON_CEREAL_SATURATION, FoodComponents.WATERMELON_CEREAL_IS_WOLF_FOOD) {};
        WATERMELON_CEREAL.setRegistryName("watermelon_cereal");
        WATERMELON_CEREAL.setTranslationKey("watermelon_cereal");
        WATERMELON_CEREAL.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(WATERMELON_CEREAL);

        BEETROOT_CEREAL = new ItemFood(FoodComponents.BEETROOT_CEREAL_HUNGER, FoodComponents.BEETROOT_CEREAL_SATURATION, FoodComponents.BEETROOT_CEREAL_IS_WOLF_FOOD) {};
        BEETROOT_CEREAL.setRegistryName("beetroot_cereal");
        BEETROOT_CEREAL.setTranslationKey("beetroot_cereal");
        BEETROOT_CEREAL.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(BEETROOT_CEREAL);

        CHORUS_FRUIT_CEREAL = new ItemFood(FoodComponents.CHORUS_FRUIT_CEREAL_HUNGER, FoodComponents.CHORUS_FRUIT_CEREAL_SATURATION, FoodComponents.CHORUS_FRUIT_CEREAL_IS_WOLF_FOOD) {};
        CHORUS_FRUIT_CEREAL.setRegistryName("chorus_fruit_cereal");
        CHORUS_FRUIT_CEREAL.setTranslationKey("chorus_fruit_cereal");
        CHORUS_FRUIT_CEREAL.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(CHORUS_FRUIT_CEREAL);

        MAGIC_POTION = new ItemFood(FoodComponents.MAGIC_POTION_HUNGER, FoodComponents.MAGIC_POTION_SATURATION, FoodComponents.MAGIC_POTION_IS_WOLF_FOOD) {
            {
                setPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 400, 1), 1.0f);
                setPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 400, 1), 1.0f);
                setPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 400, 1), 1.0f);
                setPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 400, 1), 1.0f);
                setPotionEffect(new PotionEffect(MobEffects.POISON, 400, 1), 1.0f);
                setPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 400, 1), 1.0f);
                setPotionEffect(new PotionEffect(MobEffects.BLINDNESS, 400, 1), 1.0f);
                setPotionEffect(new PotionEffect(MobEffects.GLOWING, 400, 1), 1.0f);
                setPotionEffect(new PotionEffect(MobEffects.HASTE, 400, 1), 1.0f);
                setPotionEffect(new PotionEffect(MobEffects.HUNGER, 400, 1), 1.0f);
                setPotionEffect(new PotionEffect(MobEffects.LEVITATION, 400, 1), 1.0f);
                setPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, 400, 1), 1.0f);
                setPotionEffect(new PotionEffect(MobEffects.NAUSEA, 400, 1), 1.0f);
                setPotionEffect(new PotionEffect(MobEffects.REGENERATION, 400, 1), 1.0f);
                setPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 400, 1), 1.0f);
                setPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 400, 1), 1.0f);
                setPotionEffect(new PotionEffect(MobEffects.SPEED, 400, 1), 1.0f);
                setPotionEffect(new PotionEffect(MobEffects.STRENGTH, 400, 1), 1.0f);
                setPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 400, 1), 1.0f);
                setPotionEffect(new PotionEffect(MobEffects.WEAKNESS, 400, 1), 1.0f);
                setPotionEffect(new PotionEffect(MobEffects.WITHER, 400, 1), 1.0f);
                setAlwaysEdible();
            }
            @Override
            public boolean hasEffect(ItemStack stack) {
                return true;
            }
            @Override
            public EnumRarity getRarity(ItemStack stack) {
                return EnumRarity.EPIC;
            }
        };
        MAGIC_POTION.setRegistryName("magic_potion");
        MAGIC_POTION.setTranslationKey("magic_potion");
        MAGIC_POTION.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(MAGIC_POTION);

        WHITE_CUT_CHICKEN = new ItemFood(FoodComponents.WHITE_CUT_CHICKEN_HUNGER, FoodComponents.WHITE_CUT_CHICKEN_SATURATION, FoodComponents.WHITE_CUT_CHICKEN_IS_WOLF_FOOD) {};
        WHITE_CUT_CHICKEN.setRegistryName("cn-gd-bqj");
        WHITE_CUT_CHICKEN.setTranslationKey("cn-gd-bqj");
        WHITE_CUT_CHICKEN.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(WHITE_CUT_CHICKEN);

        STEAMED_VERMICELLI_ROLL = new ItemFood(FoodComponents.STEAMED_VERMICELLI_ROLL_HUNGER, FoodComponents.STEAMED_VERMICELLI_ROLL_SATURATION, FoodComponents.STEAMED_VERMICELLI_ROLL_IS_WOLF_FOOD) {};
        STEAMED_VERMICELLI_ROLL.setRegistryName("cn-gd-cf");
        STEAMED_VERMICELLI_ROLL.setTranslationKey("cn-gd-cf");
        STEAMED_VERMICELLI_ROLL.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(STEAMED_VERMICELLI_ROLL);

        STEAMED_BUN_WITH_STUFFING = new ItemFood(FoodComponents.STEAMED_BUN_WITH_STUFFING_HUNGER, FoodComponents.STEAMED_BUN_WITH_STUFFING_SATURATION, FoodComponents.STEAMED_BUN_WITH_STUFFING_IS_WOLF_FOOD) {};
        STEAMED_BUN_WITH_STUFFING.setRegistryName("cn-gd-zb");
        STEAMED_BUN_WITH_STUFFING.setTranslationKey("cn-gd-zb");
        STEAMED_BUN_WITH_STUFFING.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(STEAMED_BUN_WITH_STUFFING);

        CHICKEN_CLAW = new ItemFood(FoodComponents.CHICKEN_CLAW_HUNGER, FoodComponents.CHICKEN_CLAW_SATURATION, FoodComponents.CHICKEN_CLAW_IS_WOLF_FOOD) {};
        CHICKEN_CLAW.setRegistryName("cn-gd-fz");
        CHICKEN_CLAW.setTranslationKey("cn-gd-fz");
        CHICKEN_CLAW.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(CHICKEN_CLAW);

        SHRIMP_DUMPLING = new ItemFood(FoodComponents.SHRIMP_DUMPLING_HUNGER, FoodComponents.SHRIMP_DUMPLING_SATURATION, FoodComponents.SHRIMP_DUMPLING_IS_WOLF_FOOD) {};
        SHRIMP_DUMPLING.setRegistryName("cn-gd-xj");
        SHRIMP_DUMPLING.setTranslationKey("cn-gd-xj");
        SHRIMP_DUMPLING.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(SHRIMP_DUMPLING);

        ROASTED_PIGEON = new ItemFood(FoodComponents.ROASTED_PIGEON_HUNGER, FoodComponents.ROASTED_PIGEON_SATURATION, FoodComponents.ROASTED_PIGEON_IS_WOLF_FOOD) {};
        ROASTED_PIGEON.setRegistryName("cn-gd-rg");
        ROASTED_PIGEON.setTranslationKey("cn-gd-rg");
        ROASTED_PIGEON.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(ROASTED_PIGEON);

        ROASTED_GOOSE = new ItemFood(FoodComponents.ROASTED_GOOSE_HUNGER, FoodComponents.ROASTED_GOOSE_SATURATION, FoodComponents.ROASTED_GOOSE_IS_WOLF_FOOD) {};
        ROASTED_GOOSE.setRegistryName("cn-gd-se");
        ROASTED_GOOSE.setTranslationKey("cn-gd-se");
        ROASTED_GOOSE.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(ROASTED_GOOSE);

        ROAST_GOOSE_RICE_NOODLES = new ItemFood(FoodComponents.ROAST_GOOSE_RICE_NOODLES_HUNGER, FoodComponents.ROAST_GOOSE_RICE_NOODLES_SATURATION, FoodComponents.ROAST_GOOSE_RICE_NOODLES_IS_WOLF_FOOD) {};
        ROAST_GOOSE_RICE_NOODLES.setRegistryName("cn-gd-lf");
        ROAST_GOOSE_RICE_NOODLES.setTranslationKey("cn-gd-lf");
        ROAST_GOOSE_RICE_NOODLES.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(ROAST_GOOSE_RICE_NOODLES);

        MILK_CUSTARD = new ItemFood(FoodComponents.MILK_CUSTARD_HUNGER, FoodComponents.MILK_CUSTARD_SATURATION, FoodComponents.MILK_CUSTARD_IS_WOLF_FOOD) {};
        MILK_CUSTARD.setRegistryName("cn-gd-spn");
        MILK_CUSTARD.setTranslationKey("cn-gd-spn");
        MILK_CUSTARD.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(MILK_CUSTARD);

        CRISPY_GRASS_CARP = new ItemFood(FoodComponents.CRISPY_GRASS_CARP_HUNGER, FoodComponents.CRISPY_GRASS_CARP_SATURATION, FoodComponents.CRISPY_GRASS_CARP_IS_WOLF_FOOD) {};
        CRISPY_GRASS_CARP.setRegistryName("cn-gd-crw");
        CRISPY_GRASS_CARP.setTranslationKey("cn-gd-crw");
        CRISPY_GRASS_CARP.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(CRISPY_GRASS_CARP);

        OYSTER = new ItemFood(FoodComponents.Oyster_HUNGER, FoodComponents.Oyster_SATURATION, FoodComponents.Oyster_IS_WOLF_FOOD) {};
        OYSTER.setRegistryName("cn-gd-hqh");
        OYSTER.setTranslationKey("cn-gd-hqh");
        OYSTER.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(OYSTER);

        MEIGAN_CAI_COOKED_WITH_PORK = new ItemFood(FoodComponents.MEIGAN_CAI_COOKED_WITH_PORK_HUNGER, FoodComponents.MEIGAN_CAI_COOKED_WITH_PORK_SATURATION, FoodComponents.MEIGAN_CAI_COOKED_WITH_PORK_IS_WOLF_FOOD) {};
        MEIGAN_CAI_COOKED_WITH_PORK.setRegistryName("cn-gd-mckr");
        MEIGAN_CAI_COOKED_WITH_PORK.setTranslationKey("cn-gd-mckr");
        MEIGAN_CAI_COOKED_WITH_PORK.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(MEIGAN_CAI_COOKED_WITH_PORK);

        ANCIENT_WELL_ROAST_GOOSE = new ItemFood(FoodComponents.ANCIENT_WELL_ROAST_GOOSE_HUNGER, FoodComponents.ANCIENT_WELL_ROAST_GOOSE_SATURATION, FoodComponents.ANCIENT_WELL_ROAST_GOOSE_IS_WOLF_FOOD) {};
        ANCIENT_WELL_ROAST_GOOSE.setRegistryName("cn-gd-gjse");
        ANCIENT_WELL_ROAST_GOOSE.setTranslationKey("cn-gd-gjse");
        ANCIENT_WELL_ROAST_GOOSE.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(ANCIENT_WELL_ROAST_GOOSE);

        LONGJIANG_PIG_TROTTER_RICE = new ItemFood(FoodComponents.LONGJIANG_PIG_TROTTER_RICE_HUNGER, FoodComponents.LONGJIANG_PIG_TROTTER_RICE_SATURATION, FoodComponents.LONGJIANG_PIG_TROTTER_RICE_IS_WOLF_FOOD) {};
        LONGJIANG_PIG_TROTTER_RICE.setRegistryName("cn-gd-ljzjf");
        LONGJIANG_PIG_TROTTER_RICE.setTranslationKey("cn-gd-ljzjf");
        LONGJIANG_PIG_TROTTER_RICE.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(LONGJIANG_PIG_TROTTER_RICE);

        GRINDING_TEA = new ItemFood(FoodComponents.GRINDING_TEA_HUNGER, FoodComponents.GRINDING_TEA_SATURATION, FoodComponents.GRINDING_TEA_IS_WOLF_FOOD) {};
        GRINDING_TEA.setRegistryName("cn-gd-lc");
        GRINDING_TEA.setTranslationKey("cn-gd-lc");
        GRINDING_TEA.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(GRINDING_TEA);

        RICE_NOODLE_ROLL_WITH_BEAN_SPROUTS_AND_CHOW_FUN = new ItemFood(FoodComponents.RICE_NOODLE_ROLL_WITH_BEAN_SPROUTS_AND_CHOW_FUN_HUNGER, FoodComponents.RICE_NOODLE_ROLL_WITH_BEAN_SPROUTS_AND_CHOW_FUN_SATURATION, FoodComponents.RICE_NOODLE_ROLL_WITH_BEAN_SPROUTS_AND_CHOW_FUN_IS_WOLF_FOOD) {};
        RICE_NOODLE_ROLL_WITH_BEAN_SPROUTS_AND_CHOW_FUN.setRegistryName("cn-gd-zcl");
        RICE_NOODLE_ROLL_WITH_BEAN_SPROUTS_AND_CHOW_FUN.setTranslationKey("cn-gd-zcl");
        RICE_NOODLE_ROLL_WITH_BEAN_SPROUTS_AND_CHOW_FUN.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(RICE_NOODLE_ROLL_WITH_BEAN_SPROUTS_AND_CHOW_FUN);

        BRAISED_DUCK_WITH_PICKLED_BAMBOO_SHOOTS = new ItemFood(FoodComponents.BRAISED_DUCK_WITH_PICKLED_BAMBOO_SHOOTS_HUNGER, FoodComponents.BRAISED_DUCK_WITH_PICKLED_BAMBOO_SHOOTS_SATURATION, FoodComponents.BRAISED_DUCK_WITH_PICKLED_BAMBOO_SHOOTS_IS_WOLF_FOOD) {};
        BRAISED_DUCK_WITH_PICKLED_BAMBOO_SHOOTS.setRegistryName("cn-gd-ssmy");
        BRAISED_DUCK_WITH_PICKLED_BAMBOO_SHOOTS.setTranslationKey("cn-gd-ssmy");
        BRAISED_DUCK_WITH_PICKLED_BAMBOO_SHOOTS.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(BRAISED_DUCK_WITH_PICKLED_BAMBOO_SHOOTS);

        QINGYUAN_CHICKEN = new ItemFood(FoodComponents.QINGYUAN_CHICKEN_HUNGER, FoodComponents.QINGYUAN_CHICKEN_SATURATION, FoodComponents.QINGYUAN_CHICKEN_IS_WOLF_FOOD) {};
        QINGYUAN_CHICKEN.setRegistryName("cn-gd-qyj");
        QINGYUAN_CHICKEN.setTranslationKey("cn-gd-qyj");
        QINGYUAN_CHICKEN.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(QINGYUAN_CHICKEN);

        PICKLED_NOODLES = new ItemFood(FoodComponents.PICKLED_NOODLES_HUNGER, FoodComponents.PICKLED_NOODLES_SATURATION, FoodComponents.PICKLED_NOODLES_IS_WOLF_FOOD) {};
        PICKLED_NOODLES.setRegistryName("cn-gd-ym");
        PICKLED_NOODLES.setTranslationKey("cn-gd-ym");
        PICKLED_NOODLES.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(PICKLED_NOODLES);

        RICE_NOODLES = new ItemFood(FoodComponents.RICE_NOODLES_HUNGER, FoodComponents.RICE_NOODLES_SATURATION, FoodComponents.RICE_NOODLES_IS_WOLF_FOOD) {};
        RICE_NOODLES.setRegistryName("cn-gd-mf");
        RICE_NOODLES.setTranslationKey("cn-gd-mf");
        RICE_NOODLES.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(RICE_NOODLES);

        WINNOWING_PAN_COOKING = new ItemFood(FoodComponents.WINNOWING_PAN_COOKING_HUNGER, FoodComponents.WINNOWING_PAN_COOKING_SATURATION, FoodComponents.WINNOWING_PAN_COOKING_IS_WOLF_FOOD) {};
        WINNOWING_PAN_COOKING.setRegistryName("cn-gd-bjc");
        WINNOWING_PAN_COOKING.setTranslationKey("cn-gd-bjc");
        WINNOWING_PAN_COOKING.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(WINNOWING_PAN_COOKING);

        RED_RICE_SAUSAGE = new ItemFood(FoodComponents.RED_RICE_SAUSAGE_HUNGER, FoodComponents.RED_RICE_SAUSAGE_SATURATION, FoodComponents.RED_RICE_SAUSAGE_IS_WOLF_FOOD) {};
        RED_RICE_SAUSAGE.setRegistryName("cn-gd-hmc");
        RED_RICE_SAUSAGE.setTranslationKey("cn-gd-hmc");
        RED_RICE_SAUSAGE.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(RED_RICE_SAUSAGE);

        SATAY_RICE_TEA = new ItemFood(FoodComponents.SATAY_RICE_TEA_HUNGER, FoodComponents.SATAY_RICE_TEA_SATURATION, FoodComponents.SATAY_RICE_TEA_IS_WOLF_FOOD) {};
        SATAY_RICE_TEA.setRegistryName("cn-gd-scg");
        SATAY_RICE_TEA.setTranslationKey("cn-gd-scg");
        SATAY_RICE_TEA.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(SATAY_RICE_TEA);

        WRAPPED_STEAMED_ZONGZI = new ItemFood(FoodComponents.WRAPPED_STEAMED_ZONGZI_HUNGER, FoodComponents.WRAPPED_STEAMED_ZONGZI_SATURATION, FoodComponents.WRAPPED_STEAMED_ZONGZI_IS_WOLF_FOOD) {};
        WRAPPED_STEAMED_ZONGZI.setRegistryName("cn-gd-gzz");
        WRAPPED_STEAMED_ZONGZI.setTranslationKey("cn-gd-gzz");
        WRAPPED_STEAMED_ZONGZI.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(WRAPPED_STEAMED_ZONGZI);

        CHAR_SIU = new ItemFood(FoodComponents.CHAR_SIU_HUNGER, FoodComponents.CHAR_SIU_SATURATION, FoodComponents.CHAR_SIU_IS_WOLF_FOOD) {};
        CHAR_SIU.setRegistryName("cn-gd-cs");
        CHAR_SIU.setTranslationKey("cn-gd-cs");
        CHAR_SIU.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(CHAR_SIU);

        CHAR_SIU_BUNS = new ItemFood(FoodComponents.CHAR_SIU_BUNS_HUNGER, FoodComponents.CHAR_SIU_BUNS_SATURATION, FoodComponents.CHAR_SIU_BUNS_IS_WOLF_FOOD) {};
        CHAR_SIU_BUNS.setRegistryName("cn-gd-csb");
        CHAR_SIU_BUNS.setTranslationKey("cn-gd-csb");
        CHAR_SIU_BUNS.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(CHAR_SIU_BUNS);

        CRISPY_PORK_BELLY = new ItemFood(FoodComponents.CRISPY_PORK_BELLY_HUNGER, FoodComponents.CRISPY_PORK_BELLY_SATURATION, FoodComponents.CRISPY_PORK_BELLY_IS_WOLF_FOOD) {};
        CRISPY_PORK_BELLY.setRegistryName("cn-gd-cpwhr");
        CRISPY_PORK_BELLY.setTranslationKey("cn-gd-cpwhr");
        CRISPY_PORK_BELLY.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(CRISPY_PORK_BELLY);

        DRY_PARBOILING = new ItemFood(FoodComponents.DRY_PARBOILING_HUNGER, FoodComponents.DRY_PARBOILING_SATURATION, FoodComponents.DRY_PARBOILING_IS_WOLF_FOOD) {};
        DRY_PARBOILING.setRegistryName("cn-gd-gz");
        DRY_PARBOILING.setTranslationKey("cn-gd-gz");
        DRY_PARBOILING.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(DRY_PARBOILING);

        BEAN_FLOUR_CAKE = new ItemFood(FoodComponents.BEAN_FLOUR_CAKE_HUNGER, FoodComponents.BEAN_FLOUR_CAKE_SATURATION, FoodComponents.BEAN_FLOUR_CAKE_IS_WOLF_FOOD) {};
        BEAN_FLOUR_CAKE.setRegistryName("cn-bj-ldg");
        BEAN_FLOUR_CAKE.setTranslationKey("cn-bj-ldg");
        BEAN_FLOUR_CAKE.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(BEAN_FLOUR_CAKE);

        BEIJING_ROAST_DUCK = new ItemFood(FoodComponents.BEIJING_ROAST_DUCK_HUNGER, FoodComponents.BEIJING_ROAST_DUCK_SATURATION, FoodComponents.BEIJING_ROAST_DUCK_IS_WOLF_FOOD) {};
        BEIJING_ROAST_DUCK.setRegistryName("cn-bj-bjky");
        BEIJING_ROAST_DUCK.setTranslationKey("cn-bj-bjky");
        BEIJING_ROAST_DUCK.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(BEIJING_ROAST_DUCK);

        CREAM_FRIED_CAKE = new ItemFood(FoodComponents.CREAM_FRIED_CAKE_HUNGER, FoodComponents.CREAM_FRIED_CAKE_SATURATION, FoodComponents.CREAM_FRIED_CAKE_IS_WOLF_FOOD) {};
        CREAM_FRIED_CAKE.setRegistryName("cn-bj-nyzg");
        CREAM_FRIED_CAKE.setTranslationKey("cn-bj-nyzg");
        CREAM_FRIED_CAKE.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(CREAM_FRIED_CAKE);

        TWISTED_DOUGH = new ItemFood(FoodComponents.TWISTED_DOUGH_HUNGER, FoodComponents.TWISTED_DOUGH_SATURATION, FoodComponents.TWISTED_DOUGH_IS_WOLF_FOOD) {};
        TWISTED_DOUGH.setRegistryName("cn-bj-mmh");
        TWISTED_DOUGH.setTranslationKey("cn-bj-mmh");
        TWISTED_DOUGH.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(TWISTED_DOUGH);

        STIR_FRIED_LIVER = new ItemFood(FoodComponents.STIR_FRIED_LIVER_HUNGER, FoodComponents.STIR_FRIED_LIVER_SATURATION, FoodComponents.STIR_FRIED_LIVER_IS_WOLF_FOOD) {};
        STIR_FRIED_LIVER.setRegistryName("cn-bj-cg");
        STIR_FRIED_LIVER.setTranslationKey("cn-bj-cg");
        STIR_FRIED_LIVER.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(STIR_FRIED_LIVER);

        COOKED_TRIPE_OF_SHEEP_OR_SWINE = new ItemFood(FoodComponents.COOKED_TRIPE_OF_SHEEP_OR_SWINE_HUNGER, FoodComponents.COOKED_TRIPE_OF_SHEEP_OR_SWINE_SATURATION, FoodComponents.COOKED_TRIPE_OF_SHEEP_OR_SWINE_IS_WOLF_FOOD) {};
        COOKED_TRIPE_OF_SHEEP_OR_SWINE.setRegistryName("cn-bj-bd");
        COOKED_TRIPE_OF_SHEEP_OR_SWINE.setTranslationKey("cn-bj-bd");
        COOKED_TRIPE_OF_SHEEP_OR_SWINE.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(COOKED_TRIPE_OF_SHEEP_OR_SWINE);

        BEIJING_BEAN_JUICE = new ItemFood(FoodComponents.BEIJING_BEAN_JUICE_HUNGER, FoodComponents.BEIJING_BEAN_JUICE_SATURATION, FoodComponents.BEIJING_BEAN_JUICE_IS_WOLF_FOOD) {};
        BEIJING_BEAN_JUICE.setRegistryName("cn-bj-bjdz");
        BEIJING_BEAN_JUICE.setTranslationKey("cn-bj-bjdz");
        BEIJING_BEAN_JUICE.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(BEIJING_BEAN_JUICE);

        COKE_RING = new ItemFood(FoodComponents.COKE_RING_HUNGER, FoodComponents.COKE_RING_SATURATION, FoodComponents.COKE_RING_IS_WOLF_FOOD) {};
        COKE_RING.setRegistryName("cn-bj-jq");
        COKE_RING.setTranslationKey("cn-bj-jq");
        COKE_RING.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(COKE_RING);

        NOODLES_WITH_SOYBEAN_PASTE = new ItemFood(FoodComponents.NOODLES_WITH_SOYBEAN_PASTE_HUNGER, FoodComponents.NOODLES_WITH_SOYBEAN_PASTE_SATURATION, FoodComponents.NOODLES_WITH_SOYBEAN_PASTE_IS_WOLF_FOOD) {};
        NOODLES_WITH_SOYBEAN_PASTE.setRegistryName("cn-bj-lbjzjm");
        NOODLES_WITH_SOYBEAN_PASTE.setTranslationKey("cn-bj-lbjzjm");
        NOODLES_WITH_SOYBEAN_PASTE.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(NOODLES_WITH_SOYBEAN_PASTE);

        SHREDDED_PORK_IN_BEAN_SAUCE = new ItemFood(FoodComponents.SHREDDED_PORK_IN_BEAN_SAUCE_HUNGER, FoodComponents.SHREDDED_PORK_IN_BEAN_SAUCE_SATURATION, FoodComponents.SHREDDED_PORK_IN_BEAN_SAUCE_IS_WOLF_FOOD) {};
        SHREDDED_PORK_IN_BEAN_SAUCE.setRegistryName("cn-bj-jjrs");
        SHREDDED_PORK_IN_BEAN_SAUCE.setTranslationKey("cn-bj-jjrs");
        SHREDDED_PORK_IN_BEAN_SAUCE.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(SHREDDED_PORK_IN_BEAN_SAUCE);

        LAMB_SCORPION_HOT_POT = new ItemFood(FoodComponents.LAMB_SCORPION_HOT_POT_HUNGER, FoodComponents.LAMB_SCORPION_HOT_POT_SATURATION, FoodComponents.LAMB_SCORPION_HOT_POT_IS_WOLF_FOOD) {};
        LAMB_SCORPION_HOT_POT.setRegistryName("cn-bj-yxzhg");
        LAMB_SCORPION_HOT_POT.setTranslationKey("cn-bj-yxzhg");
        LAMB_SCORPION_HOT_POT.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(LAMB_SCORPION_HOT_POT);

        FRIED_SAUSAGE = new ItemFood(FoodComponents.FRIED_SAUSAGE_HUNGER, FoodComponents.FRIED_SAUSAGE_SATURATION, FoodComponents.FRIED_SAUSAGE_IS_WOLF_FOOD) {};
        FRIED_SAUSAGE.setRegistryName("cn-bj-zgc");
        FRIED_SAUSAGE.setTranslationKey("cn-bj-zgc");
        FRIED_SAUSAGE.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(FRIED_SAUSAGE);

        BRAISED_FIRE = new ItemFood(FoodComponents.BRAISED_FIRE_HUNGER, FoodComponents.BRAISED_FIRE_SATURATION, FoodComponents.BRAISED_FIRE_IS_WOLF_FOOD) {};
        BRAISED_FIRE.setRegistryName("cn-bj-lzhs");
        BRAISED_FIRE.setTranslationKey("cn-bj-lzhs");
        BRAISED_FIRE.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(BRAISED_FIRE);

        GRILLED_MEAT = new ItemFood(FoodComponents.GRILLED_MEAT_HUNGER, FoodComponents.GRILLED_MEAT_SATURATION, FoodComponents.GRILLED_MEAT_IS_WOLF_FOOD) {};
        GRILLED_MEAT.setRegistryName("cn-bj-zzkr");
        GRILLED_MEAT.setTranslationKey("cn-bj-zzkr");
        GRILLED_MEAT.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(GRILLED_MEAT);

        SEASONED_MILLET_MUSH = new ItemFood(FoodComponents.SEASONED_MILLET_MUSH_HUNGER, FoodComponents.SEASONED_MILLET_MUSH_SATURATION, FoodComponents.SEASONED_MILLET_MUSH_IS_WOLF_FOOD) {};
        SEASONED_MILLET_MUSH.setRegistryName("cn-bj-mc");
        SEASONED_MILLET_MUSH.setTranslationKey("cn-bj-mc");
        SEASONED_MILLET_MUSH.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(SEASONED_MILLET_MUSH);

        CHINESE_STYLE_BAKED_ROLL = new ItemFood(FoodComponents.CHINESE_STYLE_BAKED_ROLL_HUNGER, FoodComponents.CHINESE_STYLE_BAKED_ROLL_SATURATION, FoodComponents.CHINESE_STYLE_BAKED_ROLL_IS_WOLF_FOOD) {};
        CHINESE_STYLE_BAKED_ROLL.setRegistryName("cn-bj-sb");
        CHINESE_STYLE_BAKED_ROLL.setTranslationKey("cn-bj-sb");
        CHINESE_STYLE_BAKED_ROLL.setCreativeTab(ModCreativeTab.ABF_TAB);
        event.getRegistry().register(CHINESE_STYLE_BAKED_ROLL);
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        registerModel(APPLE_PIE);
        registerModel(GOLDEN_APPLE_PIE);
        registerModel(ENCHANTMENT_GOLDEN_APPLE_PIE);
        registerModel(CREAM_MUSHROOM_SOUP);
        registerModel(CREAM);
        registerModel(COD_SOUP);
        registerModel(SALMON_SOUP);
        registerModel(VEGETABLE_SALAD);
        registerModel(CEREAL);
        registerModel(GOLDEN_CEREAL);
        registerModel(ENCHANTMENT_GOLDEN_CEREAL);
        registerModel(POTATO_CEREAL);
        registerModel(CARROT_CEREAL);
        registerModel(APPLE_CEREAL);
        registerModel(WATERMELON_CEREAL);
        registerModel(BEETROOT_CEREAL);
        registerModel(CHORUS_FRUIT_CEREAL);
        registerModel(MAGIC_POTION);
        registerModel(WHITE_CUT_CHICKEN);
        registerModel(STEAMED_VERMICELLI_ROLL);
        registerModel(STEAMED_BUN_WITH_STUFFING);
        registerModel(CHICKEN_CLAW);
        registerModel(SHRIMP_DUMPLING);
        registerModel(ROASTED_PIGEON);
        registerModel(ROASTED_GOOSE);
        registerModel(ROAST_GOOSE_RICE_NOODLES);
        registerModel(MILK_CUSTARD);
        registerModel(CRISPY_GRASS_CARP);
        registerModel(OYSTER);
        registerModel(MEIGAN_CAI_COOKED_WITH_PORK);
        registerModel(ANCIENT_WELL_ROAST_GOOSE);
        registerModel(LONGJIANG_PIG_TROTTER_RICE);
        registerModel(GRINDING_TEA);
        registerModel(RICE_NOODLE_ROLL_WITH_BEAN_SPROUTS_AND_CHOW_FUN);
        registerModel(BRAISED_DUCK_WITH_PICKLED_BAMBOO_SHOOTS);
        registerModel(QINGYUAN_CHICKEN);
        registerModel(PICKLED_NOODLES);
        registerModel(RICE_NOODLES);
        registerModel(WINNOWING_PAN_COOKING);
        registerModel(RED_RICE_SAUSAGE);
        registerModel(SATAY_RICE_TEA);
        registerModel(WRAPPED_STEAMED_ZONGZI);
        registerModel(CHAR_SIU);
        registerModel(CHAR_SIU_BUNS);
        registerModel(CRISPY_PORK_BELLY);
        registerModel(DRY_PARBOILING);
        registerModel(BEAN_FLOUR_CAKE);
        registerModel(BEIJING_ROAST_DUCK);
        registerModel(CREAM_FRIED_CAKE);
        registerModel(TWISTED_DOUGH);
        registerModel(STIR_FRIED_LIVER);
        registerModel(COOKED_TRIPE_OF_SHEEP_OR_SWINE);
        registerModel(BEIJING_BEAN_JUICE);
        registerModel(COKE_RING);
        registerModel(NOODLES_WITH_SOYBEAN_PASTE);
        registerModel(SHREDDED_PORK_IN_BEAN_SAUCE);
        registerModel(LAMB_SCORPION_HOT_POT);
        registerModel(FRIED_SAUSAGE);
        registerModel(BRAISED_FIRE);
        registerModel(GRILLED_MEAT);
        registerModel(SEASONED_MILLET_MUSH);
        registerModel(CHINESE_STYLE_BAKED_ROLL);
    }

    private static void registerModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0,
                new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}