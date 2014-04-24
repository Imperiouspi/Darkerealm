package com.imperiousindustries.darkerealm.realm.biomes;

import java.awt.Color;

import net.minecraft.init.Blocks;
import net.minecraft.world.gen.feature.WorldGenMinable;

import com.imperiousindustries.darkerealm.DarkeBlocks;

public class BiomeBurningPlain extends BiomeDarkeBase{
	public BiomeBurningPlain() {
		super(61);
		this.biomeName = "Burning Plain";
		this.fillerBlock = Blocks.dirt;
		this.topBlock = DarkeBlocks.darkedirt;
		this.theBiomeDecorator.treesPerChunk = 0;
		this.theBiomeDecorator.grassPerChunk = 0;
		this.theBiomeDecorator.flowersPerChunk = 0;
		this.theBiomeDecorator.generateLakes = false;
		this.theBiomeDecorator.coalGen = new WorldGenMinable(Blocks.coal_ore, 16);
		this.setHeight(new Height(0.1F, 0.11F));
	}

	@Override
	public int getSkyColorByTemp(float temp) {
		return new Color(209, 209, 209).getRGB();
	}
}
