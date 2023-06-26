package com.jetpacker06.unburned;

import com.jetpacker06.unburned.item.AllItems;
import com.jetpacker06.unburned.item.Tab;
import net.minecraft.sounds.SoundEvents;
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
        this(name, Unburned.MOD_ID);
    }
    public FireproofWoodType(String name, String MOD_ID) {
        log("Creating " + name + " wood type...");
        this.blockDeferredRegister = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
        this.itemDeferredRegister = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
        Unburned.itemDeferredRegisters.add(this.itemDeferredRegister);

        this.log = addLogBlock("fireproof_" + name + "_log");
        this.strippedLog = addLogBlock("fireproof_stripped_" + name + "_log");
        this.wood = addLogBlock("fireproof_" + name + "_wood");
        this.strippedWood = addLogBlock("fireproof_stripped_" + name + "_wood");
        this.plank = addPlankBlock("fireproof_" + name + "_planks");
        this.stairs = addStairsBlock("fireproof_" + name + "_stairs", this.plank);
        this.slab = addSlabBlock("fireproof_" + name + "_slab");
        this.fence = addFenceBlock("fireproof_" + name + "_fence");
        this.fence_gate = addFenceGateBlock("fireproof_" + name + "_fence_gate");
    }
    public void registerWoodType(IEventBus eventBus) {
        this.blockDeferredRegister.register(eventBus);
    }

    private final DeferredRegister<Block> blockDeferredRegister;
    private final DeferredRegister<Item> itemDeferredRegister;
    private final RegistryObject<Block> log;
    private final RegistryObject<Block> strippedLog;
    private final RegistryObject<Block> wood;
    private final RegistryObject<Block> strippedWood;
    private final RegistryObject<Block> plank;
    private final RegistryObject<Block> stairs;
    private final RegistryObject<Block> slab;
    private final RegistryObject<Block> fence;
    private final RegistryObject<Block> fence_gate;
    public RegistryObject<Block> addSlabBlock(String name) {
        return registerBlock(name, () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), Tab.UNBURNED);
    }
    public RegistryObject<Block> addStairsBlock(String name, RegistryObject<Block> fullVariant) {
        return registerBlock(name, () -> new StairBlock(() -> fullVariant.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), Tab.UNBURNED);
    }
    public RegistryObject<Block> addPlankBlock(String name) {
        return registerBlock(name, () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), Tab.UNBURNED);
    }
    public RegistryObject<Block> addFenceBlock(String name) {
        return registerBlock(name, () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), Tab.UNBURNED);
    }
    public RegistryObject<Block> addFenceGateBlock(String name) {
        return registerBlock(name, () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE), Tab.UNBURNED);
    }
    public RegistryObject<Block> addLogBlock(String name) {
        return registerBlock(name, () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0f).explosionResistance(2.0f)), Tab.UNBURNED);
    }
    private <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = this.blockDeferredRegister.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    private <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return AllItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public DeferredRegister<Block> getBlockDeferredRegister() {
        return blockDeferredRegister;
    }

    public DeferredRegister<Item> getItemDeferredRegister() {
        return itemDeferredRegister;
    }

    public RegistryObject<Block> getLog() {
        return log;
    }

    public RegistryObject<Block> getStrippedLog() {
        return strippedLog;
    }

    public RegistryObject<Block> getWood() {
        return wood;
    }

    public RegistryObject<Block> getStrippedWood() {
        return strippedWood;
    }

    public RegistryObject<Block> getPlank() {
        return plank;
    }

    public RegistryObject<Block> getStairs() {
        return stairs;
    }

    public RegistryObject<Block> getSlab() {
        return slab;
    }

    public RegistryObject<Block> getFence() {
        return fence;
    }

    public RegistryObject<Block> getFence_gate() {
        return fence_gate;
    }
}
