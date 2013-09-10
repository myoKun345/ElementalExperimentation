package elex.tileentity;

import ic2.api.energy.tile.IEnergySink;

import java.util.Random;
import java.util.logging.Level;

import net.minecraft.block.BlockFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import universalelectricity.core.block.IElectricalStorage;
import buildcraft.api.power.IPowerReceptor;
import buildcraft.api.power.PowerHandler;
import buildcraft.api.power.PowerHandler.PowerReceiver;
import cpw.mods.fml.common.FMLCommonHandler;
import elex.api.GrinderRecipe;
import elex.core.LogHelper;

/**
 * Elemental Experimentation
 * 
 * TileEntityGrinder
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class TileEntityGrinder extends TileEntity implements ISidedInventory, IEnergySink, IPowerReceptor, IElectricalStorage {
    
    public ItemStack[] grinderItemStacks = new ItemStack[4];
    
    public int grinderGrindTime;
    public int currentItemGrindTime;
    public int grinderGroundTime;
    public boolean grinding;
    
    public EntityPlayer placedBy;
    
    public PowerHandler buildcraftPowerHandler;
    public static int MAX_MJ = 4000;
    
    public TileEntityGrinder() {
        buildcraftPowerHandler = new PowerHandler(this, PowerHandler.Type.MACHINE);
        initBCPowerProvider();
    }
    
    private void initBCPowerProvider() {
        buildcraftPowerHandler.configure(2, 128, 2, MAX_MJ);
        buildcraftPowerHandler.configurePowerPerdition(2, 1);
    }
    
    @Override
    public void writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        buildcraftPowerHandler.writeToNBT(compound);
        
        compound.setShort("GrindTime", (short)this.grinderGrindTime);
        compound.setShort("GroundTime", (short)this.grinderGroundTime);
        
        compound.setBoolean("Grinding", this.grinding);
        
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
        buildcraftPowerHandler.readFromNBT(compound);
        initBCPowerProvider();
        
        NBTTagList items = compound.getTagList("Items");
        this.grinderGrindTime = compound.getShort("GrindTime");
        this.grinderGroundTime = compound.getShort("GroundTime");
        
        this.grinding = compound.getBoolean("Grinding");
        
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
    public boolean canUpdate() {
        return !FMLCommonHandler.instance().getEffectiveSide().isClient();
    }
    
    @Override
    public void updateEntity() {
        if (!this.worldObj.isRemote) {
            
            if (getStackInSlot(0) != null) {
                
                if ((getStackInSlot(2) == null && getStackInSlot(3) == null) || (getStackInSlot(2) == null && getStackInSlot(3).stackSize < 64) || (getStackInSlot(2).stackSize < 64 && getStackInSlot(3) == null) || (getStackInSlot(2).stackSize < 64 && getStackInSlot(3).stackSize < 64)) {
                
                    GrinderRecipe recipe;
                    
                    if (GrinderRecipe.canBeDone(getStackInSlot(0)) && this.grinding == false) {
                        
                        recipe = GrinderRecipe.grinderRecipes.get(getStackInSlot(0).getUnlocalizedName());
                        
                        this.grinderGrindTime = recipe.time;
                        this.grinding = true;
                        
                    }
                    if (this.grinding && buildcraftPowerHandler.getEnergyStored() >= buildcraftPowerHandler.getActivationEnergy()) {
                        
                        --this.grinderGrindTime;
                        buildcraftPowerHandler.useEnergy(1, 2, true);
                        
                        recipe = GrinderRecipe.grinderRecipes.get(getStackInSlot(0).getUnlocalizedName());
    
                        if (this.grinderGrindTime == 0) {
                            
                            if (getStackInSlot(2) == null) {
                                
                                setInventorySlotContents(2, recipe.mainOutput.copy());
                                
                            } 
                            else if (getStackInSlot(2).stackSize < 64) {
                                
                                if (getStackInSlot(2).stackSize != 0 && getStackInSlot(2).itemID == recipe.mainOutput.itemID && getStackInSlot(2).getItemDamage() == recipe.mainOutput.getItemDamage()) {
                                    
                                    LogHelper.log(Level.INFO, "Recipe stack size " + recipe.mainOutput.stackSize);
                                    getStackInSlot(2).stackSize = getStackInSlot(2).stackSize + recipe.mainOutput.stackSize/*2*/;
                                    
                                }
                            }
                            if (recipe.bonusOutput != null) {
                                
                                Random rand = new Random();
    
                                if (rand.nextInt(recipe.bonusChance) == 0) {
                                    
                                    if (getStackInSlot(3) == null) {
                                        
                                        setInventorySlotContents(3, recipe.bonusOutput.copy());
                                        
                                    } 
                                    else if (getStackInSlot(3).stackSize < 64) {
                                        
                                        if (getStackInSlot(3).stackSize != 0 && getStackInSlot(3).itemID == recipe.bonusOutput.itemID && getStackInSlot(3).getItemDamage() == recipe.bonusOutput.getItemDamage()) {
                                            
                                            getStackInSlot(3).stackSize = getStackInSlot(3).stackSize + recipe.bonusOutput.stackSize;
                                            
                                        }
                                    }
                                }
                            }
                            
                            if (getStackInSlot(0).stackSize >= 2) {
                                
                                decrStackSize(0, 1);
                                
                            } 
                            else {
                                
                                setInventorySlotContents(0, null);
                                
                            }
                            
                            if (getStackInSlot(0) == null) {
                                
                                this.grinderGrindTime = 0;
                                this.grinding = false;
                                
                            } 
                            else {
                                
                                this.grinderGrindTime = recipe.time;
                                
                            }
                        }
                    }
                }
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
        if (stack != null) {
            if (isItemValidForSlot(i, stack)) {
                grinderItemStacks[i] = stack;
                
                if (stack != null && stack.stackSize > getInventoryStackLimit()) {
                    stack.stackSize = getInventoryStackLimit();
                }
                
                onInventoryChanged();
            }
            else {
                return;
            }
        }
        else {
            grinderItemStacks[i] = null;
            
            onInventoryChanged();
        }
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
        if (i == 0) {
            LogHelper.log(Level.INFO, "slot 0 " + GrinderRecipe.canBeDone(stack));
            return GrinderRecipe.canBeDone(stack);
        }
        if (i == 2 || i == 3) {
            LogHelper.log(Level.INFO, "slot 2/3 true");
            return true;
        }
        else {
            LogHelper.log(Level.INFO, "false");
            return false;
        }
    }
    
    @Override
    public int[] getAccessibleSlotsFromSide(int var1) {
        return null;
    }
    
    @Override
    public boolean canInsertItem(int i, ItemStack itemstack, int j) {
        return isItemValidForSlot(j, itemstack);
    }
    
    @Override
    public boolean canExtractItem(int i, ItemStack itemstack, int j) {
        return false;
    }
    
    @Override
    public PowerReceiver getPowerReceiver(ForgeDirection side) {
        return buildcraftPowerHandler.getPowerReceiver();
    }
    
    @Override
    public void doWork(PowerHandler workProvider) {
        
    }
    
    @Override
    public World getWorld() {
        return null;
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
