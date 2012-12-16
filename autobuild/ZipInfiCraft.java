package cookie;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipInfiCraft
{
	static String mcpDir = "C:/Users/mDiyo/Desktop/mcpedit";
	static String gitDir = "C:/Users/mDiyo/Documents/GitHub/InfiCraft";

	static String commonmcp = "/src/common/";
	static String clientmcp = "/src/minecraft/";
	static String commongit = "/common/";
	static String clientgit = "/client/";

	static String reobfDir = mcpDir + "/reobf/minecraft";
	static String resourceDir = mcpDir + "/resources/";
	static String buildDir = mcpDir + "/build/";

	static File[] mcpDirs = { new File(mcpDir + commonmcp + "inficraft"), new File(mcpDir + commonmcp + "florasoma"), new File(mcpDir + commonmcp + "mDiyo"), new File(mcpDir + clientmcp + "inficraft"), new File(mcpDir + clientmcp + "florasoma"), new File(mcpDir + clientmcp + "mDiyo") };
	static File[] gitDirs = { new File(gitDir + commongit + "inficraft"), new File(gitDir + commongit + "florasoma"), new File(gitDir + commongit + "mDiyo"), new File(gitDir + clientgit + "inficraft"), new File(gitDir + clientgit + "florasoma"), new File(gitDir + clientgit + "mDiyo") };

	static String[] flora = { "FloraSoma-Berries", "FloraSoma-Clouds", "FloraSoma-Corruptor", "FloraSoma-Crops", "FloraSoma-Trees" };
	static String blocks = "InfiBlocks";
	static String[] tools = { "InfiTools-Library", "InfiTools-Base", "InfiTools-Hybrids", "InfiTools-2x2Extended" };
	static String[] orizon = { "Orizon-SlimePools", "Orizon-Stone" };
	static String bgm = "SimpleBackground";
	static String armor = "Armory";

	static String[] floraDir = { "berries", "clouds", "corruptor", "crops", "trees" };
	static String blocksDir = "infiblocks";
	static String[] toolsDir = { "library", "base", "hybrids", "twoxtwo" };
	static String[] orizonDir = { "slimepools", "pastelmarble" };
	static String bgmDir = "simplebackground";
	static String armorDir = "armory";

	static String tweaks = "Tweaks";
	static String deepfreeze = "DeepFreeze";

	static String date = "2012.12.15";
	
	static int compile = 0;

	public static void main(String[] args)
	{
		if (compile == 0)
		{
			try
			{
				copyFiles();
			} catch (IOException e)
			{
				e.printStackTrace();
			}
			try
			{
				runBatch();
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		else
			makeFiles();
	}

	static void copyFiles() throws IOException
	{
		System.out.println("Cleaning up files");
		initialCleanup();
		for (int i = 0; i < mcpDirs.length; i++)
			delete(mcpDirs[i]);

		System.out.println("Gathering source files");
		for (int i = 0; i < mcpDirs.length; i++)
			copyFolder(gitDirs[i], mcpDirs[i]);
	}

	static void runBatch() throws IOException
	{
		Runtime.getRuntime().exec("cmd /c start " + mcpDir + "/compile.bat");
	}

	static void makeFiles()
	{
		int iter;
		for (iter = 0; iter < flora.length; iter++)
		{
			makeFile(flora[iter], "/florasoma", floraDir[iter]);
		}
		makeFile(blocks, "/inficraft", blocksDir);
		for (iter = 0; iter < tools.length; iter++)
		{
			makeFile(tools[iter], "/inficraft/infitools", toolsDir[iter]);
		}
		for (iter = 0; iter < orizon.length; iter++)
		{
			makeFile(orizon[iter], "/inficraft/orizon", orizonDir[iter]);
		}
		makeFile(bgm, "/mDiyo", bgmDir);
		makeFile(armor, "/inficraft", armorDir);

		System.out.println("InfiCraft has compiled. Please exit out the rear windows and explode on the way down.");
	}

	static void makeFile(String buildname, String dir, String name)
	{
		System.out.println("Creating a zip file for " + buildname);
		try
		{
			File copyFile = new File(new StringBuilder().append(reobfDir).append(dir).append("/").append(name).toString());
			File buildFile = new File(new StringBuilder().append(buildDir).append(buildname).append(dir).append("/").append(name).toString());
			buildFile.mkdirs();

			copyFolder(copyFile, buildFile);
			checkApi(buildname);

			if (buildname != "SimpleBackground")
			{
				File copyTextures = new File(new StringBuilder().append(resourceDir).append(buildname).toString());
				File buildTextures = new File(new StringBuilder().append(buildDir).append(buildname).append("/infitextures").toString());
				copyFolder(copyTextures, buildTextures);
			}

			File copyMeta = new File(new StringBuilder().append(resourceDir).append(buildname).append(".info").toString());
			File buildMeta = new File(new StringBuilder().append(buildDir).append(buildname).append("/mcmod.info").toString());

			copyFile(copyMeta, buildMeta);

			String filename = (new StringBuilder().append(buildname).append("_1.4.5_").append(date).toString());

			List<String> fileList = new ArrayList<String>();
			String baseDir = new StringBuilder().append(buildDir).append("/").append(buildname).toString();
			generateFileList(new File(baseDir), baseDir, fileList);

			zipFiles(buildname, filename, fileList);

		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	static void checkApi(String buildname)
	{
		if (buildname.equals("FloraSoma-Crops") || buildname.equals("InfiBlocks") || buildname.equals("InfiTools-Library"))
		{
			File copyFile = new File(new StringBuilder().append(reobfDir).append("/inficraft/api").toString());
			File buildFile = new File(new StringBuilder().append(buildDir).append(buildname).append("/inficraft/api").toString());
			buildFile.mkdirs();

			try
			{
				copyFolder(copyFile, buildFile);
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

	static void zipFiles(String buildname, String filename, List<String> fileList) throws IOException
	{
		byte[] b = new byte[1024];
		ZipOutputStream out = new ZipOutputStream(new FileOutputStream(new StringBuilder().append(buildDir).append("/").append(filename).append(".zip").toString()));
		// name the file inside the zip file
		for (String file : fileList)
		{
			FileInputStream in = new FileInputStream(new StringBuilder().append(buildDir).append(buildname).append("/").append(file).toString());
			// out put file

			out.putNextEntry(new ZipEntry(file));

			int count;

			while ((count = in.read(b)) > 0)
			{
				out.write(b, 0, count);
			}

			in.close();
		}
		out.close();
	}

	/**
	 * Traverse a directory and get all files,
	 * and add the file into fileList  
	 * @param node file or directory
	 */
	public static void generateFileList(File node, String baseDir, List<String> fileList)
	{
		// add file only
		if (node.isFile())
		{
			fileList.add(generateZipEntry(node.getAbsoluteFile().toString(), baseDir));
		}

		if (node.isDirectory())
		{
			String[] subNote = node.list();
			for (String filename : subNote)
			{
				generateFileList(new File(node, filename), baseDir, fileList);
			}
		}
	}

	/**
	 * Format the file path for zip
	 * @param file file path
	 * @return Formatted file path
	 */
	private static String generateZipEntry(String file, String baseDir)
	{
		return file.substring(baseDir.length(), file.length());
	}

	static void delete(File f) throws IOException {
		  if (f.isDirectory()) {
		    for (File c : f.listFiles())
		      delete(c);
		  }
		  if (!f.delete())
		    throw new FileNotFoundException("Failed to delete file: " + f);
		}

	public static void copyFolder(File src, File dest) throws IOException
	{
		if (src.isDirectory())
		{

			// if directory not exists, create it
			if (!dest.exists())
			{
				dest.mkdir();
				// System.out.println("Directory copied from " + src + "  to " +
				// dest);
			}

			// list all the directory contents
			String files[] = src.list();

			for (String file : files)
			{
				// construct the src and dest file structure
				File srcFile = new File(src, file);
				File destFile = new File(dest, file);
				// recursive copy
				copyFolder(srcFile, destFile);
			}

		} else
		{
			// if file, then copy it
			// Use bytes stream to support all file types
			InputStream in = new FileInputStream(src);
			OutputStream out = new FileOutputStream(dest);

			byte[] buffer = new byte[1024];

			int length;
			// copy the file content in bytes
			while ((length = in.read(buffer)) > 0)
			{
				out.write(buffer, 0, length);
			}

			in.close();
			out.close();
			// System.out.println("File copied from " + src + " to " + dest);
		}
	}

	public static void copyFile(File src, File dest) throws IOException
	{
		// if file, then copy it
		// Use bytes stream to support all file types
		InputStream in = new FileInputStream(src);
		OutputStream out = new FileOutputStream(dest);

		byte[] buffer = new byte[1024];

		int length;
		// copy the file content in bytes
		while ((length = in.read(buffer)) > 0)
		{
			out.write(buffer, 0, length);
		}

		in.close();
		out.close();
		// System.out.println("File copied from " + src + " to " + dest);
	}

	static void initialCleanup()
	{
		File folder = new File(buildDir);

		try
		{
			delete(folder);
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		
		folder.mkdirs();
	}
}
