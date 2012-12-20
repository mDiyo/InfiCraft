package inficraft.infitools.crafting;

import inficraft.infitools.ToolItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/*
 * Small class for checking if a particular tool combination is this one
 */

public class ToolRecipe
{
	Item head;
	Item accessory;
	Item item;
	
	public ToolRecipe(Item h, Item acc, Item i)
	{
		head = h;
		accessory = acc;
		item = i;
	}
	
	public boolean validHead(Item he)
	{
		if (head == he)
			return true;
		else
			return false;
	}
	
	public boolean validHandle(Item handle)
	{
		return (handle == ToolItems.toolRod || handle == Item.stick || handle == Item.bone);
	}
	
	public boolean validAccessory(Item acc)
	{
		if (accessory == null && acc == null)
			return true;
		else if (accessory == ToolItems.toolRod)
			return validHandle(acc);
		else if (accessory == acc)
			return true;
		else
			return false;
	}
	
	public Item getType()
	{
		return item;
	}
}
