package inficraft.microblocks.core;

import inficraft.microblocks.core.api.porting.PortableBlockRenderer;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class CoreBlockRenderer implements PortableBlockRenderer {
	@Override
	public boolean renderWorldBlock(RenderBlocks render, IBlockAccess world, int x, int y, int z, Block block, int model)
	{
		if(model == BlockMultiTile.model)
			return ((BlockMultiTile)block).renderStatic(render, world, x, y, z);
		return false;
	}
	
	@Override
	public void renderInvBlock(RenderBlocks render, Block block, int meta, int model) {
		if(model == BlockMultiTile.model)
			((ItemBlockMultiTile)Item.itemsList[block.blockID]).renderItem(render, meta);
	}
}