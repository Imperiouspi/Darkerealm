package com.imperiousindustries.darkerealm.blocks;

import java.util.List;
import java.util.Random;

import net.minecraft.block.BlockSapling;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.imperiousindustries.darkerealm.DarkeBlocks;
import com.imperiousindustries.darkerealm.DarkeRealm;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockMestronSapling extends BlockSapling {
	public BlockMestronSapling() {
		super();
		setCreativeTab(DarkeRealm.darketab);
		setBlockName(BlockInfo.MESTRONSAPLING_NAME);
		setBlockTextureName("darkerealm:" + BlockInfo.MESTRONSAPLING_TEXTURE);
	}

	@Override
	public void func_149878_d(World world, int x, int y, int z, Random rand) {
		int choice = (int)(Math.random()*80);
		if(choice >= 35 && choice <= 70){
			genFive(world, x, y, z);
		}
		if(choice >= 70 && choice <= 90){
			genEleven(world, x, y, z);
		}
		if(choice >= 0 && choice <= 35){
			genSix(world, x, y, z);
		}
		if(choice >= 90 && choice <= 100){
			genTwo(world, x, y, z);
		}
	}
	
	@Override
	public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List list){
		list.add(new ItemStack(p_149666_1_, 1, 0));
	}
	
	@SideOnly(Side.CLIENT)
	IIcon blockIcon;
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister reg){
		blockIcon = reg.registerIcon("darkerealm:" + BlockInfo.MESTRONSAPLING_TEXTURE);
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
		return blockIcon;
   }
	
	public boolean genHeight(int height, World world, int x, int y, int z){
		if(height == 2){
			genTwo(world, x, y, z);
			return true;
		}
		if(height == 5){
			genFive(world, x, y, z);
			return true;
		}
		if(height == 6){
			genSix(world, x, y, z);
			return true;
		}
		if(height == 11){
			genEleven(world, x, y, z);
			return true;
		}
		return false;
	}
	//generate a tree from an algorithm
	@Deprecated
	public void genNotForced(World world, int x, int y, int z, Random rand){
		int trunkHeight;
		double added;
		int[] leaves;
		//trunk height
		int chanceTall = rand.nextInt(100);
		//int chanceTall = 100;
		if(chanceTall >= 95){
			//generate Tall tree
			trunkHeight = rand.nextInt(30)+20;
		}
		else{
			//generate Smaller tree
			trunkHeight = rand.nextInt(8)+3;
		}
		trunkHeight = 50;
		leaves = new int[trunkHeight];
		
		for(int i = 0; i < trunkHeight; i++){
			added = trunkHeight*Math.sin(trunkHeight*i*i)/i;
			leaves[i] = (int) added;
		}
		
		//add tree to world
		for(int i = 0; i < leaves.length; i++){
			for(int j = 0; j <= leaves[i]; j++)
				world.setBlock(x+j, y+i, z, DarkeBlocks.mestronleaves);
		}
		for(int i = 0; i < leaves.length; i++){
			for(int j = 0; j <= leaves[i]; j++)
				world.setBlock(x-j, y+i, z, DarkeBlocks.mestronleaves);
		}
		for(int i = 0; i < leaves.length; i++){
			for(int j = 0; j <= leaves[i]; j++)
				world.setBlock(x, y+i, z+j, DarkeBlocks.mestronleaves);
		}
		for(int i = 0; i < leaves.length; i++){
			for(int j = 0; j <= leaves[i]; j++)
				world.setBlock(x, y+i, z-j, DarkeBlocks.mestronleaves);
		}
		world.setBlock(x, y, z, DarkeBlocks.mestronlog);
		for(int i = 0; i <= trunkHeight; i++){
			world.setBlock(x, y+i, z, DarkeBlocks.mestronlog);
		}
	}
	
	//generate a tree five blocks high
	public void genFive(World world, int x, int y, int z){
		//trunk
		for (int i = 0; i < 5; i++) {
			world.setBlock(x, y+i, z, DarkeBlocks.mestronlog);
		}
		//cap
		world.setBlock(x, y+4, z+1, DarkeBlocks.mestronleaves);
		world.setBlock(x+1, y+4, z, DarkeBlocks.mestronleaves);
		world.setBlock(x-1, y+4, z, DarkeBlocks.mestronleaves);
		world.setBlock(x, y+4, z-1, DarkeBlocks.mestronleaves);
		world.setBlock(x, y+5, z, DarkeBlocks.mestronleaves);
		
		//second bottom layer
		world.setBlock(x+1, y+2, z, DarkeBlocks.mestronleaves);
		world.setBlock(x-1, y+2, z, DarkeBlocks.mestronleaves);
		world.setBlock(x, y+2, z+1, DarkeBlocks.mestronleaves);
		world.setBlock(x, y+2, z-1, DarkeBlocks.mestronleaves);
		world.setBlock(x+1, y+1, z+1, DarkeBlocks.mestronleaves);
		world.setBlock(x-1, y+1, z-1, DarkeBlocks.mestronleaves);
		world.setBlock(x-1, y+1, z+1, DarkeBlocks.mestronleaves);
		world.setBlock(x+1, y+1, z-1, DarkeBlocks.mestronleaves);
		
		//bottom cap
		world.setBlock(x+1, y+1, z, DarkeBlocks.mestronleaves);
		world.setBlock(x-1, y+1, z, DarkeBlocks.mestronleaves);
		world.setBlock(x, y+1, z+1, DarkeBlocks.mestronleaves);
		world.setBlock(x, y+1, z-1, DarkeBlocks.mestronleaves);
	}

	//generate a tree two blocks high
	public void genTwo(World world, int x, int y, int z){
		//trunk
		for(int i = 0; i < 2; i++){
			world.setBlock(x, y+i, z, DarkeBlocks.mestronlog);
		}
		//cap
		world.setBlock(x+1, y+1, z, DarkeBlocks.mestronleaves);
		world.setBlock(x-1, y+1, z, DarkeBlocks.mestronleaves);
		world.setBlock(x, y+1, z+1, DarkeBlocks.mestronleaves);
		world.setBlock(x, y+1, z-1, DarkeBlocks.mestronleaves);
		world.setBlock(x, y+2, z, DarkeBlocks.mestronleaves);
	}

	//generate a tree six blocks high
	public void genSix(World world, int x, int y, int z){
		genFive(world, x, y+1, z);
		world.setBlock(x, y, z, DarkeBlocks.mestronlog);
		//bottom cap
		world.setBlock(x+1, y+1, z, DarkeBlocks.mestronleaves);
		world.setBlock(x-1, y+1, z, DarkeBlocks.mestronleaves);
		world.setBlock(x, y+1, z+1, DarkeBlocks.mestronleaves);
		world.setBlock(x, y+1, z-1, DarkeBlocks.mestronleaves);
		//third layer points
		world.setBlock(x+2, y+2, z, DarkeBlocks.mestronleaves);
		world.setBlock(x-2, y+2, z, DarkeBlocks.mestronleaves);
		world.setBlock(x, y+2, z+2, DarkeBlocks.mestronleaves);
		world.setBlock(x, y+2, z-2, DarkeBlocks.mestronleaves);

	}

	//generate a tree ten blocks high
	public void genEleven(World world, int x, int y, int z){
		//trunk
		for(int i = 0; i < 11; i++){
			world.setBlock(x, y+i, z, DarkeBlocks.mestronlog);
		}
		// top cap
		world.setBlock(x, y+10, z+1, DarkeBlocks.mestronleaves);
		world.setBlock(x+1, y+10, z, DarkeBlocks.mestronleaves);
		world.setBlock(x-1, y+10, z, DarkeBlocks.mestronleaves);
		world.setBlock(x, y+10, z-1, DarkeBlocks.mestronleaves);
		world.setBlock(x, y+11, z, DarkeBlocks.mestronleaves);
		
		//bottom cap
		world.setBlock(x+1, y+2, z, DarkeBlocks.mestronleaves);
		world.setBlock(x-1, y+2, z, DarkeBlocks.mestronleaves);
		world.setBlock(x, y+2, z+1, DarkeBlocks.mestronleaves);
		world.setBlock(x, y+2, z-1, DarkeBlocks.mestronleaves);
		
		//second bottom layer
		//first square
		world.setBlock(x+1, y+3, z, DarkeBlocks.mestronleaves);
		world.setBlock(x-1, y+3, z, DarkeBlocks.mestronleaves);
		world.setBlock(x, y+3, z+1, DarkeBlocks.mestronleaves);
		world.setBlock(x, y+3, z-1, DarkeBlocks.mestronleaves);
		world.setBlock(x+1, y+3, z+1, DarkeBlocks.mestronleaves);
		world.setBlock(x-1, y+3, z-1, DarkeBlocks.mestronleaves);
		world.setBlock(x-1, y+3, z+1, DarkeBlocks.mestronleaves);
		world.setBlock(x+1, y+3, z-1, DarkeBlocks.mestronleaves);
		//second square
		world.setBlock(x+2, y+3, z, DarkeBlocks.mestronleaves);
		world.setBlock(x-2, y+3, z, DarkeBlocks.mestronleaves);
		world.setBlock(x, y+3, z+2, DarkeBlocks.mestronleaves);
		world.setBlock(x, y+3, z-2, DarkeBlocks.mestronleaves);
		world.setBlock(x+2, y+3, z+1, DarkeBlocks.mestronleaves);
		world.setBlock(x-2, y+3, z-1, DarkeBlocks.mestronleaves);
		world.setBlock(x-2, y+3, z+1, DarkeBlocks.mestronleaves);
		world.setBlock(x+2, y+3, z-1, DarkeBlocks.mestronleaves);
		world.setBlock(x+1, y+3, z+2, DarkeBlocks.mestronleaves);
		world.setBlock(x-1, y+3, z-2, DarkeBlocks.mestronleaves);
		world.setBlock(x-1, y+3, z+2, DarkeBlocks.mestronleaves);
		world.setBlock(x+1, y+3, z-2, DarkeBlocks.mestronleaves);
		//points
		world.setBlock(x+3, y+3, z, DarkeBlocks.mestronleaves);
		world.setBlock(x-3, y+3, z, DarkeBlocks.mestronleaves);
		world.setBlock(x, y+3, z+3, DarkeBlocks.mestronleaves);
		world.setBlock(x, y+3, z-3, DarkeBlocks.mestronleaves);
		
		//third layer
		world.setBlock(x+2, y+4, z, DarkeBlocks.mestronleaves);
		world.setBlock(x-2, y+4, z, DarkeBlocks.mestronleaves);
		world.setBlock(x, y+4, z+2, DarkeBlocks.mestronleaves);
		world.setBlock(x, y+4, z-2, DarkeBlocks.mestronleaves);
		world.setBlock(x+2, y+4, z+1, DarkeBlocks.mestronleaves);
		world.setBlock(x-2, y+4, z-1, DarkeBlocks.mestronleaves);
		world.setBlock(x-2, y+4, z+1, DarkeBlocks.mestronleaves);
		world.setBlock(x+2, y+4, z-1, DarkeBlocks.mestronleaves);
		world.setBlock(x+1, y+4, z+2, DarkeBlocks.mestronleaves);
		world.setBlock(x-1, y+4, z-2, DarkeBlocks.mestronleaves);
		world.setBlock(x-1, y+4, z+2, DarkeBlocks.mestronleaves);
		world.setBlock(x+1, y+4, z-2, DarkeBlocks.mestronleaves);
		
		//fourth layer
		world.setBlock(x+1, y+5, z, DarkeBlocks.mestronleaves);
		world.setBlock(x-1, y+5, z, DarkeBlocks.mestronleaves);
		world.setBlock(x, y+5, z+1, DarkeBlocks.mestronleaves);
		world.setBlock(x, y+5, z-1, DarkeBlocks.mestronleaves);
		world.setBlock(x+1, y+5, z+1, DarkeBlocks.mestronleaves);
		world.setBlock(x-1, y+5, z-1, DarkeBlocks.mestronleaves);
		world.setBlock(x-1, y+5, z+1, DarkeBlocks.mestronleaves);
		world.setBlock(x+1, y+5, z-1, DarkeBlocks.mestronleaves);
		
		//second middle layer
		world.setBlock(x+2, y+7, z, DarkeBlocks.mestronleaves);
		world.setBlock(x-2, y+7, z, DarkeBlocks.mestronleaves);
		world.setBlock(x, y+7, z+2, DarkeBlocks.mestronleaves);
		world.setBlock(x, y+7, z-2, DarkeBlocks.mestronleaves);
		world.setBlock(x+1, y+7, z, DarkeBlocks.mestronleaves);
		world.setBlock(x-1, y+7, z, DarkeBlocks.mestronleaves);
		world.setBlock(x, y+7, z+1, DarkeBlocks.mestronleaves);
		world.setBlock(x, y+7, z-1, DarkeBlocks.mestronleaves);
		world.setBlock(x+1, y+7, z+1, DarkeBlocks.mestronleaves);
		world.setBlock(x-1, y+7, z-1, DarkeBlocks.mestronleaves);
		world.setBlock(x-1, y+7, z+1, DarkeBlocks.mestronleaves);
		world.setBlock(x+1, y+7, z-1, DarkeBlocks.mestronleaves);
		
		//middle cap
		world.setBlock(x+1, y+8, z, DarkeBlocks.mestronleaves);
		world.setBlock(x-1, y+8, z, DarkeBlocks.mestronleaves);
		world.setBlock(x, y+8, z+1, DarkeBlocks.mestronleaves);
		world.setBlock(x, y+8, z-1, DarkeBlocks.mestronleaves);
	}
}
