package com.imperiousindustries.darkerealm.realm.biomes;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import com.imperiousindustries.darkerealm.DarkeBlocks;
import com.imperiousindustries.darkerealm.realm.gen.WorldGenMestron;

public class BiomeDarkeForest extends BiomeGenBase{

	public BiomeDarkeForest() {
		super(60, true);
		this.biomeName = "Darke Forest";
		this.fillerBlock = Blocks.dirt;
		this.topBlock = DarkeBlocks.darkedirt;
		this.theBiomeDecorator.treesPerChunk = 10;
		this.theBiomeDecorator.grassPerChunk = 0;
		this.theBiomeDecorator.flowersPerChunk = 0;
		this.theBiomeDecorator.generateLakes = false;
		this.setHeight(height_LowPlains);
	}
	
	@Override
	 public WorldGenAbstractTree func_150567_a(Random p_150567_1_){
		return new WorldGenMestron(true);
	}
}