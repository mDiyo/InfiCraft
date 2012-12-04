package bastion.skills;

import net.minecraft.src.EntityPlayer;
import skillapi.PlayerSkills;
import skillapi.Skill;

public class Levitation extends Skill
{
	public String getName()
	{
		return "Levitation";
	}

	public String getType()
	{
		return "Movement";
	}

	public String getDescription()
	{
		return "Carefully flapping your wings\n allows you to levitate.";
	}

	public String getTexturePath()
	{
		return "/bastion/textures/levitation.png";
	}

	public int getManaCost()
	{
		return 1;
	}

	public float getChargeupTime()
	{
		return 0.0F;
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
		return true;
	}

	public void onTickWhileActive(PlayerSkills playerskills)
	{
		EntityPlayer player = playerskills.getPlayer();
		if ((!player.onGround) && (player.motionY < 0.0D))
		{
			player.motionY *= Math.cos(player.ticksExisted / 20) * 0.5D;
			player.fallDistance = 0.0F;
		}
	}

	public void onSkillDeactivate(PlayerSkills playerskills)
	{
	}

	public boolean isSkillPassive() {
		return true;
	}

	public int getManaDrain()
	{
		return 1;
	}

	public boolean shouldDrainMana(PlayerSkills playerskills)
	{
		return !playerskills.getPlayer().onGround;
	}
}