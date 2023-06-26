package com.jetpacker06.unburned.block;

import com.jetpacker06.unburned.Unburned;
import com.jetpacker06.unburned.item.AllItems;
import com.jetpacker06.unburned.item.Tab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class FoliageBlocks {
    public static final DeferredRegister<Block> FOLIAGE_DR = DeferredRegister.create(ForgeRegistries.BLOCKS, Unburned.MOD_ID);
    public static void registerFoliage(IEventBus eventBus) {
        FOLIAGE_DR.register(eventBus);
    }
    public static final RegistryObject<Block>
        //Add fireproof versions of all the decorative foliage
        FIREPROOF_OAK_LEAVES = leavesBlock("fireproof_oak_leaves"),
        FIREPROOF_SPRUCE_LEAVES = leavesBlock("fireproof_spruce_leaves"),
        FIREPROOF_JUNGLE_LEAVES = leavesBlock("fireproof_jungle_leaves"),
        FIREPROOF_ACACIA_LEAVES = leavesBlock("fireproof_acacia_leaves"),
        FIREPROOF_BIRCH_LEAVES = leavesBlock("fireproof_birch_leaves"),
        FIREPROOF_MANGROVE_LEAVES = leavesBlock("fireproof_mangrove_leaves"),
        FIREPROOF_MANGROVE_ROOTS = leavesBlock("fireproof_mangrove_roots"),
        FIREPROOF_CHERRY_LEAVES = leavesBlock("fireproof_cherry_leaves"),
        FIREPROOF_DARK_OAK_LEAVES = leavesBlock("fireproof_dark_oak_leaves"),
        FIREPROOF_AZALEA_LEAVES = leavesBlock("fireproof_azalea_leaves"),
        FIREPROOF_FLOWERING_AZALEA_LEAVES = leavesBlock("fireproof_flowering_azalea_leaves"),
        FIREPROOF_GRASS = registerBlock("fireproof_grass", () -> new TallGrassBlock(BlockBehaviour.Properties.copy(Blocks.GRASS))),
        FIREPROOF_TALL_GRASS = registerBlock("fireproof_tall_grass", () -> new DoublePlantBlock(BlockBehaviour.Properties.copy(Blocks.TALL_GRASS))),
        FIREPROOF_FERN = registerBlock("fireproof_fern", () -> new TallGrassBlock(BlockBehaviour.Properties.copy(Blocks.FERN))),
        FIREPROOF_LARGE_FERN = registerBlock("fireproof_large_fern", () -> new DoublePlantBlock(BlockBehaviour.Properties.copy(Blocks.LARGE_FERN))),
        FIREPROOF_AZALEA = registerBlock("fireproof_azalea", () -> new AzaleaBlock(BlockBehaviour.Properties.copy(Blocks.AZALEA))),
        FIREPROOF_FLOWERING_AZALEA = registerBlock("fireproof_flowering_azalea", () -> new AzaleaBlock(BlockBehaviour.Properties.copy(Blocks.FLOWERING_AZALEA)));

    public static RegistryObject<Block> leavesBlock(String name) {
        return registerBlock(name, () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    }
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = FOLIAGE_DR.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return AllItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
}
