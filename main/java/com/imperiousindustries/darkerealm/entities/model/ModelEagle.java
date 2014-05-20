package com.imperiousindustries.darkerealm.entities.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
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
	public ModelRenderer RWing;
	public ModelRenderer LWing;
	public ModelRenderer LFoot;
	public ModelRenderer RFoot;
	public ModelRenderer Tail;
	
	 private static final String __OBFID = "CL_00000900";
	
	public ModelEagle(){
		float height = 12.0F;
		float centerz = 1F;
		float centerx = 1F;
		Head = new ModelRenderer(this, 0, 0);
		Head.addBox(-4F + centerx, -1F + height, -4F + centerz, 4, 5, 4);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.setTextureOffset(16, 0).addBox(-5F + centerx, 0.0F + height, -3F + centerz, 6, 2, 2);
		Head.setTextureOffset(32, 0).addBox(-3F + centerx, 0.0F + height, -3F + centerz, 2, 2, 4);
		
		BeakBack = new ModelRenderer(this, 0, 9);
		BeakBack.addBox(-3F + centerx, 1F + height, -5F + centerz, 2, 2, 1);
		BeakBack.setRotationPoint(0.0F, 0.0F, 0.0F);
		BeakMiddleBottom = new ModelRenderer(this, 12, 9);
		BeakMiddleBottom.addBox(-3F + centerx, 2F -0.3F + height, -6F + 0.1F + centerz, 2, 1, 1);
		BeakMiddleBottom.setRotationPoint(0.0F, 0.0F, 0.0F);
		BeakMiddleTop = new ModelRenderer(this, 18, 9);
		BeakMiddleTop.addBox(-3F + centerx, 1F + 0.4F + height, -6F + 0.4F + centerz, 2, 1, 1);
		BeakMiddleTop.setRotationPoint(0.0F, 0.0F, 0.0F);
		BeakPoint = new ModelRenderer(this, 6, 9);
		BeakPoint.addBox(-3F + centerx, 2F + 0.2F + height, -7F + 0.5F + centerz, 2, 1, 1);
		BeakPoint.setRotationPoint(0.0F, 0.0F, 0.0F);
		
		Body = new ModelRenderer(this, 0, 12);
		//Body.rotateAngleY = 0.5F;
		Body.addBox(-4F + centerx, 3F + height, -3.5F + centerz, 4, 7, 4);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.rotateAngleX = 0.1F;

		LWing = new ModelRenderer(this, 0, 23);
		LWing.addBox(0F + centerx, 4F, 2.0F + centerz, 1, 5, 3);
		LWing.setTextureOffset(8, 23).addBox(1F + centerx, 4F, 2.0F + centerz, 1, 2, 2);
		LWing.setTextureOffset(14, 23).addBox(0F + centerx, 4F, 2.0F + centerz, 1, 6, 2);
		LWing.setRotationPoint(0.0F, height, -4.0F);
		
		RWing = new ModelRenderer(this, 20, 23);
		RWing.addBox(0.0F + centerx, 4F, 2.0F + centerz, 1, 5, 3);
		RWing.setTextureOffset(28, 23).addBox(-1F + centerx, 4F, 2.0F + centerz, 1, 2, 2);
		RWing.setTextureOffset(34, 23).addBox(0.0F + centerx, 4F, 2.0F + centerz, 1, 6, 2);
		RWing.setRotationPoint(-5F, height, -4.0F);
		
		LFoot = new ModelRenderer(this, 44, 0);
		LFoot.addBox(0.0F + centerx, 0.0F, 0.0F + centerz, 3, 2, 2);
		LFoot.setRotationPoint(-5.0F, 10.0F + height, 0.0F);
		
		RFoot = new ModelRenderer(this, 54, 0);
		RFoot.addBox(0.0F + centerx, 0.0F, 0.0F + centerz, 3, 2, 2);
		RFoot.setRotationPoint(-2.0F, 10.0F + height, 0.0F);
		
		Tail = new ModelRenderer(this, 30, 10);
		Tail.addBox(0.0F, 0.0F, 0.0F, 2, 3, 1);
		Tail.setRotationPoint(0.0F, 11.0F + height, 4F);
	}
	
	@Override
	public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7){
		this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		this.Head.render(par7);
		this.BeakBack.render(par7);
		this.BeakMiddleBottom.render(par7);
		this.BeakMiddleTop.render(par7);
		this.BeakPoint.render(par7);
		this.Body.render(par7);
		this.LWing.render(par7);
		this.RWing.render(par7);
		this.LFoot.render(par7);
		this.RFoot.render(par7);
		this.Tail.render(par7);
	}
	
	
	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
    {
		this.Head.rotateAngleX = par5 / (10F / (float)Math.PI);
		this.Head.rotateAngleY = par4 / (10F / (float)Math.PI);
		this.BeakBack.rotateAngleX = Head.rotateAngleX;
		this.BeakBack.rotateAngleY = Head.rotateAngleY;
		this.BeakMiddleBottom.rotateAngleX = Head.rotateAngleX;
		this.BeakMiddleBottom.rotateAngleY = Head.rotateAngleY;
		this.BeakMiddleTop.rotateAngleX = Head.rotateAngleX;
		this.BeakMiddleTop.rotateAngleY = Head.rotateAngleY;
		this.BeakPoint.rotateAngleX = Head.rotateAngleX;
		this.BeakPoint.rotateAngleY = Head.rotateAngleY;
		this.RFoot.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		this.LFoot.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		this.RWing.rotateAngleX = 0.2F;
		//this.RWing.rotateAngleZ = par3 / 50;
		this.LWing.rotateAngleX = 0.2F;
		//this.LWing.rotateAngleZ = -par3 / 50;
    }
}