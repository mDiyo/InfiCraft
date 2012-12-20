package inficraft.infitools.items;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Pattern extends CraftingItem
{

	public Pattern(int id, int icon, String tex)
	{
		super(id, icon, tex);
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		this.setContainerItem(this);
		this.setMaxStackSize(1);
	}

	public String getItemNameIS(ItemStack stack)
	{
		int arr = MathHelper.clamp_int(stack.getItemDamage(), 0, 11);
		return super.getItemName() + "." + patternName[arr];
	}

	public static final String[] patternName = new String[] { 
		"blank", "rod", "guard", "blade", "pickaxe", "axe", "shovel", "iceaxe", "machete", "hammer", "mattock", "scythe"
	};
	
	public void getSubItems(int id, CreativeTabs tab, List list)
    {
		System.out.println("Adding new patterns");
		for (int i = 0; i < 12; i++)
			list.add(new ItemStack(id, 1, i));
    }
	
	public ItemStack getContainerItemStack(ItemStack stack)
    {
    	return stack;
    }
	
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack stack)
    {
        return false;
    }
}
