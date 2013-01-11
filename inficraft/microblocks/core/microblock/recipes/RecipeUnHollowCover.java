package inficraft.microblocks.core.microblock.recipes;

import inficraft.microblocks.core.microblock.ItemMicroblock;
import inficraft.microblocks.core.microblock.MicroblockSystem;

import java.util.HashMap;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;

public class RecipeUnHollowCover implements IRecipe {
	
	private static HashMap<Integer, Integer> partIDMap = new HashMap<Integer, Integer>();
	
	public static void addMap(int a, int b)
	{
		partIDMap.put(a, b);
	}

	@Override
	public boolean matches(InventoryCrafting inventorycrafting, World world) {
		return getCraftingResult(inventorycrafting) != null;
	}

	@Override
	public ItemStack getCraftingResult(InventoryCrafting inventorycrafting) {
		int slot = -1;
		for(int k = 0; k < inventorycrafting.getSizeInventory(); k++)
		{
			ItemStack is = inventorycrafting.getStackInSlot(k);
			if(is == null || is.itemID != MicroblockSystem.microblockContainerBlock.blockID)
				continue;
			if(slot != -1)
				return null;
			slot = k;
		}
		if(slot == -1)
			return null;
		ItemStack is = inventorycrafting.getStackInSlot(slot);
		Integer o = partIDMap.get(ItemMicroblock.getPartID(is));
		if(o == null)
			return null;
		return ItemMicroblock.getStackWithPartID(o);
	}

	@Override
	public int getRecipeSize() {
		return 1;
	}

	@Override
	public ItemStack getRecipeOutput() {
		return new ItemStack(MicroblockSystem.microblockContainerBlock, 1, 0);
	}

}
