package inficraft.infitools.hybrids;

import inficraft.infitools.library.InfiLibrary;
import inficraft.infitools.library.InfiMaterialEnum;
import inficraft.infitools.library.InfiToolCore;
import inficraft.infitools.library.InfiToolPowers;

import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.World;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.entity.player.UseHoeEvent;

public class InfiToolMattock extends InfiToolCore
{
    private static Material materialEffectiveAgainst[];
    private static Random random = new Random();

    public InfiToolMattock(int itemID, InfiMaterialEnum head, InfiMaterialEnum handle, String internalName)
    {
    	super(itemID, 1, head, handle, internalName);
    }

    public String getTextureFile()
    {
        return "/infitextures/mattocks.png";
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
            onBlockDestroyed(itemstack, world, bID, x, y, z, entityplayer);
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
                onBlockDestroyed(itemstack, world, bID, x, y, z, entityplayer);
                return true;
            }
            else
            {
                return false;
            }
        }
    }
	
	@Override
	public boolean onBlockDestroyed(ItemStack itemstack, World world, int bID, int x, int y, int z, EntityLiving entityliving)
	{
        if ((bID == Block.dirt.blockID || bID == Block.grass.blockID) && 
        		InfiToolPowers.searchForBlock(world, Block.wood.blockID, 4, x, y, z) && random.nextInt(100) + 1 <= 20)
        {
        	InfiToolPowers.spawnItem(x, y, z, InfiLibrary.treeRoot.shiftedIndex, 1, 0, world);
        }
		return super.onBlockDestroyed(itemstack, world, bID, x, y, z, entityliving);
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
	
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
        if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack))
        {
            return false;
        }
        else
        {
            UseHoeEvent event = new UseHoeEvent(par2EntityPlayer, par1ItemStack, par3World, par4, par5, par6);
            if (MinecraftForge.EVENT_BUS.post(event))
            {
                return false;
            }

            if (event.getResult() == Result.ALLOW)
            {
                par1ItemStack.damageItem(1, par2EntityPlayer);
                return true;
            }

            int var11 = par3World.getBlockId(par4, par5, par6);
            int var12 = par3World.getBlockId(par4, par5 + 1, par6);

            if ((par7 == 0 || var12 != 0 || var11 != Block.grass.blockID) && var11 != Block.dirt.blockID)
            {
                return false;
            }
            else
            {
                Block var13 = Block.tilledField;
                par3World.playSoundEffect((double)((float)par4 + 0.5F), (double)((float)par5 + 0.5F), (double)((float)par6 + 0.5F), var13.stepSound.getStepSound(), (var13.stepSound.getVolume() + 1.0F) / 2.0F, var13.stepSound.getPitch() * 0.8F);

                if (par3World.isRemote)
                {
                    return true;
                }
                else
                {
                    par3World.setBlockWithNotify(par4, par5, par6, var13.blockID);
                    par1ItemStack.damageItem(1, par2EntityPlayer);
                    return true;
                }
            }
        }
    }
}
