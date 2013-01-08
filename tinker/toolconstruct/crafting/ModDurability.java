package tinker.toolconstruct.crafting;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

/* Adds an integer NBTTag */

public class ModDurability extends ToolMod
{
	int durability;
	float modifier;
	int miningLevel;
	
	public ModDurability(ItemStack[] items, int effect, int dur, float mod, int level)
	{
		super(items, effect);
		durability = dur;
		modifier = mod;
		miningLevel = level;
	}

	@Override
	public void modify (ItemStack[] input, ItemStack tool)
	{
		NBTTagCompound tags = tool.getTagCompound().getCompoundTag("InfiTool");
		
		int base = tags.getInteger("BaseDurability");
		int bonus = tags.getInteger("BonusDurability");
		float modDur = tags.getFloat("ModDurability");
		
		bonus += durability;
		modDur += modifier;
		
		int total = (int) ((base + bonus) * (modDur+1f));
		if (total <= 0)
			total = 1;
		
		tags.setInteger("TotalDurability", total);
		tags.setInteger("BonusDurability", bonus);
		tags.setFloat("ModDurability", modDur);
		
		int mLevel = tags.getInteger("HarvestLevel");
		if (mLevel < miningLevel)
			tags.setInteger("HarvestLevel", miningLevel);
		
		int modifiers = tags.getInteger("Modifiers");
		modifiers -= 1;
		tags.setInteger("Modifiers", modifiers);
	}

}
