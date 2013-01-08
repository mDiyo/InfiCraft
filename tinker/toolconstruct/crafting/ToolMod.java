package tinker.toolconstruct.crafting;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public abstract class ToolMod
{
	// The ItemStacks used to compare against
	ItemStack[] stacks;
	int effectIndex; //255 is always blank

	public ToolMod(ItemStack[] items, int effect)
	{
		stacks = items;
		effectIndex = effect;
	}

	/** Checks to see if the inputs match the stored items
	 * 
	 * @param input The ItemStacks to compare against
	 * @param tool Item to modify, used for restrictions
	 * @return Whether the recipe matches the input
	 */
	public boolean matches (ItemStack[] input, ItemStack tool)
	{
		int matchingItems = 0;
		for (int iIter = 0; iIter < input.length; iIter++)
		{
			for (int sIter = 0; sIter < stacks.length; sIter++)
			{
				if (input[iIter] != null && stacks[sIter].isItemEqual(input[iIter]))
					matchingItems += 1;
			}
		}

		return (matchingItems == stacks.length) && canModify(tool);
	}
	
	/**
	 * 
	 * @param tool Tool to compare against
	 * @return Whether the tool can be modified
	 */

	protected boolean canModify (ItemStack tool)
	{
		NBTTagCompound tags = tool.getTagCompound().getCompoundTag("InfiTool");
		return tags.getInteger("Modifiers") > 0;
	}

	public int itemsRequired ()
	{
		return stacks.length;
	}

	/** Modifies the tool. Adds nbttags, changes existing ones, ticks down modification counter, etc
	 * 
	 * @param tool The tool to modify
	 */
	public abstract void modify (ItemStack[] input, ItemStack tool);
	
	protected void addMatchingEffect (ItemStack tool)
	{
		NBTTagCompound tags = tool.getTagCompound().getCompoundTag("InfiTool");
		if (tags.hasKey("Effect3"))
			return;

		else if (tags.hasKey("Effect2"))
		{
			tags.setInteger("Effect3", effectIndex);
			System.out.println("Adding an effect3");
		}
		else if (tags.hasKey("Effect1"))
		{
			tags.setInteger("Effect2", effectIndex);
			System.out.println("Adding an effect2");
		}
		else
		{
			tags.setInteger("Effect1", effectIndex);
			System.out.println("Adding an effect1");
		}
	}
}
