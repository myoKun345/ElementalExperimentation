package elex.fluids;

import elex.lib.FluidIds;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

/**
 * Elemental Experimentation
 * 
 * FluidPureGaseous
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class FluidPureGaseous extends Fluid {
    
    private IconRegister register;
    private Icon flowIcon;
    private Icon stillIcon;
    private int id;
    
    public FluidPureGaseous(String fluidName, int id) {
        super(fluidName);
        setGaseous(true);
        setDensity(-1);
        this.id = id;
        FluidRegistry.registerFluid(this);
    }
    
    @Override
    public String getUnlocalizedName() {
        return "fluid." + FluidIds.ELEMENTAL_GAS_UNLOCALIZED_NAMES.get(this.id);
    }
    
    @Override
    public Icon getFlowingIcon() {
        return flowIcon;
    }
    
    @Override
    public Icon getStillIcon() {
        return stillIcon;
    }
    
}
