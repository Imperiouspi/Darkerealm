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
		for (int i = 0; i < 5; i++) {
			world.setBlock(x, y+i, z, DarkeBlocks.mestronlog);
		}
		world.setBlock(x, y+4, z+1, DarkeBlocks.mestronleaves);
		world.setBlock(x+1, y+4, z, DarkeBlocks.mestronleaves);
		world.setBlock(x-1, y+4, z, DarkeBlocks.mestronleaves);
		world.setBlock(x, y+4, z-1, DarkeBlocks.mestronleaves);
		world.setBlock(x, y+5, z, DarkeBlocks.mestronleaves);
	}
	
	@Override
	public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_){
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 0));
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
}
