package tinker.toolconstruct.modifiers;

import java.util.*;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

/* IC2 support */

public class ModElectric extends ModBoolean
{	
	public ArrayList<ItemStack> circuits = new ArrayList<ItemStack>();
	public ArrayList<ItemStack> batteries = new ArrayList<ItemStack>();
	
	public ModElectric()
	{
		super(null, 9, "Electric");
	}
	
	@Override
	public boolean matches (ItemStack[] input, ItemStack tool)
	{
		if (input[0] == null || input[1] == null)
			return false;
		
		boolean circuit = false;
		boolean battery = false;
		
		for (ItemStack stack : circuits)
		{
			if (stack.isItemEqual(input[0]) || stack.isItemEqual(input[1]))
				circuit = true;
		}
		
		for (ItemStack stack : batteries)
		{
			if (stack.isItemEqual(input[0]) || stack.isItemEqual(input[1]))
				battery = true;
		}
		return circuit && battery && canModify(tool);
	}
	
	@Override
	public void modify (ItemStack[] input, ItemStack tool)
	{
		NBTTagCompound tags = tool.getTagCompound();
		
		if (!tags.hasKey(key))
		{
			tags.setBoolean(key, true);
			
			int modifiers = tags.getCompoundTag("InfiTool").getInteger("Modifiers");
			modifiers -= 1;
			tags.getCompoundTag("InfiTool").setInteger("Modifiers", modifiers);
			tags.setInteger("charge", 0);
			tags.setDouble("electricity", 0);
		}
	}
}
