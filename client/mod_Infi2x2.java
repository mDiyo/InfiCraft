package net.minecraft.src;
import java.util.*;
import net.minecraft.src.infi2x2.*;

public class mod_Infi2x2 extends BaseMod
{
	public static Random rand = new Random();
	
	public static void forceAddToInv(EntityPlayer entityplayer, ItemStack itemstack, int i, boolean flag)
    {
        ItemStack itemstack1 = entityplayer.inventory.getStackInSlot(i);
        entityplayer.inventory.setInventorySlotContents(i, itemstack);
        if(itemstack1 != null)
        {
            addToInv(entityplayer, itemstack1, flag);
        }
    }
	
	public static boolean addToInv(EntityPlayer entityplayer, ItemStack itemstack, boolean flag)
    {
        return addToInv(entityplayer, itemstack, entityplayer.inventory.currentItem, flag);
    }
	
	public static boolean addToInv(EntityPlayer entityplayer, ItemStack itemstack, int i, boolean flag)
    {
        ItemStack itemstack1 = entityplayer.inventory.getStackInSlot(i);
        boolean flag1;
        if(itemstack1 == null)
        {
            entityplayer.inventory.setInventorySlotContents(i, itemstack);
            flag1 = true;
        } else
        {
            flag1 = entityplayer.inventory.addItemStackToInventory(itemstack);
        }
        if(flag && !flag1)
        {
            addItemStackToWorld(entityplayer.worldObj, (float)Math.floor(entityplayer.posX), (float)Math.floor(entityplayer.posY), (float)Math.floor(entityplayer.posZ), itemstack);
            return true;
        } else
        {
            return flag1;
        }
    }
	
	public static EntityItem addItemStackToWorld(World world, float f, float f1, float f2, ItemStack itemstack)
    {
        return addItemStackToWorld(world, f, f1, f2, itemstack, false);
    }
	
	public static EntityItem addItemStackToWorld(World world, float f, float f1, float f2, ItemStack itemstack, boolean flag)
    {
        EntityItem entityitem;
        if(flag)
        {
            entityitem = new EntityItem(world, f, f1, f2, itemstack);
        } else
        {
            float f3 = 0.7F;
            float f4 = rand.nextFloat() * f3 + (1.0F - f3) * 0.5F;
            float f5 = 1.2F;
            float f6 = rand.nextFloat() * f3 + (1.0F - f3) * 0.5F;
            entityitem = new EntityItem(world, f + f4, f1 + f5, f2 + f6, itemstack);
        }
        entityitem.delayBeforeCanPickup = 10;
        world.spawnEntityInWorld(entityitem);
        return entityitem;
    }
	
    public void addRenderer(Map map)
    {
        map.put(net.minecraft.src.infi2x2.DaggerEntity.class, new DaggerRender(0.25));
    }

	@Override
	public String getVersion() 
	{
		return "1.0pre";
	}

	@Override
	public void load() 
	{
		PropsHelperInfi2x2.initProps();
		Daggers.init();		
	}
}
