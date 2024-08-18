package com.nbdbc.item;

import net.minecraft.component.type.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent Custom_Food = new FoodComponent.Builder().nutrition(4).saturationModifier(0.3F).alwaysEdible().build();
}
