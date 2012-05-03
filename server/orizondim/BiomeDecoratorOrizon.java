package net.minecraft.src.orizondim;

import java.util.Random;

import net.minecraft.src.BiomeDecorator;
import net.minecraft.src.BiomeGenBase;
import net.minecraft.src.Block;
import net.minecraft.src.World;
import net.minecraft.src.WorldGenDeadBush;
import net.minecraft.src.WorldGenLiquids;
import net.minecraft.src.WorldGenMinable;
import net.minecraft.src.WorldGenPumpkin;
import net.minecraft.src.WorldGenerator;
import net.minecraft.src.mod_Orizon;
import net.minecraft.src.orizon.*;

public class BiomeDecoratorOrizon extends BiomeDecorator {

	public BiomeDecoratorOrizon(BiomeGenBase biomegenbase) 
	{
		super(biomegenbase);

        this.dirtGen = new WorldGenMinable(mod_Orizon.blueDirt.blockID, 32);
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
	
	public void decorate(World par1World, Random par2Random, int par3, int par4)
    {
        if (this.currentWorld != null)
        {
            //throw new RuntimeException("Already decorating!!");
        }
        else
        {
            this.currentWorld = par1World;
            this.randomGenerator = par2Random;
            this.chunk_X = par3;
            this.chunk_Z = par4;
            this.decorate();
            this.currentWorld = null;
            this.randomGenerator = null;
        }
    }
	
	protected void decorate()
    {
        this.generateOres();
        int var1;
        int var2;
        int var3;

        for (var1 = 0; var1 < this.sandPerChunk2; ++var1)
        {
            var2 = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
            var3 = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
            this.sandGen.generate(this.currentWorld, this.randomGenerator, var2, this.currentWorld.getTopSolidOrLiquidBlock(var2, var3), var3);
        }

        for (var1 = 0; var1 < this.clayPerChunk; ++var1)
        {
            var2 = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
            var3 = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
            this.clayGen.generate(this.currentWorld, this.randomGenerator, var2, this.currentWorld.getTopSolidOrLiquidBlock(var2, var3), var3);
        }

        for (var1 = 0; var1 < this.sandPerChunk; ++var1)
        {
            var2 = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
            var3 = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
            this.sandGen.generate(this.currentWorld, this.randomGenerator, var2, this.currentWorld.getTopSolidOrLiquidBlock(var2, var3), var3);
        }

        var1 = this.treesPerChunk;

        if (this.randomGenerator.nextInt(10) == 0)
        {
            ++var1;
        }

        int var4;

        for (var2 = 0; var2 < var1; ++var2)
        {
            var3 = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
            var4 = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
            WorldGenerator var5 = this.biome.getRandomWorldGenForTrees(this.randomGenerator);
            var5.setScale(1.0D, 1.0D, 1.0D);
            var5.generate(this.currentWorld, this.randomGenerator, var3, this.currentWorld.getHeightValue(var3, var4), var4);
        }

        for (var2 = 0; var2 < this.bigMushroomsPerChunk; ++var2)
        {
            var3 = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
            var4 = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
            this.bigMushroomGen.generate(this.currentWorld, this.randomGenerator, var3, this.currentWorld.getHeightValue(var3, var4), var4);
        }

        int var7;

        for (var2 = 0; var2 < this.flowersPerChunk; ++var2)
        {
            var3 = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
            var4 = this.randomGenerator.nextInt(128);
            var7 = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
            this.plantYellowGen.generate(this.currentWorld, this.randomGenerator, var3, var4, var7);

            if (this.randomGenerator.nextInt(4) == 0)
            {
                var3 = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
                var4 = this.randomGenerator.nextInt(128);
                var7 = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
                this.plantRedGen.generate(this.currentWorld, this.randomGenerator, var3, var4, var7);
            }
        }

        for (var2 = 0; var2 < this.grassPerChunk; ++var2)
        {
            var3 = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
            var4 = this.randomGenerator.nextInt(128);
            var7 = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
            WorldGenerator var6 = this.biome.func_48440_b(this.randomGenerator);
            var6.generate(this.currentWorld, this.randomGenerator, var3, var4, var7);
        }

        for (var2 = 0; var2 < this.deadBushPerChunk; ++var2)
        {
            var3 = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
            var4 = this.randomGenerator.nextInt(128);
            var7 = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
            (new WorldGenDeadBush(Block.deadBush.blockID)).generate(this.currentWorld, this.randomGenerator, var3, var4, var7);
        }

        for (var2 = 0; var2 < this.waterlilyPerChunk; ++var2)
        {
            var3 = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
            var4 = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;

            for (var7 = this.randomGenerator.nextInt(128); var7 > 0 && this.currentWorld.getBlockId(var3, var7 - 1, var4) == 0; --var7)
            {
                ;
            }

            this.waterlilyGen.generate(this.currentWorld, this.randomGenerator, var3, var7, var4);
        }

        for (var2 = 0; var2 < this.mushroomsPerChunk; ++var2)
        {
            if (this.randomGenerator.nextInt(4) == 0)
            {
                var3 = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
                var4 = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
                var7 = this.currentWorld.getHeightValue(var3, var4);
                this.mushroomBrownGen.generate(this.currentWorld, this.randomGenerator, var3, var7, var4);
            }

            if (this.randomGenerator.nextInt(8) == 0)
            {
                var3 = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
                var4 = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
                var7 = this.randomGenerator.nextInt(128);
                this.mushroomRedGen.generate(this.currentWorld, this.randomGenerator, var3, var7, var4);
            }
        }

        if (this.randomGenerator.nextInt(4) == 0)
        {
            var2 = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
            var3 = this.randomGenerator.nextInt(128);
            var4 = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
            this.mushroomBrownGen.generate(this.currentWorld, this.randomGenerator, var2, var3, var4);
        }

        if (this.randomGenerator.nextInt(8) == 0)
        {
            var2 = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
            var3 = this.randomGenerator.nextInt(128);
            var4 = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
            this.mushroomRedGen.generate(this.currentWorld, this.randomGenerator, var2, var3, var4);
        }

        for (var2 = 0; var2 < this.reedsPerChunk; ++var2)
        {
            var3 = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
            var4 = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
            var7 = this.randomGenerator.nextInt(128);
            this.reedGen.generate(this.currentWorld, this.randomGenerator, var3, var7, var4);
        }

        for (var2 = 0; var2 < 10; ++var2)
        {
            var3 = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
            var4 = this.randomGenerator.nextInt(128);
            var7 = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
            this.reedGen.generate(this.currentWorld, this.randomGenerator, var3, var4, var7);
        }

        if (this.randomGenerator.nextInt(32) == 0)
        {
            var2 = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
            var3 = this.randomGenerator.nextInt(128);
            var4 = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
            (new WorldGenPumpkin()).generate(this.currentWorld, this.randomGenerator, var2, var3, var4);
        }

        for (var2 = 0; var2 < this.cactiPerChunk; ++var2)
        {
            var3 = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
            var4 = this.randomGenerator.nextInt(128);
            var7 = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
            this.cactusGen.generate(this.currentWorld, this.randomGenerator, var3, var4, var7);
        }

        if (this.generateLakes)
        {
            for (var2 = 0; var2 < 50; ++var2)
            {
                var3 = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
                var4 = this.randomGenerator.nextInt(this.randomGenerator.nextInt(120) + 8);
                var7 = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
                (new WorldGenLiquids(Block.waterMoving.blockID)).generate(this.currentWorld, this.randomGenerator, var3, var4, var7);
            }

            for (var2 = 0; var2 < 20; ++var2)
            {
                var3 = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
                var4 = this.randomGenerator.nextInt(this.randomGenerator.nextInt(this.randomGenerator.nextInt(112) + 8) + 8);
                var7 = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
                (new WorldGenLiquids(Block.lavaMoving.blockID)).generate(this.currentWorld, this.randomGenerator, var3, var4, var7);
            }
        }
    }
	
	@Override
	protected void generateOres()
    {
        this.genStandardOre1(20, this.dirtGen, 0, 128);
        this.genStandardOre1(10, this.gravelGen, 0, 128);
        if(PropsHelperOrizon.dimensiongenCalcite)
            this.generateCalcite();
        if(PropsHelperOrizon.dimensiongenMarble)
        	this.generateMarble();
        if(PropsHelperOrizon.dimensiongenGems)
        	this.generateGems();
        if(PropsHelperOrizon.dimensiongenSlimePools)
        	this.generateSlimePool();
        this.generateOrizonOres();
    }
	
	public void setTreesPerChunk(int i)
	{
		this.treesPerChunk = i;
	}
	
	public void setFlowersPerChunk(int i)
	{
		this.flowersPerChunk = i;
	}
	
	public void setGrassPerChunk(int i)
	{
		this.grassPerChunk = i;
	}
	
	public void setDeadBushPerChunk(int i)
	{
		this.deadBushPerChunk = i;
	}
	
	public void setReedsPerChunk(int i)
	{
		this.reedsPerChunk = i;
	}
	
	public void setCactiPerChunk(int i)
	{
		this.cactiPerChunk = i;
	}
	
	public void setMushroomsPerChunk(int i)
	{
		this.mushroomsPerChunk = i;
	}
	
	public void setClayPerChunk(int i)
	{
		this.clayPerChunk = i;
	}
	
	public void setWaterlilyPerChunk(int i)
	{
		this.waterlilyPerChunk = i;
	}
			
	public void generateOrizonOres()
	{
		if(PropsHelperOrizon.dimensiongenStratifiedStone) {
			if(PropsHelperOrizon.dimensiongenCopper) {
				int copperChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensioncopperRarity) + (PropsHelperOrizon.dimensioncopperRarity / 2);
				generateStratifiedVein(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, copperS, copperSA, copperChunk, PropsHelperOrizon.dimensioncopperHeight);
			}
			if(PropsHelperOrizon.dimensiongenTurquoise) {
				int turquoiseChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensionturquoiseRarity) + (PropsHelperOrizon.dimensionturquoiseRarity / 2);
				generateStratifiedVein(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, turquoiseS, turquoiseSA, turquoiseChunk, PropsHelperOrizon.dimensionturquoiseHeight);
			}
			if(PropsHelperOrizon.dimensiongenChalcocite) {
				int chalcociteChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensionchalcociteRarity) + (PropsHelperOrizon.dimensionchalcociteRarity / 2);
				generateStratifiedVein(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, chalcociteS, chalcociteSA, chalcociteChunk, PropsHelperOrizon.dimensionchalcociteHeight);
			}
			if(PropsHelperOrizon.dimensiongenCassiterite)
			{
				int cassiteriteChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensioncassiteriteRarity) + (PropsHelperOrizon.dimensioncassiteriteRarity / 2);
				generateStratifiedVein(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, cassiteriteS, cassiteriteSA, cassiteriteChunk, PropsHelperOrizon.dimensioncassiteriteHeight);
			}
			if(PropsHelperOrizon.dimensiongenTeallite) {
				int tealliteChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensiontealliteRarity) + (PropsHelperOrizon.dimensiontealliteRarity / 2);
				generateStratifiedVein(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, tealliteS, tealliteSA, tealliteChunk, PropsHelperOrizon.dimensiontealliteHeight);
			}
			if(PropsHelperOrizon.dimensiongenZinc) {
				int zincBloomChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensionzincBloomRarity) + (PropsHelperOrizon.dimensionzincBloomRarity / 2);
				generateStratifiedVein(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, zincBloomS, zincBloomSA, zincBloomChunk, PropsHelperOrizon.dimensionzincBloomHeight);
			}
			if(PropsHelperOrizon.dimensiongenSphalerite) {
				int sphaleriteChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensionsphaleriteRarity) + (PropsHelperOrizon.dimensionsphaleriteRarity / 2);
				generateStratifiedVein(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, sphaleriteS, sphaleriteSA, sphaleriteChunk, PropsHelperOrizon.dimensionsphaleriteHeight);
			}
			if(PropsHelperOrizon.dimensiongenCassiterite) {
				int cerussiteChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensioncerussiteRarity) + (PropsHelperOrizon.dimensioncerussiteRarity / 2);
				generateStratifiedVein(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, cerussiteS, cerussiteSA, cerussiteChunk, PropsHelperOrizon.dimensioncerussiteHeight);
			}
			if(PropsHelperOrizon.dimensiongenCobalt) {
				int cobaltChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensioncobaltRarity) + (PropsHelperOrizon.dimensioncobaltRarity / 2);
				generateStratifiedVein(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, cobaltS, cobaltSA, cobaltChunk, PropsHelperOrizon.dimensioncobaltHeight);
			}
			if(PropsHelperOrizon.dimensiongenArdite) {
				int arditeChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensionarditeRarity) + (PropsHelperOrizon.dimensionarditeRarity / 2);
				generateStratifiedVein(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, arditeS, arditeSA, arditeChunk, PropsHelperOrizon.dimensionarditeHeight);
			}
			if(PropsHelperOrizon.dimensiongenMyuvil) {
				int myuvilChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensionmyuvilRarity) + (PropsHelperOrizon.dimensionmyuvilRarity / 2);
				generateStratifiedVein(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, myuvilS, myuvilSA, myuvilChunk, PropsHelperOrizon.dimensionmyuvilHeight);
			}
			if(PropsHelperOrizon.dimensiongenGalena) {
				int galenaChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensiongalenaRarity) + (PropsHelperOrizon.dimensiongalenaRarity / 2);
				generateStratifiedVein(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, galenaS, galenaSA, galenaChunk, PropsHelperOrizon.dimensiongalenaHeight);
			}
			if(PropsHelperOrizon.dimensiongenIvymetal) {
				int chrysocollaChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensionivymetalRarity) + (PropsHelperOrizon.dimensionivymetalRarity / 2);
				generateStratifiedVein(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, chrysocollaS, chrysocollaSA, chrysocollaChunk, PropsHelperOrizon.dimensionivymetalHeight);
			}
			if(PropsHelperOrizon.dimensiongenAggregate) {
				int aggregateChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensionaggregateRarity) + (PropsHelperOrizon.dimensionaggregateRarity / 2);
				generateStratifiedVein(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, aggregateS, aggregateSA, aggregateChunk, PropsHelperOrizon.dimensionaggregateHeight);
			}
			
		} else {
			if(PropsHelperOrizon.dimensiongenCopper) {
				int copperChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensioncopperRarity) + (PropsHelperOrizon.dimensioncopperRarity / 2);
				generateVein(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, copper, copperA, copperChunk, PropsHelperOrizon.dimensioncopperHeight);
			}
			if(PropsHelperOrizon.dimensiongenTurquoise) {
				int turquoiseChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensionturquoiseRarity) + (PropsHelperOrizon.dimensionturquoiseRarity / 2);
				generateVein(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, turquoise, turquoiseA, turquoiseChunk, PropsHelperOrizon.dimensionturquoiseHeight);
			}
			if(PropsHelperOrizon.dimensiongenChalcocite) {
				int chalcociteChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensionchalcociteRarity) + (PropsHelperOrizon.dimensionchalcociteRarity / 2);
				generateVein(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, chalcocite, chalcociteA, chalcociteChunk, PropsHelperOrizon.dimensionchalcociteHeight);
			}
			if(PropsHelperOrizon.dimensiongenCassiterite) {
				int cassiteriteChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensioncassiteriteRarity) + (PropsHelperOrizon.dimensioncassiteriteRarity / 2);
				generateVein(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, cassiterite, cassiteriteA, cassiteriteChunk, PropsHelperOrizon.dimensioncassiteriteHeight);
			}
			if(PropsHelperOrizon.dimensiongenTeallite) {
				int tealliteChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensiontealliteRarity) + (PropsHelperOrizon.dimensiontealliteRarity / 2);
				generateVein(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, teallite, tealliteA, tealliteChunk, PropsHelperOrizon.dimensiontealliteHeight);
			}
			if(PropsHelperOrizon.dimensiongenZinc) {
				int zincBloomChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensionzincBloomRarity) + (PropsHelperOrizon.dimensionzincBloomRarity / 2);
				generateVein(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, zincBloom, zincBloomA, zincBloomChunk, PropsHelperOrizon.dimensionzincBloomHeight);
			}
			if(PropsHelperOrizon.dimensiongenSphalerite) {
				int sphaleriteChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensionsphaleriteRarity) + (PropsHelperOrizon.dimensionsphaleriteRarity / 2);
				generateVein(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, sphalerite, sphaleriteA, sphaleriteChunk, PropsHelperOrizon.dimensionsphaleriteHeight);
			}
			if(PropsHelperOrizon.dimensiongenCerussite) {
				int cerussiteChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensioncerussiteRarity) + (PropsHelperOrizon.dimensioncerussiteRarity / 2);
				generateVein(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, cerussite, cerussiteA, cerussiteChunk, PropsHelperOrizon.dimensioncerussiteHeight);
			}
			if(PropsHelperOrizon.dimensiongenCobalt) {
				int cobaltChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensioncobaltRarity) + (PropsHelperOrizon.dimensioncobaltRarity / 2);
				generateVein(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, cobalt, cobaltA, cobaltChunk, PropsHelperOrizon.dimensioncobaltHeight);
			}
			if(PropsHelperOrizon.dimensiongenArdite) {
				int arditeChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensionarditeRarity) + (PropsHelperOrizon.dimensionarditeRarity / 2);
				generateVein(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, ardite, arditeA, arditeChunk, PropsHelperOrizon.dimensionarditeHeight);
			}
			if(PropsHelperOrizon.dimensiongenMyuvil) {
				int myuvilChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensionmyuvilRarity) + (PropsHelperOrizon.dimensionmyuvilRarity / 2);
				generateVein(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, myuvil, myuvilA, myuvilChunk, PropsHelperOrizon.dimensionmyuvilHeight);
			}
			if(PropsHelperOrizon.dimensiongenGalena) {
				int galenaChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensiongalenaRarity) + (PropsHelperOrizon.dimensiongalenaRarity / 2);
				generateVein(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, galena, galenaA, galenaChunk, PropsHelperOrizon.dimensiongalenaHeight);
			}
			if(PropsHelperOrizon.dimensiongenIvymetal) {
				int chrysocollaChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensionivymetalRarity) + (PropsHelperOrizon.dimensionivymetalRarity / 2);
				generateVein(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, chrysocolla, chrysocollaA, chrysocollaChunk, PropsHelperOrizon.dimensionivymetalHeight);
			}
			if(PropsHelperOrizon.dimensiongenAggregate) {
				int aggregateChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensionaggregateRarity) + (PropsHelperOrizon.dimensionaggregateRarity / 2);
				generateVein(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, aggregate, aggregateA, aggregateChunk, PropsHelperOrizon.dimensionaggregateHeight);
			}
		}		
	}
	
	public void generateCalcite()
	{
		if(this.randomGenerator.nextInt(20) == 0)
	    {
			int hi = this.randomGenerator.nextInt(64);
	        int randX = chunk_X + this.randomGenerator.nextInt(16);
	        int randZ = chunk_Z + this.randomGenerator.nextInt(16);
	        calcite.generate(currentWorld, randomGenerator, randX, hi, randZ);
	    }
		
		int galenaChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensiongalenaRarity * 10) + (PropsHelperOrizon.dimensiongalenaRarity * 10 / 2);
		generateCalciteVein(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, galenaC, galenaChunk, PropsHelperOrizon.dimensiongalenaHeight);
		int cassiteriteChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensioncassiteriteRarity * 5) + (PropsHelperOrizon.dimensioncassiteriteRarity * 5 / 2);
		generateCalciteVein(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, cassiteriteC, cassiteriteChunk, PropsHelperOrizon.dimensioncassiteriteHeight);
		int zincBloomChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensionzincBloomRarity * 5) + (PropsHelperOrizon.dimensionzincBloomRarity * 5 / 2);
		generateCalciteVein(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, zincBloomC, zincBloomChunk, PropsHelperOrizon.dimensionzincBloomHeight);
		int sphaleriteChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensionsphaleriteRarity * 5) + (PropsHelperOrizon.dimensionsphaleriteRarity * 5 / 2);
		generateCalciteVein(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, sphaleriteC, sphaleriteChunk, PropsHelperOrizon.dimensionsphaleriteHeight);
		int chalcociteChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensionchalcociteRarity * 5) + (PropsHelperOrizon.dimensionchalcociteRarity * 5 / 2);
		generateCalciteVein(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, chalcociteC, chalcociteChunk, PropsHelperOrizon.dimensionchalcociteHeight);
	}
	
	public void generateMarble() 
	{
		if(this.randomGenerator.nextInt(PropsHelperOrizon.dimensionmarbleRarity) == 0)
	    {
			int hi = this.randomGenerator.nextInt(PropsHelperOrizon.dimensionmarbleHeight);
	        int randX = chunk_X + this.randomGenerator.nextInt(16);
	        int randZ = chunk_Z + this.randomGenerator.nextInt(16);
	        marbleWhite.generate(currentWorld, randomGenerator, randX, hi, randZ);
	        hi = hi + this.randomGenerator.nextInt(8) - 4;
	        randX = randX + this.randomGenerator.nextInt(32) - 16;
	        randZ = randZ + this.randomGenerator.nextInt(32) - 16;
	        marbleWhite.generate(currentWorld, randomGenerator, randX, hi, randZ);
	        hi = hi + this.randomGenerator.nextInt(8) - 4;
	        randX = randX + this.randomGenerator.nextInt(32) - 16;
	        randZ = randZ + this.randomGenerator.nextInt(32) - 16;
	        marbleWhite.generate(currentWorld, randomGenerator, randX, hi, randZ);
	        hi = hi + this.randomGenerator.nextInt(8) - 4;
	        randX = randX + this.randomGenerator.nextInt(32) - 16;
	        randZ = randZ + this.randomGenerator.nextInt(32) - 16;
	        marbleWhite.generate(currentWorld, randomGenerator, randX, hi, randZ);
	    }
		if(this.randomGenerator.nextInt(PropsHelperOrizon.dimensionmarbleRarity) == 0)
	    {
			int hi = this.randomGenerator.nextInt(PropsHelperOrizon.dimensionmarbleHeight);
	        int randX = chunk_X + this.randomGenerator.nextInt(16);
	        int randZ = chunk_Z + this.randomGenerator.nextInt(16);
	        marbleBlack.generate(currentWorld, randomGenerator, randX, hi, randZ);
	        hi = hi + this.randomGenerator.nextInt(8) - 4;
	        randX = randX + this.randomGenerator.nextInt(32) - 16;
	        randZ = randZ + this.randomGenerator.nextInt(32) - 16;
	        marbleBlack.generate(currentWorld, randomGenerator, randX, hi, randZ);
	        hi = hi + this.randomGenerator.nextInt(8) - 4;
	        randX = randX + this.randomGenerator.nextInt(32) - 16;
	        randZ = randZ + this.randomGenerator.nextInt(32) - 16;
	        marbleBlack.generate(currentWorld, randomGenerator, randX, hi, randZ);
	        hi = hi + this.randomGenerator.nextInt(8) - 4;
	        randX = randX + this.randomGenerator.nextInt(32) - 16;
	        randZ = randZ + this.randomGenerator.nextInt(32) - 16;
	        marbleBlack.generate(currentWorld, randomGenerator, randX, hi, randZ);
	    }
		if(this.randomGenerator.nextInt(PropsHelperOrizon.dimensionmarbleRarity) == 0)
	    {
			int hi = this.randomGenerator.nextInt(PropsHelperOrizon.dimensionmarbleHeight);
	        int randX = chunk_X + this.randomGenerator.nextInt(16);
	        int randZ = chunk_Z + this.randomGenerator.nextInt(16);
	        marbleRose.generate(currentWorld, randomGenerator, randX, hi, randZ);
	        hi = hi + this.randomGenerator.nextInt(8) - 4;
	        randX = randX + this.randomGenerator.nextInt(32) - 16;
	        randZ = randZ + this.randomGenerator.nextInt(32) - 16;
	        marbleRose.generate(currentWorld, randomGenerator, randX, hi, randZ);
	        hi = hi + this.randomGenerator.nextInt(8) - 4;
	        randX = randX + this.randomGenerator.nextInt(32) - 16;
	        randZ = randZ + this.randomGenerator.nextInt(32) - 16;
	        marbleRose.generate(currentWorld, randomGenerator, randX, hi, randZ);
	        hi = hi + this.randomGenerator.nextInt(8) - 4;
	        randX = randX + this.randomGenerator.nextInt(32) - 16;
	        randZ = randZ + this.randomGenerator.nextInt(32) - 16;
	        marbleRose.generate(currentWorld, randomGenerator, randX, hi, randZ);
	    }
		if(this.randomGenerator.nextInt(PropsHelperOrizon.dimensionmarbleRarity) == 0)
	    {
			int hi = this.randomGenerator.nextInt(PropsHelperOrizon.dimensionmarbleHeight);
	        int randX = chunk_X + this.randomGenerator.nextInt(16);
	        int randZ = chunk_Z + this.randomGenerator.nextInt(16);
	        marbleEmerald.generate(currentWorld, randomGenerator, randX, hi, randZ);
	        hi = hi + this.randomGenerator.nextInt(8) - 4;
	        randX = randX + this.randomGenerator.nextInt(32) - 16;
	        randZ = randZ + this.randomGenerator.nextInt(32) - 16;
	        marbleEmerald.generate(currentWorld, randomGenerator, randX, hi, randZ);
	        hi = hi + this.randomGenerator.nextInt(8) - 4;
	        randX = randX + this.randomGenerator.nextInt(32) - 16;
	        randZ = randZ + this.randomGenerator.nextInt(32) - 16;
	        marbleEmerald.generate(currentWorld, randomGenerator, randX, hi, randZ);
	        hi = hi + this.randomGenerator.nextInt(8) - 4;
	        randX = randX + this.randomGenerator.nextInt(32) - 16;
	        randZ = randZ + this.randomGenerator.nextInt(32) - 16;
	        marbleEmerald.generate(currentWorld, randomGenerator, randX, hi, randZ);
	    }
		if(this.randomGenerator.nextInt(PropsHelperOrizon.dimensionmarbleRarity) == 0)
	    {
			int hi = this.randomGenerator.nextInt(PropsHelperOrizon.dimensionmarbleHeight);
	        int randX = chunk_X + this.randomGenerator.nextInt(16);
	        int randZ = chunk_Z + this.randomGenerator.nextInt(16);
	        marbleAzure.generate(currentWorld, randomGenerator, randX, hi, randZ);
	        hi = hi + this.randomGenerator.nextInt(8) - 4;
	        randX = randX + this.randomGenerator.nextInt(32) - 16;
	        randZ = randZ + this.randomGenerator.nextInt(32) - 16;
	        marbleAzure.generate(currentWorld, randomGenerator, randX, hi, randZ);
	        hi = hi + this.randomGenerator.nextInt(8) - 4;
	        randX = randX + this.randomGenerator.nextInt(32) - 16;
	        randZ = randZ + this.randomGenerator.nextInt(32) - 16;
	        marbleAzure.generate(currentWorld, randomGenerator, randX, hi, randZ);
	        hi = hi + this.randomGenerator.nextInt(8) - 4;
	        randX = randX + this.randomGenerator.nextInt(32) - 16;
	        randZ = randZ + this.randomGenerator.nextInt(32) - 16;
	        marbleAzure.generate(currentWorld, randomGenerator, randX, hi, randZ);
	    }
	}
	
	public void generateGems() 
	{
		if(PropsHelperOrizon.dimensiongenStratifiedStone) {
			if(PropsHelperOrizon.dimensiongenNonUniqueGems) {
				if(this.randomGenerator.nextInt(2) == 0) {
					int rubyChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensionrubyRarity*2) + (PropsHelperOrizon.dimensionrubyRarity / 2);
					generateStratifiedVeinGem(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, rubyS, rubyChunk, PropsHelperOrizon.dimensionrubyHeight);
				}
				if(this.randomGenerator.nextInt(2) == 0) {
					int emeraldChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensionemeraldRarity*2) + (PropsHelperOrizon.dimensionemeraldRarity / 2);
					generateStratifiedVeinGem(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, emeraldS, emeraldChunk, PropsHelperOrizon.dimensionemeraldHeight);
				} 
				if(this.randomGenerator.nextInt(2) == 0) {
					int sapphireChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensionsapphireRarity*2) + (PropsHelperOrizon.dimensionsapphireRarity / 2);
					generateStratifiedVeinGem(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, sapphireS, sapphireChunk, PropsHelperOrizon.dimensionsapphireHeight);
				}
			}
			if(this.randomGenerator.nextInt(2) == 0) {
				int topazChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensiontopazRarity*2) + (PropsHelperOrizon.dimensiontopazRarity / 2);
				generateStratifiedVeinGem(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, topazS, topazChunk, PropsHelperOrizon.dimensiontopazHeight);
			}
			if(this.randomGenerator.nextInt(2) == 0) {
				int amethystChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensionamethystRarity*2) + (PropsHelperOrizon.dimensionamethystRarity / 2);
				generateStratifiedVeinGem(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, amethystS, amethystChunk, PropsHelperOrizon.dimensionamethystHeight);
			}
			if(this.randomGenerator.nextInt(2) == 0) {
				int quartzChunk = this.randomGenerator.nextInt((int)(PropsHelperOrizon.dimensionquartzRarity * 1.5)) + (PropsHelperOrizon.dimensionquartzRarity / 2);
				generateStratifiedVeinGem(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, quartzS, quartzChunk, PropsHelperOrizon.dimensionquartzHeight);
			}
			if(this.randomGenerator.nextInt(2) == 0) {
				int roseQuartzChunk = this.randomGenerator.nextInt((int)(PropsHelperOrizon.dimensionroseQuartzRarity * 1.5)) + (PropsHelperOrizon.dimensionroseQuartzRarity / 2);
				generateStratifiedVeinGem(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, roseQuartzS, roseQuartzChunk, PropsHelperOrizon.dimensionroseQuartzHeight);
			}
			if(this.randomGenerator.nextInt(2) == 0) {
				int rockCrystalChunk = this.randomGenerator.nextInt((int)(PropsHelperOrizon.dimensionrockCrystalRarity * 1.5)) + (PropsHelperOrizon.dimensionrockCrystalRarity / 2);
				generateStratifiedVeinGem(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, rockCrystalS, rockCrystalChunk, PropsHelperOrizon.dimensionrockCrystalHeight);
			}
		} else {
			if(PropsHelperOrizon.dimensiongenNonUniqueGems) {
				if(this.randomGenerator.nextInt(2) == 0) {
					int rubyChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensionrubyRarity*2+1) + (PropsHelperOrizon.dimensionrubyRarity / 2);
					generateSimpleVein(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, ruby, rubyChunk, PropsHelperOrizon.dimensionrubyHeight);
				}
				if(this.randomGenerator.nextInt(2) == 0) {
					int emeraldChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensionemeraldRarity*2+1) + (PropsHelperOrizon.dimensionemeraldRarity / 2);
					generateSimpleVein(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, emerald, emeraldChunk, PropsHelperOrizon.dimensionemeraldHeight);
				}
				if(this.randomGenerator.nextInt(2) == 0) {
					int sapphireChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensionsapphireRarity*2+1) + (PropsHelperOrizon.dimensionsapphireRarity / 2);
					generateSimpleVein(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, sapphire, sapphireChunk, PropsHelperOrizon.dimensionsapphireHeight);
				}
			}
			if(this.randomGenerator.nextInt(2) == 0) {
				int topazChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensiontopazRarity*2+1) + (PropsHelperOrizon.dimensiontopazRarity / 2);
				generateSimpleVein(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, topaz, topazChunk, PropsHelperOrizon.dimensiontopazHeight);
			}
			if(this.randomGenerator.nextInt(2) == 0) {
				int amethystChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensionamethystRarity*2+1) + (PropsHelperOrizon.dimensionamethystRarity / 2);
				generateSimpleVein(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, amethyst, amethystChunk, PropsHelperOrizon.dimensionamethystHeight);
			}
			if(this.randomGenerator.nextInt(2) == 0) {
				int quartzChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensionquartzRarity*2+1) + (PropsHelperOrizon.dimensionquartzRarity / 2);
				generateSimpleVein(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, quartz, quartzChunk, PropsHelperOrizon.dimensionquartzHeight);
			}
			if(this.randomGenerator.nextInt(2) == 0) {
				int roseQuartzChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensionroseQuartzRarity*2+1) + (PropsHelperOrizon.dimensionroseQuartzRarity / 2);
				generateSimpleVein(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, roseQuartz, roseQuartzChunk, PropsHelperOrizon.dimensionroseQuartzHeight);
			}
			if(this.randomGenerator.nextInt(2) == 0) {
				int rockCrystalChunk = this.randomGenerator.nextInt(PropsHelperOrizon.dimensionrockCrystalRarity*2+1) + (PropsHelperOrizon.dimensionrockCrystalRarity / 2);
				generateSimpleVein(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z, rockCrystal, rockCrystalChunk, PropsHelperOrizon.dimensionrockCrystalHeight);
			}
		}
	}
	
	public boolean generateVein(World currentWorld, Random randomGenerator, int chunkX, int chunkZ, 
			OreGen ori, OreGen alt, int rarity, int height) 
	{
		for (int i = 0; i < rarity; i++)
	    {
			int hi = this.randomGenerator.nextInt(height);
	        int randX = chunkX + this.randomGenerator.nextInt(16);
	        int randZ = chunkZ + this.randomGenerator.nextInt(16);
	        OreGen ore = ori;
	        if(this.randomGenerator.nextInt(4) == 0)
	        	ore = alt;
	        ore.generate(currentWorld, randomGenerator, randX, hi, randZ);
	        if(this.randomGenerator.nextInt(40) == 0 && (rarity - i >= 3)) {
	        	for(int j = 0; j < 3; j++) {
	        		randX = chunkX + this.randomGenerator.nextInt(16);
	    	        randZ = chunkZ + this.randomGenerator.nextInt(16);
	    	        ore.generate(currentWorld, randomGenerator, randX, hi + this.randomGenerator.nextInt(3) - 1, randZ);
	    	        i++;
	        	}
	        }
	    }
		return true;
	}
	
	public boolean generateStratifiedVein(World currentWorld, Random randomGenerator, int chunkX, int chunkZ, 
			OreGenStratified ori, OreGenStratified alt, int rarity, int height) 
	{
		for (int i = 0; i < rarity; i++)
	    {
			int hi = this.randomGenerator.nextInt(height);
	        int randX = chunkX + this.randomGenerator.nextInt(16);
	        int randZ = chunkZ + this.randomGenerator.nextInt(16);
	        OreGenStratified ore = ori;
	        if(this.randomGenerator.nextInt(4) == 0)
	        	ore = alt;
	        ore.generate(currentWorld, randomGenerator, randX, hi, randZ);
	        if(this.randomGenerator.nextInt(40) == 0 && (rarity - i >= 3)) {
	        	for(int j = 0; j < 3; j++) {
	        		randX = chunkX + this.randomGenerator.nextInt(16);
	    	        randZ = chunkZ + this.randomGenerator.nextInt(16);
	    	        ore.generate(currentWorld, randomGenerator, randX, hi + this.randomGenerator.nextInt(3) - 1, randZ);
	    	        i++;
	        	}
	        }
	    }
		return true;
	}
	
	public boolean generateStratifiedVeinGem(World currentWorld, Random randomGenerator, int chunkX, int chunkZ, 
			OreGenStratifiedGem ore, int rarity, int height) 
	{
		for (int i = 0; i < rarity; i++)
	    {
			int hi = this.randomGenerator.nextInt(height);
	        int randX = chunkX + this.randomGenerator.nextInt(16);
	        int randZ = chunkZ + this.randomGenerator.nextInt(16);
	        ore.generate(currentWorld, randomGenerator, randX, hi, randZ);
	    }
		return true;
	}
	
	public boolean generateSimpleVein(World currentWorld, Random randomGenerator, int chunkX, int chunkZ, 
			OreGen ore, int rarity, int height) 
	{
		for (int i = 0; i < rarity; i++)
	    {
			int hi = this.randomGenerator.nextInt(height);
	        int randX = chunkX + this.randomGenerator.nextInt(16);
	        int randZ = chunkZ + this.randomGenerator.nextInt(16);
	        ore.generate(currentWorld, randomGenerator, randX, hi, randZ);
	        if(this.randomGenerator.nextInt(40) == 0 && (rarity - i >= 3)) {
	        	for(int j = 0; j < 3; j++) {
	        		randX = chunkX + this.randomGenerator.nextInt(16);
	    	        randZ = chunkZ + this.randomGenerator.nextInt(16);
	    	        ore.generate(currentWorld, randomGenerator, randX, hi + this.randomGenerator.nextInt(3) - 1, randZ);
	    	        i++;
	        	}
	        }
	    }
		return true;
	}
	
	public boolean generateCalciteVein(World currentWorld, Random randomGenerator, int chunkX, int chunkZ, 
			OreGenCalcite ore, int rarity, int height) 
	{
		for (int i = 0; i < rarity; i++)
	    {
			int hi = this.randomGenerator.nextInt(height);
	        int randX = chunkX + this.randomGenerator.nextInt(16);
	        int randZ = chunkZ + this.randomGenerator.nextInt(16);
	        ore.generate(currentWorld, randomGenerator, randX, hi, randZ);
	    }
		return true;
	}
	
	public boolean generateStratifiedVanillaVein(World currentWorld, Random randomGenerator, int chunkX, int chunkZ, 
			OreGenVanilla ore, int rarity, int height) 
	{
		for (int i = 0; i < rarity; i++)
	    {
			int hi = this.randomGenerator.nextInt(height);
	        int randX = chunkX + this.randomGenerator.nextInt(16);
	        int randZ = chunkZ + this.randomGenerator.nextInt(16);
	        ore.generate(currentWorld, randomGenerator, randX, hi, randZ);
	        if(this.randomGenerator.nextInt(40) == 0 && (rarity - i >= 3)) {
	        	for(int j = 0; j < 3; j++) {
	        		randX = chunkX + this.randomGenerator.nextInt(16);
	    	        randZ = chunkZ + this.randomGenerator.nextInt(16);
	    	        ore.generate(currentWorld, randomGenerator, randX, hi + this.randomGenerator.nextInt(3) - 1, randZ);
	    	        i++;
	        	}
	        }
	    }
		return true;
	}
	
	public void generateSlimePool() 
	{
		if(this.randomGenerator.nextInt(PropsHelperOrizon.dimensionSlimePoolRarity) == 0)
		{
			int hi = this.randomGenerator.nextInt(PropsHelperOrizon.dimensionSlimePoolHeight);
	        int randX = chunk_X + this.randomGenerator.nextInt(16);
	        int randZ = chunk_Z + this.randomGenerator.nextInt(16);
	        slimepool.generate(currentWorld, randomGenerator, randX, hi, randZ);
		}
		BiomeGenBase biomegenbase = currentWorld.getWorldChunkManager().getBiomeGenAt(chunk_X + 16, chunk_Z + 16);
		if(this.randomGenerator.nextInt(PropsHelperOrizon.dimensionSlimePoolRarity/4) == 0 && (biomegenbase == BiomeGenBase.swampland 
				|| biomegenbase == BiomeGenBase.jungle || biomegenbase == BiomeGenBase.jungleHills)) {
			int hi = this.randomGenerator.nextInt(PropsHelperOrizon.dimensionSlimePoolHeight * 3);
	        int randX = chunk_X + this.randomGenerator.nextInt(16);
	        int randZ = chunk_Z + this.randomGenerator.nextInt(16);
	        slimepool.generate(currentWorld, randomGenerator, randX, hi, randZ);
		}
		if(this.randomGenerator.nextInt(PropsHelperOrizon.dimensionSlimePoolRarity/4) == 0 && 
				(biomegenbase == BiomeGenBase.jungle || biomegenbase == BiomeGenBase.jungleHills)) {
			int hi = this.randomGenerator.nextInt(PropsHelperOrizon.dimensionSlimePoolHeight * 2);
	        int randX = chunk_X + this.randomGenerator.nextInt(16);
	        int randZ = chunk_Z + this.randomGenerator.nextInt(16);
	        slimepool.generate(currentWorld, randomGenerator, randX, hi, randZ);
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
