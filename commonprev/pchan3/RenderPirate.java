package pchan3;

import net.minecraft.src.EntityLiving;
import net.minecraft.src.ModelBase;
import net.minecraft.src.RenderLiving;

import org.lwjgl.opengl.GL11;

public class RenderPirate extends RenderLiving
{

    public RenderPirate(ModelBase modelbase, ModelBase modelbase1, float f)
    {
        super(modelbase, f);
        setRenderPassModel(modelbase1);
    }

    protected int func_176_a(EntityPirate entitysheep, int i, float f)
    {
        if(i == 0)
        {
            loadTexture("/mob/balloon.png");
                       
            
            return 1;
        } 
        else
        {
            return 0;
        }
    }
    
    protected int shouldRenderPass(EntityLiving entityliving, int i, float f)
    {
        return func_176_a((EntityPirate)entityliving, i, f);
    }
}
