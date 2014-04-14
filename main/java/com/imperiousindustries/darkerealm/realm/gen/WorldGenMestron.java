package com.imperiousindustries.darkerealm.realm.gen;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import com.imperiousindustries.darkerealm.DarkeBlocks;
import com.imperiousindustries.darkerealm.blocks.BlockMestronSapling;

public class WorldGenMestron extends WorldGenAbstractTree {

	public WorldGenMestron(boolean p_i45448_1_) {
		super(p_i45448_1_);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean generate(World world, Random random, int x, int y, int z) {
		if(world.provider.dimensionId == -6){
			int choice = (int)(Math.random()*80);
			if(choice >= 35 && choice <= 70){
				((BlockMestronSapling) DarkeBlocks.mestronsapling).genHeight(5, world, x, y, z);
			}
			if(choice >= 70 && choice <= 90){
				((BlockMestronSapling) DarkeBlocks.mestronsapling).genHeight(11, world, x, y, z);
			}
			if(choice >= 0 && choice <= 35){
				((BlockMestronSapling) DarkeBlocks.mestronsapling).genHeight(6, world, x, y, z);
			}
			if(choice >= 90 && choice <= 100){
				((BlockMestronSapling) DarkeBlocks.mestronsapling).genHeight(2, world, x, y, z);
			}
			return true;
		}
		return false;
	}

}
