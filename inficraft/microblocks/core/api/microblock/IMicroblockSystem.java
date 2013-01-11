package inficraft.microblocks.core.api.microblock;

import net.minecraft.block.Block;

public interface IMicroblockSystem {

	/**
	 * Creates a microblock ICoverSystem.
	 * @param tile The tile entity this IMicroblockCoverSystem is for.
	 */
	IMicroblockCoverSystem createMicroblockCoverSystem(IMicroblockSupporterTile tile);

	/**
	 * Allows the given block to be cut up.
	 * Your block must have a reasonable implementation of getBlockTextureFromSideAndMetadata.
	 * Part IDs will be assigned automatically based on the block ID and metadata value.
	 */
	void addCuttableBlock(Block block, int meta);
}
