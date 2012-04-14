// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

package net.minecraft.src.timberframes;

import java.util.Random;

import net.minecraft.src.Entity;
import net.minecraft.src.MathHelper;
import net.minecraft.src.Render;
import net.minecraft.src.Tessellator;

import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            Render, EntityBeams, EnumBeams, Tessellator, 
//            MathHelper, RenderManager, World, Entity

public class RenderBeams_Kaevator extends Render
{

    public RenderBeams_Kaevator()
    {    
        rand = new Random();        
    }    

    public void func_158_a(EntityBeams_Kaevator entitybeams, double d, double d1, double d2, 
            float f, float f1)
    {    	
        rand.setSeed(187L);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        GL11.glRotatef(f, 0.0F, 1.0F, 0.0F);
        GL11.glEnable(32826 /*GL_RESCALE_NORMAL_EXT*/);        
        loadTexture("/kaevator/beamsTextures.png");
        
        EnumBeams_Kaevator enumbeams = entitybeams.beams;        
        func_159_a(entitybeams, enumbeams);        
        GL11.glDisable(32826 /*GL_RESCALE_NORMAL_EXT*/);
        GL11.glPopMatrix();
    }

    private void func_159_a(EntityBeams_Kaevator entitybeams, EnumBeams_Kaevator enumbeams)
    {
    	GL11.glScalef(enumbeams.sizeX/256.0F+0.001F, enumbeams.sizeY/256.0F+0.001F, 1.0F/16.0F);
    	float f = -8.0F;
    	float f1 = -8.0F;
    	 	
    	
    	EnumPlanks_Kaevator lPlanks[] = EnumPlanks_Kaevator.values();
    	Tessellator tessellator = Tessellator.instance;		      	
    	
    	for (int iPlank = 0; iPlank < enumbeams.planks.length; iPlank++){ 
    		
    		int lCurPlank = enumbeams.planks[iPlank]; 
    		float f2 = lPlanks[lCurPlank].Zfront;
        	float f3 = lPlanks[lCurPlank].Zback; 
    		float f4 = 0.5F*entitybeams.material;
        	float f5 = 0.5F*(entitybeams.material+lPlanks[lCurPlank].TexSize);
        	float f5_2 = 0.5F*(entitybeams.material+0.5F);
        	if(!enumbeams.isCollidable){
        		f5_2 = 0.5F*(entitybeams.material+1.0F);
        	}        	        	
        	
        	float lFactorX = (float)enumbeams.sizeX/16.0F;
        	float lFactorY = (float)enumbeams.sizeY/16.0F;
        	float lSide1 = (float) Math.sqrt(Math.pow(((float)lPlanks[lCurPlank].X2-(float)lPlanks[lCurPlank].X1)*lFactorX,2)+Math.pow(((float)lPlanks[lCurPlank].Y2-(float)lPlanks[lCurPlank].Y1)*lFactorY,2));
        	float lSide2 = (float) Math.sqrt(Math.pow(((float)lPlanks[lCurPlank].X4-(float)lPlanks[lCurPlank].X3)*lFactorX,2)+Math.pow(((float)lPlanks[lCurPlank].Y4-(float)lPlanks[lCurPlank].Y3)*lFactorY,2));    	
        	float lTexWrap = (lSide2-lSide1)/(lSide2*2.0F);    	
        	float lTexHeight = lSide2/32.0F;
        	
        	float f6 = lTexWrap*lTexHeight;
        	float f7 = (1.0F-lTexWrap)*lTexHeight;
        	float f8 = lTexHeight;
        	float f9 = 0.0F;        	
    		
    		tessellator.startDrawingQuads();    	
    		func_160_a(entitybeams, entitybeams.red, entitybeams.green, entitybeams.blue);
    		tessellator.setBrightness(240);
    		
    		tessellator.setNormal(0.0F, 0.0F, -1.0F);
    		tessellator.addVertexWithUV(f+lPlanks[lCurPlank].X1, f1+lPlanks[lCurPlank].Y1, f2, f4, f6);
    		tessellator.addVertexWithUV(f+lPlanks[lCurPlank].X2, f1+lPlanks[lCurPlank].Y2, f2, f4, f7);
			tessellator.addVertexWithUV(f+lPlanks[lCurPlank].X3, f1+lPlanks[lCurPlank].Y3, f2, f5, f8);
			tessellator.addVertexWithUV(f+lPlanks[lCurPlank].X4, f1+lPlanks[lCurPlank].Y4, f2, f5, f9);
			
			tessellator.setNormal(0.0F, 0.0F, 1.0F);
			tessellator.addVertexWithUV(f+lPlanks[lCurPlank].X4, f1+lPlanks[lCurPlank].Y4, f3, f5, f9);
			tessellator.addVertexWithUV(f+lPlanks[lCurPlank].X3, f1+lPlanks[lCurPlank].Y3, f3, f5, f8);
			tessellator.addVertexWithUV(f+lPlanks[lCurPlank].X2, f1+lPlanks[lCurPlank].Y2, f3, f4, f7);
    		tessellator.addVertexWithUV(f+lPlanks[lCurPlank].X1, f1+lPlanks[lCurPlank].Y1, f3, f4, f6);			
						
			tessellator.setNormal(0.0F, -1.0F, 0.0F);
			tessellator.addVertexWithUV(f+lPlanks[lCurPlank].X2, f1+lPlanks[lCurPlank].Y2, f2, f5_2, f9);
			tessellator.addVertexWithUV(f+lPlanks[lCurPlank].X1, f1+lPlanks[lCurPlank].Y1, f2, f5_2, f8);
			tessellator.addVertexWithUV(f+lPlanks[lCurPlank].X1, f1+lPlanks[lCurPlank].Y1, f3, f4, f8);
			tessellator.addVertexWithUV(f+lPlanks[lCurPlank].X2, f1+lPlanks[lCurPlank].Y2, f3, f4, f9);
			
			tessellator.setNormal(0.0F, -1.0F, 0.0F);
			tessellator.addVertexWithUV(f+lPlanks[lCurPlank].X3, f1+lPlanks[lCurPlank].Y3, f2, f5_2, f8/3.0F);
			tessellator.addVertexWithUV(f+lPlanks[lCurPlank].X2, f1+lPlanks[lCurPlank].Y2, f2, f5_2, f9);
			tessellator.addVertexWithUV(f+lPlanks[lCurPlank].X2, f1+lPlanks[lCurPlank].Y2, f3, f4, f9);
			tessellator.addVertexWithUV(f+lPlanks[lCurPlank].X3, f1+lPlanks[lCurPlank].Y3, f3, f4, f8/3.0F);
			
			tessellator.setNormal(0.0F, -1.0F, 0.0F);
			tessellator.addVertexWithUV(f+lPlanks[lCurPlank].X4, f1+lPlanks[lCurPlank].Y4, f2, f5_2, f9);
			tessellator.addVertexWithUV(f+lPlanks[lCurPlank].X3, f1+lPlanks[lCurPlank].Y3, f2, f5_2, f8);
			tessellator.addVertexWithUV(f+lPlanks[lCurPlank].X3, f1+lPlanks[lCurPlank].Y3, f3, f4, f8);
			tessellator.addVertexWithUV(f+lPlanks[lCurPlank].X4, f1+lPlanks[lCurPlank].Y4, f3, f4, f9);
			
			tessellator.setNormal(0.0F, -1.0F, 0.0F);
			tessellator.addVertexWithUV(f+lPlanks[lCurPlank].X1, f1+lPlanks[lCurPlank].Y1, f2, f5_2, f8/3.0F);
			tessellator.addVertexWithUV(f+lPlanks[lCurPlank].X4, f1+lPlanks[lCurPlank].Y4, f2, f5_2, f9);
			tessellator.addVertexWithUV(f+lPlanks[lCurPlank].X4, f1+lPlanks[lCurPlank].Y4, f3, f4, f9);
			tessellator.addVertexWithUV(f+lPlanks[lCurPlank].X1, f1+lPlanks[lCurPlank].Y1, f3, f4, f8/3.0F);
			tessellator.draw();
    	}
    }

    private void func_160_a(EntityBeams_Kaevator entitybeams, int pRed, int pGreen, int pBlue)
    {
        int i = MathHelper.floor_double(entitybeams.posX);
        int j = MathHelper.floor_double(entitybeams.posY);
        int k = MathHelper.floor_double(entitybeams.posZ);
        if(entitybeams.direction == 0)
        {
            i = MathHelper.floor_double(entitybeams.posX);
        }
        if(entitybeams.direction == 1)
        {
            k = MathHelper.floor_double(entitybeams.posZ);
        }
        if(entitybeams.direction == 2)
        {
            i = MathHelper.floor_double(entitybeams.posX);
        }
        if(entitybeams.direction == 3)
        {
            k = MathHelper.floor_double(entitybeams.posZ);
        }
        float f2 = renderManager.worldObj.getLightBrightness(i, j, k);
        GL11.glColor3f(f2*(float)pRed/256.0F, f2*(float)pGreen/256.0F, f2*(float)pBlue/256.0F);
    }

    public void doRender(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
        func_158_a((EntityBeams_Kaevator)entity, d, d1, d2, f, f1);
    }

    private Random rand;
}
