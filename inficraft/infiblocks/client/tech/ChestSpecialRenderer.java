package inficraft.infiblocks.client.tech;

import inficraft.infiblocks.tech.ChestBlock;
import inficraft.infiblocks.tech.ChestLogic;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

public class ChestSpecialRenderer extends TileEntitySpecialRenderer
{
    public static ChestModel chestModel = new ChestModel();
    public static ChestModel largeChestModel = new ChestModelLarge();

    public void renderChestLogicAt(ChestLogic var1, double var2, double var4, double var6, float var8)
    {
        short var9;

        if (var1.worldObj == null)
        {
            var9 = 0;
        }
        else
        {
            Block var10 = var1.getBlockType();
            var9 = var1.getFacing();

            if (var10 != null && var9 == 0)
            {
                ((ChestBlock)var10).unifyAdjacentChests(var1.worldObj, var1.xCoord, var1.yCoord, var1.zCoord);
                var9 = var1.getFacing();
            }

            var1.checkForAdjacentChests();
        }

        if (var1.adjacentChestZNeg == null && var1.adjacentChestXNeg == null)
        {
            int var11;

            if (!var1.adjacentChestChecked)
            {
                var11 = var1.metadata;
            }
            else
            {
                var11 = var1.worldObj.getBlockMetadata(var1.xCoord, var1.yCoord, var1.zCoord);
            }

            ChestModel var15;

            if (var1.adjacentChestXPos == null && var1.adjacentChestZPosition == null)
            {
                var15 = chestModel;
                this.bindTextureByName("/infiblocks/chesttex/chest" + this.getTextureByNumber(var11) + ".png");
            }
            else
            {
                var15 = largeChestModel;
                this.bindTextureByName("/infiblocks/chesttex/largechest" + this.getTextureByNumber(var11) + ".png");
            }

            GL11.glPushMatrix();
            GL11.glEnable(GL12.GL_RESCALE_NORMAL);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glTranslatef((float)var2, (float)var4 + 1.0F, (float)var6 + 1.0F);
            GL11.glScalef(1.0F, -1.0F, -1.0F);
            GL11.glTranslatef(0.5F, 0.5F, 0.5F);
            short var12 = 0;

            if (var9 == 2)
            {
                var12 = 180;
            }

            if (var9 == 3)
            {
                var12 = 0;
            }

            if (var9 == 4)
            {
                var12 = 90;
            }

            if (var9 == 5)
            {
                var12 = -90;
            }

            if (var9 == 2 && var1.adjacentChestXPos != null)
            {
                GL11.glTranslatef(1.0F, 0.0F, 0.0F);
            }

            if (var9 == 5 && var1.adjacentChestZPosition != null)
            {
                GL11.glTranslatef(0.0F, 0.0F, -1.0F);
            }

            GL11.glRotatef((float)var12, 0.0F, 1.0F, 0.0F);
            GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
            float var13 = var1.prevLidAngle + (var1.lidAngle - var1.prevLidAngle) * var8;
            float var14;

            if (var1.adjacentChestZNeg != null)
            {
                var14 = var1.adjacentChestZNeg.prevLidAngle + (var1.adjacentChestZNeg.lidAngle - var1.adjacentChestZNeg.prevLidAngle) * var8;

                if (var14 > var13)
                {
                    var13 = var14;
                }
            }

            if (var1.adjacentChestXNeg != null)
            {
                var14 = var1.adjacentChestXNeg.prevLidAngle + (var1.adjacentChestXNeg.lidAngle - var1.adjacentChestXNeg.prevLidAngle) * var8;

                if (var14 > var13)
                {
                    var13 = var14;
                }
            }

            var13 = 1.0F - var13;
            var13 = 1.0F - var13 * var13 * var13;
            var15.chestLid.rotateAngleX = -(var13 * (float)Math.PI / 2.0F);
            var15.renderAll();
            GL11.glDisable(GL12.GL_RESCALE_NORMAL);
            GL11.glPopMatrix();
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        }
    }

    public String getTextureByNumber(int var1)
    {
        switch (var1)
        {
            case 0:
                return "oak";

            case 1:
                return "birch";

            case 2:
                return "pine";

            case 3:
                return "jungle";

            case 4:
                return "cactus";

            case 5:
                return "weathered";

            case 6:
                return "ruinedstone";

            case 7:
                return "stone";

            case 8:
                return "stonebrick";

            case 9:
                return "obsidian";

            case 10:
                return "ice";

            case 11:
                return "iron";

            case 12:
                return "jeweled";

            case 13:
                return "slime";

            case 14:
                return "endstone";

            default:
                return "";
        }
    }

    public void renderTileEntityAt(TileEntity var1, double var2, double var4, double var6, float var8)
    {
        this.renderChestLogicAt((ChestLogic)var1, var2, var4, var6, var8);
    }
}
