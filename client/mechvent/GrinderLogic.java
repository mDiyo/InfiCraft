package net.minecraft.src.mechvent;

import net.minecraft.src.forge.ISidedInventory;

import java.util.*;
import net.minecraft.src.*;

public class GrinderLogic extends BlockLogicPrototype
    implements ISidedInventory
{
    public short fuel;
    public short fuelGague;
    public short progress;
    public Random rand;
    
    public GrinderLogic()
    {
        super(19);
        fuel = 0;
        fuelGague = 0;
        progress = 0;
        rand = new Random();
    }

    public void readFromNBT(NBTTagCompound nbttagcompound)
    {
        super.readFromNBT(nbttagcompound);
        fuel = nbttagcompound.getShort("fuel");
        fuelGague = nbttagcompound.getShort("fuelGague");
        progress = nbttagcompound.getShort("progress");
    }

    public void writeToNBT(NBTTagCompound nbttagcompound)
    {
        super.writeToNBT(nbttagcompound);
        nbttagcompound.setShort("fuel", fuel);
        nbttagcompound.setShort("fuelGague", fuelGague);
        nbttagcompound.setShort("progress", progress);
    }

    public int gaugeProgressScaled(int i)
    {
        return (progress * i) / 200;
    }

    public int gaugeFuelScaled(int i)
    {
        if (fuelGague == 0)
        {
            fuelGague = fuel;
            if (fuelGague == 0)
            {
                fuelGague = 200;
            }
        }
        return (fuel * i) / fuelGague;
    }

    public void updateEntity()
    {
        super.updateEntity();
        boolean flag = isBurning();
        boolean flag1 = false;
        if (fuel <= 0 && canOperate())
        {
            fuel = fuelGague = getFuelValueFor(inventory[0]);
            if (fuel > 0)
            {
                if (inventory[0].getItem().hasContainerItem())
                {
                    inventory[0] = new ItemStack(inventory[0].getItem().getContainerItem());
                }
                else
                {
                    inventory[0].stackSize--;
                }
                if (inventory[0].stackSize <= 0)
                {
                    inventory[0] = null;
                }
                flag1 = true;
            }
        }
        if (isBurning() && canOperate())
        {
            progress++;
            if (progress >= 200)
            {
                progress = 0;
                operate();
                flag1 = true;
            }
        }
        else
        {
            progress = 0;
        }
        if (fuel > 0)
        {
            fuel--;
        }
        if (flag != isBurning())
        {
            setActive(isBurning());
            flag1 = true;
        }
        if (flag1)
        {
            onInventoryChanged();
        }
    }

    public void operate()
    {
        if (!canOperate())
        {
            return;
        }
        for (int i = 1; i <= 9; i++)
        {
        	List items = getResultFor(inventory[i]);
        	if (items != null)
        	{
	        	int[] chances = getRecipeChance(inventory[i]);
	        	if (!machineClogged(items))
	        	{
	        		outputItems(items, chances);
	        		inventory[i].stackSize--;
	        		if (inventory[i].stackSize < 1)
	        		{
	        			inventory[i] = null;
	        		}
	        	}
        	}
        }        
    }
    
    public void outputItems(List items, int[] chances)
    {
    	byte number = (byte)items.size();
    	
    	for (int iter = 0; iter < items.size(); iter++)
    	{
    		ItemStack stack = (ItemStack) items.get(iter);
    		int size = stack.stackSize;
    		boolean deposited = false;
    		int slot = 10;
    		while (deposited == false)
    		{
    			if (this.inventory[slot] == null)
    			{
    				if(rand.nextInt(100) + 1 <= chances[iter])
    					inventory[slot] = stack;
    				deposited = true;
    			}
    			
    			else if (compareItems(inventory[slot], stack) && 
    					inventory[slot].stackSize + stack.stackSize <= stack.getMaxStackSize())
    			{
    				if(rand.nextInt(100) + 1 <= chances[iter])
    					inventory[slot].stackSize += size;
    				deposited = true;
    			}
    			slot++;
    		}
    	}
    }
    
    public boolean compareItems(ItemStack invSlot, ItemStack recipe)
	{
		if (invSlot.itemID == recipe.itemID && invSlot.getItemDamage() == recipe.getItemDamage())
			return true;
		else
			return false;
	}

    public boolean isBurning()
    {
        return fuel > 0;
    }

    public boolean canOperate()
    {
	    for (int i = 1; i <= 9; i++)
	    {
	        List items = getResultFor(inventory[i]);
	      	if (items != null)
	       		return true;
	    }
	    return false;
    }
    
    public boolean machineClogged(List items)
    {
    	List compactItems = condenseItems(items);
    	byte number = (byte)compactItems.size();
    	byte openSlots = 0;
    	byte nullSlots = 0;
    	for (int slot = 10; slot <= 18; slot++)
    	{
    		if (this.inventory[slot] == null)
    		{
    			nullSlots++;
    		}
    	}
    	for (int j = 0; j < number; j++)
    	{
    		boolean openSlot = false;
    		for (int slot = 10; slot <= 18; slot++)
	    	{
    			if (this.inventory[slot] != null)
        		{
			    	ItemStack stack = (ItemStack) compactItems.get(j);
			    	if (compareItems(inventory[slot], stack) && 
			    			inventory[slot].stackSize + stack.stackSize <= inventory[slot].getMaxStackSize())
			    	{
			    		openSlot = true;
			    	}
        		}
	    	}
	    	if (openSlot)
	    	{
	    		openSlots++;
	    	}
    	}
    	if (openSlots + nullSlots < number)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
    
    public List condenseItems(List items)
    {
    	List condensed = new ArrayList();
    	condensed.add( ((ItemStack)items.get(0)).copy() );
    	for (int i = 1; i < items.size() - 1; i++)
    	{
    		boolean stacked = false;
    		ItemStack stack = (ItemStack)items.get(i);
    		for (int j = 0; j < condensed.size(); j++)
    		{
    			ItemStack smallStack = (ItemStack)condensed.get(j);
    			int size = stack.stackSize;
    			if ( smallStack.isItemEqual(stack) &&
    					smallStack.stackSize + stack.stackSize <= smallStack.getMaxStackSize())
    			{
    				smallStack.stackSize += size;
    				stacked = true;
    			}    			
    		}
    		if (!stacked)
    		{
    			condensed.add(stack.copy());
    		}
    	}
    	return condensed;
    }

    public static short getFuelValueFor(ItemStack itemstack)
    {
        if (itemstack == null)
        {
            return 0;
        }
        int i = itemstack.getItem().shiftedIndex;
        if (i < 256 && Block.blocksList[i].blockMaterial == Material.wood)
        {
            return 300;
        }
        if (i == Item.stick.shiftedIndex)
        {
            return 100;
        }
        if (i == Item.coal.shiftedIndex)
        {
            return 1600;
        }
        if (i == Item.bucketLava.shiftedIndex)
        {
            return 6400;
        }
        if (i == Block.sapling.blockID)
        {
            return 100;
        }
        else
        {
            return (short)ModLoader.addAllFuel(i, itemstack.getItemDamage());
        }
    }

    public List getResultFor(ItemStack itemstack)
    {
        return CrushingManager.getInstance().findMatchingGrinderRecipe(itemstack);
    }
    
    public int[] getRecipeChance(ItemStack itemstack)
    {
        return CrushingManager.getInstance().findGrinderRecipeChances(itemstack);
    }

    public String getInvName()
    {
        return "Ore Crusher";
    }

    public Container getGuiContainer(InventoryPlayer inventoryplayer)
    {
        return new GrinderContainer(inventoryplayer, this);
    }

    public int getStartInventorySide(int side)
    {
        switch (side)
        {
            case 0:
                return 0;

            case 1:
                return 1;
        }
        return 10;
    }

    public int getSizeInventorySide(int i)
    {
        return 1;
    }

	@Override
	public ItemStack getStackInSlotOnClosing(int var1) 
	{
		return null;
	}
}
