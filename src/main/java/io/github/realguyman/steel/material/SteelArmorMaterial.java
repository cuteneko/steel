package io.github.realguyman.steel.material;

import io.github.realguyman.steel.Configuration;
import io.github.realguyman.steel.registry.ItemRegistry;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class SteelArmorMaterial implements ArmorMaterial {
    private static final int[] DURABILITY = {13, 15, 16, 11};
    private static final int[] PROTECTION = {
            Configuration.helmetArmorRating,
            Configuration.leggingsArmorRating,
            Configuration.chestplateArmorRating,
            Configuration.bootsArmorRating
    };

    public static final SteelArmorMaterial INSTANCE = new SteelArmorMaterial();


    @Override
    public int getDurability(ArmorItem.Type type) {
        switch (type) {
            case HELMET:
                return PROTECTION[0];
            case CHESTPLATE:
                return PROTECTION[1];
            case LEGGINGS:
                return PROTECTION[2];
            case BOOTS:
                return PROTECTION[3];
        }
        return 0;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        switch (type) {
            case HELMET:
                return DURABILITY[0];
            case CHESTPLATE:
                return DURABILITY[1];
            case LEGGINGS:
                return DURABILITY[2];
            case BOOTS:
                return DURABILITY[3];
        }
        return 0;
    }

    @Override
    public int getEnchantability() {
        return Configuration.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_IRON;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ItemRegistry.STEEL_INGOT);
    }

    @Override
    public String getName() {
        return "steel";
    }

    @Override
    public float getToughness() {
        return Configuration.armorToughness;
    }

    @Override
    public float getKnockbackResistance() {
        return Configuration.armorKnockbackResistance;
    }
}