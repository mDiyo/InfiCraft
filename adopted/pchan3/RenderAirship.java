package pchan3;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

import org.lwjgl.opengl.GL11;

public class RenderAirship extends Render
{
	   protected ModelBase field_20920_e;
	    protected ModelBase renderPassModel;
	    
	    
    public RenderAirship(ModelBase modelbase, ModelBase modelbase1, float f)
    {
        
        this(modelbase, f);
        setRenderPassModel(modelbase1);      
       
    }
    
    public RenderAirship(ModelBase modelbase, float f)
    {
        field_20920_e = modelbase;
        shadowSize = f;       
        
    }
    
    public void setRenderPassModel(ModelBase modelbase)
    {
        renderPassModel = modelbase;
    }
    public void func_157_a(EntityAirship entityairship, double d, double d1, double d2, 
            float f, float f1)
    {
    	
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        GL11.glRotatef(180F - f, 0.0F, 1.0F, 0.0F);
        float f2 = (float)entityairship.field_806_b - f1;
        float f3 = (float)entityairship.field_807_a - f1;
        if(f3 < 0.0F)
        {
            f3 = 0.0F;
        }
        if(f2 > 0.0F)
        {
            GL11.glRotatef(((MathHelper.sin(f2) * f2 * f3) / 10F) * (float)entityairship.field_808_c, 1.0F, 0.0F, 0.0F);
        }
        loadTexture("/terrain.png");
        float f4 = 0.75F;
        GL11.glScalef(f4, f4, f4);
        GL11.glScalef(1.0F / f4, 1.0F / f4, 1.0F / f4);
        
       
        loadTexture("/item/airship.png");
        
        GL11.glScalef(-1F, -1F, 1.0F);
        
        field_20920_e.render(entityairship,0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
        if(true)
		{	
        		loadTexture("/item/balloon.png");
        		renderPassModel.render(entityairship,0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		}
        GL11.glPopMatrix();
   	 
     
    }

 
    public void doRender(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
        func_157_a((EntityAirship)entity, d, d1, d2, f, f1);
        
    }

    
    
}
