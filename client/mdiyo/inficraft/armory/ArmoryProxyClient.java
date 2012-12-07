package mDiyo.inficraft.armory;

import java.io.File;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

import net.minecraft.client.Minecraft;
import net.minecraft.src.ModelBiped;

public class ArmoryProxyClient extends ArmoryProxyCommon
{
	@Override
	public void registerRenderer()
	{
		RenderingRegistry.registerBlockHandler(new RenderToolrack());
		ClientRegistry.bindTileEntitySpecialRenderer(ToolrackLogic.class, new ToolrackSpecialRender());
		RenderingRegistry.registerEntityRenderingHandler(mDiyo.inficraft.armory.ArmorStandEntity.class, new RenderArmorStandEntity(new ModelBiped(), 0));
	}
	
	@Override
	public File getMinecraftDir()
	{
		return Minecraft.getMinecraftDir();
	}
}
