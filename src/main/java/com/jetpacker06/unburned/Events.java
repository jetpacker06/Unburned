package com.jetpacker06.unburned;

import com.jetpacker06.unburned.block.FoliageBlocks;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class Events {
    @Mod.EventBusSubscriber(modid = Unburned.MOD_ID, value= Dist.DEDICATED_SERVER, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ServerSetupEvents {}

    @Mod.EventBusSubscriber(modid = Unburned.MOD_ID, value= Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientSetupEvents {
        @SuppressWarnings("deprecation")
        @SubscribeEvent
        public static void blockColorEvent(RegisterColorHandlersEvent.Block event) {
            BlockColors blockcolors = event.getBlockColors();
            blockcolors.register((pState, pBlockAndTintGetter, pPos, p_92639_) -> FoliageColor.getEvergreenColor(), FoliageBlocks.FIREPROOF_SPRUCE_LEAVES.get());
            blockcolors.register((pState, pBlockAndTintGetter, pPos, p_92634_) -> FoliageColor.getBirchColor(), FoliageBlocks.FIREPROOF_BIRCH_LEAVES.get());
            blockcolors.register((pState, pBlockAndTintGetter, pPos, p_92629_) -> pBlockAndTintGetter != null && pPos != null ? BiomeColors.getAverageFoliageColor(pBlockAndTintGetter, pPos) : FoliageColor.getDefaultColor(), FoliageBlocks.FIREPROOF_OAK_LEAVES.get(), FoliageBlocks.FIREPROOF_JUNGLE_LEAVES.get(), FoliageBlocks.FIREPROOF_ACACIA_LEAVES.get(), FoliageBlocks.FIREPROOF_DARK_OAK_LEAVES.get(), FoliageBlocks.FIREPROOF_MANGROVE_LEAVES.get());
            blockcolors.register((pState, pBlockAndTintGetter, pPos, p_92649_) -> pBlockAndTintGetter != null && pPos != null ? BiomeColors.getAverageGrassColor(pBlockAndTintGetter, pState.getValue(DoublePlantBlock.HALF) == DoubleBlockHalf.UPPER ? pPos.below() : pPos) : -1, FoliageBlocks.FIREPROOF_LARGE_FERN.get(), FoliageBlocks.FIREPROOF_TALL_GRASS.get());
            blockcolors.register((pState, p_92642_, pPos, p_92644_) -> p_92642_ != null && pPos != null ? BiomeColors.getAverageGrassColor(p_92642_, pPos) : GrassColor.get(0.5D, 1.0D), FoliageBlocks.FIREPROOF_FERN.get(), FoliageBlocks.FIREPROOF_GRASS.get());

            blockcolors.addColoringState(DoublePlantBlock.HALF, FoliageBlocks.FIREPROOF_LARGE_FERN.get(), FoliageBlocks.FIREPROOF_TALL_GRASS.get());
        }

        @SuppressWarnings("deprecation")
        @SubscribeEvent
        public static void itemColorEvent(RegisterColorHandlersEvent.Item event) {
            ItemColors itemcolors = event.getItemColors();
            BlockColors blockColors = event.getBlockColors();
            itemcolors.register((pStack, pTintIndex) -> 1);
            itemcolors.register((p_92687_, p_92688_) -> {
                BlockState blockstate = ((BlockItem)p_92687_.getItem()).getBlock().defaultBlockState();
                return blockColors.getColor(blockstate, null, null, p_92688_);
            }, FoliageBlocks.FIREPROOF_ACACIA_LEAVES.get(), FoliageBlocks.FIREPROOF_BIRCH_LEAVES.get(),
                    FoliageBlocks.FIREPROOF_DARK_OAK_LEAVES.get(), FoliageBlocks.FIREPROOF_OAK_LEAVES.get(),
                    FoliageBlocks.FIREPROOF_JUNGLE_LEAVES.get(), FoliageBlocks.FIREPROOF_SPRUCE_LEAVES.get(),
                    FoliageBlocks.FIREPROOF_MANGROVE_LEAVES.get(), FoliageBlocks.FIREPROOF_FERN.get(),
                    FoliageBlocks.FIREPROOF_GRASS.get());

            itemcolors.register((p_92705_, p_92706_) -> GrassColor.get(0.5D, 1.0D),
                    FoliageBlocks.FIREPROOF_TALL_GRASS.get(), FoliageBlocks.FIREPROOF_LARGE_FERN.get());
        }
        @SubscribeEvent
        @SuppressWarnings("deprecation")
        public static void clientSetup(FMLClientSetupEvent event) {
            ItemBlockRenderTypes.setRenderLayer(FoliageBlocks.FIREPROOF_GRASS.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(FoliageBlocks.FIREPROOF_TALL_GRASS.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(FoliageBlocks.FIREPROOF_FERN.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(FoliageBlocks.FIREPROOF_LARGE_FERN.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(FoliageBlocks.FIREPROOF_AZALEA.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(FoliageBlocks.FIREPROOF_FLOWERING_AZALEA.get(), RenderType.cutoutMipped());
        }
    }
    @Mod.EventBusSubscriber(modid = Unburned.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class CommonSetupEvents {}

    @Mod.EventBusSubscriber(modid = Unburned.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
    public static class ForgeEvents {}
}
