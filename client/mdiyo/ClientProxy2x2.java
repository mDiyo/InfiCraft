package mDiyo;

import mDiyo.inficraft.infitools.twoxtwo.CommonProxy2x2;
import mDiyo.inficraft.infitools.twoxtwo.DaggerRender;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy2x2 extends CommonProxy2x2
{

	public void registerEntities() 
	{
		DaggerRender dr = new DaggerRender(0d);
		RenderingRegistry.registerEntityRenderingHandler(mDiyo.inficraft.infitools.twoxtwo.DaggerEntity.class, dr);
		//dr.setRenderManager(RenderManager.instance);
		//RenderManager.instance.entityRenderMap.put(mDiyo.infi2x2.DaggerEntity.class, dr);
	}
}
