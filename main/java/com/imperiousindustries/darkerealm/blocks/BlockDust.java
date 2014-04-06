package com.imperiousindustries.darkerealm.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.imperiousindustries.darkerealm.DarkeBlocks;
import com.imperiousindustries.darkerealm.DarkeRealm;
import com.imperiousindustries.darkerealm.items.ItemInfo;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDust extends Block {

	public BlockDust() {
		super(Material.sand);
		setBlockName(BlockInfo.DUST_NAME);
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.01F, 1.0F);
		setHardness(0.1F);
		setStepSound(Block.soundTypeSand);
		setHarvestLevel("shovel", 0);
		setCreativeTab(DarkeRealm.darketab);
		setTickRandomly(true);
		
		setBlockTextureName("darkerealm:" + BlockInfo.DUST_TEXTURE);
	}
	
	public void drop(World world, int x, int y, int z){
		dropBlockAsItem(world, x, y, z, new ItemStack(DarkeBlocks.dust));
	}
	
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_)
    {
        int l = p_149668_1_.getBlockMetadata(p_149668_2_, p_149668_3_, p_149668_4_) & 7;
        float f = 0.125F;
        return AxisAlignedBB.getAABBPool().getAABB((double)p_149668_2_ + this.minX, (double)p_149668_3_ + this.minY, (double)p_149668_4_ + this.minZ, (double)p_149668_2_ + this.maxX, (double)((float)p_149668_3_ + (float)l * f), (double)p_149668_4_ + this.maxZ);
    }

    /**
     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
     */
    public boolean isOpaqueCube()
    {
        return false;
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    /**
     * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
     */
    public boolean canPlaceBlockAt(World p_149742_1_, int p_149742_2_, int p_149742_3_, int p_149742_4_)
    {
        Block block = p_149742_1_.getBlock(p_149742_2_, p_149742_3_ - 1, p_149742_4_);
        return block != Blocks.ice && block != Blocks.packed_ice ? (block.isLeaves(p_149742_1_, p_149742_2_, p_149742_3_ - 1, p_149742_4_) ? true : (block == this && (p_149742_1_.getBlockMetadata(p_149742_2_, p_149742_3_ - 1, p_149742_4_) & 7) == 7 ? true : block.isOpaqueCube() && block.getMaterial().blocksMovement())) : false;
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor Block
     */
    public void onNeighborBlockChange(World p_149695_1_, int p_149695_2_, int p_149695_3_, int p_149695_4_, Block p_149695_5_)
    {
        this.func_150155_m(p_149695_1_, p_149695_2_, p_149695_3_, p_149695_4_);
    }

    private boolean func_150155_m(World p_150155_1_, int p_150155_2_, int p_150155_3_, int p_150155_4_)
    {
        if (!this.canPlaceBlockAt(p_150155_1_, p_150155_2_, p_150155_3_, p_150155_4_))
        {
            p_150155_1_.setBlockToAir(p_150155_2_, p_150155_3_, p_150155_4_);
            this.dropBlockAsItem(p_150155_1_, p_150155_2_, p_150155_3_, p_150155_4_, new ItemStack(DarkeBlocks.dust));
            return false;
        }
        else
        {
            return true;
        }
    }


    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_)
    {
        if (p_149674_1_.getSavedLightValue(EnumSkyBlock.Block, p_149674_2_, p_149674_3_, p_149674_4_) > 11)
        {
            p_149674_1_.setBlockToAir(p_149674_2_, p_149674_3_, p_149674_4_);
        }
    }

    /**
     * Returns true if the given side of this block type should be rendered, if the adjacent block is at the given
     * coordinates.  Args: blockAccess, x, y, z, side
     */
    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess p_149646_1_, int p_149646_2_, int p_149646_3_, int p_149646_4_, int p_149646_5_)
    {
        return p_149646_5_ == 1 ? true : super.shouldSideBeRendered(p_149646_1_, p_149646_2_, p_149646_3_, p_149646_4_, p_149646_5_);
    }

    /**
     * Determines if a new block can be replace the space occupied by this one,
     * Used in the player's placement code to make the block act like water, and lava.
     *
     * @param world The current world
     * @param x X Position
     * @param y Y position
     * @param z Z position
     * @return True if the block is replaceable by another block
     */
    public boolean isReplaceable(IBlockAccess world, int x, int y, int z)
    {
        int meta = world.getBlockMetadata(x, y, z);
        return meta >= 7 ? false : blockMaterial.isReplaceable();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public String getItemIconName()
    {
        return "darkerealm:" + BlockInfo.DUSTITEM_TEXTURE;
    }
}
