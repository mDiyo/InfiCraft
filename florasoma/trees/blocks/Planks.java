package florasoma.trees.blocks;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import florasoma.common.FloraSomaTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;

/*
 * This class is for a single tree with a 2x2 base and inside textures 
 */

public class Planks extends Block
{
	public Planks(int id, int texPos, String tex) 
	{
		super(id, Material.wood);
		blockIndexInTexture = texPos;
		texture = tex;
		setBurnProperties(this.blockID, 5, 20);
		this.setHardness(2.0f);
		this.setCreativeTab(FloraSomaTab.tab);
	}
	
	@Override
	public int getBlockTextureFromSideAndMetadata(int side, int meta)
    {
		if (meta == 0)
			return blockIndexInTexture + 1;
		if (meta == 1)
			return blockIndexInTexture + 3;
		if (meta == 2)
			return blockIndexInTexture + 4;
		if (meta == 3)
			return blockIndexInTexture;
		if (meta == 4)
			return blockIndexInTexture + 5;
		if (meta == 5)
			return blockIndexInTexture + 2;
		
		return blockIndexInTexture + meta;
    }
	
	@Override
	public String getTextureFile()
    {
        return texture;
    }
	
	public int getFlammability(IBlockAccess world, int x, int y, int z, int metadata, ForgeDirection face)
    {
		if (metadata == 1 || metadata == 4)
			return 0;
        return blockFlammability[blockID];
    }

    public int getFireSpreadSpeed(World world, int x, int y, int z, int metadata, ForgeDirection face)
    {
    	if (metadata == 1 || metadata == 4)
			return 0;
        return blockFireSpreadSpeed[blockID];
    }
    
    @Override
    public int damageDropped(int meta)
    {
        return meta;
    }

	private String texture;
	
	@SideOnly(Side.CLIENT)
	@Override
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
		for (int i = 0; i < 6; i++)
        par3List.add(new ItemStack(par1, 1, i));
    }
}
