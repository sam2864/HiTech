package com.sam.FusTech.init;

import com.sam.FusTech.item.ItemMapleLeaf;
import com.sam.FusTech.item.ItemTesting;
import com.sam.FusTech.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;


@GameRegistry.ObjectHolder(Reference.MOD_ID) // Stops other mods tampering with this
public class ModItems
{
    public static final ItemTesting mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "MapleLeaf");
    }
}
