package com.imperiousindustries.darkerealm.proxy;

import net.minecraft.client.model.ModelBiped;

import com.imperiousindustries.darkerealm.entities.EntityHermit;
import com.imperiousindustries.darkerealm.entities.RenderHermit;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenderers(){
		RenderingRegistry.registerEntityRenderingHandler(EntityHermit.class, new RenderHermit(new ModelBiped(), 0.5F));
	}
}
