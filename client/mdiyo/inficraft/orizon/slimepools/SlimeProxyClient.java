package mDiyo.inficraft.orizon.slimepools;

import java.io.File;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.src.ModelSlime;
import net.minecraft.src.RenderSlime;
import net.minecraftforge.client.MinecraftForgeClient;
import mDiyo.inficraft.orizon.slimepools.OrizonSlime;
import mDiyo.inficraft.orizon.slimepools.SlimeProxyCommon;

public class SlimeProxyClient extends SlimeProxyCommon
{
	public void registerRenderer() 
	{
		MinecraftForgeClient.preloadTexture(OrizonSlime.texture);
		RenderingRegistry.registerEntityRenderingHandler(mDiyo.inficraft.orizon.slimepools.AirwaterSlimeEntity.class, new RenderSlime(new ModelSlime(16), new ModelSlime(0), 0.25F));
		//OrizonSlime.slimeModel = RenderingRegistry.getNextAvailableRenderId();
	}
	
	public void addNames() 
	{
		LanguageRegistry.instance().addStringLocalization(OrizonSlime.instance.slimeGelBlock.getBlockName(), "en_US", "Congealed Slime");
		LanguageRegistry.instance().addStringLocalization(OrizonSlime.instance.slimeFlowing.getBlockName(), "en_US", "Flowing Slime");
		LanguageRegistry.instance().addStringLocalization(OrizonSlime.instance.slimeStill.getBlockName(), "en_US", "SlimeSourceLiquid");
	}
	
	public File getMinecraftDir()
	{
		return Minecraft.getMinecraftDir();
	}
}
