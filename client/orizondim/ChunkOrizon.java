package net.minecraft.src.orizondim;
import net.minecraft.src.*;

public class ChunkOrizon extends Chunk
{
	public ChunkOrizon(World par1World, int par2, int par3)
	{
		super(par1World, par2, par3);
	}
	
	public ChunkOrizon(World world, short[] ids, byte[] metadata, int chunkX, int chunkZ)
    {
        this(world, chunkX, chunkZ);
        ExtendedBlockStorage[] exStorageArrays = this.getBlockStorageArray();
        int height = ids.length / 256;

        for (int x = 0; x < 16; ++x)
        {
            for (int z = 0; z < 16; ++z)
            {
                for (int y = 0; y < height; ++y)
                {
                    int index = x << 11 | z << 7 | y;
                    int id    = ids[index] & 0xFFF;
                    int meta  = metadata[index] & 0x0F;

                    if (id != 0)
                    {
                        int chunkY = y >> 4;

                        if (exStorageArrays[chunkY] == null)
                        {
                        	exStorageArrays[chunkY] = new ExtendedBlockStorage(chunkY << 4);
                        }

                        exStorageArrays[chunkY].setExtBlockID(x, y & 15, z, id);
                        exStorageArrays[chunkY].setExtBlockMetadata(x, y & 15, z, meta);
                    }
                }
            }
        }
    }
}
