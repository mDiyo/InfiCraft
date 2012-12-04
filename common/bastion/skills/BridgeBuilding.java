package bastion.skills;

import net.minecraft.src.Block;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemStack;
import net.minecraft.src.MathHelper;
import net.minecraft.src.World;
import skillapi.PlayerSkills;
import skillapi.Skill;

public class BridgeBuilding extends Skill
{
	public String getName()
	{
		return "Bridge Building";
	}

	public String getType()
	{
		return "Building";
	}

	public String getDescription()
	{
		return "Create a rope bridge to cross\nlarge gaps.";
	}

	public String getTexturePath()
	{
		return "/bastion/textures/bridgebuilding.png";
	}

	public int getManaCost()
	{
		return 0;
	}

	public float getChargeupTime()
	{
		return 1.0F;
	}

	public float getCooldownTime()
	{
		return 0.0F;
	}

	public float getDuration()
	{
		return 0.0F;
	}

	public boolean canPlayerLearnSkill(PlayerSkills playerskills)
	{
		return true;
	}

	public boolean canPlayerUseSkill(PlayerSkills playerskills)
	{
		return true;
	}

	public boolean onSkillActivate(PlayerSkills playerskills)
	{
		EntityPlayer player = playerskills.getPlayer();
		int direction = MathHelper.floor_double(player.rotationYaw * 4.0F / 360.0F + 0.5D) & 0x3;
		boolean canBuild = true;
		while (canBuild)
		{
			for (int iter = -1; iter <= 1; iter++)
			{
				int offsetX = 0;
				int offsetZ = 0;
				if (direction % 2 == 0)
				{
					offsetX = iter;

					if (direction >= 2)
						offsetZ = -2;
					else
						offsetZ = 2;
				}
				if (direction % 2 == 1)
				{
					offsetZ = iter;

					if (direction >= 2)
						offsetX = 2;
					else
						offsetX = -2;
				}
				ItemStack stack = playerskills.getPlayer().getCurrentEquippedItem();
				if (stack != null && stack.getItem() instanceof ItemBlock)
				{
					if (player.worldObj.setBlockAndMetadataWithNotify((int)(player.posX + offsetX), (int)(player.posY - 2.0D), (int)(player.posZ + offsetZ), stack.itemID, stack.getItemDamage()))
					{
						Block block = Block.blocksList[stack.itemID];
						block.onBlockPlacedBy(player.worldObj, (int)(player.posX + offsetX), (int)(player.posY - 2.0D), (int)(player.posZ + offsetZ), player);
						block.func_85105_g(player.worldObj, (int)(player.posX + offsetX), (int)(player.posY - 2.0D), (int)(player.posZ + offsetZ), 0);
						player.worldObj.playSoundEffect((float)player.posX + offsetX + 0.5F, (float)player.posY - 1.5F, (float)player.posZ + offsetZ + 0.5F, block.stepSound.getStepSound(),
								(block.stepSound.getVolume() + 1.0F) / 2.0F, block.stepSound.getPitch() * 0.8F);
						
						stack.stackSize -= 1;
						if (stack.stackSize < 1)
						{
							player.destroyCurrentEquippedItem();
						}
					}
				}
			}
		}
		return true;
	}

	public void onTickWhileActive(PlayerSkills playerskills)
	{
	}

	public void onSkillDeactivate(PlayerSkills playerskills) {
	}

	public boolean isSkillPassive() {
		return false;
	}
}