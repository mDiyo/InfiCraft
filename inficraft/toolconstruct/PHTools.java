package inficraft.toolconstruct;

import java.io.File;
import java.io.IOException;

import net.minecraftforge.common.Configuration;

public class PHTools {

    public static void initProps()
    {
        /* Here we will set up the config file for the mod 
         * First: Create a folder inside the config folder
         * Second: Create the actual config file
         * Note: Configs are a pain, but absolutely necessary for every mod.
         */
        File file = new File(ToolConstruct.proxy.getLocation() + "/config/InfiCraft");
        file.mkdir();
        File newFile = new File(ToolConstruct.proxy.getLocation() + "/config/InfiCraft/TConstruct.txt");

        /* Some basic debugging will go a long way */
        try
        {
            newFile.createNewFile();
        }
        catch (IOException e)
        {
            System.out.println("Could not create configuration file for TConstruct. Reason:");
            System.out.println(e);
        }

        /* [Forge] Configuration class, used as config method */
        Configuration config = new Configuration(newFile);

        /* Load the configuration file */
        config.load();

        /* Define the mod's IDs. 
         * Avoid values below 4096 for items and in the 250-450 range for blocks
         */
        
        woodCrafter = config.getBlock("Wood Tool Station", 1471).getInt(1471);
        stoneCrafter = config.getBlock("Stone Tool Station", 1472).getInt(1472);
        //netherCrafter = config.getBlock("Nether Tool Station", 1473).getInt(1473);
        
        materials = config.getItem("Patterns and Misc", "Materials", 14000).getInt(14000);
        toolRod = config.getItem("Patterns and Misc", "Tool Rod", 14001).getInt(14001);
        toolShard = config.getItem("Patterns and Misc", "Tool Shard", 14002).getInt(14002);
        woodPattern = config.getItem("Patterns and Misc", "Wood Pattern", 14003).getInt(14003);
        stonePattern = config.getItem("Patterns and Misc", "Stone Pattern", 14004).getInt(14004);
        //netherPattern = config.getItem("Patterns and Misc", "Nether Pattern", 14005).getInt(14005);
        
        pickaxeHead = config.getItem("Tool Parts", "Pickaxe Head", 14006).getInt(14006);
        shovelHead = config.getItem("Tool Parts", "Shovel Head", 14007).getInt(14007);
        axeHead = config.getItem("Tool Parts", "Axe Head", 14008).getInt(14008);
        hoeHead = config.getItem("Tool Parts", "Hoe Head", 14009).getInt(14009);
        
        swordBlade = config.getItem("Tool Parts", "Sword Blade", 14010).getInt(14010);
        largeGuard = config.getItem("Tool Parts", "Large Guard", 14011).getInt(14011);
        medGuard = config.getItem("Tool Parts", "Medium Guard", 14012).getInt(14012);
        crossbar = config.getItem("Tool Parts", "Crossbar", 14013).getInt(14013);
        binding = config.getItem("Tool Parts", "Tool Binding", 14014).getInt(14014);
        
        pickaxe = config.getItem("Tools", "Pickaxe", 14051).getInt(14051);
        shovel = config.getItem("Tools", "Shovel", 14052).getInt(14052);
        axe = config.getItem("Tools", "Axe", 14053).getInt(14053);
        hoe = config.getItem("Tools", "Hoe", 14054).getInt(14054);
        
        broadsword = config.getItem("Tools", "Broadsword", 14055).getInt(14055);
        fencingsword = config.getItem("Tools", "Fencing Sword", 14056).getInt(14056);
        rapier = config.getItem("Tools", "Rapier", 14057).getInt(14057);

        /* Save the configuration file */
        config.save();
    }
    
    //Blocks
    public static int woodCrafter;
    public static int stoneCrafter;
    public static int netherCrafter;
    
    //Patterns and misc
    public static int materials;
    public static int toolRod;
    public static int toolShard;
    public static int woodPattern;
    public static int stonePattern;
    public static int netherPattern;
    
    //Tools
    public static int pickaxe;
    public static int shovel;
    public static int axe;
    public static int hoe;
    
    public static int broadsword;
    public static int fencingsword;
    public static int rapier;

    //Tool parts
    public static int swordBlade;
    public static int largeGuard;
    public static int medGuard;
    public static int crossbar;

    public static int pickaxeHead;
    public static int axeHead;
    public static int shovelHead;
    public static int hoeHead;
    
    public static int binding;
}