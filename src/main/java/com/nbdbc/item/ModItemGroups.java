package com.nbdbc.item;

import com.nbdbc.Tutorial;

import com.nbdbc.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    @SuppressWarnings("unused")
    public static final ItemGroup CUSTOM_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(Tutorial.MOD_ID, "custom_group"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.tutorial.custom_group"))
                    .icon(() -> new ItemStack(ModItems.Pomegranate_Gemstone))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CUSTOM_ITEM);
                        entries.add(ModItems.Pomegranate_Gemstone);
                        entries.add(ModItems.Pomegranate_PICKAXE);
                        entries.add(ModItems.Custom_Food);

                        entries.add(ModBlocks.POMEGRANATE_ORE);
                        entries.add(ModBlocks.POMEGRANATE_BLOCK);
                    }).build());

    public static void registerModItemGroups() {
        Tutorial.LOGGER.info("Registering Item Groups！");
    }
}
