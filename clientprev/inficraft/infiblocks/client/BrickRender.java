package inficraft.infiblocks.client;

import inficraft.infiblocks.InfiBlocks;
import inficraft.infiblocks.PHInfiBlocks;
import inficraft.infiblocks.blocks.PaneBase;
import inficraft.infiblocks.magicslabs.MagicSlabBase;
import net.minecraft.src.Block;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.RenderBlocks;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

public class BrickRender implements ISimpleBlockRenderingHandler
{

	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelID,
			RenderBlocks renderer) {
		
		if (modelID == InfiBlocks.getContentInstance().brickModelID)
		{
			block.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
	        BlockRenderHelper.renderDo(renderer, block, metadata);
		}
		
	}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z,
			Block block, int modelID, RenderBlocks renderer) 
	{
		
		if (modelID == InfiBlocks.getContentInstance().brickModelID)
		{
			return renderBrickWorld(renderer, world, x, y, z, block);
		}
		
		else
		{	  	
			return false;
		}
	}

	@Override
	public boolean shouldRender3DInInventory() {
		return true;
	}

	@Override
	public int getRenderId() {
		return InfiBlocks.getContentInstance().brickModelID;
	}
	
	public static boolean renderBrickWorld(RenderBlocks render, 
            IBlockAccess iba, int x, int y, int z, Block block)
    {
        int bID = iba.getBlockId(x, y, z);
        int md = iba.getBlockMetadata(x, y, z);
        int tex = block.getBlockTextureFromSideAndMetadata(0, md);
        
        int eastID = iba.getBlockId(x+1, y, z);
        int eastMD = iba.getBlockMetadata(x+1, y, z);
        int eastTex = tex;
        
        int westID = iba.getBlockId(x-1, y, z);
        int westMD = iba.getBlockMetadata(x-1, y, z);
        int westTex = tex;
        
        int northID = iba.getBlockId(x, y, z+1);
        int northMD = iba.getBlockMetadata(x, y, z+1);
        int northTex = tex;
        
        int southID = iba.getBlockId(x, y, z-1);
        int southMD = iba.getBlockMetadata(x, y, z-1);
        int southTex = tex;

        if ((bID == InfiBlocks.getContentInstance().brownstone.blockID && md != 3) 
            || (bID == InfiBlocks.getContentInstance().iceBrick.blockID && md != 0)
            || (bID == InfiBlocks.getContentInstance().brick.blockID && (md >= 9 || md <= 11) )) {
            BlockRenderHelper.getInstance().renderTexturedBlock(render, block, iba, x, y, z, 
                eastTex, eastTex, westTex, eastTex, northTex, southTex);
            return true;
        }
        
        if (eastID == block.blockID) {
            
            if(eastMD == 0) {
                eastTex += md;
            }
            else if (md == eastMD) {
                //Do nothing
            } else {                
                eastTex += eastMD;
            }

        } else
        
        if(eastID == PHInfiBlocks.iceBrickID && eastMD == 0)
        {
            eastTex += 10;
        } else
        
        if(eastID == PHInfiBlocks.brownstoneID && eastMD == 3)
        {
            eastTex += 9;
        } else
        
        if(eastID == Block.stoneBrick.blockID)
        {
            eastTex += 11;
        }
        
        if (westID == block.blockID) {
            if(westMD == 0) {
                westTex += md;
            }
            else if (md == westMD) {
                //Do nothing
            } else {                
                westTex += westMD;
            }
            
        } else

        if(westID == PHInfiBlocks.iceBrickID && westMD == 0)
        {
            westTex += 10;
        } else
        
        if(westID == PHInfiBlocks.brownstoneID && westMD == 3)
        {
            westTex += 9;
        } else

        if(westID == Block.stoneBrick.blockID)
        {
            eastTex += 11;
        }
        
        if (northID == block.blockID) {
            if(northMD == 0) {
                northTex += md;
            }
            else if (md == northMD) {
                //Do nothing
            } else {                
                northTex += northMD;
            }
            
        } else

        if(northID == PHInfiBlocks.iceBrickID && northMD == 0)
        {
            northTex += 10;
        } else
        
        if(northID == PHInfiBlocks.brownstoneID && northMD == 3)
        {
            northTex += 9;
        } else

        if(northID == Block.stoneBrick.blockID)
        {
            eastTex += 11;
        }
        
        if (southID == block.blockID) {
            if(southMD == 0) {
                southTex += md;
            }
            else if (md == southMD) {
                //Do nothing
            } else {                
                southTex += southMD;
            }
            
        } else

        if(southID == PHInfiBlocks.iceBrickID && southMD == 0)
        {
            southTex += 10;
        } else
        
        if(southID == PHInfiBlocks.brownstoneID && southMD == 3)
        {
            southTex += 9;
        } else

        if(southID == Block.stoneBrick.blockID)
        {
            eastTex += 11;
        }

        BlockRenderHelper.getInstance().renderTexturedBlock(render, block, iba, x, y, z, 
                eastTex, eastTex, westTex, eastTex, northTex, southTex);
        
        return true;
    }

}
