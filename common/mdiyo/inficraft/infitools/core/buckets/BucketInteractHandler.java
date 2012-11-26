package mDiyo.inficraft.infitools.core.buckets;

import mDiyo.inficraft.infitools.base.InfiToolPowers;
import mDiyo.inficraft.infitools.core.EmptyBowl;
import mDiyo.inficraft.infitools.core.Items;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.ItemStack;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.EntityInteractEvent;

public class BucketInteractHandler 
{

	@ForgeSubscribe
	public boolean onEntityInteract(EntityInteractEvent event) 
	{
		EntityPlayer player = event.entityPlayer;
		ItemStack currentStack = player.inventory.getCurrentItem();
		
		if (currentStack == null)
		{
			return true;
		}

		//Buckets
        if (currentStack.itemID == Items.getInstance().woodBucketEmpty.shiftedIndex)
        {
        	player.inventory.setInventorySlotContents(player.inventory.currentItem, new ItemStack(Items.getInstance().woodBucketMilk));
            return true;
        }
        if (currentStack.itemID == Items.getInstance().cactusBucketEmpty.shiftedIndex)
        {
        	player.inventory.setInventorySlotContents(player.inventory.currentItem, new ItemStack(Items.getInstance().cactusBucketMilk));
            return true;
        }
        if (currentStack.itemID == Items.getInstance().goldBucketEmpty.shiftedIndex)
        {
        	player.inventory.setInventorySlotContents(player.inventory.currentItem, new ItemStack(Items.getInstance().goldBucketMilk));
            return true;
        }
        if (currentStack.itemID == Items.getInstance().iceBucketEmpty.shiftedIndex)
        {
        	player.inventory.setInventorySlotContents(player.inventory.currentItem, new ItemStack(Items.getInstance().iceBucketMilk));
            return true;
        }
        if (currentStack.itemID == Items.getInstance().slimeBucketEmpty.shiftedIndex)
        {
        	player.inventory.setInventorySlotContents(player.inventory.currentItem, new ItemStack(Items.getInstance().slimeBucketMilk));
            return true;
        }
        
        //Bowls
        if (currentStack.getItem() instanceof EmptyBowl)
        {
        	currentStack.stackSize--;
        	if (!(player.inventory.addItemStackToInventory(new ItemStack(Items.getInstance().multiBowlSoup, 1, currentStack.getItemDamage()))))
	        {
	        	InfiToolPowers.spawnItem(player.posX, player.posY, player.posZ, new ItemStack(Items.getInstance().multiBowlSoup, 1, currentStack.getItemDamage()), player.worldObj);
	        }        	
            return true;
        }
        
		return true;
	}
}
