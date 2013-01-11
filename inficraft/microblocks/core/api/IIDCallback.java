package inficraft.microblocks.core.api;

public interface IIDCallback {
	/**
	 * Called to register the block or item.
	 * @param id The ID to use. For items, this is the real ID (ie without 256 subtracted)
	 */
	public void register(int id);
}
