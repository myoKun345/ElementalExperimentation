package elex.core

import net.minecraft.item.ItemStack
import net.minecraftforge.oredict.OreDictionary
import elex.block.ElexMetalStorage
import elex.block.ElexCompoundOreStorage
import elex.block.ElexCompoundOre2
import elex.item.ElexIngot
import elex.block.ElexMetalStorage3
import elex.block.ElexCompoundOre
import elex.block.ElexOre2
import elex.block.ElexMetalStorage2
import elex.block.ElexMetalStorage6
import elex.block.ElexOre
import elex.block.ElexMetalStorage5
import elex.block.ElexBrick
import elex.block.ElexAlloyStorage
import elex.block.ElexMetalStorage4
import elex.block.ElexStone
import elex.block.ElexCompoundOre3
import elex.item.ElexItemOre
import elex.item.ElexCompoundDust
import elex.item.ElexPureNonmetalDust
import elex.item.ElexVanillaDust
import elex.item.ElexMetalDust
import elex.item.ElexIronNugget
import elex.item.ElexAlloyIngot
import elex.item.ElexMetalNugget
import elex.item.ElexAlloyDust
import elex.item.ElexAlloyNugget

/**
 * Elemental Experimentation
 * 
 * OreDictionaryHandler
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
object OreDictionaryHandler {
    
    def registerOres {
        // Pure Ingots
        Loop.loopOreDictItemList(ElexIDs.ELEX_INGOT_REAL_UNLOCALIZED_NAMES, ElexIngot)
        // Compound Ores
        Loop.loopOreDictItem(ElexIDs.ELEX_ORE_REAL_UNLOCALIZED_NAMES, ElexItemOre)
        OreDictionary.registerOre("peridot", new ItemStack(ElexItemOre, 1, 4))
        OreDictionary.registerOre("olivine", new ItemStack(ElexItemOre, 1, 4))
        Loop.loopOreDictGem(ElexIDs.ELEX_ORE_REAL_UNLOCALIZED_NAMES, ElexItemOre)
        OreDictionary.registerOre("gemPeridot", new ItemStack(ElexItemOre, 1, 4))
        OreDictionary.registerOre("gemOlivine", new ItemStack(ElexItemOre, 1, 4))
        // Compound Dusts
        Loop.loopOreDictItem(ElexIDs.ELEX_COMPOUND_DUST_REAL_UNLOCALIZED_NAMES, ElexCompoundDust)
        // Pure Metal Dusts
        Loop.loopOreDictItemList(ElexIDs.METAL_DUST_REAL_UNLOCALIZED_NAMES, ElexMetalDust)
        // Vanilla Dusts
        Loop.loopOreDictItem(ElexIDs.VANILLA_DUST_REAL_UNLOCALIZED_NAMES, ElexVanillaDust)
        // Pure Non-metal Dusts
        Loop.loopOreDictItemList(ElexIDs.ELEX_PURE_NONMETAL_DUST_REAL_UNLOCALIZED_NAMES, ElexPureNonmetalDust)
        // Alloy Dusts
        Loop.loopOreDictItem(ElexIDs.ALLOY_DUST_REAL_UNLOCALIZED_NAMES, ElexAlloyDust)
        // Alloy Ingots
        Loop.loopOreDictItem(ElexIDs.ALLOY_INGOT_REAL_UNLOCALIZED_NAMES, ElexAlloyIngot)
        OreDictionary.registerOre("ingotSteel", new ItemStack(ElexAlloyIngot, 1, 0))
        // Pure Metal Nuggets
        Loop.loopOreDictItemList(ElexIDs.METAL_NUGGET_REAL_UNLOCALIZED_NAMES, ElexMetalNugget)
        // Alloy Nuggets
        Loop.loopOreDictItem(ElexIDs.ALLOY_NUGGET_REAL_UNLOCALIZED_NAMES, ElexAlloyNugget)
        // Iron Nugget
        OreDictionary.registerOre(ElexIDs.IRON_NUGGET_UNLOCALIZED_NAME, ElexIronNugget)
        
        // Native Metal Ores
        Loop.loopOreDictBlock(ElexIDs.BLOCK_ELEX_ORE_REAL_UNLOCALIZED_NAMES, ElexOre)
        Loop.loopOreDictBlock(ElexIDs.BLOCK_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES, ElexOre2)
        // Compound Ore Blocks
        Loop.loopOreDictBlock(ElexIDs.ITEM_ELEX_ORE_REAL_UNLOCALIZED_NAMES, ElexCompoundOre)
        Loop.loopOreDictBlock(ElexIDs.ITEM_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES, ElexCompoundOre2)
        Loop.loopOreDictBlock(ElexIDs.ITEM_ELEX_ORE_3_REAL_UNLOCALIZED_NAMES, ElexCompoundOre3)
        // Compound Ore Storage Blocks
        Loop.loopOreDictBlock(ElexIDs.BLOCK_ELEX_ITEM_ORE_STORAGE_REAL_UNLOCALIZED_NAMES, ElexCompoundOreStorage)
        // Pure Metal Storage Blocks
        Loop.loopOreDictBlockList(ElexIDs.BLOCK_ELEX_METAL_STORAGE_REAL_UNLOCALIZED_NAMES, ElexMetalStorage)
        Loop.loopOreDictBlockList(ElexIDs.BLOCK_ELEX_METAL_STORAGE_2_REAL_UNLOCALIZED_NAMES, ElexMetalStorage2)
        Loop.loopOreDictBlockList(ElexIDs.BLOCK_ELEX_METAL_STORAGE_3_REAL_UNLOCALIZED_NAMES, ElexMetalStorage3)
        Loop.loopOreDictBlockList(ElexIDs.BLOCK_ELEX_METAL_STORAGE_4_REAL_UNLOCALIZED_NAMES, ElexMetalStorage4)
        Loop.loopOreDictBlockList(ElexIDs.BLOCK_ELEX_METAL_STORAGE_5_REAL_UNLOCALIZED_NAMES, ElexMetalStorage5)
        Loop.loopOreDictBlockList(ElexIDs.BLOCK_ELEX_METAL_STORAGE_6_REAL_UNLOCALIZED_NAMES, ElexMetalStorage6)
        // Alloy Storage Blocks
        Loop.loopOreDictBlock(ElexIDs.BLOCK_ALLOY_STORAGE_REAL_UNLOCALIZED_NAMES, ElexAlloyStorage)
        OreDictionary.registerOre("blockSteel", new ItemStack(ElexAlloyStorage, 1, 0))
        // Building Material Blocks
        Loop.loopOreDictBlock(ElexIDs.BLOCK_BUILDING_MATERIAL_UNLOCALIZED_NAMES, ElexStone)
        Loop.loopOreDictBlock(ElexIDs.BLOCK_BRICK_UNLOCALIZED_NAMES, ElexBrick)
    }
    
}
