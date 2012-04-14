package net.minecraft.src.zipline;
import net.minecraft.src.*;

public class ModModelRect
{
    public int type;
    public double x1;
    public double y1;
    public double z1;
    public double x2;
    public double y2;
    public double z2;
    public double u1;
    public double v1;
    public double u2;
    public double v2;
    public boolean twosides;
    public boolean mirror;

    public ModModelRect(int var1, double var2, double var4, double var6, double var8, double var10, double var12, double var14, double var16, double var18, double var20, boolean var22, boolean var23)
    {
        this.type = var1;
        this.x1 = var2;
        this.y1 = var4;
        this.z1 = var6;
        this.x2 = var8;
        this.y2 = var10;
        this.z2 = var12;
        this.u1 = var14;
        this.v1 = var16;
        this.u2 = var18;
        this.v2 = var20;
        this.twosides = var22;
        this.mirror = var23;
    }

    public void render(Tessellator var1, double var2, double var4, double var6, int var8)
    {
        switch (this.type)
        {
            case 0:
                renderRectX(var1, this, var2, var4, var6, var8);
                break;

            case 1:
                renderRectY(var1, this, var2, var4, var6, var8);
                break;

            case 2:
                renderRectZ(var1, this, var2, var4, var6, var8);
        }
    }

    public static void renderRectX(Tessellator var0, ModModelRect var1, double var2, double var4, double var6, int var8)
    {
        int var9 = (var8 & 15) << 4;
        int var10 = var8 & 240;
        double var11 = (var1.u1 * 16.0D + (double)var9) / 256.0D;
        double var13 = (var1.u2 * 16.0D + (double)var9) / 256.0D;
        double var15 = (var1.v1 * 16.0D + (double)var10) / 256.0D;
        double var17 = (var1.v2 * 16.0D + (double)var10) / 256.0D;
        var0.addVertexWithUV(var2 + var1.x1, var4 + var1.y1, var6 + var1.z1, var11, var15);
        var0.addVertexWithUV(var2 + var1.x1, var4 + var1.y2, var6 + var1.z2, var11, var17);
        var0.addVertexWithUV(var2 + var1.x2, var4 + var1.y2, var6 + var1.z2, var13, var17);
        var0.addVertexWithUV(var2 + var1.x2, var4 + var1.y1, var6 + var1.z1, var13, var15);

        if (var1.twosides)
        {
            var0.addVertexWithUV(var2 + var1.x1, var4 + var1.y1, var6 + var1.z1, var1.mirror ? var13 : var11, var15);
            var0.addVertexWithUV(var2 + var1.x2, var4 + var1.y1, var6 + var1.z1, var1.mirror ? var11 : var13, var15);
            var0.addVertexWithUV(var2 + var1.x2, var4 + var1.y2, var6 + var1.z2, var1.mirror ? var11 : var13, var17);
            var0.addVertexWithUV(var2 + var1.x1, var4 + var1.y2, var6 + var1.z2, var1.mirror ? var13 : var11, var17);
        }
    }

    public static void renderRectY(Tessellator var0, ModModelRect var1, double var2, double var4, double var6, int var8)
    {
        int var9 = (var8 & 15) << 4;
        int var10 = var8 & 240;
        double var11 = (var1.u1 * 16.0D + (double)var9) / 256.0D;
        double var13 = (var1.u2 * 16.0D + (double)var9) / 256.0D;
        double var15 = (var1.v1 * 16.0D + (double)var10) / 256.0D;
        double var17 = (var1.v2 * 16.0D + (double)var10) / 256.0D;
        var0.addVertexWithUV(var2 + var1.x1, var4 + var1.y1, var6 + var1.z1, var11, var15);
        var0.addVertexWithUV(var2 + var1.x1, var4 + var1.y2, var6 + var1.z1, var11, var17);
        var0.addVertexWithUV(var2 + var1.x2, var4 + var1.y2, var6 + var1.z2, var13, var17);
        var0.addVertexWithUV(var2 + var1.x2, var4 + var1.y1, var6 + var1.z2, var13, var15);

        if (var1.twosides)
        {
            var0.addVertexWithUV(var2 + var1.x1, var4 + var1.y1, var6 + var1.z1, var1.mirror ? var13 : var11, var15);
            var0.addVertexWithUV(var2 + var1.x2, var4 + var1.y1, var6 + var1.z2, var1.mirror ? var11 : var13, var15);
            var0.addVertexWithUV(var2 + var1.x2, var4 + var1.y2, var6 + var1.z2, var1.mirror ? var11 : var13, var17);
            var0.addVertexWithUV(var2 + var1.x1, var4 + var1.y2, var6 + var1.z1, var1.mirror ? var13 : var11, var17);
        }
    }

    public static void renderRectZ(Tessellator var0, ModModelRect var1, double var2, double var4, double var6, int var8)
    {
        int var9 = (var8 & 15) << 4;
        int var10 = var8 & 240;
        double var11 = (var1.u1 * 16.0D + (double)var9) / 256.0D;
        double var13 = (var1.u2 * 16.0D + (double)var9) / 256.0D;
        double var15 = (var1.v1 * 16.0D + (double)var10) / 256.0D;
        double var17 = (var1.v2 * 16.0D + (double)var10) / 256.0D;
        var0.addVertexWithUV(var2 + var1.x1, var4 + var1.y1, var6 + var1.z1, var11, var15);
        var0.addVertexWithUV(var2 + var1.x1, var4 + var1.y1, var6 + var1.z2, var13, var15);
        var0.addVertexWithUV(var2 + var1.x2, var4 + var1.y2, var6 + var1.z2, var13, var17);
        var0.addVertexWithUV(var2 + var1.x2, var4 + var1.y2, var6 + var1.z1, var11, var17);

        if (var1.twosides)
        {
            var0.addVertexWithUV(var2 + var1.x1, var4 + var1.y1, var6 + var1.z1, var1.mirror ? var13 : var11, var15);
            var0.addVertexWithUV(var2 + var1.x2, var4 + var1.y2, var6 + var1.z1, var1.mirror ? var13 : var11, var17);
            var0.addVertexWithUV(var2 + var1.x2, var4 + var1.y2, var6 + var1.z2, var1.mirror ? var11 : var13, var17);
            var0.addVertexWithUV(var2 + var1.x1, var4 + var1.y1, var6 + var1.z2, var1.mirror ? var11 : var13, var15);
        }
    }

    public String toString()
    {
        return "" + this.type + ',' + this.x1 + ',' + this.y1 + ',' + this.z1 + ',' + this.x2 + ',' + this.y2 + ',' + this.z2 + ',' + this.u1 + ',' + this.v1 + ',' + this.u2 + ',' + this.v2 + ',' + this.twosides + ',' + this.mirror;
    }
}
