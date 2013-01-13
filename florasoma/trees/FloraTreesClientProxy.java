package florasoma.trees;

import java.io.File;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;
import florasoma.berries.FloraBerryTickHandler;

public class FloraTreesClientProxy extends FloraTreesCommonProxy
{
	/* Registers any rendering code. Does nothing server-side */
	@Override
	public void registerRenderer() 
	{
		MinecraftForgeClient.preloadTexture(FloraTrees.texture);
		TickRegistry.registerTickHandler(new FloraTreesTickHandler(), Side.CLIENT);
	}
	
	/* Ties an internal name to a visible one. Does nothing server-side */
	@Override
	public void addNames() 
	{
		//LanguageRegistry.instance().addName(FloraTrees.instance.floraSapling, "Sapling");
		//LanguageRegistry.instance().addName(FloraTrees.instance.floraLeaves, "Leaves");
		LanguageRegistry.instance().addName(FloraTrees.instance.bloodwood, "Bloodwood");
		
		LanguageRegistry.instance().addStringLocalization("redwoodFloraDoor.name", "en_US", "Redwood Door");
		LanguageRegistry.instance().addStringLocalization("eucalyptusFloraDoor.name", "en_US", "Eucalyptus Door");
		LanguageRegistry.instance().addStringLocalization("hopseedFloraDoor.name", "en_US", "Hopseed Door");
		LanguageRegistry.instance().addStringLocalization("sakuraFloraDoor.name", "en_US", "Sakura Door");
		LanguageRegistry.instance().addStringLocalization("ghostFloraDoor.name", "en_US", "Ghostwood Door");
		LanguageRegistry.instance().addStringLocalization("bloodFloraDoor.name", "en_US", "Bloodwood Door");
		LanguageRegistry.instance().addStringLocalization("redwoodBarkFloraDoor.name", "en_US", "Redwood Bark Door");
		
		LanguageRegistry.instance().addStringLocalization("barkRedwood.name", "en_US", "Redwood Bark");
		LanguageRegistry.instance().addStringLocalization("heartRedwood.name", "en_US", "Redwood");
		LanguageRegistry.instance().addStringLocalization("rootRedwood.name", "en_US", "Redwood Root");
		
		LanguageRegistry.instance().addStringLocalization("eucalyptusFloraPlanks.name", "en_US", "Eucalyptus Planks");
		LanguageRegistry.instance().addStringLocalization("sakuraFloraPlanks.name", "en_US", "Sakura Planks");
		LanguageRegistry.instance().addStringLocalization("ghostFloraPlanks.name", "en_US", "Ghostwood Planks");
		LanguageRegistry.instance().addStringLocalization("bushFloraPlanks.name", "en_US", "Hopseed Planks");
		LanguageRegistry.instance().addStringLocalization("redwoodFloraPlanks.name", "en_US", "Redwood Planks");
		LanguageRegistry.instance().addStringLocalization("bloodFloraPlanks.name", "en_US", "Bloodplanks");
		
		LanguageRegistry.instance().addStringLocalization("eucalyptusFloraSapling.name", "en_US", "Eucalyptus Sapling");
		LanguageRegistry.instance().addStringLocalization("sakuraFloraSapling.name", "en_US", "White Sapling");
		LanguageRegistry.instance().addStringLocalization("ghostFloraSapling.name", "en_US", "Ghostwood Sapling");
		LanguageRegistry.instance().addStringLocalization("bushFloraSapling.name", "en_US", "Hopseed Sapling");
		LanguageRegistry.instance().addStringLocalization("redwoodFloraSapling.name", "en_US", "Redwood Sapling");
		LanguageRegistry.instance().addStringLocalization("bloodFloraSapling.name", "en_US", "Blood Sapling");
		
		LanguageRegistry.instance().addStringLocalization("eucalyptusFloraLeaves.name", "en_US", "Eucalyptus Leaves");
		LanguageRegistry.instance().addStringLocalization("sakuraFloraLeaves.name", "en_US", "White Leaves");
		LanguageRegistry.instance().addStringLocalization("ghostFloraLeaves.name", "en_US", "Ghostwood Leaves");
		LanguageRegistry.instance().addStringLocalization("bushFloraLeaves.name", "en_US", "Hopseed Leaves");
		LanguageRegistry.instance().addStringLocalization("redwoodFloraLeaves.name", "en_US", "Redwood Leaves");
		LanguageRegistry.instance().addStringLocalization("bloodFloraLeaves.name", "en_US", "Bloodleaves");
		
		LanguageRegistry.instance().addStringLocalization("eucalyptusLog.name", "en_US", "Eucalyptus Wood");
		LanguageRegistry.instance().addStringLocalization("sakuraLog.name", "en_US", "Sakura Wood");
		LanguageRegistry.instance().addStringLocalization("ghostLog.name", "en_US", "Ghostwood");
		LanguageRegistry.instance().addStringLocalization("hopseedLog.name", "en_US", "Hopseed Wood");
		
		LanguageRegistry.instance().addStringLocalization("redwoodBoat.name", "en_US", "Redwood Boat");
		LanguageRegistry.instance().addStringLocalization("bloodBoat.name", "en_US", "Bloodwood Boat");
		LanguageRegistry.instance().addStringLocalization("whiteBoat.name", "en_US", "White Boat");
		LanguageRegistry.instance().addStringLocalization("eucalyptusBoat.name", "en_US", "Eucalyptus Boat");
	}
	
	@Override
	public File getMinecraftDir()
	{
		return Minecraft.getMinecraftDir();
	}
}
