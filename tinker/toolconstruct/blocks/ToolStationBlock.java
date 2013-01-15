package tinker.toolconstruct.blocks;

import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import tinker.common.InventoryBlock;
import tinker.toolconstruct.TConstructContent;
import tinker.toolconstruct.ToolConstruct;
import tinker.toolconstruct.client.TableRender;

public class ToolStationBlock extends InventoryBlock
{

	public ToolStationBlock(int id, Material material)
	{
		super(id, material);
		this.setCreativeTab(ToolConstruct.blockTab);
		this.setHardness(2f);
	}

    public String getTextureFile()
    {
        return TConstructContent.blockTexture;
    }
	
	public int getBlockTextureFromSideAndMetadata(int side, int meta)
    {
		if (meta == 0)
		{
			if (side == 0)
				return 3;
			else if (side == 1)
				return 0;
			else if (side == 2 || side == 3)
				return 1;
			else
				return 2;
		}
		else
		{
			return 1 + meta*3 + getBlockTextureFromSide(side);
		}
    }
	
	public int getBlockTextureFromSide(int side)
	{
		if (side == 0)
			return 2;
		if (side == 1)
			return 0;
		
		return 1;
	}
	
	@Override
	public boolean renderAsNormalBlock ()
	{
		return false;
	}
	
	@Override
	public boolean isOpaqueCube ()
	{
		return false;
	}

	@Override
	public int getRenderType ()
	{
		return TableRender.tabelModelID;
	}
	
	@Override
	public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
		return true;
    }
	
	public int damageDropped(int meta)
    {
        return meta;
    }	
	
	public TileEntity createNewTileEntity(World world, int metadata)
    {
		switch (metadata)
		{
		case 0: return new ToolStationLogic();
		case 1: return new PartCrafterLogic();
		case 2: return new PartCrafterLogic();
		case 3: return new PartCrafterLogic();
		case 4: return new PartCrafterLogic();
		default: return null;
		}
        
    }

	@Override
	public Integer getGui(World world, int x, int y, int z, EntityPlayer entityplayer)
	{
		int md = world.getBlockMetadata(x, y, z);
		if (md == 0)
			return 0;
		else if (md < 5)
			return 1;
		
		return -1;
	}

	@Override
	public Object getModInstance()
	{
		return ToolConstruct.instance;
	}
	
	@Override
    public void getSubBlocks(int id, CreativeTabs tab, List list)
    {
    	for (int iter = 0; iter < 5; iter++)
    	{
    		list.add(new ItemStack(id, 1, iter));
    	}
    }
}
