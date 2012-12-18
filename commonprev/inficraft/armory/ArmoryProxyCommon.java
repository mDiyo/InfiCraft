package inficraft.armory;

import java.io.File;
import java.util.List;

import net.minecraft.src.Entity;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.World;

import cpw.mods.fml.common.network.IGuiHandler;

public class ArmoryProxyCommon
{
	public void registerRenderer() {}
	public void addNames() {}
	public void addRecipes() {}
			
	public File getMinecraftDir()
	{
		return new File(".");
	}
}
