package inficraft.orizon.pastelmarble;

import java.io.File;

import net.minecraft.src.Block;
import net.minecraft.src.FurnaceRecipes;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class PastelProxyCommon 
{
	/* Registers any rendering code. Does nothing server-side */
	public void registerRenderer() {}
	
	/* Ties an internal name to a visible one. Does nothing server-side */
	public void addNames() {}
	
	public void addRecipes()
	{
		GameRegistry.addRecipe(new ItemStack(Block.stoneSingleSlab, 6, 3), 
				"###", '#', new ItemStack(PastelMarble.instance.cCobble, 1, -1));
		GameRegistry.addRecipe(new ItemStack(Block.stoneSingleSlab, 6, 0), 
				"###", '#', new ItemStack(PastelMarble.instance.cStone, 1, -1));
		GameRegistry.addRecipe(new ItemStack(Block.stoneSingleSlab, 6, 5), 
				"###", '#', new ItemStack(PastelMarble.instance.cBrick, 1, -1));
		GameRegistry.addRecipe(new ItemStack(Item.brewingStand, 1), 
				" B ", "###", '#', new ItemStack(PastelMarble.instance.cCobble, 1, -1), 'B', Item.blazeRod);
		GameRegistry.addRecipe(new ItemStack(Block.stairCompactCobblestone, 4), 
				"#  ", "## ", "###", '#', new ItemStack(PastelMarble.instance.cCobble, 1, -1));
		GameRegistry.addRecipe(new ItemStack(Block.stairsStoneBrickSmooth, 4), 
				"#  ", "## ", "###", '#', new ItemStack(PastelMarble.instance.cBrick, 1, -1));
		GameRegistry.addRecipe(new ItemStack(Block.lever, 1), 
				"X", "#", '#', new ItemStack(PastelMarble.instance.cCobble, 1, -1), 'X', Item.stick);
		GameRegistry.addRecipe(new ItemStack(Block.stoneButton, 1), 
				"#", '#', new ItemStack(PastelMarble.instance.cStone, 1, -1));
		GameRegistry.addRecipe(new ItemStack(Item.redstoneRepeater, 1), 
				"#X#", "III", '#', Block.torchRedstoneActive, 'X', Item.redstone, 'I', new ItemStack(PastelMarble.instance.cStone, 1, -1));
		GameRegistry.addRecipe(new ItemStack(Block.pressurePlateStone, 1), 
				"##", '#', new ItemStack(PastelMarble.instance.cStone, 1, -1));
        GameRegistry.addRecipe(new ItemStack(Block.dispenser, 1), 
        		"###", "#X#", "#R#", '#', new ItemStack(PastelMarble.instance.cCobble, 1, -1), 'X', Item.bow, 'R', Item.redstone);
        GameRegistry.addRecipe(new ItemStack(Block.pistonBase, 1), 
        		"TTT", "#X#", "#R#", '#', new ItemStack(PastelMarble.instance.cCobble, 1, -1), 'X', Item.ingotIron, 'R', Item.redstone, 'T', Block.planks);
	
        GameRegistry.addRecipe(new ItemStack(Item.pickaxeStone), 
				"###", " | ", " | ", '#', new ItemStack(PastelMarble.instance.cCobble, 1, -1), '|', Item.stick);
        GameRegistry.addRecipe(new ItemStack(Item.shovelStone), 
				"#", "|", "|", '#', new ItemStack(PastelMarble.instance.cCobble, 1, -1), '|', Item.stick);
        GameRegistry.addRecipe(new ItemStack(Item.axeStone), 
				"##", "#|", " |", '#', new ItemStack(PastelMarble.instance.cCobble, 1, -1), '|', Item.stick);
        GameRegistry.addRecipe(new ItemStack(Item.swordStone), 
				"#", "#", "|", '#', new ItemStack(PastelMarble.instance.cCobble, 1, -1), '|', Item.stick);
        GameRegistry.addRecipe(new ItemStack(Item.hoeStone), 
				"##", " |", " |", '#', new ItemStack(PastelMarble.instance.cCobble, 1, -1), '|', Item.stick);
        
        GameRegistry.addRecipe(new ItemStack(Block.stoneOvenIdle), 
        		"###", "# #", "###", '#', new ItemStack(PastelMarble.instance.cCobble, 1, -1));
        for(int i = 0; i < 16; i++) {
        	GameRegistry.addRecipe(new ItemStack(PastelMarble.instance.cBrick, 4, i), 
        		"##", "##", '#', new ItemStack(PastelMarble.instance.cStone, 1, i));

        	FurnaceRecipes.smelting().addSmelting(PHPastel.cCobbleID, i, new ItemStack(PastelMarble.instance.cStone, 1, i), 0.15f);
        	GameRegistry.addRecipe( new ShapelessOreRecipe(new ItemStack(PHPastel.cMossyID, 1, i), new ItemStack(PHPastel.cBrickID, 1, i), "mossyPatch" ));
        }
        for(int i = 0; i < 6; i++) 
        {
        	FurnaceRecipes.smelting().addSmelting(PHPastel.marbleID, i+6, new ItemStack(PastelMarble.instance.marble, 1, i), 0.15f);
        }
        
       
	}

	public File getMinecraftDir()
    {
        return new File(".");
    }
}
