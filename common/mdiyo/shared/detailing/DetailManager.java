package mDiyo.shared.detailing;

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

public class DetailManager {
	
	private static final DetailManager instance = new DetailManager();
	private List detailing;
	private List breaking;
	public static HashSet damageOnCraft = new HashSet();
	public static HashMap damageContainer = new HashMap();
	
	public static final DetailManager getInstance()
    {
        return instance;
    }
	
	private DetailManager()
	{
		detailing = new ArrayList();
		breaking = new ArrayList();
	}
	
	public void addDetailing(DetailInput detailinput)
	{
		detailing.add(detailinput);
		for (Object stack : damageOnCraft)
		{
			if (stack instanceof ItemStack)
			{
				GameRegistry.addShapelessRecipe(new ItemStack(detailinput.getReplacementID(), 1, detailinput.getReplacementMetadata()), 
					new Object[] { stack, new ItemStack(detailinput.getBlockID(), 1, detailinput.getMetadata()) });
			}
		}
	}
	
	public boolean detail(World world, int x, int y, int z, int bID, int md)
	{
		boolean carved = false;
		for(int i = 0; i < detailing.size(); i++)
		{
			DetailInput detail = (DetailInput)detailing.get(i);
			if(bID == detail.getBlockID() && md == detail.getMetadata() && !carved) {
				world.setBlockAndMetadataWithNotify(
						x, y, z, detail.getReplacementID(), detail.getReplacementMetadata() );
				carved = true;
			}
		}
		return carved;
	}
	
	public void addDetailingItem(Item item)
	{
		damageOnCraft.add(Integer.valueOf(item.shiftedIndex));
		for(int i = 0; i < detailing.size(); i++)
		{
			DetailInput detail = (DetailInput)detailing.get(i);
			GameRegistry.addShapelessRecipe(new ItemStack(detail.getReplacementID(), 1, detail.getReplacementMetadata()), 
				new Object[] { new ItemStack(item), new ItemStack(detail.getBlockID(), 1, detail.getMetadata()) });
		}
	}

	public void addDetailingContainer(Item item, Item item1)
	{
		damageOnCraft.add(Integer.valueOf(item.shiftedIndex));
		damageContainer.put(Integer.valueOf(item.shiftedIndex), Integer.valueOf(item1.shiftedIndex));
		for(int i = 0; i < detailing.size(); i++)
		{
			DetailInput detail = (DetailInput)detailing.get(i);
			GameRegistry.addShapelessRecipe(new ItemStack(detail.getReplacementID(), 1, detail.getReplacementMetadata()), 
				new Object[] { new ItemStack(item), new ItemStack(detail.getBlockID(), 1, detail.getMetadata()) });
		}
	}
	
	/* Conveinence functions */
	public void addDetailing(Block block, int md, Block blockOut, int mdOut)
	{
		addDetailing(new DetailInput(block.blockID, md, blockOut.blockID, mdOut));
	}
	
	public void addDetailing(int bID, int md, int bIDout, int mdOut)
	{
		addDetailing(new DetailInput(bID, md, bIDout, mdOut));
	}
	
	public void addDetailing(Block block, Block blockOut)
	{
		addDetailing(new DetailInput(block.blockID, 0, blockOut.blockID, 0));
	}
	
	public void addDetailing(Block block, Block blockOut, int mdOut)
	{
		addDetailing(new DetailInput(block.blockID, 0, blockOut.blockID, mdOut));
	}
}
