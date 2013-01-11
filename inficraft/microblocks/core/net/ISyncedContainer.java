package inficraft.microblocks.core.net;

import inficraft.microblocks.core.api.net.IPacket;

/**
 * Implement this on your container class to receive GUI packets.
 * (send them from OneTwoFiveNetworking.sendContainerUpdate)
 */
public interface ISyncedContainer {
	/** You will want to check the class of the packet before using it */
	public void onReceivePacket(IPacket packet);
}
