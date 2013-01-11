package inficraft.microblocks.core.microblock.recipes;

import inficraft.microblocks.core.microblock.ItemMicroblock;
import inficraft.microblocks.core.microblock.MicroblockSystem;

import java.util.HashMap;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;

public class RecipeHollowCover implements IRecipe {
	
	private static HashMap<Integer, Integer> partIDMap = new HashMap<Integer, Integer>();
	
	public static void addMap(int a, int b)
	{
		partIDMap.put(a, b);
	}

	@Override
	public boolean matches(InventoryCrafting i, World world) {
		return getCraftingResult(i) != null;
	}

	@Override
	public ItemStack getCraftingResult(InventoryCrafting i) {
		if(i.getSizeInventory() != 9)
			return null;
		int inputPartID = -1;
		for(int k = 0; k < 9; k++)
		{
			ItemStack is = i.getStackInSlot(k);
			if(k == 4) {
				if(is != null)
					return null;
			} else if(is == null) {
				return null;
			} else if(is.itemID != MicroblockSystem.microblockContainerBlock.blockID) {
				return null;
			} else if(inputPartID == -1) {
				inputPartID = ItemMicroblock.getPartID(is);
			} else if(inputPartID != ItemMicroblock.getPartID(is)) {
				return null;
			}
		}
		Integer o = partIDMap.get(inputPartID);
		if(o == null) {
			return null;
		}
		ItemStack rv = ItemMicroblock.getStackWithPartID(o.intValue());
		rv.stackSize = 8;
		return rv;
	}

	@Override
	public int getRecipeSize() {
		return 3;
	}

	@Override
	public ItemStack getRecipeOutput() {
		return new ItemStack(MicroblockSystem.microblockContainerBlock, 1, 0);
	}

}
