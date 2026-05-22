package com.xiaomian124.abf.item;

import com.xiaomian124.abf.ABetterFoods;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingEntityUseItemEvent;

import java.util.Map;

@EventBusSubscriber(modid = ABetterFoods.MODID)
public class ModFoodEvents {
    private static final Map<String, MobEffectInstance[]> EFFECTS_MAP = Map.ofEntries(
            Map.entry("golden_apple_pie", new MobEffectInstance[]{
                    new MobEffectInstance(MobEffects.ABSORPTION, 1200, 2),
                    new MobEffectInstance(MobEffects.SPEED, 3000, 1),
                    new MobEffectInstance(MobEffects.REGENERATION, 2000, 2)
            }),
            Map.entry("enchantment_golden_apple_pie", new MobEffectInstance[]{
                    new MobEffectInstance(MobEffects.SPEED, 4000, 1),
                    new MobEffectInstance(MobEffects.ABSORPTION, 2000, 3),
                    new MobEffectInstance(MobEffects.REGENERATION, 2000, 1),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000, 0),
                    new MobEffectInstance(MobEffects.RESISTANCE, 6000, 0)
            }),
            Map.entry("magic_potion", new MobEffectInstance[]{
                    new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 400, 1),
                    new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 400, 1),
                    new MobEffectInstance(MobEffects.CONDUIT_POWER, 400, 1),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 400, 1),
                    new MobEffectInstance(MobEffects.SLOW_FALLING, 400, 1),
                    new MobEffectInstance(MobEffects.HASTE, 400, 1),
                    new MobEffectInstance(MobEffects.RESISTANCE, 400, 1),
                    new MobEffectInstance(MobEffects.STRENGTH, 400, 1),
                    new MobEffectInstance(MobEffects.ABSORPTION, 400, 1),
                    new MobEffectInstance(MobEffects.REGENERATION, 400, 1),
                    new MobEffectInstance(MobEffects.WATER_BREATHING, 400, 1),
                    new MobEffectInstance(MobEffects.SPEED, 400, 1),
                    new MobEffectInstance(MobEffects.JUMP_BOOST, 400, 1),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 1),
                    new MobEffectInstance(MobEffects.INVISIBILITY, 400, 1),
                    new MobEffectInstance(MobEffects.BAD_OMEN, 400, 1),
                    new MobEffectInstance(MobEffects.GLOWING, 400, 1),
                    new MobEffectInstance(MobEffects.DARKNESS, 400, 1),
                    new MobEffectInstance(MobEffects.WITHER, 400, 1),
                    new MobEffectInstance(MobEffects.NAUSEA, 400, 1),
                    new MobEffectInstance(MobEffects.SLOWNESS, 400, 1),
                    new MobEffectInstance(MobEffects.HUNGER, 400, 1),
                    new MobEffectInstance(MobEffects.LEVITATION, 400, 1),
                    new MobEffectInstance(MobEffects.BLINDNESS, 400, 1),
                    new MobEffectInstance(MobEffects.MINING_FATIGUE, 400, 1),
                    new MobEffectInstance(MobEffects.WEAKNESS, 400, 1),
                    new MobEffectInstance(MobEffects.BREATH_OF_THE_NAUTILUS, 400, 1),
                    new MobEffectInstance(MobEffects.INFESTED, 400, 1),
                    new MobEffectInstance(MobEffects.OOZING, 400, 1),
                    new MobEffectInstance(MobEffects.WEAVING, 400, 1),
                    new MobEffectInstance(MobEffects.WIND_CHARGED, 400, 1),
                    new MobEffectInstance(MobEffects.RAID_OMEN, 400, 1),
                    new MobEffectInstance(MobEffects.TRIAL_OMEN, 400, 1),
                    new MobEffectInstance(MobEffects.POISON, 400, 1)
            }),
            Map.entry("cream_mushroom_soup", new MobEffectInstance[]{
                    new MobEffectInstance(MobEffects.SPEED, 600, 1)
            }),
            Map.entry("golden_cereal", new MobEffectInstance[]{
                    new MobEffectInstance(MobEffects.ABSORPTION, 1300, 2),
                    new MobEffectInstance(MobEffects.SPEED, 3000, 1),
                    new MobEffectInstance(MobEffects.HASTE, 2000, 1),
                    new MobEffectInstance(MobEffects.REGENERATION, 2100, 2)
            }),
            Map.entry("enchantment_golden_cereal", new MobEffectInstance[]{
                    new MobEffectInstance(MobEffects.SPEED, 4000, 2),
                    new MobEffectInstance(MobEffects.HASTE, 4000, 2),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 1000, 1),
                    new MobEffectInstance(MobEffects.ABSORPTION, 2200, 3),
                    new MobEffectInstance(MobEffects.REGENERATION, 2500, 1),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6100, 0),
                    new MobEffectInstance(MobEffects.RESISTANCE, 6100, 0)
            })
    );

    @SubscribeEvent
    public static void onFoodEaten(LivingEntityUseItemEvent.Finish event) {
        ItemStack stack = event.getItem();
        String regName = stack.getItem().getDescriptionId();
        String key = regName.substring(regName.lastIndexOf('.') + 1);
        MobEffectInstance[] effects = EFFECTS_MAP.get(key);
        if (effects != null) {
            LivingEntity entity = event.getEntity();
            for (MobEffectInstance effect : effects) {
                entity.addEffect(new MobEffectInstance(effect.getEffect(), effect.getDuration(), effect.getAmplifier()));
            }
        }
    }
}