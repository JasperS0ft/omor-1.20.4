package net.sigmas.omor;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;
import net.sigmas.omor.entity.ModEntities;

public class OmorClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.KEL_BAL_PROJECTILE, FlyingItemEntityRenderer::new);
    }
}
