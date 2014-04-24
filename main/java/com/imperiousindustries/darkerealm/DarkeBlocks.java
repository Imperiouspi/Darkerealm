package com.imperiousindustries.darkerealm;

import net.minecraft.block.Block;

import com.imperiousindustries.darkerealm.blocks.BlockAbysmalFont;
import com.imperiousindustries.darkerealm.blocks.BlockDarkeDirt;
import com.imperiousindustries.darkerealm.blocks.BlockDarkeStone;
import com.imperiousindustries.darkerealm.blocks.BlockDust;
import com.imperiousindustries.darkerealm.blocks.BlockDustBlock;
import com.imperiousindustries.darkerealm.blocks.BlockInfo;
import com.imperiousindustries.darkerealm.blocks.BlockJeweledObsidian;
import com.imperiousindustries.darkerealm.blocks.BlockMestronLeaves;
import com.imperiousindustries.darkerealm.blocks.BlockMestronLog;
import com.imperiousindustries.darkerealm.blocks.BlockMestronPlank;
import com.imperiousindustries.darkerealm.blocks.BlockMestronSapling;
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
	public static Block mestronlog;
	public static Block mestronplank;
	public static Block mestronleaves;
	public static Block mestronsapling;
	public static Block abysmalfont;
	public static Block darkedirt;
	public static Block jobsidian;
	
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
		mestronlog = new BlockMestronLog();
		GameRegistry.registerBlock(mestronlog, BlockInfo.MESTRONLOG_NAME);
		mestronplank = new BlockMestronPlank();
		GameRegistry.registerBlock(mestronplank, BlockInfo.MESTRONPLANK_NAME);
		mestronleaves = new BlockMestronLeaves();
		GameRegistry.registerBlock(mestronleaves, BlockInfo.MESTRONLEAVES_NAME);
		mestronsapling = new BlockMestronSapling();
		GameRegistry.registerBlock(mestronsapling, BlockInfo.MESTRONSAPLING_NAME);
		abysmalfont = new BlockAbysmalFont();
		GameRegistry.registerBlock(abysmalfont, BlockInfo.ABYSMALFONT_NAME);
		darkedirt = new BlockDarkeDirt();
		GameRegistry.registerBlock(darkedirt, BlockInfo.DARKEDIRT_NAME);
		jobsidian = new BlockJeweledObsidian();
		GameRegistry.registerBlock(jobsidian, BlockInfo.JOBSIDIAN_NAME);
	}
}
