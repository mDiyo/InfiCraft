package net.minecraft.src.superslopes;

import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemStack;
// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class ItemSlopes_Kaevator extends ItemBlock
{	
    public ItemSlopes_Kaevator(int i, String pItemMatName)
    {
        super(i);		
		itemMatName = pItemMatName;
        setMaxDamage(0);
        setHasSubtypes(true);
    } 	
	
    public int getMetadata(int i)
    {
        return i;
    }	
	
    public String getItemNameIS(ItemStack itemstack)
    {	
		return (new StringBuilder()).append("Kaev").append(itemMatName).append("Slopes").append(Kaevator_Materials[itemstack.getItemDamage()]).toString();		
    }

	public static final String Kaevator_Materials[] = {
        "StairsUp", "StairsUp", "StairsUp", "StairsUp",
		"SlopeDown", "SlopeDown", "SlopeDown", "SlopeDown", 
		"SlopeUp", "SlopeUp", "SlopeUp", "SlopeUp", 
		"SlopeSide", "SlopeSide", "SlopeSide", "SlopeSide"
    };		
	
	private String itemMatName;
}
