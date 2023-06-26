package com.jetpacker06.unburned.item;

import com.jetpacker06.unburned.Unburned;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;

public class Tab {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Unburned.MOD_ID);
    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
    public static ArrayList<DeferredRegister<Item>> itemDeferredRegisters = new ArrayList<>();
    public static final RegistryObject<CreativeModeTab> UNBURNED = TABS.register("unburned", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemgroup." + Unburned.MOD_ID + ".unburned"))
            .icon(() -> new ItemStack(AllItems.FIREPROOFING.get()))
            .displayItems((params, output) -> {
                itemDeferredRegisters.add(AllItems.ITEMS);
                for (DeferredRegister<Item> deferredRegister : itemDeferredRegisters) {
                    for (RegistryObject<Item> item : deferredRegister.getEntries()) {
                        output.accept(item.get());
                    }
                }
            })
            .build()
    );
}