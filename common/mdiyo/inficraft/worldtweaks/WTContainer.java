package mDiyo.inficraft.worldtweaks;

import java.util.Arrays;

import com.google.common.eventbus.Subscribe;

import net.minecraftforge.event.EventBus;

import cpw.mods.fml.common.DummyModContainer;
import cpw.mods.fml.common.LoadController;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

public class WTContainer extends DummyModContainer
{
	public WTContainer() {
        super(new ModMetadata());
        /* ModMetadata is the same as mcmod.info */
        ModMetadata myMeta = super.getMetadata();
        myMeta.authorList = Arrays.asList(new String[] { "mDiyo" });
        myMeta.description = "World Tweaks, Core mod";
        myMeta.modId = "WorldTweaks";
        myMeta.version = "1.4.5";
        myMeta.name = "World Tweaks";
	    //myMeta.url = "http://minecraftforge.net/wiki/Using_Access_Transformers";
	}
	
	public boolean registerBus(EventBus bus, LoadController controller) 
	{
		bus.register(this);
		return true;
	}
}
