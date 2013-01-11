package inficraft.microblocks.core.microblock;

import inficraft.microblocks.core.api.microblock.IMicroblockCoverSystem;
import inficraft.microblocks.core.api.microblock.IMicroblockSupporterTile;
import inficraft.microblocks.core.api.microblock.Part;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public abstract class ItemCoverableBase extends Item {

	protected ItemCoverableBase(int id_minus_256) {
		super(id_minus_256);
	}
	
	public static boolean mergeIntoMicroblockContainer(ItemStack itemstack, EntityPlayer entityplayer, World world, int i, int j, int k, int l, int blockID)
	{
		if(MicroblockSystem.INSTANCE == null || world.getBlockId(i, j, k) != MicroblockSystem.microblockContainerBlock.blockID)
			return false;

		TileMicroblockContainer tm = (TileMicroblockContainer)world.getBlockTileEntity(i, j, k);
		IMicroblockCoverSystem oldCI = tm.getCoverSystem();
		if(!world.setBlockWithNotify(i, j, k, blockID))
			return false;
		IMicroblockSupporterTile tcb = (IMicroblockSupporterTile)world.getBlockTileEntity(i, j, k);
		IMicroblockCoverSystem newCI = tcb.getCoverSystem();
		
		for(Part p : oldCI.getAllParts())
			newCI.addPart(p);
		Block b = Block.blocksList[blockID];
		
        b.onBlockPlacedBy(world, i, j, k, entityplayer);
		return true;
	}

}
