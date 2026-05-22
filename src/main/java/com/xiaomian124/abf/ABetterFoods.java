package com.xiaomian124.abf;

import com.xiaomian124.abf.item.ModCreativeTabs;
import com.xiaomian124.abf.item.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(ABetterFoods.MODID)
public class ABetterFoods {
    public static final String MODID = "a_better_foods";

    public ABetterFoods(IEventBus modEventBus) {
        ModItems.ITEMS.register(modEventBus);
        ModCreativeTabs.CREATIVE_MODE_TABS.register(modEventBus);
    }
}