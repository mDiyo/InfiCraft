package mDiyo.inficraft.flora.trees.blocks;

import net.minecraft.src.Block;
import net.minecraft.src.BlockLog;
import net.minecraft.src.Material;
import net.minecraft.src.World;

/*
 * This class is for a single tree with a 2x2 base and inside textures 
 */

public class LogTwoxTwo extends BlockLog
{
	public LogTwoxTwo(int id, int texPos, String tex, float hardness) 
	{
		super(id);
		blockIndexInTexture = texPos;
		texture = tex;
		this.setHardness(hardness);
	}
	
	@Override
	public int getBlockTextureFromSideAndMetadata(int side, int meta)
    {
		if (meta == 15) //Fullbark
			return blockIndexInTexture;
		
		// Upward facing
		if (meta == 0)
		{
			switch (side)
			{
			case 0: return blockIndexInTexture + 2; //Bottom
			case 1: return blockIndexInTexture + 2; //Top
			case 2: return blockIndexInTexture;
			case 3: return blockIndexInTexture + 16;
			case 4: return blockIndexInTexture;
			case 5: return blockIndexInTexture + 17;
			}
		}
			
		if (meta == 1)
		{
			switch (side)
			{
			case 0: return blockIndexInTexture + 3; //Bottom
			case 1: return blockIndexInTexture + 3; //Top
			case 2: return blockIndexInTexture;
			case 3: return blockIndexInTexture + 17;
			case 4: return blockIndexInTexture + 16;
			case 5: return blockIndexInTexture;
			}
		}
			
		if (meta == 2)
		{
			switch (side)
			{
			case 0: return blockIndexInTexture + 18; //Bottom
			case 1: return blockIndexInTexture + 18; //Top
			case 2: return blockIndexInTexture + 17;
			case 3: return blockIndexInTexture;
			case 4: return blockIndexInTexture;
			case 5: return blockIndexInTexture + 16;
			}
		}
			
		if (meta == 3)
		{
			switch (side)
			{
			case 0: return blockIndexInTexture + 19; //Bottom
			case 1: return blockIndexInTexture + 19; //Top
			case 2: return blockIndexInTexture + 17;
			case 3: return blockIndexInTexture;
			case 4: return blockIndexInTexture + 16;
			case 5: return blockIndexInTexture;
			}
		}
		
		// East/West
		if (meta == 4)
		{
			switch (side)
			{
			case 0: return blockIndexInTexture + 16;
			case 1: return blockIndexInTexture;
			case 2: return blockIndexInTexture + 17;
			case 3: return blockIndexInTexture;
			case 4: return blockIndexInTexture + 3;
			case 5: return blockIndexInTexture + 2;
			}
		}
			
		if (meta == 5)
		{
			switch (side)
			{
			case 0: return blockIndexInTexture + 17;
			case 1: return blockIndexInTexture;
			case 2: return blockIndexInTexture;
			case 3: return blockIndexInTexture + 16;
			case 4: return blockIndexInTexture + 2;
			case 5: return blockIndexInTexture + 3;
			}
		}
			
		if (meta == 6)
		{
			switch (side)
			{
			case 0: return blockIndexInTexture; //Bottom
			case 1: return blockIndexInTexture + 17; //Top
			case 2: return blockIndexInTexture + 16;
			case 3: return blockIndexInTexture;
			case 4: return blockIndexInTexture + 19;
			case 5: return blockIndexInTexture + 18;
			}
		}
			
		if (meta == 7)
		{
			switch (side)
			{
			case 0: return blockIndexInTexture; //Bottom
			case 1: return blockIndexInTexture + 16; //Top
			case 2: return blockIndexInTexture;
			case 3: return blockIndexInTexture + 17;
			case 4: return blockIndexInTexture + 18;
			case 5: return blockIndexInTexture + 19;
			}
		}
		
		//North/south
		if (meta == 8)
		{
			switch (side)
			{
			case 0: return blockIndexInTexture + 16;
			case 1: return blockIndexInTexture;
			case 2: return blockIndexInTexture + 3;
			case 3: return blockIndexInTexture + 2;
			case 4: return blockIndexInTexture;
			case 5: return blockIndexInTexture + 17;
			}
		}
			
		if (meta == 9)
		{
			switch (side)
			{
			case 0: return blockIndexInTexture + 17;
			case 1: return blockIndexInTexture;
			case 2: return blockIndexInTexture + 2;
			case 3: return blockIndexInTexture + 3;
			case 4: return blockIndexInTexture + 16;
			case 5: return blockIndexInTexture;
			}
		}
			
		if (meta == 10)
		{
			switch (side)
			{
			case 0: return blockIndexInTexture; //Bottom
			case 1: return blockIndexInTexture + 16; //Top
			case 2: return blockIndexInTexture + 19;
			case 3: return blockIndexInTexture + 18;
			case 4: return blockIndexInTexture;
			case 5: return blockIndexInTexture + 16;
			}
		}
			
		if (meta == 11)
		{
			switch (side)
			{
			case 0: return blockIndexInTexture; //Bottom
			case 1: return blockIndexInTexture + 17; //Top
			case 2: return blockIndexInTexture + 18;
			case 3: return blockIndexInTexture + 19;
			case 4: return blockIndexInTexture + 17;
			case 5: return blockIndexInTexture;
			}
		}
		
		return 0;
    }
	
	/* Combined stair and log placement */
	public int func_85104_a(World par1World, int blockX, int blockY, int blockZ, int side, float clickX, float clickY, float clickZ, int metadata)
    {
        
		int meta = metadata & 3;
        byte add = 0;

        switch (side)
        {
            case 0:
            case 1:
                add = 0;
                if (clickX > 0.5f)
                	add += 1;
                if (clickZ > 0.5f)
                	add += 2;
                break;
            case 2:
            case 3:
                add = 8;
                if (clickX > 0.5f)
                	add += 1;
                if (clickY < 0.5f)
                	add += 2;
                break;
            case 4:
            case 5:
            	add = 4;
            	if (clickZ < 0.5f)
                	add += 1;
                if (clickY < 0.5f)
                	add += 2;
        }
        
        return meta | add;
    }
	
	@Override
	public String getTextureFile()
    {
        return texture;
    }

	private String texture;
}
