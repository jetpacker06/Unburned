package com.jetpacker06.unburned.block;

import com.jetpacker06.unburned.FireproofWoodType;
import net.minecraftforge.eventbus.api.IEventBus;

public class VanillaBlocks {
    public static void registerVanillaFireproofWoodTypes(IEventBus eventBus) {
        OAK = registerFireproofWoodType("oak", eventBus);
        DARK_OAK = registerFireproofWoodType("dark_oak", eventBus);
        BIRCH = registerFireproofWoodType("acacia", eventBus);
        SPRUCE = registerFireproofWoodType("spruce", eventBus);
        JUNGLE = registerFireproofWoodType("birch", eventBus);
        ACACIA = registerFireproofWoodType("jungle", eventBus);
    }

    public static FireproofWoodType registerFireproofWoodType(String name, IEventBus eventBus) {
        FireproofWoodType toReturn = new FireproofWoodType(name);
        toReturn.registerWoodType(eventBus);
        return toReturn;
    }
    public static FireproofWoodType OAK;
    public static FireproofWoodType DARK_OAK;
    public static FireproofWoodType BIRCH;
    public static FireproofWoodType SPRUCE;
    public static FireproofWoodType JUNGLE;
    public static FireproofWoodType ACACIA;
}