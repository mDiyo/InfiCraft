package mDiyo.inficraft.infitools.twoxtwo;
import mDiyo.inficraft.infitools.library.InfiLibrary;
import mDiyo.inficraft.infitools.library.InfiMaterialEnum;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraftforge.common.MinecraftForge;

public class Hatchets 
{
    public static Hatchets instance = new Hatchets();
    
    private static String[] recipe = { "##", " |" };
    
    public static Hatchets getInstance()
    {
        return instance;
    }

    public static void init()
    {
        if(Infi2x2.infitoolsPresent)
        {
        	createTools();
            addNames();
        	registerInfiToolsRecipes();
        }
        else
        {
        	createVanillaTools();
        	registerVanillaRecipes();
        }
    }
    
    private static void createVanillaTools()
    {
    	woodWoodHatchet = new InfiToolHatchet(PropsHelperInfi2x2.woodHatchetID+0, 
                InfiMaterialEnum.Wood, InfiMaterialEnum.Wood, "woodWoodHatchet");
    	woodStoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.stoneHatchetID+0, 
                InfiMaterialEnum.Stone, InfiMaterialEnum.Wood, "woodStoneHatchet");
    	woodIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.ironHatchetID+0, 
                InfiMaterialEnum.Iron, InfiMaterialEnum.Wood, "woodIronHatchet");
    	woodDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID+0, 
                InfiMaterialEnum.Diamond, InfiMaterialEnum.Wood, "woodDiamondHatchet");
    	
    	ModLoader.addName(woodWoodHatchet, "Wooden Hatchet");
    }
    
    private static void registerVanillaRecipes()
    {
    	ModLoader.addRecipe(new ItemStack(woodWoodHatchet), new Object[] 
                { recipe, '#', Block.planks, '|', Item.stick, });
		ModLoader.addRecipe(new ItemStack(woodStoneHatchet), new Object[] 
                { recipe, '#', Block.cobblestone, '|', Item.stick, });
		ModLoader.addRecipe(new ItemStack(woodIronHatchet), new Object[] 
                { recipe, '#', Item.ingotIron, '|', Item.stick, });
		ModLoader.addRecipe(new ItemStack(woodDiamondHatchet), new Object[] 
                { recipe, '#', Item.diamond, '|', Item.stick, });
		
		MinecraftForge.setToolClass(woodWoodHatchet, "axe", InfiMaterialEnum.Wood.getHarvestLevel());
    	MinecraftForge.setToolClass(woodStoneHatchet, "axe", InfiMaterialEnum.Stone.getHarvestLevel());
    	MinecraftForge.setToolClass(woodIronHatchet, "axe", InfiMaterialEnum.Iron.getHarvestLevel());
    	MinecraftForge.setToolClass(woodDiamondHatchet, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
    }
    
    private static void createTools()
    {
    	if(PropsHelperInfi2x2.enableWoodTools)
    	{
    		woodWoodHatchet = new InfiToolHatchet(PropsHelperInfi2x2.woodHatchetID+0, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Wood, "woodWoodHatchet");
    		sandstoneWoodHatchet = new InfiToolHatchet(PropsHelperInfi2x2.woodHatchetID+1, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Sandstone, "sandstoneWoodHatchet");
    		boneWoodHatchet = new InfiToolHatchet(PropsHelperInfi2x2.woodHatchetID+2, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Bone, "boneWoodHatchet");
    		paperWoodHatchet = new InfiToolHatchet(PropsHelperInfi2x2.woodHatchetID+3, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Paper, "paperWoodHatchet");
    		iceWoodHatchet = new InfiToolHatchet(PropsHelperInfi2x2.woodHatchetID+4, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Ice, "iceWoodHatchet");
    		slimeWoodHatchet = new InfiToolHatchet(PropsHelperInfi2x2.woodHatchetID+5, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Slime, "slimeWoodHatchet");
    		cactusWoodHatchet = new InfiToolHatchet(PropsHelperInfi2x2.woodHatchetID+6, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Cactus, "cactusWoodHatchet");
    		
    		MinecraftForge.setToolClass(woodWoodHatchet, "axe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(sandstoneWoodHatchet, "axe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(boneWoodHatchet, "axe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(paperWoodHatchet, "axe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(iceWoodHatchet, "axe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(slimeWoodHatchet, "axe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(cactusWoodHatchet, "axe", InfiMaterialEnum.Wood.getHarvestLevel());
    	}

        if(PropsHelperInfi2x2.enableStoneTools)
        {
        	woodStoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.stoneHatchetID+0, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Wood, "woodStoneHatchet");
        	stoneStoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.stoneHatchetID+1, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Stone, "stoneStoneHatchet");
        	sandstoneStoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.stoneHatchetID+2, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Sandstone, "sandstoneStoneHatchet");
        	boneStoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.stoneHatchetID+3, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Bone, "boneStoneHatchet");
        	netherrackStoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.stoneHatchetID+4, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Netherrack, "netherrackStoneHatchet");
        	iceStoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.stoneHatchetID+5, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Ice, "iceStoneHatchet");
        	slimeStoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.stoneHatchetID+6, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Slime, "slimeStoneHatchet");
        	cactusStoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.stoneHatchetID+7, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Cactus, "cactusStoneHatchet");
        	flintStoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.stoneHatchetID+8, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Flint, "flintStoneHatchet");
            
            MinecraftForge.setToolClass(woodStoneHatchet, "axe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneStoneHatchet, "axe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneStoneHatchet, "axe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(boneStoneHatchet, "axe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackStoneHatchet, "axe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(iceStoneHatchet, "axe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeStoneHatchet, "axe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusStoneHatchet, "axe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(flintStoneHatchet, "axe", InfiMaterialEnum.Stone.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableIronTools)
        {
        	woodIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.ironHatchetID+0, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Wood, "woodIronHatchet");
        	stoneIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.ironHatchetID+1, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Stone, "stoneIronHatchet");
        	ironIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.ironHatchetID+2, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Iron, "ironIronHatchet");
        	boneIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.ironHatchetID+3, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bone, "boneIronHatchet");
        	netherrackIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.ironHatchetID+4, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Netherrack, "netherrackIronHatchet");
        	glowstoneIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.ironHatchetID+5, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Glowstone, "glowstoneIronHatchet");
        	cactusIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.ironHatchetID+6, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Cactus, "cactusIronHatchet");
        	copperIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.ironHatchetID+7, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Copper, "copperIronHatchet");
        	bronzeIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.ironHatchetID+8, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bronze, "bronzeIronHatchet");
            
            MinecraftForge.setToolClass(woodIronHatchet, "axe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(stoneIronHatchet, "axe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(ironIronHatchet, "axe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(boneIronHatchet, "axe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackIronHatchet, "axe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneIronHatchet, "axe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(cactusIronHatchet, "axe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(copperIronHatchet, "axe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeIronHatchet, "axe", InfiMaterialEnum.Iron.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableDiamondTools)
        {
        	woodDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID+0, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Wood, "woodDiamondHatchet");
        	stoneDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID+1, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Stone, "stoneDiamondHatchet");
        	ironDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID+2, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Iron, "ironDiamondHatchet");
        	diamondDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID+3, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Diamond, "diamondDiamondHatchet");
        	redstoneDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID+4, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Redstone, "redstoneDiamondHatchet");
        	obsidianDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID+5, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Obsidian, "obsidianDiamondHatchet");
        	boneDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID+6, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bone, "boneDiamondHatchet");
        	mossyDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID+7, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Mossy, "mossyDiamondHatchet");
        	netherrackDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID+8, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Netherrack, "netherrackDiamondHatchet");
        	glowstoneDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID+9, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Glowstone, "glowstoneDiamondHatchet");
        	lavaDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID+10, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Lava, "lavaDiamondHatchet");
        	cactusDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID+11, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cactus, "cactusDiamondHatchet");
        	flintDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID+12, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Flint, "flintDiamondHatchet");
        	blazeDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID+13, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Blaze, "blazeDiamondHatchet");
            copperDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID+14, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Copper, "copperDiamondHatchet");
            bronzeDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID+15, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bronze, "bronzeDiamondHatchet");
            workedDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID+16, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.WorkedIron, "workedDiamondHatchet");
            steelDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID+17, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Steel, "steelDiamondHatchet");
            cobaltDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID+18, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cobalt, "cobaltDiamondHatchet");
            arditeDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID+19, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Ardite, "arditeDiamondHatchet");
            manyullynDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID+20, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Manyullyn, "manyullynDiamondHatchet");
            uraniumDiamondHatchet = new InfiToolHatchet(PropsHelperInfi2x2.diamondHatchetID+21, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Uranium, "uraniumDiamondHatchet");
            
            MinecraftForge.setToolClass(woodDiamondHatchet, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(stoneDiamondHatchet, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(ironDiamondHatchet, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(diamondDiamondHatchet, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneDiamondHatchet, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianDiamondHatchet, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(boneDiamondHatchet, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(mossyDiamondHatchet, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackDiamondHatchet, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneDiamondHatchet, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(lavaDiamondHatchet, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(cactusDiamondHatchet, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(flintDiamondHatchet, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(blazeDiamondHatchet, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(copperDiamondHatchet, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeDiamondHatchet, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(workedDiamondHatchet, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(steelDiamondHatchet, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltDiamondHatchet, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(arditeDiamondHatchet, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynDiamondHatchet, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumDiamondHatchet, "axe", InfiMaterialEnum.Diamond.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableRedstoneTools)
        {
        	woodRedstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.redstoneHatchetID+0, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Wood, "woodRedstoneHatchet");
        	stoneRedstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.redstoneHatchetID+1, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Stone, "stoneRedstoneHatchet");
        	ironRedstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.redstoneHatchetID+2, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Iron, "ironRedstoneHatchet");
        	redstoneRedstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.redstoneHatchetID+3, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Redstone, "redstoneRedstoneHatchet");
        	obsidianRedstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.redstoneHatchetID+4, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Obsidian, "obsidianRedstoneHatchet");
        	sandstoneRedstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.redstoneHatchetID+5, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Sandstone, "sandstoneRedstoneHatchet");
        	boneRedstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.redstoneHatchetID+6, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bone, "boneRedstoneHatchet");
        	paperRedstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.redstoneHatchetID+7, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Paper, "paperRedstoneHatchet");
        	mossyRedstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.redstoneHatchetID+8, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Mossy, "mossyRedstoneHatchet");
        	netherrackRedstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.redstoneHatchetID+9, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Netherrack, "netherrackRedstoneHatchet");
        	glowstoneRedstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.redstoneHatchetID+10, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Glowstone, "glowstoneRedstoneHatchet");
        	iceRedstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.redstoneHatchetID+11, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Ice, "iceRedstoneHatchet");
        	lavaRedstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.redstoneHatchetID+12,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Lava, "lavaRedstoneHatchet");
        	slimeRedstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.redstoneHatchetID+13,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Slime, "slimeRedstoneHatchet");
        	cactusRedstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.redstoneHatchetID+14,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Cactus, "cactusRedstoneHatchet");
        	flintRedstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.redstoneHatchetID+15,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Flint, "flintRedstoneHatchet");
        	copperRedstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.redstoneHatchetID+16,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Copper, "copperRedstoneHatchet");
        	bronzeRedstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.redstoneHatchetID+17,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bronze, "bronzeRedstoneHatchet");
        	workedRedstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.redstoneHatchetID+18,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.WorkedIron, "workedRedstoneHatchet");
        	uraniumRedstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.redstoneHatchetID+19,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Uranium, "uraniumRedstoneHatchet");
            
            MinecraftForge.setToolClass(woodRedstoneHatchet, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneRedstoneHatchet, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(ironRedstoneHatchet, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneRedstoneHatchet, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianRedstoneHatchet, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneRedstoneHatchet, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneRedstoneHatchet, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(paperRedstoneHatchet, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(mossyRedstoneHatchet, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackRedstoneHatchet, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneRedstoneHatchet, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceRedstoneHatchet, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(lavaRedstoneHatchet, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeRedstoneHatchet, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusRedstoneHatchet, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(flintRedstoneHatchet, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(copperRedstoneHatchet, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeRedstoneHatchet, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(workedRedstoneHatchet, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumRedstoneHatchet, "axe", InfiMaterialEnum.Redstone.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableObsidianTools)
        {
        	woodObsidianHatchet = new InfiToolHatchet(PropsHelperInfi2x2.obsidianHatchetID+0, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Wood, "woodObsidianHatchet");
        	stoneObsidianHatchet = new InfiToolHatchet(PropsHelperInfi2x2.obsidianHatchetID+1, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Stone, "stoneObsidianHatchet");
        	redstoneObsidianHatchet = new InfiToolHatchet(PropsHelperInfi2x2.obsidianHatchetID+2, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Redstone, "redstoneObsidianHatchet");
        	obsidianObsidianHatchet = new InfiToolHatchet(PropsHelperInfi2x2.obsidianHatchetID+3, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "obsidianObsidianHatchet");;
        	boneObsidianHatchet = new InfiToolHatchet(PropsHelperInfi2x2.obsidianHatchetID+4, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Bone, "boneObsidianHatchet");
        	netherrackObsidianHatchet = new InfiToolHatchet(PropsHelperInfi2x2.obsidianHatchetID+5, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Netherrack, "netherrackObsidianHatchet");
        	glowstoneObsidianHatchet = new InfiToolHatchet(PropsHelperInfi2x2.obsidianHatchetID+6, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Glowstone, "glowstoneObsidianHatchet");
        	iceObsidianHatchet = new InfiToolHatchet(PropsHelperInfi2x2.obsidianHatchetID+7, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Ice, "iceObsidianHatchet");
        	lavaObsidianHatchet = new InfiToolHatchet(PropsHelperInfi2x2.obsidianHatchetID+8,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Lava, "lavaObsidianHatchet");
        	cactusObsidianHatchet = new InfiToolHatchet(PropsHelperInfi2x2.obsidianHatchetID+9,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Cactus, "cactusObsidianHatchet");
            
            MinecraftForge.setToolClass(woodObsidianHatchet, "axe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(stoneObsidianHatchet, "axe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneObsidianHatchet, "axe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianObsidianHatchet, "axe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(boneObsidianHatchet, "axe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackObsidianHatchet, "axe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneObsidianHatchet, "axe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(iceObsidianHatchet, "axe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(lavaObsidianHatchet, "axe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(cactusObsidianHatchet, "axe", InfiMaterialEnum.Obsidian.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableSandstoneTools)
        {
        	woodSandstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.sandstoneHatchetID+0, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Wood, "woodSandstoneHatchet");
        	sandstoneSandstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.sandstoneHatchetID+1, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Sandstone, "sandstoneSandstoneHatchet");
        	boneSandstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.sandstoneHatchetID+2, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Bone, "boneSandstoneHatchet");
        	netherrackSandstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.sandstoneHatchetID+3, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Netherrack, "netherrackSandstoneHatchet");
        	iceSandstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.sandstoneHatchetID+4, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Ice, "iceSandstoneHatchet");
        	slimeSandstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.sandstoneHatchetID+5,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Slime, "slimeSandstoneHatchet");
        	cactusSandstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.sandstoneHatchetID+6,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Cactus, "cactusSandstoneHatchet");
        	flintSandstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.sandstoneHatchetID+7,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Flint, "flintSandstoneHatchet");
            
            MinecraftForge.setToolClass(woodSandstoneHatchet, "axe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneSandstoneHatchet, "axe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneSandstoneHatchet, "axe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackSandstoneHatchet, "axe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceSandstoneHatchet, "axe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSandstoneHatchet, "axe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSandstoneHatchet, "axe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(flintSandstoneHatchet, "axe", InfiMaterialEnum.Sandstone.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableBoneTools)
        {
        	woodBoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.boneHatchetID+0, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Wood, "woodBoneHatchet");
        	stoneBoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.boneHatchetID+1, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Stone, "stoneBoneHatchet");
        	sandstoneBoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.boneHatchetID+2, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Sandstone, "sandstoneBoneHatchet");
        	boneBoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.boneHatchetID+3, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Bone, "boneBoneHatchet");
        	paperBoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.boneHatchetID+4, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Paper, "paperBoneHatchet");
        	netherrackBoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.boneHatchetID+5, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Netherrack, "netherrackBoneHatchet");
        	iceBoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.boneHatchetID+6, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Ice, "iceBoneHatchet");
        	cactusBoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.boneHatchetID+7,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Cactus, "cactusBoneHatchet");
        	flintBoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.boneHatchetID+8,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Flint, "flintBoneHatchet");
            
            MinecraftForge.setToolClass(woodBoneHatchet, "axe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneBoneHatchet, "axe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneBoneHatchet, "axe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(boneBoneHatchet, "axe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(paperBoneHatchet, "axe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBoneHatchet, "axe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(iceBoneHatchet, "axe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusBoneHatchet, "axe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(flintBoneHatchet, "axe", InfiMaterialEnum.Bone.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enablePaperTools)
        {
        	woodPaperHatchet = new InfiToolHatchet(PropsHelperInfi2x2.paperHatchetID+0, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Wood, "woodPaperHatchet");
        	bonePaperHatchet = new InfiToolHatchet(PropsHelperInfi2x2.paperHatchetID+1, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Bone, "bonePaperHatchet");
        	paperPaperHatchet = new InfiToolHatchet(PropsHelperInfi2x2.paperHatchetID+2, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "paperPaperHatchet");
        	slimePaperHatchet = new InfiToolHatchet(PropsHelperInfi2x2.paperHatchetID+3,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Slime, "slimePaperHatchet");
        	cactusPaperHatchet = new InfiToolHatchet(PropsHelperInfi2x2.paperHatchetID+4,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Cactus, "cactusPaperHatchet");
            
            MinecraftForge.setToolClass(woodPaperHatchet, "axe", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(bonePaperHatchet, "axe", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(paperPaperHatchet, "axe", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(slimePaperHatchet, "axe", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(cactusPaperHatchet, "axe", InfiMaterialEnum.Paper.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableMossyTools)
        {
        	woodMossyHatchet = new InfiToolHatchet(PropsHelperInfi2x2.mossyHatchetID+0, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Wood, "woodMossyHatchet");
        	stoneMossyHatchet = new InfiToolHatchet(PropsHelperInfi2x2.mossyHatchetID+1, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Stone, "stoneMossyHatchet");
        	diamondMossyHatchet = new InfiToolHatchet(PropsHelperInfi2x2.mossyHatchetID+2, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Diamond, "diamondMossyHatchet");
        	redstoneMossyHatchet = new InfiToolHatchet(PropsHelperInfi2x2.mossyHatchetID+3, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Redstone, "redstoneMossyHatchet");
        	boneMossyHatchet = new InfiToolHatchet(PropsHelperInfi2x2.mossyHatchetID+4, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Bone, "boneMossyHatchet");
        	mossyMossyHatchet = new InfiToolHatchet(PropsHelperInfi2x2.mossyHatchetID+5, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Mossy, "mossyMossyHatchet");
        	netherrackMossyHatchet = new InfiToolHatchet(PropsHelperInfi2x2.mossyHatchetID+6, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Netherrack, "netherrackMossyHatchet");
        	glowstoneMossyHatchet = new InfiToolHatchet(PropsHelperInfi2x2.mossyHatchetID+7, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Glowstone, "glowstoneMossyHatchet");
        	cactusMossyHatchet = new InfiToolHatchet(PropsHelperInfi2x2.mossyHatchetID+8, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Cactus, "cactusMossyHatchet");
        	blazeMossyHatchet = new InfiToolHatchet(PropsHelperInfi2x2.mossyHatchetID+9, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Blaze, "blazeMossyHatchet");
        	manyullynMossyHatchet = new InfiToolHatchet(PropsHelperInfi2x2.mossyHatchetID+10, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Manyullyn, "manyullynMossyHatchet");
        	uraniumMossyHatchet = new InfiToolHatchet(PropsHelperInfi2x2.mossyHatchetID+11, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Uranium, "uraniumMossyHatchet");
            
            MinecraftForge.setToolClass(woodMossyHatchet, "axe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(stoneMossyHatchet, "axe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(diamondMossyHatchet, "axe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneMossyHatchet, "axe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(boneMossyHatchet, "axe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(mossyMossyHatchet, "axe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackMossyHatchet, "axe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneMossyHatchet, "axe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(cactusMossyHatchet, "axe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(blazeMossyHatchet, "axe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynMossyHatchet, "axe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumMossyHatchet, "axe", InfiMaterialEnum.Mossy.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableNetherrackTools)
        {
        	woodNetherrackHatchet = new InfiToolHatchet(PropsHelperInfi2x2.netherrackHatchetID+0, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Wood, "woodNetherrackHatchet");
        	stoneNetherrackHatchet = new InfiToolHatchet(PropsHelperInfi2x2.netherrackHatchetID+1, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Stone, "stoneNetherrackHatchet");
        	sandstoneNetherrackHatchet = new InfiToolHatchet(PropsHelperInfi2x2.netherrackHatchetID+2, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Sandstone, "sandstoneNetherrackHatchet");
        	boneNetherrackHatchet = new InfiToolHatchet(PropsHelperInfi2x2.netherrackHatchetID+3, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bone, "boneNetherrackHatchet");
        	paperNetherrackHatchet = new InfiToolHatchet(PropsHelperInfi2x2.netherrackHatchetID+4, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Paper, "paperNetherrackHatchet");
        	mossyNetherrackHatchet = new InfiToolHatchet(PropsHelperInfi2x2.netherrackHatchetID+5, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Mossy, "mossyNetherrackHatchet");
        	netherrackNetherrackHatchet = new InfiToolHatchet(PropsHelperInfi2x2.netherrackHatchetID+6, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Netherrack, "netherrackNetherrackHatchet");
        	iceNetherrackHatchet = new InfiToolHatchet(PropsHelperInfi2x2.netherrackHatchetID+7, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Ice, "iceNetherrackHatchet");
        	slimeNetherrackHatchet = new InfiToolHatchet(PropsHelperInfi2x2.netherrackHatchetID+8, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Slime, "slimeNetherrackHatchet");
        	cactusNetherrackHatchet = new InfiToolHatchet(PropsHelperInfi2x2.netherrackHatchetID+9, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Cactus, "cactusNetherrackHatchet");
        	flintNetherrackHatchet = new InfiToolHatchet(PropsHelperInfi2x2.netherrackHatchetID+10, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Flint, "flintNetherrackHatchet");
        	copperNetherrackHatchet = new InfiToolHatchet(PropsHelperInfi2x2.netherrackHatchetID+11, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Copper, "copperNetherrackHatchet");
        	bronzeNetherrackHatchet = new InfiToolHatchet(PropsHelperInfi2x2.netherrackHatchetID+12, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bronze, "bronzeNetherrackHatchet");
            
            MinecraftForge.setToolClass(woodNetherrackHatchet, "axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(stoneNetherrackHatchet, "axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneNetherrackHatchet, "axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(boneNetherrackHatchet, "axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(paperNetherrackHatchet, "axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(mossyNetherrackHatchet, "axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackNetherrackHatchet, "axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(iceNetherrackHatchet, "axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(slimeNetherrackHatchet, "axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(cactusNetherrackHatchet, "axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(flintNetherrackHatchet, "axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(copperNetherrackHatchet, "axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeNetherrackHatchet, "axe", InfiMaterialEnum.Netherrack.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableGlowstoneTools)
        {
        	woodGlowstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.glowstoneHatchetID+0, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Wood, "woodGlowstoneHatchet");
        	redstoneGlowstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.glowstoneHatchetID+1, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Redstone, "redstoneGlowstoneHatchet");
        	obsidianGlowstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.glowstoneHatchetID+2, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Obsidian, "obsidianGlowstoneHatchet");
        	boneGlowstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.glowstoneHatchetID+3, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Bone, "boneGlowstoneHatchet");
        	netherrackGlowstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.glowstoneHatchetID+4, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Netherrack, "netherrackGlowstoneHatchet");
        	glowstoneGlowstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.glowstoneHatchetID+5, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Glowstone, "glowstoneGlowstoneHatchet");
        	iceGlowstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.glowstoneHatchetID+6, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Ice, "iceGlowstoneHatchet");
        	slimeGlowstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.glowstoneHatchetID+7, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Slime, "slimeGlowstoneHatchet");
        	cactusGlowstoneHatchet = new InfiToolHatchet(PropsHelperInfi2x2.glowstoneHatchetID+8, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Cactus, "cactusGlowstoneHatchet");
            
            
            MinecraftForge.setToolClass(woodGlowstoneHatchet, "axe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneGlowstoneHatchet, "axe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianGlowstoneHatchet, "axe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneGlowstoneHatchet, "axe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackGlowstoneHatchet, "axe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneGlowstoneHatchet, "axe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceGlowstoneHatchet, "axe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeGlowstoneHatchet, "axe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusGlowstoneHatchet, "axe", InfiMaterialEnum.Glowstone.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableIceTools)
        {
        	woodIceHatchet = new InfiToolHatchet(PropsHelperInfi2x2.iceHatchetID+0, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Wood, "woodIceHatchet");
        	boneIceHatchet = new InfiToolHatchet(PropsHelperInfi2x2.iceHatchetID+1, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Bone, "boneIceHatchet");
        	paperIceHatchet = new InfiToolHatchet(PropsHelperInfi2x2.iceHatchetID+2, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Paper, "paperIceHatchet");
        	iceIceHatchet = new InfiToolHatchet(PropsHelperInfi2x2.iceHatchetID+3, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Ice, "iceIceHatchet");
        	slimeIceHatchet = new InfiToolHatchet(PropsHelperInfi2x2.iceHatchetID+4, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Slime, "slimeIceHatchet");
        	cactusIceHatchet = new InfiToolHatchet(PropsHelperInfi2x2.iceHatchetID+5, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Cactus, "cactusIceHatchet");
            
            
            MinecraftForge.setToolClass(woodIceHatchet, "axe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(boneIceHatchet, "axe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(paperIceHatchet, "axe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(iceIceHatchet, "axe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(slimeIceHatchet, "axe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(cactusIceHatchet, "axe", InfiMaterialEnum.Ice.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableLavaTools)
        {
        	diamondLavaHatchet = new InfiToolHatchet(PropsHelperInfi2x2.lavaHatchetID+0, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Diamond, "diamondLavaHatchet");
        	obsidianLavaHatchet = new InfiToolHatchet(PropsHelperInfi2x2.lavaHatchetID+1, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Obsidian, "obsidianLavaHatchet");
        	netherrackLavaHatchet = new InfiToolHatchet(PropsHelperInfi2x2.lavaHatchetID+2, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Netherrack, "netherrackLavaHatchet");
        	lavaLavaHatchet = new InfiToolHatchet(PropsHelperInfi2x2.lavaHatchetID+3, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Lava, "lavaLavaHatchet");
        	flintLavaHatchet = new InfiToolHatchet(PropsHelperInfi2x2.lavaHatchetID+4, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Flint, "flintLavaHatchet");
        	blazeLavaHatchet = new InfiToolHatchet(PropsHelperInfi2x2.lavaHatchetID+5, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Blaze, "blazeLavaHatchet");
        	manyullynLavaHatchet = new InfiToolHatchet(PropsHelperInfi2x2.lavaHatchetID+6, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Manyullyn, "manyullynLavaHatchet");
            uraniumLavaHatchet = new InfiToolHatchet(PropsHelperInfi2x2.lavaHatchetID+7, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Uranium, "uraniumLavaHatchet");
            
            MinecraftForge.setToolClass(diamondLavaHatchet, "axe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianLavaHatchet, "axe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackLavaHatchet, "axe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(lavaLavaHatchet, "axe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(flintLavaHatchet, "axe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(blazeLavaHatchet, "axe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynLavaHatchet, "axe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumLavaHatchet, "axe", InfiMaterialEnum.Lava.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableSlimeTools)
        {
        	woodSlimeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.slimeHatchetID+0, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Wood, "woodSlimeHatchet");
        	sandstoneSlimeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.slimeHatchetID+1, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Sandstone, "sandstoneSlimeHatchet");
        	boneSlimeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.slimeHatchetID+2, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Bone, "boneSlimeHatchet");
        	paperSlimeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.slimeHatchetID+3, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Paper, "paperSlimeHatchet");
        	slimeSlimeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.slimeHatchetID+4, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Slime, "slimeSlimeHatchet");
        	cactusSlimeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.slimeHatchetID+5, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Cactus, "cactusSlimeHatchet");
            
            MinecraftForge.setToolClass(woodSlimeHatchet, "axe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneSlimeHatchet, "axe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(boneSlimeHatchet, "axe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(paperSlimeHatchet, "axe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSlimeHatchet, "axe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSlimeHatchet, "axe", InfiMaterialEnum.Slime.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableCactusTools)
        {
        	woodCactusHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cactusHatchetID+0, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Wood, "woodCactusHatchet");
        	sandstoneCactusHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cactusHatchetID+1, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Sandstone, "sandstoneCactusHatchet");
        	boneCactusHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cactusHatchetID+2, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Bone, "boneCactusHatchet");
        	netherrackCactusHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cactusHatchetID+3, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Netherrack, "netherrackCactusHatchet");
        	iceCactusHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cactusHatchetID+4, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Ice, "iceCactusHatchet");
        	slimeCactusHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cactusHatchetID+5, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Slime, "slimeCactusHatchet");
        	cactusCactusHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cactusHatchetID+6, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Cactus, "cactusCactusHatchet");
            
            MinecraftForge.setToolClass(woodCactusHatchet, "axe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneCactusHatchet, "axe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(boneCactusHatchet, "axe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackCactusHatchet, "axe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(iceCactusHatchet, "axe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCactusHatchet, "axe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCactusHatchet, "axe", InfiMaterialEnum.Cactus.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableFlintTools)
        {
        	woodFlintHatchet = new InfiToolHatchet(PropsHelperInfi2x2.flintHatchetID+0, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Wood, "woodFlintHatchet");
        	stoneFlintHatchet = new InfiToolHatchet(PropsHelperInfi2x2.flintHatchetID+1, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Stone, "stoneFlintHatchet");
        	sandstoneFlintHatchet = new InfiToolHatchet(PropsHelperInfi2x2.flintHatchetID+2, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Sandstone, "sandstoneFlintHatchet");
        	boneFlintHatchet = new InfiToolHatchet(PropsHelperInfi2x2.flintHatchetID+3, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bone, "boneFlintHatchet");
        	netherrackFlintHatchet = new InfiToolHatchet(PropsHelperInfi2x2.flintHatchetID+4, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Netherrack, "netherrackFlintHatchet");
        	slimeFlintHatchet = new InfiToolHatchet(PropsHelperInfi2x2.flintHatchetID+5, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Slime, "slimeFlintHatchet");
        	cactusFlintHatchet = new InfiToolHatchet(PropsHelperInfi2x2.flintHatchetID+6, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Cactus, "cactusFlintHatchet");
        	flintFlintHatchet = new InfiToolHatchet(PropsHelperInfi2x2.flintHatchetID+7, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Flint, "flintFlintHatchet");
        	copperFlintHatchet = new InfiToolHatchet(PropsHelperInfi2x2.flintHatchetID+8, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Copper, "copperFlintHatchet");
        	bronzeFlintHatchet = new InfiToolHatchet(PropsHelperInfi2x2.flintHatchetID+9, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bronze, "bronzeFlintHatchet");
            
            MinecraftForge.setToolClass(woodFlintHatchet, "axe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(stoneFlintHatchet, "axe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneFlintHatchet, "axe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(boneFlintHatchet, "axe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackFlintHatchet, "axe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(slimeFlintHatchet, "axe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(cactusFlintHatchet, "axe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(flintFlintHatchet, "axe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(copperFlintHatchet, "axe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeFlintHatchet, "axe", InfiMaterialEnum.Flint.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableBlazeTools)
        {
        	diamondBlazeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.blazeHatchetID+0, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Diamond, "diamondBlazeHatchet");
        	obsidianBlazeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.blazeHatchetID+1, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Obsidian, "obsidianBlazeHatchet");
        	netherrackBlazeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.blazeHatchetID+2, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Netherrack, "netherrackBlazeHatchet");
        	lavaBlazeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.blazeHatchetID+3, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Lava, "lavaBlazeHatchet");
        	flintBlazeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.blazeHatchetID+4, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Flint, "flintBlazeHatchet");
        	blazeBlazeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.blazeHatchetID+5, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Blaze, "blazeBlazeHatchet");
        	manyullynBlazeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.blazeHatchetID+6, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Manyullyn, "manyullynBlazeHatchet");
            uraniumBlazeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.blazeHatchetID+7, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Uranium, "uraniumBlazeHatchet");
            
            MinecraftForge.setToolClass(diamondBlazeHatchet, "axe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianBlazeHatchet, "axe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBlazeHatchet, "axe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(blazeBlazeHatchet, "axe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(flintBlazeHatchet, "axe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(blazeBlazeHatchet, "axe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynBlazeHatchet, "axe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumBlazeHatchet, "axe", InfiMaterialEnum.Blaze.getHarvestLevel());
        }
    	
        if(PropsHelperInfi2x2.enableCopperTools)
        {
        	woodCopperHatchet = new InfiToolHatchet(PropsHelperInfi2x2.copperHatchetID+0, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Wood, "woodCopperHatchet");
            stoneCopperHatchet = new InfiToolHatchet(PropsHelperInfi2x2.copperHatchetID+1, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Stone, "stoneCopperHatchet");
            boneCopperHatchet = new InfiToolHatchet(PropsHelperInfi2x2.copperHatchetID+2, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Bone, "boneCopperHatchet");
            netherrackCopperHatchet = new InfiToolHatchet(PropsHelperInfi2x2.copperHatchetID+3, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Netherrack, "netherrackCopperHatchet");
            slimeCopperHatchet = new InfiToolHatchet(PropsHelperInfi2x2.copperHatchetID+4, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Slime, "slimeCopperHatchet");
            cactusCopperHatchet = new InfiToolHatchet(PropsHelperInfi2x2.copperHatchetID+5, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Cactus, "cactusCopperHatchet");
            flintCopperHatchet = new InfiToolHatchet(PropsHelperInfi2x2.copperHatchetID+6, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Flint, "flintCopperHatchet");
            copperCopperHatchet = new InfiToolHatchet(PropsHelperInfi2x2.copperHatchetID+7, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Copper, "copperCopperHatchet");
            
            MinecraftForge.setToolClass(woodCopperHatchet, "axe", InfiMaterialEnum.Copper.getHarvestLevel());
        	MinecraftForge.setToolClass(stoneCopperHatchet, "axe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(boneCopperHatchet, "axe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackCopperHatchet, "axe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCopperHatchet, "axe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCopperHatchet, "axe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(flintCopperHatchet, "axe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(copperCopperHatchet, "axe", InfiMaterialEnum.Copper.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableBronzeTools)
        {
        	woodBronzeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.bronzeHatchetID+0, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Wood, "woodBronzeHatchet");
            stoneBronzeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.bronzeHatchetID+1, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Stone, "stoneBronzeHatchet");
            boneBronzeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.bronzeHatchetID+2, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bone, "boneBronzeHatchet");
            netherrackBronzeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.bronzeHatchetID+3, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Netherrack, "netherrackBronzeHatchet");
            slimeBronzeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.bronzeHatchetID+4, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Slime, "slimeBronzeHatchet");
            cactusBronzeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.bronzeHatchetID+5, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Cactus, "cactusBronzeHatchet");
            flintBronzeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.bronzeHatchetID+6, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Flint, "flintBronzeHatchet");
            copperBronzeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.bronzeHatchetID+7, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Copper, "copperBronzeHatchet");
            bronzeBronzeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.bronzeHatchetID+8, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bronze, "bronzeBronzeHatchet");
            
            MinecraftForge.setToolClass(woodBronzeHatchet, "axe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(stoneBronzeHatchet, "axe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(boneBronzeHatchet, "axe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBronzeHatchet, "axe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(slimeBronzeHatchet, "axe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(cactusBronzeHatchet, "axe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(flintBronzeHatchet, "axe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(copperBronzeHatchet, "axe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeBronzeHatchet, "axe", InfiMaterialEnum.Bronze.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableWorkedIronTools)
        {
        	woodWorkedIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.workedIronHatchetID+0, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Wood, "woodWorkedIronHatchet");
            stoneWorkedIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.workedIronHatchetID+1, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Stone, "stoneWorkedIronHatchet");
            ironWorkedIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.workedIronHatchetID+2,
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Iron, "ironWorkedIronHatchet");
            diamondWorkedIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.workedIronHatchetID+3, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Diamond, "diamondWorkedIronHatchet");
            redstoneWorkedIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.workedIronHatchetID+4, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Redstone, "redstoneWorkedIronHatchet");
            obsidianWorkedIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.workedIronHatchetID+5, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Obsidian, "obsidianWorkedIronHatchet");
            boneWorkedIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.workedIronHatchetID+6, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bone, "boneWorkedIronHatchet");
            netherrackWorkedIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.workedIronHatchetID+7, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Netherrack, "netherrackWorkedIronHatchet");
            glowstoneWorkedIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.workedIronHatchetID+8, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Glowstone, "glowstoneWorkedIronHatchet");
            iceWorkedIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.workedIronHatchetID+9, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Ice, "iceWorkedIronHatchet");
            slimeWorkedIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.workedIronHatchetID+10, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Slime, "slimeWorkedIronHatchet");
            cactusWorkedIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.workedIronHatchetID+11, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Cactus, "cactusWorkedIronHatchet");
            blazeWorkedIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.workedIronHatchetID+12, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Blaze, "blazeWorkedIronHatchet");
            copperWorkedIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.workedIronHatchetID+13, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Copper, "copperWorkedIronHatchet");
            bronzeWorkedIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.workedIronHatchetID+14, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "bronzeWorkedIronHatchet");
            workedWorkedIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.workedIronHatchetID+15, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.WorkedIron, "workedWorkedIronHatchet");
            steelWorkedIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.workedIronHatchetID+16, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Steel, "steelWorkedIronHatchet");
            uraniumWorkedIronHatchet = new InfiToolHatchet(PropsHelperInfi2x2.workedIronHatchetID+17, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Uranium, "uraniumWorkedIronHatchet");
            
            MinecraftForge.setToolClass(woodWorkedIronHatchet, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(stoneWorkedIronHatchet, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(ironWorkedIronHatchet, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(diamondWorkedIronHatchet, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneWorkedIronHatchet, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianWorkedIronHatchet, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(boneWorkedIronHatchet, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackWorkedIronHatchet, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneWorkedIronHatchet, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(iceWorkedIronHatchet, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(slimeWorkedIronHatchet, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(cactusWorkedIronHatchet, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(blazeWorkedIronHatchet, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(copperWorkedIronHatchet, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeWorkedIronHatchet, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(workedWorkedIronHatchet, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(steelWorkedIronHatchet, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumWorkedIronHatchet, "axe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableSteelTools)
        {
        	woodSteelHatchet = new InfiToolHatchet(PropsHelperInfi2x2.steelHatchetID+0, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Wood, "woodSteelHatchet");
            stoneSteelHatchet = new InfiToolHatchet(PropsHelperInfi2x2.steelHatchetID+1, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Stone, "stoneSteelHatchet");
            ironSteelHatchet = new InfiToolHatchet(PropsHelperInfi2x2.steelHatchetID+2, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Iron, "ironSteelHatchet");
            diamondSteelHatchet = new InfiToolHatchet(PropsHelperInfi2x2.steelHatchetID+3, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Diamond, "diamondSteelHatchet");
            redstoneSteelHatchet = new InfiToolHatchet(PropsHelperInfi2x2.steelHatchetID+4, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Redstone, "redstoneSteelHatchet");
            obsidianSteelHatchet = new InfiToolHatchet(PropsHelperInfi2x2.steelHatchetID+5, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Obsidian, "obsidianSteelHatchet");
            boneSteelHatchet = new InfiToolHatchet(PropsHelperInfi2x2.steelHatchetID+6, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bone, "boneSteelHatchet");
            netherrackSteelHatchet = new InfiToolHatchet(PropsHelperInfi2x2.steelHatchetID+7, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Netherrack, "netherrackSteelHatchet");
            glowstoneSteelHatchet = new InfiToolHatchet(PropsHelperInfi2x2.steelHatchetID+8, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Glowstone, "glowstoneSteelHatchet");
            iceSteelHatchet = new InfiToolHatchet(PropsHelperInfi2x2.steelHatchetID+9, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ice, "iceSteelHatchet");
            slimeSteelHatchet = new InfiToolHatchet(PropsHelperInfi2x2.steelHatchetID+10, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Slime, "slimeSteelHatchet");
            cactusSteelHatchet = new InfiToolHatchet(PropsHelperInfi2x2.steelHatchetID+11, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cactus, "cactusSteelHatchet");
            blazeSteelHatchet = new InfiToolHatchet(PropsHelperInfi2x2.steelHatchetID+12, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Blaze, "blazeSteelHatchet");
            copperSteelHatchet = new InfiToolHatchet(PropsHelperInfi2x2.steelHatchetID+13, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Copper, "copperSteelHatchet");
            bronzeSteelHatchet = new InfiToolHatchet(PropsHelperInfi2x2.steelHatchetID+14, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "bronzeSteelHatchet");
            workedSteelHatchet = new InfiToolHatchet(PropsHelperInfi2x2.steelHatchetID+15, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.WorkedIron, "workedSteelHatchet");
            steelSteelHatchet = new InfiToolHatchet(PropsHelperInfi2x2.steelHatchetID+16, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Steel, "steelSteelHatchet");
            cobaltSteelHatchet = new InfiToolHatchet(PropsHelperInfi2x2.steelHatchetID+17, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cobalt, "cobaltSteelHatchet");
            arditeSteelHatchet = new InfiToolHatchet(PropsHelperInfi2x2.steelHatchetID+18, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ardite, "arditeSteelHatchet");
            uraniumSteelHatchet = new InfiToolHatchet(PropsHelperInfi2x2.steelHatchetID+19, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Uranium, "uraniumSteelHatchet");

            MinecraftForge.setToolClass(woodSteelHatchet, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(stoneSteelHatchet, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(ironSteelHatchet, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(diamondSteelHatchet, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneSteelHatchet, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianSteelHatchet, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(boneSteelHatchet, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackSteelHatchet, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneSteelHatchet, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(iceSteelHatchet, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSteelHatchet, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSteelHatchet, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(blazeSteelHatchet, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(copperSteelHatchet, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeSteelHatchet, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(workedSteelHatchet, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(steelSteelHatchet, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltSteelHatchet, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(arditeSteelHatchet, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumSteelHatchet, "axe", InfiMaterialEnum.Steel.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableCobaltTools)
        {
        	woodCobaltHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cobaltHatchetID+0, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Wood, "woodCobaltHatchet");
            stoneCobaltHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cobaltHatchetID+1, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Stone, "stoneCobaltHatchet");
            ironCobaltHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cobaltHatchetID+2, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Iron, "ironCobaltHatchet");
            diamondCobaltHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cobaltHatchetID+3,
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Diamond, "diamondCobaltHatchet");
            redstoneCobaltHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cobaltHatchetID+4, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Redstone, "redstoneCobaltHatchet");
            obsidianCobaltHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cobaltHatchetID+5, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Obsidian, "obsidianCobaltHatchet");
            boneCobaltHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cobaltHatchetID+6, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bone, "boneCobaltHatchet");
            slimeCobaltHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cobaltHatchetID+7, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Slime, "slimeCobaltHatchet");
            cactusCobaltHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cobaltHatchetID+8, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cactus, "cactusCobaltHatchet");
            blazeCobaltHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cobaltHatchetID+9, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Blaze, "blazeCobaltHatchet");
            copperCobaltHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cobaltHatchetID+10, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Copper, "copperCobaltHatchet");
            bronzeCobaltHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cobaltHatchetID+11, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "bronzeCobaltHatchet");
            workedCobaltHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cobaltHatchetID+12, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.WorkedIron, "workedCobaltHatchet");
            steelCobaltHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cobaltHatchetID+13, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Steel, "steelCobaltHatchet");
            cobaltCobaltHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cobaltHatchetID+14, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cobalt, "cobaltCobaltHatchet");
            arditeCobaltHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cobaltHatchetID+15, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Ardite, "arditeCobaltHatchet");
            manyullynCobaltHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cobaltHatchetID+16, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Manyullyn, "manyullynCobaltHatchet");
            uraniumCobaltHatchet = new InfiToolHatchet(PropsHelperInfi2x2.cobaltHatchetID+17, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Uranium, "uraniumCobaltHatchet");
            
            MinecraftForge.setToolClass(woodCobaltHatchet, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(stoneCobaltHatchet, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(ironCobaltHatchet, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(diamondCobaltHatchet, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneCobaltHatchet, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianCobaltHatchet, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(boneCobaltHatchet, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCobaltHatchet, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCobaltHatchet, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(blazeCobaltHatchet, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(copperCobaltHatchet, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeCobaltHatchet, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(workedCobaltHatchet, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(steelCobaltHatchet, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltCobaltHatchet, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(arditeCobaltHatchet, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynCobaltHatchet, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumCobaltHatchet, "axe", InfiMaterialEnum.Cobalt.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableArditeTools)
        {
        	woodArditeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.arditeHatchetID+0, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Wood, "woodArditeHatchet");
            stoneArditeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.arditeHatchetID+1, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Stone, "stoneArditeHatchet");
            ironArditeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.arditeHatchetID+2, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Iron, "ironArditeHatchet");
            diamondArditeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.arditeHatchetID+3,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Diamond, "diamondArditeHatchet");
            redstoneArditeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.arditeHatchetID+4, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Redstone, "redstoneArditeHatchet");
            obsidianArditeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.arditeHatchetID+5, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Obsidian, "obsidianArditeHatchet");
            boneArditeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.arditeHatchetID+6,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bone, "boneArditeHatchet");
            slimeArditeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.arditeHatchetID+7, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Slime, "slimeArditeHatchet");
            cactusArditeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.arditeHatchetID+8, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cactus, "cactusArditeHatchet");
            blazeArditeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.arditeHatchetID+9, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Blaze, "blazeArditeHatchet");
            copperArditeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.arditeHatchetID+10, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Copper, "copperArditeHatchet");
            bronzeArditeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.arditeHatchetID+11, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "bronzeArditeHatchet");
            workedArditeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.arditeHatchetID+12, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.WorkedIron, "workedArditeHatchet");
            steelArditeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.arditeHatchetID+13, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Steel, "steelArditeHatchet");
            cobaltArditeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.arditeHatchetID+14, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cobalt, "cobaltArditeHatchet");
            arditeArditeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.arditeHatchetID+15, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Ardite, "arditeArditeHatchet");
            manyullynArditeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.arditeHatchetID+16, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Manyullyn, "manyullynArditeHatchet");
            uraniumArditeHatchet = new InfiToolHatchet(PropsHelperInfi2x2.arditeHatchetID+17, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Uranium, "uraniumArditeHatchet");
            
            MinecraftForge.setToolClass(woodArditeHatchet, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(stoneArditeHatchet, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(ironArditeHatchet, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(diamondArditeHatchet, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneArditeHatchet, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianArditeHatchet, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(boneArditeHatchet, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(slimeArditeHatchet, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(cactusArditeHatchet, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(blazeArditeHatchet, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(copperArditeHatchet, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeArditeHatchet, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(workedArditeHatchet, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(steelArditeHatchet, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltArditeHatchet, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(arditeArditeHatchet, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynArditeHatchet, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumArditeHatchet, "axe", InfiMaterialEnum.Ardite.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableManyullynTools)
        {
        	woodManyullynHatchet = new InfiToolHatchet(PropsHelperInfi2x2.manyullynHatchetID+0, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Wood, "woodManyullynHatchet");
            stoneManyullynHatchet = new InfiToolHatchet(PropsHelperInfi2x2.manyullynHatchetID+1, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "stoneManyullynHatchet");
            ironManyullynHatchet = new InfiToolHatchet(PropsHelperInfi2x2.manyullynHatchetID+2, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Iron, "ironManyullynHatchet");
            diamondManyullynHatchet = new InfiToolHatchet(PropsHelperInfi2x2.manyullynHatchetID+3,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Diamond, "diamondManyullynHatchet");
            redstoneManyullynHatchet = new InfiToolHatchet(PropsHelperInfi2x2.manyullynHatchetID+4, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Redstone, "redstoneManyullynHatchet");
            obsidianManyullynHatchet = new InfiToolHatchet(PropsHelperInfi2x2.manyullynHatchetID+5, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Obsidian, "obsidianManyullynHatchet");
            boneManyullynHatchet = new InfiToolHatchet(PropsHelperInfi2x2.manyullynHatchetID+6, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bone, "boneManyullynHatchet");
            slimeManyullynHatchet = new InfiToolHatchet(PropsHelperInfi2x2.manyullynHatchetID+7, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Slime, "slimeManyullynHatchet");
            cactusManyullynHatchet = new InfiToolHatchet(PropsHelperInfi2x2.manyullynHatchetID+8, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cactus, "cactusManyullynHatchet");
            blazeManyullynHatchet = new InfiToolHatchet(PropsHelperInfi2x2.manyullynHatchetID+9, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Blaze, "blazeManyullynHatchet");
            copperManyullynHatchet = new InfiToolHatchet(PropsHelperInfi2x2.manyullynHatchetID+10, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Copper, "copperManyullynHatchet");
            bronzeManyullynHatchet = new InfiToolHatchet(PropsHelperInfi2x2.manyullynHatchetID+11, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "bronzeManyullynHatchet");
            workedManyullynHatchet = new InfiToolHatchet(PropsHelperInfi2x2.manyullynHatchetID+12, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.WorkedIron, "workedManyullynHatchet");
            steelManyullynHatchet = new InfiToolHatchet(PropsHelperInfi2x2.manyullynHatchetID+13, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Steel, "steelManyullynHatchet");
            cobaltManyullynHatchet = new InfiToolHatchet(PropsHelperInfi2x2.manyullynHatchetID+14, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cobalt, "cobaltManyullynHatchet");
            arditeManyullynHatchet = new InfiToolHatchet(PropsHelperInfi2x2.manyullynHatchetID+15, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Ardite, "arditeManyullynHatchet");
            manyullynManyullynHatchet = new InfiToolHatchet(PropsHelperInfi2x2.manyullynHatchetID+16, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Manyullyn, "manyullynManyullynHatchet");
            uraniumManyullynHatchet = new InfiToolHatchet(PropsHelperInfi2x2.manyullynHatchetID+17,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Uranium, "uraniumManyullynHatchet");
            
            MinecraftForge.setToolClass(woodManyullynHatchet, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(stoneManyullynHatchet, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(ironManyullynHatchet, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(diamondManyullynHatchet, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneManyullynHatchet, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianManyullynHatchet, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(boneManyullynHatchet, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(slimeManyullynHatchet, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(cactusManyullynHatchet, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(blazeManyullynHatchet, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(copperManyullynHatchet, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeManyullynHatchet, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(workedManyullynHatchet, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(steelManyullynHatchet, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltManyullynHatchet, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(arditeManyullynHatchet, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynManyullynHatchet, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumManyullynHatchet, "axe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableUraniumTools)
        {
            diamondUraniumHatchet = new InfiToolHatchet(PropsHelperInfi2x2.uraniumHatchetID+0, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Diamond, "diamondUraniumHatchet");
            redstoneUraniumHatchet = new InfiToolHatchet(PropsHelperInfi2x2.uraniumHatchetID+1, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Redstone, "redstoneUraniumHatchet");
            boneUraniumHatchet = new InfiToolHatchet(PropsHelperInfi2x2.uraniumHatchetID+2, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Bone, "boneUraniumHatchet");
            netherrackUraniumHatchet = new InfiToolHatchet(PropsHelperInfi2x2.uraniumHatchetID+3, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Netherrack, "netherrackUraniumHatchet");
            glowstoneUraniumHatchet = new InfiToolHatchet(PropsHelperInfi2x2.uraniumHatchetID+4, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Glowstone, "glowstoneUraniumHatchet");
            lavaUraniumHatchet = new InfiToolHatchet(PropsHelperInfi2x2.uraniumHatchetID+5, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Lava, "lavaUraniumHatchet");
            blazeUraniumHatchet = new InfiToolHatchet(PropsHelperInfi2x2.uraniumHatchetID+6, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Blaze, "blazeUraniumHatchet");
            cobaltUraniumHatchet = new InfiToolHatchet(PropsHelperInfi2x2.uraniumHatchetID+7, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Cobalt, "cobaltUraniumHatchet");
            arditeUraniumHatchet = new InfiToolHatchet(PropsHelperInfi2x2.uraniumHatchetID+8, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Ardite, "arditeUraniumHatchet");
            uraniumUraniumHatchet = new InfiToolHatchet(PropsHelperInfi2x2.uraniumHatchetID+9, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Uranium, "uraniumUraniumHatchet");
            
            MinecraftForge.setToolClass(diamondUraniumHatchet, "axe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneUraniumHatchet, "axe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(boneUraniumHatchet, "axe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackUraniumHatchet, "axe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneUraniumHatchet, "axe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(lavaUraniumHatchet, "axe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(blazeUraniumHatchet, "axe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltUraniumHatchet, "axe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(arditeUraniumHatchet, "axe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumUraniumHatchet, "axe", InfiMaterialEnum.Uranium.getHarvestLevel());
        }
    }
    
    private static void addNames()
    {
    	if(PropsHelperInfi2x2.enableWoodTools)
            ModLoader.addName(woodWoodHatchet, "Wooden Hatchet");
        if(PropsHelperInfi2x2.enableStoneTools)
            ModLoader.addName(stoneStoneHatchet, "Heavy Hatchet");
        if(PropsHelperInfi2x2.enableIronTools)
            ModLoader.addName(ironIronHatchet, "Ironic Hatchet");
        if(PropsHelperInfi2x2.enableDiamondTools)
            ModLoader.addName(diamondDiamondHatchet, "Diamondium Hatchet");
        if(PropsHelperInfi2x2.enableRedstoneTools)
            ModLoader.addName(redstoneRedstoneHatchet, "Redredred Hatchet");
        if(PropsHelperInfi2x2.enableObsidianTools)
            ModLoader.addName(obsidianObsidianHatchet, "Ebony Hatchet");
        if(PropsHelperInfi2x2.enableSandstoneTools)
            ModLoader.addName(sandstoneSandstoneHatchet, "Fragile Hatchet");
        if(PropsHelperInfi2x2.enableNetherrackTools)
            ModLoader.addName(boneBoneHatchet, "Necrotic Hatchet");
        if(PropsHelperInfi2x2.enablePaperTools)
            ModLoader.addName(paperPaperHatchet, "Soft Hatchet");
        if(PropsHelperInfi2x2.enableMossyTools)
            ModLoader.addName(mossyMossyHatchet, "Living Hatchet");
        if(PropsHelperInfi2x2.enableNetherrackTools)
            ModLoader.addName(netherrackNetherrackHatchet, "Bloodsoaked Hatchet");
        if(PropsHelperInfi2x2.enableGlowstoneTools)
            ModLoader.addName(glowstoneGlowstoneHatchet, "Bright Hatchet");
        if(PropsHelperInfi2x2.enableIceTools)
            ModLoader.addName(iceIceHatchet, "Freezing Hatchet");
        if(PropsHelperInfi2x2.enableLavaTools)
            ModLoader.addName(lavaLavaHatchet, "Burning Hatchet");
        if(PropsHelperInfi2x2.enableSlimeTools)
            ModLoader.addName(slimeSlimeHatchet, "Toy Hatchet");
        if(PropsHelperInfi2x2.enableCactusTools)
            ModLoader.addName(cactusCactusHatchet, "Thorned Hatchet");
        if(PropsHelperInfi2x2.enableFlintTools)
            ModLoader.addName(flintFlintHatchet, "Rough-hewn Hatchet");
        if(PropsHelperInfi2x2.enableBlazeTools)
            ModLoader.addName(blazeBlazeHatchet, "Netherite Hatchet");
        if(PropsHelperInfi2x2.enableCopperTools)
            ModLoader.addName(copperCopperHatchet, "Orange-Tang Hatchet");
        if(PropsHelperInfi2x2.enableBronzeTools)
            ModLoader.addName(bronzeBronzeHatchet, "Polished Hatchet");
        if(PropsHelperInfi2x2.enableWorkedIronTools)
            ModLoader.addName(workedWorkedIronHatchet, "Reworked Iron Hatchet");
        if(PropsHelperInfi2x2.enableSteelTools)
            ModLoader.addName(steelSteelHatchet, "Forge-Wrought Hatchet");
        if(PropsHelperInfi2x2.enableCobaltTools)
            ModLoader.addName(cobaltCobaltHatchet, "Beautiful Hatchet");
        if(PropsHelperInfi2x2.enableArditeTools)
            ModLoader.addName(arditeArditeHatchet, "Rustic Hatchet");
        if(PropsHelperInfi2x2.enableManyullynTools)
            ModLoader.addName(manyullynManyullynHatchet, "False-Prophetic Hatchet");
        if(PropsHelperInfi2x2.enableUraniumTools)
            ModLoader.addName(uraniumUraniumHatchet, "Cancerous Hatchet");
    }
    
    public static void registerInfiToolsRecipes()
    {
    	if(PropsHelperInfi2x2.enableWoodTools)
        {
            ModLoader.addRecipe(new ItemStack(woodWoodHatchet), new Object[] 
                    { recipe, '#', Block.planks, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneWoodHatchet), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneWoodHatchet), new Object[] 
                    { recipe, '#', Block.planks, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneWoodHatchet), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(paperWoodHatchet), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.paperRod });
            ModLoader.addRecipe(new ItemStack(iceWoodHatchet), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeWoodHatchet), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusWoodHatchet), new Object[] 
                    { recipe, '#', Block.planks, '|', InfiLibrary.cactusRod });
        }
    	
        if(PropsHelperInfi2x2.enableStoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodStoneHatchet), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneStoneHatchet), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneStoneHatchet), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneStoneHatchet), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneStoneHatchet), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackStoneHatchet), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceStoneHatchet), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeStoneHatchet), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusStoneHatchet), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintStoneHatchet), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', InfiLibrary.flintRod });
            
            ModLoader.addRecipe(new ItemStack(woodStoneHatchet), new Object[] 
                    { recipe, '#', Block.stone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneStoneHatchet), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneStoneHatchet), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneStoneHatchet), new Object[] 
                    { recipe, '#', Block.stone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneStoneHatchet), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackStoneHatchet), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceStoneHatchet), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeStoneHatchet), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusStoneHatchet), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintStoneHatchet), new Object[] 
                    { recipe, '#', Block.stone, '|', InfiLibrary.flintRod });
        }
        
        if(PropsHelperInfi2x2.enableIronTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodIronHatchet), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneIronHatchet), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironIronHatchet), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.ironRod });
            ModLoader.addRecipe(new ItemStack(boneIronHatchet), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneIronHatchet), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackIronHatchet), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneIronHatchet), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(cactusIronHatchet), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(copperIronHatchet), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeIronHatchet), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', InfiLibrary.bronzeRod });
        }
        
        if(PropsHelperInfi2x2.enableDiamondTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodDiamondHatchet), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneDiamondHatchet), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironDiamondHatchet), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.ironRod });
            ModLoader.addRecipe(new ItemStack(diamondDiamondHatchet), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.diamondRod });
            ModLoader.addRecipe(new ItemStack(redstoneDiamondHatchet), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianDiamondHatchet), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneDiamondHatchet), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneDiamondHatchet), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(mossyDiamondHatchet), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackDiamondHatchet), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneDiamondHatchet), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(lavaDiamondHatchet), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.lavaRod });
            ModLoader.addRecipe(new ItemStack(cactusDiamondHatchet), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintDiamondHatchet), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeDiamondHatchet), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(copperDiamondHatchet), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeDiamondHatchet), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedDiamondHatchet), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.workedIronRod });
            ModLoader.addRecipe(new ItemStack(steelDiamondHatchet), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.steelRod });
            ModLoader.addRecipe(new ItemStack(cobaltDiamondHatchet), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.cobaltRod });
            ModLoader.addRecipe(new ItemStack(arditeDiamondHatchet), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.arditeRod });
            ModLoader.addRecipe(new ItemStack(manyullynDiamondHatchet), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumDiamondHatchet), new Object[] 
                    { recipe, '#', Item.diamond, '|', InfiLibrary.uraniumRod });
        }
        
        if(PropsHelperInfi2x2.enableRedstoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodRedstoneHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneRedstoneHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironRedstoneHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.ironRod });
            ModLoader.addRecipe(new ItemStack(redstoneRedstoneHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianRedstoneHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.obsidianRod });
            ModLoader.addRecipe(new ItemStack(sandstoneRedstoneHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneRedstoneHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneRedstoneHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(paperRedstoneHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.paperRod });
            ModLoader.addRecipe(new ItemStack(mossyRedstoneHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackRedstoneHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneRedstoneHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(iceRedstoneHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(lavaRedstoneHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.lavaRod });
            ModLoader.addRecipe(new ItemStack(slimeRedstoneHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusRedstoneHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintRedstoneHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.flintRod });
            ModLoader.addRecipe(new ItemStack(copperRedstoneHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeRedstoneHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedRedstoneHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.workedIronRod });
            ModLoader.addRecipe(new ItemStack(uraniumRedstoneHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.redstoneCrystal, '|', InfiLibrary.uraniumRod });
        }
        
        if(PropsHelperInfi2x2.enableObsidianTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodObsidianHatchet), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneObsidianHatchet), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(redstoneObsidianHatchet), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianObsidianHatchet), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneObsidianHatchet), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneObsidianHatchet), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackObsidianHatchet), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneObsidianHatchet), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(iceObsidianHatchet), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(lavaObsidianHatchet), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.lavaRod });
            ModLoader.addRecipe(new ItemStack(cactusObsidianHatchet), new Object[] 
                    { recipe, '#', Block.obsidian, '|', InfiLibrary.cactusRod });
        }
        
        if(PropsHelperInfi2x2.enableSandstoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSandstoneHatchet), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneSandstoneHatchet), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneSandstoneHatchet), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneSandstoneHatchet), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.boneRod });      
            ModLoader.addRecipe(new ItemStack(netherrackSandstoneHatchet), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceSandstoneHatchet), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeSandstoneHatchet), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusSandstoneHatchet), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintSandstoneHatchet), new Object[] 
                    { recipe, '#', Block.sandStone, '|', InfiLibrary.flintRod });
        }
        
        if(PropsHelperInfi2x2.enableBoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodBoneHatchet), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(stoneBoneHatchet), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneBoneHatchet), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneBoneHatchet), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneBoneHatchet), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(paperBoneHatchet), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.paperRod });
            ModLoader.addRecipe(new ItemStack(netherrackBoneHatchet), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceBoneHatchet), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(cactusBoneHatchet), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintBoneHatchet), new Object[] 
                    { recipe, '#', Item.bone, '|', InfiLibrary.flintRod });
        }
        
        if(PropsHelperInfi2x2.enablePaperTools)
        {
            ModLoader.addRecipe(new ItemStack(woodPaperHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(bonePaperHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(bonePaperHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(paperPaperHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.paperRod });
            ModLoader.addRecipe(new ItemStack(slimePaperHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusPaperHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.paperStack, '|', InfiLibrary.cactusRod });
        }
        
        if(PropsHelperInfi2x2.enableMossyTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodMossyHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneMossyHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(diamondMossyHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.diamondRod });
            ModLoader.addRecipe(new ItemStack(redstoneMossyHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.redstoneRod });
            ModLoader.addRecipe(new ItemStack(boneMossyHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneMossyHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(mossyMossyHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackMossyHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneMossyHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(cactusMossyHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(blazeMossyHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynMossyHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumMossyHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.mossyStone, '|', InfiLibrary.uraniumRod });
        }
        
        if(PropsHelperInfi2x2.enableNetherrackTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodNetherrackHatchet), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneNetherrackHatchet), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneNetherrackHatchet), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneNetherrackHatchet), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneNetherrackHatchet), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(paperNetherrackHatchet), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.paperRod });
            ModLoader.addRecipe(new ItemStack(mossyNetherrackHatchet), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackNetherrackHatchet), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceNetherrackHatchet), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeNetherrackHatchet), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusNetherrackHatchet), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintNetherrackHatchet), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.flintRod });
            ModLoader.addRecipe(new ItemStack(copperNetherrackHatchet), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeNetherrackHatchet), new Object[] 
                    { recipe, '#', Block.netherrack, '|', InfiLibrary.bronzeRod });
        }
        
        if(PropsHelperInfi2x2.enableGlowstoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodGlowstoneHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(redstoneGlowstoneHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.redstoneRod });
        	ModLoader.addRecipe(new ItemStack(obsidianGlowstoneHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneGlowstoneHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneGlowstoneHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackGlowstoneHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneGlowstoneHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(iceGlowstoneHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeGlowstoneHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusGlowstoneHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.glowstoneCrystal, '|', InfiLibrary.cactusRod });
        }
        
        if(PropsHelperInfi2x2.enableIceTools)
        {
            ModLoader.addRecipe(new ItemStack(woodIceHatchet), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(boneIceHatchet), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneIceHatchet), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(paperIceHatchet), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.paperRod });
            ModLoader.addRecipe(new ItemStack(iceIceHatchet), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeIceHatchet), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusIceHatchet), new Object[] 
                    { recipe, '#', Block.ice, '|', InfiLibrary.cactusRod });
        }
        
        if(PropsHelperInfi2x2.enableLavaTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondLavaHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.diamondRod });
            ModLoader.addRecipe(new ItemStack(obsidianLavaHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.obsidianRod });
            ModLoader.addRecipe(new ItemStack(netherrackLavaHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(lavaLavaHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.lavaRod });
            ModLoader.addRecipe(new ItemStack(flintLavaHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeLavaHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynLavaHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumLavaHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.lavaCrystal, '|', InfiLibrary.uraniumRod });
        }
        
        if(PropsHelperInfi2x2.enableSlimeTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSlimeHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneSlimeHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneSlimeHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneSlimeHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(paperSlimeHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.paperRod });
            ModLoader.addRecipe(new ItemStack(slimeSlimeHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusSlimeHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.slimeCrystal, '|', InfiLibrary.cactusRod });
        }
        
        if(PropsHelperInfi2x2.enableCactusTools)
        {
            ModLoader.addRecipe(new ItemStack(woodCactusHatchet), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneCactusHatchet), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneCactusHatchet), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneCactusHatchet), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackCactusHatchet), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceCactusHatchet), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeCactusHatchet), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusCactusHatchet), new Object[] 
                    { recipe, '#', Block.cactus, '|', InfiLibrary.cactusRod });
        }
        
        if(PropsHelperInfi2x2.enableFlintTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodFlintHatchet), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneFlintHatchet), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneFlintHatchet), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneFlintHatchet), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneFlintHatchet), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackFlintHatchet), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(slimeFlintHatchet), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusFlintHatchet), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintFlintHatchet), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.flintRod });
            ModLoader.addRecipe(new ItemStack(copperFlintHatchet), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeFlintHatchet), new Object[] 
                    { recipe, '#', Item.flint, '|', InfiLibrary.bronzeRod });
        }
        
        if(PropsHelperInfi2x2.enableBlazeTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondBlazeHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.diamondRod });
            ModLoader.addRecipe(new ItemStack(obsidianBlazeHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.obsidianRod });
            ModLoader.addRecipe(new ItemStack(netherrackBlazeHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.netherrackRod });
            ModLoader.addRecipe(new ItemStack(lavaBlazeHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.lavaRod });
            ModLoader.addRecipe(new ItemStack(flintBlazeHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeBlazeHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynBlazeHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumBlazeHatchet), new Object[] 
                    { recipe, '#', InfiLibrary.blazeCrystal, '|', InfiLibrary.uraniumRod });
        }
    }
    
    public static void addStoneTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodStoneHatchet), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
    	ModLoader.addRecipe(new ItemStack(stoneStoneHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod });
        ModLoader.addRecipe(new ItemStack(sandstoneStoneHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.sandstoneRod });
        ModLoader.addRecipe(new ItemStack(boneStoneHatchet), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneStoneHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackStoneHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.netherrackRod });
        ModLoader.addRecipe(new ItemStack(iceStoneHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeStoneHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusStoneHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintStoneHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.flintRod });
    }
    
    public static void addCopperTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodCopperHatchet), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneCopperHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneCopperHatchet), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCopperHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackCopperHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeCopperHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCopperHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintCopperHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.flintRod });
        ModLoader.addRecipe(new ItemStack(copperCopperHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.copperRod });
    }
    
    public static void addBronzeTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodBronzeHatchet), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneBronzeHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneBronzeHatchet), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneBronzeHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackBronzeHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeBronzeHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusBronzeHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintBronzeHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.flintRod });
        ModLoader.addRecipe(new ItemStack(copperBronzeHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeBronzeHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.bronzeRod });
    }
    
    public static void addWorkedIronTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodWorkedIronHatchet), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneWorkedIronHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironWorkedIronHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondWorkedIronHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneWorkedIronHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianWorkedIronHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronHatchet), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackWorkedIronHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneWorkedIronHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceWorkedIronHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeWorkedIronHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusWorkedIronHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeWorkedIronHatchet), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperWorkedIronHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeWorkedIronHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedWorkedIronHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelWorkedIronHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.steelRod });
        ModLoader.addRecipe(new ItemStack(uraniumWorkedIronHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.uraniumRod });
    }
    
    public static void addSteelTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodSteelHatchet), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneSteelHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironSteelHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondSteelHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneSteelHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianSteelHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneSteelHatchet), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneSteelHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackSteelHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneSteelHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceSteelHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeSteelHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusSteelHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeSteelHatchet), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperSteelHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeSteelHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedSteelHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelSteelHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltSteelHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeSteelHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumSteelHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.uraniumRod });
    }
    
    public static void addCobaltTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodCobaltHatchet), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneCobaltHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironCobaltHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondCobaltHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneCobaltHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianCobaltHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneCobaltHatchet), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCobaltHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeCobaltHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCobaltHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeCobaltHatchet), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperCobaltHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeCobaltHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedCobaltHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelCobaltHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltCobaltHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeCobaltHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynCobaltHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumCobaltHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.uraniumRod });
    }
    
    public static void addArditeTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodArditeHatchet), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneArditeHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironArditeHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondArditeHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneArditeHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianArditeHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneArditeHatchet), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneArditeHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeArditeHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusArditeHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeArditeHatchet), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperArditeHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeArditeHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedArditeHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelArditeHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltArditeHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeArditeHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynArditeHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumArditeHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.uraniumRod });
    }
    
    public static void addManyullynTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodManyullynHatchet), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneManyullynHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironManyullynHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondManyullynHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneManyullynHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianManyullynHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneManyullynHatchet), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneManyullynHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeManyullynHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusManyullynHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeManyullynHatchet), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperManyullynHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeManyullynHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedManyullynHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelManyullynHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltManyullynHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeManyullynHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynManyullynHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumManyullynHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.uraniumRod });
    }
    
    public static void addUraniumTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(diamondUraniumHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneUraniumHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.redstoneRod });
        ModLoader.addRecipe(new ItemStack(boneUraniumHatchet), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneUraniumHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackUraniumHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneUraniumHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(lavaUraniumHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.lavaRod });
        ModLoader.addRecipe(new ItemStack(blazeUraniumHatchet), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(cobaltUraniumHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeUraniumHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumUraniumHatchet), new Object[] 
                { recipe, '#', stack, '|', InfiLibrary.uraniumRod });
    }
    
	public static Item woodWoodHatchet;
	public static Item sandstoneWoodHatchet;
	public static Item boneWoodHatchet;
	public static Item paperWoodHatchet;
	public static Item iceWoodHatchet;
	public static Item slimeWoodHatchet;
	public static Item cactusWoodHatchet;
	
	public static Item woodStoneHatchet;
	public static Item stoneStoneHatchet;
	public static Item sandstoneStoneHatchet;
	public static Item boneStoneHatchet;
	public static Item netherrackStoneHatchet;
	public static Item iceStoneHatchet;
	public static Item slimeStoneHatchet;
	public static Item cactusStoneHatchet;
	public static Item flintStoneHatchet;
	
	public static Item woodIronHatchet;
	public static Item stoneIronHatchet;
	public static Item ironIronHatchet;
	public static Item boneIronHatchet;
	public static Item netherrackIronHatchet;
	public static Item glowstoneIronHatchet;
	public static Item cactusIronHatchet;
	public static Item copperIronHatchet;
	public static Item bronzeIronHatchet;
	
	public static Item woodDiamondHatchet;
	public static Item stoneDiamondHatchet;
	public static Item ironDiamondHatchet;
	public static Item diamondDiamondHatchet;
	public static Item redstoneDiamondHatchet;
	public static Item obsidianDiamondHatchet;
	public static Item boneDiamondHatchet;
	public static Item mossyDiamondHatchet;
	public static Item netherrackDiamondHatchet;
	public static Item glowstoneDiamondHatchet;
	public static Item lavaDiamondHatchet;
	public static Item cactusDiamondHatchet;
	public static Item flintDiamondHatchet;
	public static Item blazeDiamondHatchet;
	public static Item copperDiamondHatchet;
	public static Item bronzeDiamondHatchet;
	public static Item workedDiamondHatchet;
	public static Item steelDiamondHatchet;
	public static Item cobaltDiamondHatchet;
	public static Item arditeDiamondHatchet;
	public static Item manyullynDiamondHatchet;
	public static Item uraniumDiamondHatchet;
	
	public static Item woodRedstoneHatchet;
	public static Item stoneRedstoneHatchet;
	public static Item ironRedstoneHatchet;
	public static Item redstoneRedstoneHatchet;
	public static Item obsidianRedstoneHatchet;
	public static Item sandstoneRedstoneHatchet;
	public static Item boneRedstoneHatchet;
	public static Item paperRedstoneHatchet;
	public static Item mossyRedstoneHatchet;
	public static Item netherrackRedstoneHatchet;
	public static Item glowstoneRedstoneHatchet;
	public static Item iceRedstoneHatchet;
	public static Item lavaRedstoneHatchet;
	public static Item slimeRedstoneHatchet;
	public static Item cactusRedstoneHatchet;
	public static Item flintRedstoneHatchet;
	public static Item copperRedstoneHatchet;
	public static Item bronzeRedstoneHatchet;
	public static Item workedRedstoneHatchet;
	public static Item uraniumRedstoneHatchet;
	
	public static Item woodObsidianHatchet;
	public static Item stoneObsidianHatchet;
	public static Item redstoneObsidianHatchet;
	public static Item obsidianObsidianHatchet;
	public static Item boneObsidianHatchet;
	public static Item netherrackObsidianHatchet;
	public static Item glowstoneObsidianHatchet;
	public static Item iceObsidianHatchet;
	public static Item lavaObsidianHatchet;
	public static Item cactusObsidianHatchet;
	
	public static Item woodSandstoneHatchet;
	public static Item sandstoneSandstoneHatchet;
	public static Item boneSandstoneHatchet;
	public static Item netherrackSandstoneHatchet;
	public static Item iceSandstoneHatchet;
	public static Item slimeSandstoneHatchet;
	public static Item cactusSandstoneHatchet;
	public static Item flintSandstoneHatchet;
	
	public static Item woodBoneHatchet;
	public static Item stoneBoneHatchet;
	public static Item sandstoneBoneHatchet;
	public static Item boneBoneHatchet;
	public static Item paperBoneHatchet;
	public static Item netherrackBoneHatchet;
	public static Item iceBoneHatchet;
	public static Item cactusBoneHatchet;
	public static Item flintBoneHatchet;
	
	public static Item woodPaperHatchet;
	public static Item bonePaperHatchet;
	public static Item paperPaperHatchet;
	public static Item slimePaperHatchet;
	public static Item cactusPaperHatchet;
	
	public static Item woodMossyHatchet;
	public static Item stoneMossyHatchet;
	public static Item diamondMossyHatchet;
	public static Item redstoneMossyHatchet;
	public static Item boneMossyHatchet;
	public static Item mossyMossyHatchet;
	public static Item netherrackMossyHatchet;
	public static Item glowstoneMossyHatchet;
	public static Item cactusMossyHatchet;
	public static Item blazeMossyHatchet;
	public static Item manyullynMossyHatchet;
	public static Item uraniumMossyHatchet;
	
	public static Item woodNetherrackHatchet;
	public static Item stoneNetherrackHatchet;
	public static Item sandstoneNetherrackHatchet;
	public static Item boneNetherrackHatchet;
	public static Item paperNetherrackHatchet;
	public static Item mossyNetherrackHatchet;
	public static Item netherrackNetherrackHatchet;
	public static Item iceNetherrackHatchet;
	public static Item slimeNetherrackHatchet;
	public static Item cactusNetherrackHatchet;
	public static Item flintNetherrackHatchet;
	public static Item copperNetherrackHatchet;
	public static Item bronzeNetherrackHatchet;
	
	public static Item woodGlowstoneHatchet;
	public static Item redstoneGlowstoneHatchet;
	public static Item obsidianGlowstoneHatchet;
	public static Item boneGlowstoneHatchet;
	public static Item netherrackGlowstoneHatchet;
	public static Item glowstoneGlowstoneHatchet;
	public static Item iceGlowstoneHatchet;
	public static Item slimeGlowstoneHatchet;
	public static Item cactusGlowstoneHatchet;
	
	public static Item woodIceHatchet;
	public static Item boneIceHatchet;
	public static Item paperIceHatchet;
	public static Item iceIceHatchet;
	public static Item slimeIceHatchet;
	public static Item cactusIceHatchet;
	
	public static Item diamondLavaHatchet;
	public static Item obsidianLavaHatchet;
	public static Item netherrackLavaHatchet;
	public static Item lavaLavaHatchet;
	public static Item flintLavaHatchet;
	public static Item blazeLavaHatchet;
	public static Item manyullynLavaHatchet;
	public static Item uraniumLavaHatchet;
	
	public static Item woodSlimeHatchet;
	public static Item sandstoneSlimeHatchet;
	public static Item boneSlimeHatchet;
	public static Item paperSlimeHatchet;
	public static Item slimeSlimeHatchet;
	public static Item cactusSlimeHatchet;
	
	public static Item woodCactusHatchet;
	public static Item sandstoneCactusHatchet;
	public static Item boneCactusHatchet;
	public static Item netherrackCactusHatchet;
	public static Item iceCactusHatchet;
	public static Item slimeCactusHatchet;
	public static Item cactusCactusHatchet;
	
	public static Item woodFlintHatchet;
	public static Item stoneFlintHatchet;
	public static Item sandstoneFlintHatchet;
	public static Item boneFlintHatchet;
	public static Item netherrackFlintHatchet;
	public static Item slimeFlintHatchet;
	public static Item cactusFlintHatchet;
	public static Item flintFlintHatchet;
	public static Item copperFlintHatchet;
	public static Item bronzeFlintHatchet;
	
	public static Item diamondBlazeHatchet;
	public static Item obsidianBlazeHatchet;
	public static Item netherrackBlazeHatchet;
	public static Item lavaBlazeHatchet;
	public static Item flintBlazeHatchet;
	public static Item blazeBlazeHatchet;
	public static Item manyullynBlazeHatchet;
	public static Item uraniumBlazeHatchet;
	
	public static Item woodCopperHatchet;
	public static Item stoneCopperHatchet;
    public static Item boneCopperHatchet;
    public static Item netherrackCopperHatchet;
    public static Item slimeCopperHatchet;
    public static Item cactusCopperHatchet;
    public static Item flintCopperHatchet;
    public static Item copperCopperHatchet;
    
    public static Item woodBronzeHatchet;
    public static Item stoneBronzeHatchet;
    public static Item boneBronzeHatchet;
    public static Item netherrackBronzeHatchet;
    public static Item slimeBronzeHatchet;
    public static Item cactusBronzeHatchet;
    public static Item flintBronzeHatchet;
    public static Item copperBronzeHatchet;
    public static Item bronzeBronzeHatchet;
    
    public static Item woodWorkedIronHatchet;
    public static Item stoneWorkedIronHatchet;
    public static Item ironWorkedIronHatchet;
    public static Item diamondWorkedIronHatchet;
    public static Item redstoneWorkedIronHatchet;
    public static Item obsidianWorkedIronHatchet;
    public static Item boneWorkedIronHatchet;
    public static Item netherrackWorkedIronHatchet;
    public static Item glowstoneWorkedIronHatchet;
    public static Item iceWorkedIronHatchet;
    public static Item slimeWorkedIronHatchet;
    public static Item cactusWorkedIronHatchet;
    public static Item blazeWorkedIronHatchet;
    public static Item copperWorkedIronHatchet;
    public static Item bronzeWorkedIronHatchet;
    public static Item workedWorkedIronHatchet;
    public static Item steelWorkedIronHatchet;
    public static Item uraniumWorkedIronHatchet;
    
    public static Item woodSteelHatchet;
    public static Item stoneSteelHatchet;
    public static Item ironSteelHatchet;
    public static Item diamondSteelHatchet;
    public static Item redstoneSteelHatchet;
    public static Item obsidianSteelHatchet;
    public static Item boneSteelHatchet;
    public static Item netherrackSteelHatchet;
    public static Item glowstoneSteelHatchet;
    public static Item iceSteelHatchet;
    public static Item slimeSteelHatchet;
    public static Item cactusSteelHatchet;
    public static Item blazeSteelHatchet;
    public static Item copperSteelHatchet;
    public static Item bronzeSteelHatchet;
    public static Item workedSteelHatchet;
    public static Item steelSteelHatchet;
    public static Item cobaltSteelHatchet;
    public static Item arditeSteelHatchet;
    public static Item uraniumSteelHatchet;
    
    public static Item woodCobaltHatchet;
    public static Item stoneCobaltHatchet;
    public static Item ironCobaltHatchet;
    public static Item diamondCobaltHatchet;
    public static Item redstoneCobaltHatchet;
    public static Item obsidianCobaltHatchet;
    public static Item boneCobaltHatchet;
    public static Item slimeCobaltHatchet;
    public static Item cactusCobaltHatchet;
    public static Item blazeCobaltHatchet;
    public static Item copperCobaltHatchet;
    public static Item bronzeCobaltHatchet;
    public static Item workedCobaltHatchet;
    public static Item steelCobaltHatchet;
    public static Item cobaltCobaltHatchet;
    public static Item arditeCobaltHatchet;
    public static Item manyullynCobaltHatchet;
    public static Item uraniumCobaltHatchet;
    
    public static Item woodArditeHatchet;
    public static Item stoneArditeHatchet;
    public static Item ironArditeHatchet;
    public static Item diamondArditeHatchet;
    public static Item redstoneArditeHatchet;
    public static Item obsidianArditeHatchet;
    public static Item boneArditeHatchet;
    public static Item slimeArditeHatchet;
    public static Item cactusArditeHatchet;
    public static Item blazeArditeHatchet;
    public static Item copperArditeHatchet;
    public static Item bronzeArditeHatchet;
    public static Item workedArditeHatchet;
    public static Item steelArditeHatchet;
    public static Item cobaltArditeHatchet;
    public static Item arditeArditeHatchet;
    public static Item manyullynArditeHatchet;
    public static Item uraniumArditeHatchet;
    
    public static Item woodManyullynHatchet;
    public static Item stoneManyullynHatchet;
    public static Item ironManyullynHatchet;
    public static Item diamondManyullynHatchet;
    public static Item redstoneManyullynHatchet;
    public static Item obsidianManyullynHatchet;
    public static Item boneManyullynHatchet;
    public static Item slimeManyullynHatchet;
    public static Item cactusManyullynHatchet;
    public static Item blazeManyullynHatchet;
    public static Item copperManyullynHatchet;
    public static Item bronzeManyullynHatchet;
    public static Item workedManyullynHatchet;
    public static Item steelManyullynHatchet;
    public static Item cobaltManyullynHatchet;
    public static Item arditeManyullynHatchet;
    public static Item manyullynManyullynHatchet;
    public static Item uraniumManyullynHatchet;
    
    public static Item diamondUraniumHatchet;
    public static Item redstoneUraniumHatchet;
    public static Item boneUraniumHatchet;
    public static Item netherrackUraniumHatchet;
    public static Item glowstoneUraniumHatchet;
    public static Item lavaUraniumHatchet;
    public static Item blazeUraniumHatchet;
    public static Item cobaltUraniumHatchet;
    public static Item arditeUraniumHatchet;
    public static Item uraniumUraniumHatchet;
}
