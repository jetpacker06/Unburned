package com.jetpacker06.unburned.vanilla.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab UNBURNED = new CreativeModeTab("Unburned") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemsAll.FIREPROOFING.get());
        }
    };
}