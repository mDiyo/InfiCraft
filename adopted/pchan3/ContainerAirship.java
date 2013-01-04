package pchan3;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerAirship extends Container
{

    public ContainerAirship(InventoryPlayer inventoryplayer, EntityAirship air)
    {
    	addSlotToContainer(new Slot(air,13,134,16));
    	addSlotToContainer(new Slot(air,12,134,52));
          
        for(int j = 0; j < 3; j++)
        {
               for(int i1 = 0; i1 < 4; i1++)
               {
            	   addSlotToContainer(new Slot(air, i1 + (j) * 4, 8 + i1 * 18, 16 + j * 18));
               }
           }
           
           
           for(int k = 0; k < 3; k++)
           {
               for(int k1 = 0; k1 < 9; k1++)
               {
            	   addSlotToContainer(new Slot(inventoryplayer, k1 + (k + 1) * 9, 8 + k1 * 18, 84 + k * 18));
               }
           }

           for(int l = 0; l < 9; l++)
           {
        	   addSlotToContainer(new Slot(inventoryplayer, l, 8 + l * 18, 142));
           }    
    }




    public boolean isUsableByPlayer(EntityPlayer entityplayer)
    {
        return true;
    }

    public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int i)
    {
    	 ItemStack itemstack = null;
         Slot slot = (Slot)this.inventorySlots.get(i);
         if(slot != null && slot.getHasStack())
         {
             ItemStack itemstack1 = slot.getStack();
             itemstack = itemstack1.copy();
             if(i == 0)
             {
            	 this.mergeItemStack(itemstack1, 9, 45, true);
             } else
             if(i >= 9 && i < 36)
             {
            	 this.mergeItemStack(itemstack1, 36, 45, false);
             } else
             if(i >= 36 && i < 45)
             {
            	 this.mergeItemStack(itemstack1, 9, 36, false);
             } else
             {
                 this.mergeItemStack(itemstack1, 9, 45, false);
                 
             }
             if(itemstack1.stackSize == 0)
             {
                 slot.putStack(null);
             } else
             {
                 slot.onSlotChanged();
             }
             if(itemstack1.stackSize != itemstack.stackSize)
             {
                 slot.onPickupFromSlot(par1EntityPlayer, itemstack1);
             } else
             {
                 return null;
             }
         }
         return itemstack;
    }

    private EntityAirship airship;

	@Override
	public boolean canInteractWith(EntityPlayer var1) {
		// TODO Auto-generated method stub
		return false;
	}
   
}
