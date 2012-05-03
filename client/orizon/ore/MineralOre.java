package net.minecraft.src.orizon.ore;
import java.util.ArrayList;
import java.util.Random;

import net.minecraft.src.forge.*;
import net.minecraft.src.*;

public class MineralOre extends Block
    implements ITextureProvider
{
    public MineralOre(int i, int j)
    {
        super(i, j, Material.rock);
    }
    
    public int idDropped(int md, Random random, int fortune)
    {
        return mod_Orizon.mineralOreID;
    }

    protected int damageDropped(int i)
    {
        return i;
    }

    public int getBlockTextureFromSideAndMetadata(int i, int j)
    {
        return blockIndexInTexture + j;
    }

    public String getTextureFile()
    {
        return "/oretex/ores.png";
    }
    
    public void addCreativeItems(ArrayList arraylist)
    {
        arraylist.add(new ItemStack(mod_Orizon.mineralOre, 1, 0));
        arraylist.add(new ItemStack(mod_Orizon.mineralOre, 1, 1));
        arraylist.add(new ItemStack(mod_Orizon.mineralOre, 1, 2));
        arraylist.add(new ItemStack(mod_Orizon.mineralOre, 1, 3));
        arraylist.add(new ItemStack(mod_Orizon.mineralOre, 1, 4));
        arraylist.add(new ItemStack(mod_Orizon.mineralOre, 1, 5));
        arraylist.add(new ItemStack(mod_Orizon.mineralOre, 1, 6));
        arraylist.add(new ItemStack(mod_Orizon.mineralOre, 1, 7));
        arraylist.add(new ItemStack(mod_Orizon.mineralOre, 1, 8));
        arraylist.add(new ItemStack(mod_Orizon.mineralOre, 1, 9));
        arraylist.add(new ItemStack(mod_Orizon.mineralOre, 1, 10));
        arraylist.add(new ItemStack(mod_Orizon.mineralOre, 1, 11));
        arraylist.add(new ItemStack(mod_Orizon.mineralOre, 1, 12));
        arraylist.add(new ItemStack(mod_Orizon.mineralOre, 1, 13));
    }
}
