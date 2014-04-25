package com.imperiousindustries.darkerealm.realm;

import java.util.ArrayList;
import java.util.List;

import com.imperiousindustries.darkerealm.DarkeBlocks;

import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.Direction;
import net.minecraft.util.LongHashMap;
import net.minecraft.util.MathHelper;
import net.minecraft.world.ChunkCoordIntPair;
import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldServer;

public class DarkeTeleporter extends Teleporter{
	
	private final WorldServer worldServerInstance;
	/**
     * Stores successful portal placement locations for rapid lookup.
     */
    private final LongHashMap destinationCoordinateCache = new LongHashMap();
    /**
     * A list of valid keys for the destinationCoordainteCache. These are based on the X & Z of the players initial
     * location.
     */
    private final List destinationCoordinateKeys = new ArrayList();
    
	public DarkeTeleporter(WorldServer par1WorldServer) {
		super(par1WorldServer);
		this.worldServerInstance = par1WorldServer;
	}

	/**
     * Place an entity in a nearby portal, creating one if necessary.
     */
    public void placeInPortal(Entity entity, double par2, double par4, double par6, float par8)
    {
        if (this.worldServerInstance.provider.dimensionId != 1)
        {
            if (!this.placeInExistingPortal(entity, par2, par4, par6, par8))
            {
                this.makePortal(entity);
                this.placeInExistingPortal(entity, par2, par4, par6, par8);
            }
        }
        else
        {
            //create font
        	//base
        	worldServerInstance.setBlock((int)entity.posX, (int)entity.posY-5, (int)entity.posZ, Blocks.obsidian);
        	worldServerInstance.setBlock((int)entity.posX-1, (int)entity.posY-5, (int)entity.posZ, DarkeBlocks.jobsidian);
        	worldServerInstance.setBlock((int)entity.posX+1, (int)entity.posY-5, (int)entity.posZ, DarkeBlocks.jobsidian);
        	worldServerInstance.setBlock((int)entity.posX-1, (int)entity.posY-5, (int)entity.posZ-1, DarkeBlocks.jobsidian);
        	worldServerInstance.setBlock((int)entity.posX+1, (int)entity.posY-5, (int)entity.posZ+1, DarkeBlocks.jobsidian);
        	worldServerInstance.setBlock((int)entity.posX, (int)entity.posY-5, (int)entity.posZ-1, DarkeBlocks.jobsidian);
        	worldServerInstance.setBlock((int)entity.posX, (int)entity.posY-5, (int)entity.posZ+1, DarkeBlocks.jobsidian);
        	worldServerInstance.setBlock((int)entity.posX-1, (int)entity.posY-5, (int)entity.posZ-1, DarkeBlocks.jobsidian);
        	worldServerInstance.setBlock((int)entity.posX+1, (int)entity.posY-5, (int)entity.posZ+1, DarkeBlocks.jobsidian);
        	//stem
        	worldServerInstance.setBlock((int)entity.posX, (int)entity.posY-4, (int)entity.posZ+1, Blocks.obsidian);
        	worldServerInstance.setBlock((int)entity.posX, (int)entity.posY-3, (int)entity.posZ+1, Blocks.obsidian);
        	//cup base
        	worldServerInstance.setBlock((int)entity.posX+1, (int)entity.posY-2, (int)entity.posZ, Blocks.obsidian);
        	worldServerInstance.setBlock((int)entity.posX-1, (int)entity.posY-2, (int)entity.posZ, Blocks.obsidian);
        	worldServerInstance.setBlock((int)entity.posX, (int)entity.posY-2, (int)entity.posZ+1, Blocks.obsidian);
        	worldServerInstance.setBlock((int)entity.posX, (int)entity.posY-2, (int)entity.posZ-1, Blocks.obsidian);
        	//up cup
        	worldServerInstance.setBlock((int)entity.posX+2, (int)entity.posY, (int)entity.posZ, DarkeBlocks.jobsidian);
        	worldServerInstance.setBlock((int)entity.posX-2, (int)entity.posY, (int)entity.posZ, DarkeBlocks.jobsidian);
        	worldServerInstance.setBlock((int)entity.posX, (int)entity.posY, (int)entity.posZ+2, DarkeBlocks.jobsidian);
        	worldServerInstance.setBlock((int)entity.posX, (int)entity.posY, (int)entity.posZ-2, DarkeBlocks.jobsidian);
        	worldServerInstance.setBlock((int)entity.posX+1, (int)entity.posY, (int)entity.posZ+1, DarkeBlocks.jobsidian);
        	worldServerInstance.setBlock((int)entity.posX+1, (int)entity.posY, (int)entity.posZ-1, DarkeBlocks.jobsidian);
        	worldServerInstance.setBlock((int)entity.posX-1, (int)entity.posY, (int)entity.posZ+1, DarkeBlocks.jobsidian);
        	worldServerInstance.setBlock((int)entity.posX-1, (int)entity.posY, (int)entity.posZ-1, DarkeBlocks.jobsidian);
        	//portal
        	worldServerInstance.setBlock((int)entity.posX, (int)entity.posY-1, (int)entity.posZ, DarkeBlocks.abysmalfont);
        }
    }

    /**
     * Place an entity in a nearby portal which already exists.
     */
    public boolean placeInExistingPortal(Entity par1Entity, double par2, double par4, double par6, float par8)
    {
        short short1 = 128;
        double d3 = -1.0D;
        int i = 0;
        int j = 0;
        int k = 0;
        int l = MathHelper.floor_double(par1Entity.posX);
        int i1 = MathHelper.floor_double(par1Entity.posZ);
        long j1 = ChunkCoordIntPair.chunkXZ2Int(l, i1);
        boolean flag = true;
        double d7;
        int l3;

        if (this.destinationCoordinateCache.containsItem(j1))
        {
            Teleporter.PortalPosition portalposition = (Teleporter.PortalPosition)this.destinationCoordinateCache.getValueByKey(j1);
            d3 = 0.0D;
            i = portalposition.posX;
            j = portalposition.posY;
            k = portalposition.posZ;
            portalposition.lastUpdateTime = this.worldServerInstance.getTotalWorldTime();
            flag = false;
        }
        else
        {
            for (l3 = l - short1; l3 <= l + short1; ++l3)
            {
                double d4 = (double)l3 + 0.5D - par1Entity.posX;

                for (int l1 = i1 - short1; l1 <= i1 + short1; ++l1)
                {
                    double d5 = (double)l1 + 0.5D - par1Entity.posZ;

                    for (int i2 = this.worldServerInstance.getActualHeight() - 1; i2 >= 0; --i2)
                    {
                        if (this.worldServerInstance.getBlock(l3, i2, l1) == Blocks.portal)
                        {
                            while (this.worldServerInstance.getBlock(l3, i2 - 1, l1) == Blocks.portal)
                            {
                                --i2;
                            }

                            d7 = (double)i2 + 0.5D - par1Entity.posY;
                            double d8 = d4 * d4 + d7 * d7 + d5 * d5;

                            if (d3 < 0.0D || d8 < d3)
                            {
                                d3 = d8;
                                i = l3;
                                j = i2;
                                k = l1;
                            }
                        }
                    }
                }
            }
        }

        if (d3 >= 0.0D)
        {
            if (flag)
            {
                this.destinationCoordinateCache.add(j1, new Teleporter.PortalPosition(i, j, k, this.worldServerInstance.getTotalWorldTime()));
                this.destinationCoordinateKeys.add(Long.valueOf(j1));
            }

            double d11 = (double)i + 0.5D;
            double d6 = (double)j + 0.5D;
            d7 = (double)k + 0.5D;
            int i4 = -1;

            if (this.worldServerInstance.getBlock(i - 1, j, k) == Blocks.portal)
            {
                i4 = 2;
            }

            if (this.worldServerInstance.getBlock(i + 1, j, k) == Blocks.portal)
            {
                i4 = 0;
            }

            if (this.worldServerInstance.getBlock(i, j, k - 1) == Blocks.portal)
            {
                i4 = 3;
            }

            if (this.worldServerInstance.getBlock(i, j, k + 1) == Blocks.portal)
            {
                i4 = 1;
            }

            int j2 = par1Entity.getTeleportDirection();

            if (i4 > -1)
            {
                int k2 = Direction.rotateLeft[i4];
                int l2 = Direction.offsetX[i4];
                int i3 = Direction.offsetZ[i4];
                int j3 = Direction.offsetX[k2];
                int k3 = Direction.offsetZ[k2];
                boolean flag1 = !this.worldServerInstance.isAirBlock(i + l2 + j3, j, k + i3 + k3) || !this.worldServerInstance.isAirBlock(i + l2 + j3, j + 1, k + i3 + k3);
                boolean flag2 = !this.worldServerInstance.isAirBlock(i + l2, j, k + i3) || !this.worldServerInstance.isAirBlock(i + l2, j + 1, k + i3);

                if (flag1 && flag2)
                {
                    i4 = Direction.rotateOpposite[i4];
                    k2 = Direction.rotateOpposite[k2];
                    l2 = Direction.offsetX[i4];
                    i3 = Direction.offsetZ[i4];
                    j3 = Direction.offsetX[k2];
                    k3 = Direction.offsetZ[k2];
                    l3 = i - j3;
                    d11 -= (double)j3;
                    int k1 = k - k3;
                    d7 -= (double)k3;
                    flag1 = !this.worldServerInstance.isAirBlock(l3 + l2 + j3, j, k1 + i3 + k3) || !this.worldServerInstance.isAirBlock(l3 + l2 + j3, j + 1, k1 + i3 + k3);
                    flag2 = !this.worldServerInstance.isAirBlock(l3 + l2, j, k1 + i3) || !this.worldServerInstance.isAirBlock(l3 + l2, j + 1, k1 + i3);
                }

                float f1 = 0.5F;
                float f2 = 0.5F;

                if (!flag1 && flag2)
                {
                    f1 = 1.0F;
                }
                else if (flag1 && !flag2)
                {
                    f1 = 0.0F;
                }
                else if (flag1 && flag2)
                {
                    f2 = 0.0F;
                }

                d11 += (double)((float)j3 * f1 + f2 * (float)l2);
                d7 += (double)((float)k3 * f1 + f2 * (float)i3);
                float f3 = 0.0F;
                float f4 = 0.0F;
                float f5 = 0.0F;
                float f6 = 0.0F;

                if (i4 == j2)
                {
                    f3 = 1.0F;
                    f4 = 1.0F;
                }
                else if (i4 == Direction.rotateOpposite[j2])
                {
                    f3 = -1.0F;
                    f4 = -1.0F;
                }
                else if (i4 == Direction.rotateRight[j2])
                {
                    f5 = 1.0F;
                    f6 = -1.0F;
                }
                else
                {
                    f5 = -1.0F;
                    f6 = 1.0F;
                }

                double d9 = par1Entity.motionX;
                double d10 = par1Entity.motionZ;
                par1Entity.motionX = d9 * (double)f3 + d10 * (double)f6;
                par1Entity.motionZ = d9 * (double)f5 + d10 * (double)f4;
                par1Entity.rotationYaw = par8 - (float)(j2 * 90) + (float)(i4 * 90);
            }
            else
            {
                par1Entity.motionX = par1Entity.motionY = par1Entity.motionZ = 0.0D;
            }

            par1Entity.setLocationAndAngles(d11, d6, d7, par1Entity.rotationYaw, par1Entity.rotationPitch);
            return true;
        }
        else
        {
            return false;
        }
    }
}
