package elex.compatibility.ic2;

import ic2.api.recipe.Recipes;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import elex.core.ModBlocks;
import elex.core.ModItems;
import elex.lib.ElexIDs;
import elex.lib.ElexIDs;

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
            Recipes.macerator.addRecipe(new ItemStack(ModBlocks.blockElExOre, 1, i), new ItemStack(ModItems.itemElExMetalDust, 2, ElexIDs.METAL_ORE_ELEMENT_IDS.get(i) - 1));
        }
        for (int i = 0; i < ElexIDs.BLOCK_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES.length; i++) {
            int j = i + ElexIDs.BLOCK_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length;
            Recipes.macerator.addRecipe(new ItemStack(ModBlocks.blockElExOre2, 1, i), new ItemStack(ModItems.itemElExMetalDust, 2, ElexIDs.METAL_ORE_ELEMENT_IDS.get(j) - 1));
        }
        Recipes.macerator.addRecipe(new ItemStack(Block.oreNetherQuartz), new ItemStack(ModItems.itemVanillaDust, 2, 0));
        Recipes.macerator.addRecipe(new ItemStack(Block.oreIron), new ItemStack(ModItems.itemVanillaDust, 2, 1));
        Recipes.macerator.addRecipe(new ItemStack(Block.oreGold), new ItemStack(ModItems.itemVanillaDust, 2, 2));
        Recipes.macerator.addRecipe(new ItemStack(Block.oreEmerald), new ItemStack(ModItems.itemVanillaDust, 2, 3));
        // Macerator Recipes for Compound Ores
        for (int i = 0; i < ElexIDs.ITEM_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length; i++) {
            Recipes.macerator.addRecipe(new ItemStack(ModBlocks.blockElExItemOre, 1, i), new ItemStack(ModItems.itemElExCompoundDust, 2, i));
        }
        for (int i = 0; i < ElexIDs.ITEM_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES.length; i++) {
            int j = i + ElexIDs.ITEM_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length;
            
            Recipes.macerator.addRecipe(new ItemStack(ModBlocks.blockElExItemOre2, 1, i), new ItemStack(ModItems.itemElExCompoundDust, 2, j));
        }
        for (int i = 0; i < ElexIDs.ITEM_ELEX_ORE_3_REAL_UNLOCALIZED_NAMES.length; i++) {
            int j = i + ElexIDs.ITEM_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length + ElexIDs.ITEM_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES.length;
            
            Recipes.macerator.addRecipe(new ItemStack(ModBlocks.blockElExItemOre3, 1, i), new ItemStack(ModItems.itemElExCompoundDust, 2, j));
        }
        
        for (int i = 0; i < ElexIDs.ELEX_ORE_REAL_UNLOCALIZED_NAMES.length; i++) {
            Recipes.macerator.addRecipe(new ItemStack(ModItems.itemElExOre, 1, i), new ItemStack(ModItems.itemElExCompoundDust, 1, i));
        }
        Recipes.macerator.addRecipe(new ItemStack(Item.netherQuartz), new ItemStack(ModItems.itemVanillaDust, 1, 0));
        Recipes.macerator.addRecipe(new ItemStack(Item.emerald), new ItemStack(ModItems.itemVanillaDust, 1, 3));
        for (int i = 0; i < ElexIDs.ELEX_INGOT_REAL_UNLOCALIZED_NAMES.size(); i++) {
            Recipes.macerator.addRecipe(new ItemStack(ModItems.itemElExIngot, 1, i), new ItemStack(ModItems.itemElExMetalDust, 1, i));
        }
        Recipes.macerator.addRecipe(new ItemStack(Item.ingotIron), new ItemStack(ModItems.itemVanillaDust, 1, 1));
        Recipes.macerator.addRecipe(new ItemStack(Item.ingotGold), new ItemStack(ModItems.itemVanillaDust, 1, 2));
    }
    
}
