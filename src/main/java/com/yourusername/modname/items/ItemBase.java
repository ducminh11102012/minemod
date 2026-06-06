package com.yourusername.modname.items;

import net.minecraft.item.Item;
import com.yourusername.modname.PlayerEvolutions;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().tab(PlayerEvolutions.TAB));
    }
}
