package com.nbdbc;

import com.nbdbc.block.ModBlocks;
import com.nbdbc.item.ModItemGroups;
import com.nbdbc.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tutorial implements ModInitializer {

	public static final String MOD_ID = "tutorial";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItem();
		ModItemGroups.registerModItemGroups();
		ModBlocks.registerModBlocks();

		//mixin
		FuelRegistry.INSTANCE.add(ModItems.CUSTOM_ITEM, 300);
	}
}