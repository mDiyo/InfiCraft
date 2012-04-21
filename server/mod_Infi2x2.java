package net.minecraft.src;
import java.util.*;
import net.minecraft.src.forge.*;
import net.minecraft.src.infi2x2.*;

public class mod_Infi2x2 extends NetworkMod
{
	public static Random rand = new Random();
	public static boolean infitoolsPresent;
	
	@Override
	public String getVersion() 
	{
		return "1.0.3";
	}
	
	@Override
	public void load() 
	{
		PropsHelperInfi2x2.initProps();
		checkForInfiTools();
		Handpicks.init();
		Hatchets.init();
		Trowels.init();
		Daggers.init();
		oreDictionarySupport();
		
		MinecraftForge.registerEntity(net.minecraft.src.infi2x2.DaggerEntity.class,
				this, 1, 20, 3, true);
	}
	
	public static void checkForInfiTools()
    {
        try
        {
        	Class class1 = Class.forName("mod_InfiTools");
        	infitoolsPresent = true;
        }
        catch (Throwable throwable)
        {
        	infitoolsPresent = false;
        }
    }
	
	private void oreDictionarySupport()
	{
		if (infitoolsPresent)
		{
		    MinecraftForge.registerOreHandler(new IOreHandler()
		    {
		        public void registerOre(String ore, ItemStack itemstack)
		        {
		            if(PropsHelperInfi2x2.enableCopperTools && ore.equals("ingotCopper"))
		            {
		            	Handpicks.addCopperTools(itemstack);
		            	Hatchets.addCopperTools(itemstack);
		            	Trowels.addCopperTools(itemstack);
		            	Daggers.addCopperTools(itemstack);
		            }
		            if(PropsHelperInfi2x2.enableBronzeTools && ore.equals("ingotBronze"))
		            {
			            Handpicks.addBronzeTools(itemstack);
			            Hatchets.addBronzeTools(itemstack);
			            Trowels.addBronzeTools(itemstack);
			            Daggers.addBronzeTools(itemstack);
		            }
		            if(PropsHelperInfi2x2.enableWorkedIronTools && ore.equals("ingotRefinedIron"))
		            {
			            Handpicks.addWorkedIronTools(itemstack);
			            Hatchets.addWorkedIronTools(itemstack);
			            Trowels.addWorkedIronTools(itemstack);
			            Daggers.addWorkedIronTools(itemstack);
		            }
		            if(PropsHelperInfi2x2.enableSteelTools && ore.equals("ingotSteel"))
		            {
			            Handpicks.addSteelTools(itemstack);
			            Hatchets.addSteelTools(itemstack);
			            Trowels.addSteelTools(itemstack);
			            Daggers.addSteelTools(itemstack);
		            }
		            if(PropsHelperInfi2x2.enableCobaltTools && ore.equals("ingotCobalt"))
		            {
			            Handpicks.addCobaltTools(itemstack);
			            Hatchets.addCobaltTools(itemstack);
			            Trowels.addCobaltTools(itemstack);
			            Daggers.addCobaltTools(itemstack);
		            }
		            if(PropsHelperInfi2x2.enableArditeTools && ore.equals("ingotArdite"))
		            {
			            Handpicks.addArditeTools(itemstack);
			            Hatchets.addArditeTools(itemstack);
			            Trowels.addArditeTools(itemstack);
			            Daggers.addArditeTools(itemstack);
		            }
		            if(PropsHelperInfi2x2.enableManyullynTools && ore.equals("ingotManyullyn"))
		            {
		            	Handpicks.addManyullynTools(itemstack);
		            	Hatchets.addManyullynTools(itemstack);
		            	Trowels.addManyullynTools(itemstack);
		            	Daggers.addManyullynTools(itemstack);
		            }
		            if(PropsHelperInfi2x2.enableUraniumTools && ore.equals("ingotUranium"))
		            {
			            Handpicks.addUraniumTools(itemstack);
			            Hatchets.addUraniumTools(itemstack);
			            Trowels.addUraniumTools(itemstack);
			            Daggers.addUraniumTools(itemstack);
		            }
		            if(PropsHelperInfi2x2.enableStoneTools && (ore.equals("customCobblestone") || ore.equals("customStone")))
		            {
			            Handpicks.addStoneTools(itemstack);
			            Hatchets.addStoneTools(itemstack);
			            Trowels.addStoneTools(itemstack);
			            Daggers.addStoneTools(itemstack);
		            }
		        }
		    } );
		}
	}
	
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
	
	@Override
	public boolean clientSideRequired() 
	{
		return true;
	}

	@Override
	public boolean serverSideRequired() 
	{
		return false;
	}
}
