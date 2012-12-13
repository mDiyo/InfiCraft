package inficraft.infitools.twoxtwo;
import inficraft.infitools.hybrids.InfiHybrids;

import java.util.Map;
import java.util.Random;

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

@Mod(modid = "Infi2x2", name = "Infi2x2", version = "1.4.5_2012.12.11")
@NetworkMod(serverSideRequired = false, clientSideRequired = true, channels = {"infi2x2"})
public class Infi2x2
{
	public static Random rand = new Random();
	public static boolean infitoolsPresent;
	@Instance("Infi2x2")
	public static Infi2x2 instance;
	
	@SidedProxy(clientSide = "inficraft.infitools.twoxtwo.Infi2x2ProxyClient", serverSide = "inficraft.infitools.twoxtwo.Infi2x2ProxyCommon")
	public static Infi2x2ProxyCommon proxy;
	
	@Init
	public void load(FMLInitializationEvent event) 
	{
		PropsHelperInfi2x2.initProps();
		Handpicks.init();
		Hatchets.init();
		Trowels.init();
		Daggers.init();
		MinecraftForge.EVENT_BUS.register(this);
		EntityList.addMapping(inficraft.infitools.twoxtwo.DaggerEntity.class, "dagger", 111);
		EntityRegistry.registerModEntity(inficraft.infitools.twoxtwo.DaggerEntity.class, "dagger", 111, this, 64, 10, true);
		//EntityRegistry.registerGlobalEntityID(mDiyo.infi2x2.DaggerEntity.class, "dagger", 111);
		proxy.registerEntities();
		//EntityRegistry.registerModEntity(mDiyo.infi2x2.DaggerEntity.class, "dagger", 1, this, 20, 3, true);
		//EntityRegistry.registerModEntity(mDiyo.infi2x2.DaggerEntity.class, this, 1, 20, 3, true);
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
