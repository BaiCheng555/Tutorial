package com.nbdbc.block;

import com.nbdbc.Tutorial;
import net.fabricmc.fabric.api.block.v1.FabricBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;

public class ModBlocks {
    public static final Block POMEGRANATE_ORE = register("pomegranate_ore", new ExperienceDroppingBlock(UniformIntProvider.create(3,7),AbstractBlock.Settings.create().requiresTool().strength(4.0f, 4.0f)));
    public static final Block POMEGRANATE_BLOCK = register("pomegranate_block", new Block(AbstractBlock.Settings.create().requiresTool().strength(4.0f, 4.0f)));

    public static void registerBlockItems(String id, Block block) {
        Item item = Registry.register(Registries.ITEM, Identifier.of(Tutorial.MOD_ID, id), new BlockItem(block, new Item.Settings()));
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
    }

    public static Block register(String id, Block block) {
        registerBlockItems(id, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Tutorial.MOD_ID, id), block);
    }

    public static void registerModBlocks() {
        Tutorial.LOGGER.info("Registering Blocks!");
    }
}
