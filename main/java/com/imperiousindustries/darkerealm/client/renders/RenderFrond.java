package com.imperiousindustries.darkerealm.client.renders;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

import org.lwjgl.opengl.GL11;

import com.imperiousindustries.darkerealm.DarkeBlocks;
import com.imperiousindustries.darkerealm.blocks.BlockFrond;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class RenderFrond implements ISimpleBlockRenderingHandler {

	private int id;

	public RenderFrond() {
		id = RenderingRegistry.getNextAvailableRenderId();
	}

	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelId,
			RenderBlocks renderer) {

	}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z,
			Block block, int modelId, RenderBlocks renderer) {
		GL11.glPushMatrix();
		Tessellator tessellator = Tessellator.instance;
		int l = 16777215;
		float f = (float) (l >> 16 & 255) / 255.0F;
		float f1 = (float) (l >> 8 & 255) / 255.0F;
		float f2 = (float) (l & 255) / 255.0F;

		tessellator.setColorOpaque_F(f, f1, f2);
		double d1 = (double) x;
		double d2 = (double) y;
		double d0 = (double) y;
		long i1;

		this.drawCrossedSquares(DarkeBlocks.frond.getIcon(0, 0), d1, d2, d0,
				1.0F);
		System.out.println("ermmmm");
		this.drawCrossedSquares(
				((BlockFrond) DarkeBlocks.frond).func_149888_a(true, 0), d1,
				d2, d0, 2.0F);
		tessellator.draw();
		return true;
	}

	public void drawCrossedSquares(IIcon p_147765_1_, double p_147765_2_,
			double p_147765_4_, double p_147765_6_, float p_147765_8_) {
		Tessellator tessellator = Tessellator.instance;

		double d3 = (double) p_147765_1_.getMinU();
		double d4 = (double) p_147765_1_.getMinV();
		double d5 = (double) p_147765_1_.getMaxU();
		double d6 = (double) p_147765_1_.getMaxV();
		double d7 = 0.45D * (double) p_147765_8_;
		double d8 = p_147765_2_ + 0.5D - d7;
		double d9 = p_147765_2_ + 0.5D + d7;
		double d10 = p_147765_6_ + 0.5D - d7;
		double d11 = p_147765_6_ + 0.5D + d7;
		tessellator.addVertexWithUV(d8, p_147765_4_ + (double) p_147765_8_,
				d10, d3, d4);
		tessellator.draw();
		tessellator.addVertexWithUV(d8, p_147765_4_ + 0.0D, d10, d3, d6);
		tessellator.addVertexWithUV(d9, p_147765_4_ + 0.0D, d11, d5, d6);
		tessellator.addVertexWithUV(d9, p_147765_4_ + (double) p_147765_8_,
				d11, d5, d4);
		tessellator.draw();
		tessellator.addVertexWithUV(d9, p_147765_4_ + (double) p_147765_8_,
				d11, d3, d4);
		tessellator.draw();
		tessellator.addVertexWithUV(d9, p_147765_4_ + 0.0D, d11, d3, d6);
		tessellator.addVertexWithUV(d8, p_147765_4_ + 0.0D, d10, d5, d6);
		tessellator.addVertexWithUV(d8, p_147765_4_ + (double) p_147765_8_,
				d10, d5, d4);
		tessellator.draw();
		tessellator.addVertexWithUV(d8, p_147765_4_ + (double) p_147765_8_,
				d11, d3, d4);
		tessellator.draw();
		tessellator.addVertexWithUV(d8, p_147765_4_ + 0.0D, d11, d3, d6);
		tessellator.addVertexWithUV(d9, p_147765_4_ + 0.0D, d10, d5, d6);
		tessellator.addVertexWithUV(d9, p_147765_4_ + (double) p_147765_8_,
				d10, d5, d4);
		tessellator.draw();
		tessellator.addVertexWithUV(d9, p_147765_4_ + (double) p_147765_8_,
				d10, d3, d4);
		tessellator.draw();
		tessellator.addVertexWithUV(d9, p_147765_4_ + 0.0D, d10, d3, d6);
		tessellator.addVertexWithUV(d8, p_147765_4_ + 0.0D, d11, d5, d6);
		tessellator.addVertexWithUV(d8, p_147765_4_ + (double) p_147765_8_,
				d11, d5, d4);
		tessellator.draw();
	}

	@Override
	public boolean shouldRender3DInInventory(int modelId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getRenderId() {
		return id;
	}

}
