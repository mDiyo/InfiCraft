package net.minecraft.src.hybrids;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.src.mod_InfiHybrids;
import net.minecraft.src.mod_InfiHybrids;
import net.minecraft.src.mod_InfiTools;

public class OrizonHybridRecipes {
	
	public static void addStoneTools(ItemStack stack)
	{
		addStoneIceAxes(stack);
		addStoneMattocks(stack);
		addStoneHammers(stack);
	}
	
	private static void addStoneIceAxes(ItemStack stack)
	{
        ModLoader.addRecipe(new ItemStack(mod_InfiHybrids.wStoneIceAxe, 1), new Object[]
            { "mms", " | ", " | ", 'm', stack, '|', Item.stick, 's', mod_InfiTools.stoneShard });

        ModLoader.addRecipe(new ItemStack(mod_InfiHybrids.stStoneIceAxe, 1), new Object[]
            { "mms", " | ", " | ", 'm', stack, '|', mod_InfiTools.stoneRod, 's', mod_InfiTools.stoneShard });
  
        ModLoader.addRecipe(new ItemStack(mod_InfiHybrids.saStoneIceAxe, 1), new Object[]
            { "mms", " | ", " | ", 'm', stack, '|', mod_InfiTools.sandstoneRod, 's', mod_InfiTools.stoneShard });

        ModLoader.addRecipe(new ItemStack(mod_InfiHybrids.bStoneIceAxe, 1), new Object[]
            { "mms", " | ", " | ", 'm', stack, '|', Item.bone, 's', mod_InfiTools.stoneShard });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiHybrids.bStoneIceAxe, 1), new Object[]
            { "mms", " | ", " | ", 'm', stack, '|', mod_InfiTools.boneRod, 's', mod_InfiTools.stoneShard });

        ModLoader.addRecipe(new ItemStack(mod_InfiHybrids.pStoneIceAxe, 1), new Object[]
            { "mms", " | ", " | ", 'm', stack, '|', mod_InfiTools.paperRod, 's', mod_InfiTools.stoneShard });
    
        ModLoader.addRecipe(new ItemStack(mod_InfiHybrids.mStoneIceAxe, 1), new Object[]
            { "mms", " | ", " | ", 'm', stack, '|', mod_InfiTools.mossyRod, 's', mod_InfiTools.stoneShard });

        ModLoader.addRecipe(new ItemStack(mod_InfiHybrids.nStoneIceAxe, 1), new Object[]
            { "mms", " | ", " | ", 'm', stack, '|', mod_InfiTools.netherrackRod, 's', mod_InfiTools.stoneShard });

        ModLoader.addRecipe(new ItemStack(mod_InfiHybrids.iceStoneIceAxe, 1), new Object[]
            { "mms", " | ", " | ", 'm', stack, '|', mod_InfiTools.iceRod, 's', mod_InfiTools.stoneShard });

        ModLoader.addRecipe(new ItemStack(mod_InfiHybrids.sStoneIceAxe, 1), new Object[]
            { "mms", " | ", " | ", 'm', stack, '|', mod_InfiTools.slimeRod, 's', mod_InfiTools.stoneShard });

        ModLoader.addRecipe(new ItemStack(mod_InfiHybrids.cStoneIceAxe, 1), new Object[]
            { "mms", " | ", " | ", 'm', stack, '|', mod_InfiTools.cactusRod, 's', mod_InfiTools.stoneShard });

        ModLoader.addRecipe(new ItemStack(mod_InfiHybrids.fStoneIceAxe, 1), new Object[]
            { "mms", " | ", " | ", 'm', stack, '|', mod_InfiTools.flintRod, 's', mod_InfiTools.stoneShard });

        ModLoader.addRecipe(new ItemStack(mod_InfiHybrids.brStoneIceAxe, 1), new Object[]
            { "mms", " | ", " | ", 'm', stack, '|', mod_InfiTools.brickRod, 's', mod_InfiTools.stoneShard });
	}
	
	private static void addStoneMattocks(ItemStack stack)
	{
        ModLoader.addRecipe(new ItemStack(mod_InfiHybrids.stStoneMattock, 1), new Object[]
            { "mmm", "m| ", " | ", 'm', stack, '|', mod_InfiTools.stoneRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiHybrids.saStoneMattock, 1), new Object[]
            { "mmm", "m| ", " | ", 'm', stack, '|', mod_InfiTools.sandstoneRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiHybrids.bStoneMattock, 1), new Object[]
            { "mmm", "m| ", " | ", 'm', stack, '|', Item.bone });

        ModLoader.addRecipe(new ItemStack(mod_InfiHybrids.bStoneMattock, 1), new Object[]
            { "mmm", "m| ", " | ", 'm', stack, '|', mod_InfiTools.boneRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiHybrids.pStoneMattock, 1), new Object[]
            { "mmm", "m| ", " | ", 'm', stack, '|', mod_InfiTools.paperRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiHybrids.mStoneMattock, 1), new Object[]
            { "mmm", "m| ", " | ", 'm', stack, '|', mod_InfiTools.mossyRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiHybrids.nStoneMattock, 1), new Object[]
            { "mmm", "m| ", " | ", 'm', stack, '|', mod_InfiTools.netherrackRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiHybrids.iceStoneMattock, 1), new Object[]
            { "mmm", "m| ", " | ", 'm', stack, '|', mod_InfiTools.iceRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiHybrids.sStoneMattock, 1), new Object[]
            { "mmm", "m| ", " | ", 'm', stack, '|', mod_InfiTools.slimeRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiHybrids.cStoneMattock, 1), new Object[]
            { "mmm", "m| ", " | ", 'm', stack, '|', mod_InfiTools.cactusRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiHybrids.fStoneMattock, 1), new Object[]
            { "mmm", "m| ", " | ", 'm', stack, '|', mod_InfiTools.flintRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiHybrids.brStoneMattock, 1), new Object[]
            { "mmm", "m| ", " | ", 'm', stack, '|', mod_InfiTools.brickRod });
	}
	
	private static void addStoneHammers(ItemStack stack)
	{
        ModLoader.addRecipe(new ItemStack(mod_InfiHybrids.stStoneHammer, 1), new Object[]
            { "mm", "mm", " |", 'm', stack, '|', mod_InfiTools.stoneRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiHybrids.saStoneHammer, 1), new Object[]
            { "mm", "mm", " |", 'm', stack, '|', mod_InfiTools.sandstoneRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiHybrids.bStoneHammer, 1), new Object[]
            { "mm", "mm", " |", 'm', stack, '|', Item.bone });

        ModLoader.addRecipe(new ItemStack(mod_InfiHybrids.bStoneHammer, 1), new Object[]
            { "mm", "mm", " |", 'm', stack, '|', mod_InfiTools.boneRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiHybrids.pStoneHammer, 1), new Object[]
            { "mm", "mm", " |", 'm', stack, '|', mod_InfiTools.paperRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiHybrids.mStoneHammer, 1), new Object[]
            { "mm", "mm", " |", 'm', stack, '|', mod_InfiTools.mossyRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiHybrids.nStoneHammer, 1), new Object[]
            { "mm", "mm", " |", 'm', stack, '|', mod_InfiTools.netherrackRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiHybrids.iceStoneHammer, 1), new Object[]
            { "mm", "mm", " |", 'm', stack, '|', mod_InfiTools.iceRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiHybrids.sStoneHammer, 1), new Object[]
            { "mm", "mm", " |", 'm', stack, '|', mod_InfiTools.slimeRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiHybrids.cStoneHammer, 1), new Object[]
            { "mm", "mm", " |", 'm', stack, '|', mod_InfiTools.cactusRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiHybrids.fStoneHammer, 1), new Object[]
            { "mm", "mm", " |", 'm', stack, '|', mod_InfiTools.flintRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiHybrids.brStoneHammer, 1), new Object[]
            { "mm", "mm", " |", 'm', stack, '|', mod_InfiTools.brickRod });
	}
}
