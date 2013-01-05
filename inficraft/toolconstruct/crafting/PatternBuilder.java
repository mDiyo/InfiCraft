package inficraft.toolconstruct.crafting;

import inficraft.toolconstruct.ToolItems;
import inficraft.toolconstruct.items.Pattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class PatternBuilder
{
	public static PatternBuilder instance = new PatternBuilder();
	//Map items to their parts with a hashmap
	List<ItemKey> materials = new ArrayList<ItemKey>();
	HashMap materialParts = new HashMap<String, MaterialSet>();
	
	//We could use IRecipe if it wasn't tied to InventoryCrafting
	List<PatternKey> toolPatterns = new ArrayList<PatternKey>();

	/* Register methods */
	public void registerMaterial (ItemStack material, int value, String key)
	{
		materials.add(new ItemKey(material.getItem(), material.getItemDamage(), value, key));
	}

	public void registerMaterialSet (String key, ItemStack shard, ItemStack rod, int materialID)
	{
		materialParts.put(key, new MaterialSet(shard, rod, materialID));
		materials.add(new ItemKey(shard.getItem(), shard.getItemDamage(), 1, key));
	}
	
	// 1 + 2 = EVERYTHING
	public void registerFullMaterial (ItemStack material, int value, String key, ItemStack shard, ItemStack rod, int materialID)
	{
		materials.add(new ItemKey(material.getItem(), material.getItemDamage(), value, key));
		materials.add(new ItemKey(shard.getItem(), shard.getItemDamage(), 1, key));
		materialParts.put(key, new MaterialSet(shard, rod, materialID));
	}

	public void addToolPattern (ItemStack pattern, Item toolPart)
	{
		toolPatterns.add(new PatternKey(pattern.getItem(), pattern.getItemDamage(), toolPart));
	}

	/* Build tool parts from patterns */
	public ItemStack[] getToolPart (ItemStack material, ItemStack pattern, ItemStack otherPattern)
	{
		if (material != null && pattern != null)
		{
			ItemKey key = getMaterialSet(material);
			Item toolPart = getMatchingPattern(pattern);
			
			if (key != null && toolPart != null)
			{
				MaterialSet mat = (MaterialSet) materialParts.get(key.key);
				int patternValue = ((Pattern)pattern.getItem()).getPatternCost(pattern.getItemDamage());
				
				if ( patternValue < key.value )
				{
					if (otherPattern != null)
					{
						int otherValue = ((Pattern)otherPattern.getItem()).getPatternCost(otherPattern.getItemDamage());
						if (patternValue + otherValue <= key.value)
						{
							Item otherPart = getMatchingPattern(otherPattern);
							return new ItemStack[] { new ItemStack(toolPart, 1, mat.materialID), new ItemStack(otherPart, 1, mat.materialID) }; //Material + Material
						}
					}
					return new ItemStack[] { new ItemStack(toolPart, 1, mat.materialID), mat.shard.copy() }; //Material + Shard, copy to avoid weirdness with the itemstack reference
				}
				
				else if ( patternValue == key.value )
					return new ItemStack[] { new ItemStack(toolPart, 1, mat.materialID), null }; //Material only
				
				else
					return null; //Not a valid match
			}			
		}
		return null;
	}
	
	public ItemKey getMaterialSet (ItemStack material)
	{
		Item mat = material.getItem();
		int damage = material.getItemDamage();
		for (ItemKey ik : materials)
		{
			if ( mat == ik.item && (ik.damage == -1 || damage == ik.damage))
				return ik;
		}
		return null;
	}
	
	public Item getMatchingPattern (ItemStack pattern)
	{
		Item pat = pattern.getItem();
		int damage = pattern.getItemDamage();
		for (PatternKey pk : toolPatterns)
		{
			if (pat == pk.item && (pk.damage == -1 || damage == pk.damage))
				return pk.output;
		}
		return null;
	}
	
	//Small data classes. I would prefer the struct from C#, but we do what we can.
	public class ItemKey
	{
		public final Item item;
		public final int damage;
		public final int value;
		public final String key;
		public ItemKey(Item i, int d, int v, String s)
		{
			item = i;
			damage = d;
			value = v;
			key = s;
		}
	}
	
	public class PatternKey
	{
		public final Item item;
		public final int damage;
		public final Item output;
		public PatternKey(Item i, int d, Item o)
		{
			item = i;
			damage = d;
			output = o;
		}
	}
	
	//Helper Methods
	public void registerMaterial (Block material, int value, String key) { registerMaterial(new ItemStack(material, 1, -1), value, key); }
	public void registerMaterial (Item material, int value, String key) { registerMaterial(new ItemStack(material, 1, -1), value, key); }
	
	public void registerFullMaterial (Block material, int value, String key, ItemStack shard, ItemStack rod, int materialID)
	{ registerFullMaterial(new ItemStack(material, 1, -1), value, key, shard, rod, materialID); }
	public void registerFullMaterial (Item material, int value, String key, ItemStack shard, ItemStack rod, int materialID)
	{ registerFullMaterial(new ItemStack(material, 1, -1), value, key, shard, rod, materialID); }
	public void registerFullMaterial (Block material, int value, String key, int materialID)
	{ registerFullMaterial(new ItemStack(material, 1, -1), value, key, new ItemStack(ToolItems.toolShard, 1, materialID), new ItemStack(ToolItems.toolRod, 1, materialID), materialID); }
	public void registerFullMaterial (Item material, int value, String key, int materialID)
	{ registerFullMaterial(new ItemStack(material, 1, -1), value, key, new ItemStack(ToolItems.toolShard, 1, materialID), new ItemStack(ToolItems.toolRod, 1, materialID), materialID); }
}