package elex.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import elex.tileentity.TileEntityGrinder;

/**
 * Elemental Experimentation
 * 
 * ContainerGrinder
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ContainerGrinder extends Container {
    
    private TileEntityGrinder grinder;
    
    public ContainerGrinder(InventoryPlayer player, TileEntityGrinder grinder) {
        this.grinder = grinder;
    }
    
    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return grinder.isUseableByPlayer(player);
    }

}
