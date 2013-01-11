package inficraft.microblocks.core.api.util;

import inficraft.microblocks.core.SlotFake;
import inficraft.microblocks.core.api.APILocator;
import inficraft.microblocks.core.api.net.IPacket;
import inficraft.microblocks.core.net.ISyncedContainer;
import inficraft.microblocks.core.net.PacketButtonPress;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class BaseContainer<InventoryType> extends Container implements ISyncedContainer {
	
	protected EntityPlayer player;
	protected InventoryType inv;
	
	public BaseContainer(EntityPlayer player, InventoryType inv) {
		this.player = player;
		this.inv = inv;
	}

	@Override
	public boolean canInteractWith(EntityPlayer var1) {
		if(inv instanceof TileEntity)
			if(((TileEntity)inv).isInvalid())
				return false;
		if(inv instanceof IInventory)
			return ((IInventory)inv).isUseableByPlayer(var1);
		if(inv instanceof TileEntity) {
			TileEntity te = (TileEntity)inv;
			return var1.getDistanceSq(te.xCoord + 0.5, te.yCoord + 0.5, te.zCoord + 0.5) <= 64;
		}
		return true;
	}
	
	@Override
	public ItemStack transferStackInSlot(EntityPlayer pl, int slot) {
		return transferStackInSlot(slot);
	}
	public ItemStack transferStackInSlot(int slot) {
		return null;
	}
	
	
	@Override
	public ItemStack slotClick(int slot, int button, int shift, EntityPlayer player)
    {
        if(slot >= 0 && inventorySlots.get(slot) instanceof SlotFake) {
        	SlotFake fs = (SlotFake)inventorySlots.get(slot);
        	ItemStack heldStack = player.inventory.getItemStack();
        	fs.onClickByItem(heldStack, button, shift == 1);
        	return null;
        }
        return super.slotClick(slot, button, shift, player);
    }

	/** Sends the packet to all players listening to this inventory.
	 * Use this to update the info displayed in the GUI, for example.
	 * They may be sent from the server to the client.
	 * 
	 * Calling this on the client has no effect in SSP, and throws
	 * an exception in SMP. It does NOT send the packet from the
	 * client to itself, on the rationale that the container should
	 * already know the information being sent.
	 */
	public void sendUpdatePacket(IPacket packet) {
		if(player.worldObj.isRemote)
			throw new IllegalStateException("Cannot send update packets from the client");

		//System.out.println("send update packet "+packet);
		for(ICrafting ic : (List<ICrafting>)crafters)
			if(ic instanceof EntityPlayer)
				APILocator.getNetManager().sendToClient(packet, (EntityPlayer)ic);
	}
	
	/** Sends the packet to the server. Throws an exception if run on the server.
	 */
	public void sendActionPacket(IPacket packet) {

		if(!player.worldObj.isRemote)
			throw new IllegalStateException("Cannot send action packets from the server");

		APILocator.getNetManager().sendToServer(packet);
	}
	
	/** Called when an action packet is received. */
	public void onActionPacket(IPacket p) {}
	/** Called when an update packet is received. */
	public void onUpdatePacket(IPacket p) {}
	
	/** Called when a button-press packet is received.
	 * It's like an action packet that carries a single int,
	 * for convenience (you don't have to make a packet
	 * class to wrap just one int)
	 */
	public void onButtonPressed(int id) {}
	
	/** Sends a button-press packet. */
	public void sendButtonPressed(int id) {
		sendActionPacket(new PacketButtonPress(id));
	}
	
	private void onActionPacket2(IPacket p) {
		if(p instanceof PacketButtonPress) {
			onButtonPressed(((PacketButtonPress)p).buttonID);
		} else
			onActionPacket(p);
	}
	
	@Override
	public final void onReceivePacket(IPacket p) {
		if(!player.worldObj.isRemote)
			onActionPacket2(p);
		else
			onUpdatePacket(p);
	}
	
	public void sendProgressBarUpdate(int index, int value) {
		for(Object o : crafters)
			((ICrafting)o).sendProgressBarUpdate(this, index, value);
	}
	
	private Map<Short, Short> prevBarValues = new HashMap<Short, Short>();
	protected void setProgressBar(int _index, int _value) {
		short index = (short)_index, value = (short)_value;
		Short prev = prevBarValues.get(index);
		if(prev == null || prev != value) {
			prevBarValues.put(index, value);
			sendProgressBarUpdate(index, value);
		}
	}
}
