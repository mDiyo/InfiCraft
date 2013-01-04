package pchan3;

import net.minecraft.client.model.ModelBase;

public class ModelPirate extends ModelBase

{

	private float bladespin;
	private long lastframe;

	public ModelPirate() {
		lastframe = System.nanoTime();
		bladespin = 0.0F;

		boxes = new CustomModelRenderer[27];

		boxes[0] = new CustomModelRenderer(0, 8, 64, 64);

		boxes[1] = new CustomModelRenderer(0, 0, 64, 64);

		boxes[2] = new CustomModelRenderer(0, 0, 64, 64);

		boxes[3] = new CustomModelRenderer(0, 0, 64, 64);

		boxes[4] = new CustomModelRenderer(0, 0, 64, 64);

		boxes[5] = new CustomModelRenderer(56, 0, 64, 64);
		boxes[6] = new CustomModelRenderer(56, 0, 64, 64);
		boxes[7] = new CustomModelRenderer(56, 0, 64, 64);
		boxes[8] = new CustomModelRenderer(56, 0, 64, 64);

		boxes[9] = new CustomModelRenderer(36, 39, 64, 64);
		boxes[14] = new CustomModelRenderer(36, 39, 64, 64);

		// Propeller Blades
		boxes[10] = new CustomModelRenderer(0, 55, 64, 64);
		boxes[11] = new CustomModelRenderer(0, 55, 64, 64);
		boxes[12] = new CustomModelRenderer(0, 55, 64, 64);
		boxes[13] = new CustomModelRenderer(0, 55, 64, 64);
		boxes[15] = new CustomModelRenderer(0, 55, 64, 64);
		boxes[16] = new CustomModelRenderer(0, 55, 64, 64);
		boxes[17] = new CustomModelRenderer(0, 55, 64, 64);
		boxes[18] = new CustomModelRenderer(0, 55, 64, 64);
		// ///////
		// / Ballloooooonz
		// ///////
		boxes[19] = new CustomModelRenderer(0, 0, 64, 64);

		boxes[20] = new CustomModelRenderer(0, 43, 64, 64);
		boxes[21] = new CustomModelRenderer(28, 44, 64, 64);

		// Rudder
		boxes[22] = new CustomModelRenderer(0, 32, 64, 64);

		boxes[23] = new CustomModelRenderer(56, 0, 64, 64);
		boxes[24] = new CustomModelRenderer(56, 0, 64, 64);
		boxes[25] = new CustomModelRenderer(56, 0, 64, 64);
		boxes[26] = new CustomModelRenderer(56, 0, 64, 64);

		byte byte0 = 24;
		byte byte1 = 6;
		byte byte2 = 20;
		byte byte3 = 4;

		// Bottom Panel
		boxes[0].addBox(-12, -8, -3, 24, 16, 4, 0.0F);
		boxes[0].setPosition(0.0F, 0 + byte3, 0.0F);
		boxes[0].rotateAngleX = 1.570796F;

		// Front Panel
		boxes[1].addBox(-byte0 / 2 + 2, -byte1 - 1, -1F, byte0 - 4, byte1, 2,
				0.0F);
		boxes[1].setPosition(-byte0 / 2 + 1, 0 + byte3, 0.0F);
		boxes[1].rotateAngleY = 4.712389F;

		// Rear Panel
		boxes[2].addBox(-byte0 / 2 + 2, -byte1 - 1, -1F, byte0 - 4, byte1, 2,
				0.0F);
		boxes[2].setPosition(byte0 / 2 - 1, 0 + byte3, 0.0F);
		boxes[2].rotateAngleY = 1.570796F;
		// Left Panel
		boxes[3].addBox(-byte0 / 2 + 2, -byte1 - 1, -1F, byte0 - 4, byte1, 2,
				0.0F);
		boxes[3].setPosition(0.0F, 0 + byte3, -byte2 / 2 + 1);
		boxes[3].rotateAngleY = 3.141593F;
		// Right Panel
		boxes[4].addBox(-byte0 / 2 + 2, -byte1 - 1, -1F, byte0 - 4, byte1, 2,
				0.0F);
		boxes[4].setPosition(0.0F, 0 + byte3, byte2 / 2 - 1);

		// TopLeft Connector
		boxes[5].addBox(-2, -13, -1f, 2, byte0, 2, 0.0F);
		boxes[5].setPosition(-12.0F, -12.5f, -byte2 / 2 - 3.5f);
		boxes[5].rotateAngleY = 0.392699F;
		boxes[5].rotateAngleX = 0.392699F;
		// BottomLeft Connector
		boxes[7].addBox(-2, -13, -1f, 2, byte0, 2, 0.0F);
		boxes[7].setPosition(13.5F, -12.5f, -byte2 / 2 - 2);
		boxes[7].rotateAngleY = -0.392699F;
		boxes[7].rotateAngleX = 0.392699F;
		// TopRight Connector
		boxes[6].addBox(-2, -13, -1f, 2, byte0, 2, 0.0F);
		boxes[6].setPosition(-12.0F, -12.5f, +byte2 / 2 + 3.5f);
		boxes[6].rotateAngleY = -0.392699F;
		boxes[6].rotateAngleX = -0.392699F;
		// BottomRight Connector
		boxes[8].addBox(-2, -13, -1f, 2, byte0, 2, 0.0F);
		boxes[8].setPosition(13.5F, -12.5f, +byte2 / 2 + 2);
		boxes[8].rotateAngleY = 0.392699F;
		boxes[8].rotateAngleX = -0.392699F;

		// Left Engine Supports
		boxes[23].addBox(-2, -2, -1f, 2, 13, 2, 0.0F);
		boxes[23].setPosition(0, 3, -byte0 / 2 - 7f);
		boxes[23].rotateAngleX = 1.570796F;
		boxes[24].addBox(-2, -2, -1f, 2, 13, 2, 0.0F);
		boxes[24].setPosition(6, 3, -byte0 / 2 - 7f);
		boxes[24].rotateAngleX = 1.570796F;

		// Right Engine Supports
		boxes[25].addBox(-2, -2, -1f, 2, 13, 2, 0.0F);
		boxes[25].setPosition(0, 3, byte0 / 2 - 2f);
		boxes[25].rotateAngleX = 1.570796F;
		boxes[26].addBox(-2, -2, -1f, 2, 13, 2, 0.0F);
		boxes[26].setPosition(6, 3, byte0 / 2 - 2f);
		boxes[26].rotateAngleX = 1.570796F;

		// Right Engine
		boxes[9].addBox(-8, -4, 0, 10, 8, 4, 1f);
		boxes[9].setPosition(0, 3, byte0 / 2 + 9f);
		boxes[9].rotateAngleY = (float)Math.PI;
		// Left Engine
		boxes[14].addBox(-8, -4, 0, 10, 8, 4, 1F);
		boxes[14].setPosition(0, 3, -byte0 / 2 - 5f);
		boxes[14].rotateAngleY = (float)Math.PI;
		// Left Propeller
		boxes[10].addBox(-6, -0.5f, -0.5F, 12, 1, 2, 0.0F);
		boxes[10].setPosition(9.5F, 0.0F, byte0 / 2 + 7f);
		boxes[10].rotateAngleX = 1.570796F;
		boxes[10].rotateAngleZ = 1.570796F;
		boxes[11].addBox(-byte3 - 2, -0.5f, -0.5F, byte0 / 2, 1, 2, 0.0F);
		boxes[11].setPosition(9.5F, 0.0F, byte0 / 2 + 7f);
		boxes[11].rotateAngleX = 1.570796F;
		boxes[11].rotateAngleZ = 1.570796F;
		boxes[12].addBox(-byte3 - 2, -0.5f, -0.5F, byte0 / 2, 1, 2, 0.0F);
		boxes[12].setPosition(9.5F, 0.0F, byte0 / 2 + 7f);
		boxes[12].rotateAngleX = 1.570796F;
		boxes[12].rotateAngleZ = 1.570796F;
		boxes[13].addBox(-byte3 - 2, -0.5f, -0.5F, byte0 / 2, 1, 2, 0.0F);
		boxes[13].setPosition(9.5F, 0.0F, byte0 / 2 + 7f);
		boxes[13].rotateAngleX = 1.570796F;
		boxes[13].rotateAngleZ = 1.570796F;

		// Right Propeller

		boxes[15].addBox(-byte3 - 2, -0.5f, -0.5F, byte0 / 2, 1, 2, 0.0F);
		boxes[15].setPosition(9.5F, 0.0F, -byte0 / 2 - 7f);
		boxes[15].rotateAngleX = 1.570796F;
		boxes[15].rotateAngleZ = 1.570796F;
		boxes[16].addBox(-byte3 - 2, -0.5f, -0.5F, byte0 / 2, 1, 2, 0.0F);
		boxes[16].setPosition(9.5F, 0.0F, -byte0 / 2 - 7f);
		boxes[16].rotateAngleX = 1.570796F;
		boxes[16].rotateAngleZ = 1.570796F;
		boxes[17].addBox(-byte3 - 2, -0.5f, -0.5F, byte0 / 2, 1, 2, 0.0F);
		boxes[17].setPosition(9.5F, 0.0F, -byte0 / 2 - 7f);
		boxes[17].rotateAngleX = 1.570796F;
		boxes[17].rotateAngleZ = 1.570796F;
		boxes[18].addBox(-byte3 - 2, -0.5f, -0.5F, byte0 / 2, 1, 2, 0.0F);
		boxes[18].setPosition(9.5F, 0.0F, -byte0 / 2 - 7f);
		boxes[18].rotateAngleX = 1.570796F;
		boxes[18].rotateAngleZ = 1.570796F;

		boxes[19].addBox(0, 0, 0.0f, 0, 0, 0, 0.0F);

		// Boiler
		// boiler
		// -8, -4, 0, 10, 8, 4
		
			   boxes[20].addBox(0, 0, 0.0f, 0, 0, 0, 0.0F);
			   boxes[21].addBox(0, 0, 0.0f, 0, 0, 0, 0.0F);
		   
		boxes[20].setPosition(0.0F, 3.0F, 0.0F);
		boxes[20].rotateAngleX = 1.570796F;
		// Chimney
		
		boxes[21].setPosition(0.0F, 0.0F, 0.0F);

		// Rudder
		boxes[22].addBox(0, 0, 0, 0, 0, 0, 0.0F);

	}

	public void render(float f, float f1, float f2, float f3, float f4, float f5) {
		// figure out elapsed time since last frame to get a steady spin on the
		// paddles
		long now = System.nanoTime();
		int elapsed = (int) ((now - lastframe) / (1000 * 1000));
		bladespin -= (float) elapsed / 300.0f;
		lastframe = now;

		// give each of the paddles a quarter spin to make them fan out
		boxes[10].rotateAngleY = bladespin;
		boxes[11].rotateAngleY = bladespin + 0.78539825F;
		boxes[12].rotateAngleY = bladespin + 1.570796F;
		boxes[13].rotateAngleY = bladespin + 2.35619475F;

		boxes[15].rotateAngleY = bladespin;
		boxes[16].rotateAngleY = bladespin + 0.78539825F;
		boxes[17].rotateAngleY = bladespin + 1.570796F;
		boxes[18].rotateAngleY = bladespin + 2.35619475F;
		for (int i = 0; i < 27; i++) {
			boxes[i].render(f5);
		}
	}

	public CustomModelRenderer boxes[];
}
