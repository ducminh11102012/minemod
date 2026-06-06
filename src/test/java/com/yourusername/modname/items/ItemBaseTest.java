package com.yourusername.modname.items;

import net.minecraft.item.Item;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

class ItemBaseTest {

    @Test
    void shouldExtendItem() {
        assertTrue(Item.class.isAssignableFrom(ItemBase.class));
    }

    @Test
    void shouldHaveNoArgConstructor() throws NoSuchMethodException {
        Constructor<ItemBase> ctor = ItemBase.class.getDeclaredConstructor();
        assertTrue(Modifier.isPublic(ctor.getModifiers()));
    }

    @Test
    void classShouldBePublic() {
        assertTrue(Modifier.isPublic(ItemBase.class.getModifiers()));
    }

    @Test
    void classShouldNotBeAbstract() {
        assertFalse(Modifier.isAbstract(ItemBase.class.getModifiers()));
    }

    @Test
    void classShouldNotBeFinal() {
        assertFalse(Modifier.isFinal(ItemBase.class.getModifiers()));
    }
}
