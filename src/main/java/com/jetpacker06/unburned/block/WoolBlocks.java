package com.jetpacker06.unburned.block;

import com.jetpacker06.unburned.Unburned;
import com.jetpacker06.unburned.item.AllItems;
import com.jetpacker06.unburned.item.Tab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class WoolBlocks {
    public static final DeferredRegister<Block> WOOL_DR = DeferredRegister.create(ForgeRegistries.BLOCKS, Unburned.MOD_ID);
    public static void registerFireproofWool(IEventBus eventBus) {
        WOOL_DR.register(eventBus);
    }
    public static final RegistryObject<Block>
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
            FIREPROOF_BLACK_WOOL = wool("fireproof_black_wool");
    private static final RegistryObject<Block> wool(String name) {
        return registerBlock(name, () -> new Block(BlockBehaviour.Properties.of(Material.WOOL).sound(SoundType.WOOL).strength(0.8f).explosionResistance(0.8f)), Tab.UNBURNED);
    }
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = WOOL_DR.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return AllItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
}
