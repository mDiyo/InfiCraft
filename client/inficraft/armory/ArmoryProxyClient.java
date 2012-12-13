package inficraft.armory;

import inficraft.armory.ArmoryProxyCommon;
import inficraft.armory.EntityEquipment;
import inficraft.armory.ToolrackLogic;
import inficraft.infiblocks.client.tech.FurnaceGui;
import inficraft.infiblocks.client.tech.WorkbenchGui;
import inficraft.infiblocks.tech.FurnaceLogic;

import java.io.File;
import java.util.List;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

import net.minecraft.client.Minecraft;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.ModelBiped;
import net.minecraft.src.World;

public class ArmoryProxyClient extends ArmoryProxyCommon
{
	@Override
	public void registerRenderer()
	{
		RenderingRegistry.registerBlockHandler(new RenderToolrack());
		ClientRegistry.bindTileEntitySpecialRenderer(ToolrackLogic.class, new ToolrackSpecialRender());
		RenderingRegistry.registerEntityRenderingHandler(inficraft.armory.ArmorStandEntity.class, new RenderArmorStandEntity(new ModelBiped(), 0));
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		List<Entity> list = world.getLoadedEntityList();
		for (Entity entity : list)
		{
			if (ID == entity.entityId)
			{
				System.out.println("Returning client entity with ID "+ID);
				return new ArmorStandGui(player, (EntityEquipment)entity);
			}
		}
		System.out.println("Returning a null client entity");
		return null;
	}
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		return null;
	}
	
	@Override
	public File getMinecraftDir()
	{
		return Minecraft.getMinecraftDir();
	}
}
