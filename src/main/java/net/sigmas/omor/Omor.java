package net.sigmas.omor;

import net.fabricmc.api.ModInitializer;

import net.sigmas.omor.item.ModItems;
import net.sigmas.omor.item.ModItemsGroups;
import net.sigmas.omor.painting.ModPaintings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Omor implements ModInitializer {
	public static final String MOD_ID = "omor";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemsGroups.registerItemGroups();
		ModItems.registerModItems();
		ModPaintings.registerPaintings();

		LOGGER.info("Started omor mod!");
	}
}