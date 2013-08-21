package elex.fluids;

import java.util.LinkedList;

import net.minecraft.block.Block;
import net.minecraftforge.fluids.Fluid;
import cpw.mods.fml.common.registry.GameRegistry;
import elex.lib.FluidIds;

/**
 * Elemental Experimentation
 * 
 * ModFluids
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ModFluids {
    public static Fluid fluidSaltWater;
    public static LinkedList<Fluid> fluidPureGas = new LinkedList<Fluid>();
    public static Block blockSaltWater;
    
    public static void init() {
        fluidSaltWater = new FluidSaltWater("fluidSaltWater");
        blockSaltWater = new BlockFluidSaltWater(FluidIds.SALT_WATER_BLOCK);
        
        GameRegistry.registerBlock(blockSaltWater, "blockSaltWater");
    }
    
    public static void addPureGas(String name, int id) {
        fluidPureGas.add(new FluidPureGaseous(name, id - 1));
    }
    
}
