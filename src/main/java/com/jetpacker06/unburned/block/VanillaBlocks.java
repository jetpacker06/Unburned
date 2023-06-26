package com.jetpacker06.unburned.block;

import com.jetpacker06.unburned.FireproofWoodType;
import net.minecraftforge.eventbus.api.IEventBus;

public class VanillaBlocks {
    public static void registerVanillaFireproofWoodTypes(IEventBus eventBus) {
        //Instantiate the FireproofWoodType class several times to create all the blocks automatically
        FireproofWoodType OAK = registerFireproofWoodType("oak", eventBus);
        FireproofWoodType DARK_OAK = registerFireproofWoodType("dark_oak", eventBus);
        FireproofWoodType BIRCH = registerFireproofWoodType("acacia", eventBus);
        FireproofWoodType SPRUCE = registerFireproofWoodType("spruce", eventBus);
        FireproofWoodType JUNGLE = registerFireproofWoodType("birch", eventBus);
        FireproofWoodType ACACIA = registerFireproofWoodType("jungle", eventBus);
    }

    public static FireproofWoodType registerFireproofWoodType(String name, IEventBus eventBus) {
        FireproofWoodType toReturn = new FireproofWoodType(name);
        toReturn.registerWoodType(eventBus);
        return toReturn;
    }
}