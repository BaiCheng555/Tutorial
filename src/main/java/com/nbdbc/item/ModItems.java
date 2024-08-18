package com.nbdbc.item;

import com.nbdbc.Tutorial;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItems {

    public static final Item CUSTOM_ITEM = registerItem("custom_item",new Item(new Item.Settings()));
    public static final Item Pomegranate_Gemstone = registerItem("pomegranate_gemstone",new Item(new Item.Settings()));
    public static final Item Pomegranate_PICKAXE= registerItem("pomegranate_pickaxe",new Item(new Item.Settings()));


    private static Item registerItem(String id,Item item){
        return Registry.register(Registries.ITEM,Identifier.of(Tutorial.MOD_ID,id),item);
    }

    public static void registerModItem(){
        Tutorial.LOGGER.info("Registering Item");
    }
}
