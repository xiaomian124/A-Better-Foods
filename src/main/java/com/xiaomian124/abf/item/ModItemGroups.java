package com.xiaomian124.abf.item;

import com.xiaomian124.abf.YourMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    // 定义物品组注册键
    public static final RegistryKey<ItemGroup> FOOD_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP,
            new Identifier(YourMod.MOD_ID, "food"));

    // 注册所有物品组
    public static void registerItemGroups() {
        // 主物品组

        // 食物物品组
        Registry.register(Registries.ITEM_GROUP, FOOD_GROUP,
                FabricItemGroup.builder()
                        .icon(() -> new ItemStack(ModItem.apple_pie))
                        .displayName(Text.translatable("itemGroup." + YourMod.MOD_ID + ".food"))
                        .entries((context, entries) -> {
                            entries.add(ModItem.apple_pie);
                            entries.add(ModItem.gold_apple_pie);
                            entries.add(ModItem.enchantment_apple_pie);
                        })
                        .build());
    }
}

