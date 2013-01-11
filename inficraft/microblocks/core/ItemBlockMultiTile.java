package inficraft.microblocks.core;

import inficraft.microblocks.core.api.porting.SidedProxy;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public abstract class ItemBlockMultiTile extends ItemBlock {
	public int max_meta = 0;
	
	public ItemBlockMultiTile(int id, int max_meta) {
		super(id);
		this.max_meta = max_meta;
		
		for(int k = 0; k < max_meta; k++)
			SidedProxy.instance.addLocalization(itemID+"."+k+".name", getName(k));
	}
	
	public abstract void renderItem(RenderBlocks rb, int meta);
	
	@Override
    public String getItemNameIS(ItemStack stack)
    {
		return itemID+"."+stack.getItemDamage();
    }
	
	public abstract TileEntity createTileEntity(int meta);
	public abstract String getName(int meta);

	@Override
	public boolean placeBlockAt(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ, int metadata) {
	    Block var9 = Block.blocksList[getBlockID()];

        if (world.setBlockAndMetadataWithNotify(x, y, z, getBlockID(), 0))
        {
        	world.setBlockTileEntity(x, y, z, createTileEntity(stack.getItemDamage()));
            if (world.getBlockId(x, y, z) == getBlockID())
            {
                var9.onBlockPlacedBy(world, x, y, z, player);
            } else
            	return false;
        } else
        	return false;

        return true;
	}
}
