package com.nbdbc.datagen;

import com.nbdbc.block.ModBlocks;
import com.nbdbc.item.ModItemGroups;
import com.nbdbc.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModENUSLanProvider extends FabricLanguageProvider {

    public ModENUSLanProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us",registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.CUSTOM_ITEM,"custom_item");
        translationBuilder.add(ModItems.Pomegranate_Gemstone,"pomegranate_gemstone");
        translationBuilder.add(ModItems.Pomegranate_PICKAXE,"pomegranate_pickaxe");

        translationBuilder.add(ModBlocks.POMEGRANATE_ORE,"pomegranate_ore");
        translationBuilder.add(ModBlocks.POMEGRANATE_BLOCK,"pomegranate_block");

        translationBuilder.add("itemGroup.tutorial.custom_group","custom_group");
    }
}
