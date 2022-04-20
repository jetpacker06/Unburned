package com.jetpacker06.unburned;

import com.jetpacker06.unburned.base.item.AllItems;
import com.jetpacker06.unburned.vanilla.block.VanillaFireproofBlocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("unburned")
public class Unburned {
    public static final String MOD_ID = "unburned";
    public Unburned() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        VanillaFireproofBlocks.register(eventBus);
        AllItems.register(eventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }
}