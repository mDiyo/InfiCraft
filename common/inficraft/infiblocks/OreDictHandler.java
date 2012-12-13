package inficraft.infiblocks;

import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class OreDictHandler 
{
	public void oreDictionarySupport()
    {
		//TODO: Figure out the new ore dictionary
        //MinecraftForge.registerOreHandler(new IOreHandler()
        {
            //public void registerOre(String ore, ItemStack stack)
            {
            	String ore = "derp";
            	ItemStack stack = new ItemStack(Block.dirt);
                if(ore.equals("customCobblestone"))
                {
                	GameRegistry.addRecipe(new ItemStack(InfiBlocks.getContentInstance().workbench, 1), new Object[]
            	            { "##", "##", '#', stack });
                }
                if(ore.equals("stoneRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("ironRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("diamondRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("redstoneRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("obsidianRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("sandstoneRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("paperRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("mossyRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("netherrackRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("glowstoneRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("lavaRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("iceRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("slimeRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("cactusRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("flintRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("copperRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("bronzeRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("workedIronRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("steelRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("cobaltRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("arditeRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("manyullynRod"))
                {
                	addStickRecipe(stack);
                }
                else if(ore.equals("uraniumRod"))
                {
                	addStickRecipe(stack);
                }
            }
        }
    }
	
	private void addStickRecipe(ItemStack stack)
	{
		GameRegistry.addRecipe(new ItemStack(Block.torchWood, 4), new Object[]
		{
			"c", "s", 'c', new ItemStack(Item.coal, 1, -1), 's', stack
		});
		GameRegistry.addRecipe(new ItemStack(Block.torchRedstoneActive, 1), new Object[]
		{
			"c", "s", 'c', new ItemStack(Item.redstone, 1, 0), 's', stack
		});
		GameRegistry.addRecipe(new ItemStack(Block.lever, 1), new Object[]
		{
			"s", "c", 'c', new ItemStack(Block.cobblestone, 1, 0), 's', stack
		});
		GameRegistry.addRecipe(new ItemStack(Block.rail, 16), new Object[]
		{
			"c c", "csc", "c c", 'c', new ItemStack(Item.ingotIron, 1, 0), 's', stack
		});
		GameRegistry.addRecipe(new ItemStack(Block.railPowered, 6), new Object[]
		{
			"c c", "csc", "crc", 'c', new ItemStack(Item.ingotGold, 1, -1), 
			's', stack, 'r', new ItemStack(Item.redstone, 1, 0)
		});
	}

}
