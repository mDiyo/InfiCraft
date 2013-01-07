package inficraft.toolconstruct.crafting;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

/* IC2 support */

public class ModElectric extends ModBoolean
{	
	public ModElectric(ItemStack[] items)
	{
		super(items, 9, "Electric");
	}
	
	@Override
	public void modify (ItemStack tool)
	{
		NBTTagCompound tags = tool.getTagCompound();
		
		if (!tags.hasKey(key))
		{
			tags.setBoolean(key, true);
			
			int modifiers = tags.getCompoundTag("InfiTool").getInteger("Modifiers");
			modifiers -= 1;
			tags.getCompoundTag("InfiTool").setInteger("Modifiers", modifiers);
			tags.setInteger("charge", 0);
		}
	}
}
