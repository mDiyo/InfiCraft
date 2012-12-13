package florasoma.trees;

import florasoma.crops.FloraCrops;
import florasoma.trees.FloraTrees;
import florasoma.trees.FloraTreesCommonProxy;

import java.io.File;

import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.MinecraftForgeClient;

public class FloraTreesClientProxy extends FloraTreesCommonProxy
{
	/* Registers any rendering code. Does nothing server-side */
	@Override
	public void registerRenderer() 
	{
		MinecraftForgeClient.preloadTexture(FloraTrees.texture);
	}
	
	/* Ties an internal name to a visible one. Does nothing server-side */
	@Override
	public void addNames() 
	{
		LanguageRegistry.instance().addName(FloraTrees.instance.floraSapling, "Sapling");
		LanguageRegistry.instance().addName(FloraTrees.instance.floraLeaves, "Leaves");
		LanguageRegistry.instance().addName(FloraTrees.instance.redwoodDoorItem, "Redwood Door");
		LanguageRegistry.instance().addName(FloraTrees.instance.bloodwood, "Bloodwood");
		
		LanguageRegistry.instance().addStringLocalization("barkRedwood.name", "en_US", "Redwood Bark");
		LanguageRegistry.instance().addStringLocalization("heartRedwood.name", "en_US", "Redwood");
		LanguageRegistry.instance().addStringLocalization("rootRedwood.name", "en_US", "Redwood Root");
		
		LanguageRegistry.instance().addStringLocalization("eucalyptusFloraPlanks.name", "en_US", "Eucalyptus Planks");
		LanguageRegistry.instance().addStringLocalization("sakuraFloraPlanks.name", "en_US", "White Planks");
		LanguageRegistry.instance().addStringLocalization("ghostFloraPlanks.name", "en_US", "Ghost Planks");
		LanguageRegistry.instance().addStringLocalization("redwoodFloraPlanks.name", "en_US", "Redwood Planks");
		LanguageRegistry.instance().addStringLocalization("bloodFloraPlanks.name", "en_US", "Bloodplanks");
		
		LanguageRegistry.instance().addStringLocalization("eucalyptusFloraLeaves.name", "en_US", "Eucalyptus Leaves");
		LanguageRegistry.instance().addStringLocalization("sakuraFloraLeaves.name", "en_US", "White Leaves");
		LanguageRegistry.instance().addStringLocalization("ghostFloraLeaves.name", "en_US", "Ghost Leaves");
		LanguageRegistry.instance().addStringLocalization("redwoodFloraLeaves.name", "en_US", "Redwood Leaves");
		LanguageRegistry.instance().addStringLocalization("bloodFloraLeaves.name", "en_US", "Bloodleaves");
		
		LanguageRegistry.instance().addStringLocalization("eucalyptusLog.name", "en_US", "Eucalyptus Wood");
		LanguageRegistry.instance().addStringLocalization("sakuraLog.name", "en_US", "Sakura Wood");
		LanguageRegistry.instance().addStringLocalization("ghostLog.name", "en_US", "Ghost Wood");
		
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
