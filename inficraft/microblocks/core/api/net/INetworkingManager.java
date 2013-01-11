package inficraft.microblocks.core.api.net;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.packet.Packet;

public interface INetworkingManager {
	public Packet wrap(IPacket packet);
	
	public void sendToServer(IPacket packet);
	public void sendToClient(IPacket packet, EntityPlayer target);

	public void listen(IPacketMap handler);
}
