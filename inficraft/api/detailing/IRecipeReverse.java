package inficraft.api.detailing;
import java.util.List;

import net.minecraft.item.ItemStack;

public interface IRecipeReverse
{
	ItemStack getRecipeInput();
	
    List getRecipeOutput();
    
    int[] getRecipeChance();
    
    boolean isMatch(ItemStack itemstack);
}
