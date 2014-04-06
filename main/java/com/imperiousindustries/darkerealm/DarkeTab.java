package com.imperiousindustries.darkerealm;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class DarkeTab extends CreativeTabs{

	public DarkeTab() {
		super("darkeRealm");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return Item.getItemFromBlock(DarkeBlocks.darkeStone);
	}
}
