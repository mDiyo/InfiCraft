package net.minecraft.src;
import net.minecraft.client.Minecraft;
import net.minecraft.src.forge.NetworkMod;
import net.minecraft.src.superslopes.BlockCorners_Kaevator;
import net.minecraft.src.superslopes.ItemCorners_Kaevator;
import net.minecraft.src.superslopes.KrushProps;

import org.lwjgl.opengl.GL11;
import java.io.File;

public class mod_Kaevator_Corners extends BaseMod
{		
	public static void prepareProps()
    { 
		props.getInt("Slopes_Opacity", 0);
		props.getInt("BlockKaevWoodCorners", 182);
		props.getInt("BlockKaevCobblestoneCorners", 183);
		props.getInt("BlockKaevGlassCorners", 184);
		props.getInt("BlockKaevSandstoneCorners", 185);
		props.getInt("BlockKaevDirtCorners", 186);
		props.getInt("BlockKaevStoneCorners", 187);
		props.getInt("BlockKaevSandCorners", 188);
		props.getInt("BlockKaevSnowCorners", 189);
		props.getInt("BlockKaevGrassCorners", 190);
		props.getInt("BlockKaevBricksCorners", 191);
		props.getInt("BlockKaevGravelCorners", 192);
		props.getInt("BlockKaevGoldCorners", 193);
		props.getInt("BlockKaevSteelCorners", 194);
		props.getInt("BlockKaevObsidianCorners", 195);
		props.getInt("BlockKaevDiamondCorners", 196);
		props.getInt("BlockKaevWhiteWoolCorners", 0);
		props.getInt("BlockKaevBlackWoolCorners", 0);
		props.getInt("BlockKaevRedWoolCorners", 0);
		props.getInt("BlockKaevGreenWoolCorners", 0);
		props.getInt("BlockKaevBrownWoolCorners", 0);
		props.getInt("BlockKaevBlueWoolCorners", 0);
		props.getInt("BlockKaevPurpleWoolCorners", 0);
		props.getInt("BlockKaevCyanWoolCorners", 0);
		props.getInt("BlockKaevSilverWoolCorners", 0);
		props.getInt("BlockKaevGrayWoolCorners", 0);
		props.getInt("BlockKaevPinkWoolCorners", 0);
		props.getInt("BlockKaevLimeWoolCorners", 0);
		props.getInt("BlockKaevYellowWoolCorners", 0);
		props.getInt("BlockKaevLightBlueWoolCorners", 0);
		props.getInt("BlockKaevMagentaWoolCorners", 0);
		props.getInt("BlockKaevOrangeWoolCorners", 0);
    }
	
	public mod_Kaevator_Corners()
    {		
		CornersRenderID = ModLoader.getUniqueBlockModelID(this, true);		
		
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
		
		ModLoader.addLocalization("KaevWoodSlopesQuadriCornerDown.name", "wooden sloped angle");
		ModLoader.addLocalization("KaevWoodSlopesQuadriCornerUp.name", "wooden ceiling angle");
		ModLoader.addLocalization("KaevWoodSlopesTriCornerDown.name", "wooden slanted corner");
		ModLoader.addLocalization("KaevWoodSlopesTriCornerUp.name", "wooden slanted corner");

		ModLoader.addLocalization("KaevCobblestoneSlopesQuadriCornerDown.name", "cobblestone sloped angle");
		ModLoader.addLocalization("KaevCobblestoneSlopesQuadriCornerUp.name", "cobblestone ceiling angle");
		ModLoader.addLocalization("KaevCobblestoneSlopesTriCornerDown.name", "cobblestone slanted corner");
		ModLoader.addLocalization("KaevCobblestoneSlopesTriCornerUp.name", "cobblestone slanted corner");

		ModLoader.addLocalization("KaevGlassSlopesQuadriCornerDown.name", "glass sloped angle");
		ModLoader.addLocalization("KaevGlassSlopesQuadriCornerUp.name", "glass ceiling angle");
		ModLoader.addLocalization("KaevGlassSlopesTriCornerDown.name", "glass slanted corner");
		ModLoader.addLocalization("KaevGlassSlopesTriCornerUp.name", "glass slanted corner");

		ModLoader.addLocalization("KaevSandstoneSlopesQuadriCornerDown.name", "sandstone sloped angle");
		ModLoader.addLocalization("KaevSandstoneSlopesQuadriCornerUp.name", "sandstone ceiling angle");
		ModLoader.addLocalization("KaevSandstoneSlopesTriCornerDown.name", "sandstone slanted corner");
		ModLoader.addLocalization("KaevSandstoneSlopesTriCornerUp.name", "sandstone slanted corner");

		ModLoader.addLocalization("KaevDirtSlopesQuadriCornerDown.name", "dirt sloped angle");
		ModLoader.addLocalization("KaevDirtSlopesQuadriCornerUp.name", "dirt ceiling angle");
		ModLoader.addLocalization("KaevDirtSlopesTriCornerDown.name", "dirt slanted corner");
		ModLoader.addLocalization("KaevDirtSlopesTriCornerUp.name", "dirt slanted corner");

		ModLoader.addLocalization("KaevStoneSlopesQuadriCornerDown.name", "stone sloped angle");
		ModLoader.addLocalization("KaevStoneSlopesQuadriCornerUp.name", "stone ceiling angle");
		ModLoader.addLocalization("KaevStoneSlopesTriCornerDown.name", "stone slanted corner");
		ModLoader.addLocalization("KaevStoneSlopesTriCornerUp.name", "stone slanted corner");

		ModLoader.addLocalization("KaevSandSlopesQuadriCornerDown.name", "sand sloped angle");
		ModLoader.addLocalization("KaevSandSlopesQuadriCornerUp.name", "sand ceiling angle");
		ModLoader.addLocalization("KaevSandSlopesTriCornerDown.name", "sand slanted corner");
		ModLoader.addLocalization("KaevSandSlopesTriCornerUp.name", "sand slanted corner");

		ModLoader.addLocalization("KaevSnowSlopesQuadriCornerDown.name", "snow sloped angle");
		ModLoader.addLocalization("KaevSnowSlopesQuadriCornerUp.name", "snow ceiling angle");
		ModLoader.addLocalization("KaevSnowSlopesTriCornerDown.name", "snow slanted corner");
		ModLoader.addLocalization("KaevSnowSlopesTriCornerUp.name", "snow slanted corner");

		ModLoader.addLocalization("KaevGrassSlopesQuadriCornerDown.name", "grass sloped angle");
		ModLoader.addLocalization("KaevGrassSlopesQuadriCornerUp.name", "grass ceiling angle");
		ModLoader.addLocalization("KaevGrassSlopesTriCornerDown.name", "grass slanted corner");
		ModLoader.addLocalization("KaevGrassSlopesTriCornerUp.name", "grass slanted corner");

		ModLoader.addLocalization("KaevBricksSlopesQuadriCornerDown.name", "bricks sloped angle");
		ModLoader.addLocalization("KaevBricksSlopesQuadriCornerUp.name", "bricks ceiling angle");
		ModLoader.addLocalization("KaevBricksSlopesTriCornerDown.name", "bricks slanted corner");
		ModLoader.addLocalization("KaevBricksSlopesTriCornerUp.name", "bricks slanted corner");

		ModLoader.addLocalization("KaevGravelSlopesQuadriCornerDown.name", "gravel sloped angle");
		ModLoader.addLocalization("KaevGravelSlopesQuadriCornerUp.name", "gravel ceiling angle");
		ModLoader.addLocalization("KaevGravelSlopesTriCornerDown.name", "gravel slanted corner");
		ModLoader.addLocalization("KaevGravelSlopesTriCornerUp.name", "gravel slanted corner");

		ModLoader.addLocalization("KaevGoldSlopesQuadriCornerDown.name", "golden sloped angle");
		ModLoader.addLocalization("KaevGoldSlopesQuadriCornerUp.name", "golden ceiling angle");
		ModLoader.addLocalization("KaevGoldSlopesTriCornerDown.name", "golden slanted corner");
		ModLoader.addLocalization("KaevGoldSlopesTriCornerUp.name", "golden slanted corner");

		ModLoader.addLocalization("KaevSteelSlopesQuadriCornerDown.name", "steel sloped angle");
		ModLoader.addLocalization("KaevSteelSlopesQuadriCornerUp.name", "steel ceiling angle");
		ModLoader.addLocalization("KaevSteelSlopesTriCornerDown.name", "steel slanted corner");
		ModLoader.addLocalization("KaevSteelSlopesTriCornerUp.name", "steel slanted corner");

		ModLoader.addLocalization("KaevObsidianSlopesQuadriCornerDown.name", "obsidian sloped angle");
		ModLoader.addLocalization("KaevObsidianSlopesQuadriCornerUp.name", "obsidian ceiling angle");
		ModLoader.addLocalization("KaevObsidianSlopesTriCornerDown.name", "obsidian slanted corner");
		ModLoader.addLocalization("KaevObsidianSlopesTriCornerUp.name", "obsidian slanted corner");

		ModLoader.addLocalization("KaevDiamondSlopesQuadriCornerDown.name", "diamond sloped angle");
		ModLoader.addLocalization("KaevDiamondSlopesQuadriCornerUp.name", "diamond ceiling angle");
		ModLoader.addLocalization("KaevDiamondSlopesTriCornerDown.name", "diamond slanted corner");
		ModLoader.addLocalization("KaevDiamondSlopesTriCornerUp.name", "diamond slanted corner");	
		
		ModLoader.addLocalization("KaevWhiteWoolSlopesQuadriCornerDown.name", "white sloped angle");
		ModLoader.addLocalization("KaevWhiteWoolSlopesQuadriCornerUp.name", "white ceiling angle");
		ModLoader.addLocalization("KaevWhiteWoolSlopesTriCornerDown.name", "white slanted corner");
		ModLoader.addLocalization("KaevWhiteWoolSlopesTriCornerUp.name", "white slanted corner");

		ModLoader.addLocalization("KaevBlackWoolSlopesQuadriCornerDown.name", "black sloped angle");
		ModLoader.addLocalization("KaevBlackWoolSlopesQuadriCornerUp.name", "black ceiling angle");
		ModLoader.addLocalization("KaevBlackWoolSlopesTriCornerDown.name", "black slanted corner");
		ModLoader.addLocalization("KaevBlackWoolSlopesTriCornerUp.name", "black slanted corner");

		ModLoader.addLocalization("KaevRedWoolSlopesQuadriCornerDown.name", "red sloped angle");
		ModLoader.addLocalization("KaevRedWoolSlopesQuadriCornerUp.name", "red ceiling angle");
		ModLoader.addLocalization("KaevRedWoolSlopesTriCornerDown.name", "red slanted corner");
		ModLoader.addLocalization("KaevRedWoolSlopesTriCornerUp.name", "red slanted corner");

		ModLoader.addLocalization("KaevGreenWoolSlopesQuadriCornerDown.name", "green sloped angle");
		ModLoader.addLocalization("KaevGreenWoolSlopesQuadriCornerUp.name", "green ceiling angle");
		ModLoader.addLocalization("KaevGreenWoolSlopesTriCornerDown.name", "green slanted corner");
		ModLoader.addLocalization("KaevGreenWoolSlopesTriCornerUp.name", "green slanted corner");

		ModLoader.addLocalization("KaevBrownWoolSlopesQuadriCornerDown.name", "brown sloped angle");
		ModLoader.addLocalization("KaevBrownWoolSlopesQuadriCornerUp.name", "brown ceiling angle");
		ModLoader.addLocalization("KaevBrownWoolSlopesTriCornerDown.name", "brown slanted corner");
		ModLoader.addLocalization("KaevBrownWoolSlopesTriCornerUp.name", "brown slanted corner");

		ModLoader.addLocalization("KaevBlueWoolSlopesQuadriCornerDown.name", "blue sloped angle");
		ModLoader.addLocalization("KaevBlueWoolSlopesQuadriCornerUp.name", "blue ceiling angle");
		ModLoader.addLocalization("KaevBlueWoolSlopesTriCornerDown.name", "blue slanted corner");
		ModLoader.addLocalization("KaevBlueWoolSlopesTriCornerUp.name", "blue slanted corner");

		ModLoader.addLocalization("KaevPurpleWoolSlopesQuadriCornerDown.name", "purple sloped angle");
		ModLoader.addLocalization("KaevPurpleWoolSlopesQuadriCornerUp.name", "purple ceiling angle");
		ModLoader.addLocalization("KaevPurpleWoolSlopesTriCornerDown.name", "purple slanted corner");
		ModLoader.addLocalization("KaevPurpleWoolSlopesTriCornerUp.name", "purple slanted corner");

		ModLoader.addLocalization("KaevCyanWoolSlopesQuadriCornerDown.name", "cyan sloped angle");
		ModLoader.addLocalization("KaevCyanWoolSlopesQuadriCornerUp.name", "cyan ceiling angle");
		ModLoader.addLocalization("KaevCyanWoolSlopesTriCornerDown.name", "cyan slanted corner");
		ModLoader.addLocalization("KaevCyanWoolSlopesTriCornerUp.name", "cyan slanted corner");

		ModLoader.addLocalization("KaevSilverWoolSlopesQuadriCornerDown.name", "silver sloped angle");
		ModLoader.addLocalization("KaevSilverWoolSlopesQuadriCornerUp.name", "silver ceiling angle");
		ModLoader.addLocalization("KaevSilverWoolSlopesTriCornerDown.name", "silver slanted corner");
		ModLoader.addLocalization("KaevSilverWoolSlopesTriCornerUp.name", "silver slanted corner");

		ModLoader.addLocalization("KaevGrayWoolSlopesQuadriCornerDown.name", "gray sloped angle");
		ModLoader.addLocalization("KaevGrayWoolSlopesQuadriCornerUp.name", "gray ceiling angle");
		ModLoader.addLocalization("KaevGrayWoolSlopesTriCornerDown.name", "gray slanted corner");
		ModLoader.addLocalization("KaevGrayWoolSlopesTriCornerUp.name", "gray slanted corner");

		ModLoader.addLocalization("KaevPinkWoolSlopesQuadriCornerDown.name", "pink sloped angle");
		ModLoader.addLocalization("KaevPinkWoolSlopesQuadriCornerUp.name", "pink ceiling angle");
		ModLoader.addLocalization("KaevPinkWoolSlopesTriCornerDown.name", "pink slanted corner");
		ModLoader.addLocalization("KaevPinkWoolSlopesTriCornerUp.name", "pink slanted corner");

		ModLoader.addLocalization("KaevLimeWoolSlopesQuadriCornerDown.name", "lime sloped angle");
		ModLoader.addLocalization("KaevLimeWoolSlopesQuadriCornerUp.name", "lime ceiling angle");
		ModLoader.addLocalization("KaevLimeWoolSlopesTriCornerDown.name", "lime slanted corner");
		ModLoader.addLocalization("KaevLimeWoolSlopesTriCornerUp.name", "lime slanted corner");

		ModLoader.addLocalization("KaevYellowWoolSlopesQuadriCornerDown.name", "yellow sloped angle");
		ModLoader.addLocalization("KaevYellowWoolSlopesQuadriCornerUp.name", "yellow ceiling angle");
		ModLoader.addLocalization("KaevYellowWoolSlopesTriCornerDown.name", "yellow slanted corner");
		ModLoader.addLocalization("KaevYellowWoolSlopesTriCornerUp.name", "yellow slanted corner");

		ModLoader.addLocalization("KaevLightBlueWoolSlopesQuadriCornerDown.name", "lightBlue sloped angle");
		ModLoader.addLocalization("KaevLightBlueWoolSlopesQuadriCornerUp.name", "lightBlue ceiling angle");
		ModLoader.addLocalization("KaevLightBlueWoolSlopesTriCornerDown.name", "lightBlue slanted corner");
		ModLoader.addLocalization("KaevLightBlueWoolSlopesTriCornerUp.name", "lightBlue slanted corner");

		ModLoader.addLocalization("KaevMagentaWoolSlopesQuadriCornerDown.name", "magenta sloped angle");
		ModLoader.addLocalization("KaevMagentaWoolSlopesQuadriCornerUp.name", "magenta ceiling angle");
		ModLoader.addLocalization("KaevMagentaWoolSlopesTriCornerDown.name", "magenta slanted corner");
		ModLoader.addLocalization("KaevMagentaWoolSlopesTriCornerUp.name", "magenta slanted corner");

		ModLoader.addLocalization("KaevOrangeWoolSlopesQuadriCornerDown.name", "orange sloped angle");
		ModLoader.addLocalization("KaevOrangeWoolSlopesQuadriCornerUp.name", "orange ceiling angle");
		ModLoader.addLocalization("KaevOrangeWoolSlopesTriCornerDown.name", "orange slanted corner");
		ModLoader.addLocalization("KaevOrangeWoolSlopesTriCornerUp.name", "orange slanted corner");

		if(props.getInt("BlockKaevWoodCorners") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevWoodCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {
				" # ", "###", Character.valueOf('#'), Block.planks
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevWoodCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {
				"###", " # ", Character.valueOf('#'), Block.planks
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevWoodCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {
				" # ", " # ", "###", Character.valueOf('#'), Block.planks
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevWoodCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {
				"###", " # ", " # ", Character.valueOf('#'), Block.planks
			});	
			ModLoader.addRecipe(new ItemStack(Block.planks, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevWoodCorners
			});	
		}

		if(props.getInt("BlockKaevCobblestoneCorners") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevCobblestoneCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {
				" # ", "###", Character.valueOf('#'), Block.cobblestone
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevCobblestoneCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {
				"###", " # ", Character.valueOf('#'), Block.cobblestone
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevCobblestoneCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {
				" # ", " # ", "###", Character.valueOf('#'), Block.cobblestone
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevCobblestoneCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {
				"###", " # ", " # ", Character.valueOf('#'), Block.cobblestone
			});	
			ModLoader.addRecipe(new ItemStack(Block.cobblestone, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevCobblestoneCorners
			});	
		}

		if(props.getInt("BlockKaevGlassCorners") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevGlassCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {
				" # ", "###", Character.valueOf('#'), Block.glass
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevGlassCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {
				"###", " # ", Character.valueOf('#'), Block.glass
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevGlassCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {
				" # ", " # ", "###", Character.valueOf('#'), Block.glass
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevGlassCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {
				"###", " # ", " # ", Character.valueOf('#'), Block.glass
			});	
			ModLoader.addRecipe(new ItemStack(Block.glass, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevGlassCorners
			});	
		}

		if(props.getInt("BlockKaevSandstoneCorners") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevSandstoneCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {
				" # ", "###", Character.valueOf('#'), Block.sandStone
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevSandstoneCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {
				"###", " # ", Character.valueOf('#'), Block.sandStone
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevSandstoneCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {
				" # ", " # ", "###", Character.valueOf('#'), Block.sandStone
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevSandstoneCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {
				"###", " # ", " # ", Character.valueOf('#'), Block.sandStone
			});	
			ModLoader.addRecipe(new ItemStack(Block.sandStone, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevSandstoneCorners
			});	
		}

		if(props.getInt("BlockKaevDirtCorners") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevDirtCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {
				" # ", "###", Character.valueOf('#'), Block.dirt
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevDirtCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {
				"###", " # ", Character.valueOf('#'), Block.dirt
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevDirtCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {
				" # ", " # ", "###", Character.valueOf('#'), Block.dirt
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevDirtCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {
				"###", " # ", " # ", Character.valueOf('#'), Block.dirt
			});	
			ModLoader.addRecipe(new ItemStack(Block.dirt, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevDirtCorners
			});	
		}

		if(props.getInt("BlockKaevStoneCorners") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevStoneCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {
				" # ", "###", Character.valueOf('#'), Block.stone
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevStoneCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {
				"###", " # ", Character.valueOf('#'), Block.stone
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevStoneCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {
				" # ", " # ", "###", Character.valueOf('#'), Block.stone
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevStoneCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {
				"###", " # ", " # ", Character.valueOf('#'), Block.stone
			});	
			ModLoader.addRecipe(new ItemStack(Block.stone, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevStoneCorners
			});	
		}

		if(props.getInt("BlockKaevSandCorners") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevSandCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {
				" # ", "###", Character.valueOf('#'), Block.sand
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevSandCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {
				"###", " # ", Character.valueOf('#'), Block.sand
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevSandCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {
				" # ", " # ", "###", Character.valueOf('#'), Block.sand
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevSandCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {
				"###", " # ", " # ", Character.valueOf('#'), Block.sand
			});	
			ModLoader.addRecipe(new ItemStack(Block.sand, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevSandCorners
			});	
		}

		if(props.getInt("BlockKaevSnowCorners") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevSnowCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {
				" # ", "###", Character.valueOf('#'), Block.blockSnow
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevSnowCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {
				"###", " # ", Character.valueOf('#'), Block.blockSnow
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevSnowCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {
				" # ", " # ", "###", Character.valueOf('#'), Block.blockSnow
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevSnowCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {
				"###", " # ", " # ", Character.valueOf('#'), Block.blockSnow
			});	
			ModLoader.addRecipe(new ItemStack(Block.blockSnow, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevSnowCorners
			});	
		}

		if(props.getInt("BlockKaevGrassCorners") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevGrassCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {
				" # ", "###", Character.valueOf('#'), Block.grass
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevGrassCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {
				"###", " # ", Character.valueOf('#'), Block.grass
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevGrassCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {
				" # ", " # ", "###", Character.valueOf('#'), Block.grass
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevGrassCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {
				"###", " # ", " # ", Character.valueOf('#'), Block.grass
			});	
			ModLoader.addRecipe(new ItemStack(Block.grass, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevGrassCorners
			});	
		}

		if(props.getInt("BlockKaevBricksCorners") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevBricksCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {
				" # ", "###", Character.valueOf('#'), Block.brick
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevBricksCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {
				"###", " # ", Character.valueOf('#'), Block.brick
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevBricksCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {
				" # ", " # ", "###", Character.valueOf('#'), Block.brick
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevBricksCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {
				"###", " # ", " # ", Character.valueOf('#'), Block.brick
			});	
			ModLoader.addRecipe(new ItemStack(Block.brick, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevBricksCorners
			});	
		}

		if(props.getInt("BlockKaevGravelCorners") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevGravelCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {
				" # ", "###", Character.valueOf('#'), Block.gravel
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevGravelCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {
				"###", " # ", Character.valueOf('#'), Block.gravel
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevGravelCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {
				" # ", " # ", "###", Character.valueOf('#'), Block.gravel
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevGravelCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {
				"###", " # ", " # ", Character.valueOf('#'), Block.gravel
			});	
			ModLoader.addRecipe(new ItemStack(Block.gravel, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevGravelCorners
			});	
		}

		if(props.getInt("BlockKaevGoldCorners") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevGoldCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {
				" # ", "###", Character.valueOf('#'), Block.blockGold
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevGoldCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {
				"###", " # ", Character.valueOf('#'), Block.blockGold
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevGoldCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {
				" # ", " # ", "###", Character.valueOf('#'), Block.blockGold
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevGoldCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {
				"###", " # ", " # ", Character.valueOf('#'), Block.blockGold
			});	
			ModLoader.addRecipe(new ItemStack(Block.blockGold, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevGoldCorners
			});	
		}

		if(props.getInt("BlockKaevSteelCorners") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevSteelCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {
				" # ", "###", Character.valueOf('#'), Block.blockSteel
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevSteelCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {
				"###", " # ", Character.valueOf('#'), Block.blockSteel
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevSteelCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {
				" # ", " # ", "###", Character.valueOf('#'), Block.blockSteel
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevSteelCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {
				"###", " # ", " # ", Character.valueOf('#'), Block.blockSteel
			});	
			ModLoader.addRecipe(new ItemStack(Block.blockSteel, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevSteelCorners
			});	
		}

		if(props.getInt("BlockKaevObsidianCorners") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevObsidianCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {
				" # ", "###", Character.valueOf('#'), Block.obsidian
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevObsidianCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {
				"###", " # ", Character.valueOf('#'), Block.obsidian
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevObsidianCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {
				" # ", " # ", "###", Character.valueOf('#'), Block.obsidian
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevObsidianCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {
				"###", " # ", " # ", Character.valueOf('#'), Block.obsidian
			});	
			ModLoader.addRecipe(new ItemStack(Block.obsidian, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevObsidianCorners
			});	
		}

		if(props.getInt("BlockKaevDiamondCorners") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevDiamondCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {
				" # ", "###", Character.valueOf('#'), Block.blockDiamond
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevDiamondCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {
				"###", " # ", Character.valueOf('#'), Block.blockDiamond
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevDiamondCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {
				" # ", " # ", "###", Character.valueOf('#'), Block.blockDiamond
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevDiamondCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {
				"###", " # ", " # ", Character.valueOf('#'), Block.blockDiamond
			});	
			ModLoader.addRecipe(new ItemStack(Block.blockDiamond, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevDiamondCorners
			});	
		}
		
		if(props.getInt("BlockKaevWhiteWoolCorners") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevWhiteWoolCorners, 4, BlockCorners_Kaevator.func_21035_d(0)), new Object[] {
			    " # ", "###", Character.valueOf('#'), Block.cloth
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevWhiteWoolCorners, 4, BlockCorners_Kaevator.func_21035_d(4)), new Object[] {
			    "###", " # ", Character.valueOf('#'), Block.cloth
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevWhiteWoolCorners, 4, BlockCorners_Kaevator.func_21035_d(8)), new Object[] {
			    " # ", " # ", "###", Character.valueOf('#'), Block.cloth
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevWhiteWoolCorners, 4, BlockCorners_Kaevator.func_21035_d(12)), new Object[] {
			    "###", " # ", " # ", Character.valueOf('#'), Block.cloth
			});	
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 0), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevWhiteWoolCorners
			});	
		}

		if(props.getInt("BlockKaevBlackWoolCorners") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 15), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevBlackWoolCorners
			});	
		}

		if(props.getInt("BlockKaevRedWoolCorners") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 14), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevRedWoolCorners
			});	
		}

		if(props.getInt("BlockKaevGreenWoolCorners") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 13), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevGreenWoolCorners
			});	
		}

		if(props.getInt("BlockKaevBrownWoolCorners") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 12), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevBrownWoolCorners
			});	
		}

		if(props.getInt("BlockKaevBlueWoolCorners") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 11), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevBlueWoolCorners
			});	
		}

		if(props.getInt("BlockKaevPurpleWoolCorners") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 10), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevPurpleWoolCorners
			});	
		}

		if(props.getInt("BlockKaevCyanWoolCorners") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 9), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevCyanWoolCorners
			});	
		}

		if(props.getInt("BlockKaevSilverWoolCorners") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 8), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevSilverWoolCorners
			});	
		}

		if(props.getInt("BlockKaevGrayWoolCorners") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 7), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevGrayWoolCorners
			});	
		}

		if(props.getInt("BlockKaevPinkWoolCorners") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 6), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevPinkWoolCorners
			});	
		}

		if(props.getInt("BlockKaevLimeWoolCorners") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 5), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevLimeWoolCorners
			});	
		}

		if(props.getInt("BlockKaevYellowWoolCorners") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 4), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevYellowWoolCorners
			});	
		}

		if(props.getInt("BlockKaevLightBlueWoolCorners") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 3), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevLightBlueWoolCorners
			});	
		}

		if(props.getInt("BlockKaevMagentaWoolCorners") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 2), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevMagentaWoolCorners
			});	
		}

		if(props.getInt("BlockKaevOrangeWoolCorners") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 1), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevOrangeWoolCorners
			});	
		}
	}
	
	private static String getAppdata()
	{
		return Minecraft.getMinecraftDir().getPath();
	}		
	
	public static KrushProps props;	
	
	public static int CornersRenderID;
	public static int SlopesOpacity;	
	
	public static final Block BlockKaevWoodCorners;
	public static final Block BlockKaevCobblestoneCorners;
	public static final Block BlockKaevGlassCorners;
	public static final Block BlockKaevSandstoneCorners;
	public static final Block BlockKaevDirtCorners;
	public static final Block BlockKaevStoneCorners;
	public static final Block BlockKaevSandCorners;
	public static final Block BlockKaevSnowCorners;
	public static final Block BlockKaevGrassCorners;
	public static final Block BlockKaevBricksCorners;
	public static final Block BlockKaevGravelCorners;
	public static final Block BlockKaevGoldCorners;
	public static final Block BlockKaevSteelCorners;
	public static final Block BlockKaevObsidianCorners;
	public static final Block BlockKaevDiamondCorners;
	public static final Block BlockKaevWhiteWoolCorners;
	public static final Block BlockKaevBlackWoolCorners;
	public static final Block BlockKaevRedWoolCorners;
	public static final Block BlockKaevGreenWoolCorners;
	public static final Block BlockKaevBrownWoolCorners;
	public static final Block BlockKaevBlueWoolCorners;
	public static final Block BlockKaevPurpleWoolCorners;
	public static final Block BlockKaevCyanWoolCorners;
	public static final Block BlockKaevSilverWoolCorners;
	public static final Block BlockKaevGrayWoolCorners;
	public static final Block BlockKaevPinkWoolCorners;
	public static final Block BlockKaevLimeWoolCorners;
	public static final Block BlockKaevYellowWoolCorners;
	public static final Block BlockKaevLightBlueWoolCorners;
	public static final Block BlockKaevMagentaWoolCorners;
	public static final Block BlockKaevOrangeWoolCorners;

	public static Item ItemKaevWoodCorners;
	public static Item ItemKaevCobblestoneCorners;
	public static Item ItemKaevGlassCorners;
	public static Item ItemKaevSandstoneCorners;
	public static Item ItemKaevDirtCorners;
	public static Item ItemKaevStoneCorners;
	public static Item ItemKaevSandCorners;
	public static Item ItemKaevSnowCorners;
	public static Item ItemKaevGrassCorners;
	public static Item ItemKaevBricksCorners;
	public static Item ItemKaevGravelCorners;
	public static Item ItemKaevGoldCorners;
	public static Item ItemKaevSteelCorners;
	public static Item ItemKaevObsidianCorners;
	public static Item ItemKaevDiamondCorners;
	public static Item ItemKaevWhiteWoolCorners;
	public static Item ItemKaevBlackWoolCorners;
	public static Item ItemKaevRedWoolCorners;
	public static Item ItemKaevGreenWoolCorners;
	public static Item ItemKaevBrownWoolCorners;
	public static Item ItemKaevBlueWoolCorners;
	public static Item ItemKaevPurpleWoolCorners;
	public static Item ItemKaevCyanWoolCorners;
	public static Item ItemKaevSilverWoolCorners;
	public static Item ItemKaevGrayWoolCorners;
	public static Item ItemKaevPinkWoolCorners;
	public static Item ItemKaevLimeWoolCorners;
	public static Item ItemKaevYellowWoolCorners;
	public static Item ItemKaevLightBlueWoolCorners;
	public static Item ItemKaevMagentaWoolCorners;
	public static Item ItemKaevOrangeWoolCorners;
	
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
		
		if(props.getInt("BlockKaevWoodCorners") != 0){
			BlockKaevWoodCorners = new BlockCorners_Kaevator(props.getInt("BlockKaevWoodCorners"),4,Material.wood).setHardness(2.0F).setStepSound(Block.soundWoodFootstep).setResistance(5F).setBlockName("BlockKaevWoodCorners");
			ItemKaevWoodCorners = new ItemCorners_Kaevator(BlockKaevWoodCorners.blockID - 256, "Wood").setItemName("ItemKaevWoodCorners");
		}else{
			BlockKaevWoodCorners = Block.stone;
		}
		if(props.getInt("BlockKaevCobblestoneCorners") != 0){
			BlockKaevCobblestoneCorners = new BlockCorners_Kaevator(props.getInt("BlockKaevCobblestoneCorners"),16,Material.rock).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setResistance(10F).setBlockName("BlockKaevCobblestoneCorners");
			ItemKaevCobblestoneCorners = new ItemCorners_Kaevator(BlockKaevCobblestoneCorners.blockID - 256, "Cobblestone").setItemName("ItemKaevCobblestoneCorners");
		}else{
			BlockKaevCobblestoneCorners = Block.stone;
		}
		if(props.getInt("BlockKaevGlassCorners") != 0){
			BlockKaevGlassCorners = new BlockCorners_Kaevator(props.getInt("BlockKaevGlassCorners"),49,Material.glass).setHardness(0.3F).setStepSound(Block.soundGlassFootstep).setBlockName("BlockKaevGlassCorners");
			ItemKaevGlassCorners = new ItemCorners_Kaevator(BlockKaevGlassCorners.blockID - 256, "Glass").setItemName("ItemKaevGlassCorners");
		}else{
			BlockKaevGlassCorners = Block.stone;
		}
		if(props.getInt("BlockKaevSandstoneCorners") != 0){
			BlockKaevSandstoneCorners = new BlockCorners_Kaevator(props.getInt("BlockKaevSandstoneCorners"),192,Material.rock).setHardness(0.8F).setStepSound(Block.soundStoneFootstep).setBlockName("BlockKaevSandstoneCorners");
			ItemKaevSandstoneCorners = new ItemCorners_Kaevator(BlockKaevSandstoneCorners.blockID - 256, "Sandstone").setItemName("ItemKaevSandstoneCorners");
		}else{
			BlockKaevSandstoneCorners = Block.stone;
		}
		if(props.getInt("BlockKaevDirtCorners") != 0){
			BlockKaevDirtCorners = new BlockCorners_Kaevator(props.getInt("BlockKaevDirtCorners"),2,Material.ground).setHardness(0.5F).setStepSound(Block.soundGravelFootstep).setBlockName("BlockKaevDirtCorners");
			ItemKaevDirtCorners = new ItemCorners_Kaevator(BlockKaevDirtCorners.blockID - 256, "Dirt").setItemName("ItemKaevDirtCorners");
		}else{
			BlockKaevDirtCorners = Block.stone;
		}
		if(props.getInt("BlockKaevStoneCorners") != 0){
			BlockKaevStoneCorners = new BlockCorners_Kaevator(props.getInt("BlockKaevStoneCorners"),1,Material.rock).setHardness(1.5F).setStepSound(Block.soundStoneFootstep).setResistance(10F).setBlockName("BlockKaevStoneCorners");
			ItemKaevStoneCorners = new ItemCorners_Kaevator(BlockKaevStoneCorners.blockID - 256, "Stone").setItemName("ItemKaevStoneCorners");
		}else{
			BlockKaevStoneCorners = Block.stone;
		}
		if(props.getInt("BlockKaevSandCorners") != 0){
			BlockKaevSandCorners = new BlockCorners_Kaevator(props.getInt("BlockKaevSandCorners"),18,Material.sand).setHardness(0.5F).setStepSound(Block.soundSandFootstep).setBlockName("BlockKaevSandCorners");
			ItemKaevSandCorners = new ItemCorners_Kaevator(BlockKaevSandCorners.blockID - 256, "Sand").setItemName("ItemKaevSandCorners");
		}else{
			BlockKaevSandCorners = Block.stone;
		}
		if(props.getInt("BlockKaevSnowCorners") != 0){
			BlockKaevSnowCorners = new BlockCorners_Kaevator(props.getInt("BlockKaevSnowCorners"),66,Material.snow).setHardness(0.1F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevSnowCorners");
			ItemKaevSnowCorners = new ItemCorners_Kaevator(BlockKaevSnowCorners.blockID - 256, "Snow").setItemName("ItemKaevSnowCorners");
		}else{
			BlockKaevSnowCorners = Block.stone;
		}
		if(props.getInt("BlockKaevGrassCorners") != 0){
			BlockKaevGrassCorners = new BlockCorners_Kaevator(props.getInt("BlockKaevGrassCorners"),3,Material.ground).setHardness(0.6F).setStepSound(Block.soundGrassFootstep).setBlockName("BlockKaevGrassCorners");
			ItemKaevGrassCorners = new ItemCorners_Kaevator(BlockKaevGrassCorners.blockID - 256, "Grass").setItemName("ItemKaevGrassCorners");
		}else{
			BlockKaevGrassCorners = Block.stone;
		}
		if(props.getInt("BlockKaevBricksCorners") != 0){
			BlockKaevBricksCorners = new BlockCorners_Kaevator(props.getInt("BlockKaevBricksCorners"),7,Material.rock).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setResistance(10F).setBlockName("BlockKaevBricksCorners");
			ItemKaevBricksCorners = new ItemCorners_Kaevator(BlockKaevBricksCorners.blockID - 256, "Bricks").setItemName("ItemKaevBricksCorners");
		}else{
			BlockKaevBricksCorners = Block.stone;
		}
		if(props.getInt("BlockKaevGravelCorners") != 0){
			BlockKaevGravelCorners = new BlockCorners_Kaevator(props.getInt("BlockKaevGravelCorners"),19,Material.sand).setHardness(0.6F).setStepSound(Block.soundGravelFootstep).setBlockName("BlockKaevGravelCorners");
			ItemKaevGravelCorners = new ItemCorners_Kaevator(BlockKaevGravelCorners.blockID - 256, "Gravel").setItemName("ItemKaevGravelCorners");
		}else{
			BlockKaevGravelCorners = Block.stone;
		}
		if(props.getInt("BlockKaevGoldCorners") != 0){
			BlockKaevGoldCorners = new BlockCorners_Kaevator(props.getInt("BlockKaevGoldCorners"),23,Material.iron).setHardness(3F).setStepSound(Block.soundMetalFootstep).setResistance(10F).setBlockName("BlockKaevGoldCorners");
			ItemKaevGoldCorners = new ItemCorners_Kaevator(BlockKaevGoldCorners.blockID - 256, "Gold").setItemName("ItemKaevGoldCorners");
		}else{
			BlockKaevGoldCorners = Block.stone;
		}
		if(props.getInt("BlockKaevSteelCorners") != 0){
			BlockKaevSteelCorners = new BlockCorners_Kaevator(props.getInt("BlockKaevSteelCorners"),22,Material.iron).setHardness(5F).setStepSound(Block.soundMetalFootstep).setResistance(10F).setBlockName("BlockKaevSteelCorners");
			ItemKaevSteelCorners = new ItemCorners_Kaevator(BlockKaevSteelCorners.blockID - 256, "Steel").setItemName("ItemKaevSteelCorners");
		}else{
			BlockKaevSteelCorners = Block.stone;
		}
		if(props.getInt("BlockKaevObsidianCorners") != 0){
			BlockKaevObsidianCorners = new BlockCorners_Kaevator(props.getInt("BlockKaevObsidianCorners"),37,Material.rock).setHardness(10F).setStepSound(Block.soundStoneFootstep).setResistance(2000F).setBlockName("BlockKaevObsidianCorners");
			ItemKaevObsidianCorners = new ItemCorners_Kaevator(BlockKaevObsidianCorners.blockID - 256, "Obsidian").setItemName("ItemKaevObsidianCorners");
		}else{
			BlockKaevObsidianCorners = Block.stone;
		}
		if(props.getInt("BlockKaevDiamondCorners") != 0){
			BlockKaevDiamondCorners = new BlockCorners_Kaevator(props.getInt("BlockKaevDiamondCorners"),24,Material.iron).setHardness(5F).setStepSound(Block.soundMetalFootstep).setResistance(10F).setBlockName("BlockKaevDiamondCorners");
			ItemKaevDiamondCorners = new ItemCorners_Kaevator(BlockKaevDiamondCorners.blockID - 256, "Diamond").setItemName("ItemKaevDiamondCorners");
		}else{
			BlockKaevDiamondCorners = Block.stone;
		}
		if(props.getInt("BlockKaevWhiteWoolCorners") != 0){
			BlockKaevWhiteWoolCorners = new BlockCorners_Kaevator(props.getInt("BlockKaevWhiteWoolCorners"),64,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevWhiteWoolCorners");
			ItemKaevWhiteWoolCorners = new ItemCorners_Kaevator(BlockKaevWhiteWoolCorners.blockID - 256, "WhiteWool").setItemName("ItemKaevWhiteWoolCorners");
		}else{
			BlockKaevWhiteWoolCorners = Block.stone;
		}
		if(props.getInt("BlockKaevBlackWoolCorners") != 0){
			BlockKaevBlackWoolCorners = new BlockCorners_Kaevator(props.getInt("BlockKaevBlackWoolCorners"),113,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevBlackWoolCorners");
			ItemKaevBlackWoolCorners = new ItemCorners_Kaevator(BlockKaevBlackWoolCorners.blockID - 256, "BlackWool").setItemName("ItemKaevBlackWoolCorners");
		}else{
			BlockKaevBlackWoolCorners = Block.stone;
		}
		if(props.getInt("BlockKaevRedWoolCorners") != 0){
			BlockKaevRedWoolCorners = new BlockCorners_Kaevator(props.getInt("BlockKaevRedWoolCorners"),129,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevRedWoolCorners");
			ItemKaevRedWoolCorners = new ItemCorners_Kaevator(BlockKaevRedWoolCorners.blockID - 256, "RedWool").setItemName("ItemKaevRedWoolCorners");
		}else{
			BlockKaevRedWoolCorners = Block.stone;
		}
		if(props.getInt("BlockKaevGreenWoolCorners") != 0){
			BlockKaevGreenWoolCorners = new BlockCorners_Kaevator(props.getInt("BlockKaevGreenWoolCorners"),145,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevGreenWoolCorners");
			ItemKaevGreenWoolCorners = new ItemCorners_Kaevator(BlockKaevGreenWoolCorners.blockID - 256, "GreenWool").setItemName("ItemKaevGreenWoolCorners");
		}else{
			BlockKaevGreenWoolCorners = Block.stone;
		}
		if(props.getInt("BlockKaevBrownWoolCorners") != 0){
			BlockKaevBrownWoolCorners = new BlockCorners_Kaevator(props.getInt("BlockKaevBrownWoolCorners"),161,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevBrownWoolCorners");
			ItemKaevBrownWoolCorners = new ItemCorners_Kaevator(BlockKaevBrownWoolCorners.blockID - 256, "BrownWool").setItemName("ItemKaevBrownWoolCorners");
		}else{
			BlockKaevBrownWoolCorners = Block.stone;
		}
		if(props.getInt("BlockKaevBlueWoolCorners") != 0){
			BlockKaevBlueWoolCorners = new BlockCorners_Kaevator(props.getInt("BlockKaevBlueWoolCorners"),177,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevBlueWoolCorners");
			ItemKaevBlueWoolCorners = new ItemCorners_Kaevator(BlockKaevBlueWoolCorners.blockID - 256, "BlueWool").setItemName("ItemKaevBlueWoolCorners");
		}else{
			BlockKaevBlueWoolCorners = Block.stone;
		}
		if(props.getInt("BlockKaevPurpleWoolCorners") != 0){
			BlockKaevPurpleWoolCorners = new BlockCorners_Kaevator(props.getInt("BlockKaevPurpleWoolCorners"),193,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevPurpleWoolCorners");
			ItemKaevPurpleWoolCorners = new ItemCorners_Kaevator(BlockKaevPurpleWoolCorners.blockID - 256, "PurpleWool").setItemName("ItemKaevPurpleWoolCorners");
		}else{
			BlockKaevPurpleWoolCorners = Block.stone;
		}
		if(props.getInt("BlockKaevCyanWoolCorners") != 0){
			BlockKaevCyanWoolCorners = new BlockCorners_Kaevator(props.getInt("BlockKaevCyanWoolCorners"),209,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevCyanWoolCorners");
			ItemKaevCyanWoolCorners = new ItemCorners_Kaevator(BlockKaevCyanWoolCorners.blockID - 256, "CyanWool").setItemName("ItemKaevCyanWoolCorners");
		}else{
			BlockKaevCyanWoolCorners = Block.stone;
		}
		if(props.getInt("BlockKaevSilverWoolCorners") != 0){
			BlockKaevSilverWoolCorners = new BlockCorners_Kaevator(props.getInt("BlockKaevSilverWoolCorners"),225,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevSilverWoolCorners");
			ItemKaevSilverWoolCorners = new ItemCorners_Kaevator(BlockKaevSilverWoolCorners.blockID - 256, "SilverWool").setItemName("ItemKaevSilverWoolCorners");
		}else{
			BlockKaevSilverWoolCorners = Block.stone;
		}
		if(props.getInt("BlockKaevGrayWoolCorners") != 0){
			BlockKaevGrayWoolCorners = new BlockCorners_Kaevator(props.getInt("BlockKaevGrayWoolCorners"),114,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevGrayWoolCorners");
			ItemKaevGrayWoolCorners = new ItemCorners_Kaevator(BlockKaevGrayWoolCorners.blockID - 256, "GrayWool").setItemName("ItemKaevGrayWoolCorners");
		}else{
			BlockKaevGrayWoolCorners = Block.stone;
		}
		if(props.getInt("BlockKaevPinkWoolCorners") != 0){
			BlockKaevPinkWoolCorners = new BlockCorners_Kaevator(props.getInt("BlockKaevPinkWoolCorners"),130,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevPinkWoolCorners");
			ItemKaevPinkWoolCorners = new ItemCorners_Kaevator(BlockKaevPinkWoolCorners.blockID - 256, "PinkWool").setItemName("ItemKaevPinkWoolCorners");
		}else{
			BlockKaevPinkWoolCorners = Block.stone;
		}
		if(props.getInt("BlockKaevLimeWoolCorners") != 0){
			BlockKaevLimeWoolCorners = new BlockCorners_Kaevator(props.getInt("BlockKaevLimeWoolCorners"),146,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevLimeWoolCorners");
			ItemKaevLimeWoolCorners = new ItemCorners_Kaevator(BlockKaevLimeWoolCorners.blockID - 256, "LimeWool").setItemName("ItemKaevLimeWoolCorners");
		}else{
			BlockKaevLimeWoolCorners = Block.stone;
		}
		if(props.getInt("BlockKaevYellowWoolCorners") != 0){
			BlockKaevYellowWoolCorners = new BlockCorners_Kaevator(props.getInt("BlockKaevYellowWoolCorners"),162,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevYellowWoolCorners");
			ItemKaevYellowWoolCorners = new ItemCorners_Kaevator(BlockKaevYellowWoolCorners.blockID - 256, "YellowWool").setItemName("ItemKaevYellowWoolCorners");
		}else{
			BlockKaevYellowWoolCorners = Block.stone;
		}
		if(props.getInt("BlockKaevLightBlueWoolCorners") != 0){
			BlockKaevLightBlueWoolCorners = new BlockCorners_Kaevator(props.getInt("BlockKaevLightBlueWoolCorners"),178,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevLightBlueWoolCorners");
			ItemKaevLightBlueWoolCorners = new ItemCorners_Kaevator(BlockKaevLightBlueWoolCorners.blockID - 256, "LightBlueWool").setItemName("ItemKaevLightBlueWoolCorners");
		}else{
			BlockKaevLightBlueWoolCorners = Block.stone;
		}
		if(props.getInt("BlockKaevMagentaWoolCorners") != 0){
			BlockKaevMagentaWoolCorners = new BlockCorners_Kaevator(props.getInt("BlockKaevMagentaWoolCorners"),194,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevMagentaWoolCorners");
			ItemKaevMagentaWoolCorners = new ItemCorners_Kaevator(BlockKaevMagentaWoolCorners.blockID - 256, "MagentaWool").setItemName("ItemKaevMagentaWoolCorners");
		}else{
			BlockKaevMagentaWoolCorners = Block.stone;
		}
		if(props.getInt("BlockKaevOrangeWoolCorners") != 0){
			BlockKaevOrangeWoolCorners = new BlockCorners_Kaevator(props.getInt("BlockKaevOrangeWoolCorners"),210,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevOrangeWoolCorners");
			ItemKaevOrangeWoolCorners = new ItemCorners_Kaevator(BlockKaevOrangeWoolCorners.blockID - 256, "OrangeWool").setItemName("ItemKaevOrangeWoolCorners");
		}else{
			BlockKaevOrangeWoolCorners = Block.stone;
		}
		
		props.save();
	}		
	
	public void renderInvBlock(RenderBlocks renderblocks, Block block, int i, int j)
    {
		Tessellator tessellator = Tessellator.instance;			
		if(j == CornersRenderID)
        {            
			block.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
		
			GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
			tessellator.startDrawingQuads();
			tessellator.setNormal(0.0F, -1F, 0.0F);
			renderCornersBottomFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSideAndMetadata(0,i),i+1, renderblocks, 240);
			tessellator.draw();
			tessellator.startDrawingQuads();
			tessellator.setNormal(0.0F, 1.0F, 0.0F);
			renderCornersTopFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSideAndMetadata(1,i),i+1, renderblocks, 240);
			tessellator.draw();
			tessellator.startDrawingQuads();
			tessellator.setNormal(0.0F, 0.0F, -1F);
			renderCornersEastFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSideAndMetadata(2,i),i+1, renderblocks, 240);
			tessellator.draw();
			tessellator.startDrawingQuads();
			tessellator.setNormal(0.0F, 0.0F, 1.0F);
			renderCornersWestFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSideAndMetadata(3,i),i+1, renderblocks, 240);
			tessellator.draw();
			tessellator.startDrawingQuads();
			tessellator.setNormal(-1F, 0.0F, 0.0F);
			renderCornersNorthFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSideAndMetadata(4,i),i+1, renderblocks, 240);
			tessellator.draw();
			tessellator.startDrawingQuads();
			tessellator.setNormal(1.0F, 0.0F, 0.0F);
			renderCornersSouthFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSideAndMetadata(5,i),i+1, renderblocks, 240);
			tessellator.draw();
			GL11.glTranslatef(0.5F, 0.5F, 0.5F);				
        }     
		block.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }	
	
	public boolean renderWorldBlock(RenderBlocks renderblocks, IBlockAccess iblockaccess, int i, int j, int k, Block block, int l)
	{		
		if(l == CornersRenderID)
		{
			return renderBlockCorners(block, i, j, k, renderblocks, iblockaccess);
		} 
		
        return false;
	}	
	
	public boolean renderBlockCorners(Block block, int i, int j, int k, RenderBlocks renderblocks, IBlockAccess iblockaccess)
    {
		int iDir = iblockaccess.getBlockMetadata(i, j, k);
        int l = block.colorMultiplier(iblockaccess, i, j, k);
        float f = (float)(l >> 16 & 0xff) / 255F;
        float f1 = (float)(l >> 8 & 0xff) / 255F;
        float f2 = (float)(l & 0xff) / 255F;
		
		if(Minecraft.isAmbientOcclusionEnabled())
        {			
            return renderCornersBlockWithAmbientOcclusion(block, i, j, k, f, f1, f2, iDir, renderblocks, iblockaccess);
        } else
        {
            return renderCornersBlockWithColorMultiplier(block, i, j, k, f, f1, f2, iDir, renderblocks, iblockaccess);
        }        
    }	
	
	public boolean renderCornersBlockWithAmbientOcclusion(Block block, int i, int j, int k, float f, float f1, float f2, int iDir, RenderBlocks renderblocks, IBlockAccess iblockaccess)
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
			renderCornersBottomFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 0),iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));		
            flag = true;
		}
		if(renderblocks.renderAllFaces || block.shouldSideBeRendered(iblockaccess, i, j + 1, k, 1))
        {
			renderCornersTopFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 0),iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
            flag = true;
		}
		if(renderblocks.renderAllFaces || block.shouldSideBeRendered(iblockaccess, i, j, k - 1, 2))
        {
			renderCornersEastFace(block, i, j, k, l, iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
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
                renderCornersEastFace(block, i, j, k, 38, iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
            }    
			flag = true;
		}		
		if(renderblocks.renderAllFaces || block.shouldSideBeRendered(iblockaccess, i, j, k + 1, 3))
        {
			renderCornersWestFace(block, i, j, k, i1, iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
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
                renderCornersWestFace(block, i, j, k, 38, iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
            }
            flag = true;
        }
		if(renderblocks.renderAllFaces || block.shouldSideBeRendered(iblockaccess, i - 1, j, k, 4))
        {
			renderCornersNorthFace(block, i, j, k, j1, iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
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
                renderCornersNorthFace(block, i, j, k, 38, iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
            }
            flag = true;
        }
		if(renderblocks.renderAllFaces || block.shouldSideBeRendered(iblockaccess, i + 1, j, k, 5))
        {
			renderCornersSouthFace(block, i, j, k, k1, iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
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
                renderCornersSouthFace(block, i, j, k, 38, iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
            }
            flag = true;
        }	
		
        enableAO = false;
        return flag;
    }
	
    public boolean renderCornersBlockWithColorMultiplier(Block block, int i, int j, int k, float f, float f1, float f2, int iDir, RenderBlocks renderblocks, IBlockAccess iblockaccess)
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
			if(iDir/4 != 1 && iDir/4 != 3){
				float f20 = block.getAmbientOcclusionLightValue(iblockaccess, i, j - 1, k);
				tessellator.setColorOpaque_F(f10 * f20, f13 * f20, f16 * f20);
				renderCornersBottomFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 0), iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
				flag = true;
			}
        }  

		if(renderblocks.renderAllFaces || block.shouldSideBeRendered(iblockaccess, i, j + 1, k, 1))
        {
			if(iDir/4 != 0 && iDir/4 != 2){
				float f21 = block.getAmbientOcclusionLightValue(iblockaccess, i, j + 1, k);
				if(block.maxY != 1.0D && !block.blockMaterial.isLiquid())
				{
					f21 = f19;
				}
				tessellator.setColorOpaque_F(f7 * f21, f8 * f21, f9 * f21);
				renderCornersTopFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 1), iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
				flag = true;
			}
        }   
		
        if(renderblocks.renderAllFaces || block.shouldSideBeRendered(iblockaccess, i, j, k - 1, 2) || iDir%2 == 0)
        {
			float f22 = block.getAmbientOcclusionLightValue(iblockaccess, i, j, k - 1);			
			if(iDir%2 == 0){ 
                f22 = f19; 
			}			
			tessellator.setColorOpaque_F(f11 * f22, f14 * f22, f17 * f22);		
			renderCornersEastFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 2), iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));		
            
            flag = true;
        }
        if(renderblocks.renderAllFaces || block.shouldSideBeRendered(iblockaccess, i, j, k + 1, 3) || iDir%2 == 1)
        {			
            float f23 = block.getAmbientOcclusionLightValue(iblockaccess, i, j, k + 1);
            if(iDir%2 == 1)
            {
                f23 = f19;
            }			
            tessellator.setColorOpaque_F(f11 * f23, f14 * f23, f17 * f23);
            renderCornersWestFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 3), iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
            flag = true;
        }
        if(renderblocks.renderAllFaces || block.shouldSideBeRendered(iblockaccess, i - 1, j, k, 4) || iDir == 0 || iDir == 3 || iDir == 4 || iDir == 7 || iDir == 11 || iDir == 15)
        {
            float f24 = block.getAmbientOcclusionLightValue(iblockaccess, i - 1, j, k);
            if(iDir == 0 || iDir == 3 || iDir == 4 || iDir == 7 || iDir == 11 || iDir == 15)
            {
                f24 = f19;
            }
            tessellator.setColorOpaque_F(f12 * f24, f15 * f24, f18 * f24);
            renderCornersNorthFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 4), iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
            flag = true;
        }
        if(renderblocks.renderAllFaces || block.shouldSideBeRendered(iblockaccess, i + 1, j, k, 5) || iDir == 1 || iDir == 2 || iDir == 5 || iDir == 6 || iDir == 10 || iDir == 14)
        {
            float f25 = block.getAmbientOcclusionLightValue(iblockaccess, i + 1, j, k);
            if(iDir == 1 || iDir == 2 || iDir == 5 || iDir == 6 || iDir == 10 || iDir == 14)
            {
                f25 = f19;
            }
            tessellator.setColorOpaque_F(f12 * f25, f15 * f25, f18 * f25);
            renderCornersSouthFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 5), iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
            flag = true;
        }
        return flag;
    } 
	
	public void renderCornersBottomFace(Block block, double d, double d1, double d2, int i, int iDir, RenderBlocks renderblocks, int lBrightness)
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
        double d9 = d1 + block.minY;
        double d10 = d2 + block.minZ;
        double d11 = d2 + block.maxZ;       
		
		if(enableAO)
        {
			if(iDir/4 == 0){
				// Standard
				tessellator.setColorOpaque_F(colorRedTopLeft_BottomFace, colorGreenTopLeft_BottomFace, colorBlueTopLeft_BottomFace);
				tessellator.addVertexWithUV(d7, d9, d11, d3, d6);
				tessellator.setColorOpaque_F(colorRedBottomLeft_BottomFace, colorGreenBottomLeft_BottomFace, colorBlueBottomLeft_BottomFace);
				tessellator.addVertexWithUV(d7, d9, d10, d3, d5);
				tessellator.setColorOpaque_F(colorRedBottomRight_BottomFace, colorGreenBottomRight_BottomFace, colorBlueBottomRight_BottomFace);
				tessellator.addVertexWithUV(d8, d9, d10, d4, d5);
				tessellator.setColorOpaque_F(colorRedTopRight_BottomFace, colorGreenTopRight_BottomFace, colorBlueTopRight_BottomFace);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
			} else
			if(iDir == 8){
				// Pointing South-West
				tessellator.setColorOpaque_F(colorRedTopLeft_BottomFace, colorGreenTopLeft_BottomFace, colorBlueTopLeft_BottomFace);
				tessellator.addVertexWithUV(d7, d9, d11, d3, d6);
				tessellator.setColorOpaque_F(colorRedBottomRight_BottomFace, colorGreenBottomRight_BottomFace, colorBlueBottomRight_BottomFace);
				tessellator.addVertexWithUV(d8, d9, d10, d4, d5);
				tessellator.setColorOpaque_F(colorRedBottomRight_BottomFace, colorGreenBottomRight_BottomFace, colorBlueBottomRight_BottomFace);
				tessellator.addVertexWithUV(d8, d9, d10, d4, d5);
				tessellator.setColorOpaque_F(colorRedTopRight_BottomFace, colorGreenTopRight_BottomFace, colorBlueTopRight_BottomFace);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);	
			} else	
			if(iDir == 9){
				// Pointing North-East
				tessellator.setColorOpaque_F(colorRedTopLeft_BottomFace, colorGreenTopLeft_BottomFace, colorBlueTopLeft_BottomFace);
				tessellator.addVertexWithUV(d7, d9, d11, d3, d6);
				tessellator.setColorOpaque_F(colorRedBottomLeft_BottomFace, colorGreenBottomLeft_BottomFace, colorBlueBottomLeft_BottomFace);
				tessellator.addVertexWithUV(d7, d9, d10, d3, d5);
				tessellator.setColorOpaque_F(colorRedBottomRight_BottomFace, colorGreenBottomRight_BottomFace, colorBlueBottomRight_BottomFace);
				tessellator.addVertexWithUV(d8, d9, d10, d4, d5);
				tessellator.setColorOpaque_F(colorRedTopLeft_BottomFace, colorGreenTopLeft_BottomFace, colorBlueTopLeft_BottomFace);
				tessellator.addVertexWithUV(d7, d9, d11, d3, d6);			
			} else	
			if(iDir == 10){
				// Pointing North-West
				tessellator.setColorOpaque_F(colorRedTopLeft_BottomFace, colorGreenTopLeft_BottomFace, colorBlueTopLeft_BottomFace);
				tessellator.addVertexWithUV(d7, d9, d11, d3, d6);
				tessellator.setColorOpaque_F(colorRedBottomLeft_BottomFace, colorGreenBottomLeft_BottomFace, colorBlueBottomLeft_BottomFace);
				tessellator.addVertexWithUV(d7, d9, d10, d3, d5);
				tessellator.setColorOpaque_F(colorRedTopRight_BottomFace, colorGreenTopRight_BottomFace, colorBlueTopRight_BottomFace);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.setColorOpaque_F(colorRedTopRight_BottomFace, colorGreenTopRight_BottomFace, colorBlueTopRight_BottomFace);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);		
			} else		
			if(iDir == 11){
				// Pointing South-East
				tessellator.setColorOpaque_F(colorRedBottomLeft_BottomFace, colorGreenBottomLeft_BottomFace, colorBlueBottomLeft_BottomFace);
				tessellator.addVertexWithUV(d7, d9, d10, d3, d5);
				tessellator.setColorOpaque_F(colorRedBottomLeft_BottomFace, colorGreenBottomLeft_BottomFace, colorBlueBottomLeft_BottomFace);
				tessellator.addVertexWithUV(d7, d9, d10, d3, d5);
				tessellator.setColorOpaque_F(colorRedBottomRight_BottomFace, colorGreenBottomRight_BottomFace, colorBlueBottomRight_BottomFace);
				tessellator.addVertexWithUV(d8, d9, d10, d4, d5);
				tessellator.setColorOpaque_F(colorRedTopRight_BottomFace, colorGreenTopRight_BottomFace, colorBlueTopRight_BottomFace);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);			
			}
		} else
		{
			if(iDir/4 == 0){
			// Standard
			tessellator.addVertexWithUV(d7, d9, d11, d3, d6);
            tessellator.addVertexWithUV(d7, d9, d10, d3, d5);
            tessellator.addVertexWithUV(d8, d9, d10, d4, d5);
            tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
			} else
			if(iDir == 8){
				// Pointing South-West
				tessellator.addVertexWithUV(d7, d9, d11, d3, d6);
				tessellator.addVertexWithUV(d8, d9, d10, d4, d5);
				tessellator.addVertexWithUV(d8, d9, d10, d4, d5);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);	
			} else	
			if(iDir == 9){
				// Pointing North-East
				tessellator.addVertexWithUV(d7, d9, d11, d3, d6);
				tessellator.addVertexWithUV(d7, d9, d10, d3, d5);
				tessellator.addVertexWithUV(d8, d9, d10, d4, d5);
				tessellator.addVertexWithUV(d7, d9, d11, d3, d6);				
			} else	
			if(iDir == 10){
				// Pointing North-West
				tessellator.addVertexWithUV(d7, d9, d11, d3, d6);
				tessellator.addVertexWithUV(d7, d9, d10, d3, d5);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);		
			} else		
			if(iDir == 11){
				// Pointing South-East
				tessellator.addVertexWithUV(d7, d9, d10, d3, d5);
				tessellator.addVertexWithUV(d7, d9, d10, d3, d5);
				tessellator.addVertexWithUV(d8, d9, d10, d4, d5);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);			
			}		
		}
    }

	public void renderCornersTopFace(Block block, double d, double d1, double d2, int i, int iDir, RenderBlocks renderblocks, int lBrightness)
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
			if(iDir/4 == 1){
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
			if(iDir/4 == 1){
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
	
	public void renderCornersEastFace(Block block, double d, double d1, double d2, int i, int iDir, RenderBlocks renderblocks, int lBrightness)
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
			if(iDir == 0){
				// Slope facing Up - East
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueXPosYPos)*(factorTop+factorEast)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueXPosYPos)*(factorTop+factorEast)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueXPosYPos)*(factorTop+factorEast)/4F);
				tessellator.addVertexWithUV(d9, d11, d13, d3, d5);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueXPosYPos)*(factorTop+factorEast)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueXPosYPos)*(factorTop+factorEast)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueXPosYPos)*(factorTop+factorEast)/4F);
				tessellator.addVertexWithUV(d9, d11, d13, d3, d5);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueZNeg+aoLightValueXPosZNeg)*(factorTop+factorEast)/4F, colorGreenSlopes*(aoLightValueZNeg+aoLightValueXPosZNeg)*(factorTop+factorEast)/4F, colorBlueSlopes*(aoLightValueZNeg+aoLightValueXPosZNeg)*(factorTop+factorEast)/4F);
				tessellator.addVertexWithUV(d9, d10, d12, d3, d6);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueZNeg+aoLightValueXNegZNeg)*(factorTop+factorEast)/4F, colorGreenSlopes*(aoLightValueZNeg+aoLightValueXNegZNeg)*(factorTop+factorEast)/4F, colorBlueSlopes*(aoLightValueZNeg+aoLightValueXNegZNeg)*(factorTop+factorEast)/4F);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d6);
			} else
			if(iDir == 1 || iDir == 9){
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
			if(iDir == 2){
				// Slope facing Up - East
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueXNegYPos)*(factorTop+factorEast)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueXNegYPos)*(factorTop+factorEast)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueXNegYPos)*(factorTop+factorEast)/4F);
				tessellator.addVertexWithUV(d8, d11, d13, d4, d5);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueXNegYPos)*(factorTop+factorEast)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueXNegYPos)*(factorTop+factorEast)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueXNegYPos)*(factorTop+factorEast)/4F);
				tessellator.addVertexWithUV(d8, d11, d13, d4, d5);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueZNeg+aoLightValueXPosZNeg)*(factorTop+factorEast)/4F, colorGreenSlopes*(aoLightValueZNeg+aoLightValueXPosZNeg)*(factorTop+factorEast)/4F, colorBlueSlopes*(aoLightValueZNeg+aoLightValueXPosZNeg)*(factorTop+factorEast)/4F);
				tessellator.addVertexWithUV(d9, d10, d12, d3, d6);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueZNeg+aoLightValueXNegZNeg)*(factorTop+factorEast)/4F, colorGreenSlopes*(aoLightValueZNeg+aoLightValueXNegZNeg)*(factorTop+factorEast)/4F, colorBlueSlopes*(aoLightValueZNeg+aoLightValueXNegZNeg)*(factorTop+factorEast)/4F);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d6);
			} else
			if(iDir == 3 || iDir == 11){
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
			if(iDir == 4){
				// Slope facing Down - East
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueZNeg+aoLightValueXNegZNeg)*(factorBottom+factorEast)/4F, colorGreenSlopes*(aoLightValueZNeg+aoLightValueXNegZNeg)*(factorBottom+factorEast)/4F, colorBlueSlopes*(aoLightValueZNeg+aoLightValueXNegZNeg)*(factorBottom+factorEast)/4F);
				tessellator.addVertexWithUV(d8, d11, d12, d4, d5);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueZNeg+aoLightValueXPosZNeg)*(factorBottom+factorEast)/4F, colorGreenSlopes*(aoLightValueZNeg+aoLightValueXPosZNeg)*(factorBottom+factorEast)/4F, colorBlueSlopes*(aoLightValueZNeg+aoLightValueXPosZNeg)*(factorBottom+factorEast)/4F);
				tessellator.addVertexWithUV(d9, d11, d12, d3, d5);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueXPosYNeg)*(factorBottom+factorEast)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueXPosYNeg)*(factorBottom+factorEast)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueXPosYNeg)*(factorBottom+factorEast)/4F);
				tessellator.addVertexWithUV(d9, d10, d13, d3, d6);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueXPosYNeg)*(factorBottom+factorEast)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueXPosYNeg)*(factorBottom+factorEast)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueXPosYNeg)*(factorBottom+factorEast)/4F);
				tessellator.addVertexWithUV(d9, d10, d13, d3, d6);
			}else
			if(iDir == 5 || iDir == 13){
				// Triangle Up pointing south
				tessellator.setColorOpaque_F(colorRedTopLeft_EastFace, colorGreenTopLeft_EastFace, colorBlueTopLeft_EastFace);
				tessellator.addVertexWithUV(d8, d11, d12, d4, d5);
				tessellator.setColorOpaque_F(colorRedBottomLeft_EastFace, colorGreenBottomLeft_EastFace, colorBlueBottomLeft_EastFace);
				tessellator.addVertexWithUV(d9, d11, d12, d3, d5);
				tessellator.setColorOpaque_F(colorRedBottomLeft_EastFace, colorGreenBottomLeft_EastFace, colorBlueBottomLeft_EastFace);
				tessellator.addVertexWithUV(d9, d11, d12, d3, d5);
				tessellator.setColorOpaque_F(colorRedTopRight_EastFace, colorGreenTopRight_EastFace, colorBlueTopRight_EastFace);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d6);	
			}else
			if(iDir == 6){
				// Slope facing Down - East
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueZNeg+aoLightValueXNegZNeg)*(factorBottom+factorEast)/4F, colorGreenSlopes*(aoLightValueZNeg+aoLightValueXNegZNeg)*(factorBottom+factorEast)/4F, colorBlueSlopes*(aoLightValueZNeg+aoLightValueXNegZNeg)*(factorBottom+factorEast)/4F);
				tessellator.addVertexWithUV(d8, d11, d12, d4, d5);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueZNeg+aoLightValueXPosZNeg)*(factorBottom+factorEast)/4F, colorGreenSlopes*(aoLightValueZNeg+aoLightValueXPosZNeg)*(factorBottom+factorEast)/4F, colorBlueSlopes*(aoLightValueZNeg+aoLightValueXPosZNeg)*(factorBottom+factorEast)/4F);
				tessellator.addVertexWithUV(d9, d11, d12, d3, d5);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueXNegYNeg)*(factorBottom+factorEast)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueXNegYNeg)*(factorBottom+factorEast)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueXNegYNeg)*(factorBottom+factorEast)/4F);
				tessellator.addVertexWithUV(d8, d10, d13, d4, d6);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueXNegYNeg)*(factorBottom+factorEast)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueXNegYNeg)*(factorBottom+factorEast)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueXNegYNeg)*(factorBottom+factorEast)/4F);
				tessellator.addVertexWithUV(d8, d10, d13, d4, d6);
			}else
			if(iDir == 7 || iDir == 15){
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
			if(iDir == 8){
				// Slope facing Up - East - North
				tessellator.setColorOpaque_F(colorRedSlopes*aoLightValueYPos*(factorTop+factorNorth+factorEast)/3F, colorGreenSlopes*aoLightValueYPos*(factorTop+factorNorth+factorEast)/3F, colorBlueSlopes*aoLightValueYPos*(factorTop+factorNorth+factorEast)/3F);
				tessellator.addVertexWithUV(d9, d11, d13, (d3+d4)/2.0F, d5);                                                                                                                                            
				tessellator.setColorOpaque_F(colorRedSlopes*aoLightValueYPos*(factorTop+factorNorth+factorEast)/3F, colorGreenSlopes*aoLightValueYPos*(factorTop+factorNorth+factorEast)/3F, colorBlueSlopes*aoLightValueYPos*(factorTop+factorNorth+factorEast)/3F);
				tessellator.addVertexWithUV(d9, d11, d13, (d3+d4)/2.0F, d5);                                                                                                                                            
				tessellator.setColorOpaque_F(colorRedSlopes*aoLightValueZNeg*(factorTop+factorNorth+factorEast)/3F, colorGreenSlopes*aoLightValueZNeg*(factorTop+factorNorth+factorEast)/3F, colorBlueSlopes*aoLightValueZNeg*(factorTop+factorNorth+factorEast)/3F);
				tessellator.addVertexWithUV(d9, d10, d12, d3, d6);                                                                                                                                                      
				tessellator.setColorOpaque_F(colorRedSlopes*aoLightValueXNeg*(factorTop+factorNorth+factorEast)/3F, colorGreenSlopes*aoLightValueXNeg*(factorTop+factorNorth+factorEast)/3F, colorBlueSlopes*aoLightValueXNeg*(factorTop+factorNorth+factorEast)/3F);
				tessellator.addVertexWithUV(d8, d10, d13, d4, d6);
			} else
			if(iDir == 12){
				// Slope facing Down - East - North
				tessellator.setColorOpaque_F(colorRedSlopes*aoLightValueXNeg*(factorBottom+factorNorth+factorEast)/3F, colorGreenSlopes*aoLightValueXNeg*(factorBottom+factorNorth+factorEast)/3F, colorBlueSlopes*aoLightValueXNeg*(factorBottom+factorNorth+factorEast)/3F);
				tessellator.addVertexWithUV(d8, d11, d13, d4, d5);                                                                                                                                                                         
				tessellator.setColorOpaque_F(colorRedSlopes*aoLightValueZNeg*(factorBottom+factorNorth+factorEast)/3F, colorGreenSlopes*aoLightValueZNeg*(factorBottom+factorNorth+factorEast)/3F, colorBlueSlopes*aoLightValueZNeg*(factorBottom+factorNorth+factorEast)/3F);
				tessellator.addVertexWithUV(d9, d11, d12, d3, d5);                                                                                                                                                                         
				tessellator.setColorOpaque_F(colorRedSlopes*aoLightValueYNeg*(factorBottom+factorNorth+factorEast)/3F, colorGreenSlopes*aoLightValueYNeg*(factorBottom+factorNorth+factorEast)/3F, colorBlueSlopes*aoLightValueYNeg*(factorBottom+factorNorth+factorEast)/3F);
				tessellator.addVertexWithUV(d9, d10, d13, (d3+d4)/2.0F, d6);                                                                                                                                                               
				tessellator.setColorOpaque_F(colorRedSlopes*aoLightValueYNeg*(factorBottom+factorNorth+factorEast)/3F, colorGreenSlopes*aoLightValueYNeg*(factorBottom+factorNorth+factorEast)/3F, colorBlueSlopes*aoLightValueYNeg*(factorBottom+factorNorth+factorEast)/3F);
				tessellator.addVertexWithUV(d9, d10, d13, (d3+d4)/2.0F, d6);
			}  
		} else
		{
			if(iDir == 0){
				// Pointing 0, X = 1, Z = 1, Sloped
				tessellator.addVertexWithUV(d9, d11, d13, d3, d5);
				tessellator.addVertexWithUV(d9, d11, d13, d3, d5);
				tessellator.addVertexWithUV(d9, d10, d12, d3, d6);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d6);
			} else
			if(iDir == 1 || iDir == 9){
				// Pointing 1, X = 0, Z = 0
				tessellator.addVertexWithUV(d8, d11, d12, d4, d5);
				tessellator.addVertexWithUV(d8, d11, d12, d4, d5);
				tessellator.addVertexWithUV(d9, d10, d12, d3, d6);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d6);
			} else	
			if(iDir == 2){
				// Pointing 2, X = 0, Z = 1, Sloped
				tessellator.addVertexWithUV(d8, d11, d13, d4, d5);
				tessellator.addVertexWithUV(d8, d11, d13, d4, d5);
				tessellator.addVertexWithUV(d9, d10, d12, d3, d6);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d6);
			} else
			if(iDir == 3 || iDir == 11){
				// Pointing 3, X = 1, Z = 0
				tessellator.addVertexWithUV(d9, d11, d12, d3, d5);
				tessellator.addVertexWithUV(d9, d11, d12, d3, d5);
				tessellator.addVertexWithUV(d9, d10, d12, d3, d6);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d6);
			} else
			if(iDir == 4){
				// Pointing 0, X = 1, Z = 1, Sloped
				tessellator.addVertexWithUV(d8, d11, d12, d4, d5);
				tessellator.addVertexWithUV(d9, d11, d12, d3, d5);
				tessellator.addVertexWithUV(d9, d10, d13, d3, d6);
				tessellator.addVertexWithUV(d9, d10, d13, d3, d6);
			}else
			if(iDir == 5 || iDir == 13){
				// Pointing 1, X = 0, Z = 0
				tessellator.addVertexWithUV(d8, d11, d12, d4, d5);
				tessellator.addVertexWithUV(d9, d11, d12, d3, d5);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d6);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d6);
			}else
			if(iDir == 6){
				// Pointing 2, X = 0, Z = 1, Sloped
				tessellator.addVertexWithUV(d8, d11, d12, d4, d5);
				tessellator.addVertexWithUV(d9, d11, d12, d3, d5);
				tessellator.addVertexWithUV(d8, d10, d13, d4, d6);
				tessellator.addVertexWithUV(d8, d10, d13, d4, d6);
			}else
			if(iDir == 7 || iDir == 15){
				// Pointing 3, X = 1, Z = 0
				tessellator.addVertexWithUV(d8, d11, d12, d4, d5);
				tessellator.addVertexWithUV(d9, d11, d12, d3, d5);
				tessellator.addVertexWithUV(d9, d10, d12, d3, d6);
				tessellator.addVertexWithUV(d9, d10, d12, d3, d6);
			} else
			if(iDir == 8){
				// Pointing 0, X = 1, Z = 1, Sloped
				tessellator.addVertexWithUV(d9, d11, d13, (d3+d4)/2.0F, d5);
				tessellator.addVertexWithUV(d9, d11, d13, (d3+d4)/2.0F, d5);
				tessellator.addVertexWithUV(d9, d10, d12, d3, d6);
				tessellator.addVertexWithUV(d8, d10, d13, d4, d6);
			} else
			if(iDir == 12){
				// Pointing 0, X = 1, Z = 1, Sloped
				tessellator.addVertexWithUV(d8, d11, d13, d4, d5);
				tessellator.addVertexWithUV(d9, d11, d12, d3, d5);
				tessellator.addVertexWithUV(d9, d10, d13, (d3+d4)/2.0F, d6);
				tessellator.addVertexWithUV(d9, d10, d13, (d3+d4)/2.0F, d6);
			} 		
		}
    }

    public void renderCornersWestFace(Block block, double d, double d1, double d2, int i, int iDir, RenderBlocks renderblocks, int lBrightness)
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
			if(iDir == 0 || iDir == 8){
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
			if(iDir == 1){
				// Slope facing Up - West
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueXNegYPos)*(factorTop+factorWest)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueXNegYPos)*(factorTop+factorWest)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueXNegYPos)*(factorTop+factorWest)/4F);
				tessellator.addVertexWithUV(d8, d11, d13, d3, d5);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueZPos+aoLightValueXNegZPos)*(factorTop+factorWest)/4F, colorGreenSlopes*(aoLightValueZPos+aoLightValueXNegZPos)*(factorTop+factorWest)/4F, colorBlueSlopes*(aoLightValueZPos+aoLightValueXNegZPos)*(factorTop+factorWest)/4F);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d6);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueZPos+aoLightValueXPosZPos)*(factorTop+factorWest)/4F, colorGreenSlopes*(aoLightValueZPos+aoLightValueXPosZPos)*(factorTop+factorWest)/4F, colorBlueSlopes*(aoLightValueZPos+aoLightValueXPosZPos)*(factorTop+factorWest)/4F);
				tessellator.addVertexWithUV(d9, d10, d12, d4, d6);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueXNegYPos)*(factorTop+factorWest)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueXNegYPos)*(factorTop+factorWest)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueXNegYPos)*(factorTop+factorWest)/4F);
				tessellator.addVertexWithUV(d8, d11, d13, d3, d5);			
			} else		
			if(iDir == 2 || iDir == 10){
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
			if(iDir == 3){
				// Slope facing Up - West
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueXPosYPos)*(factorTop+factorWest)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueXPosYPos)*(factorTop+factorWest)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueXPosYPos)*(factorTop+factorWest)/4F);
				tessellator.addVertexWithUV(d9, d11, d13, d4, d5);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueZPos+aoLightValueXNegZPos)*(factorTop+factorWest)/4F, colorGreenSlopes*(aoLightValueZPos+aoLightValueXNegZPos)*(factorTop+factorWest)/4F, colorBlueSlopes*(aoLightValueZPos+aoLightValueXNegZPos)*(factorTop+factorWest)/4F);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d6);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueZPos+aoLightValueXPosZPos)*(factorTop+factorWest)/4F, colorGreenSlopes*(aoLightValueZPos+aoLightValueXPosZPos)*(factorTop+factorWest)/4F, colorBlueSlopes*(aoLightValueZPos+aoLightValueXPosZPos)*(factorTop+factorWest)/4F);
				tessellator.addVertexWithUV(d9, d10, d12, d4, d6);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueXPosYPos)*(factorTop+factorWest)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueXPosYPos)*(factorTop+factorWest)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueXPosYPos)*(factorTop+factorWest)/4F);
				tessellator.addVertexWithUV(d9, d11, d13, d4, d5);	
			} else
			if(iDir == 4 || iDir == 12){
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
			if(iDir == 5){
				// Slope facing Down - West
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueZPos+aoLightValueXNegZPos)*(factorBottom+factorWest)/4F, colorGreenSlopes*(aoLightValueZPos+aoLightValueXNegZPos)*(factorBottom+factorWest)/4F, colorBlueSlopes*(aoLightValueZPos+aoLightValueXNegZPos)*(factorBottom+factorWest)/4F);
				tessellator.addVertexWithUV(d8, d11, d12, d3, d5);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueXNegYNeg)*(factorBottom+factorWest)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueXNegYNeg)*(factorBottom+factorWest)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueXNegYNeg)*(factorBottom+factorWest)/4F);
				tessellator.addVertexWithUV(d8, d10, d13, d3, d6);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueXNegYNeg)*(factorBottom+factorWest)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueXNegYNeg)*(factorBottom+factorWest)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueXNegYNeg)*(factorBottom+factorWest)/4F);
				tessellator.addVertexWithUV(d8, d10, d13, d3, d6);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueZPos+aoLightValueXPosZPos)*(factorBottom+factorWest)/4F, colorGreenSlopes*(aoLightValueZPos+aoLightValueXPosZPos)*(factorBottom+factorWest)/4F, colorBlueSlopes*(aoLightValueZPos+aoLightValueXPosZPos)*(factorBottom+factorWest)/4F);
				tessellator.addVertexWithUV(d9, d11, d12, d4, d5);
			} else
			if(iDir == 6 || iDir == 14){
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
			if(iDir == 7){
				// Slope facing Down - West
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueZPos+aoLightValueXNegZPos)*(factorBottom+factorWest)/4F, colorGreenSlopes*(aoLightValueZPos+aoLightValueXNegZPos)*(factorBottom+factorWest)/4F, colorBlueSlopes*(aoLightValueZPos+aoLightValueXNegZPos)*(factorBottom+factorWest)/4F);
				tessellator.addVertexWithUV(d8, d11, d12, d3, d5);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueXPosYNeg)*(factorBottom+factorWest)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueXPosYNeg)*(factorBottom+factorWest)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueXPosYNeg)*(factorBottom+factorWest)/4F);
				tessellator.addVertexWithUV(d9, d10, d13, d4, d6);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueXPosYNeg)*(factorBottom+factorWest)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueXPosYNeg)*(factorBottom+factorWest)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueXPosYNeg)*(factorBottom+factorWest)/4F);
				tessellator.addVertexWithUV(d9, d10, d13, d4, d6);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueZPos+aoLightValueXPosZPos)*(factorBottom+factorWest)/4F, colorGreenSlopes*(aoLightValueZPos+aoLightValueXPosZPos)*(factorBottom+factorWest)/4F, colorBlueSlopes*(aoLightValueZPos+aoLightValueXPosZPos)*(factorBottom+factorWest)/4F);
				tessellator.addVertexWithUV(d9, d11, d12, d4, d5);
			} else
			if(iDir == 9){
				// Slope facing Up - West - South
				tessellator.setColorOpaque_F(colorRedSlopes*aoLightValueYPos*(factorTop+factorWest+factorSouth)/3F, colorGreenSlopes*aoLightValueYPos*(factorTop+factorWest+factorSouth)/3F, colorBlueSlopes*aoLightValueYPos*(factorTop+factorWest+factorSouth)/3F);
				tessellator.addVertexWithUV(d8, d11, d13, (d3+d4)/2.0F, d5);                                                                                                                                                              
				tessellator.setColorOpaque_F(colorRedSlopes*aoLightValueZPos*(factorTop+factorWest+factorSouth)/3F, colorGreenSlopes*aoLightValueZPos*(factorTop+factorWest+factorSouth)/3F, colorBlueSlopes*aoLightValueZPos*(factorTop+factorWest+factorSouth)/3F);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d6);                                                                                                                                                                        
				tessellator.setColorOpaque_F(colorRedSlopes*aoLightValueXPos*(factorTop+factorWest+factorSouth)/3F, colorGreenSlopes*aoLightValueXPos*(factorTop+factorWest+factorSouth)/3F, colorBlueSlopes*aoLightValueXPos*(factorTop+factorWest+factorSouth)/3F);
				tessellator.addVertexWithUV(d9, d10, d13, d4, d6);                                                                                                                                                                        
				tessellator.setColorOpaque_F(colorRedSlopes*aoLightValueYPos*(factorTop+factorWest+factorSouth)/3F, colorGreenSlopes*aoLightValueYPos*(factorTop+factorWest+factorSouth)/3F, colorBlueSlopes*aoLightValueYPos*(factorTop+factorWest+factorSouth)/3F);
				tessellator.addVertexWithUV(d8, d11, d13, (d3+d4)/2.0F, d5);			
			} else	
			if(iDir == 13){
				// Slope facing Down - West - South
				tessellator.setColorOpaque_F(colorRedSlopes*aoLightValueZPos*(factorBottom+factorWest+factorSouth)/3F, colorGreenSlopes*aoLightValueZPos*(factorBottom+factorWest+factorSouth)/3F, colorBlueSlopes*aoLightValueZPos*(factorBottom+factorWest+factorSouth)/3F);
				tessellator.addVertexWithUV(d8, d11, d12, d3, d5);                                                                                                                                                             
				tessellator.setColorOpaque_F(colorRedSlopes*aoLightValueYNeg*(factorBottom+factorWest+factorSouth)/3F, colorGreenSlopes*aoLightValueYNeg*(factorBottom+factorWest+factorSouth)/3F, colorBlueSlopes*aoLightValueYNeg*(factorBottom+factorWest+factorSouth)/3F);
				tessellator.addVertexWithUV(d8, d10, d13, (d3+d4)/2.0F, d6);                                                                                                                                                   
				tessellator.setColorOpaque_F(colorRedSlopes*aoLightValueYNeg*(factorBottom+factorWest+factorSouth)/3F, colorGreenSlopes*aoLightValueYNeg*(factorBottom+factorWest+factorSouth)/3F, colorBlueSlopes*aoLightValueYNeg*(factorBottom+factorWest+factorSouth)/3F);
				tessellator.addVertexWithUV(d8, d10, d13, (d3+d4)/2.0F, d6);                                                                                                                                                   
				tessellator.setColorOpaque_F(colorRedSlopes*aoLightValueXPos*(factorBottom+factorWest+factorSouth)/3F, colorGreenSlopes*aoLightValueXPos*(factorBottom+factorWest+factorSouth)/3F, colorBlueSlopes*aoLightValueXPos*(factorBottom+factorWest+factorSouth)/3F);
				tessellator.addVertexWithUV(d9, d11, d13, d4, d5);
			}
		} else
		{
			if(iDir == 0 || iDir == 8){
				// Pointing 0, X = 1, Z = 1
				tessellator.addVertexWithUV(d9, d11, d12, d4, d5);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d6);
				tessellator.addVertexWithUV(d9, d10, d12, d4, d6);
				tessellator.addVertexWithUV(d9, d11, d12, d4, d5);		
			} else
			if(iDir == 1){
				// Pointing 1, X = 0, Z = 0, Sloped
				tessellator.addVertexWithUV(d8, d11, d13, d3, d5);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d6);
				tessellator.addVertexWithUV(d9, d10, d12, d4, d6);
				tessellator.addVertexWithUV(d8, d11, d13, d3, d5);			
			} else		
			if(iDir == 2 || iDir == 10){
				// Pointing 2, X = 0, Z = 1
				tessellator.addVertexWithUV(d8, d11, d12, d3, d5);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d6);
				tessellator.addVertexWithUV(d9, d10, d12, d4, d6);
				tessellator.addVertexWithUV(d8, d11, d12, d3, d5);		
			} else		
			if(iDir == 3){
				// Pointing 3, X = 1, Z = 0, Sloped
				tessellator.addVertexWithUV(d9, d11, d13, d4, d5);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d6);
				tessellator.addVertexWithUV(d9, d10, d12, d4, d6);
				tessellator.addVertexWithUV(d9, d11, d13, d4, d5);	
			} else
			if(iDir == 4 || iDir == 12){
				// Pointing 0, X = 1, Z = 1
				tessellator.addVertexWithUV(d8, d11, d12, d3, d5);
				tessellator.addVertexWithUV(d9, d10, d12, d4, d6);
				tessellator.addVertexWithUV(d9, d10, d12, d4, d6);
				tessellator.addVertexWithUV(d9, d11, d12, d4, d5);
			} else
			if(iDir == 5){
				// Pointing 1, X = 0, Z = 0, Sloped
				tessellator.addVertexWithUV(d8, d11, d12, d3, d5);
				tessellator.addVertexWithUV(d8, d10, d13, d3, d6);
				tessellator.addVertexWithUV(d8, d10, d13, d3, d6);
				tessellator.addVertexWithUV(d9, d11, d12, d4, d5);
			} else
			if(iDir == 6 || iDir == 14){
				// Pointing 2, X = 0, Z = 1
				tessellator.addVertexWithUV(d8, d11, d12, d3, d5);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d6);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d6);
				tessellator.addVertexWithUV(d9, d11, d12, d4, d5);
			} else
			if(iDir == 7){
				// Pointing 3, X = 1, Z = 0, Sloped
				tessellator.addVertexWithUV(d8, d11, d12, d3, d5);
				tessellator.addVertexWithUV(d9, d10, d13, d4, d6);
				tessellator.addVertexWithUV(d9, d10, d13, d4, d6);
				tessellator.addVertexWithUV(d9, d11, d12, d4, d5);
			} else
			if(iDir == 9){
				// Pointing 1, X = 0, Z = 0, Sloped
				tessellator.addVertexWithUV(d8, d11, d13, (d3+d4)/2.0F, d5);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d6);
				tessellator.addVertexWithUV(d9, d10, d13, d4, d6);
				tessellator.addVertexWithUV(d8, d11, d13, (d3+d4)/2.0F, d5);			
			} else	
			if(iDir == 13){
				// Pointing 1, X = 0, Z = 0, Sloped
				tessellator.addVertexWithUV(d8, d11, d12, d3, d5);
				tessellator.addVertexWithUV(d8, d10, d13, (d3+d4)/2.0F, d6);
				tessellator.addVertexWithUV(d8, d10, d13, (d3+d4)/2.0F, d6);
				tessellator.addVertexWithUV(d9, d11, d13, d4, d5);
			}		
		}
    }

    public void renderCornersNorthFace(Block block, double d, double d1, double d2, int i, int iDir, RenderBlocks renderblocks, int lBrightness)
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
			if(iDir == 0){
				// Slope facing Up - North
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueYPosZPos)*(factorTop+factorNorth)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueYPosZPos)*(factorTop+factorNorth)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueYPosZPos)*(factorTop+factorNorth)/4F);
				tessellator.addVertexWithUV(d13, d10, d12, d4, d5);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueYPosZPos)*(factorTop+factorNorth)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueYPosZPos)*(factorTop+factorNorth)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueYPosZPos)*(factorTop+factorNorth)/4F);
				tessellator.addVertexWithUV(d13, d10, d12, d4, d5);		
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXNeg+aoLightValueXNegZNeg)*(factorTop+factorNorth)/4F, colorGreenSlopes*(aoLightValueXNeg+aoLightValueXNegZNeg)*(factorTop+factorNorth)/4F, colorBlueSlopes*(aoLightValueXNeg+aoLightValueXNegZNeg)*(factorTop+factorNorth)/4F);
				tessellator.addVertexWithUV(d8, d9, d11, d3, d6);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXNeg+aoLightValueXNegZPos)*(factorTop+factorNorth)/4F, colorGreenSlopes*(aoLightValueXNeg+aoLightValueXNegZPos)*(factorTop+factorNorth)/4F, colorBlueSlopes*(aoLightValueXNeg+aoLightValueXNegZPos)*(factorTop+factorNorth)/4F);
				tessellator.addVertexWithUV(d8, d9, d12, d4, d6);		
			} else	
			if(iDir == 1 || iDir == 9){
				// Triangle Down pointing west
				tessellator.setColorOpaque_F(colorRedTopRight_NorthFace, colorGreenTopRight_NorthFace, colorBlueTopRight_NorthFace);
				tessellator.addVertexWithUV(d8, d9, d12, d4, d6);
				tessellator.setColorOpaque_F(colorRedBottomLeft_NorthFace, colorGreenBottomLeft_NorthFace, colorBlueBottomLeft_NorthFace);
				tessellator.addVertexWithUV(d8, d10, d11, d3, d5);		
				tessellator.setColorOpaque_F(colorRedBottomRight_NorthFace, colorGreenBottomRight_NorthFace, colorBlueBottomRight_NorthFace);
				tessellator.addVertexWithUV(d8, d9, d11, d3, d6);
				tessellator.setColorOpaque_F(colorRedTopRight_NorthFace, colorGreenTopRight_NorthFace, colorBlueTopRight_NorthFace);
				tessellator.addVertexWithUV(d8, d9, d12, d4, d6);	
			} else			
			if(iDir == 2 || iDir == 10){
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
			if(iDir == 3){
				// Slope facing Up - North
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueYPosZNeg)*(factorTop+factorNorth)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueYPosZNeg)*(factorTop+factorNorth)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueYPosZNeg)*(factorTop+factorNorth)/4F);
				tessellator.addVertexWithUV(d13, d10, d11, d3, d5);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueYPosZNeg)*(factorTop+factorNorth)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueYPosZNeg)*(factorTop+factorNorth)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueYPosZNeg)*(factorTop+factorNorth)/4F);
				tessellator.addVertexWithUV(d13, d10, d11, d3, d5);		
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXNeg+aoLightValueXNegZNeg)*(factorTop+factorNorth)/4F, colorGreenSlopes*(aoLightValueXNeg+aoLightValueXNegZNeg)*(factorTop+factorNorth)/4F, colorBlueSlopes*(aoLightValueXNeg+aoLightValueXNegZNeg)*(factorTop+factorNorth)/4F);
				tessellator.addVertexWithUV(d8, d9, d11, d3, d6);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXNeg+aoLightValueXNegZPos)*(factorTop+factorNorth)/4F, colorGreenSlopes*(aoLightValueXNeg+aoLightValueXNegZPos)*(factorTop+factorNorth)/4F, colorBlueSlopes*(aoLightValueXNeg+aoLightValueXNegZPos)*(factorTop+factorNorth)/4F);
				tessellator.addVertexWithUV(d8, d9, d12, d4, d6);		
			} else     
			if(iDir == 4){
				// Slope facing Down - North
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXNeg+aoLightValueXNegZPos)*(factorBottom+factorNorth)/4F, colorGreenSlopes*(aoLightValueXNeg+aoLightValueXNegZPos)*(factorBottom+factorNorth)/4F, colorBlueSlopes*(aoLightValueXNeg+aoLightValueXNegZPos)*(factorBottom+factorNorth)/4F);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d5);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXNeg+aoLightValueXNegZNeg)*(factorBottom+factorNorth)/4F, colorGreenSlopes*(aoLightValueXNeg+aoLightValueXNegZNeg)*(factorBottom+factorNorth)/4F, colorBlueSlopes*(aoLightValueXNeg+aoLightValueXNegZNeg)*(factorBottom+factorNorth)/4F);
				tessellator.addVertexWithUV(d8, d10, d11, d3, d5);		
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueYNegZPos)*(factorBottom+factorNorth)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueYNegZPos)*(factorBottom+factorNorth)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueYNegZPos)*(factorBottom+factorNorth)/4F);
				tessellator.addVertexWithUV(d13, d9, d12, d4, d6);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueYNegZPos)*(factorBottom+factorNorth)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueYNegZPos)*(factorBottom+factorNorth)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueYNegZPos)*(factorBottom+factorNorth)/4F);
				tessellator.addVertexWithUV(d13, d9, d12, d4, d6);			
			} else
			if(iDir == 5 || iDir == 13){
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
			if(iDir == 6 || iDir == 14){
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
			if(iDir == 7){
				// Slope facing Down - North
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXNeg+aoLightValueXNegZPos)*(factorBottom+factorNorth)/4F, colorGreenSlopes*(aoLightValueXNeg+aoLightValueXNegZPos)*(factorBottom+factorNorth)/4F, colorBlueSlopes*(aoLightValueXNeg+aoLightValueXNegZPos)*(factorBottom+factorNorth)/4F);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d5);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXNeg+aoLightValueXNegZNeg)*(factorBottom+factorNorth)/4F, colorGreenSlopes*(aoLightValueXNeg+aoLightValueXNegZNeg)*(factorBottom+factorNorth)/4F, colorBlueSlopes*(aoLightValueXNeg+aoLightValueXNegZNeg)*(factorBottom+factorNorth)/4F);
				tessellator.addVertexWithUV(d8, d10, d11, d3, d5);		
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueYNegZNeg)*(factorBottom+factorNorth)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueYNegZNeg)*(factorBottom+factorNorth)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueYNegZNeg)*(factorBottom+factorNorth)/4F);
				tessellator.addVertexWithUV(d13, d9, d11, d3, d6);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueYNegZNeg)*(factorBottom+factorNorth)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueYNegZNeg)*(factorBottom+factorNorth)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueYNegZNeg)*(factorBottom+factorNorth)/4F);
				tessellator.addVertexWithUV(d13, d9, d11, d3, d6);			
			} else		
			if(iDir == 11){
				// Slope facing Up - North - West
				tessellator.setColorOpaque_F(colorRedSlopes*aoLightValueYPos*(factorTop+factorWest+factorNorth)/3F, colorGreenSlopes*aoLightValueYPos*(factorTop+factorWest+factorNorth)/3F, colorBlueSlopes*aoLightValueYPos*(factorTop+factorWest+factorNorth)/3F);
				tessellator.addVertexWithUV(d13, d10, d11, (d3+d4)/2.0F, d5);                                                                                                                                                                 
				tessellator.setColorOpaque_F(colorRedSlopes*aoLightValueYPos*(factorTop+factorWest+factorNorth)/3F, colorGreenSlopes*aoLightValueYPos*(factorTop+factorWest+factorNorth)/3F, colorBlueSlopes*aoLightValueYPos*(factorTop+factorWest+factorNorth)/3F);
				tessellator.addVertexWithUV(d13, d10, d11, (d3+d4)/2.0F, d5);	             	                                                                      	                                                                      	
				tessellator.setColorOpaque_F(colorRedSlopes*aoLightValueXNeg*(factorTop+factorWest+factorNorth)/3F, colorGreenSlopes*aoLightValueXNeg*(factorTop+factorWest+factorNorth)/3F, colorBlueSlopes*aoLightValueXNeg*(factorTop+factorWest+factorNorth)/3F);
				tessellator.addVertexWithUV(d8, d9, d11, d3, d6);                                                                                                                                                                             
				tessellator.setColorOpaque_F(colorRedSlopes*aoLightValueZPos*(factorTop+factorWest+factorNorth)/3F, colorGreenSlopes*aoLightValueZPos*(factorTop+factorWest+factorNorth)/3F, colorBlueSlopes*aoLightValueZPos*(factorTop+factorWest+factorNorth)/3F);
				tessellator.addVertexWithUV(d13, d9, d12, d4, d6);		
			} else
			if(iDir == 15){
				// Slope facing Down - North - West
				tessellator.setColorOpaque_F(colorRedSlopes*aoLightValueZPos*(factorBottom+factorWest+factorNorth)/3F, colorGreenSlopes*aoLightValueZPos*(factorBottom+factorWest+factorNorth)/3F, colorBlueSlopes*aoLightValueZPos*(factorBottom+factorWest+factorNorth)/3F);
				tessellator.addVertexWithUV(d13, d10, d12, d4, d5);                                                                                                                                                                                 
				tessellator.setColorOpaque_F(colorRedSlopes*aoLightValueXNeg*(factorBottom+factorWest+factorNorth)/3F, colorGreenSlopes*aoLightValueXNeg*(factorBottom+factorWest+factorNorth)/3F, colorBlueSlopes*aoLightValueXNeg*(factorBottom+factorWest+factorNorth)/3F);
				tessellator.addVertexWithUV(d8, d10, d11, d3, d5);		                                                                                                                                                                            
				tessellator.setColorOpaque_F(colorRedSlopes*aoLightValueYNeg*(factorBottom+factorWest+factorNorth)/3F, colorGreenSlopes*aoLightValueYNeg*(factorBottom+factorWest+factorNorth)/3F, colorBlueSlopes*aoLightValueYNeg*(factorBottom+factorWest+factorNorth)/3F);
				tessellator.addVertexWithUV(d13, d9, d11, (d3+d4)/2.0F, d6);                                                                                                                                                                        
				tessellator.setColorOpaque_F(colorRedSlopes*aoLightValueYNeg*(factorBottom+factorWest+factorNorth)/3F, colorGreenSlopes*aoLightValueYNeg*(factorBottom+factorWest+factorNorth)/3F, colorBlueSlopes*aoLightValueYNeg*(factorBottom+factorWest+factorNorth)/3F);
				tessellator.addVertexWithUV(d13, d9, d11, (d3+d4)/2.0F, d6);		
			}
		} else
		{
			if(iDir == 0){
				// Pointing 0, X = 1, Z = 1, Sloped
				tessellator.addVertexWithUV(d13, d10, d12, d4, d5);
				tessellator.addVertexWithUV(d13, d10, d12, d4, d5);		
				tessellator.addVertexWithUV(d8, d9, d11, d3, d6);
				tessellator.addVertexWithUV(d8, d9, d12, d4, d6);		
			} else	
			if(iDir == 1 || iDir == 9){
				// Pointing 1, X = 0, Z = 0
				tessellator.addVertexWithUV(d8, d10, d11, d3, d5);
				tessellator.addVertexWithUV(d8, d10, d11, d3, d5);		
				tessellator.addVertexWithUV(d8, d9, d11, d3, d6);
				tessellator.addVertexWithUV(d8, d9, d12, d4, d6);		
			} else			
			if(iDir == 2 || iDir == 10){
				// Pointing 2, X = 0, Z = 1
				tessellator.addVertexWithUV(d8, d10, d12, d4, d5);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d5);		
				tessellator.addVertexWithUV(d8, d9, d11, d3, d6);
				tessellator.addVertexWithUV(d8, d9, d12, d4, d6);	
			} else		
			if(iDir == 3){
				// Pointing 3, X = 1, Z = 0, Sloped
				tessellator.addVertexWithUV(d13, d10, d11, d3, d5);
				tessellator.addVertexWithUV(d13, d10, d11, d3, d5);		
				tessellator.addVertexWithUV(d8, d9, d11, d3, d6);
				tessellator.addVertexWithUV(d8, d9, d12, d4, d6);		
			} else     
			if(iDir == 4){
				// Pointing 0, X = 1, Z = 1, Sloped
				tessellator.addVertexWithUV(d8, d10, d12, d4, d5);
				tessellator.addVertexWithUV(d8, d10, d11, d3, d5);		
				tessellator.addVertexWithUV(d13, d9, d12, d4, d6);
				tessellator.addVertexWithUV(d13, d9, d12, d4, d6);			
			} else
			if(iDir == 5 || iDir == 13){
				// Pointing 1, X = 0, Z = 0
				tessellator.addVertexWithUV(d8, d10, d12, d4, d5);
				tessellator.addVertexWithUV(d8, d10, d11, d3, d5);		
				tessellator.addVertexWithUV(d8, d9, d11, d3, d6);
				tessellator.addVertexWithUV(d8, d9, d11, d3, d6);			
			} else
			if(iDir == 6 || iDir == 14){
				// Pointing 2, X = 0, Z = 1
				tessellator.addVertexWithUV(d8, d10, d12, d4, d5);
				tessellator.addVertexWithUV(d8, d10, d11, d3, d5);		
				tessellator.addVertexWithUV(d8, d9, d12, d4, d6);
				tessellator.addVertexWithUV(d8, d9, d12, d4, d6);			
			} else
			if(iDir == 7){
				// Pointing 3, X = 1, Z = 0, Sloped
				tessellator.addVertexWithUV(d8, d10, d12, d4, d5);
				tessellator.addVertexWithUV(d8, d10, d11, d3, d5);		
				tessellator.addVertexWithUV(d13, d9, d11, d3, d6);
				tessellator.addVertexWithUV(d13, d9, d11, d3, d6);			
			} else		
			if(iDir == 11){
				// Pointing 3, X = 1, Z = 0, Sloped
				tessellator.addVertexWithUV(d13, d10, d11, (d3+d4)/2.0F, d5);
				tessellator.addVertexWithUV(d13, d10, d11, (d3+d4)/2.0F, d5);		
				tessellator.addVertexWithUV(d8, d9, d11, d3, d6);
				tessellator.addVertexWithUV(d13, d9, d12, d4, d6);		
			} else
			if(iDir == 15){
				// Pointing 3, X = 1, Z = 0, Sloped
				tessellator.addVertexWithUV(d13, d10, d12, d4, d5);
				tessellator.addVertexWithUV(d8, d10, d11, d3, d5);		
				tessellator.addVertexWithUV(d13, d9, d11, (d3+d4)/2.0F, d6);
				tessellator.addVertexWithUV(d13, d9, d11, (d3+d4)/2.0F, d6);			
			}		
		}
    }

    public void renderCornersSouthFace(Block block, double d, double d1, double d2, int i, int iDir, RenderBlocks renderblocks, int lBrightness)
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
			if(iDir == 0 || iDir == 8){
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
			if(iDir == 1){
				// Slope facing Up - South
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXPos+aoLightValueXPosZPos)*(factorTop+factorSouth)/4F, colorGreenSlopes*(aoLightValueXPos+aoLightValueXPosZPos)*(factorTop+factorSouth)/4F, colorBlueSlopes*(aoLightValueXPos+aoLightValueXPosZPos)*(factorTop+factorSouth)/4F);
				tessellator.addVertexWithUV(d8, d9, d12, d3, d6);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXPos+aoLightValueXPosZNeg)*(factorTop+factorSouth)/4F, colorGreenSlopes*(aoLightValueXPos+aoLightValueXPosZNeg)*(factorTop+factorSouth)/4F, colorBlueSlopes*(aoLightValueXPos+aoLightValueXPosZNeg)*(factorTop+factorSouth)/4F);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueYPosZNeg)*(factorTop+factorSouth)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueYPosZNeg)*(factorTop+factorSouth)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueYPosZNeg)*(factorTop+factorSouth)/4F);
				tessellator.addVertexWithUV(d13, d10, d11, d4, d5);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueYPosZNeg)*(factorTop+factorSouth)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueYPosZNeg)*(factorTop+factorSouth)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueYPosZNeg)*(factorTop+factorSouth)/4F);
				tessellator.addVertexWithUV(d13, d10, d11, d4, d5);		
			} else	
			if(iDir == 2){
				// Slope facing Up - South
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXPos+aoLightValueXPosZPos)*(factorTop+factorSouth)/4F, colorGreenSlopes*(aoLightValueXPos+aoLightValueXPosZPos)*(factorTop+factorSouth)/4F, colorBlueSlopes*(aoLightValueXPos+aoLightValueXPosZPos)*(factorTop+factorSouth)/4F);
				tessellator.addVertexWithUV(d8, d9, d12, d3, d6);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXPos+aoLightValueXPosZNeg)*(factorTop+factorSouth)/4F, colorGreenSlopes*(aoLightValueXPos+aoLightValueXPosZNeg)*(factorTop+factorSouth)/4F, colorBlueSlopes*(aoLightValueXPos+aoLightValueXPosZNeg)*(factorTop+factorSouth)/4F);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueYPosZPos)*(factorTop+factorSouth)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueYPosZPos)*(factorTop+factorSouth)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueYPosZPos)*(factorTop+factorSouth)/4F);
				tessellator.addVertexWithUV(d13, d10, d12, d3, d5);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueYPosZPos)*(factorTop+factorSouth)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueYPosZPos)*(factorTop+factorSouth)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueYPosZPos)*(factorTop+factorSouth)/4F);
				tessellator.addVertexWithUV(d13, d10, d12, d3, d5);	
			} else		
			if(iDir == 3 || iDir == 11){
				// Triangle Down pointing west
				tessellator.setColorOpaque_F(colorRedTopLeft_SouthFace, colorGreenTopLeft_SouthFace, colorBlueTopLeft_SouthFace);
				tessellator.addVertexWithUV(d8, d9, d12, d3, d6);
				tessellator.setColorOpaque_F(colorRedBottomLeft_SouthFace, colorGreenBottomLeft_SouthFace, colorBlueBottomLeft_SouthFace);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.setColorOpaque_F(colorRedBottomRight_SouthFace, colorGreenBottomRight_SouthFace, colorBlueBottomRight_SouthFace);
				tessellator.addVertexWithUV(d8, d10, d11, d4, d5);
				tessellator.setColorOpaque_F(colorRedTopLeft_SouthFace, colorGreenTopLeft_SouthFace, colorBlueTopLeft_SouthFace);
				tessellator.addVertexWithUV(d8, d9, d12, d3, d6);		
			} else
			if(iDir == 4 || iDir == 12){
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
			if(iDir == 5){
				// Slope facing Down - South
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueYNegZNeg)*(factorBottom+factorSouth)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueYNegZNeg)*(factorBottom+factorSouth)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueYNegZNeg)*(factorBottom+factorSouth)/4F);
				tessellator.addVertexWithUV(d13, d9, d11, d4, d6);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueYNegZNeg)*(factorBottom+factorSouth)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueYNegZNeg)*(factorBottom+factorSouth)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueYNegZNeg)*(factorBottom+factorSouth)/4F);
				tessellator.addVertexWithUV(d13, d9, d11, d4, d6);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXPos+aoLightValueXPosZNeg)*(factorBottom+factorSouth)/4F, colorGreenSlopes*(aoLightValueXPos+aoLightValueXPosZNeg)*(factorBottom+factorSouth)/4F, colorBlueSlopes*(aoLightValueXPos+aoLightValueXPosZNeg)*(factorBottom+factorSouth)/4F);
				tessellator.addVertexWithUV(d8, d10, d11, d4, d5);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXPos+aoLightValueXPosZPos)*(factorBottom+factorSouth)/4F, colorGreenSlopes*(aoLightValueXPos+aoLightValueXPosZPos)*(factorBottom+factorSouth)/4F, colorBlueSlopes*(aoLightValueXPos+aoLightValueXPosZPos)*(factorBottom+factorSouth)/4F);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d5);		
			} else	
			if(iDir == 6){
				// Slope facing Down - South
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueYNegZPos)*(factorBottom+factorSouth)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueYNegZPos)*(factorBottom+factorSouth)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueYNegZPos)*(factorBottom+factorSouth)/4F);
				tessellator.addVertexWithUV(d13, d9, d12, d3, d6);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueYNegZPos)*(factorBottom+factorSouth)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueYNegZPos)*(factorBottom+factorSouth)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueYNegZPos)*(factorBottom+factorSouth)/4F);
				tessellator.addVertexWithUV(d13, d9, d12, d3, d6);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXPos+aoLightValueXPosZNeg)*(factorBottom+factorSouth)/4F, colorGreenSlopes*(aoLightValueXPos+aoLightValueXPosZNeg)*(factorBottom+factorSouth)/4F, colorBlueSlopes*(aoLightValueXPos+aoLightValueXPosZNeg)*(factorBottom+factorSouth)/4F);
				tessellator.addVertexWithUV(d8, d10, d11, d4, d5);
				tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXPos+aoLightValueXPosZPos)*(factorBottom+factorSouth)/4F, colorGreenSlopes*(aoLightValueXPos+aoLightValueXPosZPos)*(factorBottom+factorSouth)/4F, colorBlueSlopes*(aoLightValueXPos+aoLightValueXPosZPos)*(factorBottom+factorSouth)/4F);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d5);			
			} else	
			if(iDir == 7 || iDir == 15){
				// Triangle Up pointing west
				tessellator.setColorOpaque_F(colorRedTopRight_SouthFace, colorGreenTopRight_SouthFace, colorBlueTopRight_SouthFace);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d5);
				tessellator.setColorOpaque_F(colorRedBottomLeft_SouthFace, colorGreenBottomLeft_SouthFace, colorBlueBottomLeft_SouthFace);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.setColorOpaque_F(colorRedBottomRight_SouthFace, colorGreenBottomRight_SouthFace, colorBlueBottomRight_SouthFace);
				tessellator.addVertexWithUV(d8, d10, d11, d4, d5);
				tessellator.setColorOpaque_F(colorRedTopRight_SouthFace, colorGreenTopRight_SouthFace, colorBlueTopRight_SouthFace);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d5);		
			} else	
			if(iDir == 10){
				// Slope facing Up - South - East
				tessellator.setColorOpaque_F(colorRedSlopes*aoLightValueXPos*(factorTop+factorSouth+factorEast)/3F, colorGreenSlopes*aoLightValueXPos*(factorTop+factorSouth+factorEast)/3F, colorBlueSlopes*aoLightValueXPos*(factorTop+factorSouth+factorEast)/3F);
				tessellator.addVertexWithUV(d8, d9, d12, d3, d6);                                                                                                                                                                             
				tessellator.setColorOpaque_F(colorRedSlopes*aoLightValueZNeg*(factorTop+factorSouth+factorEast)/3F, colorGreenSlopes*aoLightValueZNeg*(factorTop+factorSouth+factorEast)/3F, colorBlueSlopes*aoLightValueZNeg*(factorTop+factorSouth+factorEast)/3F);
				tessellator.addVertexWithUV(d13, d9, d11, d4, d6);                                                                                                                                                                            
				tessellator.setColorOpaque_F(colorRedSlopes*aoLightValueYPos*(factorTop+factorSouth+factorEast)/3F, colorGreenSlopes*aoLightValueYPos*(factorTop+factorSouth+factorEast)/3F, colorBlueSlopes*aoLightValueYPos*(factorTop+factorSouth+factorEast)/3F);
				tessellator.addVertexWithUV(d13, d10, d12, (d3+d4)/2.0F, d5);                                                                                                                                                                 
				tessellator.setColorOpaque_F(colorRedSlopes*aoLightValueYPos*(factorTop+factorSouth+factorEast)/3F, colorGreenSlopes*aoLightValueYPos*(factorTop+factorSouth+factorEast)/3F, colorBlueSlopes*aoLightValueYPos*(factorTop+factorSouth+factorEast)/3F);
				tessellator.addVertexWithUV(d13, d10, d12, (d3+d4)/2.0F, d5);		
			} else	
			if(iDir == 14){
				// Slope facing Down - South - East
				tessellator.setColorOpaque_F(colorRedSlopes*aoLightValueYNeg*(factorBottom+factorSouth+factorEast)/3F, colorGreenSlopes*aoLightValueYNeg*(factorBottom+factorSouth+factorEast)/3F, colorBlueSlopes*aoLightValueYNeg*(factorBottom+factorSouth+factorEast)/3F);
				tessellator.addVertexWithUV(d13, d9, d12, (d3+d4)/2.0F, d6);                                                                                                                                                                            
				tessellator.setColorOpaque_F(colorRedSlopes*aoLightValueYNeg*(factorBottom+factorSouth+factorEast)/3F, colorGreenSlopes*aoLightValueYNeg*(factorBottom+factorSouth+factorEast)/3F, colorBlueSlopes*aoLightValueYNeg*(factorBottom+factorSouth+factorEast)/3F);
				tessellator.addVertexWithUV(d13, d9, d12, (d3+d4)/2.0F, d6);                                                                                                                                                                            
				tessellator.setColorOpaque_F(colorRedSlopes*aoLightValueZNeg*(factorBottom+factorSouth+factorEast)/3F, colorGreenSlopes*aoLightValueZNeg*(factorBottom+factorSouth+factorEast)/3F, colorBlueSlopes*aoLightValueZNeg*(factorBottom+factorSouth+factorEast)/3F);
				tessellator.addVertexWithUV(d13, d10, d11, d4, d5);                                                                                                                                                                                     
				tessellator.setColorOpaque_F(colorRedSlopes*aoLightValueXPos*(factorBottom+factorSouth+factorEast)/3F, colorGreenSlopes*aoLightValueXPos*(factorBottom+factorSouth+factorEast)/3F, colorBlueSlopes*aoLightValueXPos*(factorBottom+factorSouth+factorEast)/3F);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d5);	
			}
		} else
		{
			if(iDir == 0 || iDir == 8){
				// Pointing 0, X = 1, Z = 1
				tessellator.addVertexWithUV(d8, d9, d12, d3, d6);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d5);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d5);		
			} else	
			if(iDir == 1){
				// Pointing 1, X = 0, Z = 0, Sloped
				tessellator.addVertexWithUV(d8, d9, d12, d3, d6);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.addVertexWithUV(d13, d10, d11, d4, d5);
				tessellator.addVertexWithUV(d13, d10, d11, d4, d5);		
			} else	
			if(iDir == 2){
				// Pointing 2, X = 0, Z = 1, Sloped
				tessellator.addVertexWithUV(d8, d9, d12, d3, d6);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.addVertexWithUV(d13, d10, d12, d3, d5);
				tessellator.addVertexWithUV(d13, d10, d12, d3, d5);		
			} else		
			if(iDir == 3 || iDir == 11){
				// Pointing 3, X = 1, Z = 0
				tessellator.addVertexWithUV(d8, d9, d12, d3, d6);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.addVertexWithUV(d8, d10, d11, d4, d5);
				tessellator.addVertexWithUV(d8, d10, d11, d4, d5);				
			} else
			if(iDir == 4 || iDir == 12){
				// Pointing 0, X = 1, Z = 1
				tessellator.addVertexWithUV(d8, d9, d12, d3, d6);
				tessellator.addVertexWithUV(d8, d9, d12, d3, d6);
				tessellator.addVertexWithUV(d8, d10, d11, d4, d5);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d5);		
			} else	
			if(iDir == 5){
				// Pointing 1, X = 0, Z = 0, Sloped
				tessellator.addVertexWithUV(d13, d9, d11, d4, d6);
				tessellator.addVertexWithUV(d13, d9, d11, d4, d6);
				tessellator.addVertexWithUV(d8, d10, d11, d4, d5);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d5);		
			} else	
			if(iDir == 6){
				// Pointing 2, X = 0, Z = 1, Sloped
				tessellator.addVertexWithUV(d13, d9, d12, d3, d6);
				tessellator.addVertexWithUV(d13, d9, d12, d3, d6);
				tessellator.addVertexWithUV(d8, d10, d11, d4, d5);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d5);		
			} else	
			if(iDir == 7 || iDir == 15){
				// Pointing 3, X = 1, Z = 0
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.addVertexWithUV(d8, d10, d11, d4, d5);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d5);		
			} else	
			if(iDir == 10){
				// Pointing 2, X = 0, Z = 1, Sloped
				tessellator.addVertexWithUV(d8, d9, d12, d3, d6);
				tessellator.addVertexWithUV(d13, d9, d11, d4, d6);
				tessellator.addVertexWithUV(d13, d10, d12, (d3+d4)/2.0F, d5);
				tessellator.addVertexWithUV(d13, d10, d12, (d3+d4)/2.0F, d5);		
			} else	
			if(iDir == 14){
				// Pointing 2, X = 0, Z = 1, Sloped
				tessellator.addVertexWithUV(d13, d9, d12, (d3+d4)/2.0F, d6);
				tessellator.addVertexWithUV(d13, d9, d12, (d3+d4)/2.0F, d6);
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