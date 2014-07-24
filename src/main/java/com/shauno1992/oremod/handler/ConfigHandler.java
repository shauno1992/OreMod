package com.shauno1992.oremod.handler;

import com.shauno1992.oremod.reference.Reference;
import com.shauno1992.oremod.util.OreModLogger;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;
import java.io.FileNotFoundException;

public class ConfigHandler {
    public static Configuration config;
    public static boolean testVal=false;

    public static void init(File configFile) {
        OreModLogger.info("ConfigHandler.init() - Configs are being initialised");
        if (config == null)
            config = new Configuration(configFile);
    }

    public void loadConfig()
    {
        OreModLogger.info("Creating dummy config value!");
        testVal = config.getBoolean("configVal", Configuration.CATEGORY_GENERAL, false, "Example config value");

        //If changes detected, save.
        if (config.hasChanged())
        {
            config.save();
        }
    }

    //Subscribe event to Forge, allowing us to listen for an event.
    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            //Resync configs.
            loadConfig();
        }
    }
}
