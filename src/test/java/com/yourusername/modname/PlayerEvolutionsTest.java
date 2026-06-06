package com.yourusername.modname;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

class PlayerEvolutionsTest {

    @Test
    void modIdShouldBePlayerevolutions() {
        assertEquals("playerevolutions", PlayerEvolutions.MOD_ID);
    }

    @Test
    void modIdFieldShouldBeStaticFinal() throws NoSuchFieldException {
        Field field = PlayerEvolutions.class.getDeclaredField("MOD_ID");
        assertTrue(Modifier.isStatic(field.getModifiers()));
        assertTrue(Modifier.isFinal(field.getModifiers()));
        assertTrue(Modifier.isPublic(field.getModifiers()));
    }

    @Test
    void classShouldHaveModAnnotation() {
        assertTrue(PlayerEvolutions.class.isAnnotationPresent(
                net.minecraftforge.fml.common.Mod.class));
    }

    @Test
    void modAnnotationValueShouldMatchModId() {
        net.minecraftforge.fml.common.Mod annotation =
                PlayerEvolutions.class.getAnnotation(net.minecraftforge.fml.common.Mod.class);
        assertEquals("playerevolutions", annotation.value());
    }

    @Test
    void tabFieldShouldExistAndBePublicStaticFinal() throws NoSuchFieldException {
        Field field = PlayerEvolutions.class.getDeclaredField("TAB");
        assertTrue(Modifier.isStatic(field.getModifiers()));
        assertTrue(Modifier.isFinal(field.getModifiers()));
        assertTrue(Modifier.isPublic(field.getModifiers()));
    }

    @Test
    void loggerFieldShouldExist() throws NoSuchFieldException {
        Field field = PlayerEvolutions.class.getDeclaredField("LOGGER");
        assertTrue(Modifier.isStatic(field.getModifiers()));
        assertTrue(Modifier.isFinal(field.getModifiers()));
        assertTrue(Modifier.isPrivate(field.getModifiers()));
    }

    @Test
    void classShouldHaveSetupMethod() throws NoSuchMethodException {
        assertNotNull(PlayerEvolutions.class.getDeclaredMethod(
                "setup", net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent.class));
    }

    @Test
    void classShouldHaveDoClientStuffMethod() throws NoSuchMethodException {
        assertNotNull(PlayerEvolutions.class.getDeclaredMethod(
                "doClientStuff", net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent.class));
    }

    @Test
    void setupMethodShouldBePrivate() throws NoSuchMethodException {
        java.lang.reflect.Method method = PlayerEvolutions.class.getDeclaredMethod(
                "setup", net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent.class);
        assertTrue(Modifier.isPrivate(method.getModifiers()));
    }

    @Test
    void doClientStuffMethodShouldBePrivate() throws NoSuchMethodException {
        java.lang.reflect.Method method = PlayerEvolutions.class.getDeclaredMethod(
                "doClientStuff", net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent.class);
        assertTrue(Modifier.isPrivate(method.getModifiers()));
    }
}
