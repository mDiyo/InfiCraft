package net.minecraft.src;

import net.minecraft.src.forge.IOreHandler;
import net.minecraft.src.forge.MinecraftForge;
import net.minecraft.src.forge.NetworkMod;
import net.minecraft.src.metals.*;
import java.lang.reflect.*;
import java.util.*;

public class mod_InfiMetals extends NetworkMod
{
	
	public mod_InfiMetals()
	{
		MetalPickaxes.init();
		MetalSwords.init();
		MetalShovels.init();
		MetalAxes.init();
		MetalHoes.init();
		addNames();
		oreDictionarySupport();
	}
	
	public static void addCustomRecipe(IRecipe irecipe)
	{
		try
		{
			Class craftingmanager = Class.forName("CraftingManager");
			Field recipes = craftingmanager.getField("recipes");
			Object recipelist = recipes.get(recipes);
			if (recipelist instanceof List)
			{
				((List)recipelist).add(irecipe);
				System.out.println("Added a recipe");
			}
		}
		catch (Throwable throwable)
        {
            System.out.println("Could not add custom recipe. Reason:");
            System.out.println(throwable);
        }
	}
	
	void addCrackRecipe(ItemStack par1ItemStack, Object ... par2ArrayOfObj)
    {
        ArrayList var3 = new ArrayList();
        Object[] var4 = par2ArrayOfObj;
        int var5 = par2ArrayOfObj.length;

        for (int var6 = 0; var6 < var5; ++var6)
        {
            Object var7 = var4[var6];

            if (var7 instanceof ItemStack)
            {
                var3.add(((ItemStack)var7).copy());
            }
            else if (var7 instanceof Item)
            {
                var3.add(new ItemStack((Item)var7));
            }
            else
            {
                if (!(var7 instanceof Block))
                {
                    throw new RuntimeException("Invalid cracking recipe!");
                }

                var3.add(new ItemStack((Block)var7));
            }
        }

        this.addCustomRecipe(new ShapelessRecipes(par1ItemStack, var3));
    }
	
	private void addNames()
	{
		ModLoader.addName(copperRod, "Copper Rod");
		ModLoader.addName(bronzeRod, "Bronze Rod");
		ModLoader.addName(workedIronRod, "Worked Iron Rod");
		ModLoader.addName(steelRod, "Steel Rod");
		ModLoader.addName(cobaltRod, "Cobalt Rod");
		ModLoader.addName(arditeRod, "Ardite Rod");
		ModLoader.addName(manyullynRod, "Manyullyn Rod");
		ModLoader.addName(uraniumRod, "Uranium Rod");
	}
	
	private void oreDictionarySupport()
	{
	    MinecraftForge.registerOreHandler(new IOreHandler()
	    {
	        public void registerOre(String ore, ItemStack itemstack)
	        {
	            if(PropsHelperInfiMetals.enableCopperTools && ore.equals("ingotCopper"))
	            {
	            	ModLoader.addRecipe(new ItemStack(copperRod, 4), new Object[] 
	        			{ "#", "#", '#', itemstack });
	            	MetalPickaxes.addCopperTools(itemstack);
	            	MetalSwords.addCopperTools(itemstack);
	            	MetalShovels.addCopperTools(itemstack);
	            	MetalAxes.addCopperTools(itemstack);
	            	MetalHoes.addCopperTools(itemstack);
	            }
	            if(PropsHelperInfiMetals.enableBronzeTools && ore.equals("ingotBronze"))
	            {
	            	ModLoader.addRecipe(new ItemStack(bronzeRod, 4), new Object[] 
		        		{ "#", "#", '#', itemstack });
		            MetalPickaxes.addBronzeTools(itemstack);
		            MetalSwords.addBronzeTools(itemstack);
		            MetalShovels.addBronzeTools(itemstack);
		            MetalAxes.addBronzeTools(itemstack);
		            MetalHoes.addBronzeTools(itemstack);
	            }
	            if(PropsHelperInfiMetals.enableWorkedIronTools && ore.equals("ingotRefinedIron"))
	            {
	            	ModLoader.addRecipe(new ItemStack(workedIronRod, 4), new Object[] 
		        		{ "#", "#", '#', itemstack });
		            MetalPickaxes.addWorkedIronTools(itemstack);
		            MetalSwords.addWorkedIronTools(itemstack);
		            MetalShovels.addWorkedIronTools(itemstack);
		            MetalAxes.addWorkedIronTools(itemstack);
		            MetalHoes.addWorkedIronTools(itemstack);
	            }
	            if(PropsHelperInfiMetals.enableSteelTools && ore.equals("ingotSteel"))
	            {
	                ModLoader.addRecipe(new ItemStack(steelRod, 4), new Object[] 
		        		{ "#", "#", '#', itemstack });
		            MetalPickaxes.addSteelTools(itemstack);
		            MetalSwords.addSteelTools(itemstack);
		            MetalShovels.addSteelTools(itemstack);
		            MetalAxes.addSteelTools(itemstack);
		            MetalHoes.addSteelTools(itemstack);
	            }
	            if(PropsHelperInfiMetals.enableCobaltTools && ore.equals("ingotCobalt"))
	            {
	            	ModLoader.addRecipe(new ItemStack(cobaltRod, 4), new Object[] 
		        		{ "#", "#", '#', itemstack });
		            MetalPickaxes.addCobaltTools(itemstack);
		            MetalSwords.addCobaltTools(itemstack);
		            MetalShovels.addCobaltTools(itemstack);
		            MetalAxes.addCobaltTools(itemstack);
		            MetalHoes.addCobaltTools(itemstack);
	            }
	            if(PropsHelperInfiMetals.enableArditeTools && ore.equals("ingotArdite"))
	            {
	            	ModLoader.addRecipe(new ItemStack(arditeRod, 4), new Object[] 
		        		{ "#", "#", '#', itemstack });
		            MetalPickaxes.addArditeTools(itemstack);
		            MetalSwords.addArditeTools(itemstack);
		            MetalShovels.addArditeTools(itemstack);
		            MetalAxes.addArditeTools(itemstack);
		            MetalHoes.addArditeTools(itemstack);
	            }
	            if(PropsHelperInfiMetals.enableManyullynTools && ore.equals("ingotManyullyn"))
	            {
	            	ModLoader.addRecipe(new ItemStack(manyullynRod, 4), new Object[] 
		        		{ "#", "#", '#', itemstack });
	            	MetalPickaxes.addManyullynTools(itemstack);
	            	MetalSwords.addManyullynTools(itemstack);
	            	MetalShovels.addManyullynTools(itemstack);
	            	MetalAxes.addManyullynTools(itemstack);
	            	MetalHoes.addManyullynTools(itemstack);
	            }
	            if(PropsHelperInfiMetals.enableUraniumTools && ore.equals("ingotUranium"))
	            {
	            	ModLoader.addRecipe(new ItemStack(uraniumRod, 4), new Object[] 
		        		{ "#", "#", '#', itemstack });
		            MetalPickaxes.addUraniumTools(itemstack);
		            MetalSwords.addUraniumTools(itemstack);
		            MetalShovels.addUraniumTools(itemstack);
		            MetalAxes.addUraniumTools(itemstack);
		            MetalHoes.addUraniumTools(itemstack);
	            }
	            if(PropsHelperInfiMetals.enableStoneTools && (ore.equals("customCobblestone") || ore.equals("customStone")))
	            {
		            MetalPickaxes.addStoneTools(itemstack);
		            MetalSwords.addStoneTools(itemstack);
		            MetalShovels.addStoneTools(itemstack);
		            MetalAxes.addStoneTools(itemstack);
		            MetalHoes.addStoneTools(itemstack);
	            }
	            if(PropsHelperInfiMetals.enableRedstoneTools && ore.equals("redstoneCrystal"))
	            {
		            MetalPickaxes.addRedstoneTools(itemstack);
		            MetalSwords.addRedstoneTools(itemstack);
		            MetalShovels.addRedstoneTools(itemstack);
		            MetalAxes.addRedstoneTools(itemstack);
		            MetalHoes.addRedstoneTools(itemstack);
	            }
	            if(PropsHelperInfiMetals.enableGlowstoneTools && ore.equals("glowstoneCrystal"))
	            {
		            MetalPickaxes.addGlowstoneTools(itemstack);
		            MetalSwords.addGlowstoneTools(itemstack);
		            MetalShovels.addGlowstoneTools(itemstack);
		            MetalAxes.addGlowstoneTools(itemstack);
		            MetalHoes.addGlowstoneTools(itemstack);
	            }
	            if(PropsHelperInfiMetals.enableLavaTools && ore.equals("lavaCrystal"))
	            {
		            MetalPickaxes.addLavaTools(itemstack);
		            MetalSwords.addLavaTools(itemstack);
		            MetalShovels.addLavaTools(itemstack);
		            MetalAxes.addLavaTools(itemstack);
		            MetalHoes.addLavaTools(itemstack);
	            }
	            if(PropsHelperInfiMetals.enableSlimeTools && ore.equals("slimeCrystal"))
	            {
		            MetalPickaxes.addSlimeTools(itemstack);
		            MetalSwords.addSlimeTools(itemstack);
		            MetalShovels.addSlimeTools(itemstack);
		            MetalAxes.addSlimeTools(itemstack);
		            MetalHoes.addSlimeTools(itemstack);
	            }
	            if(PropsHelperInfiMetals.enableBlazeTools && ore.equals("blazeCrystal"))
	            {
		            MetalPickaxes.addBlazeTools(itemstack);
		            MetalSwords.addBlazeTools(itemstack);
		            MetalShovels.addBlazeTools(itemstack);
		            MetalAxes.addBlazeTools(itemstack);
		            MetalHoes.addBlazeTools(itemstack);
	            }
	        }
	    } );
	}

	@Override
	public boolean clientSideRequired() {
		return true;
	}

	@Override
	public boolean serverSideRequired() {
		return false;
	}

	@Override
	public String getVersion() {
		return "1.0";
	}

	@Override
	public void load() {}
	
	public static Item copperRod;
	public static Item bronzeRod;
	public static Item workedIronRod;
	public static Item steelRod;
	public static Item cobaltRod;
	public static Item arditeRod;
	public static Item manyullynRod;
	public static Item uraniumRod;
	
	static
	{
		PropsHelperInfiMetals.initProps();
		copperRod = new InfiTexture(PropsHelperInfiMetals.copperRodID, "/metaltex/rods.png").setIconCoord(4, 1).setItemName("copperRod");
		bronzeRod = new InfiTexture(PropsHelperInfiMetals.bronzeRodID, "/metaltex/rods.png").setIconCoord(5, 1).setItemName("bronzeRod");
		workedIronRod = new InfiTexture(PropsHelperInfiMetals.workedIronRodID, "/metaltex/rods.png").setIconCoord(6, 1).setItemName("workedIronRod");
		steelRod = new InfiTexture(PropsHelperInfiMetals.steelRodID, "/metaltex/rods.png").setIconCoord(7, 1).setItemName("steelRod");
		cobaltRod = new InfiTexture(PropsHelperInfiMetals.cobaltRodID, "/metaltex/rods.png").setIconCoord(8, 1).setItemName("cobaltRod");
		arditeRod = new InfiTexture(PropsHelperInfiMetals.arditeRodID, "/metaltex/rods.png").setIconCoord(9, 1).setItemName("arditeRod");
		manyullynRod = new InfiTexture(PropsHelperInfiMetals.manyullynRodID, "/metaltex/rods.png").setIconCoord(10, 1).setItemName("manyullynRod");
		uraniumRod = new InfiTexture(PropsHelperInfiMetals.uraniumRodID, "/metaltex/rods.png").setIconCoord(15, 1).setItemName("uraniumRod");
	}
}
