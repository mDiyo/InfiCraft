package net.minecraft.src.inficore;

import net.minecraft.src.*;
import net.minecraft.src.forge.MinecraftForge;

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
}
