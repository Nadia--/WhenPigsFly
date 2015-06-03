package com.nadia.flyingpig;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.nadia.flyingpig.proxy.CommonProxy;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION)
public class FlyingPigMod {

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) 
    {
    	FlyingPigItems.init();
    	FlyingPigItems.register();
    	FlyingPigItems.registerRecipes();
    }
    
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.registerRenders();
    } 
    
    @EventHandler
    public void postInit(FMLInitializationEvent event) {
    	
    
    }
    
}

