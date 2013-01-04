package pchan3;

import net.minecraft.client.model.PositionTextureVertex;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.Tessellator;

import org.lwjgl.opengl.GL11;

public class CustomModelRenderer
{

    public CustomModelRenderer(int i, int j, int w, int h)
    {
        compiled = false;
        displayList = 0;
        mirror = false;
        field_1403_h = true;
        field_1402_i = false;
        textureOffsetX = i;
        textureOffsetY = j;
        texWidth = w;
        texHeight = h;
    }

    public void func_921_a(float f, float f1, float f2, int i, int j, int k)
    {
        addBox(f, f1, f2, i, j, k, 0.0F);
    }

    public void addBox(float f, float f1, float f2, int i, int j, int k, float f3)
    {
        corners = new PositionTextureVertex[8];
        faces = new CustomTexturedQuad[6];
        float f4 = f + (float)i;
        float f5 = f1 + (float)j;
        float f6 = f2 + (float)k;
        f -= f3;
        f1 -= f3;
        f2 -= f3;
        f4 += f3;
        f5 += f3;
        f6 += f3;
        if(mirror)
        {
            float f7 = f4;
            f4 = f;
            f = f7;
        }
        PositionTextureVertex PositionTextureVertex = new PositionTextureVertex(f, f1, f2, 0.0F, 0.0F);
        PositionTextureVertex PositionTextureVertex1 = new PositionTextureVertex(f4, f1, f2, 0.0F, 8F);
        PositionTextureVertex PositionTextureVertex2 = new PositionTextureVertex(f4, f5, f2, 8F, 8F);
        PositionTextureVertex PositionTextureVertex3 = new PositionTextureVertex(f, f5, f2, 8F, 0.0F);
        PositionTextureVertex PositionTextureVertex4 = new PositionTextureVertex(f, f1, f6, 0.0F, 0.0F);
        PositionTextureVertex PositionTextureVertex5 = new PositionTextureVertex(f4, f1, f6, 0.0F, 8F);
        PositionTextureVertex PositionTextureVertex6 = new PositionTextureVertex(f4, f5, f6, 8F, 8F);
        PositionTextureVertex PositionTextureVertex7 = new PositionTextureVertex(f, f5, f6, 8F, 0.0F);
        corners[0] = PositionTextureVertex;
        corners[1] = PositionTextureVertex1;
        corners[2] = PositionTextureVertex2;
        corners[3] = PositionTextureVertex3;
        corners[4] = PositionTextureVertex4;
        corners[5] = PositionTextureVertex5;
        corners[6] = PositionTextureVertex6;
        corners[7] = PositionTextureVertex7;
        faces[0] = new CustomTexturedQuad(new PositionTextureVertex[] {
            PositionTextureVertex5, PositionTextureVertex1, PositionTextureVertex2, PositionTextureVertex6
        }, textureOffsetX + k + i, textureOffsetY + k, textureOffsetX + k + i + k, textureOffsetY + k + j, texWidth, texHeight);
        faces[1] = new CustomTexturedQuad(new PositionTextureVertex[] {
            PositionTextureVertex, PositionTextureVertex4, PositionTextureVertex7, PositionTextureVertex3
        }, textureOffsetX + 0, textureOffsetY + k, textureOffsetX + k, textureOffsetY + k + j, texWidth, texHeight);
        faces[2] = new CustomTexturedQuad(new PositionTextureVertex[] {
            PositionTextureVertex5, PositionTextureVertex4, PositionTextureVertex, PositionTextureVertex1
        }, textureOffsetX + k, textureOffsetY + 0, textureOffsetX + k + i, textureOffsetY + k, texWidth, texHeight);
        faces[3] = new CustomTexturedQuad(new PositionTextureVertex[] {
            PositionTextureVertex2, PositionTextureVertex3, PositionTextureVertex7, PositionTextureVertex6
        }, textureOffsetX + k + i, textureOffsetY + 0, textureOffsetX + k + i + i, textureOffsetY + k, texWidth, texHeight);
        faces[4] = new CustomTexturedQuad(new PositionTextureVertex[] {
            PositionTextureVertex1, PositionTextureVertex, PositionTextureVertex3, PositionTextureVertex2
        }, textureOffsetX + k, textureOffsetY + k, textureOffsetX + k + i, textureOffsetY + k + j, texWidth, texHeight);
        faces[5] = new CustomTexturedQuad(new PositionTextureVertex[] {
            PositionTextureVertex4, PositionTextureVertex5, PositionTextureVertex6, PositionTextureVertex7
        }, textureOffsetX + k + i + k, textureOffsetY + k, textureOffsetX + k + i + k + i, textureOffsetY + k + j, texWidth, texHeight);
        if(mirror)
        {
            for(int l = 0; l < faces.length; l++)
            {
                faces[l].func_809_a();
            }

        }
    }

    public void setPosition(float f, float f1, float f2)
    {
        offsetX = f;
        offsetY = f1;
        offsetZ = f2;
    }

    public void render(float f)
    {
        if(field_1402_i)
        {
            return;
        }
        if(!field_1403_h)
        {
            return;
        }
        if(!compiled)
        {
            compileDisplayList(f);
        }
        if(rotateAngleX != 0.0F || rotateAngleY != 0.0F || rotateAngleZ != 0.0F)
        {
            GL11.glPushMatrix();
            GL11.glTranslatef(offsetX * f, offsetY * f, offsetZ * f);
            if(rotateAngleZ != 0.0F)
            {
                GL11.glRotatef(rotateAngleZ * 57.29578F, 0.0F, 0.0F, 1.0F);
            }
            if(rotateAngleY != 0.0F)
            {
                GL11.glRotatef(rotateAngleY * 57.29578F, 0.0F, 1.0F, 0.0F);
            }
            if(rotateAngleX != 0.0F)
            {
                GL11.glRotatef(rotateAngleX * 57.29578F, 1.0F, 0.0F, 0.0F);
            }
            GL11.glCallList(displayList);
            GL11.glPopMatrix();
        } else
        if(offsetX != 0.0F || offsetY != 0.0F || offsetZ != 0.0F)
        {
            GL11.glTranslatef(offsetX * f, offsetY * f, offsetZ * f);
            GL11.glCallList(displayList);
            GL11.glTranslatef(-offsetX * f, -offsetY * f, -offsetZ * f);
        } else
        {
            GL11.glCallList(displayList);
        }
    }

    public void func_926_b(float f)
    {
        if(field_1402_i)
        {
            return;
        }
        if(!field_1403_h)
        {
            return;
        }
        if(!compiled)
        {
            compileDisplayList(f);
        }
        if(rotateAngleX != 0.0F || rotateAngleY != 0.0F || rotateAngleZ != 0.0F)
        {
            GL11.glTranslatef(offsetX * f, offsetY * f, offsetZ * f);
            if(rotateAngleZ != 0.0F)
            {
                GL11.glRotatef(rotateAngleZ * 57.29578F, 0.0F, 0.0F, 1.0F);
            }
            if(rotateAngleY != 0.0F)
            {
                GL11.glRotatef(rotateAngleY * 57.29578F, 0.0F, 1.0F, 0.0F);
            }
            if(rotateAngleX != 0.0F)
            {
                GL11.glRotatef(rotateAngleX * 57.29578F, 1.0F, 0.0F, 0.0F);
            }
        } else
        if(offsetX != 0.0F || offsetY != 0.0F || offsetZ != 0.0F)
        {
            GL11.glTranslatef(offsetX * f, offsetY * f, offsetZ * f);
        }
    }

    private void compileDisplayList(float f)
    {
        displayList = GLAllocation.generateDisplayLists(1);
        GL11.glNewList(displayList, 4864 /*GL_COMPILE*/);
        Tessellator tessellator = Tessellator.instance;
        for(int i = 0; i < faces.length; i++)
        {
            faces[i].func_808_a(tessellator, f);
        }

        GL11.glEndList();
        compiled = true;
    }

    private PositionTextureVertex corners[];
    private CustomTexturedQuad faces[];
    private int textureOffsetX;
    private int textureOffsetY;
    public float offsetX;
    public float offsetY;
    public float offsetZ;
    public float rotateAngleX;
    public float rotateAngleY;
    public float rotateAngleZ;
    private boolean compiled;
    private int displayList;
    public boolean mirror;
    public boolean field_1403_h;
    public boolean field_1402_i;
    private int texWidth;
    private int texHeight;
}
