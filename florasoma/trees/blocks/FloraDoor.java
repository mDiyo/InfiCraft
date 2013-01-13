package florasoma.trees.blocks;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import florasoma.trees.FloraTrees;
import florasoma.trees.PHTrees;

public class FloraDoor extends BlockDoor
{
    private int meta;
	
	public FloraDoor(int id, int tex, Material material, int md)
    {
        super(id, material);
        blockIndexInTexture = tex;
        float f = 0.5F;
        float f1 = 1.0F;
        setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f1, 0.5F + f);
        meta = md;
        this.setHardness(3F);
        this.setStepSound(Block.soundWoodFootstep);
        this.setBlockName("redwoodDoor");
        this.disableStats();
        this.setRequiresSelfNotify();
    }

    public int idDropped(int i, Random random, int j)
    {
    	return PHTrees.doorItemID;
    }
    
    public int damageDropped(int par1)
    {
        return meta;
    }
    
    public String getTextureFile()
    {
        return FloraTrees.texture;
    }
    
    public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z)
    {
    	return new ItemStack(FloraTrees.doorItem, 1, meta);
    }
}
