package com.imperiousindustries.darkerealm;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.DimensionManager;

import com.imperiousindustries.darkerealm.proxy.ClientProxy;
import com.imperiousindustries.darkerealm.realm.WorldProviderDarkeWorld;

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
    public static final String NAME = "darkerealm";
    
    public static final int DarkeDimID = -6;
        
    @Instance(MODID)
    public static DarkeRealm instance;
    
    @SidedProxy(clientSide="com.imperiousindustries.darkerealm.proxy.ClientProxy", serverSide="com.imperiousindustries.darkerealm.proxy.CommonProxy")
    public static ClientProxy proxy;

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
    	//register generation here
    	DarkeOres.init();
    	DarkeGen.init();
    	DarkeBiomes.initBiomes();
    	DimensionManager.registerProviderType(DarkeDimID, WorldProviderDarkeWorld.class, false);
    	DimensionManager.registerDimension(DarkeDimID, DarkeDimID);
    	DarkeRecipes.init();
    }
}