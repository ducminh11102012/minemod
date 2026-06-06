package com.yourusername.modname.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import com.yourusername.modname.PlayerEvolutions;

public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block block) {
        super(block, new Item.Properties().tab(PlayerEvolutions.TAB));
    }
}
