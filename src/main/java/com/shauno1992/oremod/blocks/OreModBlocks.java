package com.shauno1992.oremod.blocks;

import com.shauno1992.oremod.util.OreModLogger;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

public class OreModBlocks
{
	public static void init()
	{
		OreModLogger.info("OreModBlocks.init() - Initialising Blocks and Metadata Blocks!");
		initBlocks();
		registerBlocks();
		setCreativeTabs();
	}
	
	public static void initBlocks()
	{
		OreModLogger.info("OreModBlocks.initBlocks() - initialising blocks.");
	}
	
	public static void registerBlocks()
	{
        OreModLogger.info("OreModBlocks.registerBlocks() - registering blocks.");
	}

	public static void setCreativeTabs() 
	{
        OreModLogger.info("OreModBlocks.registerBlocks() - setting creative tabs.");
	}

}
