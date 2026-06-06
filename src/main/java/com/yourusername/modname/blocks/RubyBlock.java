package com.yourusername.modname.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class RubyBlock extends Block {
    public RubyBlock() {
        super(Block.Properties.of(Material.METAL)
            .harvestTool(ToolType.PICKAXE)
        );
    }
}
