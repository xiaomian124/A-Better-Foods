package com.xiaomian124.abf.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    // abc
    public static final Block ABC_BLOCK = new Block(
            FabricBlockSettings.copyOf(Blocks.STONE) // 复制石头方块的设置
                    .strength(1.5f, 6.0f) // 破坏时间和爆炸抗性
                    .sounds(BlockSoundGroup.STONE) // 方块音效
                    .requiresTool() // 需要工具才能破坏
    );

    // 注册方块和方块物品
    public static void registerBlocks() {
        // 注册方块
        Registry.register(Registries.BLOCK,
                new Identifier("a-better-foods", "abc_block"),
                ABC_BLOCK
        );

        // 注册方块物品
        Registry.register(Registries.ITEM,
                new Identifier("a-better-foods", "abc_block"),
                new BlockItem(ABC_BLOCK, new FabricItemSettings())
        );
    }

    public static void initialize() {}
}