/**
 * 
 */
package myokun.mods.elex.inventory;

import myokun.mods.elex.tileentity.TileEntityCentrifuge;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

/**
 * Elemental Experimentation
 *
 * ContainerCentrifuge
 *
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ContainerCentrifuge extends Container {
	
	private TileEntityCentrifuge centrifuge;
	
	public ContainerCentrifuge(InventoryPlayer player, TileEntityCentrifuge te) {
		this.centrifuge = te;
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {
		return centrifuge.isUseableByPlayer(entityplayer);
	}

}
