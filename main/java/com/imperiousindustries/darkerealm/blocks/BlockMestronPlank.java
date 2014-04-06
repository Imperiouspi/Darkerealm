package com.imperiousindustries.darkerealm.blocks;

import com.imperiousindustries.darkerealm.DarkeRealm;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockMestronPlank extends Block {
	public BlockMestronPlank(){
		super(Material.wood);
		setBlockName(BlockInfo.MESTRONLOG_NAME);
		setHardness(1.0F);
		setStepSound(Block.soundTypeStone);
		setHarvestLevel("axe", 0);
		setCreativeTab(DarkeRealm.darketab);
		setBlockTextureName("darkerealm:" + BlockInfo.MESTRONPLANK_TEXTURE);
	}
}
