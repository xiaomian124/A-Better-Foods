package com.xiaomian124.abf;

import net.fabricmc.api.ModInitializer;
import com.xiaomian124.abf.item.ModItemGroups;
import com.xiaomian124.abf.item.ModItem;

public class ABetterFoods implements ModInitializer {
	public static final String MOD_ID = "a-better-foods";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItem.registerFoods(); // 注册所有自定义物品
		ModItemGroups.registerItemGroups();

		System.out.println("[" + MOD_ID + "] Food items registered!");
	}
}

