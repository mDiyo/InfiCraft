package mDiyo.inficraft.flora.trees.blocks;
import mDiyo.inficraft.flora.trees.FloraTrees;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.MathHelper;
import net.minecraft.src.World;

public class FloraDoorItem extends Item
{
    private int door;

    public FloraDoorItem(int i, int bID)
    {
        super(i);
        //door = Block.blocksList[bID];
        
        door = bID;
        //maxStackSize = 1;
        setCreativeTab(CreativeTabs.tabRedstone);
    }

    public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int side)
    {
        if (side != 1)
        {
            return false;
        }
        y++;

        Block block;
        if(door == FloraTrees.redwoodDoor.blockID) {
        	block = FloraTrees.redwoodDoor;
        } else {
        	block = Block.doorWood;
        }
        if (!player.canPlayerEdit(x, y, z, side, itemstack) || !player.canPlayerEdit(x, y + 1, z, side, itemstack))
        {
            return false;
        }
        if (!block.canPlaceBlockAt(world, x, y, z))
        {
            return false;
        }
        else
        {
            int i1 = MathHelper.floor_double((double)(((player.rotationYaw + 180F) * 4F) / 360F) - 0.5D) & 3;
            placeDoorBlock(world, x, y, z, i1, block);
            itemstack.stackSize--;
            return true;
        }
    }

    public static void placeDoorBlock(World world, int i, int j, int k, int l, Block block)
    {
        byte byte0 = 0;
        byte byte1 = 0;
        if (l == 0)
        {
            byte1 = 1;
        }
        if (l == 1)
        {
            byte0 = -1;
        }
        if (l == 2)
        {
            byte1 = -1;
        }
        if (l == 3)
        {
            byte0 = 1;
        }
        int i1 = (world.isBlockNormalCube(i - byte0, j, k - byte1) ? 1 : 0) + (world.isBlockNormalCube(i - byte0, j + 1, k - byte1) ? 1 : 0);
        int j1 = (world.isBlockNormalCube(i + byte0, j, k + byte1) ? 1 : 0) + (world.isBlockNormalCube(i + byte0, j + 1, k + byte1) ? 1 : 0);
        boolean flag = world.getBlockId(i - byte0, j, k - byte1) == block.blockID || world.getBlockId(i - byte0, j + 1, k - byte1) == block.blockID;
        boolean flag1 = world.getBlockId(i + byte0, j, k + byte1) == block.blockID || world.getBlockId(i + byte0, j + 1, k + byte1) == block.blockID;
        boolean flag2 = false;
        if (flag && !flag1)
        {
            flag2 = true;
        }
        else if (j1 > i1)
        {
            flag2 = true;
        }
        if (flag2)
        {
            l = l - 1 & 3;
            l += 4;
        }
        world.editingBlocks = true;
        world.setBlockAndMetadataWithNotify(i, j, k, block.blockID, l);
        world.setBlockAndMetadataWithNotify(i, j + 1, k, block.blockID, l + 8);
        world.editingBlocks = false;
        world.notifyBlocksOfNeighborChange(i, j, k, block.blockID);
        world.notifyBlocksOfNeighborChange(i, j + 1, k, block.blockID);
    }
    
    public String getTextureFile()
    {
        return FloraTrees.texture;
    }
}
