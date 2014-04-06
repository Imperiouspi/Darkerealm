package com.imperiousindustries.darkerealm.blocks;

import com.imperiousindustries.darkerealm.DarkeRealm;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockDarkeStone extends Block {

	public BlockDarkeStone() {
		super(Material.rock);
		setBlockName(BlockInfo.DARKESTONE_NAME);
		setHardness(1.0F);
		setStepSound(Block.soundTypeStone);
		setHarvestLevel("pickaxe", 0);
		setCreativeTab(DarkeRealm.darketab);
		setBlockTextureName("darkerealm:" + BlockInfo.DARKESTONE_TEXTURE);
	}
}
