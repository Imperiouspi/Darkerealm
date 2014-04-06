package com.imperiousindustries.darkerealm.blocks.dustblocks;

import com.imperiousindustries.darkerealm.blocks.BlockDustBlock;
import com.imperiousindustries.darkerealm.blocks.BlockInfo;

public class BlockDustBlockTriple extends BlockDustBlock{
		public BlockDustBlockTriple(){
			super();
			setBlockName("triple" + BlockInfo.COMPRESSEDDUSTBLOCK_NAME);
			setBlockTextureName("darkerealm:"+ "Triple" + BlockInfo.COMPRESSEDDUSTBLOCK_TEXTURE);
		}
}
