package mdiyo.inficraft.flora.crops;
import java.util.Random;

import mdiyo.shared.items.InfiTexturedItem;
import net.minecraft.src.BiomeGenBase;
import net.minecraft.src.Block;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.Item;
import net.minecraft.src.ModLoader;
import net.minecraft.src.RenderBlocks;
import net.minecraft.src.Tessellator;
import net.minecraft.src.World;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "Flora Crops", name = "Flora and Soma Crops", version = "Anachrosim")
public class FloraCrops
{
	/* Proxies for sides, used for graphics processing */
	@SidedProxy(clientSide = "mdiyo.inficraft.flora.crops.client.FloraCropsClientProxy", serverSide = "mdiyo.inficraft.flora.crops.FloraCropsCommonProxy")
	public static FloraCropsCommonProxy proxy;
	
	/* Instance of this mod, used for grabbing prototype fields */
	@Instance
	public static FloraCrops instance;
	public static FloraCrops getInstance()
	{
		return instance;
	}
	
	@PreInit
	public void preInit(FMLPreInitializationEvent evt)
	{
		PHCrops.initProps();
		
		seedBag = new SeedBag(PHCrops.seedBagID).setItemName("seedBag");
		
		food = new RecipeItem(PHCrops.foodID, "/floratex/seeds.png").setIconCoord(1, 3).setItemName("food");
		floraCrops = new FloraCropBlock(PHCrops.floraCropsID, 80);
		barleySeed = new FloraSeeds(PHCrops.barleySeedID, floraCrops.blockID, Block.tilledField.blockID).setIconCoord(1, 2).setItemName("barleySeed");
		
		waterDrop = new CactusJuice(PHCrops.ingredientsID + 0, 2, false, 16).setIconCoord(3, 0).setItemName("waterDrop");
		
		wheatFlour = new InfiTexturedItem(PHCrops.ingredientsID + 2, "/floratex/infifood.png", "Wheat Flour").setIconCoord(1, 0);
		wheatDough = new InfiTexturedItem(PHCrops.ingredientsID + 3, "/floratex/infifood.png", "Wheat Dough").setIconCoord(2, 0);
		
		ModLoader.registerBlock(floraCrops);
	}

	@Init
	public void init(FMLInitializationEvent evt)
	{
		GameRegistry.registerWorldGenerator(new CropWorldgen());

		proxy.registerRenderer();
		proxy.addRecipes();
		proxy.addNames();
		proxy.addEESupport();
	}
	
	/* Render methods, used for saguaro */
	public boolean renderWorldBlock(RenderBlocks renderblocks, IBlockAccess iblockaccess, int x, int y, int z, Block block, int modelID)
	{
		
		if (modelID == saguaroModel){
			return renderSaguaroWorld(renderblocks, iblockaccess, x, y, z, (SaguaroBlock)block);
		} else

		{	  	
			return false;
		}
	}
	
	private boolean renderSaguaroWorld(RenderBlocks renderblocks, 
			IBlockAccess iblockaccess, int x, int y, int z, SaguaroBlock cactus)
	{
		float offset = 0.125F;
		
		float bX = offset;
		float bY = 0.0F;
		float bZ = offset;
		float tX = 1.0F - offset;
		float tY = 1.0F - offset;
		float tZ = 1.0F - offset;
		
		int airBelow = iblockaccess.getBlockId(x, y-1, z);
		int cactusAbove = iblockaccess.getBlockId(x, y+1, z);	
		
		if(airBelow == 0)
			bY = offset;
		/*if(cactusAbove == saguaro.blockID)
			tY = 1.0F;*/
		
		cactus.setBlockBounds(bX, bY, bZ, tX, tY, tZ);
		renderblocks.renderStandardBlock(cactus, x, y, z);
		
		bY = offset;
		tY = 1.0F - offset;
		
		if(cactus.canConnectSuguaroTo(iblockaccess, x + 1, y, z) && 
				(airBelow == 0 || iblockaccess.getBlockId(x+1, y-1, z) == 0) ) {
			bX = 1F - offset;
			tX = 1F;
			cactus.setBlockBounds(bX, bY, bZ, tX, tY, tZ);
			renderblocks.renderStandardBlock(cactus, x, y, z);
		}
		
		if(cactus.canConnectSuguaroTo(iblockaccess, x - 1, y, z) && 
				(airBelow == 0 || iblockaccess.getBlockId(x-1, y-1, z) == 0)) {
			bX = 0F;
			tX = offset;
			cactus.setBlockBounds(bX, bY, bZ, tX, tY, tZ);
			renderblocks.renderStandardBlock(cactus, x, y, z);
		}
		
		bX = offset;
		tX = 1.0F - offset;
		
		if(cactus.canConnectSuguaroTo(iblockaccess, x, y, z + 1) && 
				(airBelow == 0 || iblockaccess.getBlockId(x, y-1, z+1) == 0)) {
			bZ = 1F - offset;
			tZ = 1F;
			cactus.setBlockBounds(bX, bY, bZ, tX, tY, tZ);
			renderblocks.renderStandardBlock(cactus, x, y, z);
		}
		
		if(cactus.canConnectSuguaroTo(iblockaccess, x, y, z - 1) && 
				(airBelow == 0 || iblockaccess.getBlockId(x, y-1, z-1) == 0)) {
			bZ = 0F;
			tZ = offset;
			cactus.setBlockBounds(bX, bY, bZ, tX, tY, tZ);
			renderblocks.renderStandardBlock(cactus, x, y, z);
		}
		return false;
	}

	public void renderInvBlock(RenderBlocks renderblocks, Block block, int i, int j)
	{
		
		if (j == saguaroModel)
		{
			renderSaguaroInv(renderblocks, block, i);
		}
	}
	
	private void renderSaguaroInv(RenderBlocks renderblocks, Block block, int i)
	{
		float offset = 0.125F;
		
		float bX = offset;
		float bY = 0.0F;
		float bZ = offset;
		float tX = 1.0F - offset;
		float tY = 1.0F - offset;
		float tZ = 1.0F - offset;
		
		block.setBlockBounds(bX, bY, bZ, tX, tY, tZ);
		RenderDo(renderblocks, block, i);
	}

	private void RenderDo(RenderBlocks renderblocks, Block block, int i)
	{
		Tessellator tessellator = Tessellator.instance;
		GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
		tessellator.startDrawingQuads();
		tessellator.setNormal(0.0F, -1F, 0.0F);
		renderblocks.renderBottomFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSideAndMetadata(0, i));
		tessellator.draw();
		tessellator.startDrawingQuads();
		tessellator.setNormal(0.0F, 1.0F, 0.0F);
		renderblocks.renderTopFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSideAndMetadata(1, i));
		tessellator.draw();
		tessellator.startDrawingQuads();
		tessellator.setNormal(0.0F, 0.0F, -1F);
		renderblocks.renderEastFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSideAndMetadata(2, i));
		tessellator.draw();
		tessellator.startDrawingQuads();
		tessellator.setNormal(0.0F, 0.0F, 1.0F);
		renderblocks.renderWestFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSideAndMetadata(3, i));
		tessellator.draw();
		tessellator.startDrawingQuads();
		tessellator.setNormal(-1F, 0.0F, 0.0F);
		renderblocks.renderNorthFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSideAndMetadata(4, i));
		tessellator.draw();
		tessellator.startDrawingQuads();
		tessellator.setNormal(1.0F, 0.0F, 0.0F);
		renderblocks.renderSouthFace(block, 0.0D, 0.0D, 0.0D, block.getBlockTextureFromSideAndMetadata(5, i));
		tessellator.draw();
		GL11.glTranslatef(0.5F, 0.5F, 0.5F);
	}
	
	/* Prototype fields, used elsewhere */
	
	public static Item seedBag;
	public static Item barleySeed;
	public static Item food;

	public static Item waterDrop;
	public static Item wheatFlour;
	public static Item wheatDough;	
	
	public static Block floraCrops;
	
	public static int saguaroModel;

}
