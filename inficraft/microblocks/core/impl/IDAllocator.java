package inficraft.microblocks.core.impl;

import inficraft.microblocks.core.Config;
import inficraft.microblocks.core.api.IIDAllocator;
import inficraft.microblocks.core.api.IIDCallback;
import inficraft.microblocks.core.api.IRecipeSaveHandler;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;

public class IDAllocator implements IIDAllocator {
	
	private boolean canRequest = true;
	
	private static class Request {
		@SuppressWarnings("unused")
		public Object mod;
		public String name;
		public IIDCallback callback;
		@SuppressWarnings("unused")
		public int min, max, _default;
		public IDType type;
		
		public int id = -1;
	}
	
	private List<Request> requests = new ArrayList<Request>();
	
	private static class SavedRecipes<S,D> {
		private S initialState, finalState;
		private D diff;
		private final IRecipeSaveHandler<S,D> handler;
		private boolean saved = false;
		
		public SavedRecipes(IRecipeSaveHandler<S,D> handler) {
			this.handler = handler;
		}
		
		public void saveInitial() {
			initialState = handler.save();
		}
		public void saveFinal() {
			finalState = handler.save();
			diff = handler.diff(finalState, initialState);
			saved = true;
		}
		public void load() {
			handler.apply(diff);
		}
		public boolean isSaved() {
			return saved;
		}
		
		public static <S,D> SavedRecipes<S,D> create(IRecipeSaveHandler<S,D> handler) {
			return new SavedRecipes<S,D>(handler);
		}
	}
	
	private List<SavedRecipes<?,?>> savedRecipes = new ArrayList<SavedRecipes<?,?>>();
	private List<Runnable> recipeAdders = new ArrayList<Runnable>();

	public void allocate(IIDSet idSet) {
		canRequest = false;
		
		Config.save();
		for(SavedRecipes<?,?> r : savedRecipes) {
			if(r.isSaved()) {
				r.load();
			}
		}
		for(Request r : requests) {
			if(r.id != -1) {
				//r.callback.unregister(r.id);
				//r.id = -1;
				throw new AssertionError("already registered: "+r.name);
			}
		}
		
		for(Request r : requests) {
			r.id = idSet.getIDFor(r.name, r.type, r._default);
			if(r.id != -1 && (r.id < 1 || r.id >= r.max))
				throw new AssertionError("Failed to get ID for "+r.name+" from "+idSet);
			if(r.id != -1) {
				r.callback.register(r.id);
				switch(r.type) {
				case TerrainBlock:
				case Block:
					if(Block.blocksList[r.id] == null)
						throw new AssertionError(r.callback+" failed to register block "+r.name);
					break;
				case Item:
					if(Item.itemsList[r.id] == null)
						throw new AssertionError(r.callback+" failed to register item "+r.name);
					break;
				}
			}
		}
		
		for(SavedRecipes<?,?> r : savedRecipes)
			if(!r.isSaved())
				r.saveInitial();
		
		for(Runnable r : recipeAdders)
			r.run();
		
		for(SavedRecipes<?,?> r : savedRecipes)
			if(!r.isSaved())
				r.saveFinal();
		
	}

	private Request request(Object mod, String name, IIDCallback callback, int min, int max, boolean allowDefault, IDType type) {
		if(!canRequest)
			throw new IllegalStateException("Too late to request IDs, use pre-init");
		
		Request r = new Request();
		r.mod = mod;
		r.name = name;
		r.callback = callback;
		r.min = min;
		r.max = max;
		r.type = type;
		r._default = allowDefault ? min + (Math.abs(r.name.hashCode()) % (max - min)) : max - 1;
		requests.add(r);
		return r;
	}

	@Override
	public void addRecipes(Runnable callback) {
		if(!canRequest)
			throw new IllegalStateException("Too late to register recipe callbacks, use pre-init");
		recipeAdders.add(callback);
	}

	@Override
	public void registerRecipeSaveHandler(IRecipeSaveHandler<?,?> handler) {
		if(!canRequest)
			throw new IllegalStateException("Too late to register recipe save handlers, use pre-init");
		savedRecipes.add(SavedRecipes.create(handler));
	}

	@Override
	public void requestItem(Object mod, String name, IIDCallback callback) {
		Request r = request(mod, name, callback, 4096, 32000, true, IDType.Item);
		if(Config.config.getCategory(Configuration.CATEGORY_ITEM).containsKey(r.name))
			Config.config.get(Configuration.CATEGORY_ITEM, r.name, r._default).getInt(r._default);
	}

	@Override
	public void requestTerrainBlock(Object mod, String name, IIDCallback callback) {
		Request r = request(mod, name, callback, 128, 256, false, IDType.TerrainBlock);
		if(Config.config.getCategory(Configuration.CATEGORY_BLOCK).containsKey(r.name))
			Config.config.getTerrainBlock(Configuration.CATEGORY_BLOCK, r.name, r._default, null);
	}

	@Override
	public void requestBlock(Object mod, String name, IIDCallback callback) {
		Request r = request(mod, name, callback, 256, 4096, true, IDType.Block);
		if(Config.config.getCategory(Configuration.CATEGORY_BLOCK).containsKey(r.name+".id"))
			Config.config.getBlock(r.name+".id", r._default);
	}

}
