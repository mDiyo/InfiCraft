package net.minecraft.src;

import net.minecraft.src.forge.*;
import net.minecraft.src.orizon.*;
//import net.minecraft.src.orizondim.*;
import java.io.File;
import java.util.*;

public class mod_Orizon extends NetworkMod
{

    public String getVersion()
    {
        return "v1.0.6";
    }

    public mod_Orizon()
    {
    	OrizonRecipes.addRecipes();
        OrizonRecipes.addNames();
        //DimensionManager.registerDimension(7, new WorldProviderOrizon(), true);
        
        /*ModLoader.registerBlock(warpPlank);
        ModLoader.addName(warpPlank, "Reality-warping Plank");
        ModLoader.addRecipe(new ItemStack(warpPlank, 1), new Object[] {
            "p ", " p", 'p', Block.planks //Planks in shears pattern
        });*/
        
        registerBlocks();
        registerOres();
        registerTools();
        addInfiBlockSupport();
        oreDictionarySupport();
    }
    
    public void registerBlocks() {
    	ModLoader.registerBlock(mineralOre, net.minecraft.src.orizon.MineralOreItem.class);
        ModLoader.registerBlock(mineralOreHigh, net.minecraft.src.orizon.MineralOreHighItem.class);
        ModLoader.registerBlock(mineralOreLow1, net.minecraft.src.orizon.MineralOreMediumItem.class);
        ModLoader.registerBlock(mineralOreLow2, net.minecraft.src.orizon.MineralOreLowItem.class);
        ModLoader.registerBlock(mineralOreLow3, net.minecraft.src.orizon.MineralOreDarkItem.class);
        
        ModLoader.registerBlock(mineralOreAlt, net.minecraft.src.orizon.MineralOreAltItem.class);
        ModLoader.registerBlock(mineralOreAltHigh, net.minecraft.src.orizon.MineralOreAltHighItem.class);
        ModLoader.registerBlock(mineralOreAltLow1, net.minecraft.src.orizon.MineralOreAltMediumItem.class);
        ModLoader.registerBlock(mineralOreAltLow2, net.minecraft.src.orizon.MineralOreAltLowItem.class);
        ModLoader.registerBlock(mineralOreAltLow3, net.minecraft.src.orizon.MineralOreAltDarkItem.class);
        
        ModLoader.registerBlock(gemOre, net.minecraft.src.orizon.GemOreItem.class);
        ModLoader.registerBlock(gemOreHigh, net.minecraft.src.orizon.GemOreHighItem.class);
        ModLoader.registerBlock(gemOreLow1, net.minecraft.src.orizon.GemOreMediumItem.class);
        ModLoader.registerBlock(gemOreLow2, net.minecraft.src.orizon.GemOreLowItem.class);
        ModLoader.registerBlock(gemOreLow3, net.minecraft.src.orizon.GemOreDarkItem.class);
        
        ModLoader.registerBlock(cStone, net.minecraft.src.orizon.ColoredStoneItem.class);
        ModLoader.registerBlock(cCobble, net.minecraft.src.orizon.ColoredCobblestoneItem.class);
        ModLoader.registerBlock(cBrick, net.minecraft.src.orizon.ColoredBrickItem.class);
        ModLoader.registerBlock(cMossy, net.minecraft.src.orizon.ColoredMossyBrickItem.class);
        ModLoader.registerBlock(cCracked, net.minecraft.src.orizon.ColoredCrackedBrickItem.class);
        ModLoader.registerBlock(cTile, net.minecraft.src.orizon.ColoredTileItem.class);
        ModLoader.registerBlock(cFancy, net.minecraft.src.orizon.ColoredFancyBrickItem.class);
        ModLoader.registerBlock(cSquare, net.minecraft.src.orizon.ColoredSquareBrickItem.class);
        
        ModLoader.registerBlock(calciteOre, net.minecraft.src.orizon.CalciteOreItem.class);
        ModLoader.registerBlock(netherOre, net.minecraft.src.orizon.NetherOreItem.class);
        ModLoader.registerBlock(marble, net.minecraft.src.orizon.MarbleItem.class);
        ModLoader.registerBlock(replaceOre, net.minecraft.src.orizon.OreReplacementItem.class);
        ModLoader.registerBlock(replaceMetal, net.minecraft.src.orizon.OreReplacementMetalItem.class);
        ModLoader.registerBlock(slimeStill);
        ModLoader.registerBlock(slimeFlowing);
        ModLoader.registerBlock(slimeGelBlock);
    }
    
    public void registerOres() {
    	Block oreArray[] = {
                mineralOre, mineralOreAlt, mineralOreHigh, mineralOreAltHigh, mineralOreLow1, 
                mineralOreAltLow1, mineralOreLow2, mineralOreAltLow2, mineralOreLow3, mineralOreAltLow3, 
        };
        
        int oreLevelArray[] = {
            2, 1, 2, 1, 2, 1, 1, 2, 3, 3, 3, 2, 3, 3
        };
        
        String oreNames[] = {
                "oreCopper", "oreTurquoise", "oreChalcocite", "oreCassiterite", "oreTin", 
                "oreZincBloom", "oreSphalerite", "oreCerussite", "oreCobalt", "oreArdite", 
                "oreMyuvil", "oreGalena", "oreIvymetal", "oreAggregate"
        };
        
        String ingotNames[] =
            {
                "ingotCopper", "ingotTin", "ingotZinc", "ingotCobalt", "ingotArdite", "ingotIvymetal",
                "ingotBronze", "ingotBrass", "ingotCordite", "ingotRootedCobalt", "ingotManyullyn",
                "ingotRefinedIron", "ingotSteel", "ingotLead", "ingotElectrum"
            };
        
        String netherOreNames[] = {
        		"oreBloodbite", "oreGrudge", "oreWistful", "oreFlamelash", "oreTears", "oreOnyx"
        };
        
        String netherIngotNames[] = {
        		"ingotBloodbite", "ingotGrudge", "ingotWistful", "ingotFlamelash", "ingotTears", "ingotOnyx"
        };
        
        String gemNames[] = {
        	"gemRuby", "gemEmerald", "gemSapphire", "gemTopaz",
        	"gemAmethyst", "gemQuartz", "gemRoseQuartz", "gemRockCrystal"
        };
        
        for(int i = 0; i < oreArray.length; i++) {
            for(int j = 0; j < oreLevelArray.length; j++) {
                MinecraftForge.setBlockHarvestLevel(oreArray[i], j, "pickaxe", oreLevelArray[j]);
            }
        }
        
        for(int i = 0; i < oreArray.length; i++) {
            for(int j = 0; j < oreNames.length; j++) {
                MinecraftForge.registerOre(oreNames[j], new ItemStack(oreArray[i], 1, j));
            }
        }
        
        for (int i = 0; i < 4; i++)
        {
        	MinecraftForge.registerOre("customCobblestone", new ItemStack(cCobble, 1, i));
        	MinecraftForge.registerOre("customStone", new ItemStack(cStone, 1, i));
        }
        
        for(int i = 0; i< ingotNames.length; i++) {
        	MinecraftForge.registerOre(ingotNames[i], new ItemStack(ingots, 1, i));
        }
        
        for(int i = 0; i< netherOreNames.length; i++) {
        	MinecraftForge.registerOre(netherOreNames[i], new ItemStack(netherOre, 1, i));
        }
        
        for(int i = 0; i< netherIngotNames.length; i++) {
        	MinecraftForge.registerOre(netherIngotNames[i], new ItemStack(netherIngots, 1, i));
        }
        
        for(int i = 0; i < gemNames.length; i++) {
        	MinecraftForge.registerOre(gemNames[i], new ItemStack(gems, 1, i));
        }
        
        int replacementOreLevels[] = {
            0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2	
        };
           
        int replacementMetalLevels[] = {
        	1, 1, 1, 1, 2, 2, 2, 2
        };
        
        for (int i = 0; i < replacementOreLevels.length; i++)
        {
        	MinecraftForge.setBlockHarvestLevel(replaceOre, i, "pickaxe", replacementOreLevels[i]);
        }
        
        for (int i = 0; i < replacementMetalLevels.length; i++)
        {
        	MinecraftForge.setBlockHarvestLevel(replaceMetal, i, "pickaxe", replacementMetalLevels[i]);
        }
    }
    
    public static void registerTools() {
    	MinecraftForge.setToolClass(copperPickaxe, "pickaxe", 1);
    	MinecraftForge.setToolClass(bronzePickaxe, "pickaxe", 1);
    	MinecraftForge.setToolClass(refinedIronPickaxe, "pickaxe", 2);
    	MinecraftForge.setToolClass(steelPickaxe, "pickaxe", 3);
    	MinecraftForge.setToolClass(cobaltPickaxe, "pickaxe", 4);
    	MinecraftForge.setToolClass(arditePickaxe, "pickaxe", 4);
    	MinecraftForge.setToolClass(manyullynPickaxe, "pickaxe", 5);
    	
    	MinecraftForge.setToolClass(copperShovel, "shovel", 1);
    	MinecraftForge.setToolClass(bronzeShovel, "shovel", 1);
    	MinecraftForge.setToolClass(refinedIronShovel, "shovel", 2);
    	MinecraftForge.setToolClass(steelShovel, "shovel", 3);
    	MinecraftForge.setToolClass(cobaltShovel, "shovel", 4);
    	MinecraftForge.setToolClass(arditeShovel, "shovel", 4);
    	MinecraftForge.setToolClass(manyullynShovel, "shovel", 5);
    	
    	MinecraftForge.setToolClass(copperAxe, "axe", 1);
    	MinecraftForge.setToolClass(bronzeAxe, "axe", 1);
    	MinecraftForge.setToolClass(refinedIronAxe, "axe", 2);
    	MinecraftForge.setToolClass(steelAxe, "axe", 3);
    	MinecraftForge.setToolClass(cobaltAxe, "axe", 4);
    	MinecraftForge.setToolClass(arditeAxe, "axe", 4);
    	MinecraftForge.setToolClass(manyullynAxe, "axe", 5);
    }
    
    public static void oreDictionarySupport()
    {
        MinecraftForge.registerOreHandler(new IOreHandler()
        {
            public void registerOre(String ore, ItemStack itemstack)
            {
                if(ore.equals("ingotCopper"))
                {
                    OrizonRecipes.addCopperTools(itemstack);
                }
                if(ore.equals("ingotBronze"))
                {
                    OrizonRecipes.addBronzeTools(itemstack);
                }
                if(ore.equals("ingotRefinedIron"))
                {
                    OrizonRecipes.addRefinedIronTools(itemstack);
                }
                if(ore.equals("ingotSteel"))
                {
                    OrizonRecipes.addSteelTools(itemstack);
                }
                if(ore.equals("ingotCobalt"))
                {
                    OrizonRecipes.addCobaltTools(itemstack);
                }
                if(ore.equals("ingotArdite"))
                {
                    OrizonRecipes.addArditeTools(itemstack);
                }
                if(ore.equals("ingotManyullyn"))
                {
                    OrizonRecipes.addManyullynTools(itemstack);
                }
            }
        } );
    }
    
    public void addInfiBlockSupport() {
        try
        {
            Class class1 = Class.forName("DetailManager");
            for(int i = 0; i < 16; i++) {
                DetailManager.getInstance().addDetailing(cStone, i, cBrick, i);
                DetailManager.getInstance().addDetailing(cBrick, i, cTile, i);
                DetailManager.getInstance().addDetailing(cTile, i, cFancy, i);
                DetailManager.getInstance().addDetailing(cFancy, i, cSquare, i);
            }
        } catch (Throwable throwable)
        {
            System.out.println("InfiBlock detailing failed! Reason:");
            System.out.println(throwable);
        }
        /*for(int i = 0; i < 16; i++) {
            DetailManager.getInstance().addDetailing(cStone, i, cBrick, i);
            DetailManager.getInstance().addDetailing(cBrick, i, cTile, i);
            DetailManager.getInstance().addDetailing(cTile, i, cFancy, i);
            DetailManager.getInstance().addDetailing(cFancy, i, cSquare, i);
        }*/
    }

    //public static Block warpPlank;
    
    @Override
    public void generateSurface(World world, Random random, int chunkX, int chunkZ)
    {
    	if(flatBedrock)
    		WorldGenStones.removeBedrock(world, random, chunkX, chunkZ);
        if(genCalcite)
            WorldGenStones.generateCalcite(world, random, chunkX, chunkZ);
        if(genMarble)
            WorldGenStones.generateMarble(world, random, chunkX, chunkZ);
        if(genSilt)
            WorldGenStones.generateSilt(world, random, chunkX, chunkZ);
        if(genGems)
            WorldGenStones.generateGems(world, random, chunkX, chunkZ);
        if(genStratifiedStone)
            WorldGenStones.generateStratifiedStone(world, random, chunkX, chunkZ);
        if(genSlimePools)
            WorldGenStones.generateSlimePool(world, random, chunkX, chunkZ);
        if(genColoredStone)
        	WorldGenStones.generateColoredStone(world, random, chunkX, chunkZ);
        WorldGenStones.generateOres(world, random, chunkX, chunkZ);
        WorldGenStones.replaceBedrock(world, random, chunkX, chunkZ);
    }
    
    @Override
    public void generateNether(World world, Random random, int chunkX, int chunkZ)
    {
        /*if(genAcidPools)
            WorldGenStones.generateAcidPool(world, random, chunkX, chunkZ);*/
        if(genNetherOre)
            WorldGenStones.generateNetherOres(world, random, chunkX, chunkZ);
    }

    public void load() {}
    
    public static InfiProps props;
    public static InfiProps spawnProps;
    
    public static Block mineralOre;
    public static Block mineralOreHigh;
    public static Block mineralOreLow1;
    public static Block mineralOreLow2;
    public static Block mineralOreLow3;
    
    public static Block mineralOreAlt;
    public static Block mineralOreAltHigh;
    public static Block mineralOreAltLow1;
    public static Block mineralOreAltLow2;
    public static Block mineralOreAltLow3;
    
    public static Block gemOre;
    public static Block gemOreHigh;
    public static Block gemOreLow1;
    public static Block gemOreLow2;
    public static Block gemOreLow3;
    
    public static Block calciteOre;
    public static Block netherOre;
    public static Block marble;
    
    public static int mineralOreID;
    public static int mineralOreHighID;
    public static int mineralOreLow1ID;
    public static int mineralOreLow2ID;
    public static int mineralOreLow3ID;
    
    public static int mineralOreAltID;
    public static int mineralOreAltHighID;
    public static int mineralOreAltLow1ID;
    public static int mineralOreAltLow2ID;
    public static int mineralOreAltLow3ID;
    
    public static int gemOreID;
    public static int gemOreHighID;
    public static int gemOreLow1ID;
    public static int gemOreLow2ID;
    public static int gemOreLow3ID;
    
    public static int calciteOreID;
    public static int netherOreID;
    public static int marbleID;
    
    public static Block cStone;
    public static Block cCobble;
    public static Block cBrick;
    public static Block cMossy;
    public static Block cCracked;
    public static Block cTile;
    public static Block cFancy;
    public static Block cSquare;
    
    public static int cStoneID;
    public static int cCobbleID;
    public static int cBrickID;
    public static int cMossyID;
    public static int cCrackedID;
    public static int cTileID;
    public static int cFancyID;
    public static int cSquareID;
    
    public static Block replaceOre;
    public static Block replaceMetal;
    public static Block silt;
    public static Block siltstone;
    
    public static int replaceOreID;
    public static int replaceMetalID;
    public static int siltID;
    public static int siltstoneID;
    
    public static boolean genCopper;
    public static boolean genTurquoise;
    public static boolean genChalcocite;
    public static boolean genCassiterite;
    public static boolean genTeallite;
    public static boolean genZinc;
    public static boolean genSphalerite;
    public static boolean genCerussite;
    public static boolean genCobalt;
    public static boolean genArdite;
    public static boolean genMyuvil;
    public static boolean genGalena;
    public static boolean genIvymetal;
    public static boolean genAggregate;
    
    public static Block slimeStill;
    public static Block slimeFlowing;
    public static Block acidStill;
    public static Block acidFlowing;
    public static Block slimeGelBlock;
    
    public static int slimePoolID;
    public static int slimeGelID;
    public static int acidPoolID;
    
    public static boolean genSlimePools;
    public static int slimePoolRarity;
    public static int slimePoolHeight;
    
    public static boolean genAcidPools;
    public static int acidPoolRarity;
    public static int acidPoolHeight;
    
    public static int copperRarity;
    public static int copperHeight;
    public static int turquoiseRarity;
    public static int turquoiseHeight;
    public static int chalcociteRarity;
    public static int chalcociteHeight;
    public static int cassiteriteRarity;
    public static int cassiteriteHeight;
    public static int tealliteRarity;
    public static int tealliteHeight;
    public static int zincBloomRarity;
    public static int zincBloomHeight;
    public static int sphaleriteRarity;
    public static int sphaleriteHeight;
    public static int cerussiteRarity;
    public static int cerussiteHeight;
    public static int cobaltRarity;
    public static int cobaltHeight;
    public static int arditeRarity;
    public static int arditeHeight;
    public static int myuvilRarity;
    public static int myuvilHeight;
    public static int galenaRarity;
    public static int galenaHeight;
    public static int ivymetalRarity;
    public static int ivymetalHeight;
    public static int aggregateRarity;
    public static int aggregateHeight;
    
    public static int coalRarity;
    public static int coalHeight;
    public static int ironRarity;
    public static int ironHeight;
    public static int goldRarity;
    public static int goldHeight;
    public static int diamondRarity;
    public static int diamondHeight;
    public static int lapisRarity;
    public static int lapisHeight;
    public static int redstoneRarity;
    public static int redstoneHeight;
    
    public static int rubyRarity;
    public static int rubyHeight;
    public static int emeraldRarity;
    public static int emeraldHeight;
    public static int sapphireRarity;
    public static int sapphireHeight;
    public static int amethystRarity;
    public static int amethystHeight;
    public static int topazRarity;
    public static int topazHeight;
    public static int quartzRarity;
    public static int quartzHeight;
    public static int roseQuartzRarity;
    public static int roseQuartzHeight;
    public static int rockCrystalRarity;
    public static int rockCrystalHeight;
    
    public static int marbleRarity;
    public static int marbleHeight;
    public static int siltRarity;
    public static int siltHeight;
    public static int siltstoneRarity;
    public static int siltstoneHeight;
    
    public static int bloodbiteRarity;
    public static int bloodbiteHeight;
    public static int grudgestoneRarity;
    public static int grudgestoneHeight;
    public static int wistfulRarity;
    public static int wistfulHeight;
    public static int flamelashRarity;
    public static int flamelashHeight;
    public static int tearsRarity;
    public static int tearsHeight;
    public static int netherGoldRarity;
    public static int netherGoldHeight;
    
    public static boolean resolveConflicts;
    public static boolean genStratifiedStone;
    public static boolean genColoredStone;
    public static boolean genCalcite;
    public static boolean genMarble;
    public static boolean genNetherOre;
    public static boolean genSilt;
    public static boolean redoVanillaOres;
    public static boolean replaceOres;
    public static boolean genGems;
    public static boolean genNonUniqueGems;
    public static boolean flatBedrock;
    
    public static Item copperSword;
    public static Item copperPickaxe;
    public static Item copperAxe;
    public static Item copperShovel;
    public static Item copperHoe;
    public static Item bronzeSword;
    public static Item bronzePickaxe;
    public static Item bronzeAxe;
    public static Item bronzeShovel;
    public static Item bronzeHoe;
    public static Item refinedIronSword;
    public static Item refinedIronPickaxe;
    public static Item refinedIronAxe;
    public static Item refinedIronShovel;
    public static Item refinedIronHoe;
    public static Item steelSword;
    public static Item steelPickaxe;
    public static Item steelAxe;
    public static Item steelShovel;
    public static Item steelHoe;
    public static Item cobaltSword;
    public static Item cobaltPickaxe;
    public static Item cobaltAxe;
    public static Item cobaltShovel;
    public static Item cobaltHoe;
    public static Item arditeSword;
    public static Item arditePickaxe;
    public static Item arditeAxe;
    public static Item arditeShovel;
    public static Item arditeHoe;
    public static Item manyullynSword;
    public static Item manyullynPickaxe;
    public static Item manyullynAxe;
    public static Item manyullynShovel;
    public static Item manyullynHoe;
    
    public static int copperSwordID;
    public static int copperPickaxeID;
    public static int copperAxeID;
    public static int copperShovelID;
    public static int copperHoeID;
    public static int bronzeSwordID;
    public static int bronzePickaxeID;
    public static int bronzeAxeID;
    public static int bronzeShovelID;
    public static int bronzeHoeID;
    public static int refinedIronSwordID;
    public static int refinedIronPickaxeID;
    public static int refinedIronAxeID;
    public static int refinedIronShovelID;
    public static int refinedIronHoeID;
    public static int steelSwordID;
    public static int steelPickaxeID;
    public static int steelAxeID;
    public static int steelShovelID;
    public static int steelHoeID;
    public static int cobaltSwordID;
    public static int cobaltPickaxeID;
    public static int cobaltAxeID;
    public static int cobaltShovelID;
    public static int cobaltHoeID;
    public static int arditeSwordID;
    public static int arditePickaxeID;
    public static int arditeAxeID;
    public static int arditeShovelID;
    public static int arditeHoeID;
    public static int manyullynSwordID;
    public static int manyullynPickaxeID;
    public static int manyullynAxeID;
    public static int manyullynShovelID;
    public static int manyullynHoeID;
    
    public static Item ingots;
    public static Item netherIngots;
    public static Item gems;
    
    public static int ingotsID;
    public static int netherIngotsID;
    public static int gemsID;
    
    public static int coloredStoneRarity;
    public static int coloredStoneChance;
    public static int coloredStoneHeight;
    
    static EnumToolMaterial materialCopper = EnumHelper.addToolMaterial("ORIZONCOPPER", 1, 180, 5.0F, 1, 7);
    static EnumToolMaterial materialBronze = EnumHelper.addToolMaterial("ORIZONBRONZE", 1, 350, 5.5F, 1, 8);
    static EnumToolMaterial materialRefinedIron = EnumHelper.addToolMaterial("ORIZONREFINEDIRON", 2, 350, 6.0F, 2, 14);
    static EnumToolMaterial materialSteel = EnumHelper.addToolMaterial("ORIZONSTEEL", 3, 550, 7.0F, 2, 14);
    static EnumToolMaterial materialCobalt = EnumHelper.addToolMaterial("ORIZONCOBALT", 4, 800, 8.0F, 3, 12);
    static EnumToolMaterial materialArdite = EnumHelper.addToolMaterial("ORIZONARDITE", 4, 800, 8.0F, 3, 12);
    static EnumToolMaterial materialManyullyn = EnumHelper.addToolMaterial("ORIZONMANYULLYN", 5, 1200, 10.0F, 3, 12);

    public static File getMinecraftDir()
    {
        return new File(".");
    }
    
    static
    {
    	PropsHelperOrizon.initProps();
        
        /*if(resolveConflicts)
            PropsHelperOrizon.resolveIDs(props);*/
        
        cStone = new ColoredStone(cStoneID, 0).setHardness(Block.stone.getHardness()).setBlockName("Colored Stone");
        cCobble = new CustomBlockStone(cCobbleID, 16).setHardness(Block.cobblestone.getHardness()).setBlockName("Colored Cobblestone");
        cBrick = new CustomBlockStone(cBrickID, 32).setHardness(Block.stone.getHardness()).setBlockName("Colored Stone Brick");
        cMossy = new CustomBlockStone(cMossyID, 48).setHardness(Block.stone.getHardness()).setBlockName("Colored Moss Brick");
        cCracked = new CustomBlockStone(cCrackedID, 64).setHardness(Block.stone.getHardness()).setBlockName("Colored Cracked Brick");
        cTile = new CustomBlockStone(cTileID, 80).setHardness(Block.stone.getHardness()).setBlockName("Colored Tile");
        cFancy = new CustomBlockStone(cFancyID, 96).setHardness(Block.stone.getHardness()).setBlockName("Colored Fancy Brick");
        cSquare = new CustomBlockStone(cSquareID, 112).setHardness(Block.stone.getHardness()).setBlockName("Colored Square Brick");
        
        mineralOre = new MineralOre(mineralOreID, 32).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setBlockName("Mineral Ore");
        mineralOreHigh = new MineralOre(mineralOreHighID, 0).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setBlockName("Mineral Ore High");
        mineralOreLow1 = new MineralOre(mineralOreLow1ID, 64).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setBlockName("Mineral Ore Medium");
        mineralOreLow2 = new MineralOre(mineralOreLow2ID, 96).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setBlockName("Mineral Ore Low");
        mineralOreLow3 = new MineralOre(mineralOreLow3ID, 128).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setBlockName("Mineral Ore Dark");
        
        mineralOreAlt = new MineralOreAlt(mineralOreAltID, 48).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setBlockName("Mineral Ore Alt");
        mineralOreAltHigh = new MineralOreAlt(mineralOreAltHighID, 16).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setBlockName("Mineral Ore Alt High");
        mineralOreAltLow1 = new MineralOreAlt(mineralOreAltLow1ID, 80).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setBlockName("Mineral Ore Alt Medium");
        mineralOreAltLow2 = new MineralOreAlt(mineralOreAltLow2ID, 112).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setBlockName("Mineral Ore Alt Low");
        mineralOreAltLow3 = new MineralOreAlt(mineralOreAltLow3ID, 144).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setBlockName("Mineral Ore Alt Dark");
        
        gemOre = new GemOre(gemOreID, 16).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setBlockName("Gem Ore");
        gemOreHigh = new GemOre(gemOreHighID, 0).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setBlockName("Gem Ore High");
        gemOreLow1 = new GemOre(gemOreLow1ID, 32).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setBlockName("Gem Ore Medium");
        gemOreLow2 = new GemOre(gemOreLow2ID, 48).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setBlockName("Gem Ore Low");
        gemOreLow3 = new GemOre(gemOreLow3ID, 64).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setBlockName("Gem Ore Dark");
        
        calciteOre = new CalciteOre(calciteOreID, 160).setStepSound(Block.soundStoneFootstep).setHardness(1.0F).setBlockName("Calcite Ore");
        netherOre = new NetherOre(netherOreID, 167).setStepSound(Block.soundStoneFootstep).setHardness(1.0F).setBlockName("Nether Ore");
        marble = new Marble(marbleID, 176).setHardness(5F).setBlockName("Marble");

        replaceOre = new OreReplacement(replaceOreID, 208).setHardness(3F).setBlockName("Replacement Ore");
        replaceMetal = new OreReplacementMetal(replaceMetalID, 224).setHardness(3F).setBlockName("Replacement Metal Ore");
        
        slimeStill = new SlimeBlockStill(slimePoolID+1, 0, Material.water).setBlockName("Slime Pool");
        slimeFlowing = new SlimeBlockFlowing(slimePoolID, 0, Material.water).setBlockName("Slime Pool Flowing");
        slimeGelBlock = new SlimeGelBlock(slimeGelID, 32).setStepSound(Block.soundStoneFootstep).setHardness(1.5F).setBlockName("Slime Gel");
        /*acidStill = new LiquidBlockStill(acidPoolID+1, 3, Material.lava).setBlockName("Acid Pool");
        acidFlowing = new LiquidBlockFlowing(acidPoolID, 3, Material.lava).setBlockName("Acid Pool Flowing");*/
        
        ingots = new MultiIngot(ingotsID).setIconIndex(0).setItemName("orizonIngots");
        netherIngots = new MultiIngotNether(netherIngotsID).setIconIndex(16).setItemName("orizonNetherIngots");
        gems = new MultiGem(gemsID).setIconIndex(32).setItemName("orizonGems");
        
        copperSword = new OrizonToolSword(copperSwordID, materialCopper).setIconCoord(0, 3).setItemName("copperSword");
        copperPickaxe = new OrizonToolPickaxe(copperPickaxeID, materialCopper).setIconCoord(0, 5).setItemName("copperPickaxe");
        copperShovel = new OrizonToolShovel(copperShovelID, materialCopper).setIconCoord(0, 4).setItemName("copperShovel");
        copperAxe = new OrizonToolAxe(copperAxeID, materialCopper).setIconCoord(0, 6).setItemName("copperAxe");
        copperHoe = new OrizonToolPickaxe(copperHoeID, materialCopper).setIconCoord(0, 7).setItemName("copperHoe");
        
        bronzeSword = new OrizonToolSword(bronzeSwordID, materialBronze).setIconCoord(1, 3).setItemName("bronzeSword");
        bronzePickaxe = new OrizonToolPickaxe(bronzePickaxeID, materialBronze).setIconCoord(1, 5).setItemName("bronzePickaxe");
        bronzeShovel = new OrizonToolShovel(bronzeShovelID, materialBronze).setIconCoord(1, 4).setItemName("bronzeShovel");
        bronzeAxe = new OrizonToolAxe(bronzeAxeID, materialBronze).setIconCoord(1, 6).setItemName("bronzeAxe");
        bronzeHoe = new OrizonToolPickaxe(bronzeHoeID, materialBronze).setIconCoord(1, 7).setItemName("bronzeHoe");
        
        refinedIronSword = new OrizonToolSword(refinedIronSwordID, materialRefinedIron).setIconCoord(2, 3).setItemName("refinedIronSword");
        refinedIronPickaxe = new OrizonToolPickaxe(refinedIronPickaxeID, materialRefinedIron).setIconCoord(2, 5).setItemName("refinedIronPickaxe");
        refinedIronShovel = new OrizonToolShovel(refinedIronShovelID, materialRefinedIron).setIconCoord(2, 4).setItemName("refinedIronShovel");
        refinedIronAxe = new OrizonToolAxe(refinedIronAxeID, materialRefinedIron).setIconCoord(2, 6).setItemName("refinedIronAxe");
        refinedIronHoe = new OrizonToolPickaxe(refinedIronHoeID, materialRefinedIron).setIconCoord(2, 7).setItemName("refinedIronHoe");
        
        steelSword = new OrizonToolSword(steelSwordID, materialSteel).setIconCoord(3, 3).setItemName("steelSword");
        steelPickaxe = new OrizonToolPickaxe(steelPickaxeID, materialSteel).setIconCoord(3, 5).setItemName("steelPickaxe");
        steelShovel = new OrizonToolShovel(steelShovelID, materialSteel).setIconCoord(3, 4).setItemName("steelShovel");
        steelAxe = new OrizonToolAxe(steelAxeID, materialSteel).setIconCoord(3, 6).setItemName("steelAxe");
        steelHoe = new OrizonToolPickaxe(steelHoeID, materialSteel).setIconCoord(3, 7).setItemName("steelHoe");
        
        cobaltSword = new OrizonToolSword(cobaltSwordID, materialCobalt).setIconCoord(4, 3).setItemName("cobaltSword");
        cobaltPickaxe = new OrizonToolPickaxe(cobaltPickaxeID, materialCobalt).setIconCoord(4, 5).setItemName("cobaltPickaxe");
        cobaltShovel = new OrizonToolShovel(cobaltShovelID, materialCobalt).setIconCoord(4, 4).setItemName("cobaltShovel");
        cobaltAxe = new OrizonToolAxe(cobaltAxeID, materialCobalt).setIconCoord(4, 6).setItemName("cobaltAxe");
        cobaltHoe = new OrizonToolPickaxe(cobaltHoeID, materialCobalt).setIconCoord(4, 7).setItemName("cobaltHoe");
        
        arditeSword = new OrizonToolSword(arditeSwordID, materialArdite).setIconCoord(5, 3).setItemName("arditeSword");
        arditePickaxe = new OrizonToolPickaxe(arditePickaxeID, materialArdite).setIconCoord(5, 5).setItemName("arditePickaxe");
        arditeShovel = new OrizonToolShovel(arditeShovelID, materialArdite).setIconCoord(5, 4).setItemName("arditeShovel");
        arditeAxe = new OrizonToolPickaxe(arditeAxeID, materialArdite).setIconCoord(5, 6).setItemName("arditeAxe");
        arditeHoe = new OrizonToolPickaxe(arditeHoeID, materialArdite).setIconCoord(5, 7).setItemName("arditeHoe");
        
        manyullynSword = new OrizonToolSword(manyullynSwordID, materialManyullyn).setIconCoord(6, 3).setItemName("manyullynSword");
        manyullynPickaxe = new OrizonToolPickaxe(manyullynPickaxeID, materialManyullyn).setIconCoord(6, 5).setItemName("manyullynPickaxe");
        manyullynShovel = new OrizonToolShovel(manyullynShovelID, materialManyullyn).setIconCoord(6, 4).setItemName("manyullynShovel");
        manyullynAxe = new OrizonToolAxe(manyullynAxeID, materialManyullyn).setIconCoord(6, 6).setItemName("manyullynAxe");
        manyullynHoe = new OrizonToolHoe(manyullynHoeID, materialManyullyn).setIconCoord(6, 7).setItemName("manyullynHoe");
    }
    
    @Override
	public boolean clientSideRequired() {
		return true;
	}

	@Override
	public boolean serverSideRequired() {
		return false;
	}
}
