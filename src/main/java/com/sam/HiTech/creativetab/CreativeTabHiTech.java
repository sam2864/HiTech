package com.sam.hitech.creativetab;

import com.sam.hitech.init.ModItems;
import com.sam.hitech.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabHiTech {
    public static final CreativeTabs TEST_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return ModItems.mapleLeaf;
        }
    };
}
