package net.minecraft.src.zipline;
import net.minecraft.src.*;

public class TensilePlacer
{
    public int metadata;
    public int[][] path;
    public int path_index;
    public int startX;
    public int startY;
    public int startZ;
    public int currentX;
    public int currentY;
    public int currentZ;
    public int endX;
    public int endY;
    public int endZ;

    public TensilePlacer(int var1, int var2, int var3, int var4, int var5, int var6)
    {
        this.startX = this.currentX = var1;
        this.startY = this.currentY = var2;
        this.startZ = this.currentZ = var3;
        this.endX = var4;
        this.endY = var5;
        this.endZ = var6;
        int var7 = this.endX - this.startX;
        int var8 = this.endY - this.startY;
        int var9 = this.endZ - this.startZ;
        int var10 = Math.abs(var7);
        int var11 = Math.abs(var8);
        int var12 = Math.abs(var9);
        int var13 = var10 <= var12 ? 0 : 1;
        boolean var14 = var8 > 0;
        int var15 = var10 <= var12 ? 1 : 0;
        this.metadata = var10 <= var12 ? 1 : 0;
        int var16 = var7 <= 0 ? -var13 : var13;
        int var17 = var9 <= 0 ? -var15 : var15;
        int var18 = var13 != 1 ? var12 : var10;
        this.path = new int[2][];
        this.path_index = 0;

        if (var14)
        {
            if (var11 > var18)
            {
                this.addPath(0, 1, 0, var11 - var18 + 1);
                this.addPath(var16, 1, var17, var18 + 1);
            }
            else
            {
                this.addPath(var16, 1, var17, var11 + 1);
                this.addPath(var16, 0, var17, var18 - var11 + 1);
            }
        }
        else if (var11 > var18)
        {
            this.addPath(var16, -1, var17, var18 + 1);
            this.addPath(0, -1, 0, var11 - var18 + 1);
        }
        else
        {
            this.addPath(var16, 0, var17, var18 - var11 + 1);
            this.addPath(var16, -1, var17, var11 + 1);
        }

        this.path_index = 0;
    }

    public void addPath(int var1, int var2, int var3, int var4)
    {
        this.path[this.path_index] = new int[4];
        this.path[this.path_index][0] = var1;
        this.path[this.path_index][1] = var2;
        this.path[this.path_index][2] = var3;
        this.path[this.path_index][3] = var4;
        ++this.path_index;
    }

    public boolean canPlace(World var1, int var2, int var3, int var4)
    {
        Material var5 = var1.getBlockMaterial(this.currentX, this.currentY, this.currentZ);
        return var5 == Material.air || var5 == Material.leaves || var5 == Material.plants;
    }

    public int place(World var1, int var2, int var3)
    {
        label44:

        while (true)
        {
            if (this.path_index < this.path.length && this.path[this.path_index] != null && var3 > 0)
            {
                int[] var4 = this.path[this.path_index];
                int var5 = 0;

                while (true)
                {
                    if (var5 < var4[3] && var3 >= 0)
                    {
                        if (this.canPlace(var1, this.currentX, this.currentY, this.currentZ))
                        {
                            if (var1.getBlockId(this.currentX, this.currentY, this.currentZ) != 0)
                            {
                                ModLoader.getMinecraftInstance().playerController.onPlayerDamageBlock(this.currentX, this.currentY, this.currentZ, 1);
                            }

                            int var6 = this.metadata;

                            if (var4[1] != 0)
                            {
                                var6 |= var4[0] == 0 && var4[2] == 0 ? 12 : 8;
                            }

                            var1.setBlockWithNotify(this.currentX, this.currentY, this.currentZ, var2);
                            var1.setBlockMetadataWithNotify(this.currentX, this.currentY, this.currentZ, var6);
                            this.currentX += var4[0];
                            this.currentY += var4[1];
                            this.currentZ += var4[2];
                            ++var5;
                            --var3;
                            continue;
                        }

                        return var3;
                    }

                    ++this.path_index;
                    continue label44;
                }
            }

            return var3;
        }
    }
}
