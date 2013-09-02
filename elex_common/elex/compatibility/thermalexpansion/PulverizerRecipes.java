package elex.compatibility.thermalexpansion;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import thermalexpansion.api.crafting.CraftingHelpers;
import elex.core.ModBlocks;
import elex.core.ModItems;
import elex.lib.ElexIDs;
import elex.lib.ElexIDs;

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
        for (int i = 0; i < ElexIDs.BLOCK_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length; i++) {
            CraftingHelpers.addPulverizerOreToDustRecipe(new ItemStack(ModBlocks.blockElExOre, 1, i), new ItemStack(ModItems.itemElExMetalDust, 2, ElexIDs.METAL_ORE_ELEMENT_IDS.get(i) - 1));
        }
        for (int i = 0; i < ElexIDs.BLOCK_ELEX_ORE_2_REAL_UNLOCALIZED_NAMES.length; i++) {
            int j = i + ElexIDs.BLOCK_ELEX_ORE_REAL_UNLOCALIZED_NAMES.length;
            CraftingHelpers.addPulverizerOreToDustRecipe(new ItemStack(ModBlocks.blockElExOre2, 1, i), new ItemStack(ModItems.itemElExMetalDust, 2, ElexIDs.METAL_ORE_ELEMENT_IDS.get(j) - 1));
        }
        CraftingHelpers.addPulverizerOreToDustRecipe(new ItemStack(Block.oreNetherQuartz), new ItemStack(ModItems.itemVanillaDust, 2, 0));
        CraftingHelpers.addPulverizerOreToDustRecipe(new ItemStack(Block.oreIron), new ItemStack(ModItems.itemVanillaDust, 2, 1));
        CraftingHelpers.addPulverizerOreToDustRecipe(new ItemStack(Block.oreGold), new ItemStack(ModItems.itemVanillaDust, 2, 2));
        CraftingHelpers.addPulverizerOreToDustRecipe(new ItemStack(Block.oreEmerald), new ItemStack(ModItems.itemVanillaDust, 2, 3));
        
        for (int i = 0; i < ElexIDs.ELEX_ORE_REAL_UNLOCALIZED_NAMES.length; i++) {
            CraftingHelpers.addPulverizerIngotToDustRecipe(new ItemStack(ModItems.itemElExOre, 1, i), new ItemStack(ModItems.itemElExCompoundDust, 1, i));
        }
        CraftingHelpers.addPulverizerIngotToDustRecipe(new ItemStack(Item.netherQuartz), new ItemStack(ModItems.itemVanillaDust, 1, 0));
        CraftingHelpers.addPulverizerIngotToDustRecipe(new ItemStack(Item.emerald), new ItemStack(ModItems.itemVanillaDust, 1, 3));
        for (int i = 0; i < ElexIDs.ELEX_INGOT_REAL_UNLOCALIZED_NAMES.size(); i++) {
            CraftingHelpers.addPulverizerIngotToDustRecipe(new ItemStack(ModItems.itemElExIngot, 1, i), new ItemStack(ModItems.itemElExMetalDust, 1, i));
        }
        CraftingHelpers.addPulverizerIngotToDustRecipe(new ItemStack(Item.ingotIron), new ItemStack(ModItems.itemVanillaDust, 1, 1));
        CraftingHelpers.addPulverizerIngotToDustRecipe(new ItemStack(Item.ingotGold), new ItemStack(ModItems.itemVanillaDust, 1, 2));
    }
}
