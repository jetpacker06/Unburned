package com.jetpacker06.unburned.base.item;

import com.jetpacker06.unburned.Unburned;
import com.jetpacker06.unburned.base.item.advanced.FireproofingItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemsAll {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Unburned.MOD_ID);
    //begin items
    public static final RegistryObject<Item> FIREPROOFING = ITEMS.register("fireproofing", () -> new FireproofingItem(new Item.Properties().tab(ModCreativeModeTab.UNBURNED)));
    public static final RegistryObject<Item> NETHER_COMPOUND = ITEMS.register("nether_compound", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.UNBURNED)));

    //end items
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}