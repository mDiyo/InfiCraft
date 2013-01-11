package inficraft.microblocks.core;

import java.util.ArrayList;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockMultiTile extends BlockContainer {

	public static int model;
	static int normalModel;
	int textures[] = new int[6];
	private String texfile;

	protected BlockMultiTile(int id, Material material, String texfile) {
		super(id, material);
		setTextureFile(texfile);
		setHardness(2.0F);
	}
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
	
	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}
	
	@Override
	public void addCreativeItems(ArrayList items) {
		ItemBlockMultiTile i = (ItemBlockMultiTile)Item.itemsList[blockID];
		for(int k = 0; k < i.max_meta; k++) {
			items.add(new ItemStack(this, 1, k));
		}
	}
	
	@SideOnly(Side.CLIENT)
	public boolean renderStatic(RenderBlocks rb, IBlockAccess world, int x, int y, int z) {
		TileEntity te = world.getBlockTileEntity(x, y, z);
		if(te instanceof TileMultiTile) {
			return ((TileMultiTile)te).renderStatic(rb, world, x, y, z);
		}
		return false;
	}
	
	@Override
	public int getBlockTextureFromSideAndMetadata(int side, int meta) {
		return textures[side];
	}

	@Override
	public int getRenderType() {
		return model;
	}

	@Override
	public TileEntity createNewTileEntity(World w) {
		return null;
	}

	@Override
	public String getTextureFile() {
		return texfile;
	}
}
