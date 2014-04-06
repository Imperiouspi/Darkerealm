package com.imperiousindustries.darkerealm;


import net.minecraft.block.Block;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

import com.imperiousindustries.darkerealm.blocks.BlockInfo;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockMestronLog extends BlockRotatedPillar{
	public BlockMestronLog() {
		super(Material.wood);
		setBlockName(BlockInfo.MESTRONLOG_NAME);
		setHardness(1.0F);
		setStepSound(Block.soundTypeStone);
		setHarvestLevel("axe", 0);
		setCreativeTab(DarkeRealm.darketab);
	}

	@SideOnly(Side.CLIENT)
	private IIcon topIcon;
	private IIcon sideIcon;
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister reg){
		topIcon = reg.registerIcon("darkerealm:"+BlockInfo.MESTRONLOG_TOP_TEXTURE);
		sideIcon = reg.registerIcon("darkerealm:"+BlockInfo.MESTRONLOG_SIDE_TEXTURE);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getTopIcon(int var1){
		return topIcon;
	}

	@Override
	protected IIcon getSideIcon(int var1) {
		return sideIcon;
	}
	
	@Override
	public boolean canSustainLeaves(IBlockAccess world, int x, int y, int z){
		return true;
		
	}
}
