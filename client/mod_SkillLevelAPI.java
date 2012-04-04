package net.minecraft.src;
import java.util.*;

import net.minecraft.client.Minecraft;
import net.minecraft.src.skilllevels.*;
import net.minecraft.src.forge.*;

public class mod_SkillLevelAPI extends NetworkMod
{	
	private static HashMap<String, PlayerSkills> players = new HashMap<String, PlayerSkills>();
	private static LinkedList<SkillType> skills = new LinkedList<SkillType>();
	
	public KeyBinding keyBindOpenStats = new KeyBinding("key.stats", 25);
	
	mod_SkillLevelAPI() 
	{
		ModLoader.registerKey(this, keyBindOpenStats, false);
		ModLoader.addLocalization("key.stats", "Skills");
		ModLoader.registerEntityID(net.minecraft.src.skilllevels.EntityXPOrbSkill.class, "xpOrbSkill", 1);
		MinecraftForge.registerEntity(net.minecraft.src.skilllevels.EntityXPOrbSkill.class,
				this, 1, 20, 3, true);
	}

	@Override
	public String getVersion() {
		return "1.0";
	}
	
	public static boolean registerPlayer(String username)
	{
		return registerPlayer(username, new PlayerSkills(username));
	}
	
	public static boolean registerPlayer(String username, PlayerSkills stats)
    {
        if (players.containsValue(username))
        {
        	System.out.println("Player already registered!");
            return false;
        }
        players.put(username, stats);
        return true;
    }
	
	public static boolean registerSkill(SkillType skilltype)
    {
		if (skilltype.getSkillID() < 0 || skilltype.getSkillID() > 256)
        {
        	System.out.println("Skills IDs must be within 0-255");
        	return false;
        }
		for (SkillType skill : skills)
        {
            if (skill.getSkillID() == skilltype.getSkillID())
            {
            	System.out.println(skilltype.getSkillName() + " skill ID already taken!");
                return false;
            }
            if (skill.getSkillName() == skilltype.getSkillName())
            {
            	System.out.println(skilltype.getSkillName() + " skill name already taken!");
                return false;
            }
        }
		
        skills.add(skilltype);
        return true;
    }
	
	public static PlayerSkills getPlayerStats(String username)
	{
		PlayerSkills stats = (PlayerSkills)players.get(username);
		if (stats != null)
			return stats;
		return null;
	}
	
	public static int getSkillLevelByName(String username, String skillname)
	{
		int id = 0;
		for (SkillType skill : skills)
        {
            if (skill.getSkillName().equals(skillname))
            {
            	id = skill.getSkillID();
            }
        }
		
		return getSkillLevelByID(username, id);
	}
	
	public static int getSkillLevelByID(String username, int id)
	{
		for (List key : (Set<List>)players)
        {
            if (key.get(0).equals(username)) 
            {
                return ( (PlayerSkills) key.get(0)).getSkillLevel(id);
            }
        }
		
		return 0;
	}
	
	public static int getSkillExperienceByName(String username, String skillname)
	{
		int id = 0;
		for (SkillType skill : skills)
        {
            if (skill.getSkillName().equals(skillname))
            {
            	id = skill.getSkillID();
            }
        }
		
		return getSkillLevelByID(username, id);
	}
	
	public static int getSkillExperienceByID(String username, int id)
	{
		for (List key : (Set<List>)players)
        {
            if (key.get(0).equals(username)) 
            {
                return ( (PlayerSkills) key.get(0)).getSkillExperience(id);
            }
        }
		
		return 0;
	}
	
	public static int getSkillType(String s)
    {
    	if(s.equals("Crafting"))
    		return 0;
    	else if(s.equals("Mining"))
    		return 1;
    	else if(s.equals("Gathering"))
    		return 2;
    	if(s.equals("Fighting"))
    		return 3;
    	else if(s.equals("Archery"))
    		return 4;
    	else if(s.equals("Stealth"))
    		return 5;
    	else if(s.equals("Fortifying"))
    		return 6;
    	else if(s.equals("Sieging"))
    		return 7;
    	else if(s.equals("Archery"))
    		return 8;
    	else if(s.equals("Beastial Knowledge"))
    		return 9;
    	else if(s.equals("Merchantile"))
    		return 10;
    	else if(s.equals("Alchemy"))
    		return 11;
    	else if(s.equals("Magic"))
    		return 12;
    	
    	System.out.println("Invalid skill name!");
    	return 0;
    }
	
	@Override
	public void keyboardEvent(KeyBinding var1) 
	{
		if (var1 == keyBindOpenStats)
		{
			EntityPlayer player = ModLoader.getMinecraftInstance().thePlayer;
			player.openGui(this, 1, player.worldObj, (int)player.posX, (int)player.posY, (int)player.posZ);
		}
	}
	
	public void addRenderer(Map map)
	{
		map.put(net.minecraft.src.skilllevels.EntityXPOrbSkill.class, new RenderXPOrbSkill());
	}

	@Override
	public boolean clientSideRequired() {
		return false;
	}

	@Override
	public boolean serverSideRequired() {
		return false;
	}
	
	public void load() {}
}
