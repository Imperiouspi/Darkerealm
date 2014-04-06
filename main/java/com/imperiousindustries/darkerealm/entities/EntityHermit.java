package com.imperiousindustries.darkerealm.entities;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityHermit extends EntityCreature{

	public EntityHermit(World par1World) {
		super(par1World);
		tasks.addTask(1, new EntityAIAvoidEntity(this, EntityPlayer.class, 8.0F, 0.8D, 0.5D));
		tasks.addTask(2, new EntityAIWatchClosest(this, EntityPlayer.class, 15.0F));
		tasks.addTask(3, new EntityAISwimming(this));
		tasks.addTask(4, new EntityAIWander(this, 0.3D));
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
