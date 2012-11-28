package mDiyo.inficraft.orizon.slimepools;

import net.minecraft.src.Block;
import net.minecraft.src.Material;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.SidedProxy;

/* Pools of slime
 * Barring a slime spawner, this is the most bestest place to make slimy friends
 * @author mDiyo
 */

@Mod(modid = "Orizon Slime", name = "Orizon Slime", version = "0.1")
public class OrizonSlime 
{
	/* Proxies for sides, used for graphics processing */
	@SidedProxy(clientSide = "mDiyo.inficraft.orizon.client.SlimeProxyClient", serverSide = "mDiyo.inficraft.orizon.SlimeProxyCommon")
	public static SlimeProxyCommon proxy;
	
	@Instance("Orizon Slime")
	public static OrizonSlime instance;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent evt)
	{
		PHSlime.initProps();
		
		slimeStill = new SlimeBlockStill(PHSlime.slimePoolID+1, 0, Material.plants).setBlockName("Slime Pool");
        slimeFlowing = new SlimeBlockFlowing(PHSlime.slimePoolID, 0, Material.plants).setBlockName("Slime Pool Flowing");
        slimeGelBlock = new SlimeGelBlock(PHSlime.slimeGelID, 32).setStepSound(Block.soundStoneFootstep).setHardness(1.5F).setBlockName("Slime Gel");
		
		GameRegistry.registerBlock(slimeStill);
		GameRegistry.registerBlock(slimeFlowing);
		GameRegistry.registerBlock(slimeGelBlock);
		/*
        
	            
	            
        acidStill = new LiquidBlockStill(acidPoolID+1, 3, Material.lava).setBlockName("Acid Pool");
        acidFlowing = new LiquidBlockFlowing(acidPoolID, 3, Material.lava).setBlockName("Acid Pool Flowing");*/
		
	}
	
	@Init
	public void init(FMLInitializationEvent evt) 
	{
		GameRegistry.registerWorldGenerator(new WorldGenSlimePools(PHSlime.slimePoolID));
		proxy.registerRenderer();
		proxy.addNames();
	}
	
	public static Block slimeStill;
    public static Block slimeFlowing;
    public static Block acidStill;
    public static Block acidFlowing;
    public static Block slimeGelBlock;
	
	public static String texture = "/mDiyo/inficraft/orizon/textures/slime.png";
}
