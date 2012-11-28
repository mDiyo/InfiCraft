package mDiyo.inficraft.infitools.twoxtwo;
import java.util.Map;
import java.util.Random;

import mDiyo.inficraft.infitools.hybrids.mod_InfiHybrids;
import net.minecraft.src.EntityItem;
import net.minecraft.src.EntityList;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.oredict.OreDictionary.OreRegisterEvent;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;

@Mod(modid = "Infi2x2", name = "Infi2x2", version = "1.1 for 1.3.2")
@NetworkMod(serverSideRequired = false, clientSideRequired = true, channels = {"infi2x2"})
public class mod_Infi2x2
{
	public static Random rand = new Random();
	public static boolean infitoolsPresent;
	@Instance("Infi2x2")
	public static mod_Infi2x2 instance;
	
	@SidedProxy(clientSide = "mDiyo.inficraft.infitools.twoxtwo.ClientProxy2x2", serverSide = "mDiyo.inficraft.infitools.twoxtwo.CommonProxy2x2")
	public static CommonProxy2x2 proxy;
	
	@Init
	public void load(FMLInitializationEvent event) 
	{
		PropsHelperInfi2x2.initProps();
		Handpicks.init();
		Hatchets.init();
		Trowels.init();
		Daggers.init();
		MinecraftForge.EVENT_BUS.register(this);
		EntityList.addMapping(mDiyo.inficraft.infitools.twoxtwo.DaggerEntity.class, "dagger", 111);
		EntityRegistry.registerModEntity(mDiyo.inficraft.infitools.twoxtwo.DaggerEntity.class, "dagger", 111, this, 64, 10, true);
		//EntityRegistry.registerGlobalEntityID(mDiyo.infi2x2.DaggerEntity.class, "dagger", 111);
		proxy.registerEntities();
		//EntityRegistry.registerModEntity(mDiyo.infi2x2.DaggerEntity.class, "dagger", 1, this, 20, 3, true);
		//EntityRegistry.registerModEntity(mDiyo.infi2x2.DaggerEntity.class, this, 1, 20, 3, true);
	}
	
	@ForgeSubscribe
	private void oreDictionarySupport(OreRegisterEvent event)
	{
		String ore = event.Name;
		ItemStack itemstack = event.Ore;
		if (infitoolsPresent)
		{
            if(PropsHelperInfi2x2.enableCopperTools && ore.equals("ingotCopper"))
            {
            	Handpicks.addCopperTools(itemstack);
            	Hatchets.addCopperTools(itemstack);
            	Trowels.addCopperTools(itemstack);
            	Daggers.addCopperTools(itemstack);
            }
            if(PropsHelperInfi2x2.enableBronzeTools && ore.equals("ingotBronze"))
            {
	            Handpicks.addBronzeTools(itemstack);
	            Hatchets.addBronzeTools(itemstack);
	            Trowels.addBronzeTools(itemstack);
	            Daggers.addBronzeTools(itemstack);
            }
            if(PropsHelperInfi2x2.enableWorkedIronTools && ore.equals("ingotRefinedIron"))
            {
	            Handpicks.addWorkedIronTools(itemstack);
	            Hatchets.addWorkedIronTools(itemstack);
	            Trowels.addWorkedIronTools(itemstack);
	            Daggers.addWorkedIronTools(itemstack);
            }
            if(PropsHelperInfi2x2.enableSteelTools && ore.equals("ingotSteel"))
            {
	            Handpicks.addSteelTools(itemstack);
	            Hatchets.addSteelTools(itemstack);
	            Trowels.addSteelTools(itemstack);
	            Daggers.addSteelTools(itemstack);
            }
            if(PropsHelperInfi2x2.enableCobaltTools && ore.equals("ingotCobalt"))
            {
	            Handpicks.addCobaltTools(itemstack);
	            Hatchets.addCobaltTools(itemstack);
	            Trowels.addCobaltTools(itemstack);
	            Daggers.addCobaltTools(itemstack);
            }
            if(PropsHelperInfi2x2.enableArditeTools && ore.equals("ingotArdite"))
            {
	            Handpicks.addArditeTools(itemstack);
	            Hatchets.addArditeTools(itemstack);
	            Trowels.addArditeTools(itemstack);
	            Daggers.addArditeTools(itemstack);
            }
            if(PropsHelperInfi2x2.enableManyullynTools && ore.equals("ingotManyullyn"))
            {
            	Handpicks.addManyullynTools(itemstack);
            	Hatchets.addManyullynTools(itemstack);
            	Trowels.addManyullynTools(itemstack);
            	Daggers.addManyullynTools(itemstack);
            }
            if(PropsHelperInfi2x2.enableUraniumTools && ore.equals("ingotUranium"))
            {
	            Handpicks.addUraniumTools(itemstack);
	            Hatchets.addUraniumTools(itemstack);
	            Trowels.addUraniumTools(itemstack);
	            Daggers.addUraniumTools(itemstack);
            }
            if(PropsHelperInfi2x2.enableStoneTools && (ore.equals("customCobblestone") || ore.equals("customStone")))
            {
	            Handpicks.addStoneTools(itemstack);
	            Hatchets.addStoneTools(itemstack);
	            Trowels.addStoneTools(itemstack);
	            Daggers.addStoneTools(itemstack);
            }
		}
	}
	
	public static void forceAddToInv(EntityPlayer entityplayer, ItemStack itemstack, int i, boolean flag)
    {
        ItemStack itemstack1 = entityplayer.inventory.getStackInSlot(i);
        entityplayer.inventory.setInventorySlotContents(i, itemstack);
        if(itemstack1 != null)
        {
            addToInv(entityplayer, itemstack1, flag);
        }
    }
	
	public static boolean addToInv(EntityPlayer entityplayer, ItemStack itemstack, boolean flag)
    {
        return addToInv(entityplayer, itemstack, entityplayer.inventory.currentItem, flag);
    }
	
	public static boolean addToInv(EntityPlayer entityplayer, ItemStack itemstack, int i, boolean flag)
    {
        ItemStack itemstack1 = entityplayer.inventory.getStackInSlot(i);
        boolean flag1;
        if(itemstack1 == null)
        {
            entityplayer.inventory.setInventorySlotContents(i, itemstack);
            flag1 = true;
        } else
        {
            flag1 = entityplayer.inventory.addItemStackToInventory(itemstack);
        }
        if(flag && !flag1)
        {
            addItemStackToWorld(entityplayer.worldObj, (float)Math.floor(entityplayer.posX), (float)Math.floor(entityplayer.posY), (float)Math.floor(entityplayer.posZ), itemstack);
            return true;
        } else
        {
            return flag1;
        }
    }
	
	public static EntityItem addItemStackToWorld(World world, float f, float f1, float f2, ItemStack itemstack)
    {
        return addItemStackToWorld(world, f, f1, f2, itemstack, false);
    }
	
	public static EntityItem addItemStackToWorld(World world, float f, float f1, float f2, ItemStack itemstack, boolean flag)
    {
        EntityItem entityitem;
        if(flag)
        {
            entityitem = new EntityItem(world, f, f1, f2, itemstack);
        } else
        {
            float f3 = 0.7F;
            float f4 = rand.nextFloat() * f3 + (1.0F - f3) * 0.5F;
            float f5 = 1.2F;
            float f6 = rand.nextFloat() * f3 + (1.0F - f3) * 0.5F;
            entityitem = new EntityItem(world, f + f4, f1 + f5, f2 + f6, itemstack);
        }
        entityitem.delayBeforeCanPickup = 10;
        world.spawnEntityInWorld(entityitem);
        return entityitem;
    }
}
