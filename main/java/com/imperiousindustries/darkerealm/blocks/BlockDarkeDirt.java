package com.imperiousindustries.darkerealm.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

import com.imperiousindustries.darkerealm.DarkeRealm;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDarkeDirt extends Block {
	public BlockDarkeDirt(){
		super(Material.grass);
		setStepSound(Block.soundTypeGrass);
		setCreativeTab(DarkeRealm.darketab);
		setBlockName(BlockInfo.DARKEDIRT_NAME);
		setHarvestLevel("shovel", 0);
	}
	
	@Override
	public Item getItemDropped(int par1, Random par2, int par3){
		return Blocks.dirt.getItemDropped(par1, par2, par3);
	}
	
	@SideOnly(Side.CLIENT)
	private IIcon topIcon;
	private IIcon sideIcon;
	private IIcon bottomIcon;
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister reg){
		topIcon = reg.registerIcon("darkerealm:"+BlockInfo.DARKEDIRT_TEXTURE + " Top");
		sideIcon = reg.registerIcon("darkerealm:"+BlockInfo.DARKEDIRT_TEXTURE + " Side");
		bottomIcon = reg.registerIcon("darkerealm:dirt");
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int side, int meta){
		if(side == 1){
			return topIcon;
		}
		if(side == 0){
			return bottomIcon;
		}
		else
			return sideIcon;
	}
}
