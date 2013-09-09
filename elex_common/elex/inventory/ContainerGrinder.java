package elex.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.tileentity.TileEntityFurnace;
import elex.api.GrinderRecipe;
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
    public ItemStack transferStackInSlot(EntityPlayer player, int slotnumber) {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(slotnumber);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (slotnumber == 2)
            {
                if (!this.mergeItemStack(itemstack1, 3, 39, true))
                {
                    return null;
                }

                slot.onSlotChange(itemstack1, itemstack);
            }
            if (slotnumber == 3)
            {
                if (!this.mergeItemStack(itemstack1, 3, 39, true))
                {
                    return null;
                }

                slot.onSlotChange(itemstack1, itemstack);
            }
            else if (slotnumber != 1 && slotnumber != 0)
            {
                if (GrinderRecipe.canBeDone(itemstack1))
                {
                    if (!this.mergeItemStack(itemstack1, 0, 1, false))
                    {
                        return null;
                    }
                }
                else if (slotnumber >= 3 && slotnumber < 30)
                {
                    if (!this.mergeItemStack(itemstack1, 30, 39, false))
                    {
                        return null;
                    }
                }
                else if (slotnumber >= 30 && slotnumber < 39 && !this.mergeItemStack(itemstack1, 3, 30, false))
                {
                    return null;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 3, 39, false))
            {
                return null;
            }

            if (itemstack1.stackSize == 0)
            {
                slot.putStack((ItemStack)null);
            }
            else
            {
                slot.onSlotChanged();
            }

            if (itemstack1.stackSize == itemstack.stackSize)
            {
                return null;
            }

            slot.onPickupFromSlot(player, itemstack1);
        }

        return itemstack;
    }

}
