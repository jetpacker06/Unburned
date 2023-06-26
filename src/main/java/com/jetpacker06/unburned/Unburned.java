package com.jetpacker06.unburned;

import com.jetpacker06.unburned.block.FoliageBlocks;
import com.jetpacker06.unburned.block.VanillaBlocks;
import com.jetpacker06.unburned.block.WoolBlocks;
import com.jetpacker06.unburned.item.AllItems;
import com.jetpacker06.unburned.item.Tab;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

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
        eventBus.addListener(this::onPopulateTabEvent);
        MinecraftForge.EVENT_BUS.register(this);
    }

    public static ArrayList<DeferredRegister<Item>> itemDeferredRegisters = new ArrayList<>();
    public void onPopulateTabEvent(CreativeModeTabEvent.BuildContents event) {
        if (!(event.getTab() == Tab.UNBURNED)) {
            return;
        }
        System.out.println("hhhh");
        itemDeferredRegisters.add(AllItems.ITEMS);
        for (DeferredRegister<Item> deferredRegister : itemDeferredRegisters) {
            for (RegistryObject<Item> item : deferredRegister.getEntries()) {
                event.accept(item);
            }
        }
    }
}