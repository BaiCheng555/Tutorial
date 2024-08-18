package com.nbdbc.datagen;

import com.nbdbc.block.ModBlocks;
import com.nbdbc.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelsProvider extends FabricModelProvider {

    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POMEGRANATE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POMEGRANATE_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.Pomegranate_Gemstone, Models.GENERATED);
        itemModelGenerator.register(ModItems.Pomegranate_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CUSTOM_ITEM, Models.GENERATED);
    }
}
