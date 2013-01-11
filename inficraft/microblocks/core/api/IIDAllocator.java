package inficraft.microblocks.core.api;

public interface IIDAllocator {
	/**
	 * Requests a block ID. The given callback's methods will be called later to register
	 * and unregister the block.
	 * 
	 * This should be called from a mod's preinit event.
	 * 
	 * @param mod The mod. Must be an FML mod object.
	 * @param name An identifier for the block. Must be globally unique.
	 * @param callback The callback to use for this block.
	 */
	public void requestBlock(Object mod, String name, IIDCallback callback);
	
	/**
	 * Requests a block ID less than 256.
	 * @see IIDAllocator#requestBlock(Object, String, IIDCallback)
	 */
	public void requestTerrainBlock(Object mod, String name, IIDCallback callback);
	
	/**
	 * Requests an item ID. The given callback's methods will be called later to register
	 * and unregister the block.
	 * 
	 * This should be called from a mod's preinit event.
	 * 
	 * @param mod The mod. Must be an FML mod object.
	 * @param name An identifier for the item. Must be globally unique.
	 * @param callback The callback to use for this block.
	 */
	public void requestItem(Object mod, String name, IIDCallback callback);
	
	/**
	 * Registers an object to be invoked after ID registration.
	 * This object's {@link java.lang.Runnable#run()} method should only be used for adding recipes.
	 * This should be called from a mod's preinit event.
	 */
	public void addRecipes(Runnable callback);
	
	/**
	 * Registers a recipe save handler.
	 */
	public void registerRecipeSaveHandler(IRecipeSaveHandler<?, ?> handler);
}
