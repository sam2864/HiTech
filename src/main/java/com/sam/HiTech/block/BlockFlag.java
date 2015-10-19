package com.sam.hitech.block;

import com.sam.hitech.creativetab.CreativeTabHiTech;

public class BlockFlag extends BlockHiTech

{
    public BlockFlag()
    {
        super();
        this.setBlockName("flag");
        this.setCreativeTab(CreativeTabHiTech.TEST_TAB);
        this.setHarvestLevel("ItemPickaxe", 2);
        this.setHardness(4);
    }
}
