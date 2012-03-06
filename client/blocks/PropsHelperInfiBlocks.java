package net.minecraft.src.blocks;
import net.minecraft.src.*;

public class PropsHelperInfiBlocks {

	public PropsHelperInfiBlocks() { }
	
	public static InfiProps getProps(InfiProps infiprops)
	{
		mod_InfiBlocks.resolveConflicts = infiprops.readBoolean("Automatically Resolve ID conflicts");
		
		mod_InfiBlocks.blockCraftingID = infiprops.readInt("Crafting Table ID");
		mod_InfiBlocks.blockChestID = infiprops.readInt("Chest ID");
		mod_InfiBlocks.blockFurnaceID = infiprops.readInt("Furnace ID");
		mod_InfiBlocks.magicSlabStoneID = infiprops.readInt("Magic Slab Stone ID");
		mod_InfiBlocks.magicSlabSoilID = infiprops.readInt("Magic Slab Soil ID");
		mod_InfiBlocks.magicSlabWoolID = infiprops.readInt("Magic Slab Wool ID");
		
		mod_InfiBlocks.woolCarpetID = infiprops.readInt("Wool Carpet ID");
		mod_InfiBlocks.craftingGuiID = infiprops.readInt("Crafting Gui ID");
		mod_InfiBlocks.furnaceGuiID = infiprops.readInt("Furnace Gui ID");
		
		mod_InfiBlocks.stainedGlassID = infiprops.readInt("Stained Glass ID");
		mod_InfiBlocks.stainedGlassPaneID = infiprops.readInt("Stained Glass Pane ID");
		mod_InfiBlocks.stainedGlassMagicSlabID = infiprops.readInt("Stained Glass Magic Slab ID");
		
		mod_InfiBlocks.storageBlockID = infiprops.readInt("Storage Block ID");
		mod_InfiBlocks.brickID = infiprops.readInt("Brick ID");
		mod_InfiBlocks.crackedBrickID = infiprops.readInt("Cracked Brick ID");
		mod_InfiBlocks.fancyBrickID = infiprops.readInt("Fancy Brick ID");
		mod_InfiBlocks.runeBrickID = infiprops.readInt("Runic Brick ID");
		mod_InfiBlocks.infiGlassID = infiprops.readInt("Infi-Glass ID");
		mod_InfiBlocks.infiGlassPaneID = infiprops.readInt("Infi-Glass Pane ID");
		mod_InfiBlocks.iceBrickID = infiprops.readInt("Ice Brick ID");
		mod_InfiBlocks.brownstoneID = infiprops.readInt("Brownstone ID");
		
		mod_InfiBlocks.storageBlockMagicSlabID = infiprops.readInt("Storage Block Magic Slab ID");
		mod_InfiBlocks.brickMagicSlabID = infiprops.readInt("Brick Magic Slab ID");
		mod_InfiBlocks.crackedBrickMagicSlabID = infiprops.readInt("Cracked Brick Magic Slab ID");
		mod_InfiBlocks.fancyBrickMagicSlabID = infiprops.readInt("Fancy Brick Magic Slab ID");
		mod_InfiBlocks.runeBrickMagicSlabID = infiprops.readInt("Runic Brick Magic Slab ID");
		mod_InfiBlocks.infiGlassMagicSlabID = infiprops.readInt("Infi-Glass Magic Slab ID");
		mod_InfiBlocks.iceBrickMagicSlabID = infiprops.readInt("Ice Brick Magic Slab ID");
		mod_InfiBlocks.brownstoneMagicSlabID = infiprops.readInt("Brownstone Magic Slab ID");
		
		mod_InfiBlocks.chiselID = infiprops.readInt("Chisel ID");
		return infiprops;
	}

	public static InfiProps InitProps(InfiProps infiprops)
	{
		infiprops.accessBoolean("Automatically Resolve ID conflicts", true);
		
		infiprops.accessInt("Crafting Table ID", 3271);
		infiprops.accessInt("Chest ID", 3272);
		infiprops.accessInt("Furnace ID", 3273);
		infiprops.accessInt("Wool Carpet ID", 3274);
		
		infiprops.accessInt("Magic Slab Stone ID", 3275);
		infiprops.accessInt("Magic Slab Soil ID", 3276);
		infiprops.accessInt("Magic Slab Wool ID", 3277);
		
		infiprops.accessInt("Stained Glass ID", 3279);
		infiprops.accessInt("Stained Glass Pane ID", 3280);
		infiprops.accessInt("Stained Glass Magic Slab ID", 3281);
		
		infiprops.accessInt("Storage Block ID", 3283);
		infiprops.accessInt("Storage Block Magic Slab ID", 3284);
		
		infiprops.accessInt("Brick ID", 3286);
		infiprops.accessInt("Brick Magic Slab ID", 3287);
		
		infiprops.accessInt("Cracked Brick ID", 3289);
		infiprops.accessInt("Cracked Brick Magic Slab ID", 3290);
		
		infiprops.accessInt("Fancy Brick ID", 3292);
		infiprops.accessInt("Fancy Brick Magic Slab ID", 3293);
		
		infiprops.accessInt("Runic Brick ID", 3295);
		infiprops.accessInt("Runic Brick Magic Slab ID", 3296);
		
		infiprops.accessInt("Infi-Glass ID", 3298);
		infiprops.accessInt("Infi-Glass Pane ID", 3299);
		infiprops.accessInt("Infi-Glass Magic Slab ID", 3300);
		
		infiprops.accessInt("Ice Brick ID", 3202);
		infiprops.accessInt("Ice Brick Magic Slab ID", 3203);
		
		infiprops.accessInt("Brownstone ID", 3205);
		infiprops.accessInt("Brownstone Magic Slab ID", 3206);		
		
		infiprops.accessInt("Crafting Gui ID", 172);
		infiprops.accessInt("Furnace Gui ID", 173);
		
		infiprops.accessInt("Chisel ID", 12101);
		return infiprops;
	}
	
	public static boolean resolveIDs(InfiProps props)
	{	
		mod_InfiBlocks.blockCraftingID = changeID(props, mod_InfiBlocks.blockCraftingID, 
				"Crafting Table ID");
		mod_InfiBlocks.woolCarpetID = changeID(props, mod_InfiBlocks.woolCarpetID, 
				"Wool Carpet ID");
		mod_InfiBlocks.blockChestID = changeID(props, mod_InfiBlocks.blockChestID, 
				"Chest ID");
		mod_InfiBlocks.blockFurnaceID = changeID(props, mod_InfiBlocks.blockFurnaceID, 
				"Furnace ID");
		mod_InfiBlocks.magicSlabStoneID = changeID(props, mod_InfiBlocks.magicSlabStoneID, 
				"Magic Slab Stone ID");
		mod_InfiBlocks.magicSlabSoilID = changeID(props, mod_InfiBlocks.magicSlabSoilID, 
				"Magic Slab Soil ID");
		mod_InfiBlocks.magicSlabWoolID = changeID(props, mod_InfiBlocks.magicSlabWoolID, 
				"Magic Slab Wool ID");
		mod_InfiBlocks.stainedGlassID = changeID(props, mod_InfiBlocks.stainedGlassID, 
				"Stained Glass ID");
		mod_InfiBlocks.stainedGlassPaneID = changeID(props, mod_InfiBlocks.stainedGlassPaneID, 
				"Stained Glass Pane ID");
		mod_InfiBlocks.stainedGlassMagicSlabID = changeID(props, mod_InfiBlocks.stainedGlassMagicSlabID, 
				"Stained Glass Magic Slab ID");
		mod_InfiBlocks.storageBlockID = changeID(props, mod_InfiBlocks.storageBlockID, 
				"Storage Block ID");
		mod_InfiBlocks.brickID = changeID(props, mod_InfiBlocks.brickID, 
				"Brick ID");
		mod_InfiBlocks.crackedBrickID = changeID(props, mod_InfiBlocks.crackedBrickID, 
				"Cracked Brick ID");
		mod_InfiBlocks.fancyBrickID = changeID(props, mod_InfiBlocks.fancyBrickID, 
				"Fancy Brick ID");
		mod_InfiBlocks.runeBrickID = changeID(props, mod_InfiBlocks.runeBrickID, 
				"Runic Brick ID");
		mod_InfiBlocks.infiGlassID = changeID(props, mod_InfiBlocks.infiGlassID, 
				"Infi-Glass ID");
		mod_InfiBlocks.iceBrickID = changeID(props, mod_InfiBlocks.iceBrickID, 
				"Ice Brick ID");
		mod_InfiBlocks.brownstoneID = changeID(props, mod_InfiBlocks.brownstoneID, 
				"Brownstone ID");
		mod_InfiBlocks.storageBlockMagicSlabID = changeID(props, mod_InfiBlocks.storageBlockMagicSlabID, 
				"Storage Block Magic Slab ID");
		mod_InfiBlocks.brickMagicSlabID = changeID(props, mod_InfiBlocks.brickMagicSlabID, 
				"Brick Magic Slab ID");
		mod_InfiBlocks.fancyBrickMagicSlabID = changeID(props, mod_InfiBlocks.fancyBrickMagicSlabID, 
				"Fancy Brick Magic Slab ID");
		mod_InfiBlocks.iceBrickMagicSlabID = changeID(props, mod_InfiBlocks.iceBrickMagicSlabID, 
				"Ice Brick Magic Slab ID");
		mod_InfiBlocks.brownstoneMagicSlabID = changeID(props, mod_InfiBlocks.brownstoneMagicSlabID, 
				"Brownstone Magic Slab ID");
		props.writeBoolean("Automatically Resolve ID conflicts", false);
		return true;
	}
	
	private static int changeID(InfiProps props, int id, String s)
	{
		if(Block.blocksList[id] != null) {
			for(int i = 130; i < Block.blocksList.length; i++) {
				if(Block.blocksList[i] == null) {
					props.writeInt(s, i);
					return i;
				}
			}
		}
		return id;
	}
}
