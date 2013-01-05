package inficraft.tweaks.deepfreeze;

import java.util.Arrays;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

import cpw.mods.fml.common.DummyModContainer;
import cpw.mods.fml.common.LoadController;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

public class DFContainer extends DummyModContainer
{
	public DFContainer() {
        super(new ModMetadata());
        ModMetadata myMeta = super.getMetadata();
        myMeta.authorList = Arrays.asList(new String[] { "mDiyo" });
        myMeta.description = "Deep Freeze, Core mod";
        myMeta.modId = "DeepFreeze";
        myMeta.version = "1.4.6";
        myMeta.name = "Deep Freeze";
        myMeta.url = "http://www.minecraftforum.net/topic/521617-inficraft";
	}
	
	@Override
	public boolean registerBus(EventBus bus, LoadController controller) 
	{
		bus.register(this);
		return true;
	}
}
