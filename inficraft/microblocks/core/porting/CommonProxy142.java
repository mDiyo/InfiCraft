package inficraft.microblocks.core.porting;

import inficraft.microblocks.core.api.porting.SidedProxy;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.common.DimensionManager;
import cpw.mods.fml.common.registry.LanguageRegistry;

public abstract class CommonProxy142 extends SidedProxy {
	@Override
	public boolean isWorldCurrent(World w) {
		return DimensionManager.getWorld(w.provider.dimensionId) == w;
	}
	
	@Override
	public void addLocalization(String key, String value) {
		LanguageRegistry.instance().addStringLocalization(key, value);
	}
	
	@Override
	public void sendChat(String msg, EntityPlayer player) {
		player.addChatMessage(msg);
	}
}