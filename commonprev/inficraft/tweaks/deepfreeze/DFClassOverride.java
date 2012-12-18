package inficraft.tweaks.deepfreeze;

import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.util.zip.*;

import cpw.mods.fml.common.asm.transformers.AccessTransformer;
import cpw.mods.fml.relauncher.IClassTransformer;

public class DFClassOverride implements IClassTransformer 
{
	public static HashMap<String, String> override = new HashMap<String, String>();

	public static void addClassOverride(String name, String description) {
		override.put(name, description);
	}

	@Override
	public byte[] transform(String name, byte[] bytes) 
	{
		if (override.containsKey(name)) {
			System.out.println("attempting override of " + name + " from " + DeepFreeze.coreLocation);
			bytes = overrideBytes(name, bytes, DeepFreeze.coreLocation);
		} 
		return bytes;
	}

	public static byte[] overrideBytes(String name, byte[] bytes, File location) {
		try {
			ZipFile zip = new ZipFile(location);
			ZipEntry entry = zip.getEntry(name.replace('.', '/') + ".class");
			if (entry == null)
				System.out.println(name + " not found in " + location.getName());
			else {
				InputStream zin = zip.getInputStream(entry);
				bytes = new byte[(int) entry.getSize()];
				zin.read(bytes);
				zin.close();
				System.out.println(name + " was overriden from " + location.getName());
			}
			zip.close();
		} catch (Exception e) {
			throw new RuntimeException("Error overriding " + name + " from " + location.getName(), e);
		}
		return bytes;
	}
}
