package inficraft.microblocks.core.api.multipart;


public interface IMultipartTile extends IPartContainer {
	/**
	 * Returns an ICoverSystem object, or null if this tile does not support a cover system
	 * @see inficraft.microblocks.core.api.multipart.ICoverSystem 
	 */
	public ICoverSystem getCoverSystem();
}
