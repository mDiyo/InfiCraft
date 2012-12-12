package mDiyo.inficraft.infitools.hybrids;

import mDiyo.api.detailing.DetailManager;
import mDiyo.inficraft.infitools.core.InfiCore;
import mDiyo.inficraft.infitools.library.InfiLibrary;
import mDiyo.inficraft.infitools.library.InfiLibraryProxyCommon;
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

@Mod(modid = "InfiHybrids", name = "InfiHybrids", version = "1.4.5_2012.12.11")
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
	}
	
	private void addCrushingRecipes()
	{
		DetailManager dm = DetailManager.getInstance();
		dm.addCracking(Block.stone, 0, Block.stoneBrick, 2);
		
		dm.addCrushRecipe(new ItemStack(Block.stone), new Object[] 
                { Block.cobblestone, InfiLibrary.stoneShard });
		dm.addCrushRecipe(new ItemStack(Block.cobblestone), new Object[] 
                { InfiLibrary.stoneShard, InfiLibrary.stoneShard, InfiLibrary.stoneShard });
		dm.addCrushRecipe(new ItemStack(Block.gravel), new Object[] 
                { Item.flint, Block.sand });
		dm.addCrushRecipe(new ItemStack(Block.oreIron), new Object[] 
                { InfiLibrary.ironChunk, InfiLibrary.ironChunk, InfiLibrary.ironChunk });
		dm.addCrushRecipe(new ItemStack(Block.oreGold), new Object[] 
                { Item.goldNugget, Item.goldNugget, Item.goldNugget,
			Item.goldNugget, Item.goldNugget, Item.goldNugget,
			Item.goldNugget, Item.goldNugget, Item.goldNugget });
		dm.addCrushRecipe(new ItemStack(Block.oreDiamond), new Object[] 
                { InfiLibrary.diamondShard, InfiLibrary.diamondShard, InfiLibrary.diamondShard });
		dm.addCrushRecipe(new ItemStack(Block.oreCoal), new Object[] 
                { InfiLibrary.coalBit, InfiLibrary.coalBit, InfiLibrary.coalBit, InfiLibrary.coalBit });
		dm.addCrushRecipe(new ItemStack(Block.wood, 1, 0), new Object[] 
                { new ItemStack(Block.planks, 2, 0), new ItemStack(Item.stick, 2, 0), new ItemStack(InfiLibrary.woodSplinters, 3, 0) });
		dm.addCrushRecipe(new ItemStack(Block.wood, 1, 1), new Object[] 
                { new ItemStack(Block.planks, 2, 1), new ItemStack(Item.stick, 2, 0), new ItemStack(InfiLibrary.woodSplinters, 3, 0) });
		dm.addCrushRecipe(new ItemStack(Block.wood, 1, 2), new Object[] 
                { new ItemStack(Block.planks, 2, 2), new ItemStack(Item.stick, 2, 0), new ItemStack(InfiLibrary.woodSplinters, 3, 0) });
		dm.addCrushRecipe(new ItemStack(Block.wood, 1, 3), new Object[] 
                { new ItemStack(Block.planks, 2, 3), new ItemStack(Item.stick, 2, 0), new ItemStack(InfiLibrary.woodSplinters, 3, 0) });
		dm.addCrushRecipe(new ItemStack(Block.glass), new Object[] 
                { InfiLibrary.glassShard });
		dm.addCrushRecipe(new ItemStack(Block.pistonBase), new Object[] 
                { Item.ingotIron, Item.redstone, new ItemStack(Block.cobblestone, 4), new ItemStack(Block.planks, 3) });
		dm.addCrushRecipe(new ItemStack(Block.pistonStickyBase), new Object[] 
                { Item.ingotIron, Item.redstone, new ItemStack(Block.cobblestone, 4), new ItemStack(Block.planks, 3), Item.slimeBall });
		dm.addCrushRecipe(new ItemStack(Block.music), new Object[] 
                { Item.stick, Item.redstone });
		dm.addCrushRecipe(new ItemStack(Block.dispenser), new Object[] 
                { new ItemStack(Block.cobblestone, 8), Item.bow });
		dm.addCrushRecipe(new ItemStack(Block.sandStone), new Object[] 
                { InfiLibrary.sandstoneShard, InfiLibrary.sandstoneShard, InfiLibrary.sandstoneShard });
		dm.addCrushRecipe(new ItemStack(Block.cloth), new Object[] 
                { Item.silk, Item.silk, Item.silk, Item.silk });
		dm.addCrushRecipe(new ItemStack(Block.cobblestoneMossy), new Object[] 
                { InfiLibrary.mossBall, InfiLibrary.mossBall, InfiLibrary.mossBall, InfiLibrary.mossBall });
		dm.addCrushRecipe(new ItemStack(Block.obsidian), new Object[] 
                { InfiLibrary.obsidianShard, InfiLibrary.obsidianShard, InfiLibrary.obsidianShard });
		dm.addCrushRecipe(new ItemStack(Block.torchWood, 1, -1), new Object[] 
                { Item.stick, InfiLibrary.coalBit });
		dm.addCrushRecipe(new ItemStack(Block.stairCompactPlanks), new Object[] 
                { Block.planks, Block.planks, Item.stick, Item.stick, InfiLibrary.woodSplinters, InfiLibrary.woodSplinters });
		dm.addCrushRecipe(new ItemStack(Block.chest), new Object[] 
                { Block.planks, Block.planks, Item.stick, Item.stick, InfiLibrary.woodSplinters, InfiLibrary.woodSplinters });
		dm.addCrushRecipe(new ItemStack(Block.workbench), new Object[] 
                { Block.planks, Block.planks, Item.stick, Item.stick, InfiLibrary.woodSplinters, InfiLibrary.woodSplinters });
		dm.addCrushRecipe(new ItemStack(Block.ladder), new Object[] 
                { Item.stick, Item.stick });
		dm.addCrushRecipe(new ItemStack(Block.stairCompactCobblestone), new Object[] 
                { Block.cobblestone, InfiLibrary.stoneShard });
		dm.addCrushRecipe(new ItemStack(Block.lever), new Object[] 
                { InfiLibrary.stoneShard, InfiLibrary.woodSplinters });
		dm.addCrushRecipe(new ItemStack(Block.cactus), new Object[] 
                { InfiLibrary.cactusShard, InfiLibrary.cactusShard });
		dm.addCrushRecipe(new ItemStack(Block.jukebox), new Object[] 
                { Item.stick, Item.diamond });
		dm.addCrushRecipe(new ItemStack(Block.fence), new Object[] 
                { Item.stick, Item.stick, Item.stick });
		dm.addCrushRecipe(new ItemStack(Block.netherrack), new Object[] 
                { InfiLibrary.netherrackShard, InfiLibrary.netherrackShard, InfiLibrary.netherrackShard });
		dm.addCrushRecipe(new ItemStack(Block.trapdoor), new Object[] 
                { Block.planks, Block.planks, Item.stick, Item.stick, InfiLibrary.woodSplinters, InfiLibrary.woodSplinters });
		dm.addCrushRecipe(new ItemStack(Block.brick), new Object[] 
                { Item.brick, Item.brick, Item.brick, Item.brick });
		dm.addCrushRecipe(new ItemStack(Block.ice), new Object[] 
                { InfiLibrary.iceShard, InfiLibrary.iceShard, InfiLibrary.iceShard });
	}
}
