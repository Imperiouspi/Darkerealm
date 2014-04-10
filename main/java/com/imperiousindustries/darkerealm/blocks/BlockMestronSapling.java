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
		int choice = (int)(Math.random()*5);
		switch(choice){
			case 0: genFive(world, x, y, z); break;
			case 1: genTwo(world, x, y, z); break;
			case 3: genSix(world, x, y, z); break;
			case 4: genEleven(world, x, y, z); break;
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
