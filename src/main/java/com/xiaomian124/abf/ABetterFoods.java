package com.xiaomian124.abf;

import com.xiaomian124.abf.item.ModItem;
import com.xiaomian124.abf.item.ModItemGroups;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ABetterFoods implements ModInitializer {
	// ID 中只能出现 [a-z],[0-9],[_]
	public static final String MOD_ID = "abetterfoods";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItem.registerFoods(); // 注册所有自定义物品
		ModItemGroups.registerItemGroups();

		LOGGER.info("Food Items Registered!");
	}
}

