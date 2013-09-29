package elex.tileentity;

import ic2.api.energy.tile.IEnergySink;

import java.util.logging.Level;

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
import universalelectricity.core.block.IElectricalStorage;
import buildcraft.api.power.IPowerReceptor;
import buildcraft.api.power.PowerHandler;
import buildcraft.api.power.PowerHandler.PowerReceiver;
import cpw.mods.fml.common.FMLCommonHandler;
import elex.api.CentrifugeRecipe;
import elex.core.LogHelper;

/**
 * Elemental Experimentation
 * 
 * TileEntityCentrifuge
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class TileEntityCentrifuge extends TileEntity implements IFluidHandler, ISidedInventory, IEnergySink, IPowerReceptor, IElectricalStorage {
    
    public ItemStack[] centrifugeStacks = new ItemStack[12];
    
    protected FluidTank tank = new FluidTank(4000);
    
    public int centrifugeSpinTime;
    public int currentItemSpinTime;
    public int centrifugeSpunTime;
    public boolean spinning;
    
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
    
    @Override
    public boolean canUpdate() {
    	return !FMLCommonHandler.instance().getEffectiveSide().isClient();
    }
    
    @Override
    public void updateEntity() {
    	
    	if (!this.worldObj.isRemote) {
    		
    		if (this.getStackInSlot(0) != null) {
    			
    			CentrifugeRecipe recipe;
    			
    			recipe = CentrifugeRecipe.centrifugeRecipes.get(getStackInSlot(0).getUnlocalizedName());
    			
    			if ((getStackInSlot(3) == null && getStackInSlot(4) == null && 
					getStackInSlot(5) == null && getStackInSlot(6) == null && 
					getStackInSlot(7) == null && getStackInSlot(8) == null && 
					getStackInSlot(9) == null && getStackInSlot(10) == null && 
					getStackInSlot(11) == null)) {
    				
    				if (!this.spinning && CentrifugeRecipe.canBeDone(getStackInSlot(0))) {
    					
    					this.centrifugeSpinTime = recipe.time;
    					this.spinning = true;
    					
    				}
    				
    				if (this.spinning &&
						buildcraftPowerHandler.getEnergyStored() >= buildcraftPowerHandler.getActivationEnergy()) {
    					
    					--this.centrifugeSpinTime;
    					buildcraftPowerHandler.useEnergy(2, 4, true);
    					
    					if (this.centrifugeSpinTime == 0) {
    						
    						for (int i = 0; i < recipe.outputs.length; i++) {
    							
    							if (getStackInSlot(i) == null) {
    								
    								setInventorySlotContents(i, recipe.outputs[i].copy());
    								
    							}
    							
    						}
    						
    						if (recipe.fluidOutput != null) {
    							this.fill(null, recipe.fluidOutput, true);
    						}
    						
    						if (getStackInSlot(0).stackSize >= 2) {
                                
                                decrStackSize(0, 1);
                                
                            } 
                            else {
                                
                                setInventorySlotContents(0, null);
                                
                            }
                            

                            if (getStackInSlot(0) == null) {
                                
                                this.centrifugeSpinTime = 0;
                                this.spinning = false;
                                
                                worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, worldObj.getBlockMetadata(xCoord, yCoord, zCoord) - 10, 2);
                                
                            }
                            else {
                                
                                this.centrifugeSpinTime = recipe.time;
                                
                            }
    						
    					}
    					
    				}
    				
    			}
    			
    		}
    		
    	}
    	
    }
    
    @Override
    public int getSizeInventory() {
        return centrifugeStacks.length;
    }
    
    @Override
    public ItemStack getStackInSlot(int i) {
        return centrifugeStacks[i];
    }
    
    @Override
    public ItemStack decrStackSize(int i, int j) {
    	ItemStack stack = getStackInSlot(i);
        
        if (stack != null) {
            stack = stack.splitStack(j);
            
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
    	if (stack != null) {
            /*if (isItemValidForSlot(i, stack)) {
                grinderItemStacks[i] = stack;
                
                LogHelper.log(Level.INFO, "set correctly");
                
                if (stack.stackSize > getInventoryStackLimit()) {
                    stack.stackSize = getInventoryStackLimit();
                }
                
                onInventoryChanged();
            }
            else {
                LogHelper.log(Level.INFO, "return");
                return;
            }*/
            
            centrifugeStacks[i] = stack;
            
            LogHelper.log(Level.INFO, "set correctly");
            
            if (stack.stackSize > getInventoryStackLimit()) {
                stack.stackSize = getInventoryStackLimit();
            }
            
            onInventoryChanged();
        }
        else if (stack == null) {
            LogHelper.log(Level.INFO, "set to null");
            
            centrifugeStacks[i] = null;
            
            onInventoryChanged();
        }
    }
    
    @Override
    public String getInvName() {
        return "container.centrifuge";
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
        return true;
    }
    
    @Override
    public int[] getAccessibleSlotsFromSide(int var1) {
        return null;
    }
    
    @Override
    public boolean canInsertItem(int i, ItemStack stack, int j) {
        return isItemValidForSlot(j, stack);
    }
    
    @Override
    public boolean canExtractItem(int i, ItemStack itemstack, int j) {
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
    
    @Override
    public boolean acceptsEnergyFrom(TileEntity emitter,
            ForgeDirection direction) {
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
    
    @Override
    public PowerReceiver getPowerReceiver(ForgeDirection side) {
        return this.buildcraftPowerHandler.getPowerReceiver();
    }
    
    @Override
    public void doWork(PowerHandler workProvider) {
        
    }
    
    @Override
    public World getWorld() {
        return this.worldObj;
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