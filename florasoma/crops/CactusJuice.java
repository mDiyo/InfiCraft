package florasoma.crops;

import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class CactusJuice extends ItemFood
{
    public CactusJuice(int i, int j, boolean flag, int k)
    {
        super(i, j, flag);
        maxStackSize = 64;
    }

    public String getTextureFile()
    {
        return FloraCrops.cropTexture;
    }
    
    public int getMaxItemUseDuration(ItemStack itemstack)
    {
        return 12;
    }
}
