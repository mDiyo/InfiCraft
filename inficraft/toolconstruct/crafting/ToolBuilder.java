package inficraft.toolconstruct.crafting;

import inficraft.toolconstruct.EnumMaterial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class ToolBuilder
{
	// Item metadata = tool type
	public static ToolBuilder instance = new ToolBuilder();
	List<ToolRecipe> combos = new ArrayList<ToolRecipe>();

	/* Build tools */
	public void addToolRecipe (Item output, Item head)
	{
		addToolRecipe(output, head, null);
	}

	public void addToolRecipe (Item output, Item head, Item accessory)
	{
		combos.add(new ToolRecipe(head, accessory, output));
	}

	Item getMatchingItem (Item head, Item handle, Item accessory)
	{
		for (ToolRecipe recipe : combos)
		{
			if (recipe.validHead(head) && recipe.validHandle(handle) && recipe.validAccessory(accessory))
				return recipe.getType();
		}
		return null;
	}

	//Builds a tool from the parts given
	public ItemStack buildTool (ItemStack headItem, ItemStack handleItem, ItemStack accessoryItem, String name)
	{
		if (accessoryItem == null)
			return buildToolTwoParts(headItem, handleItem, name);
		return buildToolThreeParts(headItem, handleItem, accessoryItem, name);
	}

	public ItemStack buildToolTwoParts (ItemStack headItem, ItemStack handleItem, String name)
	{
		if (headItem == null || handleItem == null)
			return null;

		Item item = getMatchingItem(headItem.getItem(), handleItem.getItem(), null);
		if (item == null)
			return null;

		int head = headItem.getItemDamage();
		int handle = handleItem.getItemDamage();
		if (handleItem.getItem() == Item.bone)
			handle = 6;

		int maxDamage = (int) (EnumMaterial.durability(head) * EnumMaterial.handleDurability(handle));

		ItemStack tool = new ItemStack(item);
		NBTTagCompound compound = new NBTTagCompound();
		compound.setCompoundTag("InfiTool", new NBTTagCompound());
		compound.getCompoundTag("InfiTool").setInteger("Head", head);
		compound.getCompoundTag("InfiTool").setInteger("Handle", handle);

		compound.getCompoundTag("InfiTool").setInteger("Damage", 0);
		compound.getCompoundTag("InfiTool").setInteger("MaxDamage", maxDamage);
		compound.getCompoundTag("InfiTool").setBoolean("Broken", false);
		compound.getCompoundTag("InfiTool").setInteger("Attack", EnumMaterial.damage(head));

		compound.getCompoundTag("InfiTool").setInteger("Durability", buildDurability(head, handle, 0));
		compound.getCompoundTag("InfiTool").setFloat("Shoddy", buildShoddy(head, handle, 0));

		int modifiers = 3 + (head == 9 ? 2 : 0) + (handle == 9 ? 2 : 0);
		compound.getCompoundTag("InfiTool").setInteger("Modifiers", modifiers);

		tool.setTagCompound(compound);

		return tool;
	}

	public ItemStack buildToolThreeParts (ItemStack headItem, ItemStack handleItem, ItemStack accessoryItem, String name)
	{
		if (headItem == null || handleItem == null || accessoryItem == null)
			return null;

		Item item = getMatchingItem(headItem.getItem(), handleItem.getItem(), accessoryItem.getItem());
		if (item == null)
			return null;

		int head = headItem.getItemDamage();
		int handle = handleItem.getItemDamage();
		int accessory = accessoryItem.getItemDamage();
		if (handleItem.getItem() == Item.bone)
			handle = 6;

		int maxDamage = (int) (EnumMaterial.durability(head) * EnumMaterial.handleDurability(handle));

		ItemStack tool = new ItemStack(item);
		NBTTagCompound compound = new NBTTagCompound();
		compound.setCompoundTag("InfiTool", new NBTTagCompound());
		compound.getCompoundTag("InfiTool").setInteger("Head", head);
		compound.getCompoundTag("InfiTool").setInteger("Handle", handle);
		compound.getCompoundTag("InfiTool").setInteger("Accessory", accessory);

		compound.getCompoundTag("InfiTool").setInteger("Damage", 0);
		compound.getCompoundTag("InfiTool").setInteger("MaxDamage", maxDamage);
		compound.getCompoundTag("InfiTool").setBoolean("Broken", false);
		compound.getCompoundTag("InfiTool").setInteger("Attack", EnumMaterial.damage(head));

		compound.getCompoundTag("InfiTool").setInteger("Durability", buildDurability(head, handle, accessory));
		compound.getCompoundTag("InfiTool").setFloat("Shoddy", buildShoddy(head, handle, accessory));

		int modifiers = 3 + (head == 9 ? 2 : 0) + (handle == 9 ? 1 : 0) + (accessory == 9 ? 1 : 0);
		compound.getCompoundTag("InfiTool").setInteger("Modifiers", modifiers);

		if (name != "" && name != null)
		{
			compound.setCompoundTag("display", new NBTTagCompound());
			compound.getCompoundTag("display").setString("Name", "\u00A7f" + name);
		}

		tool.setTagCompound(compound);

		return tool;
	}

	int buildDurability (int head, int handle, int accessory)
	{
		int durability = 0;

		int dHead = EnumMaterial.unbreaking(head);
		int dHandle = EnumMaterial.unbreaking(handle);
		int dAccessory = 0;
		if (accessory != 0)
			dAccessory = EnumMaterial.unbreaking(accessory);

		if (dHead > durability)
			durability = dHead;
		if (dHandle > durability)
			durability = dHandle;
		if (dAccessory > durability)
			durability = dAccessory;

		return durability;
	}

	float buildShoddy (int head, int handle, int accessory)
	{
		float sHead = EnumMaterial.shoddy(head);
		float sHandle = EnumMaterial.shoddy(handle);
		if (accessory != 0)
		{
			float sAccessory = EnumMaterial.shoddy(accessory);
			return (sHead + sHandle + sAccessory) / 3f;
		}
		return (sHead + sHandle) / 2f;
	}
}
