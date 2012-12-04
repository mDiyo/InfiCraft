package net.minecraft.src;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

public class TileEntityRackRenderer extends TileEntitySpecialRenderer
{
    public void renderTileEntityAt(TileEntity var1, double var2, double var4, double var6, float var8)
    {
        this.a((TileEntityRack)var1, var2, var4, var6, var8);
    }

    public void a(TileEntityRack var1, double var2, double var4, double var6, float var8)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)var2 + 0.5F, (float)var4 + 0.5F, (float)var6 + 0.5F);
        int var9 = var1.getBlockMetadata() & 3;
        GL11.glRotatef(90.0F * (float)var9, 0.0F, 1.0F, 0.0F);
        GL11.glTranslatef(-0.25F, 0.125F, -0.3F);
        GL11.glEnable(GL12.GL_RESCALE_NORMAL);

        for (int var10 = 0; var10 < var1.getSizeInventory(); ++var10)
        {
            ItemStack var11 = var1.getStackInSlot(var10);

            if (var11 != null && Item.itemsList[var11.itemID] != null)
            {
                this.bindTextureByName(var11.getItem().getTextureFile());
                GL11.glPushMatrix();
                GL11.glScalef(0.5F, 0.5F, 0.5F);
                GL11.glRotatef(var1.getAngle(var10), 0.0F, 0.0F, 1.0F);
                int var12;
                int var13;

                if (var11.getItem().requiresMultipleRenderPasses())
                {
                    for (var12 = 0; var12 <= 1; ++var12)
                    {
                        var13 = var11.getItem().getIconFromDamageForRenderPass(var11.getItemDamage(), var12);
                        int var14 = var11.getItem().getColorFromDamage(var11.getItemDamage(), var12);
                        setColor(var14);
                        this.drawItem(var13);
                    }
                }
                else
                {
                    var12 = var11.getIconIndex();
                    var13 = Item.itemsList[var11.itemID].getColorFromDamage(var11.getItemDamage(), 0);
                    setColor(var13);
                    this.drawItem(var12);
                }

                GL11.glPopMatrix();
            }

            GL11.glTranslatef(0.25F, 0.0F, 0.001F);
        }

        GL11.glDisable(GL12.GL_RESCALE_NORMAL);
        GL11.glPopMatrix();
    }

    private void drawItem(int var1)
    {
        Tessellator var2 = Tessellator.instance;
        float var3 = (float)(var1 % 16 * 16 + 0) / 256.0F;
        float var4 = (float)(var1 % 16 * 16 + 16) / 256.0F;
        float var5 = (float)(var1 / 16 * 16 + 0) / 256.0F;
        float var6 = (float)(var1 / 16 * 16 + 16) / 256.0F;
        var2.startDrawingQuads();
        var2.setNormal(0.0F, 1.0F, 0.0F);
        var2.addVertexWithUV(-0.5D, -0.5D, 0.0D, (double)var3, (double)var6);
        var2.addVertexWithUV(0.5D, -0.5D, 0.0D, (double)var4, (double)var6);
        var2.addVertexWithUV(0.5D, 0.5D, 0.0D, (double)var4, (double)var5);
        var2.addVertexWithUV(-0.5D, 0.5D, 0.0D, (double)var3, (double)var5);
        var2.addVertexWithUV(-0.5D, 0.5D, 0.0D, (double)var3, (double)var5);
        var2.addVertexWithUV(0.5D, 0.5D, 0.0D, (double)var4, (double)var5);
        var2.addVertexWithUV(0.5D, -0.5D, 0.0D, (double)var4, (double)var6);
        var2.addVertexWithUV(-0.5D, -0.5D, 0.0D, (double)var3, (double)var6);
        var2.draw();
    }

    static void setColor(int var0)
    {
        float var1 = (float)(var0 >> 16 & 255) / 255.0F;
        float var2 = (float)(var0 >> 8 & 255) / 255.0F;
        float var3 = (float)(var0 & 255) / 255.0F;
        GL11.glColor4f(var1, var2, var3, 1.0F);
    }
}
