package mDiyo.api.detailing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;

public class DetailManager
{
	private static final DetailManager instance = new DetailManager();
	private List detailing; //Chisel
	private List cracking; //Right-click, mallet
	private List crushing; //Left-click, mallet
	private List drilling; //Drills, stone -> cobblestone
	public static HashSet damageOnCraft = new HashSet();
	public static HashMap damageContainer = new HashMap();

	public static final DetailManager getInstance()
	{
		return instance;
	}

	private DetailManager()
	{
		detailing = new ArrayList();
		cracking = new ArrayList();
		crushing = new ArrayList();
		drilling = new ArrayList();
	}

	public static void addCracking(DetailInput detailinput)
	{
		DetailManager dm = getInstance();
		dm.cracking.add(detailinput);
	}
	
	public static void addDrilling(DetailInput detailinput)
	{
		DetailManager dm = getInstance();
		dm.drilling.add(detailinput);
	}

	public static void addDetailing(DetailInput detailinput)
	{
		DetailManager dm = getInstance();
		dm.detailing.add(detailinput);
		for (Object id : damageOnCraft)
		{
			GameRegistry.addShapelessRecipe(new ItemStack(detailinput.getReplacementID(), 1, detailinput.getReplacementMetadata()), 
					new ItemStack(((Integer) id).intValue(), 1, -1), new ItemStack(detailinput.getBlockID(), 1, detailinput.getMetadata()));
		}
	}

	public boolean detail(World world, int x, int y, int z, int blockID, int meta)
	{
		return performDetailing(world, x, y, z, blockID, meta, 1);
	}

	public boolean crack(World world, int x, int y, int z, int blockID, int meta)
	{
		return performDetailing(world, x, y, z, blockID, meta, 2);
	}
	
	public boolean drill(World world, int x, int y, int z, int blockID, int meta)
	{
		return performDetailing(world, x, y, z, blockID, meta, 3);
	}
	
	boolean performDetailing(World world, int x, int y, int z, int bID, int md, int type)
	{
		boolean detailed = false;
		List details;
		switch (type)
		{
		case 1: details = detailing; break;
		case 2: details = cracking; break;
		case 3: details = drilling; break;
		default: return false;
		}
		for (int i = 0; i < details.size(); i++)
		{
			DetailInput detail = (DetailInput) details.get(i);
			if (bID == detail.getBlockID() && md == detail.getMetadata() && !detailed)
			{
				world.setBlockAndMetadataWithNotify(x, y, z, detail.getReplacementID(), detail.getReplacementMetadata());
				detailed = true;
			}
		}
		return detailed;
	}

	public void addDetailingItem(Item item)
	{
		damageOnCraft.add(Integer.valueOf(item.shiftedIndex));
		for (int i = 0; i < detailing.size(); i++)
		{
			DetailInput detail = (DetailInput) detailing.get(i);
			GameRegistry.addShapelessRecipe(new ItemStack(detail.getReplacementID(), 1, detail.getReplacementMetadata()), new Object[] { new ItemStack(item), new ItemStack(detail.getBlockID(), 1, detail.getMetadata()) });
		}
	}

	public void addDetailingContainer(Item item, Item item1)
	{
		damageOnCraft.add(Integer.valueOf(item.shiftedIndex));
		damageContainer.put(Integer.valueOf(item.shiftedIndex), Integer.valueOf(item1.shiftedIndex));
		for (int i = 0; i < detailing.size(); i++)
		{
			DetailInput detail = (DetailInput) detailing.get(i);
			GameRegistry.addShapelessRecipe(new ItemStack(detail.getReplacementID(), 1, detail.getReplacementMetadata()), new Object[] { new ItemStack(item), new ItemStack(detail.getBlockID(), 1, detail.getMetadata()) });
		}
	}
	
	public void addCrushRecipe(ItemStack input, Object... items)
	{
		ArrayList output = new ArrayList();
		Object[] itemarray = items;
		int var5 = items.length;

		for (int iter = 0; iter < var5; ++iter)
		{
			Object recipeOutput = itemarray[iter];

			if (recipeOutput instanceof ItemStack)
			{
				output.add(((ItemStack) recipeOutput).copy());
			} else if (recipeOutput instanceof Item)
			{
				output.add(new ItemStack((Item) recipeOutput));
			} else
			{
				if (!(recipeOutput instanceof Block))
				{
					throw new RuntimeException("Invalid Crusher recipe!");
				}

				output.add(new ItemStack((Block) recipeOutput));
			}
		}

		this.crushing.add(new CrackingWorldInput(input, output));
	}

	public List findMatchingCrushRecipe(ItemStack stack)
	{
		for (int i = 0; i < this.crushing.size(); ++i)
		{
			IRecipeReverse irecipe = (IRecipeReverse) this.crushing.get(i);

			if (irecipe.isMatch(stack))
			{
				return irecipe.getRecipeOutput();
			}
		}
		return null;
	}

	/* Conveinence functions */
	
	//Chisel
	public static void addDetailing(Block block, int md, Block blockOut, int mdOut)
	{
		addDetailing(new DetailInput(block.blockID, md, blockOut.blockID, mdOut));
	}

	public static void addDetailing(int bID, int md, int bIDout, int mdOut)
	{
		addDetailing(new DetailInput(bID, md, bIDout, mdOut));
	}

	public static void addDetailing(Block block, Block blockOut)
	{
		addDetailing(new DetailInput(block.blockID, 0, blockOut.blockID, 0));
	}

	public static void addDetailing(Block block, Block blockOut, int mdOut)
	{
		addDetailing(new DetailInput(block.blockID, 0, blockOut.blockID, mdOut));
	}

	//Mallet
	public static void addCracking(Block block, int md, Block blockOut, int mdOut)
	{
		addCracking(new DetailInput(block.blockID, md, blockOut.blockID, mdOut));
	}

	public static void addCracking(int bID, int md, int bIDout, int mdOut)
	{
		addCracking(new DetailInput(bID, md, bIDout, mdOut));
	}

	public static void addCracking(Block block, Block blockOut)
	{
		addCracking(new DetailInput(block.blockID, 0, blockOut.blockID, 0));
	}

	public static void addCracking(Block block, Block blockOut, int mdOut)
	{
		addCracking(new DetailInput(block.blockID, 0, blockOut.blockID, mdOut));
	}
	
	//Drill
	public static void addDrilling(Block block, int md, Block blockOut, int mdOut)
	{
		addDrilling(new DetailInput(block.blockID, md, blockOut.blockID, mdOut));
	}

	public static void addDrilling(int bID, int md, int bIDout, int mdOut)
	{
		addDrilling(new DetailInput(bID, md, bIDout, mdOut));
	}

	public static void addDrilling(Block block, Block blockOut)
	{
		addDrilling(new DetailInput(block.blockID, 0, blockOut.blockID, 0));
	}

	public static void addDrilling(Block block, Block blockOut, int mdOut)
	{
		addDrilling(new DetailInput(block.blockID, 0, blockOut.blockID, mdOut));
	}
}
