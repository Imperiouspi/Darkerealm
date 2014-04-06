package com.imperiousindustries.darkerealm;

import net.minecraft.block.Block;

import com.imperiousindustries.darkerealm.blocks.BlockDarkeStone;
import com.imperiousindustries.darkerealm.blocks.BlockDust;
import com.imperiousindustries.darkerealm.blocks.BlockDustBlock;
import com.imperiousindustries.darkerealm.blocks.BlockInfo;
import com.imperiousindustries.darkerealm.blocks.dustblocks.BlockDustBlockCompressed;
import com.imperiousindustries.darkerealm.blocks.dustblocks.BlockDustBlockDouble;
import com.imperiousindustries.darkerealm.blocks.dustblocks.BlockDustBlockPentuple;
import com.imperiousindustries.darkerealm.blocks.dustblocks.BlockDustBlockQuadruple;
import com.imperiousindustries.darkerealm.blocks.dustblocks.BlockDustBlockTriple;

import cpw.mods.fml.common.registry.GameRegistry;

public class DarkeBlocks {
	
	public static Block darkeStone;
	public static Block dust;
	public static Block dustblock;
	public static Block compresseddust;
	public static Block compresseddust2;
	public static Block compresseddust3;
	public static Block compresseddust4;
	public static Block compresseddust5;
	
	public static void initBlocks(){
		darkeStone = new BlockDarkeStone();
		GameRegistry.registerBlock(darkeStone, BlockInfo.DARKESTONE_NAME);
		dust = new BlockDust();
		GameRegistry.registerBlock(dust, BlockInfo.DUST_NAME);
		dustblock = new BlockDustBlock();
		GameRegistry.registerBlock(dustblock, BlockInfo.DUSTBLOCK_NAME);
		compresseddust = new BlockDustBlockCompressed();
		GameRegistry.registerBlock(compresseddust, BlockInfo.COMPRESSEDDUSTBLOCK_NAME);
		compresseddust2 = new BlockDustBlockDouble();
		GameRegistry.registerBlock(compresseddust2, "double"+BlockInfo.COMPRESSEDDUSTBLOCK_NAME);
		compresseddust3 = new BlockDustBlockTriple();
		GameRegistry.registerBlock(compresseddust3, "triple"+BlockInfo.COMPRESSEDDUSTBLOCK_NAME);
		compresseddust4 = new BlockDustBlockQuadruple();
		GameRegistry.registerBlock(compresseddust4, "quadruple"+BlockInfo.COMPRESSEDDUSTBLOCK_NAME);
		compresseddust5 = new BlockDustBlockPentuple();
		GameRegistry.registerBlock(compresseddust5, "pentuple"+BlockInfo.COMPRESSEDDUSTBLOCK_NAME);
	}
}
