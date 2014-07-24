package com.shauno1992.oremod.client.gui;

import com.shauno1992.oremod.handler.ConfigHandler;
import com.shauno1992.oremod.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import java.util.List;

/**
 * Created by Adrian on 25/07/2014.
 */
public class OreModGuiConfig extends GuiConfig
{

    public OreModGuiConfig(GuiScreen guiScreen)
    {
        /**
         * GuiConfig constructor that will use ConfigChangedEvent when editing is concluded. This constructor passes null for configID.
         * If configID is not defined, the events will be posted if the parent gui is null or if the parent gui is not an instance of GuiConfig.
         *
         * @param guiScreen the parent GuiScreen object
         * @param configElements a List of IConfigProperty objects
         * @param modID the mod ID for the mod whose config settings will be edited
         * @param allRequireWorldRestart send true if all configElements on this screen require a world restart
         * @param allRequireMcRestart send true if all configElements on this screen require MC to be restarted
         * @param title the desired title for this screen. For consistency it is recommended that you pass the path of the config file being
         *            edited.
         */
        super(guiScreen,
                new ConfigElement(ConfigHandler.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements()
                , Reference.MOD_ID
                , false
                , false
                , GuiConfig.getAbridgedConfigPath(ConfigHandler.config.toString()));

    }
}
