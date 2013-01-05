package inficraft.tweaks.hunger;

import java.util.Arrays;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

import cpw.mods.fml.common.DummyModContainer;
import cpw.mods.fml.common.LoadController;
import cpw.mods.fml.common.ModContainer;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

public class HTContainer extends DummyModContainer
{
	public HTContainer() {
        super(new ModMetadata());
        ModMetadata myMeta = super.getMetadata();
        myMeta.authorList = Arrays.asList(new String[] { "mDiyo" });
        myMeta.description = "Hunger Tweaks, Core mod";
        myMeta.modId = "HungerTweaks";
        myMeta.version = "1.4.6";
        myMeta.name = "Hunger Tweaks";
	    myMeta.url = "http://www.minecraftforum.net/topic/521617-inficraft";
	}
	
	@Override
	public boolean registerBus(EventBus bus, LoadController controller)
    {
		bus.register(this);
		return true;
    }
}
