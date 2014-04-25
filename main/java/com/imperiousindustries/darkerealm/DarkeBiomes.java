package com.imperiousindustries.darkerealm;

import net.minecraft.world.biome.BiomeGenBase;

import com.imperiousindustries.darkerealm.realm.biomes.BiomeBurningPlain;
import com.imperiousindustries.darkerealm.realm.biomes.BiomeDarkeForest;

public class DarkeBiomes {
	public static BiomeGenBase darkeForest;
	public static BiomeGenBase burningplain;
	public static BiomeGenBase[] biomes;
	
	public static void initBiomes(){
		biomes = new BiomeGenBase[256];
		darkeForest = new BiomeDarkeForest();
		burningplain = new BiomeBurningPlain();
		biomes[0] = darkeForest;
		biomes[1] = burningplain;
	}
}
