package net.minecraft.src.infirange;
import net.minecraft.src.Entity;
import net.minecraft.src.Tessellator;

import org.lwjgl.opengl.GL11;

public class SpearRender extends InfiRenderBase
{

    public SpearRender()
    {
    }

    public void doRender(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
        doRender((SpearEntity)entity, d, d1, d2, f, f1);
    }

    public void doRender(SpearEntity spear, double d, double d1, double d2, 
            float f, float f1)
    {
        float f2 = spear.prevRotationPitch + (spear.rotationPitch - spear.prevRotationPitch) * f1;
        float f3 = spear.prevBoomerangRotation + (spear.boomerangRotation - spear.prevBoomerangRotation) * f1 * 1.1F;
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        GL11.glRotatef(f, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(-f2, 1.0F, 0.0F, 0.0F);
        if(!spear.inGround)
        {
            GL11.glRotatef(f3, 0.0F, 0.0F, 1.0F);
        }
        GL11.glRotatef(-45F, 0.0F, 1.0F, 0.0F);
        loadTexture("/infirange/spears.png");
        Tessellator tessellator = Tessellator.instance;
        int i = spear.texID;
        float f4 = ((float)((i % 16) * 16) + 0.0F) / 256F;
        float f5 = ((float)((i % 16) * 16) + 15.99F) / 256F;
        float f6 = ((float)((i / 16) * 16) + 0.0F) / 256F;
        float f7 = ((float)((i / 16) * 16) + 15.99F) / 256F;
        float f8 = 1.0F;
        GL11.glEnable(32826 /*GL_RESCALE_NORMAL_EXT*/);
        float f9 = 0.0625F;
        GL11.glTranslatef(-0.5F, 0.0F, -0.5F);
        renderItem(tessellator, f4, f5, f6, f7, f8, f9);
        i = spear.tex2ID;
        f4 = ((float)((i % 16) * 16) + 0.0F) / 256F;
        f5 = ((float)((i % 16) * 16) + 15.99F) / 256F;
        f6 = ((float)((i / 16) * 16) + 0.0F) / 256F;
        f7 = ((float)((i / 16) * 16) + 15.99F) / 256F;
        renderItem(tessellator, f4, f5, f6, f7, f8, f9);
        GL11.glDisable(32826 /*GL_RESCALE_NORMAL_EXT*/);
        GL11.glPopMatrix();
    }
}
