package florasoma.trees;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.registry.GameRegistry;

public class FloraTreesCommonProxy 
{
	/* Registers any rendering code. Does nothing server-side */
	public void registerRenderer() {}
	
	/* Ties an internal name to a visible one. Does nothing server-side */
	public void addNames() {}
	
	public void addRecipes()
	{
		for (int i = 0; i < 3; i++) //Planks
			GameRegistry.addRecipe(new ItemStack(FloraTrees.instance.planks, 4, i), "w", 'w', new ItemStack(FloraTrees.instance.tree, 1, i) );
		GameRegistry.addRecipe(new ItemStack(FloraTrees.instance.planks, 4, 3), "w", 'w', new ItemStack(FloraTrees.instance.redwood, 1, 1) );
		GameRegistry.addRecipe(new ItemStack(FloraTrees.instance.planks, 4, 4), "w", 'w', new ItemStack(FloraTrees.instance.bloodwood, 1, -1) );
		GameRegistry.addRecipe(new ItemStack(FloraTrees.instance.planks, 4, 5), "w", 'w', new ItemStack(FloraTrees.instance.tree, 1, 3) );
		
		ItemStack[] planks = new ItemStack[] { new ItemStack(FloraTrees.instance.planks, 1, 0), new ItemStack(FloraTrees.instance.planks, 1, 1),
			 new ItemStack(FloraTrees.instance.planks, 1, 2), new ItemStack(FloraTrees.instance.planks, 1, 3), new ItemStack(FloraTrees.instance.planks, 1, 5)};
		ItemStack[] logs = new ItemStack[] { new ItemStack(FloraTrees.instance.tree, 4, 0), new ItemStack(FloraTrees.instance.tree, 4, 1),
				new ItemStack(FloraTrees.instance.tree, 4, 2), new ItemStack(FloraTrees.instance.tree, 4, 3), new ItemStack(FloraTrees.instance.redwood, 1, 1)  };
		
		List recipes = CraftingManager.getInstance().getRecipeList();
		addShapedRecipeFirst(recipes, new ItemStack(FloraTrees.doorItem, 1, 0), "##", "##", "##", '#', new ItemStack(FloraTrees.instance.planks, 1, 3));
		addShapedRecipeFirst(recipes, new ItemStack(FloraTrees.doorItem, 1, 1), "##", "##", "##", '#', new ItemStack(FloraTrees.instance.planks, 1, 0));
		addShapedRecipeFirst(recipes, new ItemStack(FloraTrees.doorItem, 1, 2), "##", "##", "##", '#', new ItemStack(FloraTrees.instance.planks, 1, 1));
		addShapedRecipeFirst(recipes, new ItemStack(FloraTrees.doorItem, 1, 3), "##", "##", "##", '#', new ItemStack(FloraTrees.instance.planks, 1, 5));
		addShapedRecipeFirst(recipes, new ItemStack(FloraTrees.doorItem, 1, 4), "##", "##", "##", '#', new ItemStack(FloraTrees.instance.planks, 1, 2));
		addShapedRecipeFirst(recipes, new ItemStack(FloraTrees.doorItem, 1, 5), "##", "##", "##", '#', new ItemStack(FloraTrees.instance.planks, 1, 4));
		addShapedRecipeFirst(recipes, new ItemStack(FloraTrees.doorItem, 1, 6), "##", "##", "##", '#', new ItemStack(FloraTrees.instance.redwood, 1, 0));
		
		for (int i = 0; i < planks.length; i++)
		{
			OreDictionary.registerOre("plankWood", planks[i]);
			OreDictionary.registerOre("logWood", logs[i]);
		}
		
		//Turn logs into charcoal
		FurnaceRecipes.smelting().addSmelting(FloraTrees.instance.tree.blockID, 0, new ItemStack(Item.coal, 1, 1), 0.15f);
		FurnaceRecipes.smelting().addSmelting(FloraTrees.instance.tree.blockID, 1, new ItemStack(Item.coal, 1, 1), 0.15f);
		FurnaceRecipes.smelting().addSmelting(FloraTrees.instance.tree.blockID, 2, new ItemStack(Item.coal, 1, 1), 0.15f);
		FurnaceRecipes.smelting().addSmelting(FloraTrees.instance.tree.blockID, 3, new ItemStack(Item.coal, 1, 1), 0.15f);
		FurnaceRecipes.smelting().addSmelting(FloraTrees.instance.redwood.blockID, 0, new ItemStack(Item.coal, 1, 1), 0.15f);
		FurnaceRecipes.smelting().addSmelting(FloraTrees.instance.redwood.blockID, 1, new ItemStack(Item.coal, 1, 1), 0.15f);
		FurnaceRecipes.smelting().addSmelting(FloraTrees.instance.redwood.blockID, 2, new ItemStack(Item.coal, 1, 1), 0.15f);
	}
	
	public void addShapedRecipeFirst(List recipeList, ItemStack par1ItemStack, Object ... par2ArrayOfObj)
    {
        String var3 = "";
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;

        if (par2ArrayOfObj[var4] instanceof String[])
        {
            String[] var7 = (String[])((String[])par2ArrayOfObj[var4++]);

            for (int var8 = 0; var8 < var7.length; ++var8)
            {
                String var9 = var7[var8];
                ++var6;
                var5 = var9.length();
                var3 = var3 + var9;
            }
        }
        else
        {
            while (par2ArrayOfObj[var4] instanceof String)
            {
                String var11 = (String)par2ArrayOfObj[var4++];
                ++var6;
                var5 = var11.length();
                var3 = var3 + var11;
            }
        }

        HashMap var12;

        for (var12 = new HashMap(); var4 < par2ArrayOfObj.length; var4 += 2)
        {
            Character var13 = (Character)par2ArrayOfObj[var4];
            ItemStack var14 = null;

            if (par2ArrayOfObj[var4 + 1] instanceof Item)
            {
                var14 = new ItemStack((Item)par2ArrayOfObj[var4 + 1]);
            }
            else if (par2ArrayOfObj[var4 + 1] instanceof Block)
            {
                var14 = new ItemStack((Block)par2ArrayOfObj[var4 + 1], 1, -1);
            }
            else if (par2ArrayOfObj[var4 + 1] instanceof ItemStack)
            {
                var14 = (ItemStack)par2ArrayOfObj[var4 + 1];
            }

            var12.put(var13, var14);
        }

        ItemStack[] var15 = new ItemStack[var5 * var6];

        for (int var16 = 0; var16 < var5 * var6; ++var16)
        {
            char var10 = var3.charAt(var16);

            if (var12.containsKey(Character.valueOf(var10)))
            {
                var15[var16] = ((ItemStack)var12.get(Character.valueOf(var10))).copy();
            }
            else
            {
                var15[var16] = null;
            }
        }

        ShapedRecipes var17 = new ShapedRecipes(var5, var6, var15, par1ItemStack);
        recipeList.add(0, var17);
    }
	
	public File getMinecraftDir()
	{
		return new File(".");
	}
	
}
