package net.minecraft.src;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod$Init;
import cpw.mods.fml.common.Mod$PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import java.io.File;
import java.util.HashSet;
import net.minecraft.src.mod_ToolRack$RenderingProxy;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;

@Mod(
        modid = "mod_ToolRack",
        name = "Tool Rack",
        version = "1.2.1"
)
@NetworkMod(
        clientSideRequired = true,
        serverSideRequired = true
)
public class mod_ToolRack
{
    @SidedProxy(
            serverSide = "mod_ToolRack$RenderingProxy",
            clientSide = "mod_ToolRack$RenderingClient"
    )
    public static mod_ToolRack$RenderingProxy renderingProxy;
    public static BlockRack rack;
    public static int rackID;
    public static HashSet additionalTools;
    public static HashSet reversedItems;
    public static HashSet straightItems;
    public static final String[] rackNames = new String[] {"Wooden Rack", "Stone Rack", "Gold Rack", "Obsidian Rack"};
    public static final Object[] craftItems = new Object[] {Block.planks, Block.stone, Item.ingotGold, Block.obsidian};
    public static final Block[] skins = new Block[] {Block.planks, Block.stone, Block.blockGold, Block.obsidian};
    public static final String additionalToolsDefault = "347, 5263, 5702, 5770";
    public static final String reversedDefault = "478, 479, 480, 481, 482, 528, 529, 530, 531, 532, 5582, 5587, 5651, 13369";
    public static final String spadesDefault = "256, 269, 273, 277, 284";
    public static final String straightDefault = "347, 354";

    public mod_ToolRack()
    {
        additionalTools = new HashSet();
        reversedItems = new HashSet();
        straightItems = new HashSet();
    }

    @Mod$PreInit
    public void preload(FMLPreInitializationEvent var1)
    {
        File var2 = new File(var1.getModConfigurationDirectory(), "ToolRack.cfg");
        Configuration var3 = new Configuration(var2);
        var3.load();
        rackID = var3.getOrCreateBlockIdProperty("ID.ToolRackBlock", 3747).getInt();
        Property var4 = var3.getOrCreateProperty("AdditionalTools", "general", "347, 5263, 5702, 5770");
        String[] var5 = var4.value.split("\\s*,\\s*");
        int var6 = var5.length;
        int var7;

        for (var7 = 0; var7 < var6; ++var7)
        {
            String var8 = var5[var7];
            additionalTools.add(Integer.valueOf(Integer.parseInt(var8)));
        }

        Property var12 = var3.getOrCreateProperty("ReversedTools", "general", "478, 479, 480, 481, 482, 528, 529, 530, 531, 532, 5582, 5587, 5651, 13369");
        String[] var14 = var12.value.split("\\s*,\\s*");
        var7 = var14.length;
        int var16;

        for (var16 = 0; var16 < var7; ++var16)
        {
            String var9 = var14[var16];
            reversedItems.add(Integer.valueOf(Integer.parseInt(var9)));
        }

        Property var13 = var3.getOrCreateBooleanProperty("ReverseSpades", "general", false);
        int var18;

        if (var13.getBoolean(false))
        {
            String[] var15 = "256, 269, 273, 277, 284".split("\\s*,\\s*");
            var16 = var15.length;

            for (var18 = 0; var18 < var16; ++var18)
            {
                String var10 = var15[var18];
                reversedItems.add(Integer.valueOf(Integer.parseInt(var10)));
            }
        }

        Property var17 = var3.getOrCreateProperty("StraightItems", "general", "347, 354");
        String[] var19 = var17.value.split("\\s*,\\s*");
        var18 = var19.length;

        for (int var20 = 0; var20 < var18; ++var20)
        {
            String var11 = var19[var20];
            straightItems.add(Integer.valueOf(Integer.parseInt(var11)));
        }

        var3.save();
    }

    @Mod$Init
    public void load(FMLInitializationEvent var1)
    {
        rack = new BlockRack(rackID, skins[1]);
        rack.setBlockName("rack");
        GameRegistry.registerBlock(rack, ItemRack.class);
        GameRegistry.registerTileEntity(TileEntityRack.class, "Rack");
        renderingProxy.register();
        LanguageRegistry.addName(rack, "Rack");

        for (int var2 = 0; var2 < skins.length; ++var2)
        {
            LanguageRegistry.addName(new ItemStack(rack, 1, var2 << 2), rackNames[var2]);
            GameRegistry.addRecipe(new ItemStack(rack, 1, var2 << 2), new Object[] {" #", " s", "#s", '#', craftItems[var2], 's', Item.stick});
        }
    }
}
