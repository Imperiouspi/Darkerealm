package com.imperiousindustries.darkerealm;

import net.minecraft.creativetab.CreativeTabs;

import com.imperiousindustries.darkerealm.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = DarkeRealm.MODID, version = DarkeRealm.VERSION)

public class DarkeRealm
{
	public static final String MODID = "darkerealm";
    public static final String VERSION = "0.1";
    
    @Instance(MODID)
    public static DarkeRealm instance;
    
    @SidedProxy(clientSide="com.imperiousindustries.darkerealm.proxy.ClientProxy", serverSide="com.imperiousindustries.darkerealm.proxy.CommonProxy")
    public static CommonProxy proxy;

    public static CreativeTabs darketab = new DarkeTab();
    @EventHandler
    public void PreInit(FMLPreInitializationEvent event)
    {
		DarkeBlocks.initBlocks();
		DarkeItems.initItems();
		DarkeEntities.registerEntities();
		proxy.registerRenderers();
    }
    @EventHandler
    public void Init(FMLInitializationEvent event){
    	DarkeRecipes.init();
    }
}