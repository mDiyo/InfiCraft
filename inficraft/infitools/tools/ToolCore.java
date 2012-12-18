package inficraft.infitools.tools;

import inficraft.infitools.AbilityHelper;
import inficraft.infitools.InfiTools;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

/* NBTTags
 * Main tag - InfiTool
 * 
 * Required:
 * Head: Render tag, above the handle
 * Handle: Render tag, bottom layer
 * 
 * Damage: Replacement for metadata
 * MaxDamage: ItemStacks only read setMaxDamage()
 * Broken: Represents whether the tool is broken (boolean)
 * 
 * Others: 
 * Accessory: Render tag, above head. Sword guards, binding, etc
 * Effects: Render tag, top layer. Fancy effects like moss or diamond edge.
 * Render order: Handle > Head > Accessory > Effect1 > Effect2 > Effect3
 * 
 * Durability: 10% chance to not use damage per level
 * Shoddy
 * Spiny
 * Awareness
 */

public class ToolCore extends ItemTool
{
	Random random = new Random();
	
	public ToolCore(int itemID)
	{
		super(itemID, 0, EnumToolMaterial.WOOD, new Block[] {});
		this.maxStackSize = 1;
		this.setItemName("InfiTool");
		this.setCreativeTab(InfiTools.tab);
	}

	/* Texture */
	@Override
	public String getTextureFile()
	{
		return InfiTools.pickaxeTexture;
	}

	/* Rendering */
	@SideOnly(Side.CLIENT)
	public boolean requiresMultipleRenderPasses()
	{
		return true;
	}

	@SideOnly(Side.CLIENT)
	public int getRenderPasses(int metadata)
	{
		return 3; //6 late
	}

	@SideOnly(Side.CLIENT)
	public int getIconFromItemStackForMultiplePasses(ItemStack stack, int pass)
	{
		if (!stack.hasTagCompound())
			return 255;

		NBTTagCompound tags = stack.getTagCompound();
		if (tags.hasKey("InfiTool"))
		{
			if (pass == 0) // Handle
			{
				return tags.getCompoundTag("InfiTool").getInteger("Handle");
			}

			if (pass == 1) // Blade
			{
				if (tags.getCompoundTag("InfiTool").getBoolean("Broken"))
					return tags.getCompoundTag("InfiTool").getInteger("Head") + 192;
				
				return tags.getCompoundTag("InfiTool").getInteger("Head") + 64;
			}
			
			if (pass == 2) // Guard
				return tags.getCompoundTag("InfiTool").getInteger("Accessory") + 32;

			if (pass == 3)
			{
				if (tags.getCompoundTag("InfiTool").hasKey("Effect1"))
					return tags.getCompoundTag("InfiTool").getInteger("Effect") + 240;
				else
					return 255;
			}

			if (pass == 4)
			{
				if (tags.getCompoundTag("InfiTool").hasKey("Effect2"))
					return tags.getCompoundTag("InfiTool").getInteger("Effect2") + 240;
				else
					return 255;
			}
			
			if (pass == 5)
			{
				if (tags.getCompoundTag("InfiTool").hasKey("Effect3"))
					return tags.getCompoundTag("InfiTool").getInteger("Effect3") + 240;
				else
					return 255;
			}
		}

		return 255; //Keep 255 blank
	}
	
	/* Tags and information about the tool */
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
	{
		if (!stack.hasTagCompound())
			return;

		NBTTagCompound tags = stack.getTagCompound();
		if (tags.hasKey("InfiTool"))
		{
			boolean broken = tags.getCompoundTag("InfiTool").getBoolean("Broken");
			if (broken)
				list.add("\u00A7oBroken");
			else
			{
				int head = tags.getCompoundTag("InfiTool").getInteger("Head")+1;
				int handle = tags.getCompoundTag("InfiTool").getInteger("Handle")+1;
				int binding = tags.getCompoundTag("InfiTool").getInteger("Binding")+1;
				
				String headName = getAbilityNameForType(head);
				if (headName != "")
					list.add( getColorCodeForType(head)+headName);
				String handleName =  getAbilityNameForType(handle);
				if (handleName != "" && handleName != headName)
					list.add( getColorCodeForType(handle)+handleName);
				String bindingName =  getAbilityNameForType(binding);
				if (bindingName != "" && bindingName != headName && bindingName != handleName)
					list.add( getColorCodeForType(binding)+bindingName);
			}
		}
	}
	
	public static String getColorCodeForType(int type)
	{
		String colorCode = "\u00A7";
		switch(type)
		{
		case 1: return colorCode + "e"; //Wood
		case 2: return ""; //Stone
		case 3: return colorCode + "f"; //Iron
		case 4: return colorCode + "8"; //Flint
		case 5: return colorCode + "2"; //Cactus
		case 6: return colorCode + "d"; //Obsidian
		case 7: return colorCode + "e"; //Bone
		case 8: return colorCode + "a"; //Slime
		case 9: return colorCode + "f"; //Paper
		case 10: return colorCode + "4"; //Netherrack
		case 11: return colorCode + "1"; //Cobalt
		case 12: return colorCode + "4"; //Ardite
		case 13: return colorCode + "5"; //Manyullyn
		}
		return colorCode;
	}
	
	public static String getAbilityNameForType(int type)
	{
		switch(type)
		{
		case 1: return ""; //Wood
		case 2: return "Shoddy"; //Stone
		case 3: return "Durability I"; //Iron
		case 4: return "Shoddy"; //Flint
		case 5: return "Spiny"; //Cactus
		case 6: return "Durability II"; //Obsidian
		case 7: return ""; //Bone
		case 8: return ""; //Slime
		case 9: return "Effective"; //Paper
		case 10: return "Shoddy"; //Netherrack
		case 11: return "Durability II"; //Cobalt
		case 12: return ""; //Ardite
		case 13: return "Awareness"; //Manyullyn
		default: return "";
		}
	}
	
	/* Creative mode tools */
    public void getSubItems(int id, CreativeTabs tab, List list)
    {
		System.out.println("Adding subitems");
		for (int i = 0; i < 13; i++)
			list.add(getDefaultItem(id, i));
    }
	
	ItemStack getDefaultItem(int id, int type)
	{
		ItemStack tool = new ItemStack(id, 1, 0);

		NBTTagCompound compound = new NBTTagCompound();
		compound.setCompoundTag("InfiTool", new NBTTagCompound());
		compound.getCompoundTag("InfiTool").setInteger("Head", type);
		compound.getCompoundTag("InfiTool").setInteger("Handle", 0);
		compound.getCompoundTag("InfiTool").setInteger("Accessory", type);
		
		compound.getCompoundTag("InfiTool").setInteger("Damage", 0);
		compound.getCompoundTag("InfiTool").setInteger("MaxDamage", 20);
		compound.getCompoundTag("InfiTool").setBoolean("Broken", false);
		
		compound.getCompoundTag("display").setString("Name", "Sword of Testing");
		tool.setTagCompound(compound);
		return tool;
	}
	
	/* Tool uses */
	@Override
	public boolean onBlockDestroyed(ItemStack itemstack, World world, int bID, int x, int y, int z, EntityLiving player)
	{
		return AbilityHelper.onBlockDestroyed(itemstack, world, bID, x, y, z, player, random);
	}
	
	@Override
	public boolean hitEntity(ItemStack itemstack, EntityLiving mob, EntityLiving player)
	{
		return false;
	}
	
	@Override
	public float getStrVsBlock(ItemStack stack, Block block, int meta)
	{
		NBTTagCompound tags = stack.getTagCompound();
		if (tags.getCompoundTag("InfiTool").getBoolean("Broken"))
			return 0.1f;
		return 1f;
	}
	
	/* Updating */
	@Override
	public void onUpdate(ItemStack stack, World world, Entity entity, int par4, boolean par5)
	{
		
	}
	
	/* Enchanting */
	public int getItemEnchantability()
	{
		return 0;
	}
}
