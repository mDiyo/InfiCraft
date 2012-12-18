package pchan3;

import net.minecraft.src.ModelBase;

public class ModelSteamBoat extends ModelBase
{

    public ModelSteamBoat()
    {
        lastframe = System.nanoTime();
        paddlespin = 0.0F;
        boxes = new CustomModelRenderer[17];
        boxes[0] = new CustomModelRenderer(0, 8, 64, 64);
        boxes[1] = new CustomModelRenderer(0, 0, 64, 64);
        boxes[2] = new CustomModelRenderer(0, 0, 64, 64);
        boxes[3] = new CustomModelRenderer(0, 0, 64, 64);
        boxes[4] = new CustomModelRenderer(0, 0, 64, 64);
        boxes[5] = new CustomModelRenderer(0, 32, 64, 64);
        boxes[6] = new CustomModelRenderer(0, 32, 64, 64);
        boxes[7] = new CustomModelRenderer(32, 32, 64, 64);
        boxes[8] = new CustomModelRenderer(32, 32, 64, 64);
        boxes[9] = new CustomModelRenderer(32, 32, 64, 64);
        boxes[10] = new CustomModelRenderer(32, 32, 64, 64);
        boxes[11] = new CustomModelRenderer(32, 32, 64, 64);
        boxes[12] = new CustomModelRenderer(32, 32, 64, 64);
        boxes[13] = new CustomModelRenderer(32, 32, 64, 64);
        boxes[14] = new CustomModelRenderer(32, 32, 64, 64);
        boxes[15] = new CustomModelRenderer(0, 43, 64, 64);
        boxes[16] = new CustomModelRenderer(56, 0, 64, 64);
        
        byte byte0 = 24;
        byte byte1 = 6;
        byte byte2 = 20;
        byte byte3 = 4;
        
        // bottom panel
        // -12, -8, -3, 24, 16, 4
        boxes[0].addBox(-12, -8, -3, 24, 16, 4, 0.0F);
        boxes[0].setPosition(0.0F, 0 + byte3, 0.0F);
        boxes[0].rotateAngleX = 1.570796F;
        
        // front panel
        // -10, -7, -1, 20, 6, 2
        boxes[1].addBox(-byte0 / 2 + 2, -byte1 - 1, -1F, byte0 - 4, byte1, 2, 0.0F);
        boxes[1].setPosition(-byte0 / 2 + 1, 0 + byte3, 0.0F);
        boxes[1].rotateAngleY = 4.712389F;
        
        // rear panel
        // -10, -7, -1, 20, 6, 2
        boxes[2].addBox(-byte0 / 2 + 2, -byte1 - 1, -1F, byte0 - 4, byte1, 2, 0.0F);
        boxes[2].setPosition(byte0 / 2 - 1, 0 + byte3, 0.0F);
        boxes[2].rotateAngleY = 1.570796F;
        
        // left panel
        // -10, -7, -1, 20, 6, 2
        boxes[3].addBox(-byte0 / 2 + 2, -byte1 - 1, -1F, byte0 - 4, byte1, 2, 0.0F);
        boxes[3].setPosition(0.0F, 0 + byte3, -byte2 / 2 + 1);
        boxes[3].rotateAngleY = 3.141593F;
        
        // right panel
        // -10, -7, -1, 20, 6, 2
        boxes[4].addBox(-byte0 / 2 + 2, -byte1 - 1, -1F, byte0 - 4, byte1, 2, 0.0F);
        boxes[4].setPosition(0.0F, 0 + byte3, byte2 / 2 - 1);
        
        // left paddle cover
        // -6, -4, -1, 12, 8, 2
        boxes[5].addBox(-6, -4, -1, 12, 8, 3, 0.0F);
        boxes[5].setPosition(0.0F, 1.5F - byte3, -byte0 / 2 + 0.5F);
        boxes[5].rotateAngleY = 3.141593F;
        
        // right paddle cover
        // -6, -4, -1, 12, 8, 2
        boxes[6].addBox(-6, -4, -1, 12, 8, 3, 0.0F);
        boxes[6].setPosition(0.0F, 1.5F - byte3, byte0 / 2 - 0.5F);
        
        // left paddle
        // -5, -5, -0.5, 12, 1, 2
        boxes[7].addBox(-6, -0.5f, -0.5F, 12 , 1, 2, 0.0F);
        boxes[7].setPosition(0.0F, 0.0F, byte0 / 2 + 0.5f);
        boxes[7].rotateAngleY = 3.141593F;
        
        boxes[8].addBox(-byte3 - 2, -0.5f, -0.5F, byte0 / 2 , 1, 2, 0.0F);
        boxes[8].setPosition(0.0F, 0.0F, byte0 / 2 + 0.5f);
        boxes[8].rotateAngleY = 3.141593F;
        
        boxes[9].addBox(-byte3 - 2, -0.5f, -0.5F, byte0 / 2 , 1, 2, 0.0F);
        boxes[9].setPosition(0.0F, 0.0F, byte0 / 2 + 0.5f);
        boxes[9].rotateAngleY = 3.141593F;
        
        boxes[10].addBox(-byte3 - 2, -0.5f, -0.5F, byte0 / 2 , 1, 2, 0.0F);
        boxes[10].setPosition(0.0F, 0.0F, byte0 / 2 + 0.5f);
        boxes[10].rotateAngleY = 3.141593F;
        
        // right paddle
        // -5, -5, -0.5, 10, 10, 1
        boxes[11].addBox(-byte3 - 2, -0.5f, -0.5F, byte0 / 2 , 1, 2, 0.0F);
        boxes[11].setPosition(0.0F, 0.0F, -byte0 / 2 - 0.5f);
        
        boxes[12].addBox(-byte3 - 2, -0.5f, -0.5F, byte0 / 2 , 1, 2, 0.0F);
        boxes[12].setPosition(0.0F, 0.0F, -byte0 / 2 - 0.5f);
        
        boxes[13].addBox(-byte3 - 2, -0.5f, -0.5F, byte0 / 2 , 1, 2, 0.0F);
        boxes[13].setPosition(0.0F, 0.0F, -byte0 / 2 - 0.5f);
        
        boxes[14].addBox(-byte3 - 2, -0.5f, -0.5F, byte0 / 2 , 1, 2, 0.0F);
        boxes[14].setPosition(0.0F, 0.0F, -byte0 / 2 - 0.5f);
        
        // boiler
        // -8, -4, 0, 10, 8, 4
        boxes[15].addBox(-8, -4, 0.0f, 10, 8, 4, 0.0F);
        boxes[15].setPosition(0.0F, 3.0F, 0.0F);
        boxes[15].rotateAngleX = 1.570796F;
        
        // chimney
        // -2, -9, -1, 2, 10, 2
        boxes[16].addBox(-2, -13, -1f, 2, 14, 2, 0.0F);
        boxes[16].setPosition(0.0F, 0.0F, 0.0F);
        //boxes[15].rotateAngleX = 1.570796F;
    }

    public void render(float f, float f1, float f2, float f3, float f4, float f5)
    {
        // figure out elapsed time since last frame to get a steady spin on the paddles
        long now = System.nanoTime();
        int elapsed = (int)((now - lastframe) / (1000*1000));
        paddlespin -= (float)elapsed / 300.0f;
        lastframe = now;
        
        // give each of the paddles a quarter spin to make them fan out
        boxes[7].rotateAngleZ = paddlespin;
        boxes[8].rotateAngleZ = paddlespin + 0.78539825F;
        boxes[9].rotateAngleZ = paddlespin + 1.570796F;
        boxes[10].rotateAngleZ = paddlespin + 2.35619475F;
        
        boxes[11].rotateAngleZ = paddlespin;
        boxes[12].rotateAngleZ = paddlespin + 0.78539825F;
        boxes[13].rotateAngleZ = paddlespin + 1.570796F;
        boxes[14].rotateAngleZ = paddlespin + 2.35619475F;
        
        for(int i = 0; i < 17; i++)
        {
            boxes[i].render(f5);
        }
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public CustomModelRenderer boxes[];
    private long lastframe;
    private float paddlespin;
}
