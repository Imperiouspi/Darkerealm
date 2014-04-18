package com.imperiousindustries.darkerealm.realm.biomes;

import com.imperiousindustries.darkerealm.DarkeBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.gen.feature.WorldGenBigMushroom;
import net.minecraft.world.gen.feature.WorldGenCactus;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenReed;
import net.minecraft.world.gen.feature.WorldGenSand;
import net.minecraft.world.gen.feature.WorldGenWaterlily;

public class DarkeDecorations extends BiomeDecorator{
	
	public DarkeDecorations(){
		super();
    	this.dirtGen = new WorldGenMinable(Blocks.dirt, 32, DarkeBlocks.darkeStone);
    	this.gravelGen = new WorldGenMinable(Blocks.gravel, 32, DarkeBlocks.darkeStone);
    	this.coalGen = new WorldGenMinable(Blocks.coal_ore, 16, DarkeBlocks.darkeStone);
    	this.ironGen = new WorldGenMinable(Blocks.iron_ore, 8, DarkeBlocks.darkeStone);
    	this.goldGen = new WorldGenMinable(Blocks.gold_ore, 8, DarkeBlocks.darkeStone);
    	this.redstoneGen = new WorldGenMinable(Blocks.redstone_ore, 7, DarkeBlocks.darkeStone);
    	this.diamondGen = new WorldGenMinable(Blocks.diamond_ore, 7, DarkeBlocks.darkeStone);
    	this.lapisGen = new WorldGenMinable(Blocks.lapis_ore, 6, DarkeBlocks.darkeStone);
	}
}
