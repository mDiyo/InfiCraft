package inficraft.microblocks.cobaltite;

import inficraft.microblocks.core.Config;
import inficraft.microblocks.core.api.APILocator;
import inficraft.microblocks.core.api.net.IPacket;
import inficraft.microblocks.core.api.net.IPacketMap;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.minecraft.block.Block;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Base for Cobaltite mods.
 */
public class ModBase implements IGuiHandler {
	private Class<? extends ModBase> clazz;
	private String modID, modName;
	
	private CobaltiteMod modAnnotation;
	
	private static class BlockInfo {
		public Field field;
		public int id;
		public String configOptionID;
		public Class<? extends Block> clazz;
		public Class<? extends ItemBlock> itemClass;
	}
	
	private static class ItemInfo {
		public Field field;
		public int id;
		public Class<? extends Item> clazz;
	}
	
	private static interface RegisteredGUI {
		@SideOnly(Side.CLIENT)
		public GuiContainer getGUI(Container container);
		public Container getContainer(EntityPlayer player, World world, int x, int y, int z);
	}
	
	private List<BlockInfo> blocks = new ArrayList<BlockInfo>();
	private List<ItemInfo> items = new ArrayList<ItemInfo>();
	private Map<Integer, RegisteredGUI> guis = new HashMap<Integer, RegisteredGUI>();
	private Map<Byte, Constructor<? extends IPacket>> s2cPackets = new HashMap<Byte, Constructor<? extends IPacket>>();
	private Map<Byte, Constructor<? extends IPacket>> c2sPackets = new HashMap<Byte, Constructor<? extends IPacket>>();
	
	public ModBase() {
		clazz = getClass();
		
		if(!clazz.isAnnotationPresent(Mod.class))
			throw new RuntimeException("Cobaltite mods must be annotated with @Mod");
		
		if(!clazz.isAnnotationPresent(NetworkMod.class))
			throw new RuntimeException("Cobaltite mods must be annotated with @NetworkMod");
		
		if(!clazz.isAnnotationPresent(CobaltiteMod.class))
			throw new RuntimeException("Cobaltite mods must be annotated with @CobaltiteMod");
		
		modID = clazz.getAnnotation(Mod.class).modid();
		modName = clazz.getAnnotation(Mod.class).name();
		
		modAnnotation = clazz.getAnnotation(CobaltiteMod.class);
	}
	
	@PreInit
	public final void _preinit(FMLPreInitializationEvent evt) {
		boolean errors = false;
		Throwable firstException = null;
		for(Field f : clazz.getFields()) {
			try {
				if(f.isAnnotationPresent(AssignedBlock.class)) {
					AssignedBlock a = f.getAnnotation(AssignedBlock.class);
					
					BlockInfo bi = new BlockInfo();
					bi.field = f;
					bi.configOptionID = modID.toLowerCase() + "." + a.id();
					if(Config.config.getCategory(Configuration.CATEGORY_BLOCK).containsKey(bi.configOptionID+".id"))
						bi.id = Config.config.getBlock(bi.configOptionID+".id", 4095).getInt(4095);
					else
						bi.id = 0;	
					
					bi.clazz = f.getType().asSubclass(Block.class);
					bi.itemClass = a.item();
					blocks.add(bi);
				}
				
				if(f.isAnnotationPresent(AssignedItem.class)) {
					AssignedItem a = f.getAnnotation(AssignedItem.class);
					ItemInfo ii = new ItemInfo();
					ii.field = f;
					ii.id = Config.getItemID(modID.toLowerCase() + "." + a.id());
					ii.clazz = f.getType().asSubclass(Item.class);
					items.add(ii);
				}
				
				if(f.isAnnotationPresent(TileGUI.class)) {
					final int id = f.getInt(this);
					if(guis.containsKey(id))
						throw new DuplicateIDException("GUI ID "+id+" is already used");
					final TileGUI a = f.getAnnotation(TileGUI.class);
					final Class<? extends Container> container = f.getAnnotation(TileGUI.class).container();
					final Constructor<? extends Container> c_container = (Constructor<? extends Container>)container.getConstructors()[0];
					if(c_container.getParameterTypes().length != 2 ||
						!c_container.getParameterTypes()[0].isAssignableFrom(EntityPlayer.class) ||
						!(TileEntity.class.isAssignableFrom(c_container.getParameterTypes()[1]) || c_container.getParameterTypes()[1].isAssignableFrom(TileEntity.class)))
						throw new RuntimeException("Container constructor is not valid: "+c_container);
					
					guis.put(id, new RegisteredGUI() {
						@Override
						@SideOnly(Side.CLIENT)
						public GuiContainer getGUI(Container container_instance) {
							try {
								final Class<? extends GuiContainer> gui = a.gui();
								final Constructor<? extends GuiContainer> c_gui = gui.getConstructor(container);
								return c_gui.newInstance(container_instance);
							} catch(InvocationTargetException e) {
								if(e.getCause() instanceof RuntimeException)
									throw (RuntimeException)e.getCause();
								throw new RuntimeException(e.getCause());
							} catch(Exception e) {
								throw new RuntimeException(e);
							}
						}
						
						@Override
						public Container getContainer(EntityPlayer player, World world, int x, int y, int z) {
							try {
								return c_container.newInstance(player, world.getBlockTileEntity(x, y, z));
							} catch(InvocationTargetException e) {
								if(e.getCause() instanceof RuntimeException)
									throw (RuntimeException)e.getCause();
								throw new RuntimeException(e.getCause());
							} catch(Exception e) {
								throw new RuntimeException(e);
							}
						}
					});
				}
				
				if(f.isAnnotationPresent(PacketType.class)) {
					PacketType a = f.getAnnotation(PacketType.class);
					Constructor<? extends IPacket> c;
					try {
						c = a.type().getConstructor();
					} catch(NoSuchMethodException e) {
						throw new IllegalArgumentException(a.type() + " has no nullary constructor");
					}
					int id = f.getInt(this);
					switch(a.direction()) {
					case C2S:
						c2sPackets.put(Byte.valueOf((byte)id), c);
						break;
					case S2C:
						s2cPackets.put(Byte.valueOf((byte)id), c);
						break;
					case BOTH:
						c2sPackets.put(Byte.valueOf((byte)id), c);
						s2cPackets.put(Byte.valueOf((byte)id), c);
						break;
					}
					if(modAnnotation.channel().equals(""))
						throw new IllegalArgumentException("Cannot register packets without specifying a channel (in @CobaltiteMod)");
				}
				
				if(f.isAnnotationPresent(Configurable.class)) {
					String configName = modID.toLowerCase()+"."+f.getAnnotation(Configurable.class).value();
					
					if(f.getType() == int.class)
						f.set(this, Config.getInt(configName, f.getInt(this)));
					else if(f.getType() == boolean.class)
						f.set(this, Config.getBoolean(configName, f.getBoolean(this)));
					else if(f.getType() == String.class)
						f.set(this, Config.getString(configName, (String)f.get(this), Configuration.CATEGORY_GENERAL, null));
					else
						throw new IllegalArgumentException("Invalid @Configurable field class: "+f.getType());
				}
				
			} catch(Throwable e) {
				e.printStackTrace();
				errors = true;
				if(firstException == null)
					firstException = e;
			}
		}
		
		Config.save();
		
		if(errors)
			throw new RuntimeException("One or more errors were thrown while loading "+modName, firstException);
	}
	
	@Init
	public final void _init(FMLInitializationEvent evt) {
		boolean errors = false;
		Throwable firstException = null;
		
		for(BlockInfo bi : blocks) {
			try {
				if(bi.id == 0)
					bi.id = Config.config.getBlock(bi.configOptionID, 4095).getInt(4095);
				Block instance = bi.clazz.getConstructor(int.class).newInstance(bi.id);
				bi.field.set(this, instance);
				GameRegistry.registerBlock(instance, bi.itemClass, bi.configOptionID);
				
			} catch(Throwable e) {
				e.printStackTrace();
				errors = true;
				if(firstException == null)
					firstException = e;
			}
		}
		
		for(ItemInfo ii : items) {
			try {
				Item instance = ii.clazz.getConstructor(int.class).newInstance(ii.id - 256);
				ii.field.set(this, instance);
				
			} catch(Throwable e) {
				e.printStackTrace();
				errors = true;
				if(firstException == null)
					firstException = e;
			}
		}
		
		if(errors)
			throw new RuntimeException("One or more errors were thrown while loading "+modName, firstException);
		
		NetworkRegistry.instance().registerGuiHandler(this, this);
		
		if(!modAnnotation.channel().equals(""))
			APILocator.getNetManager().listen(new DefaultPacketMap());
		
		try {
			baseSharedInit();
			sharedInit();
			addRecipes();
		} catch(Exception e) {
			e.printStackTrace();
			errors = true;
			if(firstException == null)
				firstException = e;
		}
		
		if(FMLCommonHandler.instance().getSide() == Side.CLIENT) {
			try {
				baseClientInit();
				clientInit();
			} catch(Exception e) {
				e.printStackTrace();
				errors = true;
				if(firstException == null)
					firstException = e;
			}
		}
		
		if(errors)
			throw new RuntimeException("One or more errors were thrown while loading "+modName, firstException);
	}
	
	protected void addRecipes() throws Exception {}
	protected void sharedInit() throws Exception {}
	
	@SideOnly(Side.CLIENT)
	protected void clientInit() throws Exception {}
	
	@SideOnly(Side.CLIENT)
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		RegisteredGUI gui = guis.get(ID);
		if(gui == null) {
			System.out.println("getClientGuiElement for unknown GUI "+ID+" in "+modID);
			return null;
		}
		return gui.getGUI(gui.getContainer(player, world, x, y, z));
	}
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		RegisteredGUI gui = guis.get(ID);
		if(gui == null) {
			System.out.println("getServerGuiElement for unknown GUI "+ID+" in "+modID);
			return null;
		}
		return gui.getContainer(player, world, x, y, z);
	}
	
	
	private <T> T createInstance(String name, Class<T> base) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		return clazz.getClassLoader().loadClass(name).asSubclass(base).getConstructor().newInstance();
	}
	
	
	@SideOnly(Side.CLIENT)
	private void baseClientInit() throws Exception {
		for(String s : modAnnotation.textures())
			MinecraftForgeClient.preloadTexture(s);
		
		for(CobaltiteMod.RegisteredTile t : modAnnotation.tiles())
			if(!t.render().equals(""))
				ClientRegistry.bindTileEntitySpecialRenderer(t.tile(), createInstance(t.render(), TileEntitySpecialRenderer.class));
	}
	
	private void baseSharedInit() throws Exception {
		for(CobaltiteMod.RegisteredTile t : modAnnotation.tiles()) {
			GameRegistry.registerTileEntity(t.tile(), t.id());
		}
	}
	
	private class DefaultPacketMap implements IPacketMap {

		@Override
		public String getChannel() {
			return modAnnotation.channel();
		}

		@Override
		public IPacket createS2CPacket(byte id) {
			Constructor<? extends IPacket> c = s2cPackets.get(id);
			if(c == null)
				return null;
			else {
				try {
					return c.newInstance();
				} catch(Exception e) {
					if(e instanceof RuntimeException)
						throw (RuntimeException)e;
					throw new RuntimeException(e);
				}
			}
		}

		@Override
		public IPacket createC2SPacket(byte id) {
			Constructor<? extends IPacket> c = c2sPackets.get(id);
			if(c == null)
				return null;
			else {
				try {
					return c.newInstance();
				} catch(Exception e) {
					if(e instanceof RuntimeException)
						throw (RuntimeException)e;
					throw new RuntimeException(e);
				}
			}
		}
		
		@Override
		public String toString() {
			return "<DefaultPacketMap for "+ModBase.this+">";
		}
		
	}
}
