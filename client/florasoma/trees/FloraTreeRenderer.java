package florasoma.trees;

import net.minecraft.src.Block;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.RenderBlocks;

public class FloraTreeRenderer 
{
	public boolean renderBlockDoubleLog(Block par1Block, int x, int y, int z, IBlockAccess world, RenderBlocks render)
    {
        int meta = world.getBlockMetadata(x, y, z);
        if (meta < 12)
        {
	        int md = meta & 12;
	
	        if (md == 4)
	        {
	            render.uvRotateEast = 1;
	            render.uvRotateWest = 1;
	            render.uvRotateTop = 1;
	            render.uvRotateBottom = 1;
	        }
	        else if (md == 8)
	        {
	            render.uvRotateSouth = 1;
	            render.uvRotateNorth = 1;
	        }
	
	        boolean var7 = render.renderStandardBlock(par1Block, x, y, z);
	        render.uvRotateSouth = 0;
	        render.uvRotateEast = 0;
	        render.uvRotateWest = 0;
	        render.uvRotateNorth = 0;
	        render.uvRotateTop = 0;
	        render.uvRotateBottom = 0;
	        return var7;
        }
        return false;
    }
}
