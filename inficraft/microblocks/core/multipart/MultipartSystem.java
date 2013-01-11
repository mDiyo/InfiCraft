package inficraft.microblocks.core.multipart;

import inficraft.microblocks.core.api.porting.SidedProxy;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class MultipartSystem {
	static int multipartRenderType;
	
	public static void init() {
		multipartRenderType = RenderingRegistry.getNextAvailableRenderId();
		
		SidedProxy.instance.createSidedObject("inficraft.microblocks.core.multipart.ClientProxy", null);
	}
}
