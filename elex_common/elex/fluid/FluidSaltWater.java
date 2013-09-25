package elex.fluid;

import net.minecraft.util.Icon;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import elex.core.ElexIDs;

/**
 * Elemental Experimentation
 * 
 * FluidSaltWater
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class FluidSaltWater extends Fluid {
    
    public FluidSaltWater(String fluidName) {
        super(fluidName);
        setViscosity(1050);
        setDensity(1020);
        setBlockID(ElexIDs.SALT_WATER_BLOCK);
        FluidRegistry.registerFluid(this);
    }
    
    @Override
    public String getUnlocalizedName() {
        return "fluid." + ElexIDs.SALT_WATER_UNLOCALIZED_NAME;
    }
    
    @Override
    public Icon getFlowingIcon() {
        return BlockFluidSaltWater.iconFlow;
    }
    
    @Override
    public Icon getStillIcon() {
        return BlockFluidSaltWater.iconStill;
    }

}
