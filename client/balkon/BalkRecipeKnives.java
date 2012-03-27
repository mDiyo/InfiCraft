package net.minecraft.src.balkon;

import net.minecraft.src.*;

public class BalkRecipeKnives
{
    public BalkRecipeKnives()
    {
    }

    public static int recipeStorm()
    {
        mod_InfiWeapons.stWoodKnife.setIconCoord(1, 0);
        ModLoader.addName(mod_InfiWeapons.stWoodKnife, "Stony Wooden Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stWoodKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.saWoodKnife.setIconCoord(2, 0);
        ModLoader.addName(mod_InfiWeapons.saWoodKnife, "Sandy Wooden Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saWoodKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bWoodKnife.setIconCoord(3, 0);
        ModLoader.addName(mod_InfiWeapons.bWoodKnife, "Necrotic Wooden Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bWoodKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bWoodKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.pWoodKnife.setIconCoord(4, 0);
        ModLoader.addName(mod_InfiWeapons.pWoodKnife, "Fibery Wooden Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pWoodKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_InfiWeapons.nWoodKnife.setIconCoord(5, 0);
        ModLoader.addName(mod_InfiWeapons.nWoodKnife, "Bloody Wooden Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nWoodKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.sWoodKnife.setIconCoord(6, 0);
        ModLoader.addName(mod_InfiWeapons.sWoodKnife, "Slimy Wooden Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sWoodKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cWoodKnife.setIconCoord(7, 0);
        ModLoader.addName(mod_InfiWeapons.cWoodKnife, "Spiny Wooden Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cWoodKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fWoodKnife.setIconCoord(8, 0);
        ModLoader.addName(mod_InfiWeapons.fWoodKnife, "Flaky Wooden Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fWoodKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brWoodKnife.setIconCoord(9, 0);
        ModLoader.addName(mod_InfiWeapons.brWoodKnife, "Baked Wooden Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brWoodKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.stStoneKnife.setIconCoord(1, 1);
        ModLoader.addName(mod_InfiWeapons.stStoneKnife, "Heavy Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stStoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stStoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.saStoneKnife.setIconCoord(2, 1);
        ModLoader.addName(mod_InfiWeapons.saStoneKnife, "Sandy Stone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saStoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saStoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bStoneKnife.setIconCoord(3, 1);
        ModLoader.addName(mod_InfiWeapons.bStoneKnife, "Necrotic Stone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bStoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bStoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.stone, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bStoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bStoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.pStoneKnife.setIconCoord(4, 1);
        ModLoader.addName(mod_InfiWeapons.pStoneKnife, "Fibery Stone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pStoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pStoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_InfiWeapons.mStoneKnife.setIconCoord(5, 1);
        ModLoader.addName(mod_InfiWeapons.mStoneKnife, "Mossy Stone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mStoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mStoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.nStoneKnife.setIconCoord(6, 1);
        ModLoader.addName(mod_InfiWeapons.nStoneKnife, "Bloody Stone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nStoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nStoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.iceStoneKnife.setIconCoord(7, 1);
        ModLoader.addName(mod_InfiWeapons.iceStoneKnife, "Icy Stone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceStoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceStoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.sStoneKnife.setIconCoord(8, 1);
        ModLoader.addName(mod_InfiWeapons.sStoneKnife, "Slimy Stone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sStoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sStoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cStoneKnife.setIconCoord(9, 1);
        ModLoader.addName(mod_InfiWeapons.cStoneKnife, "Spiny Stone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cStoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cStoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fStoneKnife.setIconCoord(10, 1);
        ModLoader.addName(mod_InfiWeapons.fStoneKnife, "Flaky Stone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fStoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fStoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brStoneKnife.setIconCoord(11, 1);
        ModLoader.addName(mod_InfiWeapons.brStoneKnife, "Baked Stone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brStoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brStoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.stIronKnife.setIconCoord(1, 2);
        ModLoader.addName(mod_InfiWeapons.stIronKnife, "Stony Iron Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stIronKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iIronKnife.setIconCoord(2, 2);
        ModLoader.addName(mod_InfiWeapons.iIronKnife, "Ironic Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iIronKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.dIronKnife.setIconCoord(3, 2);
        ModLoader.addName(mod_InfiWeapons.dIronKnife, "Jeweled Iron Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dIronKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.gIronKnife.setIconCoord(4, 2);
        ModLoader.addName(mod_InfiWeapons.gIronKnife, "Expensive Iron Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.gIronKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_InfiWeapons.rIronKnife.setIconCoord(5, 2);
        ModLoader.addName(mod_InfiWeapons.rIronKnife, "Red Iron Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rIronKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oIronKnife.setIconCoord(6, 2);
        ModLoader.addName(mod_InfiWeapons.oIronKnife, "Glassy Iron Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oIronKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.bIronKnife.setIconCoord(7, 2);
        ModLoader.addName(mod_InfiWeapons.bIronKnife, "Necrotic Iron Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bIronKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bIronKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.nIronKnife.setIconCoord(8, 2);
        ModLoader.addName(mod_InfiWeapons.nIronKnife, "Bloody Iron Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nIronKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glIronKnife.setIconCoord(9, 2);
        ModLoader.addName(mod_InfiWeapons.glIronKnife, "Glowing Iron Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glIronKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.iceIronKnife.setIconCoord(10, 2);
        ModLoader.addName(mod_InfiWeapons.iceIronKnife, "Icy Iron Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceIronKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.sIronKnife.setIconCoord(11, 2);
        ModLoader.addName(mod_InfiWeapons.sIronKnife, "Slimy Iron Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sIronKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.blIronKnife.setIconCoord(12, 2);
        ModLoader.addName(mod_InfiWeapons.blIronKnife, "Blazing Iron Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blIronKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.stDiamondKnife.setIconCoord(1, 3);
        ModLoader.addName(mod_InfiWeapons.stDiamondKnife, "Stony Diamond Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stDiamondKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iDiamondKnife.setIconCoord(2, 3);
        ModLoader.addName(mod_InfiWeapons.iDiamondKnife, "Hard Diamond Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iDiamondKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.dDiamondKnife.setIconCoord(3, 3);
        ModLoader.addName(mod_InfiWeapons.dDiamondKnife, "Diamondium Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dDiamondKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.gDiamondKnife.setIconCoord(4, 3);
        ModLoader.addName(mod_InfiWeapons.gDiamondKnife, "Expensive Diamond Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.gDiamondKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_InfiWeapons.rDiamondKnife.setIconCoord(5, 3);
        ModLoader.addName(mod_InfiWeapons.rDiamondKnife, "Red Diamond Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rDiamondKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oDiamondKnife.setIconCoord(6, 3);
        ModLoader.addName(mod_InfiWeapons.oDiamondKnife, "Glassy Diamond Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oDiamondKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.bDiamondKnife.setIconCoord(7, 3);
        ModLoader.addName(mod_InfiWeapons.bDiamondKnife, "Necrotic Diamond Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bDiamondKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bDiamondKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.mDiamondKnife.setIconCoord(8, 3);
        ModLoader.addName(mod_InfiWeapons.mDiamondKnife, "Mossy Diamond Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mDiamondKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.nDiamondKnife.setIconCoord(9, 3);
        ModLoader.addName(mod_InfiWeapons.nDiamondKnife, "Bloody Diamond Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nDiamondKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glDiamondKnife.setIconCoord(10, 3);
        ModLoader.addName(mod_InfiWeapons.glDiamondKnife, "Glowing Diamond Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glDiamondKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.blDiamondKnife.setIconCoord(11, 3);
        ModLoader.addName(mod_InfiWeapons.blDiamondKnife, "Blazing Diamond Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blDiamondKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.stGoldKnife.setIconCoord(1, 4);
        ModLoader.addName(mod_InfiWeapons.stGoldKnife, "Stony Gold Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stGoldKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.gGoldKnife.setIconCoord(2, 4);
        ModLoader.addName(mod_InfiWeapons.gGoldKnife, "Expensive Useless Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.gGoldKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_InfiWeapons.oGoldKnife.setIconCoord(3, 4);
        ModLoader.addName(mod_InfiWeapons.oGoldKnife, "Glassy Gold Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oGoldKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.saGoldKnife.setIconCoord(4, 4);
        ModLoader.addName(mod_InfiWeapons.saGoldKnife, "Sandy Gold Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saGoldKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bGoldKnife.setIconCoord(5, 4);
        ModLoader.addName(mod_InfiWeapons.bGoldKnife, "Necrotic Gold Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bGoldKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bGoldKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.mGoldKnife.setIconCoord(6, 4);
        ModLoader.addName(mod_InfiWeapons.mGoldKnife, "Mossy Gold Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mGoldKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.nGoldKnife.setIconCoord(7, 4);
        ModLoader.addName(mod_InfiWeapons.nGoldKnife, "Bloody Gold Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nGoldKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glGoldKnife.setIconCoord(8, 4);
        ModLoader.addName(mod_InfiWeapons.glGoldKnife, "Glowing Gold Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glGoldKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.iceGoldKnife.setIconCoord(9, 4);
        ModLoader.addName(mod_InfiWeapons.iceGoldKnife, "Icy Gold Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceGoldKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.sGoldKnife.setIconCoord(10, 4);
        ModLoader.addName(mod_InfiWeapons.sGoldKnife, "Slimy Gold Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sGoldKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.fGoldKnife.setIconCoord(11, 4);
        ModLoader.addName(mod_InfiWeapons.fGoldKnife, "Flaky Gold Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fGoldKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.wRedstoneKnife.setIconCoord(0, 5);
        ModLoader.addName(mod_InfiWeapons.wRedstoneKnife, "Redstone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wRedstoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stRedstoneKnife.setIconCoord(1, 5);
        ModLoader.addName(mod_InfiWeapons.stRedstoneKnife, "Stony Redstone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stRedstoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iRedstoneKnife.setIconCoord(2, 5);
        ModLoader.addName(mod_InfiWeapons.iRedstoneKnife, "Hard Redstone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iRedstoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.dRedstoneKnife.setIconCoord(3, 5);
        ModLoader.addName(mod_InfiWeapons.dRedstoneKnife, "Jeweled Redstone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dRedstoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.rRedstoneKnife.setIconCoord(4, 5);
        ModLoader.addName(mod_InfiWeapons.rRedstoneKnife, "Redredred Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rRedstoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oRedstoneKnife.setIconCoord(5, 5);
        ModLoader.addName(mod_InfiWeapons.oRedstoneKnife, "Glassy Redstone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oRedstoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.bRedstoneKnife.setIconCoord(6, 5);
        ModLoader.addName(mod_InfiWeapons.bRedstoneKnife, "Necrotic Redstone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bRedstoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bRedstoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.mRedstoneKnife.setIconCoord(7, 5);
        ModLoader.addName(mod_InfiWeapons.mRedstoneKnife, "Mossy Redstone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mRedstoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.glRedstoneKnife.setIconCoord(8, 5);
        ModLoader.addName(mod_InfiWeapons.glRedstoneKnife, "Glowing Redstone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glRedstoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.sRedstoneKnife.setIconCoord(9, 5);
        ModLoader.addName(mod_InfiWeapons.sRedstoneKnife, "Slimy Redstone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sRedstoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.blRedstoneKnife.setIconCoord(10, 5);
        ModLoader.addName(mod_InfiWeapons.blRedstoneKnife, "Blazing Redstone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blRedstoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.wObsidianKnife.setIconCoord(0, 6);
        ModLoader.addName(mod_InfiWeapons.wObsidianKnife, "Obsidian Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wObsidianKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stObsidianKnife.setIconCoord(1, 6);
        ModLoader.addName(mod_InfiWeapons.stObsidianKnife, "Stony Obsidian Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stObsidianKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iObsidianKnife.setIconCoord(2, 6);
        ModLoader.addName(mod_InfiWeapons.iObsidianKnife, "Hard Obsidian Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iObsidianKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.dObsidianKnife.setIconCoord(3, 6);
        ModLoader.addName(mod_InfiWeapons.dObsidianKnife, "Jeweled Obsidian Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dObsidianKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.gObsidianKnife.setIconCoord(4, 6);
        ModLoader.addName(mod_InfiWeapons.gObsidianKnife, "Expensive Obsidian Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.gObsidianKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_InfiWeapons.rObsidianKnife.setIconCoord(5, 6);
        ModLoader.addName(mod_InfiWeapons.rObsidianKnife, "Red Obsidian Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rObsidianKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oObsidianKnife.setIconCoord(6, 6);
        ModLoader.addName(mod_InfiWeapons.oObsidianKnife, "Wicked Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oObsidianKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.bObsidianKnife.setIconCoord(7, 6);
        ModLoader.addName(mod_InfiWeapons.bObsidianKnife, "Necrotic Obsidian Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bObsidianKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bObsidianKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.nObsidianKnife.setIconCoord(8, 6);
        ModLoader.addName(mod_InfiWeapons.nObsidianKnife, "Bloody Obsidian Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nObsidianKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glObsidianKnife.setIconCoord(9, 6);
        ModLoader.addName(mod_InfiWeapons.glObsidianKnife, "Glowing Obsidian Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glObsidianKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.sObsidianKnife.setIconCoord(10, 6);
        ModLoader.addName(mod_InfiWeapons.sObsidianKnife, "Slimy Obsidian Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sObsidianKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.fObsidianKnife.setIconCoord(11, 6);
        ModLoader.addName(mod_InfiWeapons.fObsidianKnife, "Flaky Obsidian Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fObsidianKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.blObsidianKnife.setIconCoord(12, 6);
        ModLoader.addName(mod_InfiWeapons.blObsidianKnife, "Blazing Obsidian Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blObsidianKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.wSandstoneKnife.setIconCoord(0, 7);
        ModLoader.addName(mod_InfiWeapons.wSandstoneKnife, "Sandstone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wSandstoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stSandstoneKnife.setIconCoord(1, 7);
        ModLoader.addName(mod_InfiWeapons.stSandstoneKnife, "Stony Sandstone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stSandstoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.saSandstoneKnife.setIconCoord(2, 7);
        ModLoader.addName(mod_InfiWeapons.saSandstoneKnife, "Sandcut");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saSandstoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bSandstoneKnife.setIconCoord(3, 7);
        ModLoader.addName(mod_InfiWeapons.bSandstoneKnife, "Necrotic Sandstone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bSandstoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bSandstoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.pSandstoneKnife.setIconCoord(4, 7);
        ModLoader.addName(mod_InfiWeapons.pSandstoneKnife, "Fibery Sandstone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pSandstoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_InfiWeapons.nSandstoneKnife.setIconCoord(5, 7);
        ModLoader.addName(mod_InfiWeapons.nSandstoneKnife, "Bloody Sandstone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nSandstoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.iceSandstoneKnife.setIconCoord(6, 7);
        ModLoader.addName(mod_InfiWeapons.iceSandstoneKnife, "Icy Sandstone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceSandstoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.sSandstoneKnife.setIconCoord(7, 7);
        ModLoader.addName(mod_InfiWeapons.sSandstoneKnife, "Slimy Sandstone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sSandstoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cSandstoneKnife.setIconCoord(8, 7);
        ModLoader.addName(mod_InfiWeapons.cSandstoneKnife, "Spiny Sandstone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cSandstoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fSandstoneKnife.setIconCoord(9, 7);
        ModLoader.addName(mod_InfiWeapons.fSandstoneKnife, "Flaky Sandstone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fSandstoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brSandstoneKnife.setIconCoord(10, 7);
        ModLoader.addName(mod_InfiWeapons.brSandstoneKnife, "Baked Sandstone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brSandstoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.wBoneKnife.setIconCoord(0, 8);
        ModLoader.addName(mod_InfiWeapons.wBoneKnife, "Bone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wBoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.bone, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stBoneKnife.setIconCoord(1, 8);
        ModLoader.addName(mod_InfiWeapons.stBoneKnife, "Stony Bone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stBoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iBoneKnife.setIconCoord(2, 8);
        ModLoader.addName(mod_InfiWeapons.iBoneKnife, "Hard Bone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iBoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.dBoneKnife.setIconCoord(3, 8);
        ModLoader.addName(mod_InfiWeapons.dBoneKnife, "Jeweled Bone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dBoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.rBoneKnife.setIconCoord(4, 8);
        ModLoader.addName(mod_InfiWeapons.rBoneKnife, "Red Bone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rBoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oBoneKnife.setIconCoord(5, 8);
        ModLoader.addName(mod_InfiWeapons.oBoneKnife, "Glassy Bone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oBoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.bBoneKnife.setIconCoord(6, 8);
        ModLoader.addName(mod_InfiWeapons.bBoneKnife, "Reanimated Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bBoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.bone, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bBoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.mBoneKnife.setIconCoord(7, 8);
        ModLoader.addName(mod_InfiWeapons.mBoneKnife, "Mossy Bone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mBoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.nBoneKnife.setIconCoord(8, 8);
        ModLoader.addName(mod_InfiWeapons.nBoneKnife, "Netherrack Bone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nBoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glBoneKnife.setIconCoord(9, 8);
        ModLoader.addName(mod_InfiWeapons.glBoneKnife, "Glowstone Bone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glBoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.sBoneKnife.setIconCoord(10, 8);
        ModLoader.addName(mod_InfiWeapons.sBoneKnife, "Slimy Bone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sBoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cBoneKnife.setIconCoord(11, 8);
        ModLoader.addName(mod_InfiWeapons.cBoneKnife, "Spiny Bone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cBoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fBoneKnife.setIconCoord(12, 8);
        ModLoader.addName(mod_InfiWeapons.fBoneKnife, "Flaky Bone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fBoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brBoneKnife.setIconCoord(13, 8);
        ModLoader.addName(mod_InfiWeapons.brBoneKnife, "Baked Bone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brBoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.blBoneKnife.setIconCoord(14, 8);
        ModLoader.addName(mod_InfiWeapons.blBoneKnife, "Blazing Bone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blBoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.bone, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.wPaperKnife.setIconCoord(0, 9);
        ModLoader.addName(mod_InfiWeapons.wPaperKnife, "Paper Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wPaperKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.saPaperKnife.setIconCoord(1, 9);
        ModLoader.addName(mod_InfiWeapons.saPaperKnife, "Stony Paper Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saPaperKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bPaperKnife.setIconCoord(2, 9);
        ModLoader.addName(mod_InfiWeapons.bPaperKnife, "Necrotic Paper Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bPaperKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bPaperKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.pPaperKnife.setIconCoord(3, 9);
        ModLoader.addName(mod_InfiWeapons.pPaperKnife, "Paper Cutter");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pPaperKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_InfiWeapons.sPaperKnife.setIconCoord(4, 9);
        ModLoader.addName(mod_InfiWeapons.sPaperKnife, "Slimy Paper Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sPaperKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cPaperKnife.setIconCoord(5, 9);
        ModLoader.addName(mod_InfiWeapons.cPaperKnife, "Spiny Paper Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cPaperKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.brPaperKnife.setIconCoord(6, 9);
        ModLoader.addName(mod_InfiWeapons.brPaperKnife, "Baked Paper Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brPaperKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.stMossyKnife.setIconCoord(0, 10);
        ModLoader.addName(mod_InfiWeapons.stMossyKnife, "Stony Moss-Covered Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stMossyKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.dMossyKnife.setIconCoord(1, 10);
        ModLoader.addName(mod_InfiWeapons.dMossyKnife, "Jeweled Moss-Covered Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dMossyKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.rMossyKnife.setIconCoord(2, 10);
        ModLoader.addName(mod_InfiWeapons.rMossyKnife, "Red Moss-Covered Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rMossyKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.bMossyKnife.setIconCoord(3, 10);
        ModLoader.addName(mod_InfiWeapons.bMossyKnife, "Necrotic Moss-Covered Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bMossyKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bMossyKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.mMossyKnife.setIconCoord(4, 10);
        ModLoader.addName(mod_InfiWeapons.mMossyKnife, "Living Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mMossyKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.glMossyKnife.setIconCoord(5, 10);
        ModLoader.addName(mod_InfiWeapons.glMossyKnife, "Glowing Moss-Covered Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glMossyKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.wNetherrackKnife.setIconCoord(0, 11);
        ModLoader.addName(mod_InfiWeapons.wNetherrackKnife, "Netherrack Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wNetherrackKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stNetherrackKnife.setIconCoord(1, 11);
        ModLoader.addName(mod_InfiWeapons.stNetherrackKnife, "Stony Netherrack Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stNetherrackKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iNetherrackKnife.setIconCoord(2, 11);
        ModLoader.addName(mod_InfiWeapons.iNetherrackKnife, "Hard Netherrack Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iNetherrackKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.rNetherrackKnife.setIconCoord(3, 11);
        ModLoader.addName(mod_InfiWeapons.rNetherrackKnife, "Red Netherrack Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rNetherrackKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oNetherrackKnife.setIconCoord(4, 11);
        ModLoader.addName(mod_InfiWeapons.oNetherrackKnife, "Glassy Netherrack Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oNetherrackKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.saNetherrackKnife.setIconCoord(5, 11);
        ModLoader.addName(mod_InfiWeapons.saNetherrackKnife, "Sandy Netherrack Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saNetherrackKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bNetherrackKnife.setIconCoord(6, 11);
        ModLoader.addName(mod_InfiWeapons.bNetherrackKnife, "Necrotic Netherrack Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bNetherrackKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bNetherrackKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.mNetherrackKnife.setIconCoord(7, 11);
        ModLoader.addName(mod_InfiWeapons.mNetherrackKnife, "Mossy Netherrack Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mNetherrackKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.nNetherrackKnife.setIconCoord(8, 11);
        ModLoader.addName(mod_InfiWeapons.nNetherrackKnife, "Bloody Blade");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nNetherrackKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glNetherrackKnife.setIconCoord(9, 11);
        ModLoader.addName(mod_InfiWeapons.glNetherrackKnife, "Glowing Netherrack Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glNetherrackKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.iceNetherrackKnife.setIconCoord(10, 11);
        ModLoader.addName(mod_InfiWeapons.iceNetherrackKnife, "Icy Netherrack Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceNetherrackKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.sNetherrackKnife.setIconCoord(11, 11);
        ModLoader.addName(mod_InfiWeapons.sNetherrackKnife, "Slimy Netherrack Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sNetherrackKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cNetherrackKnife.setIconCoord(12, 11);
        ModLoader.addName(mod_InfiWeapons.cNetherrackKnife, "Spiny Netherrack Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cNetherrackKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fNetherrackKnife.setIconCoord(13, 11);
        ModLoader.addName(mod_InfiWeapons.fNetherrackKnife, "Flaky Netherrack Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fNetherrackKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.brNetherrackKnife.setIconCoord(14, 11);
        ModLoader.addName(mod_InfiWeapons.brNetherrackKnife, "Baked Netherrack Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brNetherrackKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.blNetherrackKnife.setIconCoord(15, 11);
        ModLoader.addName(mod_InfiWeapons.blNetherrackKnife, "Blazing Netherrack Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blNetherrackKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.wGlowstoneKnife.setIconCoord(0, 12);
        ModLoader.addName(mod_InfiWeapons.wGlowstoneKnife, "Glowstone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wGlowstoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stGlowstoneKnife.setIconCoord(1, 12);
        ModLoader.addName(mod_InfiWeapons.stGlowstoneKnife, "Stony Glowstone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stGlowstoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iGlowstoneKnife.setIconCoord(2, 12);
        ModLoader.addName(mod_InfiWeapons.iGlowstoneKnife, "Hard Glowstone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iGlowstoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.dGlowstoneKnife.setIconCoord(3, 12);
        ModLoader.addName(mod_InfiWeapons.dGlowstoneKnife, "Jeweled Glowstone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dGlowstoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.rGlowstoneKnife.setIconCoord(4, 12);
        ModLoader.addName(mod_InfiWeapons.rGlowstoneKnife, "Red Glowstone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rGlowstoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oGlowstoneKnife.setIconCoord(5, 12);
        ModLoader.addName(mod_InfiWeapons.oGlowstoneKnife, "Glassy Glowstone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oGlowstoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.bGlowstoneKnife.setIconCoord(6, 12);
        ModLoader.addName(mod_InfiWeapons.bGlowstoneKnife, "Necrotic Glowstone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bGlowstoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bGlowstoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.mGlowstoneKnife.setIconCoord(7, 12);
        ModLoader.addName(mod_InfiWeapons.mGlowstoneKnife, "Mossy Glowstone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mGlowstoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.nGlowstoneKnife.setIconCoord(8, 12);
        ModLoader.addName(mod_InfiWeapons.nGlowstoneKnife, "Bloody Glowstone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nGlowstoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glGlowstoneKnife.setIconCoord(9, 12);
        ModLoader.addName(mod_InfiWeapons.glGlowstoneKnife, "Bright Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glGlowstoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.iceGlowstoneKnife.setIconCoord(10, 12);
        ModLoader.addName(mod_InfiWeapons.iceGlowstoneKnife, "Icy Glowstone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceGlowstoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.lGlowstoneKnife.setIconCoord(11, 12);
        ModLoader.addName(mod_InfiWeapons.lGlowstoneKnife, "Fiery Glowstone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.lGlowstoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.sGlowstoneKnife.setIconCoord(12, 12);
        ModLoader.addName(mod_InfiWeapons.sGlowstoneKnife, "Slimy Glowstone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sGlowstoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.blGlowstoneKnife.setIconCoord(13, 12);
        ModLoader.addName(mod_InfiWeapons.blGlowstoneKnife, "Blazing Glowstone Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blGlowstoneKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.wIceKnife.setIconCoord(0, 13);
        ModLoader.addName(mod_InfiWeapons.wIceKnife, "Ice Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wIceKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.ice, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stIceKnife.setIconCoord(1, 13);
        ModLoader.addName(mod_InfiWeapons.stIceKnife, "Stony Ice Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stIceKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iIceKnife.setIconCoord(2, 13);
        ModLoader.addName(mod_InfiWeapons.iIceKnife, "Hard Ice Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iIceKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.dIceKnife.setIconCoord(3, 13);
        ModLoader.addName(mod_InfiWeapons.dIceKnife, "Jeweled Ice Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dIceKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.gIceKnife.setIconCoord(4, 13);
        ModLoader.addName(mod_InfiWeapons.gIceKnife, "Expensive Ice Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.gIceKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_InfiWeapons.rIceKnife.setIconCoord(5, 13);
        ModLoader.addName(mod_InfiWeapons.rIceKnife, "Red Ice Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rIceKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oIceKnife.setIconCoord(6, 13);
        ModLoader.addName(mod_InfiWeapons.oIceKnife, "Glassy Ice Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oIceKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.saIceKnife.setIconCoord(7, 13);
        ModLoader.addName(mod_InfiWeapons.saIceKnife, "Sandy Ice Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saIceKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bIceKnife.setIconCoord(8, 13);
        ModLoader.addName(mod_InfiWeapons.bIceKnife, "Necrotic Ice Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bIceKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.ice, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bIceKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.glIceKnife.setIconCoord(9, 13);
        ModLoader.addName(mod_InfiWeapons.glIceKnife, "Glowing Ice Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glIceKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.iceIceKnife.setIconCoord(10, 13);
        ModLoader.addName(mod_InfiWeapons.iceIceKnife, "Frostsickle");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceIceKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.sIceKnife.setIconCoord(11, 13);
        ModLoader.addName(mod_InfiWeapons.sIceKnife, "Slimy Ice Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sIceKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cIceKnife.setIconCoord(12, 13);
        ModLoader.addName(mod_InfiWeapons.cIceKnife, "Spiny Ice Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cIceKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fIceKnife.setIconCoord(13, 13);
        ModLoader.addName(mod_InfiWeapons.fIceKnife, "Flaky Ice Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fIceKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brIceKnife.setIconCoord(14, 13);
        ModLoader.addName(mod_InfiWeapons.brIceKnife, "Baked Ice Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brIceKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.dLavaKnife.setIconCoord(0, 14);
        ModLoader.addName(mod_InfiWeapons.dLavaKnife, "Jeweled Lava Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dLavaKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.rLavaKnife.setIconCoord(1, 14);
        ModLoader.addName(mod_InfiWeapons.rLavaKnife, "Red Lava Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rLavaKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.bLavaKnife.setIconCoord(2, 14);
        ModLoader.addName(mod_InfiWeapons.bLavaKnife, "Necrotic Lava Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bLavaKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bLavaKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.nLavaKnife.setIconCoord(3, 14);
        ModLoader.addName(mod_InfiWeapons.nLavaKnife, "Bloody Lava Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nLavaKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glLavaKnife.setIconCoord(4, 14);
        ModLoader.addName(mod_InfiWeapons.glLavaKnife, "Glowing Lava Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glLavaKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.lLavaKnife.setIconCoord(5, 14);
        ModLoader.addName(mod_InfiWeapons.lLavaKnife, "Fleshsinge");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.lLavaKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.lavaRod
                });
        mod_InfiWeapons.blLavaKnife.setIconCoord(6, 14);
        ModLoader.addName(mod_InfiWeapons.blLavaKnife, "Blazing Lava Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blLavaKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.wSlimeKnife.setIconCoord(0, 15);
        ModLoader.addName(mod_InfiWeapons.wSlimeKnife, "Slime Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wSlimeKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stSlimeKnife.setIconCoord(1, 15);
        ModLoader.addName(mod_InfiWeapons.stSlimeKnife, "Stony Slime Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stSlimeKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iSlimeKnife.setIconCoord(2, 15);
        ModLoader.addName(mod_InfiWeapons.iSlimeKnife, "Hard Slime Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iSlimeKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.dSlimeKnife.setIconCoord(3, 15);
        ModLoader.addName(mod_InfiWeapons.dSlimeKnife, "Jeweled Slime Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dSlimeKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.gSlimeKnife.setIconCoord(4, 15);
        ModLoader.addName(mod_InfiWeapons.gSlimeKnife, "Expensive Slime Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.gSlimeKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_InfiWeapons.rSlimeKnife.setIconCoord(5, 15);
        ModLoader.addName(mod_InfiWeapons.rSlimeKnife, "Red Slime Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rSlimeKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oSlimeKnife.setIconCoord(6, 15);
        ModLoader.addName(mod_InfiWeapons.oSlimeKnife, "Glassy Slime Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oSlimeKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.saSlimeKnife.setIconCoord(7, 15);
        ModLoader.addName(mod_InfiWeapons.saSlimeKnife, "Sandy Slime Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saSlimeKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bSlimeKnife.setIconCoord(8, 15);
        ModLoader.addName(mod_InfiWeapons.bSlimeKnife, "Necrotic Slime Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bSlimeKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bSlimeKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.pSlimeKnife.setIconCoord(9, 15);
        ModLoader.addName(mod_InfiWeapons.pSlimeKnife, "Fibery Slime Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pSlimeKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_InfiWeapons.mSlimeKnife.setIconCoord(10, 15);
        ModLoader.addName(mod_InfiWeapons.mSlimeKnife, "Mossy Slime Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mSlimeKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.nSlimeKnife.setIconCoord(11, 15);
        ModLoader.addName(mod_InfiWeapons.nSlimeKnife, "Bloody Slime Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nSlimeKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glSlimeKnife.setIconCoord(12, 15);
        ModLoader.addName(mod_InfiWeapons.glSlimeKnife, "Glowing Slime Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glSlimeKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.iceSlimeKnife.setIconCoord(13, 15);
        ModLoader.addName(mod_InfiWeapons.iceSlimeKnife, "Icy Slime Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceSlimeKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.lSlimeKnife.setIconCoord(14, 15);
        ModLoader.addName(mod_InfiWeapons.lSlimeKnife, "Fiery Slime Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.lSlimeKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.lavaRod
                });
        mod_InfiWeapons.sSlimeKnife.setIconCoord(15, 15);
        ModLoader.addName(mod_InfiWeapons.sSlimeKnife, "Green Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sSlimeKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cSlimeKnife.setIconCoord(12, 14);
        ModLoader.addName(mod_InfiWeapons.cSlimeKnife, "Spiny Slime Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cSlimeKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fSlimeKnife.setIconCoord(13, 14);
        ModLoader.addName(mod_InfiWeapons.fSlimeKnife, "Flaky Slime Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fSlimeKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brSlimeKnife.setIconCoord(14, 14);
        ModLoader.addName(mod_InfiWeapons.brSlimeKnife, "Baked Slime Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brSlimeKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.blSlimeKnife.setIconCoord(15, 14);
        ModLoader.addName(mod_InfiWeapons.blSlimeKnife, "Blazing Slime Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blSlimeKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.wCactusKnife.setIconCoord(10, 0);
        ModLoader.addName(mod_InfiWeapons.wCactusKnife, "Cactus Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wCactusKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stCactusKnife.setIconCoord(11, 0);
        ModLoader.addName(mod_InfiWeapons.stCactusKnife, "Stony Cactus Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stCactusKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.saCactusKnife.setIconCoord(12, 0);
        ModLoader.addName(mod_InfiWeapons.saCactusKnife, "Sandy Cactus Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saCactusKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bCactusKnife.setIconCoord(13, 0);
        ModLoader.addName(mod_InfiWeapons.bCactusKnife, "Necrotic Cactus Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bCactusKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bCactusKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.pCactusKnife.setIconCoord(14, 0);
        ModLoader.addName(mod_InfiWeapons.pCactusKnife, "Fibery Cactus Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pCactusKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_InfiWeapons.nCactusKnife.setIconCoord(15, 0);
        ModLoader.addName(mod_InfiWeapons.nCactusKnife, "Bloody Cactus Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nCactusKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.sCactusKnife.setIconCoord(12, 1);
        ModLoader.addName(mod_InfiWeapons.sCactusKnife, "Slimy Cactus Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sCactusKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cCactusKnife.setIconCoord(13, 1);
        ModLoader.addName(mod_InfiWeapons.cCactusKnife, "Cactus Spine");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cCactusKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fCactusKnife.setIconCoord(14, 1);
        ModLoader.addName(mod_InfiWeapons.fCactusKnife, "Flaky Cactus Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fCactusKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brCactusKnife.setIconCoord(15, 1);
        ModLoader.addName(mod_InfiWeapons.brCactusKnife, "Baked Cactus Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brCactusKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.wFlintKnife.setIconCoord(13, 2);
        ModLoader.addName(mod_InfiWeapons.wFlintKnife, "Flint Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wFlintKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.flint, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stFlintKnife.setIconCoord(14, 2);
        ModLoader.addName(mod_InfiWeapons.stFlintKnife, "Stony Flint Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stFlintKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iFlintKnife.setIconCoord(15, 2);
        ModLoader.addName(mod_InfiWeapons.iFlintKnife, "Hard Flint Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iFlintKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.gFlintKnife.setIconCoord(12, 3);
        ModLoader.addName(mod_InfiWeapons.gFlintKnife, "Expensive Flint Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.gFlintKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_InfiWeapons.oFlintKnife.setIconCoord(13, 3);
        ModLoader.addName(mod_InfiWeapons.oFlintKnife, "Glassy Flint Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oFlintKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.saFlintKnife.setIconCoord(14, 3);
        ModLoader.addName(mod_InfiWeapons.saFlintKnife, "Sandy Flint Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saFlintKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bFlintKnife.setIconCoord(15, 3);
        ModLoader.addName(mod_InfiWeapons.bFlintKnife, "Necrotic Flint Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bFlintKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.flint, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bFlintKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.nFlintKnife.setIconCoord(12, 4);
        ModLoader.addName(mod_InfiWeapons.nFlintKnife, "Bloody Flint Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nFlintKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.iceFlintKnife.setIconCoord(13, 4);
        ModLoader.addName(mod_InfiWeapons.iceFlintKnife, "Icy Flint Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceFlintKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.sFlintKnife.setIconCoord(14, 4);
        ModLoader.addName(mod_InfiWeapons.sFlintKnife, "Slimy Flint Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sFlintKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cFlintKnife.setIconCoord(15, 4);
        ModLoader.addName(mod_InfiWeapons.cFlintKnife, "Spiny Flint Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cFlintKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fFlintKnife.setIconCoord(11, 5);
        ModLoader.addName(mod_InfiWeapons.fFlintKnife, "Simple Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fFlintKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brFlintKnife.setIconCoord(12, 5);
        ModLoader.addName(mod_InfiWeapons.brFlintKnife, "Baked Flint Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brFlintKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.blFlintKnife.setIconCoord(13, 5);
        ModLoader.addName(mod_InfiWeapons.blFlintKnife, "Blazing Flint Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blFlintKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.flint, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.wBrickKnife.setIconCoord(14, 5);
        ModLoader.addName(mod_InfiWeapons.wBrickKnife, "Brick Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wBrickKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.brick, Character.valueOf('|'), Item.brick
                });
        mod_InfiWeapons.stBrickKnife.setIconCoord(15, 5);
        ModLoader.addName(mod_InfiWeapons.stBrickKnife, "Stony Brick Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stBrickKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.saBrickKnife.setIconCoord(13, 6);
        ModLoader.addName(mod_InfiWeapons.saBrickKnife, "Sandstone Brick Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saBrickKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bBrickKnife.setIconCoord(14, 6);
        ModLoader.addName(mod_InfiWeapons.bBrickKnife, "Necrotic Brick Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bBrickKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.brick, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bBrickKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.pBrickKnife.setIconCoord(15, 6);
        ModLoader.addName(mod_InfiWeapons.pBrickKnife, "Fibery Brick Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pBrickKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_InfiWeapons.nBrickKnife.setIconCoord(11, 7);
        ModLoader.addName(mod_InfiWeapons.nBrickKnife, "Bloody Brick Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nBrickKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.iceBrickKnife.setIconCoord(12, 7);
        ModLoader.addName(mod_InfiWeapons.iceBrickKnife, "Icy Brick Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceBrickKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.sBrickKnife.setIconCoord(13, 7);
        ModLoader.addName(mod_InfiWeapons.sBrickKnife, "Slimy Brick Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sBrickKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cBrickKnife.setIconCoord(14, 7);
        ModLoader.addName(mod_InfiWeapons.cBrickKnife, "Spiny Brick Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cBrickKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fBrickKnife.setIconCoord(15, 7);
        ModLoader.addName(mod_InfiWeapons.fBrickKnife, "Flaky Brick Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fBrickKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brBrickKnife.setIconCoord(15, 8);
        ModLoader.addName(mod_InfiWeapons.brBrickKnife, "Look-alike Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brBrickKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.dBlazeKnife.setIconCoord(7, 9);
        ModLoader.addName(mod_InfiWeapons.dBlazeKnife, "Jeweled Blaze Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dBlazeKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.rBlazeKnife.setIconCoord(8, 9);
        ModLoader.addName(mod_InfiWeapons.rBlazeKnife, "Red Blaze Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rBlazeKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.bBlazeKnife.setIconCoord(9, 9);
        ModLoader.addName(mod_InfiWeapons.bBlazeKnife, "Necrotic Blaze Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bBlazeKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bBlazeKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.nBlazeKnife.setIconCoord(10, 9);
        ModLoader.addName(mod_InfiWeapons.nBlazeKnife, "Bloody Blaze Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nBlazeKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glBlazeKnife.setIconCoord(11, 9);
        ModLoader.addName(mod_InfiWeapons.glBlazeKnife, "Glowing Blaze Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glBlazeKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.lBlazeKnife.setIconCoord(12, 9);
        ModLoader.addName(mod_InfiWeapons.lBlazeKnife, "Fiery Blaze Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.lBlazeKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.fBlazeKnife.setIconCoord(13, 9);
        ModLoader.addName(mod_InfiWeapons.fBlazeKnife, "Flaky Blaze Knife");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fBlazeKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.blBlazeKnife.setIconCoord(14, 9);
        ModLoader.addName(mod_InfiWeapons.blBlazeKnife, "Pocket Runner");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blBlazeKnife, 1), new Object[]
                {
                    "m|", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), Item.blazeRod
                });
        return 0;
    }
}
