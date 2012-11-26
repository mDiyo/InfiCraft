package mDiyo.inficraft.infitools.twoxtwo;
import mDiyo.inficraft.infitools.base.InfiMaterialEnum;
import mDiyo.inficraft.infitools.base.mod_InfiBase;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraftforge.common.MinecraftForge;

public class Handpicks 
{
    public static Handpicks instance = new Handpicks();
    
    private static String[] recipe = { "##", "#|" };
    
    public static Handpicks getInstance()
    {
        return instance;
    }

    public static void init()
    {
        if(mod_Infi2x2.infitoolsPresent)
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
    	woodWoodHandpick = new InfiToolHandpick(PropsHelperInfi2x2.woodHandpickID+0, 
                InfiMaterialEnum.Wood, InfiMaterialEnum.Wood, "woodWoodHandpick");
    	woodStoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.stoneHandpickID+0, 
                InfiMaterialEnum.Stone, InfiMaterialEnum.Wood, "woodStoneHandpick");
    	woodIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.ironHandpickID+0, 
                InfiMaterialEnum.Iron, InfiMaterialEnum.Wood, "woodIronHandpick");
    	woodDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID+0, 
                InfiMaterialEnum.Diamond, InfiMaterialEnum.Wood, "woodDiamondHandpick");
    	
    	ModLoader.addName(woodWoodHandpick, "Wooden Handpick");
    }
    
    private static void registerVanillaRecipes()
    {
    	ModLoader.addRecipe(new ItemStack(woodWoodHandpick), new Object[] 
                { recipe, '#', Block.planks, '|', Item.stick, });
		ModLoader.addRecipe(new ItemStack(woodStoneHandpick), new Object[] 
                { recipe, '#', Block.cobblestone, '|', Item.stick, });
		ModLoader.addRecipe(new ItemStack(woodIronHandpick), new Object[] 
                { recipe, '#', Item.ingotIron, '|', Item.stick, });
		ModLoader.addRecipe(new ItemStack(woodDiamondHandpick), new Object[] 
                { recipe, '#', Item.diamond, '|', Item.stick, });
		
		MinecraftForge.setToolClass(woodWoodHandpick, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
    	MinecraftForge.setToolClass(woodStoneHandpick, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
    	MinecraftForge.setToolClass(woodIronHandpick, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
    	MinecraftForge.setToolClass(woodDiamondHandpick, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
    }
    
    private static void createTools()
    {
    	if(PropsHelperInfi2x2.enableWoodTools)
    	{
    		woodWoodHandpick = new InfiToolHandpick(PropsHelperInfi2x2.woodHandpickID+0, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Wood, "woodWoodHandpick");
    		sandstoneWoodHandpick = new InfiToolHandpick(PropsHelperInfi2x2.woodHandpickID+1, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Sandstone, "sandstoneWoodHandpick");
    		boneWoodHandpick = new InfiToolHandpick(PropsHelperInfi2x2.woodHandpickID+2, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Bone, "boneWoodHandpick");
    		paperWoodHandpick = new InfiToolHandpick(PropsHelperInfi2x2.woodHandpickID+3, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Paper, "paperWoodHandpick");
    		iceWoodHandpick = new InfiToolHandpick(PropsHelperInfi2x2.woodHandpickID+4, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Ice, "iceWoodHandpick");
    		slimeWoodHandpick = new InfiToolHandpick(PropsHelperInfi2x2.woodHandpickID+5, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Slime, "slimeWoodHandpick");
    		cactusWoodHandpick = new InfiToolHandpick(PropsHelperInfi2x2.woodHandpickID+6, 
                    InfiMaterialEnum.Wood, InfiMaterialEnum.Cactus, "cactusWoodHandpick");
    		
    		MinecraftForge.setToolClass(woodWoodHandpick, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(sandstoneWoodHandpick, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(boneWoodHandpick, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(paperWoodHandpick, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(iceWoodHandpick, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(slimeWoodHandpick, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
    		MinecraftForge.setToolClass(cactusWoodHandpick, "pickaxe", InfiMaterialEnum.Wood.getHarvestLevel());
    	}

        if(PropsHelperInfi2x2.enableStoneTools)
        {
        	woodStoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.stoneHandpickID+0, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Wood, "woodStoneHandpick");
        	stoneStoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.stoneHandpickID+1, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Stone, "stoneStoneHandpick");
        	sandstoneStoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.stoneHandpickID+2, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Sandstone, "sandstoneStoneHandpick");
        	boneStoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.stoneHandpickID+3, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Bone, "boneStoneHandpick");
        	netherrackStoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.stoneHandpickID+4, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Netherrack, "netherrackStoneHandpick");
        	iceStoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.stoneHandpickID+5, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Ice, "iceStoneHandpick");
        	slimeStoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.stoneHandpickID+6, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Slime, "slimeStoneHandpick");
        	cactusStoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.stoneHandpickID+7, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Cactus, "cactusStoneHandpick");
        	flintStoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.stoneHandpickID+8, 
                    InfiMaterialEnum.Stone, InfiMaterialEnum.Flint, "flintStoneHandpick");
            
            MinecraftForge.setToolClass(woodStoneHandpick, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneStoneHandpick, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneStoneHandpick, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(boneStoneHandpick, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackStoneHandpick, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(iceStoneHandpick, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeStoneHandpick, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusStoneHandpick, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
            MinecraftForge.setToolClass(flintStoneHandpick, "pickaxe", InfiMaterialEnum.Stone.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableIronTools)
        {
        	woodIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.ironHandpickID+0, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Wood, "woodIronHandpick");
        	stoneIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.ironHandpickID+1, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Stone, "stoneIronHandpick");
        	ironIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.ironHandpickID+2, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Iron, "ironIronHandpick");
        	boneIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.ironHandpickID+3, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bone, "boneIronHandpick");
        	netherrackIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.ironHandpickID+4, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Netherrack, "netherrackIronHandpick");
        	glowstoneIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.ironHandpickID+5, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Glowstone, "glowstoneIronHandpick");
        	cactusIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.ironHandpickID+6, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Cactus, "cactusIronHandpick");
        	copperIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.ironHandpickID+7, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Copper, "copperIronHandpick");
        	bronzeIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.ironHandpickID+8, 
                    InfiMaterialEnum.Iron, InfiMaterialEnum.Bronze, "bronzeIronHandpick");
            
            MinecraftForge.setToolClass(woodIronHandpick, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(stoneIronHandpick, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(ironIronHandpick, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(boneIronHandpick, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackIronHandpick, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneIronHandpick, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(cactusIronHandpick, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(copperIronHandpick, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeIronHandpick, "pickaxe", InfiMaterialEnum.Iron.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableDiamondTools)
        {
        	woodDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID+0, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Wood, "woodDiamondHandpick");
        	stoneDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID+1, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Stone, "stoneDiamondHandpick");
        	ironDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID+2, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Iron, "ironDiamondHandpick");
        	diamondDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID+3, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Diamond, "diamondDiamondHandpick");
        	redstoneDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID+4, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Redstone, "redstoneDiamondHandpick");
        	obsidianDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID+5, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Obsidian, "obsidianDiamondHandpick");
        	boneDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID+6, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bone, "boneDiamondHandpick");
        	mossyDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID+7, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Mossy, "mossyDiamondHandpick");
        	netherrackDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID+8, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Netherrack, "netherrackDiamondHandpick");
        	glowstoneDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID+9, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Glowstone, "glowstoneDiamondHandpick");
        	lavaDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID+10, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Lava, "lavaDiamondHandpick");
        	cactusDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID+11, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cactus, "cactusDiamondHandpick");
        	flintDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID+12, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Flint, "flintDiamondHandpick");
        	blazeDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID+13, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Blaze, "blazeDiamondHandpick");
            copperDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID+14, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Copper, "copperDiamondHandpick");
            bronzeDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID+15, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Bronze, "bronzeDiamondHandpick");
            workedDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID+16, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.WorkedIron, "workedDiamondHandpick");
            steelDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID+17, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Steel, "steelDiamondHandpick");
            cobaltDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID+18, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Cobalt, "cobaltDiamondHandpick");
            arditeDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID+19, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Ardite, "arditeDiamondHandpick");
            manyullynDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID+20, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Manyullyn, "manyullynDiamondHandpick");
            uraniumDiamondHandpick = new InfiToolHandpick(PropsHelperInfi2x2.diamondHandpickID+21, 
                    InfiMaterialEnum.Diamond, InfiMaterialEnum.Uranium, "uraniumDiamondHandpick");
            
            MinecraftForge.setToolClass(woodDiamondHandpick, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(stoneDiamondHandpick, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(ironDiamondHandpick, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(diamondDiamondHandpick, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneDiamondHandpick, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianDiamondHandpick, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(boneDiamondHandpick, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(mossyDiamondHandpick, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackDiamondHandpick, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneDiamondHandpick, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(lavaDiamondHandpick, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(cactusDiamondHandpick, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(flintDiamondHandpick, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(blazeDiamondHandpick, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(copperDiamondHandpick, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeDiamondHandpick, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(workedDiamondHandpick, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(steelDiamondHandpick, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltDiamondHandpick, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(arditeDiamondHandpick, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynDiamondHandpick, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumDiamondHandpick, "pickaxe", InfiMaterialEnum.Diamond.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableRedstoneTools)
        {
        	woodRedstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.redstoneHandpickID+0, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Wood, "woodRedstoneHandpick");
        	stoneRedstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.redstoneHandpickID+1, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Stone, "stoneRedstoneHandpick");
        	ironRedstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.redstoneHandpickID+2, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Iron, "ironRedstoneHandpick");
        	redstoneRedstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.redstoneHandpickID+3, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Redstone, "redstoneRedstoneHandpick");
        	obsidianRedstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.redstoneHandpickID+4, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Obsidian, "obsidianRedstoneHandpick");
        	sandstoneRedstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.redstoneHandpickID+5, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Sandstone, "sandstoneRedstoneHandpick");
        	boneRedstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.redstoneHandpickID+6, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bone, "boneRedstoneHandpick");
        	paperRedstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.redstoneHandpickID+7, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Paper, "paperRedstoneHandpick");
        	mossyRedstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.redstoneHandpickID+8, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Mossy, "mossyRedstoneHandpick");
        	netherrackRedstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.redstoneHandpickID+9, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Netherrack, "netherrackRedstoneHandpick");
        	glowstoneRedstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.redstoneHandpickID+10, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Glowstone, "glowstoneRedstoneHandpick");
        	iceRedstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.redstoneHandpickID+11, 
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Ice, "iceRedstoneHandpick");
        	lavaRedstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.redstoneHandpickID+12,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Lava, "lavaRedstoneHandpick");
        	slimeRedstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.redstoneHandpickID+13,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Slime, "slimeRedstoneHandpick");
        	cactusRedstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.redstoneHandpickID+14,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Cactus, "cactusRedstoneHandpick");
        	flintRedstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.redstoneHandpickID+15,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Flint, "flintRedstoneHandpick");
        	copperRedstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.redstoneHandpickID+16,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Copper, "copperRedstoneHandpick");
        	bronzeRedstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.redstoneHandpickID+17,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Bronze, "bronzeRedstoneHandpick");
        	workedRedstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.redstoneHandpickID+18,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.WorkedIron, "workedRedstoneHandpick");
        	uraniumRedstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.redstoneHandpickID+19,
                    InfiMaterialEnum.Redstone, InfiMaterialEnum.Uranium, "uraniumRedstoneHandpick");
            
            MinecraftForge.setToolClass(woodRedstoneHandpick, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneRedstoneHandpick, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(ironRedstoneHandpick, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneRedstoneHandpick, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianRedstoneHandpick, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneRedstoneHandpick, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneRedstoneHandpick, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(paperRedstoneHandpick, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(mossyRedstoneHandpick, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackRedstoneHandpick, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneRedstoneHandpick, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceRedstoneHandpick, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(lavaRedstoneHandpick, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeRedstoneHandpick, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusRedstoneHandpick, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(flintRedstoneHandpick, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(copperRedstoneHandpick, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeRedstoneHandpick, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(workedRedstoneHandpick, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumRedstoneHandpick, "pickaxe", InfiMaterialEnum.Redstone.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableObsidianTools)
        {
        	woodObsidianHandpick = new InfiToolHandpick(PropsHelperInfi2x2.obsidianHandpickID+0, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Wood, "woodObsidianHandpick");
        	stoneObsidianHandpick = new InfiToolHandpick(PropsHelperInfi2x2.obsidianHandpickID+1, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Stone, "stoneObsidianHandpick");
        	redstoneObsidianHandpick = new InfiToolHandpick(PropsHelperInfi2x2.obsidianHandpickID+2, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Redstone, "redstoneObsidianHandpick");
        	obsidianObsidianHandpick = new InfiToolHandpick(PropsHelperInfi2x2.obsidianHandpickID+3, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Obsidian, "obsidianObsidianHandpick");;
        	boneObsidianHandpick = new InfiToolHandpick(PropsHelperInfi2x2.obsidianHandpickID+4, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Bone, "boneObsidianHandpick");
        	netherrackObsidianHandpick = new InfiToolHandpick(PropsHelperInfi2x2.obsidianHandpickID+5, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Netherrack, "netherrackObsidianHandpick");
        	glowstoneObsidianHandpick = new InfiToolHandpick(PropsHelperInfi2x2.obsidianHandpickID+6, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Glowstone, "glowstoneObsidianHandpick");
        	iceObsidianHandpick = new InfiToolHandpick(PropsHelperInfi2x2.obsidianHandpickID+7, 
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Ice, "iceObsidianHandpick");
        	lavaObsidianHandpick = new InfiToolHandpick(PropsHelperInfi2x2.obsidianHandpickID+8,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Lava, "lavaObsidianHandpick");
        	cactusObsidianHandpick = new InfiToolHandpick(PropsHelperInfi2x2.obsidianHandpickID+9,
                    InfiMaterialEnum.Obsidian, InfiMaterialEnum.Cactus, "cactusObsidianHandpick");
            
            MinecraftForge.setToolClass(woodObsidianHandpick, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(stoneObsidianHandpick, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneObsidianHandpick, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianObsidianHandpick, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(boneObsidianHandpick, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackObsidianHandpick, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneObsidianHandpick, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(iceObsidianHandpick, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(lavaObsidianHandpick, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
            MinecraftForge.setToolClass(cactusObsidianHandpick, "pickaxe", InfiMaterialEnum.Obsidian.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableSandstoneTools)
        {
        	woodSandstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.sandstoneHandpickID+0, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Wood, "woodSandstoneHandpick");
        	sandstoneSandstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.sandstoneHandpickID+1, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Sandstone, "sandstoneSandstoneHandpick");
        	boneSandstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.sandstoneHandpickID+2, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Bone, "boneSandstoneHandpick");
        	netherrackSandstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.sandstoneHandpickID+3, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Netherrack, "netherrackSandstoneHandpick");
        	iceSandstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.sandstoneHandpickID+4, 
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Ice, "iceSandstoneHandpick");
        	slimeSandstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.sandstoneHandpickID+5,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Slime, "slimeSandstoneHandpick");
        	cactusSandstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.sandstoneHandpickID+6,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Cactus, "cactusSandstoneHandpick");
        	flintSandstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.sandstoneHandpickID+7,
                    InfiMaterialEnum.Sandstone, InfiMaterialEnum.Flint, "flintSandstoneHandpick");
            
            MinecraftForge.setToolClass(woodSandstoneHandpick, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneSandstoneHandpick, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneSandstoneHandpick, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackSandstoneHandpick, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceSandstoneHandpick, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSandstoneHandpick, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSandstoneHandpick, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
            MinecraftForge.setToolClass(flintSandstoneHandpick, "pickaxe", InfiMaterialEnum.Sandstone.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableBoneTools)
        {
        	woodBoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.boneHandpickID+0, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Wood, "woodBoneHandpick");
        	stoneBoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.boneHandpickID+1, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Stone, "stoneBoneHandpick");
        	sandstoneBoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.boneHandpickID+2, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Sandstone, "sandstoneBoneHandpick");
        	boneBoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.boneHandpickID+3, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Bone, "boneBoneHandpick");
        	paperBoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.boneHandpickID+4, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Paper, "paperBoneHandpick");
        	netherrackBoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.boneHandpickID+5, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Netherrack, "netherrackBoneHandpick");
        	iceBoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.boneHandpickID+6, 
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Ice, "iceBoneHandpick");
        	cactusBoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.boneHandpickID+7,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Cactus, "cactusBoneHandpick");
        	flintBoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.boneHandpickID+8,
                    InfiMaterialEnum.Bone, InfiMaterialEnum.Flint, "flintBoneHandpick");
            
            MinecraftForge.setToolClass(woodBoneHandpick, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(stoneBoneHandpick, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneBoneHandpick, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(boneBoneHandpick, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(paperBoneHandpick, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBoneHandpick, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(iceBoneHandpick, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusBoneHandpick, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
            MinecraftForge.setToolClass(flintBoneHandpick, "pickaxe", InfiMaterialEnum.Bone.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enablePaperTools)
        {
        	woodPaperHandpick = new InfiToolHandpick(PropsHelperInfi2x2.paperHandpickID+0, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Wood, "woodPaperHandpick");
        	bonePaperHandpick = new InfiToolHandpick(PropsHelperInfi2x2.paperHandpickID+1, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Bone, "bonePaperHandpick");
        	paperPaperHandpick = new InfiToolHandpick(PropsHelperInfi2x2.paperHandpickID+2, 
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Paper, "paperPaperHandpick");
        	slimePaperHandpick = new InfiToolHandpick(PropsHelperInfi2x2.paperHandpickID+3,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Slime, "slimePaperHandpick");
        	cactusPaperHandpick = new InfiToolHandpick(PropsHelperInfi2x2.paperHandpickID+4,
                    InfiMaterialEnum.Paper, InfiMaterialEnum.Cactus, "cactusPaperHandpick");
            
            MinecraftForge.setToolClass(woodPaperHandpick, "pickaxe", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(bonePaperHandpick, "pickaxe", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(paperPaperHandpick, "pickaxe", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(slimePaperHandpick, "pickaxe", InfiMaterialEnum.Paper.getHarvestLevel());
            MinecraftForge.setToolClass(cactusPaperHandpick, "pickaxe", InfiMaterialEnum.Paper.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableMossyTools)
        {
        	woodMossyHandpick = new InfiToolHandpick(PropsHelperInfi2x2.mossyHandpickID+0, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Wood, "woodMossyHandpick");
        	stoneMossyHandpick = new InfiToolHandpick(PropsHelperInfi2x2.mossyHandpickID+1, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Stone, "stoneMossyHandpick");
        	diamondMossyHandpick = new InfiToolHandpick(PropsHelperInfi2x2.mossyHandpickID+2, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Diamond, "diamondMossyHandpick");
        	redstoneMossyHandpick = new InfiToolHandpick(PropsHelperInfi2x2.mossyHandpickID+3, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Redstone, "redstoneMossyHandpick");
        	boneMossyHandpick = new InfiToolHandpick(PropsHelperInfi2x2.mossyHandpickID+4, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Bone, "boneMossyHandpick");
        	mossyMossyHandpick = new InfiToolHandpick(PropsHelperInfi2x2.mossyHandpickID+5, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Mossy, "mossyMossyHandpick");
        	netherrackMossyHandpick = new InfiToolHandpick(PropsHelperInfi2x2.mossyHandpickID+6, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Netherrack, "netherrackMossyHandpick");
        	glowstoneMossyHandpick = new InfiToolHandpick(PropsHelperInfi2x2.mossyHandpickID+7, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Glowstone, "glowstoneMossyHandpick");
        	cactusMossyHandpick = new InfiToolHandpick(PropsHelperInfi2x2.mossyHandpickID+8, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Cactus, "cactusMossyHandpick");
        	blazeMossyHandpick = new InfiToolHandpick(PropsHelperInfi2x2.mossyHandpickID+9, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Blaze, "blazeMossyHandpick");
        	manyullynMossyHandpick = new InfiToolHandpick(PropsHelperInfi2x2.mossyHandpickID+10, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Manyullyn, "manyullynMossyHandpick");
        	uraniumMossyHandpick = new InfiToolHandpick(PropsHelperInfi2x2.mossyHandpickID+11, 
                    InfiMaterialEnum.Mossy, InfiMaterialEnum.Uranium, "uraniumMossyHandpick");
            
            MinecraftForge.setToolClass(woodMossyHandpick, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(stoneMossyHandpick, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(diamondMossyHandpick, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneMossyHandpick, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(boneMossyHandpick, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(mossyMossyHandpick, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackMossyHandpick, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneMossyHandpick, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(cactusMossyHandpick, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(blazeMossyHandpick, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynMossyHandpick, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumMossyHandpick, "pickaxe", InfiMaterialEnum.Mossy.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableNetherrackTools)
        {
        	woodNetherrackHandpick = new InfiToolHandpick(PropsHelperInfi2x2.netherrackHandpickID+0, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Wood, "woodNetherrackHandpick");
        	stoneNetherrackHandpick = new InfiToolHandpick(PropsHelperInfi2x2.netherrackHandpickID+1, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Stone, "stoneNetherrackHandpick");
        	sandstoneNetherrackHandpick = new InfiToolHandpick(PropsHelperInfi2x2.netherrackHandpickID+2, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Sandstone, "sandstoneNetherrackHandpick");
        	boneNetherrackHandpick = new InfiToolHandpick(PropsHelperInfi2x2.netherrackHandpickID+3, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bone, "boneNetherrackHandpick");
        	paperNetherrackHandpick = new InfiToolHandpick(PropsHelperInfi2x2.netherrackHandpickID+4, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Paper, "paperNetherrackHandpick");
        	mossyNetherrackHandpick = new InfiToolHandpick(PropsHelperInfi2x2.netherrackHandpickID+5, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Mossy, "mossyNetherrackHandpick");
        	netherrackNetherrackHandpick = new InfiToolHandpick(PropsHelperInfi2x2.netherrackHandpickID+6, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Netherrack, "netherrackNetherrackHandpick");
        	iceNetherrackHandpick = new InfiToolHandpick(PropsHelperInfi2x2.netherrackHandpickID+7, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Ice, "iceNetherrackHandpick");
        	slimeNetherrackHandpick = new InfiToolHandpick(PropsHelperInfi2x2.netherrackHandpickID+8, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Slime, "slimeNetherrackHandpick");
        	cactusNetherrackHandpick = new InfiToolHandpick(PropsHelperInfi2x2.netherrackHandpickID+9, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Cactus, "cactusNetherrackHandpick");
        	flintNetherrackHandpick = new InfiToolHandpick(PropsHelperInfi2x2.netherrackHandpickID+10, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Flint, "flintNetherrackHandpick");
        	copperNetherrackHandpick = new InfiToolHandpick(PropsHelperInfi2x2.netherrackHandpickID+11, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Copper, "copperNetherrackHandpick");
        	bronzeNetherrackHandpick = new InfiToolHandpick(PropsHelperInfi2x2.netherrackHandpickID+12, 
                    InfiMaterialEnum.Netherrack, InfiMaterialEnum.Bronze, "bronzeNetherrackHandpick");
            
            MinecraftForge.setToolClass(woodNetherrackHandpick, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(stoneNetherrackHandpick, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneNetherrackHandpick, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(boneNetherrackHandpick, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(paperNetherrackHandpick, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(mossyNetherrackHandpick, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackNetherrackHandpick, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(iceNetherrackHandpick, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(slimeNetherrackHandpick, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(cactusNetherrackHandpick, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(flintNetherrackHandpick, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(copperNetherrackHandpick, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeNetherrackHandpick, "pickaxe", InfiMaterialEnum.Netherrack.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableGlowstoneTools)
        {
        	woodGlowstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.glowstoneHandpickID+0, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Wood, "woodGlowstoneHandpick");
        	redstoneGlowstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.glowstoneHandpickID+1, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Redstone, "redstoneGlowstoneHandpick");
        	obsidianGlowstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.glowstoneHandpickID+2, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Obsidian, "obsidianGlowstoneHandpick");
        	boneGlowstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.glowstoneHandpickID+3, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Bone, "boneGlowstoneHandpick");
        	netherrackGlowstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.glowstoneHandpickID+4, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Netherrack, "netherrackGlowstoneHandpick");
        	glowstoneGlowstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.glowstoneHandpickID+5, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Glowstone, "glowstoneGlowstoneHandpick");
        	iceGlowstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.glowstoneHandpickID+6, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Ice, "iceGlowstoneHandpick");
        	slimeGlowstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.glowstoneHandpickID+7, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Slime, "slimeGlowstoneHandpick");
        	cactusGlowstoneHandpick = new InfiToolHandpick(PropsHelperInfi2x2.glowstoneHandpickID+8, 
                    InfiMaterialEnum.Glowstone, InfiMaterialEnum.Cactus, "cactusGlowstoneHandpick");
            
            
            MinecraftForge.setToolClass(woodGlowstoneHandpick, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneGlowstoneHandpick, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianGlowstoneHandpick, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(boneGlowstoneHandpick, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackGlowstoneHandpick, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneGlowstoneHandpick, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(iceGlowstoneHandpick, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(slimeGlowstoneHandpick, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
            MinecraftForge.setToolClass(cactusGlowstoneHandpick, "pickaxe", InfiMaterialEnum.Glowstone.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableIceTools)
        {
        	woodIceHandpick = new InfiToolHandpick(PropsHelperInfi2x2.iceHandpickID+0, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Wood, "woodIceHandpick");
        	boneIceHandpick = new InfiToolHandpick(PropsHelperInfi2x2.iceHandpickID+1, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Bone, "boneIceHandpick");
        	paperIceHandpick = new InfiToolHandpick(PropsHelperInfi2x2.iceHandpickID+2, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Paper, "paperIceHandpick");
        	iceIceHandpick = new InfiToolHandpick(PropsHelperInfi2x2.iceHandpickID+3, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Ice, "iceIceHandpick");
        	slimeIceHandpick = new InfiToolHandpick(PropsHelperInfi2x2.iceHandpickID+4, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Slime, "slimeIceHandpick");
        	cactusIceHandpick = new InfiToolHandpick(PropsHelperInfi2x2.iceHandpickID+5, 
                    InfiMaterialEnum.Ice, InfiMaterialEnum.Cactus, "cactusIceHandpick");
            
            
            MinecraftForge.setToolClass(woodIceHandpick, "pickaxe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(boneIceHandpick, "pickaxe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(paperIceHandpick, "pickaxe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(iceIceHandpick, "pickaxe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(slimeIceHandpick, "pickaxe", InfiMaterialEnum.Ice.getHarvestLevel());
            MinecraftForge.setToolClass(cactusIceHandpick, "pickaxe", InfiMaterialEnum.Ice.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableLavaTools)
        {
        	diamondLavaHandpick = new InfiToolHandpick(PropsHelperInfi2x2.lavaHandpickID+0, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Diamond, "diamondLavaHandpick");
        	obsidianLavaHandpick = new InfiToolHandpick(PropsHelperInfi2x2.lavaHandpickID+1, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Obsidian, "obsidianLavaHandpick");
        	netherrackLavaHandpick = new InfiToolHandpick(PropsHelperInfi2x2.lavaHandpickID+2, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Netherrack, "netherrackLavaHandpick");
        	lavaLavaHandpick = new InfiToolHandpick(PropsHelperInfi2x2.lavaHandpickID+3, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Lava, "lavaLavaHandpick");
        	flintLavaHandpick = new InfiToolHandpick(PropsHelperInfi2x2.lavaHandpickID+4, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Flint, "flintLavaHandpick");
        	blazeLavaHandpick = new InfiToolHandpick(PropsHelperInfi2x2.lavaHandpickID+5, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Blaze, "blazeLavaHandpick");
        	manyullynLavaHandpick = new InfiToolHandpick(PropsHelperInfi2x2.lavaHandpickID+6, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Manyullyn, "manyullynLavaHandpick");
            uraniumLavaHandpick = new InfiToolHandpick(PropsHelperInfi2x2.lavaHandpickID+7, 
                    InfiMaterialEnum.Lava, InfiMaterialEnum.Uranium, "uraniumLavaHandpick");
            
            MinecraftForge.setToolClass(diamondLavaHandpick, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianLavaHandpick, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackLavaHandpick, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(lavaLavaHandpick, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(flintLavaHandpick, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(blazeLavaHandpick, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynLavaHandpick, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumLavaHandpick, "pickaxe", InfiMaterialEnum.Lava.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableSlimeTools)
        {
        	woodSlimeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.slimeHandpickID+0, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Wood, "woodSlimeHandpick");
        	sandstoneSlimeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.slimeHandpickID+1, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Sandstone, "sandstoneSlimeHandpick");
        	boneSlimeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.slimeHandpickID+2, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Bone, "boneSlimeHandpick");
        	paperSlimeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.slimeHandpickID+3, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Paper, "paperSlimeHandpick");
        	slimeSlimeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.slimeHandpickID+4, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Slime, "slimeSlimeHandpick");
        	cactusSlimeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.slimeHandpickID+5, 
                    InfiMaterialEnum.Slime, InfiMaterialEnum.Cactus, "cactusSlimeHandpick");
            
            MinecraftForge.setToolClass(woodSlimeHandpick, "pickaxe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneSlimeHandpick, "pickaxe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(boneSlimeHandpick, "pickaxe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(paperSlimeHandpick, "pickaxe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSlimeHandpick, "pickaxe", InfiMaterialEnum.Slime.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSlimeHandpick, "pickaxe", InfiMaterialEnum.Slime.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableCactusTools)
        {
        	woodCactusHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cactusHandpickID+0, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Wood, "woodCactusHandpick");
        	sandstoneCactusHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cactusHandpickID+1, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Sandstone, "sandstoneCactusHandpick");
        	boneCactusHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cactusHandpickID+2, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Bone, "boneCactusHandpick");
        	netherrackCactusHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cactusHandpickID+3, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Netherrack, "netherrackCactusHandpick");
        	iceCactusHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cactusHandpickID+4, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Ice, "iceCactusHandpick");
        	slimeCactusHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cactusHandpickID+5, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Slime, "slimeCactusHandpick");
        	cactusCactusHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cactusHandpickID+6, 
                    InfiMaterialEnum.Cactus, InfiMaterialEnum.Cactus, "cactusCactusHandpick");
            
            MinecraftForge.setToolClass(woodCactusHandpick, "pickaxe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneCactusHandpick, "pickaxe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(boneCactusHandpick, "pickaxe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackCactusHandpick, "pickaxe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(iceCactusHandpick, "pickaxe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCactusHandpick, "pickaxe", InfiMaterialEnum.Cactus.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCactusHandpick, "pickaxe", InfiMaterialEnum.Cactus.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableFlintTools)
        {
        	woodFlintHandpick = new InfiToolHandpick(PropsHelperInfi2x2.flintHandpickID+0, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Wood, "woodFlintHandpick");
        	stoneFlintHandpick = new InfiToolHandpick(PropsHelperInfi2x2.flintHandpickID+1, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Stone, "stoneFlintHandpick");
        	sandstoneFlintHandpick = new InfiToolHandpick(PropsHelperInfi2x2.flintHandpickID+2, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Sandstone, "sandstoneFlintHandpick");
        	boneFlintHandpick = new InfiToolHandpick(PropsHelperInfi2x2.flintHandpickID+3, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bone, "boneFlintHandpick");
        	netherrackFlintHandpick = new InfiToolHandpick(PropsHelperInfi2x2.flintHandpickID+4, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Netherrack, "netherrackFlintHandpick");
        	slimeFlintHandpick = new InfiToolHandpick(PropsHelperInfi2x2.flintHandpickID+5, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Slime, "slimeFlintHandpick");
        	cactusFlintHandpick = new InfiToolHandpick(PropsHelperInfi2x2.flintHandpickID+6, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Cactus, "cactusFlintHandpick");
        	flintFlintHandpick = new InfiToolHandpick(PropsHelperInfi2x2.flintHandpickID+7, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Flint, "flintFlintHandpick");
        	copperFlintHandpick = new InfiToolHandpick(PropsHelperInfi2x2.flintHandpickID+8, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Copper, "copperFlintHandpick");
        	bronzeFlintHandpick = new InfiToolHandpick(PropsHelperInfi2x2.flintHandpickID+9, 
                    InfiMaterialEnum.Flint, InfiMaterialEnum.Bronze, "bronzeFlintHandpick");
            
            MinecraftForge.setToolClass(woodFlintHandpick, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(stoneFlintHandpick, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(sandstoneFlintHandpick, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(boneFlintHandpick, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackFlintHandpick, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(slimeFlintHandpick, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(cactusFlintHandpick, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(flintFlintHandpick, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(copperFlintHandpick, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeFlintHandpick, "pickaxe", InfiMaterialEnum.Flint.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableBlazeTools)
        {
        	diamondBlazeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.blazeHandpickID+0, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Diamond, "diamondBlazeHandpick");
        	obsidianBlazeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.blazeHandpickID+1, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Obsidian, "obsidianBlazeHandpick");
        	netherrackBlazeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.blazeHandpickID+2, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Netherrack, "netherrackBlazeHandpick");
        	lavaBlazeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.blazeHandpickID+3, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Lava, "lavaBlazeHandpick");
        	flintBlazeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.blazeHandpickID+4, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Flint, "flintBlazeHandpick");
        	blazeBlazeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.blazeHandpickID+5, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Blaze, "blazeBlazeHandpick");
        	manyullynBlazeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.blazeHandpickID+6, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Manyullyn, "manyullynBlazeHandpick");
            uraniumBlazeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.blazeHandpickID+7, 
                    InfiMaterialEnum.Blaze, InfiMaterialEnum.Uranium, "uraniumBlazeHandpick");
            
            MinecraftForge.setToolClass(diamondBlazeHandpick, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianBlazeHandpick, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBlazeHandpick, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(blazeBlazeHandpick, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(flintBlazeHandpick, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(blazeBlazeHandpick, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynBlazeHandpick, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumBlazeHandpick, "pickaxe", InfiMaterialEnum.Blaze.getHarvestLevel());
        }
    	
        if(PropsHelperInfi2x2.enableCopperTools)
        {
        	woodCopperHandpick = new InfiToolHandpick(PropsHelperInfi2x2.copperHandpickID+0, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Wood, "woodCopperHandpick");
            stoneCopperHandpick = new InfiToolHandpick(PropsHelperInfi2x2.copperHandpickID+1, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Stone, "stoneCopperHandpick");
            boneCopperHandpick = new InfiToolHandpick(PropsHelperInfi2x2.copperHandpickID+2, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Bone, "boneCopperHandpick");
            netherrackCopperHandpick = new InfiToolHandpick(PropsHelperInfi2x2.copperHandpickID+3, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Netherrack, "netherrackCopperHandpick");
            slimeCopperHandpick = new InfiToolHandpick(PropsHelperInfi2x2.copperHandpickID+4, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Slime, "slimeCopperHandpick");
            cactusCopperHandpick = new InfiToolHandpick(PropsHelperInfi2x2.copperHandpickID+5, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Cactus, "cactusCopperHandpick");
            flintCopperHandpick = new InfiToolHandpick(PropsHelperInfi2x2.copperHandpickID+6, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Flint, "flintCopperHandpick");
            copperCopperHandpick = new InfiToolHandpick(PropsHelperInfi2x2.copperHandpickID+7, 
                    InfiMaterialEnum.Copper, InfiMaterialEnum.Copper, "copperCopperHandpick");
            
            MinecraftForge.setToolClass(woodCopperHandpick, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
        	MinecraftForge.setToolClass(stoneCopperHandpick, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(boneCopperHandpick, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackCopperHandpick, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCopperHandpick, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCopperHandpick, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(flintCopperHandpick, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
            MinecraftForge.setToolClass(copperCopperHandpick, "pickaxe", InfiMaterialEnum.Copper.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableBronzeTools)
        {
        	woodBronzeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.bronzeHandpickID+0, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Wood, "woodBronzeHandpick");
            stoneBronzeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.bronzeHandpickID+1, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Stone, "stoneBronzeHandpick");
            boneBronzeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.bronzeHandpickID+2, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bone, "boneBronzeHandpick");
            netherrackBronzeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.bronzeHandpickID+3, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Netherrack, "netherrackBronzeHandpick");
            slimeBronzeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.bronzeHandpickID+4, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Slime, "slimeBronzeHandpick");
            cactusBronzeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.bronzeHandpickID+5, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Cactus, "cactusBronzeHandpick");
            flintBronzeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.bronzeHandpickID+6, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Flint, "flintBronzeHandpick");
            copperBronzeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.bronzeHandpickID+7, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Copper, "copperBronzeHandpick");
            bronzeBronzeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.bronzeHandpickID+8, 
                    InfiMaterialEnum.Bronze, InfiMaterialEnum.Bronze, "bronzeBronzeHandpick");
            
            MinecraftForge.setToolClass(woodBronzeHandpick, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(stoneBronzeHandpick, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(boneBronzeHandpick, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackBronzeHandpick, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(slimeBronzeHandpick, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(cactusBronzeHandpick, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(flintBronzeHandpick, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(copperBronzeHandpick, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeBronzeHandpick, "pickaxe", InfiMaterialEnum.Bronze.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableWorkedIronTools)
        {
        	woodWorkedIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.workedIronHandpickID+0, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Wood, "woodWorkedIronHandpick");
            stoneWorkedIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.workedIronHandpickID+1, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Stone, "stoneWorkedIronHandpick");
            ironWorkedIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.workedIronHandpickID+2,
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Iron, "ironWorkedIronHandpick");
            diamondWorkedIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.workedIronHandpickID+3, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Diamond, "diamondWorkedIronHandpick");
            redstoneWorkedIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.workedIronHandpickID+4, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Redstone, "redstoneWorkedIronHandpick");
            obsidianWorkedIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.workedIronHandpickID+5, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Obsidian, "obsidianWorkedIronHandpick");
            boneWorkedIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.workedIronHandpickID+6, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bone, "boneWorkedIronHandpick");
            netherrackWorkedIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.workedIronHandpickID+7, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Netherrack, "netherrackWorkedIronHandpick");
            glowstoneWorkedIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.workedIronHandpickID+8, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Glowstone, "glowstoneWorkedIronHandpick");
            iceWorkedIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.workedIronHandpickID+9, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Ice, "iceWorkedIronHandpick");
            slimeWorkedIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.workedIronHandpickID+10, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Slime, "slimeWorkedIronHandpick");
            cactusWorkedIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.workedIronHandpickID+11, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Cactus, "cactusWorkedIronHandpick");
            blazeWorkedIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.workedIronHandpickID+12, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Blaze, "blazeWorkedIronHandpick");
            copperWorkedIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.workedIronHandpickID+13, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Copper, "copperWorkedIronHandpick");
            bronzeWorkedIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.workedIronHandpickID+14, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Bronze, "bronzeWorkedIronHandpick");
            workedWorkedIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.workedIronHandpickID+15, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.WorkedIron, "workedWorkedIronHandpick");
            steelWorkedIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.workedIronHandpickID+16, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Steel, "steelWorkedIronHandpick");
            uraniumWorkedIronHandpick = new InfiToolHandpick(PropsHelperInfi2x2.workedIronHandpickID+17, 
                    InfiMaterialEnum.WorkedIron, InfiMaterialEnum.Uranium, "uraniumWorkedIronHandpick");
            
            MinecraftForge.setToolClass(woodWorkedIronHandpick, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(stoneWorkedIronHandpick, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(ironWorkedIronHandpick, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(diamondWorkedIronHandpick, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneWorkedIronHandpick, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianWorkedIronHandpick, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(boneWorkedIronHandpick, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackWorkedIronHandpick, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneWorkedIronHandpick, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(iceWorkedIronHandpick, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(slimeWorkedIronHandpick, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(cactusWorkedIronHandpick, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(blazeWorkedIronHandpick, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(copperWorkedIronHandpick, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeWorkedIronHandpick, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(workedWorkedIronHandpick, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(steelWorkedIronHandpick, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumWorkedIronHandpick, "pickaxe", InfiMaterialEnum.WorkedIron.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableSteelTools)
        {
        	woodSteelHandpick = new InfiToolHandpick(PropsHelperInfi2x2.steelHandpickID+0, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Wood, "woodSteelHandpick");
            stoneSteelHandpick = new InfiToolHandpick(PropsHelperInfi2x2.steelHandpickID+1, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Stone, "stoneSteelHandpick");
            ironSteelHandpick = new InfiToolHandpick(PropsHelperInfi2x2.steelHandpickID+2, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Iron, "ironSteelHandpick");
            diamondSteelHandpick = new InfiToolHandpick(PropsHelperInfi2x2.steelHandpickID+3, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Diamond, "diamondSteelHandpick");
            redstoneSteelHandpick = new InfiToolHandpick(PropsHelperInfi2x2.steelHandpickID+4, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Redstone, "redstoneSteelHandpick");
            obsidianSteelHandpick = new InfiToolHandpick(PropsHelperInfi2x2.steelHandpickID+5, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Obsidian, "obsidianSteelHandpick");
            boneSteelHandpick = new InfiToolHandpick(PropsHelperInfi2x2.steelHandpickID+6, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bone, "boneSteelHandpick");
            netherrackSteelHandpick = new InfiToolHandpick(PropsHelperInfi2x2.steelHandpickID+7, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Netherrack, "netherrackSteelHandpick");
            glowstoneSteelHandpick = new InfiToolHandpick(PropsHelperInfi2x2.steelHandpickID+8, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Glowstone, "glowstoneSteelHandpick");
            iceSteelHandpick = new InfiToolHandpick(PropsHelperInfi2x2.steelHandpickID+9, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ice, "iceSteelHandpick");
            slimeSteelHandpick = new InfiToolHandpick(PropsHelperInfi2x2.steelHandpickID+10, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Slime, "slimeSteelHandpick");
            cactusSteelHandpick = new InfiToolHandpick(PropsHelperInfi2x2.steelHandpickID+11, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cactus, "cactusSteelHandpick");
            blazeSteelHandpick = new InfiToolHandpick(PropsHelperInfi2x2.steelHandpickID+12, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Blaze, "blazeSteelHandpick");
            copperSteelHandpick = new InfiToolHandpick(PropsHelperInfi2x2.steelHandpickID+13, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Copper, "copperSteelHandpick");
            bronzeSteelHandpick = new InfiToolHandpick(PropsHelperInfi2x2.steelHandpickID+14, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Bronze, "bronzeSteelHandpick");
            workedSteelHandpick = new InfiToolHandpick(PropsHelperInfi2x2.steelHandpickID+15, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.WorkedIron, "workedSteelHandpick");
            steelSteelHandpick = new InfiToolHandpick(PropsHelperInfi2x2.steelHandpickID+16, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Steel, "steelSteelHandpick");
            cobaltSteelHandpick = new InfiToolHandpick(PropsHelperInfi2x2.steelHandpickID+17, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Cobalt, "cobaltSteelHandpick");
            arditeSteelHandpick = new InfiToolHandpick(PropsHelperInfi2x2.steelHandpickID+18, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Ardite, "arditeSteelHandpick");
            uraniumSteelHandpick = new InfiToolHandpick(PropsHelperInfi2x2.steelHandpickID+19, 
                    InfiMaterialEnum.Steel, InfiMaterialEnum.Uranium, "uraniumSteelHandpick");

            MinecraftForge.setToolClass(woodSteelHandpick, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(stoneSteelHandpick, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(ironSteelHandpick, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(diamondSteelHandpick, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneSteelHandpick, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianSteelHandpick, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(boneSteelHandpick, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackSteelHandpick, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneSteelHandpick, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(iceSteelHandpick, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(slimeSteelHandpick, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(cactusSteelHandpick, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(blazeSteelHandpick, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(copperSteelHandpick, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeSteelHandpick, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(workedSteelHandpick, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(steelSteelHandpick, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltSteelHandpick, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(arditeSteelHandpick, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumSteelHandpick, "pickaxe", InfiMaterialEnum.Steel.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableCobaltTools)
        {
        	woodCobaltHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cobaltHandpickID+0, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Wood, "woodCobaltHandpick");
            stoneCobaltHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cobaltHandpickID+1, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Stone, "stoneCobaltHandpick");
            ironCobaltHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cobaltHandpickID+2, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Iron, "ironCobaltHandpick");
            diamondCobaltHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cobaltHandpickID+3,
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Diamond, "diamondCobaltHandpick");
            redstoneCobaltHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cobaltHandpickID+4, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Redstone, "redstoneCobaltHandpick");
            obsidianCobaltHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cobaltHandpickID+5, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Obsidian, "obsidianCobaltHandpick");
            boneCobaltHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cobaltHandpickID+6, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bone, "boneCobaltHandpick");
            slimeCobaltHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cobaltHandpickID+7, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Slime, "slimeCobaltHandpick");
            cactusCobaltHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cobaltHandpickID+8, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cactus, "cactusCobaltHandpick");
            blazeCobaltHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cobaltHandpickID+9, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Blaze, "blazeCobaltHandpick");
            copperCobaltHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cobaltHandpickID+10, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Copper, "copperCobaltHandpick");
            bronzeCobaltHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cobaltHandpickID+11, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Bronze, "bronzeCobaltHandpick");
            workedCobaltHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cobaltHandpickID+12, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.WorkedIron, "workedCobaltHandpick");
            steelCobaltHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cobaltHandpickID+13, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Steel, "steelCobaltHandpick");
            cobaltCobaltHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cobaltHandpickID+14, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Cobalt, "cobaltCobaltHandpick");
            arditeCobaltHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cobaltHandpickID+15, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Ardite, "arditeCobaltHandpick");
            manyullynCobaltHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cobaltHandpickID+16, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Manyullyn, "manyullynCobaltHandpick");
            uraniumCobaltHandpick = new InfiToolHandpick(PropsHelperInfi2x2.cobaltHandpickID+17, 
                    InfiMaterialEnum.Cobalt, InfiMaterialEnum.Uranium, "uraniumCobaltHandpick");
            
            MinecraftForge.setToolClass(woodCobaltHandpick, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(stoneCobaltHandpick, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(ironCobaltHandpick, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(diamondCobaltHandpick, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneCobaltHandpick, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianCobaltHandpick, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(boneCobaltHandpick, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(slimeCobaltHandpick, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(cactusCobaltHandpick, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(blazeCobaltHandpick, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(copperCobaltHandpick, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeCobaltHandpick, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(workedCobaltHandpick, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(steelCobaltHandpick, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltCobaltHandpick, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(arditeCobaltHandpick, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynCobaltHandpick, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumCobaltHandpick, "pickaxe", InfiMaterialEnum.Cobalt.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableArditeTools)
        {
        	woodArditeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.arditeHandpickID+0, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Wood, "woodArditeHandpick");
            stoneArditeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.arditeHandpickID+1, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Stone, "stoneArditeHandpick");
            ironArditeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.arditeHandpickID+2, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Iron, "ironArditeHandpick");
            diamondArditeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.arditeHandpickID+3,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Diamond, "diamondArditeHandpick");
            redstoneArditeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.arditeHandpickID+4, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Redstone, "redstoneArditeHandpick");
            obsidianArditeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.arditeHandpickID+5, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Obsidian, "obsidianArditeHandpick");
            boneArditeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.arditeHandpickID+6,
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bone, "boneArditeHandpick");
            slimeArditeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.arditeHandpickID+7, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Slime, "slimeArditeHandpick");
            cactusArditeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.arditeHandpickID+8, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cactus, "cactusArditeHandpick");
            blazeArditeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.arditeHandpickID+9, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Blaze, "blazeArditeHandpick");
            copperArditeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.arditeHandpickID+10, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Copper, "copperArditeHandpick");
            bronzeArditeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.arditeHandpickID+11, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Bronze, "bronzeArditeHandpick");
            workedArditeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.arditeHandpickID+12, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.WorkedIron, "workedArditeHandpick");
            steelArditeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.arditeHandpickID+13, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Steel, "steelArditeHandpick");
            cobaltArditeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.arditeHandpickID+14, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Cobalt, "cobaltArditeHandpick");
            arditeArditeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.arditeHandpickID+15, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Ardite, "arditeArditeHandpick");
            manyullynArditeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.arditeHandpickID+16, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Manyullyn, "manyullynArditeHandpick");
            uraniumArditeHandpick = new InfiToolHandpick(PropsHelperInfi2x2.arditeHandpickID+17, 
                    InfiMaterialEnum.Ardite, InfiMaterialEnum.Uranium, "uraniumArditeHandpick");
            
            MinecraftForge.setToolClass(woodArditeHandpick, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(stoneArditeHandpick, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(ironArditeHandpick, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(diamondArditeHandpick, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneArditeHandpick, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianArditeHandpick, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(boneArditeHandpick, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(slimeArditeHandpick, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(cactusArditeHandpick, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(blazeArditeHandpick, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(copperArditeHandpick, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeArditeHandpick, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(workedArditeHandpick, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(steelArditeHandpick, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltArditeHandpick, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(arditeArditeHandpick, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynArditeHandpick, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumArditeHandpick, "pickaxe", InfiMaterialEnum.Ardite.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableManyullynTools)
        {
        	woodManyullynHandpick = new InfiToolHandpick(PropsHelperInfi2x2.manyullynHandpickID+0, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Wood, "woodManyullynHandpick");
            stoneManyullynHandpick = new InfiToolHandpick(PropsHelperInfi2x2.manyullynHandpickID+1, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Stone, "stoneManyullynHandpick");
            ironManyullynHandpick = new InfiToolHandpick(PropsHelperInfi2x2.manyullynHandpickID+2, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Iron, "ironManyullynHandpick");
            diamondManyullynHandpick = new InfiToolHandpick(PropsHelperInfi2x2.manyullynHandpickID+3,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Diamond, "diamondManyullynHandpick");
            redstoneManyullynHandpick = new InfiToolHandpick(PropsHelperInfi2x2.manyullynHandpickID+4, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Redstone, "redstoneManyullynHandpick");
            obsidianManyullynHandpick = new InfiToolHandpick(PropsHelperInfi2x2.manyullynHandpickID+5, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Obsidian, "obsidianManyullynHandpick");
            boneManyullynHandpick = new InfiToolHandpick(PropsHelperInfi2x2.manyullynHandpickID+6, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bone, "boneManyullynHandpick");
            slimeManyullynHandpick = new InfiToolHandpick(PropsHelperInfi2x2.manyullynHandpickID+7, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Slime, "slimeManyullynHandpick");
            cactusManyullynHandpick = new InfiToolHandpick(PropsHelperInfi2x2.manyullynHandpickID+8, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cactus, "cactusManyullynHandpick");
            blazeManyullynHandpick = new InfiToolHandpick(PropsHelperInfi2x2.manyullynHandpickID+9, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Blaze, "blazeManyullynHandpick");
            copperManyullynHandpick = new InfiToolHandpick(PropsHelperInfi2x2.manyullynHandpickID+10, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Copper, "copperManyullynHandpick");
            bronzeManyullynHandpick = new InfiToolHandpick(PropsHelperInfi2x2.manyullynHandpickID+11, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Bronze, "bronzeManyullynHandpick");
            workedManyullynHandpick = new InfiToolHandpick(PropsHelperInfi2x2.manyullynHandpickID+12, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.WorkedIron, "workedManyullynHandpick");
            steelManyullynHandpick = new InfiToolHandpick(PropsHelperInfi2x2.manyullynHandpickID+13, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Steel, "steelManyullynHandpick");
            cobaltManyullynHandpick = new InfiToolHandpick(PropsHelperInfi2x2.manyullynHandpickID+14, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Cobalt, "cobaltManyullynHandpick");
            arditeManyullynHandpick = new InfiToolHandpick(PropsHelperInfi2x2.manyullynHandpickID+15, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Ardite, "arditeManyullynHandpick");
            manyullynManyullynHandpick = new InfiToolHandpick(PropsHelperInfi2x2.manyullynHandpickID+16, 
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Manyullyn, "manyullynManyullynHandpick");
            uraniumManyullynHandpick = new InfiToolHandpick(PropsHelperInfi2x2.manyullynHandpickID+17,
                    InfiMaterialEnum.Manyullyn, InfiMaterialEnum.Uranium, "uraniumManyullynHandpick");
            
            MinecraftForge.setToolClass(woodManyullynHandpick, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(stoneManyullynHandpick, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(ironManyullynHandpick, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(diamondManyullynHandpick, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneManyullynHandpick, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(obsidianManyullynHandpick, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(boneManyullynHandpick, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(slimeManyullynHandpick, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(cactusManyullynHandpick, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(blazeManyullynHandpick, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(copperManyullynHandpick, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(bronzeManyullynHandpick, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(workedManyullynHandpick, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(steelManyullynHandpick, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltManyullynHandpick, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(arditeManyullynHandpick, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(manyullynManyullynHandpick, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumManyullynHandpick, "pickaxe", InfiMaterialEnum.Manyullyn.getHarvestLevel());
        }
        
        if(PropsHelperInfi2x2.enableUraniumTools)
        {
            diamondUraniumHandpick = new InfiToolHandpick(PropsHelperInfi2x2.uraniumHandpickID+0, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Diamond, "diamondUraniumHandpick");
            redstoneUraniumHandpick = new InfiToolHandpick(PropsHelperInfi2x2.uraniumHandpickID+1, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Redstone, "redstoneUraniumHandpick");
            boneUraniumHandpick = new InfiToolHandpick(PropsHelperInfi2x2.uraniumHandpickID+2, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Bone, "boneUraniumHandpick");
            netherrackUraniumHandpick = new InfiToolHandpick(PropsHelperInfi2x2.uraniumHandpickID+3, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Netherrack, "netherrackUraniumHandpick");
            glowstoneUraniumHandpick = new InfiToolHandpick(PropsHelperInfi2x2.uraniumHandpickID+4, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Glowstone, "glowstoneUraniumHandpick");
            lavaUraniumHandpick = new InfiToolHandpick(PropsHelperInfi2x2.uraniumHandpickID+5, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Lava, "lavaUraniumHandpick");
            blazeUraniumHandpick = new InfiToolHandpick(PropsHelperInfi2x2.uraniumHandpickID+6, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Blaze, "blazeUraniumHandpick");
            cobaltUraniumHandpick = new InfiToolHandpick(PropsHelperInfi2x2.uraniumHandpickID+7, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Cobalt, "cobaltUraniumHandpick");
            arditeUraniumHandpick = new InfiToolHandpick(PropsHelperInfi2x2.uraniumHandpickID+8, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Ardite, "arditeUraniumHandpick");
            uraniumUraniumHandpick = new InfiToolHandpick(PropsHelperInfi2x2.uraniumHandpickID+9, 
                    InfiMaterialEnum.Uranium, InfiMaterialEnum.Uranium, "uraniumUraniumHandpick");
            
            MinecraftForge.setToolClass(diamondUraniumHandpick, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(redstoneUraniumHandpick, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(boneUraniumHandpick, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(netherrackUraniumHandpick, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(glowstoneUraniumHandpick, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(lavaUraniumHandpick, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(blazeUraniumHandpick, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(cobaltUraniumHandpick, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(arditeUraniumHandpick, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
            MinecraftForge.setToolClass(uraniumUraniumHandpick, "pickaxe", InfiMaterialEnum.Uranium.getHarvestLevel());
        }
    }
    
    private static void addNames()
    {
    	if(PropsHelperInfi2x2.enableWoodTools)
            ModLoader.addName(woodWoodHandpick, "Wooden Handpick");
        if(PropsHelperInfi2x2.enableStoneTools)
            ModLoader.addName(stoneStoneHandpick, "Heavy Handpick");
        if(PropsHelperInfi2x2.enableIronTools)
            ModLoader.addName(ironIronHandpick, "Ironic Handpick");
        if(PropsHelperInfi2x2.enableDiamondTools)
            ModLoader.addName(diamondDiamondHandpick, "Diamondium Handpick");
        if(PropsHelperInfi2x2.enableRedstoneTools)
            ModLoader.addName(redstoneRedstoneHandpick, "Redredred Handpick");
        if(PropsHelperInfi2x2.enableObsidianTools)
            ModLoader.addName(obsidianObsidianHandpick, "Ebony Handpick");
        if(PropsHelperInfi2x2.enableSandstoneTools)
            ModLoader.addName(sandstoneSandstoneHandpick, "Fragile Handpick");
        if(PropsHelperInfi2x2.enableNetherrackTools)
            ModLoader.addName(boneBoneHandpick, "Necrotic Handpick");
        if(PropsHelperInfi2x2.enablePaperTools)
            ModLoader.addName(paperPaperHandpick, "Soft Handpick");
        if(PropsHelperInfi2x2.enableMossyTools)
            ModLoader.addName(mossyMossyHandpick, "Living Handpick");
        if(PropsHelperInfi2x2.enableNetherrackTools)
            ModLoader.addName(netherrackNetherrackHandpick, "Bloodsoaked Handpick");
        if(PropsHelperInfi2x2.enableGlowstoneTools)
            ModLoader.addName(glowstoneGlowstoneHandpick, "Bright Handpick");
        if(PropsHelperInfi2x2.enableIceTools)
            ModLoader.addName(iceIceHandpick, "Freezing Handpick");
        if(PropsHelperInfi2x2.enableLavaTools)
            ModLoader.addName(lavaLavaHandpick, "Burning Handpick");
        if(PropsHelperInfi2x2.enableSlimeTools)
            ModLoader.addName(slimeSlimeHandpick, "Toy Handpick");
        if(PropsHelperInfi2x2.enableCactusTools)
            ModLoader.addName(cactusCactusHandpick, "Thorned Handpick");
        if(PropsHelperInfi2x2.enableFlintTools)
            ModLoader.addName(flintFlintHandpick, "Rough-hewn Handpick");
        if(PropsHelperInfi2x2.enableBlazeTools)
            ModLoader.addName(blazeBlazeHandpick, "Netherite Handpick");
        if(PropsHelperInfi2x2.enableCopperTools)
            ModLoader.addName(copperCopperHandpick, "Orange-Tang Handpick");
        if(PropsHelperInfi2x2.enableBronzeTools)
            ModLoader.addName(bronzeBronzeHandpick, "Polished Handpick");
        if(PropsHelperInfi2x2.enableWorkedIronTools)
            ModLoader.addName(workedWorkedIronHandpick, "Reworked Iron Handpick");
        if(PropsHelperInfi2x2.enableSteelTools)
            ModLoader.addName(steelSteelHandpick, "Forge-Wrought Handpick");
        if(PropsHelperInfi2x2.enableCobaltTools)
            ModLoader.addName(cobaltCobaltHandpick, "Beautiful Handpick");
        if(PropsHelperInfi2x2.enableArditeTools)
            ModLoader.addName(arditeArditeHandpick, "Rustic Handpick");
        if(PropsHelperInfi2x2.enableManyullynTools)
            ModLoader.addName(manyullynManyullynHandpick, "False-Prophetic Handpick");
        if(PropsHelperInfi2x2.enableUraniumTools)
            ModLoader.addName(uraniumUraniumHandpick, "Cancerous Handpick");
    }
    
    public static void registerInfiToolsRecipes()
    {
    	if(PropsHelperInfi2x2.enableWoodTools)
        {
            ModLoader.addRecipe(new ItemStack(woodWoodHandpick), new Object[] 
                    { recipe, '#', Block.planks, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneWoodHandpick), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneWoodHandpick), new Object[] 
                    { recipe, '#', Block.planks, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneWoodHandpick), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperWoodHandpick), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(iceWoodHandpick), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeWoodHandpick), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusWoodHandpick), new Object[] 
                    { recipe, '#', Block.planks, '|', mod_InfiBase.cactusRod });
        }
    	
        if(PropsHelperInfi2x2.enableStoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodStoneHandpick), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneStoneHandpick), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneStoneHandpick), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneStoneHandpick), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneStoneHandpick), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackStoneHandpick), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceStoneHandpick), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeStoneHandpick), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusStoneHandpick), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintStoneHandpick), new Object[] 
                    { recipe, '#', Block.cobblestone, '|', mod_InfiBase.flintRod });
            
            ModLoader.addRecipe(new ItemStack(woodStoneHandpick), new Object[] 
                    { recipe, '#', Block.stone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneStoneHandpick), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneStoneHandpick), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneStoneHandpick), new Object[] 
                    { recipe, '#', Block.stone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneStoneHandpick), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackStoneHandpick), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceStoneHandpick), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeStoneHandpick), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusStoneHandpick), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintStoneHandpick), new Object[] 
                    { recipe, '#', Block.stone, '|', mod_InfiBase.flintRod });
        }
        
        if(PropsHelperInfi2x2.enableIronTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodIronHandpick), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneIronHandpick), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironIronHandpick), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.ironRod });
            ModLoader.addRecipe(new ItemStack(boneIronHandpick), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneIronHandpick), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackIronHandpick), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneIronHandpick), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(cactusIronHandpick), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(copperIronHandpick), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeIronHandpick), new Object[] 
                    { recipe, '#', Item.ingotIron, '|', mod_InfiBase.bronzeRod });
        }
        
        if(PropsHelperInfi2x2.enableDiamondTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodDiamondHandpick), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneDiamondHandpick), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironDiamondHandpick), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.ironRod });
            ModLoader.addRecipe(new ItemStack(diamondDiamondHandpick), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(redstoneDiamondHandpick), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianDiamondHandpick), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneDiamondHandpick), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneDiamondHandpick), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(mossyDiamondHandpick), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackDiamondHandpick), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneDiamondHandpick), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(lavaDiamondHandpick), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(cactusDiamondHandpick), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintDiamondHandpick), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeDiamondHandpick), new Object[] 
                    { recipe, '#', Item.diamond, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(copperDiamondHandpick), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeDiamondHandpick), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedDiamondHandpick), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.workedIronRod });
            ModLoader.addRecipe(new ItemStack(steelDiamondHandpick), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.steelRod });
            ModLoader.addRecipe(new ItemStack(cobaltDiamondHandpick), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.cobaltRod });
            ModLoader.addRecipe(new ItemStack(arditeDiamondHandpick), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.arditeRod });
            ModLoader.addRecipe(new ItemStack(manyullynDiamondHandpick), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumDiamondHandpick), new Object[] 
                    { recipe, '#', Item.diamond, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfi2x2.enableRedstoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodRedstoneHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneRedstoneHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(ironRedstoneHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.ironRod });
            ModLoader.addRecipe(new ItemStack(redstoneRedstoneHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianRedstoneHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(sandstoneRedstoneHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneRedstoneHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneRedstoneHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperRedstoneHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(mossyRedstoneHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackRedstoneHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneRedstoneHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(iceRedstoneHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(lavaRedstoneHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(slimeRedstoneHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusRedstoneHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintRedstoneHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(copperRedstoneHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeRedstoneHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.bronzeRod });
            ModLoader.addRecipe(new ItemStack(workedRedstoneHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.workedIronRod });
            ModLoader.addRecipe(new ItemStack(uraniumRedstoneHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.redstoneCrystal, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfi2x2.enableObsidianTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodObsidianHandpick), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneObsidianHandpick), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(redstoneObsidianHandpick), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(obsidianObsidianHandpick), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneObsidianHandpick), new Object[] 
                    { recipe, '#', Block.obsidian, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneObsidianHandpick), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackObsidianHandpick), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneObsidianHandpick), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(iceObsidianHandpick), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(lavaObsidianHandpick), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(cactusObsidianHandpick), new Object[] 
                    { recipe, '#', Block.obsidian, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfi2x2.enableSandstoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSandstoneHandpick), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneSandstoneHandpick), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneSandstoneHandpick), new Object[] 
                    { recipe, '#', Block.sandStone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneSandstoneHandpick), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.boneRod });      
            ModLoader.addRecipe(new ItemStack(netherrackSandstoneHandpick), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceSandstoneHandpick), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeSandstoneHandpick), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusSandstoneHandpick), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintSandstoneHandpick), new Object[] 
                    { recipe, '#', Block.sandStone, '|', mod_InfiBase.flintRod });
        }
        
        if(PropsHelperInfi2x2.enableBoneTools)
        {
            ModLoader.addRecipe(new ItemStack(woodBoneHandpick), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(stoneBoneHandpick), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneBoneHandpick), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneBoneHandpick), new Object[] 
                    { recipe, '#', Item.bone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneBoneHandpick), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperBoneHandpick), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(netherrackBoneHandpick), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceBoneHandpick), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(cactusBoneHandpick), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintBoneHandpick), new Object[] 
                    { recipe, '#', Item.bone, '|', mod_InfiBase.flintRod });
        }
        
        if(PropsHelperInfi2x2.enablePaperTools)
        {
            ModLoader.addRecipe(new ItemStack(woodPaperHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(bonePaperHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(bonePaperHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperPaperHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(slimePaperHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusPaperHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.paperStack, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfi2x2.enableMossyTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodMossyHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneMossyHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(diamondMossyHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(redstoneMossyHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.redstoneRod });
            ModLoader.addRecipe(new ItemStack(boneMossyHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneMossyHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(mossyMossyHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackMossyHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneMossyHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(cactusMossyHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(blazeMossyHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynMossyHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumMossyHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.mossyStone, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfi2x2.enableNetherrackTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodNetherrackHandpick), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneNetherrackHandpick), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneNetherrackHandpick), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneNetherrackHandpick), new Object[] 
                    { recipe, '#', Block.netherrack, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneNetherrackHandpick), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperNetherrackHandpick), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(mossyNetherrackHandpick), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.mossyRod });
            ModLoader.addRecipe(new ItemStack(netherrackNetherrackHandpick), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceNetherrackHandpick), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeNetherrackHandpick), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusNetherrackHandpick), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintNetherrackHandpick), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(copperNetherrackHandpick), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeNetherrackHandpick), new Object[] 
                    { recipe, '#', Block.netherrack, '|', mod_InfiBase.bronzeRod });
        }
        
        if(PropsHelperInfi2x2.enableGlowstoneTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodGlowstoneHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(redstoneGlowstoneHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.redstoneRod });
        	ModLoader.addRecipe(new ItemStack(obsidianGlowstoneHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(boneGlowstoneHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneGlowstoneHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackGlowstoneHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(glowstoneGlowstoneHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.glowstoneRod });
            ModLoader.addRecipe(new ItemStack(iceGlowstoneHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeGlowstoneHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusGlowstoneHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.glowstoneCrystal, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfi2x2.enableIceTools)
        {
            ModLoader.addRecipe(new ItemStack(woodIceHandpick), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(boneIceHandpick), new Object[] 
                    { recipe, '#', Block.ice, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneIceHandpick), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperIceHandpick), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(iceIceHandpick), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeIceHandpick), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusIceHandpick), new Object[] 
                    { recipe, '#', Block.ice, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfi2x2.enableLavaTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondLavaHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(obsidianLavaHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(netherrackLavaHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(lavaLavaHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(flintLavaHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeLavaHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynLavaHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumLavaHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.lavaCrystal, '|', mod_InfiBase.uraniumRod });
        }
        
        if(PropsHelperInfi2x2.enableSlimeTools)
        {
            ModLoader.addRecipe(new ItemStack(woodSlimeHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneSlimeHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneSlimeHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneSlimeHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(paperSlimeHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.paperRod });
            ModLoader.addRecipe(new ItemStack(slimeSlimeHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusSlimeHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.slimeCrystal, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfi2x2.enableCactusTools)
        {
            ModLoader.addRecipe(new ItemStack(woodCactusHandpick), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.stick });
            ModLoader.addRecipe(new ItemStack(sandstoneCactusHandpick), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneCactusHandpick), new Object[] 
                    { recipe, '#', Block.cactus, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneCactusHandpick), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackCactusHandpick), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(iceCactusHandpick), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.iceRod });
            ModLoader.addRecipe(new ItemStack(slimeCactusHandpick), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusCactusHandpick), new Object[] 
                    { recipe, '#', Block.cactus, '|', mod_InfiBase.cactusRod });
        }
        
        if(PropsHelperInfi2x2.enableFlintTools)
        {
        	ModLoader.addRecipe(new ItemStack(woodFlintHandpick), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.stick });
        	ModLoader.addRecipe(new ItemStack(stoneFlintHandpick), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.stoneRod });
            ModLoader.addRecipe(new ItemStack(sandstoneFlintHandpick), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.sandstoneRod });
            ModLoader.addRecipe(new ItemStack(boneFlintHandpick), new Object[] 
                    { recipe, '#', Item.flint, '|', Item.bone });
            ModLoader.addRecipe(new ItemStack(boneFlintHandpick), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.boneRod });
            ModLoader.addRecipe(new ItemStack(netherrackFlintHandpick), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(slimeFlintHandpick), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.slimeRod });
            ModLoader.addRecipe(new ItemStack(cactusFlintHandpick), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.cactusRod });
            ModLoader.addRecipe(new ItemStack(flintFlintHandpick), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(copperFlintHandpick), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.copperRod });
            ModLoader.addRecipe(new ItemStack(bronzeFlintHandpick), new Object[] 
                    { recipe, '#', Item.flint, '|', mod_InfiBase.bronzeRod });
        }
        
        if(PropsHelperInfi2x2.enableBlazeTools)
        {
            ModLoader.addRecipe(new ItemStack(diamondBlazeHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.diamondRod });
            ModLoader.addRecipe(new ItemStack(obsidianBlazeHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.obsidianRod });
            ModLoader.addRecipe(new ItemStack(netherrackBlazeHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.netherrackRod });
            ModLoader.addRecipe(new ItemStack(lavaBlazeHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.lavaRod });
            ModLoader.addRecipe(new ItemStack(flintBlazeHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.flintRod });
            ModLoader.addRecipe(new ItemStack(blazeBlazeHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', Item.blazeRod });
            ModLoader.addRecipe(new ItemStack(manyullynBlazeHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.manyullynRod });
            ModLoader.addRecipe(new ItemStack(uraniumBlazeHandpick), new Object[] 
                    { recipe, '#', mod_InfiBase.blazeCrystal, '|', mod_InfiBase.uraniumRod });
        }
    }
    
    public static void addStoneTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodStoneHandpick), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
    	ModLoader.addRecipe(new ItemStack(stoneStoneHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(sandstoneStoneHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.sandstoneRod });
        ModLoader.addRecipe(new ItemStack(boneStoneHandpick), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneStoneHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackStoneHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(iceStoneHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeStoneHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusStoneHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintStoneHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.flintRod });
    }
    
    public static void addCopperTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodCopperHandpick), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneCopperHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneCopperHandpick), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCopperHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackCopperHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeCopperHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCopperHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintCopperHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.flintRod });
        ModLoader.addRecipe(new ItemStack(copperCopperHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
    }
    
    public static void addBronzeTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodBronzeHandpick), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneBronzeHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(boneBronzeHandpick), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneBronzeHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackBronzeHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(slimeBronzeHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusBronzeHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(flintBronzeHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.flintRod });
        ModLoader.addRecipe(new ItemStack(copperBronzeHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeBronzeHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
    }
    
    public static void addWorkedIronTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodWorkedIronHandpick), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneWorkedIronHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironWorkedIronHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondWorkedIronHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneWorkedIronHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianWorkedIronHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronHandpick), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneWorkedIronHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackWorkedIronHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneWorkedIronHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceWorkedIronHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeWorkedIronHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusWorkedIronHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeWorkedIronHandpick), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperWorkedIronHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeWorkedIronHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedWorkedIronHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelWorkedIronHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(uraniumWorkedIronHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addSteelTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodSteelHandpick), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneSteelHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironSteelHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondSteelHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneSteelHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianSteelHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneSteelHandpick), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneSteelHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackSteelHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneSteelHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(iceSteelHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.iceRod });
        ModLoader.addRecipe(new ItemStack(slimeSteelHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusSteelHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeSteelHandpick), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperSteelHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeSteelHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedSteelHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelSteelHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltSteelHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeSteelHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumSteelHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addCobaltTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodCobaltHandpick), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneCobaltHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironCobaltHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondCobaltHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneCobaltHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianCobaltHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneCobaltHandpick), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneCobaltHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeCobaltHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusCobaltHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeCobaltHandpick), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperCobaltHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeCobaltHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedCobaltHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelCobaltHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltCobaltHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeCobaltHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynCobaltHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumCobaltHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addArditeTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodArditeHandpick), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneArditeHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironArditeHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondArditeHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneArditeHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianArditeHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneArditeHandpick), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneArditeHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeArditeHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusArditeHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeArditeHandpick), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperArditeHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeArditeHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedArditeHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelArditeHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltArditeHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeArditeHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynArditeHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumArditeHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addManyullynTools(ItemStack stack)
    {
    	ModLoader.addRecipe(new ItemStack(woodManyullynHandpick), new Object[] 
                { recipe, '#', stack, '|', Item.stick });
        ModLoader.addRecipe(new ItemStack(stoneManyullynHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.stoneRod });
        ModLoader.addRecipe(new ItemStack(ironManyullynHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.ironRod });
        ModLoader.addRecipe(new ItemStack(diamondManyullynHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneManyullynHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(obsidianManyullynHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.obsidianRod });
        ModLoader.addRecipe(new ItemStack(boneManyullynHandpick), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneManyullynHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(slimeManyullynHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.slimeRod });
        ModLoader.addRecipe(new ItemStack(cactusManyullynHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cactusRod });
        ModLoader.addRecipe(new ItemStack(blazeManyullynHandpick), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(copperManyullynHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.copperRod });
        ModLoader.addRecipe(new ItemStack(bronzeManyullynHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.bronzeRod });
        ModLoader.addRecipe(new ItemStack(workedManyullynHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.workedIronRod });
        ModLoader.addRecipe(new ItemStack(steelManyullynHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.steelRod });
        ModLoader.addRecipe(new ItemStack(cobaltManyullynHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeManyullynHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(manyullynManyullynHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.manyullynRod });
        ModLoader.addRecipe(new ItemStack(uraniumManyullynHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
    public static void addUraniumTools(ItemStack stack)
    {
        ModLoader.addRecipe(new ItemStack(diamondUraniumHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.diamondRod });
        ModLoader.addRecipe(new ItemStack(redstoneUraniumHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.redstoneRod });
        ModLoader.addRecipe(new ItemStack(boneUraniumHandpick), new Object[] 
                { recipe, '#', stack, '|', Item.bone });
        ModLoader.addRecipe(new ItemStack(boneUraniumHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.boneRod });
        ModLoader.addRecipe(new ItemStack(netherrackUraniumHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.netherrackRod });
        ModLoader.addRecipe(new ItemStack(glowstoneUraniumHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.glowstoneRod });
        ModLoader.addRecipe(new ItemStack(lavaUraniumHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.lavaRod });
        ModLoader.addRecipe(new ItemStack(blazeUraniumHandpick), new Object[] 
                { recipe, '#', stack, '|', Item.blazeRod });
        ModLoader.addRecipe(new ItemStack(cobaltUraniumHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.cobaltRod });
        ModLoader.addRecipe(new ItemStack(arditeUraniumHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.arditeRod });
        ModLoader.addRecipe(new ItemStack(uraniumUraniumHandpick), new Object[] 
                { recipe, '#', stack, '|', mod_InfiBase.uraniumRod });
    }
    
	public static Item woodWoodHandpick;
	public static Item sandstoneWoodHandpick;
	public static Item boneWoodHandpick;
	public static Item paperWoodHandpick;
	public static Item iceWoodHandpick;
	public static Item slimeWoodHandpick;
	public static Item cactusWoodHandpick;
	
	public static Item woodStoneHandpick;
	public static Item stoneStoneHandpick;
	public static Item sandstoneStoneHandpick;
	public static Item boneStoneHandpick;
	public static Item netherrackStoneHandpick;
	public static Item iceStoneHandpick;
	public static Item slimeStoneHandpick;
	public static Item cactusStoneHandpick;
	public static Item flintStoneHandpick;
	
	public static Item woodIronHandpick;
	public static Item stoneIronHandpick;
	public static Item ironIronHandpick;
	public static Item boneIronHandpick;
	public static Item netherrackIronHandpick;
	public static Item glowstoneIronHandpick;
	public static Item cactusIronHandpick;
	public static Item copperIronHandpick;
	public static Item bronzeIronHandpick;
	
	public static Item woodDiamondHandpick;
	public static Item stoneDiamondHandpick;
	public static Item ironDiamondHandpick;
	public static Item diamondDiamondHandpick;
	public static Item redstoneDiamondHandpick;
	public static Item obsidianDiamondHandpick;
	public static Item boneDiamondHandpick;
	public static Item mossyDiamondHandpick;
	public static Item netherrackDiamondHandpick;
	public static Item glowstoneDiamondHandpick;
	public static Item lavaDiamondHandpick;
	public static Item cactusDiamondHandpick;
	public static Item flintDiamondHandpick;
	public static Item blazeDiamondHandpick;
	public static Item copperDiamondHandpick;
	public static Item bronzeDiamondHandpick;
	public static Item workedDiamondHandpick;
	public static Item steelDiamondHandpick;
	public static Item cobaltDiamondHandpick;
	public static Item arditeDiamondHandpick;
	public static Item manyullynDiamondHandpick;
	public static Item uraniumDiamondHandpick;
	
	public static Item woodRedstoneHandpick;
	public static Item stoneRedstoneHandpick;
	public static Item ironRedstoneHandpick;
	public static Item redstoneRedstoneHandpick;
	public static Item obsidianRedstoneHandpick;
	public static Item sandstoneRedstoneHandpick;
	public static Item boneRedstoneHandpick;
	public static Item paperRedstoneHandpick;
	public static Item mossyRedstoneHandpick;
	public static Item netherrackRedstoneHandpick;
	public static Item glowstoneRedstoneHandpick;
	public static Item iceRedstoneHandpick;
	public static Item lavaRedstoneHandpick;
	public static Item slimeRedstoneHandpick;
	public static Item cactusRedstoneHandpick;
	public static Item flintRedstoneHandpick;
	public static Item copperRedstoneHandpick;
	public static Item bronzeRedstoneHandpick;
	public static Item workedRedstoneHandpick;
	public static Item uraniumRedstoneHandpick;
	
	public static Item woodObsidianHandpick;
	public static Item stoneObsidianHandpick;
	public static Item redstoneObsidianHandpick;
	public static Item obsidianObsidianHandpick;
	public static Item boneObsidianHandpick;
	public static Item netherrackObsidianHandpick;
	public static Item glowstoneObsidianHandpick;
	public static Item iceObsidianHandpick;
	public static Item lavaObsidianHandpick;
	public static Item cactusObsidianHandpick;
	
	public static Item woodSandstoneHandpick;
	public static Item sandstoneSandstoneHandpick;
	public static Item boneSandstoneHandpick;
	public static Item netherrackSandstoneHandpick;
	public static Item iceSandstoneHandpick;
	public static Item slimeSandstoneHandpick;
	public static Item cactusSandstoneHandpick;
	public static Item flintSandstoneHandpick;
	
	public static Item woodBoneHandpick;
	public static Item stoneBoneHandpick;
	public static Item sandstoneBoneHandpick;
	public static Item boneBoneHandpick;
	public static Item paperBoneHandpick;
	public static Item netherrackBoneHandpick;
	public static Item iceBoneHandpick;
	public static Item cactusBoneHandpick;
	public static Item flintBoneHandpick;
	
	public static Item woodPaperHandpick;
	public static Item bonePaperHandpick;
	public static Item paperPaperHandpick;
	public static Item slimePaperHandpick;
	public static Item cactusPaperHandpick;
	
	public static Item woodMossyHandpick;
	public static Item stoneMossyHandpick;
	public static Item diamondMossyHandpick;
	public static Item redstoneMossyHandpick;
	public static Item boneMossyHandpick;
	public static Item mossyMossyHandpick;
	public static Item netherrackMossyHandpick;
	public static Item glowstoneMossyHandpick;
	public static Item cactusMossyHandpick;
	public static Item blazeMossyHandpick;
	public static Item manyullynMossyHandpick;
	public static Item uraniumMossyHandpick;
	
	public static Item woodNetherrackHandpick;
	public static Item stoneNetherrackHandpick;
	public static Item sandstoneNetherrackHandpick;
	public static Item boneNetherrackHandpick;
	public static Item paperNetherrackHandpick;
	public static Item mossyNetherrackHandpick;
	public static Item netherrackNetherrackHandpick;
	public static Item iceNetherrackHandpick;
	public static Item slimeNetherrackHandpick;
	public static Item cactusNetherrackHandpick;
	public static Item flintNetherrackHandpick;
	public static Item copperNetherrackHandpick;
	public static Item bronzeNetherrackHandpick;
	
	public static Item woodGlowstoneHandpick;
	public static Item redstoneGlowstoneHandpick;
	public static Item obsidianGlowstoneHandpick;
	public static Item boneGlowstoneHandpick;
	public static Item netherrackGlowstoneHandpick;
	public static Item glowstoneGlowstoneHandpick;
	public static Item iceGlowstoneHandpick;
	public static Item slimeGlowstoneHandpick;
	public static Item cactusGlowstoneHandpick;
	
	public static Item woodIceHandpick;
	public static Item boneIceHandpick;
	public static Item paperIceHandpick;
	public static Item iceIceHandpick;
	public static Item slimeIceHandpick;
	public static Item cactusIceHandpick;
	
	public static Item diamondLavaHandpick;
	public static Item obsidianLavaHandpick;
	public static Item netherrackLavaHandpick;
	public static Item lavaLavaHandpick;
	public static Item flintLavaHandpick;
	public static Item blazeLavaHandpick;
	public static Item manyullynLavaHandpick;
	public static Item uraniumLavaHandpick;
	
	public static Item woodSlimeHandpick;
	public static Item sandstoneSlimeHandpick;
	public static Item boneSlimeHandpick;
	public static Item paperSlimeHandpick;
	public static Item slimeSlimeHandpick;
	public static Item cactusSlimeHandpick;
	
	public static Item woodCactusHandpick;
	public static Item sandstoneCactusHandpick;
	public static Item boneCactusHandpick;
	public static Item netherrackCactusHandpick;
	public static Item iceCactusHandpick;
	public static Item slimeCactusHandpick;
	public static Item cactusCactusHandpick;
	
	public static Item woodFlintHandpick;
	public static Item stoneFlintHandpick;
	public static Item sandstoneFlintHandpick;
	public static Item boneFlintHandpick;
	public static Item netherrackFlintHandpick;
	public static Item slimeFlintHandpick;
	public static Item cactusFlintHandpick;
	public static Item flintFlintHandpick;
	public static Item copperFlintHandpick;
	public static Item bronzeFlintHandpick;
	
	public static Item diamondBlazeHandpick;
	public static Item obsidianBlazeHandpick;
	public static Item netherrackBlazeHandpick;
	public static Item lavaBlazeHandpick;
	public static Item flintBlazeHandpick;
	public static Item blazeBlazeHandpick;
	public static Item manyullynBlazeHandpick;
	public static Item uraniumBlazeHandpick;
	
	public static Item woodCopperHandpick;
	public static Item stoneCopperHandpick;
    public static Item boneCopperHandpick;
    public static Item netherrackCopperHandpick;
    public static Item slimeCopperHandpick;
    public static Item cactusCopperHandpick;
    public static Item flintCopperHandpick;
    public static Item copperCopperHandpick;
    
    public static Item woodBronzeHandpick;
    public static Item stoneBronzeHandpick;
    public static Item boneBronzeHandpick;
    public static Item netherrackBronzeHandpick;
    public static Item slimeBronzeHandpick;
    public static Item cactusBronzeHandpick;
    public static Item flintBronzeHandpick;
    public static Item copperBronzeHandpick;
    public static Item bronzeBronzeHandpick;
    
    public static Item woodWorkedIronHandpick;
    public static Item stoneWorkedIronHandpick;
    public static Item ironWorkedIronHandpick;
    public static Item diamondWorkedIronHandpick;
    public static Item redstoneWorkedIronHandpick;
    public static Item obsidianWorkedIronHandpick;
    public static Item boneWorkedIronHandpick;
    public static Item netherrackWorkedIronHandpick;
    public static Item glowstoneWorkedIronHandpick;
    public static Item iceWorkedIronHandpick;
    public static Item slimeWorkedIronHandpick;
    public static Item cactusWorkedIronHandpick;
    public static Item blazeWorkedIronHandpick;
    public static Item copperWorkedIronHandpick;
    public static Item bronzeWorkedIronHandpick;
    public static Item workedWorkedIronHandpick;
    public static Item steelWorkedIronHandpick;
    public static Item uraniumWorkedIronHandpick;
    
    public static Item woodSteelHandpick;
    public static Item stoneSteelHandpick;
    public static Item ironSteelHandpick;
    public static Item diamondSteelHandpick;
    public static Item redstoneSteelHandpick;
    public static Item obsidianSteelHandpick;
    public static Item boneSteelHandpick;
    public static Item netherrackSteelHandpick;
    public static Item glowstoneSteelHandpick;
    public static Item iceSteelHandpick;
    public static Item slimeSteelHandpick;
    public static Item cactusSteelHandpick;
    public static Item blazeSteelHandpick;
    public static Item copperSteelHandpick;
    public static Item bronzeSteelHandpick;
    public static Item workedSteelHandpick;
    public static Item steelSteelHandpick;
    public static Item cobaltSteelHandpick;
    public static Item arditeSteelHandpick;
    public static Item uraniumSteelHandpick;
    
    public static Item woodCobaltHandpick;
    public static Item stoneCobaltHandpick;
    public static Item ironCobaltHandpick;
    public static Item diamondCobaltHandpick;
    public static Item redstoneCobaltHandpick;
    public static Item obsidianCobaltHandpick;
    public static Item boneCobaltHandpick;
    public static Item slimeCobaltHandpick;
    public static Item cactusCobaltHandpick;
    public static Item blazeCobaltHandpick;
    public static Item copperCobaltHandpick;
    public static Item bronzeCobaltHandpick;
    public static Item workedCobaltHandpick;
    public static Item steelCobaltHandpick;
    public static Item cobaltCobaltHandpick;
    public static Item arditeCobaltHandpick;
    public static Item manyullynCobaltHandpick;
    public static Item uraniumCobaltHandpick;
    
    public static Item woodArditeHandpick;
    public static Item stoneArditeHandpick;
    public static Item ironArditeHandpick;
    public static Item diamondArditeHandpick;
    public static Item redstoneArditeHandpick;
    public static Item obsidianArditeHandpick;
    public static Item boneArditeHandpick;
    public static Item slimeArditeHandpick;
    public static Item cactusArditeHandpick;
    public static Item blazeArditeHandpick;
    public static Item copperArditeHandpick;
    public static Item bronzeArditeHandpick;
    public static Item workedArditeHandpick;
    public static Item steelArditeHandpick;
    public static Item cobaltArditeHandpick;
    public static Item arditeArditeHandpick;
    public static Item manyullynArditeHandpick;
    public static Item uraniumArditeHandpick;
    
    public static Item woodManyullynHandpick;
    public static Item stoneManyullynHandpick;
    public static Item ironManyullynHandpick;
    public static Item diamondManyullynHandpick;
    public static Item redstoneManyullynHandpick;
    public static Item obsidianManyullynHandpick;
    public static Item boneManyullynHandpick;
    public static Item slimeManyullynHandpick;
    public static Item cactusManyullynHandpick;
    public static Item blazeManyullynHandpick;
    public static Item copperManyullynHandpick;
    public static Item bronzeManyullynHandpick;
    public static Item workedManyullynHandpick;
    public static Item steelManyullynHandpick;
    public static Item cobaltManyullynHandpick;
    public static Item arditeManyullynHandpick;
    public static Item manyullynManyullynHandpick;
    public static Item uraniumManyullynHandpick;
    
    public static Item diamondUraniumHandpick;
    public static Item redstoneUraniumHandpick;
    public static Item boneUraniumHandpick;
    public static Item netherrackUraniumHandpick;
    public static Item glowstoneUraniumHandpick;
    public static Item lavaUraniumHandpick;
    public static Item blazeUraniumHandpick;
    public static Item cobaltUraniumHandpick;
    public static Item arditeUraniumHandpick;
    public static Item uraniumUraniumHandpick;
}
