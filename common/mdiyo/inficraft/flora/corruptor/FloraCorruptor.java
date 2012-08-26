package mdiyo.inficraft.flora.corruptor;

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

@Mod(modid = "Flora Corruptor", name = "Flora and Soma Corruptor", version = "Anachrosim")
public class FloraCorruptor
{
	/* Proxies for sides, used for graphics processing */
	@SidedProxy(clientSide = "mdiyo.inficraft.flora.corruptor.client.FloraCorruptorClientProxy", serverSide = "mdiyo.inficraft.flora.corruptor.FloraCorruptorCommonProxy")
	public static FloraCorruptorCommonProxy proxy;
	
	/* Instance of this mod, used for grabbing prototype fields */
	@Instance
	public static FloraCorruptor instance;
	public static FloraCorruptor getInstance()
	{
		return instance;
	}
	
	@PreInit
	public void preInit(FMLPreInitializationEvent evt)
	{
		PHCorruptor.initProps();
		
		corruptor = new CorruptorBlock(PHCorruptor.corruptorID);
		corruptBrick = new CorruptBrick(PHCorruptor.corruptBrickID);
		
		ModLoader.registerBlock(corruptor, mdiyo.inficraft.flora.corruptor.CorruptorItem.class);
		ModLoader.registerBlock(corruptBrick, mdiyo.inficraft.flora.corruptor.CorruptBrickItem.class);
	}

	@Init
	public void init(FMLInitializationEvent evt)
	{
		GameRegistry.registerWorldGenerator(new CorruptorWorldgen());
		
		proxy.addEESupport();
		proxy.addNames();
		proxy.addRecipes();
	}

	/* Prototype fields, used elsewhere */
	
	public static Block corruptor;
	public static Block corruptBrick;
	
	
}
