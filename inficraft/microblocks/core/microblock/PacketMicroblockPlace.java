package inficraft.microblocks.core.microblock;

import inficraft.microblocks.core.ImmibisCore;
import inficraft.microblocks.core.api.microblock.EnumPosition;
import inficraft.microblocks.core.api.net.IPacket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class PacketMicroblockPlace implements IPacket {
	
	public int x, y, z, posid;

	public PacketMicroblockPlace(int x, int y, int z, int posid) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.posid = posid;
	}
	
	public PacketMicroblockPlace() {
		this(0, 0, 0, 0);
	}

	@Override
	public byte getID() {
		return ImmibisCore.PACKET_TYPE_C2S_MICROBLOCK_PLACE;
	}

	@Override
	public void read(DataInputStream in) throws IOException {
		x = in.readInt();
		y = in.readInt();
		z = in.readInt();
		posid = in.readInt();
	}

	@Override
	public void write(DataOutputStream out) throws IOException {
		out.writeInt(x);
		out.writeInt(y);
		out.writeInt(z);
		out.writeInt(posid);
	}

	@Override
	public void onReceived(EntityPlayer source) {
		if(source != null) {
			if(posid < 0 || posid >= EnumPosition.values().length) {
				//System.out.println("wrong position");
				return;
			}
			EnumPosition pos = EnumPosition.values()[posid];
			ItemStack h = source.getCurrentEquippedItem();
			if(h == null || !(Item.itemsList[h.itemID] instanceof ItemMicroblock)) {
				//System.out.println("wrong item equipped");
				return;
			}
			ItemMicroblock i = (ItemMicroblock)Item.itemsList[h.itemID];
			if(i.placeInBlock(source.worldObj, x, y, z, pos, h) && !source.capabilities.isCreativeMode) {
				h.stackSize--;
				if(h.stackSize == 0)
					source.destroyCurrentEquippedItem();
			}
		}
	}
	
	@Override
	public String getChannel() {
		return ImmibisCore.CHANNEL;
	}

}
