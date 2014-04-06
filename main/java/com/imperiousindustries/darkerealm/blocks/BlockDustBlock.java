package com.imperiousindustries.darkerealm.blocks;

import com.imperiousindustries.darkerealm.DarkeRealm;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockDustBlock extends Block{

	public BlockDustBlock() {
		super(Material.sand);
		setCreativeTab(DarkeRealm.darketab);
		setBlockName(BlockInfo.DUSTBLOCK_NAME);
		setHardness(0.75F);
		setStepSound(Block.soundTypeSand);
		setHarvestLevel("shovel", 0);
		setBlockTextureName("darkerealm:" + BlockInfo.DUSTBLOCK_TEXTURE);
	}
}
