package inficraft.toolconstruct;

import inficraft.toolconstruct.crafting.ToolBuilder;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TabTools extends CreativeTabs
{
	ItemStack display;
	
	public TabTools(String label) 
	{
		super(label);
	}
	
	public void init(ItemStack stack)
	{
		display = stack;
	}
	
	@SideOnly(Side.CLIENT)
    /*public int getTabIconItemIndex()
    {
		switch (index)
		{
		case 1: return ToolItems.pickaxeHead.shiftedIndex;
		case 2: return ToolItems.pickaxe.shiftedIndex;
		default: return Item.pickaxeSteel.shiftedIndex;
		}				
    }*/
	
	public ItemStack getIconItemStack()
    {
		return display;
    }
}