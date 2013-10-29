package myokun.mods.elex.client.gui;

import java.util.logging.Level;

import myokun.mods.elex.core.LogHelper;
import myokun.mods.elex.core.Reference;
import myokun.mods.elex.inventory.ContainerGrinder;
import myokun.mods.elex.tileentity.TileEntityGrinder;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Elemental Experimentation
 * 
 * GUIGrinder
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */

@SideOnly(Side.CLIENT)
public class GUIGrinder extends GuiContainer {
    
    public GUIGrinder(InventoryPlayer player, TileEntityGrinder grinder) {
        super(new ContainerGrinder(player, grinder));
        xSize = 176;
        ySize = 166;
    }
    
    private static final ResourceLocation texture = new ResourceLocation(Reference.MOD_ID.toLowerCase(), "textures/gui/grinder.png");
    
    @Override
    protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
        GL11.glColor4f(1, 1, 1, 1);
        
        try {
            Minecraft.getMinecraft().renderEngine.bindTexture(texture);
        } catch (Exception e) {
            LogHelper.log(Level.INFO, e.toString());
        }
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
    }
    
    @Override
    protected void drawGuiContainerForegroundLayer(int x, int y) {
        fontRenderer.drawString(LanguageRegistry.instance().getStringLocalization("container.grinder.name"), 8, 6, 0x404040);
    }
}
