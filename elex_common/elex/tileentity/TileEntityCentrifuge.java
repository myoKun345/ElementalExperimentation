package elex.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

/**
 * Elemental Experimentation
 * 
 * TileEntityCentrifuge
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class TileEntityCentrifuge extends TileEntity {
    
    public int centrifugeSpinTime;
    
    public int currentItemSpinTime;
    
    public int centrifugeSpunTime;
    
    public EntityPlayer placedBy;
    
    public boolean isSpinning() {
        return centrifugeSpinTime > 0;
    }
    
    @Override
    public void writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        compound.setShort("SpinTime", (short)this.centrifugeSpinTime);
        compound.setShort("SpunTime", (short)this.centrifugeSpunTime);
    }
    
    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        centrifugeSpinTime = compound.getShort("SpinTime");
        centrifugeSpunTime = compound.getShort("SpunTime");
        
    }
    
}