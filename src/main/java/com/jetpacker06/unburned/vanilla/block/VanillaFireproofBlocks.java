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

    //oak
    public static final RegistryObject<Block> FIREPROOF_OAK_LOG = registerBlock("fireproof_oak_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_STRIPPED_OAK_LOG = registerBlock("fireproof_stripped_oak_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_OAK_PLANKS = registerBlock("fireproof_oak_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_OAK_SLAB = registerBlock("fireproof_oak_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_OAK_STAIRS = registerBlock("fireproof_oak_stairs", () -> new StairBlock(() -> VanillaFireproofBlocks.FIREPROOF_OAK_PLANKS.get().defaultBlockState() , BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_OAK_FENCE = registerBlock("fireproof_oak_fence", () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_OAK_FENCE_GATE = registerBlock("fireproof_oak_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_OAK_WOOD = registerBlock("fireproof_oak_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_STRIPPED_OAK_WOOD = registerBlock("fireproof_stripped_oak_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    //public static final RegistryObject<Block> FIREPROOF_OAK_LEAVES = registerBlock("fireproof_oak_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)), ModCreativeModeTab.UNBURNED);

    //dark oak
    public static final RegistryObject<Block> FIREPROOF_DARK_OAK_LOG = registerBlock("fireproof_dark_oak_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_STRIPPED_DARK_OAK_LOG = registerBlock("fireproof_stripped_dark_oak_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_DARK_OAK_PLANKS = registerBlock("fireproof_dark_oak_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_DARK_OAK_SLAB = registerBlock("fireproof_dark_oak_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_DARK_OAK_STAIRS = registerBlock("fireproof_dark_oak_stairs", () -> new StairBlock(() -> VanillaFireproofBlocks.FIREPROOF_DARK_OAK_PLANKS.get().defaultBlockState() , BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_DARK_OAK_FENCE = registerBlock("fireproof_dark_oak_fence", () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_DARK_OAK_FENCE_GATE = registerBlock("fireproof_dark_oak_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_DARK_OAK_WOOD = registerBlock("fireproof_dark_oak_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_STRIPPED_DARK_OAK_WOOD = registerBlock("fireproof_stripped_dark_oak_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    //public static final RegistryObject<Block> FIREPROOF_DARK_OAK_LEAVES = registerBlock("fireproof_dark_oak_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)), ModCreativeModeTab.UNBURNED);

    //spruce
    public static final RegistryObject<Block> FIREPROOF_SPRUCE_LOG = registerBlock("fireproof_spruce_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_STRIPPED_SPRUCE_LOG = registerBlock("fireproof_stripped_spruce_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_SPRUCE_PLANKS = registerBlock("fireproof_spruce_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_SPRUCE_SLAB = registerBlock("fireproof_spruce_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_SPRUCE_STAIRS = registerBlock("fireproof_spruce_stairs", () -> new StairBlock(() -> VanillaFireproofBlocks.FIREPROOF_SPRUCE_PLANKS.get().defaultBlockState() , BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_SPRUCE_FENCE = registerBlock("fireproof_spruce_fence", () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_SPRUCE_FENCE_GATE = registerBlock("fireproof_spruce_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_SPRUCE_WOOD = registerBlock("fireproof_spruce_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_STRIPPED_SPRUCE_WOOD = registerBlock("fireproof_stripped_spruce_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
   // public static final RegistryObject<Block> FIREPROOF_SPRUCE_LEAVES = registerBlock("fireproof_spruce_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)), ModCreativeModeTab.UNBURNED);

    //birch
    public static final RegistryObject<Block> FIREPROOF_BIRCH_LOG = registerBlock("fireproof_birch_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_STRIPPED_BIRCH_LOG = registerBlock("fireproof_stripped_birch_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_BIRCH_PLANKS = registerBlock("fireproof_birch_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_BIRCH_SLAB = registerBlock("fireproof_birch_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_BIRCH_STAIRS = registerBlock("fireproof_birch_stairs", () -> new StairBlock(() -> VanillaFireproofBlocks.FIREPROOF_BIRCH_PLANKS.get().defaultBlockState() , BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_BIRCH_FENCE = registerBlock("fireproof_birch_fence", () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_BIRCH_FENCE_GATE = registerBlock("fireproof_birch_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_BIRCH_WOOD = registerBlock("fireproof_birch_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_STRIPPED_BIRCH_WOOD = registerBlock("fireproof_stripped_birch_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
   // public static final RegistryObject<Block> FIREPROOF_BIRCH_LEAVES = registerBlock("fireproof_birch_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)), ModCreativeModeTab.UNBURNED);

    //jungle
    public static final RegistryObject<Block> FIREPROOF_JUNGlE_LOG = registerBlock("fireproof_jungle_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_STRIPPED_JUNGlE_LOG = registerBlock("fireproof_stripped_jungle_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_JUNGLE_PLANKS = registerBlock("fireproof_jungle_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_JUNGLE_SLAB = registerBlock("fireproof_jungle_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_JUNGLE_STAIRS = registerBlock("fireproof_jungle_stairs", () -> new StairBlock(() -> VanillaFireproofBlocks.FIREPROOF_JUNGLE_PLANKS.get().defaultBlockState() , BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_JUNGLE_FENCE = registerBlock("fireproof_jungle_fence", () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_JUNGLE_FENCE_GATE = registerBlock("fireproof_jungle_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_JUNGLE_WOOD = registerBlock("fireproof_jungle_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_STRIPPED_JUNGLE_WOOD = registerBlock("fireproof_stripped_jungle_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
   // public static final RegistryObject<Block> FIREPROOF_JUNGLE_LEAVES = registerBlock("fireproof_jungle_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)), ModCreativeModeTab.UNBURNED);

    //acacia
    public static final RegistryObject<Block> FIREPROOF_ACACIA_LOG = registerBlock("fireproof_acacia_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_STRIPPED_ACACIA_LOG = registerBlock("fireproof_stripped_acacia_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_ACACIA_PLANKS = registerBlock("fireproof_acacia_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_ACACIA_SLAB = registerBlock("fireproof_acacia_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_ACACIA_STAIRS = registerBlock("fireproof_acacia_stairs", () -> new StairBlock(() -> VanillaFireproofBlocks.FIREPROOF_ACACIA_PLANKS.get().defaultBlockState() , BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_ACACIA_FENCE = registerBlock("fireproof_acacia_fence", () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_ACACIA_FENCE_GATE = registerBlock("fireproof_acacia_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_ACACIA_WOOD = registerBlock("fireproof_acacia_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_STRIPPED_ACACIA_WOOD = registerBlock("fireproof_stripped_acacia_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
   // public static final RegistryObject<Block> FIREPROOF_ACACIA_LEAVES = registerBlock("fireproof_acacia_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)), ModCreativeModeTab.UNBURNED);

    //wool
    public static final RegistryObject<Block> FIREPROOF_WHITE_WOOL = registerBlock("fireproof_white_wool", () -> new Block(BlockBehaviour.Properties.of(Material.WOOL).sound(SoundType.WOOL).strength(0.8f).explosionResistance(0.8f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_ORANGE_WOOL = registerBlock("fireproof_orange_wool", () -> new Block(BlockBehaviour.Properties.of(Material.WOOL).sound(SoundType.WOOL).strength(0.8f).explosionResistance(0.8f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_MAGENTA_WOOL = registerBlock("fireproof_magenta_wool", () -> new Block(BlockBehaviour.Properties.of(Material.WOOL).sound(SoundType.WOOL).strength(0.8f).explosionResistance(0.8f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_LIGHT_BLUE_WOOL = registerBlock("fireproof_light_blue_wool", () -> new Block(BlockBehaviour.Properties.of(Material.WOOL).sound(SoundType.WOOL).strength(0.8f).explosionResistance(0.8f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_YELLOW_WOOL = registerBlock("fireproof_yellow_wool", () -> new Block(BlockBehaviour.Properties.of(Material.WOOL).sound(SoundType.WOOL).strength(0.8f).explosionResistance(0.8f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_LIME_WOOL = registerBlock("fireproof_lime_wool", () -> new Block(BlockBehaviour.Properties.of(Material.WOOL).sound(SoundType.WOOL).strength(0.8f).explosionResistance(0.8f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_PINK_WOOL = registerBlock("fireproof_pink_wool", () -> new Block(BlockBehaviour.Properties.of(Material.WOOL).sound(SoundType.WOOL).strength(0.8f).explosionResistance(0.8f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_GRAY_WOOL = registerBlock("fireproof_gray_wool", () -> new Block(BlockBehaviour.Properties.of(Material.WOOL).sound(SoundType.WOOL).strength(0.8f).explosionResistance(0.8f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_LIGHT_GRAY_WOOL = registerBlock("fireproof_light_gray_wool", () -> new Block(BlockBehaviour.Properties.of(Material.WOOL).sound(SoundType.WOOL).strength(0.8f).explosionResistance(0.8f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_CYAN_WOOL = registerBlock("fireproof_cyan_wool", () -> new Block(BlockBehaviour.Properties.of(Material.WOOL).sound(SoundType.WOOL).strength(0.8f).explosionResistance(0.8f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_PURPLE_WOOL = registerBlock("fireproof_purple_wool", () -> new Block(BlockBehaviour.Properties.of(Material.WOOL).sound(SoundType.WOOL).strength(0.8f).explosionResistance(0.8f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_BLUE_WOOL = registerBlock("fireproof_blue_wool", () -> new Block(BlockBehaviour.Properties.of(Material.WOOL).sound(SoundType.WOOL).strength(0.8f).explosionResistance(0.8f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_BROWN_WOOL = registerBlock("fireproof_brown_wool", () -> new Block(BlockBehaviour.Properties.of(Material.WOOL).sound(SoundType.WOOL).strength(0.8f).explosionResistance(0.8f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_GREEN_WOOL = registerBlock("fireproof_green_wool", () -> new Block(BlockBehaviour.Properties.of(Material.WOOL).sound(SoundType.WOOL).strength(0.8f).explosionResistance(0.8f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_RED_WOOL = registerBlock("fireproof_red_wool", () -> new Block(BlockBehaviour.Properties.of(Material.WOOL).sound(SoundType.WOOL).strength(0.8f).explosionResistance(0.8f)), ModCreativeModeTab.UNBURNED);
    public static final RegistryObject<Block> FIREPROOF_BLACK_GRAY_WOOL = registerBlock("fireproof_black_wool", () -> new Block(BlockBehaviour.Properties.of(Material.WOOL).sound(SoundType.WOOL).strength(0.8f).explosionResistance(0.8f)), ModCreativeModeTab.UNBURNED);

    // end blocks
    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {return ItemsAll.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));}
    public static void register(IEventBus eventBus) {BLOCKS.register(eventBus);}
}
