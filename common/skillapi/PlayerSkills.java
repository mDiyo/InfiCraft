package skillapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;
import net.minecraft.client.Minecraft;
import net.minecraft.src.DamageSource;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.ModLoader;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.Session;
import net.minecraft.src.World;

//public class PlayerSkills extends PlayerBase
public class PlayerSkills
{
	EntityPlayer player;
	private Minecraft game = ModLoader.getMinecraftInstance();
	public ArrayList<Skill> knownSkills = new ArrayList();
	public LinkedList<Skill> activeSkills = new LinkedList();
	public LinkedList<Skill> passiveSkills = new LinkedList();
	private HudSkills skillsHUD = new HudSkills(this.game);
	public Skill[] skillBar = new Skill[12];
	private Timer chargeupTimer;
	public Skill skillJustLearnt;
	public Skill chargingSkill;
	public int chargeupFrame = 0;
	public int mana;
	public int prevMana;
	public int maxMana;

	/*public PlayerSkills(PlayerAPI playerapi)
	{
		super(playerapi);
		mod_SkillsAPI.getSkillsAPIInstance().playerskills = this;
	}*/

	public void afterLocalConstructing(Minecraft minecraft, World world, Session session, int i)
	{
		mod_SkillsAPI skillsAPI = mod_SkillsAPI.getSkillsAPIInstance();
		this.mana = (this.prevMana = 20);
		if (skillsAPI.currentWorld == world) {
			this.knownSkills = skillsAPI.knownSkillsBackup;
			this.skillBar = skillsAPI.skillBarBackup;
		} else {
			skillsAPI.currentWorld = world;
		}
	}

	public void beforeOnLivingUpdate()
	{
		this.prevMana = this.mana;
		if ((this.mana < 20) && (this.player.ticksExisted % 100 == 0))
			switch (this.player.worldObj.difficultySetting) {
			case 0:
				restoreMana(1);
			case 1:
				restoreMana(1);
			case 2:
				restoreMana(1);
			}
		for (Skill skill : this.activeSkills)
		{
			skill.onTickWhileActive(this);
		}
		for (Skill skill : this.passiveSkills)
		{
			skill.onTickWhileActive(this);
			if (this.player.ticksExisted % 20 == 0)
			{
				if (skill.shouldDrainMana(this))
				{
					expendPassiveMana(skill);
				}
			}
		}
	}

	public void renderHUD(int scaledWidth, int scaledHeight, float partialTicks) {
		this.skillsHUD.drawHUD(this, scaledWidth, scaledHeight, partialTicks);
		this.game.renderEngine.bindTexture(this.game.renderEngine.getTexture("/gui/icons.png"));
	}

	public boolean expendMana(int amount)
	{
		this.mana -= amount;
		if (this.mana - amount < 0)
		{
			return false;
		}

		return true;
	}

	public void expendPassiveMana(Skill skill)
	{
		if (this.mana < skill.getManaDrain())
		{
			this.player.worldObj.playSoundAtEntity(this.player, "note.bass", 1.0F, 0.0F);
			this.passiveSkills.remove(skill);
		}
		else
		{
			expendMana(skill.getManaDrain());
		}
	}

	public void restoreMana(int amount) {
		//if (this.player.getHealthField() <= 0)
			//return;
		this.mana += amount;
		if (this.mana > 20)
			this.mana = 20;
	}

	public void beforeRespawnPlayer()
	{
		this.mana = 20;
	}

	public int getMaxMana()
	{
		return 20;
	}

	public void afterSleepInBedAt(int x, int y, int z) {
		cancelCharge();
		for (Skill skill : this.activeSkills) {
			skill.durationTimer.cancel();
			skill.timeLeft = 0;
		}
		this.activeSkills.clear();
		for (Skill skill : this.skillBar)
			if ((skill != null) && (skill.cooldownFrame < 8)) {
				skill.cooldownTimer.cancel();
				skill.cooldownFrame = 8;
			}
	}

	public void afterOnDeath(DamageSource damagesource)
	{
		cancelCharge();
		for (Skill skill : this.activeSkills) {
			skill.durationTimer.cancel();
			skill.timeLeft = 0;
		}
		this.activeSkills.clear();
		for (Skill skill : this.skillBar)
			if ((skill != null) && (skill.cooldownFrame < 8)) {
				skill.cooldownTimer.cancel();
				skill.cooldownFrame = 8;
			}
		mod_SkillsAPI.getSkillsAPIInstance().knownSkillsBackup = this.knownSkills;
		mod_SkillsAPI.getSkillsAPIInstance().skillBarBackup = this.skillBar;
	}

	public void beforeReadEntityFromNBT(NBTTagCompound tagCompound)
	{
		int i = 0;
		String skillName;
		while (true) {
			skillName = tagCompound.getString("KnownSkill" + i++);
			if (skillName.equals(""))
				break;
			Skill savedSkill;
			if ((savedSkill = (Skill)Skill.skillMap.get(skillName.toLowerCase())) != null)
				this.knownSkills.add(savedSkill);
		}
		for (int j = 0; j < this.skillBar.length; j++)
			if (!(skillName = tagCompound.getString("SkillBarSlot" + j)).equals(""))
				this.skillBar[j] = ((Skill)Skill.skillMap.get(skillName.toLowerCase()));
		mod_SkillsAPI.getSkillsAPIInstance().updateKeyBindingTypes();
	}

	public void beforeWriteEntityToNBT(NBTTagCompound tagCompound)
	{
		for (int i = 0; i < this.knownSkills.size(); i++)
			tagCompound.setString("KnownSkill" + i, ((Skill)this.knownSkills.get(i)).getName());
		for (int i = 0; i < this.skillBar.length; i++)
			if (this.skillBar[i] != null)
				tagCompound.setString("SkillBarSlot" + i, this.skillBar[i].getName());
	}

	public void skillGet(Skill skill) {
		this.game.theWorld.playSoundAtEntity(this.game.thePlayer, "note.snare", 0.2F, 1.0F);
		this.skillsHUD.skillGetTimer = 50;
		this.skillJustLearnt = skill;
	}

	public boolean chargeSkill(Skill skill) {
		if (this.chargingSkill != null) {
			cancelCharge();
			this.player.worldObj.playSoundAtEntity(this.player, "note.bass", 1.0F, 0.0F);
			return false;
		}
		this.chargingSkill = skill;
		this.chargeupTimer = new Timer();
		//this.chargeupTimer.scheduleAtFixedRate(new SkillChargeup(this, skill), 0L, ()(skill.getChargeupTime() * 10.0F));
		return true;
	}

	public void cancelCharge() {
		if (this.chargingSkill != null) {
			this.chargeupTimer.cancel();
			this.chargingSkill = null;
			this.chargeupFrame = 0;
		}
	}

	public EntityPlayer getPlayer()
	{
		return this.player;
	}

	class SkillChargeup extends TimerTask
	{
		private int chargeFrame = 0;
		private PlayerSkills playerskills;
		private Skill skill;

		public SkillChargeup(PlayerSkills playerskills, Skill skill)
		{
			this.skill = skill;
			this.playerskills = playerskills;
		}

		public void run() {
			PlayerSkills.this.chargeupFrame = this.chargeFrame;
			if (!PlayerSkills.this.game.isGamePaused)
				this.chargeFrame += 1;
			if (this.chargeFrame > 100) {
				PlayerSkills.this.cancelCharge();
				if (this.skill.onSkillActivate(this.playerskills)) {
					mod_SkillsAPI.getSkillsAPIInstance().playerskills.expendMana(this.skill.getManaCost());
					if (this.skill.getDuration() > 0.0F) {
						if (PlayerSkills.this.activeSkills.contains(this)) {
							this.skill.timeLeft = ((int)this.skill.getDuration());
						} else {
							PlayerSkills.this.activeSkills.add(this.skill);
							this.skill.scheduleEnd(this.playerskills);
						}
					}
					this.skill.startCooldown();
				} else {
					PlayerSkills.this.player.worldObj.playSoundAtEntity(PlayerSkills.this.player, "note.bass", 1.0F, 0.0F);
				}
			}
		}
	}
}