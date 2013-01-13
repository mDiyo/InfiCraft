package florasoma.trees.blocks;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import florasoma.common.FloraSomaTab;
import florasoma.trees.FloraTrees;

public class FloraDoorItem extends Item
{
    public FloraDoorItem(int id)
    {
        super(id);
        maxStackSize = 64;
        setCreativeTab(FloraSomaTab.tab);
    }
    
    public static final String blockType[] = {
    	"redwood", "eucalyptus", "hopseed", "sakura", "ghost", "blood", "redwoodBark"
    };
    
    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("FloraDoor").toString();
    }

    @Override
    public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int side, float clickX, float clickY, float clickZ)
    {
        if (side != 1)
        {
            return false;
        }
        y++;

        Block block;
        switch (itemstack.getItemDamage())
        {
        case 0: block = FloraTrees.redwoodDoor; break;
        case 1: block = FloraTrees.eucalyptusDoor; break;
        case 2: block = FloraTrees.hopseedDoor; break;
        case 3: block = FloraTrees.sakuraDoor; break;
        case 4: block = FloraTrees.ghostDoor; break;
        case 5: block = FloraTrees.bloodDoor; break;
        case 6: block = FloraTrees.redwoodBarkDoor; break;
        default: block = Block.doorWood; break;
        }
        System.out.println(itemstack.getItemDamage());
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
            int rotate = MathHelper.floor_double((double)(((player.rotationYaw + 180F) * 4F) / 360F) - 0.5D) & 3;
            placeDoorBlock(world, x, y, z, rotate, block);
            itemstack.stackSize--;
            return true;
        }
    }

    public static void placeDoorBlock(World world, int x, int y, int z, int rotate, Block block)
    {
        byte var6 = 0;
        byte var7 = 0;

        if (rotate == 0)
        {
            var7 = 1;
        }

        if (rotate == 1)
        {
            var6 = -1;
        }

        if (rotate == 2)
        {
            var7 = -1;
        }

        if (rotate == 3)
        {
            var6 = 1;
        }

        int var8 = (world.isBlockNormalCube(x - var6, y, z - var7) ? 1 : 0) + (world.isBlockNormalCube(x - var6, y + 1, z - var7) ? 1 : 0);
        int var9 = (world.isBlockNormalCube(x + var6, y, z + var7) ? 1 : 0) + (world.isBlockNormalCube(x + var6, y + 1, z + var7) ? 1 : 0);
        boolean var10 = world.getBlockId(x - var6, y, z - var7) == block.blockID || world.getBlockId(x - var6, y + 1, z - var7) == block.blockID;
        boolean var11 = world.getBlockId(x + var6, y, z + var7) == block.blockID || world.getBlockId(x + var6, y + 1, z + var7) == block.blockID;
        boolean var12 = false;

        if (var10 && !var11)
        {
            var12 = true;
        }
        else if (var9 > var8)
        {
            var12 = true;
        }

        world.editingBlocks = true;
        world.setBlockAndMetadataWithNotify(x, y, z, block.blockID, rotate);
        world.setBlockAndMetadataWithNotify(x, y + 1, z, block.blockID, 8 | (var12 ? 1 : 0));
        world.editingBlocks = false;
        world.notifyBlocksOfNeighborChange(x, y, z, block.blockID);
        world.notifyBlocksOfNeighborChange(x, y + 1, z, block.blockID);
    }
    
    @SideOnly(Side.CLIENT)
	public int getIconFromDamage(int meta)
	{
		return this.iconIndex + meta;
	}
    
    public String getTextureFile()
    {
        return FloraTrees.texture;
    }
    
    public void getSubItems (int id, CreativeTabs tab, List list)
	{
		for (int i = 0; i < blockType.length; i++)
			list.add(new ItemStack(id, 1, i));
	}
}
