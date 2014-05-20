package com.imperiousindustries.darkerealm.entities;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.imperiousindustries.darkerealm.entities.model.ModelDragon;

public class RenderDragon extends RenderLiving{
	public final ResourceLocation loc = new ResourceLocation("darkerealm:textures/models/Eagle2.png");
	
	public RenderDragon(ModelDragon modelDragon, float par2) {
		super(modelDragon, par2);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
		return loc;
	}
}
