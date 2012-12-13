package inficraft.infitools.twoxtwo;

import inficraft.infitools.twoxtwo.DaggerRender;
import inficraft.infitools.twoxtwo.Infi2x2ProxyCommon;

import java.io.File;

import net.minecraft.client.Minecraft;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class Infi2x2ProxyClient extends Infi2x2ProxyCommon
{

	public void registerEntities() 
	{
		DaggerRender dr = new DaggerRender(0d);
		RenderingRegistry.registerEntityRenderingHandler(inficraft.infitools.twoxtwo.DaggerEntity.class, dr);
		//dr.setRenderManager(RenderManager.instance);
		//RenderManager.instance.entityRenderMap.put(mDiyo.infi2x2.DaggerEntity.class, dr);
	}
	
	public File getMinecraftDir()
	{
		return Minecraft.getMinecraftDir();
	}
}
