// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

package net.minecraft.src.timberframes;

import java.util.*;

import net.minecraft.src.AxisAlignedBB;
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
import net.minecraft.src.mod_Kaevator_Beams;

// Referenced classes of package net.minecraft.src:
//            Entity, EnumBeams, AxisAlignedBB, World, 
//            EntityItem, ItemStack, Item, MathHelper, 
//            Material, NBTTagCompound

public class EntityBeams_Kaevator extends Entity
{

    public EntityBeams_Kaevator(World world)
    {
        super(world);        
        direction = 0;
        yOffset = 0.0F;           
        setSize(0.5F, 0.5F);
    }

    public EntityBeams_Kaevator(World world, int i, int j, int k, int l, int pMaterial)
    {
        this(world);
        xPosition = i;
        yPosition = j;
        zPosition = k;  
        material = pMaterial;
        ArrayList arraylist = new ArrayList();
        EnumBeams_Kaevator aenumbeams[] = EnumBeams_Kaevator.values();
        int i1 = aenumbeams.length;
        for(int j1 = 0; j1 < i1; j1++)
        {
            EnumBeams_Kaevator enumbeams = aenumbeams[j1];
            beams = enumbeams;
            func_412_b(l);
            if(canStay())
            {
                arraylist.add(enumbeams);
            }
        }

        if(arraylist.size() > 0)
        {
            beams = (EnumBeams_Kaevator)arraylist.get(0);//rand.nextInt(arraylist.size()));
        }
        func_412_b(l);
    }    

    public EntityBeams_Kaevator(World world, int i, int j, int k, int l, String s)
    {
        this(world);
        xPosition = i;
        yPosition = j;
        zPosition = k;        
        EnumBeams_Kaevator aenumbeams[] = EnumBeams_Kaevator.values();
        int i1 = aenumbeams.length;
        int j1 = 0;
        do
        {
            if(j1 >= i1)
            {
                break;
            }
            EnumBeams_Kaevator enumbeams = aenumbeams[j1];
            if(enumbeams.title.equals(s))
            {
                beams = enumbeams;
                break;
            }
            j1++;
        } while(true);
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
    	if(itemstack != null && itemstack.itemID == mod_Kaevator_Beams.beamsItem.shiftedIndex){
    			
    		int lCounter = 0;
	    	int lOldBeam = 0;
	    	int lNewBeam = 0;
	    	String lOldTitle = beams.title;
	    	
    		ArrayList arraylist = new ArrayList();
	        EnumBeams_Kaevator aenumbeams[] = EnumBeams_Kaevator.values();
	        int i1 = aenumbeams.length;
	        for(int j1 = 0; j1 < i1; j1++)
	        {
	            EnumBeams_Kaevator enumbeams = aenumbeams[j1];
	            beams = enumbeams;            
	            func_412_b(direction);
	            if(canStay())
	            {	            	
	                arraylist.add(enumbeams);
	                if (enumbeams.title.equals(lOldTitle)){
	                	lOldBeam = lCounter;
	                }
	                lCounter++;
	            }
	        }
	        
	        lNewBeam = lOldBeam+1;
	        if(lNewBeam >= arraylist.size()){
	        	lNewBeam = 0;
	        }
	
	        if(arraylist.size() > 0)
	        {
	            beams = (EnumBeams_Kaevator)arraylist.get(lNewBeam);
	        }
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
        float f = beams.sizeX;
        float f1 = beams.sizeY;
        float f2 = beams.sizeX;
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
            f3 -= func_411_c(beams.sizeX);
        }
        if(i == 1)
        {
            f5 += func_411_c(beams.sizeX);
        }
        if(i == 2)
        {
            f3 += func_411_c(beams.sizeX);
        }
        if(i == 3)
        {
            f5 -= func_411_c(beams.sizeX);
        }
        f4 += func_411_c(beams.sizeY);
        setPosition(f3, f4, f5);
        float f7 = -0.00625F;
        boundingBox.setBounds(f3 - f - f7, f4 - f1 - f7, f5 - f2 - f7, f3 + f + f7, f4 + f1 + f7, f5 + f2 + f7);     
          
        // Create smaller bounding box for collisions with objects
		if(i == 0 || i == 2)
		{
		    f -= 0.1F;
		    f1 -= 0.1F;
		} else
		{
		    f1 -= 0.1F;
		    f2 -= 0.1F;
		}
		setupboundingBox.setBounds(f3 - f - f7, f4 - f1 - f7, f5 - f2 - f7, f3 + f + f7, f4 + f1 + f7, f5 + f2 + f7);
      
        // Create larger bounding box for fire
        if(i == 0 || i == 2)
        {
        	f += 0.1F;
		    f1 += 0.1F;
            f2 = 1.0F;
        } else
        {
            f = 1.0F;
            f1 += 0.1F;
		    f2 += 0.1F;
        }
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
    	if(worldObj.isBoundingBoxBurning(fireboundingBox.contract(0.001D, 0.001D, 0.001D)))
        {
            dealFireDamage(1);            
        }
    }

    public boolean canStay()
    {
        if(worldObj.getCollidingBoundingBoxes(this, setupboundingBox).size() > 0)
        {
            return false;
        }
        
        int i = beams.sizeX / 16;
        int j = beams.sizeY / 16;
        int k = xPosition;
        int l = yPosition;
        int i1 = zPosition;
        if(direction == 0)
        {
            k = MathHelper.floor_double(posX - (double)((float)beams.sizeX / 32F));
        }
        if(direction == 1)
        {
            i1 = MathHelper.floor_double(posZ - (double)((float)beams.sizeX / 32F));
        }
        if(direction == 2)
        {
            k = MathHelper.floor_double(posX - (double)((float)beams.sizeX / 32F));
        }
        if(direction == 3)
        {
            i1 = MathHelper.floor_double(posZ - (double)((float)beams.sizeX / 32F));
        }
        l = MathHelper.floor_double(posY - (double)((float)beams.sizeY / 32F));
        for(int j1 = 0; j1 < i; j1++)
        {
            for(int k1 = 0; k1 < j; k1++)
            {
                Material material;
                if(direction == 0 || direction == 2)
                {
                    material = worldObj.getBlockMaterial(k + j1, l + k1, zPosition);
                } else
                {
                    material = worldObj.getBlockMaterial(xPosition, l + k1, i1 + j1);
                }
                if(!material.isSolid())
                {
                    return false;
                }
            }
        }

        List list = worldObj.getEntitiesWithinAABBExcludingEntity(this, boundingBox);
        for(int l1 = 0; l1 < list.size(); l1++)
        {
            if(list.get(l1) instanceof EntityBeams_Kaevator)
            {
            	EntityBeams_Kaevator lNeighbourFrame = (EntityBeams_Kaevator)list.get(l1);
            	if(lNeighbourFrame.direction == direction){
            		return false;
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
	    	if(itemstack != null && (itemstack.itemID == mod_Kaevator_Beams.beamsItem.shiftedIndex
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
    
    public AxisAlignedBB getBoundingBox()
    {
    	if(beams.isCollidable){
    		return boundingBox;
    	}
    	return null;
    }

    public boolean attackEntityFrom(DamageSource damagesource, int i)
    {
    	if(damagesource.getSourceOfDamage() instanceof EntityPlayer){
    		
    		EntityPlayer lPlayer = (EntityPlayer)damagesource.getSourceOfDamage();    		
    		ItemStack itemstack = lPlayer.inventory.getCurrentItem();
        	if(itemstack != null && (itemstack.itemID == mod_Kaevator_Beams.beamsItem.shiftedIndex
        			|| itemstack.itemID == Item.axeWood.shiftedIndex
        			|| itemstack.itemID == Item.axeStone.shiftedIndex
        			|| itemstack.itemID == Item.axeSteel.shiftedIndex
        			|| itemstack.itemID == Item.axeGold.shiftedIndex
        			|| itemstack.itemID == Item.axeDiamond.shiftedIndex)){
    	
		        if(!isDead && !worldObj.isRemote)
		        {
		            setDead();
		            setBeenAttacked();
		            worldObj.spawnEntityInWorld(new EntityItem(worldObj, posX, posY, posZ, new ItemStack(mod_Kaevator_Beams.beamsItem, 1, material)));
		        }
		        return true;
        	}
    	}
    	return false;
    }

    public void writeEntityToNBT(NBTTagCompound nbttagcompound)
    {
        nbttagcompound.setByte("Dir", (byte)direction);
        nbttagcompound.setString("Motive", beams.title);
        nbttagcompound.setInteger("TileX", xPosition);
        nbttagcompound.setInteger("TileY", yPosition);
        nbttagcompound.setInteger("TileZ", zPosition);
        nbttagcompound.setInteger("Red", red);
        nbttagcompound.setInteger("Green", green);
        nbttagcompound.setInteger("Blue", blue);
        nbttagcompound.setInteger("Material", material);
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
        material = nbttagcompound.getInteger("Material");
        String s = nbttagcompound.getString("Motive");
        EnumBeams_Kaevator aenumbeams[] = EnumBeams_Kaevator.values();
        int i = aenumbeams.length;
        for(int j = 0; j < i; j++)
        {
            EnumBeams_Kaevator enumbeams = aenumbeams[j];
            if(enumbeams.title.equals(s))
            {
                beams = enumbeams;
            }
        }

        if(beams == null)
        {
            beams = EnumBeams_Kaevator.beam_01;
        }
        func_412_b(direction);
    }
    
    public void moveEntity(double d, double d1, double d2)
    {
        if(!worldObj.isRemote && d * d + d1 * d1 + d2 * d2 > 0.0D)
        {
            setDead();
            worldObj.spawnEntityInWorld(new EntityItem(worldObj, posX, posY, posZ, new ItemStack(mod_Kaevator_Beams.beamsItem, 1, material)));
        }
    }

    public void addVelocity(double d, double d1, double d2)
    {
        if(!worldObj.isRemote && d * d + d1 * d1 + d2 * d2 > 0.0D)
        {
            setDead();
            worldObj.spawnEntityInWorld(new EntityItem(worldObj, posX, posY, posZ, new ItemStack(mod_Kaevator_Beams.beamsItem, 1, material)));
        }
    }
    
    public int direction;
    public int xPosition;
    public int yPosition;
    public int zPosition;
    public int red = 256;
    public int green = 256;
    public int blue = 256;
    public int material =0;
    public EnumBeams_Kaevator beams;
    public final AxisAlignedBB fireboundingBox = AxisAlignedBB.getBoundingBox(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
    public final AxisAlignedBB setupboundingBox = AxisAlignedBB.getBoundingBox(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D);    
    public static final int colorValues[] = {
        0x1e1b1b, 0xb3312c, 0x3b511a, 0x51301a, 0x253192, 0x7b2fbe, 0x287697, 0x868686, 0x434343, 0xd88198, 
        0x41cd34, 0xdecf2a, 0x6689d3, 0xc354cd, 0xeb8844, 0xf0f0f0
    };    
}
