package mDiyo;

import mDiyo.simplebackground.SimpleBGM;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;

/*
 * mDiyo's development testing mod
 * Does everything on right-click!
 */

public class XinStick extends Item
{
	public XinStick(int id) { super(id); }

	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
    {
		System.out.println("Click");
		//SimpleBGM.instance.playBGM();
		world.playSoundEffect(player.posX, player.posY, player.posZ, "day.bgm", 1f, 1f);
        return stack;
    }
}
