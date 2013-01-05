package inficraft.tweaks.world;

import inficraft.tweaks.deepfreeze.DFClassOverride;

import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.util.zip.*;

import cpw.mods.fml.common.asm.transformers.AccessTransformer;
import cpw.mods.fml.relauncher.IClassTransformer;

public class WTClassOverride implements IClassTransformer
{
	public static HashMap<String, String> override = new HashMap<String, String>();

	public static void addClassOverride (String name, String description)
	{
		override.put(name, description);
	}

	@Override
	public byte[] transform (String name, byte[] bytes)
	{
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
			bytes = overrideBytes(name, bytes, WorldTweaks.coreLocation);
		}
		return bytes;
	}

	public static byte[] overrideBytes (String name, byte[] bytes, File location)
	{
		if (bytes == null)
		{
			return null;
		}
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
		return bytes;
	}
}
