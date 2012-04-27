package net.minecraft.src.orizondim.blocks;
import net.minecraft.src.*;

import org.lwjgl.opengl.GL11;

public class FallingDirtRender extends Render
{
    private RenderBlocks renderBlocks = new RenderBlocks();

    public FallingDirtRender()
    {
        this.shadowSize = 0.5F;
    }

    /**
     * The actual render method that is used in doRender
     */
    public void doRenderFallingSand(FallingDirtEntity fallingdirt, double par2, double par4, double par6, float par8, float par9)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)par2, (float)par4, (float)par6);
        this.loadTexture("/oretex/organics.png");
        Block var10 = Block.blocksList[fallingdirt.blockID];
        World var11 = fallingdirt.getWorld();
        GL11.glDisable(GL11.GL_LIGHTING);

        if (var10 == Block.dragonEgg)
        {
            this.renderBlocks.blockAccess = var11;
            Tessellator var12 = Tessellator.instance;
            var12.startDrawingQuads();
            var12.setTranslation((double)((float)(-MathHelper.floor_double(fallingdirt.posX)) - 0.5F), (double)((float)(-MathHelper.floor_double(fallingdirt.posY)) - 0.5F), (double)((float)(-MathHelper.floor_double(fallingdirt.posZ)) - 0.5F));
            this.renderBlocks.renderBlockByRenderType(var10, MathHelper.floor_double(fallingdirt.posX), MathHelper.floor_double(fallingdirt.posY), MathHelper.floor_double(fallingdirt.posZ));
            var12.setTranslation(0.0D, 0.0D, 0.0D);
            var12.draw();
        }
        else
        {
            this.renderFallingDirt(var10, var11, MathHelper.floor_double(fallingdirt.posX), MathHelper.floor_double(fallingdirt.posY), MathHelper.floor_double(fallingdirt.posZ), fallingdirt);
        }

        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glPopMatrix();
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.doRenderFallingSand((FallingDirtEntity)par1Entity, par2, par4, par6, par8, par9);
    }
    
    public void renderFallingDirt(Block par1Block, World par2World, int par3, int par4, int par5, FallingDirtEntity fallingdirt)
    {
        float var6 = 0.5F;
        float var7 = 1.0F;
        float var8 = 0.8F;
        float var9 = 0.6F;
        Tessellator var10 = Tessellator.instance;
        var10.startDrawingQuads();
        var10.setBrightness(par1Block.getMixedBrightnessForBlock(par2World, par3, par4, par5));
        float var11 = 1.0F;
        float var12 = 1.0F;

        if (var12 < var11)
        {
            var12 = var11;
        }

        var10.setColorOpaque_F(var6 * var12, var6 * var12, var6 * var12);
        renderBlocks.renderBottomFace(par1Block, -0.5D, -0.5D, -0.5D, par1Block.getBlockTextureFromSideAndMetadata(0, fallingdirt.metadata));
        var12 = 1.0F;

        if (var12 < var11)
        {
            var12 = var11;
        }

        var10.setColorOpaque_F(var7 * var12, var7 * var12, var7 * var12);
        renderBlocks.renderTopFace(par1Block, -0.5D, -0.5D, -0.5D, par1Block.getBlockTextureFromSideAndMetadata(1, fallingdirt.metadata));
        var12 = 1.0F;

        if (var12 < var11)
        {
            var12 = var11;
        }

        var10.setColorOpaque_F(var8 * var12, var8 * var12, var8 * var12);
        renderBlocks.renderEastFace(par1Block, -0.5D, -0.5D, -0.5D, par1Block.getBlockTextureFromSideAndMetadata(2, fallingdirt.metadata));
        var12 = 1.0F;

        if (var12 < var11)
        {
            var12 = var11;
        }

        var10.setColorOpaque_F(var8 * var12, var8 * var12, var8 * var12);
        renderBlocks.renderWestFace(par1Block, -0.5D, -0.5D, -0.5D, par1Block.getBlockTextureFromSideAndMetadata(3, fallingdirt.metadata));
        var12 = 1.0F;

        if (var12 < var11)
        {
            var12 = var11;
        }

        var10.setColorOpaque_F(var9 * var12, var9 * var12, var9 * var12);
        renderBlocks.renderNorthFace(par1Block, -0.5D, -0.5D, -0.5D, par1Block.getBlockTextureFromSideAndMetadata(4, fallingdirt.metadata));
        var12 = 1.0F;

        if (var12 < var11)
        {
            var12 = var11;
        }

        var10.setColorOpaque_F(var9 * var12, var9 * var12, var9 * var12);
        renderBlocks.renderSouthFace(par1Block, -0.5D, -0.5D, -0.5D, par1Block.getBlockTextureFromSideAndMetadata(5, fallingdirt.metadata));
        var10.draw();
    }
}
