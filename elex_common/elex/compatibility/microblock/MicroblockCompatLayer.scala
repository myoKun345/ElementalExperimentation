package elex.compatibility.microblock

import codechicken.microblock.MicroMaterialRegistry._
import codechicken.microblock.BlockMicroMaterial
import cpw.mods.fml.common.FMLLog
import cpw.mods.fml.common.Loader
import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.event.FMLInitializationEvent
import cpw.mods.fml.common.network.NetworkMod
import cpw.mods.fml.common.Mod.EventHandler
import elex.core.Reference._
import elex.core.ModBlocks._
import elex.core.ElexIDs

/**
 * Elemental Experimentation
 *
 * MicroblockCompatLayer
 *
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
@Mod(modid="ElEx|MicroblockCompat", name="ElEx Compat: Forge Microblock", version="0.0.01.@@BUILD@@", dependencies="after:ElEx", modLanguage="scala")
@NetworkMod(clientSideRequired = false, serverSideRequired = false)
object MicroblockCompatLayer {
    
    @EventHandler
    def init(event:FMLInitializationEvent) {
        if(!Loader.isModLoaded("ForgeMicroblock")) {
            
            FMLLog.warning("Forge Microblock missing - ElEx Microblock Compat not loading")
            return
            
        } 
        try {
            
            for (i <- 0 to 8) {
                registerMaterial(new BlockMicroMaterial(blockBrick, i), "tile." + ElexIDs.BLOCK_BRICK_UNLOCALIZED_NAMES(i))
                registerMaterial(new BlockMicroMaterial(blockBuildingMaterial, i), "tile." + ElexIDs.BLOCK_BUILDING_MATERIAL_UNLOCALIZED_NAMES(i))
            }
            
        }
    }
    
}