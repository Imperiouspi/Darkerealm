package com.imperiousindustries.darkerealm.entities;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityEagle extends EntityCreature{
	
	public EntityEagle(World par1World) {
		super(par1World);
		this.setSize(0.7F, 1.1F);
		tasks.addTask(1, new EntityAIWander(this, 0.3D));
	}

	@Override
	protected void applyEntityAttributes(){
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.9D);
	}

	public boolean isAIEnabled(){
		return true;
	}
}