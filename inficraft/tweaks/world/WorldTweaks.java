package inficraft.tweaks.world;

import java.io.*;
import java.util.*;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.IFMLCallHook;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin.TransformerExclusions;

/* World Tweaks
 * A little change here, a little flavor there, a few huge trees everywhere...
 * @author: mDiyo
 */

@TransformerExclusions("mDiyo.inficraft.worldtweaks")
public class WorldTweaks 
	implements IFMLLoadingPlugin, IFMLCallHook
{
	@Override
	public String[] getLibraryRequestClass() 
	{
		return null;
	}

	@Override
	public String[] getASMTransformerClass() 
	{
		return new String[] {"mDiyo.inficraft.worldtweaks.WTClassOverride"};
	}

	@Override
	public String getModContainerClass()
	{
		return "mDiyo.inficraft.worldtweaks.WTContainer";
	}

	@Override
	public String getSetupClass() 
	{
		return "mDiyo.inficraft.worldtweaks.WorldTweaks";
	}

	@Override
	public void injectData(Map<String, Object> data) 
	{
		if (data.containsKey("coremodLocation"))
			coreLocation = (File) data.get("coremodLocation");
	}
	
	public static File coreLocation;

	@Override
	public Void call() throws Exception 
	{
		/*WTClassOverride.addClassOverride("alr", "BlockReed, Sugar cane can grow up to 5 blocks tall");
		WTClassOverride.addClassOverride("xq", "Explosion, Explosions give 100% of blocks that are destroyed");
		WTClassOverride.addClassOverride("amp", "BlockSnow, Snow creates drifts during weather, drops more snowballs the higher it gets");
		WTClassOverride.addClassOverride("aiz", "BlockCactus, Cactus will no longer destroy items");
		WTClassOverride.addClassOverride("acb", "WorldGenTrees, Oak trees generate as 2x2 broad variety");
		WTClassOverride.addClassOverride("zd", "BiomeGenJungle, Changes the jungle biome to use vanilla tree spawning instead of the edited 2x2");
		WTClassOverride.addClassOverride("alt", "BlockSapling, Oak saplings grow vanilla trees in a 1x1 grid, broad trees in a 2x2 grid trees");*/
		WTClassOverride.addClassOverride("md", "EntityLiving, Freezing powers mass edit");
		WTClassOverride.addClassOverride("mi", "EntityCreature, AI override");
		WTClassOverride.addClassOverride("ma", "EntityFlying, Movement override");
		WTClassOverride.addClassOverride("qn", "EntitySkeleton, prevent burning in sunlight while frozen");
		WTClassOverride.addClassOverride("qc", "EntityCreeper, prevent explosions while frozen");
		WTClassOverride.addClassOverride("qr", "EntityZombie, Texture override");
		WTClassOverride.addClassOverride("qk", "EntityPigZombie, Texture override");
		WTClassOverride.addClassOverride("qu", "EntityVillager, Texture override");
		return null;
	}
}
