package inficraft.armory;

import inficraft.api.SlotArmorCopy;
import net.minecraft.src.Container;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Slot;

public class ArmorStandContainer extends Container
{
	private EntityEquipment stand;
	
	public ArmorStandContainer(EntityEquipment equip)
	{
		stand = equip;
		this.addSlotToContainer(new Slot(equip, 0, 8 + 18, 18));
		
		for (int slot = 0; slot < 4; ++slot)
        {
            this.addSlotToContainer(new SlotArmorCopy(this, equip, slot + 1, 74, 8 + slot * 18, slot));
        }
	}

	@Override
	public boolean canInteractWith(EntityPlayer player)
	{
		return false;
	}

}
