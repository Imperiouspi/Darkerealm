package com.imperiousindustries.darkerealm;

import java.util.Random;

import net.minecraft.entity.EntityList;

import com.imperiousindustries.darkerealm.entities.EntityEagle;
import com.imperiousindustries.darkerealm.entities.EntityHermit;
import com.imperiousindustries.darkerealm.entities.EntityInfo;

import cpw.mods.fml.common.registry.EntityRegistry;

public class DarkeEntities {
	
	public static void registerEntities(){
		registerEntity(EntityHermit.class, EntityInfo.HERMIT_NAME, 5330966, 6848619);
		registerEntity(EntityEagle.class, EntityInfo.EAGLE_NAME, 8934144, 14594410);
	}
	
	public static void registerEntity(Class entityClass, String name, int color1, int color2)
	{
		int entityID = EntityRegistry.findGlobalUniqueEntityId();
		long seed = name.hashCode();
		Random rand = new Random(seed);
		int primaryColor = color1;
		int secondaryColor = color2;
	
		EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
		EntityRegistry.registerModEntity(entityClass, name, entityID, DarkeRealm.instance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, primaryColor, secondaryColor));
	}
}
