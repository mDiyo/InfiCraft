package mDiyo.inficraft.infitools.core;

import mDiyo.inficraft.infitools.base.InfiToolPowers;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemFood;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.src.World;

public class SoupBowl extends ItemFood
{
	private Item bowl = Items.getInstance().multiBowlEmpty;
    public SoupBowl(int itemID, int fullAmount, String itemName)
    {
        super(itemID, fullAmount, false);
        this.setItemName(itemName);
        ModLoader.addName(this, itemName);
    }

    public ItemStack onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par1EntityPlayer)
    {
        super.onFoodEaten(par1ItemStack, par2World, par1EntityPlayer);
        if(!par1EntityPlayer.capabilities.isCreativeMode)
        {
	        if (!(par1EntityPlayer.inventory.addItemStackToInventory(new ItemStack(bowl, 1, par1ItemStack.getItemDamage()))))
	        {
	        	InfiToolPowers.spawnItem(par1EntityPlayer.posX, par1EntityPlayer.posY, par1EntityPlayer.posZ, new ItemStack(bowl, 1, par1ItemStack.getItemDamage()), par2World);
	        }
	        par1EntityPlayer.inventory.decrStackSize(par1EntityPlayer.inventory.currentItem, 1);
        }
        par1EntityPlayer.inventory.decrStackSize(par1EntityPlayer.inventory.currentItem, 1);
        return par1ItemStack;
    }
    
    @Override 
    public int getIconFromDamageForRenderPass(int meta, int pass)
    {
    	if (pass == 0)
    	{
    		return bowl.getIconFromDamage(meta);
    	}
    	else
    		return this.getIconFromDamage(meta);
    }
    
    public int getRenderPasses(int metadata)
    {
    	return 2;
    }
        
    @Override public boolean requiresMultipleRenderPasses()
    {
    	return true;
    }

	@Override
	public String getTextureFile() 
	{
		return "/inficore/items.png";
	}
}
