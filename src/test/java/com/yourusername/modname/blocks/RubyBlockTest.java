package com.yourusername.modname.blocks;

import net.minecraft.block.Block;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

class RubyBlockTest {

    @Test
    void shouldExtendBlock() {
        assertTrue(Block.class.isAssignableFrom(RubyBlock.class));
    }

    @Test
    void shouldHaveNoArgConstructor() throws NoSuchMethodException {
        Constructor<RubyBlock> ctor = RubyBlock.class.getDeclaredConstructor();
        assertTrue(Modifier.isPublic(ctor.getModifiers()));
    }

    @Test
    void classShouldBePublic() {
        assertTrue(Modifier.isPublic(RubyBlock.class.getModifiers()));
    }

    @Test
    void classShouldNotBeAbstract() {
        assertFalse(Modifier.isAbstract(RubyBlock.class.getModifiers()));
    }

    @Test
    void classShouldNotBeFinal() {
        assertFalse(Modifier.isFinal(RubyBlock.class.getModifiers()));
    }
}
