package elex.tileentity;

import universalelectricity.core.block.IElectrical;
import universalelectricity.core.electricity.ElectricityPack;
import ic2.api.Direction;
import ic2.api.energy.tile.IEnergyAcceptor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import buildcraft.api.power.IPowerReceptor;
import buildcraft.api.power.PowerHandler;
import buildcraft.api.power.PowerHandler.PowerReceiver;

/**
 * Elemental Experimentation
 * 
 * TileEntityGrinder
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class TileEntityGrinder extends TileEntity implements ISidedInventory, IEnergyAcceptor, IPowerReceptor, IElectrical {
    
    public ItemStack[] grinderItemStacks = new ItemStack[4];
    
    public int grinderGrindTime;
    
    public int currentItemGrindTime;
    
    public int grinderGroundTime;
    
    public EntityPlayer placedBy;
    
    public boolean isGrinding() {
        return grinderGrindTime > 0;
    }
    
    @Override
    public void writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        compound.setShort("GrindTime", (short)this.grinderGrindTime);
        compound.setShort("GroundTime", (short)this.grinderGroundTime);
        
        NBTTagList items = new NBTTagList();
        
        for (int i = 0; i < this.grinderItemStacks.length; ++i)
        {
            if (this.grinderItemStacks[i] != null)
            {
                NBTTagCompound compoundStacks = new NBTTagCompound();
                compoundStacks.setByte("Slot", (byte)i);
                this.grinderItemStacks[i].writeToNBT(compoundStacks);
                items.appendTag(compoundStacks);
            }
        }
        
        compound.setTag("Items", items);
    }
    
    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        NBTTagList items = compound.getTagList("Items");
        this.grinderGrindTime = compound.getShort("GrindTime");
        this.grinderGroundTime = compound.getShort("GroundTime");
        
        for (int i = 0; i < items.tagCount(); ++i)
        {
            NBTTagCompound compoundStacks = (NBTTagCompound)items.tagAt(i);
            byte b0 = compoundStacks.getByte("Slot");

            if (b0 >= 0 && b0 < this.grinderItemStacks.length)
            {
                this.grinderItemStacks[b0] = ItemStack.loadItemStackFromNBT(compoundStacks);
            }
        }
    }
    
    @Override
    public int getSizeInventory() {
        return grinderItemStacks.length;
    }
    
    @Override
    public ItemStack getStackInSlot(int i) {
        return grinderItemStacks[i];
    }
    
    @Override
    public ItemStack decrStackSize(int i, int count) {
        ItemStack stack = getStackInSlot(i);
        
        if (stack != null) {
            stack = stack.splitStack(count);
            
            onInventoryChanged();
        }
        
        return stack;
    }
    
    @Override
    public ItemStack getStackInSlotOnClosing(int i) {
        ItemStack stack = getStackInSlot(i);
        
        return stack;
    }
    
    @Override
    public void setInventorySlotContents(int i, ItemStack stack) {
        grinderItemStacks[i] = stack;
        
        onInventoryChanged();
    }
    
    @Override
    public String getInvName() {
        return "container.grinder";
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
    public boolean isItemValidForSlot(int i, ItemStack stack) {
        return true;
    }
    
    @Override
    public int[] getAccessibleSlotsFromSide(int var1) {
        return null;
    }
    
    @Override
    public boolean canInsertItem(int i, ItemStack itemstack, int j) {
        return false;
    }
    
    @Override
    public boolean canExtractItem(int i, ItemStack itemstack, int j) {
        return false;
    }
    
    @Override
    public boolean isAddedToEnergyNet() {
        return false;
    }
    
    @Override
    public boolean acceptsEnergyFrom(TileEntity emitter, Direction direction) {
        return true;
    }
    
    @Override
    public PowerReceiver getPowerReceiver(ForgeDirection side) {
        return null;
    }
    
    @Override
    public void doWork(PowerHandler workProvider) {
        
    }
    
    @Override
    public World getWorld() {
        return null;
    }
    
    @Override
    public boolean canConnect(ForgeDirection direction) {
        return true;
    }
    
    @Override
    public float receiveElectricity(ForgeDirection from,
            ElectricityPack receive, boolean doReceive) {
        return 0;
    }
    
    @Override
    public ElectricityPack provideElectricity(ForgeDirection from,
            ElectricityPack request, boolean doProvide) {
        return null;
    }
    
    @Override
    public float getRequest(ForgeDirection direction) {
        return 0;
    }
    
    @Override
    public float getProvide(ForgeDirection direction) {
        return 0;
    }
    
    @Override
    public float getVoltage() {
        return 0;
    }
    
}
