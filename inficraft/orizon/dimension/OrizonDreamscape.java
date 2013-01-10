package inficraft.orizon.dimension;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.DimensionManager;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

/* The Dreamscape
 * Making your dreams a little more interesting...
 * @author mDiyo
 */

@Mod(modid = "OrizonDreamscape", name = "Orizon Dreamscape", version = "Test")
public class OrizonDreamscape 
{
	@Instance("OrizonDreamscape")
	public static OrizonDreamscape instance;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent evt)
	{
		System.out.println("Attempting to override dimensions");
		DimensionManager.registerProviderType(42, inficraft.orizon.dimension.WorldProviderDreamscape.class, false);
		//DimensionManager.unregisterDimension(0);
		DimensionManager.registerDimension(42, 42);
		
		GameRegistry.registerBlock(plank, "warp");
	}
	
	public static WarpPlank plank = new WarpPlank(1500);
}
