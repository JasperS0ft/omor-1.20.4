package net.sigmas.omor.item;

import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.sigmas.omor.Omor;

import java.util.function.Supplier;

public enum HectorArmorMaterial implements ArmorMaterial {
    HECTOR(6969, 6, 26, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.HECTOR), "hector", 2f, 0f);

    private final int itemDurability;
    private final int itemProtection;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final Supplier<Ingredient> repairIngredient;
    private final String name;
    private final Float toughness;
    private final Float knockbackResistance;

    HectorArmorMaterial(int itemDurability, int itemProtection, int enchantability, SoundEvent equipSound, Supplier<Ingredient> repairIngredient, String name, Float toughness, Float knockbackResistance) {
        this.itemDurability = itemDurability;
        this.itemProtection = itemProtection;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.repairIngredient = repairIngredient;
        this.name = name;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
    }

    @Override
    public int getDurability(ArmorItem.Type type) {
        return this.itemDurability;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return this.itemProtection;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return Omor.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
