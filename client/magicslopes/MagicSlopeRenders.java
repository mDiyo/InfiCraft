package net.minecraft.src.magicslopes;

import net.minecraft.client.Minecraft;
import net.minecraft.src.*;

public class MagicSlopeRenders {
	
	private static MagicSlopeRenders instance = new MagicSlopeRenders();
	
	public static MagicSlopeRenders getInstance()
	{
		return instance;
	}

	public boolean renderSlopeWorld(RenderBlocks renderblocks,
			IBlockAccess iblockaccess, int x, int y, int z, Block block) {		
		return false;
	}

	public static void renderSlopeInv(RenderBlocks renderblocks, Block block,
			int i) {
		
	}
}
