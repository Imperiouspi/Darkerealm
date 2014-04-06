package com.imperiousindustries.darkerealm.blocks;

import net.minecraft.block.BlockLeaves;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.IBlockAccess;

import com.imperiousindustries.darkerealm.DarkeRealm;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockMestronLeaves extends BlockLeaves{

	public BlockMestronLeaves() {
		super();
		setCreativeTab(DarkeRealm.darketab);
		setBlockName(BlockInfo.MESTRONLEAVES_NAME);
	}

	@SideOnly(Side.CLIENT)
	private IIcon fancyIcon;
	private IIcon fastIcon;
	
	@Override
	public void registerBlockIcons(IIconRegister reg){
		fancyIcon = reg.registerIcon("darkerealm:" + BlockInfo.MESTRONLEAVES_TEXTURE_FANCY);
		fastIcon = reg.registerIcon("darkerealm:" + BlockInfo.MESTRONLEAVES_TEXTURE_FAST);
	}
	
	@Override
	public IIcon getIcon(int var1, int var2) {
		if(Minecraft.getMinecraft().gameSettings.fancyGraphics){
			return fancyIcon;
		}
		else{
			return fastIcon;
		}
	}

	@Override
	public boolean isOpaqueCube(){
		return !Minecraft.getMinecraft().gameSettings.fancyGraphics;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public int getBlockColor()
    {
        return 16777215;
    }
	
	@SideOnly(Side.CLIENT)
	public int colorMultiplier(IBlockAccess p_149720_1_, int p_149720_2_, int p_149720_3_, int p_149720_4_)
	{
		 return 16777215;
	}
	
	@Override
	public String[] func_150125_e() {
		return null;
	}
}
