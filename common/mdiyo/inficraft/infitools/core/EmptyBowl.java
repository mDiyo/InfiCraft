package mDiyo.inficraft.infitools.core;

import mDiyo.shared.items.InfiTexturedItem;
import net.minecraft.src.ItemStack;

public class EmptyBowl extends InfiTexturedItem
{
	public EmptyBowl(int i, String itemName) 
	{
		super(i, "/inficore/items.png", itemName);
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
}
