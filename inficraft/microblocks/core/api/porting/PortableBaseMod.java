package inficraft.microblocks.core.api.porting;

import java.util.EnumSet;

import cpw.mods.fml.common.IScheduledTickHandler;
import cpw.mods.fml.common.TickType;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;
public abstract class PortableBaseMod {    
    public boolean onTickInGame() {return false;}
    
    public void enableClockTicks(final boolean server) {
    	TickRegistry.registerScheduledTickHandler(new IScheduledTickHandler() {
			
			@Override
			public EnumSet<TickType> ticks() {
				return EnumSet.of(server ? TickType.SERVER : TickType.CLIENT);
			}
			
			@Override
			public void tickStart(EnumSet<TickType> type, Object... tickData) {
				onTickInGame();
			}
			
			@Override
			public void tickEnd(EnumSet<TickType> type, Object... tickData) {
				
			}
			
			@Override
			public String getLabel() {
				return PortableBaseMod.this.getClass().getSimpleName();
			}
			
			@Override
			public int nextTickSpacing() {
				return 1;
			}
		}, server ? Side.SERVER : Side.CLIENT);
    }
}