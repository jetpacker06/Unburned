package com.jetpacker06.unburned;

import com.jetpacker06.unburned.block.FoliageBlocks;
import com.jetpacker06.unburned.block.VanillaBlocks;
import com.jetpacker06.unburned.block.WoolBlocks;
import com.jetpacker06.unburned.item.AllItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Unburned.MOD_ID)
public class Unburned {
    public static final Logger LOGGER = LogManager.getLogger();
    public static void log(Object o) {
        LOGGER.info(o);
    }
    public static final String MOD_ID = "unburned";
    public Unburned() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        WoolBlocks.registerFireproofWool(eventBus);
        FoliageBlocks.registerFoliage(eventBus);
        VanillaBlocks.registerVanillaFireproofWoodTypes(eventBus);
        AllItems.register(eventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }
}