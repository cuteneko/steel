package io.github.realguyman.steel.registry;

import io.github.realguyman.steel.Configuration;
import io.github.realguyman.steel.Steel;
import io.github.realguyman.steel.material.SteelArmorMaterial;
import io.github.realguyman.steel.material.SteelToolMaterial;
import io.github.realguyman.steel.item.SteelAxeItem;
import io.github.realguyman.steel.item.SteelHoeItem;
import io.github.realguyman.steel.item.SteelPickaxeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemRegistry {
    // CSNeko: All item register to "steel" item,So there is no need to set itemgroup in item settings.
    
    public static final Item STEEL_INGOT = new Item(
        new FabricItemSettings()
    );

    public static final Item STEEL_NUGGET = new Item(
        new FabricItemSettings()
    );

    public static final Item STEEL_BLOCK = new BlockItem(
        BlockRegistry.STEEL_BLOCK,
        new FabricItemSettings()
    );
    public static final Item STEEL_HELMET = new ArmorItem(
        SteelArmorMaterial.INSTANCE,
        ArmorItem.Type.HELMET,
        new FabricItemSettings()
    );

    public static final Item STEEL_CHESTPLATE = new ArmorItem(
        SteelArmorMaterial.INSTANCE,
        ArmorItem.Type.CHESTPLATE,
        new FabricItemSettings()
    );

    public static final Item STEEL_LEGGINGS = new ArmorItem(
        SteelArmorMaterial.INSTANCE,
        ArmorItem.Type.LEGGINGS,
        new FabricItemSettings()
    );

    public static final Item STEEL_BOOTS = new ArmorItem(
        SteelArmorMaterial.INSTANCE,
        ArmorItem.Type.BOOTS,
        new FabricItemSettings()
    );

    public static final Item STEEL_SHOVEL = new ShovelItem(SteelToolMaterial.INSTANCE, 1.5F, -3.0F,
            new FabricItemSettings());

    public static final Item STEEL_PICKAXE = new SteelPickaxeItem(SteelToolMaterial.INSTANCE, 1, -2.8F,
            new FabricItemSettings());

    public static final Item STEEL_AXE = new SteelAxeItem(SteelToolMaterial.INSTANCE, Configuration.axeAttackDamage, -3.1F,
            new FabricItemSettings());

    public static final Item STEEL_HOE = new SteelHoeItem(SteelToolMaterial.INSTANCE, -2, -1.0F,
            new FabricItemSettings());

    public static final Item STEEL_SWORD = new SwordItem(SteelToolMaterial.INSTANCE, Configuration.swordAttackDamage, -2.4F,
            new FabricItemSettings());

    private static void add(String name, Item item) {
        Registry.register(Registries.ITEM, new Identifier(Steel.MOD_ID, name), item);
    }

    public static void register() {
        add("steel_ingot", STEEL_INGOT);
        add("steel_nugget", STEEL_NUGGET);
        add("steel_block", STEEL_BLOCK);
        add("steel_sword", STEEL_SWORD);
        add("steel_helmet", STEEL_HELMET);
        add("steel_chestplate", STEEL_CHESTPLATE);
        add("steel_leggings", STEEL_LEGGINGS);
        add("steel_boots", STEEL_BOOTS);
        add("steel_shovel", STEEL_SHOVEL);
        add("steel_pickaxe", STEEL_PICKAXE);
        add("steel_axe", STEEL_AXE);
        add("steel_hoe", STEEL_HOE);
    }
}