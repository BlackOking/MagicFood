package com.blackoking.magicfood;

import org.apache.logging.log4j.Logger;

import com.blackoking.magicfood.proxy.MagicFoodCommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "magicfood", name = "MagicFood", version = "0.1", acceptedMinecraftVersions = "[1.10.1,1.10.2]")
public class ModMagicFood
{
    public static final String MODID = "magicfood";
    
    @Instance(ModMagicFood.MODID)
    public static ModMagicFood instance;
    
    @SidedProxy(clientSide = "com.blackoking.magicfood.proxy.MagicFoodClientProxy", serverSide = "com.blackoking.magicfood.proxy.MagicFoodServerProxy")
    public static MagicFoodCommonProxy proxy;
    
    public static Logger logger;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog(); // initialise le logger.  event.getModLog() retourne un logger avec votre modid
        proxy.preInit(event.getSuggestedConfigurationFile());
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init();
    }
}
