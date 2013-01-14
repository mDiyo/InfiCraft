package tinker.toolconstruct.modifiers;

import tinker.toolconstruct.crafting.ToolMod;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

/* Little mod for actually adding the lapis modifier */

public class ModLapisBase extends ToolMod
{
	String key;

	public ModLapisBase(ItemStack[] items, int effect)
	{
		super(items, effect);
		key = "Lapis";
	}

	@Override
	protected boolean canModify (ItemStack tool)
	{
		NBTTagCompound tags = tool.getTagCompound().getCompoundTag("InfiTool");
		if (!tags.hasKey(key))
			return tags.getInteger("Modifiers") > 0;

		return false;
	}

	@Override
	public void modify (ItemStack[] input, ItemStack tool)
	{
		NBTTagCompound tags = tool.getTagCompound().getCompoundTag("InfiTool");

		String modName = "\u00a79Lapis (0/100)";
		int tooltipIndex = addToolTip(tool, "\u00a79Fortune", modName);
		int[] keyPair = new int[] { 0, tooltipIndex };
		tags.setIntArray(key, keyPair);
	}
}
