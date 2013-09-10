package elex.tileentity;

import ic2.api.energy.tile.IEnergySink;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTank;
import net.minecraftforge.fluids.FluidTankInfo;
import net.minecraftforge.fluids.IFluidHandler;
import universalelectricity.core.block.IElectricalStorage;
import buildcraft.api.power.IPowerReceptor;
import buildcraft.api.power.PowerHandler;
import buildcraft.api.power.PowerHandler.PowerReceiver;
import buildcraft.api.transport.IExtractionHandler;
import buildcraft.api.transport.IPipeConnection;
import buildcraft.api.transport.IPipeTile.PipeType;
import elex.core.ModFluids;

/**
 * Elemental Experimentation
 * 
 * TileEntityCondensator
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class TileEntityCondensator extends TileEntity implements IFluidHandler, IPipeConnection, IExtractionHandler, ISidedInventory, IEnergySink, IPowerReceptor, IElectricalStorage {
    
    public ItemStack[] condensatorSlots = new ItemStack[2];
    
    protected FluidTank tank = new FluidTank(4000);
    
    public EntityPlayer placedBy;
    
    public PowerHandler buildcraftPowerHandler;
    public static int MAX_ENERGY = 12000;
    
    public EnumCondensatorMode currentMode;
    
    public boolean modeAir;
    public boolean modeWater;
    public boolean modeHydrogen;
    public boolean modeHelium;
    public boolean modeNitrogen;
    public boolean modeOxygen;
    public boolean modeNeon;
    public boolean modeArgon;
    public boolean modeKrypton;
    public boolean modeXenon;
    
    public boolean modeNetherAir;
    public boolean modeNederon;
    
    public String currentModeNBT;
    
    public boolean isCondensing;
    
    public TileEntityCondensator() {
        buildcraftPowerHandler = new PowerHandler(this, PowerHandler.Type.MACHINE);
        initBCPowerProvider();
    }
    
    private void initBCPowerProvider() {
        buildcraftPowerHandler.configure(1, 100, /*this.currentMode.getActivation()*/2, MAX_ENERGY);
        buildcraftPowerHandler.configurePowerPerdition(2, 1);
    }
    
    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        tank.readFromNBT(compound);
        buildcraftPowerHandler.readFromNBT(compound);
        initBCPowerProvider();
        
        this.modeAir = compound.getBoolean("AirEnabled");
        this.modeWater = compound.getBoolean("WaterEnabled");
        this.modeHydrogen = compound.getBoolean("HydrogenEnabled");
        this.modeHelium = compound.getBoolean("HeliumEnabled");
        this.modeNitrogen = compound.getBoolean("NitrogenEnabled");
        this.modeOxygen = compound.getBoolean("OxygenEnabled");
        this.modeNeon = compound.getBoolean("NeonEnabled");
        this.modeArgon = compound.getBoolean("ArgonEnabled");
        this.modeKrypton = compound.getBoolean("KryptonEnabled");
        this.modeXenon = compound.getBoolean("XenonEnabled");
        
        this.modeNetherAir = compound.getBoolean("NetherAirEnabled");
        this.modeNederon = compound.getBoolean("NederonEnabled");
        
        this.currentMode = EnumCondensatorMode.valueOf(compound.getString("CurrentMode").toUpperCase());
    }
    
    @Override
    public void writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        tank.writeToNBT(compound);
        buildcraftPowerHandler.writeToNBT(compound);
        
        compound.setBoolean("AirEnabled", modeAir);
        compound.setBoolean("WaterEnabled", modeWater);
        compound.setBoolean("HydrogenEnabled", modeHydrogen);
        compound.setBoolean("HeliumEnabled", modeHelium);
        compound.setBoolean("NitrogenEnabled", modeNitrogen);
        compound.setBoolean("OxygenEnabled", modeOxygen);
        compound.setBoolean("NeonEnabled", modeNeon);
        compound.setBoolean("ArgonEnabled", modeArgon);
        compound.setBoolean("KryptonEnabled", modeKrypton);
        compound.setBoolean("XenonEnabled", modeXenon);
        
        compound.setBoolean("NetherAirEnabled", modeNetherAir);
        compound.setBoolean("NederonEnabled", modeNederon);
        
        compound.setString("CurrentMode", currentMode.getName());
    }
    
    public void setCurrentMode(EnumCondensatorMode mode, boolean toggle) {
        if (toggle) {
            this.currentMode = mode;
        }
        this.currentMode = mode;
    }
    
    public void enableMode(boolean toggle) {
        toggle = true;
    }
    
    public boolean isActive() {
        return isCondensing;
    }
    
    @Override
    public void updateEntity() {
        if (!this.worldObj.isRemote) {
            
            if (this.tank != null && this.buildcraftPowerHandler != null && this.currentMode != null) {
                
                if (buildcraftPowerHandler.getPowerReceiver().getEnergyStored() >= this.currentMode.getActivation() && tank.getFluidAmount() < tank.getCapacity()) {
                    this.fill(null, new FluidStack(this.currentMode.getFluid(), this.currentMode.getUPT()), true);
                    buildcraftPowerHandler.useEnergy(1 * this.currentMode.getActivation(), 10 * this.currentMode.getActivation(), true);
                    this.isCondensing = true;
                }
                
            }
            
        }
    }
    
    public enum EnumCondensatorMode {
        AIR("air", ModFluids.fluidCompressedAir, 2.0F, 100),
        WATER("water", FluidRegistry.WATER, 2.5F, 20),
        HYDROGEN("hydrogen", ModFluids.fluidPureGas.get(0), 5.0F, 5),
        NETHER("nether", ModFluids.fluidCompressedAir, 2.0F, 100);
        
        private Fluid modeFluid;
        private String modeName;
        private float modeActivation;
        private int modeUPT;
        
        private EnumCondensatorMode(String name, Fluid fluid, float activationEnergy, int unitsPerTick) {
            this.modeName = name;
            this.modeFluid = fluid;
            this.modeActivation = activationEnergy;
            this.modeUPT = unitsPerTick;
        }
        
        public Fluid getFluid() {
            return this.modeFluid;
        }
        
        public String getName() {
            return this.modeName;
        }
        
        public float getActivation() {
            return this.modeActivation;
        }
        
        public int getUPT() {
            return this.modeUPT;
        }
    }
    
    @Override
    public PowerReceiver getPowerReceiver(ForgeDirection side) {
        return buildcraftPowerHandler.getPowerReceiver();
    }
    
    @Override
    public int fill(ForgeDirection from, FluidStack resource, boolean doFill) {
        return tank.fill(resource, doFill);
    }
    
    @Override
    public FluidStack drain(ForgeDirection from, FluidStack resource,
            boolean doDrain) {
        if (resource == null || !resource.isFluidEqual(tank.getFluid()))
        {
            return null;
        }
        return tank.drain(resource.amount, doDrain);
    }
    
    @Override
    public FluidStack drain(ForgeDirection from, int maxDrain, boolean doDrain) {
        return null;
    }
    
    @Override
    public boolean canFill(ForgeDirection from, Fluid fluid) {
        return false;
    }
    
    @Override
    public boolean canDrain(ForgeDirection from, Fluid fluid) {
        return false;
    }
    
    @Override
    public FluidTankInfo[] getTankInfo(ForgeDirection from) {
        return null;
    }
    
    @Override
    public int getSizeInventory() {
        return condensatorSlots.length;
    }
    
    @Override
    public ItemStack getStackInSlot(int i) {
        return condensatorSlots[i];
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
    public void setInventorySlotContents(int i, ItemStack itemstack) {
        condensatorSlots[i] = itemstack;
        
        onInventoryChanged();
    }
    
    @Override
    public String getInvName() {
        return "container.condensator";
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
     * @see ic2.api.energy.tile.IEnergyAcceptor#acceptsEnergyFrom(net.minecraft.tileentity.TileEntity, net.minecraftforge.common.ForgeDirection)
     */
    @Override
    public boolean acceptsEnergyFrom(TileEntity emitter,
            ForgeDirection direction) {
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

    /* (non-Javadoc)
     * @see buildcraft.api.transport.IPipeConnection#overridePipeConnection(buildcraft.api.transport.IPipeTile.PipeType, net.minecraftforge.common.ForgeDirection)
     */
    @Override
    public ConnectOverride overridePipeConnection(PipeType type,
            ForgeDirection with) {
        if (type == PipeType.FLUID || type == PipeType.POWER) {
            return ConnectOverride.CONNECT;
        }
        else {
            return ConnectOverride.DEFAULT;
        }
    }
    
    @Override
    public boolean canExtractItems(Object extractor, World world, int i, int j,
            int k) {
        return false;
    }
    
    @Override
    public boolean canExtractFluids(Object extractor, World world, int i,
            int j, int k) {
        return true;
    }
    
}
