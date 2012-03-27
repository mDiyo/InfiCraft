package net.minecraft.src;

public class InfiTools
{
    private static final InfiTools instance = new InfiTools();

    public static final InfiTools getInstance()
    {
        return instance;
    }

    private InfiTools()
    {
    }

    public static InfiProps InitProps(InfiProps infiprops)
    {
        mod_InfiTools.blockMossID = infiprops.accessInt("blockMossID", 252);
        mod_InfiTools.rodID = infiprops.accessInt("rodID", 13891);
        mod_InfiTools.paperMaterialsID = infiprops.accessInt("paperMaterialsID", 13917);
        mod_InfiTools.metalChunksID = infiprops.accessInt("metalChunksID", 13925);
        mod_InfiTools.mossID = infiprops.accessInt("mossID", 13929);
        mod_InfiTools.crystalID = infiprops.accessInt("crystalID", 13933);
        mod_InfiTools.woodBucketID = infiprops.accessInt("woodBucketID", 13949);
        mod_InfiTools.cactusBucketID = infiprops.accessInt("cactusBucketID", 13954);
        mod_InfiTools.goldBucketID = infiprops.accessInt("goldBucketID", 13959);
        mod_InfiTools.iceBucketID = infiprops.accessInt("iceBucketID", 13965);
        mod_InfiTools.lavaBucketID = infiprops.accessInt("lavaBucketID", 13970);
        mod_InfiTools.slimeBucketID = infiprops.accessInt("slimeBucketID", 13974);
        mod_InfiTools.ironBucketID = infiprops.accessInt("ironBucketID", 13979);
        mod_InfiTools.bowlID = infiprops.accessInt("bowlID", 13981);
        mod_InfiTools.materialShardID = infiprops.accessInt("materialShardID", 14001);
        mod_InfiTools.pumpkinPieID = infiprops.accessInt("pumpkinPieID", 14017);
        mod_InfiTools.pumpkinPulpID = infiprops.accessInt("pumpkinPulpID", 14334);
        mod_InfiTools.woodSwordID = infiprops.accessInt("woodSwordID", 14101);
        mod_InfiTools.stoneSwordID = infiprops.accessInt("stoneSwordID", 14113);
        mod_InfiTools.ironSwordID = infiprops.accessInt("ironSwordID", 14127);
        mod_InfiTools.diamondSwordID = infiprops.accessInt("diamondSwordID", 14142);
        mod_InfiTools.goldSwordID = infiprops.accessInt("goldSwordID", 14156);
        mod_InfiTools.redstoneSwordID = infiprops.accessInt("redstoneSwordID", 14171);
        mod_InfiTools.obsidianSwordID = infiprops.accessInt("obsidianSwordID", 14185);
        mod_InfiTools.sandstoneSwordID = infiprops.accessInt("sandstoneSwordID", 14201);
        mod_InfiTools.boneSwordID = infiprops.accessInt("boneSwordID", 14215);
        mod_InfiTools.paperSwordID = infiprops.accessInt("paperSwordID", 14231);
        mod_InfiTools.mossySwordID = infiprops.accessInt("mossySwordID", 14241);
        mod_InfiTools.netherrackSwordID = infiprops.accessInt("netherrackSwordID", 14250);
        mod_InfiTools.glowstoneSwordID = infiprops.accessInt("glowstoneSwordID", 14268);
        mod_InfiTools.iceSwordID = infiprops.accessInt("iceSwordID", 14285);
        mod_InfiTools.lavaSwordID = infiprops.accessInt("lavaSwordID", 14303);
        mod_InfiTools.slimeSwordID = infiprops.accessInt("slimeSwordID", 14313);
        mod_InfiTools.cactusSwordID = infiprops.accessInt("cactusSwordID", 14336);
        mod_InfiTools.flintSwordID = infiprops.accessInt("flintSwordID", 14349);
        mod_InfiTools.brickSwordID = infiprops.accessInt("brickSwordID", 14367);
        mod_InfiTools.blazeSwordID = infiprops.accessInt("blazeSwordID", 14379);
        mod_InfiTools.woodPickaxeID = infiprops.accessInt("woodPickaxeID", 14401);
        mod_InfiTools.stonePickaxeID = infiprops.accessInt("stonePickaxeID", 14413);
        mod_InfiTools.ironPickaxeID = infiprops.accessInt("ironPickaxeID", 14427);
        mod_InfiTools.diamondPickaxeID = infiprops.accessInt("diamondPickaxeID", 14442);
        mod_InfiTools.goldPickaxeID = infiprops.accessInt("goldPickaxeID", 14456);
        mod_InfiTools.redstonePickaxeID = infiprops.accessInt("redstonePickaxeID", 14471);
        mod_InfiTools.obsidianPickaxeID = infiprops.accessInt("obsidianPickaxeID", 14485);
        mod_InfiTools.sandstonePickaxeID = infiprops.accessInt("sandstonePickaxeID", 14501);
        mod_InfiTools.bonePickaxeID = infiprops.accessInt("bonePickaxeID", 14515);
        mod_InfiTools.paperPickaxeID = infiprops.accessInt("paperPickaxeID", 14531);
        mod_InfiTools.mossyPickaxeID = infiprops.accessInt("mossyPickaxeID", 14541);
        mod_InfiTools.netherrackPickaxeID = infiprops.accessInt("netherrackPickaxeID", 14550);
        mod_InfiTools.glowstonePickaxeID = infiprops.accessInt("glowstonePickaxeID", 14568);
        mod_InfiTools.icePickaxeID = infiprops.accessInt("icePickaxeID", 14585);
        mod_InfiTools.lavaPickaxeID = infiprops.accessInt("lavaPickaxeID", 14603);
        mod_InfiTools.slimePickaxeID = infiprops.accessInt("slimePickaxeID", 14613);
        mod_InfiTools.cactusPickaxeID = infiprops.accessInt("cactusPickaxeID", 14636);
        mod_InfiTools.flintPickaxeID = infiprops.accessInt("flintPickaxeID", 14649);
        mod_InfiTools.brickPickaxeID = infiprops.accessInt("brickPickaxeID", 14667);
        mod_InfiTools.blazePickaxeID = infiprops.accessInt("blazePickaxeID", 14679);
        mod_InfiTools.woodShovelID = infiprops.accessInt("woodShovelID", 14701);
        mod_InfiTools.stoneShovelID = infiprops.accessInt("stoneShovelID", 14713);
        mod_InfiTools.ironShovelID = infiprops.accessInt("ironShovelID", 14727);
        mod_InfiTools.diamondShovelID = infiprops.accessInt("diamondShovelID", 14742);
        mod_InfiTools.goldShovelID = infiprops.accessInt("goldShovelID", 14756);
        mod_InfiTools.redstoneShovelID = infiprops.accessInt("redstoneShovelID", 14771);
        mod_InfiTools.obsidianShovelID = infiprops.accessInt("obsidianShovelID", 14785);
        mod_InfiTools.sandstoneShovelID = infiprops.accessInt("sandstoneShovelID", 14801);
        mod_InfiTools.boneShovelID = infiprops.accessInt("boneShovelID", 14815);
        mod_InfiTools.paperShovelID = infiprops.accessInt("paperShovelID", 14831);
        mod_InfiTools.mossyShovelID = infiprops.accessInt("mossyShovelID", 14841);
        mod_InfiTools.netherrackShovelID = infiprops.accessInt("netherrackShovelID", 14850);
        mod_InfiTools.glowstoneShovelID = infiprops.accessInt("glowstoneShovelID", 14868);
        mod_InfiTools.iceShovelID = infiprops.accessInt("iceShovelID", 14885);
        mod_InfiTools.lavaShovelID = infiprops.accessInt("lavaShovelID", 14903);
        mod_InfiTools.slimeShovelID = infiprops.accessInt("slimeShovelID", 14913);
        mod_InfiTools.cactusShovelID = infiprops.accessInt("cactusShovelID", 14936);
        mod_InfiTools.flintShovelID = infiprops.accessInt("flintShovelID", 14949);
        mod_InfiTools.brickShovelID = infiprops.accessInt("brickShovelID", 14967);
        mod_InfiTools.blazeShovelID = infiprops.accessInt("blazeShovelID", 14979);
        mod_InfiTools.woodAxeID = infiprops.accessInt("woodAxeID", 15001);
        mod_InfiTools.stoneAxeID = infiprops.accessInt("stoneAxeID", 15013);
        mod_InfiTools.ironAxeID = infiprops.accessInt("ironAxeID", 15027);
        mod_InfiTools.diamondAxeID = infiprops.accessInt("diamondAxeID", 15042);
        mod_InfiTools.goldAxeID = infiprops.accessInt("goldAxeID", 15056);
        mod_InfiTools.redstoneAxeID = infiprops.accessInt("redstoneAxeID", 15071);
        mod_InfiTools.obsidianAxeID = infiprops.accessInt("obsidianAxeID", 15085);
        mod_InfiTools.sandstoneAxeID = infiprops.accessInt("sandstoneAxeID", 15101);
        mod_InfiTools.boneAxeID = infiprops.accessInt("boneAxeID", 15115);
        mod_InfiTools.paperAxeID = infiprops.accessInt("paperAxeID", 15131);
        mod_InfiTools.mossyAxeID = infiprops.accessInt("mossyAxeID", 15141);
        mod_InfiTools.netherrackAxeID = infiprops.accessInt("netherrackAxeID", 15150);
        mod_InfiTools.glowstoneAxeID = infiprops.accessInt("glowstoneAxeID", 15168);
        mod_InfiTools.iceAxeID = infiprops.accessInt("iceAxeID", 15185);
        mod_InfiTools.lavaAxeID = infiprops.accessInt("lavaAxeID", 15203);
        mod_InfiTools.slimeAxeID = infiprops.accessInt("slimeAxeID", 15213);
        mod_InfiTools.cactusAxeID = infiprops.accessInt("cactusAxeID", 15236);
        mod_InfiTools.flintAxeID = infiprops.accessInt("flintAxeID", 15249);
        mod_InfiTools.brickAxeID = infiprops.accessInt("brickAxeID", 15267);
        mod_InfiTools.blazeAxeID = infiprops.accessInt("blazeAxeID", 15279);
        mod_InfiTools.woodHoeID = infiprops.accessInt("woodHoeID", 15301);
        mod_InfiTools.stoneHoeID = infiprops.accessInt("stoneHoeID", 15313);
        mod_InfiTools.ironHoeID = infiprops.accessInt("ironHoeID", 15327);
        mod_InfiTools.diamondHoeID = infiprops.accessInt("diamondHoeID", 15342);
        mod_InfiTools.goldHoeID = infiprops.accessInt("goldHoeID", 15356);
        mod_InfiTools.redstoneHoeID = infiprops.accessInt("redstoneHoeID", 15371);
        mod_InfiTools.obsidianHoeID = infiprops.accessInt("obsidianHoeID", 15385);
        mod_InfiTools.sandstoneHoeID = infiprops.accessInt("sandstoneHoeID", 15401);
        mod_InfiTools.boneHoeID = infiprops.accessInt("boneHoeID", 15415);
        mod_InfiTools.paperHoeID = infiprops.accessInt("paperHoeID", 15431);
        mod_InfiTools.mossyHoeID = infiprops.accessInt("mossyHoeID", 15441);
        mod_InfiTools.netherrackHoeID = infiprops.accessInt("netherrackHoeID", 15450);
        mod_InfiTools.glowstoneHoeID = infiprops.accessInt("glowstoneHoeID", 15468);
        mod_InfiTools.iceHoeID = infiprops.accessInt("iceHoeID", 15485);
        mod_InfiTools.lavaHoeID = infiprops.accessInt("lavaHoeID", 15503);
        mod_InfiTools.slimeHoeID = infiprops.accessInt("slimeHoeID", 15513);
        mod_InfiTools.cactusHoeID = infiprops.accessInt("cactusHoeID", 15536);
        mod_InfiTools.flintHoeID = infiprops.accessInt("flintHoeID", 15549);
        mod_InfiTools.brickHoeID = infiprops.accessInt("brickHoeID", 15567);
        mod_InfiTools.blazeHoeID = infiprops.accessInt("blazeHoeID", 15579);
        /*infiprops.accessInt("woodFryingPanID", 15601);
        infiprops.accessInt("stoneFryingPanID", 15614);
        infiprops.accessInt("ironFryingPanID", 15629);
        infiprops.accessInt("diamondFryingPanID", 15645);
        infiprops.accessInt("goldFryingPanID", 15660);
        infiprops.accessInt("redstoneFryingPanID", 15676);
        infiprops.accessInt("obsidianFryingPanID", 15690);
        infiprops.accessInt("sandstoneFryingPanID", 15706);
        infiprops.accessInt("boneFryingPanID", 15720);
        infiprops.accessInt("paperFryingPanID", 15736);
        infiprops.accessInt("mossyFryingPanID", 15746);
        infiprops.accessInt("netherrackFryingPanID", 15755);
        infiprops.accessInt("glowstoneFryingPanID", 15773);
        infiprops.accessInt("iceFryingPanID", 15790);
        infiprops.accessInt("lavaFryingPanID", 15808);
        infiprops.accessInt("slimeFryingPanID", 15818);
        infiprops.accessInt("cactusFryingPanID", 15841);
        infiprops.accessInt("flintFryingPanID", 15854);
        infiprops.accessInt("brickFryingPanID", 15872);
        infiprops.accessInt("blazeFryingPanID", 15884);*/
        return infiprops;
    }
    
    public static void addOrizonRecipes()
    {
    	
    }

    public static void AddBlocks(Block ablock[], int i)
    {
        boolean flag = true;
        for (int j = 0; j < ablock.length; j++)
        {
            Block block = ablock[j];
            if (!(block instanceof Block))
            {
                flag = false;
            }
        }

        if (!flag)
        {
            throw new RuntimeException("Invalid block minimum-harvesting-level declared!");
        }
        else
        {
            InfiGather.getInstance();
            InfiGather.addBlocks(ablock, i);
            return;
        }
    }
}
