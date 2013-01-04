package pchan3;

import net.minecraft.client.model.ModelBase;

public class ModelBalloon extends ModelBase

{
	public CustomModelRenderer boxes;

	public ModelBalloon() {
		boxes = new CustomModelRenderer(0, 0, 256, 256);
		// Balloon
		boxes.addBox(0, 0, 0, 64, 64, 64, -8.0F);
		boxes.setPosition(-30, -15, -30);
		boxes.rotateAngleX = 1.570796F;
	}

	public void render(float f, float f1, float f2, float f3, float f4, float f5) {
		boxes.render(f5);
	}
}
