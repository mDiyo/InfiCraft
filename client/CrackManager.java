package net.minecraft.src;
import net.minecraft.src.*;

import java.util.*;

public class CrackManager {
	
	private static final CrackManager instance = new CrackManager();
	private List cracking; //Right-click
	private List crushing; //Left-click
	
	public static final CrackManager getInstance()
    {
        return instance;
    }
	
	private CrackManager()
	{
		cracking = new ArrayList();
		crushing = new ArrayList();
		initDetails();
	}
	
	public void addCracking(DetailInput detailinput)
	{
		cracking.add(detailinput);
	}
	
	public boolean crack(World world, int x, int y, int z, int bID, int md)
	{
		boolean cracked = false;
		for(int i = 0; i < cracking.size(); i++)
		{
			DetailInput detail = (DetailInput)cracking.get(i);
			if(bID == detail.getBlockID() && md == detail.getMetadata() && !cracked) {
				world.setBlockAndMetadataWithNotify(
						x, y, z, detail.getReplacementID(), detail.getReplacementMetadata() );
				cracked = true;
			}
		}
		return cracked;
	}
	
	public void addCracking(Block block, int md, Block blockOut, int mdOut)
	{
		addCracking(new DetailInput(block.blockID, md, blockOut.blockID, mdOut));
	}
	
	public void addCracking(int bID, int md, int bIDout, int mdOut)
	{
		addCracking(new DetailInput(bID, md, bIDout, mdOut));
	}
	
	public void addCracking(Block block, Block blockOut)
	{
		addCracking(new DetailInput(block.blockID, 0, blockOut.blockID, 0));
	}
	
	public void addCracking(Block block, Block blockOut, int mdOut)
	{
		addCracking(new DetailInput(block.blockID, 0, blockOut.blockID, mdOut));
	}
	
	private void initDetails()
	{
		/*addCracking(Block.stone, Block.stoneBrick); //Stone
		addCracking(Block.stoneBrick, mod_InfiBlocks.brick, 9);
		addCracking(mod_InfiBlocks.brick, 9, mod_InfiBlocks.fancyBrick, 9);
		addCracking(mod_InfiBlocks.fancyBrick, 9, Block.stoneBrick, 3);
		
		addCracking(Block.obsidian, mod_InfiBlocks.brick, 0); //Obsidian
		addCracking(mod_InfiBlocks.brick, 0, mod_InfiBlocks.fancyBrick, 0);
		
		addCracking(Block.blockSnow, mod_InfiBlocks.brick, 1); //Snow
		addCracking(mod_InfiBlocks.brick, 1, mod_InfiBlocks.fancyBrick, 1);
		
		addCracking(mod_InfiBlocks.storageBlock, 13, mod_InfiBlocks.brick, 2); //Sandstone
		addCracking(mod_InfiBlocks.brick, 2, mod_InfiBlocks.fancyBrick, 2);
		
		addCracking(mod_InfiBlocks.storageBlock, 15, mod_InfiBlocks.brick, 11); //Brick
		addCracking(mod_InfiBlocks.brick, 11, mod_InfiBlocks.brick, 3);
		addCracking(mod_InfiBlocks.brick, 3, mod_InfiBlocks.fancyBrick, 3);
		addCracking(mod_InfiBlocks.fancyBrick, 3, mod_InfiBlocks.fancyBrick, 11);
		
		addCracking(mod_InfiBlocks.storageBlock, 12, mod_InfiBlocks.brick, 4); //Netherrack
		addCracking(mod_InfiBlocks.brick, 4, mod_InfiBlocks.fancyBrick, 4);
		
		addCracking(mod_InfiBlocks.brick, 5, mod_InfiBlocks.fancyBrick, 5); //Diamond
		addCracking(mod_InfiBlocks.brick, 6, mod_InfiBlocks.fancyBrick, 6); //Gold
		addCracking(mod_InfiBlocks.brick, 7, mod_InfiBlocks.fancyBrick, 7); //Lapis
		
		addCracking(mod_InfiBlocks.storageBlock, 14, mod_InfiBlocks.brick, 8); //Refined Stone
		addCracking(mod_InfiBlocks.brick, 8, mod_InfiBlocks.brick, 10);
		addCracking(mod_InfiBlocks.brick, 10, mod_InfiBlocks.fancyBrick, 8);
		
		addCracking(Block.ice, 0, mod_InfiBlocks.iceBrick, 0); //Ice
		addCracking(mod_InfiBlocks.iceBrick, 0, mod_InfiBlocks.iceBrick, 1);
		addCracking(mod_InfiBlocks.iceBrick, 1, mod_InfiBlocks.iceBrick, 2);
		
		addCracking(mod_InfiBlocks.brownstone, 0, mod_InfiBlocks.brownstone, 2); //Brownstone
		addCracking(mod_InfiBlocks.brownstone, 1, mod_InfiBlocks.brownstone, 3);
		addCracking(mod_InfiBlocks.brownstone, 3, mod_InfiBlocks.brownstone, 4);
		addCracking(mod_InfiBlocks.brownstone, 4, mod_InfiBlocks.brownstone, 5);*/
	}
	
	public void addCrushing(ItemStack input, Object ... items)
    {
        ArrayList output = new ArrayList();
        Object[] itemarray = items;
        int var5 = items.length;

        for (int iter = 0; iter < var5; ++iter)
        {
            Object recipeOutput = itemarray[iter];

            if (recipeOutput instanceof ItemStack)
            {
                output.add(((ItemStack)recipeOutput).copy());
            }
            else if (recipeOutput instanceof Item)
            {
                output.add(new ItemStack((Item)recipeOutput));
            }
            else
            {
                if (!(recipeOutput instanceof Block))
                {
                    throw new RuntimeException("Invalid Crusher recipe!");
                }

                output.add(new ItemStack((Block)recipeOutput));
            }
        }

        this.crushing.add(new CrackingWorldInput(input, output));
    }

    public List findMatchingCrusherRecipe(ItemStack stack)
    {
    	for (int i = 0; i < this.crushing.size(); ++i)
        {
            IRecipeReverse irecipe = (IRecipeReverse)this.crushing.get(i);

            if (irecipe.isMatch(stack))
            {
                return irecipe.getRecipeOutput();
            }
        }
    	return null;
    }
}
