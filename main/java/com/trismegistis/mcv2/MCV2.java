package com.trismegistis.mcv2;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MCV2.MODID, version = MCV2.VERSION)
public class MCV2
{
    public static final String MODID = "minecraftversion2";
    public static final String VERSION = "1.01";
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	System.out.println("Beginning Pre-Init Events...");
    	System.out.println("Beginning Pre-Init Events...");
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	System.out.println("Beginning Init Events...");
    	System.out.println("Beginning Init Events...");
    }
}