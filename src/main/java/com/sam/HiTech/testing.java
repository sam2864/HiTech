package com.sam.hitech;


import com.sam.hitech.client.handler.KeyInputEventHandler;
import com.sam.hitech.handler.ConfigHandler;
import com.sam.hitech.init.ModBlocks;
import com.sam.hitech.init.ModItems;
import com.sam.hitech.init.Recipe;
import com.sam.hitech.proxy.IProxy;
import com.sam.hitech.reference.Reference;
import com.sam.hitech.utility.LogHelper;
import com.sam.hitech.utility.OredictHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class testing
{
    @Mod.Instance(Reference.MOD_ID)
    public static testing instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        LogHelper.info("Loading " + Reference.MOD_NAME);
        ConfigHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());

        ModItems.init();
        ModBlocks.init();
        proxy.registerKeyBindings();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        Recipe.init();
        FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());


    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        if(ConfigHandler.DumpItemsToConsole)
        {
            OredictHelper.dumpAllItems();
        }
    }
}
