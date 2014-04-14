package com.imperiousindustries.darkerealm.blocks;

import net.minecraft.block.BlockPortal;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;

import com.imperiousindustries.darkerealm.DarkeRealm;
import com.imperiousindustries.darkerealm.realm.DarkeTeleporter;

public class BlockAbysmalFont extends BlockPortal {
	public BlockAbysmalFont(){
		super();
		setCreativeTab(DarkeRealm.darketab);
		setBlockName(BlockInfo.ABYSMALFONT_NAME);
		setBlockTextureName(BlockInfo.ABYSMALFONT_TEXTURE);
	}
	
	@Override
	public boolean isOpaqueCube(){
		return true;
	}
	
	@Override
	public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
    {
           if ((par5Entity.ridingEntity == null) && (par5Entity.riddenByEntity == null) && ((par5Entity instanceof EntityPlayerMP)))
           {
                  EntityPlayerMP player = (EntityPlayerMP) par5Entity;
                  MinecraftServer mServer = MinecraftServer.getServer();
                  if (player.timeUntilPortal > 0)
                  {
                        player.timeUntilPortal = 10;
                  }
                  else if (player.dimension != -6)
                  {
                        player.timeUntilPortal = 10;
                        player.mcServer.getConfigurationManager().transferPlayerToDimension(player, -6, new DarkeTeleporter(mServer.worldServerForDimension(-6)));
                  }
                  else
                  {
                        player.timeUntilPortal = 10;
                        player.mcServer.getConfigurationManager().transferPlayerToDimension(player, 0, new DarkeTeleporter(mServer.worldServerForDimension(1)));
                  }
           }
    }

}
