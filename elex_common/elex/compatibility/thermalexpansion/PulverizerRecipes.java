package elex.compatibility.thermalexpansion;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import thermalexpansion.api.crafting.CraftingHelpers;
import elex.block.ModBlocks;
import elex.item.ModItems;
import elex.lib.BlockIds;
import elex.lib.ItemIds;

/**
 * Elemental Experimentation
 * 
 * PulverizerRecipes
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class PulverizerRecipes {
    
    public static void addPulverizerRecipes() {
        CraftingHelpers.addPulverizerOreToDustRecipe(new ItemStack(Block.oreNetherQuartz), new ItemStack(ModItems.itemVanillaDust, 2, 0));
        CraftingHelpers.addPulverizerOreToDustRecipe(new ItemStack(Block.oreIron), new ItemStack(ModItems.itemVanillaDust, 2, 1));
        CraftingHelpers.addPulverizerOreToDustRecipe(new ItemStack(Block.oreGold), new ItemStack(ModItems.itemVanillaDust, 2, 2));
        for (int i = 0; i < ItemIds.ELEX_ORE_REAL_UNLOCALIZED_NAMES.length; i++) {
            CraftingHelpers.addPulverizerIngotToDustRecipe(new ItemStack(ModItems.itemElExOre, 1, i), new ItemStack(ModItems.itemElExCompoundDust, 1, i));
        }
        CraftingHelpers.addPulverizerIngotToDustRecipe(new ItemStack(Item.netherQuartz), new ItemStack(ModItems.itemVanillaDust, 1, 0));
        for (int i = 0; i < ItemIds.ELEX_INGOT_REAL_UNLOCALIZED_NAMES.size(); i++) {
            CraftingHelpers.addPulverizerIngotToDustRecipe(new ItemStack(ModItems.itemElExIngot, 1, i), new ItemStack(ModItems.itemElExMetalDust, 1, i));
        }
        CraftingHelpers.addPulverizerIngotToDustRecipe(new ItemStack(Item.ingotIron), new ItemStack(ModItems.itemVanillaDust, 1, 1));
        CraftingHelpers.addPulverizerIngotToDustRecipe(new ItemStack(Item.ingotGold), new ItemStack(ModItems.itemVanillaDust, 1, 2));
    }
}
