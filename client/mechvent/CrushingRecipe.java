package net.minecraft.src.mechvent;
import net.minecraft.src.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CrushingRecipe implements IRecipeReverse
{
    /** Is the ItemStack that you get when craft the recipe. */
    private final ItemStack recipeItem;

    /** Is a List of ItemStack that composes the recipe. */
    private final List recipeOutput;
    
    /** Is a list of the relative success chance of the recipe */
    private final int[] recipeChance;

    public CrushingRecipe(ItemStack input, List items)
    {
        this.recipeItem = input;
        this.recipeOutput = items;
        this.recipeChance = new int[recipeOutput.size()];
        for (int i = 0; i < recipeOutput.size(); i++)
        {
        	recipeChance[i] = 100;
        }
    }
    
    public CrushingRecipe(ItemStack input, List items, int[] chances)
    {
        this.recipeItem = input;
        this.recipeOutput = items;
        this.recipeChance = chances;
    }
    
    public ItemStack getRecipeInput() 
	{
		return recipeItem;
	}

    public List getRecipeOutput()
    {
    	ArrayList copyOutput = new ArrayList();
    	for (int i = 0; i < recipeOutput.size(); i++)
    	{
    		copyOutput.add( ((ItemStack)recipeOutput.get(i)).copy() );
    	}
        return copyOutput;
    }

	public int[] getRecipeChance()
	{
		return recipeChance;
	}
	
	public boolean isMatch(ItemStack itemstack)
	{
		if (itemstack != null)
        {
			if (itemstack.itemID == recipeItem.itemID && 
            	(recipeItem.getItemDamage() == -1 || itemstack.getItemDamage() == recipeItem.getItemDamage()) )
            {
				return true;
            }
        }
		return false;
	}
}
