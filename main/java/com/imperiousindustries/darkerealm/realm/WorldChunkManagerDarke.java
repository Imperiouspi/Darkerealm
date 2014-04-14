package com.imperiousindustries.darkerealm.realm;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManager;

import com.imperiousindustries.darkerealm.realm.biomes.BiomeDarkeForest;

public class WorldChunkManagerDarke extends WorldChunkManager{
	public WorldChunkManagerDarke() {
		
	}
	
	@Override
	public BiomeGenBase[] getBiomesForGeneration(BiomeGenBase[] par1ArrayOfBiomeGenBase, int par2, int par3, int par4, int par5)
    {
		BiomeGenBase [] darkebiomes = {new BiomeDarkeForest()};
		return darkebiomes;
    }
}
