package net.minecraft.src.mechvent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import net.minecraft.src.*;

public class CrushingManager
{
    /** The static instance of this class */
    private static final CrushingManager instance = new CrushingManager();

    /** A list of all the recipes added */
    private List crushRecipes = new ArrayList();
    private List grindRecipes = new ArrayList();

    /**
     * Returns the static instance of this class
     */
    public static final CrushingManager getInstance()
    {
        return instance;
    }

    private CrushingManager()
    {
    	
        //Collections.sort(this.recipes, new CrushingSorter(this));
    	//System.out.println(this.crushRecipes.size() + " crushing recipes");
    }

    public void addCrushingRecipe(ItemStack input, Object ... items)
    {
        int[] chance = new int[items.length];
        for (int i = 0; i < items.length; i++)
        {
        	chance[i] = 100;
        }
        this.addCrushingRecipe(input, chance, items);
    }
    
    public void addCrushingRecipe(ItemStack input, int[] chances, Object ... items)
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

        this.crushRecipes.add(new CrushingRecipe(input, output, chances));
    }

    public List findMatchingCrusherRecipe(ItemStack stack)
    {
    	for (int i = 0; i < this.crushRecipes.size(); ++i)
        {
            IRecipeReverse irecipe = (IRecipeReverse)this.crushRecipes.get(i);

            if (irecipe.isMatch(stack))
            {
                return irecipe.getRecipeOutput();
            }
        }
    	return null;
    }
    
    public int[] findCrusherRecipeChances(ItemStack stack)
    {
    	for (int i = 0; i < this.crushRecipes.size(); ++i)
        {
            IRecipeReverse irecipe = (IRecipeReverse)this.crushRecipes.get(i);

            if (irecipe.isMatch(stack))
            {
                return irecipe.getRecipeChance();
            }
        }
    	return null;
    }

    /**
     * returns the List<> of all crusher recipes
     */
    public List getCrusherRecipeList()
    {
        return this.crushRecipes;
    }
    
    public void addGrindingRecipe(ItemStack input, Object ... items)
    {
        int[] chance = new int[items.length];
        for (int i = 0; i < items.length; i++)
        {
        	chance[i] = 100;
        }
        this.addCrushingRecipe(input, chance, items);
    }
    
    public void addGrindingRecipe(ItemStack input, int[] chances, Object ... items)
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
                    throw new RuntimeException("Invalid Grinder recipe!");
                }

                output.add(new ItemStack((Block)recipeOutput));
            }
        }

        this.grindRecipes.add(new CrushingRecipe(input, output, chances));
    }

    public List findMatchingGrinderRecipe(ItemStack stack)
    {
    	for (int i = 0; i < this.grindRecipes.size(); ++i)
        {
            IRecipeReverse irecipe = (IRecipeReverse)this.grindRecipes.get(i);

            if (irecipe.isMatch(stack))
            {
                return irecipe.getRecipeOutput();
            }
        }
    	return null;
    }
    
    public int[] findGrinderRecipeChances(ItemStack stack)
    {
    	for (int i = 0; i < this.grindRecipes.size(); ++i)
        {
            IRecipeReverse irecipe = (IRecipeReverse)this.grindRecipes.get(i);

            if (irecipe.isMatch(stack))
            {
                return irecipe.getRecipeChance();
            }
        }
    	return null;
    }

    /**
     * returns the List<> of all crusher recipes
     */
    public List getGrinderRecipeList()
    {
        return this.crushRecipes;
    }
}
