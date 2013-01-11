package inficraft.microblocks.core.microblock;

import inficraft.microblocks.core.api.microblock.EnumPartClass;
import inficraft.microblocks.core.api.microblock.EnumPosition;
import inficraft.microblocks.core.api.microblock.IMicroblockCoverSystem;
import inficraft.microblocks.core.api.microblock.IMicroblockSupporterTile;
import inficraft.microblocks.core.api.microblock.Part;
import inficraft.microblocks.core.api.microblock.PartType;
import inficraft.microblocks.core.api.util.Dir;
import inficraft.microblocks.core.multipart.BlockMultipartBase;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.common.ForgeDirection;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MicroblockCoverSystem implements IMicroblockCoverSystem {
	
	ArrayList<Part> parts = new ArrayList<Part>();
	public BlockMultipartBase wrappedBlock;
	
	// TODO: better API for hole size of hollow covers
	public double hollow_edge_size;
	
	private TileEntity te;
	private IMicroblockSupporterTile te2;
	
	public MicroblockCoverSystem(IMicroblockSupporterTile te, double hes) {
		this.te = (TileEntity)te;
		this.te2 = te;
		hollow_edge_size = hes;
	}
	
	public MicroblockCoverSystem(IMicroblockSupporterTile te) {
		this(te, 0.25);
	}
	
	

	@Override
	public void writeToNBT(NBTTagCompound tag) {
		NBTTagList l = new NBTTagList();
		for(Part p : parts)
			l.appendTag(p.writeToNBT());
		tag.setTag("ICMP", l); // ICMP = Immibis Core Multi-Part
	}
	
	@Override
	public void readFromNBT(NBTTagCompound tag) {
		parts.clear();
		NBTTagList l = tag.getTagList("ICMP");
		if(l == null)
			return;
		for(int k = 0; k < l.tagCount(); k++) {
			Part p = Part.readFromNBT(l.tagAt(k));
			if(p != null)
				parts.add(p);
		}
	}

	@Override
	public MovingObjectPosition collisionRayTrace(Vec3 src, Vec3 dst) {
		int k = 0;
		int x = te.xCoord, y = te.yCoord, z = te.zCoord;
		src = src.addVector(-x, -y, -z);
		dst = dst.addVector(-x, -y, -z);
		double best = dst.squareDistanceTo(src) + 1;
		Part hit = null;
		MovingObjectPosition hitInfo = null;
		int subHit = -1;
		for(Part p : parts)
		{
			AxisAlignedBB aabb = p.getBoundingBoxFromPool();
			MovingObjectPosition rt = aabb.calculateIntercept(src, dst);
			if(rt != null)
			{
				double rtdist = rt.hitVec.squareDistanceTo(src);
				if(rtdist < best)
				{
					hitInfo = rt;
					best = rtdist;
					hit = p;
					subHit = -1 - k;
				}
			}
			++k;
		}
		
		if(hit == null)
			return null;

		MovingObjectPosition pos = new MovingObjectPosition(x, y, z, hitInfo.sideHit, hitInfo.hitVec.addVector(x, y, z));
		pos.subHit = subHit;
		return pos;
	}

	@Override
	public boolean addPart(Part part) {
		if(!canPlace(part.type, part.pos))
			return false;
		parts.add(part);
		return true;
	}
	
	public boolean canPlaceCentre(double size) {
		AxisAlignedBB aabb = Part.getBoundingBoxFromPool(EnumPosition.Centre, size);
		for(Part p : parts)
		{
			if(p.getBoundingBoxFromPool().intersectsWith(aabb))
				return false;
		}
		return true;
	}

	public boolean canPlace(PartType type, EnumPosition pos) {
		for(Part p : parts)
		{
			if(p.pos == pos)
				return false;
			if(p.pos.clazz == pos.clazz)
				continue;
			if(p.getBoundingBoxFromPool().intersectsWith(Part.getBoundingBoxFromPool(pos, type.size)))
				return false;
		}
		return te == null || !te2.isPlacementBlockedByTile(type, pos);
	}

	@Override
	public void getCollidingBoundingBoxes(AxisAlignedBB mask, List<AxisAlignedBB> list) {
		for(Part p : parts) {
			AxisAlignedBB bb = p.getBoundingBoxFromPool().getOffsetBoundingBox(te.xCoord, te.yCoord, te.zCoord);
			if(mask.intersectsWith(bb))
				list.add(bb);
		}
	}

	/**
	 * Returns true if tubes/cables/etc that use the centre of the block
	 * can connect through the specified side - ie if it is not blocked by a non-hollow cover.
	 */
	@Override
	public boolean isSideOpen(int side) {
		return !isPositionOccupied(EnumPosition.getFacePosition(side), true);
	}

	public boolean isSideOpen(int myx, int myy, int myz, int x, int y, int z) {
		if(x < myx) return isSideOpen(Dir.NX);
		if(x > myx) return isSideOpen(Dir.PX);
		if(y < myy) return isSideOpen(Dir.NY);
		if(y > myy) return isSideOpen(Dir.PY);
		if(z < myz) return isSideOpen(Dir.NZ);
		if(z > myz) return isSideOpen(Dir.PZ);
		throw new IllegalArgumentException("no direction given (start = end)");
	}
	
	@Override
	public byte[] writeDescriptionBytes() {
		ByteArrayDataOutput o = ByteStreams.newDataOutput(6 + parts.size()*3);
		try {
			writeDescriptionPacket(o);
		} catch(IOException e) {
			throw new RuntimeException(e);
		}
		return o.toByteArray();
	}
	
	@Override
	public void readDescriptionBytes(byte[] data, int start) {
		try {
			readDescriptionPacket(ByteStreams.newDataInput(data, start));
		} catch(IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void writeDescriptionPacket(DataOutput data) throws IOException {
		data.writeShort(wrappedBlock == null ? 0 : wrappedBlock.blockID);
		data.writeShort(parts.size());
		//data.writeShort(partiallyDamagedPart);
		//data.writeInt(te.xCoord);
		//data.writeInt(te.yCoord);
		//data.writeInt(te.zCoord);
		for(Part pt : parts) {
			data.writeByte(pt.pos.ordinal());
			data.writeInt(pt.type.id);
		}
	}
	
	@Override
	public void readDescriptionPacket(DataInput data) throws IOException {
		int wrappedID = data.readShort();
		wrappedBlock = (wrappedID == 0 ? null : (BlockMultipartBase)Block.blocksList[wrappedID]);
		int ncovers = data.readShort();
		//partiallyDamagedPart = data.readShort();
		//int x = data.readInt();
		//int y = data.readInt();
		//int z = data.readInt();
		//if(x != te.xCoord || y != te.yCoord || z != te.zCoord)
		//	throw new IOException("Coordinates don't match");
		parts.clear();
		for(int k = 0; k < ncovers; k++)
		{
			EnumPosition pos = EnumPosition.values()[data.readByte()];
			int type = data.readInt();
			parts.add(new Part(MicroblockSystem.parts.get(type), pos));
		}
		
		te.worldObj.markBlockForUpdate(te.xCoord, te.yCoord, te.zCoord);
	}
	/* $endif$ */

	public void copyPartsTo(MicroblockCoverSystem other) {
		for(Part p : parts)
			other.addPart(p);
	}

	/**
	 * Removes the part at the given coordinates.
	 * Returns the items dropped, or null (if no items should be dropped)
	 */
	@Override
	public List<ItemStack> removePartByPlayer(EntityPlayer ply, int part) {
		
		if(MicroblockSystem.microblockContainerBlock == null)
			return null;
		
		if(part >= parts.size())
			return null;
		
		Part p = parts.remove(part);
		if(p == null)
			return null;
		
		ItemStack drop = ItemMicroblock.getStackWithPartID(p.type.id);
		
		if(parts.size() == 0 && te.getClass() == TileMicroblockContainer.class)
			te.worldObj.setBlock(te.xCoord, te.yCoord, te.zCoord, 0);
		else
			te.worldObj.markBlockForUpdate(te.xCoord, te.yCoord, te.zCoord);
		
		return Collections.singletonList(drop);
	}
	
	/**
	 * Returns true if there is a part in the specified position.
	 */
	@Override
	public boolean isPositionOccupied(EnumPosition pos) {
		for(Part p : parts)
			if(p.pos == pos)
				return true;
		return false;
	}
	
	/**
	 * Returns true if there is a part in the specified position.
	 * If ignoreHollowPanels is true, hollow panels will be ignored.
	 */
	public boolean isPositionOccupied(EnumPosition pos, boolean ignoreHollowPanels) {
		if(te != null && te2.isPositionOccupiedByTile(pos))
			return true;
		for(Part p : parts)
			if(p.pos == pos && (!ignoreHollowPanels || p.type.clazz != EnumPartClass.HollowPanel))
				return true;
		return false;
	}

	/**
	 * Checks if an edge is unused (for example, if wire connections can connect around corners through it)
	 * Returns the same result if face1 and face2 are swapped.
	 * 
	 * @param face1 One face bordering the edge to check.
	 * @param face2 The other face bordering the edge to check.
	 * @return True if the edge is unused.
	 */
	@Override
	public boolean isEdgeOpen(int face1, int face2) {
		return !isPositionOccupied(EnumPosition.getEdgePosition(face1, face2)) && isSideOpen(face1) && isSideOpen(face2);
	}

	@Override
	public EnumPosition getPartPosition(int part) {
		if(part >= parts.size())
			return null;
		return parts.get(part).pos;
	}

	@Override
	public AxisAlignedBB getPartAABBFromPool(int part) {
		if(part >= parts.size())
			return null;
		return parts.get(part).getBoundingBoxFromPool();
	}

	@Override
	public float getPlayerRelativePartHardness(EntityPlayer ply, int part) {
		if(part >= parts.size())
			return 0;
		
		Part p = parts.get(part);
		float hardness = p.type.hardness;
		if(hardness < 0)
			return 0;
		if(!p.type.canHarvestCover(ply))
			return 0.01F / hardness;
		return ply.getCurrentPlayerStrVsBlock(p.type.modelBlock, p.type.modelMeta) / hardness / 30F;
	}

	@Override
	public ItemStack pickPart(MovingObjectPosition rayTrace, int part) {
		if(part >= parts.size())
			return null;
		return ItemMicroblock.getStackWithPartID(parts.get(part).type.id);
	}

	@Override
	public boolean isSolidOnSide(ForgeDirection side) {
		switch(side.ordinal()) {
		case Dir.NX: return isPositionOccupied(EnumPosition.FaceNX, true);
		case Dir.PX: return isPositionOccupied(EnumPosition.FacePX, true);
		case Dir.NY: return isPositionOccupied(EnumPosition.FaceNY, true);
		case Dir.PY: return isPositionOccupied(EnumPosition.FacePY, true);
		case Dir.NZ: return isPositionOccupied(EnumPosition.FaceNZ, true);
		case Dir.PZ: return isPositionOccupied(EnumPosition.FacePZ, true);
		}
		return false;
	}

	public static void renderPartWorld(Part p, RenderBlocks render, int x, int y, int z) {
		BlockMicroblockContainer.texindices = p.type.textures;
		double size = p.type.size;
		//int[] textures = p.type.textures;
		if(p.type.clazz == EnumPartClass.HollowPanel)
		{
			float hes = 0.25f; //(float)HOLLOW_EDGE_SIZE;
			float s = (float)size;
			switch(p.pos)
			{
			case FaceNX:
				render.setRenderBounds(0, 0, 0, s, hes, 1);
				render.renderStandardBlock(MicroblockSystem.microblockContainerBlock, x, y, z);
				render.setRenderBounds(0, 1-hes, 0, s, 1, 1);
				render.renderStandardBlock(MicroblockSystem.microblockContainerBlock, x, y, z);
				render.setRenderBounds(0, hes, 0, s, 1-hes, hes);
				render.renderStandardBlock(MicroblockSystem.microblockContainerBlock, x, y, z);
				render.setRenderBounds(0, hes, 1-hes, s, 1-hes, 1);
				render.renderStandardBlock(MicroblockSystem.microblockContainerBlock, x, y, z);
				break;
			case FacePX:
				render.setRenderBounds(1-s, 0, 0, 1, hes, 1);
				render.renderStandardBlock(MicroblockSystem.microblockContainerBlock, x, y, z);
				render.setRenderBounds(1-s, 1-hes, 0, 1, 1, 1);
				render.renderStandardBlock(MicroblockSystem.microblockContainerBlock, x, y, z);
				render.setRenderBounds(1-s, hes, 0, 1, 1-hes, hes);
				render.renderStandardBlock(MicroblockSystem.microblockContainerBlock, x, y, z);
				render.setRenderBounds(1-s, hes, 1-hes, 1, 1-hes, 1);
				render.renderStandardBlock(MicroblockSystem.microblockContainerBlock, x, y, z);
				break;
			case FaceNY:
				render.setRenderBounds(0, 0, 0, hes, s, 1);
				render.renderStandardBlock(MicroblockSystem.microblockContainerBlock, x, y, z);
				render.setRenderBounds(1-hes, 0, 0, 1, s, 1);
				render.renderStandardBlock(MicroblockSystem.microblockContainerBlock, x, y, z);
				render.setRenderBounds(hes, 0, 0, 1-hes, s, hes);
				render.renderStandardBlock(MicroblockSystem.microblockContainerBlock, x, y, z);
				render.setRenderBounds(hes, 0, 1-hes, 1-hes, s, 1);
				render.renderStandardBlock(MicroblockSystem.microblockContainerBlock, x, y, z);
				break;
			case FacePY:
				render.setRenderBounds(0, 1-s, 0, hes, 1, 1);
				render.renderStandardBlock(MicroblockSystem.microblockContainerBlock, x, y, z);
				render.setRenderBounds(1-hes, 1-s, 0, 1, 1, 1);
				render.renderStandardBlock(MicroblockSystem.microblockContainerBlock, x, y, z);
				render.setRenderBounds(hes, 1-s, 0, 1-hes, 1, hes);
				render.renderStandardBlock(MicroblockSystem.microblockContainerBlock, x, y, z);
				render.setRenderBounds(hes, 1-s, 1-hes, 1-hes, 1, 1);
				render.renderStandardBlock(MicroblockSystem.microblockContainerBlock, x, y, z);
				break;
			case FaceNZ:
				render.setRenderBounds(0, 0, 0, hes, 1, s);
				render.renderStandardBlock(MicroblockSystem.microblockContainerBlock, x, y, z);
				render.setRenderBounds(1-hes, 0, 0, 1, 1, s);
				render.renderStandardBlock(MicroblockSystem.microblockContainerBlock, x, y, z);
				render.setRenderBounds(hes, 0, 0, 1-hes, hes, s);
				render.renderStandardBlock(MicroblockSystem.microblockContainerBlock, x, y, z);
				render.setRenderBounds(hes, 1-hes, 0, 1-hes, 1, s);
				render.renderStandardBlock(MicroblockSystem.microblockContainerBlock, x, y, z);
				break;
			case FacePZ:
				render.setRenderBounds(0, 0, 1-s, hes, 1, 1);
				render.renderStandardBlock(MicroblockSystem.microblockContainerBlock, x, y, z);
				render.setRenderBounds(1-hes, 0, 1-s, 1, 1, 1);
				render.renderStandardBlock(MicroblockSystem.microblockContainerBlock, x, y, z);
				render.setRenderBounds(hes, 0, 1-s, 1-hes, hes, 1);
				render.renderStandardBlock(MicroblockSystem.microblockContainerBlock, x, y, z);
				render.setRenderBounds(hes, 1-hes, 1-s, 1-hes, 1, 1);
				render.renderStandardBlock(MicroblockSystem.microblockContainerBlock, x, y, z);
				break;
			default:
				// shouldn't happen
				System.err.println("hollow panel placed at invalid position "+p.pos);
			}
		}
		else
		{
			AxisAlignedBB bb = p.getBoundingBoxFromPool();
			render.setRenderBounds(bb.minX, bb.minY, bb.minZ, bb.maxX, bb.maxY, bb.maxZ);
			render.renderStandardBlock(MicroblockSystem.microblockContainerBlock, x, y, z);
		}
		BlockMicroblockContainer.texindices = null;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void render(RenderBlocks render) {
		ForgeHooksClient.unbindTexture();
		
		String tex = "/terrain.png";
		boolean texIsBound = false;
		for(Part p : parts)
		{
			if(!p.type.texfile.equals(tex))
			{
				if(texIsBound)
					ForgeHooksClient.unbindTexture();
				tex = p.type.texfile;
				ForgeHooksClient.bindTexture(tex, 0);
				texIsBound = true;
			}
			renderPartWorld(p, render, te.xCoord, te.yCoord, te.zCoord);
		}
		if(texIsBound)
			ForgeHooksClient.unbindTexture();
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void renderPart(RenderBlocks render, int part) {
		ForgeHooksClient.unbindTexture();
		Part p = parts.get(part);
		renderPartWorld(p, render, te.xCoord, te.yCoord, te.zCoord);
	}
	
	@Override
	public void convertToContainerBlock() {
		if(parts.size() == 0 || MicroblockSystem.microblockContainerBlock == null)
			te.worldObj.setBlockWithNotify(te.xCoord, te.yCoord, te.zCoord, 0);
		else
		{
			te.worldObj.setBlockWithNotify(te.xCoord, te.yCoord, te.zCoord, MicroblockSystem.microblockContainerBlock.blockID);
			IMicroblockCoverSystem c2 = ((TileMicroblockContainer)te.worldObj.getBlockTileEntity(te.xCoord, te.yCoord, te.zCoord)).getCoverSystem();
			for(Part p : parts)
				c2.addPart(p);
		}
	}

	@Override
	public Collection<Part> getAllParts() {
		return Collections.unmodifiableList(parts);
	}
}