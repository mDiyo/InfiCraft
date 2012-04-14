package net.minecraft.src.zipline;
import net.minecraft.src.*;

public class RenderBlockFire
{
    public boolean renderBlockFire(IBlockAccess var1, Block var2, int var3, int var4, int var5, int var6)
    {
        float var7 = (float)var3;
        float var8 = (float)var4;
        float var9 = (float)var5;
        Tessellator var10 = Tessellator.instance;
        int var11 = var2.getBlockTextureFromSide(0);

        if (var6 >= 0)
        {
            var11 = var6;
        }

        float var12 = var2.getBlockBrightness(var1, var3, var4, var5);
        var10.setColorOpaque_F(var12, var12, var12);
        int var13 = (var11 & 15) << 4;
        int var14 = var11 & 240;
        double var15 = (double)((float)var13 / 256.0F);
        double var17 = (double)(((float)var13 + 15.99F) / 256.0F);
        double var19 = (double)((float)var14 / 256.0F);
        double var21 = (double)(((float)var14 + 15.99F) / 256.0F);
        float var23 = 1.4F;
        double var26;
        double var28;
        double var30;
        double var34;
        double var32;
        double var38;
        double var36;

        if (!var1.isBlockNormalCube(var3, var4 - 1, var5) && !Block.fire.canBlockCatchFire(var1, var3, var4 - 1, var5))
        {
            float var51 = 0.2F;
            float var25 = 0.0625F;

            if ((var3 + var4 + var5 & 1) == 1)
            {
                var15 = (double)((float)var13 / 256.0F);
                var17 = (double)(((float)var13 + 15.99F) / 256.0F);
                var19 = (double)((float)(var14 + 16) / 256.0F);
                var21 = (double)(((float)var14 + 15.99F + 16.0F) / 256.0F);
            }

            if ((var3 / 2 + var4 / 2 + var5 / 2 & 1) == 1)
            {
                var26 = var17;
                var17 = var15;
                var15 = var26;
            }

            if (Block.fire.canBlockCatchFire(var1, var3 - 1, var4, var5))
            {
                if (!var1.isBlockNormalCube(var3 - 1, var4, var5))
                {
                    var7 = (float)((double)var7 - 0.5D);
                }

                var10.addVertexWithUV((double)(var7 + var51), (double)(var8 + var23 + var25), (double)(var9 + 1.0F), var17, var19);
                var10.addVertexWithUV((double)(var7 + 0.0F), (double)(var8 + 0.0F + var25), (double)(var9 + 1.0F), var17, var21);
                var10.addVertexWithUV((double)(var7 + 0.0F), (double)(var8 + 0.0F + var25), (double)(var9 + 0.0F), var15, var21);
                var10.addVertexWithUV((double)(var7 + var51), (double)(var8 + var23 + var25), (double)(var9 + 0.0F), var15, var19);
                var10.addVertexWithUV((double)(var7 + var51), (double)(var8 + var23 + var25), (double)(var9 + 0.0F), var15, var19);
                var10.addVertexWithUV((double)(var7 + 0.0F), (double)(var8 + 0.0F + var25), (double)(var9 + 0.0F), var15, var21);
                var10.addVertexWithUV((double)(var7 + 0.0F), (double)(var8 + 0.0F + var25), (double)(var9 + 1.0F), var17, var21);
                var10.addVertexWithUV((double)(var7 + var51), (double)(var8 + var23 + var25), (double)(var9 + 1.0F), var17, var19);
                var7 = (float)var3;
            }

            if (Block.fire.canBlockCatchFire(var1, var3 + 1, var4, var5))
            {
                if (!var1.isBlockNormalCube(var3 + 1, var4, var5))
                {
                    var7 = (float)((double)var7 + 0.5D);
                }

                var10.addVertexWithUV((double)(var7 + 1.0F - var51), (double)(var8 + var23 + var25), (double)(var9 + 0.0F), var15, var19);
                var10.addVertexWithUV((double)(var7 + 1.0F - 0.0F), (double)(var8 + 0.0F + var25), (double)(var9 + 0.0F), var15, var21);
                var10.addVertexWithUV((double)(var7 + 1.0F - 0.0F), (double)(var8 + 0.0F + var25), (double)(var9 + 1.0F), var17, var21);
                var10.addVertexWithUV((double)(var7 + 1.0F - var51), (double)(var8 + var23 + var25), (double)(var9 + 1.0F), var17, var19);
                var10.addVertexWithUV((double)(var7 + 1.0F - var51), (double)(var8 + var23 + var25), (double)(var9 + 1.0F), var17, var19);
                var10.addVertexWithUV((double)(var7 + 1.0F - 0.0F), (double)(var8 + 0.0F + var25), (double)(var9 + 1.0F), var17, var21);
                var10.addVertexWithUV((double)(var7 + 1.0F - 0.0F), (double)(var8 + 0.0F + var25), (double)(var9 + 0.0F), var15, var21);
                var10.addVertexWithUV((double)(var7 + 1.0F - var51), (double)(var8 + var23 + var25), (double)(var9 + 0.0F), var15, var19);
                var7 = (float)var3;
            }

            if (Block.fire.canBlockCatchFire(var1, var3, var4, var5 - 1))
            {
                if (!var1.isBlockNormalCube(var3, var4, var5 - 1))
                {
                    var9 = (float)((double)var9 - 0.5D);
                }

                var10.addVertexWithUV((double)(var7 + 0.0F), (double)(var8 + var23 + var25), (double)(var9 + var51), var17, var19);
                var10.addVertexWithUV((double)(var7 + 0.0F), (double)(var8 + 0.0F + var25), (double)(var9 + 0.0F), var17, var21);
                var10.addVertexWithUV((double)(var7 + 1.0F), (double)(var8 + 0.0F + var25), (double)(var9 + 0.0F), var15, var21);
                var10.addVertexWithUV((double)(var7 + 1.0F), (double)(var8 + var23 + var25), (double)(var9 + var51), var15, var19);
                var10.addVertexWithUV((double)(var7 + 1.0F), (double)(var8 + var23 + var25), (double)(var9 + var51), var15, var19);
                var10.addVertexWithUV((double)(var7 + 1.0F), (double)(var8 + 0.0F + var25), (double)(var9 + 0.0F), var15, var21);
                var10.addVertexWithUV((double)(var7 + 0.0F), (double)(var8 + 0.0F + var25), (double)(var9 + 0.0F), var17, var21);
                var10.addVertexWithUV((double)(var7 + 0.0F), (double)(var8 + var23 + var25), (double)(var9 + var51), var17, var19);
                var9 = (float)var5;
            }

            if (Block.fire.canBlockCatchFire(var1, var3, var4, var5 + 1))
            {
                if (!var1.isBlockNormalCube(var3, var4, var5 + 1))
                {
                    var9 = (float)((double)var9 + 0.5D);
                }

                var10.addVertexWithUV((double)(var7 + 1.0F), (double)(var8 + var23 + var25), (double)(var9 + 1.0F - var51), var15, var19);
                var10.addVertexWithUV((double)(var7 + 1.0F), (double)(var8 + 0.0F + var25), (double)(var9 + 1.0F - 0.0F), var15, var21);
                var10.addVertexWithUV((double)(var7 + 0.0F), (double)(var8 + 0.0F + var25), (double)(var9 + 1.0F - 0.0F), var17, var21);
                var10.addVertexWithUV((double)(var7 + 0.0F), (double)(var8 + var23 + var25), (double)(var9 + 1.0F - var51), var17, var19);
                var10.addVertexWithUV((double)(var7 + 0.0F), (double)(var8 + var23 + var25), (double)(var9 + 1.0F - var51), var17, var19);
                var10.addVertexWithUV((double)(var7 + 0.0F), (double)(var8 + 0.0F + var25), (double)(var9 + 1.0F - 0.0F), var17, var21);
                var10.addVertexWithUV((double)(var7 + 1.0F), (double)(var8 + 0.0F + var25), (double)(var9 + 1.0F - 0.0F), var15, var21);
                var10.addVertexWithUV((double)(var7 + 1.0F), (double)(var8 + var23 + var25), (double)(var9 + 1.0F - var51), var15, var19);
                var9 = (float)var5;
            }

            if (Block.fire.canBlockCatchFire(var1, var3, var4 + 1, var5))
            {
                if (!var1.isBlockNormalCube(var3, var4 + 1, var5))
                {
                    var8 = (float)((double)var8 + 0.5D);
                }

                var26 = (double)var3 + 0.5D + 0.5D;
                var28 = (double)var3 + 0.5D - 0.5D;
                var30 = (double)var5 + 0.5D + 0.5D;
                var32 = (double)var5 + 0.5D - 0.5D;
                var34 = (double)var3 + 0.5D - 0.5D;
                var36 = (double)var3 + 0.5D + 0.5D;
                var38 = (double)var5 + 0.5D - 0.5D;
                double var40 = (double)var5 + 0.5D + 0.5D;
                double var42 = (double)((float)var13 / 256.0F);
                double var44 = (double)(((float)var13 + 15.99F) / 256.0F);
                double var46 = (double)((float)var14 / 256.0F);
                double var48 = (double)(((float)var14 + 15.99F) / 256.0F);
                ++var4;
                float var50 = -0.2F;

                if ((var3 + var4 + var5 & 1) == 0)
                {
                    var10.addVertexWithUV(var34, (double)((float)var4 + var50), (double)(var5 + 0), var44, var46);
                    var10.addVertexWithUV(var26, (double)(var4 + 0), (double)(var5 + 0), var44, var48);
                    var10.addVertexWithUV(var26, (double)(var4 + 0), (double)(var5 + 1), var42, var48);
                    var10.addVertexWithUV(var34, (double)((float)var4 + var50), (double)(var5 + 1), var42, var46);
                    var42 = (double)((float)var13 / 256.0F);
                    var44 = (double)(((float)var13 + 15.99F) / 256.0F);
                    var46 = (double)((float)(var14 + 16) / 256.0F);
                    var48 = (double)(((float)var14 + 15.99F + 16.0F) / 256.0F);
                    var10.addVertexWithUV(var36, (double)((float)var4 + var50), (double)(var5 + 1), var44, var46);
                    var10.addVertexWithUV(var28, (double)(var4 + 0), (double)(var5 + 1), var44, var48);
                    var10.addVertexWithUV(var28, (double)(var4 + 0), (double)(var5 + 0), var42, var48);
                    var10.addVertexWithUV(var36, (double)((float)var4 + var50), (double)(var5 + 0), var42, var46);
                }
                else
                {
                    var10.addVertexWithUV((double)(var3 + 0), (double)((float)var4 + var50), var40, var44, var46);
                    var10.addVertexWithUV((double)(var3 + 0), (double)(var4 + 0), var32, var44, var48);
                    var10.addVertexWithUV((double)(var3 + 1), (double)(var4 + 0), var32, var42, var48);
                    var10.addVertexWithUV((double)(var3 + 1), (double)((float)var4 + var50), var40, var42, var46);
                    var42 = (double)((float)var13 / 256.0F);
                    var44 = (double)(((float)var13 + 15.99F) / 256.0F);
                    var46 = (double)((float)(var14 + 16) / 256.0F);
                    var48 = (double)(((float)var14 + 15.99F + 16.0F) / 256.0F);
                    var10.addVertexWithUV((double)(var3 + 1), (double)((float)var4 + var50), var38, var44, var46);
                    var10.addVertexWithUV((double)(var3 + 1), (double)(var4 + 0), var30, var44, var48);
                    var10.addVertexWithUV((double)(var3 + 0), (double)(var4 + 0), var30, var42, var48);
                    var10.addVertexWithUV((double)(var3 + 0), (double)((float)var4 + var50), var38, var42, var46);
                }

                var8 = (float)var4;
            }
        }
        else
        {
            if (!var1.isBlockNormalCube(var3, var4 - 1, var5))
            {
                var8 = (float)((double)var8 - 0.5D);
            }

            double var24 = (double)var7 + 0.5D + 0.2D;
            var26 = (double)var7 + 0.5D - 0.2D;
            var28 = (double)var9 + 0.5D + 0.2D;
            var30 = (double)var9 + 0.5D - 0.2D;
            var32 = (double)var7 + 0.5D - 0.3D;
            var34 = (double)var7 + 0.5D + 0.3D;
            var36 = (double)var9 + 0.5D - 0.3D;
            var38 = (double)var9 + 0.5D + 0.3D;
            var10.addVertexWithUV(var32, (double)(var8 + var23), (double)(var9 + 1.0F), var17, var19);
            var10.addVertexWithUV(var24, (double)(var8 + 0.0F), (double)(var9 + 1.0F), var17, var21);
            var10.addVertexWithUV(var24, (double)(var8 + 0.0F), (double)(var9 + 0.0F), var15, var21);
            var10.addVertexWithUV(var32, (double)(var8 + var23), (double)(var9 + 0.0F), var15, var19);
            var10.addVertexWithUV(var34, (double)(var8 + var23), (double)(var9 + 0.0F), var17, var19);
            var10.addVertexWithUV(var26, (double)(var8 + 0.0F), (double)(var9 + 0.0F), var17, var21);
            var10.addVertexWithUV(var26, (double)(var8 + 0.0F), (double)(var9 + 1.0F), var15, var21);
            var10.addVertexWithUV(var34, (double)(var8 + var23), (double)(var9 + 1.0F), var15, var19);
            var15 = (double)((float)var13 / 256.0F);
            var17 = (double)(((float)var13 + 15.99F) / 256.0F);
            var19 = (double)((float)(var14 + 16) / 256.0F);
            var21 = (double)(((float)var14 + 15.99F + 16.0F) / 256.0F);
            var10.addVertexWithUV((double)(var7 + 1.0F), (double)(var8 + var23), var38, var17, var19);
            var10.addVertexWithUV((double)(var7 + 1.0F), (double)(var8 + 0.0F), var30, var17, var21);
            var10.addVertexWithUV((double)(var7 + 0.0F), (double)(var8 + 0.0F), var30, var15, var21);
            var10.addVertexWithUV((double)(var7 + 0.0F), (double)(var8 + var23), var38, var15, var19);
            var10.addVertexWithUV((double)(var7 + 0.0F), (double)(var8 + var23), var36, var17, var19);
            var10.addVertexWithUV((double)(var7 + 0.0F), (double)(var8 + 0.0F), var28, var17, var21);
            var10.addVertexWithUV((double)(var7 + 1.0F), (double)(var8 + 0.0F), var28, var15, var21);
            var10.addVertexWithUV((double)(var7 + 1.0F), (double)(var8 + var23), var36, var15, var19);
            var24 = (double)var7 + 0.5D - 0.5D;
            var26 = (double)var7 + 0.5D + 0.5D;
            var28 = (double)var9 + 0.5D - 0.5D;
            var30 = (double)var9 + 0.5D + 0.5D;
            var32 = (double)var7 + 0.5D - 0.4D;
            var34 = (double)var7 + 0.5D + 0.4D;
            var36 = (double)var9 + 0.5D - 0.4D;
            var38 = (double)var9 + 0.5D + 0.4D;
            var10.addVertexWithUV(var32, (double)(var8 + var23), (double)(var9 + 0.0F), var15, var19);
            var10.addVertexWithUV(var24, (double)(var8 + 0.0F), (double)(var9 + 0.0F), var15, var21);
            var10.addVertexWithUV(var24, (double)(var8 + 0.0F), (double)(var9 + 1.0F), var17, var21);
            var10.addVertexWithUV(var32, (double)(var8 + var23), (double)(var5 + 1), var17, var19);
            var10.addVertexWithUV(var34, (double)(var8 + var23), (double)(var5 + 1), var15, var19);
            var10.addVertexWithUV(var26, (double)(var8 + 0.0F), (double)(var9 + 1.0F), var15, var21);
            var10.addVertexWithUV(var26, (double)(var8 + 0.0F), (double)(var9 + 0.0F), var17, var21);
            var10.addVertexWithUV(var34, (double)(var8 + var23), (double)(var9 + 0.0F), var17, var19);
            var15 = (double)((float)var13 / 256.0F);
            var17 = (double)(((float)var13 + 15.99F) / 256.0F);
            var19 = (double)((float)var14 / 256.0F);
            var21 = (double)(((float)var14 + 15.99F) / 256.0F);
            var10.addVertexWithUV((double)(var7 + 0.0F), (double)(var8 + var23), var38, var15, var19);
            var10.addVertexWithUV((double)(var7 + 0.0F), (double)(var8 + 0.0F), var30, var15, var21);
            var10.addVertexWithUV((double)(var7 + 1.0F), (double)(var8 + 0.0F), var30, var17, var21);
            var10.addVertexWithUV((double)(var7 + 1.0F), (double)(var8 + var23), var38, var17, var19);
            var10.addVertexWithUV((double)(var7 + 1.0F), (double)(var8 + var23), var36, var15, var19);
            var10.addVertexWithUV((double)(var7 + 1.0F), (double)(var8 + 0.0F), var28, var15, var21);
            var10.addVertexWithUV((double)(var7 + 0.0F), (double)(var8 + 0.0F), var28, var17, var21);
            var10.addVertexWithUV((double)(var7 + 0.0F), (double)(var8 + var23), var36, var17, var19);
            var8 = (float)var4;
        }

        return true;
    }
}
