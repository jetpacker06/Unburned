package com.jetpacker06.unburned.vanilla.block;

import com.jetpacker06.unburned.Unburned;
import com.jetpacker06.unburned.base.item.ItemsAll;
import com.jetpacker06.unburned.base.item.ModCreativeModeTab;
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

public class VanillaFireproofBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Unburned.MOD_ID);
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;}
    //begin blocks
    public static final RegistryObject<Block> FIREPROOF_OAK_LOG = registerBlock("fireproof_oak_log", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD)), ModCreativeModeTab.UNBURNED);
    //end blocks
    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {return ItemsAll.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));}
    public static void register(IEventBus eventBus) {BLOCKS.register(eventBus);}
}