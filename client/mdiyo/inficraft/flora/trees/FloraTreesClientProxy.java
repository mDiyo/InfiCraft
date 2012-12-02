package mDiyo.inficraft.flora.trees;

import java.io.File;

import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.MinecraftForgeClient;
import mDiyo.inficraft.flora.crops.FloraCrops;
import mDiyo.inficraft.flora.trees.FloraTrees;
import mDiyo.inficraft.flora.trees.FloraTreesCommonProxy;

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
		LanguageRegistry.instance().addName(FloraTrees.instance.floraLeaves, "Leaves");;
		LanguageRegistry.instance().addName(FloraTrees.instance.redwoodDoorItem, "Redwood Door");
		LanguageRegistry.instance().addName(FloraTrees.instance.bloodwood, "Bloodwood");
		
		LanguageRegistry.instance().addStringLocalization("barkRedwood.name", "en_US", "Redwood Bark");
		LanguageRegistry.instance().addStringLocalization("heartRedwood.name", "en_US", "Redwood");
		LanguageRegistry.instance().addStringLocalization("planksRedwood.name", "en_US", "Redwood Planks");
		LanguageRegistry.instance().addStringLocalization("bloodbarkRedwood.name", "en_US", "Bloodbark");
		LanguageRegistry.instance().addStringLocalization("bloodplanksRedwood.name", "en_US", "Bloodplanks");
		LanguageRegistry.instance().addStringLocalization("sakurabarkRedwood.name", "en_US", "Wood");
		LanguageRegistry.instance().addStringLocalization("sakuraplanksRedwood.name", "en_US", "White Planks");
		LanguageRegistry.instance().addStringLocalization("eucalyptusbarkRedwood.name", "en_US", "Eucalyptus Wood");
		LanguageRegistry.instance().addStringLocalization("eucalyptusplanksRedwood.name", "en_US", "Eucalyptus Planks");
		
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
