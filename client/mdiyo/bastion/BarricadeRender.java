package mDiyo.bastion;

import inficraft.api.InfiUtil;
import mDiyo.bastion.blocks.BarricadeBlock;
import net.minecraft.src.Block;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.RenderBlocks;
import net.minecraft.src.Tessellator;
import net.minecraft.src.Vec3;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class BarricadeRender implements ISimpleBlockRenderingHandler
{
	public static int model;

	public BarricadeRender()
	{
		model = RenderingRegistry.getNextAvailableRenderId();
	}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block barricade, int modelId, RenderBlocks renderer)
	{
		if (modelId == model)
		{
			int meta = world.getBlockMetadata(x, y, z);
			Tessellator tessellator = Tessellator.instance;

			if ((meta < 4) || (meta == 10) || (meta == 11))
			{
				renderInnerEast(renderer, world, x, y, z, (BarricadeBlock)barricade, tessellator);
			}

			if (((meta < 4) && (meta > 0)) || (meta == 11))
			{
				renderOuterEast(renderer, world, x, y, z, (BarricadeBlock)barricade, tessellator);
			}

			if ((meta == 2) || (meta == 3) || ((meta >= 8) && (meta <= 11)))
			{
				renderInnerWest(renderer, world, x, y, z, (BarricadeBlock)barricade, tessellator);
			}

			if ((meta == 3) || ((meta >= 9) && (meta <= 11)))
			{
				renderOuterWest(renderer, world, x, y, z, (BarricadeBlock)barricade, tessellator);
			}

			if (((meta >= 4) && (meta <= 7)) || (meta >= 14))
			{
				renderInnerSouth(renderer, world, x, y, z, (BarricadeBlock)barricade, tessellator);
			}

			if (((meta >= 5) && (meta <= 7)) || (meta == 15))
			{
				renderOuterSouth(renderer, world, x, y, z, (BarricadeBlock)barricade, tessellator);
			}

			if ((meta == 6) || (meta == 7) || (meta >= 12))
			{
				renderInnerNorth(renderer, world, x, y, z, (BarricadeBlock)barricade, tessellator);
			}

			if ((meta == 7) || (meta >= 13))
			{
				renderOuterNorth(renderer, world, x, y, z, (BarricadeBlock)barricade, tessellator);
			}

			return true;
		}
		return false;
	}

	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelID, RenderBlocks renderer)
	{
		if (modelID == model)
		{
			block.setBlockBounds(0.375F, 0.0F, 0.375F, 0.625F, 1.0F, 0.625F);
			InfiUtil.renderInvBlock(renderer, block, metadata);
			block.setBlockBounds(0.375F, 0.375F, 0.0F, 0.625F, 0.625F, 1.0F);
			InfiUtil.renderInvBlock(renderer, block, metadata);
		}
	}

	@Override
	public boolean shouldRender3DInInventory()
	{
		return true;
	}

	@Override
	public int getRenderId()
	{
		return model;
	}

	private static void renderInnerWest(RenderBlocks renderblocks, IBlockAccess iblockaccess, int x, int y, int z, BarricadeBlock barricade, Tessellator tessellator)
	{
		tessellator.setBrightness(barricade.getMixedBrightnessForBlock(iblockaccess, x, y, z));
		float color = 1.0F;

		tessellator.setColorOpaque_F(color, color, color);
		int var14 = barricade.getBlockTextureFromSide(0);

		int var15 = (var14 & 0xF) << 4;
		int var16 = var14 & 0xF0;
		float tex1 = var15 / 256.0F;
		float tex2 = (var15 + 16.0F) / 256.0F;
		float tex3 = var16 / 256.0F;
		float tex4 = (var16 + 16.0F) / 256.0F;
		Vec3[] vec1 = new Vec3[8];
		float minSize = 0.125F;
		float maxSize = 0.125F;
		float height = 1.416F;
		vec1[0] = Vec3.createVectorHelper(-minSize, 0.0D, -maxSize);
		vec1[1] = Vec3.createVectorHelper(minSize, 0.0D, -maxSize);
		vec1[2] = Vec3.createVectorHelper(minSize, 0.0D, maxSize);
		vec1[3] = Vec3.createVectorHelper(-minSize, 0.0D, maxSize);
		vec1[4] = Vec3.createVectorHelper(-minSize, height, -maxSize);
		vec1[5] = Vec3.createVectorHelper(minSize, height, -maxSize);
		vec1[6] = Vec3.createVectorHelper(minSize, height, maxSize);
		vec1[7] = Vec3.createVectorHelper(-minSize, height, maxSize);
		for (int var25 = 0; var25 < 8; var25++)
		{
			vec1[var25].zCoord -= 0.0625D;
			vec1[var25].rotateAroundX(-0.7853982F);
			vec1[var25].yCoord -= 0.5D;
			vec1[var25].rotateAroundX(1.570796F);

			vec1[var25].xCoord += x + 0.625D;
			vec1[var25].yCoord += y;
			vec1[var25].zCoord += z + 0.5D;
		}

		Vec3 vec1a = null;
		Vec3 vec1b = null;
		Vec3 vec1c = null;
		Vec3 vec1d = null;

		for (int iter = 0; iter < 6; iter++)
		{
			if (iter == 0)
			{
				tex1 = var15 / 256.0F;
				tex2 = (var15 + 9 - 0.01F) / 256.0F;
				tex3 = var16 / 256.0F;
				tex4 = (var16 + 8 - 0.01F) / 256.0F;
			}
			else if (iter == 2)
			{
				tex1 = (var15 + 4.0F) / 256.0F;
				tex2 = (var15 + 9 - 0.01F) / 256.0F;
				tex3 = var16 / 256.0F;
				tex4 = (var16 + 16 - 0.01F) / 256.0F;
			}

			if (iter == 0)
			{
				vec1a = vec1[0];
				vec1b = vec1[1];
				vec1c = vec1[2];
				vec1d = vec1[3];
			}
			else if (iter == 1)
			{
				vec1a = vec1[7];
				vec1b = vec1[6];
				vec1c = vec1[5];
				vec1d = vec1[4];
			}
			else if (iter == 2)
			{
				vec1a = vec1[1];
				vec1b = vec1[0];
				vec1c = vec1[4];
				vec1d = vec1[5];
			}
			else if (iter == 3)
			{
				vec1a = vec1[2];
				vec1b = vec1[1];
				vec1c = vec1[5];
				vec1d = vec1[6];
			}
			else if (iter == 4)
			{
				vec1a = vec1[3];
				vec1b = vec1[2];
				vec1c = vec1[6];
				vec1d = vec1[7];
			}
			else if (iter == 5)
			{
				vec1a = vec1[0];
				vec1b = vec1[3];
				vec1c = vec1[7];
				vec1d = vec1[4];
			}

			tessellator.addVertexWithUV(vec1a.xCoord, vec1a.yCoord, vec1a.zCoord, tex1, tex4);
			tessellator.addVertexWithUV(vec1b.xCoord, vec1b.yCoord, vec1b.zCoord, tex2, tex4);
			tessellator.addVertexWithUV(vec1c.xCoord, vec1c.yCoord, vec1c.zCoord, tex2, tex3);
			tessellator.addVertexWithUV(vec1d.xCoord, vec1d.yCoord, vec1d.zCoord, tex1, tex3);
		}
	}

	private static void renderOuterWest(RenderBlocks renderblocks, IBlockAccess iblockaccess, int x, int y, int z, BarricadeBlock barricade, Tessellator tessellator)
	{
		tessellator.setBrightness(barricade.getMixedBrightnessForBlock(iblockaccess, x, y, z));
		float color = 1.0F;

		tessellator.setColorOpaque_F(color, color, color);
		int var14 = barricade.getBlockTextureFromSide(0);

		int var15 = (var14 & 0xF) << 4;
		int var16 = var14 & 0xF0;
		float tex1 = var15 / 256.0F;
		float tex2 = (var15 + 16.0F) / 256.0F;
		float tex3 = var16 / 256.0F;
		float tex4 = (var16 + 16.0F) / 256.0F;
		Vec3[] vec2 = new Vec3[8];
		float minSize = 0.125F;
		float maxSize = 0.125F;
		float height = 1.416F;

		vec2[0] = Vec3.createVectorHelper(-minSize, 0.0D, -maxSize);
		vec2[1] = Vec3.createVectorHelper(minSize, 0.0D, -maxSize);
		vec2[2] = Vec3.createVectorHelper(minSize, 0.0D, maxSize);
		vec2[3] = Vec3.createVectorHelper(-minSize, 0.0D, maxSize);
		vec2[4] = Vec3.createVectorHelper(-minSize, height, -maxSize);
		vec2[5] = Vec3.createVectorHelper(minSize, height, -maxSize);
		vec2[6] = Vec3.createVectorHelper(minSize, height, maxSize);
		vec2[7] = Vec3.createVectorHelper(-minSize, height, maxSize);

		for (int var25 = 0; var25 < 8; var25++)
		{
			vec2[var25].zCoord -= 0.0625D;
			vec2[var25].rotateAroundX(-0.7853982F);
			vec2[var25].yCoord -= 0.5D;
			vec2[var25].rotateAroundX(1.570796F);

			vec2[var25].xCoord += x + 0.125D;
			vec2[var25].yCoord += y;
			vec2[var25].zCoord += z + 0.5D;
		}
		Vec3 vec2a = null;
		Vec3 vec2b = null;
		Vec3 vec2c = null;
		Vec3 vec2d = null;

		for (int iter = 0; iter < 6; iter++)
		{
			if (iter == 0)
			{
				tex1 = var15 / 256.0F;
				tex2 = (var15 + 9 - 0.01F) / 256.0F;
				tex3 = var16 / 256.0F;
				tex4 = (var16 + 8 - 0.01F) / 256.0F;
			}
			else if (iter == 2)
			{
				tex1 = (var15 + 4.0F) / 256.0F;
				tex2 = (var15 + 9 - 0.01F) / 256.0F;
				tex3 = var16 / 256.0F;
				tex4 = (var16 + 16 - 0.01F) / 256.0F;
			}

			if (iter == 0)
			{
				vec2a = vec2[0];
				vec2b = vec2[1];
				vec2c = vec2[2];
				vec2d = vec2[3];
			}
			else if (iter == 1)
			{
				vec2a = vec2[7];
				vec2b = vec2[6];
				vec2c = vec2[5];
				vec2d = vec2[4];
			}
			else if (iter == 2)
			{
				vec2a = vec2[1];
				vec2b = vec2[0];
				vec2c = vec2[4];
				vec2d = vec2[5];
			}
			else if (iter == 3)
			{
				vec2a = vec2[2];
				vec2b = vec2[1];
				vec2c = vec2[5];
				vec2d = vec2[6];
			}
			else if (iter == 4)
			{
				vec2a = vec2[3];
				vec2b = vec2[2];
				vec2c = vec2[6];
				vec2d = vec2[7];
			}
			else if (iter == 5)
			{
				vec2a = vec2[0];
				vec2b = vec2[3];
				vec2c = vec2[7];
				vec2d = vec2[4];
			}

			tessellator.addVertexWithUV(vec2a.xCoord, vec2a.yCoord, vec2a.zCoord, tex1, tex4);
			tessellator.addVertexWithUV(vec2b.xCoord, vec2b.yCoord, vec2b.zCoord, tex2, tex4);
			tessellator.addVertexWithUV(vec2c.xCoord, vec2c.yCoord, vec2c.zCoord, tex2, tex3);
			tessellator.addVertexWithUV(vec2d.xCoord, vec2d.yCoord, vec2d.zCoord, tex1, tex3);
		}
	}

	private static void renderInnerEast(RenderBlocks renderblocks, IBlockAccess iblockaccess, int x, int y, int z, BarricadeBlock barricade, Tessellator tessellator)
	{
		tessellator.setBrightness(barricade.getMixedBrightnessForBlock(iblockaccess, x, y, z));
		float color = 1.0F;

		tessellator.setColorOpaque_F(color, color, color);
		int var14 = barricade.getBlockTextureFromSide(0);

		int var15 = (var14 & 0xF) << 4;
		int var16 = var14 & 0xF0;
		float tex1 = var15 / 256.0F;
		float tex2 = (var15 + 16.0F) / 256.0F;
		float tex3 = var16 / 256.0F;
		float tex4 = (var16 + 16.0F) / 256.0F;
		Vec3[] vec3 = new Vec3[8];
		float minSize = 0.125F;
		float maxSize = 0.125F;
		float height = 1.416F;
		vec3[0] = Vec3.createVectorHelper(-minSize, 0.0D, -maxSize);
		vec3[1] = Vec3.createVectorHelper(minSize, 0.0D, -maxSize);
		vec3[2] = Vec3.createVectorHelper(minSize, 0.0D, maxSize);
		vec3[3] = Vec3.createVectorHelper(-minSize, 0.0D, maxSize);
		vec3[4] = Vec3.createVectorHelper(-minSize, height, -maxSize);
		vec3[5] = Vec3.createVectorHelper(minSize, height, -maxSize);
		vec3[6] = Vec3.createVectorHelper(minSize, height, maxSize);
		vec3[7] = Vec3.createVectorHelper(-minSize, height, maxSize);

		for (int var25 = 0; var25 < 8; var25++)
		{
			vec3[var25].zCoord -= 0.0625D;
			vec3[var25].rotateAroundX(-0.7853982F);
			vec3[var25].yCoord -= 0.0625D;
			vec3[var25].rotateAroundX(6.283186F);

			vec3[var25].xCoord += x + 0.375D;
			vec3[var25].yCoord += y;
			vec3[var25].zCoord += z;
		}

		Vec3 vec3a = null;
		Vec3 vec3b = null;
		Vec3 vec3c = null;
		Vec3 Vec3 = null;

		for (int iter = 0; iter < 6; iter++)
		{
			if (iter == 0)
			{
				tex1 = var15 / 256.0F;
				tex2 = (var15 + 9 - 0.01F) / 256.0F;
				tex3 = var16 / 256.0F;
				tex4 = (var16 + 8 - 0.01F) / 256.0F;
			}
			else if (iter == 2)
			{
				tex1 = (var15 + 4.0F) / 256.0F;
				tex2 = (var15 + 9 - 0.01F) / 256.0F;
				tex3 = var16 / 256.0F;
				tex4 = (var16 + 16 - 0.01F) / 256.0F;
			}

			if (iter == 0)
			{
				vec3a = vec3[0];
				vec3b = vec3[1];
				vec3c = vec3[2];
				Vec3 = vec3[3];
			}
			else if (iter == 1)
			{
				vec3a = vec3[7];
				vec3b = vec3[6];
				vec3c = vec3[5];
				Vec3 = vec3[4];
			}
			else if (iter == 2)
			{
				vec3a = vec3[1];
				vec3b = vec3[0];
				vec3c = vec3[4];
				Vec3 = vec3[5];
			}
			else if (iter == 3)
			{
				vec3a = vec3[2];
				vec3b = vec3[1];
				vec3c = vec3[5];
				Vec3 = vec3[6];
			}
			else if (iter == 4)
			{
				vec3a = vec3[2];
				vec3b = vec3[1];
				vec3c = vec3[5];
				Vec3 = vec3[6];
			}
			else if (iter == 5)
			{
				vec3a = vec3[0];
				vec3b = vec3[3];
				vec3c = vec3[7];
				Vec3 = vec3[4];
			}

			tessellator.addVertexWithUV(vec3a.xCoord, vec3a.yCoord, vec3a.zCoord, tex1, tex4);
			tessellator.addVertexWithUV(vec3b.xCoord, vec3b.yCoord, vec3b.zCoord, tex2, tex4);
			tessellator.addVertexWithUV(vec3c.xCoord, vec3c.yCoord, vec3c.zCoord, tex2, tex3);
			tessellator.addVertexWithUV(Vec3.xCoord, Vec3.yCoord, Vec3.zCoord, tex1, tex3);
		}
	}

	private static void renderOuterEast(RenderBlocks renderblocks, IBlockAccess iblockaccess, int x, int y, int z, BarricadeBlock barricade, Tessellator tessellator)
	{
		tessellator.setBrightness(barricade.getMixedBrightnessForBlock(iblockaccess, x, y, z));
		float color = 1.0F;

		tessellator.setColorOpaque_F(color, color, color);
		int var14 = barricade.getBlockTextureFromSide(0);

		int var15 = (var14 & 0xF) << 4;
		int var16 = var14 & 0xF0;
		float tex1 = var15 / 256.0F;
		float tex2 = (var15 + 16.0F) / 256.0F;
		float tex3 = var16 / 256.0F;
		float tex4 = (var16 + 16.0F) / 256.0F;
		Vec3[] vec4 = new Vec3[8];
		float minSize = 0.125F;
		float maxSize = 0.125F;
		float height = 1.416F;

		vec4[0] = Vec3.createVectorHelper(-minSize, 0.0D, -maxSize);
		vec4[1] = Vec3.createVectorHelper(minSize, 0.0D, -maxSize);
		vec4[2] = Vec3.createVectorHelper(minSize, 0.0D, maxSize);
		vec4[3] = Vec3.createVectorHelper(-minSize, 0.0D, maxSize);
		vec4[4] = Vec3.createVectorHelper(-minSize, height, -maxSize);
		vec4[5] = Vec3.createVectorHelper(minSize, height, -maxSize);
		vec4[6] = Vec3.createVectorHelper(minSize, height, maxSize);
		vec4[7] = Vec3.createVectorHelper(-minSize, height, maxSize);

		for (int var25 = 0; var25 < 8; var25++)
		{
			vec4[var25].zCoord -= 0.0625D;
			vec4[var25].rotateAroundX(-0.7853982F);
			vec4[var25].yCoord -= 0.0625D;
			vec4[var25].rotateAroundX(6.283186F);

			vec4[var25].xCoord += x + 0.875D;
			vec4[var25].yCoord += y;
			vec4[var25].zCoord += z;
		}

		Vec3 vec4a = null;
		Vec3 vec4b = null;
		Vec3 vec4c = null;
		Vec3 vec4d = null;

		for (int iter = 0; iter < 6; iter++)
		{
			if (iter == 0)
			{
				tex1 = var15 / 256.0F;
				tex2 = (var15 + 9 - 0.01F) / 256.0F;
				tex3 = var16 / 256.0F;
				tex4 = (var16 + 8 - 0.01F) / 256.0F;
			}
			else if (iter == 2)
			{
				tex1 = (var15 + 4.0F) / 256.0F;
				tex2 = (var15 + 9 - 0.01F) / 256.0F;
				tex3 = var16 / 256.0F;
				tex4 = (var16 + 16 - 0.01F) / 256.0F;
			}

			if (iter == 0)
			{
				vec4a = vec4[0];
				vec4b = vec4[1];
				vec4c = vec4[2];
				vec4d = vec4[3];
			}
			else if (iter == 1)
			{
				vec4a = vec4[7];
				vec4b = vec4[6];
				vec4c = vec4[5];
				vec4d = vec4[4];
			}
			else if (iter == 2)
			{
				vec4a = vec4[1];
				vec4b = vec4[0];
				vec4c = vec4[4];
				vec4d = vec4[5];
			}
			else if (iter == 3)
			{
				vec4a = vec4[2];
				vec4b = vec4[1];
				vec4c = vec4[5];
				vec4d = vec4[6];
			}
			else if (iter == 4)
			{
				vec4a = vec4[2];
				vec4b = vec4[1];
				vec4c = vec4[5];
				vec4d = vec4[6];
			}
			else if (iter == 5)
			{
				vec4a = vec4[0];
				vec4b = vec4[3];
				vec4c = vec4[7];
				vec4d = vec4[4];
			}

			tessellator.addVertexWithUV(vec4a.xCoord, vec4a.yCoord, vec4a.zCoord, tex1, tex4);
			tessellator.addVertexWithUV(vec4b.xCoord, vec4b.yCoord, vec4b.zCoord, tex2, tex4);
			tessellator.addVertexWithUV(vec4c.xCoord, vec4c.yCoord, vec4c.zCoord, tex2, tex3);
			tessellator.addVertexWithUV(vec4d.xCoord, vec4d.yCoord, vec4d.zCoord, tex1, tex3);
		}
	}

	private static void renderInnerNorth(RenderBlocks renderblocks, IBlockAccess iblockaccess, int x, int y, int z, BarricadeBlock barricade, Tessellator tessellator)
	{
		tessellator.setBrightness(barricade.getMixedBrightnessForBlock(iblockaccess, x, y, z));
		float color = 1.0F;

		tessellator.setColorOpaque_F(color, color, color);
		int var14 = barricade.getBlockTextureFromSide(0);

		int var15 = (var14 & 0xF) << 4;
		int var16 = var14 & 0xF0;
		float tex1 = var15 / 256.0F;
		float tex2 = (var15 + 16.0F) / 256.0F;
		float tex3 = var16 / 256.0F;
		float tex4 = (var16 + 16.0F) / 256.0F;
		Vec3[] vec1 = new Vec3[8];
		float minSize = 0.125F;
		float maxSize = 0.125F;
		float height = 1.416F;
		vec1[0] = Vec3.createVectorHelper(-minSize, 0.0D, -maxSize);
		vec1[1] = Vec3.createVectorHelper(minSize, 0.0D, -maxSize);
		vec1[2] = Vec3.createVectorHelper(minSize, 0.0D, maxSize);
		vec1[3] = Vec3.createVectorHelper(-minSize, 0.0D, maxSize);
		vec1[4] = Vec3.createVectorHelper(-minSize, height, -maxSize);
		vec1[5] = Vec3.createVectorHelper(minSize, height, -maxSize);
		vec1[6] = Vec3.createVectorHelper(minSize, height, maxSize);
		vec1[7] = Vec3.createVectorHelper(-minSize, height, maxSize);

		for (int var25 = 0; var25 < 8; var25++)
		{
			vec1[var25].zCoord -= 0.4375D;
			vec1[var25].rotateAroundX(-0.7853982F);
			vec1[var25].yCoord -= 0.5D;
			vec1[var25].rotateAroundY(1.570796F);

			vec1[var25].xCoord += x + 0.375D;
			vec1[var25].yCoord += y + 0.1875D;
			vec1[var25].zCoord += z + 0.625D;
		}

		Vec3 vec1a = null;
		Vec3 vec1b = null;
		Vec3 vec1c = null;
		Vec3 vec1d = null;

		for (int iter = 0; iter < 6; iter++)
		{
			if (iter == 0)
			{
				tex1 = var15 / 256.0F;
				tex2 = (var15 + 9 - 0.01F) / 256.0F;
				tex3 = var16 / 256.0F;
				tex4 = (var16 + 8 - 0.01F) / 256.0F;
			}
			else if (iter == 2)
			{
				tex1 = (var15 + 4.0F) / 256.0F;
				tex2 = (var15 + 9 - 0.01F) / 256.0F;
				tex3 = var16 / 256.0F;
				tex4 = (var16 + 16 - 0.01F) / 256.0F;
			}

			if (iter == 0)
			{
				vec1a = vec1[0];
				vec1b = vec1[1];
				vec1c = vec1[2];
				vec1d = vec1[3];
			}
			else if (iter == 1)
			{
				vec1a = vec1[7];
				vec1b = vec1[6];
				vec1c = vec1[5];
				vec1d = vec1[4];
			}
			else if (iter == 2)
			{
				vec1a = vec1[1];
				vec1b = vec1[0];
				vec1c = vec1[4];
				vec1d = vec1[5];
			}
			else if (iter == 3)
			{
				vec1a = vec1[2];
				vec1b = vec1[1];
				vec1c = vec1[5];
				vec1d = vec1[6];
			}
			else if (iter == 4)
			{
				vec1a = vec1[3];
				vec1b = vec1[2];
				vec1c = vec1[6];
				vec1d = vec1[7];
			}
			else if (iter == 5)
			{
				vec1a = vec1[0];
				vec1b = vec1[3];
				vec1c = vec1[7];
				vec1d = vec1[4];
			}

			tessellator.addVertexWithUV(vec1a.xCoord, vec1a.yCoord, vec1a.zCoord, tex1, tex4);
			tessellator.addVertexWithUV(vec1b.xCoord, vec1b.yCoord, vec1b.zCoord, tex2, tex4);
			tessellator.addVertexWithUV(vec1c.xCoord, vec1c.yCoord, vec1c.zCoord, tex2, tex3);
			tessellator.addVertexWithUV(vec1d.xCoord, vec1d.yCoord, vec1d.zCoord, tex1, tex3);
		}
	}

	private static void renderOuterNorth(RenderBlocks renderblocks, IBlockAccess iblockaccess, int x, int y, int z, BarricadeBlock barricade, Tessellator tessellator)
	{
		tessellator.setBrightness(barricade.getMixedBrightnessForBlock(iblockaccess, x, y, z));
		float color = 1.0F;

		tessellator.setColorOpaque_F(color, color, color);
		int var14 = barricade.getBlockTextureFromSide(0);

		int var15 = (var14 & 0xF) << 4;
		int var16 = var14 & 0xF0;
		float tex1 = var15 / 256.0F;
		float tex2 = (var15 + 16.0F) / 256.0F;
		float tex3 = var16 / 256.0F;
		float tex4 = (var16 + 16.0F) / 256.0F;
		Vec3[] vec2 = new Vec3[8];
		float minSize = 0.125F;
		float maxSize = 0.125F;
		float height = 1.416F;
		vec2[0] = Vec3.createVectorHelper(-minSize, 0.0D, -maxSize);
		vec2[1] = Vec3.createVectorHelper(minSize, 0.0D, -maxSize);
		vec2[2] = Vec3.createVectorHelper(minSize, 0.0D, maxSize);
		vec2[3] = Vec3.createVectorHelper(-minSize, 0.0D, maxSize);
		vec2[4] = Vec3.createVectorHelper(-minSize, height, -maxSize);
		vec2[5] = Vec3.createVectorHelper(minSize, height, -maxSize);
		vec2[6] = Vec3.createVectorHelper(minSize, height, maxSize);
		vec2[7] = Vec3.createVectorHelper(-minSize, height, maxSize);

		for (int var25 = 0; var25 < 8; var25++)
		{
			vec2[var25].zCoord -= 0.4375D;
			vec2[var25].rotateAroundX(-0.7853982F);
			vec2[var25].yCoord -= 0.5D;
			vec2[var25].rotateAroundY(1.570796F);

			vec2[var25].xCoord += x + 0.375D;
			vec2[var25].yCoord += y + 0.1875D;
			vec2[var25].zCoord += z + 0.125D;
		}

		Vec3 vec2a = null;
		Vec3 vec2b = null;
		Vec3 vec2c = null;
		Vec3 vec2d = null;

		for (int iter = 0; iter < 6; iter++)
		{
			if (iter == 0)
			{
				tex1 = var15 / 256.0F;
				tex2 = (var15 + 9 - 0.01F) / 256.0F;
				tex3 = var16 / 256.0F;
				tex4 = (var16 + 8 - 0.01F) / 256.0F;
			}
			else if (iter == 2)
			{
				tex1 = (var15 + 4.0F) / 256.0F;
				tex2 = (var15 + 9 - 0.01F) / 256.0F;
				tex3 = var16 / 256.0F;
				tex4 = (var16 + 16 - 0.01F) / 256.0F;
			}

			if (iter == 0)
			{
				vec2a = vec2[0];
				vec2b = vec2[1];
				vec2c = vec2[2];
				vec2d = vec2[3];
			}
			else if (iter == 1)
			{
				vec2a = vec2[7];
				vec2b = vec2[6];
				vec2c = vec2[5];
				vec2d = vec2[4];
			}
			else if (iter == 2)
			{
				vec2a = vec2[1];
				vec2b = vec2[0];
				vec2c = vec2[4];
				vec2d = vec2[5];
			}
			else if (iter == 3)
			{
				vec2a = vec2[2];
				vec2b = vec2[1];
				vec2c = vec2[5];
				vec2d = vec2[6];
			}
			else if (iter == 4)
			{
				vec2a = vec2[3];
				vec2b = vec2[2];
				vec2c = vec2[6];
				vec2d = vec2[7];
			}
			else if (iter == 5)
			{
				vec2a = vec2[0];
				vec2b = vec2[3];
				vec2c = vec2[7];
				vec2d = vec2[4];
			}

			tessellator.addVertexWithUV(vec2a.xCoord, vec2a.yCoord, vec2a.zCoord, tex1, tex4);
			tessellator.addVertexWithUV(vec2b.xCoord, vec2b.yCoord, vec2b.zCoord, tex2, tex4);
			tessellator.addVertexWithUV(vec2c.xCoord, vec2c.yCoord, vec2c.zCoord, tex2, tex3);
			tessellator.addVertexWithUV(vec2d.xCoord, vec2d.yCoord, vec2d.zCoord, tex1, tex3);
		}
	}

	private static void renderInnerSouth(RenderBlocks renderblocks, IBlockAccess iblockaccess, int x, int y, int z, BarricadeBlock barricade, Tessellator tessellator)
	{
		tessellator.setBrightness(barricade.getMixedBrightnessForBlock(iblockaccess, x, y, z));
		float color = 1.0F;

		tessellator.setColorOpaque_F(color, color, color);
		int var14 = barricade.getBlockTextureFromSide(0);

		int var15 = (var14 & 0xF) << 4;
		int var16 = var14 & 0xF0;
		float tex1 = var15 / 256.0F;
		float tex2 = (var15 + 16.0F) / 256.0F;
		float tex3 = var16 / 256.0F;
		float tex4 = (var16 + 16.0F) / 256.0F;
		Vec3[] vec3 = new Vec3[8];
		float minSize = 0.125F;
		float maxSize = 0.125F;
		float height = 1.416F;
		vec3[0] = Vec3.createVectorHelper(-minSize, 0.0D, -maxSize);
		vec3[1] = Vec3.createVectorHelper(minSize, 0.0D, -maxSize);
		vec3[2] = Vec3.createVectorHelper(minSize, 0.0D, maxSize);
		vec3[3] = Vec3.createVectorHelper(-minSize, 0.0D, maxSize);
		vec3[4] = Vec3.createVectorHelper(-minSize, height, -maxSize);
		vec3[5] = Vec3.createVectorHelper(minSize, height, -maxSize);
		vec3[6] = Vec3.createVectorHelper(minSize, height, maxSize);
		vec3[7] = Vec3.createVectorHelper(-minSize, height, maxSize);

		for (int var25 = 0; var25 < 8; var25++)
		{
			vec3[var25].zCoord -= 0.4375D;
			vec3[var25].rotateAroundX(-0.7853982F);
			vec3[var25].yCoord -= 0.5D;
			vec3[var25].rotateAroundY(4.712389F);

			vec3[var25].xCoord += x + 0.625D;
			vec3[var25].yCoord += y + 0.1875D;
			vec3[var25].zCoord += z + 0.375D;
		}
		Vec3 vec3a = null;
		Vec3 vec3b = null;
		Vec3 vec3c = null;
		Vec3 Vec3 = null;
		for (int iter = 0; iter < 6; iter++)
		{
			if (iter == 0)
			{
				tex1 = var15 / 256.0F;
				tex2 = (var15 + 9 - 0.01F) / 256.0F;
				tex3 = var16 / 256.0F;
				tex4 = (var16 + 8 - 0.01F) / 256.0F;
			}
			else if (iter == 2)
			{
				tex1 = (var15 + 4.0F) / 256.0F;
				tex2 = (var15 + 9 - 0.01F) / 256.0F;
				tex3 = var16 / 256.0F;
				tex4 = (var16 + 16 - 0.01F) / 256.0F;
			}

			if (iter == 0)
			{
				vec3a = vec3[0];
				vec3b = vec3[1];
				vec3c = vec3[2];
				Vec3 = vec3[3];
			}
			else if (iter == 1)
			{
				vec3a = vec3[7];
				vec3b = vec3[6];
				vec3c = vec3[5];
				Vec3 = vec3[4];
			}
			else if (iter == 2)
			{
				vec3a = vec3[1];
				vec3b = vec3[0];
				vec3c = vec3[4];
				Vec3 = vec3[5];
			}
			else if (iter == 3)
			{
				vec3a = vec3[2];
				vec3b = vec3[1];
				vec3c = vec3[5];
				Vec3 = vec3[6];
			}
			else if (iter == 4)
			{
				vec3a = vec3[2];
				vec3b = vec3[1];
				vec3c = vec3[5];
				Vec3 = vec3[6];
			}
			else if (iter == 5)
			{
				vec3a = vec3[0];
				vec3b = vec3[3];
				vec3c = vec3[7];
				Vec3 = vec3[4];
			}

			tessellator.addVertexWithUV(vec3a.xCoord, vec3a.yCoord, vec3a.zCoord, tex1, tex4);
			tessellator.addVertexWithUV(vec3b.xCoord, vec3b.yCoord, vec3b.zCoord, tex2, tex4);
			tessellator.addVertexWithUV(vec3c.xCoord, vec3c.yCoord, vec3c.zCoord, tex2, tex3);
			tessellator.addVertexWithUV(Vec3.xCoord, Vec3.yCoord, Vec3.zCoord, tex1, tex3);
		}
	}

	private static void renderOuterSouth(RenderBlocks renderblocks, IBlockAccess iblockaccess, int x, int y, int z, BarricadeBlock barricade, Tessellator tessellator)
	{
		tessellator.setBrightness(barricade.getMixedBrightnessForBlock(iblockaccess, x, y, z));
		float color = 1.0F;

		tessellator.setColorOpaque_F(color, color, color);
		int var14 = barricade.getBlockTextureFromSide(0);

		int var15 = (var14 & 0xF) << 4;
		int var16 = var14 & 0xF0;
		float tex1 = var15 / 256.0F;
		float tex2 = (var15 + 16.0F) / 256.0F;
		float tex3 = var16 / 256.0F;
		float tex4 = (var16 + 16.0F) / 256.0F;
		Vec3[] vec4 = new Vec3[8];
		float minSize = 0.125F;
		float maxSize = 0.125F;
		float height = 1.416F;
		vec4[0] = Vec3.createVectorHelper(-minSize, 0.0D, -maxSize);
		vec4[1] = Vec3.createVectorHelper(minSize, 0.0D, -maxSize);
		vec4[2] = Vec3.createVectorHelper(minSize, 0.0D, maxSize);
		vec4[3] = Vec3.createVectorHelper(-minSize, 0.0D, maxSize);
		vec4[4] = Vec3.createVectorHelper(-minSize, height, -maxSize);
		vec4[5] = Vec3.createVectorHelper(minSize, height, -maxSize);
		vec4[6] = Vec3.createVectorHelper(minSize, height, maxSize);
		vec4[7] = Vec3.createVectorHelper(-minSize, height, maxSize);

		for (int var25 = 0; var25 < 8; var25++)
		{
			vec4[var25].zCoord -= 0.4375D;
			vec4[var25].rotateAroundX(-0.7853982F);
			vec4[var25].yCoord -= 0.5D;
			vec4[var25].rotateAroundY(4.712389F);

			vec4[var25].xCoord += x + 0.625D;
			vec4[var25].yCoord += y + 0.1875D;
			vec4[var25].zCoord += z + 0.875D;
		}

		Vec3 vec4a = null;
		Vec3 vec4b = null;
		Vec3 vec4c = null;
		Vec3 vec4d = null;

		for (int iter = 0; iter < 6; iter++)
		{
			if (iter == 0)
			{
				tex1 = var15 / 256.0F;
				tex2 = (var15 + 9 - 0.01F) / 256.0F;
				tex3 = var16 / 256.0F;
				tex4 = (var16 + 8 - 0.01F) / 256.0F;
			}
			else if (iter == 2)
			{
				tex1 = (var15 + 4.0F) / 256.0F;
				tex2 = (var15 + 9 - 0.01F) / 256.0F;
				tex3 = var16 / 256.0F;
				tex4 = (var16 + 16 - 0.01F) / 256.0F;
			}

			if (iter == 0)
			{
				vec4a = vec4[0];
				vec4b = vec4[1];
				vec4c = vec4[2];
				vec4d = vec4[3];
			}
			else if (iter == 1)
			{
				vec4a = vec4[7];
				vec4b = vec4[6];
				vec4c = vec4[5];
				vec4d = vec4[4];
			}
			else if (iter == 2)
			{
				vec4a = vec4[1];
				vec4b = vec4[0];
				vec4c = vec4[4];
				vec4d = vec4[5];
			}
			else if (iter == 3)
			{
				vec4a = vec4[2];
				vec4b = vec4[1];
				vec4c = vec4[5];
				vec4d = vec4[6];
			}
			else if (iter == 4)
			{
				vec4a = vec4[2];
				vec4b = vec4[1];
				vec4c = vec4[5];
				vec4d = vec4[6];
			}
			else if (iter == 5)
			{
				vec4a = vec4[0];
				vec4b = vec4[3];
				vec4c = vec4[7];
				vec4d = vec4[4];
			}

			tessellator.addVertexWithUV(vec4a.xCoord, vec4a.yCoord, vec4a.zCoord, tex1, tex4);
			tessellator.addVertexWithUV(vec4b.xCoord, vec4b.yCoord, vec4b.zCoord, tex2, tex4);
			tessellator.addVertexWithUV(vec4c.xCoord, vec4c.yCoord, vec4c.zCoord, tex2, tex3);
			tessellator.addVertexWithUV(vec4d.xCoord, vec4d.yCoord, vec4d.zCoord, tex1, tex3);
		}
	}
}
