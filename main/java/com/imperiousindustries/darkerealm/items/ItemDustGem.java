package com.imperiousindustries.darkerealm.items;


import com.imperiousindustries.darkerealm.DarkeRealm;

import net.minecraft.item.Item;

public class ItemDustGem extends Item{
	public ItemDustGem(){
		setUnlocalizedName(ItemInfo.DUSTGEM_NAME);
		setCreativeTab(DarkeRealm.darketab);
		setTextureName("darkerealm:" + ItemInfo.DUSTGEM_TEXTURE);
		setMaxStackSize(1);
	}
}