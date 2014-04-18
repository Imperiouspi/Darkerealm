package com.imperiousindustries.darkerealm;

import net.minecraftforge.oredict.OreDictionary;

public class DarkeOres {
	public static void init(){
		OreDictionary.registerOre("logWood", DarkeBlocks.mestronlog);
		OreDictionary.registerOre("plankWood", DarkeBlocks.mestronplank);
		OreDictionary.registerOre("saplingTree", DarkeBlocks.mestronsapling);
		OreDictionary.registerOre("leavesTree", DarkeBlocks.mestronleaves);
		OreDictionary.registerOre("blockStone", DarkeBlocks.darkeStone);
	}
}
