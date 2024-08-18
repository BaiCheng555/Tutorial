package com.nbdbc.datagen;

import com.nbdbc.block.ModBlocks;
import com.nbdbc.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipesProvider extends FabricRecipeProvider {

    private static final List<ItemConvertible> A = List.of(ModItems.CUSTOM_ITEM);

    public ModRecipesProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.MISC, ModItems.Pomegranate_Gemstone,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.POMEGRANATE_BLOCK);
        offerSmelting(recipeExporter,A,RecipeCategory.MISC,ModItems.Pomegranate_Gemstone,
                0.7f,200,"pomegranate_gemstone");
    }
}
