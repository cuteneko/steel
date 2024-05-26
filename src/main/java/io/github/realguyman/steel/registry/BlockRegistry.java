package io.github.realguyman.steel.registry;

import io.github.realguyman.steel.Steel;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
public class BlockRegistry {
    public static final Block STEEL_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK));

    public static void register() {
        Registry.register(Registries.BLOCK, new Identifier(Steel.MOD_ID, "steel_block"), STEEL_BLOCK);
    }
}