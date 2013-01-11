package inficraft.microblocks.core;

import inficraft.microblocks.core.microblock.MicroblockSystem;

import java.util.Collection;

import codechicken.nei.api.IConfigureNEI;
import cpw.mods.fml.common.Loader;

public class NEIImmibisCoreConfig implements IConfigureNEI {
	@Override
	public void loadConfig() {
		if(MicroblockSystem.INSTANCE != null) {
			try {
				Class.forName("codechicken.nei.api.API")
					.getDeclaredMethod("setItemDamageVariants", int.class, Collection.class)
					.invoke(null, MicroblockSystem.microblockContainerBlock.blockID, MicroblockSystem.parts.keySet());
			} catch(Throwable e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public String getName() {
		return "InfiCraft Microblocks";
	}

	@Override
	public String getVersion() {
		return Loader.instance().getReversedModObjectList().get(ImmibisCore.instance).getVersion();
	}
}
