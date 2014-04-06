package com.imperiousindustries.darkerealm.blocks.dustblocks;

import com.imperiousindustries.darkerealm.blocks.BlockDustBlock;
import com.imperiousindustries.darkerealm.blocks.BlockInfo;

public class BlockDustBlockCompressed extends BlockDustBlock{
	public BlockDustBlockCompressed(){
		super();
		setBlockName(BlockInfo.COMPRESSEDDUSTBLOCK_NAME);
		setBlockTextureName("darkerealm:"+ BlockInfo.COMPRESSEDDUSTBLOCK_TEXTURE);
	}
}
