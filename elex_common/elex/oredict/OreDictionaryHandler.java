package elex.oredict;

import elex.block.ModBlocks;
import elex.item.ModItems;
import elex.lib.BlockIds;
import elex.lib.ItemIds;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

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
        for (int i = 0; i < ItemIds.ELEX_INGOT_REAL_UNLOCALIZED_NAMES.length; i++) {
            OreDictionary.registerOre(ItemIds.ELEX_INGOT_REAL_UNLOCALIZED_NAMES[i], new ItemStack(ModItems.itemElExIngot, 1, i));
        }
        for (int i = 0; i < ItemIds.ELEX_ORE_REAL_UNLOCALIZED_NAMES.length; i++) {
            OreDictionary.registerOre(ItemIds.ELEX_ORE_REAL_UNLOCALIZED_NAMES[i], new ItemStack(ModItems.itemElExOre, 1, i));
        }
        for (int i = 0; i < ItemIds.ELEX_DUST_REAL_UNLOCALIZED_NAMES.length; i++) {
            OreDictionary.registerOre(ItemIds.ELEX_DUST_REAL_UNLOCALIZED_NAMES[i], new ItemStack(ModItems.itemElExDust, 1, i));
        }
        for (int i = 0; i < BlockIds.BLOCK_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length; i++) {
            OreDictionary.registerOre(BlockIds.BLOCK_ELEX_ORE_REAL_UNLOCALIZED_NAMES[i], new ItemStack(ModBlocks.blockElExOre, 1, i));
        }
        for (int i = 0; i < BlockIds.BLOCK_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES.length; i++) {
            OreDictionary.registerOre(BlockIds.BLOCK_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES[i], new ItemStack(ModBlocks.blockElExOre2, 1, i));
        }
    }
    
}