package mDiyo.api.detailing;
import net.minecraft.src.ItemStack;
import java.util.List;

public interface IRecipeReverse
{
	ItemStack getRecipeInput();
	
    List getRecipeOutput();
    
    int[] getRecipeChance();
    
    boolean isMatch(ItemStack itemstack);
}
