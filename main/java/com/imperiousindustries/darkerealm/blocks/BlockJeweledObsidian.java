package com.imperiousindustries.darkerealm.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

import com.imperiousindustries.darkerealm.DarkeRealm;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockJeweledObsidian extends Block{
	public BlockJeweledObsidian(){
		super(Material.rock);
		setCreativeTab(DarkeRealm.darketab);
		setBlockName(BlockInfo.JOBSIDIAN_NAME);
		setBlockTextureName("darkerealm:" + BlockInfo.JOBSIDIAN_TEXTURE);
	}

	@SideOnly(Side.CLIENT)
	private IIcon topIcon;
	private IIcon sideIcon;
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister reg){
		topIcon = reg.registerIcon("obsidian");
		sideIcon = reg.registerIcon("darkerealm:"+BlockInfo.JOBSIDIAN_TEXTURE);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int var1, int var2){
		if(var1 == 0 || var1 == 1){
			return topIcon;
		}
		else
			return sideIcon;
	}
}
