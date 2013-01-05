package inficraft.tweaks.hunger;

import inficraft.tweaks.deepfreeze.DFClassOverride;

import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import cpw.mods.fml.common.asm.transformers.AccessTransformer;
import cpw.mods.fml.relauncher.IClassTransformer;

public class HTClassOverride implements IClassTransformer
{
	static boolean hasInit = false;
	public static HashMap<String, String> override = new HashMap<String, String>();
	
	public void init()
	{
		this.addClassOverride("qx", "EntityPlayer, Sprinting drains less hunger");
		this.addClassOverride("rp", "FoodStats, full hunger no longer required");
		hasInit = true;
	}

	public static void addClassOverride (String name, String description)
	{
		override.put(name, description);
		System.out.println("Adding class override: "+name);
	}

	@Override
	public byte[] transform (String name, byte[] bytes)
	{
		System.out.println("Name: "+name);
		if (!hasInit)
			init();
	
		if (bytes == null)
			return null;
		
		if (override.containsKey(name))
		{
			//This is a debug measure. Sometimes the files aren't found, we'll tell Java where they are. No, I don't know why the **** you need this.
			try
			{
				Class c = Class.forName(name);
				System.out.println("Attempting override of: " + name + " " + DFClassOverride.override.get(name));
			}
			catch (Exception ex)
			{
				System.out.println("Files were missing! Good job breaking it you numpty");
				ex.printStackTrace();
			}

			//Do the real thing
			bytes = overrideBytes(name, bytes, HungerTweaks.coreLocation);
		}
		return bytes;
	}

	public static byte[] overrideBytes (String name, byte[] bytes, File location)
	{
		try
		{
			ZipFile zip = new ZipFile(location);
			ZipEntry entry = zip.getEntry(name.replace('.', '/') + ".class");
			if (entry == null)
				System.out.println(name + " not found in " + location.getName());
			else
			{
				InputStream zin = zip.getInputStream(entry);
				bytes = new byte[(int) entry.getSize()];
				zin.read(bytes);
				zin.close();
			}
			zip.close();
		}
		catch (Exception e)
		{
			throw new RuntimeException("Error overriding " + name + " from " + location.getName(), e);
		}
		System.out.println("Byte length: " + bytes.length);
		return bytes;
	}
}
