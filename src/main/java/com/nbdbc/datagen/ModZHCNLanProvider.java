package com.nbdbc.datagen;

import com.nbdbc.block.ModBlocks;
import com.nbdbc.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModZHCNLanProvider extends FabricLanguageProvider {

    public ModZHCNLanProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "zh_cn",registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.CUSTOM_ITEM,"自定义物品");
        translationBuilder.add(ModItems.Pomegranate_Gemstone,"紫榴宝石");
        translationBuilder.add(ModItems.Pomegranate_PICKAXE,"紫榴镐");
        translationBuilder.add(ModItems.Custom_Food,"自定义食物");

        translationBuilder.add(ModBlocks.POMEGRANATE_ORE,"紫榴矿");
        translationBuilder.add(ModBlocks.POMEGRANATE_BLOCK,"紫榴块");

        translationBuilder.add("itemGroup.tutorial.custom_group","自定义组");
    }
}
