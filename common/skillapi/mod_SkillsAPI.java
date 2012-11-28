package skillapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.src.KeyBinding;
import net.minecraft.src.ModLoader;
import net.minecraft.src.ScaledResolution;
import net.minecraft.src.World;

public final class mod_SkillsAPI
{
	private static mod_SkillsAPI skillsAPIInstance;
	private Minecraft game = ModLoader.getMinecraftInstance();
	public static KeyBinding skillGuiKeyBinding;
	public KeyBinding[] skillKeyBindings = new KeyBinding[12];
	public static HashMap<String, PlayerSkills> players = new HashMap();
	public ArrayList<Skill> knownSkillsBackup = new ArrayList();
	public Skill[] skillBarBackup = new Skill[12];
	public PlayerSkills playerskills;
	public World currentWorld;

	public mod_SkillsAPI()
	{
		//PlayerAPI.register("PlayerSkills", PlayerSkills.class);
	}

	public static boolean registerSkill(Skill skill)
	{
		if (Skill.skillMap.containsKey(skill.getName().toLowerCase()))
			return false;
		Skill.skillMap.put(skill.getName().toLowerCase(), skill);
		return true;
	}

	public boolean learnSkill(String skillName)
	{
		mod_SkillsAPI skillsAPI = getSkillsAPIInstance();
		if (skillsAPI.playerskills != null)
		{
			if (isSkillKnown(skillName))
				return false;
			Skill skill = (Skill)Skill.skillMap.get(skillName.toLowerCase());
			if ((skill != null) && (skill.canPlayerLearnSkill(this.playerskills)))
			{
				skillsAPI.playerskills.knownSkills.add(skill);
				//skillsAPI.playerskills.skillGet(skill);
				return true;
			}
		}
		return false;
	}

	public static boolean isSkillKnown(String skillName)
	{
		if (getSkillsAPIInstance().playerskills != null) {
			skillName = skillName.toLowerCase();
			for (Skill skill : getSkillsAPIInstance().playerskills.knownSkills)
				if (skill.getName().toLowerCase().equals(skillName))
					return true;
		}
		return false;
	}

	public static boolean triggerSkill(String skillName)
	{
		if (getSkillsAPIInstance().playerskills != null)
		{
			skillName = skillName.toLowerCase();
			Skill[] skillBar = getSkillsAPIInstance().playerskills.skillBar;
			for (int i = 0; i < skillBar.length; i++)
			{
				if ((skillBar[i] != null) && (skillBar[i].getName().toLowerCase().equals(skillName)))
				{
					return skillBar[i].triggerSkill(getSkillsAPIInstance().playerskills);
				}
			}
		}
		return false;
	}

	public static boolean isSkillActive(String skillName)
	{
		if (getSkillsAPIInstance().playerskills != null)
		{
			skillName = skillName.toLowerCase();
			for (Skill skill : getSkillsAPIInstance().playerskills.activeSkills)
			{
				if (skill.getName().toLowerCase().equals(skillName))
				{
					return true;
				}
			}
		}
		return false;
	}

	public void load()
	{
		//loadSkillKeyBindings();
		//ModLoader.setInGameHook(this, true, false);
		ModLoader.addLocalization("key.skillGui", "Skill Menu");
		for (int i = 1; i <= 12; i++)
		{
			ModLoader.addLocalization("key.skill" + i, "Skill " + i);
		}
	}

	public void keyboardEvent(KeyBinding keybinding)
	{
		for (int i = 0; i < this.skillKeyBindings.length; i++)
			if ((this.skillKeyBindings[i] == keybinding) && (this.playerskills != null) && (this.playerskills.skillBar[i] != null))
			{
				this.playerskills.skillBar[i].triggerSkill(this.playerskills);
				return;
			}
		if (keybinding == skillGuiKeyBinding)
			if (this.game.currentScreen == null)
				ModLoader.openGUI(this.game.thePlayer, new GuiKnownSkills(this.playerskills));
			else if ((this.game.currentScreen instanceof GuiKnownSkills))
				this.game.thePlayer.closeScreen();
	}

	public boolean onTickInGame(float partialTicks, Minecraft game)
	{
		ScaledResolution var5 = new ScaledResolution(this.game.gameSettings, this.game.displayWidth, this.game.displayHeight);
		int var6 = var5.getScaledWidth();
		int var7 = var5.getScaledHeight();
		//getSkillsAPIInstance().renderHUD(var6, var7, partialTicks);
		return true;
	}

	/*public void renderHUD(int scaledWidth, int scaledHeight, float partialTicks) {
		this.playerskills.renderHUD(scaledWidth, scaledHeight, partialTicks); }*/
	
	public void updateKeyBindingTypes() { if (this.playerskills == null) {
			return;
		}
		for (int i = 0; i < this.playerskills.skillBar.length; i++) {
			Skill skill = this.playerskills.skillBar[i];
			/*if ((skill == null) || (skill.getChargeupTime() > 0.0F) || (skill.getCooldownTime() > 0.0F) || (skill.getDuration() > 0.0F))
				ModLoader.registerKey(this, this.skillKeyBindings[i], false);
			else
				ModLoader.registerKey(this, this.skillKeyBindings[i], true);*/
		} 
	}

	public static mod_SkillsAPI getSkillsAPIInstance()
	{
		if (skillsAPIInstance == null) {
			Object api = null;
			Iterator itr = ModLoader.getLoadedMods().iterator();
			while (itr.hasNext())
			{
				api = itr.next();
				if ((api instanceof mod_SkillsAPI)) {
					return mod_SkillsAPI.skillsAPIInstance = (mod_SkillsAPI)api;
				}
			}
		}
		return skillsAPIInstance;
	}

	public String getVersion()
	{
		return "1.3.2 for MC 1.2.5";
	}

	public String getPriorities()
	{
		return "before:*";
	}
}

/* Location:					 C:\Users\mDiyo\modding\mcp62skill\bin\minecraft\
 * Qualified Name:		 net.minecraft.src.mod_SkillsAPI
 * JD-Core Version:		0.6.2
 */