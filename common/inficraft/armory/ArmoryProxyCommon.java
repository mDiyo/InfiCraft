package inficraft.armory;

import java.io.File;
import java.util.List;

import net.minecraft.src.Entity;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.World;

import cpw.mods.fml.common.network.IGuiHandler;

public class ArmoryProxyCommon implements IGuiHandler
{
	public void registerRenderer() {}
	public void addNames() {}
	public void addRecipes() {}
			
	public File getMinecraftDir()
	{
		return new File(".");
	}
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		List<Entity> list = world.getLoadedEntityList();
		for (Entity entity : list)
		{
			if (ID == entity.entityId)
			{
				System.out.println("Returning server entity with ID "+ID);
				return ((EntityEquipment)entity).getContainer(player);
			}
		}
		System.out.println("Returning a null server entity");
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		return null;
	}
}
