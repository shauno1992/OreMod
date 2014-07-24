package com.shauno1992.oremod;

import com.shauno1992.oremod.handler.ConfigHandler;
import com.shauno1992.oremod.util.OreModLogger;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import com.shauno1992.oremod.proxy.IProxy;
import com.shauno1992.oremod.reference.Reference;

@Mod(modid=Reference.MOD_ID,name=Reference.MOD_NAME, version=Reference.VERSION,guiFactory=Reference.GUI_FACTORY_CLASS)
public class OreMod
{
    @Mod.Instance(Reference.MOD_ID)
    public static OreMod Instance;

    @SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS,serverSide=Reference.SERVER_PROXY_CLASS,modId=Reference.MOD_ID)
    public static IProxy proxy;

    @Mod.EventHandler
    public void FMLPreInitializationEvent(FMLPreInitializationEvent event)
    {

        ConfigHandler.init(event.getSuggestedConfigurationFile());
        OreModLogger.info("Starting Pre-Init complete!");
    }

    @Mod.EventHandler
    public void FMLInitializationEvent(FMLInitializationEvent event)
    {
        OreModLogger.info("Init complete!");
    }

    @Mod.EventHandler
    public void FMLPostInitializationEvent(FMLPostInitializationEvent event)
    {
        OreModLogger.info("Post-Init complete!");
    }
}
