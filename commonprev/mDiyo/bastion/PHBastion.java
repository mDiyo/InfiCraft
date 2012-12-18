package mDiyo.bastion;

import java.io.File;
import java.io.IOException;

import net.minecraft.client.Minecraft;
import net.minecraftforge.common.Configuration;

public class PHBastion
{
	public static boolean redoRecipes;
	public static int barricadeOak;
	public static int barricadeBirch;
	public static int barricadePine;
	public static int barricadeCecropia;
	public static int rope;
	public static int ropeBridge;
	public static int leviwing;

	public static void initProps()
	{
		File file = new File(Minecraft.getMinecraftDir() + "/config");
		file.mkdir();
		File newFile = new File(Minecraft.getMinecraftDir() + "/config/BastionConfig.txt");
		try
		{
			newFile.createNewFile();
			System.out.println("Successfully created/read configuration file for Bastion");
		}
		catch (IOException e)
		{
			System.out.println("Could not create configuration file for Bastion. Reason:");
			System.out.println(e);
		}

		Configuration config = new Configuration(newFile);

		config.load();

		redoRecipes = config.get("general", "Rework vanilla recipes", true).getBoolean(true);

		barricadeOak = config.getBlock("Oak Barrier Spikes", 801).getInt(801);
		barricadeBirch = config.getBlock("Birch Barrier Spikes", 802).getInt(802);
		barricadePine = config.getBlock("Pine Barrier Spikes", 803).getInt(803);
		barricadeCecropia = config.getBlock("Cecropia Barrier Spikes", 804).getInt(804);

		leviwing = config.getItem("LeviWing", 12401).getInt(12401);

		config.save();
	}
}