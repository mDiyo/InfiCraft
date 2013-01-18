package tinker.toolconstruct.tools;

import tinker.toolconstruct.AbilityHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class Rapier extends Weapon
{
	public Rapier(int itemID, String tex)
	{
		super(itemID, 2, tex);
		this.setItemName("InfiTool.FencingSword");
	}
	
	public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.none;
    }
	
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
    {
        return stack;
    }
	
	@Override
	public boolean hitEntity(ItemStack stack, EntityLiving mob, EntityLiving player)
	{
		AbilityHelper.hitEntity(stack, mob, player, damageVsEntity);
		AbilityHelper.knockbackEntity(mob, 0.5f);
		if (mob.hurtResistantTime > 10)
			mob.hurtResistantTime -= 10;
		return true;
	}
	
	public float getDurabilityModifier ()
	{
		return 0.7f;
	}
}
