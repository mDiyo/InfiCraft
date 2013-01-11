package inficraft.microblocks.core;

import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileMultiTile extends TileEntity {
	@SideOnly(Side.CLIENT)
	protected void renderAsCube(RenderBlocks rb, IBlockAccess w, int x, int y, int z, int[] textures) {
		BlockMultiTile block = (BlockMultiTile)this.getBlockType();
		block.textures = textures;
		BlockMultiTile.model = 0;
		rb.renderStandardBlock(block, x, y, z);
		BlockMultiTile.model = BlockMultiTile.normalModel;
	}
	@SideOnly(Side.CLIENT)
	public boolean renderStatic(RenderBlocks rb, IBlockAccess w, int x, int y, int z) {
		return false;
	}
}
