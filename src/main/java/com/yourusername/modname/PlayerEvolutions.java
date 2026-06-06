package com.yourusername.modname;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.yourusername.modname.util.RegistryHandler;
import net.minecraftforge.common.MinecraftForge;

@Mod("playerevolutions")
public class PlayerEvolutions {

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "playerevolutions";

    public PlayerEvolutions() {
        try {
            RegistryHandler.init();
        } catch (Exception e) {
            LOGGER.error("Failed to initialize registries", e);
            throw e;
        }

        try {
            FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
            FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
            MinecraftForge.EVENT_BUS.register(this);
        } catch (Exception e) {
            LOGGER.error("Failed to register event listeners", e);
            throw e;
        }

        LOGGER.info("{} initialized successfully", MOD_ID);
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("{} common setup starting", MOD_ID);
        try {
            // Common setup logic goes here
        } catch (Exception e) {
            LOGGER.error("Error during common setup", e);
            throw e;
        }
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        LOGGER.info("{} client setup starting", MOD_ID);
        try {
            // Client setup logic goes here
        } catch (Exception e) {
            LOGGER.error("Error during client setup", e);
            throw e;
        }
    }

    public static final ItemGroup TAB = new ItemGroup("playerEvolutions") {
        @Override
        public ItemStack makeIcon() {
            try {
                return new ItemStack(RegistryHandler.RUBY.get());
            } catch (Exception e) {
                LOGGER.error("Failed to create tab icon from RUBY registry object, falling back to barrier item", e);
                return new ItemStack(Items.BARRIER);
            }
        }
    };
}
