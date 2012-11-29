package mDiyo.inficraft.flora.corruptor;

import java.util.Random;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.src.Block;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.src.World;
import net.minecraftforge.client.MinecraftForgeClient;

/**
 * Flora & Soma: Corruptor
 * Paint the nether with all colors of the rainbow!
 * @author: Merdiwen Tirelle Diyo
 */

@Mod(modid = "Flora Corruptor", name = "Flora and Soma Corruptor", version = "1.4.5_2012.11.29")
public class FloraCorruptor
{
	/* Proxies for sides, used for graphics processing */
	@SidedProxy(clientSide = "mDiyo.inficraft.flora.corruptor.client.FloraCorruptorClientProxy", serverSide = "mDiyo.inficraft.flora.corruptor.FloraCorruptorCommonProxy")
	public static FloraCorruptorCommonProxy proxy;
	
	/* Instance of this mod, used for grabbing prototype fields */
	@Instance("Flora Corruptor")
	public static FloraCorruptor instance;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent evt)
	{
		PHCorruptor.initProps();
		
		corruptor = new CorruptorBlock(PHCorruptor.corruptorID);
		corruptBrick = new CorruptBrick(PHCorruptor.corruptBrickID);
		
		ModLoader.registerBlock(corruptor, mDiyo.inficraft.flora.corruptor.CorruptorItem.class);
		ModLoader.registerBlock(corruptBrick, mDiyo.inficraft.flora.corruptor.CorruptBrickItem.class);
	}

	@Init
	public void init(FMLInitializationEvent evt)
	{
		GameRegistry.registerWorldGenerator(new CorruptorWorldgen());
		
		proxy.addNames();
		proxy.addRecipes();
	}

	/* Prototype fields, used elsewhere */
	
	public static Block corruptor;
	public static Block corruptBrick;
	
	public static String texture = "/mDiyo/inficraft/flora/textures/stone.png";
}
