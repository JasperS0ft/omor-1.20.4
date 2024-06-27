package net.sigmas.omor;

import net.fabricmc.api.ModInitializer;

import net.sigmas.omor.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Omor implements ModInitializer {
	public static final String MOD_ID = "omormod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

		LOGGER.info("Hello Fabric world!");
	}
}