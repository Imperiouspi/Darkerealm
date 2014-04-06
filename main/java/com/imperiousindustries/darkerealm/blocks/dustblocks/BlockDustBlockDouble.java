package com.imperiousindustries.darkerealm.blocks.dustblocks;

import com.imperiousindustries.darkerealm.blocks.BlockDustBlock;
import com.imperiousindustries.darkerealm.blocks.BlockInfo;

public class BlockDustBlockDouble extends BlockDustBlock{
	public BlockDustBlockDouble(){
		super();
		setBlockName("double" + BlockInfo.COMPRESSEDDUSTBLOCK_NAME);
		setBlockTextureName("darkerealm:"+ "doubly" + BlockInfo.COMPRESSEDDUSTBLOCK_TEXTURE);
	}
}
