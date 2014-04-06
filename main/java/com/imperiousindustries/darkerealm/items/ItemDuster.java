package com.imperiousindustries.darkerealm.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.imperiousindustries.darkerealm.DarkeBlocks;
import com.imperiousindustries.darkerealm.DarkeRealm;
import com.imperiousindustries.darkerealm.blocks.BlockDust;

public class ItemDuster extends Item {
	public ItemDuster(){
		super();
		setUnlocalizedName(ItemInfo.DUSTER_NAME);
		setCreativeTab(DarkeRealm.darketab);
		setTextureName("darkerealm:" + ItemInfo.DUSTER_TEXTURE);
		setMaxStackSize(1);
	}
	
	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer player, World world, int par4, int par5, int par6, int par7, float par8, float par9, float par10){
		int chance = (int)(Math.random()*5);
		if(chance == 1){
			if(!player.inventory.addItemStackToInventory(new ItemStack(DarkeBlocks.dust))){
				new BlockDust().drop(world, par4, par5, par6);
			}
		}
		return true;
	}

}
