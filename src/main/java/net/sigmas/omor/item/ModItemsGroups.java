package net.sigmas.omor.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.sigmas.omor.Omor;

public class ModItemsGroups {
public static final ItemGroup OMOR_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(Omor.MOD_ID, "omor"),
        FabricItemGroup.builder().displayName(Text.translatable("itemgroup.omor"))
                .icon(() -> new ItemStack(ModItems.OMORIKNIFE)).entries((displayContext, entries) -> {
                    entries.add(ModItems.OMORIKNIFE);
                    entries.add(ModItems.AUBREYBAT);
                    entries.add(ModItems.HECTOR);
                }).build());


    public static void registerItemGroups() {
        Omor.LOGGER.info("Registering Item Groups for " + Omor.MOD_ID);
    }
}
