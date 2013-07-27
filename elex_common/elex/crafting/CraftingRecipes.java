package elex.crafting;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.registry.GameRegistry;
import elex.item.ModItems;
import elex.lib.ItemIds;

/**
 * Elemental Experimentation
 * 
 * CraftingRecipes
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class CraftingRecipes {
    public static void registerRecipes() {
        GameRegistry.addRecipe(new ItemStack(ModItems.mercuryInjector, 1), new Object[] { "X", "Z", "Y", 'X', Item.ingotIron, 'Z', Item.slimeBall, 'Y', Item.stick });
        //GameRegistry.addRecipe(new ItemStack(ModItems.mercuryInjector, 1), new Object[] { "X", "Z", "Y", 'X', Item.ingotIron, 'Z', "molecule_1hg", 'Y', Item.stick });
        
        for (int i = 0; i < ItemIds.ELEX_ORE_REAL_UNLOCALIZED_NAMES.length; i++) {
            FurnaceRecipes.smelting().addSmelting(ItemIds.ELEX_DUST, i, new ItemStack(ModItems.itemElExOre, 1, i), 5F);
        }
        FurnaceRecipes.smelting().addSmelting(ItemIds.ELEX_DUST, 7, new ItemStack(Item.netherQuartz, 1), 5F);
    }
}
