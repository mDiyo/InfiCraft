package inficraft.infiblocks.client;

import inficraft.infiblocks.InfiBlocks;
import inficraft.infiblocks.blocks.PaneBase;
import inficraft.infiblocks.magicslabs.MagicSlabBase;
import net.minecraft.src.Block;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.RenderBlocks;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

public class MagicSlabRender implements ISimpleBlockRenderingHandler
{

	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelID,
			RenderBlocks renderer) 
	{
		if (modelID == InfiBlocks.getContentInstance().magicSlabModel)
		{
			block.setBlockBounds(0.3125F, 0.1875F, 0.1875F, 0.6875F, 0.8125F, 0.8125F);
	        BlockRenderHelper.renderDo(renderer, block, metadata);
		}
	}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z,
			Block block, int modelID, RenderBlocks renderer) 
	{
		if (modelID == InfiBlocks.getContentInstance().magicSlabModel)
		{
			return renderMagicWorld(renderer, world, x, y, z, (MagicSlabBase)block);
		}
		else
		{	  	
			return false;
		}
	}

	@Override
	public boolean shouldRender3DInInventory() 
	{
		return true;
	}

	@Override
	public int getRenderId() {
		return InfiBlocks.getContentInstance().magicSlabModel;
	}
	
	public static boolean renderMagicWorld(RenderBlocks renderblocks, 
            IBlockAccess iblockaccess, int x, int y, int z, MagicSlabBase slab)
    {
        boolean east = slab.canConnectSlabTo(iblockaccess, x, y, z - 1);
        boolean west = slab.canConnectSlabTo(iblockaccess, x, y, z + 1);
        boolean south = slab.canConnectSlabTo(iblockaccess, x - 1, y, z);
        boolean north = slab.canConnectSlabTo(iblockaccess, x + 1, y, z);
        boolean below = slab.canConnectSlabTo(iblockaccess, x, y - 1, z);
        boolean above = slab.canConnectSlabTo(iblockaccess, x, y + 1, z);
        
        boolean eastSlab = slab.isSlab(iblockaccess, x, y, z - 1);
        boolean westSlab = slab.isSlab(iblockaccess, x, y, z + 1);
        boolean southSlab = slab.isSlab(iblockaccess, x - 1, y, z);
        boolean northSlab = slab.isSlab(iblockaccess, x + 1, y, z);
        boolean belowSlab = slab.isSlab(iblockaccess, x, y - 1, z);
        boolean aboveSlab = slab.isSlab(iblockaccess, x, y + 1, z);
        
        byte slabsEast = slab.countNearbyBlocks(iblockaccess, x, y, z - 1);
        byte slabsWest = slab.countNearbyBlocks(iblockaccess, x, y, z + 1);
        byte slabsSouth = slab.countNearbyBlocks(iblockaccess, x - 1, y, z);
        byte slabsNorth = slab.countNearbyBlocks(iblockaccess, x + 1, y, z);
        byte slabsBelow = slab.countNearbyBlocks(iblockaccess, x, y - 1, z);
        byte slabsAbove = slab.countNearbyBlocks(iblockaccess, x, y + 1, z);
        
        boolean eastTube = slab.checkForTube(iblockaccess, x, y, z - 1);
        boolean westTube = slab.checkForTube(iblockaccess, x, y, z + 1);
        boolean southTube = slab.checkForTube(iblockaccess, x - 1, y, z);
        boolean northTube = slab.checkForTube(iblockaccess, x + 1, y, z);
        boolean belowTube = slab.checkForTube(iblockaccess, x, y - 1, z);
        boolean aboveTube = slab.checkForTube(iblockaccess, x, y + 1, z);
        
        boolean eastSlabShape = slab.checkForSlabShape(iblockaccess, x, y, z - 1);
        boolean westSlabShape = slab.checkForSlabShape(iblockaccess, x, y, z + 1);
        boolean southSlabShape = slab.checkForSlabShape(iblockaccess, x - 1, y, z);
        boolean northSlabShape = slab.checkForSlabShape(iblockaccess, x + 1, y, z);
        boolean belowSlabShape = slab.checkForSlabShape(iblockaccess, x, y - 1, z);
        boolean aboveSlabShape = slab.checkForSlabShape(iblockaccess, x, y + 1, z);
        
        float bottomHeight = 0.0F;
        float middleHeight = 0.5F;
        float topHeight = 1.0F;
        float lowOffset = 0.3125F;
        float highOffset = 0.6875F;
        
        float bX = bottomHeight;
        float bY = bottomHeight;
        float bZ = bottomHeight;
        float tX = topHeight;
        float tY = topHeight;
        float tZ = topHeight;
        
        byte num = 0;
        num += east ? 1 : 0;
        num += west ? 1 : 0;
        num += south ? 1 : 0;
        num += north ? 1 : 0;
        num += above ? 1 : 0;
        num += below ? 1 : 0;
        
        byte numSlab = 0;
        numSlab += eastSlab ? 1 : 0;
        numSlab += westSlab ? 1 : 0;
        numSlab += southSlab ? 1 : 0;
        numSlab += northSlab ? 1 : 0;
        numSlab += aboveSlab ? 1 : 0;
        numSlab += belowSlab ? 1 : 0;
        
        if(num == 0) {
            bX = 0.25F;
            bY = 0.25F;
            bZ = 0.25F;
            tX = 0.75F;
            tY = 0.75F;
            tZ = 0.75F;
        } else
        
        if(num == 1)
        {
            if(below)
                tY = middleHeight;
            if(above)
                bY = middleHeight;
            if(south)
                tX = middleHeight;
            if(north)
                bX = middleHeight;
            if(east)
                tZ = middleHeight;
            if(west)
                bZ = middleHeight;
            
        } else
        
        if(num == 2)
        {
            //Tubes
            if(below && above) {
                bX = lowOffset;
                bZ = lowOffset;
                tX = highOffset;
                tZ = highOffset;
            } else
            
            if(east && west) {
                bX = lowOffset;
                bY = lowOffset;
                tX = highOffset;
                tY = highOffset;
            } else
            
            if(north && south) {
                bY = lowOffset;
                bZ = lowOffset;
                tY = highOffset;
                tZ = highOffset;
            } else
            
            if(below)
            {
                if(south) {
                    if(southTube) {
                        tY = highOffset;
                        bZ = lowOffset;
                        tZ = highOffset;
                    }
                    else
                        tY = middleHeight;
                    if(belowTube) {
                        tX = highOffset;
                        bZ = lowOffset;
                        tZ = highOffset;
                    } else {
                        tX = middleHeight;
                    }
                }

                if(north) {
                    if(northTube) {
                        tY = highOffset;
                        bZ = lowOffset;
                        tZ = highOffset;
                    } else
                        tY = middleHeight;
                    if(belowTube) {
                        bX = lowOffset;
                        bZ = lowOffset;
                        tZ = highOffset;
                    } else
                        bX = middleHeight;
                }
                
                if(east) {
                    if(eastTube) {
                        tY = highOffset;
                        bX = lowOffset;
                        tX = highOffset;
                    } else
                        tY = middleHeight;
                    if(belowTube) {
                        tZ = highOffset;
                        bX = lowOffset;
                        tX = highOffset;
                    } else
                        tZ = middleHeight;
                }
                
                if(west) {
                    if(westTube) {
                        tY = highOffset;
                        bX = lowOffset;
                        tX = highOffset;
                    } else
                        tY = middleHeight;
                    if(belowTube) {
                        bZ = lowOffset;
                        bX = lowOffset;
                        tX = highOffset;
                    } else
                        bZ = middleHeight;
                }
                
            } else
            
            if(above)
            {
                if(south) {
                    if(southTube) {
                        bY = lowOffset;
                        bZ = lowOffset;
                        tZ = highOffset;
                    }
                    else
                        bY = middleHeight;
                    if(aboveTube) {
                        tX = highOffset;
                        bZ = lowOffset;
                        tZ = highOffset;
                    } else {
                        tX = middleHeight;
                    }
                }

                if(north) {
                    if(northTube) {
                        bY = lowOffset;
                        bZ = lowOffset;
                        tZ = highOffset;
                    } else
                        bY = middleHeight;
                    if(aboveTube) {
                        bX = lowOffset;
                        bZ = lowOffset;
                        tZ = highOffset;
                    } else
                        bX = middleHeight;
                }
                
                if(east) {
                    if(eastTube) {
                        bY = lowOffset;
                        bX = lowOffset;
                        tX = highOffset;
                    } else
                        bY = middleHeight;
                    if(aboveTube) {
                        tZ = highOffset;
                        bX = lowOffset;
                        tX = highOffset;
                    } else
                        tZ = middleHeight;
                }
                
                if(west) {
                    if(westTube) {
                        bY = lowOffset;
                        bX = lowOffset;
                        tX = highOffset;
                    } else
                        bY = middleHeight;
                    if(aboveTube) {
                        bZ = lowOffset;
                        bX = lowOffset;
                        tX = highOffset;
                    } else
                        bZ = middleHeight;
                }
            } else
            
            if(west && north) {
                if(westTube) {
                    bX = lowOffset;
                    bY = lowOffset;
                    tY = highOffset;
                } else
                    bX = middleHeight;
                if(northTube) {
                    bZ = lowOffset;
                    bY = lowOffset;
                    tY = highOffset;
                } else {
                    bZ = middleHeight;
                }
            }
            
            if(west && south) {
                if(westTube) {
                    tX = highOffset;
                    bY = lowOffset;
                    tY = highOffset;
                } else
                    tX = middleHeight;
                if(southTube) {
                    bZ = lowOffset;
                    bY = lowOffset;
                    tY = highOffset;
                } else {
                    bZ = middleHeight;
                }
            } else
            
            if(east && north) {
                if(eastTube) {
                    bX = lowOffset;
                    bY = lowOffset;
                    tY = highOffset;
                } else
                    bX = middleHeight;
                if(northTube) {
                    tZ = highOffset;
                    bY = lowOffset;
                    tY = highOffset;
                } else {
                    tZ = middleHeight;
                }
            } else
            
            if(east && south) {
                if(eastTube) {
                    tX = highOffset;
                    bY = lowOffset;
                    tY = highOffset;
                } else
                    tX = middleHeight;
                if(southTube) {
                    tZ = highOffset;
                    bY = lowOffset;
                    tY = highOffset;
                } else {
                    tZ = middleHeight;
                }
            }
        } else
        
        if(num == 3) 
        {
            if(below && above) 
            {
                if(north) {
                    if(belowTube || aboveTube)
                        bX = lowOffset;
                    else
                        bX = middleHeight;
                    bZ = lowOffset;
                    tZ = highOffset;
                } else
                
                if(south) {
                    if(belowTube || aboveTube)
                        tX = highOffset;
                    else
                        tX = middleHeight;
                    bZ = lowOffset;
                    tZ = highOffset;
                }
                
                if(west) {
                    bX = lowOffset;
                    tX = highOffset;
                    if(belowTube || aboveTube)
                        bZ = lowOffset;
                    else
                        bZ = middleHeight;
                }
                
                if(east) {
                    bX = lowOffset;
                    tX = highOffset;
                    if(belowTube || aboveTube)
                        tZ = highOffset;
                    else
                        tZ = middleHeight;
                }
            } else
            
            if(north && south)
            {
                if(above) {
                    if(northTube || southTube)
                        bY = lowOffset;
                    else
                        bY = middleHeight;
                    bZ = lowOffset;
                    tZ = highOffset;
                } else
                
                if(below) {
                    if(northTube || southTube)
                        tY = highOffset;
                    else
                        tY = middleHeight;
                    bZ = lowOffset;
                    tZ = highOffset;
                }
                
                if(west) {
                    bY = lowOffset;
                    tY = highOffset;
                    if(northTube || southTube)
                        bZ = lowOffset;
                    else
                        bZ = middleHeight;
                }
                
                if(east) {
                    bY = lowOffset;
                    tY = highOffset;
                    if(northTube || southTube)
                        tZ = highOffset;
                    else
                        tZ = middleHeight;
                }
            } else
            
            if(east && west) 
            {
                if(north) {
                    if(eastTube || westTube)
                        bX = lowOffset;
                    else
                        bX = middleHeight;
                    bY = lowOffset;
                    tY = highOffset;
                } else
                
                if(south) {
                    if(eastTube || westTube)
                        tX = highOffset;
                    else
                        tX = middleHeight;
                    bY = lowOffset;
                    tY = highOffset;
                }
                
                if(above) {
                    bX = lowOffset;
                    tX = highOffset;
                    if(eastTube || westTube)
                        bY = lowOffset;
                    else
                        bY = middleHeight;
                }
                
                if(below) {
                    bX = lowOffset;
                    tX = highOffset;
                    if(eastTube || westTube)
                        tY = highOffset;
                    else
                        tY = middleHeight;
                }
            } else
                
            if(above)
            {
                bY = middleHeight;
                if(north){
                    bX = middleHeight;
                    if(east)
                        tZ = middleHeight;
                    if(west)
                        bZ = middleHeight;
                } else
                
                if(south){
                    tX = middleHeight;
                    if(east)
                        tZ = middleHeight;
                    if(west)
                        bZ = middleHeight;
                }
            } else
            
            if(below)
            {
                tY = middleHeight;
                if(north){
                    bX = middleHeight;
                    if(east)
                        tZ = middleHeight;
                    if(west)
                        bZ = middleHeight;
                } else
                
                if(south){
                    tX = middleHeight;
                    if(east)
                        tZ = middleHeight;
                    if(west)
                        bZ = middleHeight;
                }
            }
        } else
        
        if(num == 4)
        {
            if(above && below) {
                if(east && west)
                {
                    bX = lowOffset;
                    tX = highOffset;
                } else
                
                if(north && south) {
                    bZ = lowOffset;
                    tZ = highOffset;
                } else
                    
                if(north)
                {
                    bX = middleHeight;
                    if(east)
                        tZ = middleHeight;
                    if(west)
                        bZ = middleHeight;
                } else
                
                if(south)
                {
                    tX = middleHeight;
                    if(east)
                        tZ = middleHeight;
                    if(west)
                        bZ = middleHeight;
                }
            } else
            
            if (north && south)
            {
                if(!above && !below) {
                    bY = lowOffset;
                    tY = highOffset;
                }
                
                if(above)
                {
                    bY = middleHeight;
                    if(east)
                        tZ = middleHeight;
                    if(west)
                        bZ = middleHeight;
                } else
                
                if(below)
                {
                    tY = middleHeight;
                    if(east)
                        tZ = middleHeight;
                    if(west)
                        bZ = middleHeight;
                }
            } else
            
            if(east && west) {
                if(above)
                {
                    bY = middleHeight;
                    if(south)
                        tX = middleHeight;
                    if(north)
                        bX = middleHeight;
                } else
                
                if(below)
                {
                    tY = middleHeight;
                    if(south)
                        tX = middleHeight;
                    if(north)
                        bX = middleHeight;
                }
            }
        } else
        
        if(num == 5)
        {
            if(!below)
            {
                if(northTube || southTube || eastTube || westTube
                        || northSlabShape || southSlabShape || eastSlabShape || westSlabShape) {
                    bY = lowOffset;
                }
                else {
                    bY = middleHeight;
                }
                
                if(slabsAbove == 2)
                {
                    tY = highOffset;
                    slab.setBlockBounds(bX, bY, bZ, tX, tY, tZ);
                    renderblocks.renderStandardBlock(slab, x, y, z);
                                        
                    bX = lowOffset;
                    tX = highOffset;
                    bZ = lowOffset;
                    tZ = highOffset;
                    bY = highOffset;
                    tY = topHeight;
                }
            }
            if(!above)
            {
                if(northTube || southTube || eastTube || westTube
                        || northSlabShape || southSlabShape || eastSlabShape || westSlabShape) {
                    tY = highOffset;
                }
                else {
                    tY = middleHeight;
                }
                
                if(slabsBelow == 2)
                {
                    bY = lowOffset;
                    //bY = 0F;
                    slab.setBlockBounds(bX, bY, bZ, tX, tY, tZ);
                    renderblocks.renderStandardBlock(slab, x, y, z);
                                        
                    bX = lowOffset;
                    tX = highOffset;
                    bZ = lowOffset;
                    tZ = highOffset;
                    tY = lowOffset;
                    bY = bottomHeight;
                }
            }
            if(!south)
            {
                if(aboveTube || belowTube || eastTube || westTube
                        || aboveSlabShape || belowSlabShape || eastSlabShape || westSlabShape) {
                    bX = lowOffset;
                }
                else {
                    bX = middleHeight;
                }
                
                if(slabsNorth == 2)
                {
                    tX = highOffset;
                    slab.setBlockBounds(bX, bY, bZ, tX, tY, tZ);
                    renderblocks.renderStandardBlock(slab, x, y, z);
                                        
                    bY = lowOffset;
                    tY = highOffset;
                    bZ = lowOffset;
                    tZ = highOffset;
                    bX = highOffset;
                    tX = topHeight;
                }
            }
            if(!north)
            {
                //tX = middleHeight;
                if(aboveTube || belowTube || eastTube || westTube
                        || aboveSlabShape || belowSlabShape || eastSlabShape || westSlabShape) {
                    tX = highOffset;
                }
                else {
                    tX = middleHeight;
                }
                
                if(slabsSouth == 2)
                {
                    bX = lowOffset;
                    slab.setBlockBounds(bX, bY, bZ, tX, tY, tZ);
                    renderblocks.renderStandardBlock(slab, x, y, z);
                                        
                    bY = lowOffset;
                    tY = highOffset;
                    bZ = lowOffset;
                    tZ = highOffset;
                    tX = lowOffset;
                    bX = bottomHeight;
                }
            }
            if(!east)
            {
                //bZ = middleHeight;
                if(northTube || southTube || aboveTube || belowTube
                        || northSlabShape || southSlabShape || aboveSlabShape || belowSlabShape) {
                    bZ = lowOffset;
                }
                else {
                    bZ = middleHeight;
                }
                
                if(slabsWest == 2)
                {
                    tZ = highOffset;
                    slab.setBlockBounds(bX, bY, bZ, tX, tY, tZ);
                    renderblocks.renderStandardBlock(slab, x, y, z);
                                        
                    bY = lowOffset;
                    tY = highOffset;
                    bX = lowOffset;
                    tX = highOffset;
                    bZ = highOffset;
                    tZ = topHeight;
                }
            }
            if(!west)
            {
                if(northTube || southTube || aboveTube || belowTube
                        || northSlabShape || southSlabShape || aboveSlabShape || belowSlabShape) {
                    tZ = highOffset;
                }
                else {
                    tZ = middleHeight;
                }
                
                if(slabsEast == 2)
                {
                    bZ = lowOffset;
                    slab.setBlockBounds(bX, bY, bZ, tX, tY, tZ);
                    renderblocks.renderStandardBlock(slab, x, y, z);
                                        
                    bX = lowOffset;
                    tX = highOffset;
                    bY = lowOffset;
                    tY = highOffset;
                    bZ = bottomHeight;
                    tZ = lowOffset;
                }
            }
        }

        slab.setBlockBounds(bX, bY, bZ, tX, tY, tZ);
        renderblocks.renderStandardBlock(slab, x, y, z);
        return false;
    }

}
