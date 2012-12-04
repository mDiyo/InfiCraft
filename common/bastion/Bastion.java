package bastion;

import java.util.Random;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;

import skillapi.mod_SkillsAPI;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import bastion.blocks.*;
import bastion.items.*;
import bastion.skills.*;

/* Bastion, the fortress of bulwark and garrisons!
 * Bringing you a little bit of every block in every flavor.
 * @author: mDiyo
 */

//@Mod(modid = "Bastion", name = "Bastion", version = "Test")
//@NetworkMod(serverSideRequired = false, clientSideRequired = true)
public class Bastion
{
	/* Proxies for sides, used for graphics processing */
	//@SidedProxy(clientSide = "mDiyo.bastion.BastionClientProxy", serverSide = "mDiyo.bastion.BastionCommonProxy")
	public static BastionCommonProxy proxy;
	
	@Instance("Bastion")
	public static Bastion instance;
	
	//public static CreativeTabs infiBlockTab = new TabInfiBlocks("InfiBlocks");
	
	/* Instance of the content, used to grab blocks and such. */
    public static BastionContent contentInstance;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent evt)
	{
		PHBastion.initProps();		
		contentInstance = new BastionContent();
	}
	
	@Init
	public void load(FMLInitializationEvent evt) 
	{
		proxy.registerRenderer();
		proxy.addNames();
		
		//NetworkRegistry.instance().registerGuiHandler(instance, proxy);
	}
	
	/* Texture paths */
	public static String bricksImage = "/bastion/bricks.png";
	public static String blocksImage = "/bastion/infiblocks.png";
	public static String techImage = "/bastion/tech.png";

	/*public boolean renderWorldBlock(RenderBlocks renderblocks, IBlockAccess iblockaccess, int x, int y, int z, Block block, int modelID)
	{
		if (modelID == barrierModel)
		{
			return BastionRenders.renderBarricade(renderblocks, iblockaccess, x, y, z, (BarricadeBlock)block);
		}
		return true;
	}

	public void renderInvBlock(RenderBlocks renderblocks, Block block, int metadata, int modelID)
	{
		if (modelID == barrierModel)
		{
			BastionRenders.renderBarricadeInv(renderblocks, block, metadata);
		}
	}*/

	/*public boolean onTickInGame(float var1, Minecraft var2)
	{
		if (var2.theWorld.isNewWorld)
		{
			addItems();
			return false;
		}

		return true;
	}*/

	/*private void addItems()
	{
		givePlayerItem(this.rand.nextInt(2) == 1 ? new ItemStack(Item.pickaxeWood) : new ItemStack(Item.pickaxeStone));
		givePlayerItem(this.rand.nextInt(2) == 1 ? new ItemStack(Item.shovelWood) : new ItemStack(Item.shovelStone));
		givePlayerItem(this.rand.nextInt(2) == 1 ? new ItemStack(Item.axeWood) : new ItemStack(Item.axeStone));
		givePlayerItem(new ItemStack(Block.torchWood, this.rand.nextInt(5) + 4));
		givePlayerItem(new ItemStack(Block.wood, this.rand.nextInt(4) + 1));
		givePlayerItem(new ItemStack(Block.planks, this.rand.nextInt(16) + 16));
		givePlayerItem(new ItemStack(this.rand.nextInt(2) == 1 ? Item.appleRed : Item.bread, this.rand.nextInt(3) + 1));
	}*/

	/*private void givePlayerItem(ItemStack stack)
	{
		ModLoader.getMinecraftInstance().thePlayer.inventory.addItemStackToInventory(stack);
	}*/
}