package com.jetpacker06.unburned;

import com.jetpacker06.unburned.vanilla.item.ItemsAll;
import com.jetpacker06.unburned.vanilla.item.ModCreativeModeTab;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("unburned")
public class Unburned {
    public static final String MOD_ID = "unburned";
    private static final Logger LOGGER = LogManager.getLogger();
    public Unburned() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        ItemsAll.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
    private void setup(final FMLCommonSetupEvent event){LOGGER.info("HELLO FROM PREINIT");LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());}
}