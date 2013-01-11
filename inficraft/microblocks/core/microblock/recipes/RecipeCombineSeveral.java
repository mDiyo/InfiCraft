package inficraft.microblocks.core.microblock.recipes;

import inficraft.microblocks.core.microblock.ItemMicroblock;
import inficraft.microblocks.core.microblock.MicroblockSystem;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;

public class RecipeCombineSeveral implements IRecipe {

	private static Map<Integer, ItemStack> fullMap = new HashMap<Integer, ItemStack>();
	
	public static void addMap(int damage, ItemStack full) {
		if((damage & 7) != 0)
			throw new IllegalArgumentException("Lower 3 bits must be 0");
		fullMap.put(damage, full);
	}

	@Override
	public boolean matches(InventoryCrafting var1, World var2) {
		return getCraftingResult(var1) != null;
	}

	@Override
	public ItemStack getCraftingResult(InventoryCrafting var1) {
		int type = -1, total = 0;
		for(int k = 0; k < var1.getSizeInventory(); k++) {
			ItemStack is = var1.getStackInSlot(k);
			
			if(is == null)
				continue;
			
			if(is.itemID != MicroblockSystem.microblockContainerBlock.blockID)
				return null;
			
			int thisType = ItemMicroblock.getPartID(is) & ~7;
			if(type == -1)
				type = thisType;
			else if(type != thisType)
				return null;
			
			total += (ItemMicroblock.getPartID(is) & 7) + 1;
		}
		
		if(total == 0 || total > 8 || !fullMap.containsKey(type))
			return null;
		
		if(total == 8)
			return ItemStack.copyItemStack(fullMap.get(type));
		else
			return new ItemStack(MicroblockSystem.microblockContainerBlock.blockID, 1, type | (total - 1));
	}

	@Override
	public int getRecipeSize() {
		return 4;
	}

	@Override
	public ItemStack getRecipeOutput() {
		return new ItemStack(MicroblockSystem.microblockContainerBlock, 1, 0);
	}

}
