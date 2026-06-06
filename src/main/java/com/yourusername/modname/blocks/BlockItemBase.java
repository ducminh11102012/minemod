package com.yourusername.modname.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import com.yourusername.modname.util.ModUtil;

public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block block) {
        super(block, ModUtil.defaultItemProperties());
    }
}
