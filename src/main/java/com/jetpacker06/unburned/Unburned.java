package com.jetpacker06.unburned;

import com.jetpacker06.unburned.block.FoliageBlocks;
import com.jetpacker06.unburned.block.WoolBlocks;
import com.jetpacker06.unburned.item.AllItems;
import com.jetpacker06.unburned.block.VanillaBlocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLConfig;
import net.minecraftforge.fml.loading.targets.FMLClientLaunchHandler;
import net.minecraftforge.registries.RegistryObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;

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