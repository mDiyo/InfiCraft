package inficraft.microblocks.core.microblock;

import inficraft.microblocks.core.api.microblock.PartType;
import inficraft.microblocks.core.multipart.BlockMultipartBase;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockMicroblockContainer extends BlockMultipartBase {
	protected BlockMicroblockContainer(int id, Material mat) {
		super(id, mat);
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileMicroblockContainer();
	}
	
	static int[] texindices = null;
	@SideOnly(Side.CLIENT)
	@Override
	public final int getBlockTextureFromSideAndMetadata(int i, int j) {
		return texindices == null ? 0 : texindices[i];
	}
	

	
	@Override
	@SideOnly(Side.CLIENT)
	public void renderInvBlock(RenderBlocks render, int meta) {
		PartType type = MicroblockSystem.parts.get(meta);
		if(type == null)
			return;
		
		MicroblockRenderer.renderPartInv(render, type);
	}
}
