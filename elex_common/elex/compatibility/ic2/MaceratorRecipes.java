package elex.compatibility.ic2;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ic2.api.recipe.Recipes;
import elex.block.ModBlocks;
import elex.item.ModItems;
import elex.lib.BlockIds;
import elex.lib.ItemIds;

/**
 * Elemental Experimentation
 * 
 * MaceratorRecipes
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class MaceratorRecipes {
    
    public static void addMaceratorRecipes() {
        for (int i = 0; i < BlockIds.BLOCK_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length; i++) {
            int j = i + 8;
            
            Recipes.macerator.addRecipe(new ItemStack(ModBlocks.blockElExOre, 1, i), new ItemStack(ModItems.itemElExDust, 2, j));
        }
        for (int i = 0; i < BlockIds.BLOCK_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES.length; i++) {
            int j = i + 8 + 16;
            
            Recipes.macerator.addRecipe(new ItemStack(ModBlocks.blockElExOre2, 1, i), new ItemStack(ModItems.itemElExDust, 2, j));
        }
        for (int i = 0; i < ItemIds.ELEX_ORE_REAL_UNLOCALIZED_NAMES.length; i++) {
            Recipes.macerator.addRecipe(new ItemStack(ModItems.itemElExOre, 1, i), new ItemStack(ModItems.itemElExDust, 1, i));
        }
        Recipes.macerator.addRecipe(new ItemStack(Item.netherQuartz), new ItemStack(ModItems.itemElExDust, 1, 7));
        for (int i = 0; i < ItemIds.ELEX_INGOT_REAL_UNLOCALIZED_NAMES.length; i++) {
            int j = 1 + 8;
            
            Recipes.macerator.addRecipe(new ItemStack(ModItems.itemElExIngot, 1, i), new ItemStack(ModItems.itemElExDust, 1, j));
        }
    }
    
}
