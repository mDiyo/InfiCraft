package inficraft.infiblocks.tech;

import inficraft.api.machines.BlockLogicMachine;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet132TileEntityData;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.ISidedInventory;
import cpw.mods.fml.common.registry.GameRegistry;

public class FurnaceLogic extends BlockLogicMachine
    implements ISidedInventory
{
    public short fuel;
    public short fuelGague;
    public short progress;

    public FurnaceLogic()
    {
        super(3);
        fuel = 0;
        fuelGague = 0;
        progress = 0;
    }

    public void readFromNBT(NBTTagCompound nbttagcompound)
    {
        super.readFromNBT(nbttagcompound);
        fuel = nbttagcompound.getShort("fuel");
        fuelGague = nbttagcompound.getShort("fuelGague");
    }

    public void writeToNBT(NBTTagCompound nbttagcompound)
    {
        super.writeToNBT(nbttagcompound);
        nbttagcompound.setShort("fuel", fuel);
        nbttagcompound.setShort("fuelGague", fuelGague);
    }

    public int gaugeProgressScaled(int i)
    {
        return (progress * i) / 200;
    }

    public int gaugeFuelScaled(int i)
    {
        if (fuelGague == 0)
        {
            fuelGague = fuel;
            if (fuelGague == 0)
            {
                fuelGague = 200;
            }
        }
        return (fuel * i) / fuelGague;
    }

    public void updateEntity()
    {
        super.updateEntity();
        boolean flag = isBurning();
        boolean flag1 = false;
        if (fuel <= 0 && canOperate())
        {
            fuel = fuelGague = getItemBurnTime(inventory[1]);
            if (fuel > 0)
            {
                if (inventory[1].getItem().hasContainerItem())
                {
                    inventory[1] = new ItemStack(inventory[1].getItem().getContainerItem());
                }
                else
                {
                    inventory[1].stackSize--;
                }
                if (inventory[1].stackSize <= 0)
                {
                    inventory[1] = null;
                }
                flag1 = true;
            }
        }
        if (isBurning() && canOperate())
        {
            progress++;
            if (progress >= 200)
            {
                progress = 0;
                operate();
                flag1 = true;
            }
        }
        else
        {
            progress = 0;
        }
        if (fuel > 0)
        {
            fuel--;
        }
        if (flag != isBurning())
        {
            setActive(isBurning());
            flag1 = true;
        }
        if (flag1)
        {
            onInventoryChanged();
        }
    }

    public void operate()
    {
        if (!canOperate())
        {
            return;
        }
        ItemStack itemstack = getResultFor(inventory[0]);
        if (inventory[2] == null)
        {
            inventory[2] = itemstack.copy();
        }
        else
        {
            inventory[2].stackSize += itemstack.stackSize;
        }
        if (inventory[0].getItem().hasContainerItem())
        {
            inventory[0] = new ItemStack(inventory[0].getItem().getContainerItem());
        }
        else
        {
            inventory[0].stackSize--;
        }
        if (inventory[0].stackSize <= 0)
        {
            inventory[0] = null;
        }
    }

    public boolean isBurning()
    {
        return fuel > 0;
    }

    public boolean canOperate()
    {
        if (inventory[0] == null)
        {
            return false;
        }
        ItemStack itemstack = getResultFor(inventory[0]);
        if (itemstack == null)
        {
            return false;
        }
        if (inventory[2] == null)
        {
            return true;
        }
        if (!inventory[2].isItemEqual(itemstack))
        {
            return false;
        }
        else
        {
            return inventory[2].stackSize + itemstack.stackSize <= inventory[2].getMaxStackSize();
        }
    }

    //TODO: Change fuel value to int
    public static short getItemBurnTime(ItemStack par0ItemStack)
    {
        if (par0ItemStack == null)
        {
            return 0;
        }
        else
        {
            int var1 = par0ItemStack.getItem().itemID;
            Item var2 = par0ItemStack.getItem();

            if (par0ItemStack.getItem() instanceof ItemBlock && Block.blocksList[var1] != null)
            {
                Block var3 = Block.blocksList[var1];

                if (var3 == Block.woodSingleSlab)
                {
                    return 150;
                }

                if (var3.blockMaterial == Material.wood)
                {
                    return 300;
                }
            }
            if (var2 instanceof ItemTool && ((ItemTool) var2).getToolMaterialName().equals("WOOD")) return 200;
            if (var2 instanceof ItemSword && ((ItemSword) var2).func_77825_f().equals("WOOD")) return 200;
            if (var2 instanceof ItemHoe && ((ItemHoe) var2).func_77842_f().equals("WOOD")) return 200;
            if (var1 == Item.stick.itemID) return 100;
            if (var1 == Item.coal.itemID) return 1600;
            if (var1 == Item.bucketLava.itemID) return 20000;
            if (var1 == Block.sapling.blockID) return 100;
            if (var1 == Item.blazeRod.itemID) return 2400;
            return (short) GameRegistry.getFuelValue(par0ItemStack);
        }
    }

    public ItemStack getResultFor(ItemStack itemstack)
    {
        return FurnaceRecipes.smelting().getSmeltingResult(itemstack);
    }

    public String getInvName()
    {
        return "InfiFurnace";
    }

    public Container getGuiContainer(InventoryPlayer inventoryplayer)
    {
        return new FurnaceContainer(inventoryplayer, this);
    }

    public int getStartInventorySide(int i)
    {
        switch (i)
        {
            case 0:
                return 1;

            case 1:
                return 0;
        }
        return 2;
    }

    public int getSizeInventorySide(int i)
    {
        return 1;
    }

	@Override
	public ItemStack getStackInSlotOnClosing(int var1) {
		// TODO Auto-generated method stub
		return null;
	}
	
	//TODO: Switch old inventory sides to this

	@Override
	public int getStartInventorySide(ForgeDirection side) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSizeInventorySide(ForgeDirection side) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public Packet getDescriptionPacket()
    {
    	NBTTagCompound compound = new NBTTagCompound();
        this.writeToNBT(compound);
        return new Packet132TileEntityData(this.xCoord, this.yCoord, this.zCoord, 1, compound);
    }
	
	@Override
	public void onDataPacket(INetworkManager net, Packet132TileEntityData pkt)
	{
		NBTTagCompound compundTag = pkt.customParam1;
		facing = compundTag.getByte("facing");
		active = compundTag.getBoolean("active");
		fuel = compundTag.getShort("fuel");
        fuelGague = compundTag.getShort("fuelGague");
	}
}
