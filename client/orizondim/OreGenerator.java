package net.minecraft.src.orizondim;
import net.minecraft.src.orizon.*;
import net.minecraft.src.*;

import java.util.*;

public class OreGenerator 
{

	private static OreGenerator instance = new OreGenerator();
	
	public OreGenerator()	{
		copper = new OreGen(mod_Orizon.mineralOreID, 0, 12);
		turquoise = new OreGen(mod_Orizon.mineralOreID, 1, 8);
		chalcocite = new OreGen(mod_Orizon.mineralOreID, 2, 8);
		cassiterite = new OreGen(mod_Orizon.mineralOreID, 3, 7);
		teallite = new OreGen(mod_Orizon.mineralOreID, 4, 5);
		zincBloom = new OreGen(mod_Orizon.mineralOreID, 5, 9);
		sphalerite = new OreGen(mod_Orizon.mineralOreID, 6, 7);
		cerussite = new OreGen(mod_Orizon.mineralOreID, 7, 4);
		cobalt = new OreGen(mod_Orizon.mineralOreID, 8, 6);
		ardite = new OreGen(mod_Orizon.mineralOreID, 9, 6);
		myuvil = new OreGen(mod_Orizon.mineralOreID, 10, 6);
		galena = new OreGen(mod_Orizon.mineralOreID, 11, 12);
		chrysocolla = new OreGen(mod_Orizon.mineralOreID, 12, 2);
		aggregate = new OreGen(mod_Orizon.mineralOreID, 13, 8);
		
		copperA = new OreGen(mod_Orizon.mineralOreAltID, 0, 12);
		turquoiseA = new OreGen(mod_Orizon.mineralOreAltID, 1, 8);
		chalcociteA = new OreGen(mod_Orizon.mineralOreAltID, 2, 8);
		cassiteriteA = new OreGen(mod_Orizon.mineralOreAltID, 3, 7);
		tealliteA = new OreGen(mod_Orizon.mineralOreAltID, 4, 5);
		zincBloomA = new OreGen(mod_Orizon.mineralOreAltID, 5, 9);
		sphaleriteA = new OreGen(mod_Orizon.mineralOreAltID, 6, 7);
		cerussiteA = new OreGen(mod_Orizon.mineralOreAltID, 7, 4);
		cobaltA = new OreGen(mod_Orizon.mineralOreAltID, 8, 6);
		arditeA = new OreGen(mod_Orizon.mineralOreAltID, 9, 6);
		myuvilA = new OreGen(mod_Orizon.mineralOreAltID, 10, 6);
		galenaA = new OreGen(mod_Orizon.mineralOreAltID, 11, 12);
		chrysocollaA = new OreGen(mod_Orizon.mineralOreAltID, 12, 2);
		aggregateA = new OreGen(mod_Orizon.mineralOreAltID, 13, 8);
		
		copperS = new OreGenStratified(0, 12, false);
		turquoiseS = new OreGenStratified(1, 8, false);
		chalcociteS = new OreGenStratified(2, 8, false);
		cassiteriteS = new OreGenStratified(3, 7, false);
		tealliteS = new OreGenStratified(4, 5, false);
		zincBloomS = new OreGenStratified(5, 9, false);
		sphaleriteS = new OreGenStratified(6, 7, false);
		cerussiteS = new OreGenStratified(7, 4, false);
		cobaltS = new OreGenStratified(8, 6, false);
		arditeS = new OreGenStratified(9, 6, false);
		myuvilS = new OreGenStratified(10, 6, false);
		galenaS = new OreGenStratified(11, 12, false);
		chrysocollaS = new OreGenStratified(12, 2, false);
		aggregateS = new OreGenStratified(13, 8, false);
		
		copperSA = new OreGenStratified(0, 12, true);
		turquoiseSA = new OreGenStratified(1, 8, true);
		chalcociteSA = new OreGenStratified(2, 8, true);
		cassiteriteSA = new OreGenStratified(3, 7, true);
		tealliteSA = new OreGenStratified(4, 5, true);
		zincBloomSA = new OreGenStratified(5, 9, true);
		sphaleriteSA = new OreGenStratified(6, 7, true);
		cerussiteSA = new OreGenStratified(7, 4, true);
		cobaltSA = new OreGenStratified(8, 6, true);
		arditeSA = new OreGenStratified(9, 6, true);
		myuvilSA = new OreGenStratified(10, 6, true);
		galenaSA = new OreGenStratified(11, 12, true);
		chrysocollaSA = new OreGenStratified(12, 2, true);
		aggregateSA = new OreGenStratified(13, 8, true);
		
		redoCoal = new OreGen(Block.oreCoal.blockID, 0, 16);
		redoIron = new OreGen(Block.oreIron.blockID, 0, 8);
		redoGold = new OreGen(Block.oreGold.blockID, 0, 8);
		redoDiamond = new OreGen(Block.oreDiamond.blockID, 0, 7);
		redoLapis = new OreGen(Block.oreLapis.blockID, 0, 6);
		redoRedstone = new OreGen(Block.oreRedstone.blockID, 0, 7);
		
		redoCoalS = new OreGenVanilla(Block.oreCoal, mod_Orizon.replaceOre, 0, 16);
		redoIronS = new OreGenVanilla(Block.oreIron, mod_Orizon.replaceMetal, 0, 8);
		redoGoldS = new OreGenVanilla(Block.oreGold, mod_Orizon.replaceMetal, 4, 8);
		redoDiamondS = new OreGenVanilla(Block.oreDiamond, mod_Orizon.replaceOre, 4, 7);
		redoLapisS = new OreGenVanilla(Block.oreLapis, mod_Orizon.replaceOre, 8, 6);
		redoRedstoneS = new OreGenVanilla(Block.oreRedstone, mod_Orizon.replaceOre, 12, 7);
		
		calcite = new StoneGen(mod_Orizon.calciteOre.blockID, 0, 200);
	    galenaC = new OreGenCalcite(mod_Orizon.calciteOre.blockID, 1, 18);
	    cassiteriteC = new OreGenCalcite(mod_Orizon.calciteOre.blockID, 2, 7);
	    zincBloomC = new OreGenCalcite(mod_Orizon.calciteOre.blockID, 3, 9);
	    sphaleriteC = new OreGenCalcite(mod_Orizon.calciteOre.blockID, 4, 12);
	    chalcociteC = new OreGenCalcite(mod_Orizon.calciteOre.blockID, 5, 8);
	    
	    marbleWhite = new StoneGen(mod_Orizon.marble.blockID, 0, 40);
	    marbleBlack = new StoneGen(mod_Orizon.marble.blockID, 1, 40);
	    marbleRose = new StoneGen(mod_Orizon.marble.blockID, 2, 40);
	    marbleEmerald = new StoneGen(mod_Orizon.marble.blockID, 3, 40);
	    marbleAzure = new StoneGen(mod_Orizon.marble.blockID, 4, 40);
	    
	    ruby = new OreGen(mod_Orizon.gemOre.blockID, 0, 7);
	    emerald = new OreGen(mod_Orizon.gemOre.blockID, 1, 7);
	    sapphire = new OreGen(mod_Orizon.gemOre.blockID, 2, 7);
	    topaz = new OreGen(mod_Orizon.gemOre.blockID, 3, 7);
	    amethyst = new OreGen(mod_Orizon.gemOre.blockID, 4, 7);
	    quartz = new OreGen(mod_Orizon.gemOre.blockID, 5, 7);
	    roseQuartz = new OreGen(mod_Orizon.gemOre.blockID, 6, 7);
	    rockCrystal = new OreGen(mod_Orizon.gemOre.blockID, 7, 7);
	    
	    rubyS = new OreGenStratifiedGem(0, 7);
	    emeraldS = new OreGenStratifiedGem(1, 7);
	    sapphireS = new OreGenStratifiedGem(2, 7);
	    topazS = new OreGenStratifiedGem(3, 7);
	    amethystS = new OreGenStratifiedGem(4, 7);
	    quartzS = new OreGenStratifiedGem(5, 7);
	    roseQuartzS = new OreGenStratifiedGem(6, 7);
	    rockCrystalS = new OreGenStratifiedGem(7, 7);
	    
	    bloodbite = new OreGenNether(mod_Orizon.netherOre.blockID, 0, 8);
	    grudgestone = new OreGenNether(mod_Orizon.netherOre.blockID, 1, 4);
	    wistful = new OreGenNether(mod_Orizon.netherOre.blockID, 2, 7);
	    flamelash = new OreGenNether(mod_Orizon.netherOre.blockID, 3, 6);
	    tears = new OreGenNether(mod_Orizon.netherOre.blockID, 4, 4);
	    netherGold = new OreGenNether(mod_Orizon.netherOre.blockID, 5, 8);
	    
	    slimepool = new WorldGenSlimePools(mod_Orizon.slimePoolID);
	    acidpool = new WorldGenSlimePools(mod_Orizon.acidPoolID);
	    
	    coloredStone = new StoneGenColor(mod_Orizon.cStone.blockID, 20);
	}
	
	public static OreGenerator getInstance() {
		return instance;
	}
			
	public static void generateOres(World world, Random rand, int chunkX, int chunkZ)
	{
		if(PropsHelperOrizon.dimensiongenStratifiedStone) {
			if(PropsHelperOrizon.dimensiongenCopper) {
				int copperChunk = rand.nextInt(PropsHelperOrizon.dimensioncopperRarity) + (PropsHelperOrizon.dimensioncopperRarity / 2);
				generateStratifiedVein(world, rand, chunkX, chunkZ, copperS, copperSA, copperChunk, PropsHelperOrizon.dimensioncopperHeight);
			}
			if(PropsHelperOrizon.dimensiongenTurquoise) {
				int turquoiseChunk = rand.nextInt(PropsHelperOrizon.dimensionturquoiseRarity) + (PropsHelperOrizon.dimensionturquoiseRarity / 2);
				generateStratifiedVein(world, rand, chunkX, chunkZ, turquoiseS, turquoiseSA, turquoiseChunk, PropsHelperOrizon.dimensionturquoiseHeight);
			}
			if(PropsHelperOrizon.dimensiongenChalcocite) {
				int chalcociteChunk = rand.nextInt(PropsHelperOrizon.dimensionchalcociteRarity) + (PropsHelperOrizon.dimensionchalcociteRarity / 2);
				generateStratifiedVein(world, rand, chunkX, chunkZ, chalcociteS, chalcociteSA, chalcociteChunk, PropsHelperOrizon.dimensionchalcociteHeight);
			}
			if(PropsHelperOrizon.dimensiongenCassiterite)
			{
				int cassiteriteChunk = rand.nextInt(PropsHelperOrizon.dimensioncassiteriteRarity) + (PropsHelperOrizon.dimensioncassiteriteRarity / 2);
				generateStratifiedVein(world, rand, chunkX, chunkZ, cassiteriteS, cassiteriteSA, cassiteriteChunk, PropsHelperOrizon.dimensioncassiteriteHeight);
			}
			if(PropsHelperOrizon.dimensiongenTeallite) {
				int tealliteChunk = rand.nextInt(PropsHelperOrizon.dimensiontealliteRarity) + (PropsHelperOrizon.dimensiontealliteRarity / 2);
				generateStratifiedVein(world, rand, chunkX, chunkZ, tealliteS, tealliteSA, tealliteChunk, PropsHelperOrizon.dimensiontealliteHeight);
			}
			if(PropsHelperOrizon.dimensiongenZinc) {
				int zincBloomChunk = rand.nextInt(PropsHelperOrizon.dimensionzincBloomRarity) + (PropsHelperOrizon.dimensionzincBloomRarity / 2);
				generateStratifiedVein(world, rand, chunkX, chunkZ, zincBloomS, zincBloomSA, zincBloomChunk, PropsHelperOrizon.dimensionzincBloomHeight);
			}
			if(PropsHelperOrizon.dimensiongenSphalerite) {
				int sphaleriteChunk = rand.nextInt(PropsHelperOrizon.dimensionsphaleriteRarity) + (PropsHelperOrizon.dimensionsphaleriteRarity / 2);
				generateStratifiedVein(world, rand, chunkX, chunkZ, sphaleriteS, sphaleriteSA, sphaleriteChunk, PropsHelperOrizon.dimensionsphaleriteHeight);
			}
			if(PropsHelperOrizon.dimensiongenCassiterite) {
				int cerussiteChunk = rand.nextInt(PropsHelperOrizon.dimensioncerussiteRarity) + (PropsHelperOrizon.dimensioncerussiteRarity / 2);
				generateStratifiedVein(world, rand, chunkX, chunkZ, cerussiteS, cerussiteSA, cerussiteChunk, PropsHelperOrizon.dimensioncerussiteHeight);
			}
			if(PropsHelperOrizon.dimensiongenCobalt) {
				int cobaltChunk = rand.nextInt(PropsHelperOrizon.dimensioncobaltRarity) + (PropsHelperOrizon.dimensioncobaltRarity / 2);
				generateStratifiedVein(world, rand, chunkX, chunkZ, cobaltS, cobaltSA, cobaltChunk, PropsHelperOrizon.dimensioncobaltHeight);
			}
			if(PropsHelperOrizon.dimensiongenArdite) {
				int arditeChunk = rand.nextInt(PropsHelperOrizon.dimensionarditeRarity) + (PropsHelperOrizon.dimensionarditeRarity / 2);
				generateStratifiedVein(world, rand, chunkX, chunkZ, arditeS, arditeSA, arditeChunk, PropsHelperOrizon.dimensionarditeHeight);
			}
			if(PropsHelperOrizon.dimensiongenMyuvil) {
				int myuvilChunk = rand.nextInt(PropsHelperOrizon.dimensionmyuvilRarity) + (PropsHelperOrizon.dimensionmyuvilRarity / 2);
				generateStratifiedVein(world, rand, chunkX, chunkZ, myuvilS, myuvilSA, myuvilChunk, PropsHelperOrizon.dimensionmyuvilHeight);
			}
			if(PropsHelperOrizon.dimensiongenGalena) {
				int galenaChunk = rand.nextInt(PropsHelperOrizon.dimensiongalenaRarity) + (PropsHelperOrizon.dimensiongalenaRarity / 2);
				generateStratifiedVein(world, rand, chunkX, chunkZ, galenaS, galenaSA, galenaChunk, PropsHelperOrizon.dimensiongalenaHeight);
			}
			if(PropsHelperOrizon.dimensiongenIvymetal) {
				int chrysocollaChunk = rand.nextInt(PropsHelperOrizon.dimensionivymetalRarity) + (PropsHelperOrizon.dimensionivymetalRarity / 2);
				generateStratifiedVein(world, rand, chunkX, chunkZ, chrysocollaS, chrysocollaSA, chrysocollaChunk, PropsHelperOrizon.dimensionivymetalHeight);
			}
			if(PropsHelperOrizon.dimensiongenAggregate) {
				int aggregateChunk = rand.nextInt(PropsHelperOrizon.dimensionaggregateRarity) + (PropsHelperOrizon.dimensionaggregateRarity / 2);
				generateStratifiedVein(world, rand, chunkX, chunkZ, aggregateS, aggregateSA, aggregateChunk, PropsHelperOrizon.dimensionaggregateHeight);
			}
			
		} else {
			if(PropsHelperOrizon.dimensiongenCopper) {
				int copperChunk = rand.nextInt(PropsHelperOrizon.dimensioncopperRarity) + (PropsHelperOrizon.dimensioncopperRarity / 2);
				generateVein(world, rand, chunkX, chunkZ, copper, copperA, copperChunk, PropsHelperOrizon.dimensioncopperHeight);
			}
			if(PropsHelperOrizon.dimensiongenTurquoise) {
				int turquoiseChunk = rand.nextInt(PropsHelperOrizon.dimensionturquoiseRarity) + (PropsHelperOrizon.dimensionturquoiseRarity / 2);
				generateVein(world, rand, chunkX, chunkZ, turquoise, turquoiseA, turquoiseChunk, PropsHelperOrizon.dimensionturquoiseHeight);
			}
			if(PropsHelperOrizon.dimensiongenChalcocite) {
				int chalcociteChunk = rand.nextInt(PropsHelperOrizon.dimensionchalcociteRarity) + (PropsHelperOrizon.dimensionchalcociteRarity / 2);
				generateVein(world, rand, chunkX, chunkZ, chalcocite, chalcociteA, chalcociteChunk, PropsHelperOrizon.dimensionchalcociteHeight);
			}
			if(PropsHelperOrizon.dimensiongenCassiterite) {
				int cassiteriteChunk = rand.nextInt(PropsHelperOrizon.dimensioncassiteriteRarity) + (PropsHelperOrizon.dimensioncassiteriteRarity / 2);
				generateVein(world, rand, chunkX, chunkZ, cassiterite, cassiteriteA, cassiteriteChunk, PropsHelperOrizon.dimensioncassiteriteHeight);
			}
			if(PropsHelperOrizon.dimensiongenTeallite) {
				int tealliteChunk = rand.nextInt(PropsHelperOrizon.dimensiontealliteRarity) + (PropsHelperOrizon.dimensiontealliteRarity / 2);
				generateVein(world, rand, chunkX, chunkZ, teallite, tealliteA, tealliteChunk, PropsHelperOrizon.dimensiontealliteHeight);
			}
			if(PropsHelperOrizon.dimensiongenZinc) {
				int zincBloomChunk = rand.nextInt(PropsHelperOrizon.dimensionzincBloomRarity) + (PropsHelperOrizon.dimensionzincBloomRarity / 2);
				generateVein(world, rand, chunkX, chunkZ, zincBloom, zincBloomA, zincBloomChunk, PropsHelperOrizon.dimensionzincBloomHeight);
			}
			if(PropsHelperOrizon.dimensiongenSphalerite) {
				int sphaleriteChunk = rand.nextInt(PropsHelperOrizon.dimensionsphaleriteRarity) + (PropsHelperOrizon.dimensionsphaleriteRarity / 2);
				generateVein(world, rand, chunkX, chunkZ, sphalerite, sphaleriteA, sphaleriteChunk, PropsHelperOrizon.dimensionsphaleriteHeight);
			}
			if(PropsHelperOrizon.dimensiongenCerussite) {
				int cerussiteChunk = rand.nextInt(PropsHelperOrizon.dimensioncerussiteRarity) + (PropsHelperOrizon.dimensioncerussiteRarity / 2);
				generateVein(world, rand, chunkX, chunkZ, cerussite, cerussiteA, cerussiteChunk, PropsHelperOrizon.dimensioncerussiteHeight);
			}
			if(PropsHelperOrizon.dimensiongenCobalt) {
				int cobaltChunk = rand.nextInt(PropsHelperOrizon.dimensioncobaltRarity) + (PropsHelperOrizon.dimensioncobaltRarity / 2);
				generateVein(world, rand, chunkX, chunkZ, cobalt, cobaltA, cobaltChunk, PropsHelperOrizon.dimensioncobaltHeight);
			}
			if(PropsHelperOrizon.dimensiongenArdite) {
				int arditeChunk = rand.nextInt(PropsHelperOrizon.dimensionarditeRarity) + (PropsHelperOrizon.dimensionarditeRarity / 2);
				generateVein(world, rand, chunkX, chunkZ, ardite, arditeA, arditeChunk, PropsHelperOrizon.dimensionarditeHeight);
			}
			if(PropsHelperOrizon.dimensiongenMyuvil) {
				int myuvilChunk = rand.nextInt(PropsHelperOrizon.dimensionmyuvilRarity) + (PropsHelperOrizon.dimensionmyuvilRarity / 2);
				generateVein(world, rand, chunkX, chunkZ, myuvil, myuvilA, myuvilChunk, PropsHelperOrizon.dimensionmyuvilHeight);
			}
			if(PropsHelperOrizon.dimensiongenGalena) {
				int galenaChunk = rand.nextInt(PropsHelperOrizon.dimensiongalenaRarity) + (PropsHelperOrizon.dimensiongalenaRarity / 2);
				generateVein(world, rand, chunkX, chunkZ, galena, galenaA, galenaChunk, PropsHelperOrizon.dimensiongalenaHeight);
			}
			if(PropsHelperOrizon.dimensiongenIvymetal) {
				int chrysocollaChunk = rand.nextInt(PropsHelperOrizon.dimensionivymetalRarity) + (PropsHelperOrizon.dimensionivymetalRarity / 2);
				generateVein(world, rand, chunkX, chunkZ, chrysocolla, chrysocollaA, chrysocollaChunk, PropsHelperOrizon.dimensionivymetalHeight);
			}
			if(PropsHelperOrizon.dimensiongenAggregate) {
				int aggregateChunk = rand.nextInt(PropsHelperOrizon.dimensionaggregateRarity) + (PropsHelperOrizon.dimensionaggregateRarity / 2);
				generateVein(world, rand, chunkX, chunkZ, aggregate, aggregateA, aggregateChunk, PropsHelperOrizon.dimensionaggregateHeight);
			}
		}		
	}
	
	public static void generateCalcite(World world, Random rand, int chunkX, int chunkZ)
	{
		if(rand.nextInt(20) == 0)
	    {
			int hi = rand.nextInt(64);
	        int randX = chunkX + rand.nextInt(16);
	        int randZ = chunkZ + rand.nextInt(16);
	        calcite.generate(world, rand, randX, hi, randZ);
	    }
		
		int galenaChunk = rand.nextInt(PropsHelperOrizon.dimensiongalenaRarity * 10) + (PropsHelperOrizon.dimensiongalenaRarity * 10 / 2);
		generateCalciteVein(world, rand, chunkX, chunkZ, galenaC, galenaChunk, PropsHelperOrizon.dimensiongalenaHeight);
		int cassiteriteChunk = rand.nextInt(PropsHelperOrizon.dimensioncassiteriteRarity * 5) + (PropsHelperOrizon.dimensioncassiteriteRarity * 5 / 2);
		generateCalciteVein(world, rand, chunkX, chunkZ, cassiteriteC, cassiteriteChunk, PropsHelperOrizon.dimensioncassiteriteHeight);
		int zincBloomChunk = rand.nextInt(PropsHelperOrizon.dimensionzincBloomRarity * 5) + (PropsHelperOrizon.dimensionzincBloomRarity * 5 / 2);
		generateCalciteVein(world, rand, chunkX, chunkZ, zincBloomC, zincBloomChunk, PropsHelperOrizon.dimensionzincBloomHeight);
		int sphaleriteChunk = rand.nextInt(PropsHelperOrizon.dimensionsphaleriteRarity * 5) + (PropsHelperOrizon.dimensionsphaleriteRarity * 5 / 2);
		generateCalciteVein(world, rand, chunkX, chunkZ, sphaleriteC, sphaleriteChunk, PropsHelperOrizon.dimensionsphaleriteHeight);
		int chalcociteChunk = rand.nextInt(PropsHelperOrizon.dimensionchalcociteRarity * 5) + (PropsHelperOrizon.dimensionchalcociteRarity * 5 / 2);
		generateCalciteVein(world, rand, chunkX, chunkZ, chalcociteC, chalcociteChunk, PropsHelperOrizon.dimensionchalcociteHeight);
	}
	
	public static void generateMarble(World world, Random rand, int chunkX,	int chunkZ) 
	{
		if(rand.nextInt(PropsHelperOrizon.dimensionmarbleRarity) == 0)
	    {
			int hi = rand.nextInt(PropsHelperOrizon.dimensionmarbleHeight);
	        int randX = chunkX + rand.nextInt(16);
	        int randZ = chunkZ + rand.nextInt(16);
	        marbleWhite.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleWhite.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleWhite.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleWhite.generate(world, rand, randX, hi, randZ);
	    }
		if(rand.nextInt(PropsHelperOrizon.dimensionmarbleRarity) == 0)
	    {
			int hi = rand.nextInt(PropsHelperOrizon.dimensionmarbleHeight);
	        int randX = chunkX + rand.nextInt(16);
	        int randZ = chunkZ + rand.nextInt(16);
	        marbleBlack.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleBlack.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleBlack.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleBlack.generate(world, rand, randX, hi, randZ);
	    }
		if(rand.nextInt(PropsHelperOrizon.dimensionmarbleRarity) == 0)
	    {
			int hi = rand.nextInt(PropsHelperOrizon.dimensionmarbleHeight);
	        int randX = chunkX + rand.nextInt(16);
	        int randZ = chunkZ + rand.nextInt(16);
	        marbleRose.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleRose.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleRose.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleRose.generate(world, rand, randX, hi, randZ);
	    }
		if(rand.nextInt(PropsHelperOrizon.dimensionmarbleRarity) == 0)
	    {
			int hi = rand.nextInt(PropsHelperOrizon.dimensionmarbleHeight);
	        int randX = chunkX + rand.nextInt(16);
	        int randZ = chunkZ + rand.nextInt(16);
	        marbleEmerald.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleEmerald.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleEmerald.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleEmerald.generate(world, rand, randX, hi, randZ);
	    }
		if(rand.nextInt(PropsHelperOrizon.dimensionmarbleRarity) == 0)
	    {
			int hi = rand.nextInt(PropsHelperOrizon.dimensionmarbleHeight);
	        int randX = chunkX + rand.nextInt(16);
	        int randZ = chunkZ + rand.nextInt(16);
	        marbleAzure.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleAzure.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleAzure.generate(world, rand, randX, hi, randZ);
	        hi = hi + rand.nextInt(8) - 4;
	        randX = randX + rand.nextInt(32) - 16;
	        randZ = randZ + rand.nextInt(32) - 16;
	        marbleAzure.generate(world, rand, randX, hi, randZ);
	    }
	}
	
	public static void generateGems(World world, Random rand, int chunkX,
			int chunkZ) {
		if(PropsHelperOrizon.dimensiongenStratifiedStone) {
			if(PropsHelperOrizon.dimensiongenNonUniqueGems) {
				if(rand.nextInt(2) == 0) {
					int rubyChunk = rand.nextInt(PropsHelperOrizon.dimensionrubyRarity*2) + (PropsHelperOrizon.dimensionrubyRarity / 2);
					generateStratifiedVeinGem(world, rand, chunkX, chunkZ, rubyS, rubyChunk, PropsHelperOrizon.dimensionrubyHeight);
				}
				if(rand.nextInt(2) == 0) {
					int emeraldChunk = rand.nextInt(PropsHelperOrizon.dimensionemeraldRarity*2) + (PropsHelperOrizon.dimensionemeraldRarity / 2);
					generateStratifiedVeinGem(world, rand, chunkX, chunkZ, emeraldS, emeraldChunk, PropsHelperOrizon.dimensionemeraldHeight);
				} 
				if(rand.nextInt(2) == 0) {
					int sapphireChunk = rand.nextInt(PropsHelperOrizon.dimensionsapphireRarity*2) + (PropsHelperOrizon.dimensionsapphireRarity / 2);
					generateStratifiedVeinGem(world, rand, chunkX, chunkZ, sapphireS, sapphireChunk, PropsHelperOrizon.dimensionsapphireHeight);
				}
			}
			if(rand.nextInt(2) == 0) {
				int topazChunk = rand.nextInt(PropsHelperOrizon.dimensiontopazRarity*2) + (PropsHelperOrizon.dimensiontopazRarity / 2);
				generateStratifiedVeinGem(world, rand, chunkX, chunkZ, topazS, topazChunk, PropsHelperOrizon.dimensiontopazHeight);
			}
			if(rand.nextInt(2) == 0) {
				int amethystChunk = rand.nextInt(PropsHelperOrizon.dimensionamethystRarity*2) + (PropsHelperOrizon.dimensionamethystRarity / 2);
				generateStratifiedVeinGem(world, rand, chunkX, chunkZ, amethystS, amethystChunk, PropsHelperOrizon.dimensionamethystHeight);
			}
			if(rand.nextInt(2) == 0) {
				int quartzChunk = rand.nextInt((int)(PropsHelperOrizon.dimensionquartzRarity * 1.5)) + (PropsHelperOrizon.dimensionquartzRarity / 2);
				generateStratifiedVeinGem(world, rand, chunkX, chunkZ, quartzS, quartzChunk, PropsHelperOrizon.dimensionquartzHeight);
			}
			if(rand.nextInt(2) == 0) {
				int roseQuartzChunk = rand.nextInt((int)(PropsHelperOrizon.dimensionroseQuartzRarity * 1.5)) + (PropsHelperOrizon.dimensionroseQuartzRarity / 2);
				generateStratifiedVeinGem(world, rand, chunkX, chunkZ, roseQuartzS, roseQuartzChunk, PropsHelperOrizon.dimensionroseQuartzHeight);
			}
			if(rand.nextInt(2) == 0) {
				int rockCrystalChunk = rand.nextInt((int)(PropsHelperOrizon.dimensionrockCrystalRarity * 1.5)) + (PropsHelperOrizon.dimensionrockCrystalRarity / 2);
				generateStratifiedVeinGem(world, rand, chunkX, chunkZ, rockCrystalS, rockCrystalChunk, PropsHelperOrizon.dimensionrockCrystalHeight);
			}
		} else {
			if(PropsHelperOrizon.dimensiongenNonUniqueGems) {
				if(rand.nextInt(2) == 0) {
					int rubyChunk = rand.nextInt(PropsHelperOrizon.dimensionrubyRarity*2+1) + (PropsHelperOrizon.dimensionrubyRarity / 2);
					generateSimpleVein(world, rand, chunkX, chunkZ, ruby, rubyChunk, PropsHelperOrizon.dimensionrubyHeight);
				}
				if(rand.nextInt(2) == 0) {
					int emeraldChunk = rand.nextInt(PropsHelperOrizon.dimensionemeraldRarity*2+1) + (PropsHelperOrizon.dimensionemeraldRarity / 2);
					generateSimpleVein(world, rand, chunkX, chunkZ, emerald, emeraldChunk, PropsHelperOrizon.dimensionemeraldHeight);
				}
				if(rand.nextInt(2) == 0) {
					int sapphireChunk = rand.nextInt(PropsHelperOrizon.dimensionsapphireRarity*2+1) + (PropsHelperOrizon.dimensionsapphireRarity / 2);
					generateSimpleVein(world, rand, chunkX, chunkZ, sapphire, sapphireChunk, PropsHelperOrizon.dimensionsapphireHeight);
				}
			}
			if(rand.nextInt(2) == 0) {
				int topazChunk = rand.nextInt(PropsHelperOrizon.dimensiontopazRarity*2+1) + (PropsHelperOrizon.dimensiontopazRarity / 2);
				generateSimpleVein(world, rand, chunkX, chunkZ, topaz, topazChunk, PropsHelperOrizon.dimensiontopazHeight);
			}
			if(rand.nextInt(2) == 0) {
				int amethystChunk = rand.nextInt(PropsHelperOrizon.dimensionamethystRarity*2+1) + (PropsHelperOrizon.dimensionamethystRarity / 2);
				generateSimpleVein(world, rand, chunkX, chunkZ, amethyst, amethystChunk, PropsHelperOrizon.dimensionamethystHeight);
			}
			if(rand.nextInt(2) == 0) {
				int quartzChunk = rand.nextInt(PropsHelperOrizon.dimensionquartzRarity*2+1) + (PropsHelperOrizon.dimensionquartzRarity / 2);
				generateSimpleVein(world, rand, chunkX, chunkZ, quartz, quartzChunk, PropsHelperOrizon.dimensionquartzHeight);
			}
			if(rand.nextInt(2) == 0) {
				int roseQuartzChunk = rand.nextInt(PropsHelperOrizon.dimensionroseQuartzRarity*2+1) + (PropsHelperOrizon.dimensionroseQuartzRarity / 2);
				generateSimpleVein(world, rand, chunkX, chunkZ, roseQuartz, roseQuartzChunk, PropsHelperOrizon.dimensionroseQuartzHeight);
			}
			if(rand.nextInt(2) == 0) {
				int rockCrystalChunk = rand.nextInt(PropsHelperOrizon.dimensionrockCrystalRarity*2+1) + (PropsHelperOrizon.dimensionrockCrystalRarity / 2);
				generateSimpleVein(world, rand, chunkX, chunkZ, rockCrystal, rockCrystalChunk, PropsHelperOrizon.dimensionrockCrystalHeight);
			}
		}
	}
	
	public static boolean generateVein(World world, Random rand, int chunkX, int chunkZ, 
			OreGen ori, OreGen alt, int rarity, int height) 
	{
		for (int i = 0; i < rarity; i++)
	    {
			int hi = rand.nextInt(height);
	        int randX = chunkX + rand.nextInt(16);
	        int randZ = chunkZ + rand.nextInt(16);
	        OreGen ore = ori;
	        if(rand.nextInt(4) == 0)
	        	ore = alt;
	        ore.generate(world, rand, randX, hi, randZ);
	        if(rand.nextInt(40) == 0 && (rarity - i >= 3)) {
	        	for(int j = 0; j < 3; j++) {
	        		randX = chunkX + rand.nextInt(16);
	    	        randZ = chunkZ + rand.nextInt(16);
	    	        ore.generate(world, rand, randX, hi + rand.nextInt(3) - 1, randZ);
	    	        i++;
	        	}
	        }
	    }
		return true;
	}
	
	public static boolean generateStratifiedVein(World world, Random rand, int chunkX, int chunkZ, 
			OreGenStratified ori, OreGenStratified alt, int rarity, int height) 
	{
		for (int i = 0; i < rarity; i++)
	    {
			int hi = rand.nextInt(height);
	        int randX = chunkX + rand.nextInt(16);
	        int randZ = chunkZ + rand.nextInt(16);
	        OreGenStratified ore = ori;
	        if(rand.nextInt(4) == 0)
	        	ore = alt;
	        ore.generate(world, rand, randX, hi, randZ);
	        if(rand.nextInt(40) == 0 && (rarity - i >= 3)) {
	        	for(int j = 0; j < 3; j++) {
	        		randX = chunkX + rand.nextInt(16);
	    	        randZ = chunkZ + rand.nextInt(16);
	    	        ore.generate(world, rand, randX, hi + rand.nextInt(3) - 1, randZ);
	    	        i++;
	        	}
	        }
	    }
		return true;
	}
	
	public static boolean generateStratifiedVeinGem(World world, Random rand, int chunkX, int chunkZ, 
			OreGenStratifiedGem ore, int rarity, int height) 
	{
		for (int i = 0; i < rarity; i++)
	    {
			int hi = rand.nextInt(height);
	        int randX = chunkX + rand.nextInt(16);
	        int randZ = chunkZ + rand.nextInt(16);
	        ore.generate(world, rand, randX, hi, randZ);
	    }
		return true;
	}
	
	public static boolean generateSimpleVein(World world, Random rand, int chunkX, int chunkZ, 
			OreGen ore, int rarity, int height) 
	{
		for (int i = 0; i < rarity; i++)
	    {
			int hi = rand.nextInt(height);
	        int randX = chunkX + rand.nextInt(16);
	        int randZ = chunkZ + rand.nextInt(16);
	        ore.generate(world, rand, randX, hi, randZ);
	        if(rand.nextInt(40) == 0 && (rarity - i >= 3)) {
	        	for(int j = 0; j < 3; j++) {
	        		randX = chunkX + rand.nextInt(16);
	    	        randZ = chunkZ + rand.nextInt(16);
	    	        ore.generate(world, rand, randX, hi + rand.nextInt(3) - 1, randZ);
	    	        i++;
	        	}
	        }
	    }
		return true;
	}
	
	public static boolean generateCalciteVein(World world, Random rand, int chunkX, int chunkZ, 
			OreGenCalcite ore, int rarity, int height) 
	{
		for (int i = 0; i < rarity; i++)
	    {
			int hi = rand.nextInt(height);
	        int randX = chunkX + rand.nextInt(16);
	        int randZ = chunkZ + rand.nextInt(16);
	        ore.generate(world, rand, randX, hi, randZ);
	    }
		return true;
	}
	
	public static boolean generateStratifiedVanillaVein(World world, Random rand, int chunkX, int chunkZ, 
			OreGenVanilla ore, int rarity, int height) 
	{
		for (int i = 0; i < rarity; i++)
	    {
			int hi = rand.nextInt(height);
	        int randX = chunkX + rand.nextInt(16);
	        int randZ = chunkZ + rand.nextInt(16);
	        ore.generate(world, rand, randX, hi, randZ);
	        if(rand.nextInt(40) == 0 && (rarity - i >= 3)) {
	        	for(int j = 0; j < 3; j++) {
	        		randX = chunkX + rand.nextInt(16);
	    	        randZ = chunkZ + rand.nextInt(16);
	    	        ore.generate(world, rand, randX, hi + rand.nextInt(3) - 1, randZ);
	    	        i++;
	        	}
	        }
	    }
		return true;
	}
	
	public static void generateSlimePool(World world, Random rand, int chunkX, int chunkZ) 
	{
		if(rand.nextInt(PropsHelperOrizon.dimensionSlimePoolRarity) == 0)
		{
			int hi = rand.nextInt(PropsHelperOrizon.dimensionSlimePoolHeight);
	        int randX = chunkX + rand.nextInt(16);
	        int randZ = chunkZ + rand.nextInt(16);
	        slimepool.generate(world, rand, randX, hi, randZ);
		}
		BiomeGenBase biomegenbase = world.getWorldChunkManager().getBiomeGenAt(chunkX + 16, chunkZ + 16);
		if(rand.nextInt(PropsHelperOrizon.dimensionSlimePoolRarity/4) == 0 && (biomegenbase == BiomeGenBase.swampland 
				|| biomegenbase == BiomeGenBase.jungle || biomegenbase == BiomeGenBase.jungleHills)) {
			int hi = rand.nextInt(PropsHelperOrizon.dimensionSlimePoolHeight * 3);
	        int randX = chunkX + rand.nextInt(16);
	        int randZ = chunkZ + rand.nextInt(16);
	        slimepool.generate(world, rand, randX, hi, randZ);
		}
		if(rand.nextInt(PropsHelperOrizon.dimensionSlimePoolRarity/4) == 0 && 
				(biomegenbase == BiomeGenBase.jungle || biomegenbase == BiomeGenBase.jungleHills)) {
			int hi = rand.nextInt(PropsHelperOrizon.dimensionSlimePoolHeight * 2);
	        int randX = chunkX + rand.nextInt(16);
	        int randZ = chunkZ + rand.nextInt(16);
	        slimepool.generate(world, rand, randX, hi, randZ);
		}
	}
	
    static OreGen copper;
    static OreGen turquoise;
    static OreGen chalcocite;
    static OreGen cassiterite;
    static OreGen teallite;
    static OreGen zincBloom;
    static OreGen sphalerite;
    static OreGen cerussite;
    static OreGen cobalt;
    static OreGen ardite;
    static OreGen myuvil;
    static OreGen galena;
    static OreGen chrysocolla;
    static OreGen aggregate;
    
    static OreGen copperA;
    static OreGen turquoiseA;
    static OreGen chalcociteA;
    static OreGen cassiteriteA;
    static OreGen tealliteA;
    static OreGen zincBloomA;
    static OreGen sphaleriteA;
    static OreGen cerussiteA;
    static OreGen cobaltA;
    static OreGen arditeA;
    static OreGen myuvilA;
    static OreGen galenaA;
    static OreGen chrysocollaA;
    static OreGen aggregateA;
    
    static OreGenStratified copperS;
    static OreGenStratified turquoiseS;
    static OreGenStratified chalcociteS;
    static OreGenStratified cassiteriteS;
    static OreGenStratified tealliteS;
    static OreGenStratified zincBloomS;
    static OreGenStratified sphaleriteS;
    static OreGenStratified cerussiteS;
    static OreGenStratified cobaltS;
    static OreGenStratified arditeS;
    static OreGenStratified myuvilS;
    static OreGenStratified galenaS;
    static OreGenStratified chrysocollaS;
    static OreGenStratified aggregateS;
    
    static OreGenStratified copperSA;
    static OreGenStratified turquoiseSA;
    static OreGenStratified chalcociteSA;
    static OreGenStratified cassiteriteSA;
    static OreGenStratified tealliteSA;
    static OreGenStratified zincBloomSA;
    static OreGenStratified sphaleriteSA;
    static OreGenStratified cerussiteSA;
    static OreGenStratified cobaltSA;
    static OreGenStratified arditeSA;
    static OreGenStratified myuvilSA;
    static OreGenStratified galenaSA;
    static OreGenStratified chrysocollaSA;
    static OreGenStratified aggregateSA;
    
    static StoneGen calcite;
    static OreGenCalcite galenaC;
    static OreGenCalcite cassiteriteC;
    static OreGenCalcite zincBloomC;
    static OreGenCalcite sphaleriteC;
    static OreGenCalcite chalcociteC;
    
    static OreGen redoCoal;
    static OreGen redoIron;
    static OreGen redoGold;
    static OreGen redoDiamond;
    static OreGen redoLapis;
    static OreGen redoRedstone;
    
    static OreGenVanilla redoCoalS;
    static OreGenVanilla redoIronS;
    static OreGenVanilla redoGoldS;
    static OreGenVanilla redoDiamondS;
    static OreGenVanilla redoLapisS;
    static OreGenVanilla redoRedstoneS;
    
    static StoneGen marbleWhite;
    static StoneGen marbleBlack;
    static StoneGen marbleRose;
    static StoneGen marbleEmerald;
    static StoneGen marbleAzure;
    
    static OreGen ruby;
    static OreGen emerald;
    static OreGen sapphire;
    static OreGen topaz;
    static OreGen amethyst;
    static OreGen quartz;
    static OreGen roseQuartz;
    static OreGen rockCrystal;
    
    static OreGenStratifiedGem rubyS;
    static OreGenStratifiedGem emeraldS;
    static OreGenStratifiedGem sapphireS;
    static OreGenStratifiedGem topazS;
    static OreGenStratifiedGem amethystS;
    static OreGenStratifiedGem quartzS;
    static OreGenStratifiedGem roseQuartzS;
    static OreGenStratifiedGem rockCrystalS;
    
    static WorldGenSlimePools slimepool;
    static WorldGenSlimePools acidpool;
    
    static OreGenNether bloodbite;
    static OreGenNether grudgestone;
    static OreGenNether wistful;
    static OreGenNether flamelash;
    static OreGenNether tears;
    static OreGenNether netherGold;
    
    static StoneGenColor coloredStone;
}
