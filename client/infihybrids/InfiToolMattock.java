package net.minecraft.src.infihybrids;

import net.minecraft.src.forge.ForgeHooks;
import net.minecraft.src.forge.ITextureProvider;
import java.util.Random;
import net.minecraft.src.*;

public class InfiToolMattock extends InfiHoeCore
{
    private static Material materialEffectiveAgainst[];
    private static Random random = new Random();

    public InfiToolMattock(int itemID, InfiMaterialEnum head, InfiMaterialEnum handle, String internalName)
    {
    	super(itemID, 1, head, handle, internalName);
    }

    public String getTextureFile()
    {
        return "/infihybrids/mattocks.png";
    }

    static
    {
        materialEffectiveAgainst = (new Material[]
        {
        		Material.wood, Material.circuits, Material.cactus, Material.grass, Material.ground, Material.sand, Material.clay
        });
    }

	@Override
	public String getInvName() 
	{
		return "Mattock";
	}
	
	@Override
	public boolean onBlockStartBreak(ItemStack itemstack, int x, int y, int z, EntityPlayer entityplayer)
    {
        World world = entityplayer.worldObj;
        if (world.isRemote)
        {
            return false;
        }
        int bID = world.getBlockId(x, y, z);
        int md = world.getBlockMetadata(x, y, z);
        if (bID == Block.tallGrass.blockID)
        {
            Block tallGrass = Block.blocksList[Block.tallGrass.blockID];
            tallGrass.harvestBlock(world, entityplayer, x, y, z, md);
            tallGrass.harvestBlock(world, entityplayer, x, y, z, md);
            world.playAuxSFX(2001, x, y, z, bID + (md << 12));
            world.setBlockWithNotify(x, y, z, 0);
            onBlockDestroyed(itemstack, bID, x, y, z, entityplayer);
            return true;
        }
        else
        {            
            boolean flag = true;
            boolean flag1 = true;
            if (headType == handleType)
            {
                flag = powers(itemstack, bID, x, y, z, world, entityplayer, md, headType);
            }
            else
            {
                if (random.nextInt(100) + 1 <= 80)
                {
                    flag = powers(itemstack, bID, x, y, z, world, entityplayer, md, headType);
                }
                if (random.nextInt(100) + 1 <= 20)
                {
                    flag1 = powers(itemstack, bID, x, y, z, world, entityplayer, md, handleType);
                }
            }
            if (!ForgeHooks.canHarvestBlock(Block.blocksList[bID], entityplayer, md))
            {
                flag = false;
            }
            if (!flag || !flag1)
            {
                world.playAuxSFX(2001, x, y, z, bID + (md << 12));
                world.setBlockWithNotify(x, y, z, 0);
                onBlockDestroyed(itemstack, bID, x, y, z, entityplayer);
                return true;
            }
            else
            {
                return false;
            }
        }
    }
	
	@Override
	public boolean onBlockDestroyed(ItemStack itemstack, int bID, int x, int y, int z, EntityLiving entityliving)
	{
		World world = entityliving.worldObj;
        if ((bID == Block.dirt.blockID || bID == Block.grass.blockID) && 
        		InfiToolPowers.searchForBlock(world, Block.wood.blockID, 4, x, y, z) && random.nextInt(100) + 1 <= 20)
        {
        	InfiToolPowers.spawnItem(x, y, z, mod_InfiBase.treeRoot.shiftedIndex, 1, 0, world);
        }
		return super.onBlockDestroyed(itemstack, bID, x, y, z, entityliving);
	}
	
	@Override
	public float getStrVsBlock(ItemStack itemstack, Block block, int meta)
	{
		for (int i = 0; i < materialEffectiveAgainst.length; i++)
		{
			if (materialEffectiveAgainst[i] == block.blockMaterial )
			{
				if (this.headShoddy || this.handleShoddy)
				{
					return efficiencyOnProperMaterial + (float)itemstack.getItemDamage() / 100F;
				}
				else
				{
					return efficiencyOnProperMaterial;
				}
			}
		}
		return 1.0F;
	}
}
