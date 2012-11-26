package mDiyo.inficraft.flora.trees.client;

import java.io.File;

import net.minecraft.client.Minecraft;
import net.minecraft.src.ModLoader;
import mDiyo.inficraft.flora.trees.FloraTrees;
import mDiyo.inficraft.flora.trees.FloraTreesCommonProxy;

public class FloraTreesClientProxy extends FloraTreesCommonProxy
{
	/* Registers any rendering code. Does nothing server-side */
	@Override
	public void registerRenderer() {}
	
	/* Ties an internal name to a visible one. Does nothing server-side */
	@Override
	public void addNames() 
	{
		ModLoader.addName(FloraTrees.instance.floraSapling, "Sapling");
		ModLoader.addName(FloraTrees.instance.floraLeaves, "Leaves");
		ModLoader.addName(FloraTrees.instance.cherryLeaves, "Blossoms");
		ModLoader.addName(FloraTrees.instance.redwoodDoorItem, "Redwood Door");
		
		ModLoader.addLocalization("barkRedwood.name", "Redwood Bark");
		ModLoader.addLocalization("heartRedwood.name", "Redwood");
		ModLoader.addLocalization("planksRedwood.name", "Redwood Planks");
		ModLoader.addLocalization("bloodbarkRedwood.name", "Bloodbark");
		ModLoader.addLocalization("bloodplanksRedwood.name", "Bloodplanks");
		ModLoader.addLocalization("sakurabarkRedwood.name", "Wood");
		ModLoader.addLocalization("sakuraplanksRedwood.name", "White Planks");
		ModLoader.addLocalization("eucalyptusbarkRedwood.name", "Eucalyptus Wood");
		ModLoader.addLocalization("eucalyptusplanksRedwood.name", "Eucalyptus Planks");
		
		ModLoader.addLocalization("redwoodBoat.name", "Redwood Boat");
		ModLoader.addLocalization("bloodBoat.name", "Bloodwood Boat");
		ModLoader.addLocalization("whiteBoat.name", "White Boat");
		ModLoader.addLocalization("eucalyptusBoat.name", "Eucalyptus Boat");
	}
	
	@Override
	public File getMinecraftDir()
	{
		return Minecraft.getMinecraftDir();
	}
}
