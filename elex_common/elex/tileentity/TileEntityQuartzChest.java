/**
 * 
 */
package elex.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

/**
 * Elemental Experimentation
 *
 * TileEntityQuartzChest
 *
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class TileEntityQuartzChest extends TileEntity implements ISidedInventory {
	
	public ItemStack[] chestStacks = new ItemStack[72];
	public int[] accessibleSlots = new int[72];
	
	public EntityPlayer placedBy;
	
	@Override
	public int getSizeInventory() {
		return chestStacks.length;
	}
	
	@Override
	public ItemStack getStackInSlot(int i) {
		return chestStacks[i];
	}
	
	@Override
	public ItemStack decrStackSize(int i, int j) {
		return null;
	}
	
	@Override
	public ItemStack getStackInSlotOnClosing(int i) {
		return chestStacks[i];
	}
	
	@Override
	public void setInventorySlotContents(int i, ItemStack stack) {
		chestStacks[i] = stack;
	}
	
	@Override
	public String getInvName() {
		return "container.quartzChest";
	}
	
	@Override
	public boolean isInvNameLocalized() {
		return false;
	}
	
	@Override
	public int getInventoryStackLimit() {
		return 64;
	}
	
	@Override
	public boolean isUseableByPlayer(EntityPlayer player) {
		return player.getDistanceSq(xCoord + 0.5F, yCoord + 0.5F, zCoord + 0.5F) <= 64;
	}
	
	@Override
	public void openChest() {
		
	}
	
	@Override
	public void closeChest() {
		
	}
	
	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		return false;
	}
	
	@Override
	public int[] getAccessibleSlotsFromSide(int var1) {
		for (int i = 0; i < 72; i++) {
			accessibleSlots[i] = i;
		}
		return accessibleSlots;
	}
	
	@Override
	public boolean canInsertItem(int i, ItemStack itemstack, int j) {
		return false;
	}
	
	@Override
	public boolean canExtractItem(int i, ItemStack itemstack, int j) {
		return false;
	}
	
}
