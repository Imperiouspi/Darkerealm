package com.imperiousindustries.darkerealm.entities;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderHermit extends RenderBiped{
	private static final ResourceLocation textureLocation = new ResourceLocation("darkerealm:textures/models/hermit.png");
	
	public RenderHermit(ModelBiped model, float shadowSize){
		super(model, shadowSize);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity){
		return textureLocation;
	}
}