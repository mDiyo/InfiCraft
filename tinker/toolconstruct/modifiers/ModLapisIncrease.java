package tinker.toolconstruct.modifiers;

import tinker.toolconstruct.crafting.ToolMod;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class ModLapisIncrease extends ToolMod
{
	String key;
	int increase;

	public ModLapisIncrease(ItemStack[] items, int effect, int inc)
	{
		super(items, effect);
		key = "Lapis";
		increase = inc;
	}

	@Override
	protected boolean canModify (ItemStack tool)
	{
		NBTTagCompound tags = tool.getTagCompound().getCompoundTag("InfiTool");
		if (!tags.hasKey(key))
			return false;

		int keyPair[] = tags.getIntArray(key);
		
		if (keyPair[0] + increase <= 100)
			return true;
		else
			return false;

	}

	@Override
	public void modify (ItemStack[] input, ItemStack tool)
	{
		NBTTagCompound tags = tool.getTagCompound().getCompoundTag("InfiTool");
		int keyPair[] = tags.getIntArray(key);
		keyPair[0] += increase;
		tags.setIntArray(key, keyPair);
		if (keyPair[0] >= 100)
			tool.addEnchantment(Enchantment.fortune, 3);
		else if (keyPair[0] >= 40)
			tool.addEnchantment(Enchantment.fortune, 2);
		else if (keyPair[0] >= 10)
			tool.addEnchantment(Enchantment.fortune, 1);
	}
	
	void updateModTag (ItemStack tool, int[] keys)
	{
		NBTTagCompound tags = tool.getTagCompound().getCompoundTag("InfiTool");
		String tip = "ModifierTip"+keys[1];
		String modName = "\u00a79Lapis ("+keys[0]+"/100)";
		tags.setString(tip, modName);
	}
}
