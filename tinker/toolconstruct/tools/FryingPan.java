package tinker.toolconstruct.tools;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import tinker.toolconstruct.AbilityHelper;
import tinker.toolconstruct.ToolItems;
import tinker.toolconstruct.blocks.HeldItemLogic;

public class FryingPan extends Weapon
{
	public FryingPan(int itemID, String tex)
	{
		super(itemID, 2, tex);
		this.setItemName("InfiTool.FryingPan");
	}
	
	@Override
	public boolean hitEntity(ItemStack stack, EntityLiving mob, EntityLiving player)
	{
		AbilityHelper.hitEntity(stack, mob, player, damageVsEntity);
		AbilityHelper.knockbackEntity(mob, 2.5f);
		mob.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 100, 0)); //5 seconds of stun
		//Play "thunk" sfx
		return true;
	}
	
	public String getToolName()
	{
		return "Frying Pan";
	}
	
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float clickX, float clickY, float clickZ)
    {
        if (side == 0 || !player.isSneaking())
        {
            return false;
        }
        else if (!world.getBlockMaterial(x, y, z).isSolid())
        {
            return false;
        }
        else
        {
            if (side == 1)
            {
                ++y;
            }

            if (side == 2)
            {
                --z;
            }

            if (side == 3)
            {
                ++z;
            }

            if (side == 4)
            {
                --x;
            }

            if (side == 5)
            {
                ++x;
            }

            if (!player.canPlayerEdit(x, y, z, side, stack))
            {
                return false;
            }
            else if (!ToolItems.heldItemBlock.canPlaceBlockAt(world, x, y, z))
            {
                return false;
            }
            else
            {
                world.setBlockAndMetadataWithNotify(x, y, z, ToolItems.heldItemBlock.blockID, 0);

                HeldItemLogic logic = (HeldItemLogic) world.getBlockTileEntity(x, y, z);
    			logic.setEquipmentItem(stack);
                //--par1ItemStack.stackSize;

                return true;
            }
        }
    }
}
