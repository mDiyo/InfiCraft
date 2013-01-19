package florasoma.trees.blocks;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import florasoma.common.FloraSomaTab;
import florasoma.trees.FloraTrees;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/*
 * This class is for a single tree with a 2x2 base and inside textures 
 */

public class LogTwoxTwo extends BlockLog
{
	public LogTwoxTwo(int id, int texPos, String tex, float hardness)
	{
		super(id);
		blockIndexInTexture = texPos;
		texture = tex;
		this.setHardness(hardness);
		this.setCreativeTab(FloraSomaTab.tab);
	}
	
	public int idDropped(int par1, Random par2Random, int par3)
    {
        return FloraTrees.bloodwood.blockID;
    }

	public int damageDropped (int meta)
	{
		if (meta < 12)
			return 0;
		else if (meta == 15)
			return 15;
		return 12;
	}

	@Override
	public int getBlockTextureFromSideAndMetadata (int side, int meta)
	{
		if (meta == 15) //Fullbark
			return blockIndexInTexture;

		//TODO: Rotating single log for 12, 13, 14

		// Upward facing
		if (meta == 0)
		{
			switch (side)
			{
			case 0:
				return blockIndexInTexture + 2; //Bottom
			case 1:
				return blockIndexInTexture + 2; //Top
			case 2:
				return blockIndexInTexture;
			case 3:
				return blockIndexInTexture + 16;
			case 4:
				return blockIndexInTexture;
			case 5:
				return blockIndexInTexture + 17;
			}
		}

		if (meta == 1)
		{
			switch (side)
			{
			case 0:
				return blockIndexInTexture + 3; //Bottom
			case 1:
				return blockIndexInTexture + 3; //Top
			case 2:
				return blockIndexInTexture;
			case 3:
				return blockIndexInTexture + 17;
			case 4:
				return blockIndexInTexture + 16;
			case 5:
				return blockIndexInTexture;
			}
		}

		if (meta == 2)
		{
			switch (side)
			{
			case 0:
				return blockIndexInTexture + 18; //Bottom
			case 1:
				return blockIndexInTexture + 18; //Top
			case 2:
				return blockIndexInTexture + 17;
			case 3:
				return blockIndexInTexture;
			case 4:
				return blockIndexInTexture;
			case 5:
				return blockIndexInTexture + 16;
			}
		}

		if (meta == 3)
		{
			switch (side)
			{
			case 0:
				return blockIndexInTexture + 19; //Bottom
			case 1:
				return blockIndexInTexture + 19; //Top
			case 2:
				return blockIndexInTexture + 17;
			case 3:
				return blockIndexInTexture;
			case 4:
				return blockIndexInTexture + 16;
			case 5:
				return blockIndexInTexture;
			}
		}

		// East/West
		if (meta == 4)
		{
			switch (side)
			{
			case 0:
				return blockIndexInTexture + 16;
			case 1:
				return blockIndexInTexture;
			case 2:
				return blockIndexInTexture + 17;
			case 3:
				return blockIndexInTexture;
			case 4:
				return blockIndexInTexture + 3;
			case 5:
				return blockIndexInTexture + 2;
			}
		}

		if (meta == 5)
		{
			switch (side)
			{
			case 0:
				return blockIndexInTexture + 17;
			case 1:
				return blockIndexInTexture;
			case 2:
				return blockIndexInTexture;
			case 3:
				return blockIndexInTexture + 16;
			case 4:
				return blockIndexInTexture + 2;
			case 5:
				return blockIndexInTexture + 3;
			}
		}

		if (meta == 6)
		{
			switch (side)
			{
			case 0:
				return blockIndexInTexture; //Bottom
			case 1:
				return blockIndexInTexture + 17; //Top
			case 2:
				return blockIndexInTexture + 16;
			case 3:
				return blockIndexInTexture;
			case 4:
				return blockIndexInTexture + 19;
			case 5:
				return blockIndexInTexture + 18;
			}
		}

		if (meta == 7)
		{
			switch (side)
			{
			case 0:
				return blockIndexInTexture; //Bottom
			case 1:
				return blockIndexInTexture + 16; //Top
			case 2:
				return blockIndexInTexture;
			case 3:
				return blockIndexInTexture + 17;
			case 4:
				return blockIndexInTexture + 18;
			case 5:
				return blockIndexInTexture + 19;
			}
		}

		//North/south
		if (meta == 8)
		{
			switch (side)
			{
			case 0:
				return blockIndexInTexture + 16;
			case 1:
				return blockIndexInTexture;
			case 2:
				return blockIndexInTexture + 3;
			case 3:
				return blockIndexInTexture + 2;
			case 4:
				return blockIndexInTexture;
			case 5:
				return blockIndexInTexture + 17;
			}
		}

		if (meta == 9)
		{
			switch (side)
			{
			case 0:
				return blockIndexInTexture + 17;
			case 1:
				return blockIndexInTexture;
			case 2:
				return blockIndexInTexture + 2;
			case 3:
				return blockIndexInTexture + 3;
			case 4:
				return blockIndexInTexture + 16;
			case 5:
				return blockIndexInTexture;
			}
		}

		if (meta == 10)
		{
			switch (side)
			{
			case 0:
				return blockIndexInTexture; //Bottom
			case 1:
				return blockIndexInTexture + 16; //Top
			case 2:
				return blockIndexInTexture + 19;
			case 3:
				return blockIndexInTexture + 18;
			case 4:
				return blockIndexInTexture;
			case 5:
				return blockIndexInTexture + 16;
			}
		}

		if (meta == 11)
		{
			switch (side)
			{
			case 0:
				return blockIndexInTexture; //Bottom
			case 1:
				return blockIndexInTexture + 17; //Top
			case 2:
				return blockIndexInTexture + 18;
			case 3:
				return blockIndexInTexture + 19;
			case 4:
				return blockIndexInTexture + 17;
			case 5:
				return blockIndexInTexture;
			}
		}

		return 0;
	}

	/* Combined stair and log placement */
	public int func_85104_a (World par1World, int blockX, int blockY, int blockZ, int side, float clickX, float clickY, float clickZ, int metadata)
	{

		int meta = metadata & 3;
		byte add = 0;

		switch (side)
		{
		case 0:
		case 1:
			add = 0;
			if (clickX > 0.5f)
				add += 1;
			if (clickZ > 0.5f)
				add += 2;
			break;
		case 2:
		case 3:
			add = 8;
			if (clickX > 0.5f)
				add += 1;
			if (clickY < 0.5f)
				add += 2;
			break;
		case 4:
		case 5:
			add = 4;
			if (clickZ < 0.5f)
				add += 1;
			if (clickY < 0.5f)
				add += 2;
		}

		return meta | add;
	}

	@Override
	public String getTextureFile ()
	{
		return texture;
	}
	
	@SideOnly(Side.CLIENT)

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        par3List.add(new ItemStack(par1, 1, 0));
        par3List.add(new ItemStack(par1, 1, 12));
        par3List.add(new ItemStack(par1, 1, 15));
    }

	private String texture;
}
