package elex.client.gui;

import java.util.logging.Level;

import myokun.lib.gui.DynamicGUIHandler;
import myokun.lib.gui.VanillaSlices;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import elex.core.LogHelper;
import elex.inventory.ContainerCentrifuge;
import elex.tileentity.TileEntityCentrifuge;

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
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
		GL11.glColor4f(1, 1, 1, 1);
		LogHelper.log(Level.INFO, "Draw in GUICentrifuge");
		DynamicGUIHandler.drawBackground(guiLeft, guiTop, 176, 166, VanillaSlices.vanillaSlice);
	}

}
