package net.minecraft.src.mechvent;
import net.minecraft.src.ItemStack;
import java.util.List;

public interface IRecipeReverse
{
	ItemStack getRecipeInput();
	
    List getRecipeOutput();
    
    int[] getRecipeChance();
    
    boolean isMatch(ItemStack itemstack);
}
