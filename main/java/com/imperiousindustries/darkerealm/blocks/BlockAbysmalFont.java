package com.imperiousindustries.darkerealm.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

import com.imperiousindustries.darkerealm.DarkeRealm;
import com.imperiousindustries.darkerealm.realm.DarkeTeleporter;

public class BlockAbysmalFont extends Block {
	public BlockAbysmalFont(){
		super(Material.iron);
		setCreativeTab(DarkeRealm.darketab);
		setBlockName(BlockInfo.ABYSMALFONT_NAME);
		setBlockTextureName("darkerealm:" + BlockInfo.ABYSMALFONT_TEXTURE);
		setTickRandomly(true);
	}
	
	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_)
    {
		return null;
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
