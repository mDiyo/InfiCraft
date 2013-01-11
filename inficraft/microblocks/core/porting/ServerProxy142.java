package inficraft.microblocks.core.porting;

import java.io.File;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import cpw.mods.fml.common.registry.GameRegistry;

public class ServerProxy142 extends CommonProxy142 {

	@Override
	public File getMinecraftDir() {
		return new File(".");
	}
	
	@Override
	public double getPlayerReach(EntityPlayer ply) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public EntityPlayer getThePlayer() {
		return null;
	}
	
	@Override
	public int getUniqueBlockModelID(String renderClass, boolean b) {
		return 0;
	}
	
	@Override
	public boolean isOp(String player) {
		return MinecraftServer.getServer().getConfigurationManager().areCommandsAllowed(player);
	}
	
	@Override
	public void preloadTexture(String texfile) {
	}
	
	@Override
	public void registerTileEntity(Class<? extends TileEntity> clazz, String id, String rclass) {
		GameRegistry.registerTileEntity(clazz, id);
	}
	
	@Override
	public void registerItemRenderer(int itemID, String renderClassName) {
	}

	@Override
	public boolean isDedicatedServer() {
		return true;
	}
	
	@Override
	public Object createSidedObject(String clientClass, String serverClass) {
		try {
			if(serverClass == null)
				return null;
			return Class.forName(serverClass).newInstance();
		} catch(Throwable e) {
			if(e instanceof Error)
				throw (Error)e;
			if(e instanceof RuntimeException)
				throw (RuntimeException)e;
			throw new RuntimeException(e);
		}
	}
}