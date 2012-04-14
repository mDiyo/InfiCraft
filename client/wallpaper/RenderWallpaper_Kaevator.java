// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

package net.minecraft.src.wallpaper;

import java.util.Random;

import net.minecraft.client.Minecraft;
import net.minecraft.src.Entity;
import net.minecraft.src.MathHelper;
import net.minecraft.src.Render;
import net.minecraft.src.Tessellator;

import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            Render, EntityWallpaper, EnumWallpaper, Tessellator, 
//            MathHelper, RenderManager, World, Entity

public class RenderWallpaper_Kaevator extends Render
{

    public RenderWallpaper_Kaevator()
    {    
        rand = new Random();        
    }    

    public void func_158_a(EntityWallpaper_Kaevator entitywallpaper, double d, double d1, double d2, 
            float f, float f1)
    {    	
        rand.setSeed(187L);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        GL11.glRotatef(f, 0.0F, 1.0F, 0.0F);
        GL11.glEnable(32826 /*GL_RESCALE_NORMAL_EXT*/);      
        GL11.glShadeModel(7425 /*GL_SMOOTH*/);    	
        GL11.glDisable(2896 /*GL_LIGHTING*/);
        
        loadTexture("/kaevator/wallpapers.png");          
        func_159_a(entitywallpaper);
        
        GL11.glShadeModel(7424 /*GL_FLAT*/);
        GL11.glEnable(2896 /*GL_LIGHTING*/);
        GL11.glDisable(32826 /*GL_RESCALE_NORMAL_EXT*/);
        GL11.glPopMatrix();
    }   
    
    private void func_159_a(EntityWallpaper_Kaevator entitywallpaper)
    {
    	GL11.glScalef(16.0F/256.0F, 16.0F/256.0F, 1.0F/16.0F);
    	float f = -8.0F;
    	float f1 = -8.0F;
    	
    	Tessellator tessellator = Tessellator.instance;    		
		
		float f2 = 0.0F;   
		float f3 = 1.0F;
		float f4 = (float)(entitywallpaper.wallpaper/16)/16.0F;
    	float f5 = (float)(entitywallpaper.wallpaper%16)/16.0F;
    	float f6 = 1.0F/16.0F;
    	float f7 = 1.0F/512.0F;
		
    	int i = MathHelper.floor_double(entitywallpaper.posX);
        int j = MathHelper.floor_double(entitywallpaper.posY);
        int k = MathHelper.floor_double(entitywallpaper.posZ);  
        
        float lRed = (float)entitywallpaper.red/256.0F;
        float lGreen = (float)entitywallpaper.green/256.0F;
        float lBlue = (float)entitywallpaper.blue/256.0F;
        
		tessellator.startDrawingQuads();    
		if(Minecraft.isAmbientOcclusionEnabled()){			
			
			renderWithAmbientOcclusion(i,j,k,1.0F,1.0F,1.0F, entitywallpaper.direction);
			tessellator.setNormal(0.0F, 0.0F, 1F);	
			tessellator.setBrightness(240);
			
			if(entitywallpaper.direction == 0){				
				tessellator.setColorOpaque_F(colorRedTopRight*lRed, colorGreenTopRight*lGreen, colorBlueTopRight*lBlue);		
				tessellator.addVertexWithUV(f, f1, f2, f4+f6, f5+f6);
				tessellator.setColorOpaque_F(colorRedTopLeft*lRed, colorGreenTopLeft*lGreen, colorBlueTopLeft*lBlue);																
				tessellator.addVertexWithUV(f, f1+16.0F, f2, f4+f6, f5);
				tessellator.setColorOpaque_F(colorRedBottomLeft*lRed, colorGreenBottomLeft*lGreen, colorBlueBottomLeft*lBlue);									
				tessellator.addVertexWithUV(f+16.0F, f1+16.0F, f2, f4, f5);
				tessellator.setColorOpaque_F(colorRedBottomRight*lRed, colorGreenBottomRight*lGreen, colorBlueBottomRight*lBlue);			
				tessellator.addVertexWithUV(f+16.0F, f1, f2, f4, f5+f6);
			}else
			if(entitywallpaper.direction == 2){
				tessellator.setColorOpaque_F(colorRedBottomRight*lRed, colorGreenBottomRight*lGreen, colorBlueBottomRight*lBlue);			
				tessellator.addVertexWithUV(f, f1, f2, f4+f6, f5+f6);
				tessellator.setColorOpaque_F(colorRedTopRight*lRed, colorGreenTopRight*lGreen, colorBlueTopRight*lBlue);
				tessellator.addVertexWithUV(f, f1+16.0F, f2, f4+f6, f5);
				tessellator.setColorOpaque_F(colorRedTopLeft*lRed, colorGreenTopLeft*lGreen, colorBlueTopLeft*lBlue);
				tessellator.addVertexWithUV(f+16.0F, f1+16.0F, f2, f4, f5);
				tessellator.setColorOpaque_F(colorRedBottomLeft*lRed, colorGreenBottomLeft*lGreen, colorBlueBottomLeft*lBlue);				
				tessellator.addVertexWithUV(f+16.0F, f1, f2, f4, f5+f6);
			}else
			if(entitywallpaper.direction == 1){
				tessellator.setColorOpaque_F(colorRedTopRight*lRed, colorGreenTopRight*lGreen, colorBlueTopRight*lBlue);				
				tessellator.addVertexWithUV(f, f1, f2, f4+f6, f5+f6);
				tessellator.setColorOpaque_F(colorRedTopLeft*lRed, colorGreenTopLeft*lGreen, colorBlueTopLeft*lBlue);				
				tessellator.addVertexWithUV(f, f1+16.0F, f2, f4+f6, f5);
				tessellator.setColorOpaque_F(colorRedBottomLeft*lRed, colorGreenBottomLeft*lGreen, colorBlueBottomLeft*lBlue);						
				tessellator.addVertexWithUV(f+16.0F, f1+16.0F, f2, f4, f5);
				tessellator.setColorOpaque_F(colorRedBottomRight*lRed, colorGreenBottomRight*lGreen, colorBlueBottomRight*lBlue);	
				tessellator.addVertexWithUV(f+16.0F, f1, f2, f4, f5+f6);
			}else
			if(entitywallpaper.direction == 3){
				tessellator.setColorOpaque_F(colorRedBottomLeft*lRed, colorGreenBottomLeft*lGreen, colorBlueBottomLeft*lBlue);					
				tessellator.addVertexWithUV(f, f1, f2, f4+f6, f5+f6);
				tessellator.setColorOpaque_F(colorRedBottomRight*lRed, colorGreenBottomRight*lGreen, colorBlueBottomRight*lBlue);		
				tessellator.addVertexWithUV(f, f1+16.0F, f2, f4+f6, f5);
				tessellator.setColorOpaque_F(colorRedTopRight*lRed, colorGreenTopRight*lGreen, colorBlueTopRight*lBlue);
				tessellator.addVertexWithUV(f+16.0F, f1+16.0F, f2, f4, f5);		
				tessellator.setColorOpaque_F(colorRedTopLeft*lRed, colorGreenTopLeft*lGreen, colorBlueTopLeft*lBlue);
				tessellator.addVertexWithUV(f+16.0F, f1, f2, f4, f5+f6);
			}			
			
			if(!entitywallpaper.isBlockLeft){
				tessellator.setNormal(-1.0F, 0.0F, 0.0F);
				if(entitywallpaper.direction == 0){	
					tessellator.setColorOpaque_F(colorRedTopLeft*lRed, colorGreenTopLeft*lGreen, colorBlueTopLeft*lBlue);
					tessellator.addVertexWithUV(f, f1+16.0F, f3, f4+f6, f5);
					tessellator.addVertexWithUV(f, f1+16.0F, f2, f4+f6, f5);
					tessellator.setColorOpaque_F(colorRedTopRight*lRed, colorGreenTopRight*lGreen, colorBlueTopRight*lBlue);
					tessellator.addVertexWithUV(f, f1, f2, f4+f6-f7, f5+f6);
					tessellator.addVertexWithUV(f, f1, f3, f4+f6-f7, f5+f6);					
				}else
				if(entitywallpaper.direction == 2){
					tessellator.setColorOpaque_F(colorRedTopRight*lRed, colorGreenTopRight*lGreen, colorBlueTopRight*lBlue);
					tessellator.addVertexWithUV(f, f1+16.0F, f3, f4+f6, f5); 
					tessellator.addVertexWithUV(f, f1+16.0F, f2, f4+f6, f5);
					tessellator.setColorOpaque_F(colorRedBottomRight*lRed, colorGreenBottomRight*lGreen, colorBlueBottomRight*lBlue);
					tessellator.addVertexWithUV(f, f1, f2, f4+f6-f7, f5+f6);
					tessellator.addVertexWithUV(f, f1, f3, f4+f6-f7, f5+f6);					
				}else
				if(entitywallpaper.direction == 1){
					tessellator.setColorOpaque_F(colorRedTopLeft*lRed, colorGreenTopLeft*lGreen, colorBlueTopLeft*lBlue);
					tessellator.addVertexWithUV(f, f1+16.0F, f3, f4+f6, f5);
					tessellator.addVertexWithUV(f, f1+16.0F, f2, f4+f6, f5);
					tessellator.setColorOpaque_F(colorRedTopRight*lRed, colorGreenTopRight*lGreen, colorBlueTopRight*lBlue);
					tessellator.addVertexWithUV(f, f1, f2, f4+f6-f7, f5+f6);
					tessellator.addVertexWithUV(f, f1, f3, f4+f6-f7, f5+f6);					
				}else
				if(entitywallpaper.direction == 3){
					tessellator.setColorOpaque_F(colorRedBottomRight*lRed, colorGreenBottomRight*lGreen, colorBlueBottomRight*lBlue);
					tessellator.addVertexWithUV(f, f1+16.0F, f3, f4+f6, f5);
					tessellator.addVertexWithUV(f, f1+16.0F, f2, f4+f6, f5);
					tessellator.setColorOpaque_F(colorRedBottomLeft*lRed, colorGreenBottomLeft*lGreen, colorBlueBottomLeft*lBlue);	
					tessellator.addVertexWithUV(f, f1, f2, f4+f6-f7, f5+f6);
					tessellator.addVertexWithUV(f, f1, f3, f4+f6-f7, f5+f6);					
				}				
			}
			if(!entitywallpaper.isBlockUp){
				
				tessellator.setNormal(0.0F, 1.0F, 0.0F);
				if(entitywallpaper.direction == 0){	
					tessellator.setColorOpaque_F(colorRedTopLeft*lRed, colorGreenTopLeft*lGreen, colorBlueTopLeft*lBlue);
					tessellator.addVertexWithUV(f, f1+16.0F, f2, f4+f6, f5);
					tessellator.addVertexWithUV(f, f1+16.0F, f3, f4+f6, f5+f7);
					tessellator.setColorOpaque_F(colorRedBottomLeft*lRed, colorGreenBottomLeft*lGreen, colorBlueBottomLeft*lBlue);
					tessellator.addVertexWithUV(f+16.0F, f1+16.0F, f3, f4, f5+f7);
					tessellator.addVertexWithUV(f+16.0F, f1+16.0F, f2, f4, f5);
				}else
				if(entitywallpaper.direction == 2){
					tessellator.setColorOpaque_F(colorRedTopLeft*lRed, colorGreenTopLeft*lGreen, colorBlueTopLeft*lBlue);
					tessellator.addVertexWithUV(f+16.0F, f1+16.0F, f3, f4, f5+f7);
					tessellator.addVertexWithUV(f+16.0F, f1+16.0F, f2, f4, f5);
					tessellator.setColorOpaque_F(colorRedTopRight*lRed, colorGreenTopRight*lGreen, colorBlueTopRight*lBlue);
					tessellator.addVertexWithUV(f, f1+16.0F, f2, f4+f6, f5);
					tessellator.addVertexWithUV(f, f1+16.0F, f3, f4+f6, f5+f7);					
				}else
				if(entitywallpaper.direction == 1){
					tessellator.setColorOpaque_F(colorRedBottomLeft*lRed, colorGreenBottomLeft*lGreen, colorBlueBottomLeft*lBlue);
					tessellator.addVertexWithUV(f+16.0F, f1+16.0F, f3, f4, f5+f7);
					tessellator.addVertexWithUV(f+16.0F, f1+16.0F, f2, f4, f5);
					tessellator.setColorOpaque_F(colorRedTopLeft*lRed, colorGreenTopLeft*lGreen, colorBlueTopLeft*lBlue);
					tessellator.addVertexWithUV(f, f1+16.0F, f2, f4+f6, f5);
					tessellator.addVertexWithUV(f, f1+16.0F, f3, f4+f6, f5+f7);					
				}else
				if(entitywallpaper.direction == 3){
					tessellator.setColorOpaque_F(colorRedTopRight*lRed, colorGreenTopRight*lGreen, colorBlueTopRight*lBlue);
					tessellator.addVertexWithUV(f+16.0F, f1+16.0F, f3, f4, f5+f7);
					tessellator.addVertexWithUV(f+16.0F, f1+16.0F, f2, f4, f5);
					tessellator.setColorOpaque_F(colorRedBottomRight*lRed, colorGreenBottomRight*lGreen, colorBlueBottomRight*lBlue);	
					tessellator.addVertexWithUV(f, f1+16.0F, f2, f4+f6, f5);
					tessellator.addVertexWithUV(f, f1+16.0F, f3, f4+f6, f5+f7);					
				}					
			}			
			if(!entitywallpaper.isBlockRight){
				
				tessellator.setNormal(1F, 0.0F, 0.0F);
				if(entitywallpaper.direction == 0){	
					tessellator.setColorOpaque_F(colorRedBottomRight*lRed, colorGreenBottomRight*lGreen, colorBlueBottomRight*lBlue);	
					tessellator.addVertexWithUV(f+16.0F, f1, f3, f4+f7, f5+f6);
					tessellator.addVertexWithUV(f+16.0F, f1, f2, f4, f5+f6);
					tessellator.setColorOpaque_F(colorRedBottomLeft*lRed, colorGreenBottomLeft*lGreen, colorBlueBottomLeft*lBlue);	
					tessellator.addVertexWithUV(f+16.0F, f1+16.0F, f2, f4, f5);
					tessellator.addVertexWithUV(f+16.0F, f1+16.0F, f3, f4+f7, f5);				
				}else
				if(entitywallpaper.direction == 2){
					tessellator.setColorOpaque_F(colorRedBottomLeft*lRed, colorGreenBottomLeft*lGreen, colorBlueBottomLeft*lBlue);
					tessellator.addVertexWithUV(f+16.0F, f1, f3, f4+f7, f5+f6);
					tessellator.addVertexWithUV(f+16.0F, f1, f2, f4, f5+f6);
					tessellator.setColorOpaque_F(colorRedTopLeft*lRed, colorGreenTopLeft*lGreen, colorBlueTopLeft*lBlue);
					tessellator.addVertexWithUV(f+16.0F, f1+16.0F, f2, f4, f5);
					tessellator.addVertexWithUV(f+16.0F, f1+16.0F, f3, f4+f7, f5);				
				}else
				if(entitywallpaper.direction == 1){
					tessellator.setColorOpaque_F(colorRedBottomRight*lRed, colorGreenBottomRight*lGreen, colorBlueBottomRight*lBlue);
					tessellator.addVertexWithUV(f+16.0F, f1, f3, f4+f7, f5+f6);
					tessellator.addVertexWithUV(f+16.0F, f1, f2, f4, f5+f6);
					tessellator.setColorOpaque_F(colorRedBottomLeft*lRed, colorGreenBottomLeft*lGreen, colorBlueBottomLeft*lBlue);
					tessellator.addVertexWithUV(f+16.0F, f1+16.0F, f2, f4, f5);
					tessellator.addVertexWithUV(f+16.0F, f1+16.0F, f3, f4+f7, f5);					
				}else
				if(entitywallpaper.direction == 3){
					tessellator.setColorOpaque_F(colorRedTopLeft*lRed, colorGreenTopLeft*lGreen, colorBlueTopLeft*lBlue);
					tessellator.addVertexWithUV(f+16.0F, f1, f3, f4+f7, f5+f6);
					tessellator.addVertexWithUV(f+16.0F, f1, f2, f4, f5+f6);
					tessellator.setColorOpaque_F(colorRedTopRight*lRed, colorGreenTopRight*lGreen, colorBlueTopRight*lBlue);
					tessellator.addVertexWithUV(f+16.0F, f1+16.0F, f2, f4, f5);
					tessellator.addVertexWithUV(f+16.0F, f1+16.0F, f3, f4+f7, f5);					
				}					
			}			
			if(!entitywallpaper.isBlockDown){
				
				tessellator.setNormal(0.0F, -1.0F, 0.0F);
				if(entitywallpaper.direction == 0){	
					tessellator.setColorOpaque_F(colorRedTopRight*lRed, colorGreenTopRight*lGreen, colorBlueTopRight*lBlue);	
					tessellator.addVertexWithUV(f, f1, f3, f4+f6, f5+f6-f7);
					tessellator.addVertexWithUV(f, f1, f2, f4+f6, f5+f6);
					tessellator.setColorOpaque_F(colorRedBottomRight*lRed, colorGreenBottomRight*lGreen, colorBlueBottomRight*lBlue);	
					tessellator.addVertexWithUV(f+16.0F, f1, f2, f4, f5+f6);
					tessellator.addVertexWithUV(f+16.0F, f1, f3, f4, f5+f6-f7);
				}else
				if(entitywallpaper.direction == 2){
					tessellator.setColorOpaque_F(colorRedBottomRight*lRed, colorGreenBottomRight*lGreen, colorBlueBottomRight*lBlue);	
					tessellator.addVertexWithUV(f, f1, f3, f4+f6, f5+f6-f7);
					tessellator.addVertexWithUV(f, f1, f2, f4+f6, f5+f6);
					tessellator.setColorOpaque_F(colorRedBottomLeft*lRed, colorGreenBottomLeft*lGreen, colorBlueBottomLeft*lBlue);
					tessellator.addVertexWithUV(f+16.0F, f1, f2, f4, f5+f6);
					tessellator.addVertexWithUV(f+16.0F, f1, f3, f4, f5+f6-f7);			
				}else
				if(entitywallpaper.direction == 1){
					tessellator.setColorOpaque_F(colorRedTopRight*lRed, colorGreenTopRight*lGreen, colorBlueTopRight*lBlue);	
					tessellator.addVertexWithUV(f, f1, f3, f4+f6, f5+f6-f7);
					tessellator.addVertexWithUV(f, f1, f2, f4+f6, f5+f6);
					tessellator.setColorOpaque_F(colorRedBottomRight*lRed, colorGreenBottomRight*lGreen, colorBlueBottomRight*lBlue);
					tessellator.addVertexWithUV(f+16.0F, f1, f2, f4, f5+f6);
					tessellator.addVertexWithUV(f+16.0F, f1, f3, f4, f5+f6-f7);				
				}else
				if(entitywallpaper.direction == 3){
					tessellator.setColorOpaque_F(colorRedBottomLeft*lRed, colorGreenBottomLeft*lGreen, colorBlueBottomLeft*lBlue);	
					tessellator.addVertexWithUV(f, f1, f3, f4+f6, f5+f6-f7);
					tessellator.addVertexWithUV(f, f1, f2, f4+f6, f5+f6);
					tessellator.setColorOpaque_F(colorRedTopLeft*lRed, colorGreenTopLeft*lGreen, colorBlueTopLeft*lBlue);
					tessellator.addVertexWithUV(f+16.0F, f1, f2, f4, f5+f6);
					tessellator.addVertexWithUV(f+16.0F, f1, f3, f4, f5+f6-f7);		
				}					
			}
			
		}else{
			
			float lLightBlock = renderManager.worldObj.getLightBrightness(i, j, k);
	        GL11.glColor3f(lLightBlock*(float)entitywallpaper.red/256.0F, lLightBlock*(float)entitywallpaper.green/256.0F, lLightBlock*(float)entitywallpaper.blue/256.0F);	        
	        
	        
	        tessellator.setBrightness(240);
	        
			tessellator.setNormal(0.0F, 0.0F, -1F);
			tessellator.addVertexWithUV(f, f1, f2, f4+f6, f5+f6);
			tessellator.addVertexWithUV(f, f1+16.0F, f2, f4+f6, f5);
			tessellator.addVertexWithUV(f+16.0F, f1+16.0F, f2, f4, f5);
			tessellator.addVertexWithUV(f+16.0F, f1, f2, f4, f5+f6);
			
			if(!entitywallpaper.isBlockLeft){
				tessellator.setNormal(-1.0F, 0.0F, 0.0F);
				tessellator.addVertexWithUV(f, f1+16.0F, f2, f4+f6, f5);
				tessellator.addVertexWithUV(f, f1, f2, f4+f6-f7, f5+f6);
				tessellator.addVertexWithUV(f, f1, f3, f4+f6-f7, f5+f6);
				tessellator.addVertexWithUV(f, f1+16.0F, f3, f4+f6, f5);
			}
			if(!entitywallpaper.isBlockUp){
				tessellator.setNormal(0.0F, 1.0F, 0.0F);
				tessellator.addVertexWithUV(f+16.0F, f1+16.0F, f2, f4, f5);
				tessellator.addVertexWithUV(f, f1+16.0F, f2, f4+f6, f5);
				tessellator.addVertexWithUV(f, f1+16.0F, f3, f4+f6, f5+f7);
				tessellator.addVertexWithUV(f+16.0F, f1+16.0F, f3, f4, f5+f7);
			}			
			if(!entitywallpaper.isBlockRight){
				tessellator.setNormal(1F, 0.0F, 0.0F);
				tessellator.addVertexWithUV(f+16.0F, f1, f2, f4, f5+f6);
				tessellator.addVertexWithUV(f+16.0F, f1+16.0F, f2, f4, f5);
				tessellator.addVertexWithUV(f+16.0F, f1+16.0F, f3, f4+f7, f5);
				tessellator.addVertexWithUV(f+16.0F, f1, f3, f4+f7, f5+f6);
			}			
			if(!entitywallpaper.isBlockDown){
				tessellator.setNormal(0.0F, -1.0F, 0.0F);
				tessellator.addVertexWithUV(f, f1, f2, f4+f6, f5+f6);
				tessellator.addVertexWithUV(f+16.0F, f1, f2, f4, f5+f6);
				tessellator.addVertexWithUV(f+16.0F, f1, f3, f4, f5+f6-f7);
				tessellator.addVertexWithUV(f, f1, f3, f4+f6, f5+f6-f7);
			}
		}		
		
		tessellator.draw(); 		
    }
    

    public boolean renderWithAmbientOcclusion(int i, int j, int k, float f, float f1, float f2, int l)
    {
    	boolean flag = false; 
    	float aoLightValueSelf = renderManager.worldObj.getLightBrightness(i, j, k);
        
        // East face, direction = 0
        if(l == 0)
        {
            float f9;
            float f15;
            float f21;
            float f27;
            
            float field_22358_C = renderManager.worldObj.getLightBrightness( i - 1, j, k);
            float field_22374_p = renderManager.worldObj.getLightBrightness( i, j - 1, k);
            float field_22366_x = renderManager.worldObj.getLightBrightness( i, j + 1, k);
            float field_22356_D = renderManager.worldObj.getLightBrightness( i + 1, j, k); 
            
            float field_22377_m = renderManager.worldObj.getLightBrightness( i - 1, j - 1, k);
            float field_22369_u = renderManager.worldObj.getLightBrightness( i - 1, j + 1, k);
            float field_22372_r = renderManager.worldObj.getLightBrightness( i + 1, j - 1, k);
            float field_22365_y = renderManager.worldObj.getLightBrightness( i + 1, j + 1, k);           
            
            f9 = (field_22358_C + field_22369_u + aoLightValueSelf + field_22366_x) / 4F;
            f15 = (aoLightValueSelf + field_22366_x + field_22356_D + field_22365_y) / 4F;
            f21 = (field_22374_p + aoLightValueSelf + field_22372_r + field_22356_D) / 4F;
            f27 = (field_22377_m + field_22358_C + field_22374_p + aoLightValueSelf) / 4F;
            
            colorRedTopLeft = colorRedBottomLeft = colorRedBottomRight = colorRedTopRight = f * 0.8F;
            colorGreenTopLeft = colorGreenBottomLeft = colorGreenBottomRight = colorGreenTopRight = f1 * 0.8F;
            colorBlueTopLeft = colorBlueBottomLeft = colorBlueBottomRight = colorBlueTopRight = f2 * 0.8F;
            colorRedTopLeft *= f9;
            colorGreenTopLeft *= f9;
            colorBlueTopLeft *= f9;
            colorRedBottomLeft *= f15;
            colorGreenBottomLeft *= f15;
            colorBlueBottomLeft *= f15;
            colorRedBottomRight *= f21;
            colorGreenBottomRight *= f21;
            colorBlueBottomRight *= f21;
            colorRedTopRight *= f27;
            colorGreenTopRight *= f27;
            colorBlueTopRight *= f27;            
            
            flag = true;
            return flag;
        }
        
        // West face, direction = 2
        if(l == 2)
        {
            float f10;
            float f16;
            float f22;
            float f28;
            
            float field_22354_E = renderManager.worldObj.getLightBrightness( i - 1, j, k);
            float field_22353_F = renderManager.worldObj.getLightBrightness( i + 1, j, k);
            float field_22373_q = renderManager.worldObj.getLightBrightness( i, j - 1, k);
            float field_22362_A = renderManager.worldObj.getLightBrightness( i, j + 1, k);                       
            
            float field_22375_o = renderManager.worldObj.getLightBrightness( i - 1, j - 1, k);
            float field_22367_w = renderManager.worldObj.getLightBrightness( i - 1, j + 1, k);
            float field_22370_t = renderManager.worldObj.getLightBrightness( i + 1, j - 1, k);
            float field_22360_B = renderManager.worldObj.getLightBrightness( i + 1, j + 1, k);            
            
            f10 = (field_22354_E + field_22367_w + aoLightValueSelf + field_22362_A) / 4F;
            f28 = (aoLightValueSelf + field_22362_A + field_22353_F + field_22360_B) / 4F;
            f22 = (field_22373_q + aoLightValueSelf + field_22370_t + field_22353_F) / 4F;
            f16 = (field_22375_o + field_22354_E + field_22373_q + aoLightValueSelf) / 4F;
            
            colorRedTopLeft = colorRedBottomLeft = colorRedBottomRight = colorRedTopRight = f * 0.8F;
            colorGreenTopLeft = colorGreenBottomLeft = colorGreenBottomRight = colorGreenTopRight = f1 * 0.8F;
            colorBlueTopLeft = colorBlueBottomLeft = colorBlueBottomRight = colorBlueTopRight = f2 * 0.8F;
            colorRedTopLeft *= f10;
            colorGreenTopLeft *= f10;
            colorBlueTopLeft *= f10;
            colorRedBottomLeft *= f16;
            colorGreenBottomLeft *= f16;
            colorBlueBottomLeft *= f16;
            colorRedBottomRight *= f22;
            colorGreenBottomRight *= f22;
            colorBlueBottomRight *= f22;
            colorRedTopRight *= f28;
            colorGreenTopRight *= f28;
            colorBlueTopRight *= f28;
            
            flag = true;
            return flag;
        }
        
        // North face, direction = 1
        if(l == 1)
        {
            float f11;
            float f17;
            float f23;
            float f29;
                        
            float field_22376_n = renderManager.worldObj.getLightBrightness( i, j - 1, k);
            float field_22358_C = renderManager.worldObj.getLightBrightness( i, j, k - 1);
            float field_22354_E = renderManager.worldObj.getLightBrightness( i, j, k + 1);
            float field_22368_v = renderManager.worldObj.getLightBrightness( i, j + 1, k);                        
            
            float field_22377_m = renderManager.worldObj.getLightBrightness( i, j - 1, k - 1);
            float field_22375_o = renderManager.worldObj.getLightBrightness( i, j - 1, k + 1);
            float field_22369_u = renderManager.worldObj.getLightBrightness( i, j + 1, k - 1);
            float field_22367_w = renderManager.worldObj.getLightBrightness( i, j + 1, k + 1);          
            
            f29 = (field_22376_n + field_22375_o + aoLightValueSelf + field_22354_E) / 4F;
            f11 = (aoLightValueSelf + field_22354_E + field_22368_v + field_22367_w) / 4F;
            f17 = (field_22358_C + aoLightValueSelf + field_22369_u + field_22368_v) / 4F;
            f23 = (field_22377_m + field_22376_n + field_22358_C + aoLightValueSelf) / 4F;
            
            colorRedTopLeft = colorRedBottomLeft = colorRedBottomRight = colorRedTopRight = f * 0.6F;
            colorGreenTopLeft = colorGreenBottomLeft = colorGreenBottomRight = colorGreenTopRight = f1 * 0.6F;
            colorBlueTopLeft = colorBlueBottomLeft = colorBlueBottomRight = colorBlueTopRight = f2 * 0.6F;
            colorRedTopLeft *= f11;
            colorGreenTopLeft *= f11;
            colorBlueTopLeft *= f11;
            colorRedBottomLeft *= f17;
            colorGreenBottomLeft *= f17;
            colorBlueBottomLeft *= f17;
            colorRedBottomRight *= f23;
            colorGreenBottomRight *= f23;
            colorBlueBottomRight *= f23;
            colorRedTopRight *= f29;
            colorGreenTopRight *= f29;
            colorBlueTopRight *= f29;
            
            flag = true;
            return flag;
        }
        
        // South face, direction = 3
        if(l == 3)
        {
            float f12;
            float f18;
            float f24;
            float f30;
                        
            float field_22371_s = renderManager.worldObj.getLightBrightness( i, j - 1, k);
            float field_22356_D = renderManager.worldObj.getLightBrightness( i, j, k - 1);
            float field_22353_F = renderManager.worldObj.getLightBrightness( i, j, k + 1);
            float field_22364_z = renderManager.worldObj.getLightBrightness( i, j + 1, k);                        
           
            float field_22372_r = renderManager.worldObj.getLightBrightness( i, j - 1, k - 1);
            float field_22370_t = renderManager.worldObj.getLightBrightness( i, j - 1, k + 1);
            float field_22365_y = renderManager.worldObj.getLightBrightness( i, j + 1, k - 1);
            float field_22360_B = renderManager.worldObj.getLightBrightness( i, j + 1, k + 1);
            
            f12 = (field_22371_s + field_22370_t + aoLightValueSelf + field_22353_F) / 4F;
            f30 = (aoLightValueSelf + field_22353_F + field_22364_z + field_22360_B) / 4F;
            f24 = (field_22356_D + aoLightValueSelf + field_22365_y + field_22364_z) / 4F;
            f18 = (field_22372_r + field_22371_s + field_22356_D + aoLightValueSelf) / 4F;
           
            colorRedTopLeft = colorRedBottomLeft = colorRedBottomRight = colorRedTopRight = f * 0.6F;
            colorGreenTopLeft = colorGreenBottomLeft = colorGreenBottomRight = colorGreenTopRight = f1 * 0.6F;
            colorBlueTopLeft = colorBlueBottomLeft = colorBlueBottomRight = colorBlueTopRight = f2 * 0.6F;
            colorRedTopLeft *= f12;
            colorGreenTopLeft *= f12;
            colorBlueTopLeft *= f12;
            colorRedBottomLeft *= f18;
            colorGreenBottomLeft *= f18;
            colorBlueBottomLeft *= f18;
            colorRedBottomRight *= f24;
            colorGreenBottomRight *= f24;
            colorBlueBottomRight *= f24;
            colorRedTopRight *= f30;
            colorGreenTopRight *= f30;
            colorBlueTopRight *= f30;
            
            flag = true;
            return flag;
        }
        
        return flag;
    }
    
    public void doRender(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
        func_158_a((EntityWallpaper_Kaevator)entity, d, d1, d2, f, f1);
    }

    private Random rand;
    public float colorRedTopLeft;
    public float colorRedBottomLeft;
    public float colorRedBottomRight;
    public float colorRedTopRight;
    public float colorGreenTopLeft;
    public float colorGreenBottomLeft;
    public float colorGreenBottomRight;
    public float colorGreenTopRight;
    public float colorBlueTopLeft;
    public float colorBlueBottomLeft;
    public float colorBlueBottomRight;
    public float colorBlueTopRight;
}
