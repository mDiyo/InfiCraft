package tinker.toolconstruct.crafting;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class ModRedstone extends ToolMod
{
	String key;
	int increase;
	int max;

	public ModRedstone(ItemStack[] items, int effect, int inc, int maximum)
	{
		super(items, effect);
		key = "Redstone";
		increase = inc;
		max = maximum;
	}

	@Override
	protected boolean canModify (ItemStack tool)
	{
		NBTTagCompound tags = tool.getTagCompound().getCompoundTag("InfiTool");
		if (!tags.hasKey(key))
			return tags.getInteger("Modifiers") > 0;

		int keyPair[] = tags.getIntArray(key);
		if (keyPair[0] + increase <= max)
			return true;

		else if (keyPair[0] == max)
			return tags.getInteger("Modifiers") > 0;

		else
			return false;

	}

	@Override
	public void modify (ItemStack[] input, ItemStack tool)
	{
		NBTTagCompound tags = tool.getTagCompound().getCompoundTag("InfiTool");
		if (tags.hasKey(key))
		{
			int[] keyPair = tags.getIntArray(key);
			if (keyPair[0] == max)
			{
				keyPair[0] += increase;
				keyPair[1] += max;
				tags.setIntArray(key, keyPair);
				
				int modifiers = tags.getInteger("Modifiers");
				modifiers -= 1;
				tags.setInteger("Modifiers", modifiers);
			}
			else
			{
				keyPair[0] += increase;
				tags.setIntArray(key, keyPair);
			}
		}
		else
		{
			int[] keyPair = new int[] { increase, max };
			tags.setIntArray(key, keyPair);
			int modifiers = tags.getInteger("Modifiers");
			modifiers -= 1;
			tags.setInteger("Modifiers", modifiers);
		}
		
		float miningSpeed = tags.getFloat("MiningSpeed");
		miningSpeed += (increase * 0.1f);
		tags.setFloat("MiningSpeed", miningSpeed);
	}
}
