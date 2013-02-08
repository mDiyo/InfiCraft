package inficraft.orizon.slimepools;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

/* Pools of slime
 * Barring a slime spawner, this is the most bestest place to make slimy friends
 * @author mDiyo
 */

@Mod(modid = "Orizon Slime", name = "Orizon Slime", version = "1.4.5_2013.2.8")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class OrizonSlime 
{
	/* Proxies for sides, used for graphics processing */
	@SidedProxy(clientSide = "inficraft.orizon.slimepools.SlimeProxyClient", serverSide = "inficraft.orizon.slimepools.SlimeProxyCommon")
	public static SlimeProxyCommon proxy;
	
	@Instance("Orizon Slime")
	public static OrizonSlime instance;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent evt)
	{
		PHSlime.initProps();
		
		slimeStill = new SlimeBlockStill(PHSlime.slimePoolID+1, 0, Material.water).setBlockName("Slime Pool");
        slimeFlowing = new SlimeBlockFlowing(PHSlime.slimePoolID, 0, Material.water).setBlockName("Slime Pool Flowing");
        slimeGelBlock = new SlimeGelBlock(PHSlime.slimeGelID, 32).setStepSound(Block.soundStoneFootstep).setHardness(1.5F);
		
		GameRegistry.registerBlock(slimeStill);
		GameRegistry.registerBlock(slimeFlowing);
		GameRegistry.registerBlock(slimeGelBlock);
		
		EntityRegistry.registerModEntity(inficraft.orizon.slimepools.AirwaterSlimeEntity.class, "Airwater Slime", 0, this, 32, 5, true);
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
    
    public static int slimeModel;
	
	public static String texture = "/infitextures/slime.png";
}
