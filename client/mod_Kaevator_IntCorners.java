package net.minecraft.src;
import net.minecraft.client.Minecraft;
import net.minecraft.src.forge.NetworkMod;
import net.minecraft.src.superslopes.BlockIntCorners_Kaevator;
import net.minecraft.src.superslopes.ItemIntCorners_Kaevator;
import net.minecraft.src.superslopes.KrushProps;

import org.lwjgl.opengl.GL11;
import java.io.File;

public class mod_Kaevator_IntCorners extends BaseMod
{	
	public static void prepareProps()
    { 
		props.getInt("Slopes_Opacity", 0);
		props.getInt("BlockKaevWoodIntCorners", 197);
		props.getInt("BlockKaevCobblestoneIntCorners", 198);
		props.getInt("BlockKaevGlassIntCorners", 199);
		props.getInt("BlockKaevSandstoneIntCorners", 200);
		props.getInt("BlockKaevDirtIntCorners", 201);
		props.getInt("BlockKaevStoneIntCorners", 202);
		props.getInt("BlockKaevSandIntCorners", 203);
		props.getInt("BlockKaevSnowIntCorners", 204);
		props.getInt("BlockKaevGrassIntCorners", 205);
		props.getInt("BlockKaevBricksIntCorners", 206);
		props.getInt("BlockKaevGravelIntCorners", 207);
		props.getInt("BlockKaevGoldIntCorners", 208);
		props.getInt("BlockKaevSteelIntCorners", 209);
		props.getInt("BlockKaevObsidianIntCorners", 210);
		props.getInt("BlockKaevDiamondIntCorners", 211);
		props.getInt("BlockKaevWhiteWoolIntCorners", 0);
		props.getInt("BlockKaevBlackWoolIntCorners", 0);
		props.getInt("BlockKaevRedWoolIntCorners", 0);
		props.getInt("BlockKaevGreenWoolIntCorners", 0);
		props.getInt("BlockKaevBrownWoolIntCorners", 0);
		props.getInt("BlockKaevBlueWoolIntCorners", 0);
		props.getInt("BlockKaevPurpleWoolIntCorners", 0);
		props.getInt("BlockKaevCyanWoolIntCorners", 0);
		props.getInt("BlockKaevSilverWoolIntCorners", 0);
		props.getInt("BlockKaevGrayWoolIntCorners", 0);
		props.getInt("BlockKaevPinkWoolIntCorners", 0);
		props.getInt("BlockKaevLimeWoolIntCorners", 0);
		props.getInt("BlockKaevYellowWoolIntCorners", 0);
		props.getInt("BlockKaevLightBlueWoolIntCorners", 0);
		props.getInt("BlockKaevMagentaWoolIntCorners", 0);
		props.getInt("BlockKaevOrangeWoolIntCorners", 0);
    }
	
	public mod_Kaevator_IntCorners()
    {		
		IntCornersRenderID = ModLoader.getUniqueBlockModelID(this, true);		

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
		
		ModLoader.addLocalization("KaevWoodSlopesTruncCornerDown.name", "wooden oblic slopes");
		ModLoader.addLocalization("KaevWoodSlopesTruncCornerUp.name", "wooden oblic upslope");
		ModLoader.addLocalization("KaevWoodSlopesInvCornerDown.name", "wooden interior corner");
		ModLoader.addLocalization("KaevWoodSlopesInvCornerUp.name", "wooden interior upcorner");

		ModLoader.addLocalization("KaevCobblestoneSlopesTruncCornerDown.name", "cobblestone oblic slopes");
		ModLoader.addLocalization("KaevCobblestoneSlopesTruncCornerUp.name", "cobblestone oblic upslope");
		ModLoader.addLocalization("KaevCobblestoneSlopesInvCornerDown.name", "cobblestone interior corner");
		ModLoader.addLocalization("KaevCobblestoneSlopesInvCornerUp.name", "cobblestone interior upcorner");

		ModLoader.addLocalization("KaevGlassSlopesTruncCornerDown.name", "glass oblic slopes");
		ModLoader.addLocalization("KaevGlassSlopesTruncCornerUp.name", "glass oblic upslope");
		ModLoader.addLocalization("KaevGlassSlopesInvCornerDown.name", "glass interior corner");
		ModLoader.addLocalization("KaevGlassSlopesInvCornerUp.name", "glass interior upcorner");

		ModLoader.addLocalization("KaevSandstoneSlopesTruncCornerDown.name", "sandstone oblic slopes");
		ModLoader.addLocalization("KaevSandstoneSlopesTruncCornerUp.name", "sandstone oblic upslope");
		ModLoader.addLocalization("KaevSandstoneSlopesInvCornerDown.name", "sandstone interior corner");
		ModLoader.addLocalization("KaevSandstoneSlopesInvCornerUp.name", "sandstone interior upcorner");

		ModLoader.addLocalization("KaevDirtSlopesTruncCornerDown.name", "dirt oblic slopes");
		ModLoader.addLocalization("KaevDirtSlopesTruncCornerUp.name", "dirt oblic upslope");
		ModLoader.addLocalization("KaevDirtSlopesInvCornerDown.name", "dirt interior corner");
		ModLoader.addLocalization("KaevDirtSlopesInvCornerUp.name", "dirt interior upcorner");

		ModLoader.addLocalization("KaevStoneSlopesTruncCornerDown.name", "stone oblic slopes");
		ModLoader.addLocalization("KaevStoneSlopesTruncCornerUp.name", "stone oblic upslope");
		ModLoader.addLocalization("KaevStoneSlopesInvCornerDown.name", "stone interior corner");
		ModLoader.addLocalization("KaevStoneSlopesInvCornerUp.name", "stone interior upcorner");

		ModLoader.addLocalization("KaevSandSlopesTruncCornerDown.name", "sand oblic slopes");
		ModLoader.addLocalization("KaevSandSlopesTruncCornerUp.name", "sand oblic upslope");
		ModLoader.addLocalization("KaevSandSlopesInvCornerDown.name", "sand interior corner");
		ModLoader.addLocalization("KaevSandSlopesInvCornerUp.name", "sand interior upcorner");

		ModLoader.addLocalization("KaevSnowSlopesTruncCornerDown.name", "snow oblic slopes");
		ModLoader.addLocalization("KaevSnowSlopesTruncCornerUp.name", "snow oblic upslope");
		ModLoader.addLocalization("KaevSnowSlopesInvCornerDown.name", "snow interior corner");
		ModLoader.addLocalization("KaevSnowSlopesInvCornerUp.name", "snow interior upcorner");

		ModLoader.addLocalization("KaevGrassSlopesTruncCornerDown.name", "grass oblic slopes");
		ModLoader.addLocalization("KaevGrassSlopesTruncCornerUp.name", "grass oblic upslope");
		ModLoader.addLocalization("KaevGrassSlopesInvCornerDown.name", "grass interior corner");
		ModLoader.addLocalization("KaevGrassSlopesInvCornerUp.name", "grass interior upcorner");

		ModLoader.addLocalization("KaevBricksSlopesTruncCornerDown.name", "bricks oblic slopes");
		ModLoader.addLocalization("KaevBricksSlopesTruncCornerUp.name", "bricks oblic upslope");
		ModLoader.addLocalization("KaevBricksSlopesInvCornerDown.name", "bricks interior corner");
		ModLoader.addLocalization("KaevBricksSlopesInvCornerUp.name", "bricks interior upcorner");

		ModLoader.addLocalization("KaevGravelSlopesTruncCornerDown.name", "gravel oblic slopes");
		ModLoader.addLocalization("KaevGravelSlopesTruncCornerUp.name", "gravel oblic upslope");
		ModLoader.addLocalization("KaevGravelSlopesInvCornerDown.name", "gravel interior corner");
		ModLoader.addLocalization("KaevGravelSlopesInvCornerUp.name", "gravel interior upcorner");

		ModLoader.addLocalization("KaevGoldSlopesTruncCornerDown.name", "golden oblic slopes");
		ModLoader.addLocalization("KaevGoldSlopesTruncCornerUp.name", "golden oblic upslope");
		ModLoader.addLocalization("KaevGoldSlopesInvCornerDown.name", "golden interior corner");
		ModLoader.addLocalization("KaevGoldSlopesInvCornerUp.name", "golden interior upcorner");

		ModLoader.addLocalization("KaevSteelSlopesTruncCornerDown.name", "steel oblic slopes");
		ModLoader.addLocalization("KaevSteelSlopesTruncCornerUp.name", "steel oblic upslope");
		ModLoader.addLocalization("KaevSteelSlopesInvCornerDown.name", "steel interior corner");
		ModLoader.addLocalization("KaevSteelSlopesInvCornerUp.name", "steel interior upcorner");

		ModLoader.addLocalization("KaevObsidianSlopesTruncCornerDown.name", "obsidian oblic slopes");
		ModLoader.addLocalization("KaevObsidianSlopesTruncCornerUp.name", "obsidian oblic upslope");
		ModLoader.addLocalization("KaevObsidianSlopesInvCornerDown.name", "obsidian interior corner");
		ModLoader.addLocalization("KaevObsidianSlopesInvCornerUp.name", "obsidian interior upcorner");

		ModLoader.addLocalization("KaevDiamondSlopesTruncCornerDown.name", "diamond oblic slopes");
		ModLoader.addLocalization("KaevDiamondSlopesTruncCornerUp.name", "diamond oblic upslope");
		ModLoader.addLocalization("KaevDiamondSlopesInvCornerDown.name", "diamond interior corner");
		ModLoader.addLocalization("KaevDiamondSlopesInvCornerUp.name", "diamond interior upcorner");	

		ModLoader.addLocalization("KaevWhiteWoolSlopesTruncCornerDown.name", "white oblic slopes");
		ModLoader.addLocalization("KaevWhiteWoolSlopesTruncCornerUp.name", "white oblic upslope");
		ModLoader.addLocalization("KaevWhiteWoolSlopesInvCornerDown.name", "white interior corner");
		ModLoader.addLocalization("KaevWhiteWoolSlopesInvCornerUp.name", "white interior upcorner");

		ModLoader.addLocalization("KaevBlackWoolSlopesTruncCornerDown.name", "black oblic slopes");
		ModLoader.addLocalization("KaevBlackWoolSlopesTruncCornerUp.name", "black oblic upslope");
		ModLoader.addLocalization("KaevBlackWoolSlopesInvCornerDown.name", "black interior corner");
		ModLoader.addLocalization("KaevBlackWoolSlopesInvCornerUp.name", "black interior upcorner");

		ModLoader.addLocalization("KaevRedWoolSlopesTruncCornerDown.name", "red oblic slopes");
		ModLoader.addLocalization("KaevRedWoolSlopesTruncCornerUp.name", "red oblic upslope");
		ModLoader.addLocalization("KaevRedWoolSlopesInvCornerDown.name", "red interior corner");
		ModLoader.addLocalization("KaevRedWoolSlopesInvCornerUp.name", "red interior upcorner");

		ModLoader.addLocalization("KaevGreenWoolSlopesTruncCornerDown.name", "green oblic slopes");
		ModLoader.addLocalization("KaevGreenWoolSlopesTruncCornerUp.name", "green oblic upslope");
		ModLoader.addLocalization("KaevGreenWoolSlopesInvCornerDown.name", "green interior corner");
		ModLoader.addLocalization("KaevGreenWoolSlopesInvCornerUp.name", "green interior upcorner");

		ModLoader.addLocalization("KaevBrownWoolSlopesTruncCornerDown.name", "brown oblic slopes");
		ModLoader.addLocalization("KaevBrownWoolSlopesTruncCornerUp.name", "brown oblic upslope");
		ModLoader.addLocalization("KaevBrownWoolSlopesInvCornerDown.name", "brown interior corner");
		ModLoader.addLocalization("KaevBrownWoolSlopesInvCornerUp.name", "brown interior upcorner");

		ModLoader.addLocalization("KaevBlueWoolSlopesTruncCornerDown.name", "blue oblic slopes");
		ModLoader.addLocalization("KaevBlueWoolSlopesTruncCornerUp.name", "blue oblic upslope");
		ModLoader.addLocalization("KaevBlueWoolSlopesInvCornerDown.name", "blue interior corner");
		ModLoader.addLocalization("KaevBlueWoolSlopesInvCornerUp.name", "blue interior upcorner");

		ModLoader.addLocalization("KaevPurpleWoolSlopesTruncCornerDown.name", "purple oblic slopes");
		ModLoader.addLocalization("KaevPurpleWoolSlopesTruncCornerUp.name", "purple oblic upslope");
		ModLoader.addLocalization("KaevPurpleWoolSlopesInvCornerDown.name", "purple interior corner");
		ModLoader.addLocalization("KaevPurpleWoolSlopesInvCornerUp.name", "purple interior upcorner");

		ModLoader.addLocalization("KaevCyanWoolSlopesTruncCornerDown.name", "cyan oblic slopes");
		ModLoader.addLocalization("KaevCyanWoolSlopesTruncCornerUp.name", "cyan oblic upslope");
		ModLoader.addLocalization("KaevCyanWoolSlopesInvCornerDown.name", "cyan interior corner");
		ModLoader.addLocalization("KaevCyanWoolSlopesInvCornerUp.name", "cyan interior upcorner");

		ModLoader.addLocalization("KaevSilverWoolSlopesTruncCornerDown.name", "silver oblic slopes");
		ModLoader.addLocalization("KaevSilverWoolSlopesTruncCornerUp.name", "silver oblic upslope");
		ModLoader.addLocalization("KaevSilverWoolSlopesInvCornerDown.name", "silver interior corner");
		ModLoader.addLocalization("KaevSilverWoolSlopesInvCornerUp.name", "silver interior upcorner");

		ModLoader.addLocalization("KaevGrayWoolSlopesTruncCornerDown.name", "gray oblic slopes");
		ModLoader.addLocalization("KaevGrayWoolSlopesTruncCornerUp.name", "gray oblic upslope");
		ModLoader.addLocalization("KaevGrayWoolSlopesInvCornerDown.name", "gray interior corner");
		ModLoader.addLocalization("KaevGrayWoolSlopesInvCornerUp.name", "gray interior upcorner");

		ModLoader.addLocalization("KaevPinkWoolSlopesTruncCornerDown.name", "pink oblic slopes");
		ModLoader.addLocalization("KaevPinkWoolSlopesTruncCornerUp.name", "pink oblic upslope");
		ModLoader.addLocalization("KaevPinkWoolSlopesInvCornerDown.name", "pink interior corner");
		ModLoader.addLocalization("KaevPinkWoolSlopesInvCornerUp.name", "pink interior upcorner");

		ModLoader.addLocalization("KaevLimeWoolSlopesTruncCornerDown.name", "lime oblic slopes");
		ModLoader.addLocalization("KaevLimeWoolSlopesTruncCornerUp.name", "lime oblic upslope");
		ModLoader.addLocalization("KaevLimeWoolSlopesInvCornerDown.name", "lime interior corner");
		ModLoader.addLocalization("KaevLimeWoolSlopesInvCornerUp.name", "lime interior upcorner");

		ModLoader.addLocalization("KaevYellowWoolSlopesTruncCornerDown.name", "yellow oblic slopes");
		ModLoader.addLocalization("KaevYellowWoolSlopesTruncCornerUp.name", "yellow oblic upslope");
		ModLoader.addLocalization("KaevYellowWoolSlopesInvCornerDown.name", "yellow interior corner");
		ModLoader.addLocalization("KaevYellowWoolSlopesInvCornerUp.name", "yellow interior upcorner");

		ModLoader.addLocalization("KaevLightBlueWoolSlopesTruncCornerDown.name", "lightBlue oblic slopes");
		ModLoader.addLocalization("KaevLightBlueWoolSlopesTruncCornerUp.name", "lightBlue oblic upslope");
		ModLoader.addLocalization("KaevLightBlueWoolSlopesInvCornerDown.name", "lightBlue interior corner");
		ModLoader.addLocalization("KaevLightBlueWoolSlopesInvCornerUp.name", "lightBlue interior upcorner");

		ModLoader.addLocalization("KaevMagentaWoolSlopesTruncCornerDown.name", "magenta oblic slopes");
		ModLoader.addLocalization("KaevMagentaWoolSlopesTruncCornerUp.name", "magenta oblic upslope");
		ModLoader.addLocalization("KaevMagentaWoolSlopesInvCornerDown.name", "magenta interior corner");
		ModLoader.addLocalization("KaevMagentaWoolSlopesInvCornerUp.name", "magenta interior upcorner");

		ModLoader.addLocalization("KaevOrangeWoolSlopesTruncCornerDown.name", "orange oblic slopes");
		ModLoader.addLocalization("KaevOrangeWoolSlopesTruncCornerUp.name", "orange oblic upslope");
		ModLoader.addLocalization("KaevOrangeWoolSlopesInvCornerDown.name", "orange interior corner");
		ModLoader.addLocalization("KaevOrangeWoolSlopesInvCornerUp.name", "orange interior upcorner");
		
		if(props.getInt("BlockKaevWoodIntCorners") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevWoodIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {
				"  #", "###", Character.valueOf('#'), Block.planks
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevWoodIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {
				"###", "  #", Character.valueOf('#'), Block.planks
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevWoodIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {
				"## ", "# #", Character.valueOf('#'), Block.planks
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevWoodIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {
				"# #", "## ", Character.valueOf('#'), Block.planks
			});	
			ModLoader.addRecipe(new ItemStack(Block.planks, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevWoodIntCorners
			});	
		}

		if(props.getInt("BlockKaevCobblestoneIntCorners") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevCobblestoneIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {
				"  #", "###", Character.valueOf('#'), Block.cobblestone
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevCobblestoneIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {
				"###", "  #", Character.valueOf('#'), Block.cobblestone
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevCobblestoneIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {
				"## ", "# #", Character.valueOf('#'), Block.cobblestone
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevCobblestoneIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {
				"# #", "## ", Character.valueOf('#'), Block.cobblestone
			});	
			ModLoader.addRecipe(new ItemStack(Block.cobblestone, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevCobblestoneIntCorners
			});	
		}

		if(props.getInt("BlockKaevGlassIntCorners") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevGlassIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {
				"  #", "###", Character.valueOf('#'), Block.glass
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevGlassIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {
				"###", "  #", Character.valueOf('#'), Block.glass
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevGlassIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {
				"## ", "# #", Character.valueOf('#'), Block.glass
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevGlassIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {
				"# #", "## ", Character.valueOf('#'), Block.glass
			});	
			ModLoader.addRecipe(new ItemStack(Block.glass, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevGlassIntCorners
			});	
		}

		if(props.getInt("BlockKaevSandstoneIntCorners") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevSandstoneIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {
				"  #", "###", Character.valueOf('#'), Block.sandStone
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevSandstoneIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {
				"###", "  #", Character.valueOf('#'), Block.sandStone
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevSandstoneIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {
				"## ", "# #", Character.valueOf('#'), Block.sandStone
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevSandstoneIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {
				"# #", "## ", Character.valueOf('#'), Block.sandStone
			});	
			ModLoader.addRecipe(new ItemStack(Block.sandStone, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevSandstoneIntCorners
			});	
		}

		if(props.getInt("BlockKaevDirtIntCorners") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevDirtIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {
				"  #", "###", Character.valueOf('#'), Block.dirt
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevDirtIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {
				"###", "  #", Character.valueOf('#'), Block.dirt
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevDirtIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {
				"## ", "# #", Character.valueOf('#'), Block.dirt
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevDirtIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {
				"# #", "## ", Character.valueOf('#'), Block.dirt
			});	
			ModLoader.addRecipe(new ItemStack(Block.dirt, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevDirtIntCorners
			});	
		}

		if(props.getInt("BlockKaevStoneIntCorners") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevStoneIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {
				"  #", "###", Character.valueOf('#'), Block.stone
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevStoneIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {
				"###", "  #", Character.valueOf('#'), Block.stone
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevStoneIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {
				"## ", "# #", Character.valueOf('#'), Block.stone
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevStoneIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {
				"# #", "## ", Character.valueOf('#'), Block.stone
			});	
			ModLoader.addRecipe(new ItemStack(Block.stone, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevStoneIntCorners
			});	
		}

		if(props.getInt("BlockKaevSandIntCorners") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevSandIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {
				"  #", "###", Character.valueOf('#'), Block.sand
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevSandIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {
				"###", "  #", Character.valueOf('#'), Block.sand
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevSandIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {
				"## ", "# #", Character.valueOf('#'), Block.sand
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevSandIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {
				"# #", "## ", Character.valueOf('#'), Block.sand
			});	
			ModLoader.addRecipe(new ItemStack(Block.sand, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevSandIntCorners
			});	
		}

		if(props.getInt("BlockKaevSnowIntCorners") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevSnowIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {
				"  #", "###", Character.valueOf('#'), Block.blockSnow
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevSnowIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {
				"###", "  #", Character.valueOf('#'), Block.blockSnow
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevSnowIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {
				"## ", "# #", Character.valueOf('#'), Block.blockSnow
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevSnowIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {
				"# #", "## ", Character.valueOf('#'), Block.blockSnow
			});	
			ModLoader.addRecipe(new ItemStack(Block.blockSnow, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevSnowIntCorners
			});	
		}

		if(props.getInt("BlockKaevGrassIntCorners") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevGrassIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {
				"  #", "###", Character.valueOf('#'), Block.grass
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevGrassIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {
				"###", "  #", Character.valueOf('#'), Block.grass
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevGrassIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {
				"## ", "# #", Character.valueOf('#'), Block.grass
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevGrassIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {
				"# #", "## ", Character.valueOf('#'), Block.grass
			});	
			ModLoader.addRecipe(new ItemStack(Block.grass, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevGrassIntCorners
			});	
		}

		if(props.getInt("BlockKaevBricksIntCorners") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevBricksIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {
				"  #", "###", Character.valueOf('#'), Block.brick
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevBricksIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {
				"###", "  #", Character.valueOf('#'), Block.brick
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevBricksIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {
				"## ", "# #", Character.valueOf('#'), Block.brick
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevBricksIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {
				"# #", "## ", Character.valueOf('#'), Block.brick
			});	
			ModLoader.addRecipe(new ItemStack(Block.brick, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevBricksIntCorners
			});	
		}

		if(props.getInt("BlockKaevGravelIntCorners") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevGravelIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {
				"  #", "###", Character.valueOf('#'), Block.gravel
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevGravelIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {
				"###", "  #", Character.valueOf('#'), Block.gravel
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevGravelIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {
				"## ", "# #", Character.valueOf('#'), Block.gravel
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevGravelIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {
				"# #", "## ", Character.valueOf('#'), Block.gravel
			});	
			ModLoader.addRecipe(new ItemStack(Block.gravel, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevGravelIntCorners
			});	
		}

		if(props.getInt("BlockKaevGoldIntCorners") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevGoldIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {
				"  #", "###", Character.valueOf('#'), Block.blockGold
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevGoldIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {
				"###", "  #", Character.valueOf('#'), Block.blockGold
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevGoldIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {
				"## ", "# #", Character.valueOf('#'), Block.blockGold
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevGoldIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {
				"# #", "## ", Character.valueOf('#'), Block.blockGold
			});	
			ModLoader.addRecipe(new ItemStack(Block.blockGold, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevGoldIntCorners
			});	
		}

		if(props.getInt("BlockKaevSteelIntCorners") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevSteelIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {
				"  #", "###", Character.valueOf('#'), Block.blockSteel
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevSteelIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {
				"###", "  #", Character.valueOf('#'), Block.blockSteel
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevSteelIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {
				"## ", "# #", Character.valueOf('#'), Block.blockSteel
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevSteelIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {
				"# #", "## ", Character.valueOf('#'), Block.blockSteel
			});	
			ModLoader.addRecipe(new ItemStack(Block.blockSteel, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevSteelIntCorners
			});	
		}

		if(props.getInt("BlockKaevObsidianIntCorners") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevObsidianIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {
				"  #", "###", Character.valueOf('#'), Block.obsidian
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevObsidianIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {
				"###", "  #", Character.valueOf('#'), Block.obsidian
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevObsidianIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {
				"## ", "# #", Character.valueOf('#'), Block.obsidian
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevObsidianIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {
				"# #", "## ", Character.valueOf('#'), Block.obsidian
			});	
			ModLoader.addRecipe(new ItemStack(Block.obsidian, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevObsidianIntCorners
			});	
		}

		if(props.getInt("BlockKaevDiamondIntCorners") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevDiamondIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {
				"  #", "###", Character.valueOf('#'), Block.blockDiamond
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevDiamondIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {
				"###", "  #", Character.valueOf('#'), Block.blockDiamond
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevDiamondIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {
				"## ", "# #", Character.valueOf('#'), Block.blockDiamond
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevDiamondIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {
				"# #", "## ", Character.valueOf('#'), Block.blockDiamond
			});	
			ModLoader.addRecipe(new ItemStack(Block.blockDiamond, 1), new Object[] {
				"#", Character.valueOf('#'), BlockKaevDiamondIntCorners
			});	
		}
		
		if(props.getInt("BlockKaevWhiteWoolIntCorners") != 0){
			ModLoader.addRecipe(new ItemStack(BlockKaevWhiteWoolIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(0)), new Object[] {
			    "  #", "###", Character.valueOf('#'), Block.cloth
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevWhiteWoolIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(4)), new Object[] {
			    "###", "  #", Character.valueOf('#'), Block.cloth
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevWhiteWoolIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(8)), new Object[] {
			    "## ", "# #", Character.valueOf('#'), Block.cloth
			});	
			ModLoader.addRecipe(new ItemStack(BlockKaevWhiteWoolIntCorners, 4, BlockIntCorners_Kaevator.func_21035_d(12)), new Object[] {
			    "# #", "## ", Character.valueOf('#'), Block.cloth
			});	
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 0), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevWhiteWoolIntCorners
			});	
		}
		
		if(props.getInt("BlockKaevBlackWoolIntCorners") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 15), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevBlackWoolIntCorners
			});	
		}

		if(props.getInt("BlockKaevRedWoolIntCorners") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 14), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevRedWoolIntCorners
			});	
		}

		if(props.getInt("BlockKaevGreenWoolIntCorners") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 13), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevGreenWoolIntCorners
			});	
		}

		if(props.getInt("BlockKaevBrownWoolIntCorners") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 12), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevBrownWoolIntCorners
			});	
		}

		if(props.getInt("BlockKaevBlueWoolIntCorners") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 11), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevBlueWoolIntCorners
			});	
		}

		if(props.getInt("BlockKaevPurpleWoolIntCorners") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 10), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevPurpleWoolIntCorners
			});	
		}

		if(props.getInt("BlockKaevCyanWoolIntCorners") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 9), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevCyanWoolIntCorners
			});	
		}

		if(props.getInt("BlockKaevSilverWoolIntCorners") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 8), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevSilverWoolIntCorners
			});	
		}

		if(props.getInt("BlockKaevGrayWoolIntCorners") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 7), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevGrayWoolIntCorners
			});	
		}

		if(props.getInt("BlockKaevPinkWoolIntCorners") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 6), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevPinkWoolIntCorners
			});	
		}

		if(props.getInt("BlockKaevLimeWoolIntCorners") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 5), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevLimeWoolIntCorners
			});	
		}

		if(props.getInt("BlockKaevYellowWoolIntCorners") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 4), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevYellowWoolIntCorners
			});	
		}

		if(props.getInt("BlockKaevLightBlueWoolIntCorners") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 3), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevLightBlueWoolIntCorners
			});	
		}

		if(props.getInt("BlockKaevMagentaWoolIntCorners") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 2), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevMagentaWoolIntCorners
			});	
		}

		if(props.getInt("BlockKaevOrangeWoolIntCorners") != 0){
			ModLoader.addRecipe(new ItemStack(Block.cloth, 1, 1), new Object[] {
			    "#", Character.valueOf('#'), BlockKaevOrangeWoolIntCorners
			});	
		}
	}
	
	private static String getAppdata()
	{
		return Minecraft.getMinecraftDir().getPath();
	}		
		
	public static KrushProps props;
	
	public static int IntCornersRenderID;
	public static int SlopesOpacity;	
	
	public static final Block BlockKaevWoodIntCorners;
	public static final Block BlockKaevCobblestoneIntCorners;
	public static final Block BlockKaevGlassIntCorners;
	public static final Block BlockKaevSandstoneIntCorners;
	public static final Block BlockKaevDirtIntCorners;
	public static final Block BlockKaevStoneIntCorners;
	public static final Block BlockKaevSandIntCorners;
	public static final Block BlockKaevSnowIntCorners;
	public static final Block BlockKaevGrassIntCorners;
	public static final Block BlockKaevBricksIntCorners;
	public static final Block BlockKaevGravelIntCorners;
	public static final Block BlockKaevGoldIntCorners;
	public static final Block BlockKaevSteelIntCorners;
	public static final Block BlockKaevObsidianIntCorners;
	public static final Block BlockKaevDiamondIntCorners;
	public static final Block BlockKaevWhiteWoolIntCorners;
	public static final Block BlockKaevBlackWoolIntCorners;
	public static final Block BlockKaevRedWoolIntCorners;
	public static final Block BlockKaevGreenWoolIntCorners;
	public static final Block BlockKaevBrownWoolIntCorners;
	public static final Block BlockKaevBlueWoolIntCorners;
	public static final Block BlockKaevPurpleWoolIntCorners;
	public static final Block BlockKaevCyanWoolIntCorners;
	public static final Block BlockKaevSilverWoolIntCorners;
	public static final Block BlockKaevGrayWoolIntCorners;
	public static final Block BlockKaevPinkWoolIntCorners;
	public static final Block BlockKaevLimeWoolIntCorners;
	public static final Block BlockKaevYellowWoolIntCorners;
	public static final Block BlockKaevLightBlueWoolIntCorners;
	public static final Block BlockKaevMagentaWoolIntCorners;
	public static final Block BlockKaevOrangeWoolIntCorners;

	public static Item ItemKaevWoodIntCorners;
	public static Item ItemKaevCobblestoneIntCorners;
	public static Item ItemKaevGlassIntCorners;
	public static Item ItemKaevSandstoneIntCorners;
	public static Item ItemKaevDirtIntCorners;
	public static Item ItemKaevStoneIntCorners;
	public static Item ItemKaevSandIntCorners;
	public static Item ItemKaevSnowIntCorners;
	public static Item ItemKaevGrassIntCorners;
	public static Item ItemKaevBricksIntCorners;
	public static Item ItemKaevGravelIntCorners;
	public static Item ItemKaevGoldIntCorners;
	public static Item ItemKaevSteelIntCorners;
	public static Item ItemKaevObsidianIntCorners;
	public static Item ItemKaevDiamondIntCorners;
	public static Item ItemKaevWhiteWoolIntCorners;
	public static Item ItemKaevBlackWoolIntCorners;
	public static Item ItemKaevRedWoolIntCorners;
	public static Item ItemKaevGreenWoolIntCorners;
	public static Item ItemKaevBrownWoolIntCorners;
	public static Item ItemKaevBlueWoolIntCorners;
	public static Item ItemKaevPurpleWoolIntCorners;
	public static Item ItemKaevCyanWoolIntCorners;
	public static Item ItemKaevSilverWoolIntCorners;
	public static Item ItemKaevGrayWoolIntCorners;
	public static Item ItemKaevPinkWoolIntCorners;
	public static Item ItemKaevLimeWoolIntCorners;
	public static Item ItemKaevYellowWoolIntCorners;
	public static Item ItemKaevLightBlueWoolIntCorners;
	public static Item ItemKaevMagentaWoolIntCorners;
	public static Item ItemKaevOrangeWoolIntCorners;
	
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
		
		if(props.getInt("BlockKaevWoodIntCorners") != 0){
			BlockKaevWoodIntCorners = new BlockIntCorners_Kaevator(props.getInt("BlockKaevWoodIntCorners"),4,Material.wood).setHardness(2.0F).setStepSound(Block.soundWoodFootstep).setResistance(5F).setBlockName("BlockKaevWoodIntCorners");
			ItemKaevWoodIntCorners = new ItemIntCorners_Kaevator(BlockKaevWoodIntCorners.blockID - 256, "Wood").setItemName("ItemKaevWoodIntCorners");
		}else{
			BlockKaevWoodIntCorners = Block.stone;
		}
		if(props.getInt("BlockKaevCobblestoneIntCorners") != 0){
			BlockKaevCobblestoneIntCorners = new BlockIntCorners_Kaevator(props.getInt("BlockKaevCobblestoneIntCorners"),16,Material.rock).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setResistance(10F).setBlockName("BlockKaevCobblestoneIntCorners");
			ItemKaevCobblestoneIntCorners = new ItemIntCorners_Kaevator(BlockKaevCobblestoneIntCorners.blockID - 256, "Cobblestone").setItemName("ItemKaevCobblestoneIntCorners");
		}else{
			BlockKaevCobblestoneIntCorners = Block.stone;
		}
		if(props.getInt("BlockKaevGlassIntCorners") != 0){
			BlockKaevGlassIntCorners = new BlockIntCorners_Kaevator(props.getInt("BlockKaevGlassIntCorners"),49,Material.glass).setHardness(0.3F).setStepSound(Block.soundGlassFootstep).setBlockName("BlockKaevGlassIntCorners");
			ItemKaevGlassIntCorners = new ItemIntCorners_Kaevator(BlockKaevGlassIntCorners.blockID - 256, "Glass").setItemName("ItemKaevGlassIntCorners");
		}else{
			BlockKaevGlassIntCorners = Block.stone;
		}
		if(props.getInt("BlockKaevSandstoneIntCorners") != 0){
			BlockKaevSandstoneIntCorners = new BlockIntCorners_Kaevator(props.getInt("BlockKaevSandstoneIntCorners"),192,Material.rock).setHardness(0.8F).setStepSound(Block.soundStoneFootstep).setBlockName("BlockKaevSandstoneIntCorners");
			ItemKaevSandstoneIntCorners = new ItemIntCorners_Kaevator(BlockKaevSandstoneIntCorners.blockID - 256, "Sandstone").setItemName("ItemKaevSandstoneIntCorners");
		}else{
			BlockKaevSandstoneIntCorners = Block.stone;
		}
		if(props.getInt("BlockKaevDirtIntCorners") != 0){
			BlockKaevDirtIntCorners = new BlockIntCorners_Kaevator(props.getInt("BlockKaevDirtIntCorners"),2,Material.ground).setHardness(0.5F).setStepSound(Block.soundGravelFootstep).setBlockName("BlockKaevDirtIntCorners");
			ItemKaevDirtIntCorners = new ItemIntCorners_Kaevator(BlockKaevDirtIntCorners.blockID - 256, "Dirt").setItemName("ItemKaevDirtIntCorners");
		}else{
			BlockKaevDirtIntCorners = Block.stone;
		}
		if(props.getInt("BlockKaevStoneIntCorners") != 0){
			BlockKaevStoneIntCorners = new BlockIntCorners_Kaevator(props.getInt("BlockKaevStoneIntCorners"),1,Material.rock).setHardness(1.5F).setStepSound(Block.soundStoneFootstep).setResistance(10F).setBlockName("BlockKaevStoneIntCorners");
			ItemKaevStoneIntCorners = new ItemIntCorners_Kaevator(BlockKaevStoneIntCorners.blockID - 256, "Stone").setItemName("ItemKaevStoneIntCorners");
		}else{
			BlockKaevStoneIntCorners = Block.stone;
		}
		if(props.getInt("BlockKaevSandIntCorners") != 0){
			BlockKaevSandIntCorners = new BlockIntCorners_Kaevator(props.getInt("BlockKaevSandIntCorners"),18,Material.sand).setHardness(0.5F).setStepSound(Block.soundSandFootstep).setBlockName("BlockKaevSandIntCorners");
			ItemKaevSandIntCorners = new ItemIntCorners_Kaevator(BlockKaevSandIntCorners.blockID - 256, "Sand").setItemName("ItemKaevSandIntCorners");
		}else{
			BlockKaevSandIntCorners = Block.stone;
		}
		if(props.getInt("BlockKaevSnowIntCorners") != 0){
			BlockKaevSnowIntCorners = new BlockIntCorners_Kaevator(props.getInt("BlockKaevSnowIntCorners"),66,Material.snow).setHardness(0.1F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevSnowIntCorners");
			ItemKaevSnowIntCorners = new ItemIntCorners_Kaevator(BlockKaevSnowIntCorners.blockID - 256, "Snow").setItemName("ItemKaevSnowIntCorners");
		}else{
			BlockKaevSnowIntCorners = Block.stone;
		}
		if(props.getInt("BlockKaevGrassIntCorners") != 0){
			BlockKaevGrassIntCorners = new BlockIntCorners_Kaevator(props.getInt("BlockKaevGrassIntCorners"),3,Material.ground).setHardness(0.6F).setStepSound(Block.soundGrassFootstep).setBlockName("BlockKaevGrassIntCorners");
			ItemKaevGrassIntCorners = new ItemIntCorners_Kaevator(BlockKaevGrassIntCorners.blockID - 256, "Grass").setItemName("ItemKaevGrassIntCorners");
		}else{
			BlockKaevGrassIntCorners = Block.stone;
		}
		if(props.getInt("BlockKaevBricksIntCorners") != 0){
			BlockKaevBricksIntCorners = new BlockIntCorners_Kaevator(props.getInt("BlockKaevBricksIntCorners"),7,Material.rock).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setResistance(10F).setBlockName("BlockKaevBricksIntCorners");
			ItemKaevBricksIntCorners = new ItemIntCorners_Kaevator(BlockKaevBricksIntCorners.blockID - 256, "Bricks").setItemName("ItemKaevBricksIntCorners");
		}else{
			BlockKaevBricksIntCorners = Block.stone;
		}
		if(props.getInt("BlockKaevGravelIntCorners") != 0){
			BlockKaevGravelIntCorners = new BlockIntCorners_Kaevator(props.getInt("BlockKaevGravelIntCorners"),19,Material.sand).setHardness(0.6F).setStepSound(Block.soundGravelFootstep).setBlockName("BlockKaevGravelIntCorners");
			ItemKaevGravelIntCorners = new ItemIntCorners_Kaevator(BlockKaevGravelIntCorners.blockID - 256, "Gravel").setItemName("ItemKaevGravelIntCorners");
		}else{
			BlockKaevGravelIntCorners = Block.stone;
		}
		if(props.getInt("BlockKaevGoldIntCorners") != 0){
			BlockKaevGoldIntCorners = new BlockIntCorners_Kaevator(props.getInt("BlockKaevGoldIntCorners"),23,Material.iron).setHardness(3F).setStepSound(Block.soundMetalFootstep).setResistance(10F).setBlockName("BlockKaevGoldIntCorners");
			ItemKaevGoldIntCorners = new ItemIntCorners_Kaevator(BlockKaevGoldIntCorners.blockID - 256, "Gold").setItemName("ItemKaevGoldIntCorners");
		}else{
			BlockKaevGoldIntCorners = Block.stone;
		}
		if(props.getInt("BlockKaevSteelIntCorners") != 0){
			BlockKaevSteelIntCorners = new BlockIntCorners_Kaevator(props.getInt("BlockKaevSteelIntCorners"),22,Material.iron).setHardness(5F).setStepSound(Block.soundMetalFootstep).setResistance(10F).setBlockName("BlockKaevSteelIntCorners");
			ItemKaevSteelIntCorners = new ItemIntCorners_Kaevator(BlockKaevSteelIntCorners.blockID - 256, "Steel").setItemName("ItemKaevSteelIntCorners");
		}else{
			BlockKaevSteelIntCorners = Block.stone;
		}
		if(props.getInt("BlockKaevObsidianIntCorners") != 0){
			BlockKaevObsidianIntCorners = new BlockIntCorners_Kaevator(props.getInt("BlockKaevObsidianIntCorners"),37,Material.rock).setHardness(10F).setStepSound(Block.soundStoneFootstep).setResistance(2000F).setBlockName("BlockKaevObsidianIntCorners");
			ItemKaevObsidianIntCorners = new ItemIntCorners_Kaevator(BlockKaevObsidianIntCorners.blockID - 256, "Obsidian").setItemName("ItemKaevObsidianIntCorners");
		}else{
			BlockKaevObsidianIntCorners = Block.stone;
		}
		if(props.getInt("BlockKaevDiamondIntCorners") != 0){
			BlockKaevDiamondIntCorners = new BlockIntCorners_Kaevator(props.getInt("BlockKaevDiamondIntCorners"),24,Material.iron).setHardness(5F).setStepSound(Block.soundMetalFootstep).setResistance(10F).setBlockName("BlockKaevDiamondIntCorners");
			ItemKaevDiamondIntCorners = new ItemIntCorners_Kaevator(BlockKaevDiamondIntCorners.blockID - 256, "Diamond").setItemName("ItemKaevDiamondIntCorners");
		}else{
			BlockKaevDiamondIntCorners = Block.stone;
		}
		if(props.getInt("BlockKaevWhiteWoolIntCorners") != 0){
			BlockKaevWhiteWoolIntCorners = new BlockIntCorners_Kaevator(props.getInt("BlockKaevWhiteWoolIntCorners", 212),64,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevWhiteWoolIntCorners");
			ItemKaevWhiteWoolIntCorners = new ItemIntCorners_Kaevator(BlockKaevWhiteWoolIntCorners.blockID - 256, "WhiteWool").setItemName("ItemKaevWhiteWoolIntCorners");
		}else{
			BlockKaevWhiteWoolIntCorners = Block.stone;
		}
		if(props.getInt("BlockKaevBlackWoolIntCorners") != 0){
			BlockKaevBlackWoolIntCorners = new BlockIntCorners_Kaevator(props.getInt("BlockKaevBlackWoolIntCorners", 213),113,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevBlackWoolIntCorners");
			ItemKaevBlackWoolIntCorners = new ItemIntCorners_Kaevator(BlockKaevBlackWoolIntCorners.blockID - 256, "BlackWool").setItemName("ItemKaevBlackWoolIntCorners");
		}else{
			BlockKaevBlackWoolIntCorners = Block.stone;
		}
		if(props.getInt("BlockKaevRedWoolIntCorners") != 0){
			BlockKaevRedWoolIntCorners = new BlockIntCorners_Kaevator(props.getInt("BlockKaevRedWoolIntCorners", 214),129,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevRedWoolIntCorners");
			ItemKaevRedWoolIntCorners = new ItemIntCorners_Kaevator(BlockKaevRedWoolIntCorners.blockID - 256, "RedWool").setItemName("ItemKaevRedWoolIntCorners");
		}else{
			BlockKaevRedWoolIntCorners = Block.stone;
		}
		if(props.getInt("BlockKaevGreenWoolIntCorners") != 0){
			BlockKaevGreenWoolIntCorners = new BlockIntCorners_Kaevator(props.getInt("BlockKaevGreenWoolIntCorners", 215),145,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevGreenWoolIntCorners");
			ItemKaevGreenWoolIntCorners = new ItemIntCorners_Kaevator(BlockKaevGreenWoolIntCorners.blockID - 256, "GreenWool").setItemName("ItemKaevGreenWoolIntCorners");
		}else{
			BlockKaevGreenWoolIntCorners = Block.stone;
		}
		if(props.getInt("BlockKaevBrownWoolIntCorners") != 0){
			BlockKaevBrownWoolIntCorners = new BlockIntCorners_Kaevator(props.getInt("BlockKaevBrownWoolIntCorners", 216),161,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevBrownWoolIntCorners");
			ItemKaevBrownWoolIntCorners = new ItemIntCorners_Kaevator(BlockKaevBrownWoolIntCorners.blockID - 256, "BrownWool").setItemName("ItemKaevBrownWoolIntCorners");
		}else{
			BlockKaevBrownWoolIntCorners = Block.stone;
		}
		if(props.getInt("BlockKaevBlueWoolIntCorners") != 0){
			BlockKaevBlueWoolIntCorners = new BlockIntCorners_Kaevator(props.getInt("BlockKaevBlueWoolIntCorners", 217),177,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevBlueWoolIntCorners");
			ItemKaevBlueWoolIntCorners = new ItemIntCorners_Kaevator(BlockKaevBlueWoolIntCorners.blockID - 256, "BlueWool").setItemName("ItemKaevBlueWoolIntCorners");
		}else{
			BlockKaevBlueWoolIntCorners = Block.stone;
		}
		if(props.getInt("BlockKaevPurpleWoolIntCorners") != 0){
			BlockKaevPurpleWoolIntCorners = new BlockIntCorners_Kaevator(props.getInt("BlockKaevPurpleWoolIntCorners", 218),193,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevPurpleWoolIntCorners");
			ItemKaevPurpleWoolIntCorners = new ItemIntCorners_Kaevator(BlockKaevPurpleWoolIntCorners.blockID - 256, "PurpleWool").setItemName("ItemKaevPurpleWoolIntCorners");
		}else{
			BlockKaevPurpleWoolIntCorners = Block.stone;
		}
		if(props.getInt("BlockKaevCyanWoolIntCorners") != 0){
			BlockKaevCyanWoolIntCorners = new BlockIntCorners_Kaevator(props.getInt("BlockKaevCyanWoolIntCorners", 219),209,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevCyanWoolIntCorners");
			ItemKaevCyanWoolIntCorners = new ItemIntCorners_Kaevator(BlockKaevCyanWoolIntCorners.blockID - 256, "CyanWool").setItemName("ItemKaevCyanWoolIntCorners");
		}else{
			BlockKaevCyanWoolIntCorners = Block.stone;
		}
		if(props.getInt("BlockKaevSilverWoolIntCorners") != 0){
			BlockKaevSilverWoolIntCorners = new BlockIntCorners_Kaevator(props.getInt("BlockKaevSilverWoolIntCorners", 220),225,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevSilverWoolIntCorners");
			ItemKaevSilverWoolIntCorners = new ItemIntCorners_Kaevator(BlockKaevSilverWoolIntCorners.blockID - 256, "SilverWool").setItemName("ItemKaevSilverWoolIntCorners");
		}else{
			BlockKaevSilverWoolIntCorners = Block.stone;
		}
		if(props.getInt("BlockKaevGrayWoolIntCorners") != 0){
			BlockKaevGrayWoolIntCorners = new BlockIntCorners_Kaevator(props.getInt("BlockKaevGrayWoolIntCorners", 221),114,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevGrayWoolIntCorners");
			ItemKaevGrayWoolIntCorners = new ItemIntCorners_Kaevator(BlockKaevGrayWoolIntCorners.blockID - 256, "GrayWool").setItemName("ItemKaevGrayWoolIntCorners");
		}else{
			BlockKaevGrayWoolIntCorners = Block.stone;
		}
		if(props.getInt("BlockKaevPinkWoolIntCorners") != 0){
			BlockKaevPinkWoolIntCorners = new BlockIntCorners_Kaevator(props.getInt("BlockKaevPinkWoolIntCorners", 222),130,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevPinkWoolIntCorners");
			ItemKaevPinkWoolIntCorners = new ItemIntCorners_Kaevator(BlockKaevPinkWoolIntCorners.blockID - 256, "PinkWool").setItemName("ItemKaevPinkWoolIntCorners");
		}else{
			BlockKaevPinkWoolIntCorners = Block.stone;
		}
		if(props.getInt("BlockKaevLimeWoolIntCorners") != 0){
			BlockKaevLimeWoolIntCorners = new BlockIntCorners_Kaevator(props.getInt("BlockKaevLimeWoolIntCorners", 223),146,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevLimeWoolIntCorners");
			ItemKaevLimeWoolIntCorners = new ItemIntCorners_Kaevator(BlockKaevLimeWoolIntCorners.blockID - 256, "LimeWool").setItemName("ItemKaevLimeWoolIntCorners");
		}else{
			BlockKaevLimeWoolIntCorners = Block.stone;
		}
		if(props.getInt("BlockKaevYellowWoolIntCorners") != 0){
			BlockKaevYellowWoolIntCorners = new BlockIntCorners_Kaevator(props.getInt("BlockKaevYellowWoolIntCorners", 224),162,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevYellowWoolIntCorners");
			ItemKaevYellowWoolIntCorners = new ItemIntCorners_Kaevator(BlockKaevYellowWoolIntCorners.blockID - 256, "YellowWool").setItemName("ItemKaevYellowWoolIntCorners");
		}else{
			BlockKaevYellowWoolIntCorners = Block.stone;
		}
		if(props.getInt("BlockKaevLightBlueWoolIntCorners") != 0){
			BlockKaevLightBlueWoolIntCorners = new BlockIntCorners_Kaevator(props.getInt("BlockKaevLightBlueWoolIntCorners", 225),178,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevLightBlueWoolIntCorners");
			ItemKaevLightBlueWoolIntCorners = new ItemIntCorners_Kaevator(BlockKaevLightBlueWoolIntCorners.blockID - 256, "LightBlueWool").setItemName("ItemKaevLightBlueWoolIntCorners");
		}else{
			BlockKaevLightBlueWoolIntCorners = Block.stone;
		}
		if(props.getInt("BlockKaevMagentaWoolIntCorners") != 0){
			BlockKaevMagentaWoolIntCorners = new BlockIntCorners_Kaevator(props.getInt("BlockKaevMagentaWoolIntCorners", 226),194,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevMagentaWoolIntCorners");
			ItemKaevMagentaWoolIntCorners = new ItemIntCorners_Kaevator(BlockKaevMagentaWoolIntCorners.blockID - 256, "MagentaWool").setItemName("ItemKaevMagentaWoolIntCorners");
		}else{
			BlockKaevMagentaWoolIntCorners = Block.stone;
		}
		if(props.getInt("BlockKaevOrangeWoolIntCorners") != 0){
			BlockKaevOrangeWoolIntCorners = new BlockIntCorners_Kaevator(props.getInt("BlockKaevOrangeWoolIntCorners", 227),210,Material.cloth).setHardness(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("BlockKaevOrangeWoolIntCorners");
			ItemKaevOrangeWoolIntCorners = new ItemIntCorners_Kaevator(BlockKaevOrangeWoolIntCorners.blockID - 256, "OrangeWool").setItemName("ItemKaevOrangeWoolIntCorners");
		}else{
			BlockKaevOrangeWoolIntCorners = Block.stone;
		}
		
		props.save();
	}		
	
	public void renderInvBlock(RenderBlocks renderblocks, Block block, int i, int j)
    {
		Tessellator tessellator = Tessellator.instance;			
		if(j == IntCornersRenderID)
        {            
			block.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
		
			GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
			tessellator.startDrawingQuads();
			tessellator.setNormal(0.0F, -1F, 0.0F);
			renderIntCornersBottomFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSideAndMetadata(0,i),i+1, renderblocks, 240);
			tessellator.draw();
			tessellator.startDrawingQuads();
			tessellator.setNormal(0.0F, 1.0F, 0.0F);
			renderIntCornersTopFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSideAndMetadata(1,i),i+1, renderblocks, 240);
			tessellator.draw();
			tessellator.startDrawingQuads();
			tessellator.setNormal(0.0F, 0.0F, -1F);
			renderIntCornersEastFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSideAndMetadata(2,i),i+1, renderblocks, 240);
			tessellator.draw();
			tessellator.startDrawingQuads();
			tessellator.setNormal(0.0F, 0.0F, 1.0F);
			renderIntCornersWestFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSideAndMetadata(3,i),i+1, renderblocks, 240);
			tessellator.draw();
			tessellator.startDrawingQuads();
			tessellator.setNormal(-1F, 0.0F, 0.0F);
			renderIntCornersNorthFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSideAndMetadata(4,i),i+1, renderblocks, 240);
			tessellator.draw();
			tessellator.startDrawingQuads();
			tessellator.setNormal(1.0F, 0.0F, 0.0F);
			renderIntCornersSouthFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSideAndMetadata(5,i),i+1, renderblocks, 240);
			tessellator.draw();
			GL11.glTranslatef(0.5F, 0.5F, 0.5F);		
        }     
		
		block.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }	
	
	public boolean renderWorldBlock(RenderBlocks renderblocks, IBlockAccess iblockaccess, int i, int j, int k, Block block, int l)
	{		
		if(l == IntCornersRenderID)
		{
			return renderBlockIntCorners(block, i, j, k, renderblocks, iblockaccess);
		} 
		
        return false;
	}	
	
	public boolean renderBlockIntCorners(Block block, int i, int j, int k, RenderBlocks renderblocks, IBlockAccess iblockaccess)
    {
		int iDir = iblockaccess.getBlockMetadata(i, j, k);
        int l = block.colorMultiplier(iblockaccess, i, j, k);
        float f = (float)(l >> 16 & 0xff) / 255F;
        float f1 = (float)(l >> 8 & 0xff) / 255F;
        float f2 = (float)(l & 0xff) / 255F;
        
		if(Minecraft.isAmbientOcclusionEnabled())
        {			
            return renderIntCornersBlockWithAmbientOcclusion(block, i, j, k, f, f1, f2, iDir, renderblocks, iblockaccess);
        } else
        {
            return renderIntCornersBlockWithColorMultiplier(block, i, j, k, f, f1, f2, iDir, renderblocks, iblockaccess);
        } 		
    }

	public boolean renderIntCornersBlockWithAmbientOcclusion(Block block, int i, int j, int k, float f, float f1, float f2, int iDir, RenderBlocks renderblocks, IBlockAccess iblockaccess)
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
			renderIntCornersBottomFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 0),iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));		
            flag = true;
		}
		if(renderblocks.renderAllFaces || block.shouldSideBeRendered(iblockaccess, i, j + 1, k, 1))
        {
			renderIntCornersTopFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 0),iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
            flag = true;
		}
		if(renderblocks.renderAllFaces || block.shouldSideBeRendered(iblockaccess, i, j, k - 1, 2))
        {
			renderIntCornersEastFace(block, i, j, k, l, iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
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
                renderIntCornersEastFace(block, i, j, k, 38, iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
            }    
			flag = true;
		}		
		if(renderblocks.renderAllFaces || block.shouldSideBeRendered(iblockaccess, i, j, k + 1, 3))
        {
			renderIntCornersWestFace(block, i, j, k, i1, iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
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
                renderIntCornersWestFace(block, i, j, k, 38, iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
            }
            flag = true;
        }
		if(renderblocks.renderAllFaces || block.shouldSideBeRendered(iblockaccess, i - 1, j, k, 4))
        {
			renderIntCornersNorthFace(block, i, j, k, j1, iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
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
                renderIntCornersNorthFace(block, i, j, k, 38, iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
            }
            flag = true;
        }
		if(renderblocks.renderAllFaces || block.shouldSideBeRendered(iblockaccess, i + 1, j, k, 5))
        {
			renderIntCornersSouthFace(block, i, j, k, k1, iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
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
                renderIntCornersSouthFace(block, i, j, k, 38, iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
            }
            flag = true;
        }	
		
        enableAO = false;
        return flag;
    }
	
    public boolean renderIntCornersBlockWithColorMultiplier(Block block, int i, int j, int k, float f, float f1, float f2, int iDir, RenderBlocks renderblocks, IBlockAccess iblockaccess)
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
		
		if(renderblocks.renderAllFaces || block.shouldSideBeRendered(iblockaccess, i, j - 1, k, 0) || iDir/4 == 1 || iDir/4 == 3)
        {			
			float f20 = block.getAmbientOcclusionLightValue(iblockaccess, i, j - 1, k);
			if(iDir/4 == 1 || iDir/4 == 3){ 
                f20 = f19; 
			}
			tessellator.setColorOpaque_F(f10 * f20, f13 * f20, f16 * f20);
			renderIntCornersBottomFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 0), iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
			flag = true;			
        }  

		if(renderblocks.renderAllFaces || block.shouldSideBeRendered(iblockaccess, i, j + 1, k, 1) || iDir/4 == 0 || iDir/4 == 2)
        {			
			float f21 = block.getAmbientOcclusionLightValue(iblockaccess, i, j + 1, k);
			if((block.maxY != 1.0D && !block.blockMaterial.isLiquid()) || iDir/4 == 0 || iDir/4 == 2)
			{
				f21 = f19;
			}
			tessellator.setColorOpaque_F(f7 * f21, f8 * f21, f9 * f21);
			renderIntCornersTopFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 1), iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
			flag = true;			
        }   
		
        if(renderblocks.renderAllFaces || block.shouldSideBeRendered(iblockaccess, i, j, k - 1, 2) || iDir%2 == 0)
        {
			float f22 = block.getAmbientOcclusionLightValue(iblockaccess, i, j, k - 1);			
			if(iDir%2 == 0){ 
                f22 = f19; 
			}			
			tessellator.setColorOpaque_F(f11 * f22, f14 * f22, f17 * f22);		
			renderIntCornersEastFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 2), iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));		
            
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
            renderIntCornersWestFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 3), iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
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
            renderIntCornersNorthFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 4), iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
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
            renderIntCornersSouthFace(block, i, j, k, block.getBlockTexture(iblockaccess, i, j, k, 5), iDir, renderblocks, block.getMixedBrightnessForBlock(iblockaccess, i, j, k));
            flag = true;
        }
        return flag;
    } 
	
	public void renderIntCornersBottomFace(Block block, double d, double d1, double d2, int i, int iDir, RenderBlocks renderblocks, int lBrightness)
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
			if(iDir/4 == 0 || iDir/4 == 2){
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
			if(iDir == 4){
				// Pointing South-West triangle
				tessellator.setColorOpaque_F(colorRedTopLeft_BottomFace, colorGreenTopLeft_BottomFace, colorBlueTopLeft_BottomFace);
				tessellator.addVertexWithUV(d7, d9, d11, d3, d6);
				tessellator.setColorOpaque_F(colorRedBottomRight_BottomFace, colorGreenBottomLeft_BottomFace, colorBlueBottomLeft_BottomFace);
				tessellator.addVertexWithUV(d8, d9, d10, d4, d5);
				tessellator.setColorOpaque_F(colorRedBottomRight_BottomFace, colorGreenBottomRight_BottomFace, colorBlueBottomRight_BottomFace);
				tessellator.addVertexWithUV(d8, d9, d10, d4, d5);
				tessellator.setColorOpaque_F(colorRedTopRight_BottomFace, colorGreenTopRight_BottomFace, colorBlueTopRight_BottomFace);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);	
			} else	
			if(iDir == 5){
				// Pointing North-East triangle
				tessellator.setColorOpaque_F(colorRedTopLeft_BottomFace, colorGreenTopLeft_BottomFace, colorBlueTopLeft_BottomFace);
				tessellator.addVertexWithUV(d7, d9, d11, d3, d6);
				tessellator.setColorOpaque_F(colorRedBottomLeft_BottomFace, colorGreenBottomLeft_BottomFace, colorBlueBottomLeft_BottomFace);
				tessellator.addVertexWithUV(d7, d9, d10, d3, d5);
				tessellator.setColorOpaque_F(colorRedBottomRight_BottomFace, colorGreenBottomRight_BottomFace, colorBlueBottomRight_BottomFace);
				tessellator.addVertexWithUV(d8, d9, d10, d4, d5);
				tessellator.setColorOpaque_F(colorRedTopLeft_BottomFace, colorGreenTopRight_BottomFace, colorBlueTopRight_BottomFace);
				tessellator.addVertexWithUV(d7, d9, d11, d3, d6);				
			} else	
			if(iDir == 6){
				// Pointing North-West triangle
				tessellator.setColorOpaque_F(colorRedTopLeft_BottomFace, colorGreenTopLeft_BottomFace, colorBlueTopLeft_BottomFace);
				tessellator.addVertexWithUV(d7, d9, d11, d3, d6);
				tessellator.setColorOpaque_F(colorRedBottomLeft_BottomFace, colorGreenBottomLeft_BottomFace, colorBlueBottomLeft_BottomFace);
				tessellator.addVertexWithUV(d7, d9, d10, d3, d5);
				tessellator.setColorOpaque_F(colorRedTopRight_BottomFace, colorGreenBottomRight_BottomFace, colorBlueBottomRight_BottomFace);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.setColorOpaque_F(colorRedTopRight_BottomFace, colorGreenTopRight_BottomFace, colorBlueTopRight_BottomFace);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);		
			} else		
			if(iDir == 7){
				// Pointing South-East triangle
				tessellator.setColorOpaque_F(colorRedBottomLeft_BottomFace, colorGreenTopLeft_BottomFace, colorBlueTopLeft_BottomFace);
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
			if(iDir/4 == 0 || iDir/4 == 2){
				// Standard
				tessellator.addVertexWithUV(d7, d9, d11, d3, d6);
				tessellator.addVertexWithUV(d7, d9, d10, d3, d5);
				tessellator.addVertexWithUV(d8, d9, d10, d4, d5);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
			} else
			if(iDir == 4){
				// Pointing South-West triangle
				tessellator.addVertexWithUV(d7, d9, d11, d3, d6);
				tessellator.addVertexWithUV(d8, d9, d10, d4, d5);
				tessellator.addVertexWithUV(d8, d9, d10, d4, d5);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);	
			} else	
			if(iDir == 5){
				// Pointing North-East triangle
				tessellator.addVertexWithUV(d7, d9, d11, d3, d6);
				tessellator.addVertexWithUV(d7, d9, d10, d3, d5);
				tessellator.addVertexWithUV(d8, d9, d10, d4, d5);
				tessellator.addVertexWithUV(d7, d9, d11, d3, d6);				
			} else	
			if(iDir == 6){
				// Pointing North-West triangle
				tessellator.addVertexWithUV(d7, d9, d11, d3, d6);
				tessellator.addVertexWithUV(d7, d9, d10, d3, d5);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);		
			} else		
			if(iDir == 7){
				// Pointing South-East triangle
				tessellator.addVertexWithUV(d7, d9, d10, d3, d5);
				tessellator.addVertexWithUV(d7, d9, d10, d3, d5);
				tessellator.addVertexWithUV(d8, d9, d10, d4, d5);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);			
			}
		}
    }

	public void renderIntCornersTopFace(Block block, double d, double d1, double d2, int i, int iDir, RenderBlocks renderblocks, int lBrightness)
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
			if(iDir/4 == 1 || iDir/4 == 3){
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
			if(iDir == 0){
				// Pointing South-West triangle		
				tessellator.setColorOpaque_F(colorRedTopLeft_TopFace, colorGreenTopLeft_TopFace, colorBlueTopLeft_TopFace);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.setColorOpaque_F(colorRedBottomLeft_TopFace, colorGreenBottomLeft_TopFace, colorBlueBottomLeft_TopFace);
				tessellator.addVertexWithUV(d8, d9, d10, d4, d5);
				tessellator.setColorOpaque_F(colorRedTopRight_TopFace, colorGreenTopRight_TopFace, colorBlueTopRight_TopFace);
				tessellator.addVertexWithUV(d7, d9, d11, d3, d6);
				tessellator.setColorOpaque_F(colorRedTopRight_TopFace, colorGreenTopRight_TopFace, colorBlueTopRight_TopFace);
				tessellator.addVertexWithUV(d7, d9, d11, d3, d6);		
			} else	
			if(iDir == 1){
				// Pointing North-East triangle		
				tessellator.setColorOpaque_F(colorRedBottomLeft_TopFace, colorGreenBottomLeft_TopFace, colorBlueBottomLeft_TopFace);
				tessellator.addVertexWithUV(d8, d9, d10, d4, d5);
				tessellator.setColorOpaque_F(colorRedBottomLeft_TopFace, colorGreenBottomLeft_TopFace, colorBlueBottomLeft_TopFace);
				tessellator.addVertexWithUV(d8, d9, d10, d4, d5);
				tessellator.setColorOpaque_F(colorRedBottomRight_TopFace, colorGreenBottomRight_TopFace, colorBlueBottomRight_TopFace);
				tessellator.addVertexWithUV(d7, d9, d10, d3, d5);
				tessellator.setColorOpaque_F(colorRedTopRight_TopFace, colorGreenTopRight_TopFace, colorBlueTopRight_TopFace);
				tessellator.addVertexWithUV(d7, d9, d11, d3, d6);					
			} else	
			if(iDir == 2){
				// Pointing North-West triangle
				tessellator.setColorOpaque_F(colorRedTopLeft_TopFace, colorGreenTopLeft_TopFace, colorBlueTopLeft_TopFace);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.setColorOpaque_F(colorRedBottomRight_TopFace, colorGreenBottomRight_TopFace, colorBlueBottomRight_TopFace);
				tessellator.addVertexWithUV(d7, d9, d10, d3, d5);
				tessellator.setColorOpaque_F(colorRedBottomRight_TopFace, colorGreenBottomRight_TopFace, colorBlueBottomRight_TopFace);
				tessellator.addVertexWithUV(d7, d9, d10, d3, d5);
				tessellator.setColorOpaque_F(colorRedTopRight_TopFace, colorGreenTopRight_TopFace, colorBlueTopRight_TopFace);
				tessellator.addVertexWithUV(d7, d9, d11, d3, d6);				
			} else		
			if(iDir == 3){
				// Pointing South-East triangle
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
			if(iDir/4 == 1 || iDir/4 == 3){
				// Standard
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.addVertexWithUV(d8, d9, d10, d4, d5);
				tessellator.addVertexWithUV(d7, d9, d10, d3, d5);
				tessellator.addVertexWithUV(d7, d9, d11, d3, d6);
			} else
			if(iDir == 0){
				// Pointing South-West triangle		
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.addVertexWithUV(d8, d9, d10, d4, d5);
				tessellator.addVertexWithUV(d7, d9, d11, d3, d6);
				tessellator.addVertexWithUV(d7, d9, d11, d3, d6);			
			} else	
			if(iDir == 1){
				// Pointing North-East triangle		
				tessellator.addVertexWithUV(d8, d9, d10, d4, d5);
				tessellator.addVertexWithUV(d8, d9, d10, d4, d5);
				tessellator.addVertexWithUV(d7, d9, d10, d3, d5);
				tessellator.addVertexWithUV(d7, d9, d11, d3, d6);					
			} else	
			if(iDir == 2){
				// Pointing North-West triangle
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.addVertexWithUV(d7, d9, d10, d3, d5);
				tessellator.addVertexWithUV(d7, d9, d10, d3, d5);
				tessellator.addVertexWithUV(d7, d9, d11, d3, d6);				
			} else		
			if(iDir == 3){
				// Pointing South-East triangle
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.addVertexWithUV(d8, d9, d10, d4, d5);
				tessellator.addVertexWithUV(d7, d9, d10, d3, d5);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
			}
		}
    }
	
	public void renderIntCornersEastFace(Block block, double d, double d1, double d2, int i, int iDir, RenderBlocks renderblocks, int lBrightness)
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
			if(iDir == 2 || iDir == 10){
				// Triangle Down pointing south
				tessellator.setColorOpaque_F(colorRedTopLeft_EastFace, colorGreenTopLeft_EastFace, colorBlueTopLeft_EastFace);
				tessellator.addVertexWithUV(d8, d11, d12, d4, d5);
				tessellator.setColorOpaque_F(colorRedBottomRight_EastFace, colorGreenBottomRight_EastFace, colorBlueBottomRight_EastFace);
				tessellator.addVertexWithUV(d9, d10, d12, d3, d6);
				tessellator.setColorOpaque_F(colorRedBottomRight_EastFace, colorGreenBottomRight_EastFace, colorBlueBottomRight_EastFace);
				tessellator.addVertexWithUV(d9, d10, d12, d3, d6);
				tessellator.setColorOpaque_F(colorRedTopRight_EastFace, colorGreenTopRight_EastFace, colorBlueTopRight_EastFace);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d6);
				if(iDir == 10){				
					// Slope facing Up - East		
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueZNeg+aoLightValueXPosZNeg)*(factorTop+factorEast)/4F, colorGreenSlopes*(aoLightValueZNeg+aoLightValueXPosZNeg)*(factorTop+factorEast)/4F, colorBlueSlopes*(aoLightValueZNeg+aoLightValueXPosZNeg)*(factorTop+factorEast)/4F);
					tessellator.addVertexWithUV(d9, d10, d12, d4, d6);
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueXNegYPos)*(factorTop+factorEast)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueXNegYPos)*(factorTop+factorEast)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueXNegYPos)*(factorTop+factorEast)/4F);
					tessellator.addVertexWithUV(d8, d11, d13, d3, d5);
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueXNegYPos)*(factorTop+factorEast)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueXNegYPos)*(factorTop+factorEast)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueXNegYPos)*(factorTop+factorEast)/4F);
					tessellator.addVertexWithUV(d8, d11, d13, d3, d5);
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueXPosYPos)*(factorTop+factorEast)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueXPosYPos)*(factorTop+factorEast)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueXPosYPos)*(factorTop+factorEast)/4F);
					tessellator.addVertexWithUV(d9, d11, d13, d4, d5);
				}
			} else	
			if(iDir == 0 || iDir == 8){		
				// Triangle Down pointing north
				tessellator.setColorOpaque_F(colorRedTopRight_EastFace, colorGreenTopRight_EastFace, colorBlueTopRight_EastFace);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d6);
				tessellator.setColorOpaque_F(colorRedBottomLeft_EastFace, colorGreenBottomLeft_EastFace, colorBlueBottomLeft_EastFace);
				tessellator.addVertexWithUV(d9, d11, d12, d3, d5);
				tessellator.setColorOpaque_F(colorRedBottomRight_EastFace, colorGreenBottomRight_EastFace, colorBlueBottomRight_EastFace);
				tessellator.addVertexWithUV(d9, d10, d12, d3, d6);
				tessellator.setColorOpaque_F(colorRedTopRight_EastFace, colorGreenTopRight_EastFace, colorBlueTopRight_EastFace);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d6);
				if(iDir == 0){
					// Slope facing Up - East - North
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPosZNeg)*(factorTop+factorEast+factorNorth)/3F, colorGreenSlopes*(aoLightValueYPosZNeg)*(factorTop+factorEast+factorNorth)/3F, colorBlueSlopes*(aoLightValueYPosZNeg)*(factorTop+factorEast+factorNorth)/3F);
					tessellator.addVertexWithUV(d9, d11, d12, d3, d5);                                                                                                                                                                                                               
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPosZNeg)*(factorTop+factorEast+factorNorth)/3F, colorGreenSlopes*(aoLightValueYPosZNeg)*(factorTop+factorEast+factorNorth)/3F, colorBlueSlopes*(aoLightValueYPosZNeg)*(factorTop+factorEast+factorNorth)/3F);
					tessellator.addVertexWithUV(d9, d11, d12, d3, d5);                                                                                                                                                                                                               
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXNegZNeg)*(factorTop+factorEast+factorNorth)/3F, colorGreenSlopes*(aoLightValueXNegZNeg)*(factorTop+factorEast+factorNorth)/3F, colorBlueSlopes*(aoLightValueXNegZNeg)*(factorTop+factorEast+factorNorth)/3F);
					tessellator.addVertexWithUV(d8, d10, d12, (d3+d4)/2.0F, d6);                                                                                                                                                                                                     
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXNegYPos)*(factorTop+factorEast+factorNorth)/3F, colorGreenSlopes*(aoLightValueXNegYPos)*(factorTop+factorEast+factorNorth)/3F, colorBlueSlopes*(aoLightValueXNegYPos)*(factorTop+factorEast+factorNorth)/3F);
					tessellator.addVertexWithUV(d8, d11, d13, d4, d5);		
				}
				if(iDir == 8){
					// Slope facing Up - East
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueXPosYPos)*(factorTop+factorEast)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueXPosYPos)*(factorTop+factorEast)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueXPosYPos)*(factorTop+factorEast)/4F);
					tessellator.addVertexWithUV(d9, d11, d13, d4, d5);
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueXPosYPos)*(factorTop+factorEast)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueXPosYPos)*(factorTop+factorEast)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueXPosYPos)*(factorTop+factorEast)/4F);
					tessellator.addVertexWithUV(d9, d11, d13, d4, d5);
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueZNeg+aoLightValueXNegZNeg)*(factorTop+factorEast)/4F, colorGreenSlopes*(aoLightValueZNeg+aoLightValueXNegZNeg)*(factorTop+factorEast)/4F, colorBlueSlopes*(aoLightValueZNeg+aoLightValueXNegZNeg)*(factorTop+factorEast)/4F);
					tessellator.addVertexWithUV(d8, d10, d12, d3, d6);
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueXNegYPos)*(factorTop+factorEast)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueXNegYPos)*(factorTop+factorEast)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueXNegYPos)*(factorTop+factorEast)/4F);
					tessellator.addVertexWithUV(d8, d11, d13, d3, d5);	
				}				
			} else		
			if(iDir == 6 || iDir == 14){
				// Triangle Up pointing south
				tessellator.setColorOpaque_F(colorRedTopLeft_EastFace, colorGreenTopLeft_EastFace, colorBlueTopLeft_EastFace);
				tessellator.addVertexWithUV(d8, d11, d12, d4, d5);
				tessellator.setColorOpaque_F(colorRedBottomLeft_EastFace, colorGreenBottomLeft_EastFace, colorBlueBottomLeft_EastFace);
				tessellator.addVertexWithUV(d9, d11, d12, d3, d5);
				tessellator.setColorOpaque_F(colorRedBottomLeft_EastFace, colorGreenBottomLeft_EastFace, colorBlueBottomLeft_EastFace);
				tessellator.addVertexWithUV(d9, d11, d12, d3, d5);
				tessellator.setColorOpaque_F(colorRedTopRight_EastFace, colorGreenTopRight_EastFace, colorBlueTopRight_EastFace);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d6);		
				if(iDir == 14){				
					// Slope facing Down - East
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueXNegYNeg)*(factorBottom+factorEast)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueXNegYNeg)*(factorBottom+factorEast)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueXNegYNeg)*(factorBottom+factorEast)/4F);
					tessellator.addVertexWithUV(d8, d10, d13, d3, d6);
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueXNegYNeg)*(factorBottom+factorEast)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueXNegYNeg)*(factorBottom+factorEast)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueXNegYNeg)*(factorBottom+factorEast)/4F);
					tessellator.addVertexWithUV(d8, d10, d13, d3, d6);
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueZNeg+aoLightValueXPosZNeg)*(factorBottom+factorEast)/4F, colorGreenSlopes*(aoLightValueZNeg+aoLightValueXPosZNeg)*(factorBottom+factorEast)/4F, colorBlueSlopes*(aoLightValueZNeg+aoLightValueXPosZNeg)*(factorBottom+factorEast)/4F);
					tessellator.addVertexWithUV(d9, d11, d12, d4, d5);
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueXPosYNeg)*(factorBottom+factorEast)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueXPosYNeg)*(factorBottom+factorEast)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueXPosYNeg)*(factorBottom+factorEast)/4F);
					tessellator.addVertexWithUV(d9, d10, d13, d4, d6);	
				}
			}else		
			if(iDir == 4 || iDir == 12){		
				// Triangle Up pointing north
				tessellator.setColorOpaque_F(colorRedTopLeft_EastFace, colorGreenTopLeft_EastFace, colorBlueTopLeft_EastFace);
				tessellator.addVertexWithUV(d8, d11, d12, d4, d5);
				tessellator.setColorOpaque_F(colorRedBottomLeft_EastFace, colorGreenBottomLeft_EastFace, colorBlueBottomLeft_EastFace);
				tessellator.addVertexWithUV(d9, d11, d12, d3, d5);
				tessellator.setColorOpaque_F(colorRedBottomRight_EastFace, colorGreenBottomRight_EastFace, colorBlueBottomRight_EastFace);
				tessellator.addVertexWithUV(d9, d10, d12, d3, d6);
				tessellator.setColorOpaque_F(colorRedTopLeft_EastFace, colorGreenTopLeft_EastFace, colorBlueTopLeft_EastFace);
				tessellator.addVertexWithUV(d8, d11, d12, d4, d5);	
				if(iDir == 4){
					// Slope facing Down - East - North		
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXNegYNeg)*(factorBottom+factorEast+factorNorth)/3F, colorGreenSlopes*(aoLightValueXNegYNeg)*(factorBottom+factorEast+factorNorth)/3F, colorBlueSlopes*(aoLightValueXNegYNeg)*(factorBottom+factorEast+factorNorth)/3F);
					tessellator.addVertexWithUV(d8, d10, d13, d4, d6);                                                                                                                                                                                                                        
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXNegZNeg)*(factorBottom+factorEast+factorNorth)/3F, colorGreenSlopes*(aoLightValueXNegZNeg)*(factorBottom+factorEast+factorNorth)/3F, colorBlueSlopes*(aoLightValueXNegZNeg)*(factorBottom+factorEast+factorNorth)/3F);
					tessellator.addVertexWithUV(d8, d11, d12, (d3+d4)/2.0F, d5);                                                                                                                                                                                                              
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNegZNeg)*(factorBottom+factorEast+factorNorth)/3F, colorGreenSlopes*(aoLightValueYNegZNeg)*(factorBottom+factorEast+factorNorth)/3F, colorBlueSlopes*(aoLightValueYNegZNeg)*(factorBottom+factorEast+factorNorth)/3F);
					tessellator.addVertexWithUV(d9, d10, d12, d3, d6);                                                                                                                                                                                                                        
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNegZNeg)*(factorBottom+factorEast+factorNorth)/3F, colorGreenSlopes*(aoLightValueYNegZNeg)*(factorBottom+factorEast+factorNorth)/3F, colorBlueSlopes*(aoLightValueYNegZNeg)*(factorBottom+factorEast+factorNorth)/3F);
					tessellator.addVertexWithUV(d9, d10, d12, d3, d6);
				}
				if(iDir == 12){				
					// Slope facing Down - East
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueZNeg+aoLightValueXNegZNeg)*(factorBottom+factorEast)/4F, colorGreenSlopes*(aoLightValueZNeg+aoLightValueXNegZNeg)*(factorBottom+factorEast)/4F, colorBlueSlopes*(aoLightValueZNeg+aoLightValueXNegZNeg)*(factorBottom+factorEast)/4F);
					tessellator.addVertexWithUV(d8, d11, d12, d3, d5); 
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueXPosYNeg)*(factorBottom+factorEast)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueXPosYNeg)*(factorBottom+factorEast)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueXPosYNeg)*(factorBottom+factorEast)/4F);
					tessellator.addVertexWithUV(d9, d10, d13, d4, d6); 
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueXPosYNeg)*(factorBottom+factorEast)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueXPosYNeg)*(factorBottom+factorEast)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueXPosYNeg)*(factorBottom+factorEast)/4F);
					tessellator.addVertexWithUV(d9, d10, d13, d4, d6); 
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueXNegYNeg)*(factorBottom+factorEast)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueXNegYNeg)*(factorBottom+factorEast)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueXNegYNeg)*(factorBottom+factorEast)/4F);
					tessellator.addVertexWithUV(d8, d10, d13, d3, d6);
				}
			}	
			else{
				// Standard
				tessellator.setColorOpaque_F(colorRedTopLeft_EastFace, colorGreenTopLeft_EastFace, colorBlueTopLeft_EastFace);
				tessellator.addVertexWithUV(d8, d11, d12, d4, d5);
				tessellator.setColorOpaque_F(colorRedBottomLeft_EastFace, colorGreenBottomLeft_EastFace, colorBlueBottomLeft_EastFace);
				tessellator.addVertexWithUV(d9, d11, d12, d3, d5);
				tessellator.setColorOpaque_F(colorRedBottomRight_EastFace, colorGreenBottomRight_EastFace, colorBlueBottomRight_EastFace);
				tessellator.addVertexWithUV(d9, d10, d12, d3, d6);
				tessellator.setColorOpaque_F(colorRedTopRight_EastFace, colorGreenTopRight_EastFace, colorBlueTopRight_EastFace);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d6);
			}	
		} else
		{
			if(iDir == 2 || iDir == 10){
				// Pointing 1, X = 0, Z = 0
				tessellator.addVertexWithUV(d8, d11, d12, d4, d5);
				tessellator.addVertexWithUV(d8, d11, d12, d4, d5);
				tessellator.addVertexWithUV(d9, d10, d12, d3, d6);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d6);
				if(iDir == 10){				
					// Slope pointing South-West		
					tessellator.addVertexWithUV(d9, d10, d12, d4, d6);
					tessellator.addVertexWithUV(d8, d11, d13, d3, d5);
					tessellator.addVertexWithUV(d8, d11, d13, d3, d5);
					tessellator.addVertexWithUV(d9, d11, d13, d4, d5);
				}
			} else	
			if(iDir == 0 || iDir == 8){		
				// Pointing 3, X = 1, Z = 0
				tessellator.addVertexWithUV(d9, d11, d12, d3, d5);
				tessellator.addVertexWithUV(d9, d11, d12, d3, d5);
				tessellator.addVertexWithUV(d9, d10, d12, d3, d6);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d6);
				if(iDir == 0){
					// Slope
					tessellator.addVertexWithUV(d9, d11, d12, d3, d5);
					tessellator.addVertexWithUV(d9, d11, d12, d3, d5);
					tessellator.addVertexWithUV(d8, d10, d12, (d3+d4)/2.0F, d6);
					tessellator.addVertexWithUV(d8, d11, d13, d4, d5);		
				}
				if(iDir == 8){
					// Slope pointing North-West
					tessellator.addVertexWithUV(d9, d11, d13, d4, d5);
					tessellator.addVertexWithUV(d9, d11, d13, d4, d5);
					tessellator.addVertexWithUV(d8, d10, d12, d3, d6);
					tessellator.addVertexWithUV(d8, d11, d13, d3, d5);	
				}				
			} else		
			if(iDir == 6 || iDir == 14){
				// Up Pointing 1, X = 0, Z = 0
				tessellator.addVertexWithUV(d8, d11, d12, d4, d5);
				tessellator.addVertexWithUV(d9, d11, d12, d3, d5);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d6);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d6);
				if(iDir == 14){				
					// Slope facing East
					tessellator.addVertexWithUV(d8, d10, d13, d3, d6);
					tessellator.addVertexWithUV(d8, d10, d13, d3, d6);
					tessellator.addVertexWithUV(d9, d11, d12, d4, d5);
					tessellator.addVertexWithUV(d9, d10, d13, d4, d6);	
				}
			}else		
			if(iDir == 4 || iDir == 12){		
				// Up Pointing 3, X = 1, Z = 0
				tessellator.addVertexWithUV(d8, d11, d12, d4, d5);
				tessellator.addVertexWithUV(d9, d11, d12, d3, d5);
				tessellator.addVertexWithUV(d9, d10, d12, d3, d6);
				tessellator.addVertexWithUV(d9, d10, d12, d3, d6);
				if(iDir == 4){
					// Slope				
					tessellator.addVertexWithUV(d8, d10, d13, d4, d6);	
					tessellator.addVertexWithUV(d8, d11, d12, (d3+d4)/2.0F, d5);
					tessellator.addVertexWithUV(d9, d10, d12, d3, d6);
					tessellator.addVertexWithUV(d9, d10, d12, d3, d6);
				}
				if(iDir == 12){				
					// Slope facing East
					tessellator.addVertexWithUV(d8, d11, d12, d3, d5);
					tessellator.addVertexWithUV(d9, d10, d13, d4, d6);
					tessellator.addVertexWithUV(d9, d10, d13, d4, d6);
					tessellator.addVertexWithUV(d8, d10, d13, d3, d6);
				}
			}	
			else{
				// Standard
				tessellator.addVertexWithUV(d8, d11, d12, d4, d5);
				tessellator.addVertexWithUV(d9, d11, d12, d3, d5);
				tessellator.addVertexWithUV(d9, d10, d12, d3, d6);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d6);
			}
		}
    }

    public void renderIntCornersWestFace(Block block, double d, double d1, double d2, int i, int iDir, RenderBlocks renderblocks, int lBrightness)
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
			if(iDir == 3 || iDir == 11){
				// Triangle Down pointing north
				tessellator.setColorOpaque_F(colorRedBottomLeft_WestFace, colorGreenBottomLeft_WestFace, colorBlueBottomLeft_WestFace);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d6);
				tessellator.setColorOpaque_F(colorRedBottomLeft_WestFace, colorGreenBottomLeft_WestFace, colorBlueBottomLeft_WestFace);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d6);
				tessellator.setColorOpaque_F(colorRedBottomRight_WestFace, colorGreenBottomRight_WestFace, colorBlueBottomRight_WestFace);
				tessellator.addVertexWithUV(d9, d10, d12, d4, d6);
				tessellator.setColorOpaque_F(colorRedTopRight_WestFace, colorGreenTopRight_WestFace, colorBlueTopRight_WestFace);
				tessellator.addVertexWithUV(d9, d11, d12, d4, d5);
				if(iDir == 11){
					// Slope Facing Up - West
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueXPosYPos)*(factorTop+factorWest)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueXPosYPos)*(factorTop+factorWest)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueXPosYPos)*(factorTop+factorWest)/4F);
					tessellator.addVertexWithUV(d9, d11, d13, d4, d5);
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueXNegYPos)*(factorTop+factorWest)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueXNegYPos)*(factorTop+factorWest)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueXNegYPos)*(factorTop+factorWest)/4F);
					tessellator.addVertexWithUV(d8, d11, d13, d3, d5);
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueZPos+aoLightValueXNegZPos)*(factorTop+factorWest)/4F, colorGreenSlopes*(aoLightValueZPos+aoLightValueXNegZPos)*(factorTop+factorWest)/4F, colorBlueSlopes*(aoLightValueZPos+aoLightValueXNegZPos)*(factorTop+factorWest)/4F);
					tessellator.addVertexWithUV(d8, d10, d12, d3, d6);	
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueXPosYPos)*(factorTop+factorWest)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueXPosYPos)*(factorTop+factorWest)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueXPosYPos)*(factorTop+factorWest)/4F);
					tessellator.addVertexWithUV(d9, d11, d13, d4, d5);				
				}
			} else
			if(iDir == 1 || iDir == 9){				
				// Triangle Down pointing south
				tessellator.setColorOpaque_F(colorRedTopLeft_WestFace, colorGreenTopLeft_WestFace, colorBlueTopLeft_WestFace);
				tessellator.addVertexWithUV(d8, d11, d12, d3, d5);
				tessellator.setColorOpaque_F(colorRedBottomLeft_WestFace, colorGreenBottomLeft_WestFace, colorBlueBottomLeft_WestFace);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d6);
				tessellator.setColorOpaque_F(colorRedBottomRight_WestFace, colorGreenBottomRight_WestFace, colorBlueBottomRight_WestFace);
				tessellator.addVertexWithUV(d9, d10, d12, d4, d6);
				tessellator.setColorOpaque_F(colorRedBottomRight_WestFace, colorGreenBottomRight_WestFace, colorBlueBottomRight_WestFace);
				tessellator.addVertexWithUV(d9, d10, d12, d4, d6);
				if(iDir == 1){			
					// Slope Facing Up - West - South
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXPosZPos)*(factorTop+factorWest+factorSouth)/3F, colorGreenSlopes*(aoLightValueXPosZPos)*(factorTop+factorWest+factorSouth)/3F, colorBlueSlopes*(aoLightValueXPosZPos)*(factorTop+factorWest+factorSouth)/3F);
					tessellator.addVertexWithUV(d9, d10, d12, (d3+d4)/2.0F, d6);                                                                                                                                                                                                         
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXPosYPos)*(factorTop+factorWest+factorSouth)/3F, colorGreenSlopes*(aoLightValueXPosYPos)*(factorTop+factorWest+factorSouth)/3F, colorBlueSlopes*(aoLightValueXPosYPos)*(factorTop+factorWest+factorSouth)/3F);
					tessellator.addVertexWithUV(d9, d11, d13, d4, d5);                                                                                                                                                                                                                   
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPosZPos)*(factorTop+factorWest+factorSouth)/3F, colorGreenSlopes*(aoLightValueYPosZPos)*(factorTop+factorWest+factorSouth)/3F, colorBlueSlopes*(aoLightValueYPosZPos)*(factorTop+factorWest+factorSouth)/3F);
					tessellator.addVertexWithUV(d8, d11, d12, d3, d5);                                                                                                                                                                                                                   
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPosZPos)*(factorTop+factorWest+factorSouth)/3F, colorGreenSlopes*(aoLightValueYPosZPos)*(factorTop+factorWest+factorSouth)/3F, colorBlueSlopes*(aoLightValueYPosZPos)*(factorTop+factorWest+factorSouth)/3F);
					tessellator.addVertexWithUV(d8, d11, d12, d3, d5);			
				}
				if(iDir == 9){					
					// Slope Facing Up - West
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueZPos+aoLightValueXPosZPos)*(factorTop+factorWest)/4F, colorGreenSlopes*(aoLightValueZPos+aoLightValueXPosZPos)*(factorTop+factorWest)/4F, colorBlueSlopes*(aoLightValueZPos+aoLightValueXPosZPos)*(factorTop+factorWest)/4F);
					tessellator.addVertexWithUV(d9, d10, d12, d4, d6);
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueXPosYPos)*(factorTop+factorWest)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueXPosYPos)*(factorTop+factorWest)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueXPosYPos)*(factorTop+factorWest)/4F);
					tessellator.addVertexWithUV(d9, d11, d13, d4, d5);
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueXNegYPos)*(factorTop+factorWest)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueXNegYPos)*(factorTop+factorWest)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueXNegYPos)*(factorTop+factorWest)/4F);
					tessellator.addVertexWithUV(d8, d11, d13, d3, d5);
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueXNegYPos)*(factorTop+factorWest)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueXNegYPos)*(factorTop+factorWest)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueXNegYPos)*(factorTop+factorWest)/4F);
					tessellator.addVertexWithUV(d8, d11, d13, d3, d5);				
				}
			}else
			if(iDir == 7|| iDir == 15){
				// Triangle Up pointing north
				tessellator.setColorOpaque_F(colorRedTopLeft_WestFace, colorGreenTopLeft_WestFace, colorBlueTopLeft_WestFace);
				tessellator.addVertexWithUV(d8, d11, d12, d3, d5);
				tessellator.setColorOpaque_F(colorRedTopLeft_WestFace, colorGreenTopLeft_WestFace, colorBlueTopLeft_WestFace);
				tessellator.addVertexWithUV(d8, d11, d12, d3, d5);
				tessellator.setColorOpaque_F(colorRedBottomRight_WestFace, colorGreenBottomRight_WestFace, colorBlueBottomRight_WestFace);
				tessellator.addVertexWithUV(d9, d10, d12, d4, d6);
				tessellator.setColorOpaque_F(colorRedTopRight_WestFace, colorGreenTopRight_WestFace, colorBlueTopRight_WestFace);
				tessellator.addVertexWithUV(d9, d11, d12, d4, d5);	
				if(iDir == 15){				
					// Slope Facing Down - West
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueZPos+aoLightValueXNegZPos)*(factorBottom+factorWest)/4F, colorGreenSlopes*(aoLightValueZPos+aoLightValueXNegZPos)*(factorBottom+factorWest)/4F, colorBlueSlopes*(aoLightValueZPos+aoLightValueXNegZPos)*(factorBottom+factorWest)/4F);
					tessellator.addVertexWithUV(d8, d11, d12, d3, d5);
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueXNegYNeg)*(factorBottom+factorWest)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueXNegYNeg)*(factorBottom+factorWest)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueXNegYNeg)*(factorBottom+factorWest)/4F);
					tessellator.addVertexWithUV(d8, d10, d13, d3, d6);
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueXPosYNeg)*(factorBottom+factorWest)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueXPosYNeg)*(factorBottom+factorWest)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueXPosYNeg)*(factorBottom+factorWest)/4F);
					tessellator.addVertexWithUV(d9, d10, d13, d4, d6);
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueXPosYNeg)*(factorBottom+factorWest)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueXPosYNeg)*(factorBottom+factorWest)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueXPosYNeg)*(factorBottom+factorWest)/4F);
					tessellator.addVertexWithUV(d9, d10, d13, d4, d6);	
				}
			} else
			if(iDir == 5 || iDir == 13){		
				// Triangle Up pointing south
				tessellator.setColorOpaque_F(colorRedTopLeft_WestFace, colorGreenTopLeft_WestFace, colorBlueTopLeft_WestFace);
				tessellator.addVertexWithUV(d8, d11, d12, d3, d5);
				tessellator.setColorOpaque_F(colorRedBottomLeft_WestFace, colorGreenBottomLeft_WestFace, colorBlueBottomLeft_WestFace);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d6);
				tessellator.setColorOpaque_F(colorRedTopRight_WestFace, colorGreenTopRight_WestFace, colorBlueTopRight_WestFace);
				tessellator.addVertexWithUV(d9, d11, d12, d4, d5);
				tessellator.setColorOpaque_F(colorRedTopRight_WestFace, colorGreenTopRight_WestFace, colorBlueTopRight_WestFace);
				tessellator.addVertexWithUV(d9, d11, d12, d4, d5);	
				if(iDir == 5){			
					// Slope Facing Down - West - South
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNegZPos)*(factorBottom+factorWest+factorSouth)/3F, colorGreenSlopes*(aoLightValueYNegZPos)*(factorBottom+factorWest+factorSouth)/3F, colorBlueSlopes*(aoLightValueYNegZPos)*(factorBottom+factorWest+factorSouth)/3F);
					tessellator.addVertexWithUV(d8, d10, d12, d3, d6);	                                                                                                                                                                   
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXPosYNeg)*(factorBottom+factorWest+factorSouth)/3F, colorGreenSlopes*(aoLightValueXPosYNeg)*(factorBottom+factorWest+factorSouth)/3F, colorBlueSlopes*(aoLightValueXPosYNeg)*(factorBottom+factorWest+factorSouth)/3F);
					tessellator.addVertexWithUV(d8, d10, d12, d3, d6);                                                                                                                                                                     
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXPosZPos)*(factorBottom+factorWest+factorSouth)/3F, colorGreenSlopes*(aoLightValueXPosZPos)*(factorBottom+factorWest+factorSouth)/3F, colorBlueSlopes*(aoLightValueXPosZPos)*(factorBottom+factorWest+factorSouth)/3F);
					tessellator.addVertexWithUV(d9, d10, d13, d4, d6);                                                                                                                                                                     
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXPosZPos)*(factorBottom+factorWest+factorSouth)/3F, colorGreenSlopes*(aoLightValueXPosZPos)*(factorBottom+factorWest+factorSouth)/3F, colorBlueSlopes*(aoLightValueXPosZPos)*(factorBottom+factorWest+factorSouth)/3F);
					tessellator.addVertexWithUV(d9, d11, d12, (d3+d4)/2.0F, d5);
				}
				if(iDir == 13){				
					// Slope Facing Down - West
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueXNegYNeg)*(factorBottom+factorWest)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueXNegYNeg)*(factorBottom+factorWest)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueXNegYNeg)*(factorBottom+factorWest)/4F);
					tessellator.addVertexWithUV(d8, d10, d13, d3, d6);
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueXPosYNeg)*(factorBottom+factorWest)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueXPosYNeg)*(factorBottom+factorWest)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueXPosYNeg)*(factorBottom+factorWest)/4F);
					tessellator.addVertexWithUV(d9, d10, d13, d4, d6);
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueZPos+aoLightValueXPosZPos)*(factorBottom+factorWest)/4F, colorGreenSlopes*(aoLightValueZPos+aoLightValueXPosZPos)*(factorBottom+factorWest)/4F, colorBlueSlopes*(aoLightValueZPos+aoLightValueXPosZPos)*(factorBottom+factorWest)/4F);
					tessellator.addVertexWithUV(d9, d11, d12, d4, d5);	
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueXNegYNeg)*(factorBottom+factorWest)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueXNegYNeg)*(factorBottom+factorWest)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueXNegYNeg)*(factorBottom+factorWest)/4F);
					tessellator.addVertexWithUV(d8, d10, d13, d3, d6);
				}
			}
			else{
				// Standard
				tessellator.setColorOpaque_F(colorRedTopLeft_WestFace, colorGreenTopLeft_WestFace, colorBlueTopLeft_WestFace);
				tessellator.addVertexWithUV(d8, d11, d12, d3, d5);
				tessellator.setColorOpaque_F(colorRedBottomLeft_WestFace, colorGreenBottomLeft_WestFace, colorBlueBottomLeft_WestFace);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d6);
				tessellator.setColorOpaque_F(colorRedBottomRight_WestFace, colorGreenBottomRight_WestFace, colorBlueBottomRight_WestFace);
				tessellator.addVertexWithUV(d9, d10, d12, d4, d6);
				tessellator.setColorOpaque_F(colorRedTopRight_WestFace, colorGreenTopRight_WestFace, colorBlueTopRight_WestFace);
				tessellator.addVertexWithUV(d9, d11, d12, d4, d5);
			}
		} else
		{
			if(iDir == 3 || iDir == 11){
				// Pointing 0, X = 1, Z = 1
				tessellator.addVertexWithUV(d9, d11, d12, d4, d5);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d6);
				tessellator.addVertexWithUV(d9, d10, d12, d4, d6);
				tessellator.addVertexWithUV(d9, d11, d12, d4, d5);	
				if(iDir == 11){
					// Slope pointing North-East	
					tessellator.addVertexWithUV(d9, d11, d13, d4, d5);
					tessellator.addVertexWithUV(d8, d11, d13, d3, d5);
					tessellator.addVertexWithUV(d8, d10, d12, d3, d6);	
					tessellator.addVertexWithUV(d9, d11, d13, d4, d5);				
				}
			} else
			if(iDir == 1 || iDir == 9){				
				// Pointing 2, X = 0, Z = 1
				tessellator.addVertexWithUV(d8, d11, d12, d3, d5);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d6);
				tessellator.addVertexWithUV(d9, d10, d12, d4, d6);
				tessellator.addVertexWithUV(d8, d11, d12, d3, d5);	
				if(iDir == 1){			
					// Slope
					tessellator.addVertexWithUV(d9, d10, d12, (d3+d4)/2.0F, d6);
					tessellator.addVertexWithUV(d9, d11, d13, d4, d5);
					tessellator.addVertexWithUV(d8, d11, d12, d3, d5);
					tessellator.addVertexWithUV(d8, d11, d12, d3, d5);			
				}
				if(iDir == 9){					
					// Slope pointing South-East
					tessellator.addVertexWithUV(d9, d10, d12, d4, d6);
					tessellator.addVertexWithUV(d9, d11, d13, d4, d5);
					tessellator.addVertexWithUV(d8, d11, d13, d3, d5);
					tessellator.addVertexWithUV(d8, d11, d13, d3, d5);				
				}
			}else
			if(iDir == 7|| iDir == 15){
				// Up Pointing 0, X = 1, Z = 1
				tessellator.addVertexWithUV(d8, d11, d12, d3, d5);
				tessellator.addVertexWithUV(d9, d10, d12, d4, d6);
				tessellator.addVertexWithUV(d9, d10, d12, d4, d6);
				tessellator.addVertexWithUV(d9, d11, d12, d4, d5);
				if(iDir == 15){				
					// Slope facing West
					tessellator.addVertexWithUV(d8, d11, d12, d3, d5);
					tessellator.addVertexWithUV(d8, d10, d13, d3, d6);
					tessellator.addVertexWithUV(d9, d10, d13, d4, d6);
					tessellator.addVertexWithUV(d9, d10, d13, d4, d6);	
				}
			} else
			if(iDir == 5 || iDir == 13){		
				// Up Pointing 2, X = 0, Z = 1
				tessellator.addVertexWithUV(d8, d11, d12, d3, d5);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d6);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d6);
				tessellator.addVertexWithUV(d9, d11, d12, d4, d5);
				if(iDir == 5){			
					// Slope
					tessellator.addVertexWithUV(d8, d10, d12, d3, d6);	
					tessellator.addVertexWithUV(d8, d10, d12, d3, d6);
					tessellator.addVertexWithUV(d9, d10, d13, d4, d6);
					tessellator.addVertexWithUV(d9, d11, d12, (d3+d4)/2.0F, d5);
				}
				if(iDir == 13){				
					// Slope facing West
					tessellator.addVertexWithUV(d8, d10, d13, d3, d6);
					tessellator.addVertexWithUV(d9, d10, d13, d4, d6);
					tessellator.addVertexWithUV(d9, d11, d12, d4, d5);	
					tessellator.addVertexWithUV(d8, d10, d13, d3, d6);
				}
			}
			else{
				// Standard
				tessellator.addVertexWithUV(d8, d11, d12, d3, d5);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d6);
				tessellator.addVertexWithUV(d9, d10, d12, d4, d6);
				tessellator.addVertexWithUV(d9, d11, d12, d4, d5);
			}
		}
    }

    public void renderIntCornersNorthFace(Block block, double d, double d1, double d2, int i, int iDir, RenderBlocks renderblocks, int lBrightness)
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
			if(iDir == 3 || iDir == 11){
				// Triangle Down pointing west
				tessellator.setColorOpaque_F(colorRedTopRight_NorthFace, colorGreenTopRight_NorthFace, colorBlueTopRight_NorthFace);
				tessellator.addVertexWithUV(d8, d9, d12, d4, d6);
				tessellator.setColorOpaque_F(colorRedBottomLeft_NorthFace, colorGreenBottomLeft_NorthFace, colorBlueBottomLeft_NorthFace);
				tessellator.addVertexWithUV(d8, d10, d11, d3, d5);		
				tessellator.setColorOpaque_F(colorRedBottomRight_NorthFace, colorGreenBottomRight_NorthFace, colorBlueBottomRight_NorthFace);
				tessellator.addVertexWithUV(d8, d9, d11, d3, d6);
				tessellator.setColorOpaque_F(colorRedTopRight_NorthFace, colorGreenTopRight_NorthFace, colorBlueTopRight_NorthFace);
				tessellator.addVertexWithUV(d8, d9, d12, d4, d6);	
				if(iDir == 3){
					// Slope facing Up - North - West
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPosZPos)*(factorTop+factorNorth+factorWest)/3F, colorGreenSlopes*(aoLightValueYPosZPos)*(factorTop+factorNorth+factorWest)/3F, colorBlueSlopes*(aoLightValueYPosZPos)*(factorTop+factorNorth+factorWest)/3F);
					tessellator.addVertexWithUV(d13, d10, d12, d4, d5);                                                                                                                                                              
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXNegYPos)*(factorTop+factorNorth+factorWest)/3F, colorGreenSlopes*(aoLightValueXNegYPos)*(factorTop+factorNorth+factorWest)/3F, colorBlueSlopes*(aoLightValueXNegYPos)*(factorTop+factorNorth+factorWest)/3F);
					tessellator.addVertexWithUV(d8, d10, d11, d3, d5);                                                                                                                                                               
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXNegYPos)*(factorTop+factorNorth+factorWest)/3F, colorGreenSlopes*(aoLightValueXNegYPos)*(factorTop+factorNorth+factorWest)/3F, colorBlueSlopes*(aoLightValueXNegYPos)*(factorTop+factorNorth+factorWest)/3F);
					tessellator.addVertexWithUV(d8, d10, d11, d3, d5);                                                                                                                                                               
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXNegZPos)*(factorTop+factorNorth+factorWest)/3F, colorGreenSlopes*(aoLightValueXNegZPos)*(factorTop+factorNorth+factorWest)/3F, colorBlueSlopes*(aoLightValueXNegZPos)*(factorTop+factorNorth+factorWest)/3F);
					tessellator.addVertexWithUV(d8, d9, d12, (d3+d4)/2.0F, d6);	
				}
				if(iDir == 11){				
					// Slope facing Up - North
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueYPosZNeg)*(factorTop+factorNorth)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueYPosZNeg)*(factorTop+factorNorth)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueYPosZNeg)*(factorTop+factorNorth)/4F);
					tessellator.addVertexWithUV(d13, d10, d11, d4, d5);
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueYPosZNeg)*(factorTop+factorNorth)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueYPosZNeg)*(factorTop+factorNorth)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueYPosZNeg)*(factorTop+factorNorth)/4F);
					tessellator.addVertexWithUV(d13, d10, d11, d4, d5);
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXNeg+aoLightValueXNegZPos)*(factorTop+factorNorth)/4F, colorGreenSlopes*(aoLightValueXNeg+aoLightValueXNegZPos)*(factorTop+factorNorth)/4F, colorBlueSlopes*(aoLightValueXNeg+aoLightValueXNegZPos)*(factorTop+factorNorth)/4F);
					tessellator.addVertexWithUV(d8, d9, d12, d3, d6);	
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueYPosZPos)*(factorTop+factorNorth)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueYPosZPos)*(factorTop+factorNorth)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueYPosZPos)*(factorTop+factorNorth)/4F);
					tessellator.addVertexWithUV(d13, d10, d12, d3, d5);
				}
			} else	
			if(iDir == 0 || iDir == 8){		
				// Triangle Down pointing east
				tessellator.setColorOpaque_F(colorRedTopLeft_NorthFace, colorGreenTopLeft_NorthFace, colorBlueTopLeft_NorthFace);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d5);
				tessellator.setColorOpaque_F(colorRedBottomRight_NorthFace, colorGreenBottomRight_NorthFace, colorBlueBottomRight_NorthFace);
				tessellator.addVertexWithUV(d8, d9, d11, d3, d6);		
				tessellator.setColorOpaque_F(colorRedBottomRight_NorthFace, colorGreenBottomRight_NorthFace, colorBlueBottomRight_NorthFace);
				tessellator.addVertexWithUV(d8, d9, d11, d3, d6);
				tessellator.setColorOpaque_F(colorRedTopRight_NorthFace, colorGreenTopRight_NorthFace, colorBlueTopRight_NorthFace);
				tessellator.addVertexWithUV(d8, d9, d12, d4, d6);	
				if(iDir == 8){			
					// Slope facing Up - North
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueYPosZPos)*(factorTop+factorNorth)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueYPosZPos)*(factorTop+factorNorth)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueYPosZPos)*(factorTop+factorNorth)/4F);
					tessellator.addVertexWithUV(d13, d10, d12, d4, d5);
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueYPosZNeg)*(factorTop+factorNorth)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueYPosZNeg)*(factorTop+factorNorth)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueYPosZNeg)*(factorTop+factorNorth)/4F);
					tessellator.addVertexWithUV(d13, d10, d11, d3, d5);
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXNeg+aoLightValueXNegZNeg)*(factorTop+factorNorth)/4F, colorGreenSlopes*(aoLightValueXNeg+aoLightValueXNegZNeg)*(factorTop+factorNorth)/4F, colorBlueSlopes*(aoLightValueXNeg+aoLightValueXNegZNeg)*(factorTop+factorNorth)/4F);
					tessellator.addVertexWithUV(d8, d9, d11, d3, d6);
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueYPosZPos)*(factorTop+factorNorth)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueYPosZPos)*(factorTop+factorNorth)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueYPosZPos)*(factorTop+factorNorth)/4F);
					tessellator.addVertexWithUV(d13, d10, d12, d4, d5);	
				}		
			} else
			if(iDir == 7 || iDir == 15){
				// Triangle Up pointing west
				tessellator.setColorOpaque_F(colorRedTopLeft_NorthFace, colorGreenTopLeft_NorthFace, colorBlueTopLeft_NorthFace);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d5);
				tessellator.setColorOpaque_F(colorRedBottomLeft_NorthFace, colorGreenBottomLeft_NorthFace, colorBlueBottomLeft_NorthFace);
				tessellator.addVertexWithUV(d8, d10, d11, d3, d5);		
				tessellator.setColorOpaque_F(colorRedBottomRight_NorthFace, colorGreenBottomRight_NorthFace, colorBlueBottomRight_NorthFace);
				tessellator.addVertexWithUV(d8, d9, d11, d3, d6);
				tessellator.setColorOpaque_F(colorRedTopLeft_NorthFace, colorGreenTopLeft_NorthFace, colorBlueTopLeft_NorthFace);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d5);		
				if(iDir == 7){
					// Slope facing Down - North - West
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXNegZPos)*(factorBottom+factorNorth+factorWest)/3F, colorGreenSlopes*(aoLightValueXNegZPos)*(factorBottom+factorNorth+factorWest)/3F, colorBlueSlopes*(aoLightValueXNegZPos)*(factorBottom+factorNorth+factorWest)/3F);
					tessellator.addVertexWithUV(d8, d10, d12, (d3+d4)/2.0F, d5);                                                                                                                                                                   
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXNegYNeg)*(factorBottom+factorNorth+factorWest)/3F, colorGreenSlopes*(aoLightValueXNegYNeg)*(factorBottom+factorNorth+factorWest)/3F, colorBlueSlopes*(aoLightValueXNegYNeg)*(factorBottom+factorNorth+factorWest)/3F);
					tessellator.addVertexWithUV(d8, d9, d11, d3, d6);                                                                                                                                                                              
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXNegYNeg)*(factorBottom+factorNorth+factorWest)/3F, colorGreenSlopes*(aoLightValueXNegYNeg)*(factorBottom+factorNorth+factorWest)/3F, colorBlueSlopes*(aoLightValueXNegYNeg)*(factorBottom+factorNorth+factorWest)/3F);
					tessellator.addVertexWithUV(d8, d9, d11, d3, d6);                                                                                                                                                                              
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNegZPos)*(factorBottom+factorNorth+factorWest)/3F, colorGreenSlopes*(aoLightValueYNegZPos)*(factorBottom+factorNorth+factorWest)/3F, colorBlueSlopes*(aoLightValueYNegZPos)*(factorBottom+factorNorth+factorWest)/3F);
					tessellator.addVertexWithUV(d13, d9, d12, d4, d6);
				}	
				if(iDir == 15){
					// Slope facing Down - North
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXNeg+aoLightValueXNegZPos)*(factorBottom+factorNorth)/4F, colorGreenSlopes*(aoLightValueXNeg+aoLightValueXNegZPos)*(factorBottom+factorNorth)/4F, colorBlueSlopes*(aoLightValueXNeg+aoLightValueXNegZPos)*(factorBottom+factorNorth)/4F);
					tessellator.addVertexWithUV(d8, d10, d12, d3, d5);
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueYNegZNeg)*(factorBottom+factorNorth)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueYNegZNeg)*(factorBottom+factorNorth)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueYNegZNeg)*(factorBottom+factorNorth)/4F);
					tessellator.addVertexWithUV(d13, d9, d11, d4, d6);
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueYNegZNeg)*(factorBottom+factorNorth)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueYNegZNeg)*(factorBottom+factorNorth)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueYNegZNeg)*(factorBottom+factorNorth)/4F);
					tessellator.addVertexWithUV(d13, d9, d11, d4, d6);
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueYNegZPos)*(factorBottom+factorNorth)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueYNegZPos)*(factorBottom+factorNorth)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueYNegZPos)*(factorBottom+factorNorth)/4F);
					tessellator.addVertexWithUV(d13, d9, d12, d3, d6);					
				}
			} else
			if(iDir == 4 || iDir == 12){		
				// Triangle Up pointing east
				tessellator.setColorOpaque_F(colorRedTopLeft_NorthFace, colorGreenTopLeft_NorthFace, colorBlueTopLeft_NorthFace);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d5);
				tessellator.setColorOpaque_F(colorRedBottomLeft_NorthFace, colorGreenBottomLeft_NorthFace, colorBlueBottomLeft_NorthFace);
				tessellator.addVertexWithUV(d8, d10, d11, d3, d5);		
				tessellator.setColorOpaque_F(colorRedBottomLeft_NorthFace, colorGreenBottomLeft_NorthFace, colorBlueBottomLeft_NorthFace);
				tessellator.addVertexWithUV(d8, d10, d11, d3, d5);
				tessellator.setColorOpaque_F(colorRedTopRight_NorthFace, colorGreenTopRight_NorthFace, colorBlueTopRight_NorthFace);
				tessellator.addVertexWithUV(d8, d9, d12, d4, d6);	
				if(iDir == 12){
					// Slope facing Down - North
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXNeg+aoLightValueXNegZNeg)*(factorBottom+factorNorth)/4F, colorGreenSlopes*(aoLightValueXNeg+aoLightValueXNegZNeg)*(factorBottom+factorNorth)/4F, colorBlueSlopes*(aoLightValueXNeg+aoLightValueXNegZNeg)*(factorBottom+factorNorth)/4F);
					tessellator.addVertexWithUV(d8, d10, d11, d3, d5);
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueYNegZNeg)*(factorBottom+factorNorth)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueYNegZNeg)*(factorBottom+factorNorth)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueYNegZNeg)*(factorBottom+factorNorth)/4F);
					tessellator.addVertexWithUV(d13, d9, d11, d3, d6);
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueYNegZPos)*(factorBottom+factorNorth)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueYNegZPos)*(factorBottom+factorNorth)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueYNegZPos)*(factorBottom+factorNorth)/4F);
					tessellator.addVertexWithUV(d13, d9, d12, d4, d6);
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueYNegZPos)*(factorBottom+factorNorth)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueYNegZPos)*(factorBottom+factorNorth)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueYNegZPos)*(factorBottom+factorNorth)/4F);
					tessellator.addVertexWithUV(d13, d9, d12, d4, d6);				
				}
			} 
			else{	
				// Standard
				tessellator.setColorOpaque_F(colorRedTopLeft_NorthFace, colorGreenTopLeft_NorthFace, colorBlueTopLeft_NorthFace);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d5);
				tessellator.setColorOpaque_F(colorRedBottomLeft_NorthFace, colorGreenBottomLeft_NorthFace, colorBlueBottomLeft_NorthFace);
				tessellator.addVertexWithUV(d8, d10, d11, d3, d5);		
				tessellator.setColorOpaque_F(colorRedBottomRight_NorthFace, colorGreenBottomRight_NorthFace, colorBlueBottomRight_NorthFace);
				tessellator.addVertexWithUV(d8, d9, d11, d3, d6);
				tessellator.setColorOpaque_F(colorRedTopRight_NorthFace, colorGreenTopRight_NorthFace, colorBlueTopRight_NorthFace);
				tessellator.addVertexWithUV(d8, d9, d12, d4, d6);			
			}
		} else
		{
			if(iDir == 3 || iDir == 11){
				// Pointing 1, X = 0, Z = 0
				tessellator.addVertexWithUV(d8, d10, d11, d3, d5);
				tessellator.addVertexWithUV(d8, d10, d11, d3, d5);		
				tessellator.addVertexWithUV(d8, d9, d11, d3, d6);
				tessellator.addVertexWithUV(d8, d9, d12, d4, d6);
				if(iDir == 3){
					// Slope
					tessellator.addVertexWithUV(d13, d10, d12, d4, d5);
					tessellator.addVertexWithUV(d8, d10, d11, d3, d5);
					tessellator.addVertexWithUV(d8, d10, d11, d3, d5);
					tessellator.addVertexWithUV(d8, d9, d12, (d3+d4)/2.0F, d6);	
				}
				if(iDir == 11){				
					// Slope pointing South-West		
					tessellator.addVertexWithUV(d13, d10, d11, d4, d5);
					tessellator.addVertexWithUV(d13, d10, d11, d4, d5);
					tessellator.addVertexWithUV(d8, d9, d12, d3, d6);	
					tessellator.addVertexWithUV(d13, d10, d12, d3, d5);
				}
			} else	
			if(iDir == 0 || iDir == 8){		
				// Pointing 2, X = 0, Z = 1
				tessellator.addVertexWithUV(d8, d10, d12, d4, d5);
				tessellator.addVertexWithUV(d8, d10, d12, d4, d5);		
				tessellator.addVertexWithUV(d8, d9, d11, d3, d6);
				tessellator.addVertexWithUV(d8, d9, d12, d4, d6);	
				if(iDir == 8){			
					// Slope pointing South-East
					tessellator.addVertexWithUV(d13, d10, d12, d4, d5);
					tessellator.addVertexWithUV(d13, d10, d11, d3, d5);
					tessellator.addVertexWithUV(d8, d9, d11, d3, d6);
					tessellator.addVertexWithUV(d13, d10, d12, d4, d5);	
				}		
			} else
			if(iDir == 7 || iDir == 15){
				// up Pointing 1, X = 0, Z = 0
				tessellator.addVertexWithUV(d8, d10, d12, d4, d5);
				tessellator.addVertexWithUV(d8, d10, d11, d3, d5);		
				tessellator.addVertexWithUV(d8, d9, d11, d3, d6);
				tessellator.addVertexWithUV(d8, d9, d11, d3, d6);
				if(iDir == 7){
					// Slope	
					tessellator.addVertexWithUV(d8, d10, d12, (d3+d4)/2.0F, d5);
					tessellator.addVertexWithUV(d8, d9, d11, d3, d6);
					tessellator.addVertexWithUV(d8, d9, d11, d3, d6);
					tessellator.addVertexWithUV(d13, d9, d12, d4, d6);
				}	
				if(iDir == 15){
					// Slope facing North	
					tessellator.addVertexWithUV(d8, d10, d12, d3, d5);
					tessellator.addVertexWithUV(d13, d9, d11, d4, d6);
					tessellator.addVertexWithUV(d13, d9, d11, d4, d6);
					tessellator.addVertexWithUV(d13, d9, d12, d3, d6);					
				}
			} else
			if(iDir == 4 || iDir == 12){		
				// up Pointing 2, X = 0, Z = 1
				tessellator.addVertexWithUV(d8, d10, d12, d4, d5);
				tessellator.addVertexWithUV(d8, d10, d11, d3, d5);		
				tessellator.addVertexWithUV(d8, d9, d12, d4, d6);
				tessellator.addVertexWithUV(d8, d9, d12, d4, d6);	
				if(iDir == 12){
					// Slope facing North	
					tessellator.addVertexWithUV(d8, d10, d11, d3, d5);
					tessellator.addVertexWithUV(d13, d9, d11, d3, d6);
					tessellator.addVertexWithUV(d13, d9, d12, d4, d6);
					tessellator.addVertexWithUV(d13, d9, d12, d4, d6);				
				}
			} 
			else{		
				// Standard
				tessellator.addVertexWithUV(d8, d10, d12, d4, d5);
				tessellator.addVertexWithUV(d8, d10, d11, d3, d5);		
				tessellator.addVertexWithUV(d8, d9, d11, d3, d6);
				tessellator.addVertexWithUV(d8, d9, d12, d4, d6);			
			}
		}
    }

    public void renderIntCornersSouthFace(Block block, double d, double d1, double d2, int i, int iDir, RenderBlocks renderblocks, int lBrightness)
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
			if(iDir == 2 || iDir == 10){
				// Triangle Down pointing east
				tessellator.setColorOpaque_F(colorRedTopLeft_SouthFace, colorGreenTopLeft_SouthFace, colorBlueTopLeft_SouthFace);
				tessellator.addVertexWithUV(d8, d9, d12, d3, d6);
				tessellator.setColorOpaque_F(colorRedBottomLeft_SouthFace, colorGreenBottomLeft_SouthFace, colorBlueBottomLeft_SouthFace);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.setColorOpaque_F(colorRedBottomLeft_SouthFace, colorGreenBottomLeft_SouthFace, colorBlueBottomLeft_SouthFace);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.setColorOpaque_F(colorRedTopRight_SouthFace, colorGreenTopRight_SouthFace, colorBlueTopRight_SouthFace);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d5);	
				if(iDir == 2){			
					// Slope facing Up - South - East
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXPosYPos)*(factorTop+factorSouth+factorEast)/3F, colorGreenSlopes*(aoLightValueXPosYPos)*(factorTop+factorSouth+factorEast)/3F, colorBlueSlopes*(aoLightValueXPosYPos)*(factorTop+factorSouth+factorEast)/3F);
					tessellator.addVertexWithUV(d8, d10, d12, d3, d5);                                                                                                                                                                       
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXPosZNeg)*(factorTop+factorSouth+factorEast)/3F, colorGreenSlopes*(aoLightValueXPosZNeg)*(factorTop+factorSouth+factorEast)/3F, colorBlueSlopes*(aoLightValueXPosZNeg)*(factorTop+factorSouth+factorEast)/3F);
					tessellator.addVertexWithUV(d8, d9, d11, (d3+d4)/2.0F, d6);                                                                                                                                                              
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPosZNeg)*(factorTop+factorSouth+factorEast)/3F, colorGreenSlopes*(aoLightValueYPosZNeg)*(factorTop+factorSouth+factorEast)/3F, colorBlueSlopes*(aoLightValueYPosZNeg)*(factorTop+factorSouth+factorEast)/3F);
					tessellator.addVertexWithUV(d13, d10, d11, d4, d5);                                                                                                                                                                      
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPosZNeg)*(factorTop+factorSouth+factorEast)/3F, colorGreenSlopes*(aoLightValueYPosZNeg)*(factorTop+factorSouth+factorEast)/3F, colorBlueSlopes*(aoLightValueYPosZNeg)*(factorTop+factorSouth+factorEast)/3F);
					tessellator.addVertexWithUV(d8, d10, d12, d3, d5);			
				} 
				if(iDir == 10){
					// Slope facing Up - South
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXPos+aoLightValueXPosZNeg)*(factorTop+factorSouth)/4F, colorGreenSlopes*(aoLightValueXPos+aoLightValueXPosZNeg)*(factorTop+factorSouth)/4F, colorBlueSlopes*(aoLightValueXPos+aoLightValueXPosZNeg)*(factorTop+factorSouth)/4F);
					tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueYPosZNeg)*(factorTop+factorSouth)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueYPosZNeg)*(factorTop+factorSouth)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueYPosZNeg)*(factorTop+factorSouth)/4F);
					tessellator.addVertexWithUV(d13, d10, d11, d4, d5);
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueYPosZPos)*(factorTop+factorSouth)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueYPosZPos)*(factorTop+factorSouth)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueYPosZPos)*(factorTop+factorSouth)/4F);
					tessellator.addVertexWithUV(d13, d10, d12, d3, d5);
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueYPosZPos)*(factorTop+factorSouth)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueYPosZPos)*(factorTop+factorSouth)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueYPosZPos)*(factorTop+factorSouth)/4F);
					tessellator.addVertexWithUV(d13, d10, d12, d3, d5);				
				}
			} else	
			if(iDir == 1 || iDir == 9){		
				// Triangle Down pointing west
				tessellator.setColorOpaque_F(colorRedTopLeft_SouthFace, colorGreenTopLeft_SouthFace, colorBlueTopLeft_SouthFace);
				tessellator.addVertexWithUV(d8, d9, d12, d3, d6);
				tessellator.setColorOpaque_F(colorRedBottomLeft_SouthFace, colorGreenBottomLeft_SouthFace, colorBlueBottomLeft_SouthFace);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.setColorOpaque_F(colorRedBottomRight_SouthFace, colorGreenBottomRight_SouthFace, colorBlueBottomRight_SouthFace);
				tessellator.addVertexWithUV(d8, d10, d11, d4, d5);
				tessellator.setColorOpaque_F(colorRedTopLeft_SouthFace, colorGreenTopLeft_SouthFace, colorBlueTopLeft_SouthFace);
				tessellator.addVertexWithUV(d8, d9, d12, d3, d6);
				if(iDir == 9){
					// Slope facing Up - South
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXPos+aoLightValueXPosZPos)*(factorTop+factorSouth)/4F, colorGreenSlopes*(aoLightValueXPos+aoLightValueXPosZPos)*(factorTop+factorSouth)/4F, colorBlueSlopes*(aoLightValueXPos+aoLightValueXPosZPos)*(factorTop+factorSouth)/4F);
					tessellator.addVertexWithUV(d8, d9, d12, d4, d6);
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueYPosZNeg)*(factorTop+factorSouth)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueYPosZNeg)*(factorTop+factorSouth)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueYPosZNeg)*(factorTop+factorSouth)/4F);
					tessellator.addVertexWithUV(d13, d10, d11, d3, d5);
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueYPosZNeg)*(factorTop+factorSouth)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueYPosZNeg)*(factorTop+factorSouth)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueYPosZNeg)*(factorTop+factorSouth)/4F);
					tessellator.addVertexWithUV(d13, d10, d11, d3, d5);
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYPos+aoLightValueYPosZPos)*(factorTop+factorSouth)/4F, colorGreenSlopes*(aoLightValueYPos+aoLightValueYPosZPos)*(factorTop+factorSouth)/4F, colorBlueSlopes*(aoLightValueYPos+aoLightValueYPosZPos)*(factorTop+factorSouth)/4F);
					tessellator.addVertexWithUV(d13, d10, d12, d4, d5);						
				}			
			} else
			if(iDir == 6 || iDir == 14){
				// Triangle Up pointing east
				tessellator.setColorOpaque_F(colorRedTopLeft_SouthFace, colorGreenTopLeft_SouthFace, colorBlueTopLeft_SouthFace);
				tessellator.addVertexWithUV(d8, d9, d12, d3, d6);
				tessellator.setColorOpaque_F(colorRedBottomRight_SouthFace, colorGreenBottomRight_SouthFace, colorBlueBottomRight_SouthFace);
				tessellator.addVertexWithUV(d8, d10, d11, d4, d5);
				tessellator.setColorOpaque_F(colorRedBottomRight_SouthFace, colorGreenBottomRight_SouthFace, colorBlueBottomRight_SouthFace);
				tessellator.addVertexWithUV(d8, d10, d11, d4, d5);
				tessellator.setColorOpaque_F(colorRedTopRight_SouthFace, colorGreenTopRight_SouthFace, colorBlueTopRight_SouthFace);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d5);
				if(iDir == 6){			
					// Slope facing Down - South - East
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXPosYNeg)*(factorBottom+factorSouth+factorEast)/3F, colorGreenSlopes*(aoLightValueXPosYNeg)*(factorBottom+factorSouth+factorEast)/3F, colorBlueSlopes*(aoLightValueXPosYNeg)*(factorBottom+factorSouth+factorEast)/3F);
					tessellator.addVertexWithUV(d8, d9, d12, d3, d6);                                                                                                                                                              
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNegZNeg)*(factorBottom+factorSouth+factorEast)/3F, colorGreenSlopes*(aoLightValueYNegZNeg)*(factorBottom+factorSouth+factorEast)/3F, colorBlueSlopes*(aoLightValueYNegZNeg)*(factorBottom+factorSouth+factorEast)/3F);
					tessellator.addVertexWithUV(d13, d9, d11, d4, d6);                                                                                                                                                             
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXPosZNeg)*(factorBottom+factorSouth+factorEast)/3F, colorGreenSlopes*(aoLightValueXPosZNeg)*(factorBottom+factorSouth+factorEast)/3F, colorBlueSlopes*(aoLightValueXPosZNeg)*(factorBottom+factorSouth+factorEast)/3F);
					tessellator.addVertexWithUV(d8, d10, d11, (d3+d4)/2.0F, d5);                                                                                                                                                   
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXPosZNeg)*(factorBottom+factorSouth+factorEast)/3F, colorGreenSlopes*(aoLightValueXPosZNeg)*(factorBottom+factorSouth+factorEast)/3F, colorBlueSlopes*(aoLightValueXPosZNeg)*(factorBottom+factorSouth+factorEast)/3F);
					tessellator.addVertexWithUV(d8, d9, d12, d3, d6);
				} 
				if(iDir == 14){
					// Slope facing Down - South
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueYNegZPos)*(factorBottom+factorSouth)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueYNegZPos)*(factorBottom+factorSouth)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueYNegZPos)*(factorBottom+factorSouth)/4F);
					tessellator.addVertexWithUV(d13, d9, d12, d3, d6);
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueYNegZNeg)*(factorBottom+factorSouth)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueYNegZNeg)*(factorBottom+factorSouth)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueYNegZNeg)*(factorBottom+factorSouth)/4F);
					tessellator.addVertexWithUV(d13, d9, d11, d4, d6);
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXPos+aoLightValueXPosZNeg)*(factorBottom+factorSouth)/4F, colorGreenSlopes*(aoLightValueXPos+aoLightValueXPosZNeg)*(factorBottom+factorSouth)/4F, colorBlueSlopes*(aoLightValueXPos+aoLightValueXPosZNeg)*(factorBottom+factorSouth)/4F);
					tessellator.addVertexWithUV(d8, d10, d11, d4, d5);
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueYNegZPos)*(factorBottom+factorSouth)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueYNegZPos)*(factorBottom+factorSouth)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueYNegZPos)*(factorBottom+factorSouth)/4F);
					tessellator.addVertexWithUV(d13, d9, d12, d3, d6);					
				}
			} else	
			if(iDir == 5 || iDir == 13){		
				// Triangle Up pointing west
				tessellator.setColorOpaque_F(colorRedTopRight_SouthFace, colorGreenTopRight_SouthFace, colorBlueTopRight_SouthFace);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d5);
				tessellator.setColorOpaque_F(colorRedBottomLeft_SouthFace, colorGreenBottomLeft_SouthFace, colorBlueBottomLeft_SouthFace);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.setColorOpaque_F(colorRedBottomRight_SouthFace, colorGreenBottomRight_SouthFace, colorBlueBottomRight_SouthFace);
				tessellator.addVertexWithUV(d8, d10, d11, d4, d5);
				tessellator.setColorOpaque_F(colorRedTopRight_SouthFace, colorGreenTopRight_SouthFace, colorBlueTopRight_SouthFace);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d5);	
				if(iDir == 13){
					// Slope facing Down - South
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueYNegZNeg)*(factorBottom+factorSouth)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueYNegZNeg)*(factorBottom+factorSouth)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueYNegZNeg)*(factorBottom+factorSouth)/4F);
					tessellator.addVertexWithUV(d13, d9, d11, d3, d6);
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueYNegZNeg)*(factorBottom+factorSouth)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueYNegZNeg)*(factorBottom+factorSouth)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueYNegZNeg)*(factorBottom+factorSouth)/4F);
					tessellator.addVertexWithUV(d13, d9, d11, d3, d6);
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueXPos+aoLightValueXPosZPos)*(factorBottom+factorSouth)/4F, colorGreenSlopes*(aoLightValueXPos+aoLightValueXPosZPos)*(factorBottom+factorSouth)/4F, colorBlueSlopes*(aoLightValueXPos+aoLightValueXPosZPos)*(factorBottom+factorSouth)/4F);
					tessellator.addVertexWithUV(d8, d10, d12, d4, d5);	
					tessellator.setColorOpaque_F(colorRedSlopes*(aoLightValueYNeg+aoLightValueYNegZPos)*(factorBottom+factorSouth)/4F, colorGreenSlopes*(aoLightValueYNeg+aoLightValueYNegZPos)*(factorBottom+factorSouth)/4F, colorBlueSlopes*(aoLightValueYNeg+aoLightValueYNegZPos)*(factorBottom+factorSouth)/4F);
					tessellator.addVertexWithUV(d13, d9, d12, d4, d6);				
				}
			}
			else{
				// Standard
				tessellator.setColorOpaque_F(colorRedTopLeft_SouthFace, colorGreenTopLeft_SouthFace, colorBlueTopLeft_SouthFace);
				tessellator.addVertexWithUV(d8, d9, d12, d3, d6);
				tessellator.setColorOpaque_F(colorRedBottomLeft_SouthFace, colorGreenBottomLeft_SouthFace, colorBlueBottomLeft_SouthFace);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.setColorOpaque_F(colorRedBottomRight_SouthFace, colorGreenBottomRight_SouthFace, colorBlueBottomRight_SouthFace);
				tessellator.addVertexWithUV(d8, d10, d11, d4, d5);
				tessellator.setColorOpaque_F(colorRedTopRight_SouthFace, colorGreenTopRight_SouthFace, colorBlueTopRight_SouthFace);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d5);		
			}
		} else
		{
			if(iDir == 2 || iDir == 10){
				// Pointing 0, X = 1, Z = 1
				tessellator.addVertexWithUV(d8, d9, d12, d3, d6);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d5);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d5);	
				if(iDir == 2){			
					// Slope
					tessellator.addVertexWithUV(d8, d10, d12, d3, d5);
					tessellator.addVertexWithUV(d8, d9, d11, (d3+d4)/2.0F, d6);
					tessellator.addVertexWithUV(d13, d10, d11, d4, d5);
					tessellator.addVertexWithUV(d8, d10, d12, d3, d5);			
				} 
				if(iDir == 10){
					// Slope pointing North-East		
					tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
					tessellator.addVertexWithUV(d13, d10, d11, d4, d5);
					tessellator.addVertexWithUV(d13, d10, d12, d3, d5);
					tessellator.addVertexWithUV(d13, d10, d12, d3, d5);				
				}
			} else	
			if(iDir == 1 || iDir == 9){		
				// Pointing 3, X = 1, Z = 0
				tessellator.addVertexWithUV(d8, d9, d12, d3, d6);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.addVertexWithUV(d8, d10, d11, d4, d5);
				tessellator.addVertexWithUV(d8, d10, d11, d4, d5);	
				if(iDir == 9){
					// Slope pointing North-West
					tessellator.addVertexWithUV(d8, d9, d12, d4, d6);
					tessellator.addVertexWithUV(d13, d10, d11, d3, d5);
					tessellator.addVertexWithUV(d13, d10, d11, d3, d5);
					tessellator.addVertexWithUV(d13, d10, d12, d4, d5);						
				}			
			} else
			if(iDir == 6 || iDir == 14){
				// Pointing 0, X = 1, Z = 1
				tessellator.addVertexWithUV(d8, d9, d12, d3, d6);
				tessellator.addVertexWithUV(d8, d9, d12, d3, d6);
				tessellator.addVertexWithUV(d8, d10, d11, d4, d5);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d5);	
				if(iDir == 6){			
					// Slope
					tessellator.addVertexWithUV(d8, d9, d12, d3, d6);
					tessellator.addVertexWithUV(d13, d9, d11, d4, d6);
					tessellator.addVertexWithUV(d8, d10, d11, (d3+d4)/2.0F, d5);
					tessellator.addVertexWithUV(d8, d9, d12, d3, d6);
				} 
				if(iDir == 14){
					// Slope facing South
					tessellator.addVertexWithUV(d13, d9, d12, d3, d6);
					tessellator.addVertexWithUV(d13, d9, d11, d4, d6);
					tessellator.addVertexWithUV(d8, d10, d11, d4, d5);
					tessellator.addVertexWithUV(d13, d9, d12, d3, d6);					
				}
			} else	
			if(iDir == 5 || iDir == 13){		
				// Pointing 3, X = 1, Z = 0
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.addVertexWithUV(d8, d10, d11, d4, d5);
				tessellator.addVertexWithUV(d8, d10, d12, d3, d5);	
				if(iDir == 13){
					// Slope facing South
					tessellator.addVertexWithUV(d13, d9, d11, d3, d6);
					tessellator.addVertexWithUV(d13, d9, d11, d3, d6);
					tessellator.addVertexWithUV(d8, d10, d12, d4, d5);	
					tessellator.addVertexWithUV(d13, d9, d12, d4, d6);				
				}
			}
			else{
				// Standard
				tessellator.addVertexWithUV(d8, d9, d12, d3, d6);
				tessellator.addVertexWithUV(d8, d9, d11, d4, d6);
				tessellator.addVertexWithUV(d8, d10, d11, d4, d5);
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