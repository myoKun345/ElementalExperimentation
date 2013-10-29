package myokun.mods.elex.client.gui;

import java.util.logging.Level;

import org.lwjgl.opengl.GL11;

import myokun.lib.gui.Coordinate;
import myokun.lib.gui.DynamicGUIHandler;
import myokun.lib.gui.Render;
import myokun.lib.gui.VanillaSlices;
import myokun.mods.elex.core.LogHelper;
import myokun.mods.elex.inventory.ContainerCentrifuge;
import myokun.mods.elex.tileentity.TileEntityCentrifuge;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Elemental Experimentation
 *
 * GUICentrifuge
 *
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
@SideOnly(Side.CLIENT)
public class GUICentrifuge extends GuiContainer {
	
	public GUICentrifuge(InventoryPlayer player, TileEntityCentrifuge te) {
		super(new ContainerCentrifuge(player, te));
		LogHelper.log(Level.INFO, "New CentrifugeGUI");
		xSize = 176;
		ySize = 166;
	}
	
	@Override
	public void drawGuiContainerBackgroundLayer(float f, int i, int j) {
		Coordinate s0coord = VanillaSlices.vanillaSlice.getSlice(0).getTopLeft();
		Coordinate s1coord = VanillaSlices.vanillaSlice.getSlice(1).getTopLeft();
		Coordinate s2coord = VanillaSlices.vanillaSlice.getSlice(2).getTopLeft();
		Coordinate s3coord = VanillaSlices.vanillaSlice.getSlice(3).getTopLeft();
		Coordinate s4coord = VanillaSlices.vanillaSlice.getSlice(4).getTopLeft();
		Coordinate s5coord = VanillaSlices.vanillaSlice.getSlice(5).getTopLeft();
		Coordinate s6coord = VanillaSlices.vanillaSlice.getSlice(6).getTopLeft();
		Coordinate s7coord = VanillaSlices.vanillaSlice.getSlice(7).getTopLeft();
		Coordinate s8coord = VanillaSlices.vanillaSlice.getSlice(8).getTopLeft();
		
		LogHelper.log(Level.INFO, s0coord.toString());
		LogHelper.log(Level.INFO, s1coord.toString());
		LogHelper.log(Level.INFO, s2coord.toString());
		LogHelper.log(Level.INFO, s3coord.toString());
		LogHelper.log(Level.INFO, s4coord.toString());
		LogHelper.log(Level.INFO, s5coord.toString());
		LogHelper.log(Level.INFO, s6coord.toString());
		LogHelper.log(Level.INFO, s7coord.toString());
		LogHelper.log(Level.INFO, s8coord.toString());
		
		LogHelper.log(Level.INFO, "Background");
		GL11.glColor4f(1, 1, 1, 1);
		
		try {
			Minecraft.getMinecraft().renderEngine.bindTexture(VanillaSlices.vanillaSlice.getTexture());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		drawTexturedModalRect(guiLeft, guiTop, s0coord.getX(), s0coord.getY(), VanillaSlices.vanillaSlice.getSlice(0).getWidth()*4, VanillaSlices.vanillaSlice.getSlice(0).getHeight()*4);
		drawTexturedModalRect(guiLeft + VanillaSlices.vanillaSlice.getSlice(0).getWidth(), guiTop + VanillaSlices.vanillaSlice.getSlice(0).getHeight(), s1coord.getX(), s1coord.getY(), VanillaSlices.vanillaSlice.getSlice(1).getWidth()*4, VanillaSlices.vanillaSlice.getSlice(1).getHeight()*4);
	}

}
