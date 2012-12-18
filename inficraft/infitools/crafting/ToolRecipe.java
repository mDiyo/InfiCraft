package inficraft.infitools.crafting;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/*
 * Small class for checking if a particular tool combination is this one
 */

public class ToolRecipe
{
	Item head;
	Item accessory;
	String type;
	
	public ToolRecipe(Item h, Item acc, String t)
	{
		head = h;
		accessory = acc;
		type = t;
	}
	
	public boolean isValidHead(Item item)
	{
		if (head == item)
			return true;
		else
			return false;
	}
	
	public boolean isValidAccessory(Item item)
	{
		if (accessory == null && item == null)
			return true;
		else if (accessory == item)
			return true;
		else
			return false;
	}
	
	public String getType()
	{
		return type;
	}
}
