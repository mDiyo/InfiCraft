package inficraft.simplebackground;

import java.util.EnumSet;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class TickHandler implements ITickHandler
{
	Minecraft mc;
	EntityPlayer player;
	int count;

	long time;
	boolean underground;
	int dimension;

	@Override
	public void tickStart (EnumSet<TickType> type, Object... tickData)
	{
		count++;
		if (count > 20)
			decideMusic();
	}

	@Override
	public void tickEnd (EnumSet<TickType> type, Object... tickData)
	{

	}

	@Override
	public EnumSet<TickType> ticks ()
	{
		return EnumSet.of(TickType.CLIENT);
	}

	@Override
	public String getLabel ()
	{
		return null;
	}

	void decideMusic ()
	{
		if (mc == null)
			mc = FMLClientHandler.instance().getClient();

		player = mc.thePlayer;

		if (player != null)
		{
			dimension = mc.thePlayer.dimension;
			if (dimension == -1) //Nether
				SimpleBGM.instance.playBackgroundMusic("bgm.nether");

			else if (dimension == 0 || dimension == 7)
			{
				if (!checkUnderground())
				{
					if (dimension == 7) //Twilight Forest
						SimpleBGM.instance.playBackgroundMusic("bgm.twilightforest");
					else
					//Overworld
					{
						time = mc.theWorld.getWorldTime() % 24000;

						if (time > 500 && time < 11500)
							SimpleBGM.instance.playBackgroundMusic("bgm.day"); //Day
						else if (time > 11500 && time < 12500)
							SimpleBGM.instance.playBackgroundMusic("bgm.dusk"); //Dusk
						else if (time > 12500 && time < 23500)
							SimpleBGM.instance.playBackgroundMusic("bgm.night"); //Night
						else
							SimpleBGM.instance.playBackgroundMusic("bgm.dawn"); //Dawn
					}
				}
			}
		}
	}

	boolean checkUnderground ()
	{
		boolean stonebound = checkBlockUnderneath(player.worldObj, (int) player.posX, (int) player.posY, (int) player.posZ);
		if (player.posY < 60 && !player.worldObj.canBlockSeeTheSky((int) player.posX, (int) player.posY, (int) player.posZ) && stonebound)
		{
			SimpleBGM.instance.playBackgroundMusic("bgm.underground");
			return true;
		}
		return false;
	}

	boolean checkBlockUnderneath (World world, int x, int y, int z)
	{
		for (int yPos = y - 1; yPos > yPos - 6 && yPos > 0; yPos--)
		{
			int bID = world.getBlockId(x, yPos, z);
			if (bID != 0)
			{
				if (isValidMaterial(bID))
				{
					if (isValidMaterial(world.getBlockId(x, yPos - 1, z)))
					{
						return true;
					}
				}
				else
					return false;
			}
		}
		return false;
	}

	boolean isValidMaterial (int blockID)
	{
		if (blockID == 0)
			return false;
		else if (Block.blocksList[blockID].blockMaterial == Material.rock)
			return true;
		else if (blockID == Block.dirt.blockID || blockID == Block.gravel.blockID)
			return true;
		else
			return false;
	}
}
