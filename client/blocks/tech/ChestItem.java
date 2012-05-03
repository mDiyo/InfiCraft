package net.minecraft.src.blocks.tech;

import net.minecraft.src.*;

public class ChestItem extends ItemBlock
{
    private static ChestLogic logic = new ChestLogic();
    
    public ChestItem(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
    }

    public static void renderChest(Block par1Block, int par2, float par3)
    {
        TileEntityRenderer.instance.renderTileEntityAt(logic, 0.0D, 0.0D, 0.0D, 0.0F);
    }
	
    public static final String blockType[] =
    {
        "stone", "stonebrick", "ice", "cactus", "birch"
    };    

    @Override
    public int getMetadata(int md)
    {
        return md;
    }
    
    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("ChestInfi").toString();
    }
}
