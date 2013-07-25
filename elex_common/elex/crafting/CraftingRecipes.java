package elex.crafting;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import elex.item.ModItems;

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
    }
}
