package com.yourusername.modname.util;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.RegistryObject;
import net.minecraft.item.Item;
import net.minecraft.block.Block;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.yourusername.modname.PlayerEvolutions;
import com.yourusername.modname.items.ItemBase;
import com.yourusername.modname.blocks.RubyBlock;
import com.yourusername.modname.blocks.BlockItemBase;

public class RegistryHandler {

    private static final Logger LOGGER = LogManager.getLogger();

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PlayerEvolutions.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, PlayerEvolutions.MOD_ID);

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> {
        Block block = RUBY_BLOCK.get();
        if (block == null) {
            throw new IllegalStateException("RUBY_BLOCK registry object resolved to null during RUBY_BLOCK_ITEM registration");
        }
        return new BlockItemBase(block);
    });

    public static void init() {
        try {
            ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        } catch (Exception e) {
            LOGGER.error("Failed to register ITEMS deferred register", e);
            throw e;
        }

        try {
            BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        } catch (Exception e) {
            LOGGER.error("Failed to register BLOCKS deferred register", e);
            throw e;
        }

        LOGGER.info("Registry initialization complete for mod '{}'", PlayerEvolutions.MOD_ID);
    }
}
