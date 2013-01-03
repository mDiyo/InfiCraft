package inficraft.toolconstruct;

import java.util.Random;

import cpw.mods.fml.client.FMLClientHandler;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.world.World;

public class AbilityHelper
{
	static Minecraft mc;

	/* Blocks */
	public static boolean onBlockDestroyed (ItemStack stack, World world, int bID, int x, int y, int z, EntityLiving player, Random random)
	{
		if (!stack.hasTagCompound())
			return false;

		int durability = 0;
		NBTTagCompound tags = stack.getTagCompound();

		if (tags.getCompoundTag("InfiTool").hasKey("Durability"))
			durability = tags.getCompoundTag("InfiTool").getInteger("Durability");

		if (random.nextInt(10) < 10 - durability)
		{
			damageTool(stack, 1, tags, player);
		}

		return true;
	}

	/* Tool specific */
	public static void damageTool (ItemStack stack, int dam, Entity entity)
	{
		NBTTagCompound tags = stack.getTagCompound();
		damageTool(stack, dam, tags, entity);
	}

	public static void damageTool (ItemStack stack, int dam, NBTTagCompound tags, Entity entity)
	{
		int damage = tags.getCompoundTag("InfiTool").getInteger("Damage");
		int maxDamage = tags.getCompoundTag("InfiTool").getInteger("MaxDamage");

		//System.out.println("Damage: "+damage);

		if ((damage + dam) > maxDamage)
			breakTool(stack, tags, entity);

		else
			tags.getCompoundTag("InfiTool").setInteger("Damage", damage + dam);
	}

	public static void breakTool (ItemStack stack, NBTTagCompound tags, Entity player)
	{
		if (!tags.getCompoundTag("InfiTool").getBoolean("Broken"))
		{
			tags.getCompoundTag("InfiTool").setBoolean("Broken", true);
			player.worldObj.playSound(player.posX, player.posY, player.posZ, "random.break", 1f, 1f, true);
		}
	}

	public static void repairTool (ItemStack stack, NBTTagCompound tags)
	{
		tags.getCompoundTag("InfiTool").setBoolean("Broken", false);
		tags.getCompoundTag("InfiTool").setInteger("Damage", 0);
	}

	/* Entities */

	public static void hitEntity (ItemStack stack, EntityLiving mob, EntityLiving player, int baseDamage)
	{
		hitEntity (stack, mob, player, baseDamage, 1f);
	}

	public static void hitEntity (ItemStack stack, EntityLiving mob, EntityLiving player, int baseDamage, float bonusDamage)
	{
		NBTTagCompound tags = stack.getTagCompound();
		if (!tags.getCompoundTag("InfiTool").getBoolean("Broken"))
		{
			int durability = tags.getCompoundTag("InfiTool").getInteger("Damage");

			float shoddy = tags.getCompoundTag("InfiTool").getFloat("Shoddy");
			float damageModifier = -shoddy * durability / 100f;

			int attack = (int) ((baseDamage + tags.getCompoundTag("InfiTool").getInteger("Attack") + damageModifier) * bonusDamage);
			System.out.println("Attack: " + attack);

			if (player instanceof EntityPlayer)
				mob.attackEntityFrom(DamageSource.causePlayerDamage((EntityPlayer) player), attack);
			else
				mob.attackEntityFrom(DamageSource.causeMobDamage(player), attack);
		}
		damageTool(stack, 1, tags, player);
	}

	public static DamageSource causePiercingDamage (EntityLiving mob)
	{
		return new PiercingEntityDamage("mob", mob);
	}

	public static DamageSource causePlayerPiercingDamage (EntityPlayer player)
	{
		return new PiercingEntityDamage("player", player);
	}

	public static void thrust (ItemStack stack, World world, EntityPlayer player)
	{
		if (mc == null)
			mc = FMLClientHandler.instance().getClient();

		if (mc.objectMouseOver != null && mc.objectMouseOver.typeOfHit == EnumMovingObjectType.ENTITY)
		{
			mc.playerController.attackEntity(player, mc.objectMouseOver.entityHit);
			mc.playerController.attackEntity(player, mc.objectMouseOver.entityHit);
			mc.playerController.attackEntity(player, mc.objectMouseOver.entityHit);
		}
	}

	public static void knockbackEntity (EntityLiving living, double boost)
	{
		living.motionX *= boost;
		living.motionY *= boost/2;
		living.motionZ *= boost;
	}
}
