package com.xiaomian124.abf;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ABetterFoods.MODID, name = ABetterFoods.NAME, version = ABetterFoods.VERSION)
public class ABetterFoods {
    public static final String MODID = "a_better_foods";
    public static final String NAME = "A Better Foods";
    public static final String VERSION = "1.3.0";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    }
}