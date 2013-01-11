package inficraft.microblocks.core;

import inficraft.microblocks.core.api.APILocator;
import inficraft.microblocks.core.api.FMLModInfo;
import inficraft.microblocks.core.api.net.IPacket;
import inficraft.microblocks.core.api.net.IPacketMap;
import inficraft.microblocks.core.api.porting.PortableBaseMod;
import inficraft.microblocks.core.api.porting.SidedProxy;
import inficraft.microblocks.core.impl.IDAllocator;
import inficraft.microblocks.core.impl.IDType;
import inficraft.microblocks.core.impl.IIDSet;
import inficraft.microblocks.core.impl.MultiInterfaceClassTransformer;
import inficraft.microblocks.core.impl.NetworkingManager;
import inficraft.microblocks.core.microblock.MicroblockSystem;
import inficraft.microblocks.core.microblock.PacketMicroblockPlace;
import inficraft.microblocks.core.microblock.PacketUpdateBreakingPart;
import inficraft.microblocks.core.multipart.MultipartSystem;
import inficraft.microblocks.core.multipart.PacketMultipartDigStart;
import inficraft.microblocks.core.net.FragmentSequence;
import inficraft.microblocks.core.net.PacketButtonPress;
import inficraft.microblocks.core.net.PacketFragment;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.relauncher.RelaunchClassLoader;

@Mod(version="1.4.6_2013.11", modid="InfiCraftMicroblocks", name="InfiCraft MicroBlocks")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
@FMLModInfo(
		url="http://www.minecraftforum.net/topic/1001131-110-immibiss-mods-smp/",
		description="A repackage of Immibis Core by mDiyo",
		authors="immibis"
		)
public class ImmibisCore extends PortableBaseMod implements IPacketMap {

	public static final int PACKET_TYPE_S2C_STRING_GUI = 0; // Unused
	public static final int PACKET_TYPE_S2C_MULTIPART_DESCRIPTION = 1; // Unused (has a separate channel)
	public static final int PACKET_TYPE_C2S_MICROBLOCK_DIG_START = 2;
	public static final int PACKET_TYPE_C2S_MICROBLOCK_PLACE = 3;
	public static final int PACKET_TYPE_S2C_UPDATE_BREAKING_PART = 4;
	public static final int PACKET_TYPE_FRAGMENT = 5;
	public static final int PACKET_TYPE_C2S_BUTTON_PRESS = 6;

	public static final String CHANNEL = "InfiMicroCore";
	public static @cpw.mods.fml.common.SidedProxy(
			clientSide = "inficraft.microblocks.core.porting.ClientProxy142",
			serverSide = "inficraft.microblocks.core.porting.ServerProxy142")
	SidedProxy sidedProxy;

	public static IDAllocator idAllocator = new IDAllocator();
	public static NetworkingManager networkingManager = new NetworkingManager();

	public static final java.util.Timer TIMER = new java.util.Timer("InfiCraft MicroBlocks background task", false);

	@PreInit
	public void preInit(FMLPreInitializationEvent evt) {
		SidedProxy.instance = sidedProxy;

		/*if(Config.getBoolean("enableMicroblocks", false))
		{*/
			MicroblockSystem.INSTANCE = new MicroblockSystem();
			MicroblockSystem.INSTANCE.preinit();
		//}

		BlockMultiTile.model = BlockMultiTile.normalModel = SidedProxy.instance.getUniqueBlockModelID("inficraft.microblocks.core.CoreBlockRenderer", true);

		APILocator.getNetManager().listen(this);

		FragmentSequence.init();
		MainThreadTaskQueue.init();
	}

	@Init
	public void init(FMLInitializationEvent evt) {
		
		MultipartSystem.init();
		
		if(MicroblockSystem.INSTANCE != null)
			MicroblockSystem.INSTANCE.init();
		
		idAllocator.allocate(new IIDSet() {
			@Override
			public int getIDFor(String name, IDType type, int _default) {
				switch(type) {
				case TerrainBlock:
					return Config.config.getTerrainBlock(Configuration.CATEGORY_BLOCK, name, _default, null).getInt(_default);
				case Block:
					return Config.config.getBlock(name+".id", _default).getInt(_default);
				case Item:
					return Config.config.get(Configuration.CATEGORY_ITEM, name, _default).getInt(_default);
				}
				return 0;
			}
		});
	}

	@PostInit
	public void modsLoaded(FMLPostInitializationEvent evt) {
		if(MicroblockSystem.INSTANCE != null)
			MicroblockSystem.INSTANCE.postinit();
	}

	public static ImmibisCore instance;

	public ImmibisCore() {
		instance = this;
	}



	public static boolean areItemsEqual(ItemStack a, ItemStack b) {
		if(a == null && b == null)
			return true;
		if(a == null || b == null)
			return false;
		if(a.itemID != b.itemID)
			return false;
		if(a.getHasSubtypes() && a.getItemDamage() != b.getItemDamage())
			return false;
		if(a.stackTagCompound == null && b.stackTagCompound == null)
			return true;
		if(a.stackTagCompound != null || b.stackTagCompound != null)
			return false;
		return a.stackTagCompound.equals(b.stackTagCompound);
	}

	@Override
	public String getChannel() {
		return CHANNEL;
	}

	@Override
	public IPacket createS2CPacket(byte id) {
		if(id == PACKET_TYPE_FRAGMENT)
			return new PacketFragment();
		if(id == PACKET_TYPE_S2C_UPDATE_BREAKING_PART)
			return new PacketUpdateBreakingPart();
		return null;
	}

	@Override
	public IPacket createC2SPacket(byte id) {
		if(id == PACKET_TYPE_C2S_BUTTON_PRESS)
			return new PacketButtonPress(0);
		if(id == PACKET_TYPE_C2S_MICROBLOCK_DIG_START)
			return new PacketMultipartDigStart();
		if(id == PACKET_TYPE_C2S_MICROBLOCK_PLACE)
			return new PacketMicroblockPlace();
		if(id == PACKET_TYPE_FRAGMENT)
			return new PacketFragment();
		return null;
	}

	static {
		((RelaunchClassLoader)ImmibisCore.class.getClassLoader()).registerTransformer(MultiInterfaceClassTransformer.class.getName());
	}

}
