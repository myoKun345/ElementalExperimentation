package myokun.mods.elex.compatibility.microblock

import codechicken.microblock.MicroMaterialRegistry._
import codechicken.microblock.BlockMicroMaterial
import cpw.mods.fml.common.FMLLog
import cpw.mods.fml.common.Loader
import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.event.FMLInitializationEvent
import cpw.mods.fml.common.network.NetworkMod
import cpw.mods.fml.common.Mod.EventHandler
import myokun.mods.elex.core.Reference._
import myokun.mods.elex.core.ElexIDs
import myokun.mods.elex.block.ElexBrick
import myokun.mods.elex.block.ElexStone

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
                registerMaterial(new BlockMicroMaterial(ElexBrick, i), "tile." + ElexIDs.BLOCK_BRICK_UNLOCALIZED_NAMES(i))
                registerMaterial(new BlockMicroMaterial(ElexStone, i), "tile." + ElexIDs.BLOCK_BUILDING_MATERIAL_UNLOCALIZED_NAMES(i))
            }
            
        }
    }
    
}