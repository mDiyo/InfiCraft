package net.minecraft.src.fryingpans;
import net.minecraft.src.*;

public class OrizonFryingPanRecipes {
	
	public static void addStoneTools(ItemStack stack)
	{
		addStoneFryingPans(stack);
	}
	
	private static void addStoneFryingPans(ItemStack stack)
	{
        ModLoader.addRecipe(new ItemStack(mod_InfiCooking.stStoneFryingPan, 1), new Object[]
            { "m  ", " | ", "  |", 'm', stack, '|', mod_InfiTools.stoneRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiCooking.saStoneFryingPan, 1), new Object[]
            { "m  ", " | ", "  |", 'm', stack, '|', mod_InfiTools.sandstoneRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiCooking.bStoneFryingPan, 1), new Object[]
            { "m  ", " | ", "  |", 'm', stack, '|', Item.bone });

        ModLoader.addRecipe(new ItemStack(mod_InfiCooking.bStoneFryingPan, 1), new Object[]
            { "m  ", " | ", "  |", 'm', stack, '|', mod_InfiTools.boneRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiCooking.pStoneFryingPan, 1), new Object[]
            { "m  ", " | ", "  |", 'm', stack, '|', mod_InfiTools.paperRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiCooking.mStoneFryingPan, 1), new Object[]
            { "m  ", " | ", "  |", 'm', stack, '|', mod_InfiTools.mossyRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiCooking.nStoneFryingPan, 1), new Object[]
            { "m  ", " | ", "  |", 'm', stack, '|', mod_InfiTools.netherrackRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiCooking.iceStoneFryingPan, 1), new Object[]
            { "m  ", " | ", "  |", 'm', stack, '|', mod_InfiTools.iceRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiCooking.sStoneFryingPan, 1), new Object[]
            { "m  ", " | ", "  |", 'm', stack, '|', mod_InfiTools.slimeRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiCooking.cStoneFryingPan, 1), new Object[]
            { "m  ", " | ", "  |", 'm', stack, '|', mod_InfiTools.cactusRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiCooking.fStoneFryingPan, 1), new Object[]
            { "m  ", " | ", "  |", 'm', stack, '|', mod_InfiTools.flintRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiCooking.brStoneFryingPan, 1), new Object[]
            { "m  ", " | ", "  |", 'm', stack, '|', mod_InfiTools.brickRod });
	}
}
