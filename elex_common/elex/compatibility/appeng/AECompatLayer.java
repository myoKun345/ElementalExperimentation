package elex.compatibility.appeng;

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
 * AECompatLayer
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */

@Mod(modid = Reference.MOD_ID + "|CompatAE", name = Reference.MOD_ID + " Compat: AE", version = Reference.VERSION, dependencies = "after:ElEx;after:AppliedEnergistics")
@NetworkMod(clientSideRequired = false, serverSideRequired = false)
public class AECompatLayer {
    
    @EventHandler
    public static void init(FMLInitializationEvent event) {
        if(!Loader.isModLoaded("AppliedEnergistics")) {
            
            FMLLog.warning("Applied Energistics missing - ElEx AppEng Compat not loading");
            return;
            
        } try {
            
            
            
        }
        catch (Exception x)
        {
            x.printStackTrace();
        }
    }
    
}
