package net.minecraft.src.skilllevels;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class PlayerSkills {
	
	/** Base stats for players */
    
	private String playerName;
	private static int[] skillLevels = new int[256];
	private static int[] skillExperience = new int[256];
	
	public PlayerSkills(String player)
	{
		playerName = player;
		for (int i = 0; i < 256; i++)
		{
			skillLevels[i] = 1;
			skillExperience[i] = 0;
		}
	}
	
	public String getPlayerName()
	{
		return playerName;
	}
	
	public static int getSkillLevel(int i)
	{
		return skillLevels[i];
	}
	
	public static int getSkillExperience(int i)
	{
		return skillExperience[i];
	}
}
