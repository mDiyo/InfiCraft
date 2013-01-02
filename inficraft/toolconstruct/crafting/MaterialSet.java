package inficraft.toolconstruct.crafting;

import net.minecraft.item.ItemStack;

public class MaterialSet
{
	public final ItemStack shard;
	public final ItemStack rod;
	public final int materialID;

	public MaterialSet(ItemStack s, ItemStack r, int id)
	{
		shard = s;
		rod = r;
		materialID = id;
	}
}
