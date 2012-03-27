package net.minecraft.src.balkon;

import net.minecraft.src.*;

public class BalkRecipeSpears
{
    public BalkRecipeSpears()
    {
    }

    public static int recipeStorm()
    {
        mod_InfiWeapons.stWoodSpear.setIconCoord(1, 0);
        ModLoader.addName(mod_InfiWeapons.stWoodSpear, "Stony Wooden Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stWoodSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.saWoodSpear.setIconCoord(2, 0);
        ModLoader.addName(mod_InfiWeapons.saWoodSpear, "Sandy Wooden Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saWoodSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bWoodSpear.setIconCoord(3, 0);
        ModLoader.addName(mod_InfiWeapons.bWoodSpear, "Necrotic Wooden Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bWoodSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bWoodSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.pWoodSpear.setIconCoord(4, 0);
        ModLoader.addName(mod_InfiWeapons.pWoodSpear, "Fibery Wooden Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pWoodSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_InfiWeapons.nWoodSpear.setIconCoord(5, 0);
        ModLoader.addName(mod_InfiWeapons.nWoodSpear, "Bloody Wooden Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nWoodSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.sWoodSpear.setIconCoord(6, 0);
        ModLoader.addName(mod_InfiWeapons.sWoodSpear, "Slimy Wooden Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sWoodSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cWoodSpear.setIconCoord(7, 0);
        ModLoader.addName(mod_InfiWeapons.cWoodSpear, "Spiny Wooden Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cWoodSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fWoodSpear.setIconCoord(8, 0);
        ModLoader.addName(mod_InfiWeapons.fWoodSpear, "Flaky Wooden Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fWoodSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brWoodSpear.setIconCoord(9, 0);
        ModLoader.addName(mod_InfiWeapons.brWoodSpear, "Baked Wooden Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brWoodSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.stStoneSpear.setIconCoord(1, 1);
        ModLoader.addName(mod_InfiWeapons.stStoneSpear, "Heavy Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.saStoneSpear.setIconCoord(2, 1);
        ModLoader.addName(mod_InfiWeapons.saStoneSpear, "Sandy Stone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bStoneSpear.setIconCoord(3, 1);
        ModLoader.addName(mod_InfiWeapons.bStoneSpear, "Necrotic Stone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.stone, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.pStoneSpear.setIconCoord(4, 1);
        ModLoader.addName(mod_InfiWeapons.pStoneSpear, "Fibery Stone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_InfiWeapons.mStoneSpear.setIconCoord(5, 1);
        ModLoader.addName(mod_InfiWeapons.mStoneSpear, "Mossy Stone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.nStoneSpear.setIconCoord(6, 1);
        ModLoader.addName(mod_InfiWeapons.nStoneSpear, "Bloody Stone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.iceStoneSpear.setIconCoord(7, 1);
        ModLoader.addName(mod_InfiWeapons.iceStoneSpear, "Icy Stone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.sStoneSpear.setIconCoord(8, 1);
        ModLoader.addName(mod_InfiWeapons.sStoneSpear, "Slimy Stone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cStoneSpear.setIconCoord(9, 1);
        ModLoader.addName(mod_InfiWeapons.cStoneSpear, "Spiny Stone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fStoneSpear.setIconCoord(10, 1);
        ModLoader.addName(mod_InfiWeapons.fStoneSpear, "Flaky Stone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brStoneSpear.setIconCoord(11, 1);
        ModLoader.addName(mod_InfiWeapons.brStoneSpear, "Baked Stone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brStoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.stIronSpear.setIconCoord(1, 2);
        ModLoader.addName(mod_InfiWeapons.stIronSpear, "Stony Iron Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stIronSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iIronSpear.setIconCoord(2, 2);
        ModLoader.addName(mod_InfiWeapons.iIronSpear, "Ironic Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iIronSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.dIronSpear.setIconCoord(3, 2);
        ModLoader.addName(mod_InfiWeapons.dIronSpear, "Jeweled Iron Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dIronSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.gIronSpear.setIconCoord(4, 2);
        ModLoader.addName(mod_InfiWeapons.gIronSpear, "Expensive Iron Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.gIronSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_InfiWeapons.rIronSpear.setIconCoord(5, 2);
        ModLoader.addName(mod_InfiWeapons.rIronSpear, "Red Iron Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rIronSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oIronSpear.setIconCoord(6, 2);
        ModLoader.addName(mod_InfiWeapons.oIronSpear, "Glassy Iron Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oIronSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.bIronSpear.setIconCoord(7, 2);
        ModLoader.addName(mod_InfiWeapons.bIronSpear, "Necrotic Iron Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bIronSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bIronSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.nIronSpear.setIconCoord(8, 2);
        ModLoader.addName(mod_InfiWeapons.nIronSpear, "Bloody Iron Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nIronSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glIronSpear.setIconCoord(9, 2);
        ModLoader.addName(mod_InfiWeapons.glIronSpear, "Glowing Iron Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glIronSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.iceIronSpear.setIconCoord(10, 2);
        ModLoader.addName(mod_InfiWeapons.iceIronSpear, "Icy Iron Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceIronSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.sIronSpear.setIconCoord(11, 2);
        ModLoader.addName(mod_InfiWeapons.sIronSpear, "Slimy Iron Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sIronSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.blIronSpear.setIconCoord(12, 2);
        ModLoader.addName(mod_InfiWeapons.blIronSpear, "Blazing Iron Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blIronSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.stDiamondSpear.setIconCoord(1, 3);
        ModLoader.addName(mod_InfiWeapons.stDiamondSpear, "Stony Diamond Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stDiamondSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iDiamondSpear.setIconCoord(2, 3);
        ModLoader.addName(mod_InfiWeapons.iDiamondSpear, "Hard Diamond Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iDiamondSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.dDiamondSpear.setIconCoord(3, 3);
        ModLoader.addName(mod_InfiWeapons.dDiamondSpear, "Diamondium Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dDiamondSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.gDiamondSpear.setIconCoord(4, 3);
        ModLoader.addName(mod_InfiWeapons.gDiamondSpear, "Expensive Diamond Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.gDiamondSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_InfiWeapons.rDiamondSpear.setIconCoord(5, 3);
        ModLoader.addName(mod_InfiWeapons.rDiamondSpear, "Red Diamond Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rDiamondSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oDiamondSpear.setIconCoord(6, 3);
        ModLoader.addName(mod_InfiWeapons.oDiamondSpear, "Glassy Diamond Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oDiamondSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.bDiamondSpear.setIconCoord(7, 3);
        ModLoader.addName(mod_InfiWeapons.bDiamondSpear, "Necrotic Diamond Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bDiamondSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bDiamondSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.mDiamondSpear.setIconCoord(8, 3);
        ModLoader.addName(mod_InfiWeapons.mDiamondSpear, "Mossy Diamond Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mDiamondSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.nDiamondSpear.setIconCoord(9, 3);
        ModLoader.addName(mod_InfiWeapons.nDiamondSpear, "Bloody Diamond Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nDiamondSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glDiamondSpear.setIconCoord(10, 3);
        ModLoader.addName(mod_InfiWeapons.glDiamondSpear, "Glowing Diamond Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glDiamondSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.blDiamondSpear.setIconCoord(11, 3);
        ModLoader.addName(mod_InfiWeapons.blDiamondSpear, "Blazing Diamond Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blDiamondSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.stGoldSpear.setIconCoord(1, 4);
        ModLoader.addName(mod_InfiWeapons.stGoldSpear, "Stony Gold Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stGoldSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.gGoldSpear.setIconCoord(2, 4);
        ModLoader.addName(mod_InfiWeapons.gGoldSpear, "Expensive Useless Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.gGoldSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_InfiWeapons.oGoldSpear.setIconCoord(3, 4);
        ModLoader.addName(mod_InfiWeapons.oGoldSpear, "Glassy Gold Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oGoldSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.saGoldSpear.setIconCoord(4, 4);
        ModLoader.addName(mod_InfiWeapons.saGoldSpear, "Sandy Gold Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saGoldSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bGoldSpear.setIconCoord(5, 4);
        ModLoader.addName(mod_InfiWeapons.bGoldSpear, "Necrotic Gold Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bGoldSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bGoldSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.mGoldSpear.setIconCoord(6, 4);
        ModLoader.addName(mod_InfiWeapons.mGoldSpear, "Mossy Gold Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mGoldSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.nGoldSpear.setIconCoord(7, 4);
        ModLoader.addName(mod_InfiWeapons.nGoldSpear, "Bloody Gold Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nGoldSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glGoldSpear.setIconCoord(8, 4);
        ModLoader.addName(mod_InfiWeapons.glGoldSpear, "Glowing Gold Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glGoldSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.iceGoldSpear.setIconCoord(9, 4);
        ModLoader.addName(mod_InfiWeapons.iceGoldSpear, "Icy Gold Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceGoldSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.sGoldSpear.setIconCoord(10, 4);
        ModLoader.addName(mod_InfiWeapons.sGoldSpear, "Slimy Gold Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sGoldSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.fGoldSpear.setIconCoord(11, 4);
        ModLoader.addName(mod_InfiWeapons.fGoldSpear, "Flaky Gold Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fGoldSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.wRedstoneSpear.setIconCoord(0, 5);
        ModLoader.addName(mod_InfiWeapons.wRedstoneSpear, "Redstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wRedstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stRedstoneSpear.setIconCoord(1, 5);
        ModLoader.addName(mod_InfiWeapons.stRedstoneSpear, "Stony Redstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stRedstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iRedstoneSpear.setIconCoord(2, 5);
        ModLoader.addName(mod_InfiWeapons.iRedstoneSpear, "Hard Redstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iRedstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.dRedstoneSpear.setIconCoord(3, 5);
        ModLoader.addName(mod_InfiWeapons.dRedstoneSpear, "Jeweled Redstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dRedstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.rRedstoneSpear.setIconCoord(4, 5);
        ModLoader.addName(mod_InfiWeapons.rRedstoneSpear, "Redredred Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rRedstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oRedstoneSpear.setIconCoord(5, 5);
        ModLoader.addName(mod_InfiWeapons.oRedstoneSpear, "Glassy Redstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oRedstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.bRedstoneSpear.setIconCoord(6, 5);
        ModLoader.addName(mod_InfiWeapons.bRedstoneSpear, "Necrotic Redstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bRedstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bRedstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.mRedstoneSpear.setIconCoord(7, 5);
        ModLoader.addName(mod_InfiWeapons.mRedstoneSpear, "Mossy Redstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mRedstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.glRedstoneSpear.setIconCoord(8, 5);
        ModLoader.addName(mod_InfiWeapons.glRedstoneSpear, "Glowing Redstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glRedstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.sRedstoneSpear.setIconCoord(9, 5);
        ModLoader.addName(mod_InfiWeapons.sRedstoneSpear, "Slimy Redstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sRedstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.blRedstoneSpear.setIconCoord(10, 5);
        ModLoader.addName(mod_InfiWeapons.blRedstoneSpear, "Blazing Redstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blRedstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.wObsidianSpear.setIconCoord(0, 6);
        ModLoader.addName(mod_InfiWeapons.wObsidianSpear, "Obsidian Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wObsidianSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stObsidianSpear.setIconCoord(1, 6);
        ModLoader.addName(mod_InfiWeapons.stObsidianSpear, "Stony Obsidian Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stObsidianSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iObsidianSpear.setIconCoord(2, 6);
        ModLoader.addName(mod_InfiWeapons.iObsidianSpear, "Hard Obsidian Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iObsidianSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.dObsidianSpear.setIconCoord(3, 6);
        ModLoader.addName(mod_InfiWeapons.dObsidianSpear, "Jeweled Obsidian Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dObsidianSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.gObsidianSpear.setIconCoord(4, 6);
        ModLoader.addName(mod_InfiWeapons.gObsidianSpear, "Expensive Obsidian Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.gObsidianSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_InfiWeapons.rObsidianSpear.setIconCoord(5, 6);
        ModLoader.addName(mod_InfiWeapons.rObsidianSpear, "Red Obsidian Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rObsidianSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oObsidianSpear.setIconCoord(6, 6);
        ModLoader.addName(mod_InfiWeapons.oObsidianSpear, "Wicked Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oObsidianSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.bObsidianSpear.setIconCoord(7, 6);
        ModLoader.addName(mod_InfiWeapons.bObsidianSpear, "Necrotic Obsidian Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bObsidianSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bObsidianSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.nObsidianSpear.setIconCoord(8, 6);
        ModLoader.addName(mod_InfiWeapons.nObsidianSpear, "Bloody Obsidian Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nObsidianSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glObsidianSpear.setIconCoord(9, 6);
        ModLoader.addName(mod_InfiWeapons.glObsidianSpear, "Glowing Obsidian Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glObsidianSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.sObsidianSpear.setIconCoord(10, 6);
        ModLoader.addName(mod_InfiWeapons.sObsidianSpear, "Slimy Obsidian Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sObsidianSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.fObsidianSpear.setIconCoord(11, 6);
        ModLoader.addName(mod_InfiWeapons.fObsidianSpear, "Flaky Obsidian Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fObsidianSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.blObsidianSpear.setIconCoord(12, 6);
        ModLoader.addName(mod_InfiWeapons.blObsidianSpear, "Blazing Obsidian Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blObsidianSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.wSandstoneSpear.setIconCoord(0, 7);
        ModLoader.addName(mod_InfiWeapons.wSandstoneSpear, "Sandstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wSandstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stSandstoneSpear.setIconCoord(1, 7);
        ModLoader.addName(mod_InfiWeapons.stSandstoneSpear, "Stony Sandstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stSandstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.saSandstoneSpear.setIconCoord(2, 7);
        ModLoader.addName(mod_InfiWeapons.saSandstoneSpear, "Sandpoke");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saSandstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bSandstoneSpear.setIconCoord(3, 7);
        ModLoader.addName(mod_InfiWeapons.bSandstoneSpear, "Necrotic Sandstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bSandstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bSandstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.pSandstoneSpear.setIconCoord(4, 7);
        ModLoader.addName(mod_InfiWeapons.pSandstoneSpear, "Fibery Sandstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pSandstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_InfiWeapons.nSandstoneSpear.setIconCoord(5, 7);
        ModLoader.addName(mod_InfiWeapons.nSandstoneSpear, "Bloody Sandstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nSandstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.iceSandstoneSpear.setIconCoord(6, 7);
        ModLoader.addName(mod_InfiWeapons.iceSandstoneSpear, "Icy Sandstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceSandstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.sSandstoneSpear.setIconCoord(7, 7);
        ModLoader.addName(mod_InfiWeapons.sSandstoneSpear, "Slimy Sandstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sSandstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cSandstoneSpear.setIconCoord(8, 7);
        ModLoader.addName(mod_InfiWeapons.cSandstoneSpear, "Spiny Sandstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cSandstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fSandstoneSpear.setIconCoord(9, 7);
        ModLoader.addName(mod_InfiWeapons.fSandstoneSpear, "Flaky Sandstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fSandstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brSandstoneSpear.setIconCoord(10, 7);
        ModLoader.addName(mod_InfiWeapons.brSandstoneSpear, "Baked Sandstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brSandstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.wBoneSpear.setIconCoord(0, 8);
        ModLoader.addName(mod_InfiWeapons.wBoneSpear, "Bone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wBoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.bone, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stBoneSpear.setIconCoord(1, 8);
        ModLoader.addName(mod_InfiWeapons.stBoneSpear, "Stony Bone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stBoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iBoneSpear.setIconCoord(2, 8);
        ModLoader.addName(mod_InfiWeapons.iBoneSpear, "Hard Bone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iBoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.dBoneSpear.setIconCoord(3, 8);
        ModLoader.addName(mod_InfiWeapons.dBoneSpear, "Jeweled Bone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dBoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.rBoneSpear.setIconCoord(4, 8);
        ModLoader.addName(mod_InfiWeapons.rBoneSpear, "Red Bone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rBoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oBoneSpear.setIconCoord(5, 8);
        ModLoader.addName(mod_InfiWeapons.oBoneSpear, "Glassy Bone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oBoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.bBoneSpear.setIconCoord(6, 8);
        ModLoader.addName(mod_InfiWeapons.bBoneSpear, "Reanimated Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bBoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.bone, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bBoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.mBoneSpear.setIconCoord(7, 8);
        ModLoader.addName(mod_InfiWeapons.mBoneSpear, "Mossy Bone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mBoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.nBoneSpear.setIconCoord(8, 8);
        ModLoader.addName(mod_InfiWeapons.nBoneSpear, "Netherrack Bone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nBoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glBoneSpear.setIconCoord(9, 8);
        ModLoader.addName(mod_InfiWeapons.glBoneSpear, "Glowstone Bone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glBoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.sBoneSpear.setIconCoord(10, 8);
        ModLoader.addName(mod_InfiWeapons.sBoneSpear, "Slimy Bone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sBoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cBoneSpear.setIconCoord(11, 8);
        ModLoader.addName(mod_InfiWeapons.cBoneSpear, "Spiny Bone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cBoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fBoneSpear.setIconCoord(12, 8);
        ModLoader.addName(mod_InfiWeapons.fBoneSpear, "Flaky Bone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fBoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brBoneSpear.setIconCoord(13, 8);
        ModLoader.addName(mod_InfiWeapons.brBoneSpear, "Baked Bone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brBoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.blBoneSpear.setIconCoord(14, 8);
        ModLoader.addName(mod_InfiWeapons.blBoneSpear, "Blazing Bone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blBoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.bone, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.wPaperSpear.setIconCoord(0, 9);
        ModLoader.addName(mod_InfiWeapons.wPaperSpear, "Paper Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wPaperSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.saPaperSpear.setIconCoord(1, 9);
        ModLoader.addName(mod_InfiWeapons.saPaperSpear, "Stony Paper Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saPaperSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bPaperSpear.setIconCoord(2, 9);
        ModLoader.addName(mod_InfiWeapons.bPaperSpear, "Necrotic Paper Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bPaperSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bPaperSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.pPaperSpear.setIconCoord(3, 9);
        ModLoader.addName(mod_InfiWeapons.pPaperSpear, "Rolled up Paper");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pPaperSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_InfiWeapons.sPaperSpear.setIconCoord(4, 9);
        ModLoader.addName(mod_InfiWeapons.sPaperSpear, "Slimy Paper Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sPaperSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cPaperSpear.setIconCoord(5, 9);
        ModLoader.addName(mod_InfiWeapons.cPaperSpear, "Spiny Paper Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cPaperSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.brPaperSpear.setIconCoord(6, 9);
        ModLoader.addName(mod_InfiWeapons.brPaperSpear, "Baked Paper Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brPaperSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.stMossySpear.setIconCoord(0, 10);
        ModLoader.addName(mod_InfiWeapons.stMossySpear, "Stony Moss-Covered Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stMossySpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.dMossySpear.setIconCoord(1, 10);
        ModLoader.addName(mod_InfiWeapons.dMossySpear, "Jeweled Moss-Covered Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dMossySpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.rMossySpear.setIconCoord(2, 10);
        ModLoader.addName(mod_InfiWeapons.rMossySpear, "Red Moss-Covered Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rMossySpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.bMossySpear.setIconCoord(3, 10);
        ModLoader.addName(mod_InfiWeapons.bMossySpear, "Necrotic Moss-Covered Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bMossySpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bMossySpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.mMossySpear.setIconCoord(4, 10);
        ModLoader.addName(mod_InfiWeapons.mMossySpear, "Living Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mMossySpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.glMossySpear.setIconCoord(5, 10);
        ModLoader.addName(mod_InfiWeapons.glMossySpear, "Glowing Moss-Covered Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glMossySpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.wNetherrackSpear.setIconCoord(0, 11);
        ModLoader.addName(mod_InfiWeapons.wNetherrackSpear, "Netherrack Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wNetherrackSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stNetherrackSpear.setIconCoord(1, 11);
        ModLoader.addName(mod_InfiWeapons.stNetherrackSpear, "Stony Netherrack Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stNetherrackSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iNetherrackSpear.setIconCoord(2, 11);
        ModLoader.addName(mod_InfiWeapons.iNetherrackSpear, "Hard Netherrack Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iNetherrackSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.rNetherrackSpear.setIconCoord(3, 11);
        ModLoader.addName(mod_InfiWeapons.rNetherrackSpear, "Red Netherrack Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rNetherrackSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oNetherrackSpear.setIconCoord(4, 11);
        ModLoader.addName(mod_InfiWeapons.oNetherrackSpear, "Glassy Netherrack Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oNetherrackSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.saNetherrackSpear.setIconCoord(5, 11);
        ModLoader.addName(mod_InfiWeapons.saNetherrackSpear, "Sandy Netherrack Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saNetherrackSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bNetherrackSpear.setIconCoord(6, 11);
        ModLoader.addName(mod_InfiWeapons.bNetherrackSpear, "Necrotic Netherrack Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bNetherrackSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bNetherrackSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.mNetherrackSpear.setIconCoord(7, 11);
        ModLoader.addName(mod_InfiWeapons.mNetherrackSpear, "Mossy Netherrack Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mNetherrackSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.nNetherrackSpear.setIconCoord(8, 11);
        ModLoader.addName(mod_InfiWeapons.nNetherrackSpear, "Bloody Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nNetherrackSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glNetherrackSpear.setIconCoord(9, 11);
        ModLoader.addName(mod_InfiWeapons.glNetherrackSpear, "Glowing Netherrack Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glNetherrackSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.iceNetherrackSpear.setIconCoord(10, 11);
        ModLoader.addName(mod_InfiWeapons.iceNetherrackSpear, "Icy Netherrack Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceNetherrackSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.sNetherrackSpear.setIconCoord(11, 11);
        ModLoader.addName(mod_InfiWeapons.sNetherrackSpear, "Slimy Netherrack Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sNetherrackSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cNetherrackSpear.setIconCoord(12, 11);
        ModLoader.addName(mod_InfiWeapons.cNetherrackSpear, "Spiny Netherrack Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cNetherrackSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fNetherrackSpear.setIconCoord(13, 11);
        ModLoader.addName(mod_InfiWeapons.fNetherrackSpear, "Flaky Netherrack Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fNetherrackSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.brNetherrackSpear.setIconCoord(14, 11);
        ModLoader.addName(mod_InfiWeapons.brNetherrackSpear, "Baked Netherrack Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brNetherrackSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.blNetherrackSpear.setIconCoord(15, 11);
        ModLoader.addName(mod_InfiWeapons.blNetherrackSpear, "Blazing Netherrack Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blNetherrackSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.wGlowstoneSpear.setIconCoord(0, 12);
        ModLoader.addName(mod_InfiWeapons.wGlowstoneSpear, "Glowstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wGlowstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stGlowstoneSpear.setIconCoord(1, 12);
        ModLoader.addName(mod_InfiWeapons.stGlowstoneSpear, "Stony Glowstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stGlowstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iGlowstoneSpear.setIconCoord(2, 12);
        ModLoader.addName(mod_InfiWeapons.iGlowstoneSpear, "Hard Glowstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iGlowstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.dGlowstoneSpear.setIconCoord(3, 12);
        ModLoader.addName(mod_InfiWeapons.dGlowstoneSpear, "Jeweled Glowstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dGlowstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.rGlowstoneSpear.setIconCoord(4, 12);
        ModLoader.addName(mod_InfiWeapons.rGlowstoneSpear, "Red Glowstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rGlowstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oGlowstoneSpear.setIconCoord(5, 12);
        ModLoader.addName(mod_InfiWeapons.oGlowstoneSpear, "Glassy Glowstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oGlowstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.bGlowstoneSpear.setIconCoord(6, 12);
        ModLoader.addName(mod_InfiWeapons.bGlowstoneSpear, "Necrotic Glowstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bGlowstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bGlowstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.mGlowstoneSpear.setIconCoord(7, 12);
        ModLoader.addName(mod_InfiWeapons.mGlowstoneSpear, "Mossy Glowstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mGlowstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.nGlowstoneSpear.setIconCoord(8, 12);
        ModLoader.addName(mod_InfiWeapons.nGlowstoneSpear, "Bloody Glowstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nGlowstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glGlowstoneSpear.setIconCoord(9, 12);
        ModLoader.addName(mod_InfiWeapons.glGlowstoneSpear, "Bright Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glGlowstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.iceGlowstoneSpear.setIconCoord(10, 12);
        ModLoader.addName(mod_InfiWeapons.iceGlowstoneSpear, "Icy Glowstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceGlowstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.lGlowstoneSpear.setIconCoord(11, 12);
        ModLoader.addName(mod_InfiWeapons.lGlowstoneSpear, "Fiery Glowstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.lGlowstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.sGlowstoneSpear.setIconCoord(12, 12);
        ModLoader.addName(mod_InfiWeapons.sGlowstoneSpear, "Slimy Glowstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sGlowstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.blGlowstoneSpear.setIconCoord(13, 12);
        ModLoader.addName(mod_InfiWeapons.blGlowstoneSpear, "Blazing Glowstone Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blGlowstoneSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.wIceSpear.setIconCoord(0, 13);
        ModLoader.addName(mod_InfiWeapons.wIceSpear, "Ice Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wIceSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.ice, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stIceSpear.setIconCoord(1, 13);
        ModLoader.addName(mod_InfiWeapons.stIceSpear, "Stony Ice Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stIceSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iIceSpear.setIconCoord(2, 13);
        ModLoader.addName(mod_InfiWeapons.iIceSpear, "Hard Ice Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iIceSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.dIceSpear.setIconCoord(3, 13);
        ModLoader.addName(mod_InfiWeapons.dIceSpear, "Jeweled Ice Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dIceSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.gIceSpear.setIconCoord(4, 13);
        ModLoader.addName(mod_InfiWeapons.gIceSpear, "Expensive Ice Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.gIceSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_InfiWeapons.rIceSpear.setIconCoord(5, 13);
        ModLoader.addName(mod_InfiWeapons.rIceSpear, "Red Ice Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rIceSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oIceSpear.setIconCoord(6, 13);
        ModLoader.addName(mod_InfiWeapons.oIceSpear, "Glassy Ice Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oIceSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.saIceSpear.setIconCoord(7, 13);
        ModLoader.addName(mod_InfiWeapons.saIceSpear, "Sandy Ice Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saIceSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bIceSpear.setIconCoord(8, 13);
        ModLoader.addName(mod_InfiWeapons.bIceSpear, "Necrotic Ice Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bIceSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.ice, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bIceSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.glIceSpear.setIconCoord(9, 13);
        ModLoader.addName(mod_InfiWeapons.glIceSpear, "Glowing Ice Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glIceSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.iceIceSpear.setIconCoord(10, 13);
        ModLoader.addName(mod_InfiWeapons.iceIceSpear, "Ice Pole");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceIceSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.sIceSpear.setIconCoord(11, 13);
        ModLoader.addName(mod_InfiWeapons.sIceSpear, "Slimy Ice Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sIceSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cIceSpear.setIconCoord(12, 13);
        ModLoader.addName(mod_InfiWeapons.cIceSpear, "Spiny Ice Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cIceSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fIceSpear.setIconCoord(13, 13);
        ModLoader.addName(mod_InfiWeapons.fIceSpear, "Flaky Ice Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fIceSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brIceSpear.setIconCoord(14, 13);
        ModLoader.addName(mod_InfiWeapons.brIceSpear, "Baked Ice Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brIceSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.dLavaSpear.setIconCoord(0, 14);
        ModLoader.addName(mod_InfiWeapons.dLavaSpear, "Jeweled Lava Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dLavaSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.rLavaSpear.setIconCoord(1, 14);
        ModLoader.addName(mod_InfiWeapons.rLavaSpear, "Red Lava Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rLavaSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.bLavaSpear.setIconCoord(2, 14);
        ModLoader.addName(mod_InfiWeapons.bLavaSpear, "Necrotic Lava Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bLavaSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bLavaSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.nLavaSpear.setIconCoord(3, 14);
        ModLoader.addName(mod_InfiWeapons.nLavaSpear, "Bloody Lava Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nLavaSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glLavaSpear.setIconCoord(4, 14);
        ModLoader.addName(mod_InfiWeapons.glLavaSpear, "Glowing Lava Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glLavaSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.lLavaSpear.setIconCoord(5, 14);
        ModLoader.addName(mod_InfiWeapons.lLavaSpear, "Pigburn");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.lLavaSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.lavaRod
                });
        mod_InfiWeapons.blLavaSpear.setIconCoord(6, 14);
        ModLoader.addName(mod_InfiWeapons.blLavaSpear, "Blazing Lava Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blLavaSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.wSlimeSpear.setIconCoord(0, 15);
        ModLoader.addName(mod_InfiWeapons.wSlimeSpear, "Slime Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wSlimeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stSlimeSpear.setIconCoord(1, 15);
        ModLoader.addName(mod_InfiWeapons.stSlimeSpear, "Stony Slime Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stSlimeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iSlimeSpear.setIconCoord(2, 15);
        ModLoader.addName(mod_InfiWeapons.iSlimeSpear, "Hard Slime Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iSlimeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.dSlimeSpear.setIconCoord(3, 15);
        ModLoader.addName(mod_InfiWeapons.dSlimeSpear, "Jeweled Slime Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dSlimeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.gSlimeSpear.setIconCoord(4, 15);
        ModLoader.addName(mod_InfiWeapons.gSlimeSpear, "Expensive Slime Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.gSlimeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_InfiWeapons.rSlimeSpear.setIconCoord(5, 15);
        ModLoader.addName(mod_InfiWeapons.rSlimeSpear, "Red Slime Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rSlimeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oSlimeSpear.setIconCoord(6, 15);
        ModLoader.addName(mod_InfiWeapons.oSlimeSpear, "Glassy Slime Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oSlimeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.saSlimeSpear.setIconCoord(7, 15);
        ModLoader.addName(mod_InfiWeapons.saSlimeSpear, "Sandy Slime Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saSlimeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bSlimeSpear.setIconCoord(8, 15);
        ModLoader.addName(mod_InfiWeapons.bSlimeSpear, "Necrotic Slime Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bSlimeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bSlimeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.pSlimeSpear.setIconCoord(9, 15);
        ModLoader.addName(mod_InfiWeapons.pSlimeSpear, "Fibery Slime Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pSlimeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_InfiWeapons.mSlimeSpear.setIconCoord(10, 15);
        ModLoader.addName(mod_InfiWeapons.mSlimeSpear, "Mossy Slime Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mSlimeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.nSlimeSpear.setIconCoord(11, 15);
        ModLoader.addName(mod_InfiWeapons.nSlimeSpear, "Bloody Slime Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nSlimeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glSlimeSpear.setIconCoord(12, 15);
        ModLoader.addName(mod_InfiWeapons.glSlimeSpear, "Glowing Slime Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glSlimeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.iceSlimeSpear.setIconCoord(13, 15);
        ModLoader.addName(mod_InfiWeapons.iceSlimeSpear, "Icy Slime Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceSlimeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.lSlimeSpear.setIconCoord(14, 15);
        ModLoader.addName(mod_InfiWeapons.lSlimeSpear, "Fiery Slime Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.lSlimeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.lavaRod
                });
        mod_InfiWeapons.sSlimeSpear.setIconCoord(15, 15);
        ModLoader.addName(mod_InfiWeapons.sSlimeSpear, "Rubber Stick");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sSlimeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cSlimeSpear.setIconCoord(12, 14);
        ModLoader.addName(mod_InfiWeapons.cSlimeSpear, "Spiny Slime Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cSlimeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fSlimeSpear.setIconCoord(13, 14);
        ModLoader.addName(mod_InfiWeapons.fSlimeSpear, "Flaky Slime Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fSlimeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brSlimeSpear.setIconCoord(14, 14);
        ModLoader.addName(mod_InfiWeapons.brSlimeSpear, "Baked Slime Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brSlimeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.blSlimeSpear.setIconCoord(15, 14);
        ModLoader.addName(mod_InfiWeapons.blSlimeSpear, "Blazing Slime Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blSlimeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.wCactusSpear.setIconCoord(10, 0);
        ModLoader.addName(mod_InfiWeapons.wCactusSpear, "Cactus Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wCactusSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stCactusSpear.setIconCoord(11, 0);
        ModLoader.addName(mod_InfiWeapons.stCactusSpear, "Stony Cactus Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stCactusSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.saCactusSpear.setIconCoord(12, 0);
        ModLoader.addName(mod_InfiWeapons.saCactusSpear, "Sandy Cactus Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saCactusSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bCactusSpear.setIconCoord(13, 0);
        ModLoader.addName(mod_InfiWeapons.bCactusSpear, "Necrotic Cactus Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bCactusSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bCactusSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.pCactusSpear.setIconCoord(14, 0);
        ModLoader.addName(mod_InfiWeapons.pCactusSpear, "Fibery Cactus Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pCactusSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_InfiWeapons.nCactusSpear.setIconCoord(15, 0);
        ModLoader.addName(mod_InfiWeapons.nCactusSpear, "Bloody Cactus Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nCactusSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.sCactusSpear.setIconCoord(12, 1);
        ModLoader.addName(mod_InfiWeapons.sCactusSpear, "Slimy Cactus Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sCactusSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cCactusSpear.setIconCoord(13, 1);
        ModLoader.addName(mod_InfiWeapons.cCactusSpear, "Spined Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cCactusSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fCactusSpear.setIconCoord(14, 1);
        ModLoader.addName(mod_InfiWeapons.fCactusSpear, "Flaky Cactus Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fCactusSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brCactusSpear.setIconCoord(15, 1);
        ModLoader.addName(mod_InfiWeapons.brCactusSpear, "Baked Cactus Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brCactusSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        /*mod_BalkonInfiWeapons.wFlintSpear.setIconCoord(13, 2);
        ModLoader.addName(mod_BalkonInfiWeapons.wFlintSpear, "Flint Spear");
        ModLoader.addRecipe(new ItemStack(mod_BalkonInfiWeapons.wFlintSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.flint, Character.valueOf('|'), Item.stick
                });*/
        mod_InfiWeapons.stFlintSpear.setIconCoord(14, 2);
        ModLoader.addName(mod_InfiWeapons.stFlintSpear, "Stony Flint Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stFlintSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iFlintSpear.setIconCoord(15, 2);
        ModLoader.addName(mod_InfiWeapons.iFlintSpear, "Hard Flint Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iFlintSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.gFlintSpear.setIconCoord(12, 3);
        ModLoader.addName(mod_InfiWeapons.gFlintSpear, "Expensive Flint Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.gFlintSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_InfiWeapons.oFlintSpear.setIconCoord(13, 3);
        ModLoader.addName(mod_InfiWeapons.oFlintSpear, "Glassy Flint Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oFlintSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.saFlintSpear.setIconCoord(14, 3);
        ModLoader.addName(mod_InfiWeapons.saFlintSpear, "Sandy Flint Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saFlintSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bFlintSpear.setIconCoord(15, 3);
        ModLoader.addName(mod_InfiWeapons.bFlintSpear, "Necrotic Flint Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bFlintSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.flint, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bFlintSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.nFlintSpear.setIconCoord(12, 4);
        ModLoader.addName(mod_InfiWeapons.nFlintSpear, "Bloody Flint Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nFlintSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.iceFlintSpear.setIconCoord(13, 4);
        ModLoader.addName(mod_InfiWeapons.iceFlintSpear, "Icy Flint Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceFlintSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.sFlintSpear.setIconCoord(14, 4);
        ModLoader.addName(mod_InfiWeapons.sFlintSpear, "Slimy Flint Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sFlintSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cFlintSpear.setIconCoord(15, 4);
        ModLoader.addName(mod_InfiWeapons.cFlintSpear, "Spiny Flint Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cFlintSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fFlintSpear.setIconCoord(11, 5);
        ModLoader.addName(mod_InfiWeapons.fFlintSpear, "Spear of Sharpening");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fFlintSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brFlintSpear.setIconCoord(12, 5);
        ModLoader.addName(mod_InfiWeapons.brFlintSpear, "Baked Flint Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brFlintSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.blFlintSpear.setIconCoord(13, 5);
        ModLoader.addName(mod_InfiWeapons.blFlintSpear, "Blazing Flint Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blFlintSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.flint, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.wBrickSpear.setIconCoord(14, 5);
        ModLoader.addName(mod_InfiWeapons.wBrickSpear, "Brick Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wBrickSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.brick, Character.valueOf('|'), Item.brick
                });
        mod_InfiWeapons.stBrickSpear.setIconCoord(15, 5);
        ModLoader.addName(mod_InfiWeapons.stBrickSpear, "Stony Brick Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stBrickSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.saBrickSpear.setIconCoord(13, 6);
        ModLoader.addName(mod_InfiWeapons.saBrickSpear, "Sandstone Brick Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saBrickSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bBrickSpear.setIconCoord(14, 6);
        ModLoader.addName(mod_InfiWeapons.bBrickSpear, "Necrotic Brick Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bBrickSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.brick, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bBrickSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.pBrickSpear.setIconCoord(15, 6);
        ModLoader.addName(mod_InfiWeapons.pBrickSpear, "Fibery Brick Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pBrickSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_InfiWeapons.nBrickSpear.setIconCoord(11, 7);
        ModLoader.addName(mod_InfiWeapons.nBrickSpear, "Bloody Brick Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nBrickSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.iceBrickSpear.setIconCoord(12, 7);
        ModLoader.addName(mod_InfiWeapons.iceBrickSpear, "Icy Brick Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceBrickSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.sBrickSpear.setIconCoord(13, 7);
        ModLoader.addName(mod_InfiWeapons.sBrickSpear, "Slimy Brick Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sBrickSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cBrickSpear.setIconCoord(14, 7);
        ModLoader.addName(mod_InfiWeapons.cBrickSpear, "Spiny Brick Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cBrickSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fBrickSpear.setIconCoord(15, 7);
        ModLoader.addName(mod_InfiWeapons.fBrickSpear, "Flaky Brick Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fBrickSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brBrickSpear.setIconCoord(15, 8);
        ModLoader.addName(mod_InfiWeapons.brBrickSpear, "Look-alike Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brBrickSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.dBlazeSpear.setIconCoord(7, 9);
        ModLoader.addName(mod_InfiWeapons.dBlazeSpear, "Jeweled Blaze Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dBlazeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.rBlazeSpear.setIconCoord(8, 9);
        ModLoader.addName(mod_InfiWeapons.rBlazeSpear, "Red Blaze Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rBlazeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.bBlazeSpear.setIconCoord(9, 9);
        ModLoader.addName(mod_InfiWeapons.bBlazeSpear, "Necrotic Blaze Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bBlazeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bBlazeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.nBlazeSpear.setIconCoord(10, 9);
        ModLoader.addName(mod_InfiWeapons.nBlazeSpear, "Bloody Blaze Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nBlazeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glBlazeSpear.setIconCoord(11, 9);
        ModLoader.addName(mod_InfiWeapons.glBlazeSpear, "Glowing Blaze Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glBlazeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.lBlazeSpear.setIconCoord(12, 9);
        ModLoader.addName(mod_InfiWeapons.lBlazeSpear, "Fiery Blaze Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.lBlazeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.fBlazeSpear.setIconCoord(13, 9);
        ModLoader.addName(mod_InfiWeapons.fBlazeSpear, "Flaky Blaze Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fBlazeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.blBlazeSpear.setIconCoord(14, 9);
        ModLoader.addName(mod_InfiWeapons.blBlazeSpear, "Blasted Spear");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blBlazeSpear, 1), new Object[]
                {
                    "m  ", " | ", "  |", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), Item.blazeRod
                });
        return 0;
    }
}
