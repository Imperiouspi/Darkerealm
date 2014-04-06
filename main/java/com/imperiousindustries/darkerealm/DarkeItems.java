package com.imperiousindustries.darkerealm;

import net.minecraft.item.Item;

import com.imperiousindustries.darkerealm.items.ItemDustGem;
import com.imperiousindustries.darkerealm.items.ItemDuster;
import com.imperiousindustries.darkerealm.items.ItemInfo;

import cpw.mods.fml.common.registry.GameRegistry;

public class DarkeItems {
	
	public static Item duster;
	public static Item dustGem;
	public static void initItems() {
		duster = new ItemDuster();
		GameRegistry.registerItem(duster, ItemInfo.DUSTER_NAME);
		dustGem = new ItemDustGem();
		GameRegistry.registerItem(dustGem, ItemInfo.DUSTGEM_NAME);
	}
}