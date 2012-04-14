package net.minecraft.src;
import net.minecraft.client.Minecraft;
import net.minecraft.src.forge.NetworkMod;
import net.minecraft.src.superslopes.*;

import org.lwjgl.opengl.GL11;
import java.io.File;

public class mod_Kaevator_Slopes extends BaseMod
{		 
	public static void prepareProps()
    { 
		props.getInt("Slopes_Opacity", 0);
		props.getInt("BlockKaevWoodSlopes", 167);
		props.getInt("BlockKaevCobblestoneSlopes", 168);
		props.getInt("BlockKaevGlassSlopes", 169);
		props.getInt("BlockKaevSandstoneSlopes", 170);
		props.getInt("BlockKaevDirtSlopes", 171);
		props.getInt("BlockKaevStoneSlopes", 172);
		props.getInt("BlockKaevSandSlopes", 173);
		props.getInt("BlockKaevSnowSlopes", 174);
		props.getInt("BlockKaevGrassSlopes", 175);
		props.getInt("BlockKaevBricksSlopes", 176);
		props.getInt("BlockKaevGravelSlopes", 177);
		props.getInt("BlockKaevGoldSlopes", 178);
		props.getInt("BlockKaevSteelSlopes", 179);
		props.getInt("BlockKaevObsidianSlopes", 180);
		props.getInt("BlockKaevDiamondSlopes", 181);
		props.getInt("BlockKaevWhiteWoolSlopes", 215);
		props.getInt("BlockKaevBlackWoolSlopes", 0);
		props.getInt("BlockKaevRedWoolSlopes", 0);
		props.getInt("BlockKaevGreenWoolSlopes", 0);
		props.getInt("BlockKaevBrownWoolSlopes", 0);
		props.getInt("BlockKaevBlueWoolSlopes", 0);
		props.getInt("BlockKaevPurpleWoolSlopes", 0);
		props.getInt("BlockKaevCyanWoolSlopes", 0);
		props.getInt("BlockKaevSilverWoolSlopes", 0);
		props.getInt("BlockKaevGrayWoolSlopes", 0);
		props.getInt("BlockKaevPinkWoolSlopes", 0);
		props.getInt("BlockKaevLimeWoolSlopes", 0);
		props.getInt("BlockKaevYellowWoolSlopes", 0);
		props.getInt("BlockKaevLightBlueWoolSlopes", 0);
		props.getInt("BlockKaevMagentaWoolSlopes", 0);
		props.getInt("BlockKaevOrangeWoolSlopes", 0);
    }
	
	public mod_Kaevator_Slopes()
    {
		SlopesRenderID = ModLoader.getUniqueBlockModelID(this, true);		
		
		enableAO = false;
		aoLightValueThis = 0.0F;
        aoLightValueXNeg = 0.0F;
        aoLightValueYNeg = 0.0F;
        aoLightValueZNeg = 0.0F;
        aoLightValueXPos = 0.0F;
        aoLightValueYPos = 0.0F;
        aoLightValueZPos = 0.0F;
        aoLightValueXNegYNegZNeg = 0.0F;
        aoLightValueXNegYNeg = 0.0F;
        aoLightValueXNegYNegZPos = 0.0F;
        aoLightValueYNegZNeg = 0.0F;
        aoLightValueYNegZPos = 0.0F;
        aoLightValueXPosYNegZNeg = 0.0F;
        aoLightValueXPosYNeg = 0.0F;
        aoLightValueXPosYNegZPos = 0.0F;
        aoLightValueXNegYPosZNeg = 0.0F;
        aoLightValueXNegYPos = 0.0F;
        aoLightValueXNegYPosZPos = 0.0F;
        aoLightValueYPosZNeg = 0.0F;
        aoLightValueXPosYPosZNeg = 0.0F;
        aoLightValueXPosYPos = 0.0F;
        aoLightValueYPosZPos = 0.0F;
        aoLightValueXPosYPosZPos = 0.0F;
        aoLightValueXNegZNeg = 0.0F;
        aoLightValueXPosZNeg = 0.0F;
        aoLightValueXNegZPos = 0.0F;
        aoLightValueXPosZPos = 0.0F;
        field_22352_G = 1;        
        isBlockYPosZNeg = false;
        isBlockXPosYPos = false;
        isBlockXNegYPos = false;
        isBlockYPosZPos = false;
        isBlockXNegZNeg = false;
        isBlockXPosZPos = false;
        isBlockXNegZPos = false;
        isBlockXPosZNeg = false;
        isBlockYNegZNeg = false;
        isBlockXPosYNeg = false;
        isBlockXNegYNeg = false;
        isBlockYNegZPos = false;

		factorTop = 1.0F;
		factorBottom = 0.5F;
		factorEast = 0.8F;
		factorWest = 0.8F;
		factorNorth = 0.6F;
		factorSouth = 0.6F;		

		colorRedTopLeft_TopFace = 0.0F;
		colorRedBottomLeft_TopFace = 0.0F;
		colorRedBottomRight_TopFace = 0.0F;
		colorRedTopRight_TopFace = 0.0F;
		colorGreenTopLeft_TopFace = 0.0F;
		colorGreenBottomLeft_TopFace = 0.0F;
		colorGreenBottomRight_TopFace = 0.0F;
		colorGreenTopRight_TopFace = 0.0F;
		colorBlueTopLeft_TopFace = 0.0F;
		colorBlueBottomLeft_TopFace = 0.0F;
		colorBlueBottomRight_TopFace = 0.0F;
		colorBlueTopRight_TopFace = 0.0F;
		
		colorRedTopLeft_BottomFace = 0.0F;
		colorRedBottomLeft_BottomFace = 0.0F;
		colorRedBottomRight_BottomFace = 0.0F;
		colorRedTopRight_BottomFace = 0.0F;
		colorGreenTopLeft_BottomFace = 0.0F;
		colorGreenBottomLeft_BottomFace = 0.0F;
		colorGreenBottomRight_BottomFace = 0.0F;
		colorGreenTopRight_BottomFace = 0.0F;
		colorBlueTopLeft_BottomFace = 0.0F;
		colorBlueBottomLeft_BottomFace = 0.0F;
		colorBlueBottomRight_BottomFace = 0.0F;
		colorBlueTopRight_BottomFace = 0.0F;
		
		colorRedTopLeft_EastFace = 0.0F;
		colorRedBottomLeft_EastFace = 0.0F;
		colorRedBottomRight_EastFace = 0.0F;
		colorRedTopRight_EastFace = 0.0F;
		colorGreenTopLeft_EastFace = 0.0F;
		colorGreenBottomLeft_EastFace = 0.0F;
		colorGreenBottomRight_EastFace = 0.0F;
		colorGreenTopRight_EastFace = 0.0F;
		colorBlueTopLeft_EastFace = 0.0F;
		colorBlueBottomLeft_EastFace = 0.0F;
		colorBlueBottomRight_EastFace = 0.0F;
		colorBlueTopRight_EastFace = 0.0F;
		
		colorRedTopLeft_WestFace = 0.0F;
		colorRedBottomLeft_WestFace = 0.0F;
		colorRedBottomRight_WestFace = 0.0F;
		colorRedTopRight_WestFace = 0.0F;
		colorGreenTopLeft_WestFace = 0.0F;
		colorGreenBottomLeft_WestFace = 0.0F;
		colorGreenBottomRight_WestFace = 0.0F;
		colorGreenTopRight_WestFace = 0.0F;
		colorBlueTopLeft_WestFace = 0.0F;
		colorBlueBottomLeft_WestFace = 0.0F;
		colorBlueBottomRight_WestFace = 0.0F;
		colorBlueTopRight_WestFace = 0.0F;
		
		colorRedTopLeft_NorthFace = 0.0F;
		colorRedBottomLeft_NorthFace = 0.0F;
		colorRedBottomRight_NorthFace = 0.0F;
		colorRedTopRight_NorthFace = 0.0F;
		colorGreenTopLeft_NorthFace = 0.0F;
		colorGreenBottomLeft_NorthFace = 0.0F;
		colorGreenBottomRight_NorthFace = 0.0F;
		colorGreenTopRight_NorthFace = 0.0F;
		colorBlueTopLeft_NorthFace = 0.0F;
		colorBlueBottomLeft_NorthFace = 0.0F;
		colorBlueBottomRight_NorthFace = 0.0F;
		colorBlueTopRight_NorthFace = 0.0F;
		
		colorRedTopLeft_SouthFace = 0.0F;
		colorRedBottomLeft_SouthFace = 0.0F;
		colorRedBottomRight_SouthFace = 0.0F;
		colorRedTopRight_SouthFace = 0.0F;
		colorGreenTopLeft_SouthFace = 0.0F;
		colorGreenBottomLeft_SouthFace = 0.0F;
		colorGreenBottomRight_SouthFace = 0.0F;
		colorGreenTopRight_SouthFace = 0.0F;
		colorBlueTopLeft_SouthFace = 0.0F;
		colorBlueBottomLeft_SouthFace = 0.0F;
		colorBlueBottomRight_SouthFace = 0.0F;
		colorBlueTopRight_SouthFace = 0.0F;	
		
		colorRedSlopes = 0.0F;
		colorGreenSlopes = 0.0F;
		colorBlueSlopes = 0.0F;

		ModLoader.addLocalization("KaevWoodSlopesStairsUp.name", "wooden ceiling stairs");
		ModLoader.addLocalization("KaevWoodSlopesSlopeDown.name", "wooden sloped floor");
		ModLoader.addLocalization("KaevWoodSlopesSlopeUp.name", "wooden sloped ceiling");
		ModLoader.addLocalization("KaevWoodSlopesSlopeSide.name", "wooden corner ");		

		ModLoader.addLocalization("KaevCobblestoneSlopesStairsUp.name", "cobblestone ceiling stairs");
		ModLoader.addLocalization("KaevCobblestoneSlopesSlopeDown.name", "cobblestone sloped floor");
		ModLoader.addLocalization("KaevCobblestoneSlopesSlopeUp.name", "cobblestone sloped ceiling");
		ModLoader.addLocalization("KaevCobblestoneSlopesSlopeSide.name", "cobblestone corner ");		

		ModLoader.addLocalization("KaevGlassSlopesStairsUp.name", "glass ceiling stairs");
		ModLoader.addLocalization("KaevGlassSlopesSlopeDown.name", "glass sloped floor");
		ModLoader.addLocalization("KaevGlassSlopesSlopeUp.name", "glass sloped ceiling");
		ModLoader.addLocalization("KaevGlassSlopesSlopeSide.name", "glass corner ");		

		ModLoader.addLocalization("KaevSandstoneSlopesStairsUp.name", "sandstone ceiling stairs");
		ModLoader.addLocalization("KaevSandstoneSlopesSlopeDown.name", "sandstone sloped floor");
		ModLoader.addLocalization("KaevSandstoneSlopesSlopeUp.name", "sandstone sloped ceiling");
		ModLoader.addLocalization("KaevSandstoneSlopesSlopeSide.name", "sandstone corner ");		

		ModLoader.addLocalization("KaevDirtSlopesStairsUp.name", "dirt ceiling stairs");
		ModLoader.addLocalization("KaevDirtSlopesSlopeDown.name", "dirt sloped floor");
		ModLoader.addLocalization("KaevDirtSlopesSlopeUp.name", "dirt sloped ceiling");
		ModLoader.addLocalization("KaevDirtSlopesSlopeSide.name", "dirt corner ");		

		ModLoader.addLocalization("KaevStoneSlopesStairsUp.name", "stone ceiling stairs");
		ModLoader.addLocalization("KaevStoneSlopesSlopeDown.name", "stone sloped floor");
		ModLoader.addLocalization("KaevStoneSlopesSlopeUp.name", "stone sloped ceiling");
		ModLoader.addLocalization("KaevStoneSlopesSlopeSide.name", "stone corner ");		

		ModLoader.addLocalization("KaevSandSlopesStairsUp.name", "sand ceiling stairs");
		ModLoader.addLocalization("KaevSandSlopesSlopeDown.name", "sand sloped floor");
		ModLoader.addLocalization("KaevSandSlopesSlopeUp.name", "sand sloped ceiling");
		ModLoader.addLocalization("KaevSandSlopesSlopeSide.name", "sand corner ");		

		ModLoader.addLocalization("KaevSnowSlopesStairsUp.name", "snow ceiling stairs");
		ModLoader.addLocalization("KaevSnowSlopesSlopeDown.name", "snow sloped floor");
		ModLoader.addLocalization("KaevSnowSlopesSlopeUp.name", "snow sloped ceiling");
		ModLoader.addLocalization("KaevSnowSlopesSlopeSide.name", "snow corner ");		

		ModLoader.addLocalization("KaevGrassSlopesStairsUp.name", "grass ceiling stairs");
		ModLoader.addLocalization("KaevGrassSlopesSlopeDown.name", "grass sloped floor");
		ModLoader.addLocalization("KaevGrassSlopesSlopeUp.name", "grass sloped ceiling");
		ModLoader.addLocalization("KaevGrassSlopesSlopeSide.name", "grass corner ");		

		ModLoader.addLocalization("KaevBricksSlopesStairsUp.name", "bricks ceiling stairs");
		ModLoader.addLocalization("KaevBricksSlopesSlopeDown.name", "bricks sloped floor");
		ModLoader.addLocalization("KaevBricksSlopesSlopeUp.name", "bricks sloped ceiling");
		ModLoader.addLocalization("KaevBricksSlopesSlopeSide.name", "bricks corner ");		

		ModLoader.addLocalization("KaevGravelSlopesStairsUp.name", "gravel ceiling stairs");
		ModLoader.addLocalization("KaevGravelSlopesSlopeDown.name", "gravel sloped floor");
		ModLoader.addLocalization("KaevGravelSlopesSlopeUp.name", "gravel sloped ceiling");
		ModLoader.addLocalization("KaevGravelSlopesSlopeSide.name", "gravel corner ");		

		ModLoader.addLocalization("KaevGoldSlopesStairsUp.name", "golden ceiling stairs");
		ModLoader.addLocalization("KaevGoldSlopesSlopeDown.name", "golden sloped floor");
		ModLoader.addLocalization("KaevGoldSlopesSlopeUp.name", "golden sloped ceiling");
		ModLoader.addLocalization("KaevGoldSlopesSlopeSide.name", "golden corner ");		

		ModLoader.addLocalization("KaevSteelSlopesStairsUp.name", "steel ceiling stairs");
		ModLoader.addLocalization("KaevSteelSlopesSlopeDown.name", "steel sloped floor");
		ModLoader.addLocalization("KaevSteelSlopesSlopeUp.name", "steel sloped ceiling");
		ModLoader.addLocalization("KaevSteelSlopesSlopeSide.name", "steel corner ");		

		ModLoader.addLocalization("KaevObsidianSlopesStairsUp.name", "obsidian ceiling stairs");
		ModLoader.addLocalization("KaevObsidianSlopesSlopeDown.name", "obsidian sloped floor");
		ModLoader.addLocalization("KaevObsidianSlopesSlopeUp.name", "obsidian sloped ceiling");
		ModLoader.addLocalization("KaevObsidianSlopesSlopeSide.name", "obsidian corner ");		

		ModLoader.addLocalization("KaevDiamondSlopesStairsUp.name", "diamond ceiling stairs");
		ModLoader.addLocalization("KaevDiamondSlopesSlopeDown.name", "diamond sloped floor");
		ModLoader.addLocalization("KaevDiamondSlopesSlopeUp.name", "diamond sloped ceiling");
		ModLoader.addLocalization("KaevDiamondSlopesSlopeSide.name", "diamond corner ");
		
		ModLoader.addLocalization("KaevWhiteWoolSlopesStairsUp.name", "white ceiling stairs");
		ModLoader.addLocalization("KaevWhiteWoolSlopesSlopeDown.name", "white sloped floor");
		ModLoader.addLocalization("KaevWhiteWoolSlopesSlopeUp.name", "white sloped ceiling");
		ModLoader.addLocalization("KaevWhiteWoolSlopesSlopeSide.name", "white corner ");

		ModLoader.addLocalization("KaevBlackWoolSlopesStairsUp.name", "black ceiling stairs");
		ModLoader.addLocalization("KaevBlackWoolSlopesSlopeDown.name", "black sloped floor");
		ModLoader.addLocalization("KaevBlackWoolSlopesSlopeUp.name", "black sloped ceiling");
		ModLoader.addLocalization("KaevBlackWoolSlopesSlopeSide.name", "black corner ");

		ModLoader.addLocalization("KaevRedWoolSlopesStairsUp.name", "red ceiling stairs");
		ModLoader.addLocalization("KaevRedWoolSlopesSlopeDown.name", "red sloped floor");
		ModLoader.addLocalization("KaevRedWoolSlopesSlopeUp.name", "red sloped ceiling");
		ModLoader.addLocalization("KaevRedWoolSlopesSlopeSide.name", "red corner ");

		ModLoader.addLocalization("KaevGreenWoolSlopesStairsUp.name", "green ceiling stairs");
		ModLoader.addLocalization("KaevGreenWoolSlopesSlopeDown.name", "green sloped floor");
		ModLoader.addLocalization("KaevGreenWoolSlopesSlopeUp.name", "green sloped ceiling");
		ModLoader.addLocalization("KaevGreenWoolSlopesSlopeSide.name", "green corner ");

		ModLoader.addLocalization("KaevBrownWoolSlopesStairsUp.name", "brown ceiling stairs");
		ModLoader.addLocalization("KaevBrownWoolSlopesSlopeDown.name", "brown sloped floor");
		ModLoader.addLocalization("KaevBrownWoolSlopesSlopeUp.name", "brown sloped ceiling");
		ModLoader.addLocalization("KaevBrownWoolSlopesSlopeSide.name", "brown corner ");

		ModLoader.addLocalization("KaevBlueWoolSlopesStairsUp.name", "blue ceiling stairs");
		ModLoader.addLocalization("KaevBlueWoolSlopesSlopeDown.name", "blue sloped floor");
		ModLoader.addLocalization("KaevBlueWoolSlopesSlopeUp.name", "blue sloped ceiling");
		ModLoader.addLocalization("KaevBlueWoolSlopesSlopeSide.name", "blue corner ");

		ModLoader.addLocalization("KaevPurpleWoolSlopesStairsUp.name", "purple ceiling stairs");
		ModLoader.addLocalization("KaevPurpleWoolSlopesSlopeDown.name", "purple sloped floor");
		ModLoader.addLocalization("KaevPurpleWoolSlopesSlopeUp.name", "purple sloped ceiling");
		ModLoader.addLocalization("KaevPurpleWoolSlopesSlopeSide.name", "purple corner ");

		ModLoader.addLocalization("KaevCyanWoolSlopesStairsUp.name", "cyan ceiling stairs");
		ModLoader.addLocalization("KaevCyanWoolSlopesSlopeDown.name", "cyan sloped floor");
		ModLoader.addLocalization("KaevCyanWoolSlopesSlopeUp.name", "cyan sloped ceiling");
		ModLoader.addLocalization("KaevCyanWoolSlopesSlopeSide.name", "cyan corner ");

		ModLoader.addLocalization("KaevSilverWoolSlopesStairsUp.name", "silver ceiling stairs");
		ModLoader.addLocalization("KaevSilverWoolSlopesSlopeDown.name", "silver sloped floor");
		ModLoader.addLocalization("KaevSilverWoolSlopesSlopeUp.name", "silver sloped ceiling");
		ModLoader.addLocalization("KaevSilverWoolSlopesSlopeSide.name", "silver corner ");

		ModLoader.addLocalization("KaevGrayWoolSlopesStairsUp.name", "gray ceiling stairs");
		ModLoader.addLocalization("KaevGrayWoolSlopesSlopeDown.name", "gray sloped floor");
		ModLoader.addLocalization("KaevGrayWoolSlopesSlopeUp.name", "gray sloped ceiling");
		ModLoader.addLocalization("KaevGrayWoolSlopesSlopeSide.name", "gray corner ");

		ModLoader.addLocalization("KaevPinkWoolSlopesStairsUp.name", "pink ceiling stairs");
		ModLoader.addLocalization("KaevPinkWoolSlopesSlopeDown.name", "pink sloped floor");
		ModLoader.addLocalization("KaevPinkWoolSlopesSlopeUp.name", "pink sloped ceiling");
		ModLoader.addLocalization("KaevPinkWoolSlopesSlopeSide.name", "pink corner ");

		ModLoader.addLocalization("KaevLimeWoolSlopesStairsUp.name", "lime ceiling stairs");
		ModLoader.addLocalization("KaevLimeWoolSlopesSlopeDown.name", "lime sloped floor");
		ModLoader.addLocalization("KaevLimeWoolSlopesSlopeUp.name", "lime sloped ceiling");
		ModLoader.addLocalization("KaevLimeWoolSlopesSlopeSide.name", "lime corner ");

		ModLoader.addLocalization("KaevYellowWoolSlopesStairsUp.name", "yellow ceiling stairs");
		ModLoader.addLocalization("KaevYellowWoolSlopesSlopeDown.name", "yellow sloped floor");
		ModLoader.addLocalization("KaevYellowWoolSlopesSlopeUp.name", "yellow sloped ceiling");
		ModLoader.addLocalization("KaevYellowWoolSlopesSlopeSide.name", "yellow corner ");

		ModLoader.addLocalization("KaevLightBlueWoolSlopesStairsUp.name", "lightBlue ceiling stairs");
		ModLoader.addLocalization("KaevLightBlueWoolSlopesSlopeDown.name", "lightBlue sloped floor");
		ModLoader.addLocalization("KaevLightBlueWoolSlopesSlopeUp.name", "lightBlue sloped ceiling");
		ModLoader.addLocalization("KaevLightBlueWoolSlopesSlopeSide.name", "lightBlue corner ");

		ModLoader.addLocalization("KaevMagentaWoolSlopesStairsUp.name", "magenta ceiling stairs");
		ModLoader.addLocalization("KaevMagentaWoolSlopesSlopeDown.name", "magenta sloped floor");
		ModLoader.addLocalization("KaevMagentaWoolSlopesSlopeUp.name", "magenta sloped ceiling");
		ModLoader.addLocalization("KaevMagentaWoolSlopesSlopeSide.name", "magenta corner ");

		ModLoader.addLocalization("KaevOrangeWoolSlopesStairsUp.name", "orange ceiling stairs");
		ModLoader.addLocalization("KaevOrangeWoolSlopesSlopeDown.name", "orange sloped floor");
		ModLoader.addLocalization("KaevOrangeWoolSlopesSlopeUp.name", "orange sloped ceiling");
		ModLoader.addLocalization("KaevOrangeWoolSlopesSlopeSide.name", "orange corner ");

		if(props.getInt("BlockKaevWoodSlopes") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevWoodSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
				"###", "## ", "#  ", Character.valueOf('#'), Block.planks
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevWoodSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
				"#  ", " # ", "###", Character.valueOf('#'), Block.planks
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevWoodSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
				"###", " # ", "#  ", Character.valueOf('#'), Block.planks
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevWoodSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
				" # ", " ##", " # ", Character.valueOf('#'), Block.planks
			});	
			ModLoader.addRecipe(new ItemStack(Block.planks, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevWoodSlopes
			});	
		}

		if(props.getInt("BlockKaevCobblestoneSlopes") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevCobblestoneSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
				"###", "## ", "#  ", Character.valueOf('#'), Block.cobblestone
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevCobblestoneSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
				"#  ", " # ", "###", Character.valueOf('#'), Block.cobblestone
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevCobblestoneSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
				"###", " # ", "#  ", Character.valueOf('#'), Block.cobblestone
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevCobblestoneSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
				" # ", " ##", " # ", Character.valueOf('#'), Block.cobblestone
			});	
			ModLoader.addRecipe(new ItemStack(Block.cobblestone, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevCobblestoneSlopes
			});	
		}

		if(props.getInt("BlockKaevGlassSlopes") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevGlassSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
				"###", "## ", "#  ", Character.valueOf('#'), Block.glass
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevGlassSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
				"#  ", " # ", "###", Character.valueOf('#'), Block.glass
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevGlassSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
				"###", " # ", "#  ", Character.valueOf('#'), Block.glass
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevGlassSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
				" # ", " ##", " # ", Character.valueOf('#'), Block.glass
			});	
			ModLoader.addRecipe(new ItemStack(Block.glass, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevGlassSlopes
			});	
		}

		if(props.getInt("BlockKaevSandstoneSlopes") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevSandstoneSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
				"###", "## ", "#  ", Character.valueOf('#'), Block.sandStone
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevSandstoneSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
				"#  ", " # ", "###", Character.valueOf('#'), Block.sandStone
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevSandstoneSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
				"###", " # ", "#  ", Character.valueOf('#'), Block.sandStone
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevSandstoneSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
				" # ", " ##", " # ", Character.valueOf('#'), Block.sandStone
			});	
			ModLoader.addRecipe(new ItemStack(Block.sandStone, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevSandstoneSlopes
			});	
		}

		if(props.getInt("BlockKaevDirtSlopes") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevDirtSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
				"###", "## ", "#  ", Character.valueOf('#'), Block.dirt
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevDirtSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
				"#  ", " # ", "###", Character.valueOf('#'), Block.dirt
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevDirtSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
				"###", " # ", "#  ", Character.valueOf('#'), Block.dirt
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevDirtSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
				" # ", " ##", " # ", Character.valueOf('#'), Block.dirt
			});	
			ModLoader.addRecipe(new ItemStack(Block.dirt, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevDirtSlopes
			});	
		}

		if(props.getInt("BlockKaevStoneSlopes") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevStoneSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
				"###", "## ", "#  ", Character.valueOf('#'), Block.stone
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevStoneSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
				"#  ", " # ", "###", Character.valueOf('#'), Block.stone
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevStoneSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
				"###", " # ", "#  ", Character.valueOf('#'), Block.stone
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevStoneSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
				" # ", " ##", " # ", Character.valueOf('#'), Block.stone
			});	
			ModLoader.addRecipe(new ItemStack(Block.stone, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevStoneSlopes
			});	
		}

		if(props.getInt("BlockKaevSandSlopes") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevSandSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
				"###", "## ", "#  ", Character.valueOf('#'), Block.sand
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevSandSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
				"#  ", " # ", "###", Character.valueOf('#'), Block.sand
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevSandSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
				"###", " # ", "#  ", Character.valueOf('#'), Block.sand
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevSandSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
				" # ", " ##", " # ", Character.valueOf('#'), Block.sand
			});	
			ModLoader.addRecipe(new ItemStack(Block.sand, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevSandSlopes
			});	
		}

		if(props.getInt("BlockKaevSnowSlopes") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevSnowSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
				"###", "## ", "#  ", Character.valueOf('#'), Block.blockSnow
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevSnowSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
				"#  ", " # ", "###", Character.valueOf('#'), Block.blockSnow
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevSnowSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
				"###", " # ", "#  ", Character.valueOf('#'), Block.blockSnow
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevSnowSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
				" # ", " ##", " # ", Character.valueOf('#'), Block.blockSnow
			});	
			ModLoader.addRecipe(new ItemStack(Block.blockSnow, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevSnowSlopes
			});	
		}

		if(props.getInt("BlockKaevGrassSlopes") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevGrassSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
				"###", "## ", "#  ", Character.valueOf('#'), Block.grass
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevGrassSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
				"#  ", " # ", "###", Character.valueOf('#'), Block.grass
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevGrassSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
				"###", " # ", "#  ", Character.valueOf('#'), Block.grass
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevGrassSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
				" # ", " ##", " # ", Character.valueOf('#'), Block.grass
			});	
			ModLoader.addRecipe(new ItemStack(Block.grass, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevGrassSlopes
			});	
		}

		if(props.getInt("BlockKaevBricksSlopes") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevBricksSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
				"###", "## ", "#  ", Character.valueOf('#'), Block.brick
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevBricksSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
				"#  ", " # ", "###", Character.valueOf('#'), Block.brick
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevBricksSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
				"###", " # ", "#  ", Character.valueOf('#'), Block.brick
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevBricksSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
				" # ", " ##", " # ", Character.valueOf('#'), Block.brick
			});	
			ModLoader.addRecipe(new ItemStack(Block.brick, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevBricksSlopes
			});	
		}

		if(props.getInt("BlockKaevGravelSlopes") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevGravelSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
				"###", "## ", "#  ", Character.valueOf('#'), Block.gravel
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevGravelSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
				"#  ", " # ", "###", Character.valueOf('#'), Block.gravel
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevGravelSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
				"###", " # ", "#  ", Character.valueOf('#'), Block.gravel
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevGravelSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
				" # ", " ##", " # ", Character.valueOf('#'), Block.gravel
			});	
			ModLoader.addRecipe(new ItemStack(Block.gravel, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevGravelSlopes
			});	
		}

		if(props.getInt("BlockKaevGoldSlopes") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevGoldSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
				"###", "## ", "#  ", Character.valueOf('#'), Block.blockGold
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevGoldSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
				"#  ", " # ", "###", Character.valueOf('#'), Block.blockGold
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevGoldSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
				"###", " # ", "#  ", Character.valueOf('#'), Block.blockGold
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevGoldSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
				" # ", " ##", " # ", Character.valueOf('#'), Block.blockGold
			});	
			ModLoader.addRecipe(new ItemStack(Block.blockGold, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevGoldSlopes
			});	
		}

		if(props.getInt("BlockKaevSteelSlopes") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevSteelSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
				"###", "## ", "#  ", Character.valueOf('#'), Block.blockSteel
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevSteelSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
				"#  ", " # ", "###", Character.valueOf('#'), Block.blockSteel
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevSteelSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
				"###", " # ", "#  ", Character.valueOf('#'), Block.blockSteel
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevSteelSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
				" # ", " ##", " # ", Character.valueOf('#'), Block.blockSteel
			});	
			ModLoader.addRecipe(new ItemStack(Block.blockSteel, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevSteelSlopes
			});	
		}

		if(props.getInt("BlockKaevObsidianSlopes") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevObsidianSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
				"###", "## ", "#  ", Character.valueOf('#'), Block.obsidian
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevObsidianSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
				"#  ", " # ", "###", Character.valueOf('#'), Block.obsidian
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevObsidianSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
				"###", " # ", "#  ", Character.valueOf('#'), Block.obsidian
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevObsidianSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
				" # ", " ##", " # ", Character.valueOf('#'), Block.obsidian
			});	
			ModLoader.addRecipe(new ItemStack(Block.obsidian, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevObsidianSlopes
			});	
		}
		
		if(props.getInt("BlockKaevDiamondSlopes") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevDiamondSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
				"###", "## ", "#  ", Character.valueOf('#'), Block.blockDiamond
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevDiamondSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
				"#  ", " # ", "###", Character.valueOf('#'), Block.blockDiamond
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevDiamondSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
				"###", " # ", "#  ", Character.valueOf('#'), Block.blockDiamond
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevDiamondSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
				" # ", " ##", " # ", Character.valueOf('#'), Block.blockDiamond
			});	
			ModLoader.addRecipe(new ItemStack(Block.blockDiamond, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevDiamondSlopes
			});	
		}
		
		if(props.getInt("BlockKaevWhiteWoolSlopes") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevWhiteWoolSlopes, 3, BlockSlopes_Kaevator.func_21035_d(0)), new Object[] {
			    "###", "## ", "#  ", Character.valueOf('#'), Block.cloth
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevWhiteWoolSlopes, 5, BlockSlopes_Kaevator.func_21035_d(4)), new Object[] {
			    "#  ", " # ", "###", Character.valueOf('#'), Block.cloth
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevWhiteWoolSlopes, 5, BlockSlopes_Kaevator.func_21035_d(8)), new Object[] {
			    "###", " # ", "#  ", Character.valueOf('#'), Block.cloth
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevWhiteWoolSlopes, 4, BlockSlopes_Kaevator.func_21035_d(12)), new Object[] {
			    " # ", " ##", " # ", Character.valueOf('#'), Block.cloth
			});	
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 0), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevWhiteWoolSlopes
			});	
		}
		
		if(props.getInt("BlockKaevBlackWoolSlopes") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 15), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevBlackWoolSlopes
			});	
		}

		if(props.getInt("BlockKaevRedWoolSlopes") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 14), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevRedWoolSlopes
			});	
		}

		if(props.getInt("BlockKaevGreenWoolSlopes") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 13), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevGreenWoolSlopes
			});	
		}

		if(props.getInt("BlockKaevBrownWoolSlopes") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 12), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevBrownWoolSlopes
			});	
		}

		if(props.getInt("BlockKaevBlueWoolSlopes") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 11), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevBlueWoolSlopes
			});	
		}

		if(props.getInt("BlockKaevPurpleWoolSlopes") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 10), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevPurpleWoolSlopes
			});	
		}

		if(props.getInt("BlockKaevCyanWoolSlopes") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 9), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevCyanWoolSlopes
			});	
		}

		if(props.getInt("BlockKaevSilverWoolSlopes") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 8), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevSilverWoolSlopes
			});	
		}

		if(props.getInt("BlockKaevGrayWoolSlopes") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 7), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevGrayWoolSlopes
			});	
		}

		if(props.getInt("BlockKaevPinkWoolSlopes") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 6), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevPinkWoolSlopes
			});	
		}

		if(props.getInt("BlockKaevLimeWoolSlopes") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 5), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevLimeWoolSlopes
			});	
		}

		if(props.getInt("BlockKaevYellowWoolSlopes") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 4), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevYellowWoolSlopes
			});	
		}

		if(props.getInt("BlockKaevLightBlueWoolSlopes") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 3), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevLightBlueWoolSlopes
			});	
		}

		if(props.getInt("BlockKaevMagentaWoolSlopes") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 2), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevMagentaWoolSlopes
			});	
		}

		if(props.getInt("BlockKaevOrangeWoolSlopes") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 1), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevOrangeWoolSlopes
			});	
		}
	}
	
	private static String getAppdata()
	{
		return Minecraft.getMinecraftDir().getPath();
	}			
	
	public static KrushProps props;		
	
	public static int SlopesRenderID;	
	public static int SlopesOpacity;	
	
	public static final Block BlockKaevWoodSlopes;
	public static final Block BlockKaevCobblestoneSlopes;
	public static final Block BlockKaevGlassSlopes;
	public static final Block BlockKaevSandstoneSlopes;
	public static final Block BlockKaevDirtSlopes;
	public static final Block BlockKaevStoneSlopes;
	public static final Block BlockKaevSandSlopes;
	public static final Block BlockKaevSnowSlopes;
	public static final Block BlockKaevGrassSlopes;
	public static final Block BlockKaevBricksSlopes;
	public static final Block BlockKaevGravelSlopes;
	public static final Block BlockKaevGoldSlopes;
	public static final Block BlockKaevSteelSlopes;
	public static final Block BlockKaevObsidianSlopes;
	public static final Block BlockKaevDiamondSlopes;	
	public static final Block BlockKaevWhiteWoolSlopes;
	public static final Block BlockKaevBlackWoolSlopes;
	public static final Block BlockKaevRedWoolSlopes;
	public static final Block BlockKaevGreenWoolSlopes;
	public static final Block BlockKaevBrownWoolSlopes;
	public static final Block BlockKaevBlueWoolSlopes;
	public static final Block BlockKaevPurpleWoolSlopes;
	public static final Block BlockKaevCyanWoolSlopes;
	public static final Block BlockKaevSilverWoolSlopes;
	public static final Block BlockKaevGrayWoolSlopes;
	public static final Block BlockKaevPinkWoolSlopes;
	public static final Block BlockKaevLimeWoolSlopes;
	public static final Block BlockKaevYellowWoolSlopes;
	public static final Block BlockKaevLightBlueWoolSlopes;
	public static final Block BlockKaevMagentaWoolSlopes;
	public static final Block BlockKaevOrangeWoolSlopes;

	public static Item ItemKaevWoodSlopes;
	public static Item ItemKaevCobblestoneSlopes;
	public static Item ItemKaevGlassSlopes;
	public static Item ItemKaevSandstoneSlopes;
	public static Item ItemKaevDirtSlopes;
	public static Item ItemKaevStoneSlopes;
	public static Item ItemKaevSandSlopes;
	public static Item ItemKaevSnowSlopes;
	public static Item ItemKaevGrassSlopes;
	public static Item ItemKaevBricksSlopes;
	public static Item ItemKaevGravelSlopes;
	public static Item ItemKaevGoldSlopes;
	public static Item ItemKaevSteelSlopes;
	public static Item ItemKaevObsidianSlopes;
	public static Item ItemKaevDiamondSlopes;	
	public static Item ItemKaevWhiteWoolSlopes;
	public static Item ItemKaevBlackWoolSlopes;
	public static Item ItemKaevRedWoolSlopes;
	public static Item ItemKaevGreenWoolSlopes;
	public static Item ItemKaevBrownWoolSlopes;
	public static Item ItemKaevBlueWoolSlopes;
	public static Item ItemKaevPurpleWoolSlopes;
	public static Item ItemKaevCyanWoolSlopes;
	public static Item ItemKaevSilverWoolSlopes;
	public static Item ItemKaevGrayWoolSlopes;
	public static Item ItemKaevPinkWoolSlopes;
	public static Item ItemKaevLimeWoolSlopes;
	public static Item ItemKaevYellowWoolSlopes;
	public static Item ItemKaevLightBlueWoolSlopes;
	public static Item ItemKaevMagentaWoolSlopes;
	public static Item ItemKaevOrangeWoolSlopes;
	
	public static boolean field_27406_a = true;
    public static boolean field_27511_cfgGrassFix = true;
	public boolean enableAO;
	public float aoLightValueThis;
    public float aoLightValueXNeg;
    public float aoLightValueYNeg;
    public float aoLightValueZNeg;
    public float aoLightValueXPos;
    public float aoLightValueYPos;
    public float aoLightValueZPos;
    public float aoLightValueXNegYNegZNeg;
    public float aoLightValueXNegYNeg;
    public float aoLightValueXNegYNegZPos;
    public float aoLightValueYNegZNeg;
    public float aoLightValueYNegZPos;
    public float aoLightValueXPosYNegZNeg;
    public float aoLightValueXPosYNeg;
    public float aoLightValueXPosYNegZPos;
    public float aoLightValueXNegYPosZNeg;
    public float aoLightValueXNegYPos;
    public float aoLightValueXNegYPosZPos;
    public float aoLightValueYPosZNeg;
    public float aoLightValueXPosYPosZNeg;
    public float aoLightValueXPosYPos;
    public float aoLightValueYPosZPos;
    public float aoLightValueXPosYPosZPos;
    public float aoLightValueXNegZNeg;
    public float aoLightValueXPosZNeg;
    public float aoLightValueXNegZPos;
    public float aoLightValueXPosZPos;
    public int field_22352_G;    
    public boolean isBlockYPosZNeg;
    public boolean isBlockXPosYPos;
    public boolean isBlockXNegYPos;
    public boolean isBlockYPosZPos;
    public boolean isBlockXNegZNeg;
    public boolean isBlockXPosZPos;
    public boolean isBlockXNegZPos;
    public boolean isBlockXPosZNeg;
    public boolean isBlockYNegZNeg;
    public boolean isBlockXPosYNeg;
    public boolean isBlockXNegYNeg;
    public boolean isBlockYNegZPos;
    public int field_27510_blockX;
    public int field_27509_blockY;
    public int field_27508_blockZ;
	
	public float factorTop;
    public float factorBottom;
    public float factorEast;
    public float factorWest;
    public float factorNorth;
    public float factorSouth;

	public float colorRedTopLeft_TopFace;
    public float colorRedBottomLeft_TopFace;
    public float colorRedBottomRight_TopFace;
    public float colorRedTopRight_TopFace;
    public float colorGreenTopLeft_TopFace;
    public float colorGreenBottomLeft_TopFace;
    public float colorGreenBottomRight_TopFace;
    public float colorGreenTopRight_TopFace;
    public float colorBlueTopLeft_TopFace;
    public float colorBlueBottomLeft_TopFace;
    public float colorBlueBottomRight_TopFace;
    public float colorBlueTopRight_TopFace;
	
	public float colorRedTopLeft_BottomFace;
    public float colorRedBottomLeft_BottomFace;
    public float colorRedBottomRight_BottomFace;
    public float colorRedTopRight_BottomFace;
    public float colorGreenTopLeft_BottomFace;
    public float colorGreenBottomLeft_BottomFace;
    public float colorGreenBottomRight_BottomFace;
    public float colorGreenTopRight_BottomFace;
    public float colorBlueTopLeft_BottomFace;
    public float colorBlueBottomLeft_BottomFace;
    public float colorBlueBottomRight_BottomFace;
    public float colorBlueTopRight_BottomFace;
	
	public float colorRedTopLeft_EastFace;
    public float colorRedBottomLeft_EastFace;
    public float colorRedBottomRight_EastFace;
    public float colorRedTopRight_EastFace;
    public float colorGreenTopLeft_EastFace;
    public float colorGreenBottomLeft_EastFace;
    public float colorGreenBottomRight_EastFace;
    public float colorGreenTopRight_EastFace;
    public float colorBlueTopLeft_EastFace;
    public float colorBlueBottomLeft_EastFace;
    public float colorBlueBottomRight_EastFace;
    public float colorBlueTopRight_EastFace;
	
	public float colorRedTopLeft_WestFace;
    public float colorRedBottomLeft_WestFace;
    public float colorRedBottomRight_WestFace;
    public float colorRedTopRight_WestFace;
    public float colorGreenTopLeft_WestFace;
    public float colorGreenBottomLeft_WestFace;
    public float colorGreenBottomRight_WestFace;
    public float colorGreenTopRight_WestFace;
    public float colorBlueTopLeft_WestFace;
    public float colorBlueBottomLeft_WestFace;
    public float colorBlueBottomRight_WestFace;
    public float colorBlueTopRight_WestFace;
	
	public float colorRedTopLeft_NorthFace;
    public float colorRedBottomLeft_NorthFace;
    public float colorRedBottomRight_NorthFace;
    public float colorRedTopRight_NorthFace;
    public float colorGreenTopLeft_NorthFace;
    public float colorGreenBottomLeft_NorthFace;
    public float colorGreenBottomRight_NorthFace;
    public float colorGreenTopRight_NorthFace;
    public float colorBlueTopLeft_NorthFace;
    public float colorBlueBottomLeft_NorthFace;
    public float colorBlueBottomRight_NorthFace;
    public float colorBlueTopRight_NorthFace;
	
	public float colorRedTopLeft_SouthFace;
    public float colorRedBottomLeft_SouthFace;
    public float colorRedBottomRight_SouthFace;
    public float colorRedTopRight_SouthFace;
    public float colorGreenTopLeft_SouthFace;
    public float colorGreenBottomLeft_SouthFace;
    public float colorGreenBottomRight_SouthFace;
    public float colorGreenTopRight_SouthFace;
    public float colorBlueTopLeft_SouthFace;
    public float colorBlueBottomLeft_SouthFace;
    public float colorBlueBottomRight_SouthFace;
    public float colorBlueTopRight_SouthFace;	
	
	public float colorRedSlopes;
	public float colorGreenSlopes;
	public float colorBlueSlopes; 
	
	static
	{
		props = new KrushProps(new File(getAppdata() + "/config/KaevatorSuperSlopes.props").getPath());
		prepareProps();
		SlopesOpacity = props.getInt("Slopes_Opacity");
		
		if(props.getInt("BlockKaevWoodSlopes") != 0){
			BlockKaevWoodSlopes = new BlockSlopes_Kaevator(props.getInt("BlockKaevWoodSlopes"),4,Material.wood).setHardness(2.0F).setStepSound(Block.soundWoodFootstep).setResistance(5F).setBlockName("BlockKaevWoodSlopes");
			ItemKaevWoodSlopes = new ItemSlopes_Kaevator(BlockKaevWoodSlopes.blockID - 256, "Wood").setItemName("ItemKaevWoodSlopes");
		}else{
			BlockKaevWoodSlopes = Block.stone;
		}
		if(props.getInt("BlockKaevCobblestoneSlopes") != 0){
			BlockKaevCobblestoneSlopes = new BlockSlopes_Kaevator(props.getInt("BlockKaevCobblestoneSlopes"),16,Material.rock).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setResistance(10F).setBlockName("BlockKaevCobblestoneSlopes");
			ItemKaevCobblestoneSlopes = new ItemSlopes_Kaevator(BlockKaevCobblestoneSlopes.blockID - 256, "Cobblestone").setItemName("ItemKaevCobblestoneSlopes");
		}else{
			BlockKaevCobblestoneSlopes = Block.stone;
		}
		if(props.getInt("BlockKaevGlassSlopes") != 0){
			BlockKaevGlassSlopes = new BlockSlopes_Kaevator(props.getInt("BlockKaevGlassSlopes"),49,Material.glass).setHardness(0.3F).setStepSound(Block.soundGlassFootstep).setBlockName("BlockKaevGlassSlopes");
			ItemKaevGlassSlopes = new ItemSlopes_Kaevator(BlockKaevGlassSlopes.blockID - 256, "Glass").setItemName("ItemKaevGlassSlopes");
		}else{
			BlockKaevGlassSlopes = Block.stone;
		}
		if(props.getInt("BlockKaevSandstoneSlopes") != 0){
			BlockKaevSandstoneSlopes = new BlockSlopes_Kaevator(props.getInt("BlockKaevSandstoneSlopes"),192,Material.rock).setHardness(0.8F).setStepSound(Block.soundStoneFootstep).setBlockName("BlockKaevSandstoneSlopes");
			ItemKaevSandstoneSlopes = new ItemSlopes_Kaevator(BlockKaevSandstoneSlopes.blockID - 256, "Sandstone").setItemName("ItemKaevSandstoneSlopes");
		}else{
			BlockKaevSandstoneSlopes = Block.stone;
		}
		if(props.getInt("BlockKaevDirtSlopes") != 0){
			BlockKaevDirtSlopes = new BlockSlopes_Kaevator(props.getInt("BlockKaevDirtSlopes"),2,Material.ground).setHardness(0.5F).setStepSound(Block.soundGravelFootstep).setBlockName("BlockKaevDirtSlopes");
			ItemKaevDirtSlopes = new ItemSlopes_Kaevator(BlockKaevDirtSlopes.blockID - 256, "Dirt").setItemName("ItemKaevDirtSlopes");
		}else{
			BlockKaevDirtSlopes = Block.stone;
		}
		if(props.getInt("BlockKaevStoneSlopes") != 0){
			BlockKaevStoneSlopes = new BlockSlopes_Kaevator(props.getInt("BlockKaevStoneSlopes"),1,Material.rock).setHardness(1.5F).setStepSound(Block.soundStoneFootstep).setResistance(10F).setBlockName("BlockKaevStoneSlopes");
			ItemKaevStoneSlopes = new ItemSlopes_Kaevator(BlockKaevStoneSlopes.blockID - 256, "Stone").setItemName("ItemKaevStoneSlopes");
		}else{
			BlockKaevStoneSlopes = Block.stone;
		}
		if(props.getInt("BlockKaevSandSlopes") != 0){
			BlockKaevSandSlopes = new BlockSlopes_Kaevator(props.getInt("BlockKaevSandSlopes"),18,Material.sand).setHardness(0.5F).setStepSound(Block.soundSandFootstep).setBlockName("BlockKaevSandSlopes");
			ItemKaevSandSlopes = new ItemSlopes_Kaevator(BlockKaevSandSlopes.blockID - 256, "Sand").setItemName("ItemKaevSandSlopes");
		}else{
			BlockKaevSandSlopes = Block.stone;
		}
		if(props.getInt("BlockKaevSnowSlopes") != 0){
			BlockKaevSnowSlopes = new BlockSlopes_Kaevator(props.getInt("BlockKaevSnowSlopes"),66,Material.snow).setHardness(0.1F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevSnowSlopes");
			ItemKaevSnowSlopes = new ItemSlopes_Kaevator(BlockKaevSnowSlopes.blockID - 256, "Snow").setItemName("ItemKaevSnowSlopes");
		}else{
			BlockKaevSnowSlopes = Block.stone;
		}
		if(props.getInt("BlockKaevGrassSlopes") != 0){
			BlockKaevGrassSlopes = new BlockSlopes_Kaevator(props.getInt("BlockKaevGrassSlopes"),3,Material.ground).setHardness(0.6F).setStepSound(Block.soundGrassFootstep).setBlockName("BlockKaevGrassSlopes");
			ItemKaevGrassSlopes = new ItemSlopes_Kaevator(BlockKaevGrassSlopes.blockID - 256, "Grass").setItemName("ItemKaevGrassSlopes");
		}else{
			BlockKaevGrassSlopes = Block.stone;
		}
		if(props.getInt("BlockKaevBricksSlopes") != 0){
			BlockKaevBricksSlopes = new BlockSlopes_Kaevator(props.getInt("BlockKaevBricksSlopes"),7,Material.rock).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setResistance(10F).setBlockName("BlockKaevBricksSlopes");
			ItemKaevBricksSlopes = new ItemSlopes_Kaevator(BlockKaevBricksSlopes.blockID - 256, "Bricks").setItemName("ItemKaevBricksSlopes");
		}else{
			BlockKaevBricksSlopes = Block.stone;
		}
		if(props.getInt("BlockKaevGravelSlopes") != 0){
			BlockKaevGravelSlopes = new BlockSlopes_Kaevator(props.getInt("BlockKaevGravelSlopes"),19,Material.sand).setHardness(0.6F).setStepSound(Block.soundGravelFootstep).setBlockName("BlockKaevGravelSlopes");
			ItemKaevGravelSlopes = new ItemSlopes_Kaevator(BlockKaevGravelSlopes.blockID - 256, "Gravel").setItemName("ItemKaevGravelSlopes");
		}else{
			BlockKaevGravelSlopes = Block.stone;
		}
		if(props.getInt("BlockKaevGoldSlopes") != 0){
			BlockKaevGoldSlopes = new BlockSlopes_Kaevator(props.getInt("BlockKaevGoldSlopes"),23,Material.iron).setHardness(3F).setStepSound(Block.soundMetalFootstep).setResistance(10F).setBlockName("BlockKaevGoldSlopes");
			ItemKaevGoldSlopes = new ItemSlopes_Kaevator(BlockKaevGoldSlopes.blockID - 256, "Gold").setItemName("ItemKaevGoldSlopes");
		}else{
			BlockKaevGoldSlopes = Block.stone;
		}
		if(props.getInt("BlockKaevSteelSlopes") != 0){
			BlockKaevSteelSlopes = new BlockSlopes_Kaevator(props.getInt("BlockKaevSteelSlopes"),22,Material.iron).setHardness(5F).setStepSound(Block.soundMetalFootstep).setResistance(10F).setBlockName("BlockKaevSteelSlopes");
			ItemKaevSteelSlopes = new ItemSlopes_Kaevator(BlockKaevSteelSlopes.blockID - 256, "Steel").setItemName("ItemKaevSteelSlopes");
		}else{
			BlockKaevSteelSlopes = Block.stone;
		}
		if(props.getInt("BlockKaevObsidianSlopes") != 0){
			BlockKaevObsidianSlopes = new BlockSlopes_Kaevator(props.getInt("BlockKaevObsidianSlopes"),37,Material.rock).setHardness(10F).setStepSound(Block.soundStoneFootstep).setResistance(2000F).setBlockName("BlockKaevObsidianSlopes");
			ItemKaevObsidianSlopes = new ItemSlopes_Kaevator(BlockKaevObsidianSlopes.blockID - 256, "Obsidian").setItemName("ItemKaevObsidianSlopes");
		}else{
			BlockKaevObsidianSlopes = Block.stone;
		}
		if(props.getInt("BlockKaevDiamondSlopes") != 0){
			BlockKaevDiamondSlopes = new BlockSlopes_Kaevator(props.getInt("BlockKaevDiamondSlopes"),24,Material.iron).setHardness(5F).setStepSound(Block.soundMetalFootstep).setResistance(10F).setBlockName("BlockKaevDiamondSlopes");
			ItemKaevDiamondSlopes = new ItemSlopes_Kaevator(BlockKaevDiamondSlopes.blockID - 256, "Diamond").setItemName("ItemKaevDiamondSlopes");
		}else{
			BlockKaevDiamondSlopes = Block.stone;
		}
		if(props.getInt("BlockKaevWhiteWoolSlopes") != 0){
			BlockKaevWhiteWoolSlopes = new BlockSlopes_Kaevator(props.getInt("BlockKaevWhiteWoolSlopes"),64,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevWhiteWoolSlopes");
			ItemKaevWhiteWoolSlopes = new ItemSlopes_Kaevator(BlockKaevWhiteWoolSlopes.blockID - 256, "WhiteWool").setItemName("ItemKaevWhiteWoolSlopes");
		}else{
			BlockKaevWhiteWoolSlopes = Block.stone;
		}
		if(props.getInt("BlockKaevBlackWoolSlopes") != 0){
			BlockKaevBlackWoolSlopes = new BlockSlopes_Kaevator(props.getInt("BlockKaevBlackWoolSlopes"),113,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevBlackWoolSlopes");
			ItemKaevBlackWoolSlopes = new ItemSlopes_Kaevator(BlockKaevBlackWoolSlopes.blockID - 256, "BlackWool").setItemName("ItemKaevBlackWoolSlopes");
		}else{
			BlockKaevBlackWoolSlopes = Block.stone;
		}
		if(props.getInt("BlockKaevRedWoolSlopes") != 0){
			BlockKaevRedWoolSlopes = new BlockSlopes_Kaevator(props.getInt("BlockKaevRedWoolSlopes"),129,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevRedWoolSlopes");
			ItemKaevRedWoolSlopes = new ItemSlopes_Kaevator(BlockKaevRedWoolSlopes.blockID - 256, "RedWool").setItemName("ItemKaevRedWoolSlopes");
		}else{
			BlockKaevRedWoolSlopes = Block.stone;
		}
		if(props.getInt("BlockKaevGreenWoolSlopes") != 0){
			BlockKaevGreenWoolSlopes = new BlockSlopes_Kaevator(props.getInt("BlockKaevGreenWoolSlopes"),145,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevGreenWoolSlopes");
			ItemKaevGreenWoolSlopes = new ItemSlopes_Kaevator(BlockKaevGreenWoolSlopes.blockID - 256, "GreenWool").setItemName("ItemKaevGreenWoolSlopes");
		}else{
			BlockKaevGreenWoolSlopes = Block.stone;
		}
		if(props.getInt("BlockKaevBrownWoolSlopes") != 0){
			BlockKaevBrownWoolSlopes = new BlockSlopes_Kaevator(props.getInt("BlockKaevBrownWoolSlopes"),161,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevBrownWoolSlopes");
			ItemKaevBrownWoolSlopes = new ItemSlopes_Kaevator(BlockKaevBrownWoolSlopes.blockID - 256, "BrownWool").setItemName("ItemKaevBrownWoolSlopes");
		}else{
			BlockKaevBrownWoolSlopes = Block.stone;
		}
		if(props.getInt("BlockKaevBlueWoolSlopes") != 0){
			BlockKaevBlueWoolSlopes = new BlockSlopes_Kaevator(props.getInt("BlockKaevBlueWoolSlopes"),177,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevBlueWoolSlopes");
			ItemKaevBlueWoolSlopes = new ItemSlopes_Kaevator(BlockKaevBlueWoolSlopes.blockID - 256, "BlueWool").setItemName("ItemKaevBlueWoolSlopes");
		}else{
			BlockKaevBlueWoolSlopes = Block.stone;
		}
		if(props.getInt("BlockKaevPurpleWoolSlopes") != 0){
			BlockKaevPurpleWoolSlopes = new BlockSlopes_Kaevator(props.getInt("BlockKaevPurpleWoolSlopes"),193,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevPurpleWoolSlopes");
			ItemKaevPurpleWoolSlopes = new ItemSlopes_Kaevator(BlockKaevPurpleWoolSlopes.blockID - 256, "PurpleWool").setItemName("ItemKaevPurpleWoolSlopes");
		}else{
			BlockKaevPurpleWoolSlopes = Block.stone;
		}
		if(props.getInt("BlockKaevCyanWoolSlopes") != 0){
			BlockKaevCyanWoolSlopes = new BlockSlopes_Kaevator(props.getInt("BlockKaevCyanWoolSlopes"),209,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevCyanWoolSlopes");
			ItemKaevCyanWoolSlopes = new ItemSlopes_Kaevator(BlockKaevCyanWoolSlopes.blockID - 256, "CyanWool").setItemName("ItemKaevCyanWoolSlopes");
		}else{
			BlockKaevCyanWoolSlopes = Block.stone;
		}
		if(props.getInt("BlockKaevSilverWoolSlopes") != 0){
			BlockKaevSilverWoolSlopes = new BlockSlopes_Kaevator(props.getInt("BlockKaevSilverWoolSlopes"),225,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevSilverWoolSlopes");
			ItemKaevSilverWoolSlopes = new ItemSlopes_Kaevator(BlockKaevSilverWoolSlopes.blockID - 256, "SilverWool").setItemName("ItemKaevSilverWoolSlopes");
		}else{
			BlockKaevSilverWoolSlopes = Block.stone;
		}
		if(props.getInt("BlockKaevGrayWoolSlopes") != 0){
			BlockKaevGrayWoolSlopes = new BlockSlopes_Kaevator(props.getInt("BlockKaevGrayWoolSlopes"),114,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevGrayWoolSlopes");
			ItemKaevGrayWoolSlopes = new ItemSlopes_Kaevator(BlockKaevGrayWoolSlopes.blockID - 256, "GrayWool").setItemName("ItemKaevGrayWoolSlopes");
		}else{
			BlockKaevGrayWoolSlopes = Block.stone;
		}
		if(props.getInt("BlockKaevPinkWoolSlopes") != 0){
			BlockKaevPinkWoolSlopes = new BlockSlopes_Kaevator(props.getInt("BlockKaevPinkWoolSlopes"),130,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevPinkWoolSlopes");
			ItemKaevPinkWoolSlopes = new ItemSlopes_Kaevator(BlockKaevPinkWoolSlopes.blockID - 256, "PinkWool").setItemName("ItemKaevPinkWoolSlopes");
		}else{
			BlockKaevPinkWoolSlopes = Block.stone;
		}
		if(props.getInt("BlockKaevLimeWoolSlopes") != 0){
			BlockKaevLimeWoolSlopes = new BlockSlopes_Kaevator(props.getInt("BlockKaevLimeWoolSlopes"),146,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevLimeWoolSlopes");
			ItemKaevLimeWoolSlopes = new ItemSlopes_Kaevator(BlockKaevLimeWoolSlopes.blockID - 256, "LimeWool").setItemName("ItemKaevLimeWoolSlopes");
		}else{
			BlockKaevLimeWoolSlopes = Block.stone;
		}
		if(props.getInt("BlockKaevYellowWoolSlopes") != 0){
			BlockKaevYellowWoolSlopes = new BlockSlopes_Kaevator(props.getInt("BlockKaevYellowWoolSlopes"),162,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevYellowWoolSlopes");
			ItemKaevYellowWoolSlopes = new ItemSlopes_Kaevator(BlockKaevYellowWoolSlopes.blockID - 256, "YellowWool").setItemName("ItemKaevYellowWoolSlopes");
		}else{
			BlockKaevYellowWoolSlopes = Block.stone;
		}
		if(props.getInt("BlockKaevLightBlueWoolSlopes") != 0){
			BlockKaevLightBlueWoolSlopes = new BlockSlopes_Kaevator(props.getInt("BlockKaevLightBlueWoolSlopes"),178,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevLightBlueWoolSlopes");
			ItemKaevLightBlueWoolSlopes = new ItemSlopes_Kaevator(BlockKaevLightBlueWoolSlopes.blockID - 256, "LightBlueWool").setItemName("ItemKaevLightBlueWoolSlopes");
		}else{
			BlockKaevLightBlueWoolSlopes = Block.stone;
		}
		if(props.getInt("BlockKaevMagentaWoolSlopes") != 0){
			BlockKaevMagentaWoolSlopes = new BlockSlopes_Kaevator(props.getInt("BlockKaevMagentaWoolSlopes"),194,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevMagentaWoolSlopes");
			ItemKaevMagentaWoolSlopes = new ItemSlopes_Kaevator(BlockKaevMagentaWoolSlopes.blockID - 256, "MagentaWool").setItemName("ItemKaevMagentaWoolSlopes");
		}else{
			BlockKaevMagentaWoolSlopes = Block.stone;
		}
		if(props.getInt("BlockKaevOrangeWoolSlopes") != 0){
			BlockKaevOrangeWoolSlopes = new BlockSlopes_Kaevator(props.getInt("BlockKaevOrangeWoolSlopes"),210,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevOrangeWoolSlopes");
			ItemKaevOrangeWoolSlopes = new ItemSlopes_Kaevator(BlockKaevOrangeWoolSlopes.blockID - 256, "OrangeWool").setItemName("ItemKaevOrangeWoolSlopes");
		}else{
			BlockKaevOrangeWoolSlopes = Block.stone;
		}
		
		props.save();		
	}		
	
	public void renderInvBlock(RenderBlocks renderblocks, Block block, int i, int j)
    {
		Tessellator tessellator = Tessellator.instance;
		if(j == SlopesRenderID)
        {		
			if(i/4 == 0)        {
				for(int k = 0; k < 2; k++)
				{
					if(k == 0)
					{
						block.setBlockBounds(0.0F, 0.5F, 0.5F, 1.0F, 1.0F, 1.0F);
					}
					if(k == 1)
					{					
						block.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);                    
					}
					GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
					tessellator.startDrawingQuads();
					tessellator.setNormal(0.0F, -1F, 0.0F);
					renderblocks.renderBottomFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSide(0));
					tessellator.draw();
					tessellator.startDrawingQuads();
					tessellator.setNormal(0.0F, 1.0F, 0.0F);
					renderblocks.renderTopFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSide(1));
					tessellator.draw();
					tessellator.startDrawingQuads();
					tessellator.setNormal(0.0F, 0.0F, -1F);
					renderblocks.renderEastFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSide(2));
					tessellator.draw();
					tessellator.startDrawingQuads();
					tessellator.setNormal(0.0F, 0.0F, 1.0F);
					renderblocks.renderWestFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSide(3));
					tessellator.draw();
					tessellator.startDrawingQuads();
					tessellator.setNormal(-1F, 0.0F, 0.0F);
					renderblocks.renderNorthFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSide(4));
					tessellator.draw();
					tessellator.startDrawingQuads();
					tessellator.setNormal(1.0F, 0.0F, 0.0F);
					renderblocks.renderSouthFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSide(5));
					tessellator.draw();
					GL11.glTranslatef(0.5F, 0.5F, 0.5F);
				}			   
			}            
            else        {
				block.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
			
				GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
				tessellator.startDrawingQuads();
				tessellator.setNormal(0.0F, -1F, 0.0F);
				renderSlopesBottomFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSide(0),i+1,renderblocks,240);
				tessellator.draw();
				tessellator.startDrawingQuads();
				tessellator.setNormal(0.0F, 1.0F, 0.0F);
				renderSlopesTopFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSide(1),i+1,renderblocks,240);
				tessellator.draw();
				tessellator.startDrawingQuads();
				tessellator.setNormal(0.0F, 0.0F, -1F);
				renderSlopesEastFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSide(2),i+1,renderblocks,240);
				tessellator.draw();
				tessellator.startDrawingQuads();
				tessellator.setNormal(0.0F, 0.0F, 1.0F);
				renderSlopesWestFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSide(3),i+1,renderblocks,240);
				tessellator.draw();
				tessellator.startDrawingQuads();
				tessellator.setNormal(-1F, 0.0F, 0.0F);
				renderSlopesNorthFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSide(4),i+1,renderblocks,240);
				tessellator.draw();
				tessellator.startDrawingQuads();
				tessellator.setNormal(1.0F, 0.0F, 0.0F);
				renderSlopesSouthFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSide(5),i+1,renderblocks,240);
				tessellator.draw();
				GL11.glTranslatef(0.5F, 0.5F, 0.5F);			
			}
			block.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        }       
    }	
	
	public boolean renderWorldBlock(RenderBlocks renderblocks, IBlockAccess iblockaccess, int i, int j, int k, Block block, int l)
	{    	
		if(l == SlopesRenderID)
		{
			int l2 = iblockaccess.getBlockMetadata(i, j, k);
			if(l2/4 == 0){
				return renderBlockStairsUp(block, i, j, k, renderblocks, iblockaccess);
			}            
			else{
				return renderBlockSlopes(block, i, j, k, renderblocks, iblockaccess);
			} 	
		}		 
		
        return false;
	}
	
	public boolean 	renderBlockStairsUp(Block block, int i, int j, int k, RenderBlocks renderblocks, IBlockAccess iblockaccess)
    {
        boolean flag = false;
        int l = iblockaccess.getBlockMetadata(i, j, k)%4;
        if(l == 0)
        {            
            block.setBlockBounds(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            renderblocks.renderStandardBlock(block, i, j, k);
			block.setBlockBounds(0.0F, 0.5F, 0.0F, 0.5F, 1.0F, 1.0F);
            renderblocks.renderStandardBlock(block, i, j, k);
        } else
        if(l == 1)
        {            
            block.setBlockBounds(0.5F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
            renderblocks.renderStandardBlock(block, i, j, k);
			block.setBlockBounds(0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 1.0F);
            renderblocks.renderStandardBlock(block, i, j, k);
        } else
        if(l == 2)
        {            
            block.setBlockBounds(0.0F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F);
            renderblocks.renderStandardBlock(block, i, j, k);
			block.setBlockBounds(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 0.5F);
            renderblocks.renderStandardBlock(block, i, j, k);
        } else
        if(l == 3)
        {           
            block.setBlockBounds(0.0F, 0.5F, 0.5F, 1.0F, 1.0F, 1.0F);
            renderblocks.renderStandardBlock(block, i, j, k);
			block.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
            renderblocks.renderStandardBlock(block, i, j, k);
        }
        block.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        return flag;
    }
	
	public boolean renderBlockSlopes(Block block, int i, int j, int k, RenderBlocks renderblocks, IBlockAccess iblockaccess)
    {
		int iDir =  iblockaccess.getBlockMetadata(i, j, k);
        int l = block.colorMultiplier(iblockaccess, i, j, k);
        float f = (float)(l >> 16 & 0xff) / 255F;
        float f1 = (float)(l >> 8 & 0xff) / 255F;
        float f2 = (float)(l & 0xff) / 255F;
		
		if(Minecraft.isAmbientOcclusionEnabled())
        {
            return renderSlopesBlockWithAmbientOcclusion(block, i, j, k, f, f1, f2, iDir, renderblocks, iblockaccess);
        } else
        {
            return renderSlopesBlockWithColorMultiplier(block, i, j, k, f, f1, f2, iDir, renderblocks, iblockaccess);
        }		
    }
	
	public boolean renderSlopesBlockWithAmbientOcclusion(Block block, int i, int j, int k, float f, float f1, float f2, int iDir, RenderBlocks renderblocks, IBlockAccess iblockaccess)
    {
        enableAO = true;
        boolean flag = false;
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = true;
        boolean flag4 = true;
        boolean flag5 = true;
        boolean flag6 = true;
		
        aoLightValueThis = block.getAmbientOcclusionLightValue(iblockaccess, i, j, k);
        aoLightValueXNeg = block.getAmbientOcclusionLightValue(iblockaccess, i - 1, j, k);
        aoLightValueYNeg = block.getAmbientOcclusionLightValue(iblockaccess, i, j - 1, k);
        aoLightValueZNeg = block.getAmbientOcclusionLightValue(iblockaccess, i, j, k - 1);
        aoLightValueXPos = block.getAmbientOcclusionLightValue(iblockaccess, i + 1, j, k);
        aoLightValueYPos = block.getAmbientOcclusionLightValue(iblockaccess, i, j + 1, k);
        aoLightValueZPos = block.getAmbientOcclusionLightValue(iblockaccess, i, j, k + 1);
		
		aoLightValueXPosYPos = block.getAmbientOcclusionLightValue(iblockaccess, i + 1, j + 1, k);
		aoLightValueXPosYNeg = block.getAmbientOcclusionLightValue(iblockaccess, i + 1, j - 1, k);
		aoLightValueXPosZPos = block.getAmbientOcclusionLightValue(iblockaccess, i + 1, j, k + 1);
		aoLightValueXPosZNeg = block.getAmbientOcclusionLightValue(iblockaccess, i + 1, j, k - 1);
		aoLightValueXNegYPos = block.getAmbientOcclusionLightValue(iblockaccess, i - 1, j + 1, k);
		aoLightValueXNegYNeg = block.getAmbientOcclusionLightValue(iblockaccess, i - 1, j - 1, k);
		aoLightValueXNegZNeg = block.getAmbientOcclusionLightValue(iblockaccess, i - 1, j, k - 1);	
		aoLightValueXNegZPos = block.getAmbientOcclusionLightValue(iblockaccess, i - 1, j, k + 1);
		aoLightValueYPosZPos = block.getAmbientOcclusionLightValue(iblockaccess, i, j + 1, k + 1);
		aoLightValueYPosZNeg = block.getAmbientOcclusionLightValue(iblockaccess, i, j + 1, k - 1);
		aoLightValueYNegZPos = block.getAmbientOcclusionLightValue(iblockaccess, i, j - 1, k + 1);
		aoLightValueYNegZNeg = block.getAmbientOcclusionLightValue(iblockaccess, i, j - 1, k - 1);			
			
		aoLightValueXPosYPosZPos = block.getAmbientOcclusionLightValue(iblockaccess, i + 1, j + 1, k + 1);
		aoLightValueXPosYNegZPos = block.getAmbientOcclusionLightValue(iblockaccess, i + 1, j - 1, k + 1);
		aoLightValueXPosYPosZNeg = block.getAmbientOcclusionLightValue(iblockaccess, i + 1, j + 1, k - 1);
		aoLightValueXPosYNegZNeg = block.getAmbientOcclusionLightValue(iblockaccess, i + 1, j - 1, k - 1);
		aoLightValueXNegYPosZPos = block.getAmbientOcclusionLightValue(iblockaccess, i - 1, j + 1, k + 1);
		aoLightValueXNegYNegZPos = block.getAmbientOcclusionLightValue(iblockaccess, i - 1, j - 1, k + 1);
		aoLightValueXNegYPosZNeg = block.getAmbientOcclusionLightValue(iblockaccess, i - 1, j + 1, k - 1);
		aoLightValueXNegYNegZNeg = block.getAmbientOcclusionLightValue(iblockaccess, i - 1, j - 1, k - 1);		
		
        if(block.blockIndexInTexture == 3)
        {
            flag1 = flag3 = flag4 = flag5 = flag6 = false;
        }
        
		///////////////////////////////////
		float f7;
		float f13;
		float f19;
		float f25;
		if(field_22352_G > 0)
		{						
			f7 = (aoLightValueXNegYNegZPos + aoLightValueXNegYNeg + aoLightValueYNegZPos + aoLightValueYNeg) / 4F;
			f25 = (aoLightValueYNegZPos + aoLightValueYNeg + aoLightValueXPosYNegZPos + aoLightValueXPosYNeg) / 4F;
			f19 = (aoLightValueYNeg + aoLightValueYNegZNeg + aoLightValueXPosYNeg + aoLightValueXPosYNegZNeg) / 4F;
			f13 = (aoLightValueXNegYNeg + aoLightValueXNegYNegZNeg + aoLightValueYNeg + aoLightValueYNegZNeg) / 4F;
		} else
		{
			f7 = f13 = f19 = f25 = aoLightValueYNeg;
		}
		colorRedTopLeft_BottomFace = colorRedBottomLeft_BottomFace = colorRedBottomRight_BottomFace = colorRedTopRight_BottomFace = (flag1 ? f : 1.0F) * 0.5F;
		colorGreenTopLeft_BottomFace = colorGreenBottomLeft_BottomFace = colorGreenBottomRight_BottomFace = colorGreenTopRight_BottomFace = (flag1 ? f1 : 1.0F) * 0.5F;
		colorBlueTopLeft_BottomFace = colorBlueBottomLeft_BottomFace = colorBlueBottomRight_BottomFace = colorBlueTopRight_BottomFace = (flag1 ? f2 : 1.0F) * 0.5F;
		colorRedTopLeft_BottomFace *= f7;
		colorGreenTopLeft_BottomFace *= f7;
		colorBlueTopLeft_BottomFace *= f7;
		colorRedBottomLeft_BottomFace *= f13;
		colorGreenBottomLeft_BottomFace *= f13;
		colorBlueBottomLeft_BottomFace *= f13;
		colorRedBottomRight_BottomFace *= f19;
		colorGreenBottomRight_BottomFace *= f19;
		colorBlueBottomRight_BottomFace *= f19;
		colorRedTopRight_BottomFace *= f25;
		colorGreenTopRight_BottomFace *= f25;
		colorBlueTopRight_BottomFace *= f25;
		
		///////////////////////////////////	
		float f8;
		float f14;
		float f20;
		float f26;
		if(field_22352_G > 0)
		{				
			f26 = (aoLightValueXNegYPosZPos + aoLightValueXNegYPos + aoLightValueYPosZPos + aoLightValueYPos) / 4F;
			f8 = (aoLightValueYPosZPos + aoLightValueYPos + aoLightValueXPosYPosZPos + aoLightValueXPosYPos) / 4F;
			f14 = (aoLightValueYPos + aoLightValueYPosZNeg + aoLightValueXPosYPos + aoLightValueXPosYPosZNeg) / 4F;
			f20 = (aoLightValueXNegYPos + aoLightValueXNegYPosZNeg + aoLightValueYPos + aoLightValueYPosZNeg) / 4F;
		} else
		{
			f8 = f14 = f20 = f26 = aoLightValueYPos;
		}
		colorRedTopLeft_TopFace = colorRedBottomLeft_TopFace = colorRedBottomRight_TopFace = colorRedTopRight_TopFace = flag2 ? f : 1.0F;
		colorGreenTopLeft_TopFace = colorGreenBottomLeft_TopFace = colorGreenBottomRight_TopFace = colorGreenTopRight_TopFace = flag2 ? f1 : 1.0F;
		colorBlueTopLeft_TopFace = colorBlueBottomLeft_TopFace = colorBlueBottomRight_TopFace = colorBlueTopRight_TopFace = flag2 ? f2 : 1.0F;
		colorRedTopLeft_TopFace *= f8;
		colorGreenTopLeft_TopFace *= f8;
		colorBlueTopLeft_TopFace *= f8;
		colorRedBottomLeft_TopFace *= f14;
		colorGreenBottomLeft_TopFace *= f14;
		colorBlueBottomLeft_TopFace *= f14;
		colorRedBottomRight_TopFace *= f20;
		colorGreenBottomRight_TopFace *= f20;
		colorBlueBottomRight_TopFace *= f20;
		colorRedTopRight_TopFace *= f26;
		colorGreenTopRight_TopFace *= f26;
		colorBlueTopRight_TopFace *= f26;
		
		///////////////////////////////////	
		float f9;
		float f15;
		float f21;
		float f27;
		if(field_22352_G > 0)
		{				
			f9 = (aoLightValueXNegZNeg + aoLightValueXNegYPosZNeg + aoLightValueZNeg + aoLightValueYPosZNeg) / 4F;
			f15 = (aoLightValueZNeg + aoLightValueYPosZNeg + aoLightValueXPosZNeg + aoLightValueXPosYPosZNeg) / 4F;
			f21 = (aoLightValueYNegZNeg + aoLightValueZNeg + aoLightValueXPosYNegZNeg + aoLightValueXPosZNeg) / 4F;
			f27 = (aoLightValueXNegYNegZNeg + aoLightValueXNegZNeg + aoLightValueYNegZNeg + aoLightValueZNeg) / 4F;
		} else
		{
			f9 = f15 = f21 = f27 = aoLightValueZNeg;
		}
		colorRedTopLeft_EastFace = colorRedBottomLeft_EastFace = colorRedBottomRight_EastFace = colorRedTopRight_EastFace = (flag3 ? f : 1.0F) * 0.8F;
		colorGreenTopLeft_EastFace = colorGreenBottomLeft_EastFace = colorGreenBottomRight_EastFace = colorGreenTopRight_EastFace = (flag3 ? f1 : 1.0F) * 0.8F;
		colorBlueTopLeft_EastFace = colorBlueBottomLeft_EastFace = colorBlueBottomRight_EastFace = colorBlueTopRight_EastFace = (flag3 ? f2 : 1.0F) * 0.8F;
		colorRedTopLeft_EastFace *= f9;
		colorGreenTopLeft_EastFace *= f9;
		colorBlueTopLeft_EastFace *= f9;
		colorRedBottomLeft_EastFace *= f15;
		colorGreenBottomLeft_EastFace *= f15;
		colorBlueBottomLeft_EastFace *= f15;
		colorRedBottomRight_EastFace *= f21;
		colorGreenBottomRight_EastFace *= f21;
		colorBlueBottomRight_EastFace *= f21;
		colorRedTopRight_EastFace *= f27;
		colorGreenTopRight_EastFace *= f27;
		colorBlueTopRight_EastFace *= f27;
		int l = block.getBlockTexture(iblockaccess, i, j, k, 2);
		
		///////////////////////////////////
		float f10;
		float f16;
		float f22;
		float f28;
		if(field_22352_G > 0)
		{				
			f10 = (aoLightValueXNegZPos + aoLightValueXNegYPosZPos + aoLightValueZPos + aoLightValueYPosZPos) / 4F;
			f28 = (aoLightValueZPos + aoLightValueYPosZPos + aoLightValueXPosZPos + aoLightValueXPosYPosZPos) / 4F;
			f22 = (aoLightValueYNegZPos + aoLightValueZPos + aoLightValueXPosYNegZPos + aoLightValueXPosZPos) / 4F;
			f16 = (aoLightValueXNegYNegZPos + aoLightValueXNegZPos + aoLightValueYNegZPos + aoLightValueZPos) / 4F;
		} else
		{
			f10 = f16 = f22 = f28 = aoLightValueZPos;
		}
		colorRedTopLeft_WestFace = colorRedBottomLeft_WestFace = colorRedBottomRight_WestFace = colorRedTopRight_WestFace = (flag4 ? f : 1.0F) * 0.8F;
		colorGreenTopLeft_WestFace = colorGreenBottomLeft_WestFace = colorGreenBottomRight_WestFace = colorGreenTopRight_WestFace = (flag4 ? f1 : 1.0F) * 0.8F;
		colorBlueTopLeft_WestFace = colorBlueBottomLeft_WestFace = colorBlueBottomRight_WestFace = colorBlueTopRight_WestFace = (flag4 ? f2 : 1.0F) * 0.8F;
		colorRedTopLeft_WestFace *= f10;
		colorGreenTopLeft_WestFace *= f10;
		colorBlueTopLeft_WestFace *= f10;
		colorRedBottomLeft_WestFace *= f16;
		colorGreenBottomLeft_WestFace *= f16;
		colorBlueBottomLeft_WestFace *= f16;
		colorRedBottomRight_WestFace *= f22;
		colorGreenBottomRight_WestFace *= f22;
		colorBlueBottomRight_WestFace *= f22;
		colorRedTopRight_WestFace *= f28;
		colorGreenTopRight_WestFace *= f28;
		colorBlueTopRight_WestFace *= f28;
		int i1 = block.getBlockTexture(iblockaccess, i, j, k, 3);
		
		///////////////////////////////////
		float f11;
		float f17;
		float f23;
		float f29;
		if(field_22352_G > 0)
		{				
			f29 = (aoLightValueXNegYNeg + aoLightValueXNegYNegZPos + aoLightValueXNeg + aoLightValueXNegZPos) / 4F;
			f11 = (aoLightValueXNeg + aoLightValueXNegZPos + aoLightValueXNegYPos + aoLightValueXNegYPosZPos) / 4F;
			f17 = (aoLightValueXNegZNeg + aoLightValueXNeg + aoLightValueXNegYPosZNeg + aoLightValueXNegYPos) / 4F;
			f23 = (aoLightValueXNegYNegZNeg + aoLightValueXNegYNeg + aoLightValueXNegZNeg + aoLightValueXNeg) / 4F;
		} else
		{
			f11 = f17 = f23 = f29 = aoLightValueXNeg;
		}
		colorRedTopLeft_NorthFace = colorRedBottomLeft_NorthFace = colorRedBottomRight_NorthFace = colorRedTopRight_NorthFace = (flag5 ? f : 1.0F) * 0.6F;
		colorGreenTopLeft_NorthFace = colorGreenBottomLeft_NorthFace = colorGreenBottomRight_NorthFace = colorGreenTopRight_NorthFace = (flag5 ? f1 : 1.0F) * 0.6F;
		colorBlueTopLeft_NorthFace = colorBlueBottomLeft_NorthFace = colorBlueBottomRight_NorthFace = colorBlueTopRight_NorthFace = (flag5 ? f2 : 1.0F) * 0.6F;
		colorRedTopLeft_NorthFace *= f11;
		colorGreenTopLeft_NorthFace *= f11;
		colorBlueTopLeft_NorthFace *= f11;
		colorRedBottomLeft_NorthFace *= f17;
		colorGreenBottomLeft_NorthFace *= f17;
		colorBlueBottomLeft_NorthFace *= f17;
		colorRedBottomRight_NorthFace *= f23;
		colorGreenBottomRight_NorthFace *= f23;
		colorBlueBottomRight_NorthFace *= f23;
		colorRedTopRight_NorthFace *= f29;
		colorGreenTopRight_NorthFace *= f29;
		colorBlueTopRight_NorthFace *= f29;
		int j1 = block.getBlockTexture(iblockaccess, i, j, k, 4);
		
		///////////////////////////////////	
		float f12;
		float f18;
		float f24;
		float f30;
		if(field_22352_G > 0)
		{						
			f12 = (aoLightValueXPosYNeg + aoLightValueXPosYNegZPos + aoLightValueXPos + aoLightValueXPosZPos) / 4F;
			f30 = (aoLightValueXPos + aoLightValueXPosZPos + aoLightValueXPosYPos + aoLightValueXPosYPosZPos) / 4F;
			f24 = (aoLightValueXPosZNeg + aoLightValueXPos + aoLightValueXPosYPosZNeg + aoLightValueXPosYPos) / 4F;
			f18 = (aoLightValueXPosYNegZNeg + aoLightValueXPosYNeg + aoLightValueXPosZNeg + aoLightValueXPos) / 4F;
		} else
		{
			f12 = f18 = f24 = f30 = aoLightValueXPos;
		}
		colorRedTopLeft_SouthFace = colorRedBottomLeft_SouthFace = colorRedBottomRight_SouthFace = colorRedTopRight_SouthFace = (flag6 ? f : 1.0F) * 0.6F;
		colorGreenTopLeft_SouthFace = colorGreenBottomLeft_SouthFace = colorGreenBottomRight_SouthFace = colorGreenTopRight_SouthFace = (flag6 ? f1 : 1.0F) * 0.6F;
		colorBlueTopLeft_SouthFace = colorBlueBottomLeft_SouthFace = colorBlueBottomRight_SouthFace = colorBlueTopRight_SouthFace = (flag6 ? f2 : 1.0F) * 0.6F;
		colorRedTopLeft_SouthFace *= f12;
		colorGreenTopLeft_SouthFace *= f12;
		colorBlueTopLeft_SouthFace *= f12;
		colorRedBottomLeft_SouthFace *= f18;
		colorGreenBottomLeft_SouthFace *= f18;
		colorBlueBottomLeft_SouthFace *= f18;
		colorRedBottomRight_SouthFace *= f24;
		colorGreenBottomRight_SouthFace *= f24;
		colorBlueBottomRight_SouthFace *= f24;
		colorRedTopRight_SouthFace *= f30;
		colorGreenTopRight_SouthFace *= f30;
		colorBlueTopRight_SouthFace *= f30;
		int k1 = block.getBlockTexture(iblockaccess, i, j, k, 5);
		
		/////////////////////////////////////////SUPERSLOPES//////////////////////////////
		
		colorRedSlopes = f;
		colorGreenSlopes = f1;
		colorBlueSlopes = f2;			
        
		/////////////////////////////////////////
		
		if(renderblocks.renderAllFaces || block.shouldSideBeRendered(iblockaccess, i, j - 1, k, 0))
        {
			renderSlopesBottomFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 0),iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));			
            flag = true;
		}
		if(renderblocks.renderAllFaces || block.shouldSideBeRendered(iblockaccess, i, j + 1, k, 1))
        {
			renderSlopesTopFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 0),iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
            flag = true;
		}
		if(renderblocks.renderAllFaces || block.shouldSideBeRendered(iblockaccess, i, j, k - 1, 2))
        {
			renderSlopesEastFace(block, i, j, k, l, iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
			if(field_27511_cfgGrassFix && l == 3)
            {
                colorRedTopLeft_EastFace *= f;
                colorRedBottomLeft_EastFace *= f;
                colorRedBottomRight_EastFace *= f;
                colorRedTopRight_EastFace *= f;
                colorGreenTopLeft_EastFace *= f1;
                colorGreenBottomLeft_EastFace *= f1;
                colorGreenBottomRight_EastFace *= f1;
                colorGreenTopRight_EastFace *= f1;
                colorBlueTopLeft_EastFace *= f2;
                colorBlueBottomLeft_EastFace *= f2;
                colorBlueBottomRight_EastFace *= f2;
                colorBlueTopRight_EastFace *= f2;
                renderSlopesEastFace(block, i, j, k, 38, iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
            }    
			flag = true;
		}		
		if(renderblocks.renderAllFaces || block.shouldSideBeRendered(iblockaccess, i, j, k + 1, 3))
        {
			renderSlopesWestFace(block, i, j, k, i1, iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
            if(field_27511_cfgGrassFix && i1 == 3)
            {
                colorRedTopLeft_WestFace *= f;
                colorRedBottomLeft_WestFace *= f;
                colorRedBottomRight_WestFace *= f;
                colorRedTopRight_WestFace *= f;
                colorGreenTopLeft_WestFace *= f1;
                colorGreenBottomLeft_WestFace *= f1;
                colorGreenBottomRight_WestFace *= f1;
                colorGreenTopRight_WestFace *= f1;
                colorBlueTopLeft_WestFace *= f2;
                colorBlueBottomLeft_WestFace *= f2;
                colorBlueBottomRight_WestFace *= f2;
                colorBlueTopRight_WestFace *= f2;
                renderSlopesWestFace(block, i, j, k, 38, iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
            }
            flag = true;
        }
		if(renderblocks.renderAllFaces || block.shouldSideBeRendered(iblockaccess, i - 1, j, k, 4))
        {
			renderSlopesNorthFace(block, i, j, k, j1, iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
			if(field_27511_cfgGrassFix && j1 == 3)
            {
                colorRedTopLeft_NorthFace *= f;
                colorRedBottomLeft_NorthFace *= f;
                colorRedBottomRight_NorthFace *= f;
                colorRedTopRight_NorthFace *= f;
                colorGreenTopLeft_NorthFace *= f1;
                colorGreenBottomLeft_NorthFace *= f1;
                colorGreenBottomRight_NorthFace *= f1;
                colorGreenTopRight_NorthFace *= f1;
                colorBlueTopLeft_NorthFace *= f2;
                colorBlueBottomLeft_NorthFace *= f2;
                colorBlueBottomRight_NorthFace *= f2;
                colorBlueTopRight_NorthFace *= f2;
                renderSlopesNorthFace(block, i, j, k, 38, iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
            }
            flag = true;
        }
		if(renderblocks.renderAllFaces || block.shouldSideBeRendered(iblockaccess, i + 1, j, k, 5))
        {
			renderSlopesSouthFace(block, i, j, k, k1, iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
            if(field_27511_cfgGrassFix && k1 == 3)
            {
                colorRedTopLeft_SouthFace *= f;
                colorRedBottomLeft_SouthFace *= f;
                colorRedBottomRight_SouthFace *= f;
                colorRedTopRight_SouthFace *= f;
                colorGreenTopLeft_SouthFace *= f1;
                colorGreenBottomLeft_SouthFace *= f1;
                colorGreenBottomRight_SouthFace *= f1;
                colorGreenTopRight_SouthFace *= f1;
                colorBlueTopLeft_SouthFace *= f2;
                colorBlueBottomLeft_SouthFace *= f2;
                colorBlueBottomRight_SouthFace *= f2;
                colorBlueTopRight_SouthFace *= f2;
                renderSlopesSouthFace(block, i, j, k, 38, iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
            }
            flag = true;
        }	
		
        enableAO = false;
        return flag;
    }

    public boolean renderSlopesBlockWithColorMultiplier(Block block, int i, int j, int k, float f, float f1, float f2, int iDir, RenderBlocks renderblocks, IBlockAccess iblockaccess)
    {
        Tessellator tessellator = Tessellator.instance;        
        boolean flag = false;
        float f3 = 0.5F;
        float f4 = 1.0F;
        float f5 = 0.8F;
        float f6 = 0.6F;
        float f7 = f4 * f;
        float f8 = f4 * f1;
        float f9 = f4 * f2;
        if(block == Block.grass)
        {
            f = f1 = f2 = 1.0F;
        }
        float f10 = f3 * f;
        float f11 = f5 * f;
        float f12 = f6 * f;
        float f13 = f3 * f1;
        float f14 = f5 * f1;
        float f15 = f6 * f1;
        float f16 = f3 * f2;
        float f17 = f5 * f2;
        float f18 = f6 * f2;
        float f19 = block.getAmbientOcclusionLightValue(iblockaccess, i, j, k);			
		
		if(renderblocks.renderAllFaces || block.shouldSideBeRendered(iblockaccess, i, j - 1, k, 0))
        {
			if(iDir/4 != 2){
				float f20 = block.getAmbientOcclusionLightValue(iblockaccess, i, j - 1, k);
				tessellator.setColorOpaque_F(f10 * f20, f13 * f20, f16 * f20);
				renderSlopesBottomFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 0),iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
				flag = true;
			}
        }
		
		if(renderblocks.renderAllFaces || block.shouldSideBeRendered(iblockaccess, i, j + 1, k, 1))
        {
			if(iDir/4 != 1){
				float f21 = block.getAmbientOcclusionLightValue(iblockaccess, i, j + 1, k);
				if(block.maxY != 1.0D && !block.blockMaterial.isLiquid())
				{
					f21 = f19;
				}
				tessellator.setColorOpaque_F(f7 * f21, f8 * f21, f9 * f21);
				renderSlopesTopFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 1),iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
				flag = true;
			}
        }        
       
        if(renderblocks.renderAllFaces || block.shouldSideBeRendered(iblockaccess, i, j, k - 1, 2) || iDir == 6 || iDir == 10 || iDir == 12)
        {		
			if(iDir == 6){                          
				float f22 = f19;
				tessellator.setColorOpaque_F(f11 * f22, f14 * f22, f17 * f22);	
				renderSlopesEastFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 1),iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
			}else
			if(iDir == 10){ 
                float f22 = f19;           
				tessellator.setColorOpaque_F(f11 * f22, f14 * f22, f17 * f22);	
				renderSlopesEastFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 0), iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
			}else
			if(iDir == 12){ 
                float f22 = f19;					
				tessellator.setColorOpaque_F(f11 * f22, f14 * f22, f17 * f22);		
				renderSlopesEastFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 2), iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));	
			}
			else{
				float f22 = block.getAmbientOcclusionLightValue(iblockaccess, i, j, k - 1);
				tessellator.setColorOpaque_F(f11 * f22, f14 * f22, f17 * f22);		
				renderSlopesEastFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 2), iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
			}
            flag = true;
        }
        if(renderblocks.renderAllFaces || block.shouldSideBeRendered(iblockaccess, i, j, k + 1, 3) || iDir == 7 || iDir == 11 || iDir == 13)
        {
			if(iDir == 7){ 
                float f23 =  f19;
				tessellator.setColorOpaque_F(f11 * f23, f14 * f23, f17 * f23);
				renderSlopesWestFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 1), iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
			}else
			if(iDir == 11){ 
                float f23 = f19;           
				tessellator.setColorOpaque_F(f11 * f23, f14 * f23, f17 * f23);
				renderSlopesWestFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 0), iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
			}else
			if(iDir == 13)
            {
                float f23 = f19;            		
				tessellator.setColorOpaque_F(f11 * f23, f14 * f23, f17 * f23);
				renderSlopesWestFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 3), iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
			}
			else{
				float f23 = block.getAmbientOcclusionLightValue(iblockaccess, i, j, k + 1);
				tessellator.setColorOpaque_F(f11 * f23, f14 * f23, f17 * f23);
				renderSlopesWestFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 3), iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
			}           
            flag = true;
        }
        if(renderblocks.renderAllFaces || block.shouldSideBeRendered(iblockaccess, i - 1, j, k, 4) || iDir == 4 || iDir == 8 || iDir == 15)
        {
			if(iDir == 4){ 
                float f24 =  f19;
				tessellator.setColorOpaque_F(f12 * f24, f15 * f24, f18 * f24);
				renderSlopesNorthFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 1), iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
			}else
			if(iDir == 8){ 
                float f24 = f19;           
				tessellator.setColorOpaque_F(f12 * f24, f15 * f24, f18 * f24);
				 renderSlopesNorthFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 0), iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
			}else
			if(iDir == 15){ 
                float f24 = f19;           
				tessellator.setColorOpaque_F(f12 * f24, f15 * f24, f18 * f24);
				 renderSlopesNorthFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 4), iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
			}
			else{
				float f24 = block.getAmbientOcclusionLightValue(iblockaccess, i - 1, j, k);
				tessellator.setColorOpaque_F(f12 * f24, f15 * f24, f18 * f24);
				renderSlopesNorthFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 4), iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
			}           
            flag = true;            
        }
        if(renderblocks.renderAllFaces || block.shouldSideBeRendered(iblockaccess, i + 1, j, k, 5) || iDir == 5 || iDir == 9 || iDir == 14)
        {
			if(iDir == 5){ 
                float f25 =  f19;
				tessellator.setColorOpaque_F(f12 * f25, f15 * f25, f18 * f25);
				renderSlopesSouthFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 1), iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
			}else
			if(iDir == 9){ 
                float f25 = f19;           
				tessellator.setColorOpaque_F(f12 * f25, f15 * f25, f18 * f25);
				renderSlopesSouthFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 0), iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
			}else
			if(iDir == 14){ 
                float f25 = f19;           
				tessellator.setColorOpaque_F(f12 * f25, f15 * f25, f18 * f25);
				renderSlopesSouthFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 5), iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
			}
			else{
				float f25 = block.getAmbientOcclusionLightValue(iblockaccess, i + 1, j, k);
				 tessellator.setColorOpaque_F(f12 * f25, f15 * f25, f18 * f25);
				renderSlopesSouthFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 5), iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
			}
            flag = true;
        }
        return flag;
    }		
	
	public void renderSlopesBottomFace(Block block, double xLoc, double yLoc, double zLoc, 
            int i, int iDir, RenderBlocks renderblocks, int lBrightness)
    {
        Tessellator tessellator = Tessellator.instance;
        tessellator.setBrightness(lBrightness);
        if(renderblocks.overrideBlockTexture >= 0)
        {
            i = renderblocks.overrideBlockTexture;
        }
        int j = (i & 0xf) << 4;
        int k = i & 0xf0;
        double d3 = ((double)j + block.minX * 16D) / 256D;
        double d4 = (((double)j + block.maxX * 16D) - 0.01D) / 256D;
        double d5 = ((double)k + block.minZ * 16D) / 256D;
        double d6 = (((double)k + block.maxZ * 16D) - 0.01D) / 256D;
        if(block.minX < 0.0D || block.maxX > 1.0D)
        {
            d3 = ((float)j + 0.0F) / 256F;
            d4 = ((float)j + 15.99F) / 256F;
        }
        if(block.minZ < 0.0D || block.maxZ > 1.0D)
        {
            d5 = ((float)k + 0.0F) / 256F;
            d6 = ((float)k + 15.99F) / 256F;
        }
        double xBot = xLoc + block.minX;
        double xTop = xLoc + block.maxX;
        double yBot = yLoc + block.minY;
        double zBot = zLoc + block.minZ;
        double zTop = zLoc + block.maxZ;       
		if(enableAO)
        {
			if(iDir == 4 || iDir == 5 || iDir == 6 || iDir == 7){
				// Standard
				tessellator.setColorOpaque_F(colorRedTopLeft_BottomFace, colorGreenTopLeft_BottomFace, colorBlueTopLeft_BottomFace);
				tessellator.addVertexWithUV(xBot, yBot, zTop, d3, d6);
				tessellator.setColorOpaque_F(colorRedBottomLeft_BottomFace, colorGreenBottomLeft_BottomFace, colorBlueBottomLeft_BottomFace);
				tessellator.addVertexWithUV(xBot, yBot, zBot, d3, d5);
				tessellator.setColorOpaque_F(colorRedBottomRight_BottomFace, colorGreenBottomRight_BottomFace, colorBlueBottomRight_BottomFace);
				tessellator.addVertexWithUV(xTop, yBot, zBot, d4, d5);
				tessellator.setColorOpaque_F(colorRedTopRight_BottomFace, colorGreenTopRight_BottomFace, colorBlueTopRight_BottomFace);
				tessellator.addVertexWithUV(xTop, yBot, zTop, d4, d6);
			} else
			if(iDir == 12){
				// Pointing South-West
				tessellator.setColorOpaque_F(colorRedTopLeft_BottomFace, colorGreenTopLeft_BottomFace, colorBlueTopLeft_BottomFace);
				tessellator.addVertexWithUV(xBot, yBot, zTop, d3, d6);
				tessellator.setColorOpaque_F(colorRedBottomRight_BottomFace, colorGreenBottomRight_BottomFace, colorBlueBottomRight_BottomFace);
				tessellator.addVertexWithUV(xTop, yBot, zBot, d4, d5);
				tessellator.setColorOpaque_F(colorRedBottomRight_BottomFace, colorGreenBottomRight_BottomFace, colorBlueBottomRight_BottomFace);
				tessellator.addVertexWithUV(xTop, yBot, zBot, d4, d5);
				tessellator.setColorOpaque_F(colorRedTopRight_BottomFace, colorGreenTopRight_BottomFace, colorBlueTopRight_BottomFace);
				tessellator.addVertexWithUV(xTop, yBot, zTop, d4, d6);	
			} else	
			if(iDir == 13){
				// Pointing North-East
				tessellator.setColorOpaque_F(colorRedTopLeft_BottomFace, colorGreenTopLeft_BottomFace, colorBlueTopLeft_BottomFace);
				tessellator.addVertexWithUV(xBot, yBot, zTop, d3, d6);
				tessellator.setColorOpaque_F(colorRedBottomLeft_BottomFace, colorGreenBottomLeft_BottomFace, colorBlueBottomLeft_BottomFace);
				tessellator.addVertexWithUV(xBot, yBot, zBot, d3, d5);
				tessellator.setColorOpaque_F(colorRedBottomRight_BottomFace, colorGreenBottomRight_BottomFace, colorBlueBottomRight_BottomFace);
				tessellator.addVertexWithUV(xTop, yBot, zBot, d4, d5);
				tessellator.setColorOpaque_F(colorRedTopLeft_BottomFace, colorGreenTopLeft_BottomFace, colorBlueTopLeft_BottomFace);
				tessellator.addVertexWithUV(xBot, yBot, zTop, d3, d6);				
			} else	
			if(iDir == 14){
				// Pointing North-West
				tessellator.setColorOpaque_F(colorRedTopLeft_BottomFace, colorGreenTopLeft_BottomFace, colorBlueTopLeft_BottomFace);
				tessellator.addVertexWithUV(xBot, yBot, zTop, d3, d6);
				tessellator.setColorOpaque_F(colorRedBottomLeft_BottomFace, colorGreenBottomLeft_BottomFace, colorBlueBottomLeft_BottomFace);
				tessellator.addVertexWithUV(xBot, yBot, zBot, d3, d5);
				tessellator.setColorOpaque_F(colorRedTopRight_BottomFace, colorGreenTopRight_BottomFace, colorBlueTopRight_BottomFace);
				tessellator.addVertexWithUV(xTop, yBot, zTop, d4, d6);
				tessellator.setColorOpaque_F(colorRedTopRight_BottomFace, colorGreenTopRight_BottomFace, colorBlueTopRight_BottomFace);
				tessellator.addVertexWithUV(xTop, yBot, zTop, d4, d6);		
			} else		
			if(iDir == 15){
				// Pointing South-East
				tessellator.setColorOpaque_F(colorRedBottomLeft_BottomFace, colorGreenBottomLeft_BottomFace, colorBlueBottomLeft_BottomFace);
				tessellator.addVertexWithUV(xBot, yBot, zBot, d3, d5);
				tessellator.setColorOpaque_F(colorRedBottomLeft_BottomFace, colorGreenBottomLeft_BottomFace, colorBlueBottomLeft_BottomFace);
				tessellator.addVertexWithUV(xBot, yBot, zBot, d3, d5);
				tessellator.setColorOpaque_F(colorRedBottomRight_BottomFace, colorGreenBottomRight_BottomFace, colorBlueBottomRight_BottomFace);
				tessellator.addVertexWithUV(xTop, yBot, zBot, d4, d5);
				tessellator.setColorOpaque_F(colorRedTopRight_BottomFace, colorGreenTopRight_BottomFace, colorBlueTopRight_BottomFace);
				tessellator.addVertexWithUV(xTop, yBot, zTop, d4, d6);			
			}
		} else
		{
			if(iDir == 4 || iDir == 5 || iDir == 6 || iDir == 7){
				// Standard
				tessellator.addVertexWithUV(xBot, yBot, zTop, d3, d6);
				tessellator.addVertexWithUV(xBot, yBot, zBot, d3, d5);
				tessellator.addVertexWithUV(xTop, yBot, zBot, d4, d5);
				tessellator.addVertexWithUV(xTop, yBot, zTop, d4, d6);
			} else
			if(iDir == 12){
				// Pointing South-West
				tessellator.addVertexWithUV(xBot, yBot, zTop, d3, d6);
				tessellator.addVertexWithUV(xTop, yBot, zBot, d4, d5);
				tessellator.addVertexWithUV(xTop, yBot, zBot, d4, d5);
				tessellator.addVertexWithUV(xTop, yBot, zTop, d4, d6);	
			} else	
			if(iDir == 13){
				// Pointing North-East
				tessellator.addVertexWithUV(xBot, yBot, zTop, d3, d6);
				tessellator.addVertexWithUV(xBot, yBot, zBot, d3, d5);
				tessellator.addVertexWithUV(xTop, yBot, zBot, d4, d5);
				tessellator.addVertexWithUV(xBot, yBot, zTop, d3, d6);				
			} else	
			if(iDir == 14){
				// Pointing North-West
				tessellator.addVertexWithUV(xBot, yBot, zTop, d3, d6);
				tessellator.addVertexWithUV(xBot, yBot, zBot, d3, d5);
				tessellator.addVertexWithUV(xTop, yBot, zTop, d4, d6);
				tessellator.addVertexWithUV(xTop, yBot, zTop, d4, d6);		
			} else		
			if(iDir == 15){
				// Pointing South-East
				tessellator.addVertexWithUV(xBot, yBot, zBot, d3, d5);
				tessellator.addVertexWithUV(xBot, yBot, zBot, d3, d5);
				tessellator.addVertexWithUV(xTop, yBot, zBot, d4, d5);
				tessellator.addVertexWithUV(xTop, yBot, zTop, d4, d6);			
			}		
		}
    }

	public void renderSlopesTopFace(Block block, double d, double d1, double d2, 
            int i, int iDir, RenderBlocks renderblocks, int lBrightness)
    {
        Tessellator tessellator = Tessellator.instance;
        tessellator.setBrightness(lBrightness);
        if(renderblocks.overrideBlockTexture >= 0)
        {
            i = renderblocks.overrideBlockTexture;
        }
        int j = (i & 0xf) << 4;
        int k = i & 0xf0;
        double d3 = ((double)j + block.minX * 16D) / 256D;
        double d4 = (((double)j + block.maxX * 16D) - 0.01D) / 256D;
        double d5 = ((double)k + block.minZ * 16D) / 256D;
        double d6 = (((double)k + block.maxZ * 16D) - 0.01D) / 256D;
        if(block.minX < 0.0D || block.maxX > 1.0D)
        {
            d3 = ((float)j + 0.0F) / 256F;
            d4 = ((float)j + 15.99F) / 256F;
        }
        if(block.minZ < 0.0D || block.maxZ > 1.0D)
        {
            d5 = ((float)k + 0.0F) / 256F;
            d6 = ((float)k + 15.99F) / 256F;
        }
        double d7 = d + block.minX;
        double d8 = d + block.maxX;
        double d9 = d1 + block.maxY;
        double d10 = d2 + block.minZ;
        double d11 = d2 + block.maxZ;
        
		if(enableAO)
        {
			if(iDir == 8 || iDir == 9 || iDir == 10 || iDir == 11){
				// Standard
				tessellator.setColorOpaque_F(colorRedTopLeft_TopFace, colorGreenTopLeft_TopFace, colorBlueTopLeft_TopFace);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.setColorOpaque_F(colorRedBottomLeft_TopFace, colorGreenBottomLeft_TopFace, colorBlueBottomLeft_TopFace);
				tessellator.addVertexWithUV(d8, d9, d10, d4, d5);
				tessellator.setColorOpaque_F(colorRedBottomRight_TopFace, colorGreenBottomRight_TopFace, colorBlueBottomRight_TopFace);
				tessellator.addVertexWithUV(d7, d9, d10, d3, d5);
				tessellator.setColorOpaque_F(colorRedTopRight_TopFace, colorGreenTopRight_TopFace, colorBlueTopRight_TopFace);
				tessellator.addVertexWithUV(d7, d9, d11, d3, d6);
			} else
			if(iDir == 12){
				// Pointing South-West
				tessellator.setColorOpaque_F(colorRedTopLeft_TopFace, colorGreenTopLeft_TopFace, colorBlueTopLeft_TopFace);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.setColorOpaque_F(colorRedBottomLeft_TopFace, colorGreenBottomLeft_TopFace, colorBlueBottomLeft_TopFace);
				tessellator.addVertexWithUV(d8, d9, d10, d4, d5);
				tessellator.setColorOpaque_F(colorRedTopRight_TopFace, colorGreenTopRight_TopFace, colorBlueTopRight_TopFace);
				tessellator.addVertexWithUV(d7, d9, d11, d3, d6);
				tessellator.setColorOpaque_F(colorRedTopRight_TopFace, colorGreenTopRight_TopFace, colorBlueTopRight_TopFace);
				tessellator.addVertexWithUV(d7, d9, d11, d3, d6);
			} else	
			if(iDir == 13){
				// Pointing North-East
				tessellator.setColorOpaque_F(colorRedBottomLeft_TopFace, colorGreenBottomLeft_TopFace, colorBlueBottomLeft_TopFace);
				tessellator.addVertexWithUV(d8, d9, d10, d4, d5);
				tessellator.setColorOpaque_F(colorRedBottomLeft_TopFace, colorGreenBottomLeft_TopFace, colorBlueBottomLeft_TopFace);
				tessellator.addVertexWithUV(d8, d9, d10, d4, d5);
				tessellator.setColorOpaque_F(colorRedBottomRight_TopFace, colorGreenBottomRight_TopFace, colorBlueBottomRight_TopFace);
				tessellator.addVertexWithUV(d7, d9, d10, d3, d5);
				tessellator.setColorOpaque_F(colorRedTopRight_TopFace, colorGreenTopRight_TopFace, colorBlueTopRight_TopFace);
				tessellator.addVertexWithUV(d7, d9, d11, d3, d6);			
			} else	
			if(iDir == 14){
				// Pointing North-West
				tessellator.setColorOpaque_F(colorRedTopLeft_TopFace, colorGreenTopLeft_TopFace, colorBlueTopLeft_TopFace);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.setColorOpaque_F(colorRedBottomRight_TopFace, colorGreenBottomRight_TopFace, colorBlueBottomRight_TopFace);
				tessellator.addVertexWithUV(d7, d9, d10, d3, d5);
				tessellator.setColorOpaque_F(colorRedBottomRight_TopFace, colorGreenBottomRight_TopFace, colorBlueBottomRight_TopFace);
				tessellator.addVertexWithUV(d7, d9, d10, d3, d5);
				tessellator.setColorOpaque_F(colorRedTopRight_TopFace, colorGreenTopRight_TopFace, colorBlueTopRight_TopFace);
				tessellator.addVertexWithUV(d7, d9, d11, d3, d6);	
			} else		
			if(iDir == 15){
				// Pointing South-East
				tessellator.setColorOpaque_F(colorRedTopLeft_TopFace, colorGreenTopLeft_TopFace, colorBlueTopLeft_TopFace);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.setColorOpaque_F(colorRedBottomLeft_TopFace, colorGreenBottomLeft_TopFace, colorBlueBottomLeft_TopFace);
				tessellator.addVertexWithUV(d8, d9, d10, d4, d5);
				tessellator.setColorOpaque_F(colorRedBottomRight_TopFace, colorGreenBottomRight_TopFace, colorBlueBottomRight_TopFace);
				tessellator.addVertexWithUV(d7, d9, d10, d3, d5);
				tessellator.setColorOpaque_F(colorRedTopLeft_TopFace, colorGreenTopLeft_TopFace, colorBlueTopLeft_TopFace);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);	
			}
		} else
		{
			if(iDir == 8 || iDir == 9 || iDir == 10 || iDir == 11){
				// Standard
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.addVertexWithUV(d8, d9, d10, d4, d5);
				tessellator.addVertexWithUV(d7, d9, d10, d3, d5);
				tessellator.addVertexWithUV(d7, d9, d11, d3, d6);
			} else
			if(iDir == 12){
				// Pointing South-West
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.addVertexWithUV(d8, d9, d10, d4, d5);
				tessellator.addVertexWithUV(d7, d9, d11, d3, d6);
				tessellator.addVertexWithUV(d7, d9, d11, d3, d6);
			} else	
			if(iDir == 13){
				// Pointing North-East
				tessellator.addVertexWithUV(d8, d9, d10, d4, d5);
				tessellator.addVertexWithUV(d8, d9, d10, d4, d5);
				tessellator.addVertexWithUV(d7, d9, d10, d3, d5);
				tessellator.addVertexWithUV(d7, d9, d11, d3, d6);			
			} else	
			if(iDir == 14){
				// Pointing North-West
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.addVertexWithUV(d7, d9, d10, d3, d5);
				tessellator.addVertexWithUV(d7, d9, d10, d3, d5);
				tessellator.addVertexWithUV(d7, d9, d11, d3, d6);	
			} else		
			if(iDir == 15){
				// Pointing South-East
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.addVertexWithUV(d8, d9, d10, d4, d5);
				tessellator.addVertexWithUV(d7, d9, d10, d3, d5);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);	
			}		
		}
    }

    public void renderSlopesEastFace(Block block, double d, double d1, double d2, 
            int i, int iDir, RenderBlocks renderblocks, int lBrightness)
    {
        Tessellator tessellator = Tessellator.instance;
        tessellator.setBrightness(lBrightness);
        if(renderblocks.overrideBlockTexture >= 0)
        {
            i = renderblocks.overrideBlockTexture;
        }
        int j = (i & 0xf) << 4;
        int k = i & 0xf0;
        double d3 = ((double)j + block.minX * 16D) / 256D;
        double d4 = (((double)j + block.maxX * 16D) - 0.01D) / 256D;
        double d5 = ((double)k + block.minY * 16D) / 256D;
        double d6 = (((double)k + block.maxY * 16D) - 0.01D) / 256D;
        if(renderblocks.flipTexture)
        {
            double d7 = d3;
            d3 = d4;
            d4 = d7;
        }
        if(block.minX < 0.0D || block.maxX > 1.0D)
        {
            d3 = ((float)j + 0.0F) / 256F;
            d4 = ((float)j + 15.99F) / 256F;
        }
        if(block.minY < 0.0D || block.maxY > 1.0D)
        {
            d5 = ((float)k + 0.0F) / 256F;
            d6 = ((float)k + 15.99F) / 256F;
        }
        double d8 = d + block.minX;
        double d9 = d + block.maxX;
        double d10 = d1 + block.minY;
        double d11 = d1 + block.maxY;
        double d12 = d2 + block.minZ;
		double d13 = d2 + block.maxZ;
		
		if(enableAO)
        {
			if(iDir == 7 || iDir == 11 || iDir == 13 || iDir == 15){
				// Standard
				tessellator.setColorOpaque_F(colorRedTopLeft_EastFace, colorGreenTopLeft_EastFace, colorBlueTopLeft_EastFace);
				tessellator.addVertexWithUV(d8, d11, d12, d4, d5);
				tessellator.setColorOpaque_F(colorRedBottomLeft_EastFace, colorGreenBottomLeft_EastFace, colorBlueBottomLeft_EastFace);
				tessellator.addVertexWithUV(d9, d11, d12, d3, d5);
				tessellator.setColorOpaque_F(colorRedBottomRight_EastFace, colorGreenBottomRight_EastFace, colorBlueBottomRight_EastFace);
				tessellator.addVertexWithUV(d9, d10, d12, d3, d6);
				tessellator.setColorOpaque_F(colorRedTopRight_EastFace, colorGreenTopRight_EastFace, colorBlueTopRight_EastFace);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d6);
			}else
			if(iDir == 4){
				// Triangle Down pointing north
				tessellator.setColorOpaque_F(colorRedTopRight_EastFace, colorGreenTopRight_EastFace, colorBlueTopRight_EastFace);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d6);
				tessellator.setColorOpaque_F(colorRedBottomLeft_EastFace, colorGreenBottomLeft_EastFace, colorBlueBottomLeft_EastFace);
				tessellator.addVertexWithUV(d9, d11, d12, d3, d5);
				tessellator.setColorOpaque_F(colorRedBottomRight_EastFace, colorGreenBottomRight_EastFace, colorBlueBottomRight_EastFace);
				tessellator.addVertexWithUV(d9, d10, d12, d3, d6);
				tessellator.setColorOpaque_F(colorRedTopRight_EastFace, colorGreenTopRight_EastFace, colorBlueTopRight_EastFace);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d6);
			} else
			if(iDir == 5){
				// Triangle Down pointing south
				tessellator.setColorOpaque_F(colorRedTopLeft_EastFace, colorGreenTopLeft_EastFace, colorBlueTopLeft_EastFace);
				tessellator.addVertexWithUV(d8, d11, d12, d4, d5);
				tessellator.setColorOpaque_F(colorRedBottomRight_EastFace, colorGreenBottomRight_EastFace, colorBlueBottomRight_EastFace);
				tessellator.addVertexWithUV(d9, d10, d12, d3, d6);
				tessellator.setColorOpaque_F(colorRedBottomRight_EastFace, colorGreenBottomRight_EastFace, colorBlueBottomRight_EastFace);
				tessellator.addVertexWithUV(d9, d10, d12, d3, d6);
				tessellator.setColorOpaque_F(colorRedTopRight_EastFace, colorGreenTopRight_EastFace, colorBlueTopRight_EastFace);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d6);
			} else	
			if(iDir == 6){
				// Slope facing Up - East	
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueXNegYPos)*(factorTop+factorEast)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueXNegYPos)*(factorTop+factorEast)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueXNegYPos)*(factorTop+factorEast)/4F);
				tessellator.addVertexWithUV(d8, d11, d13, d4, d5);                                                                                                                                                                                        
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueXPosYPos)*(factorTop+factorEast)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueXPosYPos)*(factorTop+factorEast)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueXPosYPos)*(factorTop+factorEast)/4F);
				tessellator.addVertexWithUV(d9, d11, d13, d3, d5);                                                                                                                                                                                        
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueZNeg+aoLightValueXPosZNeg)*(factorTop+factorEast)/4F, colorGreenSlopes*(aoLightValueZNeg+aoLightValueXPosZNeg)*(factorTop+factorEast)/4F, colorBlueSlopes*(aoLightValueZNeg+aoLightValueXPosZNeg)*(factorTop+factorEast)/4F);
				tessellator.addVertexWithUV(d9, d10, d12, d3, d6);                                                                                                                                                                                        
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueZNeg+aoLightValueXNegZNeg)*(factorTop+factorEast)/4F, colorGreenSlopes*(aoLightValueZNeg+aoLightValueXNegZNeg)*(factorTop+factorEast)/4F, colorBlueSlopes*(aoLightValueZNeg+aoLightValueXNegZNeg)*(factorTop+factorEast)/4F);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d6);
			} else		
			if(iDir == 8){
				// Triangle Up pointing north
				tessellator.setColorOpaque_F(colorRedTopLeft_EastFace, colorGreenTopLeft_EastFace, colorBlueTopLeft_EastFace);
				tessellator.addVertexWithUV(d8, d11, d12, d4, d5);
				tessellator.setColorOpaque_F(colorRedBottomLeft_EastFace, colorGreenBottomLeft_EastFace, colorBlueBottomLeft_EastFace);
				tessellator.addVertexWithUV(d9, d11, d12, d3, d5);
				tessellator.setColorOpaque_F(colorRedBottomRight_EastFace, colorGreenBottomRight_EastFace, colorBlueBottomRight_EastFace);
				tessellator.addVertexWithUV(d9, d10, d12, d3, d6);
				tessellator.setColorOpaque_F(colorRedTopLeft_EastFace, colorGreenTopLeft_EastFace, colorBlueTopLeft_EastFace);
				tessellator.addVertexWithUV(d8, d11, d12, d4, d5);			
			} else
			if(iDir == 9){
				// Triangle Up pointing south
				tessellator.setColorOpaque_F(colorRedTopLeft_EastFace, colorGreenTopLeft_EastFace, colorBlueTopLeft_EastFace);
				tessellator.addVertexWithUV(d8, d11, d12, d4, d5);
				tessellator.setColorOpaque_F(colorRedBottomLeft_EastFace, colorGreenBottomLeft_EastFace, colorBlueBottomLeft_EastFace);
				tessellator.addVertexWithUV(d9, d11, d12, d3, d5);
				tessellator.setColorOpaque_F(colorRedBottomLeft_EastFace, colorGreenBottomLeft_EastFace, colorBlueBottomLeft_EastFace);
				tessellator.addVertexWithUV(d9, d11, d12, d3, d5);
				tessellator.setColorOpaque_F(colorRedTopRight_EastFace, colorGreenTopRight_EastFace, colorBlueTopRight_EastFace);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d6);			
			} else		
			if(iDir == 10){
				// Slope facing Down - East
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueZNeg+aoLightValueXNegZNeg)*(factorBottom+factorEast)/4F, colorGreenSlopes*(aoLightValueZNeg+aoLightValueXNegZNeg)*(factorBottom+factorEast)/4F, colorBlueSlopes*(aoLightValueZNeg+aoLightValueXNegZNeg)*(factorBottom+factorEast)/4F);
				tessellator.addVertexWithUV(d8, d11, d12, d4, d5);                                                                                                                                                                                                                          
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueZNeg+aoLightValueXPosZNeg)*(factorBottom+factorEast)/4F, colorGreenSlopes*(aoLightValueZNeg+aoLightValueXPosZNeg)*(factorBottom+factorEast)/4F, colorBlueSlopes*(aoLightValueZNeg+aoLightValueXPosZNeg)*(factorBottom+factorEast)/4F);
				tessellator.addVertexWithUV(d9, d11, d12, d3, d5);                                                                                                                                                                                                                          
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueXPosYNeg)*(factorBottom+factorEast)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueXPosYNeg)*(factorBottom+factorEast)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueXPosYNeg)*(factorBottom+factorEast)/4F);
				tessellator.addVertexWithUV(d9, d10, d13, d3, d6);                                                                                                                                                                                                                          
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueXNegYNeg)*(factorBottom+factorEast)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueXNegYNeg)*(factorBottom+factorEast)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueXNegYNeg)*(factorBottom+factorEast)/4F);
				tessellator.addVertexWithUV(d8, d10, d13, d4, d6);
			} else		
			if(iDir == 12){
				// Side Slope facing North - East
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXNeg+aoLightValueXNegYPos)*(factorNorth+factorEast)/4F, colorGreenSlopes*(aoLightValueXNeg+aoLightValueXNegYPos)*(factorNorth+factorEast)/4F, colorBlueSlopes*(aoLightValueXNeg+aoLightValueXNegYPos)*(factorNorth+factorEast)/4F);
				tessellator.addVertexWithUV(d8, d11, d13, d4, d5);                                                                                                                                                                                            
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueZNeg+aoLightValueYPosZNeg)*(factorNorth+factorEast)/4F, colorGreenSlopes*(aoLightValueZNeg+aoLightValueYPosZNeg)*(factorNorth+factorEast)/4F, colorBlueSlopes*(aoLightValueZNeg+aoLightValueYPosZNeg)*(factorNorth+factorEast)/4F);
				tessellator.addVertexWithUV(d9, d11, d12, d3, d5);                                                                                                                                                                                            
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueZNeg+aoLightValueYNegZNeg)*(factorNorth+factorEast)/4F, colorGreenSlopes*(aoLightValueZNeg+aoLightValueYNegZNeg)*(factorNorth+factorEast)/4F, colorBlueSlopes*(aoLightValueZNeg+aoLightValueYNegZNeg)*(factorNorth+factorEast)/4F);
				tessellator.addVertexWithUV(d9, d10, d12, d3, d6);                                                                                                                                                                                            
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXNeg+aoLightValueXNegYNeg)*(factorNorth+factorEast)/4F, colorGreenSlopes*(aoLightValueXNeg+aoLightValueXNegYNeg)*(factorNorth+factorEast)/4F, colorBlueSlopes*(aoLightValueXNeg+aoLightValueXNegYNeg)*(factorNorth+factorEast)/4F);
				tessellator.addVertexWithUV(d8, d10, d13, d4, d6);		
			}    
		} else
		{
			if(iDir == 7 || iDir == 11 || iDir == 13 || iDir == 15){
				// Standard
				tessellator.addVertexWithUV(d8, d11, d12, d4, d5);
				tessellator.addVertexWithUV(d9, d11, d12, d3, d5);
				tessellator.addVertexWithUV(d9, d10, d12, d3, d6);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d6);
			}else
			if(iDir == 4){
				// Triangle Down pointing north
				tessellator.addVertexWithUV(d8, d10, d12, d4, d6);
				tessellator.addVertexWithUV(d9, d11, d12, d3, d5);
				tessellator.addVertexWithUV(d9, d10, d12, d3, d6);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d6);
			} else
			if(iDir == 5){
				// Triangle Down pointing south
				tessellator.addVertexWithUV(d8, d11, d12, d4, d5);
				tessellator.addVertexWithUV(d9, d10, d12, d3, d6);
				tessellator.addVertexWithUV(d9, d10, d12, d3, d6);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d6);
			} else	
			if(iDir == 6){
				// Slope Down
				tessellator.addVertexWithUV(d8, d11, d13, d4, d5);
				tessellator.addVertexWithUV(d9, d11, d13, d3, d5);
				tessellator.addVertexWithUV(d9, d10, d12, d3, d6);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d6);
			} else		
			if(iDir == 8){
				// Triangle Up pointing north
				tessellator.addVertexWithUV(d8, d11, d12, d4, d5);
				tessellator.addVertexWithUV(d9, d11, d12, d3, d5);
				tessellator.addVertexWithUV(d9, d10, d12, d3, d6);
				tessellator.addVertexWithUV(d8, d11, d12, d4, d5);			
			} else
			if(iDir == 9){
				// Triangle Up pointing south
				tessellator.addVertexWithUV(d8, d11, d12, d4, d5);
				tessellator.addVertexWithUV(d9, d11, d12, d3, d5);
				tessellator.addVertexWithUV(d9, d11, d12, d3, d5);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d6);			
			} else		
			if(iDir == 10){
				// Slope Up
				tessellator.addVertexWithUV(d8, d11, d12, d4, d5);
				tessellator.addVertexWithUV(d9, d11, d12, d3, d5);
				tessellator.addVertexWithUV(d9, d10, d13, d3, d6);
				tessellator.addVertexWithUV(d8, d10, d13, d4, d6);
			} else		
			if(iDir == 12){
				// Side Slope
				tessellator.addVertexWithUV(d8, d11, d13, d4, d5);
				tessellator.addVertexWithUV(d9, d11, d12, d3, d5);
				tessellator.addVertexWithUV(d9, d10, d12, d3, d6);
				tessellator.addVertexWithUV(d8, d10, d13, d4, d6);		
			}  		
		}
    }

    public void renderSlopesWestFace(Block block, double d, double d1, double d2, 
            int i, int iDir, RenderBlocks renderblocks, int lBrightness)
    {
        Tessellator tessellator = Tessellator.instance;
        tessellator.setBrightness(lBrightness);
        if(renderblocks.overrideBlockTexture >= 0)
        {
            i = renderblocks.overrideBlockTexture;
        }
        int j = (i & 0xf) << 4;
        int k = i & 0xf0;
        double d3 = ((double)j + block.minX * 16D) / 256D;
        double d4 = (((double)j + block.maxX * 16D) - 0.01D) / 256D;
        double d5 = ((double)k + block.minY * 16D) / 256D;
        double d6 = (((double)k + block.maxY * 16D) - 0.01D) / 256D;
        if(renderblocks.flipTexture)
        {
            double d7 = d3;
            d3 = d4;
            d4 = d7;
        }
        if(block.minX < 0.0D || block.maxX > 1.0D)
        {
            d3 = ((float)j + 0.0F) / 256F;
            d4 = ((float)j + 15.99F) / 256F;
        }
        if(block.minY < 0.0D || block.maxY > 1.0D)
        {
            d5 = ((float)k + 0.0F) / 256F;
            d6 = ((float)k + 15.99F) / 256F;
        }
        double d8 = d + block.minX;
        double d9 = d + block.maxX;
        double d10 = d1 + block.minY;
        double d11 = d1 + block.maxY;
        double d12 = d2 + block.maxZ;
		double d13 = d2 + block.minZ;
		
		if(enableAO)
        {
			if(iDir == 6 || iDir == 10 || iDir == 12 || iDir == 14){
				// Standard
				tessellator.setColorOpaque_F(colorRedTopLeft_WestFace, colorGreenTopLeft_WestFace, colorBlueTopLeft_WestFace);
				tessellator.addVertexWithUV(d8, d11, d12, d3, d5);
				tessellator.setColorOpaque_F(colorRedBottomLeft_WestFace, colorGreenBottomLeft_WestFace, colorBlueBottomLeft_WestFace);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d6);
				tessellator.setColorOpaque_F(colorRedBottomRight_WestFace, colorGreenBottomRight_WestFace, colorBlueBottomRight_WestFace);
				tessellator.addVertexWithUV(d9, d10, d12, d4, d6);
				tessellator.setColorOpaque_F(colorRedTopRight_WestFace, colorGreenTopRight_WestFace, colorBlueTopRight_WestFace);
				tessellator.addVertexWithUV(d9, d11, d12, d4, d5);
			} else
			if(iDir == 4){
				// Triangle Down pointing north
				tessellator.setColorOpaque_F(colorRedBottomLeft_WestFace, colorGreenBottomLeft_WestFace, colorBlueBottomLeft_WestFace);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d6);
				tessellator.setColorOpaque_F(colorRedBottomLeft_WestFace, colorGreenBottomLeft_WestFace, colorBlueBottomLeft_WestFace);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d6);
				tessellator.setColorOpaque_F(colorRedBottomRight_WestFace, colorGreenBottomRight_WestFace, colorBlueBottomRight_WestFace);
				tessellator.addVertexWithUV(d9, d10, d12, d4, d6);
				tessellator.setColorOpaque_F(colorRedTopRight_WestFace, colorGreenTopRight_WestFace, colorBlueTopRight_WestFace);
				tessellator.addVertexWithUV(d9, d11, d12, d4, d5);
			} else
			if(iDir == 5){
				// Triangle Down pointing south
				tessellator.setColorOpaque_F(colorRedTopLeft_WestFace, colorGreenTopLeft_WestFace, colorBlueTopLeft_WestFace);
				tessellator.addVertexWithUV(d8, d11, d12, d3, d5);
				tessellator.setColorOpaque_F(colorRedBottomLeft_WestFace, colorGreenBottomLeft_WestFace, colorBlueBottomLeft_WestFace);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d6);
				tessellator.setColorOpaque_F(colorRedBottomRight_WestFace, colorGreenBottomRight_WestFace, colorBlueBottomRight_WestFace);
				tessellator.addVertexWithUV(d9, d10, d12, d4, d6);
				tessellator.setColorOpaque_F(colorRedBottomRight_WestFace, colorGreenBottomRight_WestFace, colorBlueBottomRight_WestFace);
				tessellator.addVertexWithUV(d9, d10, d12, d4, d6);
			} else			
			if(iDir == 7){
				// Slope Facing Up - West
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueXNegYPos)*(factorTop+factorWest)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueXNegYPos)*(factorTop+factorWest)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueXNegYPos)*(factorTop+factorWest)/4F);
				tessellator.addVertexWithUV(d8, d11, d13, d3, d5);                                                                                                                                                                                                                    
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueZPos+aoLightValueXNegZPos)*(factorTop+factorWest)/4F, colorGreenSlopes*(aoLightValueZPos+aoLightValueXNegZPos)*(factorTop+factorWest)/4F, colorBlueSlopes*(aoLightValueZPos+aoLightValueXNegZPos)*(factorTop+factorWest)/4F);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d6);                                                                                                                                                                                                                    
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueZPos+aoLightValueXPosZPos)*(factorTop+factorWest)/4F, colorGreenSlopes*(aoLightValueZPos+aoLightValueXPosZPos)*(factorTop+factorWest)/4F, colorBlueSlopes*(aoLightValueZPos+aoLightValueXPosZPos)*(factorTop+factorWest)/4F);
				tessellator.addVertexWithUV(d9, d10, d12, d4, d6);                                                                                                                                                                                                                    
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueXPosYPos)*(factorTop+factorWest)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueXPosYPos)*(factorTop+factorWest)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueXPosYPos)*(factorTop+factorWest)/4F);
				tessellator.addVertexWithUV(d9, d11, d13, d4, d5);
			}else
			if(iDir == 8){
				// Triangle Up pointing north
				tessellator.setColorOpaque_F(colorRedTopLeft_WestFace, colorGreenTopLeft_WestFace, colorBlueTopLeft_WestFace);
				tessellator.addVertexWithUV(d8, d11, d12, d3, d5);
				tessellator.setColorOpaque_F(colorRedTopLeft_WestFace, colorGreenTopLeft_WestFace, colorBlueTopLeft_WestFace);
				tessellator.addVertexWithUV(d8, d11, d12, d3, d5);
				tessellator.setColorOpaque_F(colorRedBottomRight_WestFace, colorGreenBottomRight_WestFace, colorBlueBottomRight_WestFace);
				tessellator.addVertexWithUV(d9, d10, d12, d4, d6);
				tessellator.setColorOpaque_F(colorRedTopRight_WestFace, colorGreenTopRight_WestFace, colorBlueTopRight_WestFace);
				tessellator.addVertexWithUV(d9, d11, d12, d4, d5);			
			} else
			if(iDir == 9){
				// Triangle Up pointing south
				tessellator.setColorOpaque_F(colorRedTopLeft_WestFace, colorGreenTopLeft_WestFace, colorBlueTopLeft_WestFace);
				tessellator.addVertexWithUV(d8, d11, d12, d3, d5);
				tessellator.setColorOpaque_F(colorRedBottomLeft_WestFace, colorGreenBottomLeft_WestFace, colorBlueBottomLeft_WestFace);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d6);
				tessellator.setColorOpaque_F(colorRedTopRight_WestFace, colorGreenTopRight_WestFace, colorBlueTopRight_WestFace);
				tessellator.addVertexWithUV(d9, d11, d12, d4, d5);
				tessellator.setColorOpaque_F(colorRedTopRight_WestFace, colorGreenTopRight_WestFace, colorBlueTopRight_WestFace);
				tessellator.addVertexWithUV(d9, d11, d12, d4, d5);			
			} else				
			if(iDir == 11){
				// Slope Facing Down - West
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueZPos+aoLightValueXNegZPos)*(factorBottom+factorWest)/4F, colorGreenSlopes*(aoLightValueZPos+aoLightValueXNegZPos)*(factorBottom+factorWest)/4F, colorBlueSlopes*(aoLightValueZPos+aoLightValueXNegZPos)*(factorBottom+factorWest)/4F);
				tessellator.addVertexWithUV(d8, d11, d12, d3, d5);                                                                                                                                                                                                                          
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueXNegYNeg)*(factorBottom+factorWest)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueXNegYNeg)*(factorBottom+factorWest)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueXNegYNeg)*(factorBottom+factorWest)/4F);
				tessellator.addVertexWithUV(d8, d10, d13, d3, d6);                                                                                                                                                                                                                          
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueXPosYNeg)*(factorBottom+factorWest)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueXPosYNeg)*(factorBottom+factorWest)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueXPosYNeg)*(factorBottom+factorWest)/4F);
				tessellator.addVertexWithUV(d9, d10, d13, d4, d6);                                                                                                                                                                                                                          
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueZPos+aoLightValueXPosZPos)*(factorBottom+factorWest)/4F, colorGreenSlopes*(aoLightValueZPos+aoLightValueXPosZPos)*(factorBottom+factorWest)/4F, colorBlueSlopes*(aoLightValueZPos+aoLightValueXPosZPos)*(factorBottom+factorWest)/4F);
				tessellator.addVertexWithUV(d9, d11, d12, d4, d5);
			}else		
			if(iDir == 13){
				// Side Slope facing South - West
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueZPos+aoLightValueYPosZPos)*(factorSouth+factorWest)/4F, colorGreenSlopes*(aoLightValueZPos+aoLightValueYPosZPos)*(factorSouth+factorWest)/4F, colorBlueSlopes*(aoLightValueZPos+aoLightValueYPosZPos)*(factorSouth+factorWest)/4F);
				tessellator.addVertexWithUV(d8, d11, d12, d3, d5);                                                                                                                                                                                                                        
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueZPos+aoLightValueYNegZPos)*(factorSouth+factorWest)/4F, colorGreenSlopes*(aoLightValueZPos+aoLightValueYNegZPos)*(factorSouth+factorWest)/4F, colorBlueSlopes*(aoLightValueZPos+aoLightValueYNegZPos)*(factorSouth+factorWest)/4F);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d6);                                                                                                                                                                                                                        
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXPos+aoLightValueXPosYNeg)*(factorSouth+factorWest)/4F, colorGreenSlopes*(aoLightValueXPos+aoLightValueXPosYNeg)*(factorSouth+factorWest)/4F, colorBlueSlopes*(aoLightValueXPos+aoLightValueXPosYNeg)*(factorSouth+factorWest)/4F);
				tessellator.addVertexWithUV(d9, d10, d13, d4, d6);                                                                                                                                                                                                                        
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXPos+aoLightValueXPosYPos)*(factorSouth+factorWest)/4F, colorGreenSlopes*(aoLightValueXPos+aoLightValueXPosYPos)*(factorSouth+factorWest)/4F, colorBlueSlopes*(aoLightValueXPos+aoLightValueXPosYPos)*(factorSouth+factorWest)/4F);
				tessellator.addVertexWithUV(d9, d11, d13, d4, d5);	
			}
		} else
		{
			if(iDir == 6 || iDir == 10 || iDir == 12 || iDir == 14){
				// Standard
				tessellator.addVertexWithUV(d8, d11, d12, d3, d5);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d6);
				tessellator.addVertexWithUV(d9, d10, d12, d4, d6);
				tessellator.addVertexWithUV(d9, d11, d12, d4, d5);
			} else
			if(iDir == 4){
				// Triangle Down pointing north
				tessellator.addVertexWithUV(d8, d10, d12, d3, d6);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d6);
				tessellator.addVertexWithUV(d9, d10, d12, d4, d6);
				tessellator.addVertexWithUV(d9, d11, d12, d4, d5);
			} else
			if(iDir == 5){
				// Triangle Down pointing south
				tessellator.addVertexWithUV(d8, d11, d12, d3, d5);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d6);
				tessellator.addVertexWithUV(d9, d10, d12, d4, d6);
				tessellator.addVertexWithUV(d9, d10, d12, d4, d6);
			} else			
			if(iDir == 7){
				// Slope Down
				tessellator.addVertexWithUV(d8, d11, d13, d3, d5);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d6);
				tessellator.addVertexWithUV(d9, d10, d12, d4, d6);
				tessellator.addVertexWithUV(d9, d11, d13, d4, d5);
			}else
			if(iDir == 8){
				// Triangle Up pointing north
				tessellator.addVertexWithUV(d8, d11, d12, d3, d5);
				tessellator.addVertexWithUV(d8, d11, d12, d3, d5);
				tessellator.addVertexWithUV(d9, d10, d12, d4, d6);
				tessellator.addVertexWithUV(d9, d11, d12, d4, d5);			
			} else
			if(iDir == 9){
				// Triangle Up pointing south
				tessellator.addVertexWithUV(d8, d11, d12, d3, d5);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d6);
				tessellator.addVertexWithUV(d9, d11, d12, d4, d5);
				tessellator.addVertexWithUV(d9, d11, d12, d4, d5);			
			} else				
			if(iDir == 11){
				// Slope Up
				tessellator.addVertexWithUV(d8, d11, d12, d3, d5);
				tessellator.addVertexWithUV(d8, d10, d13, d3, d6);
				tessellator.addVertexWithUV(d9, d10, d13, d4, d6);
				tessellator.addVertexWithUV(d9, d11, d12, d4, d5);
			}else		
			if(iDir == 13){
				// Side Slope
				tessellator.addVertexWithUV(d8, d11, d12, d3, d5);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d6);
				tessellator.addVertexWithUV(d9, d10, d13, d4, d6);
				tessellator.addVertexWithUV(d9, d11, d13, d4, d5);	
			}		
		}
    }

    public void renderSlopesNorthFace(Block block, double d, double d1, double d2, 
            int i, int iDir, RenderBlocks renderblocks, int lBrightness)
    {
        Tessellator tessellator = Tessellator.instance;
        tessellator.setBrightness(lBrightness);
        if(renderblocks.overrideBlockTexture >= 0)
        {
            i = renderblocks.overrideBlockTexture;
        }
        int j = (i & 0xf) << 4;
        int k = i & 0xf0;
        double d3 = ((double)j + block.minZ * 16D) / 256D;
        double d4 = (((double)j + block.maxZ * 16D) - 0.01D) / 256D;
        double d5 = ((double)k + block.minY * 16D) / 256D;
        double d6 = (((double)k + block.maxY * 16D) - 0.01D) / 256D;
        if(renderblocks.flipTexture)
        {
            double d7 = d3;
            d3 = d4;
            d4 = d7;
        }
        if(block.minZ < 0.0D || block.maxZ > 1.0D)
        {
            d3 = ((float)j + 0.0F) / 256F;
            d4 = ((float)j + 15.99F) / 256F;
        }
        if(block.minY < 0.0D || block.maxY > 1.0D)
        {
            d5 = ((float)k + 0.0F) / 256F;
            d6 = ((float)k + 15.99F) / 256F;
        }
        double d8 = d + block.minX;
        double d9 = d1 + block.minY;
        double d10 = d1 + block.maxY;
        double d11 = d2 + block.minZ;
        double d12 = d2 + block.maxZ;	
		double d13 = d + block.maxX;		
		
		if(enableAO)
        {
			if(iDir == 5 || iDir == 9 || iDir == 13 || iDir == 14){
				// Standard
				tessellator.setColorOpaque_F(colorRedTopLeft_NorthFace, colorGreenTopLeft_NorthFace, colorBlueTopLeft_NorthFace);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d5);
				tessellator.setColorOpaque_F(colorRedBottomLeft_NorthFace, colorGreenBottomLeft_NorthFace, colorBlueBottomLeft_NorthFace);
				tessellator.addVertexWithUV(d8, d10, d11, d3, d5);		
				tessellator.setColorOpaque_F(colorRedBottomRight_NorthFace, colorGreenBottomRight_NorthFace, colorBlueBottomRight_NorthFace);
				tessellator.addVertexWithUV(d8, d9, d11, d3, d6);
				tessellator.setColorOpaque_F(colorRedTopRight_NorthFace, colorGreenTopRight_NorthFace, colorBlueTopRight_NorthFace);
				tessellator.addVertexWithUV(d8, d9, d12, d4, d6);			
			} else	
			if(iDir == 4){
				// Slope facing Up - North
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueYPosZPos)*(factorTop+factorNorth)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueYPosZPos)*(factorTop+factorNorth)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueYPosZPos)*(factorTop+factorNorth)/4F);
				tessellator.addVertexWithUV(d13, d10, d12, d4, d5);                                                                                                                                                                                                                     
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueYPosZNeg)*(factorTop+factorNorth)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueYPosZNeg)*(factorTop+factorNorth)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueYPosZNeg)*(factorTop+factorNorth)/4F);
				tessellator.addVertexWithUV(d13, d10, d11, d3, d5);		                                                                                                                                                                                                               
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXNeg+aoLightValueXNegZNeg)*(factorTop+factorNorth)/4F, colorGreenSlopes*(aoLightValueXNeg+aoLightValueXNegZNeg)*(factorTop+factorNorth)/4F, colorBlueSlopes*(aoLightValueXNeg+aoLightValueXNegZNeg)*(factorTop+factorNorth)/4F);
				tessellator.addVertexWithUV(d8, d9, d11, d3, d6);                                                                                                                                                                                                                       
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXNeg+aoLightValueXNegZPos)*(factorTop+factorNorth)/4F, colorGreenSlopes*(aoLightValueXNeg+aoLightValueXNegZPos)*(factorTop+factorNorth)/4F, colorBlueSlopes*(aoLightValueXNeg+aoLightValueXNegZPos)*(factorTop+factorNorth)/4F);
				tessellator.addVertexWithUV(d8, d9, d12, d4, d6);			
			} else		
			if(iDir == 6){
				// Triangle Down pointing east
				tessellator.setColorOpaque_F(colorRedTopLeft_NorthFace, colorGreenTopLeft_NorthFace, colorBlueTopLeft_NorthFace);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d5);
				tessellator.setColorOpaque_F(colorRedBottomRight_NorthFace, colorGreenBottomRight_NorthFace, colorBlueBottomRight_NorthFace);
				tessellator.addVertexWithUV(d8, d9, d11, d3, d6);		
				tessellator.setColorOpaque_F(colorRedBottomRight_NorthFace, colorGreenBottomRight_NorthFace, colorBlueBottomRight_NorthFace);
				tessellator.addVertexWithUV(d8, d9, d11, d3, d6);
				tessellator.setColorOpaque_F(colorRedTopRight_NorthFace, colorGreenTopRight_NorthFace, colorBlueTopRight_NorthFace);
				tessellator.addVertexWithUV(d8, d9, d12, d4, d6);	
				
			} else		
			if(iDir == 7){
				// Triangle Down pointing west
				tessellator.setColorOpaque_F(colorRedTopRight_NorthFace, colorGreenTopRight_NorthFace, colorBlueTopRight_NorthFace);
				tessellator.addVertexWithUV(d8, d9, d12, d4, d6);
				tessellator.setColorOpaque_F(colorRedBottomLeft_NorthFace, colorGreenBottomLeft_NorthFace, colorBlueBottomLeft_NorthFace);
				tessellator.addVertexWithUV(d8, d10, d11, d3, d5);		
				tessellator.setColorOpaque_F(colorRedBottomRight_NorthFace, colorGreenBottomRight_NorthFace, colorBlueBottomRight_NorthFace);
				tessellator.addVertexWithUV(d8, d9, d11, d3, d6);
				tessellator.setColorOpaque_F(colorRedTopRight_NorthFace, colorGreenTopRight_NorthFace, colorBlueTopRight_NorthFace);
				tessellator.addVertexWithUV(d8, d9, d12, d4, d6);	
			}else		
			if(iDir == 8){
				// Slope facing Down - North
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXNeg+aoLightValueXNegZPos)*(factorBottom+factorNorth)/4F, colorGreenSlopes*(aoLightValueXNeg+aoLightValueXNegZPos)*(factorBottom+factorNorth)/4F, colorBlueSlopes*(aoLightValueXNeg+aoLightValueXNegZPos)*(factorBottom+factorNorth)/4F);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d5);                                                                                                                                                                                                                            
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXNeg+aoLightValueXNegZNeg)*(factorBottom+factorNorth)/4F, colorGreenSlopes*(aoLightValueXNeg+aoLightValueXNegZNeg)*(factorBottom+factorNorth)/4F, colorBlueSlopes*(aoLightValueXNeg+aoLightValueXNegZNeg)*(factorBottom+factorNorth)/4F);
				tessellator.addVertexWithUV(d8, d10, d11, d3, d5);		                                                                                                                                                                                                                     
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueYNegZNeg)*(factorBottom+factorNorth)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueYNegZNeg)*(factorBottom+factorNorth)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueYNegZNeg)*(factorBottom+factorNorth)/4F);
				tessellator.addVertexWithUV(d13, d9, d11, d3, d6);                                                                                                                                                                                                                            
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueYNegZPos)*(factorBottom+factorNorth)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueYNegZPos)*(factorBottom+factorNorth)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueYNegZPos)*(factorBottom+factorNorth)/4F);
				tessellator.addVertexWithUV(d13, d9, d12, d4, d6);			
			} else	
			if(iDir == 10){
				// Triangle Up pointing east
				tessellator.setColorOpaque_F(colorRedTopLeft_NorthFace, colorGreenTopLeft_NorthFace, colorBlueTopLeft_NorthFace);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d5);
				tessellator.setColorOpaque_F(colorRedBottomLeft_NorthFace, colorGreenBottomLeft_NorthFace, colorBlueBottomLeft_NorthFace);
				tessellator.addVertexWithUV(d8, d10, d11, d3, d5);		
				tessellator.setColorOpaque_F(colorRedBottomLeft_NorthFace, colorGreenBottomLeft_NorthFace, colorBlueBottomLeft_NorthFace);
				tessellator.addVertexWithUV(d8, d10, d11, d3, d5);
				tessellator.setColorOpaque_F(colorRedTopRight_NorthFace, colorGreenTopRight_NorthFace, colorBlueTopRight_NorthFace);
				tessellator.addVertexWithUV(d8, d9, d12, d4, d6);			
			} else		
			if(iDir == 11){
				// Triangle Up pointing west
				tessellator.setColorOpaque_F(colorRedTopLeft_NorthFace, colorGreenTopLeft_NorthFace, colorBlueTopLeft_NorthFace);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d5);
				tessellator.setColorOpaque_F(colorRedBottomLeft_NorthFace, colorGreenBottomLeft_NorthFace, colorBlueBottomLeft_NorthFace);
				tessellator.addVertexWithUV(d8, d10, d11, d3, d5);		
				tessellator.setColorOpaque_F(colorRedBottomRight_NorthFace, colorGreenBottomRight_NorthFace, colorBlueBottomRight_NorthFace);
				tessellator.addVertexWithUV(d8, d9, d11, d3, d6);
				tessellator.setColorOpaque_F(colorRedTopLeft_NorthFace, colorGreenTopLeft_NorthFace, colorBlueTopLeft_NorthFace);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d5);				
			} else		
			if(iDir == 15){
				// Side Slope facing North - West
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueZPos+aoLightValueYPosZPos)*(factorWest+factorNorth)/4F, colorGreenSlopes*(aoLightValueZPos+aoLightValueYPosZPos)*(factorWest+factorNorth)/4F, colorBlueSlopes*(aoLightValueZPos+aoLightValueYPosZPos)*(factorWest+factorNorth)/4F);
				tessellator.addVertexWithUV(d13, d10, d12, d4, d5);                                                                                                                                                                                                                       
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXNeg+aoLightValueXNegYPos)*(factorWest+factorNorth)/4F, colorGreenSlopes*(aoLightValueXNeg+aoLightValueXNegYPos)*(factorWest+factorNorth)/4F, colorBlueSlopes*(aoLightValueXNeg+aoLightValueXNegYPos)*(factorWest+factorNorth)/4F);
				tessellator.addVertexWithUV(d8, d10, d11, d3, d5);		                                                                                                                                                                                                                 
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXNeg+aoLightValueXNegYNeg)*(factorWest+factorNorth)/4F, colorGreenSlopes*(aoLightValueXNeg+aoLightValueXNegYNeg)*(factorWest+factorNorth)/4F, colorBlueSlopes*(aoLightValueXNeg+aoLightValueXNegYNeg)*(factorWest+factorNorth)/4F);
				tessellator.addVertexWithUV(d8, d9, d11, d3, d6);                                                                                                                                                                                                                         
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueZPos+aoLightValueYNegZPos)*(factorWest+factorNorth)/4F, colorGreenSlopes*(aoLightValueZPos+aoLightValueYNegZPos)*(factorWest+factorNorth)/4F, colorBlueSlopes*(aoLightValueZPos+aoLightValueYNegZPos)*(factorWest+factorNorth)/4F);
				tessellator.addVertexWithUV(d13, d9, d12, d4, d6);		
			} 
		} else
		{
			if(iDir == 5 || iDir == 9 || iDir == 13 || iDir == 14){
				// Standard
				tessellator.addVertexWithUV(d8, d10, d12, d4, d5);
				tessellator.addVertexWithUV(d8, d10, d11, d3, d5);		
				tessellator.addVertexWithUV(d8, d9, d11, d3, d6);
				tessellator.addVertexWithUV(d8, d9, d12, d4, d6);			
			} else	
			if(iDir == 4){
				// Slope Down
				tessellator.addVertexWithUV(d13, d10, d12, d4, d5);
				tessellator.addVertexWithUV(d13, d10, d11, d3, d5);		
				tessellator.addVertexWithUV(d8, d9, d11, d3, d6);
				tessellator.addVertexWithUV(d8, d9, d12, d4, d6);			
			} else		
			if(iDir == 6){
				// Triangle Down pointing east
				tessellator.addVertexWithUV(d8, d10, d12, d4, d5);
				tessellator.addVertexWithUV(d8, d9, d11, d3, d6);		
				tessellator.addVertexWithUV(d8, d9, d11, d3, d6);
				tessellator.addVertexWithUV(d8, d9, d12, d4, d6);	
				
			} else		
			if(iDir == 7){
				// Triangle Down pointing west
				tessellator.addVertexWithUV(d8, d9, d12, d4, d6);
				tessellator.addVertexWithUV(d8, d10, d11, d3, d5);		
				tessellator.addVertexWithUV(d8, d9, d11, d3, d6);
				tessellator.addVertexWithUV(d8, d9, d12, d4, d6);	
			}else		
			if(iDir == 8){
				// Slope Up
				tessellator.addVertexWithUV(d8, d10, d12, d4, d5);
				tessellator.addVertexWithUV(d8, d10, d11, d3, d5);		
				tessellator.addVertexWithUV(d13, d9, d11, d3, d6);
				tessellator.addVertexWithUV(d13, d9, d12, d4, d6);			
			} else	
			if(iDir == 10){
				// Triangle Up pointing east
				tessellator.addVertexWithUV(d8, d10, d12, d4, d5);
				tessellator.addVertexWithUV(d8, d10, d11, d3, d5);		
				tessellator.addVertexWithUV(d8, d10, d11, d3, d5);
				tessellator.addVertexWithUV(d8, d9, d12, d4, d6);			
			} else		
			if(iDir == 11){
				// Triangle Up pointing west
				tessellator.addVertexWithUV(d8, d10, d12, d4, d5);
				tessellator.addVertexWithUV(d8, d10, d11, d3, d5);		
				tessellator.addVertexWithUV(d8, d9, d11, d3, d6);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d5);				
			} else		
			if(iDir == 15){
				// Side Slope
				tessellator.addVertexWithUV(d13, d10, d12, d4, d5);
				tessellator.addVertexWithUV(d8, d10, d11, d3, d5);		
				tessellator.addVertexWithUV(d8, d9, d11, d3, d6);
				tessellator.addVertexWithUV(d13, d9, d12, d4, d6);		
			}  		
		}        
    }

    public void renderSlopesSouthFace(Block block, double d, double d1, double d2, 
            int i, int iDir, RenderBlocks renderblocks, int lBrightness)
    {
        Tessellator tessellator = Tessellator.instance;
        tessellator.setBrightness(lBrightness);
        if(renderblocks.overrideBlockTexture >= 0)
        {
            i = renderblocks.overrideBlockTexture;
        }
        int j = (i & 0xf) << 4;
        int k = i & 0xf0;
        double d3 = ((double)j + block.minZ * 16D) / 256D;
        double d4 = (((double)j + block.maxZ * 16D) - 0.01D) / 256D;
        double d5 = ((double)k + block.minY * 16D) / 256D;
        double d6 = (((double)k + block.maxY * 16D) - 0.01D) / 256D;
        if(renderblocks.flipTexture)
        {
            double d7 = d3;
            d3 = d4;
            d4 = d7;
        }
        if(block.minZ < 0.0D || block.maxZ > 1.0D)
        {
            d3 = ((float)j + 0.0F) / 256F;
            d4 = ((float)j + 15.99F) / 256F;
        }
        if(block.minY < 0.0D || block.maxY > 1.0D)
        {
            d5 = ((float)k + 0.0F) / 256F;
            d6 = ((float)k + 15.99F) / 256F;
        }
        double d8 = d + block.maxX;
        double d9 = d1 + block.minY;
        double d10 = d1 + block.maxY;
        double d11 = d2 + block.minZ;
        double d12 = d2 + block.maxZ;
		double d13 = d + block.minX;
		
		if(enableAO)
        {
			if(iDir == 4 || iDir == 8 || iDir == 12 || iDir == 15){
				// Standard
				tessellator.setColorOpaque_F(colorRedTopLeft_SouthFace, colorGreenTopLeft_SouthFace, colorBlueTopLeft_SouthFace);
				tessellator.addVertexWithUV(d8, d9, d12, d3, d6);
				tessellator.setColorOpaque_F(colorRedBottomLeft_SouthFace, colorGreenBottomLeft_SouthFace, colorBlueBottomLeft_SouthFace);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.setColorOpaque_F(colorRedBottomRight_SouthFace, colorGreenBottomRight_SouthFace, colorBlueBottomRight_SouthFace);
				tessellator.addVertexWithUV(d8, d10, d11, d4, d5);
				tessellator.setColorOpaque_F(colorRedTopRight_SouthFace, colorGreenTopRight_SouthFace, colorBlueTopRight_SouthFace);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d5);		
			} else	
			if(iDir == 5){
				// Slope facing Up - South
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXPos+aoLightValueXPosZPos)*(factorTop+factorSouth)/4F, colorGreenSlopes*(aoLightValueXPos+aoLightValueXPosZPos)*(factorTop+factorSouth)/4F, colorBlueSlopes*(aoLightValueXPos+aoLightValueXPosZPos)*(factorTop+factorSouth)/4F);
				tessellator.addVertexWithUV(d8, d9, d12, d3, d6);                                                                                                                                                                                                                       
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXPos+aoLightValueXPosZNeg)*(factorTop+factorSouth)/4F, colorGreenSlopes*(aoLightValueXPos+aoLightValueXPosZNeg)*(factorTop+factorSouth)/4F, colorBlueSlopes*(aoLightValueXPos+aoLightValueXPosZNeg)*(factorTop+factorSouth)/4F);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);                                                                                                                                                                                                                       
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueYPosZNeg)*(factorTop+factorSouth)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueYPosZNeg)*(factorTop+factorSouth)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueYPosZNeg)*(factorTop+factorSouth)/4F);
				tessellator.addVertexWithUV(d13, d10, d11, d4, d5);                                                                                                                                                                                                                     
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueYPosZPos)*(factorTop+factorSouth)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueYPosZPos)*(factorTop+factorSouth)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueYPosZPos)*(factorTop+factorSouth)/4F);
				tessellator.addVertexWithUV(d13, d10, d12, d3, d5);		
			} else	
			if(iDir == 6){
				// Triangle Down pointing east
				tessellator.setColorOpaque_F(colorRedTopLeft_SouthFace, colorGreenTopLeft_SouthFace, colorBlueTopLeft_SouthFace);
				tessellator.addVertexWithUV(d8, d9, d12, d3, d6);
				tessellator.setColorOpaque_F(colorRedBottomLeft_SouthFace, colorGreenBottomLeft_SouthFace, colorBlueBottomLeft_SouthFace);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.setColorOpaque_F(colorRedBottomLeft_SouthFace, colorGreenBottomLeft_SouthFace, colorBlueBottomLeft_SouthFace);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.setColorOpaque_F(colorRedTopRight_SouthFace, colorGreenTopRight_SouthFace, colorBlueTopRight_SouthFace);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d5);			
			} else		
			if(iDir == 7){
				// Triangle Down pointing west
				tessellator.setColorOpaque_F(colorRedTopLeft_SouthFace, colorGreenTopLeft_SouthFace, colorBlueTopLeft_SouthFace);
				tessellator.addVertexWithUV(d8, d9, d12, d3, d6);
				tessellator.setColorOpaque_F(colorRedBottomLeft_SouthFace, colorGreenBottomLeft_SouthFace, colorBlueBottomLeft_SouthFace);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.setColorOpaque_F(colorRedBottomRight_SouthFace, colorGreenBottomRight_SouthFace, colorBlueBottomRight_SouthFace);
				tessellator.addVertexWithUV(d8, d10, d11, d4, d5);
				tessellator.setColorOpaque_F(colorRedTopLeft_SouthFace, colorGreenTopLeft_SouthFace, colorBlueTopLeft_SouthFace);
				tessellator.addVertexWithUV(d8, d9, d12, d3, d6);
			}else	
			if(iDir == 9){
				// Slope facing Down - South
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueYNegZPos)*(factorBottom+factorSouth)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueYNegZPos)*(factorBottom+factorSouth)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueYNegZPos)*(factorBottom+factorSouth)/4F);
				tessellator.addVertexWithUV(d13, d9, d12, d3, d6);                                                                                                                                                                                                                            
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueYNegZNeg)*(factorBottom+factorSouth)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueYNegZNeg)*(factorBottom+factorSouth)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueYNegZNeg)*(factorBottom+factorSouth)/4F);
				tessellator.addVertexWithUV(d13, d9, d11, d4, d6);                                                                                                                                                                                                                            
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXPos+aoLightValueXPosZNeg)*(factorBottom+factorSouth)/4F, colorGreenSlopes*(aoLightValueXPos+aoLightValueXPosZNeg)*(factorBottom+factorSouth)/4F, colorBlueSlopes*(aoLightValueXPos+aoLightValueXPosZNeg)*(factorBottom+factorSouth)/4F);
				tessellator.addVertexWithUV(d8, d10, d11, d4, d5);                                                                                                                                                                                                                            
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXPos+aoLightValueXPosZPos)*(factorBottom+factorSouth)/4F, colorGreenSlopes*(aoLightValueXPos+aoLightValueXPosZPos)*(factorBottom+factorSouth)/4F, colorBlueSlopes*(aoLightValueXPos+aoLightValueXPosZPos)*(factorBottom+factorSouth)/4F);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d5);		
			} else	
			if(iDir == 10){
				// Triangle Up pointing east
				tessellator.setColorOpaque_F(colorRedTopLeft_SouthFace, colorGreenTopLeft_SouthFace, colorBlueTopLeft_SouthFace);
				tessellator.addVertexWithUV(d8, d9, d12, d3, d6);
				tessellator.setColorOpaque_F(colorRedBottomRight_SouthFace, colorGreenBottomRight_SouthFace, colorBlueBottomRight_SouthFace);
				tessellator.addVertexWithUV(d8, d10, d11, d4, d5);
				tessellator.setColorOpaque_F(colorRedBottomRight_SouthFace, colorGreenBottomRight_SouthFace, colorBlueBottomRight_SouthFace);
				tessellator.addVertexWithUV(d8, d10, d11, d4, d5);
				tessellator.setColorOpaque_F(colorRedTopRight_SouthFace, colorGreenTopRight_SouthFace, colorBlueTopRight_SouthFace);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d5);			
			} else		
			if(iDir == 11){
				// Triangle Up pointing west
				tessellator.setColorOpaque_F(colorRedTopRight_SouthFace, colorGreenTopRight_SouthFace, colorBlueTopRight_SouthFace);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d5);
				tessellator.setColorOpaque_F(colorRedBottomLeft_SouthFace, colorGreenBottomLeft_SouthFace, colorBlueBottomLeft_SouthFace);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.setColorOpaque_F(colorRedBottomRight_SouthFace, colorGreenBottomRight_SouthFace, colorBlueBottomRight_SouthFace);
				tessellator.addVertexWithUV(d8, d10, d11, d4, d5);
				tessellator.setColorOpaque_F(colorRedTopRight_SouthFace, colorGreenTopRight_SouthFace, colorBlueTopRight_SouthFace);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d5);				
			}else	
			if(iDir == 14){
				// Side Slope facing South - East
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXPos+aoLightValueXPosYNeg)*(factorEast+factorSouth)/4F, colorGreenSlopes*(aoLightValueXPos+aoLightValueXPosYNeg)*(factorEast+factorSouth)/4F, colorBlueSlopes*(aoLightValueXPos+aoLightValueXPosYNeg)*(factorEast+factorSouth)/4F);
				tessellator.addVertexWithUV(d8, d9, d12, d3, d6);                                                                                                                                                                                                                         
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueZNeg+aoLightValueYNegZNeg)*(factorEast+factorSouth)/4F, colorGreenSlopes*(aoLightValueZNeg+aoLightValueYNegZNeg)*(factorEast+factorSouth)/4F, colorBlueSlopes*(aoLightValueZNeg+aoLightValueYNegZNeg)*(factorEast+factorSouth)/4F);
				tessellator.addVertexWithUV(d13, d9, d11, d4, d6);                                                                                                                                                                                                                       
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueZNeg+aoLightValueYPosZNeg)*(factorEast+factorSouth)/4F, colorGreenSlopes*(aoLightValueZNeg+aoLightValueYPosZNeg)*(factorEast+factorSouth)/4F, colorBlueSlopes*(aoLightValueZNeg+aoLightValueYPosZNeg)*(factorEast+factorSouth)/4F);
				tessellator.addVertexWithUV(d13, d10, d11, d4, d5);                                                                                                                                                                                                                       
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXPos+aoLightValueXPosYPos)*(factorEast+factorSouth)/4F, colorGreenSlopes*(aoLightValueXPos+aoLightValueXPosYPos)*(factorEast+factorSouth)/4F, colorBlueSlopes*(aoLightValueXPos+aoLightValueXPosYPos)*(factorEast+factorSouth)/4F);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d5);		
			}     
		} else
		{
			if(iDir == 4 || iDir == 8 || iDir == 12 || iDir == 15){
				// Standard
				tessellator.addVertexWithUV(d8, d9, d12, d3, d6);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.addVertexWithUV(d8, d10, d11, d4, d5);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d5);		
			} else	
			if(iDir == 5){
				// Slope Down
				tessellator.addVertexWithUV(d8, d9, d12, d3, d6);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.addVertexWithUV(d13, d10, d11, d4, d5);
				tessellator.addVertexWithUV(d13, d10, d12, d3, d5);		
			} else	
			if(iDir == 6){
				// Triangle Down pointing east
				tessellator.addVertexWithUV(d8, d9, d12, d3, d6);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d5);			
			} else		
			if(iDir == 7){
				// Triangle Down pointing west
				tessellator.addVertexWithUV(d8, d9, d12, d3, d6);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.addVertexWithUV(d8, d10, d11, d4, d5);
				tessellator.addVertexWithUV(d8, d9, d12, d3, d6);
			}else	
			if(iDir == 9){
				// Slope Up
				tessellator.addVertexWithUV(d13, d9, d12, d3, d6);
				tessellator.addVertexWithUV(d13, d9, d11, d4, d6);
				tessellator.addVertexWithUV(d8, d10, d11, d4, d5);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d5);		
			} else	
			if(iDir == 10){
				// Triangle Up pointing east
				tessellator.addVertexWithUV(d8, d9, d12, d3, d6);
				tessellator.addVertexWithUV(d8, d10, d11, d4, d5);
				tessellator.addVertexWithUV(d8, d10, d11, d4, d5);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d5);			
			} else		
			if(iDir == 11){
				// Triangle Up pointing west
				tessellator.addVertexWithUV(d8, d10, d12, d3, d5);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.addVertexWithUV(d8, d10, d11, d4, d5);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d5);				
			}else	
			if(iDir == 14){
				// Side Slope
				tessellator.addVertexWithUV(d8, d9, d12, d3, d6);
				tessellator.addVertexWithUV(d13, d9, d11, d4, d6);
				tessellator.addVertexWithUV(d13, d10, d11, d4, d5);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d5);		
			} 		
		}
    }

    @Override
	public String getVersion() {
		return "1.2.4 Infi";
	}

	@Override
	public void load() {
		// TODO Auto-generated method stub
		
	}
	
	//@Override
	public boolean clientSideRequired() 
	{
		return true;
	}

	//@Override
	public boolean serverSideRequired() 
	{
		return true;
	}
}