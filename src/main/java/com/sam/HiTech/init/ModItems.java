package com.sam.hitech.init;

import com.sam.hitech.item.ItemMapleLeaf;
import com.sam.hitech.item.ItemHiTech;
import com.sam.hitech.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;


@GameRegistry.ObjectHolder(Reference.MOD_ID) // Stops other mods tampering with this
public class ModItems
{
    public static final ItemHiTech mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "MapleLeaf");
    }
}
