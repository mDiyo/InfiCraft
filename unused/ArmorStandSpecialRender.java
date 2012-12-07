package mDiyo.inficraft.armory;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EnumArmorMaterial;
import net.minecraft.src.Item;
import net.minecraft.src.ItemArmor;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModelBiped;
import net.minecraft.src.TileEntity;
import net.minecraft.src.TileEntitySpecialRenderer;
import net.minecraftforge.client.ForgeHooksClient;

@SideOnly(Side.CLIENT)
public class ArmorStandSpecialRender  extends TileEntitySpecialRenderer
{
	ModelBiped model;
    ModelBiped modelChestplate;
    public static String[] armorFilenamePrefix = new String[] {"cloth", "chain", "iron", "diamond", "gold"};
    
    public ArmorStandSpecialRender()
    {
    	this.model = new ModelBiped(0.5F);
    	this.modelChestplate = new ModelBiped(1.0F);        
    }

	@Override
	public void renderTileEntityAt(TileEntity logic, double x, double y, double z, float var8) 
	{
		this.renderStand((ArmorStandLogic)logic, x, y, z, var8);
	}

	void renderStand(ArmorStandLogic logic, double x, double y, double z, float var8)
	{
		if (logic.hasChanged())
			updateArmorModels(logic.getItems());			
		
		//model.render(null, (float)x, (float)y, (float)z, 0, 0, 0.0625F);
		model.render(null, 0, 0, 0, 0, 0, 0.0625F);
		//modelChestplate.render(null, (float)x, (float)y, (float)z, 0, 0, 0.0625F);
	}	
	
	void updateArmorModels(ItemStack[] inv)
	{
		for (int i = 0; i < 4; i++)
			setArmorModel(inv[i], i);
	}

	protected int setArmorModel(ItemStack stack, int slot)
    {
        if (stack != null)
        {
            Item item = stack.getItem();

            if (item instanceof ItemArmor)
            {
                ItemArmor armor = (ItemArmor)item;
                this.bindTextureByName(ForgeHooksClient.getArmorTexture(stack, "/armor/" + armorFilenamePrefix[armor.renderIndex] + "_" + (slot == 2 ? 2 : 1) + ".png"));
                ModelBiped standModel = slot == 2 ? this.model : this.modelChestplate;
                standModel.bipedHead.showModel = slot == 0;
                standModel.bipedHeadwear.showModel = slot == 0;
                standModel.bipedBody.showModel = slot == 1 || slot == 2;
                standModel.bipedRightArm.showModel = slot == 1;
                standModel.bipedLeftArm.showModel = slot == 1;
                standModel.bipedRightLeg.showModel = slot == 2 || slot == 3;
                standModel.bipedLeftLeg.showModel = slot == 2 || slot == 3;
                //this.setRenderPassModel(var7);

                float var8 = 1.0F;

                if (armor.getArmorMaterial() == EnumArmorMaterial.CLOTH)
                {
                    int var9 = armor.getColor(stack);
                    float var10 = (float)(var9 >> 16 & 255) / 255.0F;
                    float var11 = (float)(var9 >> 8 & 255) / 255.0F;
                    float var12 = (float)(var9 & 255) / 255.0F;
                    GL11.glColor3f(var8 * var10, var8 * var11, var8 * var12);

                    if (stack.isItemEnchanted())
                    {
                        return 31;
                    }

                    return 16;
                }

                GL11.glColor3f(var8, var8, var8);

                if (stack.isItemEnchanted())
                {
                    return 15;
                }

                return 1;
            }
        }

        return -1;
    }
}
