package elex.compatibility.thermalexpansion;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import elex.lib.Reference;

/**
 * Elemental Experimentation
 * 
 * ThermalExpansionCompatLayer
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */

@Mod(modid = Reference.MOD_ID + "|CompatTE", name = Reference.MOD_ID + " Compat: TE", version = Reference.VERSION, dependencies = "after:ElEx;after:ThermalExpansion")
@NetworkMod(clientSideRequired = false, serverSideRequired = false)
public class ThermalExpansionCompatLayer {
    @EventHandler
    public static void init(FMLInitializationEvent event) {
        if(!Loader.isModLoaded("ThermalExpansion")) {
            
            FMLLog.warning("Thermal Expansion missing - ElEx TE Compat not loading");
            return;
            
        } try {
            
            PulverizerRecipes.addPulverizerRecipes();
            
        }
        catch (Exception x)
        {
            x.printStackTrace();
        }
    }
}
