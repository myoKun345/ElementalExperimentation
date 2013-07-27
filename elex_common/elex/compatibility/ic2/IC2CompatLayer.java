package elex.compatibility.ic2;

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
 * IC2CompatLayer
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */

@Mod(modid = Reference.MOD_ID + "|CompatIC2", name = Reference.MOD_ID + " Compat: IC2", version = Reference.VERSION, dependencies = "after:ElEx;after:IC2")
@NetworkMod(clientSideRequired = false, serverSideRequired = false)
public class IC2CompatLayer {
    
    @EventHandler
    public static void init(FMLInitializationEvent event) {
        if(!Loader.isModLoaded("IC2")) {
            
            FMLLog.warning("IC2 missing - ElEx IC2 Compat not loading");
            return;
            
        } try {
            
            MaceratorRecipes.addMaceratorRecipes();
            
        }
        catch (Exception x)
        {
            x.printStackTrace();
        }
    }
    
}
