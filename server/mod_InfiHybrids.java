package net.minecraft.src;
import net.minecraft.src.forge.*;
import net.minecraft.src.infihybrids.*;

public class mod_InfiHybrids extends BaseMod
{
	public static boolean infitoolsPresent;
		
	@Override
	public String getVersion() 
	{
		return "2.0.2";
	}

	@Override
	public void load() 
	{
		PropsHelperInfiHybrids.initProps();
		checkForInfiTools();
		IceAxes.init();
		Mattocks.init();
		Mallets.init();
		Machetes.init();
		Scythes.init();
		addCrushingRecipes();
		oreDictionarySupport();
	}
	
	public static void checkForInfiTools()
    {
        try
        {
        	Class class1 = Class.forName("mod_InfiTools");
        	infitoolsPresent = true;
        }
        catch (Throwable throwable)
        {
        	infitoolsPresent = false;
        }
    }
	
	private void addCrushingRecipes()
	{		
		CrackManager cm = CrackManager.getInstance();
		cm.addCracking(Block.stone, 0, Block.stoneBrick, 2);
		
		cm.addCrushing(new ItemStack(Block.stone), new Object[] 
                { Block.cobblestone, mod_InfiBase.stoneShard });
		cm.addCrushing(new ItemStack(Block.cobblestone), new Object[] 
                { mod_InfiBase.stoneShard, mod_InfiBase.stoneShard, mod_InfiBase.stoneShard });
		cm.addCrushing(new ItemStack(Block.gravel), new Object[] 
                { Item.flint, Block.sand });
		cm.addCrushing(new ItemStack(Block.oreIron), new Object[] 
                { mod_InfiBase.ironChunk, mod_InfiBase.ironChunk, mod_InfiBase.ironChunk });
		cm.addCrushing(new ItemStack(Block.oreGold), new Object[] 
                { Item.goldNugget, Item.goldNugget, Item.goldNugget,
			Item.goldNugget, Item.goldNugget, Item.goldNugget,
			Item.goldNugget, Item.goldNugget, Item.goldNugget });
		cm.addCrushing(new ItemStack(Block.oreDiamond), new Object[] 
                { mod_InfiBase.diamondShard, mod_InfiBase.diamondShard, mod_InfiBase.diamondShard });
		cm.addCrushing(new ItemStack(Block.oreCoal), new Object[] 
                { mod_InfiBase.coalBit, mod_InfiBase.coalBit, mod_InfiBase.coalBit, mod_InfiBase.coalBit });
		cm.addCrushing(new ItemStack(Block.wood, 1, 0), new Object[] 
                { new ItemStack(Block.planks, 2, 0), new ItemStack(Item.stick, 2, 0), new ItemStack(mod_InfiBase.woodSplinters, 3, 0) });
		cm.addCrushing(new ItemStack(Block.wood, 1, 1), new Object[] 
                { new ItemStack(Block.planks, 2, 1), new ItemStack(Item.stick, 2, 0), new ItemStack(mod_InfiBase.woodSplinters, 3, 0) });
		cm.addCrushing(new ItemStack(Block.wood, 1, 2), new Object[] 
                { new ItemStack(Block.planks, 2, 2), new ItemStack(Item.stick, 2, 0), new ItemStack(mod_InfiBase.woodSplinters, 3, 0) });
		cm.addCrushing(new ItemStack(Block.wood, 1, 3), new Object[] 
                { new ItemStack(Block.planks, 2, 3), new ItemStack(Item.stick, 2, 0), new ItemStack(mod_InfiBase.woodSplinters, 3, 0) });
		cm.addCrushing(new ItemStack(Block.glass), new Object[] 
                { mod_InfiBase.glassShard });
		cm.addCrushing(new ItemStack(Block.pistonBase), new Object[] 
                { Item.ingotIron, Item.redstone, new ItemStack(Block.cobblestone, 4), new ItemStack(Block.planks, 3) });
		cm.addCrushing(new ItemStack(Block.pistonStickyBase), new Object[] 
                { Item.ingotIron, Item.redstone, new ItemStack(Block.cobblestone, 4), new ItemStack(Block.planks, 3), Item.slimeBall });
		cm.addCrushing(new ItemStack(Block.music), new Object[] 
                { Item.stick, Item.redstone });
		cm.addCrushing(new ItemStack(Block.dispenser), new Object[] 
                { new ItemStack(Block.cobblestone, 8), Item.bow });
		cm.addCrushing(new ItemStack(Block.sandStone), new Object[] 
                { mod_InfiBase.sandstoneShard, mod_InfiBase.sandstoneShard, mod_InfiBase.sandstoneShard });
		cm.addCrushing(new ItemStack(Block.cloth), new Object[] 
                { Item.silk, Item.silk, Item.silk, Item.silk });
		cm.addCrushing(new ItemStack(Block.cobblestoneMossy), new Object[] 
                { mod_InfiBase.mossBall, mod_InfiBase.mossBall, mod_InfiBase.mossBall, mod_InfiBase.mossBall });
		cm.addCrushing(new ItemStack(Block.obsidian), new Object[] 
                { mod_InfiBase.obsidianShard, mod_InfiBase.obsidianShard, mod_InfiBase.obsidianShard });
		cm.addCrushing(new ItemStack(Block.torchWood), new Object[] 
                { Item.stick, mod_InfiBase.coalBit });
		cm.addCrushing(new ItemStack(Block.stairCompactPlanks), new Object[] 
                { Block.planks, Block.planks, Item.stick, Item.stick, mod_InfiBase.woodSplinters, mod_InfiBase.woodSplinters });
		cm.addCrushing(new ItemStack(Block.chest), new Object[] 
                { Block.planks, Block.planks, Item.stick, Item.stick, mod_InfiBase.woodSplinters, mod_InfiBase.woodSplinters });
		cm.addCrushing(new ItemStack(Block.workbench), new Object[] 
                { Block.planks, Block.planks, Item.stick, Item.stick, mod_InfiBase.woodSplinters, mod_InfiBase.woodSplinters });
		cm.addCrushing(new ItemStack(Block.ladder), new Object[] 
                { Item.stick, Item.stick });
		cm.addCrushing(new ItemStack(Block.stairCompactCobblestone), new Object[] 
                { Block.cobblestone, mod_InfiBase.stoneShard });
		cm.addCrushing(new ItemStack(Block.lever), new Object[] 
                { mod_InfiBase.stoneShard, mod_InfiBase.woodSplinters });
		cm.addCrushing(new ItemStack(Block.cactus), new Object[] 
                { mod_InfiBase.cactusShard, mod_InfiBase.cactusShard });
		cm.addCrushing(new ItemStack(Block.jukebox), new Object[] 
                { Item.stick, Item.diamond });
		cm.addCrushing(new ItemStack(Block.fence), new Object[] 
                { Item.stick, Item.stick, Item.stick });
		cm.addCrushing(new ItemStack(Block.netherrack), new Object[] 
                { mod_InfiBase.netherrackShard, mod_InfiBase.netherrackShard, mod_InfiBase.netherrackShard });
		cm.addCrushing(new ItemStack(Block.trapdoor), new Object[] 
                { Block.planks, Block.planks, Item.stick, Item.stick, mod_InfiBase.woodSplinters, mod_InfiBase.woodSplinters });
		cm.addCrushing(new ItemStack(Block.brick), new Object[] 
                { Item.brick, Item.brick, Item.brick, Item.brick });
	}
	
	private void oreDictionarySupport()
	{
		if (infitoolsPresent)
		{
		    MinecraftForge.registerOreHandler(new IOreHandler()
		    {
		        public void registerOre(String ore, ItemStack itemstack)
		        {
		            if(PropsHelperInfiHybrids.enableCopperTools && ore.equals("ingotCopper"))
		            {
		            	IceAxes.addCopperTools(itemstack);
		            	Mattocks.addCopperTools(itemstack);
		            	Mallets.addCopperTools(itemstack);
		            	Machetes.addCopperTools(itemstack);
		            	Scythes.addCopperTools(itemstack);
		            }
		            if(PropsHelperInfiHybrids.enableBronzeTools && ore.equals("ingotBronze"))
		            {
			            IceAxes.addBronzeTools(itemstack);
			            Mattocks.addBronzeTools(itemstack);
			            Mallets.addBronzeTools(itemstack);
			            Machetes.addBronzeTools(itemstack);
			            Scythes.addBronzeTools(itemstack);
		            }
		            if(PropsHelperInfiHybrids.enableWorkedIronTools && ore.equals("ingotRefinedIron"))
		            {
			            IceAxes.addWorkedIronTools(itemstack);
			            Mattocks.addWorkedIronTools(itemstack);
			            Mallets.addWorkedIronTools(itemstack);
			            Machetes.addWorkedIronTools(itemstack);
			            Scythes.addWorkedIronTools(itemstack);
		            }
		            if(PropsHelperInfiHybrids.enableSteelTools && ore.equals("ingotSteel"))
		            {
			            IceAxes.addSteelTools(itemstack);
			            Mattocks.addSteelTools(itemstack);
			            Mallets.addSteelTools(itemstack);
			            Machetes.addSteelTools(itemstack);
			            Scythes.addSteelTools(itemstack);
		            }
		            if(PropsHelperInfiHybrids.enableCobaltTools && ore.equals("ingotCobalt"))
		            {
			            IceAxes.addCobaltTools(itemstack);
			            Mattocks.addCobaltTools(itemstack);
			            Mallets.addCobaltTools(itemstack);
			            Machetes.addCobaltTools(itemstack);
			            Scythes.addCobaltTools(itemstack);
		            }
		            if(PropsHelperInfiHybrids.enableArditeTools && ore.equals("ingotArdite"))
		            {
			            IceAxes.addArditeTools(itemstack);
			            Mattocks.addArditeTools(itemstack);
			            Mallets.addArditeTools(itemstack);
			            Machetes.addArditeTools(itemstack);
			            Scythes.addArditeTools(itemstack);
		            }
		            if(PropsHelperInfiHybrids.enableManyullynTools && ore.equals("ingotManyullyn"))
		            {
		            	IceAxes.addManyullynTools(itemstack);
		            	Mattocks.addManyullynTools(itemstack);
		            	Mallets.addManyullynTools(itemstack);
		            	Machetes.addManyullynTools(itemstack);
		            	Scythes.addManyullynTools(itemstack);
		            }
		            if(PropsHelperInfiHybrids.enableUraniumTools && ore.equals("ingotUranium"))
		            {
			            IceAxes.addUraniumTools(itemstack);
			            Mattocks.addUraniumTools(itemstack);
			            Mallets.addUraniumTools(itemstack);
			            Machetes.addUraniumTools(itemstack);
			            Scythes.addUraniumTools(itemstack);
		            }
		            if(PropsHelperInfiHybrids.enableStoneTools && (ore.equals("customCobblestone") || ore.equals("customStone")))
		            {
			            IceAxes.addStoneTools(itemstack);
			            Mattocks.addStoneTools(itemstack);
			            Mallets.addStoneTools(itemstack);
			            Machetes.addStoneTools(itemstack);
			            Scythes.addStoneTools(itemstack);
		            }
		        }
		    } );
		}
	}

}
