package net.minecraft.src;
import java.util.List;

import net.minecraft.src.forge.*;
import net.minecraft.src.mechvent.*;

public class mod_Mechvent extends NetworkMod
{
    private static mod_Mechvent proto;
    private static IGuiHandler guiHandler;
    
    public mod_Mechvent()
    {
        proto = this;
        
        guiHandler = new IGuiHandler()
        {
            public Object getGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
            {
                if (ID == 1)
                {
                    
                    return new CrusherGui(player.inventory, (CrusherLogic)world.getBlockTileEntity(x, y, z));
                }
                if (ID == 2)
                {
                    return new GrinderGui(player.inventory, (GrinderLogic)world.getBlockTileEntity(x, y, z));
                }
                else
                {
                    return null;
                }
            }
        };
        
        //ModLoader.registerBlock(protoCrusher, net.minecraft.src.prototype.FurnaceItem.class);
        MinecraftForge.setGuiHandler(this, guiHandler);
        
        ModLoader.registerBlock(protoCrusher, net.minecraft.src.mechvent.CrusherItem.class);
        ModLoader.registerTileEntity(net.minecraft.src.mechvent.CrusherLogic.class, "Prototype Crusher");
        ModLoader.registerTileEntity(net.minecraft.src.mechvent.GrinderLogic.class, "Prototype Grinder");
        MinecraftForgeClient.preloadTexture("/mechtex/prototype.png");
    }
    
    public static mod_Mechvent getInstance()
    {
        return proto;
    }
    
    public static void addCrushingRecipe (ItemStack itemstack, Object ... objArray)
    {
        CrushingManager.getInstance().addCrushingRecipe(itemstack, objArray);
    }
    
    public static void addCrushingRecipe (ItemStack itemstack, int[] chances, Object ... objArray)
    {
        CrushingManager.getInstance().addCrushingRecipe(itemstack, chances, objArray);
    }
    
    public static void addGrindingRecipe (ItemStack itemstack, Object ... objArray)
    {
        CrushingManager.getInstance().addGrindingRecipe(itemstack, objArray);
    }
    
    public static void addGrindingRecipe (ItemStack itemstack, int[] chances, Object ... objArray)
    {
        CrushingManager.getInstance().addGrindingRecipe(itemstack, chances, objArray);
    }
    
    @Override
    public boolean clientSideRequired() {
        return false;
    }

    @Override
    public boolean serverSideRequired() {
        return false;
    }

    @Override
    public String getVersion() {
        return "0.0.3 Prototype";
    }

    @Override
    public void load() 
    {
        addCrushingRecipes();
        addGrindingRecipes();
        addCraftingRecipes();
        addSmeltingRecipes();
        addNames();
        
        oreDictionarySupport();
    }
    
    public String getPriorities()
    {
        return "after:mod_Orizon";
    }
    
    private void addCrushingRecipes()
    {
    	System.out.println("Adding Crushing recipes");
        //Iron ore
        addCrushingRecipe(new ItemStack(Block.oreIron, 1), 
                new int[] { 50, 40, 40, 50, 50, 25, 25 }, new Object[]
            { new ItemStack(largeChunk, 1, 0), new ItemStack(mediumChunk, 1, 0), new ItemStack(mediumChunk, 1, 0),
            new ItemStack(smallChunk, 1, 0), new ItemStack(smallChunk, 1, 0),
            new ItemStack(oreDust, 1, 15), new ItemStack(oreDustSmall, 1, 15) });
        
        addCrushingRecipe(new ItemStack(largeChunk, 1, 0), 
                new int[] { 100, 50, 50, 50, 10 }, new Object[]
            { new ItemStack(mediumChunk, 1, 0), new ItemStack(mediumChunk, 1, 0),
            new ItemStack(smallChunk, 1, 0), new ItemStack(smallChunk, 1, 0),
            new ItemStack(oreDustSmall, 1, 15)});
        
        //Gold ore
        addCrushingRecipe(new ItemStack(Block.oreGold, 1), 
                new int[] { 50, 40, 40, 50, 50, 25, 25 }, new Object[]
            { new ItemStack(largeChunk, 1, 1), new ItemStack(mediumChunk, 1, 1), new ItemStack(mediumChunk, 1, 1),
            new ItemStack(Item.goldNugget, 1), new ItemStack(Item.goldNugget, 1),
            new ItemStack(oreDust, 1, 15), new ItemStack(oreDustSmall, 1, 15) });
        
        addCrushingRecipe(new ItemStack(largeChunk, 1, 1), 
                new int[] { 100, 50, 50, 50, 10 }, new Object[]
            { new ItemStack(mediumChunk, 1, 1), new ItemStack(mediumChunk, 1, 1),
            new ItemStack(Item.goldNugget, 1), new ItemStack(Item.goldNugget, 1),
            new ItemStack(oreDustSmall, 1, 15)});
        
        //Orizon Ores
        for(int i = 0; i < 2; i++)
        {
            addCrushingRecipe(new ItemStack(mod_Orizon.mineralOre, 1, i), 
                    new int[] { 50, 40, 40, 50, 50, 25, 25 }, new Object[]
                { new ItemStack(largeChunk, 1, i+2), new ItemStack(mediumChunk, 1, i+2), new ItemStack(mediumChunk, 1, i+2),
                new ItemStack(smallChunk, 1, i+2), new ItemStack(smallChunk, 1, i+2),
                new ItemStack(oreDust, 1, 15), new ItemStack(oreDustSmall, 1, 15) });
            addCrushingRecipe(new ItemStack(mod_Orizon.mineralOreAlt, 1, i), 
                    new int[] { 70, 50, 25, 25, 25, 25 }, new Object[]
                { new ItemStack(largeChunk, 1, i+2), new ItemStack(largeChunk, 1, i+2),
                new ItemStack(mediumChunk, 1, i+2), new ItemStack(mediumChunk, 1, i+2),
                new ItemStack(oreDust, 1, 15), new ItemStack(oreDustSmall, 1, 15) });
            
            addCrushingRecipe(new ItemStack(largeChunk, 1, i+2), 
                    new int[] { 100, 50, 50, 50, 10 }, new Object[]
                { new ItemStack(mediumChunk, 1, i+2), new ItemStack(mediumChunk, 1, i+2),
                new ItemStack(smallChunk, 1, i+2), new ItemStack(smallChunk, 1, i+2),
                new ItemStack(oreDustSmall, 1, 15) });
        }
        
        //Chalcocite
        addCrushingRecipe(new ItemStack(mod_Orizon.mineralOre, 1, 2), 
                new int[] { 50, 40, 40, 50, 50, 25, 25, 15 }, new Object[]
            { new ItemStack(largeChunk, 1, 4), new ItemStack(mediumChunk, 1, 4), new ItemStack(mediumChunk, 1, 4),
            new ItemStack(smallChunk, 1, 4), new ItemStack(smallChunk, 1, 4),
            new ItemStack(oreDust, 1, 15), new ItemStack(oreDustSmall, 1, 15),
            new ItemStack(mod_Orizon.gems, 1, 7) });
        addCrushingRecipe(new ItemStack(mod_Orizon.mineralOreAlt, 1, 2), 
                new int[] { 70, 50, 25, 25, 25, 25, 15 }, new Object[]
            { new ItemStack(largeChunk, 1, 4), new ItemStack(largeChunk, 1, 4),
            new ItemStack(mediumChunk, 1, 4), new ItemStack(mediumChunk, 1, 4),
            new ItemStack(oreDust, 1, 15), new ItemStack(oreDustSmall, 1, 15),
            new ItemStack(mod_Orizon.gems, 1, 7) });
        
        addCrushingRecipe(new ItemStack(largeChunk, 1, 4), 
                new int[] { 100, 50, 50, 50, 10 }, new Object[]
            { new ItemStack(mediumChunk, 1, 4), new ItemStack(mediumChunk, 1, 4),
            new ItemStack(smallChunk, 1, 4), new ItemStack(smallChunk, 1, 4),
            new ItemStack(oreDustSmall, 1, 15) });
        
        //Cassiterite
        addCrushingRecipe(new ItemStack(mod_Orizon.mineralOre, 1, 3), 
                new int[] { 50, 40, 40, 50, 50, 25, 25, 15 }, new Object[]
            { new ItemStack(largeChunk, 1, 5), new ItemStack(mediumChunk, 1, 5), new ItemStack(mediumChunk, 1, 5),
            new ItemStack(smallChunk, 1, 5), new ItemStack(smallChunk, 1, 5),
            new ItemStack(oreDust, 1, 15), new ItemStack(oreDustSmall, 1, 15),
            new ItemStack(mod_Orizon.gems, 1, 5) });
        addCrushingRecipe(new ItemStack(mod_Orizon.mineralOreAlt, 1, 3), 
                new int[] { 70, 50, 25, 25, 25, 25, 15 }, new Object[]
            { new ItemStack(largeChunk, 1, 5), new ItemStack(largeChunk, 1, 5),
            new ItemStack(mediumChunk, 1, 5), new ItemStack(mediumChunk, 1, 5),
            new ItemStack(oreDust, 1, 15), new ItemStack(oreDustSmall, 1, 15),
            new ItemStack(mod_Orizon.gems, 1, 5) });
        
        addCrushingRecipe(new ItemStack(largeChunk, 1, 3), 
                new int[] { 100, 50, 50, 50, 10 }, new Object[]
            { new ItemStack(mediumChunk, 1, 5), new ItemStack(mediumChunk, 1, 5),
            new ItemStack(smallChunk, 1, 5), new ItemStack(smallChunk, 1, 5),
            new ItemStack(oreDustSmall, 1, 15) });
        
        for(int i = 4; i < 10; i++)
        {
            addCrushingRecipe(new ItemStack(mod_Orizon.mineralOre, 1, i), 
                    new int[] { 50, 40, 40, 50, 50, 25, 25, 25 }, new Object[]
                { new ItemStack(largeChunk, 1, i+2), new ItemStack(mediumChunk, 1, i+2), new ItemStack(mediumChunk, 1, i+2),
                new ItemStack(smallChunk, 1, i+2), new ItemStack(smallChunk, 1, i+2),
                new ItemStack(oreDust, 1, 15), new ItemStack(oreDustSmall, 1, 15) });
            addCrushingRecipe(new ItemStack(mod_Orizon.mineralOreAlt, 1, i), 
                    new int[] { 70, 50, 25, 25, 25, 25 }, new Object[]
                { new ItemStack(largeChunk, 1, i+2), new ItemStack(largeChunk, 1, i+2),
                new ItemStack(mediumChunk, 1, i+2), new ItemStack(mediumChunk, 1, i+2),
                new ItemStack(oreDust, 1, 15), new ItemStack(oreDustSmall, 1, 15) });
            
            addCrushingRecipe(new ItemStack(largeChunk, 1, i+2), 
                    new int[] { 100, 50, 50, 50, 10 }, new Object[]
                { new ItemStack(mediumChunk, 1, i+2), new ItemStack(mediumChunk, 1, i+2),
                new ItemStack(smallChunk, 1, i+2), new ItemStack(smallChunk, 1, i+2),
                new ItemStack(oreDustSmall, 1, 15) });
        }
        
        //Myuvil ore
        addCrushingRecipe(new ItemStack(mod_Orizon.mineralOre, 1, 10), 
                new int[] { 50, 50, 50, 30, 30, 30, 40, 40 }, new Object[]
            { new ItemStack(largeChunk, 1, 10), new ItemStack(largeChunk, 1, 11), new ItemStack(largeChunk, 1, 12),
            new ItemStack(mediumChunk, 1, 10), new ItemStack(mediumChunk, 1, 11), new ItemStack(mediumChunk, 1, 12),
            new ItemStack(Item.redstone, 1), new ItemStack(Item.redstone, 1) });
        addCrushingRecipe(new ItemStack(mod_Orizon.mineralOreAlt, 1, 10), 
                new int[] { 70, 70, 70, 40, 40 }, new Object[]
            { new ItemStack(largeChunk, 1, 10), new ItemStack(largeChunk, 1, 11), new ItemStack(largeChunk, 1, 12),
            new ItemStack(Item.redstone, 1), new ItemStack(Item.redstone, 1) });
        addCrushingRecipe(new ItemStack(largeChunk, 1, 12), 
                new int[] { 50, 50, 50, 30, 30, 30, 30, 30 }, new Object[]
            { new ItemStack(mediumChunk, 1, 10), new ItemStack(mediumChunk, 1, 11), new ItemStack(mediumChunk, 1, 12),
            new ItemStack(smallChunk, 1, 10), new ItemStack(smallChunk, 1, 11), new ItemStack(smallChunk, 1, 12),
            new ItemStack(Item.redstone, 1), new ItemStack(Item.redstone, 1) });
        addCrushingRecipe(new ItemStack(largeChunk, 1, 12), 
                new int[] { 50, 50, 50, 25, 25 }, new Object[]
            { new ItemStack(smallChunk, 1, 10), new ItemStack(smallChunk, 1, 11), new ItemStack(smallChunk, 1, 12),
            new ItemStack(Item.redstone, 1), new ItemStack(Item.redstone, 1) });
        
        //Aggregate ore
        addCrushingRecipe(new ItemStack(mod_Orizon.mineralOre, 1, 13),
                new int[] { 30, 30, 30, 30, 30, 30 }, new Object[]
            { new ItemStack(mediumChunk, 1, 2), new ItemStack(mediumChunk, 1, 3),
            new ItemStack(mediumChunk, 1, 4), new ItemStack(mediumChunk, 1, 5),
            new ItemStack(mediumChunk, 1, 6), new ItemStack(mediumChunk, 1, 7) });
        
        addCrushingRecipe(new ItemStack(mod_Orizon.mineralOreAlt, 1, 13),
                new int[] { 30, 30, 30, 30, 30, 30 }, new Object[]
            { new ItemStack(mediumChunk, 1, 8), new ItemStack(mediumChunk, 1, 9),
            new ItemStack(mediumChunk, 1, 10), new ItemStack(mediumChunk, 1, 11),
            new ItemStack(mediumChunk, 1, 12), new ItemStack(mediumChunk, 1, 13) });
    }
    
    private void addGrindingRecipes()
    {
        //Regular ores
        for(int i = 0; i < 6; i++)
        {
            addGrindingRecipe(new ItemStack(largeChunk, 1, i),
                new int[] { 100, 50, 30 }, new Object[]
            {
                new ItemStack(oreDust, 1, i),
                new ItemStack(oreDustSmall, 1, i), new ItemStack(oreDustSmall, 1, i)
            });
            addGrindingRecipe(new ItemStack(mediumChunk, 1, i),
                new int[] { 30, 50, 50 }, new Object[]
            {
                new ItemStack(oreDust, 1, i),
                new ItemStack(oreDustSmall, 1, i), new ItemStack(oreDustSmall, 1, i)
            });
            addGrindingRecipe(new ItemStack(smallChunk, 1, i),
                new int[] { 100 }, new Object[]
            {
                new ItemStack(oreDust, 1, i)
            });
        }
        
        //Teallite
        addGrindingRecipe(new ItemStack(largeChunk, 1, 6),
            new int[] { 100, 30, 25, 50, 30, 25, 10 }, new Object[]
        {
            new ItemStack(oreDust, 1, 6), new ItemStack(oreDust, 1, 6),
            new ItemStack(oreDust, 1, 0),
            new ItemStack(oreDustSmall, 1, 6), new ItemStack(oreDustSmall, 1, 6),
            new ItemStack(oreDustSmall, 1, 0), new ItemStack(oreDustSmall, 1, 0)
        });
        addGrindingRecipe(new ItemStack(mediumChunk, 1, 6),
            new int[] { 30, 15, 50, 50, 10, 10 }, new Object[]
        {
            new ItemStack(oreDust, 1, 6), new ItemStack(oreDust, 1, 0),
            new ItemStack(oreDustSmall, 1, 6), new ItemStack(oreDustSmall, 1, 6),
            new ItemStack(oreDustSmall, 1, 0), new ItemStack(oreDustSmall, 1, 0)
        });
        addGrindingRecipe(new ItemStack(smallChunk, 1, 6),
            new int[] { 100, 25 }, new Object[]
        {
            new ItemStack(oreDust, 1, 6), new ItemStack(oreDust, 1, 0)
        });
        
        for(int i = 7; i < 12; i++)
        {
            addGrindingRecipe(new ItemStack(largeChunk, 1, i),
                new int[] { 100, 50, 30 }, new Object[]
            {
                new ItemStack(oreDust, 1, i),
                new ItemStack(oreDustSmall, 1, i), new ItemStack(oreDustSmall, 1, i)
            });
            addGrindingRecipe(new ItemStack(mediumChunk, 1, i),
                new int[] { 30, 50, 50 }, new Object[]
            {
                new ItemStack(oreDust, 1, i),
                new ItemStack(oreDustSmall, 1, i), new ItemStack(oreDustSmall, 1, i)
            });
            addGrindingRecipe(new ItemStack(smallChunk, 1, i),
                new int[] { 100 }, new Object[]
            {
                new ItemStack(oreDust, 1, i)
            });
        }
        
        //Myuvil ores
        addGrindingRecipe(new ItemStack(largeChunk, 1, 12),
            new int[] { 70, 70, 70, 70, 50, 50, 50, 50 }, new Object[]
        {
            new ItemStack(oreDust, 1, 10), new ItemStack(oreDust, 1, 11), 
            new ItemStack(oreDust, 1, 12), new ItemStack(oreDust, 1, 14),
            new ItemStack(oreDustSmall, 1, 10), new ItemStack(oreDustSmall, 1, 11),
            new ItemStack(oreDustSmall, 1, 12), new ItemStack(oreDustSmall, 1, 14)
        });
        addGrindingRecipe(new ItemStack(mediumChunk, 1, 12),
            new int[] { 50, 50, 50, 50, 50, 50, 50, 50 }, new Object[]
        {
            new ItemStack(oreDustSmall, 1, 10), new ItemStack(oreDustSmall, 1, 11),
            new ItemStack(oreDustSmall, 1, 12), new ItemStack(oreDustSmall, 1, 14),
            new ItemStack(oreDustSmall, 1, 10), new ItemStack(oreDustSmall, 1, 11),
            new ItemStack(oreDustSmall, 1, 12), new ItemStack(oreDustSmall, 1, 14)
        });
        addGrindingRecipe(new ItemStack(smallChunk, 1, 12),
            new int[] { 100 }, new Object[]
        {
            new ItemStack(oreDust, 1, 12),
        });
        
        //Pebbles
        addGrindingRecipe(new ItemStack(largeChunk, 1, 14),
            new int[] { 100 }, new Object[]
        { new ItemStack(oreDust, 1, 15),});
    }
    
    private void addCraftingRecipes()
    {
    	//Small dust compacting
        for (int i = 0; i < 16; i++)
        {
            ModLoader.addShapelessRecipe(new ItemStack(oreDust, 1, i), new Object[]
            { new ItemStack(oreDustSmall, 1, i), new ItemStack(oreDustSmall, 1, i), 
            	new ItemStack(oreDustSmall, 1, i) });
        }
        
        //Alloy Dusts
        for (int copperIter = 2; copperIter < 5; copperIter++)
        {
        	for(int alloyIter = 5; alloyIter < 9; alloyIter++)
        	{
                ModLoader.addShapelessRecipe(new ItemStack(oreDustAlloy, 2, copperIter-2 + (alloyIter-5)*3), new Object[]
                { new ItemStack(oreDust, 1, copperIter), new ItemStack(oreDust, 1, copperIter), 
                  new ItemStack(oreDust, 1, copperIter), new ItemStack(oreDust, 1, alloyIter) });
        	}
        }
        
        //Cordite
        ModLoader.addShapelessRecipe(new ItemStack(oreDustAlloy, 2, 12), new Object[]
                { new ItemStack(oreDust, 1, 10), new ItemStack(oreDust, 1, 11) });
        
        //Electrum
        ModLoader.addShapelessRecipe(new ItemStack(oreDustAlloy, 3, 12), new Object[]
                { new ItemStack(oreDust, 1, 2), new ItemStack(oreDust, 1, 2),
                  new ItemStack(oreDust, 1, 2), new ItemStack(oreDust, 1, 2),
                  new ItemStack(oreDust, 1, 2), new ItemStack(oreDust, 1, 1) });
    }
    
    private void addSmeltingRecipes()
    {
        FurnaceRecipes.smelting().addSmelting(oreDust.shiftedIndex, 0, new ItemStack(Item.ingotIron, 1));
        FurnaceRecipes.smelting().addSmelting(oreDust.shiftedIndex, 1, new ItemStack(Item.ingotGold, 1));
        FurnaceRecipes.smelting().addSmelting(oreDust.shiftedIndex, 2, new ItemStack(mod_Orizon.ingots, 1, 0));
        FurnaceRecipes.smelting().addSmelting(oreDust.shiftedIndex, 3, new ItemStack(mod_Orizon.ingots, 1, 0));
        FurnaceRecipes.smelting().addSmelting(oreDust.shiftedIndex, 4, new ItemStack(mod_Orizon.ingots, 1, 0));
        FurnaceRecipes.smelting().addSmelting(oreDust.shiftedIndex, 5, new ItemStack(mod_Orizon.ingots, 1, 1));
        FurnaceRecipes.smelting().addSmelting(oreDust.shiftedIndex, 6, new ItemStack(mod_Orizon.ingots, 1, 1));
        FurnaceRecipes.smelting().addSmelting(oreDust.shiftedIndex, 7, new ItemStack(mod_Orizon.ingots, 1, 2));
        FurnaceRecipes.smelting().addSmelting(oreDust.shiftedIndex, 8, new ItemStack(mod_Orizon.ingots, 1, 2));
        FurnaceRecipes.smelting().addSmelting(oreDust.shiftedIndex, 9, new ItemStack(mod_Orizon.ingots, 1, 13));
        FurnaceRecipes.smelting().addSmelting(oreDust.shiftedIndex, 10, new ItemStack(mod_Orizon.ingots, 1, 3));
        FurnaceRecipes.smelting().addSmelting(oreDust.shiftedIndex, 11, new ItemStack(mod_Orizon.ingots, 1, 4));
        FurnaceRecipes.smelting().addSmelting(oreDust.shiftedIndex, 14, new ItemStack(mod_Orizon.ingots, 1, 10));
        FurnaceRecipes.smelting().addSmelting(oreDust.shiftedIndex, 15, new ItemStack(Block.stone, 1));
        
        FurnaceRecipes.smelting().addSmelting(oreDustAlloy.shiftedIndex, 0, new ItemStack(mod_Orizon.ingots, 1, 6));
        FurnaceRecipes.smelting().addSmelting(oreDustAlloy.shiftedIndex, 1, new ItemStack(mod_Orizon.ingots, 1, 6));
        FurnaceRecipes.smelting().addSmelting(oreDustAlloy.shiftedIndex, 2, new ItemStack(mod_Orizon.ingots, 1, 6));
        FurnaceRecipes.smelting().addSmelting(oreDustAlloy.shiftedIndex, 3, new ItemStack(mod_Orizon.ingots, 1, 6));
        FurnaceRecipes.smelting().addSmelting(oreDustAlloy.shiftedIndex, 4, new ItemStack(mod_Orizon.ingots, 1, 6));
        FurnaceRecipes.smelting().addSmelting(oreDustAlloy.shiftedIndex, 5, new ItemStack(mod_Orizon.ingots, 1, 6));
        FurnaceRecipes.smelting().addSmelting(oreDustAlloy.shiftedIndex, 6, new ItemStack(mod_Orizon.ingots, 1, 7));
        FurnaceRecipes.smelting().addSmelting(oreDustAlloy.shiftedIndex, 7, new ItemStack(mod_Orizon.ingots, 1, 7));
        FurnaceRecipes.smelting().addSmelting(oreDustAlloy.shiftedIndex, 8, new ItemStack(mod_Orizon.ingots, 1, 7));
        FurnaceRecipes.smelting().addSmelting(oreDustAlloy.shiftedIndex, 9, new ItemStack(mod_Orizon.ingots, 1, 7));
        FurnaceRecipes.smelting().addSmelting(oreDustAlloy.shiftedIndex, 10, new ItemStack(mod_Orizon.ingots, 1, 7));
        FurnaceRecipes.smelting().addSmelting(oreDustAlloy.shiftedIndex, 11, new ItemStack(mod_Orizon.ingots, 1, 7));
        FurnaceRecipes.smelting().addSmelting(oreDustAlloy.shiftedIndex, 12, new ItemStack(mod_Orizon.ingots, 1, 8));
        FurnaceRecipes.smelting().addSmelting(oreDustAlloy.shiftedIndex, 13, new ItemStack(mod_Orizon.ingots, 1, 14));
    }
    
    private void addNames()
    {
        String dustType[] =
        {
            "iron", "gold", "copper", "turquoise", "chalcocite", "cassiterite", 
            "teallite", "zincBloom", "sphalerite", "cerussite", "cobalt", "ardite", "myuvil"
        };
        
        String dustNameArray[] = {
            "Iron", "Gold", "Copper", "Turquoise", "Chalcocite", "Cassiterite",
            "Teallite", "Zinc Bloom", "Sphalerite", "Cerussite", "Cobalt", "Ardite", "Myuvil"
        };
        
        String smallNameArray[] = {
            "Iron Nugget", "Gold Nugget (Fake)", "Copper Nugget",
            "Turquoise Pebble", "Small Chalcocite Chunk", "Cassiterite Crystal",
            "Teallite Pebble", "Zinc Bloom Fragment", "Sphalerite Pebble",
            "Cerussite Crystal", "Cobalt Nugget", "Ardite Nugget",
            "Myuvil Nugget"
        };
        
        String alloyDustArray[] = {
        		"coppercassiterite", "copperteallite", "turquoisecassiterite", "turqouiseteallite",
        "chalcocitecassiterite", "chalcociteteallite", "copperzinc", "coppersphalerite",
        "turquoisezinc", "turqouiseteallite", "chalcocitezinc", "chalcocitesphalerite",
        "cobaltardite", "coppergold", "copperlead"
        };
        
        String alloyNameArray[] = {
        	"Raw Bronze", "Mixed Bronze", "Colored Bronze", "Rough Bronze",
        	"Chalky Bronze", "Grainy Bronze", "Raw Brass", "Mixed Brass",
        	"Colored Brass", "Rough Brass", "Chalky Brass", "Grainy Brass",
        	"Raw Cordite", "Mixed Electrum", "Unrefined Molychalkos"
        };
        
        for (int i = 0; i < dustType.length; i++)
        {
            ModLoader.addLocalization(dustType[i] + "ChunkLarge.name", "Large " + dustNameArray[i] + " Chunk");
            ModLoader.addLocalization(dustType[i] + "ChunkMedium.name", "Medium " + dustNameArray[i] + " Chunk");
            ModLoader.addLocalization(dustType[i] + "ChunkSmall.name", smallNameArray[i]);
            ModLoader.addLocalization(dustType[i] + "DustLarge.name", dustNameArray[i] + " Dust");
            ModLoader.addLocalization(dustType[i] + "DustSmall.name", "Small " + dustNameArray[i] + " Dust");
        }
        
        for (int i = 0; i < alloyDustArray.length; i++)
        {
        	ModLoader.addLocalization(alloyDustArray[i] + "DustAlloy.name", alloyNameArray[i] + " Dust");
        }
        
        //Other chunks
        ModLoader.addLocalization("stoneChunkLarge.name", "Pebbles");
        ModLoader.addLocalization("manyullynDustLarge.name", "Manyullyn Dust");
        ModLoader.addLocalization("manyullynDustSmall.name", "Small Manyullyn Dust");
        ModLoader.addLocalization("stoneDustLarge.name", "Stone Dust");
        ModLoader.addLocalization("stoneDustSmall.name", "Small Stone Dust");
        
        //Blocks
        ModLoader.addLocalization("crusherPrototype.name", "Prototype Crusher");
        ModLoader.addLocalization("grinderPrototype.name", "Prototype Grinder");
        
    }
    
    public static void oreDictionarySupport()
    {
        MinecraftForge.registerOreHandler(new IOreHandler()
        {
            public void registerOre(String ore, ItemStack itemstack)
            {
                if(ore.equals("oreCopper"))
                {
                    if(itemstack.itemID != mod_Orizon.mineralOre.blockID && 
                            itemstack.itemID != mod_Orizon.mineralOreAlt.blockID)
                    {
                    addCrushingRecipe(itemstack, 
                            new int[] { 100, 50, 25, 50, 50, 10, 25 }, new Object[]
                        { new ItemStack(largeChunk, 1, 2), new ItemStack(mediumChunk, 1, 2), new ItemStack(mediumChunk, 1, 2),
                        new ItemStack(smallChunk, 1, 2), new ItemStack(smallChunk, 1, 2),
                        new ItemStack(oreDust, 1, 15), new ItemStack(oreDustSmall, 1, 15) });
                    }
                }
                if(ore.equals("ingotCopper"))
                {
                    ModLoader.addRecipe(new ItemStack(protoCrusher, 1, 0), new Object[] 
                        { "###", "m m", "###", '#', itemstack, 'm', Block.stone });
                }
                if(ore.equals("oreTin"))
                {
                    if (itemstack.itemID != mod_Orizon.mineralOre.blockID && 
                            itemstack.itemID != mod_Orizon.mineralOreAlt.blockID)
                    {
                    addCrushingRecipe(itemstack, 
                            new int[] { 100, 50, 25, 50, 50, 10, 25 }, new Object[]
                        { new ItemStack(largeChunk, 1, 6), new ItemStack(mediumChunk, 1, 6), new ItemStack(mediumChunk, 1, 6),
                        new ItemStack(smallChunk, 1, 6), new ItemStack(smallChunk, 1, 6),
                        new ItemStack(oreDust, 1, 15), new ItemStack(oreDustSmall, 1, 15) });
                    }
                }
                if(ore.equals("ingotTin"))
                {
                    ModLoader.addRecipe(new ItemStack(protoCrusher, 1, 1), new Object[] 
                        { "###", "m m", "###", '#', itemstack, 'm', Block.stone });
                }
            }
        } );
    }
    
    public void modsLoaded()
    {
        super.modsLoaded();
        List<ItemStack> copper = MinecraftForge.getOreClass("oreCopper");
        List<ItemStack> tin = MinecraftForge.getOreClass("oreTin");
        List<ItemStack> stone = MinecraftForge.getOreClass("customStone");
        
        for (int iterStone = 0; iterStone < stone.size(); iterStone++)
        {
            for (int iterCopper = 0; iterCopper < copper.size(); iterCopper++)
            {
                ModLoader.addRecipe(new ItemStack(protoCrusher, 1, 0), new Object[] 
                    { "###", "m m", "###", '#', copper.get(iterCopper), 'm', stone.get(iterStone) });
            }
            for (int iterTin = 0; iterTin < copper.size(); iterTin++)
            {
                ModLoader.addRecipe(new ItemStack(protoCrusher, 1, 1), new Object[] 
                    { "###", "m m", "###", '#', copper.get(iterTin), 'm', stone.get(iterStone) });
            }
        }
    }

    public static Block protoCrusher;
    
    public static Item largeChunk;
    public static Item mediumChunk;
    public static Item smallChunk;
    public static Item oreDust;
    public static Item oreDustSmall;
    public static Item oreDustAlloy;
    
    static
    {
        PropsHelperMechvent.initProps();
        
        protoCrusher = new CrusherBlock(PropsHelperMechvent.protoCrusherID).setHardness(5.0F).setBlockName("protoCrusher");

        largeChunk = new OreChunkLarge(PropsHelperMechvent.largeChunkID).setIconCoord(0, 2).setItemName("largeChunk");
        mediumChunk = new OreChunkMedium(PropsHelperMechvent.mediumChunkID).setIconCoord(0, 1).setItemName("mediumChunk");
        smallChunk = new OreChunkSmall(PropsHelperMechvent.smallChunkID).setIconCoord(0, 0).setItemName("smallChunk");
        oreDust = new OreDustLarge(PropsHelperMechvent.oreDustID).setIconCoord(0, 3).setItemName("oreDust");
        oreDustSmall = new OreDustSmall(PropsHelperMechvent.oreDustSmallID).setIconCoord(0, 4).setItemName("oreDustSmall");
        oreDustAlloy = new OreDustAlloy(PropsHelperMechvent.oreDustAlloyID).setIconCoord(0, 5).setItemName("oreDustAlloy");
    }

}
