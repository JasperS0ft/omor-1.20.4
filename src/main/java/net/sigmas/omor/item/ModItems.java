package net.sigmas.omor.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EntityType;
import net.minecraft.item.*;
/*import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;*/
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.sigmas.omor.Omor;
import net.sigmas.omor.item.custom.Hector;

public class ModItems {

    public static final Item OMORIKNIFE = registerItem("omori_knife", new SwordItem(ModToolMaterial.omor, 5, -1.5f, new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item AUBREYBAT = registerItem("aubrey_bat", new AxeItem(ModToolMaterial.omor, 7, -3f, new FabricItemSettings().rarity(Rarity.EPIC)));

    public static final Item HECTOR = registerItem("hector",
            new Hector(HectorArmorMaterial.HECTOR, ArmorItem.Type.HELMET, new FabricItemSettings().rarity(Rarity.UNCOMMON)));

    /*private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(OMORIKNIFE);
        entries.add(AUBREYBAT);
    }*/

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Omor.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Omor.LOGGER.info("Registering Mod Items for " + Omor.MOD_ID);

        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
