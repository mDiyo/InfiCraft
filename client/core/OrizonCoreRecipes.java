package net.minecraft.src.core;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.src.mod_InfiTools;

public class OrizonCoreRecipes {
	
	public static void addStoneTools(ItemStack stack)
	{
		addStoneAxes(stack);
		addStoneSwords(stack);
		addStonePickaxes(stack);
		addStoneShovels(stack);
		addStoneHoes(stack);
		ModLoader.addRecipe(new ItemStack(mod_InfiTools.stoneRod, 4), new Object[]
	            { "m", "m", 'm', stack });
	}
	
	private static void addStoneAxes(ItemStack stack)
	{
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.stStoneAxe, 1), new Object[]
            { "mm", "m|", " |", 'm', stack, '|', mod_InfiTools.stoneRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.saStoneAxe, 1), new Object[]
            { "mm", "m|", " |", 'm', stack, '|', mod_InfiTools.sandstoneRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bStoneAxe, 1), new Object[]
            { "mm", "m|", " |", 'm', stack, '|', Item.bone });

        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bStoneAxe, 1), new Object[]
            { "mm", "m|", " |", 'm', stack, '|', mod_InfiTools.boneRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.pStoneAxe, 1), new Object[]
            { "mm", "m|", " |", 'm', stack, '|', mod_InfiTools.paperRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.mStoneAxe, 1), new Object[]
            { "mm", "m|", " |", 'm', stack, '|', mod_InfiTools.mossyRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.nStoneAxe, 1), new Object[]
            { "mm", "m|", " |", 'm', stack, '|', mod_InfiTools.netherrackRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.iceStoneAxe, 1), new Object[]
            { "mm", "m|", " |", 'm', stack, '|', mod_InfiTools.iceRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.sStoneAxe, 1), new Object[]
            { "mm", "m|", " |", 'm', stack, '|', mod_InfiTools.slimeRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.cStoneAxe, 1), new Object[]
            { "mm", "m|", " |", 'm', stack, '|', mod_InfiTools.cactusRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.fStoneAxe, 1), new Object[]
            { "mm", "m|", " |", 'm', stack, '|', mod_InfiTools.flintRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.brStoneAxe, 1), new Object[]
            { "mm", "m|", " |", 'm', stack, '|', mod_InfiTools.brickRod });
	}
	
	private static void addStoneSwords(ItemStack stack)
	{
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.stStoneSword, 1), new Object[]
            { "m", "m", "|", 'm', stack, '|', mod_InfiTools.stoneRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.saStoneSword, 1), new Object[]
            { "m", "m", "|", 'm', stack, '|', mod_InfiTools.sandstoneRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bStoneSword, 1), new Object[]
            { "m", "m", "|", 'm', stack, '|', Item.bone });

        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bStoneSword, 1), new Object[]
            { "m", "m", "|", 'm', stack, '|', mod_InfiTools.boneRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.pStoneSword, 1), new Object[]
            { "m", "m", "|", 'm', stack, '|', mod_InfiTools.paperRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.mStoneSword, 1), new Object[]
            { "m", "m", "|", 'm', stack, '|', mod_InfiTools.mossyRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.nStoneSword, 1), new Object[]
            { "m", "m", "|", 'm', stack, '|', mod_InfiTools.netherrackRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.iceStoneSword, 1), new Object[]
            { "m", "m", "|", 'm', stack, '|', mod_InfiTools.iceRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.sStoneSword, 1), new Object[]
            { "m", "m", "|", 'm', stack, '|', mod_InfiTools.slimeRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.cStoneSword, 1), new Object[]
            { "m", "m", "|", 'm', stack, '|', mod_InfiTools.cactusRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.fStoneSword, 1), new Object[]
            { "m", "m", "|", 'm', stack, '|', mod_InfiTools.flintRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.brStoneSword, 1), new Object[]
            { "m", "m", "|", 'm', stack, '|', mod_InfiTools.brickRod });
	}
	
	private static void addStonePickaxes(ItemStack stack)
	{
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.stStonePickaxe, 1), new Object[]
            { "mmm", " | ", " | ", 'm', stack, '|', mod_InfiTools.stoneRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.saStonePickaxe, 1), new Object[]
            { "mmm", " | ", " | ", 'm', stack, '|', mod_InfiTools.sandstoneRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bStonePickaxe, 1), new Object[]
            { "mmm", " | ", " | ", 'm', stack, '|', Item.bone });

        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bStonePickaxe, 1), new Object[]
            { "mmm", " | ", " | ", 'm', stack, '|', mod_InfiTools.boneRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.pStonePickaxe, 1), new Object[]
            { "mmm", " | ", " | ", 'm', stack, '|', mod_InfiTools.paperRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.mStonePickaxe, 1), new Object[]
            { "mmm", " | ", " | ", 'm', stack, '|', mod_InfiTools.mossyRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.nStonePickaxe, 1), new Object[]
            { "mmm", " | ", " | ", 'm', stack, '|', mod_InfiTools.netherrackRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.iceStonePickaxe, 1), new Object[]
            { "mmm", " | ", " | ", 'm', stack, '|', mod_InfiTools.iceRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.sStonePickaxe, 1), new Object[]
            { "mmm", " | ", " | ", 'm', stack, '|', mod_InfiTools.slimeRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.cStonePickaxe, 1), new Object[]
            { "mmm", " | ", " | ", 'm', stack, '|', mod_InfiTools.cactusRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.fStonePickaxe, 1), new Object[]
            { "mmm", " | ", " | ", 'm', stack, '|', mod_InfiTools.flintRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.brStonePickaxe, 1), new Object[]
            { "mmm", " | ", " | ", 'm', stack, '|', mod_InfiTools.brickRod });
	}
	
	private static void addStoneShovels(ItemStack stack)
	{
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.stStoneShovel, 1), new Object[]
            { "m", "|", "|", 'm', stack, '|', mod_InfiTools.stoneRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.saStoneShovel, 1), new Object[]
            { "m", "|", "|", 'm', stack, '|', mod_InfiTools.sandstoneRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bStoneShovel, 1), new Object[]
            { "m", "|", "|", 'm', stack, '|', Item.bone });

        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bStoneShovel, 1), new Object[]
            { "m", "|", "|", 'm', stack, '|', mod_InfiTools.boneRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.pStoneShovel, 1), new Object[]
            { "m", "|", "|", 'm', stack, '|', mod_InfiTools.paperRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.mStoneShovel, 1), new Object[]
            { "m", "|", "|", 'm', stack, '|', mod_InfiTools.mossyRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.nStoneShovel, 1), new Object[]
            { "m", "|", "|", 'm', stack, '|', mod_InfiTools.netherrackRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.iceStoneShovel, 1), new Object[]
            { "m", "|", "|", 'm', stack, '|', mod_InfiTools.iceRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.sStoneShovel, 1), new Object[]
            { "m", "|", "|", 'm', stack, '|', mod_InfiTools.slimeRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.cStoneShovel, 1), new Object[]
            { "m", "|", "|", 'm', stack, '|', mod_InfiTools.cactusRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.fStoneShovel, 1), new Object[]
            { "m", "|", "|", 'm', stack, '|', mod_InfiTools.flintRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.brStoneShovel, 1), new Object[]
            { "m", "|", "|", 'm', stack, '|', mod_InfiTools.brickRod });
	}
	
	private static void addStoneHoes(ItemStack stack)
	{
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.stStoneHoe, 1), new Object[]
            { "mm", " |", " |", 'm', stack, '|', mod_InfiTools.stoneRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.saStoneHoe, 1), new Object[]
            { "mm", " |", " |", 'm', stack, '|', mod_InfiTools.sandstoneRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bStoneHoe, 1), new Object[]
            { "mm", " |", " |", 'm', stack, '|', Item.bone });

        ModLoader.addRecipe(new ItemStack(mod_InfiTools.bStoneHoe, 1), new Object[]
            { "mm", " |", " |", 'm', stack, '|', mod_InfiTools.boneRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.pStoneHoe, 1), new Object[]
            { "mm", " |", " |", 'm', stack, '|', mod_InfiTools.paperRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.mStoneHoe, 1), new Object[]
            { "mm", " |", " |", 'm', stack, '|', mod_InfiTools.mossyRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.nStoneHoe, 1), new Object[]
            { "mm", " |", " |", 'm', stack, '|', mod_InfiTools.netherrackRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.iceStoneHoe, 1), new Object[]
            { "mm", " |", " |", 'm', stack, '|', mod_InfiTools.iceRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.sStoneHoe, 1), new Object[]
            { "mm", " |", " |", 'm', stack, '|', mod_InfiTools.slimeRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.cStoneHoe, 1), new Object[]
            { "mm", " |", " |", 'm', stack, '|', mod_InfiTools.cactusRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.fStoneHoe, 1), new Object[]
            { "mm", " |", " |", 'm', stack, '|', mod_InfiTools.flintRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiTools.brStoneHoe, 1), new Object[]
            { "mm", " |", " |", 'm', stack, '|', mod_InfiTools.brickRod });
	}
}
