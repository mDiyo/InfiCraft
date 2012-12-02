package mDiyo.inficraft.flora.corruptor;

import java.util.ArrayList;
import java.util.List;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.World;

public class CorruptBrick extends Block
{
    public CorruptBrick(int i)
    {
        super(i, 64, Material.rock);
        blockIndexInTexture = 112;
        this.setHardness(2.0F);
        this.setBlockName("corruptbrick");
        setCreativeTab(CreativeTabs.tabBlock);
    }

    public int getBlockTextureFromSideAndMetadata(int i, int j)
    {
        if (j < 8)
        {
            return blockIndexInTexture + j;
        }
        else
        {
            return blockIndexInTexture + 8 + j;
        }
    }

    public boolean isFireSource(World world, int i, int j, int k, int l, int i1)
    {
        return l < 8;
    }

    public float getHardness(int i)
    {
        return i <= 8 ? 2.0F : 8F;
    }

    public int damageDropped(int i)
    {
        return i;
    }

    public String getTextureFile()
    {
        return FloraCorruptor.texture;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void getSubBlocks(int id, CreativeTabs tab, List list)
    {
        for (int iter = 0; iter < 16; ++iter)
        {
            list.add(new ItemStack(id, 1, iter));
        }
    }
}
