package inficraft.infitools.base;
import inficraft.infitools.base.buckets.BucketInteractHandler;
import inficraft.infitools.base.buckets.InfiBucketHandler;
import inficraft.infitools.library.InfiLibrary;

import java.util.List;

import net.minecraft.src.CraftingManager;
import net.minecraft.src.IRecipe;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ShapedRecipes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.oredict.OreDictionary.OreRegisterEvent;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;


@Mod(modid = "InfiTools", name = "InfiTools", version = "1.4.5_2012.12.14")
public class InfiBase
{
	@Instance("InfiTools")
	public static InfiBase instance;
	
	/* Proxies for sides, used for graphics processing */
	@SidedProxy(clientSide = "inficraft.infitools.base.InfiCoreProxyClient", serverSide = "inficraft.infitools.base.InfiCoreProxyCommon")
	public static InfiCoreProxyCommon proxy;

	@Init
	public void load(FMLInitializationEvent event) 
	{
		PHInfiTools.initProps();
		removeVanillaRecipes();
		Pickaxes.init();
		Swords.init();
		Shovels.init();
		Axes.init();
		Hoes.init();
		Items.init();
		MinecraftForge.EVENT_BUS.register(this);
		MinecraftForge.EVENT_BUS.register(new InfiBucketHandler());
        MinecraftForge.EVENT_BUS.register(new BucketInteractHandler());
	}
	
	private void removeVanillaRecipes()
	{
		/*System.out.println("Note: Some conflicts here are supposed to happen");
		System.out.println("      if *Overwrite Vanilla Tools* is enabled");*/
		ItemStack[] vanillaTools = {
			/*new ItemStack(Item.axeWood), new ItemStack(Item.pickaxeWood), new ItemStack(Item.shovelWood), 
			new ItemStack(Item.swordWood),new ItemStack(Item.hoeWood),
			
			new ItemStack(Item.axeStone), new ItemStack(Item.pickaxeStone), new ItemStack(Item.shovelStone), 
			new ItemStack(Item.swordStone),new ItemStack(Item.hoeStone),
			
			new ItemStack(Item.axeSteel), new ItemStack(Item.pickaxeSteel), new ItemStack(Item.shovelSteel), 
			new ItemStack(Item.swordSteel),new ItemStack(Item.hoeSteel),
			
			new ItemStack(Item.axeDiamond), new ItemStack(Item.pickaxeDiamond), new ItemStack(Item.shovelDiamond), 
			new ItemStack(Item.swordDiamond),new ItemStack(Item.hoeDiamond),*/
			
			/*new ItemStack(Item.axeGold), new ItemStack(Item.pickaxeGold), new ItemStack(Item.shovelGold), 
			new ItemStack(Item.swordGold),new ItemStack(Item.hoeGold),*/
			
			new ItemStack(Item.bucketEmpty)
		};
		
		for (int i = 0; i < vanillaTools.length; i++)
		{
			removeRecipe(vanillaTools[i]);
		}		
	}
	
	private void removeRecipe(ItemStack resultItem) {
		List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
		for (int i = 0; i < recipes.size(); i++) 
		{
			IRecipe tmpRecipe = recipes.get(i);
			if (tmpRecipe instanceof ShapedRecipes) {
				ShapedRecipes recipe = (ShapedRecipes)tmpRecipe;
				ItemStack recipeResult = recipe.getRecipeOutput();
			
				if (ItemStack.areItemStacksEqual(resultItem, recipeResult)) {
					recipes.remove(i--);
				}
			}
		}
	}

	public static String itemTexture = "/infitextures/coreitems.png";
}
