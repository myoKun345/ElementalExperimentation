package elex.core;

import java.util.LinkedList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import elex.fluids.BlockFluidSaltWater;
import elex.fluids.FluidPureGaseous;
import elex.fluids.FluidSaltWater;
import elex.lib.ElexIDs;

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
    public static List<Fluid> fluidPureGas = new LinkedList<Fluid>();
    public static Block blockSaltWater;
    public static Fluid fluidCompressedAir;
    public static Fluid fluidNetherAir;
    
    public static void init() {
        fluidSaltWater = new FluidSaltWater("fluidSaltWater");
        fluidCompressedAir = new Fluid("fluidAir").setGaseous(true);
        fluidPureGas.set(0, new Fluid("fluidHydrogen").setGaseous(true));
        fluidNetherAir = new Fluid("fluidNetherAir").setGaseous(true);
        blockSaltWater = new BlockFluidSaltWater(ElexIDs.SALT_WATER_BLOCK);
        
        GameRegistry.registerBlock(blockSaltWater, "blockSaltWater");
        
        FluidRegistry.registerFluid(fluidCompressedAir);
        FluidRegistry.registerFluid(fluidNetherAir);
        FluidRegistry.registerFluid(fluidPureGas.get(0));
    }
    
    public static void addPureGas(String name, int id) {
        fluidPureGas.add(new FluidPureGaseous(name, id - 1));
    }
    
}
