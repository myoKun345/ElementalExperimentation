package myokun.mods.elex.core

import net.minecraft.item.ItemStack
import net.minecraftforge.oredict.OreDictionary
import myokun.mods.elex.block.ElexMetalStorage
import myokun.mods.elex.block.ElexCompoundOreStorage
import myokun.mods.elex.block.ElexCompoundOre2
import myokun.mods.elex.item.ElexIngot
import myokun.mods.elex.block.ElexMetalStorage3
import myokun.mods.elex.block.ElexCompoundOre
import myokun.mods.elex.block.ElexOre2
import myokun.mods.elex.block.ElexMetalStorage2
import myokun.mods.elex.block.ElexMetalStorage6
import myokun.mods.elex.block.ElexOre
import myokun.mods.elex.block.ElexMetalStorage5
import myokun.mods.elex.block.ElexBrick
import myokun.mods.elex.block.ElexAlloyStorage
import myokun.mods.elex.block.ElexMetalStorage4
import myokun.mods.elex.block.ElexStone
import myokun.mods.elex.block.ElexCompoundOre3
import myokun.mods.elex.item.ElexItemOre
import myokun.mods.elex.item.ElexCompoundDust
import myokun.mods.elex.item.ElexPureNonmetalDust
import myokun.mods.elex.item.ElexVanillaDust
import myokun.mods.elex.item.ElexMetalDust
import myokun.mods.elex.item.ElexIronNugget
import myokun.mods.elex.item.ElexAlloyIngot
import myokun.mods.elex.item.ElexMetalNugget
import myokun.mods.elex.item.ElexAlloyDust
import myokun.mods.elex.item.ElexAlloyNugget

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
