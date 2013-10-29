package myokun.mods.elex.fluid;

import myokun.mods.elex.core.ElexIDs;
import myokun.mods.elex.core.Reference;
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
        return "fluid." + ElexIDs.ELEMENTAL_GAS_UNLOCALIZED_NAMES.get(this.id);
    }
    
    @Override
    public Icon getFlowingIcon() {
        return register.registerIcon(Reference.MOD_ID + ":" + this.fluidName + "_flow");
    }
    
    @Override
    public Icon getStillIcon() {
        return register.registerIcon(Reference.MOD_ID + ":" + this.fluidName + "_still");
    }
    
}
