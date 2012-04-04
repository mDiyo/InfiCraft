package net.minecraft.src.skilllevels;

public class SkillType 
{
	private String skillName;
	private int skillID;
	
	public SkillType(String skill, int id)
	{
		skillName = skill;
		skillID = id;
	}
	
	public String getSkillName()
	{
		return skillName;
	}
	
	public int getSkillID()
	{
		return skillID;
	}
}
