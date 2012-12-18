package pchan3;
import net.minecraft.src.Entity;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModelBase;
import net.minecraft.src.Render;

import org.lwjgl.opengl.GL11;

public class RenderSteamBoat extends Render
{

    public RenderSteamBoat()
    {
        shadowSize = 0.5F;
        model = new ModelSteamBoat();
    }

    public void func_157_a(EntitySteamBoat entityboat, double d, double d1, double d2, 
            float f, float f1)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        GL11.glRotatef(180F - f, 0.0F, 1.0F, 0.0F);
        float f2 = (float)entityboat.field_806_b - f1;
        float f3 = (float)entityboat.field_807_a - f1;
        if(f3 < 0.0F)
        {
            f3 = 0.0F;
        }
        if(f2 > 0.0F)
        {
            GL11.glRotatef(((MathHelper.sin(f2) * f2 * f3) / 10F) * (float)entityboat.field_808_c, 1.0F, 0.0F, 0.0F);
        }
        loadTexture("/terrain.png");
        float f4 = 0.75F;
        GL11.glScalef(f4, f4, f4);
        GL11.glScalef(1.0F / f4, 1.0F / f4, 1.0F / f4);
        loadTexture("/item/steamboat.png");
        GL11.glScalef(-1F, -1F, 1.0F);
        model.render(entityboat,0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
        GL11.glPopMatrix();
    }

    public void doRender(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
        func_157_a((EntitySteamBoat)entity, d, d1, d2, f, f1);
    }

    protected ModelBase model;
}
