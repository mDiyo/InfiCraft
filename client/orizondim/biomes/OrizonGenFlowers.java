package net.minecraft.src.orizondim.biomes;
import net.minecraft.src.orizondim.*;
import net.minecraft.src.*;

import java.util.*;

public class OrizonGenFlowers extends WorldGenerator
{
    public boolean generate(World par1World, Random par2Random, int posX, int posY, int posZ, byte metadata)
    {
        for (int var6 = 0; var6 < 64; ++var6)
        {
            int var7 = posX + par2Random.nextInt(8) - par2Random.nextInt(8);
            int var8 = posY + par2Random.nextInt(4) - par2Random.nextInt(4);
            int var9 = posZ + par2Random.nextInt(8) - par2Random.nextInt(8);

            if (par1World.isAirBlock(var7, var8, var9) && ((BlockFlower)Block.blocksList[mod_Orizon.dimensionFlowersID]).canBlockStay(par1World, var7, var8, var9))
            {
                par1World.setBlockAndMetadata(var7, var8, var9, mod_Orizon.dimensionFlowersID, metadata);
            }
        }

        return true;
    }

	@Override
	public boolean generate(World var1, Random var2, int var3, int var4,
			int var5) {
		return false;
	}
}
