package mDiyo.inficraft.infitools.core;

import java.util.List;

import mDiyo.shared.items.InfiTexturedItem;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemStack;

public class EmptyBowl extends InfiTexturedItem
{
	public EmptyBowl(int i, String itemName) 
	{
		super(i, InfiCore.itemTexture, itemName);
	}
	
	public int getIconFromDamage(int meta)
    {
        return this.iconIndex + meta;
    }
	
	public static final String blockType[] =
    {
        "stone", "iron", "gold", "netherrack", "slime", "cactus", "glass", "obsidian"
    };

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("CustomBowl").toString();
    }
    
    public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        for (int var4 = 0; var4 < 7; ++var4)
        {
            par3List.add(new ItemStack(par1, 1, var4));
        }
    }
}
