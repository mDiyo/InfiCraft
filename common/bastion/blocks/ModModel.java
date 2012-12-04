package bastion.blocks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import net.minecraft.client.Minecraft;
import net.minecraft.src.Tessellator;

public class ModModel
{
	public static ModModelRect[][] models;
	public static int model_index = 0;
	public static boolean initialized = false;
	public ArrayList vertices;
	public int x;
	public int y;
	public int z;
	public int texture;
	public double u;
	public double v;

	public static void init()
	{
		if (!initialized)
		{
			initialized = true;
		}
	}

	public static int addModel(String var0)
	{
		try
		{
			init();
			File var1 = new File(Minecraft.getMinecraftDir(), var0);
			FileReader var2 = new FileReader(var1);
			BufferedReader var3 = new BufferedReader(var2);
			ArrayList var4 = new ArrayList();
			byte var5 = 0;
			String var6 = var3.readLine();

			for (int var11 = var5 + 1; var6 != null; var11++)
			{
				String[] var7 = var6.split(",");
				ModModelRect var8 = new ModModelRect(Integer.parseInt(var7[0]), Float.parseFloat(var7[1]), Float.parseFloat(var7[2]), Float.parseFloat(var7[3]), Float.parseFloat(var7[4]), Float.parseFloat(var7[5]), Float.parseFloat(var7[6]), Float.parseFloat(var7[7]), Float.parseFloat(var7[8]), Float.parseFloat(var7[9]), Float.parseFloat(var7[10]), Integer.parseInt(var7[11]) != 0, Integer.parseInt(var7[12]) != 0);
				var4.add(var8);
				var6 = var3.readLine();
			}

			var3.close();

			if (models == null)
			{
				models = new ModModelRect[256][];
			}

			ModModelRect[] var12 = new ModModelRect[var4.size()];
			var4.toArray(var12);
			models[model_index] = var12;
			return model_index++;
		}
		catch (FileNotFoundException var9)
		{
			return -1;
		}
		catch (IOException var10) {
		}
		return -1;
	}

	public static void renderModel(Tessellator var0, int var1, double var2, double var4, double var6, int var8)
	{
		ModModelRect[] var9 = models[var1];

		for (int var10 = 0; var10 < var9.length; var10++)
		{
			var9[var10].render(var0, var2, var4, var6, var8);
		}
	}

	public ModModel(int var1, int var2, int var3, int var4)
	{
		setPosition(var1, var2, var3);
		setTexture(var4);
		this.vertices = new ArrayList();
	}

	public void setPosition(int var1, int var2, int var3)
	{
		this.x = var1;
		this.y = var2;
		this.z = var3;
	}

	public void setTexture(int var1)
	{
		this.texture = var1;
		this.u = (((var1 & 0xF) << 4) / 256.0D);
		this.v = ((var1 & 0xF0) / 256.0D);
	}

	public void addVertexWithUV(double var1, double var3, double var5, double var7, double var9)
	{
		this.vertices.add(new double[] { var1, var3, var5, var7, var9 });
	}

	public void addVertexWithUV(double var1, double var3, double var5, int var7)
	{
		addVertexWithUV(var1, var3, var5, var7, 0.0D, 0.0D);
	}

	public void addVertexWithUV(double var1, double var3, double var5, int var7, double var8, double var10)
	{
		double var12 = 0.0D;
		double var14 = 0.0D;

		switch ((var7 & 0x38) >> 3)
		{
		case 1:
			var12 = var3;
			break;
		case 2:
			var12 = var5;
			break;
		case 3:
			var12 = 1.0D - var1;
			break;
		case 4:
			var12 = 1.0D - var3;
			break;
		case 5:
			var12 = 1.0D - var5;
			break;
		default:
			var12 = var1;
		}

		switch (var7 & 0x7)
		{
		case 1:
			var14 = var3;
			break;
		case 2:
			var14 = var5;
			break;
		case 3:
			var14 = 1.0D - var1;
			break;
		case 4:
			var14 = 1.0D - var3;
			break;
		case 5:
			var14 = 1.0D - var5;
			break;
		default:
			var14 = var1;
		}

		addVertexWithUV(var1, var3, var5, Math.max(0.0D, Math.min(1.0D, var12 + var8)), Math.max(0.0D, Math.min(1.0D, var14 + var10)));
	}

	public void render(boolean var1)
	{
		render(var1, false, false);
	}

	public void render(boolean var1, boolean var2)
	{
		render(var1, var2, false);
	}

	public void render(boolean var1, boolean var2, boolean var3)
	{
		Tessellator var4 = Tessellator.instance;
		int var5 = var2 ? -1 : 1;
		int var6 = var3 ? -1 : 1;
		int var7 = var2 ? 1 : 0;
		int var8 = var3 ? 1 : 0;

		if (!var1)
		{
			for (int var9 = 0; var9 < this.vertices.size(); var9++)
			{
				double[] var10 = (double[])(double[])this.vertices.get(var9);
				var4.addVertexWithUV(this.x + var10[0], this.y + var10[1], this.z + var10[2], this.u + (var10[3] * var5 + var7) / 16.0D, this.v + (var10[4] * var6 + var8) / 16.0D);
			}

		}

		for (int var9 = this.vertices.size() - 1; var9 >= 0; var9--)
		{
			double[] var10 = (double[])(double[])this.vertices.get(var9);
			var4.addVertexWithUV(this.x + var10[0], this.y + var10[1], this.z + var10[2], this.u + (var10[3] * var5 + var7) / 16.0D, this.v + (var10[4] * var6 + var8) / 16.0D);
		}
	}
}