package mDiyo.inficraft.armory;

import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityZombie;
import net.minecraft.src.World;

public class ArmorStandEntity extends EntityEquipment
{
	public ArmorStandEntity(World world) 
	{
		super(world);
		this.texture = "/infitextures/icedover.png";
		System.out.println("I'm alive!");
	}	
}
