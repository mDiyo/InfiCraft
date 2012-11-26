package mDiyo.inficraft.infitools.base;

import net.minecraft.src.Block;
import net.minecraft.src.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class InfiFuelHandler  implements IFuelHandler
{

	@Override
	public int getBurnTime(ItemStack fuel) 
	{
        if (fuel.itemID == Block.cactus.blockID)
        {
            return 100;
        }
        if(fuel.itemID == mod_InfiBase.coalBit.shiftedIndex)
        {
        	return 600;
        }
        return 0;
	}

}
