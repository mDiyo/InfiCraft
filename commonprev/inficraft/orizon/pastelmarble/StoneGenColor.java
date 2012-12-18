package inficraft.orizon.pastelmarble;

import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.MathHelper;
import net.minecraft.src.World;
import net.minecraft.src.WorldGenerator;

public class StoneGenColor extends WorldGenerator
{
    /** The block ID of the ore to be placed using this generator. */
    private int minableBlockId;

    /** The number of blocks to generate. */
    private int numberOfBlocks;

    public StoneGenColor(int par1, int par2)
    {
        this.minableBlockId = par1;
        this.numberOfBlocks = par2;
    }
    
    public boolean generate(World world, Random par2Random, int par3, int par4, int par5)
    {
    	int minableBlockMeta = par2Random.nextInt(11) + 5;
        float var6 = par2Random.nextFloat() * (float)Math.PI;
        double var7 = (double)((float)(par3 + 8) + MathHelper.sin(var6) * (float)this.numberOfBlocks / 8.0F);
        double var9 = (double)((float)(par3 + 8) - MathHelper.sin(var6) * (float)this.numberOfBlocks / 8.0F);
        double var11 = (double)((float)(par5 + 8) + MathHelper.cos(var6) * (float)this.numberOfBlocks / 8.0F);
        double var13 = (double)((float)(par5 + 8) - MathHelper.cos(var6) * (float)this.numberOfBlocks / 8.0F);
        double var15 = (double)(par4 + par2Random.nextInt(3) - 2);
        double var17 = (double)(par4 + par2Random.nextInt(3) - 2);

        for (int var19 = 0; var19 <= this.numberOfBlocks; ++var19)
        {
            double var20 = var7 + (var9 - var7) * (double)var19 / (double)this.numberOfBlocks;
            double var22 = var15 + (var17 - var15) * (double)var19 / (double)this.numberOfBlocks;
            double var24 = var11 + (var13 - var11) * (double)var19 / (double)this.numberOfBlocks;
            double var26 = par2Random.nextDouble() * (double)this.numberOfBlocks / 16.0D;
            double var28 = (double)(MathHelper.sin((float)var19 * (float)Math.PI / (float)this.numberOfBlocks) + 1.0F) * var26 + 1.0D;
            double var30 = (double)(MathHelper.sin((float)var19 * (float)Math.PI / (float)this.numberOfBlocks) + 1.0F) * var26 + 1.0D;
            int var32 = MathHelper.floor_double(var20 - var28 / 2.0D);
            int var33 = MathHelper.floor_double(var22 - var30 / 2.0D);
            int var34 = MathHelper.floor_double(var24 - var28 / 2.0D);
            int var35 = MathHelper.floor_double(var20 + var28 / 2.0D);
            int var36 = MathHelper.floor_double(var22 + var30 / 2.0D);
            int var37 = MathHelper.floor_double(var24 + var28 / 2.0D);

            for (int iterX = var32; iterX <= var35; ++iterX)
            {
                double sqX = ((double)iterX + 0.5D - var20) / (var28 / 2.0D);

                if (sqX * sqX < 1.0D)
                {
                    for (int iterY = var33; iterY <= var36; ++iterY)
                    {
                        double sqY = ((double)iterY + 0.5D - var22) / (var30 / 2.0D);

                        if (sqX * sqX + sqY * sqY < 1.0D)
                        {
                            for (int iterZ = var34; iterZ <= var37; ++iterZ)
                            {
                                double sqZ = ((double)iterZ + 0.5D - var24) / (var28 / 2.0D);

                                Block block = Block.blocksList[world.getBlockId(iterX, iterY, iterZ)];
                                if (sqX * sqX + sqY * sqY + sqZ * sqZ < 1.0D && (block != null && block.isGenMineableReplaceable(world, iterX, iterY, iterZ)))
                                {
                                    world.setBlockAndMetadata(iterX, iterY, iterZ, this.minableBlockId, minableBlockMeta);
                                }
                            }
                        }
                    }
                }
            }
        }

        return true;
    }
}
