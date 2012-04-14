package net.minecraft.src;
import net.minecraft.src.zipline.*;
import java.lang.reflect.Field;
import java.util.Map;
import net.minecraft.client.Minecraft;

public class mod_Zipline extends BaseMod implements ICameraMod, IBowMod
{
    public static int ropeLength;
    public static int ropeRenderType;
    public static int helpID;
    public static int ropeTextureID;
    public static int ropeIconID;
    public static int arrowRopeIconID;
    public static int ropeBridgeTextureID;
    public static int handlebarIconID;
    public static int leatherTextureID;
    public static ModProperties properties;
    public static Achievement achievementMakeRope;
    public static Achievement achievementFireArrowRope;
    public static Achievement achievementBreakRopeBridge;
    public static Achievement achievementRideZipline;
    public static Block ropeID = null;
    public static BlockTensile ropeBridgeID = null;
    public static BlockTensile clothSheetID = null;
    public static BlockTensile leatherID = null;
    public static Item arrowRopeID = null;
    public static Item handlebarID = null;
    private RenderBlockFire renderblockFire;

    public void load()
    {
        /*ropeRenderType = ModLoader.getUniqueBlockModelID(this, false);
        ropeLength = 8;
        ropeID = (new BlockRope(131, ropeTextureID = ModLoader.addOverride("/terrain.png", "/zipline/rope.png"), Material.cloth, ropeRenderType)).setBlockName("rope").setHardness(0.15F).setStepSound(Block.soundClothFootstep);
        ModLoader.registerBlock(ropeID);
        Item var1 = Item.itemsList[ropeID.blockID];
        var1.setIconIndex(ModLoader.addOverride("/terrain.png", "/zipline/ropeitem.png"));
        ModLoader.addName(ropeID, "Rope");
        ModLoader.registerEntityID(EntityZiplineArrow.class, "ziplinearrow", ModLoader.getUniqueEntityId());
        ropeBridgeID = (BlockTensile)(new BlockRopeBridge(132, ropeBridgeTextureID = ModLoader.addOverride("/terrain.png", "/zipline/ropebridge.png"), Material.wood, ropeRenderType)).setBlockName("ropebridge").setHardness(2.0F).setStepSound(Block.soundWoodFootstep);
        ropeBridgeID.pixelsWide = 16.0D;
        ropeBridgeID.boundingWidth = 1.0D;
        ropeBridgeID.crossPieces = new double[] {0.1875D, 0.8125D};
        ModLoader.registerBlock(ropeBridgeID);
        ModLoader.addName(ropeBridgeID, "Rope Bridge");
        clothSheetID = (BlockTensile)(new BlockTensile(133, Block.cloth.blockIndexInTexture, Material.cloth, ropeRenderType)).setBlockName("clothsheet").setHardness(0.1F).setStepSound(Block.soundClothFootstep);
        clothSheetID.pixelsWide = 16.0D;
        clothSheetID.boundingWidth = 1.0D;
        clothSheetID.crossPieces = new double[0];
        ModLoader.registerBlock(clothSheetID);
        ModLoader.addName(clothSheetID, "ClothSheet");
        leatherID = (BlockTensile)(new BlockLeather(134, leatherTextureID = ModLoader.addOverride("/terrain.png", "/zipline/leather.png"), Material.cloth, ropeRenderType)).setBlockName("leather").setHardness(0.2F).setStepSound(Block.soundClothFootstep);
        leatherID.pixelsWide = 16.0D;
        leatherID.boundingWidth = 1.0D;
        leatherID.crossPieces = new double[0];
        Item.itemsList[334] = null;
        Item.leather = new ItemLeather(78, leatherID.blockID);
        ModLoader.registerBlock(leatherID);
        ModLoader.addName(leatherID, "LeatherBlock");
        arrowRopeIconID = ModLoader.getUniqueSpriteIndex("/gui/items.png");
        ModLoader.addOverride("/gui/items.png", "/zipline/arrowrope.png", arrowRopeIconID);
        arrowRopeID = (new ItemArrowRope(144, arrowRopeIconID)).setItemName("arrowRope");
        ModLoader.addName(arrowRopeID, "Arrow with Rope");
        handlebarID = (new ItemHandlebar(145, handlebarIconID = ModLoader.addOverride("/gui/items.png", "/zipline/handlebar.png"))).setItemName("handlebar");
        ModLoader.addName(handlebarID, "Handlebar");
        ModCamera.registerModifier(this, ropeID.blockID);
        ModBow.registerModifier(this);
        ModLoader.setInGameHook(this, true, false);
        byte var2 = 1;
        byte var3 = 1;
        byte var4 = 8;
        byte var5 = 1;
        achievementMakeRope = (new Achievement(1001, "makeRope", var4, var5, Block.blocksList[ropeID.blockID], AchievementList.buildWorkBench)).registerAchievement();
        ModLoader.addAchievementDesc(achievementMakeRope, "Twist and shout", "Use string to make rope.");
        achievementFireArrowRope = (new Achievement(1002, "fireArrowRope", var4, var5 + var3 * 2, Item.itemsList[arrowRopeID.shiftedIndex], achievementMakeRope)).registerAchievement();
        ModLoader.addAchievementDesc(achievementFireArrowRope, "Clothesline", "Fire an arrow with rope attached.");
        achievementBreakRopeBridge = (new Achievement(1003, "breakRopeBridge", var4 + var2 * 2, var5 + var3 * 2, Block.blocksList[ropeBridgeID.blockID], achievementFireArrowRope)).registerAchievement();
        ModLoader.addAchievementDesc(achievementBreakRopeBridge, "Look out below", "Break a suspension bridge while standing on it.");
        achievementRideZipline = (new Achievement(1004, "rideZipline", var4, var5 + var3 * 4, Item.itemsList[handlebarID.shiftedIndex], achievementFireArrowRope)).registerAchievement();
        ModLoader.addAchievementDesc(achievementRideZipline, "RCWAPITM!", "Ride a rope zipline with a handlebar!");
        this.addRecipes();*/
    }

    static void setFinalStatic(Field var0, Object var1) throws Exception
    {
        var0.setAccessible(true);
        Field var2 = Field.class.getDeclaredField("modifiers");
        var2.setAccessible(true);
        var2.setInt(var0, var0.getModifiers() & -17);
        var0.set((Object)null, var1);
    }

    public void addRenderer(Map var1)
    {
        var1.put(EntityHandlebar.class, new RenderHandlebar());
        var1.put(EntityZiplineArrow.class, new RenderZiplineArrow());
    }

    public boolean renderWorldBlock(RenderBlocks var1, IBlockAccess var2, int var3, int var4, int var5, Block var6, int var7)
    {
        if (var6 instanceof BlockFire)
        {
            this.renderblockFire.renderBlockFire(var2, var6, var3, var4, var5, var1.overrideBlockTexture);
            return true;
        }
        else
        {
            Tessellator var8 = Tessellator.instance;
            float var9 = var6.getBlockBrightness(var2, var3, var4, var5);
            var8.setColorOpaque_F(var9, var9, var9);
            var8.setBrightness(240);
            BlockTensile var10 = (BlockTensile)var6;
            var10.render(var2.getBlockMetadata(var3, var4, var5), var3, var4, var5, var2, var1);
            return true;
        }
    }

    public void modifyCamera(Entity var1, int var2, int var3, int var4, int var5, float var6)
    {
        ((BlockTensile)Block.blocksList[ropeID.blockID]).modifyCamera(var1, var2, var3, var4, var5, var6);
    }

    public boolean onTickInGame(float var1, Minecraft var2)
    {
        BlockTensile.swingAmplitude *= BlockTensile.swingDecay;

        if (var2.thePlayer.onGround)
        {
            BlockTensile.swingAmplitude += var2.thePlayer.distanceWalkedModified - var2.thePlayer.prevDistanceWalkedModified;
        }

        return true;
    }

    public boolean dispenseEntity(World var1, double var2, double var4, double var6, int var8, int var9, ItemStack var10)
    {
        if (var10.itemID == arrowRopeID.shiftedIndex)
        {
            EntityZiplineArrow var11 = ((ItemArrowRope)Item.itemsList[arrowRopeID.shiftedIndex]).getEntityArrow(var1, var2, var4, var6, var10);
            var11.setArrowHeading((double)var8, 0.1000000014901161D, (double)var9, 1.1F, 6.0F);
            var1.spawnEntityInWorld(var11);
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean onBowRightClick(ItemStack[] var1, World var2, EntityPlayer var3)
    {
        var3.setItemInUse(var1[0], 72000);
        return false;
    }

    public void addRecipes()
    {
        ModLoader.addRecipe(new ItemStack(Item.silk, 4), new Object[] {"!", '!', Block.cloth});
        ModLoader.addRecipe(new ItemStack(ropeID, 1), new Object[] {"S", "S", 'S', Item.silk});
        ModLoader.addRecipe(new ItemStack(Item.silk, 2), new Object[] {"!", '!', ropeID});
        ModLoader.addRecipe(new ItemStack(ropeBridgeID, 3), new Object[] {"S#S", "S#S", "S#S", '#', Block.planks, 'S', ropeID});
        ModLoader.addRecipe(new ItemStack(clothSheetID, 9), new Object[] {"SSS", 'S', Block.cloth});
        ModLoader.addRecipe(new ItemStack(Block.cloth, 3), new Object[] {"SSS", "SSS", "SSS", 'S', clothSheetID});
        ModLoader.addShapelessRecipe(new ItemStack(arrowRopeID, 1, 0), new Object[] {Item.arrow, ropeID, ropeID, ropeID, ropeID, ropeID, ropeID, ropeID, ropeID});

        for (int var1 = 0; var1 < 7; ++var1)
        {
            ModLoader.addShapelessRecipe(new ItemStack(arrowRopeID, 1, 7 - var1), new Object[] {new ItemStack(arrowRopeID, 1, (8 - var1) % 8), ropeID, ropeID, ropeID, ropeID, ropeID, ropeID, ropeID, ropeID});
        }

        ModLoader.addRecipe(new ItemStack(handlebarID, 1), new Object[] {" ! ", "! !", '!', Item.stick});
    }

    public void takenFromCrafting(EntityPlayer var1, ItemStack var2)
    {
        if (var2.itemID == ropeID.blockID)
        {
            ModLoader.getMinecraftInstance().thePlayer.triggerAchievement(achievementMakeRope);
        }
    }

    public String getVersion()
    {
        return "Zipline 1.2.3 v1";
    }
}
