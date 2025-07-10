package com.xiaomian124.abf.item;

import com.xiaomian124.abf.ABetterFoods;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    // 注册所有物品组
    public static void registerItemGroups() {
        // 食物物品组
        Registry.register(Registries.ITEM_GROUP, new Identifier(ABetterFoods.MOD_ID, "food_group"),
                FabricItemGroup.builder()
                        .icon(() -> new ItemStack(ModItem.APPLE_PIE))
                        .displayName(Text.translatable("itemGroup.abf.food"))
                        // 从记录表取出全部物品并自动注册到创造模式物品组
                        .entries((context, entries) -> ModItem.ITEMS.forEach(entries::add))
                        .build());
    }
}

