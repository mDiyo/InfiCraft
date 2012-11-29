package mDiyo.inficraft.infitools.hybrids;

import mDiyo.inficraft.infitools.core.InfiCore;
import mDiyo.inficraft.infitools.library.InfiLibrary;
import mDiyo.inficraft.infitools.library.InfiLibraryProxyCommon;
import mDiyo.shared.detailing.CrackManager;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.oredict.OreDictionary.OreRegisterEvent;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = "InfiHybrids", name = "InfiHybrids", version = "1.4.5_2012.11.29")
public class InfiHybrids
{
	public static boolean infitoolsPresent;
	@Instance("InfiHybrids")
	public static InfiHybrids instance;
	
	/* Proxies for sides, used for graphics processing */
	@SidedProxy(clientSide = "mDiyo.inficraft.infitools.hybrids.InfiHybridProxyClient", serverSide = "mDiyo.inficraft.infitools.hybrids.InfiHybridProxyCommon")
	public static InfiHybridProxyCommon proxy;
	
	@Init
	public void load(FMLInitializationEvent event) 
	{
		PHInfiHybrids.initProps();
		IceAxes.init();
		Mattocks.init();
		Mallets.init();
		Machetes.init();
		Scythes.init();
		addCrushingRecipes();
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void addCrushingRecipes()
	{		
		CrackManager cm = CrackManager.getInstance();
		cm.addCracking(Block.stone, 0, Block.stoneBrick, 2);
		
		cm.addCrushing(new ItemStack(Block.stone), new Object[] 
                { Block.cobblestone, InfiLibrary.stoneShard });
		cm.addCrushing(new ItemStack(Block.cobblestone), new Object[] 
                { InfiLibrary.stoneShard, InfiLibrary.stoneShard, InfiLibrary.stoneShard });
		cm.addCrushing(new ItemStack(Block.gravel), new Object[] 
                { Item.flint, Block.sand });
		cm.addCrushing(new ItemStack(Block.oreIron), new Object[] 
                { InfiLibrary.ironChunk, InfiLibrary.ironChunk, InfiLibrary.ironChunk });
		cm.addCrushing(new ItemStack(Block.oreGold), new Object[] 
                { Item.goldNugget, Item.goldNugget, Item.goldNugget,
			Item.goldNugget, Item.goldNugget, Item.goldNugget,
			Item.goldNugget, Item.goldNugget, Item.goldNugget });
		cm.addCrushing(new ItemStack(Block.oreDiamond), new Object[] 
                { InfiLibrary.diamondShard, InfiLibrary.diamondShard, InfiLibrary.diamondShard });
		cm.addCrushing(new ItemStack(Block.oreCoal), new Object[] 
                { InfiLibrary.coalBit, InfiLibrary.coalBit, InfiLibrary.coalBit, InfiLibrary.coalBit });
		cm.addCrushing(new ItemStack(Block.wood, 1, 0), new Object[] 
                { new ItemStack(Block.planks, 2, 0), new ItemStack(Item.stick, 2, 0), new ItemStack(InfiLibrary.woodSplinters, 3, 0) });
		cm.addCrushing(new ItemStack(Block.wood, 1, 1), new Object[] 
                { new ItemStack(Block.planks, 2, 1), new ItemStack(Item.stick, 2, 0), new ItemStack(InfiLibrary.woodSplinters, 3, 0) });
		cm.addCrushing(new ItemStack(Block.wood, 1, 2), new Object[] 
                { new ItemStack(Block.planks, 2, 2), new ItemStack(Item.stick, 2, 0), new ItemStack(InfiLibrary.woodSplinters, 3, 0) });
		cm.addCrushing(new ItemStack(Block.wood, 1, 3), new Object[] 
                { new ItemStack(Block.planks, 2, 3), new ItemStack(Item.stick, 2, 0), new ItemStack(InfiLibrary.woodSplinters, 3, 0) });
		cm.addCrushing(new ItemStack(Block.glass), new Object[] 
                { InfiLibrary.glassShard });
		cm.addCrushing(new ItemStack(Block.pistonBase), new Object[] 
                { Item.ingotIron, Item.redstone, new ItemStack(Block.cobblestone, 4), new ItemStack(Block.planks, 3) });
		cm.addCrushing(new ItemStack(Block.pistonStickyBase), new Object[] 
                { Item.ingotIron, Item.redstone, new ItemStack(Block.cobblestone, 4), new ItemStack(Block.planks, 3), Item.slimeBall });
		cm.addCrushing(new ItemStack(Block.music), new Object[] 
                { Item.stick, Item.redstone });
		cm.addCrushing(new ItemStack(Block.dispenser), new Object[] 
                { new ItemStack(Block.cobblestone, 8), Item.bow });
		cm.addCrushing(new ItemStack(Block.sandStone), new Object[] 
                { InfiLibrary.sandstoneShard, InfiLibrary.sandstoneShard, InfiLibrary.sandstoneShard });
		cm.addCrushing(new ItemStack(Block.cloth), new Object[] 
                { Item.silk, Item.silk, Item.silk, Item.silk });
		cm.addCrushing(new ItemStack(Block.cobblestoneMossy), new Object[] 
                { InfiLibrary.mossBall, InfiLibrary.mossBall, InfiLibrary.mossBall, InfiLibrary.mossBall });
		cm.addCrushing(new ItemStack(Block.obsidian), new Object[] 
                { InfiLibrary.obsidianShard, InfiLibrary.obsidianShard, InfiLibrary.obsidianShard });
		cm.addCrushing(new ItemStack(Block.torchWood, 1, -1), new Object[] 
                { Item.stick, InfiLibrary.coalBit });
		cm.addCrushing(new ItemStack(Block.stairCompactPlanks), new Object[] 
                { Block.planks, Block.planks, Item.stick, Item.stick, InfiLibrary.woodSplinters, InfiLibrary.woodSplinters });
		cm.addCrushing(new ItemStack(Block.chest), new Object[] 
                { Block.planks, Block.planks, Item.stick, Item.stick, InfiLibrary.woodSplinters, InfiLibrary.woodSplinters });
		cm.addCrushing(new ItemStack(Block.workbench), new Object[] 
                { Block.planks, Block.planks, Item.stick, Item.stick, InfiLibrary.woodSplinters, InfiLibrary.woodSplinters });
		cm.addCrushing(new ItemStack(Block.ladder), new Object[] 
                { Item.stick, Item.stick });
		cm.addCrushing(new ItemStack(Block.stairCompactCobblestone), new Object[] 
                { Block.cobblestone, InfiLibrary.stoneShard });
		cm.addCrushing(new ItemStack(Block.lever), new Object[] 
                { InfiLibrary.stoneShard, InfiLibrary.woodSplinters });
		cm.addCrushing(new ItemStack(Block.cactus), new Object[] 
                { InfiLibrary.cactusShard, InfiLibrary.cactusShard });
		cm.addCrushing(new ItemStack(Block.jukebox), new Object[] 
                { Item.stick, Item.diamond });
		cm.addCrushing(new ItemStack(Block.fence), new Object[] 
                { Item.stick, Item.stick, Item.stick });
		cm.addCrushing(new ItemStack(Block.netherrack), new Object[] 
                { InfiLibrary.netherrackShard, InfiLibrary.netherrackShard, InfiLibrary.netherrackShard });
		cm.addCrushing(new ItemStack(Block.trapdoor), new Object[] 
                { Block.planks, Block.planks, Item.stick, Item.stick, InfiLibrary.woodSplinters, InfiLibrary.woodSplinters });
		cm.addCrushing(new ItemStack(Block.brick), new Object[] 
                { Item.brick, Item.brick, Item.brick, Item.brick });
		cm.addCrushing(new ItemStack(Block.ice), new Object[] 
                { InfiLibrary.iceShard, InfiLibrary.iceShard, InfiLibrary.iceShard });
	}
	
	@ForgeSubscribe
	private void oreDictionarySupport(OreRegisterEvent event)
	{
		if (infitoolsPresent)
		{
			String ore = event.Name;
			ItemStack itemstack = event.Ore;
			
            if(PHInfiHybrids.enableCopperTools && ore.equals("ingotCopper"))
            {
            	IceAxes.addCopperTools(itemstack);
            	Mattocks.addCopperTools(itemstack);
            	Mallets.addCopperTools(itemstack);
            	Machetes.addCopperTools(itemstack);
            	Scythes.addCopperTools(itemstack);
            }
            if(PHInfiHybrids.enableBronzeTools && ore.equals("ingotBronze"))
            {
	            IceAxes.addBronzeTools(itemstack);
	            Mattocks.addBronzeTools(itemstack);
	            Mallets.addBronzeTools(itemstack);
	            Machetes.addBronzeTools(itemstack);
	            Scythes.addBronzeTools(itemstack);
            }
            if(PHInfiHybrids.enableWorkedIronTools && ore.equals("ingotRefinedIron"))
            {
	            IceAxes.addWorkedIronTools(itemstack);
	            Mattocks.addWorkedIronTools(itemstack);
	            Mallets.addWorkedIronTools(itemstack);
	            Machetes.addWorkedIronTools(itemstack);
	            Scythes.addWorkedIronTools(itemstack);
            }
            if(PHInfiHybrids.enableSteelTools && ore.equals("ingotSteel"))
            {
	            IceAxes.addSteelTools(itemstack);
	            Mattocks.addSteelTools(itemstack);
	            Mallets.addSteelTools(itemstack);
	            Machetes.addSteelTools(itemstack);
	            Scythes.addSteelTools(itemstack);
            }
            if(PHInfiHybrids.enableCobaltTools && ore.equals("ingotCobalt"))
            {
	            IceAxes.addCobaltTools(itemstack);
	            Mattocks.addCobaltTools(itemstack);
	            Mallets.addCobaltTools(itemstack);
	            Machetes.addCobaltTools(itemstack);
	            Scythes.addCobaltTools(itemstack);
            }
            if(PHInfiHybrids.enableArditeTools && ore.equals("ingotArdite"))
            {
	            IceAxes.addArditeTools(itemstack);
	            Mattocks.addArditeTools(itemstack);
	            Mallets.addArditeTools(itemstack);
	            Machetes.addArditeTools(itemstack);
	            Scythes.addArditeTools(itemstack);
            }
            if(PHInfiHybrids.enableManyullynTools && ore.equals("ingotManyullyn"))
            {
            	IceAxes.addManyullynTools(itemstack);
            	Mattocks.addManyullynTools(itemstack);
            	Mallets.addManyullynTools(itemstack);
            	Machetes.addManyullynTools(itemstack);
            	Scythes.addManyullynTools(itemstack);
            }
            if(PHInfiHybrids.enableUraniumTools && ore.equals("ingotUranium"))
            {
	            IceAxes.addUraniumTools(itemstack);
	            Mattocks.addUraniumTools(itemstack);
	            Mallets.addUraniumTools(itemstack);
	            Machetes.addUraniumTools(itemstack);
	            Scythes.addUraniumTools(itemstack);
            }
            if(PHInfiHybrids.enableStoneTools && (ore.equals("customCobblestone") || ore.equals("customStone")))
            {
	            IceAxes.addStoneTools(itemstack);
	            Mattocks.addStoneTools(itemstack);
	            Mallets.addStoneTools(itemstack);
	            Machetes.addStoneTools(itemstack);
	            Scythes.addStoneTools(itemstack);
            }
		}
	}

}
