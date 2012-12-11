package mDiyo;
import java.util.Map;

//import alicedoll.AliceDolls;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;

import mDiyo.inficraft.armory.InfiArmory;
import mDiyo.inficraft.flora.crops.FloraCrops;
import mDiyo.inficraft.flora.trees.FloraTrees;
import mDiyo.inficraft.infiblocks.InfiBlocks;

/*
 * mDiyo's development testing mod
 * Free everything from dirt!
 */

@Mod(modid = "mod_Test", name = "mod_Test", version = "Test")
public class mod_Test
{
    public static Item xinstick;

	@PostInit
    public void postInit(FMLPostInitializationEvent evt)
    {
    	 GameRegistry.addRecipe(new ItemStack(xinstick, 64, 0), "s", 's', Block.dirt );
    	 GameRegistry.addRecipe(new ItemStack(FloraCrops.instance.barleyBag, 64, 0), "s", 's', Block.grass );
    	 GameRegistry.addRecipe(new ItemStack(InfiBlocks.getContentInstance().chiselDiamond, 64, 0), "ss", 's', Block.dirt );
    	 GameRegistry.addRecipe(new ItemStack(InfiBlocks.getContentInstance().storageBlock, 64, 0), "s", "s", 's', Block.dirt );
    	 
    	 //Cycle through metadata, don't go over the maximum or it will crash on mouseover
    	 for (int i = 0; i < 15; i++)
    	 {
    		 GameRegistry.addRecipe( new ItemStack(FloraTrees.tree, 64, i+1), "s", 's', 
    				new ItemStack(FloraTrees.tree, 64, i) );
    		 GameRegistry.addRecipe( new ItemStack(InfiBlocks.getContentInstance().storageBlock, 64, i+1), "s", 's', 
     				new ItemStack(InfiBlocks.getContentInstance().storageBlock, 64, i) );
    		 GameRegistry.addRecipe( new ItemStack(InfiBlocks.getContentInstance().storageBlock, 64, i+1), "ss", 's', 
     				new ItemStack(InfiBlocks.getContentInstance().storageBlock, 64, i) );
    	 }

    	 //ModLoader.addName(xinstick, "Stick of Power");
    }
    
    static
    {
        xinstick = new XinStick(10000).setItemName("xinstick");
        LanguageRegistry.addName(xinstick, "XinStick");
    }
}
