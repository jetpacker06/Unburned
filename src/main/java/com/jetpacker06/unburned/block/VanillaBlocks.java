package com.jetpacker06.unburned.block;

import com.jetpacker06.unburned.FireproofWoodType;
import net.minecraftforge.eventbus.api.IEventBus;

import static com.jetpacker06.unburned.FireproofWoodType.registerFireproofWoodType;

public class VanillaBlocks {
    public static void registerVanillaFireproofWoodTypes(IEventBus eventBus) {
        FireproofWoodType OAK = registerFireproofWoodType("oak", 0, eventBus);
        FireproofWoodType DARK_OAK = registerFireproofWoodType("dark_oak", 0, eventBus);
        FireproofWoodType BIRCH = registerFireproofWoodType("acacia", 0, eventBus);
        FireproofWoodType SPRUCE = registerFireproofWoodType("spruce", 0, eventBus);
        FireproofWoodType JUNGLE = registerFireproofWoodType("birch", 0, eventBus);
        FireproofWoodType ACACIA = registerFireproofWoodType("jungle", 0, eventBus);
    }
}