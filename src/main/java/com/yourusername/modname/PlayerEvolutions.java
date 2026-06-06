package com.yourusername.modname;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.FMLJavaModLoadingContext;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.yourusername.modname.util.RegistryHandler;
import net.minecraftforge.common.MinecraftForge;

@Mod("playerevolutions")
public class PlayerEvolutions {

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "playerevolutions";

    public PlayerEvolutions() {
        RegistryHandler.init();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }

    public static final ItemGroup TAB = new ItemGroup("playerEvolutions") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.RUBY.get());
        }
    };
}
