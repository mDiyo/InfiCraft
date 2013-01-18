package tinker.toolconstruct.blocks;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.world.World;
import tinker.common.InventoryLogic;

public class PatternHolderLogic extends InventoryLogic
{
	public PatternHolderLogic()
	{
		super(30);
	}

	@Override
	public String getInvName ()
	{
		return "toolstation.patternholder";
	}

	@Override
	public Container getGuiContainer (InventoryPlayer inventoryplayer, World world, int x, int y, int z)
	{
		return null;
	}
}
