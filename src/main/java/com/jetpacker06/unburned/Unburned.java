package com.jetpacker06.unburned;

import com.jetpacker06.unburned.block.FoliageBlocks;
import com.jetpacker06.unburned.block.WoolBlocks;
import com.jetpacker06.unburned.item.AllItems;
import com.jetpacker06.unburned.block.VanillaBlocks;
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
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegistryObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;

@Mod("unburned")
public class Unburned {
    public static final Logger LOGGER = LogManager.getLogger();
    public static void log(Object o) {
        LOGGER.info(o);
    }
    public static final String MOD_ID = "unburned";
    public static HashMap<RegistryObject<LeavesBlock>, Integer> LeavesAndColorHashMap = new HashMap<>();
    public Unburned() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        WoolBlocks.registerFireproofWool(eventBus);
        FoliageBlocks.registerFoliage(eventBus);
        VanillaBlocks.registerVanillaFireproofWoodTypes(eventBus);
        AllItems.register(eventBus);
        eventBus.addListener(this::clientSetup);
        eventBus.addListener(this::blockColorEvent);
        eventBus.addListener(this::itemColorEvent);
        MinecraftForge.EVENT_BUS.register(this);
    }
    public void blockColorEvent(ColorHandlerEvent.Block event) {
        BlockColors blockcolors = event.getBlockColors();
        blockcolors.register((p_92626_, p_92627_, p_92628_, p_92629_) -> {
            return p_92627_ != null && p_92628_ != null ? BiomeColors.getAverageFoliageColor(p_92627_, p_92628_) : FoliageColor.getDefaultColor();
        });
        blockcolors.register((p_92636_, p_92637_, p_92638_, p_92639_) -> {
            return FoliageColor.getEvergreenColor();
        }, FoliageBlocks.FIREPROOF_SPRUCE_LEAVES.get());
        blockcolors.register((p_92631_, p_92632_, p_92633_, p_92634_) -> {
            return FoliageColor.getBirchColor();
        }, FoliageBlocks.FIREPROOF_BIRCH_LEAVES.get());
        blockcolors.register((p_92626_, p_92627_, p_92628_, p_92629_) -> {
            return p_92627_ != null && p_92628_ != null ? BiomeColors.getAverageFoliageColor(p_92627_, p_92628_) : FoliageColor.getDefaultColor();
        }, FoliageBlocks.FIREPROOF_OAK_LEAVES.get(), FoliageBlocks.FIREPROOF_JUNGLE_LEAVES.get(), FoliageBlocks.FIREPROOF_ACACIA_LEAVES.get(), FoliageBlocks.FIREPROOF_DARK_OAK_LEAVES.get());

        blockcolors.register((p_92646_, p_92647_, p_92648_, p_92649_) -> {
            return p_92647_ != null && p_92648_ != null ? BiomeColors.getAverageGrassColor(p_92647_, p_92646_.getValue(DoublePlantBlock.HALF) == DoubleBlockHalf.UPPER ? p_92648_.below() : p_92648_) : -1;
        }, FoliageBlocks.FIREPROOF_LARGE_FERN.get(), FoliageBlocks.FIREPROOF_TALL_GRASS.get());
        blockcolors.addColoringState(DoublePlantBlock.HALF, FoliageBlocks.FIREPROOF_LARGE_FERN.get(), FoliageBlocks.FIREPROOF_TALL_GRASS.get());
        blockcolors.register((p_92641_, p_92642_, p_92643_, p_92644_) -> {
            return p_92642_ != null && p_92643_ != null ? BiomeColors.getAverageGrassColor(p_92642_, p_92643_) : GrassColor.get(0.5D, 1.0D);
        }, FoliageBlocks.FIREPROOF_FERN.get(), FoliageBlocks.FIREPROOF_GRASS.get());
    }
    public void itemColorEvent(ColorHandlerEvent.Item event) {
        ItemColors itemcolors = event.getItemColors();
        BlockColors blockColors = event.getBlockColors();
        itemcolors.register((pStack, pTintIndex) -> 1);
        itemcolors.register((p_92687_, p_92688_) -> {
            BlockState blockstate = ((BlockItem)p_92687_.getItem()).getBlock().defaultBlockState();
            return blockColors.getColor(blockstate, (BlockAndTintGetter)null, (BlockPos)null, p_92688_);
        }, FoliageBlocks.FIREPROOF_ACACIA_LEAVES.get(), FoliageBlocks.FIREPROOF_BIRCH_LEAVES.get(), FoliageBlocks.FIREPROOF_DARK_OAK_LEAVES.get(), FoliageBlocks.FIREPROOF_OAK_LEAVES.get(), FoliageBlocks.FIREPROOF_JUNGLE_LEAVES.get(), FoliageBlocks.FIREPROOF_SPRUCE_LEAVES.get(), FoliageBlocks.FIREPROOF_FERN.get(), FoliageBlocks.FIREPROOF_GRASS.get());

        itemcolors.register((p_92705_, p_92706_) -> {
            return GrassColor.get(0.5D, 1.0D);
        }, FoliageBlocks.FIREPROOF_TALL_GRASS.get(), FoliageBlocks.FIREPROOF_LARGE_FERN.get());
    }
    public void clientSetup(FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(FoliageBlocks.FIREPROOF_GRASS.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(FoliageBlocks.FIREPROOF_TALL_GRASS.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(FoliageBlocks.FIREPROOF_FERN.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(FoliageBlocks.FIREPROOF_LARGE_FERN.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(FoliageBlocks.FIREPROOF_AZALEA.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(FoliageBlocks.FIREPROOF_FLOWERING_AZALEA.get(), RenderType.cutoutMipped());
    }
}