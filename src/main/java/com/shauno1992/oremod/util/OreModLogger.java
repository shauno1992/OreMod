package com.shauno1992.oremod.util;

import com.shauno1992.oremod.reference.Reference;
import cpw.mods.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

public class OreModLogger {
    public static void log(Level logLevel, Object o)
    {
        FMLLog.log(Reference.MOD_NAME,logLevel,String.valueOf(o));
    }

    public static void all(Object o){log(Level.ALL,o);}

    public static void debug(Object o){log(Level.DEBUG,o);}

    public static void error(Object o){log(Level.ERROR,o);}

    public static void fatal(Object o){log(Level.FATAL,o);}

    public static void info(Object o){log(Level.INFO,o);}

    public static void off(Object o){log(Level.OFF,o);}

    public static void trace(Object o){log(Level.TRACE,o);}

    public static void warn(Object o){log(Level.WARN,o);}

}
