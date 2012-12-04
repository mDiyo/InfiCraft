package skillapi;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;
import net.minecraft.client.Minecraft;
import net.minecraft.src.ModLoader;

public abstract class Skill
{
	protected Minecraft theGame;
	public static HashMap<String, Skill> skillMap = new HashMap();
	public Timer cooldownTimer;
	public Timer durationTimer;
	public int cooldownFrame;
	public int timeLeft;

	public Skill()
	{
		this.theGame = ModLoader.getMinecraftInstance();

		this.cooldownFrame = 8;
	}

	public abstract String getName();

	public abstract String getType();

	public abstract String getDescription();

	public abstract String getTexturePath();

	public int getManaCost()
	{
		return 0;
	}

	public float getChargeupTime() {
		return 0.0F;
	}

	public float getCooldownTime() {
		return 0.0F;
	}

	public float getDuration() {
		return 0.0F;
	}

	public int getNameColour() {
		return 16777215; } 
	public abstract boolean canPlayerLearnSkill(PlayerSkills paramPlayerSkills);

	public abstract boolean canPlayerUseSkill(PlayerSkills paramPlayerSkills);

	public abstract boolean onSkillActivate(PlayerSkills paramPlayerSkills);

	public abstract void onTickWhileActive(PlayerSkills paramPlayerSkills);

	public abstract void onSkillDeactivate(PlayerSkills paramPlayerSkills);

	public abstract boolean isSkillPassive();

	public int getManaDrain() { return 0; }

	public boolean shouldDrainMana(PlayerSkills playerskills)
	{
		return false;
	}

	public boolean triggerSkill(PlayerSkills playerskills)
	{
		if ((getManaCost() > playerskills.mana) || (this.cooldownFrame < 8) || (!canPlayerUseSkill(playerskills)))
		{
			playerskills.getPlayer().worldObj.playSoundAtEntity(playerskills.getPlayer(), "note.bass", 1.0F, 0.0F);
			return false;
		}
		if (isSkillPassive())
		{
			if (playerskills.passiveSkills.contains(this))
			{
				playerskills.passiveSkills.remove(this);
			}
			else
			{
				playerskills.passiveSkills.add(this);
				mod_SkillsAPI.getSkillsAPIInstance().playerskills.expendMana(getManaCost());
				onTickWhileActive(playerskills);
			}
			return true;
		}
		if ((getChargeupTime() <= 0.0F) && (getCooldownTime() <= 0.0F))
		{
			mod_SkillsAPI.getSkillsAPIInstance().playerskills.expendMana(getManaCost());
			onTickWhileActive(playerskills);
			return true;
		}
		if (getChargeupTime() <= 0.0F)
		{
			if (onSkillActivate(playerskills))
			{
				mod_SkillsAPI.getSkillsAPIInstance().playerskills.expendMana(getManaCost());
				if (getDuration() > 0.0F)
				{
					if (playerskills.activeSkills.contains(this))
					{
						this.timeLeft = ((int)getDuration());
					}
					else
					{
						playerskills.activeSkills.add(this);
						scheduleEnd(playerskills);
					}
				}
				startCooldown();
				return true;
			}
			playerskills.getPlayer().worldObj.playSoundAtEntity(playerskills.getPlayer(), "note.bass", 1.0F, 0.0F);
			return false;
		}
		return mod_SkillsAPI.getSkillsAPIInstance().playerskills.chargeSkill(this);
	}

	public void scheduleEnd(PlayerSkills playerskills)
	{
		this.durationTimer = new Timer();
		this.durationTimer.scheduleAtFixedRate(new SkillDeactivate(playerskills), 0L, 1000L);
	}

	public void startCooldown()
	{
		this.cooldownTimer = new Timer();
		this.cooldownTimer.scheduleAtFixedRate(new SkillCooldown(), 0L, (long)(getCooldownTime() / 8.0F * 1000.0F));
	}

	public void endSkillIfActive(PlayerSkills playerskills)
	{
		this.durationTimer.cancel();
		playerskills.activeSkills.remove(this);
		onSkillDeactivate(playerskills);
	}

	class SkillCooldown extends TimerTask {
		private int coolFrame = 0;

		SkillCooldown() {	} 
		public void run() { Skill.this.cooldownFrame = this.coolFrame;
			if (!Skill.this.theGame.isGamePaused)
				this.coolFrame += 1;
			if (this.coolFrame > 8)
				Skill.this.cooldownTimer.cancel();
		}
	}

	class SkillDeactivate extends TimerTask
	{
		PlayerSkills skills;

		public SkillDeactivate(PlayerSkills playerskills)
		{
			Skill.this.timeLeft = ((int)Skill.this.getDuration() + 1);
			this.skills = playerskills;
		}

		public void run()
		{
			if (!Skill.this.theGame.isGamePaused)
				Skill.this.timeLeft -= 1;
			if ((Skill.this.timeLeft < 1) || (this.skills.getPlayer().isDead))
				Skill.this.endSkillIfActive(this.skills);
		}
	}
}