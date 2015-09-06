package com.sam.FusTech.creativetab;

import com.sam.FusTech.init.ModItems;
import com.sam.FusTech.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabTesting {
    public static final CreativeTabs TEST_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return ModItems.mapleLeaf;
        }
    };
}
