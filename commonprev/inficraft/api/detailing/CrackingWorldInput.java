package inficraft.api.detailing;
import java.util.ArrayList;
import java.util.List;

import net.minecraft.src.ItemStack;

/** This class is to be used when the mallet harvests a block like a pickaxe */
public class CrackingWorldInput implements IRecipeReverse
{
    /** Is the ItemStack that you get when craft the recipe. */
    private final ItemStack recipeItem;

    /** Is a List of ItemStack that composes the recipe. */
    private final List recipeOutput;
    public CrackingWorldInput(ItemStack input, List items)
    {
        this.recipeItem = input;
        this.recipeOutput = items;
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
		return new int[100];
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
