package tinker.common;

import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.ISidedInventory;

public interface IFacingLogic extends ISidedInventory
{
	public byte getDirection();
	public void setDirection(ForgeDirection direction);
}