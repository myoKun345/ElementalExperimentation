package elex.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

/**
 * Elemental Experimentation
 * 
 * TileEntityGrinder
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class TileEntityGrinder extends TileEntity {
    
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
    }
    
    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        grinderGrindTime = compound.getShort("GrindTime");
        grinderGroundTime = compound.getShort("GroundTime");
        
    }
    
}