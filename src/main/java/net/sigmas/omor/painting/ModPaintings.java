package net.sigmas.omor.painting;

import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sigmas.omor.Omor;


public class ModPaintings {
    public static final PaintingVariant SILLYKELCAR = registerPainting("sillykelcar", new PaintingVariant(64, 64));


    private static PaintingVariant registerPainting(String name, PaintingVariant paintingVariant) {
        return Registry.register(Registries.PAINTING_VARIANT, new Identifier(Omor.MOD_ID, name), paintingVariant);
    }

    public static void registerPaintings() {
        Omor.LOGGER.info("Registering Paintings for " + Omor.MOD_ID);
    }

}
