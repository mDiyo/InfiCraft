package florasoma.trees.blocks;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import florasoma.trees.FloraTrees;

public class TreeBlock extends BlockLog
{
    public TreeBlock(int i)
    {
        super(i);
        blockIndexInTexture = 0;
        this.setHardness(1.5F);
        this.setResistance(5F);
        this.setStepSound(Block.soundWoodFootstep);        
        this.setRequiresSelfNotify();
        setBurnProperties(this.blockID, 5, 20);
    }
    
    public int getBlockTextureFromSideAndMetadata(int side, int metadata)
    {
    	int tex = blockIndexInTexture + (metadata % 4);
    	int orientation = metadata / 4;
    	
    	switch (orientation) //Ends of logs
    	{
    	case 0:
    		if (side == 0 || side == 1)
    			return tex + 16;
    		break;
    	case 1:
    		if (side == 4 || side == 5)
    			return tex + 16;
    		break;
    	case 2:
    		if (side == 2 || side == 3)
    			return tex + 16;
    		break;
    	}
    	
    	return tex;
    }
    
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return this.blockID;
    }

    @Override
    public int damageDropped(int meta)
    {
        return meta % 4;
    }

    public String getTextureFile()
    {
        return FloraTrees.texture;
    }

    public int getFlammability(IBlockAccess world, int x, int y, int z, int metadata, ForgeDirection face)
    {
        return metadata % 4 != 2 ? blockFlammability[blockID] : 0;
    }

    public int getFireSpreadSpeed(World world, int x, int y, int z, int metadata, ForgeDirection face)
    {
        return metadata % 4 != 2 ? blockFireSpreadSpeed[blockID] : 0;
    }

    @SideOnly(Side.CLIENT)
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        par3List.add(new ItemStack(par1, 1, 0));
        par3List.add(new ItemStack(par1, 1, 1));
        par3List.add(new ItemStack(par1, 1, 2));
    }
}
