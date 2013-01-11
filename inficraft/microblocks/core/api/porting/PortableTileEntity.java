package inficraft.microblocks.core.api.porting;

import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet132TileEntityData;
import net.minecraft.tileentity.TileEntity;

public class PortableTileEntity extends TileEntity {
	
	public void onDataPacket(Packet132TileEntityData packet) {}
	
	@Override public final void onDataPacket(INetworkManager net, Packet132TileEntityData p) {
		onDataPacket(p);
	}
}
