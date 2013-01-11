package inficraft.microblocks.core;

import inficraft.microblocks.core.api.porting.SidedProxy;

import java.util.EnumSet;
import java.util.LinkedList;
import java.util.Queue;

import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class MainThreadTaskQueue {
	private final static Queue<Runnable> clientQueue = new LinkedList<Runnable>();
	private final static Queue<Runnable> serverQueue = new LinkedList<Runnable>();
	
	private static Queue<Runnable> getQueue(Side side) {
		return side.isServer() ? serverQueue : clientQueue;
	}
	
	private static final boolean IS_DEDICATED_SERVER = SidedProxy.instance.isDedicatedServer(); 
	
	public static void enqueue(Runnable task, Side side) {
		if(side.isClient() && IS_DEDICATED_SERVER)
			throw new IllegalStateException("Cannot queue client tasks on dedicated server");
		
		Queue<Runnable> queue = getQueue(side);
		synchronized(queue) {
			queue.add(task);
		}
	}

	private static void runPending(Side side) {
		Queue<Runnable> queue = getQueue(side);
		while(true) {
			Runnable r;
			synchronized(queue) {
				if(queue.isEmpty())
					break;
				r = queue.poll();
			}
			r.run();
		}
	}
	
	private static void init(final Side side, TickType tickType) {
		if(side.isClient() && IS_DEDICATED_SERVER)
			return;
		
		final EnumSet<TickType> ticks = EnumSet.of(tickType); 
		TickRegistry.registerTickHandler(new ITickHandler() {
			
			@Override
			public EnumSet<TickType> ticks() {
				return ticks;
			}
			
			@Override
			public void tickStart(EnumSet<TickType> type, Object... tickData) {
				runPending(side);
			}
			
			@Override
			public void tickEnd(EnumSet<TickType> type, Object... tickData) {
			}
			
			@Override
			public String getLabel() {
				return "Immibis Core task queue - "+side;
			}
		}, side);
	}
	
	static void init() {
		init(Side.CLIENT, TickType.CLIENT);
		init(Side.SERVER, TickType.SERVER);
	}
}
