package com.jetpacker06.unburned;

import com.jetpacker06.unburned.item.AllItems;
import com.jetpacker06.unburned.item.ModCreativeModeTab;
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

import static com.jetpacker06.unburned.Unburned.log;

public class FireproofWoodType {
    public FireproofWoodType(String name) {
        log("Creating " + name + " wood type...");
        this.DR = DeferredRegister.create(ForgeRegistries.BLOCKS, Unburned.MOD_ID);
        this.log = addLogBlock("fireproof_" + name + "_log"); //Add a log block to Minecraft with the name fireproof_name_log
        this.stripped_log = addLogBlock("fireproof_stripped_" + name + "_log");
        this.wood = addLogBlock("fireproof_" + name + "_wood");
        this.stripped_wood = addLogBlock("fireproof_stripped_" + name + "_wood");
        this.plank = addPlankBlock("fireproof_" + name + "_planks");
        this.stairs = addStairsBlock("fireproof_" + name + "_stairs", this.plank);
        this.slab = addSlabBlock("fireproof_" + name + "_slab");
        this.fence = addFenceBlock("fireproof_" + name + "_fence");
        this.fence_gate = addFenceGateBlock("fireproof_" + name + "_fence_gate");
    }
    public void registerWoodType(IEventBus eventBus) {
        this.DR.register(eventBus);
    }
    private final DeferredRegister<Block> DR;
    public final RegistryObject<Block> log;
    public final RegistryObject<Block> stripped_log;
    public final RegistryObject<Block> wood;
    public final RegistryObject<Block> stripped_wood;
    public final RegistryObject<Block> plank;
    public final RegistryObject<Block> stairs;
    public final RegistryObject<Block> slab;
    public final RegistryObject<Block> fence;
    public final RegistryObject<Block> fence_gate;
    public RegistryObject<Block> addSlabBlock(String name) {
        return registerBlock(name, () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    }
    public RegistryObject<Block> addStairsBlock(String name, RegistryObject<Block> fullVariant) {
        return registerBlock(name, () -> new StairBlock(() -> fullVariant.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    }
    public RegistryObject<Block> addPlankBlock(String name) {
        return registerBlock(name, () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    }
    public RegistryObject<Block> addFenceBlock(String name) {
        return registerBlock(name, () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    }
    public RegistryObject<Block> addFenceGateBlock(String name) {
        return registerBlock(name, () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    }
    public RegistryObject<Block> addLogBlock(String name) {
        return registerBlock(name, () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), ModCreativeModeTab.UNBURNED);
    }
    public RegistryObject<Block> leavesBlock(String name) {
        return registerBlock(name, () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)), ModCreativeModeTab.UNBURNED);
    }
    private <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = this.DR.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    private <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return AllItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
}
