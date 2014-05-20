package com.imperiousindustries.darkerealm.entities;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.imperiousindustries.darkerealm.entities.model.ModelEagle;

public class RenderEagle extends RenderLiving{
	public final ResourceLocation loc = new ResourceLocation("darkerealm:textures/models/Eagle.png");
	
	public RenderEagle(ModelEagle model, float par2) {
		super(model, par2);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
		return loc;
	}
}
