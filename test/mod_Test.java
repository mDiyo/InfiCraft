package test;

import inficraft.infiblocks.InfiBlocks;

import java.io.InputStream;
import java.io.InputStreamReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import net.minecraft.block.Block;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import tinker.armory.Armory;
import tinker.tconstruct.items.TArmor;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

/*
 * mDiyo's development testing mod
 * Free everything from dirt!
 */

@Mod(modid = "mod_Test", name = "mod_Test", version = "Test")
public class mod_Test 
{
	public static Item xinstick;
	public static Item TArmorChestplate;

	@PreInit
	public void preInit(FMLPreInitializationEvent evt)
	{
	}

	@PostInit
	public void postInit (FMLPostInitializationEvent evt) throws ScriptException
	{
		TArmorChestplate = new TArmor(4598, EnumArmorMaterial.CLOTH, 2, 1);
		GameRegistry.addRecipe(new ItemStack(Block.waterStill, 64, 0), "s", 's', Block.dirt);
		GameRegistry.addRecipe(new ItemStack(InfiBlocks.getContentInstance().chiselDiamond, 64, 0), "ss", 's', Block.dirt);
		GameRegistry.addRecipe(new ItemStack(InfiBlocks.getContentInstance().storageBlock, 64, 0), "s", "s", 's', Block.dirt);

		/*ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("ruby");
        InputStream resource = mod_Test.class.getResourceAsStream("/test/JTest.rb");
        engine.eval(new InputStreamReader(resource));*/
		//JTest jRubyTest = new JTest();

		// Cycle through metadata, don't go over the maximum or it will crash on mouseover
		for (int i = 0; i < 15; i++)
		{
			//GameRegistry.addRecipe(new ItemStack(TConstructContent.woodPattern, 1, i + 1), "s", 's', new ItemStack(TConstructContent.woodPattern, 1, i));
			GameRegistry.addRecipe(new ItemStack(InfiBlocks.getContentInstance().storageBlock, 64, i + 1), "s", 's', new ItemStack(InfiBlocks.getContentInstance().storageBlock, 64, i));
			GameRegistry.addRecipe(new ItemStack(InfiBlocks.getContentInstance().storageBlock, 64, i + 1), "ss", 's', new ItemStack(InfiBlocks.getContentInstance().storageBlock, 64, i));
		}

		// ModLoader.addName(xinstick, "Stick of Power");
	}

	static
	{
		xinstick = new XinStick(10000).setItemName("xinstick");
		LanguageRegistry.addName(xinstick, "XinRecord");
	}
}
