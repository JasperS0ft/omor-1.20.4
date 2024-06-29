package net.sigmas.omor.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sigmas.omor.Omor;
import net.sigmas.omor.entity.custom.KelBallProjectileEntity;

public class ModEntities {
    public static final EntityType<KelBallProjectileEntity> KEL_BAL_PROJECTILE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(Omor.MOD_ID, "kel_bal_projectile"), FabricEntityTypeBuilder.<KelBallProjectileEntity>create(SpawnGroup.MISC, KelBallProjectileEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
}
