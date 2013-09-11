package elex.tileentity;

import ic2.api.energy.tile.IEnergySink;
import universalelectricity.core.block.IElectricalStorage;
import buildcraft.api.power.IPowerReceptor;
import buildcraft.api.power.PowerHandler;
import buildcraft.api.power.PowerHandler.PowerReceiver;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTank;
import net.minecraftforge.fluids.FluidTankInfo;
import net.minecraftforge.fluids.IFluidHandler;

/**
 * Elemental Experimentation
 * 
 * TileEntityCentrifuge
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class TileEntityCentrifuge extends TileEntity implements IFluidHandler, ISidedInventory, IEnergySink, IPowerReceptor, IElectricalStorage {
    
    public ItemStack[] centrifugeStacks = new ItemStack[11];
    
    protected FluidTank tank = new FluidTank(4000);
    
    public int centrifugeSpinTime;
    
    public int currentItemSpinTime;
    
    public int centrifugeSpunTime;
    
    public EntityPlayer placedBy;
    
    public PowerHandler buildcraftPowerHandler;
    public static int MAX_MJ = 4000;
    
    public boolean isSpinning() {
        return centrifugeSpinTime > 0;
    }
    
    public TileEntityCentrifuge() {
        buildcraftPowerHandler = new PowerHandler(this, PowerHandler.Type.MACHINE);
        initBCPowerProvider();
    }
    
    private void initBCPowerProvider() {
        buildcraftPowerHandler.configure(3, 150, 3, MAX_MJ);
        buildcraftPowerHandler.configurePowerPerdition(2, 1);
    }
    
    @Override
    public void writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        
        buildcraftPowerHandler.writeToNBT(compound);
        
        compound.setShort("SpinTime", (short)this.centrifugeSpinTime);
        compound.setShort("SpunTime", (short)this.centrifugeSpunTime);
    }
    
    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        
        buildcraftPowerHandler.readFromNBT(compound);
        initBCPowerProvider();
        
        centrifugeSpinTime = compound.getShort("SpinTime");
        centrifugeSpunTime = compound.getShort("SpunTime");
        
    }

    /* (non-Javadoc)
     * @see net.minecraft.inventory.IInventory#getSizeInventory()
     */
    @Override
    public int getSizeInventory() {
        // TODO Auto-generated method stub
        return 0;
    }

    /* (non-Javadoc)
     * @see net.minecraft.inventory.IInventory#getStackInSlot(int)
     */
    @Override
    public ItemStack getStackInSlot(int i) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see net.minecraft.inventory.IInventory#decrStackSize(int, int)
     */
    @Override
    public ItemStack decrStackSize(int i, int j) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see net.minecraft.inventory.IInventory#getStackInSlotOnClosing(int)
     */
    @Override
    public ItemStack getStackInSlotOnClosing(int i) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see net.minecraft.inventory.IInventory#setInventorySlotContents(int, net.minecraft.item.ItemStack)
     */
    @Override
    public void setInventorySlotContents(int i, ItemStack itemstack) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see net.minecraft.inventory.IInventory#getInvName()
     */
    @Override
    public String getInvName() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see net.minecraft.inventory.IInventory#isInvNameLocalized()
     */
    @Override
    public boolean isInvNameLocalized() {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see net.minecraft.inventory.IInventory#getInventoryStackLimit()
     */
    @Override
    public int getInventoryStackLimit() {
        // TODO Auto-generated method stub
        return 0;
    }

    /* (non-Javadoc)
     * @see net.minecraft.inventory.IInventory#isUseableByPlayer(net.minecraft.entity.player.EntityPlayer)
     */
    @Override
    public boolean isUseableByPlayer(EntityPlayer entityplayer) {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see net.minecraft.inventory.IInventory#openChest()
     */
    @Override
    public void openChest() {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see net.minecraft.inventory.IInventory#closeChest()
     */
    @Override
    public void closeChest() {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see net.minecraft.inventory.IInventory#isItemValidForSlot(int, net.minecraft.item.ItemStack)
     */
    @Override
    public boolean isItemValidForSlot(int i, ItemStack itemstack) {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see net.minecraft.inventory.ISidedInventory#getAccessibleSlotsFromSide(int)
     */
    @Override
    public int[] getAccessibleSlotsFromSide(int var1) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see net.minecraft.inventory.ISidedInventory#canInsertItem(int, net.minecraft.item.ItemStack, int)
     */
    @Override
    public boolean canInsertItem(int i, ItemStack itemstack, int j) {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see net.minecraft.inventory.ISidedInventory#canExtractItem(int, net.minecraft.item.ItemStack, int)
     */
    @Override
    public boolean canExtractItem(int i, ItemStack itemstack, int j) {
        // TODO Auto-generated method stub
        return false;
    }
    
    @Override
    public int fill(ForgeDirection from, FluidStack resource, boolean doFill) {
        return tank.fill(resource, doFill);
    }
    
    @Override
    public FluidStack drain(ForgeDirection from, FluidStack resource, boolean doDrain) {
        if (resource == null || !resource.isFluidEqual(tank.getFluid()))
        {
            return null;
        }
        return tank.drain(resource.amount, doDrain);
    }
    
    @Override
    public FluidStack drain(ForgeDirection from, int maxDrain, boolean doDrain) {
        if (tank != null && this != null) {
            return this.tank.drain(maxDrain, doDrain);
        }
        else {
            return null;
        }
    }
    
    @Override
    public boolean canFill(ForgeDirection from, Fluid fluid) {
        return false;
    }
    
    @Override
    public boolean canDrain(ForgeDirection from, Fluid fluid) {
        return true;
    }
    
    @Override
    public FluidTankInfo[] getTankInfo(ForgeDirection from) {
        int capacity = this.tank.getCapacity();
        
        if (this != null && this.tank.getFluid() != null) {
            this.tank.setFluid(this.tank.getFluid().copy());
        } else {
            return new FluidTankInfo[]{this.tank.getInfo()};
        }
        
        tank.setCapacity(capacity);
        return new FluidTankInfo[]{tank.getInfo()};
    }

    /* (non-Javadoc)
     * @see ic2.api.energy.tile.IEnergyAcceptor#acceptsEnergyFrom(net.minecraft.tileentity.TileEntity, net.minecraftforge.common.ForgeDirection)
     */
    @Override
    public boolean acceptsEnergyFrom(TileEntity emitter,
            ForgeDirection direction) {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see universalelectricity.core.block.IElectricalStorage#setEnergyStored(float)
     */
    @Override
    public void setEnergyStored(float energy) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see universalelectricity.core.block.IElectricalStorage#getEnergyStored()
     */
    @Override
    public float getEnergyStored() {
        // TODO Auto-generated method stub
        return 0;
    }

    /* (non-Javadoc)
     * @see universalelectricity.core.block.IElectricalStorage#getMaxEnergyStored()
     */
    @Override
    public float getMaxEnergyStored() {
        // TODO Auto-generated method stub
        return 0;
    }

    /* (non-Javadoc)
     * @see buildcraft.api.power.IPowerReceptor#getPowerReceiver(net.minecraftforge.common.ForgeDirection)
     */
    @Override
    public PowerReceiver getPowerReceiver(ForgeDirection side) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see buildcraft.api.power.IPowerReceptor#doWork(buildcraft.api.power.PowerHandler)
     */
    @Override
    public void doWork(PowerHandler workProvider) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see buildcraft.api.power.IPowerReceptor#getWorld()
     */
    @Override
    public World getWorld() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see ic2.api.energy.tile.IEnergySink#demandedEnergyUnits()
     */
    @Override
    public double demandedEnergyUnits() {
        // TODO Auto-generated method stub
        return 0;
    }

    /* (non-Javadoc)
     * @see ic2.api.energy.tile.IEnergySink#injectEnergyUnits(net.minecraftforge.common.ForgeDirection, double)
     */
    @Override
    public double injectEnergyUnits(ForgeDirection directionFrom, double amount) {
        // TODO Auto-generated method stub
        return 0;
    }

    /* (non-Javadoc)
     * @see ic2.api.energy.tile.IEnergySink#getMaxSafeInput()
     */
    @Override
    public int getMaxSafeInput() {
        // TODO Auto-generated method stub
        return 0;
    }
    
}