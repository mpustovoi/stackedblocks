package com.axperty.stackedblocks.registry;

import com.axperty.stackedblocks.StackedBlocks;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, StackedBlocks.MOD_ID);

    // Stacked Stone Blocks
    public static final RegistryObject<Block> STACKED_STONE_BLOCKS = BLOCKS.register("stacked_stone_blocks",
            () -> new Block(Block.Properties.copy(Blocks.STONE)));

    // Stacked Cobblestone Blocks
    public static final RegistryObject<Block> STACKED_COBBLESTONE_BLOCKS = BLOCKS.register("stacked_cobblestone_blocks",
            () -> new Block(Block.Properties.copy(Blocks.COBBLESTONE)));

    // Stacked Netherrack Blocks
    public static final RegistryObject<Block> STACKED_NETHERRACK_BLOCKS = BLOCKS.register("stacked_netherrack_blocks",
            () -> new Block(Block.Properties.copy(Blocks.NETHERRACK)));

    // Stacked Bricks
    public static final RegistryObject<Block> STACKED_BRICKS = BLOCKS.register("stacked_bricks",
            () -> new Block(Block.Properties.copy(Blocks.BRICKS)));

    // Stacked Melons
    public static final RegistryObject<Block> STACKED_MELONS = BLOCKS.register("stacked_melons",
            () -> new Block(Block.Properties.copy(Blocks.MELON)));

    // Stacked Pumpkins
    public static final RegistryObject<Block> STACKED_PUMPKINS = BLOCKS.register("stacked_pumpkins",
            () -> new Block(Block.Properties.copy(Blocks.PUMPKIN)));

    // Stacked Oak Logs
    public static final RegistryObject<Block> STACKED_OAK_LOGS = BLOCKS.register("stacked_oak_logs",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Stacked Stripped Oak Logs
    public static final RegistryObject<Block> STACKED_STRIPPED_OAK_LOGS = BLOCKS.register("stacked_stripped_oak_logs",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Stacked Spruce Logs
    public static final RegistryObject<Block> STACKED_SPRUCE_LOGS = BLOCKS.register("stacked_spruce_logs",
            () -> new Block(Block.Properties.copy(Blocks.SPRUCE_PLANKS)));

    // Stacked Stripped Spruce Logs
    public static final RegistryObject<Block> STACKED_STRIPPED_SPRUCE_LOGS = BLOCKS.register("stacked_stripped_spruce_logs",
            () -> new Block(Block.Properties.copy(Blocks.SPRUCE_PLANKS)));

    // Stacked Birch Logs
    public static final RegistryObject<Block> STACKED_BIRCH_LOGS = BLOCKS.register("stacked_birch_logs",
            () -> new Block(Block.Properties.copy(Blocks.BIRCH_PLANKS)));

    // Stacked Stripped Birch Logs
    public static final RegistryObject<Block> STACKED_STRIPPED_BIRCH_LOGS = BLOCKS.register("stacked_stripped_birch_logs",
            () -> new Block(Block.Properties.copy(Blocks.BIRCH_PLANKS)));

    // Stacked Jungle Logs
    public static final RegistryObject<Block> STACKED_JUNGLE_LOGS = BLOCKS.register("stacked_jungle_logs",
            () -> new Block(Block.Properties.copy(Blocks.JUNGLE_PLANKS)));

    // Stacked Stripped Jungle Logs
    public static final RegistryObject<Block> STACKED_STRIPPED_JUNGLE_LOGS = BLOCKS.register("stacked_stripped_jungle_logs",
            () -> new Block(Block.Properties.copy(Blocks.JUNGLE_PLANKS)));

    // Stacked Acacia Logs
    public static final RegistryObject<Block> STACKED_ACACIA_LOGS = BLOCKS.register("stacked_acacia_logs",
            () -> new Block(Block.Properties.copy(Blocks.ACACIA_PLANKS)));

    // Stacked Stripped Acacia Logs
    public static final RegistryObject<Block> STACKED_STRIPPED_ACACIA_LOGS = BLOCKS.register("stacked_stripped_acacia_logs",
            () -> new Block(Block.Properties.copy(Blocks.ACACIA_PLANKS)));

    // Stacked Dark Oak Logs
    public static final RegistryObject<Block> STACKED_DARK_OAK_LOGS = BLOCKS.register("stacked_dark_oak_logs",
            () -> new Block(Block.Properties.copy(Blocks.DARK_OAK_PLANKS)));

    // Stacked Stripped Dark Oak Logs
    public static final RegistryObject<Block> STACKED_STRIPPED_DARK_OAK_LOGS = BLOCKS.register("stacked_stripped_dark_oak_logs",
            () -> new Block(Block.Properties.copy(Blocks.DARK_OAK_PLANKS)));

    // Stacked Mangrove Logs
    public static final RegistryObject<Block> STACKED_MANGROVE_LOGS = BLOCKS.register("stacked_mangrove_logs",
            () -> new Block(Block.Properties.copy(Blocks.MANGROVE_PLANKS)));

    // Stacked Stripped Mangrove Logs
    public static final RegistryObject<Block> STACKED_STRIPPED_MANGROVE_LOGS = BLOCKS.register("stacked_stripped_mangrove_logs",
            () -> new Block(Block.Properties.copy(Blocks.MANGROVE_PLANKS)));

    // Stacked Crimson Logs
    public static final RegistryObject<Block> STACKED_CRIMSON_STEMS = BLOCKS.register("stacked_crimson_stems",
            () -> new Block(Block.Properties.copy(Blocks.CRIMSON_PLANKS)));

    // Stacked Stripped Crimson Logs
    public static final RegistryObject<Block> STACKED_STRIPPED_CRIMSON_STEMS = BLOCKS.register("stacked_stripped_crimson_stems",
            () -> new Block(Block.Properties.copy(Blocks.CRIMSON_PLANKS)));

    // Stacked Warped Logs
    public static final RegistryObject<Block> STACKED_WARPED_STEMS = BLOCKS.register("stacked_warped_stems",
            () -> new Block(Block.Properties.copy(Blocks.WARPED_PLANKS)));

    // Stacked Stripped Warped Logs
    public static final RegistryObject<Block> STACKED_STRIPPED_WARPED_STEMS = BLOCKS.register("stacked_stripped_warped_stems",
            () -> new Block(Block.Properties.copy(Blocks.WARPED_PLANKS)));

}
