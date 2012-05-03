package net.minecraft.src.orizondim.mobs;
import net.minecraft.src.*;

public class NightmareCreeperModel extends ModelBase
{
    public ModelRenderer head;
    public ModelRenderer field_1270_b;
    public ModelRenderer body;
    public ModelRenderer leg1;
    public ModelRenderer leg2;
    public ModelRenderer leg3;
    public ModelRenderer leg4;

    public NightmareCreeperModel()
    {
        this(0.0F);
    }

    public NightmareCreeperModel(float par1)
    {
        byte var2 = 0;
        this.head = new ModelRenderer(this, 0, 0);
        this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, par1+1.0F);
        this.head.setRotationPoint(0.0F, (float)var2-27, 0.0F);
        this.field_1270_b = new ModelRenderer(this, 32, 0);
        this.field_1270_b.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, par1 + 0.5F);
        this.field_1270_b.setRotationPoint(0.0F, (float)var2, 0.0F);
        this.body = new ModelRenderer(this, 16, 16);
        this.body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, par1+1.0F);
        this.body.setRotationPoint(0.0F, (float)var2-13, 0.0F);
        this.leg1 = new ModelRenderer(this, 0, 16);
        this.leg1.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, par1-1);
        this.leg1.setRotationPoint(-10.0F, (float)(12 + var2), 12.0F);
        this.leg2 = new ModelRenderer(this, 0, 16);
        this.leg2.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, par1-1);
        this.leg2.setRotationPoint(10.0F, (float)(12 + var2), 12.0F);
        this.leg3 = new ModelRenderer(this, 0, 16);
        this.leg3.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, par1-1);
        this.leg3.setRotationPoint(-10.0F, (float)(12 + var2), -12.0F);
        this.leg4 = new ModelRenderer(this, 0, 16);
        this.leg4.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, par1-1);
        this.leg4.setRotationPoint(10.0F, (float)(12 + var2), -12.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
    {
        this.setRotationAngles(par2, par3, par4, par5, par6, par7);
        this.head.render(par7);
        this.body.render(par7);
        this.leg1.render(par7);
        this.leg2.render(par7);
        this.leg3.render(par7);
        this.leg4.render(par7);
    }

    /**
     * Sets the models various rotation angles.
     */
    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6)
    {
        this.head.rotateAngleY = par4 / (180F / (float)Math.PI);
        this.head.rotateAngleX = par5 / (180F / (float)Math.PI);
        this.leg1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
        this.leg2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
        this.leg3.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
        this.leg4.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
    }
}
