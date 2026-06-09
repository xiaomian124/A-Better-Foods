package com.xiaomian124.abf.init;

import com.xiaomian124.abf.ABetterFoods;
import com.xiaomian124.abf.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ModCreativeTab {
    public static final CreativeTabs ABF_TAB = new CreativeTabs(ABetterFoods.MODID) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.APPLE_PIE);
        }

        @Override
        public boolean hasSearchBar() {
            return false;
        }
    };
}