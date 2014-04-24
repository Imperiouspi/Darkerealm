package com.imperiousindustries.darkerealm.proxy;

import net.minecraft.client.model.ModelBiped;

import com.imperiousindustries.darkerealm.entities.EntityEagle;
import com.imperiousindustries.darkerealm.entities.EntityHermit;
import com.imperiousindustries.darkerealm.entities.RenderEagle;
import com.imperiousindustries.darkerealm.entities.RenderHermit;
import com.imperiousindustries.darkerealm.entities.model.ModelEagle;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenderers(){
		RenderingRegistry.registerEntityRenderingHandler(EntityHermit.class, new RenderHermit(new ModelBiped(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityEagle.class, new RenderEagle(new ModelEagle(), 0.5F));
	}
}
