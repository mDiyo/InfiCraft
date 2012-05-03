package net.minecraft.src.blocks.tech;

import net.minecraft.src.*;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

public class ChestSpecialRenderer extends TileEntitySpecialRenderer
{
    /** The normal small chest model. */
    private ModelChest chestModel = new ModelChest();

    /** The large double chest model. */
    private ModelChest largeChestModel = new ModelLargeChest();

    /**
     * Renders the TileEntity for the chest at a position.
     */
    public void renderChestLogicAt(ChestLogic logic, double x, double y, double z, float partialTick)
    {
        int var9;

        if (logic.worldObj == null)
        {
            var9 = 0;
        }
        else
        {
            Block var10 = logic.getBlockType();
            var9 = logic.getFacing();

            if (var10 != null && var9 == 0)
            {
                ((ChestBlock)var10).unifyAdjacentChests(logic.worldObj, logic.xCoord, logic.yCoord, logic.zCoord);
                var9 = logic.getFacing();
            }

            logic.checkForAdjacentChests();
        }

        if (logic.adjacentChestZNeg == null && logic.adjacentChestXNeg == null)
        {
            ModelChest var14;

            if (logic.adjacentChestXPos == null && logic.adjacentChestZPosition == null)
            {
                var14 = this.chestModel;
                this.bindTextureByName("/infiblocks/chestpine.png");
            }
            else
            {
                var14 = this.largeChestModel;
                this.bindTextureByName("/infiblocks/chestpinelarge.png");
            }

            GL11.glPushMatrix();
            GL11.glEnable(GL12.GL_RESCALE_NORMAL);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glTranslatef((float)x, (float)y + 1.0F, (float)z + 1.0F);
            GL11.glScalef(1.0F, -1.0F, -1.0F);
            GL11.glTranslatef(0.5F, 0.5F, 0.5F);
            short var11 = 0;

            if (var9 == 2)
            {
                var11 = 180;
            }

            if (var9 == 3)
            {
                var11 = 0;
            }

            if (var9 == 4)
            {
                var11 = 90;
            }

            if (var9 == 5)
            {
                var11 = -90;
            }

            if (var9 == 2 && logic.adjacentChestXPos != null)
            {
                GL11.glTranslatef(1.0F, 0.0F, 0.0F);
            }

            if (var9 == 5 && logic.adjacentChestZPosition != null)
            {
                GL11.glTranslatef(0.0F, 0.0F, -1.0F);
            }

            GL11.glRotatef((float)var11, 0.0F, 1.0F, 0.0F);
            GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
            float var12 = logic.prevLidAngle + (logic.lidAngle - logic.prevLidAngle) * partialTick;
            float var13;

            if (logic.adjacentChestZNeg != null)
            {
                var13 = logic.adjacentChestZNeg.prevLidAngle + (logic.adjacentChestZNeg.lidAngle - logic.adjacentChestZNeg.prevLidAngle) * partialTick;

                if (var13 > var12)
                {
                    var12 = var13;
                }
            }

            if (logic.adjacentChestXNeg != null)
            {
                var13 = logic.adjacentChestXNeg.prevLidAngle + (logic.adjacentChestXNeg.lidAngle - logic.adjacentChestXNeg.prevLidAngle) * partialTick;

                if (var13 > var12)
                {
                    var12 = var13;
                }
            }

            var12 = 1.0F - var12;
            var12 = 1.0F - var12 * var12 * var12;
            var14.chestLid.rotateAngleX = -(var12 * (float)Math.PI / 2.0F);
            var14.renderAll();
            GL11.glDisable(GL12.GL_RESCALE_NORMAL);
            GL11.glPopMatrix();
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        }
    }

    public void renderTileEntityAt(TileEntity par1TileEntity, double par2, double par4, double par6, float par8)
    {
        this.renderChestLogicAt((ChestLogic)par1TileEntity, par2, par4, par6, par8);
    }
}
