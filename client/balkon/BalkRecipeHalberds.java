package net.minecraft.src.balkon;

import net.minecraft.src.*;

public class BalkRecipeHalberds
{
    public BalkRecipeHalberds()
    {
    }

    public static int recipeStorm()
    {
        mod_InfiWeapons.stWoodHalberd.setIconCoord(1, 0);
        ModLoader.addName(mod_InfiWeapons.stWoodHalberd, "Stony Wooden Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stWoodHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.saWoodHalberd.setIconCoord(2, 0);
        ModLoader.addName(mod_InfiWeapons.saWoodHalberd, "Sandy Wooden Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saWoodHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bWoodHalberd.setIconCoord(3, 0);
        ModLoader.addName(mod_InfiWeapons.bWoodHalberd, "Necrotic Wooden Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bWoodHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bWoodHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.pWoodHalberd.setIconCoord(4, 0);
        ModLoader.addName(mod_InfiWeapons.pWoodHalberd, "Fibery Wooden Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pWoodHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_InfiWeapons.nWoodHalberd.setIconCoord(5, 0);
        ModLoader.addName(mod_InfiWeapons.nWoodHalberd, "Bloody Wooden Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nWoodHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.sWoodHalberd.setIconCoord(6, 0);
        ModLoader.addName(mod_InfiWeapons.sWoodHalberd, "Slimy Wooden Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sWoodHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cWoodHalberd.setIconCoord(7, 0);
        ModLoader.addName(mod_InfiWeapons.cWoodHalberd, "Spiny Wooden Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cWoodHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fWoodHalberd.setIconCoord(8, 0);
        ModLoader.addName(mod_InfiWeapons.fWoodHalberd, "Flaky Wooden Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fWoodHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brWoodHalberd.setIconCoord(9, 0);
        ModLoader.addName(mod_InfiWeapons.brWoodHalberd, "Baked Wooden Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brWoodHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.stStoneHalberd.setIconCoord(1, 1);
        ModLoader.addName(mod_InfiWeapons.stStoneHalberd, "Heavy Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stStoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stStoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.saStoneHalberd.setIconCoord(2, 1);
        ModLoader.addName(mod_InfiWeapons.saStoneHalberd, "Sandy Stone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saStoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saStoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bStoneHalberd.setIconCoord(3, 1);
        ModLoader.addName(mod_InfiWeapons.bStoneHalberd, "Necrotic Stone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bStoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bStoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.stone, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bStoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bStoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.pStoneHalberd.setIconCoord(4, 1);
        ModLoader.addName(mod_InfiWeapons.pStoneHalberd, "Fibery Stone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pStoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pStoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_InfiWeapons.mStoneHalberd.setIconCoord(5, 1);
        ModLoader.addName(mod_InfiWeapons.mStoneHalberd, "Mossy Stone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mStoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mStoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.nStoneHalberd.setIconCoord(6, 1);
        ModLoader.addName(mod_InfiWeapons.nStoneHalberd, "Bloody Stone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nStoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nStoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.iceStoneHalberd.setIconCoord(7, 1);
        ModLoader.addName(mod_InfiWeapons.iceStoneHalberd, "Icy Stone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceStoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceStoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.sStoneHalberd.setIconCoord(8, 1);
        ModLoader.addName(mod_InfiWeapons.sStoneHalberd, "Slimy Stone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sStoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sStoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cStoneHalberd.setIconCoord(9, 1);
        ModLoader.addName(mod_InfiWeapons.cStoneHalberd, "Spiny Stone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cStoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cStoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fStoneHalberd.setIconCoord(10, 1);
        ModLoader.addName(mod_InfiWeapons.fStoneHalberd, "Flaky Stone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fStoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fStoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brStoneHalberd.setIconCoord(11, 1);
        ModLoader.addName(mod_InfiWeapons.brStoneHalberd, "Baked Stone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brStoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brStoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.stIronHalberd.setIconCoord(1, 2);
        ModLoader.addName(mod_InfiWeapons.stIronHalberd, "Stony Iron Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stIronHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iIronHalberd.setIconCoord(2, 2);
        ModLoader.addName(mod_InfiWeapons.iIronHalberd, "Ironic Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iIronHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.dIronHalberd.setIconCoord(3, 2);
        ModLoader.addName(mod_InfiWeapons.dIronHalberd, "Jeweled Iron Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dIronHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.gIronHalberd.setIconCoord(4, 2);
        ModLoader.addName(mod_InfiWeapons.gIronHalberd, "Expensive Iron Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.gIronHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_InfiWeapons.rIronHalberd.setIconCoord(5, 2);
        ModLoader.addName(mod_InfiWeapons.rIronHalberd, "Red Iron Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rIronHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oIronHalberd.setIconCoord(6, 2);
        ModLoader.addName(mod_InfiWeapons.oIronHalberd, "Glassy Iron Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oIronHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.bIronHalberd.setIconCoord(7, 2);
        ModLoader.addName(mod_InfiWeapons.bIronHalberd, "Necrotic Iron Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bIronHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bIronHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.nIronHalberd.setIconCoord(8, 2);
        ModLoader.addName(mod_InfiWeapons.nIronHalberd, "Bloody Iron Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nIronHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glIronHalberd.setIconCoord(9, 2);
        ModLoader.addName(mod_InfiWeapons.glIronHalberd, "Glowing Iron Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glIronHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.iceIronHalberd.setIconCoord(10, 2);
        ModLoader.addName(mod_InfiWeapons.iceIronHalberd, "Icy Iron Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceIronHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.sIronHalberd.setIconCoord(11, 2);
        ModLoader.addName(mod_InfiWeapons.sIronHalberd, "Slimy Iron Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sIronHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.blIronHalberd.setIconCoord(12, 2);
        ModLoader.addName(mod_InfiWeapons.blIronHalberd, "Blazing Iron Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blIronHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.stDiamondHalberd.setIconCoord(1, 3);
        ModLoader.addName(mod_InfiWeapons.stDiamondHalberd, "Stony Diamond Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stDiamondHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iDiamondHalberd.setIconCoord(2, 3);
        ModLoader.addName(mod_InfiWeapons.iDiamondHalberd, "Hard Diamond Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iDiamondHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.dDiamondHalberd.setIconCoord(3, 3);
        ModLoader.addName(mod_InfiWeapons.dDiamondHalberd, "Diamondium Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dDiamondHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.gDiamondHalberd.setIconCoord(4, 3);
        ModLoader.addName(mod_InfiWeapons.gDiamondHalberd, "Expensive Diamond Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.gDiamondHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_InfiWeapons.rDiamondHalberd.setIconCoord(5, 3);
        ModLoader.addName(mod_InfiWeapons.rDiamondHalberd, "Red Diamond Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rDiamondHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oDiamondHalberd.setIconCoord(6, 3);
        ModLoader.addName(mod_InfiWeapons.oDiamondHalberd, "Glassy Diamond Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oDiamondHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.bDiamondHalberd.setIconCoord(7, 3);
        ModLoader.addName(mod_InfiWeapons.bDiamondHalberd, "Necrotic Diamond Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bDiamondHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bDiamondHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.mDiamondHalberd.setIconCoord(8, 3);
        ModLoader.addName(mod_InfiWeapons.mDiamondHalberd, "Mossy Diamond Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mDiamondHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.nDiamondHalberd.setIconCoord(9, 3);
        ModLoader.addName(mod_InfiWeapons.nDiamondHalberd, "Bloody Diamond Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nDiamondHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glDiamondHalberd.setIconCoord(10, 3);
        ModLoader.addName(mod_InfiWeapons.glDiamondHalberd, "Glowing Diamond Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glDiamondHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.blDiamondHalberd.setIconCoord(11, 3);
        ModLoader.addName(mod_InfiWeapons.blDiamondHalberd, "Blazing Diamond Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blDiamondHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.stGoldHalberd.setIconCoord(1, 4);
        ModLoader.addName(mod_InfiWeapons.stGoldHalberd, "Stony Gold Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stGoldHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.gGoldHalberd.setIconCoord(2, 4);
        ModLoader.addName(mod_InfiWeapons.gGoldHalberd, "Expensive Useless Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.gGoldHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_InfiWeapons.oGoldHalberd.setIconCoord(3, 4);
        ModLoader.addName(mod_InfiWeapons.oGoldHalberd, "Glassy Gold Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oGoldHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.saGoldHalberd.setIconCoord(4, 4);
        ModLoader.addName(mod_InfiWeapons.saGoldHalberd, "Sandy Gold Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saGoldHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bGoldHalberd.setIconCoord(5, 4);
        ModLoader.addName(mod_InfiWeapons.bGoldHalberd, "Necrotic Gold Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bGoldHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bGoldHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.mGoldHalberd.setIconCoord(6, 4);
        ModLoader.addName(mod_InfiWeapons.mGoldHalberd, "Mossy Gold Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mGoldHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.nGoldHalberd.setIconCoord(7, 4);
        ModLoader.addName(mod_InfiWeapons.nGoldHalberd, "Bloody Gold Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nGoldHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glGoldHalberd.setIconCoord(8, 4);
        ModLoader.addName(mod_InfiWeapons.glGoldHalberd, "Glowing Gold Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glGoldHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.iceGoldHalberd.setIconCoord(9, 4);
        ModLoader.addName(mod_InfiWeapons.iceGoldHalberd, "Icy Gold Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceGoldHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.sGoldHalberd.setIconCoord(10, 4);
        ModLoader.addName(mod_InfiWeapons.sGoldHalberd, "Slimy Gold Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sGoldHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.fGoldHalberd.setIconCoord(11, 4);
        ModLoader.addName(mod_InfiWeapons.fGoldHalberd, "Flaky Gold Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fGoldHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.wRedstoneHalberd.setIconCoord(0, 5);
        ModLoader.addName(mod_InfiWeapons.wRedstoneHalberd, "Redstone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wRedstoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stRedstoneHalberd.setIconCoord(1, 5);
        ModLoader.addName(mod_InfiWeapons.stRedstoneHalberd, "Stony Redstone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stRedstoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iRedstoneHalberd.setIconCoord(2, 5);
        ModLoader.addName(mod_InfiWeapons.iRedstoneHalberd, "Hard Redstone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iRedstoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.dRedstoneHalberd.setIconCoord(3, 5);
        ModLoader.addName(mod_InfiWeapons.dRedstoneHalberd, "Jeweled Redstone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dRedstoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.rRedstoneHalberd.setIconCoord(4, 5);
        ModLoader.addName(mod_InfiWeapons.rRedstoneHalberd, "Redredred Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rRedstoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oRedstoneHalberd.setIconCoord(5, 5);
        ModLoader.addName(mod_InfiWeapons.oRedstoneHalberd, "Glassy Redstone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oRedstoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.bRedstoneHalberd.setIconCoord(6, 5);
        ModLoader.addName(mod_InfiWeapons.bRedstoneHalberd, "Necrotic Redstone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bRedstoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bRedstoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.mRedstoneHalberd.setIconCoord(7, 5);
        ModLoader.addName(mod_InfiWeapons.mRedstoneHalberd, "Mossy Redstone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mRedstoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.glRedstoneHalberd.setIconCoord(8, 5);
        ModLoader.addName(mod_InfiWeapons.glRedstoneHalberd, "Glowing Redstone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glRedstoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.sRedstoneHalberd.setIconCoord(9, 5);
        ModLoader.addName(mod_InfiWeapons.sRedstoneHalberd, "Slimy Redstone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sRedstoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.blRedstoneHalberd.setIconCoord(10, 5);
        ModLoader.addName(mod_InfiWeapons.blRedstoneHalberd, "Blazing Redstone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blRedstoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.wObsidianHalberd.setIconCoord(0, 6);
        ModLoader.addName(mod_InfiWeapons.wObsidianHalberd, "Obsidian Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wObsidianHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stObsidianHalberd.setIconCoord(1, 6);
        ModLoader.addName(mod_InfiWeapons.stObsidianHalberd, "Stony Obsidian Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stObsidianHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iObsidianHalberd.setIconCoord(2, 6);
        ModLoader.addName(mod_InfiWeapons.iObsidianHalberd, "Hard Obsidian Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iObsidianHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.dObsidianHalberd.setIconCoord(3, 6);
        ModLoader.addName(mod_InfiWeapons.dObsidianHalberd, "Jeweled Obsidian Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dObsidianHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.gObsidianHalberd.setIconCoord(4, 6);
        ModLoader.addName(mod_InfiWeapons.gObsidianHalberd, "Expensive Obsidian Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.gObsidianHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_InfiWeapons.rObsidianHalberd.setIconCoord(5, 6);
        ModLoader.addName(mod_InfiWeapons.rObsidianHalberd, "Red Obsidian Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rObsidianHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oObsidianHalberd.setIconCoord(6, 6);
        ModLoader.addName(mod_InfiWeapons.oObsidianHalberd, "Wicked Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oObsidianHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.bObsidianHalberd.setIconCoord(7, 6);
        ModLoader.addName(mod_InfiWeapons.bObsidianHalberd, "Necrotic Obsidian Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bObsidianHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bObsidianHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.nObsidianHalberd.setIconCoord(8, 6);
        ModLoader.addName(mod_InfiWeapons.nObsidianHalberd, "Bloody Obsidian Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nObsidianHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glObsidianHalberd.setIconCoord(9, 6);
        ModLoader.addName(mod_InfiWeapons.glObsidianHalberd, "Glowing Obsidian Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glObsidianHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.sObsidianHalberd.setIconCoord(10, 6);
        ModLoader.addName(mod_InfiWeapons.sObsidianHalberd, "Slimy Obsidian Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sObsidianHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.fObsidianHalberd.setIconCoord(11, 6);
        ModLoader.addName(mod_InfiWeapons.fObsidianHalberd, "Flaky Obsidian Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fObsidianHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.blObsidianHalberd.setIconCoord(12, 6);
        ModLoader.addName(mod_InfiWeapons.blObsidianHalberd, "Blazing Obsidian Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blObsidianHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.wSandstoneHalberd.setIconCoord(0, 7);
        ModLoader.addName(mod_InfiWeapons.wSandstoneHalberd, "Sandstone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wSandstoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stSandstoneHalberd.setIconCoord(1, 7);
        ModLoader.addName(mod_InfiWeapons.stSandstoneHalberd, "Stony Sandstone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stSandstoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.saSandstoneHalberd.setIconCoord(2, 7);
        ModLoader.addName(mod_InfiWeapons.saSandstoneHalberd, "Sandstreak");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saSandstoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bSandstoneHalberd.setIconCoord(3, 7);
        ModLoader.addName(mod_InfiWeapons.bSandstoneHalberd, "Necrotic Sandstone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bSandstoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bSandstoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.pSandstoneHalberd.setIconCoord(4, 7);
        ModLoader.addName(mod_InfiWeapons.pSandstoneHalberd, "Fibery Sandstone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pSandstoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_InfiWeapons.nSandstoneHalberd.setIconCoord(5, 7);
        ModLoader.addName(mod_InfiWeapons.nSandstoneHalberd, "Bloody Sandstone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nSandstoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.iceSandstoneHalberd.setIconCoord(6, 7);
        ModLoader.addName(mod_InfiWeapons.iceSandstoneHalberd, "Icy Sandstone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceSandstoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.sSandstoneHalberd.setIconCoord(7, 7);
        ModLoader.addName(mod_InfiWeapons.sSandstoneHalberd, "Slimy Sandstone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sSandstoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cSandstoneHalberd.setIconCoord(8, 7);
        ModLoader.addName(mod_InfiWeapons.cSandstoneHalberd, "Spiny Sandstone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cSandstoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fSandstoneHalberd.setIconCoord(9, 7);
        ModLoader.addName(mod_InfiWeapons.fSandstoneHalberd, "Flaky Sandstone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fSandstoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brSandstoneHalberd.setIconCoord(10, 7);
        ModLoader.addName(mod_InfiWeapons.brSandstoneHalberd, "Baked Sandstone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brSandstoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.wBoneHalberd.setIconCoord(0, 8);
        ModLoader.addName(mod_InfiWeapons.wBoneHalberd, "Bone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wBoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stBoneHalberd.setIconCoord(1, 8);
        ModLoader.addName(mod_InfiWeapons.stBoneHalberd, "Stony Bone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stBoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iBoneHalberd.setIconCoord(2, 8);
        ModLoader.addName(mod_InfiWeapons.iBoneHalberd, "Hard Bone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iBoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.dBoneHalberd.setIconCoord(3, 8);
        ModLoader.addName(mod_InfiWeapons.dBoneHalberd, "Jeweled Bone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dBoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.rBoneHalberd.setIconCoord(4, 8);
        ModLoader.addName(mod_InfiWeapons.rBoneHalberd, "Red Bone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rBoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oBoneHalberd.setIconCoord(5, 8);
        ModLoader.addName(mod_InfiWeapons.oBoneHalberd, "Glassy Bone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oBoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.bBoneHalberd.setIconCoord(6, 8);
        ModLoader.addName(mod_InfiWeapons.bBoneHalberd, "Reanimated Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bBoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bBoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.mBoneHalberd.setIconCoord(7, 8);
        ModLoader.addName(mod_InfiWeapons.mBoneHalberd, "Mossy Bone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mBoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.nBoneHalberd.setIconCoord(8, 8);
        ModLoader.addName(mod_InfiWeapons.nBoneHalberd, "Netherrack Bone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nBoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glBoneHalberd.setIconCoord(9, 8);
        ModLoader.addName(mod_InfiWeapons.glBoneHalberd, "Glowstone Bone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glBoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.sBoneHalberd.setIconCoord(10, 8);
        ModLoader.addName(mod_InfiWeapons.sBoneHalberd, "Slimy Bone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sBoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cBoneHalberd.setIconCoord(11, 8);
        ModLoader.addName(mod_InfiWeapons.cBoneHalberd, "Spiny Bone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cBoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fBoneHalberd.setIconCoord(12, 8);
        ModLoader.addName(mod_InfiWeapons.fBoneHalberd, "Flaky Bone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fBoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brBoneHalberd.setIconCoord(13, 8);
        ModLoader.addName(mod_InfiWeapons.brBoneHalberd, "Baked Bone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brBoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.blBoneHalberd.setIconCoord(14, 8);
        ModLoader.addName(mod_InfiWeapons.blBoneHalberd, "Blazing Bone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blBoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.wPaperHalberd.setIconCoord(0, 9);
        ModLoader.addName(mod_InfiWeapons.wPaperHalberd, "Paper Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wPaperHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.saPaperHalberd.setIconCoord(1, 9);
        ModLoader.addName(mod_InfiWeapons.saPaperHalberd, "Stony Paper Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saPaperHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bPaperHalberd.setIconCoord(2, 9);
        ModLoader.addName(mod_InfiWeapons.bPaperHalberd, "Necrotic Paper Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bPaperHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bPaperHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.pPaperHalberd.setIconCoord(3, 9);
        ModLoader.addName(mod_InfiWeapons.pPaperHalberd, "Paper Prodder");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pPaperHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_InfiWeapons.sPaperHalberd.setIconCoord(4, 9);
        ModLoader.addName(mod_InfiWeapons.sPaperHalberd, "Slimy Paper Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sPaperHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cPaperHalberd.setIconCoord(5, 9);
        ModLoader.addName(mod_InfiWeapons.cPaperHalberd, "Spiny Paper Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cPaperHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.brPaperHalberd.setIconCoord(6, 9);
        ModLoader.addName(mod_InfiWeapons.brPaperHalberd, "Baked Paper Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brPaperHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.stMossyHalberd.setIconCoord(0, 10);
        ModLoader.addName(mod_InfiWeapons.stMossyHalberd, "Stony Moss-Covered Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stMossyHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.dMossyHalberd.setIconCoord(1, 10);
        ModLoader.addName(mod_InfiWeapons.dMossyHalberd, "Jeweled Moss-Covered Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dMossyHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.rMossyHalberd.setIconCoord(2, 10);
        ModLoader.addName(mod_InfiWeapons.rMossyHalberd, "Red Moss-Covered Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rMossyHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.bMossyHalberd.setIconCoord(3, 10);
        ModLoader.addName(mod_InfiWeapons.bMossyHalberd, "Necrotic Moss-Covered Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bMossyHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bMossyHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.mMossyHalberd.setIconCoord(4, 10);
        ModLoader.addName(mod_InfiWeapons.mMossyHalberd, "Living Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mMossyHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.glMossyHalberd.setIconCoord(5, 10);
        ModLoader.addName(mod_InfiWeapons.glMossyHalberd, "Glowing Moss-Covered Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glMossyHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.wNetherrackHalberd.setIconCoord(0, 11);
        ModLoader.addName(mod_InfiWeapons.wNetherrackHalberd, "Netherrack Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wNetherrackHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stNetherrackHalberd.setIconCoord(1, 11);
        ModLoader.addName(mod_InfiWeapons.stNetherrackHalberd, "Stony Netherrack Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stNetherrackHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iNetherrackHalberd.setIconCoord(2, 11);
        ModLoader.addName(mod_InfiWeapons.iNetherrackHalberd, "Hard Netherrack Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iNetherrackHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.rNetherrackHalberd.setIconCoord(3, 11);
        ModLoader.addName(mod_InfiWeapons.rNetherrackHalberd, "Red Netherrack Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rNetherrackHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oNetherrackHalberd.setIconCoord(4, 11);
        ModLoader.addName(mod_InfiWeapons.oNetherrackHalberd, "Glassy Netherrack Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oNetherrackHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.saNetherrackHalberd.setIconCoord(5, 11);
        ModLoader.addName(mod_InfiWeapons.saNetherrackHalberd, "Sandy Netherrack Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saNetherrackHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bNetherrackHalberd.setIconCoord(6, 11);
        ModLoader.addName(mod_InfiWeapons.bNetherrackHalberd, "Necrotic Netherrack Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bNetherrackHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bNetherrackHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.mNetherrackHalberd.setIconCoord(7, 11);
        ModLoader.addName(mod_InfiWeapons.mNetherrackHalberd, "Mossy Netherrack Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mNetherrackHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.nNetherrackHalberd.setIconCoord(8, 11);
        ModLoader.addName(mod_InfiWeapons.nNetherrackHalberd, "Bloody Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nNetherrackHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glNetherrackHalberd.setIconCoord(9, 11);
        ModLoader.addName(mod_InfiWeapons.glNetherrackHalberd, "Glowing Netherrack Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glNetherrackHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.iceNetherrackHalberd.setIconCoord(10, 11);
        ModLoader.addName(mod_InfiWeapons.iceNetherrackHalberd, "Icy Netherrack Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceNetherrackHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.sNetherrackHalberd.setIconCoord(11, 11);
        ModLoader.addName(mod_InfiWeapons.sNetherrackHalberd, "Slimy Netherrack Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sNetherrackHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cNetherrackHalberd.setIconCoord(12, 11);
        ModLoader.addName(mod_InfiWeapons.cNetherrackHalberd, "Spiny Netherrack Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cNetherrackHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fNetherrackHalberd.setIconCoord(13, 11);
        ModLoader.addName(mod_InfiWeapons.fNetherrackHalberd, "Flaky Netherrack Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fNetherrackHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.brNetherrackHalberd.setIconCoord(14, 11);
        ModLoader.addName(mod_InfiWeapons.brNetherrackHalberd, "Baked Netherrack Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brNetherrackHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.blNetherrackHalberd.setIconCoord(15, 11);
        ModLoader.addName(mod_InfiWeapons.blNetherrackHalberd, "Blazing Netherrack Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blNetherrackHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.wGlowstoneHalberd.setIconCoord(0, 12);
        ModLoader.addName(mod_InfiWeapons.wGlowstoneHalberd, "Glowstone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wGlowstoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stGlowstoneHalberd.setIconCoord(1, 12);
        ModLoader.addName(mod_InfiWeapons.stGlowstoneHalberd, "Stony Glowstone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stGlowstoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iGlowstoneHalberd.setIconCoord(2, 12);
        ModLoader.addName(mod_InfiWeapons.iGlowstoneHalberd, "Hard Glowstone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iGlowstoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.dGlowstoneHalberd.setIconCoord(3, 12);
        ModLoader.addName(mod_InfiWeapons.dGlowstoneHalberd, "Jeweled Glowstone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dGlowstoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.rGlowstoneHalberd.setIconCoord(4, 12);
        ModLoader.addName(mod_InfiWeapons.rGlowstoneHalberd, "Red Glowstone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rGlowstoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oGlowstoneHalberd.setIconCoord(5, 12);
        ModLoader.addName(mod_InfiWeapons.oGlowstoneHalberd, "Glassy Glowstone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oGlowstoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.bGlowstoneHalberd.setIconCoord(6, 12);
        ModLoader.addName(mod_InfiWeapons.bGlowstoneHalberd, "Necrotic Glowstone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bGlowstoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bGlowstoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.mGlowstoneHalberd.setIconCoord(7, 12);
        ModLoader.addName(mod_InfiWeapons.mGlowstoneHalberd, "Mossy Glowstone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mGlowstoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.nGlowstoneHalberd.setIconCoord(8, 12);
        ModLoader.addName(mod_InfiWeapons.nGlowstoneHalberd, "Bloody Glowstone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nGlowstoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glGlowstoneHalberd.setIconCoord(9, 12);
        ModLoader.addName(mod_InfiWeapons.glGlowstoneHalberd, "Bright Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glGlowstoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.iceGlowstoneHalberd.setIconCoord(10, 12);
        ModLoader.addName(mod_InfiWeapons.iceGlowstoneHalberd, "Icy Glowstone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceGlowstoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.lGlowstoneHalberd.setIconCoord(11, 12);
        ModLoader.addName(mod_InfiWeapons.lGlowstoneHalberd, "Fiery Glowstone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.lGlowstoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.sGlowstoneHalberd.setIconCoord(12, 12);
        ModLoader.addName(mod_InfiWeapons.sGlowstoneHalberd, "Slimy Glowstone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sGlowstoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.blGlowstoneHalberd.setIconCoord(13, 12);
        ModLoader.addName(mod_InfiWeapons.blGlowstoneHalberd, "Blazing Glowstone Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blGlowstoneHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.wIceHalberd.setIconCoord(0, 13);
        ModLoader.addName(mod_InfiWeapons.wIceHalberd, "Ice Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wIceHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stIceHalberd.setIconCoord(1, 13);
        ModLoader.addName(mod_InfiWeapons.stIceHalberd, "Stony Ice Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stIceHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iIceHalberd.setIconCoord(2, 13);
        ModLoader.addName(mod_InfiWeapons.iIceHalberd, "Hard Ice Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iIceHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.dIceHalberd.setIconCoord(3, 13);
        ModLoader.addName(mod_InfiWeapons.dIceHalberd, "Jeweled Ice Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dIceHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.gIceHalberd.setIconCoord(4, 13);
        ModLoader.addName(mod_InfiWeapons.gIceHalberd, "Expensive Ice Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.gIceHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_InfiWeapons.rIceHalberd.setIconCoord(5, 13);
        ModLoader.addName(mod_InfiWeapons.rIceHalberd, "Red Ice Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rIceHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oIceHalberd.setIconCoord(6, 13);
        ModLoader.addName(mod_InfiWeapons.oIceHalberd, "Glassy Ice Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oIceHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.saIceHalberd.setIconCoord(7, 13);
        ModLoader.addName(mod_InfiWeapons.saIceHalberd, "Sandy Ice Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saIceHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bIceHalberd.setIconCoord(8, 13);
        ModLoader.addName(mod_InfiWeapons.bIceHalberd, "Necrotic Ice Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bIceHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bIceHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.glIceHalberd.setIconCoord(9, 13);
        ModLoader.addName(mod_InfiWeapons.glIceHalberd, "Glowing Ice Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glIceHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.iceIceHalberd.setIconCoord(10, 13);
        ModLoader.addName(mod_InfiWeapons.iceIceHalberd, "Ice Striation");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceIceHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.sIceHalberd.setIconCoord(11, 13);
        ModLoader.addName(mod_InfiWeapons.sIceHalberd, "Slimy Ice Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sIceHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cIceHalberd.setIconCoord(12, 13);
        ModLoader.addName(mod_InfiWeapons.cIceHalberd, "Spiny Ice Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cIceHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fIceHalberd.setIconCoord(13, 13);
        ModLoader.addName(mod_InfiWeapons.fIceHalberd, "Flaky Ice Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fIceHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brIceHalberd.setIconCoord(14, 13);
        ModLoader.addName(mod_InfiWeapons.brIceHalberd, "Baked Ice Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brIceHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.dLavaHalberd.setIconCoord(0, 14);
        ModLoader.addName(mod_InfiWeapons.dLavaHalberd, "Jeweled Lava Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dLavaHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.rLavaHalberd.setIconCoord(1, 14);
        ModLoader.addName(mod_InfiWeapons.rLavaHalberd, "Red Lava Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rLavaHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.bLavaHalberd.setIconCoord(2, 14);
        ModLoader.addName(mod_InfiWeapons.bLavaHalberd, "Necrotic Lava Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bLavaHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bLavaHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.nLavaHalberd.setIconCoord(3, 14);
        ModLoader.addName(mod_InfiWeapons.nLavaHalberd, "Bloody Lava Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nLavaHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glLavaHalberd.setIconCoord(4, 14);
        ModLoader.addName(mod_InfiWeapons.glLavaHalberd, "Glowing Lava Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glLavaHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.lLavaHalberd.setIconCoord(5, 14);
        ModLoader.addName(mod_InfiWeapons.lLavaHalberd, "Heatpierce");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.lLavaHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.lavaRod
                });
        mod_InfiWeapons.blLavaHalberd.setIconCoord(6, 14);
        ModLoader.addName(mod_InfiWeapons.blLavaHalberd, "Blazing Lava Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blLavaHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.wSlimeHalberd.setIconCoord(0, 15);
        ModLoader.addName(mod_InfiWeapons.wSlimeHalberd, "Slime Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wSlimeHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stSlimeHalberd.setIconCoord(1, 15);
        ModLoader.addName(mod_InfiWeapons.stSlimeHalberd, "Stony Slime Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stSlimeHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iSlimeHalberd.setIconCoord(2, 15);
        ModLoader.addName(mod_InfiWeapons.iSlimeHalberd, "Hard Slime Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iSlimeHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.dSlimeHalberd.setIconCoord(3, 15);
        ModLoader.addName(mod_InfiWeapons.dSlimeHalberd, "Jeweled Slime Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dSlimeHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.gSlimeHalberd.setIconCoord(4, 15);
        ModLoader.addName(mod_InfiWeapons.gSlimeHalberd, "Expensive Slime Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.gSlimeHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_InfiWeapons.rSlimeHalberd.setIconCoord(5, 15);
        ModLoader.addName(mod_InfiWeapons.rSlimeHalberd, "Red Slime Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rSlimeHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oSlimeHalberd.setIconCoord(6, 15);
        ModLoader.addName(mod_InfiWeapons.oSlimeHalberd, "Glassy Slime Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oSlimeHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.saSlimeHalberd.setIconCoord(7, 15);
        ModLoader.addName(mod_InfiWeapons.saSlimeHalberd, "Sandy Slime Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saSlimeHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bSlimeHalberd.setIconCoord(8, 15);
        ModLoader.addName(mod_InfiWeapons.bSlimeHalberd, "Necrotic Slime Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bSlimeHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bSlimeHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.pSlimeHalberd.setIconCoord(9, 15);
        ModLoader.addName(mod_InfiWeapons.pSlimeHalberd, "Fibery Slime Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pSlimeHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_InfiWeapons.mSlimeHalberd.setIconCoord(10, 15);
        ModLoader.addName(mod_InfiWeapons.mSlimeHalberd, "Mossy Slime Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mSlimeHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.nSlimeHalberd.setIconCoord(11, 15);
        ModLoader.addName(mod_InfiWeapons.nSlimeHalberd, "Bloody Slime Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nSlimeHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glSlimeHalberd.setIconCoord(12, 15);
        ModLoader.addName(mod_InfiWeapons.glSlimeHalberd, "Glowing Slime Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glSlimeHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.iceSlimeHalberd.setIconCoord(13, 15);
        ModLoader.addName(mod_InfiWeapons.iceSlimeHalberd, "Icy Slime Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceSlimeHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.lSlimeHalberd.setIconCoord(14, 15);
        ModLoader.addName(mod_InfiWeapons.lSlimeHalberd, "Fiery Slime Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.lSlimeHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.lavaRod
                });
        mod_InfiWeapons.sSlimeHalberd.setIconCoord(15, 15);
        ModLoader.addName(mod_InfiWeapons.sSlimeHalberd, "Toy Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sSlimeHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cSlimeHalberd.setIconCoord(12, 14);
        ModLoader.addName(mod_InfiWeapons.cSlimeHalberd, "Spiny Slime Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cSlimeHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fSlimeHalberd.setIconCoord(13, 14);
        ModLoader.addName(mod_InfiWeapons.fSlimeHalberd, "Flaky Slime Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fSlimeHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brSlimeHalberd.setIconCoord(14, 14);
        ModLoader.addName(mod_InfiWeapons.brSlimeHalberd, "Baked Slime Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brSlimeHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.blSlimeHalberd.setIconCoord(15, 14);
        ModLoader.addName(mod_InfiWeapons.blSlimeHalberd, "Blazing Slime Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blSlimeHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.wCactusHalberd.setIconCoord(10, 0);
        ModLoader.addName(mod_InfiWeapons.wCactusHalberd, "Cactus Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wCactusHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stCactusHalberd.setIconCoord(11, 0);
        ModLoader.addName(mod_InfiWeapons.stCactusHalberd, "Stony Cactus Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stCactusHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.saCactusHalberd.setIconCoord(12, 0);
        ModLoader.addName(mod_InfiWeapons.saCactusHalberd, "Sandy Cactus Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saCactusHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bCactusHalberd.setIconCoord(13, 0);
        ModLoader.addName(mod_InfiWeapons.bCactusHalberd, "Necrotic Cactus Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bCactusHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bCactusHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.pCactusHalberd.setIconCoord(14, 0);
        ModLoader.addName(mod_InfiWeapons.pCactusHalberd, "Fibery Cactus Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pCactusHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_InfiWeapons.nCactusHalberd.setIconCoord(15, 0);
        ModLoader.addName(mod_InfiWeapons.nCactusHalberd, "Bloody Cactus Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nCactusHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.sCactusHalberd.setIconCoord(12, 1);
        ModLoader.addName(mod_InfiWeapons.sCactusHalberd, "Slimy Cactus Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sCactusHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cCactusHalberd.setIconCoord(13, 1);
        ModLoader.addName(mod_InfiWeapons.cCactusHalberd, "Spined Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cCactusHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fCactusHalberd.setIconCoord(14, 1);
        ModLoader.addName(mod_InfiWeapons.fCactusHalberd, "Flaky Cactus Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fCactusHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brCactusHalberd.setIconCoord(15, 1);
        ModLoader.addName(mod_InfiWeapons.brCactusHalberd, "Baked Cactus Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brCactusHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.wFlintHalberd.setIconCoord(13, 2);
        ModLoader.addName(mod_InfiWeapons.wFlintHalberd, "Flint Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wFlintHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stFlintHalberd.setIconCoord(14, 2);
        ModLoader.addName(mod_InfiWeapons.stFlintHalberd, "Stony Flint Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stFlintHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iFlintHalberd.setIconCoord(15, 2);
        ModLoader.addName(mod_InfiWeapons.iFlintHalberd, "Hard Flint Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iFlintHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.gFlintHalberd.setIconCoord(12, 3);
        ModLoader.addName(mod_InfiWeapons.gFlintHalberd, "Expensive Flint Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.gFlintHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_InfiWeapons.oFlintHalberd.setIconCoord(13, 3);
        ModLoader.addName(mod_InfiWeapons.oFlintHalberd, "Glassy Flint Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oFlintHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.saFlintHalberd.setIconCoord(14, 3);
        ModLoader.addName(mod_InfiWeapons.saFlintHalberd, "Sandy Flint Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saFlintHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bFlintHalberd.setIconCoord(15, 3);
        ModLoader.addName(mod_InfiWeapons.bFlintHalberd, "Necrotic Flint Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bFlintHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bFlintHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.nFlintHalberd.setIconCoord(12, 4);
        ModLoader.addName(mod_InfiWeapons.nFlintHalberd, "Bloody Flint Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nFlintHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.iceFlintHalberd.setIconCoord(13, 4);
        ModLoader.addName(mod_InfiWeapons.iceFlintHalberd, "Icy Flint Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceFlintHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.sFlintHalberd.setIconCoord(14, 4);
        ModLoader.addName(mod_InfiWeapons.sFlintHalberd, "Slimy Flint Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sFlintHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cFlintHalberd.setIconCoord(15, 4);
        ModLoader.addName(mod_InfiWeapons.cFlintHalberd, "Spiny Flint Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cFlintHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fFlintHalberd.setIconCoord(11, 5);
        ModLoader.addName(mod_InfiWeapons.fFlintHalberd, "Senseless Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fFlintHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brFlintHalberd.setIconCoord(12, 5);
        ModLoader.addName(mod_InfiWeapons.brFlintHalberd, "Baked Flint Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brFlintHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.blFlintHalberd.setIconCoord(13, 5);
        ModLoader.addName(mod_InfiWeapons.blFlintHalberd, "Blazing Flint Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blFlintHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.wBrickHalberd.setIconCoord(14, 5);
        ModLoader.addName(mod_InfiWeapons.wBrickHalberd, "Brick Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wBrickHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.brick, Character.valueOf('|'), Item.brick
                });
        mod_InfiWeapons.stBrickHalberd.setIconCoord(15, 5);
        ModLoader.addName(mod_InfiWeapons.stBrickHalberd, "Stony Brick Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stBrickHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.saBrickHalberd.setIconCoord(13, 6);
        ModLoader.addName(mod_InfiWeapons.saBrickHalberd, "Sandstone Brick Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saBrickHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bBrickHalberd.setIconCoord(14, 6);
        ModLoader.addName(mod_InfiWeapons.bBrickHalberd, "Necrotic Brick Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bBrickHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.brick, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bBrickHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.pBrickHalberd.setIconCoord(15, 6);
        ModLoader.addName(mod_InfiWeapons.pBrickHalberd, "Fibery Brick Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pBrickHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_InfiWeapons.nBrickHalberd.setIconCoord(11, 7);
        ModLoader.addName(mod_InfiWeapons.nBrickHalberd, "Bloody Brick Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nBrickHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.iceBrickHalberd.setIconCoord(12, 7);
        ModLoader.addName(mod_InfiWeapons.iceBrickHalberd, "Icy Brick Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceBrickHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.sBrickHalberd.setIconCoord(13, 7);
        ModLoader.addName(mod_InfiWeapons.sBrickHalberd, "Slimy Brick Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sBrickHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cBrickHalberd.setIconCoord(14, 7);
        ModLoader.addName(mod_InfiWeapons.cBrickHalberd, "Spiny Brick Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cBrickHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fBrickHalberd.setIconCoord(15, 7);
        ModLoader.addName(mod_InfiWeapons.fBrickHalberd, "Flaky Brick Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fBrickHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brBrickHalberd.setIconCoord(15, 8);
        ModLoader.addName(mod_InfiWeapons.brBrickHalberd, "Look-alike Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brBrickHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.dBlazeHalberd.setIconCoord(7, 9);
        ModLoader.addName(mod_InfiWeapons.dBlazeHalberd, "Jeweled Blaze Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dBlazeHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.rBlazeHalberd.setIconCoord(8, 9);
        ModLoader.addName(mod_InfiWeapons.rBlazeHalberd, "Red Blaze Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rBlazeHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.bBlazeHalberd.setIconCoord(9, 9);
        ModLoader.addName(mod_InfiWeapons.bBlazeHalberd, "Necrotic Blaze Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bBlazeHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bBlazeHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.nBlazeHalberd.setIconCoord(10, 9);
        ModLoader.addName(mod_InfiWeapons.nBlazeHalberd, "Bloody Blaze Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nBlazeHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glBlazeHalberd.setIconCoord(11, 9);
        ModLoader.addName(mod_InfiWeapons.glBlazeHalberd, "Glowing Blaze Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glBlazeHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.lBlazeHalberd.setIconCoord(12, 9);
        ModLoader.addName(mod_InfiWeapons.lBlazeHalberd, "Fiery Blaze Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.lBlazeHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.fBlazeHalberd.setIconCoord(13, 9);
        ModLoader.addName(mod_InfiWeapons.fBlazeHalberd, "Flaky Blaze Halberd");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fBlazeHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.blBlazeHalberd.setIconCoord(14, 9);
        ModLoader.addName(mod_InfiWeapons.blBlazeHalberd, "Blazing Pigsticker");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blBlazeHalberd, 1), new Object[]
                {
                    " mm", " |m", "|  ", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), Item.blazeRod
                });
        return 0;
    }
}
