package com.imperiousindustries.darkerealm;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class DarkeRecipes {
	public static void init(){
		GameRegistry.addRecipe(new ItemStack(DarkeItems.duster), new Object[]{" FF", " FF", "S  ", 'F', new ItemStack(Items.feather), 'S', new ItemStack(Items.stick)});
		GameRegistry.addRecipe(new ItemStack(DarkeBlocks.dustblock), new Object[]{"ddd","ddd","ddd", 'd', new ItemStack(DarkeBlocks.dust)});
		GameRegistry.addRecipe(new ItemStack(DarkeBlocks.compresseddust), new Object[]{"ddd","ddd","ddd", 'd', new ItemStack(DarkeBlocks.dustblock)});
		GameRegistry.addRecipe(new ItemStack(DarkeBlocks.compresseddust2), new Object[]{"ddd","ddd","ddd", 'd', new ItemStack(DarkeBlocks.compresseddust)});
		GameRegistry.addRecipe(new ItemStack(DarkeBlocks.compresseddust3), new Object[]{"ddd","ddd","ddd", 'd', new ItemStack(DarkeBlocks.compresseddust2)});
		GameRegistry.addRecipe(new ItemStack(DarkeBlocks.compresseddust4), new Object[]{"ddd","ddd","ddd", 'd', new ItemStack(DarkeBlocks.compresseddust3)});
		GameRegistry.addRecipe(new ItemStack(DarkeBlocks.compresseddust5), new Object[]{"ddd","ddd","ddd", 'd', new ItemStack(DarkeBlocks.compresseddust4)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(DarkeBlocks.mestronplank, 4), new ItemStack(DarkeBlocks.mestronlog));
		
		GameRegistry.addSmelting(new ItemStack(DarkeBlocks.dust, 64), new ItemStack(DarkeItems.dustGem), 20);
	}
}
