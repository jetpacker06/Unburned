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

    //grasses
    //public static final RegistryObject<Block> FIREPROOF_GRASS = registerBlock("fireproof_grass", () -> new TallGrassBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_FIREPROOF_PLANT).sound(SoundType.GRASS).strength(0.2f).explosionResistance(0.2f).dynamicShape().noCollission().instabreak()), ModCreativeModeTab.UNBURNED);

    public static final RegistryObject<Block>
            //Wool
            FIREPROOF_WHITE_WOOL = wool("fireproof_white_wool"),
            FIREPROOF_ORANGE_WOOL = wool("fireproof_orange_wool"),
            FIREPROOF_MAGENTA_WOOL = wool("fireproof_magenta_wool"),
            FIREPROOF_LIGHT_BLUE_WOOL = wool("fireproof_light_blue_wool"),
            FIREPROOF_YELLOW_WOOL = wool("fireproof_yellow_wool"),
            FIREPROOF_LIME_WOOL = wool("fireproof_lime_wool"),
            FIREPROOF_PINK_WOOL = wool("fireproof_pink_wool"),
            FIREPROOF_GRAY_WOOL = wool("fireproof_gray_wool"),
            FIREPROOF_LIGHT_GRAY_WOOL = wool("fireproof_light_gray_wool"),
            FIREPROOF_CYAN_WOOL = wool("fireproof_cyan_wool"),
            FIREPROOF_PURPLE_WOOL = wool("fireproof_purple_wool"),
            FIREPROOF_BLUE_WOOL = wool("fireproof_blue_wool"),
            FIREPROOF_BROWN_WOOL = wool("fireproof_brown_wool"),
            FIREPROOF_GREEN_WOOL = wool("fireproof_green_wool"),
            FIREPROOF_RED_WOOL = wool("fireproof_red_wool"),
            FIREPROOF_BLACK_WOOL = wool("fireproof_black_wool"),

            //Acacia
            FIREPROOF_ACACIA_LOG = logBlock("fireproof_acacia_log"),
            FIREPROOF_STRIPPED_ACACIA_LOG = logBlock("fireproof_stripped_acacia_log"),
            FIREPROOF_ACACIA_WOOD = logBlock("fireproof_acacia_wood"),
            FIREPROOF_STRIPPED_ACACIA_WOOD = logBlock("fireproof_stripped_acacia_wood"),
            FIREPROOF_ACACIA_PLANKS = woodBlock("fireproof_acacia_planks"),
            FIREPROOF_ACACIA_STAIRS = woodStairs("fireproof_acacia_stairs", FIREPROOF_ACACIA_PLANKS),
            FIREPROOF_ACACIA_SLAB = woodSlab("fireproof_acacia_slab"),
            FIREPROOF_ACACIA_FENCE = woodFenceBlock("fireproof_acacia_fence"),
            FIREPROOF_ACACIA_FENCE_GATE = woodFenceGateBlock("fireproof_acacia_fence_gate"),

            //Acacia
            FIREPROOF_BIRCH_LOG = logBlock("fireproof_birch_log"),
            FIREPROOF_STRIPPED_BIRCH_LOG = logBlock("fireproof_stripped_birch_log"),
            FIREPROOF_BIRCH_WOOD = logBlock("fireproof_birch_wood"),
            FIREPROOF_STRIPPED_BIRCH_WOOD = logBlock("fireproof_stripped_birch_wood"),
            FIREPROOF_BIRCH_PLANKS = woodBlock("fireproof_birch_planks"),
            FIREPROOF_BIRCH_STAIRS = woodStairs("fireproof_birch_stairs", FIREPROOF_BIRCH_PLANKS),
            FIREPROOF_BIRCH_SLAB = woodSlab("fireproof_birch_slab"),
            FIREPROOF_BIRCH_FENCE = woodFenceBlock("fireproof_birch_fence"),
            FIREPROOF_BIRCH_FENCE_GATE = woodFenceGateBlock("fireproof_birch_fence_gate"),
        
            //Dark Oak
            FIREPROOF_DARK_OAK_LOG = logBlock("fireproof_dark_oak_log"),
            FIREPROOF_STRIPPED_DARK_OAK_LOG = logBlock("fireproof_stripped_dark_oak_log"),
            FIREPROOF_DARK_OAK_WOOD = logBlock("fireproof_dark_oak_wood"),
            FIREPROOF_STRIPPED_DARK_OAK_WOOD = logBlock("fireproof_stripped_dark_oak_wood"),
            FIREPROOF_DARK_OAK_PLANKS = woodBlock("fireproof_dark_oak_planks"),
            FIREPROOF_DARK_OAK_STAIRS = woodStairs("fireproof_dark_oak_stairs", FIREPROOF_DARK_OAK_PLANKS),
            FIREPROOF_DARK_OAK_SLAB = woodSlab("fireproof_dark_oak_slab"),
            FIREPROOF_DARK_OAK_FENCE = woodFenceBlock("fireproof_dark_oak_fence"),
            FIREPROOF_DARK_OAK_FENCE_GATE = woodFenceGateBlock("fireproof_dark_oak_fence_gate"),
        
            //Jungle
            FIREPROOF_JUNGLE_LOG = logBlock("fireproof_jungle_log"),
            FIREPROOF_STRIPPED_JUNGLE_LOG = logBlock("fireproof_stripped_jungle_log"),
            FIREPROOF_JUNGLE_WOOD = logBlock("fireproof_jungle_wood"),
            FIREPROOF_STRIPPED_JUNGLE_WOOD = logBlock("fireproof_stripped_jungle_wood"),
            FIREPROOF_JUNGLE_PLANKS = woodBlock("fireproof_jungle_planks"),
            FIREPROOF_JUNGLE_STAIRS = woodStairs("fireproof_jungle_stairs", FIREPROOF_JUNGLE_PLANKS),
            FIREPROOF_JUNGLE_SLAB = woodSlab("fireproof_jungle_slab"),
            FIREPROOF_JUNGLE_FENCE = woodFenceBlock("fireproof_jungle_fence"),
            FIREPROOF_JUNGLE_FENCE_GATE = woodFenceGateBlock("fireproof_jungle_fence_gate"),
        
            //Oak
            FIREPROOF_OAK_LOG = logBlock("fireproof_oak_log"),
            FIREPROOF_STRIPPED_OAK_LOG = logBlock("fireproof_stripped_oak_log"),
            FIREPROOF_OAK_WOOD = logBlock("fireproof_oak_wood"),
            FIREPROOF_STRIPPED_OAK_WOOD = logBlock("fireproof_stripped_oak_wood"),
            FIREPROOF_OAK_PLANKS = woodBlock("fireproof_oak_planks"),
            FIREPROOF_OAK_STAIRS = woodStairs("fireproof_oak_stairs", FIREPROOF_OAK_PLANKS),
            FIREPROOF_OAK_SLAB = woodSlab("fireproof_oak_slab"),
            FIREPROOF_OAK_FENCE = woodFenceBlock("fireproof_oak_fence"),
            FIREPROOF_OAK_FENCE_GATE = woodFenceGateBlock("fireproof_oak_fence_gate"),
        
            //Spruce
            FIREPROOF_SPRUCE_LOG = logBlock("fireproof_spruce_log"),
            FIREPROOF_STRIPPED_SPRUCE_LOG = logBlock("fireproof_stripped_spruce_log"),
            FIREPROOF_SPRUCE_WOOD = logBlock("fireproof_spruce_wood"),
            FIREPROOF_STRIPPED_SPRUCE_WOOD = logBlock("fireproof_stripped_spruce_wood"),
            FIREPROOF_SPRUCE_PLANKS = woodBlock("fireproof_spruce_planks"),
            FIREPROOF_SPRUCE_STAIRS = woodStairs("fireproof_spruce_stairs", FIREPROOF_SPRUCE_PLANKS),
            FIREPROOF_SPRUCE_SLAB = woodSlab("fireproof_spruce_slab"),
            FIREPROOF_SPRUCE_FENCE = woodFenceBlock("fireproof_spruce_fence"),
            FIREPROOF_SPRUCE_FENCE_GATE = woodFenceGateBlock("fireproof_spruce_fence_gate");


    //end blocks, begin methods
    public static final RegistryObject<Block> wool(String name) {
        return registerBlock(name, () -> new Block(BlockBehaviour.Properties.of(Material.WOOL).sound(SoundType.WOOL).strength(0.8f).explosionResistance(0.8f)), ModCreativeModeTab.UNBURNED);
    }
    public static final RegistryObject<Block> woodSlab(String name) {
        return registerBlock(name, () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    }
    public static final RegistryObject<Block> woodStairs(String name, RegistryObject<Block> fullVariant ) {
        return registerBlock(name, () -> new StairBlock(() -> fullVariant.get().defaultBlockState() , BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    }
    public static final RegistryObject<Block> woodBlock(String name) {
        return registerBlock(name, () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    }
    public static final RegistryObject<Block> woodFenceBlock(String name) {
        return registerBlock(name, () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    }
    public static final RegistryObject<Block> woodFenceGateBlock(String name) {
        return registerBlock(name, () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    }
    public static final RegistryObject<Block> logBlock(String name) {
        return registerBlock(name, () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    }
    //end methods
    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {return ItemsAll.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));}
    public static void register(IEventBus eventBus) {BLOCKS.register(eventBus);}
}
