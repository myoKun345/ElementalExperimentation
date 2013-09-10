package elex.api;

import java.util.HashMap;

import net.minecraft.item.ItemStack;

/**
 * Elemental Experimentation
 * 
 * CentrifugeRecipe
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class CentrifugeRecipe {
    
    public static HashMap<String, CentrifugeRecipe> centrifugeRecipes = new HashMap<String, CentrifugeRecipe>();
    
    public ItemStack input;
    public ItemStack[] outputs;
    public int time;
    
    public CentrifugeRecipe(ItemStack i, ItemStack[] o, int t) {
        this.input = i;
        this.outputs = o;
        this.time = t;
    }
    
    public static boolean canBeDone(ItemStack input) {
        if (input != null) {
            if (centrifugeRecipes.containsKey(input.getUnlocalizedName())) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}
