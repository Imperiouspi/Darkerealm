package com.imperiousindustries.darkerealm.blocks;

import com.imperiousindustries.darkerealm.DarkeRealm;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDarkeDirt extends Block {
	public BlockDarkeDirt(){
		super(Material.grass);
		setBlockName(BlockInfo.DARKEDIRT_NAME);
		setHardness(0.6F);
		setStepSound(soundTypeGrass);
		setHarvestLevel("shovel", 0);
		setCreativeTab(DarkeRealm.darketab);
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
