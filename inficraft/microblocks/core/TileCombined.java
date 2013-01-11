package inficraft.microblocks.core;

import inficraft.microblocks.core.api.APILocator;
import inficraft.microblocks.core.api.net.IPacket;
import inficraft.microblocks.core.api.porting.PortableTileEntity;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.Packet;

public abstract class TileCombined extends PortableTileEntity {
	
	public boolean redstone_output = false;
	
	public List<ItemStack> getInventoryDrops() {
		return new ArrayList<ItemStack>();
	}

	public void onBlockNeighbourChange() {}
	public boolean onBlockActivated(EntityPlayer player) {return false;}
	public void onBlockRemoval() {}
	
	public void notifyNeighbouringBlocks() {
		worldObj.notifyBlocksOfNeighborChange(xCoord, yCoord, zCoord, worldObj.getBlockId(xCoord, yCoord, zCoord));
	}
	
	public void resendDescriptionPacket() {
		worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
	}
	
	@Override
	public Packet getDescriptionPacket() {
		IPacket p = getDescriptionPacket2();
		if(p == null)
			return null;
		Packet p2 = APILocator.getNetManager().wrap(p);
		p2.isChunkDataPacket = true;
		return p2;
	}
	
	public IPacket getDescriptionPacket2() {
		return null;
	}
	
	// look = The closest axis to the direction the player is looking towards
	public void onPlaced(EntityLiving player, int look) {}
}
