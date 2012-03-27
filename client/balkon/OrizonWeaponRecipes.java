package net.minecraft.src.balkon;
import net.minecraft.src.*;

public class OrizonWeaponRecipes {
	
	public static void addStoneTools(ItemStack stack)
	{
		addStoneSpears(stack);
		addStoneKnives(stack);
		addStoneFlails(stack);
		addStoneBattleaxes(stack);
		addStoneWarhammers(stack);
		addStoneHalberds(stack);
	}
	
	private static void addStoneSpears(ItemStack stack)
	{
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stStoneSpear, 1), new Object[]
            { "m  ", " | ", "  |", 'm', stack, '|', mod_InfiTools.stoneRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saStoneSpear, 1), new Object[]
            { "m  ", " | ", "  |", 'm', stack, '|', mod_InfiTools.sandstoneRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bStoneSpear, 1), new Object[]
            { "m  ", " | ", "  |", 'm', stack, '|', Item.bone });

        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bStoneSpear, 1), new Object[]
            { "m  ", " | ", "  |", 'm', stack, '|', mod_InfiTools.boneRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pStoneSpear, 1), new Object[]
            { "m  ", " | ", "  |", 'm', stack, '|', mod_InfiTools.paperRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mStoneSpear, 1), new Object[]
            { "m  ", " | ", "  |", 'm', stack, '|', mod_InfiTools.mossyRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nStoneSpear, 1), new Object[]
            { "m  ", " | ", "  |", 'm', stack, '|', mod_InfiTools.netherrackRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceStoneSpear, 1), new Object[]
            { "m  ", " | ", "  |", 'm', stack, '|', mod_InfiTools.iceRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sStoneSpear, 1), new Object[]
            { "m  ", " | ", "  |", 'm', stack, '|', mod_InfiTools.slimeRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cStoneSpear, 1), new Object[]
            { "m  ", " | ", "  |", 'm', stack, '|', mod_InfiTools.cactusRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fStoneSpear, 1), new Object[]
            { "m  ", " | ", "  |", 'm', stack, '|', mod_InfiTools.flintRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brStoneSpear, 1), new Object[]
            { "m  ", " | ", "  |", 'm', stack, '|', mod_InfiTools.brickRod });
	}
	
	private static void addStoneKnives(ItemStack stack)
	{
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stStoneKnife, 1), new Object[]
            { "m|", 'm', stack, '|', mod_InfiTools.stoneRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saStoneKnife, 1), new Object[]
            { "m|", 'm', stack, '|', mod_InfiTools.sandstoneRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bStoneKnife, 1), new Object[]
            { "m|", 'm', stack, '|', Item.bone });

        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bStoneKnife, 1), new Object[]
            { "m|", 'm', stack, '|', mod_InfiTools.boneRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pStoneKnife, 1), new Object[]
            { "m|", 'm', stack, '|', mod_InfiTools.paperRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mStoneKnife, 1), new Object[]
            { "m|", 'm', stack, '|', mod_InfiTools.mossyRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nStoneKnife, 1), new Object[]
            { "m|", 'm', stack, '|', mod_InfiTools.netherrackRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceStoneKnife, 1), new Object[]
            { "m|", 'm', stack, '|', mod_InfiTools.iceRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sStoneKnife, 1), new Object[]
            { "m|", 'm', stack, '|', mod_InfiTools.slimeRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cStoneKnife, 1), new Object[]
            { "m|", 'm', stack, '|', mod_InfiTools.cactusRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fStoneKnife, 1), new Object[]
            { "m|", 'm', stack, '|', mod_InfiTools.flintRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brStoneKnife, 1), new Object[]
            { "m|", 'm', stack, '|', mod_InfiTools.brickRod });
	}
	
	private static void addStoneFlails(ItemStack stack)
	{
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stStoneFlail, 1), new Object[]
            { "s  ", "s| ", "m |", 'm', stack, '|', mod_InfiTools.stoneRod, 's', Item.silk });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saStoneFlail, 1), new Object[]
            { "s  ", "s| ", "m |", 'm', stack, '|', mod_InfiTools.sandstoneRod, 's', Item.silk });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bStoneFlail, 1), new Object[]
            { "s  ", "s| ", "m |", 'm', stack, '|', Item.bone, 's', Item.silk });

        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bStoneFlail, 1), new Object[]
            { "s  ", "s| ", "m |", 'm', stack, '|', mod_InfiTools.boneRod, 's', Item.silk });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pStoneFlail, 1), new Object[]
            { "s  ", "s| ", "m |", 'm', stack, '|', mod_InfiTools.paperRod, 's', Item.silk });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mStoneFlail, 1), new Object[]
            { "s  ", "s| ", "m |", 'm', stack, '|', mod_InfiTools.mossyRod, 's', Item.silk });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nStoneFlail, 1), new Object[]
            { "s  ", "s| ", "m |", 'm', stack, '|', mod_InfiTools.netherrackRod, 's', Item.silk });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceStoneFlail, 1), new Object[]
            { "s  ", "s| ", "m |", 'm', stack, '|', mod_InfiTools.iceRod, 's', Item.silk });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sStoneFlail, 1), new Object[]
            { "s  ", "s| ", "m |", 'm', stack, '|', mod_InfiTools.slimeRod, 's', Item.silk });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cStoneFlail, 1), new Object[]
            { "s  ", "s| ", "m |", 'm', stack, '|', mod_InfiTools.cactusRod, 's', Item.silk });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fStoneFlail, 1), new Object[]
            { "s  ", "s| ", "m |", 'm', stack, '|', mod_InfiTools.flintRod, 's', Item.silk });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brStoneFlail, 1), new Object[]
            { "s  ", "s| ", "m |", 'm', stack, '|', mod_InfiTools.brickRod, 's', Item.silk });
	}
	
	private static void addStoneBattleaxes(ItemStack stack)
	{
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stStoneBattleaxe, 1), new Object[]
            { "mmm", "m|m", " | ", 'm', stack, '|', mod_InfiTools.stoneRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saStoneBattleaxe, 1), new Object[]
            { "mmm", "m|m", " | ", 'm', stack, '|', mod_InfiTools.sandstoneRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bStoneBattleaxe, 1), new Object[]
            { "mmm", "m|m", " | ", 'm', stack, '|', Item.bone });

        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bStoneBattleaxe, 1), new Object[]
            { "mmm", "m|m", " | ", 'm', stack, '|', mod_InfiTools.boneRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pStoneBattleaxe, 1), new Object[]
            { "mmm", "m|m", " | ", 'm', stack, '|', mod_InfiTools.paperRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mStoneBattleaxe, 1), new Object[]
            { "mmm", "m|m", " | ", 'm', stack, '|', mod_InfiTools.mossyRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nStoneBattleaxe, 1), new Object[]
            { "mmm", "m|m", " | ", 'm', stack, '|', mod_InfiTools.netherrackRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceStoneBattleaxe, 1), new Object[]
            { "mmm", "m|m", " | ", 'm', stack, '|', mod_InfiTools.iceRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sStoneBattleaxe, 1), new Object[]
            { "mmm", "m|m", " | ", 'm', stack, '|', mod_InfiTools.slimeRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cStoneBattleaxe, 1), new Object[]
            { "mmm", "m|m", " | ", 'm', stack, '|', mod_InfiTools.cactusRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fStoneBattleaxe, 1), new Object[]
            { "mmm", "m|m", " | ", 'm', stack, '|', mod_InfiTools.flintRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brStoneBattleaxe, 1), new Object[]
            { "mmm", "m|m", " | ", 'm', stack, '|', mod_InfiTools.brickRod });
	}
	
	private static void addStoneWarhammers(ItemStack stack)
	{
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stStoneWarhammer, 1), new Object[]
            { "m|m", "m|m", " | ", 'm', stack, '|', mod_InfiTools.stoneRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saStoneWarhammer, 1), new Object[]
            { "m|m", "m|m", " | ", 'm', stack, '|', mod_InfiTools.sandstoneRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bStoneWarhammer, 1), new Object[]
            { "m|m", "m|m", " | ", 'm', stack, '|', Item.bone });

        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bStoneWarhammer, 1), new Object[]
            { "m|m", "m|m", " | ", 'm', stack, '|', mod_InfiTools.boneRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pStoneWarhammer, 1), new Object[]
            { "m|m", "m|m", " | ", 'm', stack, '|', mod_InfiTools.paperRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mStoneWarhammer, 1), new Object[]
            { "m|m", "m|m", " | ", 'm', stack, '|', mod_InfiTools.mossyRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nStoneWarhammer, 1), new Object[]
            { "m|m", "m|m", " | ", 'm', stack, '|', mod_InfiTools.netherrackRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceStoneWarhammer, 1), new Object[]
            { "m|m", "m|m", " | ", 'm', stack, '|', mod_InfiTools.iceRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sStoneWarhammer, 1), new Object[]
            { "m|m", "m|m", " | ", 'm', stack, '|', mod_InfiTools.slimeRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cStoneWarhammer, 1), new Object[]
            { "m|m", "m|m", " | ", 'm', stack, '|', mod_InfiTools.cactusRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fStoneWarhammer, 1), new Object[]
            { "m|m", "m|m", " | ", 'm', stack, '|', mod_InfiTools.flintRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brStoneWarhammer, 1), new Object[]
            { "m|m", "m|m", " | ", 'm', stack, '|', mod_InfiTools.brickRod });
	}
	
	private static void addStoneHalberds(ItemStack stack)
	{
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stStoneHalberd, 1), new Object[]
            { " mm", " |m", "|  ", 'm', stack, '|', mod_InfiTools.stoneRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saStoneHalberd, 1), new Object[]
            { " mm", " |m", "|  ", 'm', stack, '|', mod_InfiTools.sandstoneRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bStoneHalberd, 1), new Object[]
            { " mm", " |m", "|  ", 'm', stack, '|', Item.bone });

        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bStoneHalberd, 1), new Object[]
            { " mm", " |m", "|  ", 'm', stack, '|', mod_InfiTools.boneRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pStoneHalberd, 1), new Object[]
            { " mm", " |m", "|  ", 'm', stack, '|', mod_InfiTools.paperRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mStoneHalberd, 1), new Object[]
            { " mm", " |m", "|  ", 'm', stack, '|', mod_InfiTools.mossyRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nStoneHalberd, 1), new Object[]
            { " mm", " |m", "|  ", 'm', stack, '|', mod_InfiTools.netherrackRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceStoneHalberd, 1), new Object[]
            { " mm", " |m", "|  ", 'm', stack, '|', mod_InfiTools.iceRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sStoneHalberd, 1), new Object[]
            { " mm", " |m", "|  ", 'm', stack, '|', mod_InfiTools.slimeRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cStoneHalberd, 1), new Object[]
            { " mm", " |m", "|  ", 'm', stack, '|', mod_InfiTools.cactusRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fStoneHalberd, 1), new Object[]
            { " mm", " |m", "|  ", 'm', stack, '|', mod_InfiTools.flintRod });
        
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brStoneHalberd, 1), new Object[]
            { " mm", " |m", "|  ", 'm', stack, '|', mod_InfiTools.brickRod });
	}
}
