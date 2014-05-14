package com.imperiousindustries.darkerealm.entities.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelEagle extends ModelBase{
	public ModelRenderer Head;
	public ModelRenderer BeakBack;
	public ModelRenderer BeakMiddleBottom;
	public ModelRenderer BeakMiddleTop;
	public ModelRenderer BeakPoint;
	public ModelRenderer Body;
	public ModelRenderer LWing;
	public ModelRenderer RWing;
	public ModelRenderer LFoot;
	public ModelRenderer RFoot;
	public ModelRenderer Tail;
	
	 private static final String __OBFID = "CL_00000900";
	
	public ModelEagle(){
		int height = 20;
		Head = new ModelRenderer(this, 0, 0);
		Head.addBox(-4F, -2F, -4F, 4, 4, 4);
		Head.setRotationPoint(0.0F, -2.0F + height, 0.0F);
		Head.setTextureOffset(16, 0).addBox(-5F, -1F, -3F, 6, 2, 2);
		Head.setTextureOffset(32, 0).addBox(-3F, -1F, -3F, 2, 2, 4);
		
		BeakBack = new ModelRenderer(this, 0, 8);
		BeakBack.addBox(-3F, -2F, -5F, 2, 2, 1);
		BeakBack.setRotationPoint(0.0F, 0.0F + height, 0F);
		BeakMiddleBottom = new ModelRenderer(this, 12, 8);
		BeakMiddleBottom.addBox(-3F, -1F, -6F, 2, 1, 1);
		BeakMiddleBottom.setRotationPoint(0.0F, -0.3F + height, 0.1F);
		BeakMiddleTop = new ModelRenderer(this, 18, 8);
		BeakMiddleTop.addBox(-3F, -2F, -6F, 2, 1, 1);
		BeakMiddleTop.setRotationPoint(0.0F, 0.4F + height, 0.4F);
		BeakPoint = new ModelRenderer(this, 6, 8);
		BeakPoint.addBox(-3F, -1F, -7F, 2, 1, 1);
		BeakPoint.setRotationPoint(0.0F, 0.2F + height, 0.5F);
		
		Body = new ModelRenderer(this, 0, 11);
		Body.rotateAngleY = 0.5F;
		Body.addBox(-2F, 10F, -2F, 4, 7, 4);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
	}
	
	@Override
	public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7){
		Head.render(par7);
		BeakBack.render(par7);
		BeakMiddleBottom.render(par7);
		BeakMiddleTop.render(par7);
		BeakPoint.render(par7);
		Body.renderWithRotation(0.1F);
	}
}