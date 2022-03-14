package com.jetpacker06.unburned.vanilla.block;

import com.jetpacker06.unburned.Unburned;
import com.jetpacker06.unburned.base.item.ItemsAll;
import com.jetpacker06.unburned.base.item.ModCreativeModeTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class VanillaFireproofBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Unburned.MOD_ID);
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;}
    //begin blocks

    //logs
    public static final RegistryObject<Block> FIREPROOF_OAK_LOG = registerBlock("fireproof_oak_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_DARK_OAK_LOG = registerBlock("fireproof_dark_oak_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_SPRUCE_LOG = registerBlock("fireproof_spruce_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_BIRCH_LOG = registerBlock("fireproof_birch_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_JUNGlE_LOG = registerBlock("fireproof_jungle_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_ACACIA_LOG = registerBlock("fireproof_acacia_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD)), ModCreativeModeTab.UNBURNED);

    //stripped logs
    public static final RegistryObject<Block> FIREPROOF_STRIPPED_OAK_LOG = registerBlock("fireproof_stripped_oak_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_STRIPPED_DARK_OAK_LOG = registerBlock("fireproof_stripped_dark_oak_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_STRIPPED_SPRUCE_LOG = registerBlock("fireproof_stripped_spruce_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_STRIPPED_BIRCH_LOG = registerBlock("fireproof_stripped_birch_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_STRIPPED_JUNGlE_LOG = registerBlock("fireproof_stripped_jungle_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_STRIPPED_ACACIA_LOG = registerBlock("fireproof_stripped_acacia_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD)), ModCreativeModeTab.UNBURNED);

    //planks
    public static final RegistryObject<Block> FIREPROOF_OAK_PLANKS = registerBlock("fireproof_oak_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_DARK_OAK_PLANKS = registerBlock("fireproof_dark_oak_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_SPRUCE_PLANKS = registerBlock("fireproof_spruce_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_BIRCH_PLANKS = registerBlock("fireproof_birch_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_JUNGLE_PLANKS = registerBlock("fireproof_jungle_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_ACACIA_PLANKS = registerBlock("fireproof_acacia_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD)), ModCreativeModeTab.UNBURNED);

    //slabs
    public static final RegistryObject<Block> FIREPROOF_OAK_SLAB = registerBlock("fireproof_oak_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_DARK_OAK_SLAB = registerBlock("fireproof_dark_oak_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_SPRUCE_SLAB = registerBlock("fireproof_spruce_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_BIRCH_SLAB = registerBlock("fireproof_birch_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_JUNGLE_SLAB = registerBlock("fireproof_jungle_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_ACACIA_SLAB = registerBlock("fireproof_acacia_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD)), ModCreativeModeTab.UNBURNED);

    // end blocks
    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {return ItemsAll.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));}
    public static void register(IEventBus eventBus) {BLOCKS.register(eventBus);}
}
