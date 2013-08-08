package elex.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;
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
        
        for (int x = 0; x < 9; x++) {
            addSlotToContainer(new Slot(player, x, 8 + 18 * x, 142));
        }
        
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 9; x++) {
                addSlotToContainer(new Slot(player, x + y * 9 + 9, 8 + 18 * x, 84 + y * 18));
            }
        }
        
        addSlotToContainer(new Slot(grinder, 0, 35, 17));
        addSlotToContainer(new Slot(grinder, 1, 35, 53));
        addSlotToContainer(new SlotFurnace(player.player, grinder, 2, 95, 35));
        addSlotToContainer(new SlotFurnace(player.player, grinder, 3, 121, 35));
    }
    
    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return grinder.isUseableByPlayer(player);
    }
    
    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int i) {
        return null;
    }

}
