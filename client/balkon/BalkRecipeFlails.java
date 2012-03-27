package net.minecraft.src.balkon;

import net.minecraft.src.*;

public class BalkRecipeFlails
{
    public BalkRecipeFlails()
    {
    }

    public static int recipeStorm()
    {
        mod_InfiWeapons.stWoodFlail.setIconCoord(1, 0);
        ModLoader.addName(mod_InfiWeapons.stWoodFlail, "Stony Wooden Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stWoodFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.stoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.saWoodFlail.setIconCoord(2, 0);
        ModLoader.addName(mod_InfiWeapons.saWoodFlail, "Sandy Wooden Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saWoodFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.sandstoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.bWoodFlail.setIconCoord(3, 0);
        ModLoader.addName(mod_InfiWeapons.bWoodFlail, "Necrotic Wooden Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bWoodFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), Item.bone, Character.valueOf('s'), Item.stick
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bWoodFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.boneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.pWoodFlail.setIconCoord(4, 0);
        ModLoader.addName(mod_InfiWeapons.pWoodFlail, "Fibery Wooden Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pWoodFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), Item.paper, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.nWoodFlail.setIconCoord(5, 0);
        ModLoader.addName(mod_InfiWeapons.nWoodFlail, "Bloody Wooden Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nWoodFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.netherrackRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.sWoodFlail.setIconCoord(6, 0);
        ModLoader.addName(mod_InfiWeapons.sWoodFlail, "Slimy Wooden Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sWoodFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.slimeRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.cWoodFlail.setIconCoord(7, 0);
        ModLoader.addName(mod_InfiWeapons.cWoodFlail, "Spiny Wooden Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cWoodFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.cactusRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.fWoodFlail.setIconCoord(8, 0);
        ModLoader.addName(mod_InfiWeapons.fWoodFlail, "Flaky Wooden Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fWoodFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.flintRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.brWoodFlail.setIconCoord(9, 0);
        ModLoader.addName(mod_InfiWeapons.brWoodFlail, "Baked Wooden Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brWoodFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.brickRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.stStoneFlail.setIconCoord(1, 1);
        ModLoader.addName(mod_InfiWeapons.stStoneFlail, "Heavy Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stStoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.stoneRod, Character.valueOf('s'), Item.silk
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stStoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.stoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.saStoneFlail.setIconCoord(2, 1);
        ModLoader.addName(mod_InfiWeapons.saStoneFlail, "Sandy Stone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saStoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.sandstoneRod, Character.valueOf('s'), Item.silk
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saStoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.sandstoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.bStoneFlail.setIconCoord(3, 1);
        ModLoader.addName(mod_InfiWeapons.bStoneFlail, "Necrotic Stone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bStoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), Item.bone, Character.valueOf('s'), Item.silk
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bStoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.stone, Character.valueOf('|'), Item.bone, Character.valueOf('s'), Item.silk
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bStoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.boneRod, Character.valueOf('s'), Item.silk
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bStoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.boneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.pStoneFlail.setIconCoord(4, 1);
        ModLoader.addName(mod_InfiWeapons.pStoneFlail, "Fibery Stone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pStoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.paperRod, Character.valueOf('s'), Item.silk
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pStoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.paperRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.mStoneFlail.setIconCoord(5, 1);
        ModLoader.addName(mod_InfiWeapons.mStoneFlail, "Mossy Stone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mStoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.mossyRod, Character.valueOf('s'), Item.silk
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mStoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.mossyRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.nStoneFlail.setIconCoord(6, 1);
        ModLoader.addName(mod_InfiWeapons.nStoneFlail, "Bloody Stone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nStoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.netherrackRod, Character.valueOf('s'), Item.silk
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nStoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.netherrackRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.iceStoneFlail.setIconCoord(7, 1);
        ModLoader.addName(mod_InfiWeapons.iceStoneFlail, "Icy Stone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceStoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.iceRod, Character.valueOf('s'), Item.silk
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceStoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.iceRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.sStoneFlail.setIconCoord(8, 1);
        ModLoader.addName(mod_InfiWeapons.sStoneFlail, "Slimy Stone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sStoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.slimeRod, Character.valueOf('s'), Item.silk
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sStoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.slimeRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.cStoneFlail.setIconCoord(9, 1);
        ModLoader.addName(mod_InfiWeapons.cStoneFlail, "Spiny Stone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cStoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.cactusRod, Character.valueOf('s'), Item.silk
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cStoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.cactusRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.fStoneFlail.setIconCoord(10, 1);
        ModLoader.addName(mod_InfiWeapons.fStoneFlail, "Flaky Stone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fStoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.flintRod, Character.valueOf('s'), Item.silk
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fStoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.flintRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.brStoneFlail.setIconCoord(11, 1);
        ModLoader.addName(mod_InfiWeapons.brStoneFlail, "Baked Stone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brStoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.brickRod, Character.valueOf('s'), Item.silk
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brStoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.brickRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.stIronFlail.setIconCoord(1, 2);
        ModLoader.addName(mod_InfiWeapons.stIronFlail, "Stony Iron Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stIronFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.stoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.iIronFlail.setIconCoord(2, 2);
        ModLoader.addName(mod_InfiWeapons.iIronFlail, "Ironic Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iIronFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.ironRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.dIronFlail.setIconCoord(3, 2);
        ModLoader.addName(mod_InfiWeapons.dIronFlail, "Jeweled Iron Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dIronFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.diamondRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.gIronFlail.setIconCoord(4, 2);
        ModLoader.addName(mod_InfiWeapons.gIronFlail, "Expensive Iron Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.gIronFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.goldRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.rIronFlail.setIconCoord(5, 2);
        ModLoader.addName(mod_InfiWeapons.rIronFlail, "Red Iron Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rIronFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.redstoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.oIronFlail.setIconCoord(6, 2);
        ModLoader.addName(mod_InfiWeapons.oIronFlail, "Glassy Iron Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oIronFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.obsidianRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.bIronFlail.setIconCoord(7, 2);
        ModLoader.addName(mod_InfiWeapons.bIronFlail, "Necrotic Iron Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bIronFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), Item.bone, Character.valueOf('s'), Item.silk
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bIronFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.boneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.nIronFlail.setIconCoord(8, 2);
        ModLoader.addName(mod_InfiWeapons.nIronFlail, "Bloody Iron Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nIronFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.netherrackRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.glIronFlail.setIconCoord(9, 2);
        ModLoader.addName(mod_InfiWeapons.glIronFlail, "Glowing Iron Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glIronFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.glowstoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.iceIronFlail.setIconCoord(10, 2);
        ModLoader.addName(mod_InfiWeapons.iceIronFlail, "Icy Iron Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceIronFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.iceRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.sIronFlail.setIconCoord(11, 2);
        ModLoader.addName(mod_InfiWeapons.sIronFlail, "Slimy Iron Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sIronFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.slimeRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.blIronFlail.setIconCoord(12, 2);
        ModLoader.addName(mod_InfiWeapons.blIronFlail, "Blazing Iron Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blIronFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), Item.blazeRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.stDiamondFlail.setIconCoord(1, 3);
        ModLoader.addName(mod_InfiWeapons.stDiamondFlail, "Stony Diamond Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stDiamondFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.stoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.iDiamondFlail.setIconCoord(2, 3);
        ModLoader.addName(mod_InfiWeapons.iDiamondFlail, "Hard Diamond Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iDiamondFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.ironRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.dDiamondFlail.setIconCoord(3, 3);
        ModLoader.addName(mod_InfiWeapons.dDiamondFlail, "Diamondium Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dDiamondFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.diamondRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.gDiamondFlail.setIconCoord(4, 3);
        ModLoader.addName(mod_InfiWeapons.gDiamondFlail, "Expensive Diamond Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.gDiamondFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.goldRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.rDiamondFlail.setIconCoord(5, 3);
        ModLoader.addName(mod_InfiWeapons.rDiamondFlail, "Red Diamond Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rDiamondFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.redstoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.oDiamondFlail.setIconCoord(6, 3);
        ModLoader.addName(mod_InfiWeapons.oDiamondFlail, "Glassy Diamond Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oDiamondFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.obsidianRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.bDiamondFlail.setIconCoord(7, 3);
        ModLoader.addName(mod_InfiWeapons.bDiamondFlail, "Necrotic Diamond Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bDiamondFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), Item.bone, Character.valueOf('s'), Item.silk
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bDiamondFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.boneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.mDiamondFlail.setIconCoord(8, 3);
        ModLoader.addName(mod_InfiWeapons.mDiamondFlail, "Mossy Diamond Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mDiamondFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.mossyRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.nDiamondFlail.setIconCoord(9, 3);
        ModLoader.addName(mod_InfiWeapons.nDiamondFlail, "Bloody Diamond Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nDiamondFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.netherrackRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.glDiamondFlail.setIconCoord(10, 3);
        ModLoader.addName(mod_InfiWeapons.glDiamondFlail, "Glowing Diamond Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glDiamondFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.glowstoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.blDiamondFlail.setIconCoord(11, 3);
        ModLoader.addName(mod_InfiWeapons.blDiamondFlail, "Blazing Diamond Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blDiamondFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), Item.blazeRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.stGoldFlail.setIconCoord(1, 4);
        ModLoader.addName(mod_InfiWeapons.stGoldFlail, "Stony Gold Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stGoldFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.stoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.gGoldFlail.setIconCoord(2, 4);
        ModLoader.addName(mod_InfiWeapons.gGoldFlail, "Expensive Useless Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.gGoldFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.goldRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.oGoldFlail.setIconCoord(3, 4);
        ModLoader.addName(mod_InfiWeapons.oGoldFlail, "Glassy Gold Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oGoldFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.obsidianRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.saGoldFlail.setIconCoord(4, 4);
        ModLoader.addName(mod_InfiWeapons.saGoldFlail, "Sandy Gold Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saGoldFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.sandstoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.bGoldFlail.setIconCoord(5, 4);
        ModLoader.addName(mod_InfiWeapons.bGoldFlail, "Necrotic Gold Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bGoldFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), Item.bone, Character.valueOf('s'), Item.silk
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bGoldFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.boneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.mGoldFlail.setIconCoord(6, 4);
        ModLoader.addName(mod_InfiWeapons.mGoldFlail, "Mossy Gold Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mGoldFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.mossyRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.nGoldFlail.setIconCoord(7, 4);
        ModLoader.addName(mod_InfiWeapons.nGoldFlail, "Bloody Gold Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nGoldFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.netherrackRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.glGoldFlail.setIconCoord(8, 4);
        ModLoader.addName(mod_InfiWeapons.glGoldFlail, "Glowing Gold Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glGoldFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.glowstoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.iceGoldFlail.setIconCoord(9, 4);
        ModLoader.addName(mod_InfiWeapons.iceGoldFlail, "Icy Gold Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceGoldFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.iceRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.sGoldFlail.setIconCoord(10, 4);
        ModLoader.addName(mod_InfiWeapons.sGoldFlail, "Slimy Gold Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sGoldFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.slimeRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.fGoldFlail.setIconCoord(11, 4);
        ModLoader.addName(mod_InfiWeapons.fGoldFlail, "Flaky Gold Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fGoldFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.flintRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.wRedstoneFlail.setIconCoord(0, 5);
        ModLoader.addName(mod_InfiWeapons.wRedstoneFlail, "Redstone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wRedstoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), Item.stick, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.stRedstoneFlail.setIconCoord(1, 5);
        ModLoader.addName(mod_InfiWeapons.stRedstoneFlail, "Stony Redstone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stRedstoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.stoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.iRedstoneFlail.setIconCoord(2, 5);
        ModLoader.addName(mod_InfiWeapons.iRedstoneFlail, "Hard Redstone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iRedstoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.ironRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.dRedstoneFlail.setIconCoord(3, 5);
        ModLoader.addName(mod_InfiWeapons.dRedstoneFlail, "Jeweled Redstone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dRedstoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.diamondRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.rRedstoneFlail.setIconCoord(4, 5);
        ModLoader.addName(mod_InfiWeapons.rRedstoneFlail, "Redredred Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rRedstoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.redstoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.oRedstoneFlail.setIconCoord(5, 5);
        ModLoader.addName(mod_InfiWeapons.oRedstoneFlail, "Glassy Redstone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oRedstoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.obsidianRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.bRedstoneFlail.setIconCoord(6, 5);
        ModLoader.addName(mod_InfiWeapons.bRedstoneFlail, "Necrotic Redstone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bRedstoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), Item.bone, Character.valueOf('s'), Item.silk
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bRedstoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.boneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.mRedstoneFlail.setIconCoord(7, 5);
        ModLoader.addName(mod_InfiWeapons.mRedstoneFlail, "Mossy Redstone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mRedstoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.mossyRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.glRedstoneFlail.setIconCoord(8, 5);
        ModLoader.addName(mod_InfiWeapons.glRedstoneFlail, "Glowing Redstone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glRedstoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.sRedstoneFlail.setIconCoord(9, 5);
        ModLoader.addName(mod_InfiWeapons.sRedstoneFlail, "Slimy Redstone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sRedstoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.slimeRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.blRedstoneFlail.setIconCoord(10, 5);
        ModLoader.addName(mod_InfiWeapons.blRedstoneFlail, "Blazing Redstone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blRedstoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), Item.blazeRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.wObsidianFlail.setIconCoord(0, 6);
        ModLoader.addName(mod_InfiWeapons.wObsidianFlail, "Obsidian Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wObsidianFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), Item.stick, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.stObsidianFlail.setIconCoord(1, 6);
        ModLoader.addName(mod_InfiWeapons.stObsidianFlail, "Stony Obsidian Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stObsidianFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.stoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.iObsidianFlail.setIconCoord(2, 6);
        ModLoader.addName(mod_InfiWeapons.iObsidianFlail, "Hard Obsidian Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iObsidianFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.ironRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.dObsidianFlail.setIconCoord(3, 6);
        ModLoader.addName(mod_InfiWeapons.dObsidianFlail, "Jeweled Obsidian Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dObsidianFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.diamondRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.gObsidianFlail.setIconCoord(4, 6);
        ModLoader.addName(mod_InfiWeapons.gObsidianFlail, "Expensive Obsidian Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.gObsidianFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.goldRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.rObsidianFlail.setIconCoord(5, 6);
        ModLoader.addName(mod_InfiWeapons.rObsidianFlail, "Red Obsidian Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rObsidianFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.redstoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.oObsidianFlail.setIconCoord(6, 6);
        ModLoader.addName(mod_InfiWeapons.oObsidianFlail, "Wicked Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oObsidianFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.obsidianRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.bObsidianFlail.setIconCoord(7, 6);
        ModLoader.addName(mod_InfiWeapons.bObsidianFlail, "Necrotic Obsidian Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bObsidianFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), Item.bone, Character.valueOf('s'), Item.silk
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bObsidianFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.boneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.nObsidianFlail.setIconCoord(8, 6);
        ModLoader.addName(mod_InfiWeapons.nObsidianFlail, "Bloody Obsidian Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nObsidianFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.netherrackRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.glObsidianFlail.setIconCoord(9, 6);
        ModLoader.addName(mod_InfiWeapons.glObsidianFlail, "Glowing Obsidian Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glObsidianFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.glowstoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.sObsidianFlail.setIconCoord(10, 6);
        ModLoader.addName(mod_InfiWeapons.sObsidianFlail, "Slimy Obsidian Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sObsidianFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.slimeRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.fObsidianFlail.setIconCoord(11, 6);
        ModLoader.addName(mod_InfiWeapons.fObsidianFlail, "Flaky Obsidian Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fObsidianFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.flintRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.blObsidianFlail.setIconCoord(12, 6);
        ModLoader.addName(mod_InfiWeapons.blObsidianFlail, "Blazing Obsidian Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blObsidianFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), Item.blazeRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.wSandstoneFlail.setIconCoord(0, 7);
        ModLoader.addName(mod_InfiWeapons.wSandstoneFlail, "Sandstone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wSandstoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), Item.stick, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.stSandstoneFlail.setIconCoord(1, 7);
        ModLoader.addName(mod_InfiWeapons.stSandstoneFlail, "Stony Sandstone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stSandstoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.stoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.saSandstoneFlail.setIconCoord(2, 7);
        ModLoader.addName(mod_InfiWeapons.saSandstoneFlail, "Sandswing");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saSandstoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.sandstoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.bSandstoneFlail.setIconCoord(3, 7);
        ModLoader.addName(mod_InfiWeapons.bSandstoneFlail, "Necrotic Sandstone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bSandstoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), Item.bone, Character.valueOf('s'), Item.silk
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bSandstoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.boneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.pSandstoneFlail.setIconCoord(4, 7);
        ModLoader.addName(mod_InfiWeapons.pSandstoneFlail, "Fibery Sandstone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pSandstoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.paperRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.nSandstoneFlail.setIconCoord(5, 7);
        ModLoader.addName(mod_InfiWeapons.nSandstoneFlail, "Bloody Sandstone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nSandstoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.netherrackRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.iceSandstoneFlail.setIconCoord(6, 7);
        ModLoader.addName(mod_InfiWeapons.iceSandstoneFlail, "Icy Sandstone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceSandstoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.iceRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.sSandstoneFlail.setIconCoord(7, 7);
        ModLoader.addName(mod_InfiWeapons.sSandstoneFlail, "Slimy Sandstone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sSandstoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.slimeRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.cSandstoneFlail.setIconCoord(8, 7);
        ModLoader.addName(mod_InfiWeapons.cSandstoneFlail, "Spiny Sandstone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cSandstoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.cactusRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.fSandstoneFlail.setIconCoord(9, 7);
        ModLoader.addName(mod_InfiWeapons.fSandstoneFlail, "Flaky Sandstone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fSandstoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.flintRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.brSandstoneFlail.setIconCoord(10, 7);
        ModLoader.addName(mod_InfiWeapons.brSandstoneFlail, "Baked Sandstone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brSandstoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.brickRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.wBoneFlail.setIconCoord(0, 8);
        ModLoader.addName(mod_InfiWeapons.wBoneFlail, "Bone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wBoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.bone, Character.valueOf('|'), Item.stick, Character.valueOf('s'), Item.silk, Character.valueOf('s'),
                    Item.silk
                });
        mod_InfiWeapons.stBoneFlail.setIconCoord(1, 8);
        ModLoader.addName(mod_InfiWeapons.stBoneFlail, "Stony Bone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stBoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.stoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.iBoneFlail.setIconCoord(2, 8);
        ModLoader.addName(mod_InfiWeapons.iBoneFlail, "Hard Bone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iBoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.ironRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.dBoneFlail.setIconCoord(3, 8);
        ModLoader.addName(mod_InfiWeapons.dBoneFlail, "Jeweled Bone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dBoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.diamondRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.rBoneFlail.setIconCoord(4, 8);
        ModLoader.addName(mod_InfiWeapons.rBoneFlail, "Red Bone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rBoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.redstoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.oBoneFlail.setIconCoord(5, 8);
        ModLoader.addName(mod_InfiWeapons.oBoneFlail, "Glassy Bone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oBoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.obsidianRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.bBoneFlail.setIconCoord(6, 8);
        ModLoader.addName(mod_InfiWeapons.bBoneFlail, "Reanimated Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bBoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.bone, Character.valueOf('|'), Item.bone, Character.valueOf('s'), Item.silk
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bBoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.boneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.mBoneFlail.setIconCoord(7, 8);
        ModLoader.addName(mod_InfiWeapons.mBoneFlail, "Mossy Bone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mBoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.mossyRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.nBoneFlail.setIconCoord(8, 8);
        ModLoader.addName(mod_InfiWeapons.nBoneFlail, "Netherrack Bone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nBoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.netherrackRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.glBoneFlail.setIconCoord(9, 8);
        ModLoader.addName(mod_InfiWeapons.glBoneFlail, "Glowstone Bone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glBoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.glowstoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.sBoneFlail.setIconCoord(10, 8);
        ModLoader.addName(mod_InfiWeapons.sBoneFlail, "Slimy Bone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sBoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.slimeRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.cBoneFlail.setIconCoord(11, 8);
        ModLoader.addName(mod_InfiWeapons.cBoneFlail, "Spiny Bone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cBoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.cactusRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.fBoneFlail.setIconCoord(12, 8);
        ModLoader.addName(mod_InfiWeapons.fBoneFlail, "Flaky Bone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fBoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.flintRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.brBoneFlail.setIconCoord(13, 8);
        ModLoader.addName(mod_InfiWeapons.brBoneFlail, "Baked Bone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brBoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.brickRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.blBoneFlail.setIconCoord(14, 8);
        ModLoader.addName(mod_InfiWeapons.blBoneFlail, "Blazing Bone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blBoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.bone, Character.valueOf('|'), Item.blazeRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.wPaperFlail.setIconCoord(0, 9);
        ModLoader.addName(mod_InfiWeapons.wPaperFlail, "Paper Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wPaperFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), Item.stick, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.saPaperFlail.setIconCoord(1, 9);
        ModLoader.addName(mod_InfiWeapons.saPaperFlail, "Stony Paper Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saPaperFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.sandstoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.bPaperFlail.setIconCoord(2, 9);
        ModLoader.addName(mod_InfiWeapons.bPaperFlail, "Necrotic Paper Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bPaperFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), Item.bone, Character.valueOf('s'), Item.silk
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bPaperFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.boneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.pPaperFlail.setIconCoord(3, 9);
        ModLoader.addName(mod_InfiWeapons.pPaperFlail, "Papyrus Picker");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pPaperFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.paperRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.sPaperFlail.setIconCoord(4, 9);
        ModLoader.addName(mod_InfiWeapons.sPaperFlail, "Slimy Paper Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sPaperFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.slimeRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.cPaperFlail.setIconCoord(5, 9);
        ModLoader.addName(mod_InfiWeapons.cPaperFlail, "Spiny Paper Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cPaperFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.cactusRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.brPaperFlail.setIconCoord(6, 9);
        ModLoader.addName(mod_InfiWeapons.brPaperFlail, "Baked Paper Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brPaperFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.brickRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.stMossyFlail.setIconCoord(0, 10);
        ModLoader.addName(mod_InfiWeapons.stMossyFlail, "Stony Moss-Covered Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stMossyFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.stoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.dMossyFlail.setIconCoord(1, 10);
        ModLoader.addName(mod_InfiWeapons.dMossyFlail, "Jeweled Moss-Covered Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dMossyFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.diamondRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.rMossyFlail.setIconCoord(2, 10);
        ModLoader.addName(mod_InfiWeapons.rMossyFlail, "Red Moss-Covered Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rMossyFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.redstoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.bMossyFlail.setIconCoord(3, 10);
        ModLoader.addName(mod_InfiWeapons.bMossyFlail, "Necrotic Moss-Covered Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bMossyFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), Item.bone, Character.valueOf('s'), Item.silk
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bMossyFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.boneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.mMossyFlail.setIconCoord(4, 10);
        ModLoader.addName(mod_InfiWeapons.mMossyFlail, "Living Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mMossyFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.mossyRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.glMossyFlail.setIconCoord(5, 10);
        ModLoader.addName(mod_InfiWeapons.glMossyFlail, "Glowing Moss-Covered Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glMossyFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.glowstoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.wNetherrackFlail.setIconCoord(0, 11);
        ModLoader.addName(mod_InfiWeapons.wNetherrackFlail, "Netherrack Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wNetherrackFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), Item.stick, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.stNetherrackFlail.setIconCoord(1, 11);
        ModLoader.addName(mod_InfiWeapons.stNetherrackFlail, "Stony Netherrack Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stNetherrackFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.stoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.iNetherrackFlail.setIconCoord(2, 11);
        ModLoader.addName(mod_InfiWeapons.iNetherrackFlail, "Hard Netherrack Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iNetherrackFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.ironRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.rNetherrackFlail.setIconCoord(3, 11);
        ModLoader.addName(mod_InfiWeapons.rNetherrackFlail, "Red Netherrack Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rNetherrackFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.redstoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.oNetherrackFlail.setIconCoord(4, 11);
        ModLoader.addName(mod_InfiWeapons.oNetherrackFlail, "Glassy Netherrack Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oNetherrackFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.obsidianRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.saNetherrackFlail.setIconCoord(5, 11);
        ModLoader.addName(mod_InfiWeapons.saNetherrackFlail, "Sandy Netherrack Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saNetherrackFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.sandstoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.bNetherrackFlail.setIconCoord(6, 11);
        ModLoader.addName(mod_InfiWeapons.bNetherrackFlail, "Necrotic Netherrack Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bNetherrackFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), Item.bone, Character.valueOf('s'), Item.silk
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bNetherrackFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.boneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.mNetherrackFlail.setIconCoord(7, 11);
        ModLoader.addName(mod_InfiWeapons.mNetherrackFlail, "Mossy Netherrack Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mNetherrackFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.mossyRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.nNetherrackFlail.setIconCoord(8, 11);
        ModLoader.addName(mod_InfiWeapons.nNetherrackFlail, "Blood Ball");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nNetherrackFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.netherrackRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.glNetherrackFlail.setIconCoord(9, 11);
        ModLoader.addName(mod_InfiWeapons.glNetherrackFlail, "Glowing Netherrack Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glNetherrackFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.glowstoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.iceNetherrackFlail.setIconCoord(10, 11);
        ModLoader.addName(mod_InfiWeapons.iceNetherrackFlail, "Icy Netherrack Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceNetherrackFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.iceRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.sNetherrackFlail.setIconCoord(11, 11);
        ModLoader.addName(mod_InfiWeapons.sNetherrackFlail, "Slimy Netherrack Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sNetherrackFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.slimeRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.cNetherrackFlail.setIconCoord(12, 11);
        ModLoader.addName(mod_InfiWeapons.cNetherrackFlail, "Spiny Netherrack Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cNetherrackFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.cactusRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.fNetherrackFlail.setIconCoord(13, 11);
        ModLoader.addName(mod_InfiWeapons.fNetherrackFlail, "Flaky Netherrack Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fNetherrackFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.cactusRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.brNetherrackFlail.setIconCoord(14, 11);
        ModLoader.addName(mod_InfiWeapons.brNetherrackFlail, "Baked Netherrack Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brNetherrackFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.cactusRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.blNetherrackFlail.setIconCoord(15, 11);
        ModLoader.addName(mod_InfiWeapons.blNetherrackFlail, "Blazing Netherrack Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blNetherrackFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.cactusRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.wGlowstoneFlail.setIconCoord(0, 12);
        ModLoader.addName(mod_InfiWeapons.wGlowstoneFlail, "Glowstone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wGlowstoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), Item.stick, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.stGlowstoneFlail.setIconCoord(1, 12);
        ModLoader.addName(mod_InfiWeapons.stGlowstoneFlail, "Stony Glowstone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stGlowstoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.stoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.iGlowstoneFlail.setIconCoord(2, 12);
        ModLoader.addName(mod_InfiWeapons.iGlowstoneFlail, "Hard Glowstone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iGlowstoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.ironRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.dGlowstoneFlail.setIconCoord(3, 12);
        ModLoader.addName(mod_InfiWeapons.dGlowstoneFlail, "Jeweled Glowstone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dGlowstoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.diamondRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.rGlowstoneFlail.setIconCoord(4, 12);
        ModLoader.addName(mod_InfiWeapons.rGlowstoneFlail, "Red Glowstone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rGlowstoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.redstoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.oGlowstoneFlail.setIconCoord(5, 12);
        ModLoader.addName(mod_InfiWeapons.oGlowstoneFlail, "Glassy Glowstone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oGlowstoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.obsidianRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.bGlowstoneFlail.setIconCoord(6, 12);
        ModLoader.addName(mod_InfiWeapons.bGlowstoneFlail, "Necrotic Glowstone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bGlowstoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), Item.bone, Character.valueOf('s'), Item.silk
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bGlowstoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.boneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.mGlowstoneFlail.setIconCoord(7, 12);
        ModLoader.addName(mod_InfiWeapons.mGlowstoneFlail, "Mossy Glowstone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mGlowstoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.mossyRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.nGlowstoneFlail.setIconCoord(8, 12);
        ModLoader.addName(mod_InfiWeapons.nGlowstoneFlail, "Bloody Glowstone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nGlowstoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.netherrackRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.glGlowstoneFlail.setIconCoord(9, 12);
        ModLoader.addName(mod_InfiWeapons.glGlowstoneFlail, "Bright Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glGlowstoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.iceGlowstoneFlail.setIconCoord(10, 12);
        ModLoader.addName(mod_InfiWeapons.iceGlowstoneFlail, "Icy Glowstone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceGlowstoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.iceRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.lGlowstoneFlail.setIconCoord(11, 12);
        ModLoader.addName(mod_InfiWeapons.lGlowstoneFlail, "Fiery Glowstone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.lGlowstoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.sGlowstoneFlail.setIconCoord(12, 12);
        ModLoader.addName(mod_InfiWeapons.sGlowstoneFlail, "Slimy Glowstone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sGlowstoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.slimeRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.blGlowstoneFlail.setIconCoord(13, 12);
        ModLoader.addName(mod_InfiWeapons.blGlowstoneFlail, "Blazing Glowstone Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blGlowstoneFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), Item.blazeRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.wIceFlail.setIconCoord(0, 13);
        ModLoader.addName(mod_InfiWeapons.wIceFlail, "Ice Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wIceFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.ice, Character.valueOf('|'), Item.stick, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.stIceFlail.setIconCoord(1, 13);
        ModLoader.addName(mod_InfiWeapons.stIceFlail, "Stony Ice Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stIceFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.stoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.iIceFlail.setIconCoord(2, 13);
        ModLoader.addName(mod_InfiWeapons.iIceFlail, "Hard Ice Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iIceFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.ironRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.dIceFlail.setIconCoord(3, 13);
        ModLoader.addName(mod_InfiWeapons.dIceFlail, "Jeweled Ice Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dIceFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.diamondRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.gIceFlail.setIconCoord(4, 13);
        ModLoader.addName(mod_InfiWeapons.gIceFlail, "Expensive Ice Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.gIceFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.goldRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.rIceFlail.setIconCoord(5, 13);
        ModLoader.addName(mod_InfiWeapons.rIceFlail, "Red Ice Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rIceFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.redstoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.oIceFlail.setIconCoord(6, 13);
        ModLoader.addName(mod_InfiWeapons.oIceFlail, "Glassy Ice Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oIceFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.obsidianRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.saIceFlail.setIconCoord(7, 13);
        ModLoader.addName(mod_InfiWeapons.saIceFlail, "Sandy Ice Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saIceFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.sandstoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.bIceFlail.setIconCoord(8, 13);
        ModLoader.addName(mod_InfiWeapons.bIceFlail, "Necrotic Ice Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bIceFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.ice, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bIceFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.boneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.glIceFlail.setIconCoord(9, 13);
        ModLoader.addName(mod_InfiWeapons.glIceFlail, "Glowing Ice Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glIceFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.glowstoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.iceIceFlail.setIconCoord(10, 13);
        ModLoader.addName(mod_InfiWeapons.iceIceFlail, "Condensed Ice Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceIceFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.iceRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.sIceFlail.setIconCoord(11, 13);
        ModLoader.addName(mod_InfiWeapons.sIceFlail, "Slimy Ice Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sIceFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.slimeRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.cIceFlail.setIconCoord(12, 13);
        ModLoader.addName(mod_InfiWeapons.cIceFlail, "Spiny Ice Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cIceFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.cactusRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.fIceFlail.setIconCoord(13, 13);
        ModLoader.addName(mod_InfiWeapons.fIceFlail, "Flaky Ice Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fIceFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.flintRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.brIceFlail.setIconCoord(14, 13);
        ModLoader.addName(mod_InfiWeapons.brIceFlail, "Baked Ice Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brIceFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.brickRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.dLavaFlail.setIconCoord(0, 14);
        ModLoader.addName(mod_InfiWeapons.dLavaFlail, "Jeweled Lava Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dLavaFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.diamondRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.rLavaFlail.setIconCoord(1, 14);
        ModLoader.addName(mod_InfiWeapons.rLavaFlail, "Red Lava Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rLavaFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.redstoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.bLavaFlail.setIconCoord(2, 14);
        ModLoader.addName(mod_InfiWeapons.bLavaFlail, "Necrotic Lava Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bLavaFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), Item.bone, Character.valueOf('s'), Item.silk
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bLavaFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.boneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.nLavaFlail.setIconCoord(3, 14);
        ModLoader.addName(mod_InfiWeapons.nLavaFlail, "Bloody Lava Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nLavaFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.netherrackRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.glLavaFlail.setIconCoord(4, 14);
        ModLoader.addName(mod_InfiWeapons.glLavaFlail, "Glowing Lava Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glLavaFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.lLavaFlail.setIconCoord(5, 14);
        ModLoader.addName(mod_InfiWeapons.lLavaFlail, "Flaming Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.lLavaFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.lavaRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.blLavaFlail.setIconCoord(6, 14);
        ModLoader.addName(mod_InfiWeapons.blLavaFlail, "Blazing Lava Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blLavaFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), Item.blazeRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.wSlimeFlail.setIconCoord(0, 15);
        ModLoader.addName(mod_InfiWeapons.wSlimeFlail, "Slime Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wSlimeFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), Item.stick, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.stSlimeFlail.setIconCoord(1, 15);
        ModLoader.addName(mod_InfiWeapons.stSlimeFlail, "Stony Slime Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stSlimeFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.stoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.iSlimeFlail.setIconCoord(2, 15);
        ModLoader.addName(mod_InfiWeapons.iSlimeFlail, "Hard Slime Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iSlimeFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.ironRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.dSlimeFlail.setIconCoord(3, 15);
        ModLoader.addName(mod_InfiWeapons.dSlimeFlail, "Jeweled Slime Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dSlimeFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.diamondRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.gSlimeFlail.setIconCoord(4, 15);
        ModLoader.addName(mod_InfiWeapons.gSlimeFlail, "Expensive Slime Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.gSlimeFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.goldRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.rSlimeFlail.setIconCoord(5, 15);
        ModLoader.addName(mod_InfiWeapons.rSlimeFlail, "Red Slime Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rSlimeFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.redstoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.oSlimeFlail.setIconCoord(6, 15);
        ModLoader.addName(mod_InfiWeapons.oSlimeFlail, "Glassy Slime Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oSlimeFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.obsidianRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.saSlimeFlail.setIconCoord(7, 15);
        ModLoader.addName(mod_InfiWeapons.saSlimeFlail, "Sandy Slime Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saSlimeFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.sandstoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.bSlimeFlail.setIconCoord(8, 15);
        ModLoader.addName(mod_InfiWeapons.bSlimeFlail, "Necrotic Slime Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bSlimeFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), Item.bone, Character.valueOf('s'), Item.silk
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bSlimeFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.boneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.pSlimeFlail.setIconCoord(9, 15);
        ModLoader.addName(mod_InfiWeapons.pSlimeFlail, "Fibery Slime Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pSlimeFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.paperRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.mSlimeFlail.setIconCoord(10, 15);
        ModLoader.addName(mod_InfiWeapons.mSlimeFlail, "Mossy Slime Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mSlimeFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.mossyRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.nSlimeFlail.setIconCoord(11, 15);
        ModLoader.addName(mod_InfiWeapons.nSlimeFlail, "Bloody Slime Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nSlimeFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.netherrackRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.glSlimeFlail.setIconCoord(12, 15);
        ModLoader.addName(mod_InfiWeapons.glSlimeFlail, "Glowing Slime Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glSlimeFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.iceSlimeFlail.setIconCoord(13, 15);
        ModLoader.addName(mod_InfiWeapons.iceSlimeFlail, "Icy Slime Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceSlimeFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.iceRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.lSlimeFlail.setIconCoord(14, 15);
        ModLoader.addName(mod_InfiWeapons.lSlimeFlail, "Fiery Slime Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.lSlimeFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.lavaRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.sSlimeFlail.setIconCoord(15, 15);
        ModLoader.addName(mod_InfiWeapons.sSlimeFlail, "Rubberized Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sSlimeFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.slimeRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.cSlimeFlail.setIconCoord(12, 14);
        ModLoader.addName(mod_InfiWeapons.cSlimeFlail, "Spiny Slime Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cSlimeFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.cactusRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.fSlimeFlail.setIconCoord(13, 14);
        ModLoader.addName(mod_InfiWeapons.fSlimeFlail, "Flaky Slime Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fSlimeFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.flintRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.brSlimeFlail.setIconCoord(14, 14);
        ModLoader.addName(mod_InfiWeapons.brSlimeFlail, "Baked Slime Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brSlimeFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.brickRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.blSlimeFlail.setIconCoord(15, 14);
        ModLoader.addName(mod_InfiWeapons.blSlimeFlail, "Blazing Slime Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blSlimeFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), Item.blazeRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.wCactusFlail.setIconCoord(10, 0);
        ModLoader.addName(mod_InfiWeapons.wCactusFlail, "Cactus Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wCactusFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), Item.stick, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.stCactusFlail.setIconCoord(11, 0);
        ModLoader.addName(mod_InfiWeapons.stCactusFlail, "Stony Cactus Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stCactusFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.stoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.saCactusFlail.setIconCoord(12, 0);
        ModLoader.addName(mod_InfiWeapons.saCactusFlail, "Sandy Cactus Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saCactusFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.sandstoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.bCactusFlail.setIconCoord(13, 0);
        ModLoader.addName(mod_InfiWeapons.bCactusFlail, "Necrotic Cactus Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bCactusFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), Item.bone, Character.valueOf('s'), Item.silk
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bCactusFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.boneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.pCactusFlail.setIconCoord(14, 0);
        ModLoader.addName(mod_InfiWeapons.pCactusFlail, "Fibery Cactus Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pCactusFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.paperRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.nCactusFlail.setIconCoord(15, 0);
        ModLoader.addName(mod_InfiWeapons.nCactusFlail, "Bloody Cactus Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nCactusFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.netherrackRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.sCactusFlail.setIconCoord(12, 1);
        ModLoader.addName(mod_InfiWeapons.sCactusFlail, "Slimy Cactus Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sCactusFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.slimeRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.cCactusFlail.setIconCoord(13, 1);
        ModLoader.addName(mod_InfiWeapons.cCactusFlail, "Spined Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cCactusFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.cactusRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.fCactusFlail.setIconCoord(14, 1);
        ModLoader.addName(mod_InfiWeapons.fCactusFlail, "Flaky Cactus Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fCactusFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.flintRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.brCactusFlail.setIconCoord(15, 1);
        ModLoader.addName(mod_InfiWeapons.brCactusFlail, "Baked Cactus Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brCactusFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.brickRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.wFlintFlail.setIconCoord(13, 2);
        ModLoader.addName(mod_InfiWeapons.wFlintFlail, "Flint Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wFlintFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.flint, Character.valueOf('|'), Item.stick, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.stFlintFlail.setIconCoord(14, 2);
        ModLoader.addName(mod_InfiWeapons.stFlintFlail, "Stony Flint Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stFlintFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.stoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.iFlintFlail.setIconCoord(15, 2);
        ModLoader.addName(mod_InfiWeapons.iFlintFlail, "Hard Flint Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iFlintFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.ironRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.gFlintFlail.setIconCoord(12, 3);
        ModLoader.addName(mod_InfiWeapons.gFlintFlail, "Expensive Flint Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.gFlintFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.goldRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.oFlintFlail.setIconCoord(13, 3);
        ModLoader.addName(mod_InfiWeapons.oFlintFlail, "Glassy Flint Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oFlintFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.obsidianRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.saFlintFlail.setIconCoord(14, 3);
        ModLoader.addName(mod_InfiWeapons.saFlintFlail, "Sandy Flint Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saFlintFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.sandstoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.bFlintFlail.setIconCoord(15, 3);
        ModLoader.addName(mod_InfiWeapons.bFlintFlail, "Necrotic Flint Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bFlintFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.flint, Character.valueOf('|'), Item.bone, Character.valueOf('s'), Item.silk
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bFlintFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.boneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.nFlintFlail.setIconCoord(12, 4);
        ModLoader.addName(mod_InfiWeapons.nFlintFlail, "Bloody Flint Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nFlintFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.netherrackRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.iceFlintFlail.setIconCoord(13, 4);
        ModLoader.addName(mod_InfiWeapons.iceFlintFlail, "Icy Flint Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceFlintFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.iceRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.sFlintFlail.setIconCoord(14, 4);
        ModLoader.addName(mod_InfiWeapons.sFlintFlail, "Slimy Flint Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sFlintFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.slimeRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.cFlintFlail.setIconCoord(15, 4);
        ModLoader.addName(mod_InfiWeapons.cFlintFlail, "Spiny Flint Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cFlintFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.cactusRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.fFlintFlail.setIconCoord(11, 5);
        ModLoader.addName(mod_InfiWeapons.fFlintFlail, "Shale Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fFlintFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.flintRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.brFlintFlail.setIconCoord(12, 5);
        ModLoader.addName(mod_InfiWeapons.brFlintFlail, "Baked Flint Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brFlintFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.brickRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.blFlintFlail.setIconCoord(13, 5);
        ModLoader.addName(mod_InfiWeapons.blFlintFlail, "Blazing Flint Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blFlintFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.flint, Character.valueOf('|'), Item.blazeRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.wBrickFlail.setIconCoord(14, 5);
        ModLoader.addName(mod_InfiWeapons.wBrickFlail, "Brick Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wBrickFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.brick, Character.valueOf('|'), Item.brick, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.stBrickFlail.setIconCoord(15, 5);
        ModLoader.addName(mod_InfiWeapons.stBrickFlail, "Stony Brick Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stBrickFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.stoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.saBrickFlail.setIconCoord(13, 6);
        ModLoader.addName(mod_InfiWeapons.saBrickFlail, "Sandstone Brick Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saBrickFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.sandstoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.bBrickFlail.setIconCoord(14, 6);
        ModLoader.addName(mod_InfiWeapons.bBrickFlail, "Necrotic Brick Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bBrickFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.brick, Character.valueOf('|'), Item.bone, Character.valueOf('s'), Item.silk
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bBrickFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.boneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.pBrickFlail.setIconCoord(15, 6);
        ModLoader.addName(mod_InfiWeapons.pBrickFlail, "Fibery Brick Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pBrickFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.paperRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.nBrickFlail.setIconCoord(11, 7);
        ModLoader.addName(mod_InfiWeapons.nBrickFlail, "Bloody Brick Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nBrickFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.netherrackRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.iceBrickFlail.setIconCoord(12, 7);
        ModLoader.addName(mod_InfiWeapons.iceBrickFlail, "Icy Brick Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceBrickFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.iceRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.sBrickFlail.setIconCoord(13, 7);
        ModLoader.addName(mod_InfiWeapons.sBrickFlail, "Slimy Brick Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sBrickFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.slimeRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.cBrickFlail.setIconCoord(14, 7);
        ModLoader.addName(mod_InfiWeapons.cBrickFlail, "Spiny Brick Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cBrickFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.cactusRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.fBrickFlail.setIconCoord(15, 7);
        ModLoader.addName(mod_InfiWeapons.fBrickFlail, "Flaky Brick Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fBrickFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.flintRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.brBrickFlail.setIconCoord(15, 8);
        ModLoader.addName(mod_InfiWeapons.brBrickFlail, "Look-alike Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brBrickFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.brickRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.dBlazeFlail.setIconCoord(7, 9);
        ModLoader.addName(mod_InfiWeapons.dBlazeFlail, "Jeweled Blaze Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dBlazeFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), mod_InfiTools.diamondRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.rBlazeFlail.setIconCoord(8, 9);
        ModLoader.addName(mod_InfiWeapons.rBlazeFlail, "Red Blaze Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rBlazeFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), mod_InfiTools.redstoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.bBlazeFlail.setIconCoord(9, 9);
        ModLoader.addName(mod_InfiWeapons.bBlazeFlail, "Necrotic Blaze Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bBlazeFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), Item.bone, Character.valueOf('s'), Item.silk
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bBlazeFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), mod_InfiTools.boneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.nBlazeFlail.setIconCoord(10, 9);
        ModLoader.addName(mod_InfiWeapons.nBlazeFlail, "Bloody Blaze Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nBlazeFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), mod_InfiTools.netherrackRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.glBlazeFlail.setIconCoord(11, 9);
        ModLoader.addName(mod_InfiWeapons.glBlazeFlail, "Glowing Blaze Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glBlazeFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.lBlazeFlail.setIconCoord(12, 9);
        ModLoader.addName(mod_InfiWeapons.lBlazeFlail, "Fiery Blaze Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.lBlazeFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), Item.blazeRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.fBlazeFlail.setIconCoord(13, 9);
        ModLoader.addName(mod_InfiWeapons.fBlazeFlail, "Flaky Blaze Flail");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fBlazeFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), Item.blazeRod, Character.valueOf('s'), Item.silk
                });
        mod_InfiWeapons.blBlazeFlail.setIconCoord(14, 9);
        ModLoader.addName(mod_InfiWeapons.blBlazeFlail, "Blasting Ball");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blBlazeFlail, 1), new Object[]
                {
                    "  s", " |s", "| m", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), Item.blazeRod, Character.valueOf('s'), Item.silk
                });
        return 0;
    }
}
