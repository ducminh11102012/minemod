package com.yourusername.modname.util;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.RegistryObject;

import static org.junit.jupiter.api.Assertions.*;

class RegistryHandlerTest {

    @Test
    void itemsFieldShouldBePublicStaticFinal() throws NoSuchFieldException {
        Field field = RegistryHandler.class.getDeclaredField("ITEMS");
        assertTrue(Modifier.isPublic(field.getModifiers()));
        assertTrue(Modifier.isStatic(field.getModifiers()));
        assertTrue(Modifier.isFinal(field.getModifiers()));
    }

    @Test
    void blocksFieldShouldBePublicStaticFinal() throws NoSuchFieldException {
        Field field = RegistryHandler.class.getDeclaredField("BLOCKS");
        assertTrue(Modifier.isPublic(field.getModifiers()));
        assertTrue(Modifier.isStatic(field.getModifiers()));
        assertTrue(Modifier.isFinal(field.getModifiers()));
    }

    @Test
    void itemsFieldShouldBeDeferredRegister() throws NoSuchFieldException {
        Field field = RegistryHandler.class.getDeclaredField("ITEMS");
        assertEquals(DeferredRegister.class, field.getType());
    }

    @Test
    void blocksFieldShouldBeDeferredRegister() throws NoSuchFieldException {
        Field field = RegistryHandler.class.getDeclaredField("BLOCKS");
        assertEquals(DeferredRegister.class, field.getType());
    }

    @Test
    void rubyFieldShouldExist() throws NoSuchFieldException {
        Field field = RegistryHandler.class.getDeclaredField("RUBY");
        assertTrue(Modifier.isPublic(field.getModifiers()));
        assertTrue(Modifier.isStatic(field.getModifiers()));
        assertTrue(Modifier.isFinal(field.getModifiers()));
    }

    @Test
    void rubyBlockFieldShouldExist() throws NoSuchFieldException {
        Field field = RegistryHandler.class.getDeclaredField("RUBY_BLOCK");
        assertTrue(Modifier.isPublic(field.getModifiers()));
        assertTrue(Modifier.isStatic(field.getModifiers()));
        assertTrue(Modifier.isFinal(field.getModifiers()));
    }

    @Test
    void rubyBlockItemFieldShouldExist() throws NoSuchFieldException {
        Field field = RegistryHandler.class.getDeclaredField("RUBY_BLOCK_ITEM");
        assertTrue(Modifier.isPublic(field.getModifiers()));
        assertTrue(Modifier.isStatic(field.getModifiers()));
        assertTrue(Modifier.isFinal(field.getModifiers()));
    }

    @Test
    void initMethodShouldExistAndBePublicStatic() throws NoSuchMethodException {
        Method method = RegistryHandler.class.getDeclaredMethod("init");
        assertTrue(Modifier.isPublic(method.getModifiers()));
        assertTrue(Modifier.isStatic(method.getModifiers()));
    }

    @Test
    void initMethodShouldReturnVoid() throws NoSuchMethodException {
        Method method = RegistryHandler.class.getDeclaredMethod("init");
        assertEquals(void.class, method.getReturnType());
    }
}
