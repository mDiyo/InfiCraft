package net.minecraft.src;

import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.src.mod_ToolRack$RenderingProxy;

public class mod_ToolRack$RenderingClient extends mod_ToolRack$RenderingProxy
{
    public void register()
    {
        mod_ToolRack.rack.setRenderer(new RenderRack());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityRack.class, new TileEntityRackRenderer());
    }
}
