// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

package net.minecraft.src.wallpaper;

import java.util.*;

import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.DamageSource;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityItem;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.MathHelper;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.World;
import net.minecraft.src.mod_Kaevator_Wallpaper;

// Referenced classes of package net.minecraft.src:
//            Entity, EnumWallpaper, AxisAlignedBB, World, 
//            EntityItem, ItemStack, Item, MathHelper, 
//            Material, NBTTagCompound

public class EntityWallpaper_Kaevator extends Entity
{

    public EntityWallpaper_Kaevator(World world)
    {
        super(world);        
        direction = 0;
        yOffset = 0.0F;           
        setSize(0.5F, 0.5F);
    }

    public EntityWallpaper_Kaevator(World world, int i, int j, int k, int l)
    {
        this(world);
        xPosition = i;
        yPosition = j;
        zPosition = k; 
        wallpaper = 0;
        func_412_b(l);
        
        List list = worldObj.getEntitiesWithinAABBExcludingEntity(this, fireboundingBox);
        for(int l1 = 0; l1 < list.size(); l1++)
        {
            if(list.get(l1) instanceof EntityWallpaper_Kaevator)
            {
            	EntityWallpaper_Kaevator lNeighbourFrame = (EntityWallpaper_Kaevator)list.get(l1);
            	wallpaper = lNeighbourFrame.wallpaper;
            }
        }  
    }    

    public EntityWallpaper_Kaevator(World world, int i, int j, int k, int l, int lMaterial)
    {
        this(world);
        xPosition = i;
        yPosition = j;
        zPosition = k;        
        wallpaper = lMaterial;
        func_412_b(l);
    }
    
    protected void dealFireDamage(int i)
    {    			
		red = (colorValues[8]&0xff0000)>>16;
		green = (colorValues[8]&0x00ff00)>>8;
		blue = (colorValues[8]&0x0000ff);    	
    }
    
    public boolean interact(EntityPlayer entityplayer)
    {
    	ItemStack itemstack = entityplayer.inventory.getCurrentItem();
    	if(itemstack != null && itemstack.itemID == Item.dyePowder.shiftedIndex){
    		
    		int lColor = itemstack.getItemDamage();   			
			red = (colorValues[lColor]&0xff0000)>>16;
			green = (colorValues[lColor]&0x00ff00)>>8;
			blue = (colorValues[lColor]&0x0000ff);
			itemstack.stackSize--;
    		
    		return true;
    	} else   		
    	if(itemstack != null && itemstack.itemID == mod_Kaevator_Wallpaper.wallpaperItem.shiftedIndex){
    			
    		int lCounter = mod_Kaevator_Wallpaper.nb_motives;
	    	int lOldWall = wallpaper;
	    	int lNewWall = lOldWall+1;   	        
	       
	        if(lNewWall >= lCounter){
	        	lNewWall = 0;
	        }	
	        
	        wallpaper = lNewWall;	        
	        func_412_b(direction);
	        return true;
    	}
    	return false;
    }

    protected void entityInit()
    {
    }

    public void func_412_b(int i)
    {
        direction = i;
        prevRotationYaw = rotationYaw = i * 90;
        float f = 16;
        float f1 = 16;
        float f2 = 16;
        if(i == 0 || i == 2)
        {
            f2 = 0.5F;
        } else
        {
            f = 0.5F;
        }
        f /= 32F;
        f1 /= 32F;
        f2 /= 32F;
        float f3 = (float)xPosition + 0.5F;
        float f4 = (float)yPosition + 0.5F;
        float f5 = (float)zPosition + 0.5F;
        float f6 = 0.5625F;
        if(i == 0)
        {
            f5 -= f6;
        }
        if(i == 1)
        {
            f3 -= f6;
        }
        if(i == 2)
        {
            f5 += f6;
        }
        if(i == 3)
        {
            f3 += f6;
        }
        if(i == 0)
        {
            f3 -= func_411_c(16);
        }
        if(i == 1)
        {
            f5 += func_411_c(16);
        }
        if(i == 2)
        {
            f3 += func_411_c(16);
        }
        if(i == 3)
        {
            f5 -= func_411_c(16);
        }
        f4 += func_411_c(16);
        setPosition(f3, f4, f5);
        float f7 = -0.00625F;
        boundingBox.setBounds(f3 - f - f7, f4 - f1 - f7, f5 - f2 - f7, f3 + f + f7, f4 + f1 + f7, f5 + f2 + f7);     
                 
        f = 1.0F;
        f1 = 1.0F;
        f2 = 1.0F;        
        fireboundingBox.setBounds(f3 - f , f4 - f1, f5 - f2, f3 + f, f4 + f1, f5 + f2);
           
    }

    private float func_411_c(int i)
    {
        if(i == 32)
        {
            return 0.5F;
        }
        return i != 64 ? 0.0F : 0.5F;
    }

    public void onUpdate()
    {
    	if(!worldObj.isRemote)
        {            
            if(!canStay())
            {
                setDead();
                worldObj.spawnEntityInWorld(new EntityItem(worldObj, posX, posY, posZ, new ItemStack(mod_Kaevator_Wallpaper.wallpaperItem)));
            }
        }
    	if(worldObj.isBoundingBoxBurning(fireboundingBox.contract(0.001D, 0.001D, 0.001D)))
        {
            dealFireDamage(1);            
        }
    }

    public boolean canStay()
    {                  
        
        Material material;
        material = worldObj.getBlockMaterial(xPosition , yPosition, zPosition);
        if(!material.isSolid())
        {
            return false;
        }
        
        int lPosX = MathHelper.floor_double(posX);
        int lPosY = MathHelper.floor_double(posY);
        int lPosZ = MathHelper.floor_double(posZ);
        
        Material materialfront;
        materialfront = worldObj.getBlockMaterial(lPosX, lPosY, lPosZ);
        if(materialfront.isSolid()){
            
        	Block lBlockFront;            
            lBlockFront = Block.blocksList[worldObj.getBlockId(lPosX, lPosY, lPosZ)];                
            
            if(lBlockFront.isOpaqueCube())
            {
                return false;
            }
        }  

        List list = worldObj.getEntitiesWithinAABBExcludingEntity(this, boundingBox);
        for(int l1 = 0; l1 < list.size(); l1++)
        {
            if(list.get(l1) instanceof EntityWallpaper_Kaevator)
            {
            	EntityWallpaper_Kaevator lNeighbourFrame = (EntityWallpaper_Kaevator)list.get(l1);
            	if(lNeighbourFrame.direction == direction){
            		return false;
            	}
            }
        }

        Material materialUp = worldObj.getBlockMaterial(lPosX , lPosY+1, lPosZ);
    	Material materialDown = worldObj.getBlockMaterial(lPosX , lPosY-1, lPosZ);
    	Material materialLeft = worldObj.getBlockMaterial(lPosX , lPosY, lPosZ);
    	Material materialRight = worldObj.getBlockMaterial(lPosX , lPosY, lPosZ);
    	
        if(direction == 0)
        {        	
        	materialLeft = worldObj.getBlockMaterial(lPosX-1, lPosY, lPosZ);
        	materialRight = worldObj.getBlockMaterial(lPosX+1, lPosY, lPosZ);
        }else
    	if(direction == 2)
        { 
    		materialLeft = worldObj.getBlockMaterial(lPosX+1, lPosY, lPosZ);
        	materialRight = worldObj.getBlockMaterial(lPosX-1, lPosY, lPosZ);
        }else
        if(direction == 1)
        {
        	materialLeft = worldObj.getBlockMaterial(lPosX, lPosY, lPosZ+1);
        	materialRight = worldObj.getBlockMaterial(lPosX, lPosY, lPosZ-1);
        }else
        if(direction == 3)
        {
        	materialLeft = worldObj.getBlockMaterial(lPosX, lPosY, lPosZ-1);
        	materialRight = worldObj.getBlockMaterial(lPosX, lPosY, lPosZ+1);
        }
        
        if(!materialUp.isSolid())
        {
        	isBlockUp = false;
        }
        if(!materialDown.isSolid())
        {
        	isBlockDown = false;
        }
        if(!materialLeft.isSolid())
        {
        	isBlockLeft = false;
        }
        if(!materialRight.isSolid())
        {
        	isBlockRight = false;
        }
        
        List listNeighbour = worldObj.getEntitiesWithinAABBExcludingEntity(this, fireboundingBox);
        
        for(int l1 = 0; l1 < listNeighbour.size(); l1++)
        {
            if(listNeighbour.get(l1) instanceof EntityWallpaper_Kaevator)
            {
            	EntityWallpaper_Kaevator lNeighbourFrame = (EntityWallpaper_Kaevator)listNeighbour.get(l1);
            	if(lNeighbourFrame.direction == direction){
            		if(lNeighbourFrame.posX == posX && lNeighbourFrame.posY == posY+1 && lNeighbourFrame.posZ == posZ){
            			isBlockUp = true;            			
            		}
            		if(lNeighbourFrame.posX == posX && lNeighbourFrame.posY == posY-1 && lNeighbourFrame.posZ == posZ){
            			isBlockDown = true;            			
            		}            		
            		
            		if(direction == 0)
                    {        	
            			if(lNeighbourFrame.posX == posX-1 && lNeighbourFrame.posY == posY && lNeighbourFrame.posZ == posZ){
                			isBlockLeft = true;            			
                		}
                		if(lNeighbourFrame.posX == posX+1 && lNeighbourFrame.posY == posY && lNeighbourFrame.posZ == posZ){
                			isBlockRight = true;            			
                		} 
                    }else
                	if(direction == 2)
                    { 
                		if(lNeighbourFrame.posX == posX+1 && lNeighbourFrame.posY == posY && lNeighbourFrame.posZ == posZ){
                			isBlockLeft = true;            			
                		}
                		if(lNeighbourFrame.posX == posX-1 && lNeighbourFrame.posY == posY && lNeighbourFrame.posZ == posZ){
                			isBlockRight = true;            			
                		} 
                    }else
                    if(direction == 1)
                    {
                    	if(lNeighbourFrame.posX == posX && lNeighbourFrame.posY == posY && lNeighbourFrame.posZ == posZ+1){
                			isBlockLeft = true;            			
                		}
                		if(lNeighbourFrame.posX == posX && lNeighbourFrame.posY == posY && lNeighbourFrame.posZ == posZ-1){
                			isBlockRight = true;            			
                		} 
                    }else
                    if(direction == 3)
                    {
                    	if(lNeighbourFrame.posX == posX && lNeighbourFrame.posY == posY && lNeighbourFrame.posZ == posZ-1){
                			isBlockLeft = true;            			
                		}
                		if(lNeighbourFrame.posX == posX && lNeighbourFrame.posY == posY && lNeighbourFrame.posZ == posZ+1){
                			isBlockRight = true;            			
                		} 
                    }
            	}
            }
        }
        
        return true;
    }

    public boolean canBeCollidedWith()
    {
    	if(!worldObj.isRemote){
	    	EntityPlayer lThisPlayer = worldObj.getClosestPlayerToEntity(this, 10.0D);
	    	ItemStack itemstack = lThisPlayer.inventory.getCurrentItem();
	    	if(itemstack != null && (itemstack.itemID == mod_Kaevator_Wallpaper.wallpaperItem.shiftedIndex
	    			|| itemstack.itemID == Item.axeWood.shiftedIndex
	    			|| itemstack.itemID == Item.axeStone.shiftedIndex
	    			|| itemstack.itemID == Item.axeSteel.shiftedIndex
	    			|| itemstack.itemID == Item.axeGold.shiftedIndex
	    			|| itemstack.itemID == Item.axeDiamond.shiftedIndex
	    			|| itemstack.itemID == Item.dyePowder.shiftedIndex)){
	    		return true;
	    	}
    	}
        
        return false;
    }    

    public boolean attackEntityFrom(DamageSource damagesource, int i)
    {
    	if(damagesource.getSourceOfDamage() instanceof EntityPlayer){
    		
    		EntityPlayer lPlayer = (EntityPlayer)damagesource.getSourceOfDamage();    		
    		ItemStack itemstack = lPlayer.inventory.getCurrentItem();
        	if(itemstack != null && (itemstack.itemID == mod_Kaevator_Wallpaper.wallpaperItem.shiftedIndex
        			|| itemstack.itemID == Item.axeWood.shiftedIndex
        			|| itemstack.itemID == Item.axeStone.shiftedIndex
        			|| itemstack.itemID == Item.axeSteel.shiftedIndex
        			|| itemstack.itemID == Item.axeGold.shiftedIndex
        			|| itemstack.itemID == Item.axeDiamond.shiftedIndex)){
    	
		        if(!isDead && !worldObj.isRemote)
		        {
		            setDead();
		            setBeenAttacked();
		            worldObj.spawnEntityInWorld(new EntityItem(worldObj, posX, posY, posZ, new ItemStack(mod_Kaevator_Wallpaper.wallpaperItem)));
		        }
		        return true;
        	}
    	}
    	return false;
    }

    public void writeEntityToNBT(NBTTagCompound nbttagcompound)
    {
        nbttagcompound.setByte("Dir", (byte)direction);
        nbttagcompound.setInteger("Motive", wallpaper);
        nbttagcompound.setInteger("TileX", xPosition);
        nbttagcompound.setInteger("TileY", yPosition);
        nbttagcompound.setInteger("TileZ", zPosition);
        nbttagcompound.setInteger("Red", red);
        nbttagcompound.setInteger("Green", green);
        nbttagcompound.setInteger("Blue", blue);
    }

    public void readEntityFromNBT(NBTTagCompound nbttagcompound)
    {
        direction = nbttagcompound.getByte("Dir");
        xPosition = nbttagcompound.getInteger("TileX");
        yPosition = nbttagcompound.getInteger("TileY");
        zPosition = nbttagcompound.getInteger("TileZ");
        red = nbttagcompound.getInteger("Red");
        green = nbttagcompound.getInteger("Green");
        blue = nbttagcompound.getInteger("Blue");
        wallpaper = nbttagcompound.getInteger("Motive");
        
        func_412_b(direction);
    }
    
    public void moveEntity(double d, double d1, double d2)
    {
        if(!worldObj.isRemote && d * d + d1 * d1 + d2 * d2 > 0.0D)
        {
            setDead();
            worldObj.spawnEntityInWorld(new EntityItem(worldObj, posX, posY, posZ, new ItemStack(mod_Kaevator_Wallpaper.wallpaperItem)));
        }
    }

    public void addVelocity(double d, double d1, double d2)
    {
        if(!worldObj.isRemote && d * d + d1 * d1 + d2 * d2 > 0.0D)
        {
            setDead();
            worldObj.spawnEntityInWorld(new EntityItem(worldObj, posX, posY, posZ, new ItemStack(mod_Kaevator_Wallpaper.wallpaperItem)));
        }
    }
    
    public int direction;
    public int xPosition;
    public int yPosition;
    public int zPosition;
    public int red = 256;
    public int green = 256;
    public int blue = 256;
    public int wallpaper;
    public boolean isBlockUp=true;
    public boolean isBlockDown=true;
    public boolean isBlockLeft=true;
    public boolean isBlockRight=true;
    public final AxisAlignedBB fireboundingBox = AxisAlignedBB.getBoundingBox(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
    public static final int colorValues[] = {
        0x1e1b1b, 0xb3312c, 0x3b511a, 0x51301a, 0x253192, 0x7b2fbe, 0x287697, 0x868686, 0x434343, 0xd88198, 
        0x41cd34, 0xdecf2a, 0x6689d3, 0xc354cd, 0xeb8844, 0xf0f0f0
    };    
}
