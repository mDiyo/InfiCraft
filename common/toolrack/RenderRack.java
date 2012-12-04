package net.minecraft.src;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import org.lwjgl.opengl.GL11;

public class RenderRack implements ISimpleBlockRenderingHandler
{
    private int renderId = RenderingRegistry.getNextAvailableRenderId();
    private static final float[][] modelCubes = new float[][] {{0.0F, 0.6F, 0.0F, 1.0F, 0.8F, 0.15F}, {0.2F, 0.3F, 0.0F, 0.275F, 0.9F, 0.1F}, {0.725F, 0.3F, 0.0F, 0.8F, 0.9F, 0.1F}, {0.0F, 0.2F, 0.0F, 1.0F, 0.3F, 0.3F}};

    public RenderRack()
    {
        RenderingRegistry.registerBlockHandler(this);
    }

    public int getRenderId()
    {
        return this.renderId;
    }

    public boolean shouldRender3DInInventory()
    {
        return true;
    }

    public boolean renderWorldBlock(IBlockAccess var1, int var2, int var3, int var4, Block var5, int var6, RenderBlocks var7)
    {
        return var6 == this.renderId ? this.renderRackBlock(var7, var1, var2, var3, var4, (BlockRack)var5) : false;
    }

    public void renderInventoryBlock(Block var1, int var2, int var3, RenderBlocks var4)
    {
        if (var3 == this.renderId)
        {
            this.renderRackItem(var4, (BlockRack)var1, var2);
        }
    }

    private void renderRackItem(RenderBlocks var1, BlockRack var2, int var3)
    {
        Tessellator var4 = Tessellator.instance;

        for (int var5 = 0; var5 < modelCubes.length; ++var5)
        {
            float[] var6 = modelCubes[var5];
            var2.setBlockBounds(var6[0], var6[1], var6[2], var6[3], var6[4], var6[5]);
            GL11.glTranslatef(-0.5F, -0.5F, 0.0F);
            var4.startDrawingQuads();
            var4.setNormal(0.0F, 1.0F, 0.0F);
            var1.renderTopFace(var2, 0.0D, 0.0D, 0.0D, var2.getBlockTextureFromSideAndMetadata(1, var3));
            var4.draw();
            var4.startDrawingQuads();
            var4.setNormal(0.0F, 0.0F, 1.0F);
            var1.renderWestFace(var2, 0.0D, 0.0D, 0.0D, var2.getBlockTextureFromSideAndMetadata(3, var3));
            var4.draw();
            var4.startDrawingQuads();
            var4.setNormal(1.0F, 0.0F, 0.0F);
            var1.renderSouthFace(var2, 0.0D, 0.0D, 0.0D, var2.getBlockTextureFromSideAndMetadata(5, var3));
            var4.draw();
            GL11.glTranslatef(0.5F, 0.5F, 0.0F);
        }

        var2.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

    private boolean renderRackBlock(RenderBlocks var1, IBlockAccess var2, int var3, int var4, int var5, BlockRack var6)
    {
        int var7 = var2.getBlockMetadata(var3, var4, var5) & 3;
        int var8;
        float[] var9;

        if (var7 == 0)
        {
            for (var8 = 0; var8 < modelCubes.length; ++var8)
            {
                var9 = modelCubes[var8];
                var6.setBlockBounds(var9[0], var9[1], var9[2], var9[3], var9[4], var9[5]);
                var1.renderStandardBlock(var6, var3, var4, var5);
            }
        }
        else if (var7 == 1)
        {
            for (var8 = 0; var8 < modelCubes.length; ++var8)
            {
                var9 = modelCubes[var8];
                var6.setBlockBounds(var9[2], var9[1], var9[0], var9[5], var9[4], var9[3]);
                var1.renderStandardBlock(var6, var3, var4, var5);
            }
        }
        else if (var7 == 2)
        {
            for (var8 = 0; var8 < modelCubes.length; ++var8)
            {
                var9 = modelCubes[var8];
                var6.setBlockBounds(var9[0], var9[1], 1.0F - var9[5], var9[3], var9[4], 1.0F - var9[2]);
                var1.renderStandardBlock(var6, var3, var4, var5);
            }
        }
        else if (var7 == 3)
        {
            for (var8 = 0; var8 < modelCubes.length; ++var8)
            {
                var9 = modelCubes[var8];
                var6.setBlockBounds(1.0F - var9[5], var9[1], var9[0], 1.0F - var9[2], var9[4], var9[3]);
                var1.renderStandardBlock(var6, var3, var4, var5);
            }
        }

        var6.calcBounds(var7);
        return false;
    }
}
