package com.imperiousindustries.darkerealm.realm.biomes;

import com.imperiousindustries.darkerealm.DarkeBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeDarkeForest extends BiomeGenBase{

	public BiomeDarkeForest() {
		super(60, true);
		this.biomeName = "Darke Forest";
		this.fillerBlock = Blocks.dirt;
		this.topBlock = DarkeBlocks.darkedirt;
		this.theBiomeDecorator.treesPerChunk = 0;
		this.theBiomeDecorator.grassPerChunk = 0;
		this.theBiomeDecorator.flowersPerChunk = 0;
		this.theBiomeDecorator.generateLakes = false;
		this.setHeight(height_Default);
	}
}