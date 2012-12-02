package mDiyo.inficraft.infitools.hybrids;

import java.util.List;

import mDiyo.inficraft.infitools.library.InfiMaterialEnum;
import mDiyo.inficraft.infitools.library.InfiWeaponCore;
import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.BlockFlower;
import net.minecraft.src.DamageSource;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EnumAction;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.MathHelper;
import net.minecraft.src.World;
import net.minecraftforge.common.ForgeHooks;

public class InfiToolScythe extends InfiWeaponCore
{
    private static Material materialEffectiveAgainst[];

    public InfiToolScythe(int itemID, InfiMaterialEnum head, InfiMaterialEnum handle, String internalName)
    {
    	super(itemID, 4, head, handle, internalName);
    }

    public String getTextureFile()
    {
        return "/infitextures/scythes.png";
    }
    
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
        if((entityplayer.capabilities.isCreativeMode)) {
        	onPlayerStoppedUsing(itemstack, world, entityplayer, 400);
        } else {
        	entityplayer.setItemInUse(itemstack, getMaxItemUseDuration(itemstack));
        }
        return itemstack;
    }
    
    @Override
    public void onPlayerStoppedUsing(ItemStack itemstack, World world, EntityPlayer entityplayer, int useTime)
    {
    	if (useTime < 10)
        {
            return;
        }
    	
    	int facing = MathHelper.floor_double((double)(entityplayer.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if (facing == 0)
        {
            this.reap(itemstack, world, entityplayer,
            		entityplayer.posX -2, entityplayer.posY - 2, entityplayer.posZ,
            		entityplayer.posX + 2, entityplayer.posY, entityplayer.posZ +3);
        }

        if (facing == 1)
        {
        	this.reap(itemstack, world, entityplayer,
            		entityplayer.posX -3, entityplayer.posY - 2, entityplayer.posZ -3,
            		entityplayer.posX, entityplayer.posY, entityplayer.posZ +1);
        }

        if (facing == 2)
        {
        	this.reap(itemstack, world, entityplayer,
            		entityplayer.posX - 2, entityplayer.posY - 2, entityplayer.posZ -3,
            		entityplayer.posX + 2, entityplayer.posY, entityplayer.posZ);
        }

        if (facing == 3)
        {
        	this.reap(itemstack, world, entityplayer,
            		entityplayer.posX, entityplayer.posY - 2, entityplayer.posZ -3,
            		entityplayer.posX +3, entityplayer.posY, entityplayer.posZ +1);
        }
    	entityplayer.swingItem();
    }
    
    private void reap(ItemStack itemstack, World world, EntityPlayer entityplayer, 
    		double minX, double minY, double minZ, double maxX, double maxY, double maxZ)
    {
    	int reaped = 0;
    	for (int x = (int)minX; x <= (int)maxX; x++)
    	{
    		for (int y = (int)minY; y <= (int)maxY; y++)
    		{
    			for (int z = (int)minZ; z <= (int)maxZ; z++)
    			{
    				int bID = world.getBlockId(x, y, z);
    				int md = world.getBlockMetadata(x, y, z);
    		        if (bID == Block.crops.blockID && md !=0)
    		        {
        		        Block crops = Block.blocksList[Block.crops.blockID];
	    		        crops.harvestBlock(world, entityplayer, x, y, z, md);
	    		        world.playAuxSFX(2001, x, y, z, bID + (md << 12));
	    		        
	    		        onBlockDestroyed(itemstack, bID, x, y, z, entityplayer);
	    		        if (md == 7)
	    		        {
	    		        	world.setBlockWithNotify(x, y, z, 0);
	    		        }
	    		        else
	    		        {
	    		        	world.setBlockWithNotify(x, y, z, Block.crops.blockID);
	    		        }
	    		        reaped++;
    		        }
    		        Block isflower = Block.blocksList[bID];
    		        if (isflower instanceof BlockFlower)
    		        {
    		        	isflower.harvestBlock(world, entityplayer, x, y, z, md);
	    		        world.playAuxSFX(2001, x, y, z, bID + (md << 12));
	    		        world.setBlockWithNotify(x, y, z, 0);
	    		        reaped++;
    		        }
    			}
    		}
    	}
    	
    	List mobsToAttack = world.getEntitiesWithinAABB(EntityLiving.class, AxisAlignedBB.getBoundingBox(minX, minY, minZ, maxX, maxY, maxZ));
    	for (int i = 0; i < mobsToAttack.size(); i++)
    	{
    		EntityLiving mob = (EntityLiving)mobsToAttack.get(i);
    		if (mob != entityplayer)
    		{
    			mob.attackEntityFrom(DamageSource.causePlayerDamage(entityplayer), this.getDamageVsEntity(mob));
    			this.hitEntity(itemstack, mob, entityplayer);
    		}
    	}
    	
    	itemstack.damageItem(reaped/3, entityplayer);
    }
    
    public int getMaxItemUseDuration(ItemStack itemstack)
    {
        return 32000;
    }
    
    public EnumAction getItemUseAction(ItemStack itemstack)
    {
        return EnumAction.bow;
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
        if(bID == Block.grass.blockID)
        {
            world.playAuxSFX(2001, x, y, z, bID + (md << 12));
            world.setBlockWithNotify(x, y, z, Block.dirt.blockID);
            onBlockDestroyed(itemstack, bID, x, y, z, entityplayer);
            return true;
        }
        else if (bID == Block.tallGrass.blockID)
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
    
    public float getStrVsBlock(ItemStack itemstack, Block block, int meta)
	{
    	if (itemstack.stackSize == 0)
    	{
    		itemstack = null;
    		return -1.0F;
    	}
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

    static
    {
        materialEffectiveAgainst = (new Material[]
        {
        	Material.pumpkin, Material.grass, Material.plants
        });
    }

	@Override
	public String getInvName() 
	{
		return "Scythe";
	}
}
