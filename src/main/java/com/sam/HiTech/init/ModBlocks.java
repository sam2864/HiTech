package com.sam.hitech.init;

import com.sam.hitech.block.BlockFlag;
import com.sam.hitech.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;


@GameRegistry.ObjectHolder(Reference.MOD_ID) // Stops other mods tampering with this
public class ModBlocks
{
    public static BlockFlag flag = new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
    }
}
