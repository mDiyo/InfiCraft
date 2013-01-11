package inficraft.microblocks.core;

import inficraft.microblocks.core.api.porting.SidedProxy;
import inficraft.microblocks.core.api.util.Dir;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Vec3;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public abstract class BlockCombined extends BlockContainer {
	
	private static Random random = new Random();
	
	public ItemCombined item;
	public final String texfile;

	@Override
    public int damageDropped(int meta) {
		return meta;
	}
	
	public BlockCombined(int i, Material m, String texfile) {
		super(i, m);
		this.texfile = texfile;
		if(texfile == null)
			throw new NullPointerException("texfile");
		SidedProxy.instance.preloadTexture(texfile);
		setTextureFile(texfile);
		setCreativeTab(CreativeTabs.tabMisc);
		setHardness(2.0F);
	}
	
	@Override
	public void onBlockPlacedBy(World w, int x, int y, int z, EntityLiving player)
    {
		TileCombined te = (TileCombined)w.getBlockTileEntity(x, y, z);
        
		Vec3 look = player.getLook(1.0f);
		
        double absx = Math.abs(look.xCoord);
        double absy = Math.abs(look.yCoord);
        double absz = Math.abs(look.zCoord);
        
        if(absx > absy && absx > absz) {
        	if(look.xCoord < 0)
        		te.onPlaced(player, Dir.NX);
        	else
        		te.onPlaced(player, Dir.PX);
        } else if(absy > absz) {
        	if(look.yCoord < 0)
        		te.onPlaced(player, Dir.NY);
        	else
        		te.onPlaced(player, Dir.PY);
        } else {
        	if(look.zCoord < 0)
        		te.onPlaced(player, Dir.NZ);
        	else
        		te.onPlaced(player, Dir.PZ);
        }
    }
	
	@Override
	public boolean canProvidePower() {
        return true;
    }
	
	@Override
	public boolean isProvidingStrongPower(IBlockAccess world, int x, int y, int z, int i) {
		TileCombined te = (TileCombined)world.getBlockTileEntity(x, y, z);
		if(te != null)
			return te.redstone_output;
		return false;
	}
	
	@Override
	public boolean isProvidingWeakPower(IBlockAccess world, int x, int y, int z, int i) {
		return isProvidingStrongPower(world, x, y, z, i);
	}
	
	@Override
	public ArrayList getBlockDropped(World world, int i, int j, int k, int l, int i1)
	{
		ArrayList list = new ArrayList();
		list.add(new ItemStack(this, 1, l));
		return list;
	}
	
	public List<ItemStack> getInventoryDrops(World world, int x, int y, int z) {
		TileCombined te = (TileCombined)world.getBlockTileEntity(x, y, z);
		return te.getInventoryDrops();
	}
	
	@Override
	public abstract int getBlockTextureFromSideAndMetadata(int side, int data);
	
	@Override
	public int getRenderType() {
		return 0;
	}
	
	@Override
	public void onNeighborBlockChange(World w, int x, int y, int z, int i)
	{
		if(w.isRemote)
			return;
		TileCombined te = (TileCombined)w.getBlockTileEntity(x, y, z);
		if(te != null)
			te.onBlockNeighbourChange();
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9)
	{
		if(player.isSneaking())
			return false;
		TileCombined te = (TileCombined)world.getBlockTileEntity(x, y, z);
		if(te != null)
			return te.onBlockActivated(player);
		return false;
    }
	
	@Override
	public void breakBlock(World world, int x, int y, int z, int par5, int par6)
	{
		TileCombined te = (TileCombined)world.getBlockTileEntity(x, y, z);
		if(te != null)
			te.onBlockRemoval();
		
		List<ItemStack> drops = getInventoryDrops(world, x, y, z);
		for(ItemStack stack : drops) {
			float xpos = x + random.nextFloat() * 0.8f + 0.1f;
			float ypos = y + random.nextFloat() * 0.8f + 0.1f;
			float zpos = z + random.nextFloat() * 0.8f + 0.1f;
			
			//System.out.println("drop "+stack + " at "+xpos+","+ypos+","+zpos);
			
			// chests do this (multiple drops per stack, 10-30 items at a time)
			int left = stack.stackSize;
			while(left > 0) {
				int removeCount = Math.min(random.nextInt(21) + 10, left);
				left -= removeCount;
				
				EntityItem ent = new EntityItem(world, xpos, ypos, zpos, new ItemStack(stack.itemID, removeCount, stack.getItemDamage()));
				
				ent.motionX = random.nextGaussian() * 0.05f;
				ent.motionY = random.nextGaussian() * 0.05f + 0.2f;
				ent.motionZ = random.nextGaussian() * 0.05f;
				
				if(stack.hasTagCompound())
					ent.func_92014_d().setTagCompound(stack.getTagCompound());
				
				world.spawnEntityInWorld(ent);
	        }
		}
		super.breakBlock(world, x, y, z, par5, par6);
    }
	
	public abstract TileEntity getBlockEntity(int data);
	@Override
	public final TileEntity createNewTileEntity(World world) {
		if(world == null) return null; // BC3 workaround
		throw new UnsupportedOperationException();
	}
	@Override
	public final TileEntity createNewTileEntity(World world, int meta) {
		return getBlockEntity(meta);
	}
	
	@Override
    public abstract void addCreativeItems(ArrayList arraylist);
	
	@Override
	public final void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List) {
		ArrayList al = new ArrayList();
		addCreativeItems(al);
		par3List.addAll(al);
	}
}
