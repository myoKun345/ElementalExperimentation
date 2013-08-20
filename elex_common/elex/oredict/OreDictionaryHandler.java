package elex.oredict;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import elex.block.ModBlocks;
import elex.core.Loop;
import elex.item.ModItems;
import elex.lib.BlockIds;
import elex.lib.ItemIds;

/**
 * Elemental Experimentation
 * 
 * OreDictionaryHandler
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class OreDictionaryHandler {
    
    public static void registerOres() {
        // Pure Ingots
        for (int i = 0; i < ItemIds.ELEX_INGOT_REAL_UNLOCALIZED_NAMES.size(); i++) {
            OreDictionary.registerOre(ItemIds.ELEX_INGOT_REAL_UNLOCALIZED_NAMES.get(i), new ItemStack(ModItems.itemElExIngot, 1, i));
        }
        // Compound Ores
        for (int i = 0; i < ItemIds.ELEX_ORE_REAL_UNLOCALIZED_NAMES.length; i++) {
            OreDictionary.registerOre(ItemIds.ELEX_ORE_REAL_UNLOCALIZED_NAMES[i], new ItemStack(ModItems.itemElExOre, 1, i));
        }
        OreDictionary.registerOre("peridot", new ItemStack(ModItems.itemElExOre, 1, 4));
        OreDictionary.registerOre("olivine", new ItemStack(ModItems.itemElExOre, 1, 4));
        // Compound Dusts
        for (int i = 0; i < ItemIds.ELEX_COMPOUND_DUST_REAL_UNLOCALIZED_NAMES.length; i++) {
            OreDictionary.registerOre(ItemIds.ELEX_COMPOUND_DUST_REAL_UNLOCALIZED_NAMES[i], new ItemStack(ModItems.itemElExCompoundDust, 1, i));
        }
        // Pure Metal Dusts
        for (int i = 0; i < ItemIds.ELEX_METAL_DUST_REAL_UNLOCALIZED_NAMES.size(); i++) {
            OreDictionary.registerOre(ItemIds.ELEX_METAL_DUST_REAL_UNLOCALIZED_NAMES.get(i), new ItemStack(ModItems.itemElExMetalDust, 1, i));
        }
        // Vanilla Dusts
        for (int i = 0; i < ItemIds.VANILLA_DUST_REAL_UNLOCALIZED_NAMES.length; i++) {
            OreDictionary.registerOre(ItemIds.VANILLA_DUST_REAL_UNLOCALIZED_NAMES[i], new ItemStack(ModItems.itemVanillaDust, 1, i));
        }
        // Pure Non-metal Dusts
        for (int i = 0; i < ItemIds.ELEX_PURE_NONMETAL_DUST_REAL_UNLOCALIZED_NAMES.size(); i++) {
            OreDictionary.registerOre(ItemIds.ELEX_PURE_NONMETAL_DUST_REAL_UNLOCALIZED_NAMES.get(i), new ItemStack(ModItems.itemElExPureNonmetalDust, 1, i));
        }
        // Alloy Dusts
        Loop.loopOreDictItem(ItemIds.ALLOY_DUST_REAL_UNLOCALIZED_NAMES, ModItems.itemAlloyDust);
        // Alloy Ingots
        Loop.loopOreDictItem(ItemIds.ALLOY_INGOT_REAL_UNLOCALIZED_NAMES, ModItems.itemAlloyIngot);
        OreDictionary.registerOre("ingotSteel", new ItemStack(ModItems.itemAlloyIngot, 1, 0));
        // Pure Metal Nuggets
        Loop.loopOreDictItemList(ItemIds.METAL_NUGGET_REAL_UNLOCALIZED_NAMES, ModItems.itemMetalNugget);
        // Alloy Nuggets
        Loop.loopOreDictItem(ItemIds.ALLOY_NUGGET_REAL_UNLOCALIZED_NAMES, ModItems.itemAlloyNugget);
        // Iron Nugget
        OreDictionary.registerOre(ItemIds.IRON_NUGGET_UNLOCALIZED_NAME, ModItems.itemIronNugget);
        
        // Native Metal Ores
        for (int i = 0; i < BlockIds.BLOCK_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length; i++) {
            OreDictionary.registerOre(BlockIds.BLOCK_ELEX_ORE_REAL_UNLOCALIZED_NAMES[i], new ItemStack(ModBlocks.blockElExOre, 1, i));
        }
        for (int i = 0; i < BlockIds.BLOCK_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES.length; i++) {
            OreDictionary.registerOre(BlockIds.BLOCK_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES[i], new ItemStack(ModBlocks.blockElExOre2, 1, i));
        }
        // Compound Ore Storage Blocks
        Loop.loopOreDictBlock(BlockIds.BLOCK_ELEX_ITEM_ORE_STORAGE_REAL_UNLOCALIZED_NAMES, ModBlocks.blockElExItemOreStorage);
        // Pure Metal Storage Blocks
        Loop.loopOreDictBlockList(BlockIds.BLOCK_ELEX_METAL_STORAGE_REAL_UNLOCALIZED_NAMES, ModBlocks.blockElExMetalStorage);
        Loop.loopOreDictBlockList(BlockIds.BLOCK_ELEX_METAL_STORAGE_2_REAL_UNLOCALIZED_NAMES, ModBlocks.blockElExMetalStorage2);
        Loop.loopOreDictBlockList(BlockIds.BLOCK_ELEX_METAL_STORAGE_3_REAL_UNLOCALIZED_NAMES, ModBlocks.blockElExMetalStorage3);
        Loop.loopOreDictBlockList(BlockIds.BLOCK_ELEX_METAL_STORAGE_4_REAL_UNLOCALIZED_NAMES, ModBlocks.blockElExMetalStorage4);
        Loop.loopOreDictBlockList(BlockIds.BLOCK_ELEX_METAL_STORAGE_5_REAL_UNLOCALIZED_NAMES, ModBlocks.blockElExMetalStorage5);
        Loop.loopOreDictBlockList(BlockIds.BLOCK_ELEX_METAL_STORAGE_6_REAL_UNLOCALIZED_NAMES, ModBlocks.blockElExMetalStorage6);
        // Alloy Storage Blocks
        Loop.loopOreDictBlock(BlockIds.BLOCK_ALLOY_STORAGE_REAL_UNLOCALIZED_NAMES, ModBlocks.blockAlloyStorage);
        OreDictionary.registerOre("blockSteel", new ItemStack(ModBlocks.blockAlloyStorage, 1, 0));
        // Compound Ore Blocks
        Loop.loopOreDictBlock(BlockIds.ITEM_ELEX_ORE_REAL_UNLOCALIZED_NAMES, ModBlocks.blockElExItemOre);
        Loop.loopOreDictBlock(BlockIds.ITEM_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES, ModBlocks.blockElExItemOre2);
        Loop.loopOreDictBlock(BlockIds.ITEM_ELEX_ORE_3_REAL_UNLOCALIZED_NAMES, ModBlocks.blockElExItemOre3);
    }
    
}
