package inficraft.armory;

import java.io.File;

import net.minecraft.client.Minecraft;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ArmoryProxyClient extends ArmoryProxyCommon
{
	@Override
	public void registerRenderer()
	{
		RenderingRegistry.registerBlockHandler(new RenderToolrack());
		ClientRegistry.bindTileEntitySpecialRenderer(ToolrackLogic.class, new ToolrackSpecialRender());
		RenderingRegistry.registerEntityRenderingHandler(inficraft.armory.ArmorStandEntity.class, new RenderArmorStandEntity(new ArmorStandModelStatue(), 0));
	}
	
	@Override
	public File getMinecraftDir()
	{
		return Minecraft.getMinecraftDir();
	}
}
