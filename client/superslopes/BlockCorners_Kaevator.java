package net.minecraft.src.superslopes;
// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.ArrayList;

import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.MathHelper;
import net.minecraft.src.World;
import net.minecraft.src.mod_Kaevator_Corners;

public class BlockCorners_Kaevator extends Block
{	
    public BlockCorners_Kaevator(int i, int j, Material material)
    {
        super(i, j, material);
		//setTickOnLoad(true);
		setLightOpacity(mod_Kaevator_Corners.SlopesOpacity);
    }    

	public int getRenderType()
    {
        return mod_Kaevator_Corners.CornersRenderID;
    } 
	
	public boolean isOpaqueCube()
    {
        return false;
    }

    public boolean renderAsNormalBlock()
    {
        return false;
    }
	
	public boolean shouldSideBeRendered(IBlockAccess iblockaccess, int i, int j, int k, int l)
    {        
        return true;        
    }
	
	public void onBlockPlacedBy(World world, int i, int j, int k, EntityLiving entityliving)
	{		
		int oldmeta = world.getBlockMetadata(i, j, k);
		int l;		
		
		l = MathHelper.floor_double((double)((entityliving.rotationYaw * 4F) / 360F)) & 3;		
		
		if(l == 0)
		{
			world.setBlockMetadataWithNotify(i, j, k, 2 + oldmeta );
		}
		if(l == 1)
		{
			world.setBlockMetadataWithNotify(i, j, k, 1 + oldmeta );
		}
		if(l == 2)
		{
			world.setBlockMetadataWithNotify(i, j, k, 3 + oldmeta );
		}
		if(l == 3)
		{
			world.setBlockMetadataWithNotify(i, j, k, 0 + oldmeta);
		}		
	}
	
    protected int func_21025_b(int i)
    {
            if(i == 0 || i == 1 || i == 2 || i == 3)        {            return 0;        }
            if(i == 4 || i == 5 || i == 6 || i == 7)        {            return 4;        }
            if(i == 8 || i == 9 || i == 10 || i == 11)      {            return 8;        }
            if(i == 12 || i == 13 || i == 14 || i == 15) {            return 12;        }
            else { return i; }
    }	
	
	protected int damageDropped(int i)
	{
		if(i == 0 || i == 1 || i == 2 || i == 3)        {            return 0;        }
		if(i == 4 || i == 5 || i == 6 || i == 7)        {            return 4;        }
		if(i == 8 || i == 9 || i == 10 || i == 11)      {            return 8;        }
		if(i == 12 || i == 13 || i == 14 || i == 15) {            return 12;        }
		else { return i; }
	}
	
	public void getCollidingBoundingBoxes(World world, int i, int j, int k, AxisAlignedBB axisalignedbb, ArrayList arraylist)
    {
        int l = world.getBlockMetadata(i, j, k)%8;
        if(l == 0)
        {
            setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
            super.getCollidingBoundingBoxes(world, i, j, k, axisalignedbb, arraylist);
            setBlockBounds(0.5F, 0.5F, 0.5F, 1.0F, 1.0F, 1.0F);
            super.getCollidingBoundingBoxes(world, i, j, k, axisalignedbb, arraylist);
        } else
        if(l == 1)
        {
            setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
            super.getCollidingBoundingBoxes(world, i, j, k, axisalignedbb, arraylist);
            setBlockBounds(0.0F, 0.5F, 0.0F, 0.5F, 1.0F, 0.5F);
            super.getCollidingBoundingBoxes(world, i, j, k, axisalignedbb, arraylist);
        } else
        if(l == 2)
        {
            setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
            super.getCollidingBoundingBoxes(world, i, j, k, axisalignedbb, arraylist);
            setBlockBounds(0.0F, 0.5F, 0.5F, 0.5F, 1.0F, 1.0F);
            super.getCollidingBoundingBoxes(world, i, j, k, axisalignedbb, arraylist);
        } else
        if(l == 3)
        {
            setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
            super.getCollidingBoundingBoxes(world, i, j, k, axisalignedbb, arraylist);
            setBlockBounds(0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 0.5F);
            super.getCollidingBoundingBoxes(world, i, j, k, axisalignedbb, arraylist);
        } else
        if(l == 4)
        {
            setBlockBounds(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.getCollidingBoundingBoxes(world, i, j, k, axisalignedbb, arraylist);
            setBlockBounds(0.5F, 0.0F, 0.5F, 1.0F, 0.5F, 1.0F);
            super.getCollidingBoundingBoxes(world, i, j, k, axisalignedbb, arraylist);
        } else
        if(l == 5)
        {
            setBlockBounds(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.getCollidingBoundingBoxes(world, i, j, k, axisalignedbb, arraylist);
            setBlockBounds(0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.5F);
            super.getCollidingBoundingBoxes(world, i, j, k, axisalignedbb, arraylist);
        } else
        if(l == 6)
        {
            setBlockBounds(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.getCollidingBoundingBoxes(world, i, j, k, axisalignedbb, arraylist);
            setBlockBounds(0.0F, 0.0F, 0.5F, 0.5F, 0.5F, 1.0F);
            super.getCollidingBoundingBoxes(world, i, j, k, axisalignedbb, arraylist);
        } else
        if(l == 7)
        {
            setBlockBounds(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.getCollidingBoundingBoxes(world, i, j, k, axisalignedbb, arraylist);
            setBlockBounds(0.5F, 0.0F, 0.0F, 1.0F, 0.5F, 0.5F);
            super.getCollidingBoundingBoxes(world, i, j, k, axisalignedbb, arraylist);
        }
		setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }
	
	public boolean blockActivated(World world, int i, int j, int k, EntityPlayer entityplayer)
    {
		int lCurrentID = world.getBlockId(i, j, k);
		if(lCurrentID == mod_Kaevator_Corners.BlockKaevBlackWoolCorners.blockID ||
				lCurrentID == mod_Kaevator_Corners.BlockKaevRedWoolCorners.blockID ||
				lCurrentID == mod_Kaevator_Corners.BlockKaevGreenWoolCorners.blockID ||
				lCurrentID == mod_Kaevator_Corners.BlockKaevBrownWoolCorners.blockID ||
				lCurrentID == mod_Kaevator_Corners.BlockKaevBlueWoolCorners.blockID ||
				lCurrentID == mod_Kaevator_Corners.BlockKaevPurpleWoolCorners.blockID ||
				lCurrentID == mod_Kaevator_Corners.BlockKaevCyanWoolCorners.blockID ||
				lCurrentID == mod_Kaevator_Corners.BlockKaevSilverWoolCorners.blockID ||
				lCurrentID == mod_Kaevator_Corners.BlockKaevGrayWoolCorners.blockID ||
				lCurrentID == mod_Kaevator_Corners.BlockKaevPinkWoolCorners.blockID ||
				lCurrentID == mod_Kaevator_Corners.BlockKaevLimeWoolCorners.blockID ||
				lCurrentID == mod_Kaevator_Corners.BlockKaevYellowWoolCorners.blockID ||
				lCurrentID == mod_Kaevator_Corners.BlockKaevLightBlueWoolCorners.blockID ||
				lCurrentID == mod_Kaevator_Corners.BlockKaevMagentaWoolCorners.blockID ||
				lCurrentID == mod_Kaevator_Corners.BlockKaevOrangeWoolCorners.blockID ||
				lCurrentID == mod_Kaevator_Corners.BlockKaevWhiteWoolCorners.blockID){					
		
			ItemStack itemstack = entityplayer.inventory.getCurrentItem();
	    	if(itemstack != null && itemstack.itemID == Item.dyePowder.shiftedIndex){
	    		int lOldMeta = world.getBlockMetadata(i, j, k);	
	    		
	    		if(itemstack.getItemDamage() == 0 && mod_Kaevator_Corners.BlockKaevBlackWoolCorners.blockID != Block.stone.blockID){	    		
	    			world.setBlockAndMetadataWithNotify(i, j, k, mod_Kaevator_Corners.BlockKaevBlackWoolCorners.blockID,lOldMeta);
	    			return true;
	    		}else
    			if(itemstack.getItemDamage() == 1 && mod_Kaevator_Corners.BlockKaevRedWoolCorners.blockID != Block.stone.blockID){	    		
	    			world.setBlockAndMetadataWithNotify(i, j, k, mod_Kaevator_Corners.BlockKaevRedWoolCorners.blockID,lOldMeta);
	    			return true;
    			}else
	    		if(itemstack.getItemDamage() == 2 && mod_Kaevator_Corners.BlockKaevGreenWoolCorners.blockID != Block.stone.blockID){	    		
	    			world.setBlockAndMetadataWithNotify(i, j, k, mod_Kaevator_Corners.BlockKaevGreenWoolCorners.blockID,lOldMeta);
	    			return true;
	    		}else
	    		if(itemstack.getItemDamage() == 3 && mod_Kaevator_Corners.BlockKaevBrownWoolCorners.blockID != Block.stone.blockID){	    		
	    			world.setBlockAndMetadataWithNotify(i, j, k, mod_Kaevator_Corners.BlockKaevBrownWoolCorners.blockID,lOldMeta);
	    			return true;
	    		}else
	    		if(itemstack.getItemDamage() == 4 && mod_Kaevator_Corners.BlockKaevBlueWoolCorners.blockID != Block.stone.blockID){	    		
	    			world.setBlockAndMetadataWithNotify(i, j, k, mod_Kaevator_Corners.BlockKaevBlueWoolCorners.blockID,lOldMeta);
	    			return true;
	    		}else
	    		if(itemstack.getItemDamage() == 5 && mod_Kaevator_Corners.BlockKaevPurpleWoolCorners.blockID != Block.stone.blockID){	    		
	    			world.setBlockAndMetadataWithNotify(i, j, k, mod_Kaevator_Corners.BlockKaevPurpleWoolCorners.blockID,lOldMeta);
	    			return true;
		    	}else
	    		if(itemstack.getItemDamage() == 6 && mod_Kaevator_Corners.BlockKaevCyanWoolCorners.blockID != Block.stone.blockID){	    		
	    			world.setBlockAndMetadataWithNotify(i, j, k, mod_Kaevator_Corners.BlockKaevCyanWoolCorners.blockID,lOldMeta);
	    			return true;
		    	}else
	    		if(itemstack.getItemDamage() == 7 && mod_Kaevator_Corners.BlockKaevSilverWoolCorners.blockID != Block.stone.blockID){	    		
	    			world.setBlockAndMetadataWithNotify(i, j, k, mod_Kaevator_Corners.BlockKaevSilverWoolCorners.blockID,lOldMeta);
	    			return true;
		    	}else
	    		if(itemstack.getItemDamage() == 8 && mod_Kaevator_Corners.BlockKaevGrayWoolCorners.blockID != Block.stone.blockID){	    		
	    			world.setBlockAndMetadataWithNotify(i, j, k, mod_Kaevator_Corners.BlockKaevGrayWoolCorners.blockID,lOldMeta);
	    			return true;
		    	}else
	    		if(itemstack.getItemDamage() == 9 && mod_Kaevator_Corners.BlockKaevPinkWoolCorners.blockID != Block.stone.blockID){	    		
	    			world.setBlockAndMetadataWithNotify(i, j, k, mod_Kaevator_Corners.BlockKaevPinkWoolCorners.blockID,lOldMeta);
	    			return true;
		    	}else
	    		if(itemstack.getItemDamage() == 10 && mod_Kaevator_Corners.BlockKaevLimeWoolCorners.blockID != Block.stone.blockID){	    		
	    			world.setBlockAndMetadataWithNotify(i, j, k, mod_Kaevator_Corners.BlockKaevLimeWoolCorners.blockID,lOldMeta);
	    			return true;
		    	}else
	    		if(itemstack.getItemDamage() == 11 && mod_Kaevator_Corners.BlockKaevYellowWoolCorners.blockID != Block.stone.blockID){	    		
	    			world.setBlockAndMetadataWithNotify(i, j, k, mod_Kaevator_Corners.BlockKaevYellowWoolCorners.blockID,lOldMeta);
	    			return true;
		    	}else
	    		if(itemstack.getItemDamage() == 12 && mod_Kaevator_Corners.BlockKaevLightBlueWoolCorners.blockID != Block.stone.blockID){	    		
	    			world.setBlockAndMetadataWithNotify(i, j, k, mod_Kaevator_Corners.BlockKaevLightBlueWoolCorners.blockID,lOldMeta);
	    			return true;
			    }else
	    		if(itemstack.getItemDamage() == 13 && mod_Kaevator_Corners.BlockKaevMagentaWoolCorners.blockID != Block.stone.blockID){	    		
	    			world.setBlockAndMetadataWithNotify(i, j, k, mod_Kaevator_Corners.BlockKaevMagentaWoolCorners.blockID,lOldMeta);
	    			return true;
			    }else
	    		if(itemstack.getItemDamage() == 14 && mod_Kaevator_Corners.BlockKaevOrangeWoolCorners.blockID != Block.stone.blockID){	    		
	    			world.setBlockAndMetadataWithNotify(i, j, k, mod_Kaevator_Corners.BlockKaevOrangeWoolCorners.blockID,lOldMeta);
	    			return true;
			    }else
	    		if(itemstack.getItemDamage() == 15 && mod_Kaevator_Corners.BlockKaevWhiteWoolCorners.blockID != Block.stone.blockID){	    		
	    			world.setBlockAndMetadataWithNotify(i, j, k, mod_Kaevator_Corners.BlockKaevWhiteWoolCorners.blockID,lOldMeta);
	    			return true;
			    }
	    	}
		}
		return false;
    }
	
    public static int func_21034_c(int i)
    {       
		return i;
    }

    public static int func_21035_d(int i)
    {        
		return i;
    }
}
