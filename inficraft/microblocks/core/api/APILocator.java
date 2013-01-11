package inficraft.microblocks.core.api;

import inficraft.microblocks.core.ImmibisCore;
import inficraft.microblocks.core.api.microblock.IMicroblockSystem;
import inficraft.microblocks.core.api.net.INetworkingManager;
import inficraft.microblocks.core.microblock.MicroblockSystem;

/**
 * Contains methods to get instances of various API interfaces.
 * Note: for mods that do not specify ImmibisCore as a required dependency,
 * this class may not be present, so calls to it should be wrapped in try-catch
 * blocks to catch NoClassDefFoundErrors.
 *
 * Do not redistribute this class with your mod!
 */
public final class APILocator {
	/**
	 * Returns the ID allocator interface, used to request block and item IDs
	 * and add recipes.
	 * 
	 * This is always present. 
	 */
	public static IIDAllocator getIDAllocator() {
		return ImmibisCore.idAllocator;
	}
	
	/**
	 * Returns the networking manager interface, used to send and listen
	 * for packets.
	 * 
	 * This is always present.
	 */
	public static INetworkingManager getNetManager() {
		return ImmibisCore.networkingManager;
	}
	
	/**
	 * Returns the microblock system interface.
	 * 
	 * This is not present if the user has not 
	 * Mods using this should be prepared for the case where this returns null.
	 */
	public static IMicroblockSystem getMicroblockSystem() {
		return MicroblockSystem.INSTANCE;
	}
}
