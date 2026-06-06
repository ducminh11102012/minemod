package com.yourusername.modname.util;

import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import com.yourusername.modname.PlayerEvolutions;

public final class ModUtil {

    private ModUtil() {}

    public static Item.Properties defaultItemProperties() {
        return new Item.Properties().tab(PlayerEvolutions.TAB);
    }

    public static IEventBus getModEventBus() {
        return FMLJavaModLoadingContext.get().getModEventBus();
    }
}
