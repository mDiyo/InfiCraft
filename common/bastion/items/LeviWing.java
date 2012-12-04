package bastion.items;

import java.util.ArrayList;

import skillapi.mod_SkillsAPI;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.src.World;

public class LeviWing extends Item
{
	private ArrayList<String> skills = new ArrayList();

	public LeviWing(int i) {
		super(i);
		this.maxStackSize = 1;
		setItemName("leviwing");
		ModLoader.addName(this, "Levi-Wing");
		addSkill("Levitation");
		addSkill("Wall Building");
	}

	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
	{
		int learnt = 0;
		for (String skillName : this.skills) {
			learnt += (mod_SkillsAPI.getSkillsAPIInstance().learnSkill(skillName) ? 1 : 0);
		}

		return itemstack;
	}

	public LeviWing addSkill(String skillName) {
		this.skills.add(skillName);
		return this;
	}

	public String getTextureFile()
	{
		return "/bastion/textures/items.png";
	}
}