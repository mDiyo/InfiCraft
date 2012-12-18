package inficraft.infitools.tools;

import inficraft.infitools.EnumMaterial;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;

public abstract class HarvestTool extends ToolCore
{

	public HarvestTool(int itemID)
	{
		super(itemID);
	}
	
	@Override
	public boolean onBlockStartBreak(ItemStack stack, int x, int y, int z, EntityPlayer player)
	{
		NBTTagCompound tags = stack.getTagCompound();
		World world = player.worldObj;
		int bID = player.worldObj.getBlockId(x, y, z);
		int meta = world.getBlockMetadata(x, y, z);
		Block block = Block.blocksList[bID];
		int hlvl = MinecraftForge.getBlockHarvestLevel(block, meta, "pickaxe");
		
		onBlockDestroyed(stack, world, bID, x, y, z, player);
		
		if (hlvl < EnumMaterial.harvestLevel(tags.getCompoundTag("InfiTool").getInteger("Head")))
			return false;
		else
		{
			world.setBlockWithNotify(x, y, z, 0);
			if (!world.isRemote)
				world.playAuxSFX(2001, x, y, z, bID + (meta << 12));
			return true;
		}
	}

	@Override
	public float getStrVsBlock(ItemStack stack, Block block, int meta)
	{

		NBTTagCompound tags = stack.getTagCompound();
		if (tags.getCompoundTag("InfiTool").getBoolean("Broken"))
			return 0.1f;
		
		Material[] materials = getEffectiveMaterials();
		for (int i = 0; i < materials.length; i++)
		{
			if (materials[i] == block.blockMaterial )
			{				
				int headType = tags.getCompoundTag("InfiTool").getInteger("Head");
				float speed = EnumMaterial.toolSpeed(headType);				
				int hlvl = MinecraftForge.getBlockHarvestLevel(block, meta, "pickaxe");
				
				if (hlvl <= EnumMaterial.harvestLevel(headType))
					return speed;
				return 0.1f;
			}
		}
		return super.getStrVsBlock(stack, block, meta);
	}
	
	protected abstract Material[] getEffectiveMaterials();
}
