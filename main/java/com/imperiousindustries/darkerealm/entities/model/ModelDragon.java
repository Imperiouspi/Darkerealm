package com.imperiousindustries.darkerealm.entities.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.Entity;

public class ModelDragon extends ModelBase{
	public ModelRenderer Foot;
	public ModelRenderer[][] Claw;
	
	public ModelDragon(){
		final float HEIGHT = 22.86F;
				
		Tessellator tess = Tessellator.instance;
		Foot = new ModelRenderer(this, 0, 0);
		Foot.addBox(0.0F, 0.0F + HEIGHT - 5, 0.0F, 20, 5, 20);
		Foot.setRotationPoint(-10.0F, 0.0F, -10.0F);
		
		Claw = new ModelRenderer[4][4];
		for(int i = 0; i < 4; i++){
			Claw[0][i] = new ModelRenderer(this);
			Claw[0][i].addBox(5-(i) * 5, 6.0F - HEIGHT, 15.0F, 3, 10 ,3);
			Claw[0][i].setRotationPoint(0.0F, 0.0F, 0.0F);
		}
		
		for(int i = 0; i < 4; i++){
			Claw[1][i] = new ModelRenderer(this);
			Claw[1][i].addBox(5-i * 5, -6.0F - HEIGHT, 15.0F, 3, 10, 3);
		}
	}
	
	@Override
	public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7){
		Foot.render(par7);
		for(int i = 0; i < 4; i++){
			Claw[0][i].rotateAngleX = 45;
		}
		
		Claw[0][0].rotateAngleY = -5;
		Claw[0][1].rotateAngleY = 0;
		Claw[0][2].rotateAngleY = 0;
		Claw[0][3].rotateAngleY = 5;
		Claw[1][0].rotateAngleY = -5;
		Claw[1][1].rotateAngleY = 0;
		Claw[1][2].rotateAngleY = 0;
		Claw[1][3].rotateAngleY = 5;
		
		for(int i = 0; i < 4; i++){
			Claw[1][i].rotateAngleX = -45;
		}
		
		for(int j = 0; j < 2; j++){
			for(int i = 0; i < 4; i++){
				Claw[j][i].render(par7);
			}
		}
		
	}
}
