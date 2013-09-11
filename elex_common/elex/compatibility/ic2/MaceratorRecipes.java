package elex.compatibility.ic2;

import ic2.api.recipe.RecipeInputItemStack;
import ic2.api.recipe.RecipeInputOreDict;
import ic2.api.recipe.Recipes;

import java.util.logging.Level;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import elex.core.ElexIDs;
import elex.core.LogHelper;
import elex.core.ModBlocks;
import elex.core.ModItems;

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
        for (int i = 0; i < ElexIDs.BLOCK_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length; i++) {
            if (i != 4 && i != 10 && i != 13) {
                Recipes.macerator.addRecipe(new RecipeInputOreDict(
                        ElexIDs.BLOCK_ELEX_ORE_REAL_UNLOCALIZED_NAMES[i]),
                        null, new ItemStack(ModItems.itemElExMetalDust, 2,
                                ElexIDs.METAL_ORE_ELEMENT_IDS.get(i) - 1));
                LogHelper.log(Level.INFO, "" + i);
            }
        }
        for (int i = 0; i < ElexIDs.BLOCK_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES.length; i++) {
            if (i != 4) {
                int j = i
                        + ElexIDs.BLOCK_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length;
                Recipes.macerator.addRecipe(new RecipeInputOreDict(
                        ElexIDs.BLOCK_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES[i]),
                        null, new ItemStack(ModItems.itemElExMetalDust, 2,
                                ElexIDs.METAL_ORE_ELEMENT_IDS.get(j) - 1));
            }
        }
        Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(Block.oreNetherQuartz)), null, new ItemStack(ModItems.itemVanillaDust, 2, 0));
        //Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(Block.oreIron)), null, new ItemStack(ModItems.itemVanillaDust, 2, 1));
        //Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(Block.oreGold)), null, new ItemStack(ModItems.itemVanillaDust, 2, 2));
        Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(Block.oreEmerald)), null, new ItemStack(ModItems.itemVanillaDust, 2, 3));
        // Macerator Recipes for Compound Ores
        for (int i = 0; i < ElexIDs.ITEM_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length; i++) {
            Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(ModBlocks.blockElExItemOre, 1, i)), null, new ItemStack(ModItems.itemElExCompoundDust, 2, i));
        }
        for (int i = 0; i < ElexIDs.ITEM_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES.length; i++) {
            int j = i + ElexIDs.ITEM_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length;
            
            Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(ModBlocks.blockElExItemOre2, 1, i)), null, new ItemStack(ModItems.itemElExCompoundDust, 2, j));
        }
        for (int i = 0; i < ElexIDs.ITEM_ELEX_ORE_3_REAL_UNLOCALIZED_NAMES.length; i++) {
            int j = i + ElexIDs.ITEM_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length + ElexIDs.ITEM_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES.length;
            
            Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(ModBlocks.blockElExItemOre3, 1, i)), null, new ItemStack(ModItems.itemElExCompoundDust, 2, j));
        }
        
        for (int i = 0; i < ElexIDs.ELEX_ORE_REAL_UNLOCALIZED_NAMES.length; i++) {
            Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(ModItems.itemElExOre, 1, i)), null, new ItemStack(ModItems.itemElExCompoundDust, 1, i));
        }
        Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(Item.netherQuartz)), null, new ItemStack(ModItems.itemVanillaDust, 1, 0));
        Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(Item.emerald)), null, new ItemStack(ModItems.itemVanillaDust, 1, 3));
        for (int i = 0; i < ElexIDs.ELEX_INGOT_REAL_UNLOCALIZED_NAMES.size(); i++) {
            if (i != 15 && i != 30 && i != 33 && i != 61) {
                Recipes.macerator.addRecipe(new RecipeInputItemStack(
                        new ItemStack(ModItems.itemElExIngot, 1, i)), null,
                        new ItemStack(ModItems.itemElExMetalDust, 1, i));
            }
        }
    }
    
}
