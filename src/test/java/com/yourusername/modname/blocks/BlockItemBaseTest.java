package com.yourusername.modname.blocks;

import net.minecraft.item.BlockItem;
import net.minecraft.block.Block;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

class BlockItemBaseTest {

    @Test
    void shouldExtendBlockItem() {
        assertTrue(BlockItem.class.isAssignableFrom(BlockItemBase.class));
    }

    @Test
    void shouldHaveBlockArgConstructor() throws NoSuchMethodException {
        Constructor<BlockItemBase> ctor = BlockItemBase.class.getDeclaredConstructor(Block.class);
        assertTrue(Modifier.isPublic(ctor.getModifiers()));
    }

    @Test
    void classShouldBePublic() {
        assertTrue(Modifier.isPublic(BlockItemBase.class.getModifiers()));
    }

    @Test
    void classShouldNotBeAbstract() {
        assertFalse(Modifier.isAbstract(BlockItemBase.class.getModifiers()));
    }

    @Test
    void classShouldNotBeFinal() {
        assertFalse(Modifier.isFinal(BlockItemBase.class.getModifiers()));
    }
}
