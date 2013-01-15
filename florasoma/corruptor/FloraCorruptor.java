package florasoma.corruptor;

import net.minecraft.block.Block;
import net.minecraft.src.ModLoader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import florasoma.common.FloraSomaTab;

/**
 * Flora & Soma: Corruptor
 * Paint the nether with all colors of the rainbow!
 * @author: Merdiwen Tirelle Diyo
 */

@Mod(modid = "Soma Corruptor", name = "Flora and Soma Corruptor", version = "1.4.6_2013.1.14")
public class FloraCorruptor
{
	/* Proxies for sides, used for graphics processing */
	@SidedProxy(clientSide = "florasoma.corruptor.FloraCorruptorClientProxy", serverSide = "florasoma.corruptor.FloraCorruptorCommonProxy")
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
		
		ModLoader.registerBlock(corruptor, florasoma.corruptor.CorruptorItem.class);
		ModLoader.registerBlock(corruptBrick, florasoma.corruptor.CorruptBrickItem.class);
	}

	@Init
	public void init(FMLInitializationEvent evt)
	{
		GameRegistry.registerWorldGenerator(new CorruptorWorldgen());
		FloraSomaTab.init(corruptor.blockID);
		proxy.addNames();
		proxy.addRecipes();
		proxy.registerRenderer();
	}

	/* Prototype fields, used elsewhere */
	
	public static Block corruptor;
	public static Block corruptBrick;
	
	public static String texture = "/floratextures/corruptstone.png";
}
